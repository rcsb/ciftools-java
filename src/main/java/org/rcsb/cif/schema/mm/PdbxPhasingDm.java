package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_PHASING_DM category record details about
 * density modification
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPhasingDm extends DelegatingCategory {
    public PdbxPhasingDm(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            case "mask_type":
                return getMaskType();
            case "fom_acentric":
                return getFomAcentric();
            case "fom_centric":
                return getFomCentric();
            case "fom":
                return getFom();
            case "reflns_acentric":
                return getReflnsAcentric();
            case "reflns_centric":
                return getReflnsCentric();
            case "reflns":
                return getReflns();
            case "delta_phi_initial":
                return getDeltaPhiInitial();
            case "delta_phi_final":
                return getDeltaPhiFinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_phasing_dm.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.method identifies the method used for
     * density modification
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.mask_type  identifies the type of mask used for
     * density modification
     * @return StrColumn
     */
    public StrColumn getMaskType() {
        return delegate.getColumn("mask_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.fom_acentric  identifies the figure of merit
     * for acentric data
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return delegate.getColumn("fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.fom_centric  identifies the figure of merit
     * for acentric data
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return delegate.getColumn("fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.fom identifies the figure of merit
     * for all the data
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_acentric  identifies the number
     * of acentric reflections.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_centric  identifies the number
     * of centric reflections.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.reflns  identifies the number
     * of centric and acentric reflections.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return delegate.getColumn("reflns", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_initial  identifies phase difference
     * before density modification
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiInitial() {
        return delegate.getColumn("delta_phi_initial", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_final  identifies phase difference
     * after density modification
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiFinal() {
        return delegate.getColumn("delta_phi_final", DelegatingFloatColumn::new);
    }

}