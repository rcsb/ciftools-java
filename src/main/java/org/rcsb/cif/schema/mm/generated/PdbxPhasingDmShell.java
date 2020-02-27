package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PHASING_DM_SHELL category record details about
 * density modification in resolution shell.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPhasingDmShell extends BaseCategory {
    public PdbxPhasingDmShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingDmShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingDmShell(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_high  identifies high resolution
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_low  identifies low resolution
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_acentric  identifies the figure of merit
     * for acentric data with resolution shells
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_acentric", FloatColumn::new) :
                getBinaryColumn("fom_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_centric  identifies the figure of merit
     * for centric data with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_centric", FloatColumn::new) :
                getBinaryColumn("fom_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom identifies the figure of merit
     * for all the data with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_acentric  identifies the number
     * of acentric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_centric  identifies the number
     * of centric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns  identifies the number
     * of centric and acentric reflections with resolution shells.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_initial  identifies phase difference
     * before density modification with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiInitial() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_initial", FloatColumn::new) :
                getBinaryColumn("delta_phi_initial"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_final  identifies phase difference
     * after density modification with resolution shells.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiFinal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_final", FloatColumn::new) :
                getBinaryColumn("delta_phi_final"));
    }
}
