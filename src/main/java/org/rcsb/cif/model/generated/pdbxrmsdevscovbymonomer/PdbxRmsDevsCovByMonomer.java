package org.rcsb.cif.model.generated.pdbxrmsdevscovbymonomer;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRmsDevsCovByMonomer extends BaseCategory {
    public PdbxRmsDevsCovByMonomer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRmsDevsCovByMonomer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRmsDevsCovByMonomer(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_rms_devs_cov_by_monomer.id must uniquely identify
     * each item in the PDBX_RMS_DEVS_COV_BY_MONOMER list.
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * RMS deviation for all bonds in this monomer relative to small molecule crystal
     * standards.
     * @return RmsBonds
     */
    public RmsBonds getRmsBonds() {
        return (RmsBonds) (isText ? textFields.computeIfAbsent("rms_bonds",
                RmsBonds::new) : getBinaryColumn("rms_bonds"));
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_cov_by_monomer.rms_bonds.
     * @return NumBonds
     */
    public NumBonds getNumBonds() {
        return (NumBonds) (isText ? textFields.computeIfAbsent("num_bonds",
                NumBonds::new) : getBinaryColumn("num_bonds"));
    }

    /**
     * RMS deviation for all angles in this monomer relative to small molecule crystal
     * standards.
     * @return RmsAngles
     */
    public RmsAngles getRmsAngles() {
        return (RmsAngles) (isText ? textFields.computeIfAbsent("rms_angles",
                RmsAngles::new) : getBinaryColumn("rms_angles"));
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_cov_by_monomer.rms_angles.
     * @return NumAngles
     */
    public NumAngles getNumAngles() {
        return (NumAngles) (isText ? textFields.computeIfAbsent("num_angles",
                NumAngles::new) : getBinaryColumn("num_angles"));
    }
}
