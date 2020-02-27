package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
 * of base pair step interactions.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getModelNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_number", IntColumn::new) :
                getBinaryColumn("model_number"));
    }

    /**
     * 
     * The sequence number of this step in the step sequence.
     * @return IntColumn
     */
    public IntColumn getStepNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_number", IntColumn::new) :
                getBinaryColumn("step_number"));
    }

    /**
     * 
     * The text name of this step.
     * @return StrColumn
     */
    public StrColumn getStepName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("step_name", StrColumn::new) :
                getBinaryColumn("step_name"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_asym_id_1", StrColumn::new) :
                getBinaryColumn("i_label_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_comp_id_1", StrColumn::new) :
                getBinaryColumn("i_label_comp_id_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("i_label_seq_id_1", IntColumn::new) :
                getBinaryColumn("i_label_seq_id_1"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the first base pair of the step.
     * @return StrColumn
     */
    public StrColumn getISymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_symmetry_1", StrColumn::new) :
                getBinaryColumn("i_symmetry_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_asym_id_1", StrColumn::new) :
                getBinaryColumn("j_label_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_comp_id_1", StrColumn::new) :
                getBinaryColumn("j_label_comp_id_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("j_label_seq_id_1", IntColumn::new) :
                getBinaryColumn("j_label_seq_id_1"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the first base pair of the step.
     * @return StrColumn
     */
    public StrColumn getJSymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_symmetry_1", StrColumn::new) :
                getBinaryColumn("j_symmetry_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_asym_id_2", StrColumn::new) :
                getBinaryColumn("i_label_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_comp_id_2", StrColumn::new) :
                getBinaryColumn("i_label_comp_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("i_label_seq_id_2", IntColumn::new) :
                getBinaryColumn("i_label_seq_id_2"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the second base pair of the step.
     * @return StrColumn
     */
    public StrColumn getISymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_symmetry_2", StrColumn::new) :
                getBinaryColumn("i_symmetry_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_asym_id_2", StrColumn::new) :
                getBinaryColumn("j_label_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_comp_id_2", StrColumn::new) :
                getBinaryColumn("j_label_comp_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("j_label_seq_id_2", IntColumn::new) :
                getBinaryColumn("j_label_seq_id_2"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the second base pair of the step.
     * @return StrColumn
     */
    public StrColumn getJSymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_symmetry_2", StrColumn::new) :
                getBinaryColumn("j_symmetry_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("i_auth_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("i_auth_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("i_PDB_ins_code_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("j_auth_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("j_auth_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("j_PDB_ins_code_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("i_auth_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("i_auth_seq_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("i_PDB_ins_code_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("j_auth_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("j_auth_seq_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("j_PDB_ins_code_2"));
    }

    /**
     * 
     * The value of the base pair step shift parameter.
     * @return FloatColumn
     */
    public FloatColumn getShift() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift", FloatColumn::new) :
                getBinaryColumn("shift"));
    }

    /**
     * 
     * The value of the base pair step slide parameter.
     * @return FloatColumn
     */
    public FloatColumn getSlide() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("slide", FloatColumn::new) :
                getBinaryColumn("slide"));
    }

    /**
     * 
     * The value of the base pair step rise parameter.
     * @return FloatColumn
     */
    public FloatColumn getRise() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rise", FloatColumn::new) :
                getBinaryColumn("rise"));
    }

    /**
     * 
     * The value of the base pair step tilt parameter.
     * @return FloatColumn
     */
    public FloatColumn getTilt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tilt", FloatColumn::new) :
                getBinaryColumn("tilt"));
    }

    /**
     * 
     * The value of the base pair step roll parameter.
     * @return FloatColumn
     */
    public FloatColumn getRoll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("roll", FloatColumn::new) :
                getBinaryColumn("roll"));
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getTwist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("twist", FloatColumn::new) :
                getBinaryColumn("twist"));
    }

    /**
     * 
     * The value of the base pair step X displacement parameter.
     * @return FloatColumn
     */
    public FloatColumn getXDisplacement() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("x_displacement", FloatColumn::new) :
                getBinaryColumn("x_displacement"));
    }

    /**
     * 
     * The value of the base pair step Y displacement parameter.
     * @return FloatColumn
     */
    public FloatColumn getYDisplacement() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("y_displacement", FloatColumn::new) :
                getBinaryColumn("y_displacement"));
    }

    /**
     * 
     * The value of the base pair step helical rise parameter.
     * @return FloatColumn
     */
    public FloatColumn getHelicalRise() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("helical_rise", FloatColumn::new) :
                getBinaryColumn("helical_rise"));
    }

    /**
     * 
     * The value of the base pair step inclination parameter.
     * @return FloatColumn
     */
    public FloatColumn getInclination() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("inclination", FloatColumn::new) :
                getBinaryColumn("inclination"));
    }

    /**
     * 
     * The value of the base pair step twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getTip() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tip", FloatColumn::new) :
                getBinaryColumn("tip"));
    }

    /**
     * 
     * The value of the base pair step helical twist parameter.
     * @return FloatColumn
     */
    public FloatColumn getHelicalTwist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("helical_twist", FloatColumn::new) :
                getBinaryColumn("helical_twist"));
    }
}
