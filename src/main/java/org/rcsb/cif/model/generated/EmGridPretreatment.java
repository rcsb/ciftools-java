package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAtmosphere() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("atmosphere", SingleRowStrColumn::new) :
                getBinaryColumn("atmosphere"));
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
     * Pressure of the glow discharge chamber, in pascals
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPressure() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pressure", SingleRowFloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleSupportId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", SingleRowStrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * Time period for glow discharge of the em grid, in seconds
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getTime() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("time", SingleRowIntColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Type of grid pretreatment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
