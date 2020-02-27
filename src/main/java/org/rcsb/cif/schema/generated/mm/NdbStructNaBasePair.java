package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
 * of base pairing interactions.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class NdbStructNaBasePair extends DelegatingCategory {
    public NdbStructNaBasePair(Category delegate) {
        super(delegate);
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
        return delegate.getColumn("model_number", DelegatingIntColumn::new);
    }

    /**
     * 
     * Sequential number of pair in the pair sequence.
     * @return IntColumn
     */
    public IntColumn getPairNumber() {
        return delegate.getColumn("pair_number", DelegatingIntColumn::new);
    }

    /**
     * 
     * Text label for this base pair.
     * @return StrColumn
     */
    public StrColumn getPairName() {
        return delegate.getColumn("pair_name", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the i-th base to generate the first partner
     * in the base pair.
     * @return StrColumn
     */
    public StrColumn getISymmetry() {
        return delegate.getColumn("i_symmetry", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * coordinates of the j-th base to generate the second partner
     * in the base pair.
     * @return StrColumn
     */
    public StrColumn getJSymmetry() {
        return delegate.getColumn("j_symmetry", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("i_PDB_ins_code", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("j_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * 
     * The value of the base pair shear parameter.
     * @return FloatColumn
     */
    public FloatColumn getShear() {
        return delegate.getColumn("shear", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair stretch parameter.
     * @return FloatColumn
     */
    public FloatColumn getStretch() {
        return delegate.getColumn("stretch", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair stagger parameter.
     * @return FloatColumn
     */
    public FloatColumn getStagger() {
        return delegate.getColumn("stagger", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair buckle parameter.
     * @return FloatColumn
     */
    public FloatColumn getBuckle() {
        return delegate.getColumn("buckle", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair propeller parameter.
     * @return FloatColumn
     */
    public FloatColumn getPropeller() {
        return delegate.getColumn("propeller", DelegatingFloatColumn::new);
    }

    /**
     * 
     * The value of the base pair opening parameter.
     * @return FloatColumn
     */
    public FloatColumn getOpening() {
        return delegate.getColumn("opening", DelegatingFloatColumn::new);
    }

    /**
     * 
     * Base pair classification of Westhoff and Leontis.
     * @return IntColumn
     */
    public IntColumn getHbondType12() {
        return delegate.getColumn("hbond_type_12", DelegatingIntColumn::new);
    }

    /**
     * 
     * Base pair classification of Saenger
     * @return IntColumn
     */
    public IntColumn getHbondType28() {
        return delegate.getColumn("hbond_type_28", DelegatingIntColumn::new);
    }
}
