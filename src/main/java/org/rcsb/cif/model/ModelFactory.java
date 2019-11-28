package org.rcsb.cif.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.model.properties.CreateProperties;

/**
 * The factory for model instances for cases when they are somewhat difficult or ambiguously to obtain.
 */
public class ModelFactory {
    private static final Map<String, Class<? extends BaseCategory>> CATEGORY_MAP = new Hashtable<String, Class<? extends BaseCategory>>();
    private static final Map<String, Class<? extends BaseColumn>> COLUMN_MAP = new Hashtable<String, Class<? extends BaseColumn>>();
    private static final Map<String, String> CATEGORY_NAME_MAP = new Hashtable<String, String>();
    
// BH note 2019.11.26 This static block results in the loading of over 600 class files,
// both in Java and JavaScript. There is no need to load every possible class. All we need
// are the classes actually used by the program utilizing this library. For example, maybe just
// cell and atom_site. The solution I came up with is two-fold:
//
// 1) Create a set of 28 property files based on the "primary" key -- "atom" for example.
// 2) Use a proxy (ProxyCategory) for categories until the class is actually needed. For example,
//    AtomSite.java can be proxied until getAtomSite() is called.
//    
// The way the proxy works is to hold the encodedColumns[] array until its .get() method is called, 
// at which point the proxy passes on to the "realized" AtomSite class.    
// 
// I simply offer this as a starting point for better implementation.
// Clearly it needs thorough testing.
//
// Bob Hanson, 2019.11.26
//
//    static {
//        // create class name lookup for reflection
//        try {
//            InputStream inputStream = Thread.currentThread()
//                    .getContextClassLoader()
//                    .getResourceAsStream("field-name-class-map.csv");
//            Objects.requireNonNull(inputStream, "could not load class name map");
//            BufferedReader lookupReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            Map<String, String> rawMap = lookupReader.lines()
//                    .map(line -> line.split(" "))
//                    .collect(Collectors.toMap(split -> split[0], split -> split[1]));	
//            lookupReader.close();
//
//            CATEGORY_NAME_MAP = rawMap.entrySet()
//                    .stream()
//                    .filter(entry -> !entry.getKey().contains("."))
//                    .collect(Collectors.toMap(Map.Entry::getKey,
//                            (Map.Entry<String, String> entry) -> entry.getValue()));
//
//            COLUMN_MAP = rawMap.entrySet()
//                    .stream()
//                    .filter(entry -> entry.getKey().contains("."))
//                    .collect(Collectors.toMap(Map.Entry::getKey,
//                            (Map.Entry<String, String> entry) -> forColumnName(entry.getValue())));
//        } catch (IOException e) {
//            throw new UncheckedIOException("could not load class name map", e);
//        }
//    }

	/**
	 * Retrieve the class name from a primary-key (before the first "_") property file
	 * created from Excel (docs/field-name-class-map.xlsx)
	 * 
	 * @param categoryName
	 * @return a class, hopefully!
	 * 
	 * @author Bob Hanson 2019.11.27
	 */
	@SuppressWarnings("unchecked")
	private static Class<? extends BaseCategory> getCategory(String categoryName) {
		Class<? extends BaseCategory> c = CATEGORY_MAP.get(categoryName);
		if (c == null) {
			String className = CATEGORY_NAME_MAP.get(categoryName);
			try {
				if (className == null) {
					loadCategoryProperties(categoryName);
					className = CATEGORY_NAME_MAP.get(categoryName);
				}
				c = (Class<? extends BaseCategory>) Class.forName(className);
			} catch (ClassNotFoundException | IOException e) {
				System.err.println("Could not add category "+ categoryName + " " + e);
				// that's fine -- leave it null
			}
			CATEGORY_MAP.put(categoryName, c == null ? BaseCategory.class : c);
		} else if (c == BaseCategory.class) {
			// already found NOT to be a class
			return null;
		}
		return c;
	}
	
	/**
	 * Loads a property file as a plain file and parses it for:
	 * 
	 * 1) CIF key  atom_site
	 * 
	 * 2) class name  org.rcsb.cif.model.generated.AtomSite
	 * 
	 * 3) column types and names for binaryCIF as [F,I,S]Name
	 * 
	 * For example, in symmetry.properties: 
	 *    
	 *    equiv=.SymmetryEquiv,Sid,Spos_as_xyz
	 *    
	 *    
	 * meaning:
	 * 
	 *   symmetry_equiv maps to org.rcsb.cif.model.generated.SymmetryEquiv
	 * 
	 *   symmetry_equiv.id is a StrColumn
	 *   symmetry_equiv.pos_as_xyz is also a StrColumn
	 *   
	 * 
	 * @param catName
	 * @throws IOException
	 */
    private static void loadCategoryProperties(String catName) throws IOException {
// For example, model/properties/symmetry.properties:
//    	
//    	_=.Symmetry,Sentry_id,Scell_setting,IInt_Tables_number,Sspace_group_name_Hall,Sspace_group_name_H-M,Spdbx_full_space_group_name_H-M
//    	equiv=.SymmetryEquiv,Sid,Spos_as_xyz

    	int pt = catName.indexOf("_");
    	String primary = (pt < 0 ? catName : catName.substring(0, pt));
		InputStream inputStream = ModelFactory.class.getResourceAsStream("properties/" + primary + ".properties");
        Objects.requireNonNull(inputStream, "could not load all.txt");
        BufferedReader lookupReader = new BufferedReader(new InputStreamReader(inputStream));
        List<String[]> lines = lookupReader.lines().map(line -> line.split("=")).collect(Collectors.toList());	
		lookupReader.close();
		for (int i = 0; i < lines.size(); i++) {
			String[] prop = lines.get(i);
			String name = prop[0];
			String line = prop[1];
			catName = primary + (name.equals("_") ? "" : "_" + name);
			String[] info = line.split(",");
			String className = "org.rcsb.cif.model.generated" + info[0];
			CATEGORY_NAME_MAP.put(catName, className);
			for (int c = info.length; --c >= 1;) {
				String type = info[c].substring(0, 1);
				String col = catName + "." + info[c].substring(1);
				COLUMN_MAP.put(col, forColumnName(type));
				System.out.println("adding column " + type + " " + col);
			}
			
		}

	}

    @SuppressWarnings("unchecked")
    private static Class<? extends BaseCategory> forCategoryName(String categoryName) {
        try {
            return (Class<? extends BaseCategory>) Class.forName(categoryName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("could not acquire category class with name: " + categoryName, e);
        }
    }

    private static Class<? extends BaseColumn> forColumnName(String columnName) {
        switch (columnName) {
            case "FloatColumn":
            case "F":
                return FloatColumn.class;
            case "IntColumn":
            case "I":
                return IntColumn.class;
            case "StrColumn":
            case "S":
                return StrColumn.class;
            default:
                throw new IllegalArgumentException(columnName + " is not known - cannot acquire prototype");
        }
    }

    /**
     * Create a {@link Category} from text data. Tries to find a strict (i.e. concrete implementation by reflection
     * using the internal) instance of the requested {@link Category}.
     * @param categoryName the category name
     * @param textColumns the text data to provide within this category
     * @return the created instance
     */
    public static Category createCategoryText(String categoryName, Map<String, Column> textColumns) {
        // retrieve category class
		Class<? extends BaseCategory> categoryClass = getCategory(categoryName);
        if (categoryClass != null) {
            try {
                return categoryClass.getConstructor(String.class, Map.class)
                        .newInstance(categoryName, textColumns);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException("could not instantiate category class", e);
            }
        } else {
            return new BaseCategory(categoryName, textColumns);
        }
    }

	/**
	 * Create a {@link Category} from binary data. Tries to find a strict (i.e.
	 * concrete implementation by reflection using the internal) instance of the
	 * requested {@link Category}.
	 * 
	 * 
	 * @param categoryName   the category name
	 * @param rowCount       the row count
	 * @param encodedColumns the data, still encoded, to be decoded once requested
	 * @return the created instance
	 */
	public static Category createCategoryBinary(String categoryName, int rowCount, Object[] encodedColumns) {
		// retrieve category class
		try {
			Class<? extends BaseCategory> categoryClass = getCategory(categoryName);
			if (categoryClass != null) {
				return categoryClass.getConstructor(String.class, int.class, Object[].class).newInstance(categoryName,
						rowCount, encodedColumns);
			} else {
				return new BaseCategory(categoryName, rowCount, encodedColumns);
			}
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException
				| InvocationTargetException e) {
			throw new RuntimeException("could not instantiate category class for " + categoryName, e);
		}
	}

	/**
     * Create an empty {@link Category}, void of data. Used, so that the data model does not throw a
     * {@link NullPointerException} ungracefully. Rather the consumer should enquire whether the {@link Category}
     * present (see {@link Category#isDefined()}. Has row count 0 and can report its name.
     * @param name the name this category should report
     * @return an empty category which will report being undefined
     */
    public static Category createEmptyCategory(String name) {
        return new BaseCategory(name);
    }

    /**
     * Create a single row {@link Column} based on text data.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the start index which will be used to extract data
     * @param endToken the end index which will be used to extract data
     * @return the text column
     * @see ModelFactory#createColumnText(String, String, String, int[], int[])
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int startToken,
                                          int endToken) {
        return createColumnText(categoryName, columnName, data, new int[] { startToken }, new int[] { endToken });
    }

    /**
     * The creation method for a {@link Column} based on text data which is not yet parsed.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the collection of start indices which will be used to extract data
     * @param endToken the collection of end indices which will be used to extract data
     * @return the text column, ready to parse particular rows
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int[] startToken,
                                          int[] endToken) {
        // if we cannot rely on schema, we could parse/digest data until we can make an elaborate guess about the type -
        // however this would be really slow - so everyone is a String now
        return createColumnText(categoryName, columnName, data, startToken, endToken, StrColumn.class);
    }

    /**
     * The creation method for a {@link Column} based on text data which is not yet parsed.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the collection of start indices which will be used to extract data
     * @param endToken the collection of end indices which will be used to extract data
     * @param columnType the column type to enforce when not in dictionary
     * @return the text column, ready to parse particular rows
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int[] startToken,
                                          int[] endToken,
                                          Class<? extends Column> columnType) {
        int rowCount = startToken.length;
        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass == null) {
            if (columnType == IntColumn.class) {
                return new IntColumn(columnName, rowCount, data, startToken, endToken);
            } else if (columnType == FloatColumn.class) {
                return new FloatColumn(columnName, rowCount, data, startToken, endToken);
            } else {
                return new StrColumn(columnName, rowCount, data, startToken, endToken);
            }
        } else {
            try {
                return columnClass.getConstructor(String.class, int.class, String.class, int[].class, int[].class)
                        .newInstance(columnName, rowCount, data, startToken, endToken);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

	/**
     * The creation method for a {@link Column} based on binary (still encoded) data.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param encodedColumn a map encompassing all information needed to create this column
     * @return the decoded column
     */
    @SuppressWarnings("unchecked")
    public static Column createColumnBinary(String categoryName, String columnName, Map<String, Object> encodedColumn) {
        Object binaryData = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        int rowCount = Array.getLength(binaryData);
                Map<String, Object> m = (Map<String, Object>) encodedColumn.get("mask");
        int[] mask = (m == null || m.isEmpty() ? null : (int[]) Codec.decode(m));
        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass != null) {
            try {
                return columnClass.getConstructor(String.class, int.class, Object.class, int[].class)
                        .newInstance(columnName, rowCount, binaryData, mask);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException("could not instantiate column class", e);
            }
        } else {
            // binary columns can be readily be packed into their appropriate data type
            if (binaryData instanceof int[]) {
                return new IntColumn(columnName, rowCount, binaryData, mask);
            } else if (binaryData instanceof double[]) {
                return new FloatColumn(columnName, rowCount, binaryData, mask);
            } else {
                return new StrColumn(columnName, rowCount, binaryData, mask);
            }
        }
    }

    /**
     * The creation method for a {@link Column} which is absent.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @return an empty instance of this column
     */
    public static Column createEmptyColumn(String categoryName, String columnName) {
        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass != null) {
            try {
                return columnClass.getConstructor(String.class)
                        .newInstance(columnName);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new StrColumn(columnName);
        }
    }
}
