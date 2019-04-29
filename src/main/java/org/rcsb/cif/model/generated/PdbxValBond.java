package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_VAL_BOND category lists the covalent bond angles
 * in this entry deviating by greater than 6*sigma from
 * standard values.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValBond extends BaseCategory {
    public PdbxValBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValBond(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_val_bond.id must uniquely identify
     * each item in the PDBX_VAL_BOND list.
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
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("auth_atom_id_1"));
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("auth_atom_id_2"));
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
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
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_1", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_1"));
    }

    /**
     * Optional identifier of the second of the two atom sites that
     * define the covalent bond.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_2", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_2"));
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id_1", StrColumn::new) :
                getBinaryColumn("label_asym_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_1", StrColumn::new) :
                getBinaryColumn("label_atom_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id_1", StrColumn::new) :
                getBinaryColumn("label_comp_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id_1", IntColumn::new) :
                getBinaryColumn("label_seq_id_1"));
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_2", StrColumn::new) :
                getBinaryColumn("label_alt_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id_2", StrColumn::new) :
                getBinaryColumn("label_asym_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_2", StrColumn::new) :
                getBinaryColumn("label_atom_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id_2", StrColumn::new) :
                getBinaryColumn("label_comp_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id_2", IntColumn::new) :
                getBinaryColumn("label_seq_id_2"));
    }

    /**
     * The value of the bond distance deviating by more than
     * 6*RMSD from the standard dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getBond() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond", FloatColumn::new) :
                getBinaryColumn("bond"));
    }

    /**
     * The value of the deviation from ideal
     * for the defined covalent bond for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getBondDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_deviation", FloatColumn::new) :
                getBinaryColumn("bond_deviation"));
    }
}
