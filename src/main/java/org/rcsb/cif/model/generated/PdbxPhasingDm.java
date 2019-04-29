package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PHASING_DM category record details about
 * density modification
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPhasingDm extends BaseCategory {
    public PdbxPhasingDm(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingDm(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingDm(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_phasing_dm.entry_id identifies the data block.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_phasing_dm.method identifies the method used for
     * density modification
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The value of _pdbx_phasing_dm.mask_type  identifies the type of mask used for
     * density modification
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMaskType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mask_type", SingleRowStrColumn::new) :
                getBinaryColumn("mask_type"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_acentric  identifies the figure of merit
     * for acentric data
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFomAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fom_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("fom_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_centric  identifies the figure of merit
     * for acentric data
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFomCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fom_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("fom_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom identifies the figure of merit
     * for all the data
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFom() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fom", SingleRowFloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_acentric  identifies the number
     * of acentric reflections.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflnsAcentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", SingleRowIntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_centric  identifies the number
     * of centric reflections.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflnsCentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", SingleRowIntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns  identifies the number
     * of centric and acentric reflections.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflns() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns", SingleRowIntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_initial  identifies phase difference
     * before density modification
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDeltaPhiInitial() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_initial", SingleRowFloatColumn::new) :
                getBinaryColumn("delta_phi_initial"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_final  identifies phase difference
     * after density modification
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDeltaPhiFinal() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_final", SingleRowFloatColumn::new) :
                getBinaryColumn("delta_phi_final"));
    }
}
