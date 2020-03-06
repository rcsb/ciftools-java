package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
 * for nucleic acid covalent geometry relative to small molecule crystal
 * standards.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRmsDevsCovalent extends DelegatingCategory {
    public PdbxRmsDevsCovalent(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "rms_bonds":
                return getRmsBonds();
            case "num_bonds":
                return getNumBonds();
            case "rms_bonds_base":
                return getRmsBondsBase();
            case "num_bonds_base":
                return getNumBondsBase();
            case "rms_bonds_sugar":
                return getRmsBondsSugar();
            case "num_bonds_sugar":
                return getNumBondsSugar();
            case "rms_bonds_phosphate":
                return getRmsBondsPhosphate();
            case "num_bonds_phosphate":
                return getNumBondsPhosphate();
            case "rms_angles":
                return getRmsAngles();
            case "num_angles":
                return getNumAngles();
            case "rms_angles_base":
                return getRmsAnglesBase();
            case "num_angles_base":
                return getNumAnglesBase();
            case "rms_angles_sugar":
                return getRmsAnglesSugar();
            case "num_angles_sugar":
                return getNumAnglesSugar();
            case "rms_angles_phosphate":
                return getRmsAnglesPhosphate();
            case "num_angles_phosphate":
                return getNumAnglesPhosphate();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to the entry id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Total RMS deviation for all bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBonds() {
        return delegate.getColumn("rms_bonds", DelegatingFloatColumn::new);
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds.
     * @return IntColumn
     */
    public IntColumn getNumBonds() {
        return delegate.getColumn("num_bonds", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all base bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsBase() {
        return delegate.getColumn("rms_bonds_base", DelegatingFloatColumn::new);
    }

    /**
     * Total number of base bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_base.
     * @return IntColumn
     */
    public IntColumn getNumBondsBase() {
        return delegate.getColumn("num_bonds_base", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all sugar bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsSugar() {
        return delegate.getColumn("rms_bonds_sugar", DelegatingFloatColumn::new);
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_sugar.
     * @return IntColumn
     */
    public IntColumn getNumBondsSugar() {
        return delegate.getColumn("num_bonds_sugar", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all phosphate bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsPhosphate() {
        return delegate.getColumn("rms_bonds_phosphate", DelegatingFloatColumn::new);
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_phosphate.
     * @return IntColumn
     */
    public IntColumn getNumBondsPhosphate() {
        return delegate.getColumn("num_bonds_phosphate", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAngles() {
        return delegate.getColumn("rms_angles", DelegatingFloatColumn::new);
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_covalent.rms_angles.
     * @return IntColumn
     */
    public IntColumn getNumAngles() {
        return delegate.getColumn("num_angles", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all base angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesBase() {
        return delegate.getColumn("rms_angles_base", DelegatingFloatColumn::new);
    }

    /**
     * Total number of base angles in calculation of _pdbx_rms_devs_covalent.rms_angles_base.
     * @return IntColumn
     */
    public IntColumn getNumAnglesBase() {
        return delegate.getColumn("num_angles_base", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all sugar angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesSugar() {
        return delegate.getColumn("rms_angles_sugar", DelegatingFloatColumn::new);
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_sugar.
     * @return IntColumn
     */
    public IntColumn getNumAnglesSugar() {
        return delegate.getColumn("num_angles_sugar", DelegatingIntColumn::new);
    }

    /**
     * Total RMS deviation for all phosphate angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesPhosphate() {
        return delegate.getColumn("rms_angles_phosphate", DelegatingFloatColumn::new);
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_phosphate.
     * @return IntColumn
     */
    public IntColumn getNumAnglesPhosphate() {
        return delegate.getColumn("num_angles_phosphate", DelegatingIntColumn::new);
    }

}