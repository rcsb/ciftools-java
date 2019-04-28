package org.rcsb.cif.model.generated.pdbxphasingdm;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_phasing_dm.method identifies the method used for
     * density modification
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The value of _pdbx_phasing_dm.mask_type  identifies the type of mask used for
     * density modification
     * @return MaskType
     */
    public MaskType getMaskType() {
        return (MaskType) (isText ? textFields.computeIfAbsent("mask_type",
                MaskType::new) : getBinaryColumn("mask_type"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_acentric  identifies the figure of merit
     * for acentric data
     * @return FomAcentric
     */
    public FomAcentric getFomAcentric() {
        return (FomAcentric) (isText ? textFields.computeIfAbsent("fom_acentric",
                FomAcentric::new) : getBinaryColumn("fom_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom_centric  identifies the figure of merit
     * for acentric data
     * @return FomCentric
     */
    public FomCentric getFomCentric() {
        return (FomCentric) (isText ? textFields.computeIfAbsent("fom_centric",
                FomCentric::new) : getBinaryColumn("fom_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.fom identifies the figure of merit
     * for all the data
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_acentric  identifies the number
     * of acentric reflections.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns_centric  identifies the number
     * of centric reflections.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm.reflns  identifies the number
     * of centric and acentric reflections.
     * @return Reflns
     */
    public Reflns getReflns() {
        return (Reflns) (isText ? textFields.computeIfAbsent("reflns",
                Reflns::new) : getBinaryColumn("reflns"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_initial  identifies phase difference
     * before density modification
     * @return DeltaPhiInitial
     */
    public DeltaPhiInitial getDeltaPhiInitial() {
        return (DeltaPhiInitial) (isText ? textFields.computeIfAbsent("delta_phi_initial",
                DeltaPhiInitial::new) : getBinaryColumn("delta_phi_initial"));
    }

    /**
     * The value of _pdbx_phasing_dm.delta_phi_final  identifies phase difference
     * after density modification
     * @return DeltaPhiFinal
     */
    public DeltaPhiFinal getDeltaPhiFinal() {
        return (DeltaPhiFinal) (isText ? textFields.computeIfAbsent("delta_phi_final",
                DeltaPhiFinal::new) : getBinaryColumn("delta_phi_final"));
    }
}
