package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items describing glow discharge pretreatment for an EM grid
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmGridPretreatment extends BaseCategory {
    public EmGridPretreatment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmGridPretreatment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmGridPretreatment(String name) {
        super(name);
    }

    /**
     * The atmosphere used for glow discharge of the em grid.
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atmosphere", StrColumn::new) :
                getBinaryColumn("atmosphere"));
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
     * Pressure of the glow discharge chamber, in pascals
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure", FloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", StrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * Time period for glow discharge of the em grid, in seconds
     * @return IntColumn
     */
    public IntColumn getTime() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("time", IntColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Type of grid pretreatment
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
