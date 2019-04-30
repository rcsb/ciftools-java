package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the SOFTWARE category record details about
 * the software used in the structure analysis, which implies
 * any software used in the generation of any data items
 * associated with the structure determination and
 * structure representation.
 * 
 * These data items allow computer programs to be referenced
 * in more detail than data items in the COMPUTING category do.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Software extends BaseCategory {
    public Software(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Software(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Software(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * The classification of the program according to its
     * major function.
     * @return StrColumn
     */
    public StrColumn getClassification() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("classification", StrColumn::new) :
                getBinaryColumn("classification"));
    }

    /**
     * The compiler used to compile the software.
     * @return StrColumn
     */
    public StrColumn getCompilerName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("compiler_name", StrColumn::new) :
                getBinaryColumn("compiler_name"));
    }

    /**
     * The version of the compiler used to compile the software.
     * @return StrColumn
     */
    public StrColumn getCompilerVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("compiler_version", StrColumn::new) :
                getBinaryColumn("compiler_version"));
    }

    /**
     * The recognized contact author of the software. This could be
     * the original author, someone who has modified the code or
     * someone who maintains the code.  It should be the person
     * most commonly associated with the code.
     * @return StrColumn
     */
    public StrColumn getContactAuthor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author", StrColumn::new) :
                getBinaryColumn("contact_author"));
    }

    /**
     * The e-mail address of the person specified in
     * _software.contact_author.
     * @return StrColumn
     */
    public StrColumn getContactAuthorEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contact_author_email", StrColumn::new) :
                getBinaryColumn("contact_author_email"));
    }

    /**
     * The date the software was released.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Description of the software.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * Any prerequisite software required to run _software.name.
     * @return StrColumn
     */
    public StrColumn getDependencies() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dependencies", StrColumn::new) :
                getBinaryColumn("dependencies"));
    }

    /**
     * The hardware upon which the software was run.
     * @return StrColumn
     */
    public StrColumn getHardware() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hardware", StrColumn::new) :
                getBinaryColumn("hardware"));
    }

    /**
     * The major computing language in which the software is
     * coded.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("language", StrColumn::new) :
                getBinaryColumn("language"));
    }

    /**
     * The URL for an Internet address at which
     * details of the software can be found.
     * @return StrColumn
     */
    public StrColumn getLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("location", StrColumn::new) :
                getBinaryColumn("location"));
    }

    /**
     * Any noteworthy modifications to the base software, if applicable.
     * @return StrColumn
     */
    public StrColumn getMods() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mods", StrColumn::new) :
                getBinaryColumn("mods"));
    }

    /**
     * The name of the software.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The name of the operating system under which the software
     * runs.
     * @return StrColumn
     */
    public StrColumn getOs() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("os", StrColumn::new) :
                getBinaryColumn("os"));
    }

    /**
     * The version of the operating system under which the software
     * runs.
     * @return StrColumn
     */
    public StrColumn getOsVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("os_version", StrColumn::new) :
                getBinaryColumn("os_version"));
    }

    /**
     * The classification of the software according to the most
     * common types.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("version", StrColumn::new) :
                getBinaryColumn("version"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }
}
