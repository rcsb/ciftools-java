package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_VAL_ANGLE category lists the covalent bond angles
 * in this entry deviating by greater than 6*sigma from
 * standard values.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValAngle extends DelegatingCategory {
    public PdbxValAngle(Category delegate) {
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
            case "auth_atom_id_3":
                return getAuthAtomId3();
            case "auth_asym_id_3":
                return getAuthAsymId3();
            case "auth_comp_id_3":
                return getAuthCompId3();
            case "auth_seq_id_3":
                return getAuthSeqId3();
            case "auth_PDB_insert_id_1":
                return getAuthPDBInsertId1();
            case "auth_PDB_insert_id_2":
                return getAuthPDBInsertId2();
            case "auth_PDB_insert_id_3":
                return getAuthPDBInsertId3();
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
            case "label_alt_id_3":
                return getLabelAltId3();
            case "label_asym_id_3":
                return getLabelAsymId3();
            case "label_atom_id_3":
                return getLabelAtomId3();
            case "label_comp_id_3":
                return getLabelCompId3();
            case "label_seq_id_3":
                return getLabelSeqId3();
            case "angle":
                return getAngle();
            case "angle_deviation":
                return getAngleDeviation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_val_angle.id must uniquely identify
     * each item in the PDBX_VAL_ANGLE list.
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
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return delegate.getColumn("auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return delegate.getColumn("auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return delegate.getColumn("auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return delegate.getColumn("auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return delegate.getColumn("auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return delegate.getColumn("auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return delegate.getColumn("auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return delegate.getColumn("auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId3() {
        return delegate.getColumn("auth_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId3() {
        return delegate.getColumn("auth_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId3() {
        return delegate.getColumn("auth_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId3() {
        return delegate.getColumn("auth_seq_id_3", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the first of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId1() {
        return delegate.getColumn("auth_PDB_insert_id_1", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the second of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId2() {
        return delegate.getColumn("auth_PDB_insert_id_2", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the third of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId3() {
        return delegate.getColumn("auth_PDB_insert_id_3", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return delegate.getColumn("label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the angle
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
     * A component of the identifier for partner 1 of the angle
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
     * A component of the identifier for partner 1 of the angle
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
     * A component of the identifier for partner 1 of the angle
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
     * A component of the identifier for partner 2 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return delegate.getColumn("label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 2 of the angle
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
     * A component of the identifier for partner 2 of the angle
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
     * A component of the identifier for partner 2 of the angle
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
     * A component of the identifier for partner 2 of the angle
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
     * A component of the identifier for partner 3 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId3() {
        return delegate.getColumn("label_alt_id_3", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId3() {
        return delegate.getColumn("label_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId3() {
        return delegate.getColumn("label_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId3() {
        return delegate.getColumn("label_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId3() {
        return delegate.getColumn("label_seq_id_3", DelegatingIntColumn::new);
    }

    /**
     * Value of the angle deviating by more than 6*RMSD from
     * the expected dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return delegate.getColumn("angle", DelegatingFloatColumn::new);
    }

    /**
     * Value of the deviation (in degrees)  from 6*RMSD for
     * the angle bounded by the three sites from the expected
     * dictionary value
     * @return FloatColumn
     */
    public FloatColumn getAngleDeviation() {
        return delegate.getColumn("angle_deviation", DelegatingFloatColumn::new);
    }

}