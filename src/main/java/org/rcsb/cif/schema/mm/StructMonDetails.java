package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_MON_DETAILS category record details
 * about specifics of calculations summarized in data items in the
 * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
 * include the coefficients used in map calculations,
 * the radii used for including points in a calculation and so on.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructMonDetails extends DelegatingCategory {
    public StructMonDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "prot_cis":
                return getProtCis();
            case "RSCC":
                return getRSCC();
            case "RSR":
                return getRSR();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * An ideal cis peptide bond would have an omega torsion angle of
     * zero. This data item gives the value in degrees by which the
     * observed torsion angle can differ from 0.0 and still be
     * considered cis.
     * @return FloatColumn
     */
    public FloatColumn getProtCis() {
        return delegate.getColumn("prot_cis", DelegatingFloatColumn::new);
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSCC_all,
     * _struct_mon_prot.RSCC_main and _struct_mon_prot.RSCC_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return StrColumn
     */
    public StrColumn getRSCC() {
        return delegate.getColumn("RSCC", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSR_all,
     * _struct_mon_prot.RSR_main and _struct_mon_prot.RSR_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return StrColumn
     */
    public StrColumn getRSR() {
        return delegate.getColumn("RSR", DelegatingStrColumn::new);
    }

}