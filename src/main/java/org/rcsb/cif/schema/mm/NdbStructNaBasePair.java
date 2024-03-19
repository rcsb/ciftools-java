package org.rcsb.cif.schema.mm;

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

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_number":
                return getModelNumber();
            case "pair_number":
                return getPairNumber();
            case "pair_name":
                return getPairName();
            case "i_label_asym_id":
                return getILabelAsymId();
            case "i_label_comp_id":
                return getILabelCompId();
            case "i_label_seq_id":
                return getILabelSeqId();
            case "i_symmetry":
                return getISymmetry();
            case "j_label_asym_id":
                return getJLabelAsymId();
            case "j_label_comp_id":
                return getJLabelCompId();
            case "j_label_seq_id":
                return getJLabelSeqId();
            case "j_symmetry":
                return getJSymmetry();
            case "i_auth_asym_id":
                return getIAuthAsymId();
            case "i_auth_seq_id":
                return getIAuthSeqId();
            case "i_PDB_ins_code":
                return getIPDBInsCode();
            case "j_auth_asym_id":
                return getJAuthAsymId();
            case "j_auth_seq_id":
                return getJAuthSeqId();
            case "j_PDB_ins_code":
                return getJPDBInsCode();
            case "shear":
                return getShear();
            case "stretch":
                return getStretch();
            case "stagger":
                return getStagger();
            case "buckle":
                return getBuckle();
            case "propeller":
                return getPropeller();
            case "opening":
                return getOpening();
            case "hbond_type_12":
                return getHbondType12();
            case "hbond_type_28":
                return getHbondType28();
            case "hbond_type_leontis_westhof":
                return getHbondTypeLeontisWesthof();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Describes the model number of the base pair.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getModelNumber() {
        return delegate.getColumn("model_number", DelegatingIntColumn::new);
    }

    /**
     * Sequential number of pair in the pair sequence.
     * @return IntColumn
     */
    public IntColumn getPairNumber() {
        return delegate.getColumn("pair_number", DelegatingIntColumn::new);
    }

    /**
     * Text label for this base pair.
     * @return StrColumn
     */
    public StrColumn getPairName() {
        return delegate.getColumn("pair_name", DelegatingStrColumn::new);
    }

    /**
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
     * The value of the base pair shear parameter.
     * @return FloatColumn
     */
    public FloatColumn getShear() {
        return delegate.getColumn("shear", DelegatingFloatColumn::new);
    }

    /**
     * The value of the base pair stretch parameter.
     * @return FloatColumn
     */
    public FloatColumn getStretch() {
        return delegate.getColumn("stretch", DelegatingFloatColumn::new);
    }

    /**
     * The value of the base pair stagger parameter.
     * @return FloatColumn
     */
    public FloatColumn getStagger() {
        return delegate.getColumn("stagger", DelegatingFloatColumn::new);
    }

    /**
     * The value of the base pair buckle parameter.
     * @return FloatColumn
     */
    public FloatColumn getBuckle() {
        return delegate.getColumn("buckle", DelegatingFloatColumn::new);
    }

    /**
     * The value of the base pair propeller parameter.
     * @return FloatColumn
     */
    public FloatColumn getPropeller() {
        return delegate.getColumn("propeller", DelegatingFloatColumn::new);
    }

    /**
     * The value of the base pair opening parameter.
     * @return FloatColumn
     */
    public FloatColumn getOpening() {
        return delegate.getColumn("opening", DelegatingFloatColumn::new);
    }

    /**
     * Base pair classification of Westhoff and Leontis.
     * @return IntColumn
     */
    public IntColumn getHbondType12() {
        return delegate.getColumn("hbond_type_12", DelegatingIntColumn::new);
    }

    /**
     * Base pair classification of Saenger
     * @return IntColumn
     */
    public IntColumn getHbondType28() {
        return delegate.getColumn("hbond_type_28", DelegatingIntColumn::new);
    }

    /**
     * Base pair classification of Leontis and Westhof.
     * 
     * The Leontis-Westhof classification system annotates
     * basepairs according to the interacting edge used by
     * each base (Watson-Crick, Hoogsteen, or Sugar), and
     * glycosidic bond orientation (cis, trans).  For six of
     * twelve classes, the correct Leontis-Westhof notation
     * depends upon the order (i,j) of the identified
     * nucleotides.
     * 
     * Leontis NB and Westhof E (2001) Geometric nomenclature
     * and classification of RNA base pairs.  RNA 7:499-512.
     * https://doi.org/10.1017/s1355838201002515
     * 
     * Replacement for category item
     * _ndb_struct_na_base_pair.hbond_type_12. The older item
     * encodes the 12 classes by a numerical index, without
     * identifying the interacting edges used by each base in
     * nucleotides i,j.
     * @return StrColumn
     */
    public StrColumn getHbondTypeLeontisWesthof() {
        return delegate.getColumn("hbond_type_leontis_westhof", DelegatingStrColumn::new);
    }

}