package org.rcsb.cif.schema;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.model.*;
import org.rcsb.cif.model.internal.CifCategory;
import org.rcsb.cif.model.internal.CifField;
import org.rcsb.cif.model.internal.CifFile;
import org.rcsb.cif.model.internal.CifFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SchemaGenerator {
    private static final Path OUTPUT_PATH = Paths.get("/Users/sebastian/model/");
    private static final String BASE_PACKAGE = "org.rcsb.cif.model.generated";

    private static final String ROOT_NAME = "CifFile";
    private static final String ROOT_DESCRIPTION = "Root";
    private final Map<String, List<String>> filter;

    public static void main(String[] args) throws IOException {
        new SchemaGenerator().generate();
    }

    private void generate() throws IOException {
        getCategoryMetadata();

        buildListOfLinksBetweenCategories();

        getFieldData();

        writeClasses();
    }

    private void writeClasses() throws IOException {
        writeBlock("CifBlock", schema, OUTPUT_PATH);
    }

    // TODO use fully qualified package names

    private void writeBlock(String className, Map<String, Table> content, Path path) throws IOException {
        System.out.println(className);

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + ";");
        output.add("");

        StringJoiner getters = new StringJoiner("\n");

        for (Map.Entry<String, Table> entry : content.entrySet()) {
            String categoryName = entry.getKey();
            Table category = entry.getValue();

            if (!filter.containsKey(categoryName)) {
                continue;
            }

            String categoryClassName = toClassName(categoryName);

            getters.add("    /**");
            String description = Pattern.compile("\n").splitAsStream(category.getDescription())
                    .map(s -> "     * " + s)
                    .collect(Collectors.joining("\n"));
            getters.add(description);
            getters.add("     * @return " + categoryClassName);
            getters.add("     */");
            getters.add("    public " + BASE_PACKAGE + "." + categoryClassName.toLowerCase() + "." + categoryClassName +
                    " get" + categoryClassName + "() {");
            getters.add("        return (" + BASE_PACKAGE + "." + categoryClassName.toLowerCase() + "." +
                    categoryClassName + ") categories.get(\"" + categoryName + "\");");
            getters.add("    }");
            getters.add("");

            writeCategory(categoryClassName, entry.getValue(), path.resolve(categoryClassName.toLowerCase()), filter.get(categoryName));
        }

        output.add("import org.rcsb.cif.model.BaseCifBlock;");
        output.add("import org.rcsb.cif.model.CifCategory;");
        output.add("");
        output.add("import java.util.Map;");
        output.add("");
        output.add("public class " + className + " extends " + BaseCifBlock.class.getSimpleName() + " {");

        // constructor
        output.add("    public " + className + "(Map<String, CifCategory> categories, String header) {");
        output.add("        super(categories, header);");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeCategory(String className, Table content, Path path, List<String> colFilter) throws IOException {
        System.out.println(" -> " + className);

        if (!Files.exists(path)) {
            Files.createDirectory(path);
        }

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + "." + className.toLowerCase() + ";");
        output.add("");
        output.add("import org.rcsb.cif.model.BaseCifCategory;");
        output.add("import org.rcsb.cif.model.CifColumn;");
        output.add("");
        output.add("import java.util.Map;");
        output.add("");

        output.add("public class " + className + " extends " + BaseCifCategory.class.getSimpleName() + " {");

        StringJoiner getters = new StringJoiner("\n");

        for (Map.Entry<String, Object> entry : content.getColumns().entrySet()) {
            String columnName = entry.getKey();
            Col column = (Col) entry.getValue();

            if (!colFilter.contains(columnName)) {
                continue;
            }

            String columnClassName = toClassName(columnName);

            getters.add("    /**");
            String description = Pattern.compile("\n").splitAsStream(column.getDescription())
                    .map(s -> "     * " + s)
                    .collect(Collectors.joining("\n"));
            getters.add(description);
            getters.add("     * @return " + columnClassName);
            getters.add("     */");
            getters.add("    public " + columnClassName + " get" + columnClassName + "() {");
            getters.add("        return (" + columnClassName + ") (isText ? getTextColumn(\"" + columnName +
                    "\") : getBinaryColumn(\"" + columnName + "\", \"" + columnClassName + "\"));");
            getters.add("    }");
            getters.add("");

            writeColumn(columnClassName, column, path);
        }

        // constructor
        output.add("    public " + className + "(String name, Map<String, CifColumn> columns) {");
        output.add("        super(name, columns);");
        output.add("    }");
        output.add("");

        output.add("    public " + className + "(String name, int rowCount, Object[] encodedColumns) {");
        output.add("        super(name, rowCount, encodedColumns);");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeColumn(String className, Col content, Path path) throws IOException {
        System.out.println(" -> -> " + className + " " + getBaseClass(content.getType()));

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + "." + path.toFile().getName() + ";");
        output.add("");
        output.add("import " + BASE_PACKAGE.replace(".generated", "") + ".*;");
        output.add("");
        output.add("import java.util.Map;");
        output.add("");
        output.add("public class " + className + " extends " + getBaseClass(content.getType()) + " {");

        output.add("    public " + className + "(String data, int startToken, int endToken, String name) {");
        output.add("        super(data, startToken, endToken, name);");
        output.add("    }");
        output.add("");

        output.add("    public " + className + "(String data, int[] startToken, int[] endToken, String name) {");
        output.add("        super(data, startToken, endToken, name);");
        output.add("    }");
        output.add("");

        output.add("    public " + className + "(Map<String, Object> encodedColumn) {");
        output.add("        super(encodedColumn);");
        output.add("    }");

        output.add("}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private String getBaseClass(String type) {
        Class<?> clazz;
        switch (type) {
            case "coord":
                clazz = CoordColumn.class; break;
            case "enum":
                clazz = EnumColumn.class; break;
            case "float":
                clazz = FloatColumn.class; break;
            case "int":
                clazz = IntColumn.class; break;
            case "list":
                clazz = ListColumn.class; break;
            case "matrix":
                clazz = MatrixColumn.class; break;
            case "str":
                clazz = StrColumn.class; break;
            case "vector":
                clazz = VectorColumn.class; break;
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
        return clazz.getSimpleName();
    }

    public static String toClassName(String rawName) {
        return Pattern.compile("_").splitAsStream(rawName)
                        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(""))
                // remove invalid characters
                .replace("/", "_")
                .replace("-", "_");
    }

    private SchemaGenerator() throws IOException {
        this.cifFile = CifReader.parseText(Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("mmcif_pdbx_v50.dic"));
        this.schema = new LinkedHashMap<>();
        this.categories = new LinkedHashMap<>();
        this.links = new LinkedHashMap<>();
        this.filter = new LinkedHashMap<>();

        new BufferedReader(new InputStreamReader(Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("mmcif-field-names.csv")))
                .lines()
                .filter(line -> !line.isEmpty())
                .map(line -> line.split("\\."))
                .forEach(split -> {
                    List<String> cols = filter.computeIfAbsent(split[0], s -> new ArrayList<>());
                    cols.add(split[1]);
                });
    }

    private static final String RE_MATRIX_FIELD = "\\[[1-3]]\\[[1-3]]";
    private static final String RE_VECTOR_FIELD = "\\[[1-3]]";

    private static final List<String> FORCE_INT_FIELDS = Stream.of(
            "_atom_site.id",
            "_atom_site.auth_seq_id",
            "_pdbx_struct_mod_residue.auth_seq_id",
            "_struct_conf.beg_auth_seq_id",
            "_struct_conf.end_auth_seq_id",
            "_struct_conn.ptnr1_auth_seq_id",
            "_struct_conn.ptnr2_auth_seq_id",
            "_struct_sheet_range.beg_auth_seq_id",
            "_struct_sheet_range.end_auth_seq_id"
    ).collect(Collectors.toList());

    private static final List<String> COMMA_SEPARATED_LIST_FIELDS = Stream.of(
            "_atom_site.pdbx_struct_group_id",
            "_chem_comp.mon_nstd_parent_comp_id",
            "_diffrn_radiation.pdbx_wavelength_list",
            "_diffrn_source.pdbx_wavelength_list",
            "_em_diffraction.tilt_angle_list", // 20,40,50,55
            "_em_entity_assembly.entity_id_list",
            "_entity.pdbx_description", // Endolysin,Beta-2 adrenergic receptor
            "_entity.pdbx_ec",
            "_entity_poly.pdbx_strand_id", // A,B
            "_pdbx_depui_entry_details.experimental_methods",
            "_pdbx_depui_entry_details.requested_accession_types",
            "_pdbx_soln_scatter_model.software_list", // INSIGHT II, HOMOLOGY, DISCOVERY, BIOPOLYMER, DELPHI
            "_pdbx_soln_scatter_model.software_author_list", // MSI
            "_pdbx_soln_scatter_model.entry_fitting_list", // Odd example: "PDB CODE 1HFI, 1HCC, 1HFH, 1VCC"
            "_pdbx_struct_assembly_gen.entity_inst_id",
            "_pdbx_struct_assembly_gen.asym_id_list",
            "_pdbx_struct_assembly_gen.auth_asym_id_list",
            "_pdbx_struct_assembly_gen_depositor_info.asym_id_list",
            "_pdbx_struct_assembly_gen_depositor_info.chain_id_list",
            "_pdbx_struct_group_list.group_enumeration_type",
            "_reflns.pdbx_diffrn_id",
            "_refine.pdbx_diffrn_id",
            "_reflns_shell.pdbx_diffrn_id",
            "_struct_keywords.text"
    ).collect(Collectors.toList());

    private static final List<String> SPACE_SEPARATED_LIST_FIELDS = Stream.of(
            "_chem_comp.pdbx_subcomponent_list", // TSM DPH HIS CHF EMR
            "_pdbx_soln_scatter.data_reduction_software_list", // OTOKO
            "_pdbx_soln_scatter.data_analysis_software_list" // SCTPL5 GNOM
    ).collect(Collectors.toList());

    private static final List<String> SEMICOLON_SEPARATED_LIST_FIELDS = Collections.singletonList(
            "_chem_comp.pdbx_synonyms" // GLYCERIN; PROPANE-1,2,3-TRIOL
    );

    /**
     * Useful when a dictionary extension will add enum values to an existing dictionary.
     * By adding them here, the dictionary extension can be tested before the added enum
     * values are available in the existing dictionary.
     */
    private static final Map<String, List<String>> EXTRA_ENUM_VALUES = new LinkedHashMap<String, List<String>>() {{
        put("_pdbx_chem_comp_identifier.type", Arrays.asList("CONDENSED IUPAC CARB SYMBOL",
                "IUPAC CARB SYMBOL",
                "SNFG CARB SYMBOL"));
    }};

    private final CifFile cifFile;
    private final Map<String, Table> schema;
    private final Map<String, CifFrame> categories;
    private final Map<String, String> links;

    private void getFieldData() {
        categories.forEach((fullName, saveFrame) -> {
            String header = saveFrame.getHeader();
            String categoryName = header.substring(1, header.contains(".") ? header.indexOf(".") : header.length());
            String itemName = header.substring(header.contains(".") ? header.indexOf(".") + 1 : 1);
            Map<String, Object> fields = schema.get(categoryName).getColumns();

            String description = getDescription(saveFrame);
//            System.out.println(description);

            // need to use regex to check for matrix or vector items
            // as sub_category assignment is missing for some entries
            String subCategory = getSubCategory(saveFrame);
            if ("cartesian_coordinate".equals(subCategory) || "fractional_coordinate".equals(subCategory)) {
                fields.put(itemName, new CoordCol(description));
            } else if (FORCE_INT_FIELDS.contains(header)) {
                fields.put(itemName, new IntCol(description));
            } else if ("matrix".equals(subCategory)) {
                fields.put(itemName.replaceAll(RE_MATRIX_FIELD, ""), new MatrixCol(3, 3, description));
            } else if ("vector".equals(subCategory)) {
                fields.put(itemName.replaceAll(RE_VECTOR_FIELD, ""), new VectorCol(3, description));
            } else {
                if (itemName.matches(RE_MATRIX_FIELD)) {
                    fields.put(itemName.replaceAll(RE_MATRIX_FIELD, ""), new MatrixCol(3, 3, description));
                } else if (itemName.matches(RE_VECTOR_FIELD)) {
                    fields.put(itemName.replaceAll(RE_VECTOR_FIELD, ""), new VectorCol(3, description));
                } else {
                    List<String> code = getCode(saveFrame);
                    if (code.size() > 0) {
                        Col fieldType = getFieldType(code.get(0), description, code.subList(1, code.size()));
                        if (fieldType instanceof StrCol) {
                            if (COMMA_SEPARATED_LIST_FIELDS.contains(header)) {
                                fieldType = new ListCol("str", ",", description);
                            } else if (SPACE_SEPARATED_LIST_FIELDS.contains(header)) {
                                fieldType = new ListCol("str", " ", description);
                            } else if (SEMICOLON_SEPARATED_LIST_FIELDS.contains(header)) {
                                fieldType = new ListCol("str", ";", description);
                            }
                        }
                        if (EXTRA_ENUM_VALUES.containsKey(header)) {
                            if (fieldType instanceof EnumCol) {
                                ((EnumCol) fieldType).getValues().addAll(EXTRA_ENUM_VALUES.get(header));
                            }
                        }
                        fields.put(itemName, fieldType);
                    }
                }
            }
        });
    }

    private Col getFieldType(String type, String description, List<String> values) {
        switch (type) {
            case "code":
            case "ucode":
            case "line":
            case "uline":
            case "text":
            case "char":
            case "uchar3":
            case "uchar1":
            case "boolean":
                return values.size() > 0 ? new EnumCol(values, "str", description) : new StrCol(description);
            case "aliasname":
            case "name":
            case "idname":
            case "any":
            case "atcode":
            case "fax":
            case "phone":
            case "email":
            case "code30":
            case "seq-one-letter-code":
            case "author":
            case "orcid_id":
            case "sequence_dep":
            case "pdb_id":
            case "emd_id":
            case "yyyy-mm-dd":
            case "yyyy-mm-dd:hh:mm":
            case "yyyy-mm-dd:hh:mm-flex":
            case "int-range":
            case "float-range":
            case "binary":
            case "operation_expression":
            case "point_symmetry":
            case "4x3_matrix":
            case "3x4_matrices":
            case "point_group":
            case "point_group_helical":
            case "symmetry_operation":
            case "date_dep":
            case "url":
            case "symop":
                return new StrCol(description);
            case "int":
            case "non_negative_int":
            case "positive_int":
                return values.size() > 0 ? new EnumCol(values, "int", description) : new IntCol(description);
            case "float":
                return new FloatCol(description);
            case "ec-type":
            case "ucode-alphanum-csv":
            case "id_list":
                return new ListCol("str", ",", description);
            default:
                return new StrCol(description);
        }
    }

    private List<String> getCode(CifFrame saveFrame) {
        try {
            CifField code = getField("item_type", "code", saveFrame);
            return Stream.concat(Stream.of(code.getString(0)), getEnums(saveFrame)).collect(Collectors.toList());
        } catch (NullPointerException e) {
            return Collections.emptyList();
        }
    }

    private Stream<String> getEnums(CifFrame saveFrame) {
        try {
            CifField value = getField("item_enumeration", "value", saveFrame);
            return IntStream.range(0, value.getRowCount())
                    .mapToObj(value::getString);
        } catch (NullPointerException e) {
            return Stream.empty();
        }
    }

    private String getSubCategory(CifFrame saveFrame) {
        try {
            CifField value = getField("item_sub_category", "id", saveFrame);
            return value.getString(0);
        } catch (NullPointerException e) {
            return "";
        }
    }

    private String getDescription(CifFrame saveFrame) {
        CifField value = getField("item_description", "description", saveFrame);
        return Pattern.compile("\n").splitAsStream(value.getString(0))
                .map(String::trim)
                .collect(Collectors.joining("\n"))
                .replaceAll("(\\[[1-3]])+ element", "elements")
                .replaceAll("(\\[[1-3]])+", "");
    }

    private CifField getField(String category, String field, CifFrame saveFrame) {
        try {
            CifCategory cat = saveFrame.getCategory(category);
            return cat.getField(field);
        } catch (NullPointerException e) {
            String linkName = links.get(saveFrame.getHeader());
            return getField(category, field, categories.get(linkName));
        }
    }

    private void buildListOfLinksBetweenCategories() {
        cifFile.getBlocks()
                .get(0)
                .saveFrames()
                .filter(saveFrame -> saveFrame.getHeader().startsWith("_"))
                .forEach(saveFrame -> {
                    categories.put(saveFrame.getHeader(), saveFrame);
                    CifCategory item_linked = saveFrame.getCategory("item_linked");

                    if (item_linked == null) {
                        return;
                    }

                    CifField child_name = item_linked.getField("child_name");
                    CifField parent_name = item_linked.getField("parent_name");

                    for (int i = 0; i < item_linked.getRowCount(); i++) {
                        String childName = child_name.getString(i);
                        String parentName = parent_name.getString(i);
                        links.put(childName, parentName);
                    }
                });
    }

    private void getCategoryMetadata() {
        cifFile.getBlocks()
                .get(0)
                .saveFrames()
                .filter(saveFrame -> !saveFrame.getHeader().startsWith("_"))
                .forEach(saveFrame -> {
                    Set<String> categoryKeyNames = saveFrame.getCategory("category_key")
                            .getField("name")
                            .strings()
                            .collect(Collectors.toSet());
//                    System.out.println(categoryKeyNames);

                    String rawDescription = saveFrame.getCategory("category")
                            .getField("description")
                            .getString(0);
                    String description = Pattern.compile("\n")
                            .splitAsStream(rawDescription)
                            .map(String::trim)
                            .collect(Collectors.joining("\n"));
//                    System.out.println(description);

                    schema.put(saveFrame.getHeader(), new Table(description, categoryKeyNames, new LinkedHashMap<>()));
//                    System.out.println();
                });
    }
}

class Table {
    private final String description;
    private final Set<String> categoryKeyNames;
    private final Map<String, Object> columns;

    Table(String description, Set<String> categoryKeyNames, Map<String, Object> columns) {
        this.description = description;
        this.categoryKeyNames = categoryKeyNames;
        this.columns = columns;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getCategoryKeyNames() {
        return categoryKeyNames;
    }

    public Map<String, Object> getColumns() {
        return columns;
    }
}

abstract class Col {
    private final String type;
    private final String description;

    Col(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}

class IntCol extends Col {
    IntCol(String description) {
        super("int", description);
    }
}

class StrCol extends Col {
    StrCol(String description) {
        super("str", description);
    }
}

class FloatCol extends Col {
    FloatCol(String description) {
        super("float", description);
    }
}

class CoordCol extends Col {
    CoordCol(String description) {
        super("coord", description);
    }
}

class EnumCol extends Col {
    private final List<String> values;
    private final String subType;

    EnumCol(List<String> values, String subType, String description) {
        super("enum", description);
        this.values = values;
        this.subType = subType;
    }

    public List<String> getValues() {
        return values;
    }

    public String getSubType() {
        return subType;
    }
}

class VectorCol extends Col {
    private final int length;

    VectorCol(int length, String description) {
        super("vector", description);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}

class MatrixCol extends Col {
    private final int columns;
    private final int rows;

    MatrixCol(int columns, int rows, String description) {
        super("matrix", description);
        this.columns = columns;
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
}

class ListCol extends Col {
    private final String subType;
    private final String separator;

    ListCol(String subType, String separator, String description) {
        super("list", description);
        this.subType = subType;
        this.separator = separator;
    }

    public String getSubType() {
        return subType;
    }

    public String getSeparator() {
        return separator;
    }
}