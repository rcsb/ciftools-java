package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Buffer category
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmBufferComponent extends BaseCategory {
    public EmBufferComponent(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmBufferComponent(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmBufferComponent(String name) {
        super(name);
    }

    /**
     * Foreign key to the entry category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("buffer_id", StrColumn::new) :
                getBinaryColumn("buffer_id"));
    }

    /**
     * The concentration of the sample (arbitrary units).
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("concentration", FloatColumn::new) :
                getBinaryColumn("concentration"));
    }

    /**
     * Units for the sample concentration value.
     * @return StrColumn
     */
    public StrColumn getConcentrationUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("concentration_units", StrColumn::new) :
                getBinaryColumn("concentration_units"));
    }

    /**
     * formula for buffer component
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("formula", StrColumn::new) :
                getBinaryColumn("formula"));
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
     * name of the buffer component
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }
}
