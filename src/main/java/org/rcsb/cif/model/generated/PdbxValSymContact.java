package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_VAL_SYM_CONTACT category lists symmetry related
 * contacts amoung non-bonded atoms.
 * 
 * For those contacts not involving hydrogen a limit of
 * 2.2 Angstroms is used. For contacts involving a hydrogen atom
 * a cutoff of 1.6 Angstrom is used.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValSymContact extends BaseCategory {
    public PdbxValSymContact(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValSymContact(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValSymContact(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_val_sym_contact.id must uniquely identify
     * each item in the PDBX_VAL_SYM_CONTACT list.
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
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_1", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_1"));
    }

    /**
     * A component of the identifier for partner 2 of the close
     * contact.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_2", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_2"));
    }

    /**
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 1 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * A component of the identifier for partner 2 of the close
     * contact.
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
     * The symmetry operation applied to the first of the two atoms
     * defining the close contact.
     * 
     * The Symmetry equivalent position is given in
     * the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_1", StrColumn::new) :
                getBinaryColumn("site_symmetry_1"));
    }

    /**
     * The symmetry operation applied to the second of the two atoms
     * defining the close contact.
     * 
     * The Symmetry equivalent position is given in
     * the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_2", StrColumn::new) :
                getBinaryColumn("site_symmetry_2"));
    }

    /**
     * The value of the close contact for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist", FloatColumn::new) :
                getBinaryColumn("dist"));
    }
}
