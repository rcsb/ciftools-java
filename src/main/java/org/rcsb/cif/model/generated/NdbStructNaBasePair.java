package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
 * of base pairing interactions.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getModelNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_number", IntColumn::new) :
                getBinaryColumn("model_number"));
    }

    /**
     * 
     * Sequential number of pair in the pair sequence.
     * @return IntColumn
     */
    public IntColumn getPairNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pair_number", IntColumn::new) :
                getBinaryColumn("pair_number"));
    }

    /**
     * 
     * Text label for this base pair.
     * @return StrColumn
     */
    public StrColumn getPairName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pair_name", StrColumn::new) :
                getBinaryColumn("pair_name"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_asym_id", StrColumn::new) :
                getBinaryColumn("i_label_asym_id"));
    }

    /**
     * 
     * Describes the component id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getILabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_label_comp_id", StrColumn::new) :
                getBinaryColumn("i_label_comp_id"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getILabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("i_label_seq_id", IntColumn::new) :
                getBinaryColumn("i_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the base pair.
     * @return StrColumn
     */
    public StrColumn getISymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_symmetry", StrColumn::new) :
                getBinaryColumn("i_symmetry"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_asym_id", StrColumn::new) :
                getBinaryColumn("j_label_asym_id"));
    }

    /**
     * 
     * Describes the component id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_label_comp_id", StrColumn::new) :
                getBinaryColumn("j_label_comp_id"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getJLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("j_label_seq_id", IntColumn::new) :
                getBinaryColumn("j_label_seq_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the base pair.
     * @return StrColumn
     */
    public StrColumn getJSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_symmetry", StrColumn::new) :
                getBinaryColumn("j_symmetry"));
    }

    /**
     * 
     * Describes the asym id of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_asym_id", StrColumn::new) :
                getBinaryColumn("i_auth_asym_id"));
    }

    /**
     * 
     * Describes the sequence number of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_auth_seq_id", StrColumn::new) :
                getBinaryColumn("i_auth_seq_id"));
    }

    /**
     * 
     * Describes the PDB insertion code of the i-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getIPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("i_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("i_PDB_ins_code"));
    }

    /**
     * 
     * Describes the asym id of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_asym_id", StrColumn::new) :
                getBinaryColumn("j_auth_asym_id"));
    }

    /**
     * 
     * Describes the sequence number of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_auth_seq_id", StrColumn::new) :
                getBinaryColumn("j_auth_seq_id"));
    }

    /**
     * 
     * Describes the PDB insertion code of the j-th base in the base pair.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getJPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("j_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("j_PDB_ins_code"));
    }

    /**
     * 
     * The value of the base pair shear parameter.
     * @return FloatColumn
     */
    public FloatColumn getShear() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shear", FloatColumn::new) :
                getBinaryColumn("shear"));
    }

    /**
     * 
     * The value of the base pair stretch parameter.
     * @return FloatColumn
     */
    public FloatColumn getStretch() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("stretch", FloatColumn::new) :
                getBinaryColumn("stretch"));
    }

    /**
     * 
     * The value of the base pair stagger parameter.
     * @return FloatColumn
     */
    public FloatColumn getStagger() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("stagger", FloatColumn::new) :
                getBinaryColumn("stagger"));
    }

    /**
     * 
     * The value of the base pair buckle parameter.
     * @return FloatColumn
     */
    public FloatColumn getBuckle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("buckle", FloatColumn::new) :
                getBinaryColumn("buckle"));
    }

    /**
     * 
     * The value of the base pair propeller parameter.
     * @return FloatColumn
     */
    public FloatColumn getPropeller() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("propeller", FloatColumn::new) :
                getBinaryColumn("propeller"));
    }

    /**
     * 
     * The value of the base pair opening parameter.
     * @return FloatColumn
     */
    public FloatColumn getOpening() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("opening", FloatColumn::new) :
                getBinaryColumn("opening"));
    }

    /**
     * 
     * Base pair classification of Westhoff and Leontis.
     * @return IntColumn
     */
    public IntColumn getHbondType12() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("hbond_type_12", IntColumn::new) :
                getBinaryColumn("hbond_type_12"));
    }

    /**
     * 
     * Base pair classification of Saenger
     * @return IntColumn
     */
    public IntColumn getHbondType28() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("hbond_type_28", IntColumn::new) :
                getBinaryColumn("hbond_type_28"));
    }
}
