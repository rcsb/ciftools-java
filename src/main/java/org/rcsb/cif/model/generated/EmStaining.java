package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is the primary key of the category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The staining  material.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("material", SingleRowStrColumn::new) :
                getBinaryColumn("material"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_id", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * type of staining
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
