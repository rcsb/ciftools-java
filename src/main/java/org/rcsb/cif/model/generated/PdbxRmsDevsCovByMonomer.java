package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
 * covalent geometry for each momoner relative to small molecule crystal
 * standards.
 */
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
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * RMS deviation for all bonds in this monomer relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBonds() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_bonds", FloatColumn::new) :
                getBinaryColumn("rms_bonds"));
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_cov_by_monomer.rms_bonds.
     * @return IntColumn
     */
    public IntColumn getNumBonds() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_bonds", IntColumn::new) :
                getBinaryColumn("num_bonds"));
    }

    /**
     * RMS deviation for all angles in this monomer relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAngles() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_angles", FloatColumn::new) :
                getBinaryColumn("rms_angles"));
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_cov_by_monomer.rms_angles.
     * @return IntColumn
     */
    public IntColumn getNumAngles() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_angles", IntColumn::new) :
                getBinaryColumn("num_angles"));
    }
}
