package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Staining category
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmStaining extends BaseCategory {
    public EmStaining(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStaining(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStaining(String name) {
        super(name);
    }

    /**
     * Staining procedure used in the specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is the primary key of the category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The staining  material.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("material", StrColumn::new) :
                getBinaryColumn("material"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * type of staining
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
