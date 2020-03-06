package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CELL_MEASUREMENT_REFLN category record
 * details about the reflections used to determine the
 * crystallographic cell parameters.
 * 
 * The CELL_MEASUREMENT_REFLN data items would in general be used
 * only for diffractometer data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellMeasurementRefln extends DelegatingCategory {
    public CellMeasurementRefln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "theta":
                return getTheta();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Miller index h of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of a reflection used for measurement of the unit
     * cell.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * Theta angle for a reflection used for measurement of
     * the unit cell in degrees.
     * @return FloatColumn
     */
    public FloatColumn getTheta() {
        return delegate.getColumn("theta", DelegatingFloatColumn::new);
    }

}