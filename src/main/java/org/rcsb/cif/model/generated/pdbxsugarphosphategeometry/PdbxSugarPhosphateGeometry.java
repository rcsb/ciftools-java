package org.rcsb.cif.model.generated.pdbxsugarphosphategeometry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSugarPhosphateGeometry extends BaseCategory {
    public PdbxSugarPhosphateGeometry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSugarPhosphateGeometry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSugarPhosphateGeometry(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_sugar_phosphate_geometry.id must uniquely identify
     * each item in the PDBX_SUGAR_PHOSPHATE_GEOMETRY list.
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * Neighbor component in the 5' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return NeighborCompId5prime
     */
    public NeighborCompId5prime getNeighborCompId5prime() {
        return (NeighborCompId5prime) (isText ? textFields.computeIfAbsent("neighbor_comp_id_5prime",
                NeighborCompId5prime::new) : getBinaryColumn("neighbor_comp_id_5prime"));
    }

    /**
     * Neighbor component in the 3' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return NeighborCompId3prime
     */
    public NeighborCompId3prime getNeighborCompId3prime() {
        return (NeighborCompId3prime) (isText ? textFields.computeIfAbsent("neighbor_comp_id_3prime",
                NeighborCompId3prime::new) : getBinaryColumn("neighbor_comp_id_3prime"));
    }

    /**
     * The o3_p_o5_c5 covalent element of this monomer.
     * @return O3PO5C5
     */
    public O3PO5C5 getO3PO5C5() {
        return (O3PO5C5) (isText ? textFields.computeIfAbsent("o3_p_o5_c5",
                O3PO5C5::new) : getBinaryColumn("o3_p_o5_c5"));
    }

    /**
     * The p_o5_c5_c4 covalent element of this monomer.
     * @return PO5C5C4
     */
    public PO5C5C4 getPO5C5C4() {
        return (PO5C5C4) (isText ? textFields.computeIfAbsent("p_o5_c5_c4",
                PO5C5C4::new) : getBinaryColumn("p_o5_c5_c4"));
    }

    /**
     * The o5_c5_c4_c3 covalent element of this monomer.
     * @return O5C5C4C3
     */
    public O5C5C4C3 getO5C5C4C3() {
        return (O5C5C4C3) (isText ? textFields.computeIfAbsent("o5_c5_c4_c3",
                O5C5C4C3::new) : getBinaryColumn("o5_c5_c4_c3"));
    }

    /**
     * The c5_c4_c3_o3 covalent element of this monomer.
     * @return C5C4C3O3
     */
    public C5C4C3O3 getC5C4C3O3() {
        return (C5C4C3O3) (isText ? textFields.computeIfAbsent("c5_c4_c3_o3",
                C5C4C3O3::new) : getBinaryColumn("c5_c4_c3_o3"));
    }

    /**
     * The c4_c3_o3_p covalent element of this monomer.
     * @return C4C3O3P
     */
    public C4C3O3P getC4C3O3P() {
        return (C4C3O3P) (isText ? textFields.computeIfAbsent("c4_c3_o3_p",
                C4C3O3P::new) : getBinaryColumn("c4_c3_o3_p"));
    }

    /**
     * The c3_o3_p_o5 covalent element of this monomer.
     * @return C3O3PO5
     */
    public C3O3PO5 getC3O3PO5() {
        return (C3O3PO5) (isText ? textFields.computeIfAbsent("c3_o3_p_o5",
                C3O3PO5::new) : getBinaryColumn("c3_o3_p_o5"));
    }

    /**
     * The c4_o4_c1_n1_9 covalent element of this monomer.
     * @return C4O4C1N19
     */
    public C4O4C1N19 getC4O4C1N19() {
        return (C4O4C1N19) (isText ? textFields.computeIfAbsent("c4_o4_c1_n1_9",
                C4O4C1N19::new) : getBinaryColumn("c4_o4_c1_n1_9"));
    }

    /**
     * The o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return O4C1N19C24
     */
    public O4C1N19C24 getO4C1N19C24() {
        return (O4C1N19C24) (isText ? textFields.computeIfAbsent("o4_c1_n1_9_c2_4",
                O4C1N19C24::new) : getBinaryColumn("o4_c1_n1_9_c2_4"));
    }

    /**
     * The o4_c1_n1_9_c6_8 covalent element of this monomer.
     * @return O4C1N19C68
     */
    public O4C1N19C68 getO4C1N19C68() {
        return (O4C1N19C68) (isText ? textFields.computeIfAbsent("o4_c1_n1_9_c6_8",
                O4C1N19C68::new) : getBinaryColumn("o4_c1_n1_9_c6_8"));
    }

    /**
     * The c4_o4_c1_c2 covalent element of this monomer.
     * @return C4O4C1C2
     */
    public C4O4C1C2 getC4O4C1C2() {
        return (C4O4C1C2) (isText ? textFields.computeIfAbsent("c4_o4_c1_c2",
                C4O4C1C2::new) : getBinaryColumn("c4_o4_c1_c2"));
    }

    /**
     * The o4_c1_c2_c3 covalent element of this monomer.
     * @return O4C1C2C3
     */
    public O4C1C2C3 getO4C1C2C3() {
        return (O4C1C2C3) (isText ? textFields.computeIfAbsent("o4_c1_c2_c3",
                O4C1C2C3::new) : getBinaryColumn("o4_c1_c2_c3"));
    }

    /**
     * The c1_c2_c3_c4 covalent element of this monomer.
     * @return C1C2C3C4
     */
    public C1C2C3C4 getC1C2C3C4() {
        return (C1C2C3C4) (isText ? textFields.computeIfAbsent("c1_c2_c3_c4",
                C1C2C3C4::new) : getBinaryColumn("c1_c2_c3_c4"));
    }

    /**
     * The c2_c3_c4_o4 covalent element of this monomer.
     * @return C2C3C4O4
     */
    public C2C3C4O4 getC2C3C4O4() {
        return (C2C3C4O4) (isText ? textFields.computeIfAbsent("c2_c3_c4_o4",
                C2C3C4O4::new) : getBinaryColumn("c2_c3_c4_o4"));
    }

    /**
     * The c3_c4_o4_c1 covalent element of this monomer.
     * @return C3C4O4C1
     */
    public C3C4O4C1 getC3C4O4C1() {
        return (C3C4O4C1) (isText ? textFields.computeIfAbsent("c3_c4_o4_c1",
                C3C4O4C1::new) : getBinaryColumn("c3_c4_o4_c1"));
    }

    /**
     * The c5_c4_c3_c2 covalent element of this monomer.
     * @return C5C4C3C2
     */
    public C5C4C3C2 getC5C4C3C2() {
        return (C5C4C3C2) (isText ? textFields.computeIfAbsent("c5_c4_c3_c2",
                C5C4C3C2::new) : getBinaryColumn("c5_c4_c3_c2"));
    }

    /**
     * The o4_c4_c3_o3 covalent element of this monomer.
     * @return O4C4C3O3
     */
    public O4C4C3O3 getO4C4C3O3() {
        return (O4C4C3O3) (isText ? textFields.computeIfAbsent("o4_c4_c3_o3",
                O4C4C3O3::new) : getBinaryColumn("o4_c4_c3_o3"));
    }

    /**
     * The o3_c3_c2_o2 covalent element of this monomer.
     * @return O3C3C2O2
     */
    public O3C3C2O2 getO3C3C2O2() {
        return (O3C3C2O2) (isText ? textFields.computeIfAbsent("o3_c3_c2_o2",
                O3C3C2O2::new) : getBinaryColumn("o3_c3_c2_o2"));
    }

    /**
     * The o5_c5_c4_o4 covalent element of this monomer.
     * @return O5C5C4O4
     */
    public O5C5C4O4 getO5C5C4O4() {
        return (O5C5C4O4) (isText ? textFields.computeIfAbsent("o5_c5_c4_o4",
                O5C5C4O4::new) : getBinaryColumn("o5_c5_c4_o4"));
    }

    /**
     * The pseudo rotation angle of this monomer.
     * @return Pseudorot
     */
    public Pseudorot getPseudorot() {
        return (Pseudorot) (isText ? textFields.computeIfAbsent("pseudorot",
                Pseudorot::new) : getBinaryColumn("pseudorot"));
    }

    /**
     * The maximum torsion value sigma-m, c1_c2_c3_c4/cos(P) of this monomer.
     * @return Maxtorsion
     */
    public Maxtorsion getMaxtorsion() {
        return (Maxtorsion) (isText ? textFields.computeIfAbsent("maxtorsion",
                Maxtorsion::new) : getBinaryColumn("maxtorsion"));
    }

    /**
     * The next_label_comp_id covalent element of this monomer.
     * @return NextLabelCompId
     */
    public NextLabelCompId getNextLabelCompId() {
        return (NextLabelCompId) (isText ? textFields.computeIfAbsent("next_label_comp_id",
                NextLabelCompId::new) : getBinaryColumn("next_label_comp_id"));
    }

    /**
     * The next_label_seq_id covalent element of this monomer.
     * @return NextLabelSeqId
     */
    public NextLabelSeqId getNextLabelSeqId() {
        return (NextLabelSeqId) (isText ? textFields.computeIfAbsent("next_label_seq_id",
                NextLabelSeqId::new) : getBinaryColumn("next_label_seq_id"));
    }

    /**
     * The next_o3_p_o5_c5 covalent element of this monomer.
     * @return NextO3PO5C5
     */
    public NextO3PO5C5 getNextO3PO5C5() {
        return (NextO3PO5C5) (isText ? textFields.computeIfAbsent("next_o3_p_o5_c5",
                NextO3PO5C5::new) : getBinaryColumn("next_o3_p_o5_c5"));
    }

    /**
     * The next_p_o5_c5_c4 covalent element of this monomer.
     * @return NextPO5C5C4
     */
    public NextPO5C5C4 getNextPO5C5C4() {
        return (NextPO5C5C4) (isText ? textFields.computeIfAbsent("next_p_o5_c5_c4",
                NextPO5C5C4::new) : getBinaryColumn("next_p_o5_c5_c4"));
    }

    /**
     * The next_o5_c5_c4_c3 covalent element of this monomer.
     * @return NextO5C5C4C3
     */
    public NextO5C5C4C3 getNextO5C5C4C3() {
        return (NextO5C5C4C3) (isText ? textFields.computeIfAbsent("next_o5_c5_c4_c3",
                NextO5C5C4C3::new) : getBinaryColumn("next_o5_c5_c4_c3"));
    }

    /**
     * The next_c5_c4_c3_o3 covalent element of this monomer.
     * @return NextC5C4C3O3
     */
    public NextC5C4C3O3 getNextC5C4C3O3() {
        return (NextC5C4C3O3) (isText ? textFields.computeIfAbsent("next_c5_c4_c3_o3",
                NextC5C4C3O3::new) : getBinaryColumn("next_c5_c4_c3_o3"));
    }

    /**
     * The next_c4_c3_o3_p covalent element of this monomer.
     * @return NextC4C3O3P
     */
    public NextC4C3O3P getNextC4C3O3P() {
        return (NextC4C3O3P) (isText ? textFields.computeIfAbsent("next_c4_c3_o3_p",
                NextC4C3O3P::new) : getBinaryColumn("next_c4_c3_o3_p"));
    }

    /**
     * The next_c3_o3_p_o5 covalent element of this monomer.
     * @return NextC3O3PO5
     */
    public NextC3O3PO5 getNextC3O3PO5() {
        return (NextC3O3PO5) (isText ? textFields.computeIfAbsent("next_c3_o3_p_o5",
                NextC3O3PO5::new) : getBinaryColumn("next_c3_o3_p_o5"));
    }

    /**
     * The next_c4_o4_c1_n1_9 covalent element of this monomer.
     * @return NextC4O4C1N19
     */
    public NextC4O4C1N19 getNextC4O4C1N19() {
        return (NextC4O4C1N19) (isText ? textFields.computeIfAbsent("next_c4_o4_c1_n1_9",
                NextC4O4C1N19::new) : getBinaryColumn("next_c4_o4_c1_n1_9"));
    }

    /**
     * The next_o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return NextO4C1N19C24
     */
    public NextO4C1N19C24 getNextO4C1N19C24() {
        return (NextO4C1N19C24) (isText ? textFields.computeIfAbsent("next_o4_c1_n1_9_c2_4",
                NextO4C1N19C24::new) : getBinaryColumn("next_o4_c1_n1_9_c2_4"));
    }

    /**
     * The c1_c2 covalent element of this monomer.
     * @return C1C2
     */
    public C1C2 getC1C2() {
        return (C1C2) (isText ? textFields.computeIfAbsent("c1_c2",
                C1C2::new) : getBinaryColumn("c1_c2"));
    }

    /**
     * The c2_c3 covalent element of this monomer.
     * @return C2C3
     */
    public C2C3 getC2C3() {
        return (C2C3) (isText ? textFields.computeIfAbsent("c2_c3",
                C2C3::new) : getBinaryColumn("c2_c3"));
    }

    /**
     * The c3_c4 covalent element of this monomer.
     * @return C3C4
     */
    public C3C4 getC3C4() {
        return (C3C4) (isText ? textFields.computeIfAbsent("c3_c4",
                C3C4::new) : getBinaryColumn("c3_c4"));
    }

    /**
     * The c4_o4 covalent element of this monomer.
     * @return C4O4
     */
    public C4O4 getC4O4() {
        return (C4O4) (isText ? textFields.computeIfAbsent("c4_o4",
                C4O4::new) : getBinaryColumn("c4_o4"));
    }

    /**
     * The o4_c1 covalent element of this monomer.
     * @return O4C1
     */
    public O4C1 getO4C1() {
        return (O4C1) (isText ? textFields.computeIfAbsent("o4_c1",
                O4C1::new) : getBinaryColumn("o4_c1"));
    }

    /**
     * The p_o5 covalent element of this monomer.
     * @return PO5
     */
    public PO5 getPO5() {
        return (PO5) (isText ? textFields.computeIfAbsent("p_o5",
                PO5::new) : getBinaryColumn("p_o5"));
    }

    /**
     * The o5_c5 covalent element of this monomer.
     * @return O5C5
     */
    public O5C5 getO5C5() {
        return (O5C5) (isText ? textFields.computeIfAbsent("o5_c5",
                O5C5::new) : getBinaryColumn("o5_c5"));
    }

    /**
     * The c5_c4 covalent element of this monomer.
     * @return C5C4
     */
    public C5C4 getC5C4() {
        return (C5C4) (isText ? textFields.computeIfAbsent("c5_c4",
                C5C4::new) : getBinaryColumn("c5_c4"));
    }

    /**
     * The c3_o3 covalent element of this monomer.
     * @return C3O3
     */
    public C3O3 getC3O3() {
        return (C3O3) (isText ? textFields.computeIfAbsent("c3_o3",
                C3O3::new) : getBinaryColumn("c3_o3"));
    }

    /**
     * The o3_p covalent element of this monomer.
     * @return O3P
     */
    public O3P getO3P() {
        return (O3P) (isText ? textFields.computeIfAbsent("o3_p",
                O3P::new) : getBinaryColumn("o3_p"));
    }

    /**
     * The p_o1p covalent element of this monomer.
     * @return PO1p
     */
    public PO1p getPO1p() {
        return (PO1p) (isText ? textFields.computeIfAbsent("p_o1p",
                PO1p::new) : getBinaryColumn("p_o1p"));
    }

    /**
     * The p_o2p covalent element of this monomer.
     * @return PO2p
     */
    public PO2p getPO2p() {
        return (PO2p) (isText ? textFields.computeIfAbsent("p_o2p",
                PO2p::new) : getBinaryColumn("p_o2p"));
    }

    /**
     * The c1_n9_1 covalent element of this monomer.
     * @return C1N91
     */
    public C1N91 getC1N91() {
        return (C1N91) (isText ? textFields.computeIfAbsent("c1_n9_1",
                C1N91::new) : getBinaryColumn("c1_n9_1"));
    }

    /**
     * The n1_c2 covalent element of this monomer.
     * @return N1C2
     */
    public N1C2 getN1C2() {
        return (N1C2) (isText ? textFields.computeIfAbsent("n1_c2",
                N1C2::new) : getBinaryColumn("n1_c2"));
    }

    /**
     * The n1_c6 covalent element of this monomer.
     * @return N1C6
     */
    public N1C6 getN1C6() {
        return (N1C6) (isText ? textFields.computeIfAbsent("n1_c6",
                N1C6::new) : getBinaryColumn("n1_c6"));
    }

    /**
     * The n9_c4 covalent element of this monomer.
     * @return N9C4
     */
    public N9C4 getN9C4() {
        return (N9C4) (isText ? textFields.computeIfAbsent("n9_c4",
                N9C4::new) : getBinaryColumn("n9_c4"));
    }

    /**
     * The n9_c8 covalent element of this monomer.
     * @return N9C8
     */
    public N9C8 getN9C8() {
        return (N9C8) (isText ? textFields.computeIfAbsent("n9_c8",
                N9C8::new) : getBinaryColumn("n9_c8"));
    }

    /**
     * The c1_c2_c3 covalent element of this monomer.
     * @return C1C2C3
     */
    public C1C2C3 getC1C2C3() {
        return (C1C2C3) (isText ? textFields.computeIfAbsent("c1_c2_c3",
                C1C2C3::new) : getBinaryColumn("c1_c2_c3"));
    }

    /**
     * The c2_c3_c4 covalent element of this monomer.
     * @return C2C3C4
     */
    public C2C3C4 getC2C3C4() {
        return (C2C3C4) (isText ? textFields.computeIfAbsent("c2_c3_c4",
                C2C3C4::new) : getBinaryColumn("c2_c3_c4"));
    }

    /**
     * The c3_c4_o4 covalent element of this monomer.
     * @return C3C4O4
     */
    public C3C4O4 getC3C4O4() {
        return (C3C4O4) (isText ? textFields.computeIfAbsent("c3_c4_o4",
                C3C4O4::new) : getBinaryColumn("c3_c4_o4"));
    }

    /**
     * The c4_o4_c1 covalent element of this monomer.
     * @return C4O4C1
     */
    public C4O4C1 getC4O4C1() {
        return (C4O4C1) (isText ? textFields.computeIfAbsent("c4_o4_c1",
                C4O4C1::new) : getBinaryColumn("c4_o4_c1"));
    }

    /**
     * The o4_c1_c2 covalent element of this monomer.
     * @return O4C1C2
     */
    public O4C1C2 getO4C1C2() {
        return (O4C1C2) (isText ? textFields.computeIfAbsent("o4_c1_c2",
                O4C1C2::new) : getBinaryColumn("o4_c1_c2"));
    }

    /**
     * The p_o5_c5 covalent element of this monomer.
     * @return PO5C5
     */
    public PO5C5 getPO5C5() {
        return (PO5C5) (isText ? textFields.computeIfAbsent("p_o5_c5",
                PO5C5::new) : getBinaryColumn("p_o5_c5"));
    }

    /**
     * The o5_c5_c4 covalent element of this monomer.
     * @return O5C5C4
     */
    public O5C5C4 getO5C5C4() {
        return (O5C5C4) (isText ? textFields.computeIfAbsent("o5_c5_c4",
                O5C5C4::new) : getBinaryColumn("o5_c5_c4"));
    }

    /**
     * The c5_c4_c3 covalent element of this monomer.
     * @return C5C4C3
     */
    public C5C4C3 getC5C4C3() {
        return (C5C4C3) (isText ? textFields.computeIfAbsent("c5_c4_c3",
                C5C4C3::new) : getBinaryColumn("c5_c4_c3"));
    }

    /**
     * The c4_c3_o3 covalent element of this monomer.
     * @return C4C3O3
     */
    public C4C3O3 getC4C3O3() {
        return (C4C3O3) (isText ? textFields.computeIfAbsent("c4_c3_o3",
                C4C3O3::new) : getBinaryColumn("c4_c3_o3"));
    }

    /**
     * The c3_o3_p covalent element of this monomer.
     * @return C3O3P
     */
    public C3O3P getC3O3P() {
        return (C3O3P) (isText ? textFields.computeIfAbsent("c3_o3_p",
                C3O3P::new) : getBinaryColumn("c3_o3_p"));
    }

    /**
     * The o3_p_o5 covalent element of this monomer.
     * @return O3PO5
     */
    public O3PO5 getO3PO5() {
        return (O3PO5) (isText ? textFields.computeIfAbsent("o3_p_o5",
                O3PO5::new) : getBinaryColumn("o3_p_o5"));
    }

    /**
     * The o4_c1_n1_9 covalent element of this monomer.
     * @return O4C1N19
     */
    public O4C1N19 getO4C1N19() {
        return (O4C1N19) (isText ? textFields.computeIfAbsent("o4_c1_n1_9",
                O4C1N19::new) : getBinaryColumn("o4_c1_n1_9"));
    }

    /**
     * The c1_n1_9_c2_4 covalent element of this monomer.
     * @return C1N19C24
     */
    public C1N19C24 getC1N19C24() {
        return (C1N19C24) (isText ? textFields.computeIfAbsent("c1_n1_9_c2_4",
                C1N19C24::new) : getBinaryColumn("c1_n1_9_c2_4"));
    }

    /**
     * The c5_c4_o4 covalent element of this monomer.
     * @return C5C4O4
     */
    public C5C4O4 getC5C4O4() {
        return (C5C4O4) (isText ? textFields.computeIfAbsent("c5_c4_o4",
                C5C4O4::new) : getBinaryColumn("c5_c4_o4"));
    }

    /**
     * The c2_c3_o3 covalent element of this monomer.
     * @return C2C3O3
     */
    public C2C3O3 getC2C3O3() {
        return (C2C3O3) (isText ? textFields.computeIfAbsent("c2_c3_o3",
                C2C3O3::new) : getBinaryColumn("c2_c3_o3"));
    }

    /**
     * The o1p_p_o2p covalent element of this monomer.
     * @return O1pPO2p
     */
    public O1pPO2p getO1pPO2p() {
        return (O1pPO2p) (isText ? textFields.computeIfAbsent("o1p_p_o2p",
                O1pPO2p::new) : getBinaryColumn("o1p_p_o2p"));
    }

    /**
     * The c2_c1_n1_9 covalent element of this monomer.
     * @return C2C1N19
     */
    public C2C1N19 getC2C1N19() {
        return (C2C1N19) (isText ? textFields.computeIfAbsent("c2_c1_n1_9",
                C2C1N19::new) : getBinaryColumn("c2_c1_n1_9"));
    }

    /**
     * The c1_n1_9_c6_8 covalent element of this monomer.
     * @return C1N19C68
     */
    public C1N19C68 getC1N19C68() {
        return (C1N19C68) (isText ? textFields.computeIfAbsent("c1_n1_9_c6_8",
                C1N19C68::new) : getBinaryColumn("c1_n1_9_c6_8"));
    }
}
