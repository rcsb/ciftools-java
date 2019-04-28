package org.rcsb.cif.model.generated.pdbxnmrsoftware;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSoftware extends BaseCategory {
    public PdbxNmrSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSoftware(String name) {
        super(name);
    }

    /**
     * 
     * An ordinal index for this category
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The purpose of the software.
     * @return Classification
     */
    public Classification getClassification() {
        return (Classification) (isText ? textFields.computeIfAbsent("classification",
                Classification::new) : getBinaryColumn("classification"));
    }

    /**
     * The name of the software used for the task.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The version of the software.
     * @return Version
     */
    public Version getVersion() {
        return (Version) (isText ? textFields.computeIfAbsent("version",
                Version::new) : getBinaryColumn("version"));
    }

    /**
     * The name of the authors of the software used in this
     * procedure.
     * @return Authors
     */
    public Authors getAuthors() {
        return (Authors) (isText ? textFields.computeIfAbsent("authors",
                Authors::new) : getBinaryColumn("authors"));
    }

    /**
     * 
     * Text description of the software.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
