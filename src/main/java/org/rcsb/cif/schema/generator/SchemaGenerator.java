package org.rcsb.cif.schema.generator;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.rcsb.cif.model.ModelFactory.*;

/**
 * Creates a type-safe data model using the mmCIF dictionary. Needs the basic data structure already present to
 * bootstrap itself.
 */
class SchemaGenerator {
    private static final Path OUTPUT_PATH = Paths.get("/Users/sebastian/model/");

    public static void main(String[] args) throws IOException {
        new SchemaGenerator().generate();
    }

    /**
     * Collection of categories and columns to include in the generated model - used by SchemaGenerator.
     */
    private static final Map<String, List<String>> filter;

    static {
        try {
            // create schema filter
            filter = new LinkedHashMap<>();
            BufferedReader filterBr = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("mmcif-field-names.csv"))));

            filterBr.lines()
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split("\\."))
                    .forEach(split -> {
                        List<String> cols = filter.computeIfAbsent(split[0], s -> new ArrayList<>());
                        cols.add(split[1]);
                    });
            filterBr.close();
        } catch (IOException e) {
            throw new UncheckedIOException("could not load local resource for column filtering", e);
        }
    }

    private static String toClassName(String rawName) {
        String name = Pattern.compile("_").splitAsStream(rawName)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(""))
                // remove invalid characters
                .replaceAll("[/\\\\\\- (){},;:'<>?+=]", "_")
                .replaceAll("_+", "_");
        if (name.equals("Class")) {
            return "Clazz";
        } else if (Character.isDigit(name.charAt(0))) {
            return "_" + name;
        }
        return name;
    }

    private void generate() throws IOException {
        getCategoryMetadata();

        buildListOfLinksBetweenCategories();

        getFieldData();

        writeClasses();
    }

    private void writeClasses() throws IOException {
        writeBlockInterface(Block.class.getSimpleName(), schema, OUTPUT_PATH);
        writeBlockImpl(BaseBlock.class.getSimpleName(), schema, OUTPUT_PATH);
    }

    private void writeBlockInterface(String className, Map<String, Table> content, Path path) throws IOException {
        System.out.println(className);

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + ";");
        output.add("");

        StringJoiner getters = new StringJoiner("\n");

        getters.add("    String getBlockHeader();");
        getters.add("");

        getters.add("    " + Category.class.getSimpleName() + " getCategory(String name);");
        getters.add("");

        getters.add("    List<String> getCategoryNames();");
        getters.add("");

        getters.add("    List<" + Block.class.getSimpleName() + "> getSaveFrames();");
        getters.add("");

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
            getters.add("    " + BASE_PACKAGE + "." + categoryClassName.toLowerCase() + "." + categoryClassName +
                    " get" + categoryClassName + "();");
            getters.add("");
        }

        output.add("import javax.annotation.Generated;");
        output.add("import java.util.List;");
        output.add("");
        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        output.add("public interface " + className + " {");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeBlockImpl(String className, Map<String, Table> content, Path path) throws IOException {
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
                    categoryClassName + ") categories.computeIfAbsent(\"" + categoryName + "\",");
            getters.add("                " + BASE_PACKAGE + "." + categoryClassName.toLowerCase() + "." +
                    categoryClassName + "::new);");
            getters.add("    }");
            getters.add("");

            writeCategory(categoryClassName, entry.getValue(), path.resolve(categoryClassName.toLowerCase()), categoryName);
        }

        output.add("import org.rcsb.cif.model.BaseCifBlock;");
        output.add("import org.rcsb.cif.model.Category;");
        output.add("");
        output.add("import javax.annotation.Generated;");
        output.add("import java.util.ArrayList;");
        output.add("import java.util.Map;");
        output.add("");
        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        output.add("public class " + className + " implements " + Block.class.getSimpleName() + " {");

        // constructor
        output.add("    public " + className + "(Map<String, Category> categories, String header) {");
        output.add("        super(categories, header, new ArrayList<>());");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeCategory(String className, Table content, Path path, String categoryName) throws IOException {
        System.out.println(" -> " + className + " " + content.getRepeat());

        if (!Files.exists(path)) {
            Files.createDirectory(path);
        }

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + "." + className.toLowerCase() + ";");
        output.add("");
        output.add("import org.rcsb.cif.model.BaseCategory;");
        output.add("import org.rcsb.cif.model.Column;");
        output.add("");
        output.add("import javax.annotation.Generated;");
        output.add("import java.util.Map;");
        output.add("");

        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        output.add("public class " + className + " extends " + BaseCategory.class.getSimpleName() + " {");

        StringJoiner getters = new StringJoiner("\n");

        for (Map.Entry<String, Object> entry : content.getColumns().entrySet()) {
            String columnName = entry.getKey();
            Col column = (Col) entry.getValue();

            if (!filter.get(categoryName).contains(columnName)) {
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
            getters.add("        return (" + columnClassName + ") (isText ? textFields.computeIfAbsent(\"" + columnName + "\",");
            getters.add("                " + columnClassName + "::new) : getBinaryColumn(\"" + columnName + "\"));");
            getters.add("    }");
            getters.add("");

            writeColumn(columnClassName, column, content.getRepeat() == Repeat.SINGLE, path);
        }

        // constructor
        output.add("    public " + className + "(String name, Map<String, Column> columns) {");
        output.add("        super(name, columns);");
        output.add("    }");
        output.add("");

        output.add("    public " + className + "(String name, int rowCount, Object[] encodedColumns) {");
        output.add("        super(name, rowCount, encodedColumns);");
        output.add("    }");
        output.add("");

        output.add("    public " + className + "(String name) {");
        output.add("        super(name);");
        output.add("    }");
        output.add("");

        // getters
        output.add(getters.toString() + "}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private void writeColumn(String className, Col content, boolean singleRow, Path path) throws IOException {
        System.out.println(" -> -> " + className + " " + getBaseClass(content.getType(), singleRow));

        StringJoiner output = new StringJoiner("\n");
        output.add("package " + BASE_PACKAGE + "." + path.toFile().getName() + ";");
        output.add("");
        output.add("import " + BASE_PACKAGE.replace(".generated", "") + ".*;");
        output.add("");
        output.add("import javax.annotation.Generated;");
        output.add("");

        output.add("@Generated(\"org.rcsb.cif.schema.generator.SchemaGenerator\")");
        output.add("public class " + className + " extends " + getBaseClass(content.getType(), singleRow) + " {");

        // constructor for text data
        output.add("    public " + className + "(String name, int rowCount, String data, int[] startToken, int[] endToken) {");
        output.add("        super(name, rowCount, data, startToken, endToken);");
        output.add("    }");
        output.add("");

        // constructor for binary data
        output.add("    public " + className + "(String name, int rowCount, Object data, int[] mask) {");
        output.add("        super(name, rowCount, data, mask);");
        output.add("    }");
        output.add("");

        // constructor when no data
        output.add("    public " + className + "(String name) {");
        output.add("        super(name);");
        output.add("    }");

        if (className.equals("CartnX") || className.equals("CartnY") || className.equals("CartnZ")) {
            output.add("");
            output.add("    @Override");
            output.add("    public String format(double val) {");
            output.add("        return FLOAT_3.format(val);");
            output.add("    }");
        } else if (className.equals("Occupancy")) {
            output.add("");
            output.add("    @Override");
            output.add("    public String format(double val) {");
            output.add("        return FLOAT_2.format(val);");
            output.add("    }");
        }

        // TODO enums, lists, matrix, and vector would be nice to have

        output.add("}");
        output.add("");

        Files.write(path.resolve(className + ".java"), output.toString().getBytes());
    }

    private String getBaseClass(String type, boolean singleRow) {
        Class<?> clazz;
        switch (type) {
            // TODO support remaining single row types
            case "coord":
                clazz = CoordColumn.class; break;
            case "enum":
                clazz = EnumColumn.class; break;
            case "float":
                clazz = singleRow ? SingleRowFloatColumn.class : FloatColumn.class; break;
            case "int":
                clazz = singleRow ? SingleRowIntColumn.class : IntColumn.class; break;
            case "list":
                clazz = ListColumn.class; break;
            case "matrix":
                clazz = MatrixColumn.class; break;
            case "str":
                clazz = singleRow ? SingleRowStrColumn.class : StrColumn.class; break;
            case "vector":
                clazz = VectorColumn.class; break;
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
        return clazz.getSimpleName();
    }

    private SchemaGenerator() throws IOException {
        this.cifFile = CifReader.parseText(Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("mmcif_pdbx_v50.dic"));
        this.schema = new LinkedHashMap<>();
        this.categories = new LinkedHashMap<>();
        this.links = new LinkedHashMap<>();
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
        if (value.isDefined() && value.getRowCount() > 0) {
            return IntStream.range(0, value.getRowCount())
                    .mapToObj(value::getStringData);
        } else {
            return Stream.empty();
        }
    }

    private String getSubCategory(Block saveFrame) {
        Column value = getField("item_sub_category", "id", saveFrame);
        if (value.isDefined() && value.getRowCount() > 0) {
            return value.getStringData(0);
        } else {
            return "";
        }
    }

    private String getDescription(Block saveFrame) {
        Column value = getField("item_description", "description", saveFrame);
        return Pattern.compile("\n").splitAsStream(value.getStringData(0))
                .map(String::trim)
                .collect(Collectors.joining("\n"))
                .replaceAll("(\\[[1-3]])+ element", "elements")
                .replaceAll("(\\[[1-3]])+", "");
    }

    private Column getField(String category, String field, Block saveFrame) {
        try {
            Category cat = saveFrame.getCategory(category);
            return cat.getColumn(field);
        } catch (NullPointerException e) {
            String linkName = links.get(saveFrame.getBlockHeader());
            return getField(category, field, categories.get(linkName));
        }
    }

    private void buildListOfLinksBetweenCategories() {
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

    private void getCategoryMetadata() {
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

                    Repeat repeat = Repeat.UNKNOWN;
                    if (filter.containsKey(saveFrame.getBlockHeader())) {
                        if (saveFrame.getCategory("category_examples")
                                    .getColumn("case")
                                    .getStringData(0).contains("loop_")) {
                            repeat = Repeat.LOOP;
                        } else {
                            repeat = Repeat.SINGLE;
                        }
                    }

                    String rawDescription = saveFrame.getCategory("category")
                            .getColumn("description")
                            .getStringData(0);
                    String description = Pattern.compile("\n")
                            .splitAsStream(rawDescription)
                            .map(String::trim)
                            .collect(Collectors.joining("\n"));

                    schema.put(saveFrame.getBlockHeader(), new Table(description, categoryKeyNames, new LinkedHashMap<>(), repeat));
                });
    }

    enum Repeat {
        SINGLE,
        LOOP,
        UNKNOWN
    }
}

