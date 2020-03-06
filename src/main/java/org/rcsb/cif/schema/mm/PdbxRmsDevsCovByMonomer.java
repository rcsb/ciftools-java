package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
 * covalent geometry for each momoner relative to small molecule crystal
 * standards.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRmsDevsCovByMonomer extends DelegatingCategory {
    public PdbxRmsDevsCovByMonomer(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model_id":
                return getModelId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "label_seq_id":
                return getLabelSeqId();
            case "rms_bonds":
                return getRmsBonds();
            case "num_bonds":
                return getNumBonds();
            case "rms_angles":
                return getRmsAngles();
            case "num_angles":
                return getNumAngles();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_rms_devs_cov_by_monomer.id must uniquely identify
     * each item in the PDBX_RMS_DEVS_COV_BY_MONOMER list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * RMS deviation for all bonds in this monomer relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBonds() {
        return delegate.getColumn("rms_bonds", DelegatingFloatColumn::new);
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_cov_by_monomer.rms_bonds.
     * @return IntColumn
     */
    public IntColumn getNumBonds() {
        return delegate.getColumn("num_bonds", DelegatingIntColumn::new);
    }

    /**
     * RMS deviation for all angles in this monomer relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAngles() {
        return delegate.getColumn("rms_angles", DelegatingFloatColumn::new);
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_cov_by_monomer.rms_angles.
     * @return IntColumn
     */
    public IntColumn getNumAngles() {
        return delegate.getColumn("num_angles", DelegatingIntColumn::new);
    }

}