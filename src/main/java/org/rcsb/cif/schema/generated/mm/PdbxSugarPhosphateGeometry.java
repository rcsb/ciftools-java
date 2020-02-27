package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
 * covalent geometry for each momoner relative to small molecule crystal
 * standards.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSugarPhosphateGeometry extends DelegatingCategory {
    public PdbxSugarPhosphateGeometry(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_sugar_phosphate_geometry.id must uniquely identify
     * each item in the PDBX_SUGAR_PHOSPHATE_GEOMETRY list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Neighbor component in the 5' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getNeighborCompId5prime() {
        return delegate.getColumn("neighbor_comp_id_5prime", DelegatingStrColumn::new);
    }

    /**
     * Neighbor component in the 3' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getNeighborCompId3prime() {
        return delegate.getColumn("neighbor_comp_id_3prime", DelegatingStrColumn::new);
    }

    /**
     * The o3_p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3PO5C5() {
        return delegate.getColumn("o3_p_o5_c5", DelegatingFloatColumn::new);
    }

    /**
     * The p_o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5C5C4() {
        return delegate.getColumn("p_o5_c5_c4", DelegatingFloatColumn::new);
    }

    /**
     * The o5_c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4C3() {
        return delegate.getColumn("o5_c5_c4_c3", DelegatingFloatColumn::new);
    }

    /**
     * The c5_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3O3() {
        return delegate.getColumn("c5_c4_c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The c4_c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4C3O3P() {
        return delegate.getColumn("c4_c3_o3_p", DelegatingFloatColumn::new);
    }

    /**
     * The c3_o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3PO5() {
        return delegate.getColumn("c3_o3_p_o5", DelegatingFloatColumn::new);
    }

    /**
     * The c4_o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1N19() {
        return delegate.getColumn("c4_o4_c1_n1_9", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19C24() {
        return delegate.getColumn("o4_c1_n1_9_c2_4", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1_n1_9_c6_8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19C68() {
        return delegate.getColumn("o4_c1_n1_9_c6_8", DelegatingFloatColumn::new);
    }

    /**
     * The c4_o4_c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1C2() {
        return delegate.getColumn("c4_o4_c1_c2", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1_c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1C2C3() {
        return delegate.getColumn("o4_c1_c2_c3", DelegatingFloatColumn::new);
    }

    /**
     * The c1_c2_c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2C3C4() {
        return delegate.getColumn("c1_c2_c3_c4", DelegatingFloatColumn::new);
    }

    /**
     * The c2_c3_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3C4O4() {
        return delegate.getColumn("c2_c3_c4_o4", DelegatingFloatColumn::new);
    }

    /**
     * The c3_c4_o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4O4C1() {
        return delegate.getColumn("c3_c4_o4_c1", DelegatingFloatColumn::new);
    }

    /**
     * The c5_c4_c3_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3C2() {
        return delegate.getColumn("c5_c4_c3_c2", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C4C3O3() {
        return delegate.getColumn("o4_c4_c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The o3_c3_c2_o2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3C3C2O2() {
        return delegate.getColumn("o3_c3_c2_o2", DelegatingFloatColumn::new);
    }

    /**
     * The o5_c5_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4O4() {
        return delegate.getColumn("o5_c5_c4_o4", DelegatingFloatColumn::new);
    }

    /**
     * The pseudo rotation angle of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPseudorot() {
        return delegate.getColumn("pseudorot", DelegatingFloatColumn::new);
    }

    /**
     * The maximum torsion value sigma-m, c1_c2_c3_c4/cos(P) of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getMaxtorsion() {
        return delegate.getColumn("maxtorsion", DelegatingFloatColumn::new);
    }

    /**
     * The next_label_comp_id covalent element of this monomer.
     * @return StrColumn
     */
    public StrColumn getNextLabelCompId() {
        return delegate.getColumn("next_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The next_label_seq_id covalent element of this monomer.
     * @return IntColumn
     */
    public IntColumn getNextLabelSeqId() {
        return delegate.getColumn("next_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The next_o3_p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO3PO5C5() {
        return delegate.getColumn("next_o3_p_o5_c5", DelegatingFloatColumn::new);
    }

    /**
     * The next_p_o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextPO5C5C4() {
        return delegate.getColumn("next_p_o5_c5_c4", DelegatingFloatColumn::new);
    }

    /**
     * The next_o5_c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO5C5C4C3() {
        return delegate.getColumn("next_o5_c5_c4_c3", DelegatingFloatColumn::new);
    }

    /**
     * The next_c5_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC5C4C3O3() {
        return delegate.getColumn("next_c5_c4_c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The next_c4_c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC4C3O3P() {
        return delegate.getColumn("next_c4_c3_o3_p", DelegatingFloatColumn::new);
    }

    /**
     * The next_c3_o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC3O3PO5() {
        return delegate.getColumn("next_c3_o3_p_o5", DelegatingFloatColumn::new);
    }

    /**
     * The next_c4_o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC4O4C1N19() {
        return delegate.getColumn("next_c4_o4_c1_n1_9", DelegatingFloatColumn::new);
    }

    /**
     * The next_o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO4C1N19C24() {
        return delegate.getColumn("next_o4_c1_n1_9_c2_4", DelegatingFloatColumn::new);
    }

    /**
     * The c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2() {
        return delegate.getColumn("c1_c2", DelegatingFloatColumn::new);
    }

    /**
     * The c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3() {
        return delegate.getColumn("c2_c3", DelegatingFloatColumn::new);
    }

    /**
     * The c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4() {
        return delegate.getColumn("c3_c4", DelegatingFloatColumn::new);
    }

    /**
     * The c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4() {
        return delegate.getColumn("c4_o4", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1() {
        return delegate.getColumn("o4_c1", DelegatingFloatColumn::new);
    }

    /**
     * The p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5() {
        return delegate.getColumn("p_o5", DelegatingFloatColumn::new);
    }

    /**
     * The o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5() {
        return delegate.getColumn("o5_c5", DelegatingFloatColumn::new);
    }

    /**
     * The c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4() {
        return delegate.getColumn("c5_c4", DelegatingFloatColumn::new);
    }

    /**
     * The c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3() {
        return delegate.getColumn("c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3P() {
        return delegate.getColumn("o3_p", DelegatingFloatColumn::new);
    }

    /**
     * The p_o1p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO1p() {
        return delegate.getColumn("p_o1p", DelegatingFloatColumn::new);
    }

    /**
     * The p_o2p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO2p() {
        return delegate.getColumn("p_o2p", DelegatingFloatColumn::new);
    }

    /**
     * The c1_n9_1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N91() {
        return delegate.getColumn("c1_n9_1", DelegatingFloatColumn::new);
    }

    /**
     * The n1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN1C2() {
        return delegate.getColumn("n1_c2", DelegatingFloatColumn::new);
    }

    /**
     * The n1_c6 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN1C6() {
        return delegate.getColumn("n1_c6", DelegatingFloatColumn::new);
    }

    /**
     * The n9_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN9C4() {
        return delegate.getColumn("n9_c4", DelegatingFloatColumn::new);
    }

    /**
     * The n9_c8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN9C8() {
        return delegate.getColumn("n9_c8", DelegatingFloatColumn::new);
    }

    /**
     * The c1_c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2C3() {
        return delegate.getColumn("c1_c2_c3", DelegatingFloatColumn::new);
    }

    /**
     * The c2_c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3C4() {
        return delegate.getColumn("c2_c3_c4", DelegatingFloatColumn::new);
    }

    /**
     * The c3_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4O4() {
        return delegate.getColumn("c3_c4_o4", DelegatingFloatColumn::new);
    }

    /**
     * The c4_o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1() {
        return delegate.getColumn("c4_o4_c1", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1C2() {
        return delegate.getColumn("o4_c1_c2", DelegatingFloatColumn::new);
    }

    /**
     * The p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5C5() {
        return delegate.getColumn("p_o5_c5", DelegatingFloatColumn::new);
    }

    /**
     * The o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4() {
        return delegate.getColumn("o5_c5_c4", DelegatingFloatColumn::new);
    }

    /**
     * The c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3() {
        return delegate.getColumn("c5_c4_c3", DelegatingFloatColumn::new);
    }

    /**
     * The c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4C3O3() {
        return delegate.getColumn("c4_c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3P() {
        return delegate.getColumn("c3_o3_p", DelegatingFloatColumn::new);
    }

    /**
     * The o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3PO5() {
        return delegate.getColumn("o3_p_o5", DelegatingFloatColumn::new);
    }

    /**
     * The o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19() {
        return delegate.getColumn("o4_c1_n1_9", DelegatingFloatColumn::new);
    }

    /**
     * The c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N19C24() {
        return delegate.getColumn("c1_n1_9_c2_4", DelegatingFloatColumn::new);
    }

    /**
     * The c5_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4O4() {
        return delegate.getColumn("c5_c4_o4", DelegatingFloatColumn::new);
    }

    /**
     * The c2_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3O3() {
        return delegate.getColumn("c2_c3_o3", DelegatingFloatColumn::new);
    }

    /**
     * The o1p_p_o2p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO1pPO2p() {
        return delegate.getColumn("o1p_p_o2p", DelegatingFloatColumn::new);
    }

    /**
     * The c2_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C1N19() {
        return delegate.getColumn("c2_c1_n1_9", DelegatingFloatColumn::new);
    }

    /**
     * The c1_n1_9_c6_8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N19C68() {
        return delegate.getColumn("c1_n1_9_c6_8", DelegatingFloatColumn::new);
    }
}
