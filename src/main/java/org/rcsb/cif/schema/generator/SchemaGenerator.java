package org.rcsb.cif.schema.generator;

import org.rcsb.cif.CifIO;
import org.rcsb.cif.binary.codec.MessagePackCodec;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Creates a type-safe data model using the mmCIF dictionary. Needs the basic data structure already present to
 * bootstrap itself.
 *
 * Download URLS:
 * http://mmcif.wwpdb.org/dictionaries/ascii/mmcif_pdbx_v50.dic
 * https://raw.githubusercontent.com/ihmwg/IHM-dictionary/master/ihm-extension.dic
 * https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/entity_branch-extension.dic
 * https://raw.githubusercontent.com/pdbxmmcifwg/carbohydrate-extension/master/dict/chem_comp-extension.dic
 * https://www.iucr.org/resources/cif/dictionaries/cif_core
 */
@SuppressWarnings("ALL")
class SchemaGenerator {
    private static final Path OUTPUT_PATH = Paths.get("/Users/sebastian/model/");
    private static final String BASE_PACKAGE = "org.rcsb.cif.schema.generated.";
    private static final String GENERATED_PACKAGE = BASE_PACKAGE + ".generated";

    public static void main(String[] args) throws IOException {
        new SchemaGenerator("MmCif", "mm", "mmcif_pdbx_v50.dic", "chem_comp-extension.dic", "entity_branch-extension.dic", "ihm-extension.dic");
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

    private static final MessagePackCodec MESSAGE_PACK_CODEC = new MessagePackCodec();

    private void writeClasses() throws IOException {
//        writeBlockInterface(Block.class.getSimpleName(), schema, OUTPUT_PATH);
        writeBlockImpl(name + "Block", schema, OUTPUT_PATH);
    }

//    private void writeBlockInterface(String className, Map<String, Table> content, Path path) throws IOException {
//        StringJoiner output = new StringJoiner("\n");
//        output.add("package " + BASE_PACKAGE + ";");
//        output.add("");
//
//        StringJoiner getters = new StringJoiner("\n");
//
//        getters.add("    String getBlockHeader();");
//        getters.add("");
//
//        getters.add("    " + Category.class.getSimpleName() + " getCategory(String name);");
//        getters.add("");
//
//        getters.add("    List<String> getCategoryNames();");
//        getters.add("");
//
//        getters.add("    List<" + Block.class.getSimpleName() + "> getSaveFrames();");
//        getters.add("");
//
//        for (Map.Entry<String, Table> entry : content.entrySet()) {
//            String categoryName = entry.getKey();
//            Table category = entry.getValue();
//
//            String categoryClassName = toClassName(categoryName);
//
//            getters.add("    /**");
//            String description = Pattern.compile("\n").splitAsStream(category.getDescription())
//                    .map(s -> "     * " + s)
//                    .collect(Collectors.joining("\n"));
//            getters.add(description);
//            getters.add("     * @return " + categoryClassName);
//            getters.add("     */");
//            getters.add("    " + BASE_PACKAGE + ".generated." + categoryClassName + " get" + categoryClassName + "();");
//            getters.add("");
//        }
//
//        output.add("import javax.annotation.Generated;");
//        output.add("import java.util.List;");
//        output.add("");
//        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
//        output.add("public interface " + className + " {");
//
//        // getters
//        output.add(getters.toString() + "}");
//        output.add("");
//
//        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
//    }

    private void writeBlockImpl(String className, Map<String, Table> content, Path path) throws IOException {
        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + pkg + ";");
        output.add("");

        StringJoiner getters = new StringJoiner("\n");
        StringJoiner builder = new StringJoiner("\n");
//        StringJoiner categoryBuilder = new StringJoiner("\n");

        for (Map.Entry<String, Table> entry : content.entrySet()) {
            String categoryName = entry.getKey();
            Table category = entry.getValue();

            String categoryClassName = toClassName(categoryName);

            getters.add("    /**");
            String description = Pattern.compile("\n").splitAsStream(category.getDescription())
                    .map(s -> "     * " + s)
                    .collect(Collectors.joining("\n"));
            getters.add(description);
            getters.add("     * @return " + categoryClassName);
            getters.add("     */");
            getters.add("    public " + categoryClassName + " get" + categoryClassName + "() {");
            getters.add("        return delegate.getCategory(\"" + categoryName + "\", " + categoryClassName + "::new);");
            getters.add("    }");
            getters.add("");

            writeCategory(category.getDescription(), categoryClassName, entry.getValue(), path, categoryName, categoryClassName/*, categoryBuilder*/);

            // builder
//            builder.add("    public CategoryBuilder." + categoryClassName + "Builder enter" + categoryClassName
//                    + "() {");
//            builder.add("        return new CategoryBuilder." + categoryClassName + "Builder(this);");
//            builder.add("    }");
//            builder.add("");
        }

        output.add("import org.rcsb.cif.schema.DelegatingBlock;");
        output.add("import org.rcsb.cif.model.Block;");
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

        // getters
        output.add(getters.toString() + "}");
        output.add("");

//        Files.write(path.resolve("BlockBuilder.java"), builder.toString().getBytes());
//        Files.write(path.resolve("CategoryBuilder.java"), categoryBuilder.toString().getBytes());
        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeCategory(String categoryDescription, String className, Table content, Path path, String categoryName,
                               String categoryClassName/*, StringJoiner categoryBuilder*/) throws IOException {
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
        output.add("public class " + className + " extends " + DelegatingCategory.class.getSimpleName() + " {");

        StringJoiner getters = new StringJoiner("\n");

//        categoryBuilder.add("");
//        categoryBuilder.add("    public static class " + categoryClassName + "Builder extends CategoryBuilder {");
//        categoryBuilder.add("        private static final String CATEGORY_NAME = \"" + categoryName + "\";");
//        categoryBuilder.add("");
//        categoryBuilder.add("        public " + categoryClassName + "Builder(BlockBuilder parent) {");
//        categoryBuilder.add("            super(CATEGORY_NAME, parent);");
//        categoryBuilder.add("        }");

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
            getters.add("        return delegate.getColumn(\"" + columnName + "\", " + delegatingBaseClassName + "::new);");
            getters.add("    }");
            getters.add("");

//            categoryBuilder.add("");
//            categoryBuilder.add("        public " + baseClassName + "Builder<" +
//                    categoryClassName + "Builder> enter" + columnClassName + "() {");
//            categoryBuilder.add("            return new " + getBaseClass(column.getType()) +
//                    "Builder<>(CATEGORY_NAME, \"" + columnName + "\", this);");
//            categoryBuilder.add("        }");
        }

        // constructor
        output.add("    public " + className + "(Category delegate) {");
        output.add("        super(delegate);");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

//        categoryBuilder.add("    }");

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

    private SchemaGenerator(String name, String pkg, String... resource) throws IOException {
        this.name = name;
        this.pkg = pkg;
        this.schema = new LinkedHashMap<>();
        this.categories = new LinkedHashMap<>();
        this.links = new LinkedHashMap<>();
        for (String res : resource) {
            System.out.println(res);
            CifFile cifFile = CifIO.readFromInputStream(Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(res));
            getCategoryMetadata(cifFile);
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
    private final Map<String, Table> schema;
    private final Map<String, Block> categories;
    private final Map<String, String> links;

    private void getFieldData() {
        categories.forEach((fullName, saveFrame) -> {
            String header = saveFrame.getBlockHeader();
            String categoryName = header.substring(1, header.contains(".") ? header.indexOf(".") : header.length());
            String itemName = header.substring(header.contains(".") ? header.indexOf(".") + 1 : 1);
            Map<String, Object> fields = schema.get(categoryName).getColumns();

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
        if (code.isDefined() && code.getRowCount() > 0) {
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
                .filter(saveFrame -> saveFrame.getBlockHeader().startsWith("_"))
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

    private void getCategoryMetadata(CifFile cifFile) {
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

    private String escape(String description) {
        return description.replace("&", "&amp;")
                .replace(">", "&gt;")
                .replace("<", "&lt;");
    }
}

