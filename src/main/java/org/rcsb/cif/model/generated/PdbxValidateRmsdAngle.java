package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
 * the covalent bond angles found in an entry that have
 * values which deviate from expected values by more
 * than 6*rmsd for the particular entry from the expected standard
 * value
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValidateRmsdAngle extends BaseCategory {
    public PdbxValidateRmsdAngle(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateRmsdAngle(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateRmsdAngle(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_rmsd_angle.id must uniquely identify
     * each item in the PDBX_VALIDATE_RMSD_ANGLE list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the first of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * Part of the identifier of the first of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("auth_atom_id_1"));
    }

    /**
     * Part of the identifier of the first of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * Part of the identifier of the first of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * Part of the identifier of the second of the three atom sites
     * that define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("auth_atom_id_2"));
    }

    /**
     * identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Part of the identifier of the second of the three atom sites
     * that define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * Part of the identifier of the second of the three atom sites
     * that define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("auth_seq_id_2"));
    }

    /**
     * Part of the identifier of the third of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_3", StrColumn::new) :
                getBinaryColumn("auth_atom_id_3"));
    }

    /**
     * Part of the identifier of the third of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_3", StrColumn::new) :
                getBinaryColumn("auth_asym_id_3"));
    }

    /**
     * Part of the identifier of the third of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_3", StrColumn::new) :
                getBinaryColumn("auth_comp_id_3"));
    }

    /**
     * Part of the identifier of the third of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_3", StrColumn::new) :
                getBinaryColumn("auth_seq_id_3"));
    }

    /**
     * Optional identifier of the first of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_1"));
    }

    /**
     * Optional identifier of the second of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_2"));
    }

    /**
     * Optional identifier of the third of the three atom sites that
     * define the angle.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_3", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_3"));
    }

    /**
     * An optional identifier of the first of the three atoms that
     * define the covalent angle.
     * 
     * This data item is a pointer to _atom_site.label_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * An optional identifier of the second of the three atoms that
     * define the covalent angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_2", StrColumn::new) :
                getBinaryColumn("label_alt_id_2"));
    }

    /**
     * An optional identifier of the third of the three atoms that
     * define the covalent angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_3", StrColumn::new) :
                getBinaryColumn("label_alt_id_3"));
    }

    /**
     * Value of the deviation (in degrees)  from 6*REBI for the angle bounded
     * by the three sites from the expected dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getAngleDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_deviation", FloatColumn::new) :
                getBinaryColumn("angle_deviation"));
    }

    /**
     * The value of the bond angle
     * @return FloatColumn
     */
    public FloatColumn getAngleValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_value", FloatColumn::new) :
                getBinaryColumn("angle_value"));
    }

    /**
     * The target value of the bond angle
     * @return FloatColumn
     */
    public FloatColumn getAngleTargetValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_target_value", FloatColumn::new) :
                getBinaryColumn("angle_target_value"));
    }

    /**
     * The uncertainty in the target value of the bond angle expressed as a standard deviation.
     * @return FloatColumn
     */
    public FloatColumn getAngleStandardDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_standard_deviation", FloatColumn::new) :
                getBinaryColumn("angle_standard_deviation"));
    }

    /**
     * A flag to indicate if the angle is between two residues
     * @return StrColumn
     */
    public StrColumn getLinkerFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linker_flag", StrColumn::new) :
                getBinaryColumn("linker_flag"));
    }
}
