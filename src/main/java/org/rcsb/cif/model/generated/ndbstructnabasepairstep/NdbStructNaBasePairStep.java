package org.rcsb.cif.model.generated.ndbstructnabasepairstep;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NdbStructNaBasePairStep extends BaseCategory {
    public NdbStructNaBasePairStep(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public NdbStructNaBasePairStep(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public NdbStructNaBasePairStep(String name) {
        super(name);
    }

    /**
     * 
     * Describes the model number of the the base pair step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return ModelNumber
     */
    public ModelNumber getModelNumber() {
        return (ModelNumber) (isText ? textFields.computeIfAbsent("model_number",
                ModelNumber::new) : getBinaryColumn("model_number"));
    }

    /**
     * 
     * The sequence number of this step in the step sequence.
     * @return StepNumber
     */
    public StepNumber getStepNumber() {
        return (StepNumber) (isText ? textFields.computeIfAbsent("step_number",
                StepNumber::new) : getBinaryColumn("step_number"));
    }

    /**
     * 
     * The text name of this step.
     * @return StepName
     */
    public StepName getStepName() {
        return (StepName) (isText ? textFields.computeIfAbsent("step_name",
                StepName::new) : getBinaryColumn("step_name"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return ILabelAsymId1
     */
    public ILabelAsymId1 getILabelAsymId1() {
        return (ILabelAsymId1) (isText ? textFields.computeIfAbsent("i_label_asym_id_1",
                ILabelAsymId1::new) : getBinaryColumn("i_label_asym_id_1"));
    }

    /**
     * 
     * Describes the component id of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return ILabelCompId1
     */
    public ILabelCompId1 getILabelCompId1() {
        return (ILabelCompId1) (isText ? textFields.computeIfAbsent("i_label_comp_id_1",
                ILabelCompId1::new) : getBinaryColumn("i_label_comp_id_1"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return ILabelSeqId1
     */
    public ILabelSeqId1 getILabelSeqId1() {
        return (ILabelSeqId1) (isText ? textFields.computeIfAbsent("i_label_seq_id_1",
                ILabelSeqId1::new) : getBinaryColumn("i_label_seq_id_1"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the first base pair of the step.
     * @return ISymmetry1
     */
    public ISymmetry1 getISymmetry1() {
        return (ISymmetry1) (isText ? textFields.computeIfAbsent("i_symmetry_1",
                ISymmetry1::new) : getBinaryColumn("i_symmetry_1"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return JLabelAsymId1
     */
    public JLabelAsymId1 getJLabelAsymId1() {
        return (JLabelAsymId1) (isText ? textFields.computeIfAbsent("j_label_asym_id_1",
                JLabelAsymId1::new) : getBinaryColumn("j_label_asym_id_1"));
    }

    /**
     * 
     * Describes the component id of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return JLabelCompId1
     */
    public JLabelCompId1 getJLabelCompId1() {
        return (JLabelCompId1) (isText ? textFields.computeIfAbsent("j_label_comp_id_1",
                JLabelCompId1::new) : getBinaryColumn("j_label_comp_id_1"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the first base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return JLabelSeqId1
     */
    public JLabelSeqId1 getJLabelSeqId1() {
        return (JLabelSeqId1) (isText ? textFields.computeIfAbsent("j_label_seq_id_1",
                JLabelSeqId1::new) : getBinaryColumn("j_label_seq_id_1"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the first base pair of the step.
     * @return JSymmetry1
     */
    public JSymmetry1 getJSymmetry1() {
        return (JSymmetry1) (isText ? textFields.computeIfAbsent("j_symmetry_1",
                JSymmetry1::new) : getBinaryColumn("j_symmetry_1"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return ILabelAsymId2
     */
    public ILabelAsymId2 getILabelAsymId2() {
        return (ILabelAsymId2) (isText ? textFields.computeIfAbsent("i_label_asym_id_2",
                ILabelAsymId2::new) : getBinaryColumn("i_label_asym_id_2"));
    }

    /**
     * 
     * Describes the component id of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return ILabelCompId2
     */
    public ILabelCompId2 getILabelCompId2() {
        return (ILabelCompId2) (isText ? textFields.computeIfAbsent("i_label_comp_id_2",
                ILabelCompId2::new) : getBinaryColumn("i_label_comp_id_2"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return ILabelSeqId2
     */
    public ILabelSeqId2 getILabelSeqId2() {
        return (ILabelSeqId2) (isText ? textFields.computeIfAbsent("i_label_seq_id_2",
                ILabelSeqId2::new) : getBinaryColumn("i_label_seq_id_2"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the second base pair of the step.
     * @return ISymmetry2
     */
    public ISymmetry2 getISymmetry2() {
        return (ISymmetry2) (isText ? textFields.computeIfAbsent("i_symmetry_2",
                ISymmetry2::new) : getBinaryColumn("i_symmetry_2"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return JLabelAsymId2
     */
    public JLabelAsymId2 getJLabelAsymId2() {
        return (JLabelAsymId2) (isText ? textFields.computeIfAbsent("j_label_asym_id_2",
                JLabelAsymId2::new) : getBinaryColumn("j_label_asym_id_2"));
    }

    /**
     * 
     * Describes the component id of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return JLabelCompId2
     */
    public JLabelCompId2 getJLabelCompId2() {
        return (JLabelCompId2) (isText ? textFields.computeIfAbsent("j_label_comp_id_2",
                JLabelCompId2::new) : getBinaryColumn("j_label_comp_id_2"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the second base pair
     * of the step.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return JLabelSeqId2
     */
    public JLabelSeqId2 getJLabelSeqId2() {
        return (JLabelSeqId2) (isText ? textFields.computeIfAbsent("j_label_seq_id_2",
                JLabelSeqId2::new) : getBinaryColumn("j_label_seq_id_2"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the second base pair of the step.
     * @return JSymmetry2
     */
    public JSymmetry2 getJSymmetry2() {
        return (JSymmetry2) (isText ? textFields.computeIfAbsent("j_symmetry_2",
                JSymmetry2::new) : getBinaryColumn("j_symmetry_2"));
    }

    /**
     * 
     * Describes the author's asym id of the i-th base in the first
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return IAuthAsymId1
     */
    public IAuthAsymId1 getIAuthAsymId1() {
        return (IAuthAsymId1) (isText ? textFields.computeIfAbsent("i_auth_asym_id_1",
                IAuthAsymId1::new) : getBinaryColumn("i_auth_asym_id_1"));
    }

    /**
     * 
     * Describes the author's sequence number of the i-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IAuthSeqId1
     */
    public IAuthSeqId1 getIAuthSeqId1() {
        return (IAuthSeqId1) (isText ? textFields.computeIfAbsent("i_auth_seq_id_1",
                IAuthSeqId1::new) : getBinaryColumn("i_auth_seq_id_1"));
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return IPDBInsCode1
     */
    public IPDBInsCode1 getIPDBInsCode1() {
        return (IPDBInsCode1) (isText ? textFields.computeIfAbsent("i_PDB_ins_code_1",
                IPDBInsCode1::new) : getBinaryColumn("i_PDB_ins_code_1"));
    }

    /**
     * 
     * Describes the author's asym id of the j-th base in the first
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return JAuthAsymId1
     */
    public JAuthAsymId1 getJAuthAsymId1() {
        return (JAuthAsymId1) (isText ? textFields.computeIfAbsent("j_auth_asym_id_1",
                JAuthAsymId1::new) : getBinaryColumn("j_auth_asym_id_1"));
    }

    /**
     * 
     * Describes the author's sequence number of the j-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return JAuthSeqId1
     */
    public JAuthSeqId1 getJAuthSeqId1() {
        return (JAuthSeqId1) (isText ? textFields.computeIfAbsent("j_auth_seq_id_1",
                JAuthSeqId1::new) : getBinaryColumn("j_auth_seq_id_1"));
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the
     * first base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return JPDBInsCode1
     */
    public JPDBInsCode1 getJPDBInsCode1() {
        return (JPDBInsCode1) (isText ? textFields.computeIfAbsent("j_PDB_ins_code_1",
                JPDBInsCode1::new) : getBinaryColumn("j_PDB_ins_code_1"));
    }

    /**
     * 
     * Describes the author's asym id of the i-th base in the second
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return IAuthAsymId2
     */
    public IAuthAsymId2 getIAuthAsymId2() {
        return (IAuthAsymId2) (isText ? textFields.computeIfAbsent("i_auth_asym_id_2",
                IAuthAsymId2::new) : getBinaryColumn("i_auth_asym_id_2"));
    }

    /**
     * 
     * Describes the author's sequence number of the i-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IAuthSeqId2
     */
    public IAuthSeqId2 getIAuthSeqId2() {
        return (IAuthSeqId2) (isText ? textFields.computeIfAbsent("i_auth_seq_id_2",
                IAuthSeqId2::new) : getBinaryColumn("i_auth_seq_id_2"));
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return IPDBInsCode2
     */
    public IPDBInsCode2 getIPDBInsCode2() {
        return (IPDBInsCode2) (isText ? textFields.computeIfAbsent("i_PDB_ins_code_2",
                IPDBInsCode2::new) : getBinaryColumn("i_PDB_ins_code_2"));
    }

    /**
     * 
     * Describes the author's asym id of the j-th base in the second
     * base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return JAuthAsymId2
     */
    public JAuthAsymId2 getJAuthAsymId2() {
        return (JAuthAsymId2) (isText ? textFields.computeIfAbsent("j_auth_asym_id_2",
                JAuthAsymId2::new) : getBinaryColumn("j_auth_asym_id_2"));
    }

    /**
     * 
     * Describes the author's sequence number of the j-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return JAuthSeqId2
     */
    public JAuthSeqId2 getJAuthSeqId2() {
        return (JAuthSeqId2) (isText ? textFields.computeIfAbsent("j_auth_seq_id_2",
                JAuthSeqId2::new) : getBinaryColumn("j_auth_seq_id_2"));
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the
     * second base pair of the step.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in
     * the ATOM_SITE category.
     * @return JPDBInsCode2
     */
    public JPDBInsCode2 getJPDBInsCode2() {
        return (JPDBInsCode2) (isText ? textFields.computeIfAbsent("j_PDB_ins_code_2",
                JPDBInsCode2::new) : getBinaryColumn("j_PDB_ins_code_2"));
    }

    /**
     * 
     * The value of the base pair step shift parameter.
     * @return Shift
     */
    public Shift getShift() {
        return (Shift) (isText ? textFields.computeIfAbsent("shift",
                Shift::new) : getBinaryColumn("shift"));
    }

    /**
     * 
     * The value of the base pair step slide parameter.
     * @return Slide
     */
    public Slide getSlide() {
        return (Slide) (isText ? textFields.computeIfAbsent("slide",
                Slide::new) : getBinaryColumn("slide"));
    }

    /**
     * 
     * The value of the base pair step rise parameter.
     * @return Rise
     */
    public Rise getRise() {
        return (Rise) (isText ? textFields.computeIfAbsent("rise",
                Rise::new) : getBinaryColumn("rise"));
    }

    /**
     * 
     * The value of the base pair step tilt parameter.
     * @return Tilt
     */
    public Tilt getTilt() {
        return (Tilt) (isText ? textFields.computeIfAbsent("tilt",
                Tilt::new) : getBinaryColumn("tilt"));
    }

    /**
     * 
     * The value of the base pair step roll parameter.
     * @return Roll
     */
    public Roll getRoll() {
        return (Roll) (isText ? textFields.computeIfAbsent("roll",
                Roll::new) : getBinaryColumn("roll"));
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return Twist
     */
    public Twist getTwist() {
        return (Twist) (isText ? textFields.computeIfAbsent("twist",
                Twist::new) : getBinaryColumn("twist"));
    }

    /**
     * 
     * The value of the base pair step X displacement parameter.
     * @return XDisplacement
     */
    public XDisplacement getXDisplacement() {
        return (XDisplacement) (isText ? textFields.computeIfAbsent("x_displacement",
                XDisplacement::new) : getBinaryColumn("x_displacement"));
    }

    /**
     * 
     * The value of the base pair step Y displacement parameter.
     * @return YDisplacement
     */
    public YDisplacement getYDisplacement() {
        return (YDisplacement) (isText ? textFields.computeIfAbsent("y_displacement",
                YDisplacement::new) : getBinaryColumn("y_displacement"));
    }

    /**
     * 
     * The value of the base pair step helical rise parameter.
     * @return HelicalRise
     */
    public HelicalRise getHelicalRise() {
        return (HelicalRise) (isText ? textFields.computeIfAbsent("helical_rise",
                HelicalRise::new) : getBinaryColumn("helical_rise"));
    }

    /**
     * 
     * The value of the base pair step inclination parameter.
     * @return Inclination
     */
    public Inclination getInclination() {
        return (Inclination) (isText ? textFields.computeIfAbsent("inclination",
                Inclination::new) : getBinaryColumn("inclination"));
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return Tip
     */
    public Tip getTip() {
        return (Tip) (isText ? textFields.computeIfAbsent("tip",
                Tip::new) : getBinaryColumn("tip"));
    }

    /**
     * 
     * The value of the base pair step helical twist parameter.
     * @return HelicalTwist
     */
    public HelicalTwist getHelicalTwist() {
        return (HelicalTwist) (isText ? textFields.computeIfAbsent("helical_twist",
                HelicalTwist::new) : getBinaryColumn("helical_twist"));
    }
}
