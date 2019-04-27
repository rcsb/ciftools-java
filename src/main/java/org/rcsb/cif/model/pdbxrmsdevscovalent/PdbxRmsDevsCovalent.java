package org.rcsb.cif.model.pdbxrmsdevscovalent;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRmsDevsCovalent extends BaseCategory {
    public PdbxRmsDevsCovalent(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRmsDevsCovalent(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRmsDevsCovalent(String name) {
        super(name);
    }

    /**
     * Pointer to the entry id.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Total RMS deviation for all bonds in entry relative to small molecule crystal
     * standards.
     * @return RmsBonds
     */
    public RmsBonds getRmsBonds() {
        return (RmsBonds) (isText ? textFields.computeIfAbsent("rms_bonds",
                RmsBonds::new) : getBinaryColumn("rms_bonds"));
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds.
     * @return NumBonds
     */
    public NumBonds getNumBonds() {
        return (NumBonds) (isText ? textFields.computeIfAbsent("num_bonds",
                NumBonds::new) : getBinaryColumn("num_bonds"));
    }

    /**
     * Total RMS deviation for all base bonds in entry relative to small molecule crystal
     * standards.
     * @return RmsBondsBase
     */
    public RmsBondsBase getRmsBondsBase() {
        return (RmsBondsBase) (isText ? textFields.computeIfAbsent("rms_bonds_base",
                RmsBondsBase::new) : getBinaryColumn("rms_bonds_base"));
    }

    /**
     * Total number of base bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_base.
     * @return NumBondsBase
     */
    public NumBondsBase getNumBondsBase() {
        return (NumBondsBase) (isText ? textFields.computeIfAbsent("num_bonds_base",
                NumBondsBase::new) : getBinaryColumn("num_bonds_base"));
    }

    /**
     * Total RMS deviation for all sugar bonds in entry relative to small molecule crystal
     * standards.
     * @return RmsBondsSugar
     */
    public RmsBondsSugar getRmsBondsSugar() {
        return (RmsBondsSugar) (isText ? textFields.computeIfAbsent("rms_bonds_sugar",
                RmsBondsSugar::new) : getBinaryColumn("rms_bonds_sugar"));
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_sugar.
     * @return NumBondsSugar
     */
    public NumBondsSugar getNumBondsSugar() {
        return (NumBondsSugar) (isText ? textFields.computeIfAbsent("num_bonds_sugar",
                NumBondsSugar::new) : getBinaryColumn("num_bonds_sugar"));
    }

    /**
     * Total RMS deviation for all phosphate bonds in entry relative to small molecule crystal
     * standards.
     * @return RmsBondsPhosphate
     */
    public RmsBondsPhosphate getRmsBondsPhosphate() {
        return (RmsBondsPhosphate) (isText ? textFields.computeIfAbsent("rms_bonds_phosphate",
                RmsBondsPhosphate::new) : getBinaryColumn("rms_bonds_phosphate"));
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_phosphate.
     * @return NumBondsPhosphate
     */
    public NumBondsPhosphate getNumBondsPhosphate() {
        return (NumBondsPhosphate) (isText ? textFields.computeIfAbsent("num_bonds_phosphate",
                NumBondsPhosphate::new) : getBinaryColumn("num_bonds_phosphate"));
    }

    /**
     * Total RMS deviation for all angles in entry relative to small molecule crystal
     * standards.
     * @return RmsAngles
     */
    public RmsAngles getRmsAngles() {
        return (RmsAngles) (isText ? textFields.computeIfAbsent("rms_angles",
                RmsAngles::new) : getBinaryColumn("rms_angles"));
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_covalent.rms_angles.
     * @return NumAngles
     */
    public NumAngles getNumAngles() {
        return (NumAngles) (isText ? textFields.computeIfAbsent("num_angles",
                NumAngles::new) : getBinaryColumn("num_angles"));
    }

    /**
     * Total RMS deviation for all base angles in entry relative to small molecule crystal
     * standards.
     * @return RmsAnglesBase
     */
    public RmsAnglesBase getRmsAnglesBase() {
        return (RmsAnglesBase) (isText ? textFields.computeIfAbsent("rms_angles_base",
                RmsAnglesBase::new) : getBinaryColumn("rms_angles_base"));
    }

    /**
     * Total number of base angles in calculation of _pdbx_rms_devs_covalent.rms_angles_base.
     * @return NumAnglesBase
     */
    public NumAnglesBase getNumAnglesBase() {
        return (NumAnglesBase) (isText ? textFields.computeIfAbsent("num_angles_base",
                NumAnglesBase::new) : getBinaryColumn("num_angles_base"));
    }

    /**
     * Total RMS deviation for all sugar angles in entry relative to small molecule crystal
     * standards.
     * @return RmsAnglesSugar
     */
    public RmsAnglesSugar getRmsAnglesSugar() {
        return (RmsAnglesSugar) (isText ? textFields.computeIfAbsent("rms_angles_sugar",
                RmsAnglesSugar::new) : getBinaryColumn("rms_angles_sugar"));
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_sugar.
     * @return NumAnglesSugar
     */
    public NumAnglesSugar getNumAnglesSugar() {
        return (NumAnglesSugar) (isText ? textFields.computeIfAbsent("num_angles_sugar",
                NumAnglesSugar::new) : getBinaryColumn("num_angles_sugar"));
    }

    /**
     * Total RMS deviation for all phosphate angles in entry relative to small molecule crystal
     * standards.
     * @return RmsAnglesPhosphate
     */
    public RmsAnglesPhosphate getRmsAnglesPhosphate() {
        return (RmsAnglesPhosphate) (isText ? textFields.computeIfAbsent("rms_angles_phosphate",
                RmsAnglesPhosphate::new) : getBinaryColumn("rms_angles_phosphate"));
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_phosphate.
     * @return NumAnglesPhosphate
     */
    public NumAnglesPhosphate getNumAnglesPhosphate() {
        return (NumAnglesPhosphate) (isText ? textFields.computeIfAbsent("num_angles_phosphate",
                NumAnglesPhosphate::new) : getBinaryColumn("num_angles_phosphate"));
    }
}
