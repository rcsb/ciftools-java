package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
 * of base pair step interactions.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class NdbStructNaBasePairStep extends DelegatingCategory {
    public NdbStructNaBasePairStep(Category delegate) {
        super(delegate);
    }

    /**
     * 
     * Describes the model number of the the base pair step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getModelNumber() {
        return delegate.getColumn("model_number", DelegatingIntColumn::new);
    }

    /**
     * 
     * The sequence number of this step in the step sequence.
     * @return IntColumn
     */
    public IntColumn getStepNumber() {
        return delegate.getColumn("step_number", DelegatingIntColumn::new);
    }

    /**
     * 
     * The text name of this step.
     * @return StrColumn
     */
    public StrColumn getStepName() {
        return delegate.getColumn("step_name", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the asym id of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelAsymId1() {
        return delegate.getColumn("i_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the component id of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelCompId1() {
        return delegate.getColumn("i_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getILabelSeqId1() {
        return delegate.getColumn("i_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the first base pair of the step.
     * @return StrColumn
     */
    public StrColumn getISymmetry1() {
        return delegate.getColumn("i_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the asym id of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelAsymId1() {
        return delegate.getColumn("j_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the component id of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelCompId1() {
        return delegate.getColumn("j_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getJLabelSeqId1() {
        return delegate.getColumn("j_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the first base pair of the step.
     * @return StrColumn
     */
    public StrColumn getJSymmetry1() {
        return delegate.getColumn("j_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the asym id of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelAsymId2() {
        return delegate.getColumn("i_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the component id of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelCompId2() {
        return delegate.getColumn("i_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getILabelSeqId2() {
        return delegate.getColumn("i_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the second base pair of the step.
     * @return StrColumn
     */
    public StrColumn getISymmetry2() {
        return delegate.getColumn("i_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the asym id of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelAsymId2() {
        return delegate.getColumn("j_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the component id of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelCompId2() {
        return delegate.getColumn("j_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getJLabelSeqId2() {
        return delegate.getColumn("j_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the second base pair of the step.
     * @return StrColumn
     */
    public StrColumn getJSymmetry2() {
        return delegate.getColumn("j_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's asym id of the i-th base in the first
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthAsymId1() {
        return delegate.getColumn("i_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's sequence number of the i-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthSeqId1() {
        return delegate.getColumn("i_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIPDBInsCode1() {
        return delegate.getColumn("i_PDB_ins_code_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's asym id of the j-th base in the first
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthAsymId1() {
        return delegate.getColumn("j_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's sequence number of the j-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthSeqId1() {
        return delegate.getColumn("j_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJPDBInsCode1() {
        return delegate.getColumn("j_PDB_ins_code_1", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's asym id of the i-th base in the second
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthAsymId2() {
        return delegate.getColumn("i_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's sequence number of the i-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthSeqId2() {
        return delegate.getColumn("i_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIPDBInsCode2() {
        return delegate.getColumn("i_PDB_ins_code_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's asym id of the j-th base in the second
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthAsymId2() {
        return delegate.getColumn("j_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the author's sequence number of the j-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthSeqId2() {
        return delegate.getColumn("j_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJPDBInsCode2() {
        return delegate.getColumn("j_PDB_ins_code_2", DelegatingStrColumn::new);
    }

    /**
     * 
     * The value of the base pair step shift parameter.
     * @return FloatColumn
     */
    public FloatColumn getShift() {
        return delegate.getColumn("shift", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step slide parameter.
     * @return FloatColumn
     */
    public FloatColumn getSlide() {
        return delegate.getColumn("slide", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step rise parameter.
     * @return FloatColumn
     */
    public FloatColumn getRise() {
        return delegate.getColumn("rise", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step tilt parameter.
     * @return FloatColumn
     */
    public FloatColumn getTilt() {
        return delegate.getColumn("tilt", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step roll parameter.
     * @return FloatColumn
     */
    public FloatColumn getRoll() {
        return delegate.getColumn("roll", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getTwist() {
        return delegate.getColumn("twist", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step X displacement parameter.
     * @return FloatColumn
     */
    public FloatColumn getXDisplacement() {
        return delegate.getColumn("x_displacement", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step Y displacement parameter.
     * @return FloatColumn
     */
    public FloatColumn getYDisplacement() {
        return delegate.getColumn("y_displacement", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step helical rise parameter.
     * @return FloatColumn
     */
    public FloatColumn getHelicalRise() {
        return delegate.getColumn("helical_rise", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step inclination parameter.
     * @return FloatColumn
     */
    public FloatColumn getInclination() {
        return delegate.getColumn("inclination", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getTip() {
        return delegate.getColumn("tip", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair step helical twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getHelicalTwist() {
        return delegate.getColumn("helical_twist", DelegatingFloatColumn::new);
    }
}
