package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_PHASING_DM_SHELL category record details about
 * density modification in resolution shell.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPhasingDmShell extends DelegatingCategory {
    public PdbxPhasingDmShell(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_high  identifies high resolution
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_low  identifies low resolution
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_acentric  identifies the figure of merit
     * for acentric data with resolution shells
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return delegate.getColumn("fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_centric  identifies the figure of merit
     * for centric data with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return delegate.getColumn("fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom identifies the figure of merit
     * for all the data with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return delegate.getColumn("fom", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_acentric  identifies the number
     * of acentric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_centric  identifies the number
     * of centric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns  identifies the number
     * of centric and acentric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return delegate.getColumn("reflns", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_initial  identifies phase difference
     * before density modification with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiInitial() {
        return delegate.getColumn("delta_phi_initial", DelegatingFloatColumn::new);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_final  identifies phase difference
     * after density modification with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiFinal() {
        return delegate.getColumn("delta_phi_final", DelegatingFloatColumn::new);
    }
}
