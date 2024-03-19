package org.rcsb.cif.schema.generator;

import org.rcsb.cif.CifIO;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.schema.DelegatingColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;
import org.rcsb.cif.schema.DelegatingStrColumn;
import org.rcsb.cif.schema.StandardSchemata;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Creates a type-safe data model using a CIF dictionary.
 */
@SuppressWarnings("ALL")
public class SchemaGenerator {
    private static final String BASE_PACKAGE = "org.rcsb.cif.schema.";
    private static final String RE_MATRIX_FIELD = "\\[[1-3]]\\[[1-3]]";
    private static final String RE_VECTOR_FIELD = "\\[[1-3]]";
    private static final List<String> FORCE_INT_FIELDS =
            List.of("_atom_site.id",
                    "_atom_site.auth_seq_id",
                    "_pdbx_struct_mod_residue.auth_seq_id",
                    "_struct_conf.beg_auth_seq_id",
                    "_struct_conf.end_auth_seq_id",
                    "_struct_conn.ptnr1_auth_seq_id",
                    "_struct_conn.ptnr2_auth_seq_id",
                    "_struct_sheet_range.beg_auth_seq_id",
                    "_struct_sheet_range.end_auth_seq_id");

    private static final String FILE = loadTemplate("File.tpl");
    private static final String FILE_BUILDER = loadTemplate("FileBuilder.tpl");
    private static final String BLOCK = loadTemplate("Block.tpl");
    private static final String BLOCK_FLAT = loadTemplate("BlockFlat.tpl");
    private static final String CASE = loadTemplate("Case.tpl");
    private static final String BLOCK_GETTER = loadTemplate("BlockGetter.tpl");
    private static final String BLOCK_GETTER_FLAT = loadTemplate("BlockGetterFlat.tpl");
    private static final String CATEGORY = loadTemplate("Category.tpl");
    private static final String CATEGORY_FLAT = loadTemplate("CategoryFlat.tpl");
    private static final String CATEGORY_GETTER = loadTemplate("CategoryGetter.tpl");
    private static final String CATEGORY_GETTER_FLAT = loadTemplate("CategoryGetterFlat.tpl");

    private static final String BLOCK_BUILDER = loadTemplate("BlockBuilder.tpl");
    private static final String BLOCK_BUILDER_FLAT = loadTemplate("BlockBuilderFlat.tpl");
    private static final String CATEGORY_BUILDER = loadTemplate("CategoryBuilder.tpl");
    private static final String CATEGORY_BUILDER_FLAT = loadTemplate("CategoryBuilderFlat.tpl");
    private static final String CATEGORY_BUILDER_ENTER = loadTemplate("CategoryBuilderEnter.tpl");
    private static final String COLUMN_BUILDER = loadTemplate("ColumnBuilder.tpl");
    private static final String COLUMN_BUILDER_ENTER = loadTemplate("ColumnBuilderEnter.tpl");

    private static String loadTemplate(String name) {
        return new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("templates/" + name)))
                .lines()
                .collect(Collectors.joining(System.lineSeparator()));
    }

    private final String schemaName;
    private final String schemaEnum;
    private final String packageName;
    private final boolean flat;
    private final Map<String, Table> schema;
    private final Map<String, Block> categories;
    private final Map<String, String> links;
    private final Map<String, Map<String, Category>> imports;
    private final Map<String, List<String>> rawAliases;
    private final List<List<String>> aliases;

    public static void main(String[] args) throws IOException {
        new SchemaGenerator("MmCif", "MMCIF", "mm", false,
                "https://mmcif.wwpdb.org/dictionaries/ascii/mmcif_pdbx_v50.dic",
                "https://raw.githubusercontent.com/ihmwg/IHMCIF/master/dist/mmcif_ihm_ext.dic",
                "https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/entity_branch-extension.dic",
                "https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/chem_comp-extension.dic",
                "https://raw.githubusercontent.com/ihmwg/ModelCIF/master/dist/mmcif_ma.dic"); // model-extension for predicted models

        new SchemaGenerator("CifCore", "CIF_CORE", "core", true,
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/templ_enum.cif",
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/templ_attr.cif",
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/cif_core.dic"); // has to be last

        // NMR Exchange Format - TODO special usage of save-frames
//        new SchemaGenerator("Nef", "NEF", "nef", false,
//                "https://raw.githubusercontent.com/NMRExchangeFormat/NEF/master/specification/mmcif_nef.dic");
    }

    static String toClassName(String rawName) {
        String name = Pattern.compile("_").splitAsStream(rawName)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(""))
                // remove invalid characters
                .replaceAll("[/\\\\\\- \t`~!@#$%^&*()=+{}|;:'\",<.>?]", "_")
                .replaceAll("_+", "_")
                .replace("[", "")
                .replace("]", "");
        if (name.endsWith("_")) {
            name = name.substring(0, name.length() - 1);
        }
        if (name.equals("Class")) {
            return "Clazz";
        } else if (Character.isDigit(name.charAt(0))) {
            return "_" + name;
        }
        return name;
    }

    private void writeClasses() throws IOException {
        // create or clear out destination directory
        // be careful with this and point to temp directory when in trouble - the impl must be in a healthy state to
        // bootstrap itself and generate schema-related code
        Path projectPath = Paths.get(new File("").getAbsolutePath());
        String basePackagePath = BASE_PACKAGE.substring(0, BASE_PACKAGE.length() - 1).replace(".", "/");
        Path packagePath = projectPath.resolve("src").resolve("main").resolve("java").resolve(basePackagePath).resolve(packageName);

        if (Files.exists(packagePath)) {
            try (Stream<Path> paths = Files.list(packagePath)) {
                paths.filter(p -> !Files.isDirectory(p))
                        .forEach(p -> {
                            try {
                                Files.delete(p);
                            } catch (IOException e) {
                                throw new UncheckedIOException(e);
                            }
                        });
            }
        } else {
            Files.createDirectories(packagePath);
        }

        writeFiles(schema, packagePath);
    }

    private void writeFiles(Map<String, Table> content, Path path) throws IOException {
        Set<String> alreadyWritten = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        String blockName = schemaName + "Block";
        String file = FILE.replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName);
        String fileBuilder = FILE_BUILDER.replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName)
                .replace("{schemaEnum}", schemaEnum);
        String block = (flat ? BLOCK_FLAT : BLOCK).replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName);
        String blockBuilder = (flat ? BLOCK_BUILDER_FLAT : BLOCK_BUILDER).replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName);
        String categoryBuilder = (flat ? CATEGORY_BUILDER_FLAT : CATEGORY_BUILDER).replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName);

        StringJoiner getters = new StringJoiner("\n");
        StringJoiner cases = new StringJoiner("\n");
        StringJoiner enters = new StringJoiner("\n");
        StringJoiner categoryEnters = new StringJoiner("\n");

        for (Map.Entry<String, Table> entry : content.entrySet()) {
            String categoryName = entry.getKey();
            Table category = entry.getValue();

            if (!alreadyWritten.add(categoryName)) {
                System.err.println("skipping " + categoryName);
                continue;
            }

            String categoryClassName = toClassName(categoryName);
            String description = prepareDescription(category.getDescription(), "     * ");
            if (flat) {
                getters.add(BLOCK_GETTER_FLAT.replace("{categoryDescription}", description)
                        .replace("{categoryClassName}", categoryClassName)
                        .replace("{categoryName}", categoryName));
            } else {
                getters.add(BLOCK_GETTER.replace("{categoryDescription}", description)
                        .replace("{categoryClassName}", categoryClassName)
                        .replace("{categoryName}", categoryName));
            }

            writeCategory(category.getDescription(), categoryClassName, entry.getValue(), path, categoryName, categoryClassName, categoryEnters);

            // delegation function
            cases.add(CASE.replace("{name}", categoryName)
                    .replace("{className}", categoryClassName));

            // builder
            String enter = CATEGORY_BUILDER_ENTER.replace("{schemaName}", schemaName)
                    .replace("{categoryClassName}", categoryClassName);
            enters.add(enter);
        }

        block = block.replace("{cases}", cases.toString())
                .replace("{getters}", getters.toString());
        blockBuilder = blockBuilder.replace("{enters}", enters.toString());
        categoryBuilder = categoryBuilder.replace("{enters}", categoryEnters.toString());

        Files.write(path.resolve(schemaName + "File.java"), file.getBytes());
        Files.write(path.resolve(schemaName + "FileBuilder.java"), fileBuilder.getBytes());
        Files.write(path.resolve(schemaName + "BlockBuilder.java"), blockBuilder.getBytes());
        Files.write(path.resolve(schemaName + "CategoryBuilder.java"), categoryBuilder.getBytes());
        Files.write(path.resolve(blockName + ".java"), block.getBytes());
    }

    private String prepareDescription(String description, String prefix) {
        return Pattern.compile("\n").splitAsStream(description.trim())
                .map(s -> prefix + s)
                .collect(Collectors.joining("\n"))
                .replace("TODO", ""); // remove TODOs from description
    }

    private void writeCategory(String categoryDescription, String className, Table content, Path path, String categoryName,
                               String categoryClassName, StringJoiner categoryEnters) throws IOException {
        if (!Files.exists(path)) {
            Files.createDirectory(path);
        }

        categoryDescription = prepareDescription(categoryDescription, " * ");
        String category = (flat ? CATEGORY_FLAT : CATEGORY).replace("{packageName}", packageName)
                .replace("{schemaName}", schemaName)
                .replace("{categoryDescription}", categoryDescription)
                .replace("{categoryClassName}", categoryClassName)
                .replace("{categoryName}", categoryName);

        StringJoiner getters = new StringJoiner("\n");
        StringJoiner cases = new StringJoiner("\n");
        StringJoiner enters = new StringJoiner("\n");

        for (Map.Entry<String, Object> entry : content.getColumns().entrySet()) {
            String columnName = entry.getKey();
            String flatName = categoryName + "_" + columnName;
            Col column = (Col) entry.getValue();

            // check if there is a alias in place here - if so handled specifically lateron
            if (aliases.stream()
                    .anyMatch(list -> list.contains(categoryName + "." + columnName))) {
                continue;
            }

            String columnClassName = toClassName(columnName);
            Class<? extends Column> baseClass = getBaseClass(column.getType());
            String baseClassName = baseClass.getSimpleName();

            String description = prepareDescription(column.getDescription(), "     * ");
            getters.add((flat ? CATEGORY_GETTER_FLAT : CATEGORY_GETTER).replace("{columnDescription}", description)
                    .replace("{baseClassName}", baseClassName)
                    .replace("{columnClassName}", columnClassName)
                    .replace("{columnName}", columnName)
                    .replace("{modifier}", "")
                    .replace("{aliases}", "\"" + flatName + "\""));

            cases.add(CASE.replace("{name}", columnName)
                    .replace("{className}", columnClassName));

            enters.add(COLUMN_BUILDER_ENTER.replace("{schemaName}", schemaName)
                    .replace("{baseClassName}", baseClassName)
                    .replace("{categoryClassName}", categoryClassName)
                    .replace("{columnClassName}", columnClassName)
                    .replace("{columnName}", columnName));
        }

        // aliases
        Set<String> processed = new HashSet<>();
        aliases.stream()
                .filter(set -> set.stream().anyMatch(n -> n.split("\\.")[0].equals(categoryName)))
                .forEach(set -> {
                    set.stream()
                            .filter(n -> n.startsWith(categoryName))
                            .forEach(cn -> {
                                String as = set.stream()
                                        .map(n -> n.replace(".", "_"))
                                        .distinct()
                                        .map(n -> "\"" + n + "\"")
                                        .collect(Collectors.joining(", "));
                                boolean multiple = as.split(",").length > 1;
                                Col column = (Col) set.stream()
                                        .map(n -> n.split("\\."))
                                        .filter(s -> schema.containsKey(s[0]) && schema.get(s[0]).getColumns().containsKey(s[1]))
                                        .findFirst()
                                        .map(s -> schema.get(s[0]).getColumns().get(s[1]))
                                        .orElseThrow();
                                String columnClassName = toClassName(cn.split("\\.")[1]);
                                if (processed.contains(columnClassName)) {
                                    return;
                                }
                                processed.add(columnClassName);
                                Class<? extends Column> baseClass = getBaseClass(column.getType());
                                Class<? extends DelegatingColumn> delegatingBaseClass = getDelegatingBaseClass(column.getType());
                                String baseClassName = baseClass.getSimpleName();

                                String description = prepareDescription(column.getDescription(), "     * ");
                                getters.add(CATEGORY_GETTER_FLAT.replace("{columnDescription}", description)
                                        .replace("{baseClassName}", baseClassName)
                                        .replace("{columnClassName}", columnClassName)
                                        .replace("{modifier}", multiple ? "Aliased" : "")
                                        .replace("{aliases}", as));

                                enters.add(COLUMN_BUILDER_ENTER.replace("{schemaName}", schemaName)
                                        .replace("{baseClassName}", baseClassName)
                                        .replace("{categoryClassName}", categoryClassName)
                                        .replace("{columnClassName}", columnClassName)
                                        .replace("{columnName}", cn.split("\\.")[1]));
                            });
                });

        category = category.replace("{cases}", cases.toString())
                .replace("{getters}", getters.toString());

        categoryEnters.add(COLUMN_BUILDER.replace("{schemaName}", schemaName)
                .replace("{categoryClassName}", categoryClassName)
                .replace("{categoryName}", categoryName)
                .replace("{columnEnters}", enters.toString()));

        Files.write(path.resolve(className + ".java"), category.getBytes());
    }

    private Class<? extends Column> getBaseClass(String type) {
        // TODO enums, lists, matrix, and vector would be nice to have
        switch (type) {
            case "coord":
                return FloatColumn.class;
            case "enum":
                return StrColumn.class;
            case "float":
                return FloatColumn.class;
            case "int":
                return IntColumn.class;
            case "list":
                return StrColumn.class;
            case "matrix":
                return FloatColumn.class;
            case "str":
                return StrColumn.class;
            case "vector":
                return FloatColumn.class;
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }

    private Class<? extends DelegatingColumn> getDelegatingBaseClass(String type) {
        switch (type) {
            case "coord":
                return DelegatingFloatColumn.class;
            case "enum":
                return DelegatingStrColumn.class;
            case "float":
                return DelegatingFloatColumn.class;
            case "int":
                return DelegatingIntColumn.class;
            case "list":
                return DelegatingStrColumn.class;
            case "matrix":
                return DelegatingFloatColumn.class;
            case "str":
                return DelegatingStrColumn.class;
            case "vector":
                return DelegatingFloatColumn.class;
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }

    private SchemaGenerator(String schemaName, String schemaEnum, String packageName, boolean flat, String... resource) throws IOException {
        this.schemaName = schemaName;
        this.schemaEnum = schemaEnum;
        this.packageName = packageName;
        this.flat = flat;
        this.schema = new LinkedHashMap<>();
        this.categories = new LinkedHashMap<>();
        this.links = new LinkedHashMap<>();
        this.imports = new LinkedHashMap<>();
        this.rawAliases = new LinkedHashMap<>();
        this.aliases = new ArrayList<>();
        for (String res : resource) {
            System.out.println("Loading dictionary from: " + res);
            CifFile cifFile = CifIO.readFromInputStream(preprocess(res));
            if (schemaName.equals("MmCif")) {
                getCategoryMetadataMmcif(cifFile);
            } else if (schemaName.equals("CifCore")) {
                getCategoryMetadataCifCore(cifFile);
            }

            // acquire metadata
            Category dictionary = cifFile.getBlocks().get(0).getCategory("dictionary");
            String title = dictionary.isDefined() ? dictionary.getColumn("title").getStringData(0) : res.substring(res.lastIndexOf("/") + 1);
            String version = dictionary.isDefined() ? dictionary.getColumn("version").getStringData(0) : "draft";
            System.out.println(title + " with version " + version);

            buildListOfLinksBetweenCategories(cifFile);
        }
        getFieldData();
        if (flat) { // TODO alias support in mmCIF
            prepareAliases();
        }
        writeClasses();

        System.out.println("Finished file generation");
        try {
            Field field = StandardSchemata.class.getField(schemaEnum);
        } catch (Exception e) {
            System.err.println("Schema with name '" + schemaEnum + "' must be explicitly added to StandardSchemata.java!");
        }
        System.out.println();
    }

    private InputStream preprocess(String res) throws IOException {
        try (InputStream inputStream = new URL(res).openStream()) {
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            // this is needed for https://raw.githubusercontent.com/COMCIFS/cif_core/master/cif_core.dic
            // TODO proper CIF 2.0 (or at least list support, or at the very least don't hard-code this here...)
            content = content.replace("[translucent  pale  green]", "'[translucent  pale  green]'");
            return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        }
    }

    private void getFieldData() {
        categories.forEach((fullName, saveFrame) -> {
            String header = saveFrame.getBlockHeader();
            String categoryName = header.substring(header.startsWith("_") ? 1 : 0, header.contains(".") ? header.indexOf(".") : header.length());
            String itemName = header.substring(header.indexOf(".") + 1);
            Map<String, Object> fields = new LinkedHashMap<>();

            // handle imports
            if (saveFrame.getCategories().containsKey("import")) {
                parseImportGet(saveFrame.getCategory("import").getColumn("get").getStringData(0))
                        .filter(Import::isValid)
                        .filter(i -> imports.containsKey(i.save) && !imports.get(i.save).isEmpty())
                        .map(i -> imports.get(i.save))
                        .forEach(i -> saveFrame.getCategories().putAll(i));
            }

            if (schema.containsKey(categoryName)) {
                fields = schema.get(categoryName).getColumns();
                schema.get(categoryName).getCategoryKeyNames().add(itemName);
            } else if (schema.containsKey(categoryName.toLowerCase())) {
                fields = schema.get(categoryName.toLowerCase()).getColumns();
                // take case from category name in 'field' data as it is better if data is from cif dictionaries
                schema.put(categoryName, schema.get(categoryName.toLowerCase()));
            } else {
                System.err.println("category " + categoryName + " has no metadata");
                fields = new LinkedHashMap<>();
                schema.put(categoryName, new Table("", new HashSet<>(), fields));
            }

            List<String> itemAliases = getAliases(saveFrame);
            if (!itemAliases.isEmpty()) {
                rawAliases.put(categoryName + "." + itemName, itemAliases);
            }

            String description = getDescription(saveFrame);

            // need to use regex to check for matrix or vector items
            // as sub_category assignment is missing for some entries
            String subCategory = getSubCategory(saveFrame);
            if ("cartesian_coordinate".equals(subCategory) || "fractional_coordinate".equals(subCategory)) {
                fields.put(itemName, new CoordCol(description));
            } else if (FORCE_INT_FIELDS.contains(header)) {
                fields.put(itemName, new IntCol(description));
            } else if ("matrix".equals(subCategory)) {
                fields.put(itemName, new MatrixCol(description));
            } else if ("vector".equals(subCategory)) {
                fields.put(itemName, new VectorCol(description));
            } else {
                if (itemName.matches(RE_MATRIX_FIELD)) {
                    fields.put(itemName, new MatrixCol(description));
                } else if (itemName.matches(RE_VECTOR_FIELD)) {
                    fields.put(itemName, new VectorCol(description));
                } else {
                    List<String> code = getCode(saveFrame);
                    if (!code.isEmpty()) {
                        Col fieldType = getFieldType(code.get(0), description, code.subList(1, code.size()));
                        fields.put(itemName, fieldType);
                    }
                }
            }
        });
    }

    private List<String> getAliases(Block saveFrame) {
        Column field = getField("item_aliases", "alias_name", saveFrame);
        if (field == null || !field.isDefined()) {
            field = getField("alias", "definition_id", saveFrame);
        }
        Column column = field;
        if (column == null) {
            return Collections.emptyList();
        }
        return IntStream.range(0, field.getRowCount())
                .mapToObj(column::getStringData)
                .map(s -> s.substring(1))
                .collect(Collectors.toList());
    }

    private Col getFieldType(String type, String description, List<String> values) {
        switch (type) {
            // mmCIF
            case "code":
            case "ucode":
            case "line":
            case "uline":
            case "text":
            case "char":
            case "uchar3":
            case "uchar1":
            case "boolean":
                return values.isEmpty() ? new StrCol(description) : new EnumCol(values, "str", description);
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
            // TODO consider adding specialised fields
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
            case "exp_data_doi":
            case "asym_id":
                return new StrCol(description);
            case "int":
            case "non_negative_int":
            case "positive_int":
                return values.isEmpty() ? new IntCol(description) : new EnumCol(values, "int", description);
            case "float":
                return new FloatCol(description);
            case "ec-type":
            case "ucode-alphanum-csv":
            case "id_list":
                return new ListCol("str", ",", description);
            case "id_list_spc":
                return new ListCol("str", " ", description);

            // cif
            case "Text":
            case "Code":
            case "Complex":
            case "Symop":
            case "List":
            case "List(Real,Real)":
            case "List(Real,Real,Real,Real)":
            case "Date":
            case "Datetime":
            case "Tag":
            case "Implied":
//                return wrapContainer('str', ',', description, container);
                return new StrCol(description);
            case "Real":
//                return wrapContainer('float', ',', description, container);
                return new FloatCol(description);
            case "Integer":
//                return wrapContainer('int', ',', description, container);
                return new IntCol(description);

            default:
                return new StrCol(description);
        }
    }

    private List<String> getCode(Block saveFrame) {
        Column code = getField("item_type", "code", saveFrame);
        if (code == null || !code.isDefined()) {
            code = getField("type", "contents", saveFrame);
        }

        if (code != null && code.getRowCount() > 0) {
            return Stream.concat(Stream.of(code.getStringData(0)), getEnums(saveFrame)).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    private Stream<String> getEnums(Block saveFrame) {
        Column value = getField("item_enumeration", "value", saveFrame);
        if (value != null) {
            return IntStream.range(0, value.getRowCount())
                    .mapToObj(value::getStringData);
        } else {
            return Stream.empty();
        }
    }

    private String getSubCategory(Block saveFrame) {
        Column value = getField("item_sub_category", "id", saveFrame);
        if (value == null) {
            return "";
        }
        return value.getStringData(0);
    }

    private String getDescription(Block saveFrame) {
        Column value = getField("item_description", "description", saveFrame);
        if (value == null || !value.isDefined()) {
            value = getField("description", "text", saveFrame);
        }
        if (value == null) {
            return null;
        }
        String escapedDescription = escape(value.getStringData(0));
        return Pattern.compile("\n").splitAsStream(escapedDescription)
                .map(String::trim)
                .collect(Collectors.joining("\n"))
                .replaceAll("(\\[[1-3]])+ element", "elements")
                .replaceAll("(\\[[1-3]])+", "");
    }

    private Column getField(String category, String field, Block saveFrame) {
        Category cat = saveFrame.getCategory(category);
        if (cat.isDefined()) {
            return cat.getColumn(field);
        } else if (links.containsKey(saveFrame.getBlockHeader())) {
            String linkName = links.get(saveFrame.getBlockHeader());
            Block block = categories.get(linkName);
            if (block != null) {
                return getField(category, field, block);
            } else {
                System.err.println("link " + linkName + "not found");
                return null;
            }
        } else {
            return null;
        }
    }

    private void buildListOfLinksBetweenCategories(CifFile cifFile) {
        cifFile.getBlocks()
                .get(0)
                .getSaveFrames()
                .stream()
                .filter(saveFrame -> saveFrame.getBlockHeader().startsWith("_") || saveFrame.getBlockHeader().contains("."))
                .forEach(saveFrame -> {
                    categories.put(saveFrame.getBlockHeader(), saveFrame);
                    Category item_linked = saveFrame.getCategory("item_linked");

                    if (item_linked == null) {
                        return;
                    }

                    Column child_name = item_linked.getColumn("child_name");
                    Column parent_name = item_linked.getColumn("parent_name");

                    for (int i = 0; i < item_linked.getRowCount(); i++) {
                        String childName = child_name.getStringData(i);
                        String parentName = parent_name.getStringData(i);
                        links.put(childName, parentName);
                    }
                });
    }

    private void getCategoryMetadataMmcif(CifFile cifFile) {
        cifFile.getBlocks()
                .get(0)
                .getSaveFrames()
                .stream()
                .filter(saveFrame -> !saveFrame.getBlockHeader().startsWith("_"))
                .forEach(saveFrame -> {
                    Set<String> categoryKeyNames = new HashSet<>();
                    Column cifColumn = saveFrame.getCategory("category_key").getColumn("name");
                    for (int i = 0; i < cifColumn.getRowCount(); i++) {
                        categoryKeyNames.add(cifColumn.getStringData(i));
                    }

                    String rawDescription = saveFrame.getCategory("category")
                            .getColumn("description")
                            .getStringData(0);
                    String escapedDescription = escape(rawDescription);
                    String description = Pattern.compile("\n")
                            .splitAsStream(escapedDescription)
                            .map(String::trim)
                            .collect(Collectors.joining("\n"));

                    schema.put(saveFrame.getBlockHeader(), new Table(description, categoryKeyNames,
                            new LinkedHashMap<>()));
                });
    }

    private void getCategoryMetadataCifCore(CifFile cifFile) {
        Block block = cifFile.getBlocks().get(0);
        final String cifCoreDicVersion = block.getCategory("dictionary").getColumn("version").getStringData(0);
        System.out.println("Dictionary versions: CifCore " + cifCoreDicVersion);

        if ("CORE_DIC".equals(cifFile.getBlocks().get(0).getBlockHeader())) {
            block.getSaveFrames()
                    .stream()
                    // category definitions in cif don't include a '.'
                    .filter(saveFrame -> !saveFrame.getBlockHeader().contains("."))
                    .forEach(saveFrame -> {
                        Set<String> categoryKeyNames = new HashSet<>();
                        String rawDescription = saveFrame.getCategory("description")
                                .getColumn("text")
                                .getStringData(0);
                        String escapedDescription = escape(rawDescription);
                        String description = Pattern.compile("\n")
                                .splitAsStream(escapedDescription)
                                .map(String::trim)
                                .collect(Collectors.joining("\n"));

                        schema.put(saveFrame.getBlockHeader().toLowerCase(), new Table(description, categoryKeyNames,
                                new LinkedHashMap<>()));
                    });
        } else {
            // resolve imports
            block.getSaveFrames()
                    .forEach(b -> {
                        Map<String, Category> map = imports.computeIfAbsent(b.getBlockHeader(), e -> new LinkedHashMap<>());
                        map.putAll(b.getCategories());
                    });
        }
    }

    private static final Pattern savePattern = Pattern.compile("('save'|\"save\"):([^ \t\n]+)");
    private static final Pattern filePattern = Pattern.compile("('file'|\"file\"):([^ \t\n]+)");

    private Stream<Import> parseImportGet(String s) {
        // [{'save':hi_ang_Fox_coeffs  'file':templ_attr.cif}   {'save':hi_ang_Fox_c0  'file':templ_enum.cif}]
        // [{"file":'templ_enum.cif' "save":'H_M_ref'}]
        // get rid of surrounding brackets
        s = s.trim().substring(2, s.length() - 2);
        return Pattern.compile("}\\s+\\{").splitAsStream(s)
                .map(split -> {
                    Matcher save = savePattern.matcher(split);
                    Matcher file = filePattern.matcher(split);
                    return new Import(save, file);
                });
    }

    private String escape(String description) {
        return description.replace("&", "&amp;")
                .replace(">", "&gt;")
                .replace("<", "&lt;");
    }

    static class Import {
        final String save;
        final String file;

        public Import(Matcher save, Matcher file) {
            this.save = save.find() ? save.group(0).substring(7).replaceAll("['\"]", "") : null;
            this.file = file.find() ? file.group(0).substring(7).replaceAll("['\"]", "") : null;
        }

        public boolean isValid() {
            return save != null && file != null;
        }

        @Override
        public String toString() {
            return "Import{" +
                    "save='" + save + '\'' +
                    ", file='" + file + '\'' +
                    '}';
        }
    }

    private void prepareAliases() {
        // filter and flip aliases
        rawAliases.entrySet()
                .stream()
                .map(entry -> {
                    String target = entry.getKey();
                    String flatTarget = target.replace(".", "_");
                    List<String> sources = entry.getValue().stream()
                            // mappings handled by data model
                            .filter(s -> !s.equals(flatTarget))
                            .filter(s -> s.contains("."))
                            .filter(s -> !target.equals(s))
                            .distinct()
                            .collect(Collectors.toList());

                    // most will be empty as they just map between name with . and flat name
                    if (sources.isEmpty()) {
                        return Collections.emptyList();
                    }

//                    System.out.println("alias: " + sources + " -> " + target);

                    sources.add(target);
                    return sources;
                })
                .filter(list -> !list.isEmpty())
                .forEach(list -> {
                    List<String> alias = (List<String>) list;

                    Optional<List<String>> optional = aliases.stream()
                            // find sets of name referencing this
                            .filter(set -> alias.stream().anyMatch(set::contains))
                            .findFirst();

                    if (optional.isPresent()) {
                        optional.get().addAll(alias);
                    } else {
                        aliases.add(alias);
                    }
                });

        // ensure new categories
        aliases.stream()
                // map to individual names
                .flatMap(Collection::stream)
                .map(name -> name.split("\\.")[0])
                .filter(categoryName -> !schema.containsKey(categoryName))
                .forEach(categoryName -> {
//                    System.out.println("additional category: " + categoryName);
                    schema.computeIfAbsent(categoryName, e -> new Table("", new HashSet<>(), new LinkedHashMap<>()));
                });
    }
}
