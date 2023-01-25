package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_BATCH_SCAN category provide a
 * mechanism to associate derived quantities
 * (PDBX_DIFFRACTION_BATCH category) with experimental
 * information about scans within the DIFFRN_SCAN
 * category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnBatchScan extends DelegatingCategory {
    public PdbxDiffrnBatchScan(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "batch_id":
                return getBatchId();
            case "scan_id":
                return getScanId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_diffrn_batch_scan.batch_id must
     * uniquely identify the association between the derived
     * quantities (PDBX_DIFFRN_BATCH category) and
     * experimental scan information (DIFFRN_SCAN category).
     * 
     * This is a pointer into the PDBX_DIFFRN_BATCH category
     * (pdbx_diffrn_batch.id item).
     * @return StrColumn
     */
    public StrColumn getBatchId() {
        return delegate.getColumn("batch_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_diffrn_batch_scan.scan_id is a
     * pointer to diffrn_scan.id in the experimental scan
     * information (DIFFRN_SCAN category).
     * @return StrColumn
     */
    public StrColumn getScanId() {
        return delegate.getColumn("scan_id", DelegatingStrColumn::new);
    }

}