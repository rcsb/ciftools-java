package org.rcsb.cif.schema.generated.mm;

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
