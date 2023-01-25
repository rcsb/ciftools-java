package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_DETECTOR_AXIS  category associate
 * axes with detectors.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDetectorAxis extends DelegatingCategory {
    public DiffrnDetectorAxis(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "axis_id":
                return getAxisId();
            case "detector_id":
                return getDetectorId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _axis.id  in
     * the AXIS category.
     * @return StrColumn
     */
    public StrColumn getAxisId() {
        return delegate.getColumn("axis_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_detector.id  in
     * the DIFFRN_DETECTOR  category.
     * 
     * This item was previously named _diffrn_detector_axis.id
     * which is now a deprecated name.  The old name is
     * provided as an alias but should not be used for new work.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return delegate.getColumn("detector_id", DelegatingStrColumn::new);
    }

}