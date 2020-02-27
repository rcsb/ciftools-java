package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PHASING_DM category record details about
 * density modification
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_phasing_dm.method identifies the method used for
     * density modification
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The value of _pdbx_phasing_dm.mask_type  identifies the type of mask used for
     * density modification
     * @return StrColumn
     */
    public StrColumn getMaskType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mask_type", StrColumn::new) :
                getBinaryColumn("mask_type"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_acentric  identifies the figure of merit
     * for acentric data
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_acentric", FloatColumn::new) :
                getBinaryColumn("fom_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_centric  identifies the figure of merit
     * for acentric data
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_centric", FloatColumn::new) :
                getBinaryColumn("fom_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom identifies the figure of merit
     * for all the data
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_acentric  identifies the number
     * of acentric reflections.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_centric  identifies the number
     * of centric reflections.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns  identifies the number
     * of centric and acentric reflections.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_initial  identifies phase difference
     * before density modification
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiInitial() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_initial", FloatColumn::new) :
                getBinaryColumn("delta_phi_initial"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_final  identifies phase difference
     * after density modification
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiFinal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_final", FloatColumn::new) :
                getBinaryColumn("delta_phi_final"));
    }
}
