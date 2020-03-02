package org.rcsb.cif.schema.generator;

import org.rcsb.cif.CifIO;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.schema.DelegatingCategory;
import org.rcsb.cif.schema.DelegatingColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;
import org.rcsb.cif.schema.DelegatingStrColumn;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Creates a type-safe data model using the mmCIF dictionary. Needs the basic data structure already present to
 * bootstrap itself.
 */
@SuppressWarnings("ALL")
class SchemaGenerator {
    private static final Path OUTPUT_PATH = Paths.get("/Users/sebastian/model/");
    private static final String BASE_PACKAGE = "org.rcsb.cif.schema.generated.";
    private static final String GENERATED_PACKAGE = BASE_PACKAGE + ".generated";

    public static void main(String[] args) throws IOException {
//        new SchemaGenerator("MmCif", "mm", false,
//                "http://mmcif.wwpdb.org/dictionaries/ascii/mmcif_pdbx_v50.dic",
//                "https://raw.githubusercontent.com/ihmwg/IHM-dictionary/master/ihm-extension.dic",
//                "https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/entity_branch-extension.dic",
//                "https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/chem_comp-extension.dic");
        new SchemaGenerator("CifCore", "core", true,
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/templ_enum.cif",
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/templ_attr.cif",
                "https://raw.githubusercontent.com/COMCIFS/cif_core/master/cif_core.dic"); // has to be last
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
        writeBlockImpl(name, schema, OUTPUT_PATH);
    }

    private void writeBlockImpl(String name, Map<String, Table> content, Path path) throws IOException {
        Set<String> alreadyWritten = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        String className = name + "Block";
        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + pkg + ";");
        output.add("");

        StringJoiner getters = new StringJoiner("\n");
        StringJoiner delegator = new StringJoiner("\n");
        StringJoiner blockBuilder = new StringJoiner("\n");
        StringJoiner categoryBuilder = new StringJoiner("\n");

        blockBuilder.add("package " + BASE_PACKAGE + pkg + ";");
        blockBuilder.add("");
        blockBuilder.add("import org.rcsb.cif.model.builder.BlockBuilder;");
        blockBuilder.add("import org.rcsb.cif.model.builder.CategoryBuilder;");
        blockBuilder.add("import org.rcsb.cif.model.builder.CifBuilder;");
        blockBuilder.add("");
        blockBuilder.add("public class " + name + "BlockBuilder extends BlockBuilder {");
        blockBuilder.add("    public " + name + "BlockBuilder(String blockName, CifBuilder parent) {");
        blockBuilder.add("        super(blockName, parent);");
        blockBuilder.add("    }");
        blockBuilder.add("");

        categoryBuilder.add("package " + BASE_PACKAGE + pkg + ";");
        categoryBuilder.add("");
        categoryBuilder.add("import org.rcsb.cif.model.builder.BlockBuilder;");
        categoryBuilder.add("import org.rcsb.cif.model.builder.CategoryBuilder;");
        categoryBuilder.add("import org.rcsb.cif.model.builder.FloatColumnBuilder;");
        categoryBuilder.add("import org.rcsb.cif.model.builder.IntColumnBuilder;");
        categoryBuilder.add("import org.rcsb.cif.model.builder.StrColumnBuilder;");
        categoryBuilder.add("");
        categoryBuilder.add("public class " + name + "CategoryBuilder extends CategoryBuilder {");
        categoryBuilder.add("    public " + name + "CategoryBuilder(String blockName, BlockBuilder parent) {");
        categoryBuilder.add("        super(blockName, parent);");
        categoryBuilder.add("    }");

        for (Map.Entry<String, Table> entry : content.entrySet()) {
            String categoryName = entry.getKey();
            Table category = entry.getValue();

            if (!alreadyWritten.add(categoryName)) {
                System.out.println("skipping " + categoryName);
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
            getters.add("    public " + categoryClassName + " get" + categoryClassName + "() {");
            if (!flat) {
                getters.add("        return delegate.getCategory(\"" + categoryName + "\", " + categoryClassName + "::new);");
            } else {
                getters.add("        return new " + categoryClassName + "(this);");
            }
            getters.add("    }");
            getters.add("");

            writeCategory(name, category.getDescription(), categoryClassName, entry.getValue(), path, categoryName, categoryClassName, categoryBuilder);

            // delegation function
            delegator.add("            case \"" + categoryName + "\":");
            delegator.add("                return get" + categoryClassName + "();");

            // builder
            blockBuilder.add("    public " + name + "CategoryBuilder." + categoryClassName + "Builder enter" + categoryClassName  + "() {");
            blockBuilder.add("        return new " + name + "CategoryBuilder." + categoryClassName + "Builder(this);");
            blockBuilder.add("    }");
            blockBuilder.add("");
        }

        output.add("import org.rcsb.cif.model.Block;");
        output.add("import org.rcsb.cif.model.Category;");
        output.add("import org.rcsb.cif.schema.DelegatingBlock;");
        output.add("import org.rcsb.cif.schema.DelegatingCategory;");
        output.add("");
        output.add("import javax.annotation.Generated;");
        output.add("");
        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        output.add("public class " + className + " extends " + DelegatingBlock.class.getSimpleName() + " {");

        // constructor
        output.add("    public " + className + "(Block delegate) {");
        output.add("        super(delegate);");
        output.add("    }");
        output.add("");
        output.add("    @Override");
        output.add("    protected Category createDelegate(String categoryName, Category category) {");
        output.add("        switch (categoryName) {");
        output.add(delegator.toString());
        output.add("            default:");
        output.add("                return new DelegatingCategory.NOPDelegatingCategory(category);");
        output.add("        }");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        blockBuilder.add("}");
        categoryBuilder.add("}");

        Files.write(path.resolve(name + "BlockBuilder.java"), blockBuilder.toString().getBytes());
        Files.write(path.resolve(name + "CategoryBuilder.java"), categoryBuilder.toString().getBytes());
        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeCategory(String name, String categoryDescription, String className, Table content, Path path, String categoryName,
                               String categoryClassName, StringJoiner categoryBuilder) throws IOException {
        if (!Files.exists(path)) {
            Files.createDirectory(path);
        }
        Path generatedPath = path.resolve("generated");
        if (!Files.exists(generatedPath)) {
            Files.createDirectory(generatedPath);
        }

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + pkg + ";");
        output.add("");
        output.add("import org.rcsb.cif.model.*;");
        output.add("import org.rcsb.cif.schema.*;");
        output.add("");
        output.add("import javax.annotation.Generated;");
        output.add("");
        output.add("/**");
        categoryDescription = Pattern.compile("\n").splitAsStream(categoryDescription)
                .map(s -> " * " + s)
                .collect(Collectors.joining("\n"));
        output.add(categoryDescription);
        output.add(" */");
        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        if (!flat) {
            output.add("public class " + className + " extends " + DelegatingCategory.class.getSimpleName() + " {");
        } else {
            output.add("public class " + className + " extends " + DelegatingCategory.class.getSimpleName() + ".DelegatingCifCoreCategory {");
            output.add("    private static final String NAME = \"" + categoryName + "\";");
            output.add("");
        }

        StringJoiner getters = new StringJoiner("\n");
        StringJoiner delegator = new StringJoiner("\n");

        categoryBuilder.add("");
        categoryBuilder.add("    public static class " + categoryClassName + "Builder extends " + name + "CategoryBuilder {");
        categoryBuilder.add("        private static final String CATEGORY_NAME = \"" + categoryName + "\";");
        categoryBuilder.add("");
        categoryBuilder.add("        public " + categoryClassName + "Builder(BlockBuilder parent) {");
        categoryBuilder.add("            super(CATEGORY_NAME, parent);");
        categoryBuilder.add("        }");

        for (Map.Entry<String, Object> entry : content.getColumns().entrySet()) {
            String columnName = entry.getKey();
            Col column = (Col) entry.getValue();

            String columnClassName = toClassName(columnName);
            Class<? extends Column> baseClass = getBaseClass(column.getType());
            Class<? extends DelegatingColumn> delegatingBaseClass = getDelegatingBaseClass(column.getType());
            String baseClassName = baseClass.getSimpleName();
            String delegatingBaseClassName = delegatingBaseClass.getSimpleName();

            getters.add("    /**");
            String description = Pattern.compile("\n").splitAsStream(column.getDescription())
                    .map(s -> "     * " + s)
                    .collect(Collectors.joining("\n"));
            getters.add(description);
            getters.add("     * @return " + baseClassName);
            getters.add("     */");
            getters.add("    public " + baseClassName + " get" + columnClassName + "() {");
            if (!flat) {
                getters.add("        return delegate.getColumn(\"" + columnName + "\", " + delegatingBaseClassName + "::new);");
            } else {
                getters.add("        return new " + delegatingBaseClassName + "(parentBlock.getColumn(NAME + \"_" + columnName + "\"));");
            }
            getters.add("    }");
            getters.add("");

            // delegation function
            delegator.add("            case \"" + columnName + "\":");
            delegator.add("                return get" + columnClassName + "();");

            categoryBuilder.add("");
            categoryBuilder.add("        public " + baseClassName + "Builder<" + categoryClassName + "Builder> enter" + columnClassName + "() {");
            categoryBuilder.add("            return new " + getBaseClass(column.getType()).getSimpleName() + "Builder<>(CATEGORY_NAME, \"" + columnName + "\", this);");
            categoryBuilder.add("        }");
        }

        // constructor
        if (!flat) {
            output.add("    public " + className + "(Category delegate) {");
            output.add("        super(delegate);");
            output.add("    }");
            output.add("");
            output.add("    @Override");
            output.add("    protected Column createDelegate(String columnName, Column column) {");
            output.add("        switch (columnName) {");
            output.add(delegator.toString());
            output.add("            default:");
            output.add("                return new DelegatingColumn(column);");
            output.add("        }");
            output.add("    }");
            output.add("");
        } else {
            output.add("    public " + className + "(CifCoreBlock parentBlock) {");
            output.add("        super(NAME, parentBlock);");
            output.add("    }");
            output.add("");
        }

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        categoryBuilder.add("    }");

        Files.write(path.resolve("generated").resolve(className + ".java"), output.toString().getBytes());
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
        // TODO enums, lists, matrix, and vector would be nice to have
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

    private SchemaGenerator(String name, String pkg, boolean flat, String... resource) throws IOException {
        this.name = name;
        this.pkg = pkg;
        this.flat = flat;
        this.schema = new LinkedHashMap<>();
        this.categories = new LinkedHashMap<>();
        this.links = new LinkedHashMap<>();
        this.imports = new LinkedHashMap<>();
        this.aliases = new LinkedHashMap<>();
        for (String res : resource) {
            System.out.println(res);
            CifFile cifFile = CifIO.readFromURL(new URL(res));
            if (name.equals("MmCif")) {
                getCategoryMetadataMmcif(cifFile);
            } else if (name.equals("CifCore")) {
                getCategoryMetadataCifCore(cifFile);
            }
            buildListOfLinksBetweenCategories(cifFile);
        }
        getFieldData();
        writeClasses();
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

    private final String name;
    private final String pkg;
    private final boolean flat;
    private final Map<String, Table> schema;
    private final Map<String, Block> categories;
    private final Map<String, String> links;
    private final Map<String, Block> imports;
    private final Map<String, List<String>> aliases;

    private void getFieldData() {
        categories.forEach((fullName, saveFrame) -> {
            String header = saveFrame.getBlockHeader();
            String categoryName = header.substring(header.startsWith("_") ? 1 : 0, header.contains(".") ? header.indexOf(".") : header.length());
            String itemName = header.substring(header.indexOf(".") + 1);
            Map<String, Object> fields = new LinkedHashMap<>();

            if (schema.containsKey(categoryName)) {
                fields = schema.get(categoryName).getColumns();
                schema.get(categoryName).getCategoryKeyNames().add(itemName);
            } else if (schema.containsKey(categoryName.toLowerCase())) {
                // take case from category name in 'field' data as it is better if data is from cif dictionaries
                schema.put(categoryName, schema.get(categoryName.toLowerCase()));
                fields = schema.get(categoryName).getColumns();
            } else {
                System.out.println("category " + categoryName + " has no metadata");
                fields = new LinkedHashMap<>();
                schema.put(categoryName, new Table("", new HashSet<>(), fields));
            }

            List<String> itemAliases = getAliases(saveFrame);
            if (!itemAliases.isEmpty()) {
                aliases.put(categoryName + "." + itemName, itemAliases);
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
                    if (code.size() > 0) {
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
                .mapToObj(i -> column.getStringData(i))
                .map(s -> s.substring(1))
                .collect(Collectors.toList());
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
        try {
            Column value = getField("item_sub_category", "id", saveFrame);
            return value.getStringData(0);
        } catch (NullPointerException e) {
            return "";
        }
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
        } else {
            String linkName = links.get(saveFrame.getBlockHeader());
            Block block = categories.get(linkName);
            if (block != null) {
                return getField(category, field, block);
            } else {
                return null;
            }
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
            block.getSaveFrames()
                    .forEach(b -> imports.put(b.getBlockHeader(), b));
        }
    }

    private static final Pattern savePattern = Pattern.compile("('save'|'save'):([^ \t\n]+)");
    private static final Pattern filePattern = Pattern.compile("('file'|'file'):([^ \t\n]+)");

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
            this.save = save.find() ? save.group(0).substring(7).replace("['\"]", "") : null;
            this.file = file.find() ? file.group(0).substring(7).replaceAll("['\"]", "") : null;
        }

        public boolean isValid() {
            return save != null && file != null;
        }
    }
}

