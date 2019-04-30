package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the BUFFER category
 * record details of the sample buffer.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmBuffer extends BaseCategory {
    public EmBuffer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmBuffer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmBuffer(String name) {
        super(name);
    }

    /**
     * The value of _em_buffer.id must
     * uniquely identify the sample buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * pointer to  _em_specimen.id
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * The name of the buffer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Additional details about the buffer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Additional details about the buffer.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pH", FloatColumn::new) :
                getBinaryColumn("pH"));
    }
}
