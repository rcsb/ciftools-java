package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_VAL_SYM_CONTACT category lists symmetry related
 * contacts amoung non-bonded atoms.
 * 
 * For those contacts not involving hydrogen a limit of
 * 2.2 angstroms is used. For contacts involving a hydrogen atom
 * a cutoff of 1.6 angstroms is used.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValSymContact extends DelegatingCategory {
    public PdbxValSymContact(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model_id":
                return getModelId();
            case "auth_asym_id_1":
                return getAuthAsymId1();
            case "auth_atom_id_1":
                return getAuthAtomId1();
            case "auth_comp_id_1":
                return getAuthCompId1();
            case "auth_seq_id_1":
                return getAuthSeqId1();
            case "auth_atom_id_2":
                return getAuthAtomId2();
            case "auth_asym_id_2":
                return getAuthAsymId2();
            case "auth_comp_id_2":
                return getAuthCompId2();
            case "auth_seq_id_2":
                return getAuthSeqId2();
            case "auth_PDB_insert_id_1":
                return getAuthPDBInsertId1();
            case "auth_PDB_insert_id_2":
                return getAuthPDBInsertId2();
            case "label_alt_id_1":
                return getLabelAltId1();
            case "label_asym_id_1":
                return getLabelAsymId1();
            case "label_atom_id_1":
                return getLabelAtomId1();
            case "label_comp_id_1":
                return getLabelCompId1();
            case "label_seq_id_1":
                return getLabelSeqId1();
            case "label_alt_id_2":
                return getLabelAltId2();
            case "label_asym_id_2":
                return getLabelAsymId2();
            case "label_atom_id_2":
                return getLabelAtomId2();
            case "label_comp_id_2":
                return getLabelCompId2();
            case "label_seq_id_2":
                return getLabelSeqId2();
            case "site_symmetry_1":
                return getSiteSymmetry1();
            case "site_symmetry_2":
                return getSiteSymmetry2();
            case "dist":
                return getDist();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_val_sym_contact.id must uniquely identify
     * each item in the PDBX_VAL_SYM_CONTACT list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("auth_asym_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_comp_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_atom_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_asym_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_comp_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_PDB_insert_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_PDB_insert_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_alt_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_asym_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_comp_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_seq_id_1", DelegatingIntColumn::new);
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
        return delegate.getColumn("label_alt_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_asym_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_atom_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_comp_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_seq_id_2", DelegatingIntColumn::new);
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
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * The value of the close contact for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return delegate.getColumn("dist", DelegatingFloatColumn::new);
    }

}