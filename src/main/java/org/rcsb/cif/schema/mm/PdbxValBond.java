package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_VAL_BOND category lists the covalent bond angles
 * in this entry deviating by greater than 6*sigma from
 * standard values.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValBond extends DelegatingCategory {
    public PdbxValBond(Category delegate) {
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
            case "bond":
                return getBond();
            case "bond_deviation":
                return getBondDeviation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_val_bond.id must uniquely identify
     * each item in the PDBX_VAL_BOND list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given bond
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return delegate.getColumn("auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return delegate.getColumn("auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return delegate.getColumn("auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * identifier of the first of the two atom sites that
     * define the covalent bond.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return delegate.getColumn("auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return delegate.getColumn("auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return delegate.getColumn("auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return delegate.getColumn("auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * identifier of the second of the two atom sites
     * that define the covalent bond.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return delegate.getColumn("auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the first of the two atom sites that
     * define the covalent bond.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId1() {
        return delegate.getColumn("auth_PDB_insert_id_1", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the second of the two atom sites that
     * define the covalent bond.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId2() {
        return delegate.getColumn("auth_PDB_insert_id_2", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the bond
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return delegate.getColumn("label_alt_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_asym_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_comp_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the bond
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return delegate.getColumn("label_alt_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_asym_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_atom_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_comp_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The value of the bond distance deviating by more than
     * 6*RMSD from the standard dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getBond() {
        return delegate.getColumn("bond", DelegatingFloatColumn::new);
    }

    /**
     * The value of the deviation from ideal
     * for the defined covalent bond for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getBondDeviation() {
        return delegate.getColumn("bond_deviation", DelegatingFloatColumn::new);
    }

}