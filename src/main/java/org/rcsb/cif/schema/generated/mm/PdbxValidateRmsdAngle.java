package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
 * the covalent bond angles found in an entry that have
 * values which deviate from expected values by more
 * than 6*rmsd for the particular entry from the expected standard
 * value
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValidateRmsdAngle extends DelegatingCategory {
    public PdbxValidateRmsdAngle(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_validate_rmsd_angle.id must uniquely identify
     * each item in the PDBX_VALIDATE_RMSD_ANGLE list.
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
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
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
        return delegate.getColumn("auth_asym_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_atom_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_comp_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return delegate.getColumn("auth_asym_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_comp_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_atom_id_3", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_asym_id_3", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_comp_id_3", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id_3", DelegatingStrColumn::new);
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
        return delegate.getColumn("PDB_ins_code_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("PDB_ins_code_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("PDB_ins_code_3", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_alt_id_1", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_alt_id_2", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_alt_id_3", DelegatingStrColumn::new);
    }

    /**
     * Value of the deviation (in degrees)  from 6*REBI for the angle bounded
     * by the three sites from the expected dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getAngleDeviation() {
        return delegate.getColumn("angle_deviation", DelegatingFloatColumn::new);
    }

    /**
     * The value of the bond angle
     * @return FloatColumn
     */
    public FloatColumn getAngleValue() {
        return delegate.getColumn("angle_value", DelegatingFloatColumn::new);
    }

    /**
     * The target value of the bond angle
     * @return FloatColumn
     */
    public FloatColumn getAngleTargetValue() {
        return delegate.getColumn("angle_target_value", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the target value of the bond angle expressed as a standard deviation.
     * @return FloatColumn
     */
    public FloatColumn getAngleStandardDeviation() {
        return delegate.getColumn("angle_standard_deviation", DelegatingFloatColumn::new);
    }

    /**
     * A flag to indicate if the angle is between two residues
     * @return StrColumn
     */
    public StrColumn getLinkerFlag() {
        return delegate.getColumn("linker_flag", DelegatingStrColumn::new);
    }
}
