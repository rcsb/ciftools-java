package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
 * for nucleic acid covalent geometry relative to small molecule crystal
 * standards.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Total RMS deviation for all bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBonds() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_bonds", FloatColumn::new) :
                getBinaryColumn("rms_bonds"));
    }

    /**
     * Total number of bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds.
     * @return IntColumn
     */
    public IntColumn getNumBonds() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_bonds", IntColumn::new) :
                getBinaryColumn("num_bonds"));
    }

    /**
     * Total RMS deviation for all base bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsBase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_bonds_base", FloatColumn::new) :
                getBinaryColumn("rms_bonds_base"));
    }

    /**
     * Total number of base bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_base.
     * @return IntColumn
     */
    public IntColumn getNumBondsBase() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_bonds_base", IntColumn::new) :
                getBinaryColumn("num_bonds_base"));
    }

    /**
     * Total RMS deviation for all sugar bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsSugar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_bonds_sugar", FloatColumn::new) :
                getBinaryColumn("rms_bonds_sugar"));
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_sugar.
     * @return IntColumn
     */
    public IntColumn getNumBondsSugar() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_bonds_sugar", IntColumn::new) :
                getBinaryColumn("num_bonds_sugar"));
    }

    /**
     * Total RMS deviation for all phosphate bonds in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsBondsPhosphate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_bonds_phosphate", FloatColumn::new) :
                getBinaryColumn("rms_bonds_phosphate"));
    }

    /**
     * Total number of sugar bonds in calculation of _pdbx_rms_devs_covalent.rms_bonds_phosphate.
     * @return IntColumn
     */
    public IntColumn getNumBondsPhosphate() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_bonds_phosphate", IntColumn::new) :
                getBinaryColumn("num_bonds_phosphate"));
    }

    /**
     * Total RMS deviation for all angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAngles() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_angles", FloatColumn::new) :
                getBinaryColumn("rms_angles"));
    }

    /**
     * Total number of angles in calculation of _pdbx_rms_devs_covalent.rms_angles.
     * @return IntColumn
     */
    public IntColumn getNumAngles() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_angles", IntColumn::new) :
                getBinaryColumn("num_angles"));
    }

    /**
     * Total RMS deviation for all base angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesBase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_angles_base", FloatColumn::new) :
                getBinaryColumn("rms_angles_base"));
    }

    /**
     * Total number of base angles in calculation of _pdbx_rms_devs_covalent.rms_angles_base.
     * @return IntColumn
     */
    public IntColumn getNumAnglesBase() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_angles_base", IntColumn::new) :
                getBinaryColumn("num_angles_base"));
    }

    /**
     * Total RMS deviation for all sugar angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesSugar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_angles_sugar", FloatColumn::new) :
                getBinaryColumn("rms_angles_sugar"));
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_sugar.
     * @return IntColumn
     */
    public IntColumn getNumAnglesSugar() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_angles_sugar", IntColumn::new) :
                getBinaryColumn("num_angles_sugar"));
    }

    /**
     * Total RMS deviation for all phosphate angles in entry relative to small molecule crystal
     * standards.
     * @return FloatColumn
     */
    public FloatColumn getRmsAnglesPhosphate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_angles_phosphate", FloatColumn::new) :
                getBinaryColumn("rms_angles_phosphate"));
    }

    /**
     * Total number of sugar angles in calculation of _pdbx_rms_devs_covalent.rms_angles_phosphate.
     * @return IntColumn
     */
    public IntColumn getNumAnglesPhosphate() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_angles_phosphate", IntColumn::new) :
                getBinaryColumn("num_angles_phosphate"));
    }
}
