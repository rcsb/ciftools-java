package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCAN_COLLECTION  category describe
 * the collection strategy for each scan.
 * 
 * This category is a preliminary version being developed as
 * synchrotron and XFEL collection strategies evolve.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScanCollection extends DelegatingCategory {
    public DiffrnScanCollection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "scan_id":
                return getScanId();
            case "type":
                return getType();
            case "translation_width":
                return getTranslationWidth();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _diffrn_scan_collection.details  should give a
     * description of special aspects of each collection strategy.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_scan_collection.scan_id  identifies the scan
     * containing this frame.
     * 
     * This item is a pointer to _diffrn_scan.id  in the
     * DIFFRN_SCAN  category.
     * 
     * In the case of a single-scan dataset, the value is implicit.
     * @return StrColumn
     */
    public StrColumn getScanId() {
        return delegate.getColumn("scan_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_scan_collection.type  identifies
     * the strategy used in this scan, e.g. `rotation', 'raster',
     * 'vector', 'still', etc.
     * 
     * The default is 'rotation'.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_scan_collection.translation_width
     * gives the average single step translation in micrometres
     * in collection strategies for which this information is
     * appropriate, e.g. 'vector'.
     * @return FloatColumn
     */
    public FloatColumn getTranslationWidth() {
        return delegate.getColumn("translation_width", DelegatingFloatColumn::new);
    }

}