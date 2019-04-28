package org.rcsb.cif.model.generated.ndbstructnabasepair;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NdbStructNaBasePair extends BaseCategory {
    public NdbStructNaBasePair(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public NdbStructNaBasePair(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public NdbStructNaBasePair(String name) {
        super(name);
    }

    /**
     * 
     * Describes the model number of the the base pair.
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
     * Sequential number of pair in the pair sequence.
     * @return PairNumber
     */
    public PairNumber getPairNumber() {
        return (PairNumber) (isText ? textFields.computeIfAbsent("pair_number",
                PairNumber::new) : getBinaryColumn("pair_number"));
    }

    /**
     * 
     * Text label for this base pair.
     * @return PairName
     */
    public PairName getPairName() {
        return (PairName) (isText ? textFields.computeIfAbsent("pair_name",
                PairName::new) : getBinaryColumn("pair_name"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return ILabelAsymId
     */
    public ILabelAsymId getILabelAsymId() {
        return (ILabelAsymId) (isText ? textFields.computeIfAbsent("i_label_asym_id",
                ILabelAsymId::new) : getBinaryColumn("i_label_asym_id"));
    }

    /**
     * 
     * Describes the component id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return ILabelCompId
     */
    public ILabelCompId getILabelCompId() {
        return (ILabelCompId) (isText ? textFields.computeIfAbsent("i_label_comp_id",
                ILabelCompId::new) : getBinaryColumn("i_label_comp_id"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return ILabelSeqId
     */
    public ILabelSeqId getILabelSeqId() {
        return (ILabelSeqId) (isText ? textFields.computeIfAbsent("i_label_seq_id",
                ILabelSeqId::new) : getBinaryColumn("i_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the base pair.
     * @return ISymmetry
     */
    public ISymmetry getISymmetry() {
        return (ISymmetry) (isText ? textFields.computeIfAbsent("i_symmetry",
                ISymmetry::new) : getBinaryColumn("i_symmetry"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return JLabelAsymId
     */
    public JLabelAsymId getJLabelAsymId() {
        return (JLabelAsymId) (isText ? textFields.computeIfAbsent("j_label_asym_id",
                JLabelAsymId::new) : getBinaryColumn("j_label_asym_id"));
    }

    /**
     * 
     * Describes the component id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return JLabelCompId
     */
    public JLabelCompId getJLabelCompId() {
        return (JLabelCompId) (isText ? textFields.computeIfAbsent("j_label_comp_id",
                JLabelCompId::new) : getBinaryColumn("j_label_comp_id"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return JLabelSeqId
     */
    public JLabelSeqId getJLabelSeqId() {
        return (JLabelSeqId) (isText ? textFields.computeIfAbsent("j_label_seq_id",
                JLabelSeqId::new) : getBinaryColumn("j_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the base pair.
     * @return JSymmetry
     */
    public JSymmetry getJSymmetry() {
        return (JSymmetry) (isText ? textFields.computeIfAbsent("j_symmetry",
                JSymmetry::new) : getBinaryColumn("j_symmetry"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return IAuthAsymId
     */
    public IAuthAsymId getIAuthAsymId() {
        return (IAuthAsymId) (isText ? textFields.computeIfAbsent("i_auth_asym_id",
                IAuthAsymId::new) : getBinaryColumn("i_auth_asym_id"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IAuthSeqId
     */
    public IAuthSeqId getIAuthSeqId() {
        return (IAuthSeqId) (isText ? textFields.computeIfAbsent("i_auth_seq_id",
                IAuthSeqId::new) : getBinaryColumn("i_auth_seq_id"));
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return IPDBInsCode
     */
    public IPDBInsCode getIPDBInsCode() {
        return (IPDBInsCode) (isText ? textFields.computeIfAbsent("i_PDB_ins_code",
                IPDBInsCode::new) : getBinaryColumn("i_PDB_ins_code"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return JAuthAsymId
     */
    public JAuthAsymId getJAuthAsymId() {
        return (JAuthAsymId) (isText ? textFields.computeIfAbsent("j_auth_asym_id",
                JAuthAsymId::new) : getBinaryColumn("j_auth_asym_id"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return JAuthSeqId
     */
    public JAuthSeqId getJAuthSeqId() {
        return (JAuthSeqId) (isText ? textFields.computeIfAbsent("j_auth_seq_id",
                JAuthSeqId::new) : getBinaryColumn("j_auth_seq_id"));
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return JPDBInsCode
     */
    public JPDBInsCode getJPDBInsCode() {
        return (JPDBInsCode) (isText ? textFields.computeIfAbsent("j_PDB_ins_code",
                JPDBInsCode::new) : getBinaryColumn("j_PDB_ins_code"));
    }

    /**
     * 
     * The value of the base pair shear parameter.
     * @return Shear
     */
    public Shear getShear() {
        return (Shear) (isText ? textFields.computeIfAbsent("shear",
                Shear::new) : getBinaryColumn("shear"));
    }

    /**
     * 
     * The value of the base pair stretch parameter.
     * @return Stretch
     */
    public Stretch getStretch() {
        return (Stretch) (isText ? textFields.computeIfAbsent("stretch",
                Stretch::new) : getBinaryColumn("stretch"));
    }

    /**
     * 
     * The value of the base pair stagger parameter.
     * @return Stagger
     */
    public Stagger getStagger() {
        return (Stagger) (isText ? textFields.computeIfAbsent("stagger",
                Stagger::new) : getBinaryColumn("stagger"));
    }

    /**
     * 
     * The value of the base pair buckle parameter.
     * @return Buckle
     */
    public Buckle getBuckle() {
        return (Buckle) (isText ? textFields.computeIfAbsent("buckle",
                Buckle::new) : getBinaryColumn("buckle"));
    }

    /**
     * 
     * The value of the base pair propeller parameter.
     * @return Propeller
     */
    public Propeller getPropeller() {
        return (Propeller) (isText ? textFields.computeIfAbsent("propeller",
                Propeller::new) : getBinaryColumn("propeller"));
    }

    /**
     * 
     * The value of the base pair opening parameter.
     * @return Opening
     */
    public Opening getOpening() {
        return (Opening) (isText ? textFields.computeIfAbsent("opening",
                Opening::new) : getBinaryColumn("opening"));
    }

    /**
     * 
     * Base pair classification of Westhoff and Leontis.
     * @return HbondType12
     */
    public HbondType12 getHbondType12() {
        return (HbondType12) (isText ? textFields.computeIfAbsent("hbond_type_12",
                HbondType12::new) : getBinaryColumn("hbond_type_12"));
    }

    /**
     * 
     * Base pair classification of Saenger
     * @return HbondType28
     */
    public HbondType28 getHbondType28() {
        return (HbondType28) (isText ? textFields.computeIfAbsent("hbond_type_28",
                HbondType28::new) : getBinaryColumn("hbond_type_28"));
    }
}
