package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_RMSD_BOND category list the
 * covalent bonds that have values which deviate from expected
 * values by more than 6*rmsd.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValidateRmsdBond extends BaseCategory {
    public PdbxValidateRmsdBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateRmsdBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateRmsdBond(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_rmsd_bond.id must uniquely identify
     * each item in the PDBX_VALIDATE_RMSD_BOND list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given bond
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the covalent bond.
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
     * Part of the identifier of the first of the two atom sites that
     * define the covalent bond.
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
     * Part of the identifier of the first of the two atom sites that
     * define the covalent bond.
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
     * Part of the identifier of the first of the two atom sites that
     * define the covalent bond.
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
     * Part of the identifier of the second of the two atom sites
     * that define the covalent bond.
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
     * Part of the identifier of the second of the two atom sites
     * that define the covalent bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the covalent bond.
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
     * Part of the identifier of the second of the two atom sites
     * that define the covalent bond.
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
     * Optional identifier of the first of the two atom sites that
     * define the covalent bond.
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
     * Optional identifier of the second of the two atom sites that
     * define the covalent bond.
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
     * An optional identifier of the first of the two atoms that
     * define the covalent bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * An optional identifier of the second of the two atoms that
     * define the covalent bond.
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
     * The value of the deviation from ideal for the defined covalent
     * bond for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getBondDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_deviation", FloatColumn::new) :
                getBinaryColumn("bond_deviation"));
    }

    /**
     * The value of the bond length
     * @return FloatColumn
     */
    public FloatColumn getBondValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_value", FloatColumn::new) :
                getBinaryColumn("bond_value"));
    }

    /**
     * The target value of the bond length
     * @return FloatColumn
     */
    public FloatColumn getBondTargetValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_target_value", FloatColumn::new) :
                getBinaryColumn("bond_target_value"));
    }

    /**
     * The uncertaintiy in target value of the bond length expressed as a standard deviation.
     * @return FloatColumn
     */
    public FloatColumn getBondStandardDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_standard_deviation", FloatColumn::new) :
                getBinaryColumn("bond_standard_deviation"));
    }

    /**
     * A flag to indicate if the bond is between two residues
     * @return StrColumn
     */
    public StrColumn getLinkerFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linker_flag", StrColumn::new) :
                getBinaryColumn("linker_flag"));
    }
}
