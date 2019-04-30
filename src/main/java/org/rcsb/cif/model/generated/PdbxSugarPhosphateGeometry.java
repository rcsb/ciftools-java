package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
 * covalent geometry for each momoner relative to small molecule crystal
 * standards.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * Neighbor component in the 5' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getNeighborCompId5prime() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("neighbor_comp_id_5prime", StrColumn::new) :
                getBinaryColumn("neighbor_comp_id_5prime"));
    }

    /**
     * Neighbor component in the 3' direction.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getNeighborCompId3prime() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("neighbor_comp_id_3prime", StrColumn::new) :
                getBinaryColumn("neighbor_comp_id_3prime"));
    }

    /**
     * The o3_p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3PO5C5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o3_p_o5_c5", FloatColumn::new) :
                getBinaryColumn("o3_p_o5_c5"));
    }

    /**
     * The p_o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5C5C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("p_o5_c5_c4", FloatColumn::new) :
                getBinaryColumn("p_o5_c5_c4"));
    }

    /**
     * The o5_c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o5_c5_c4_c3", FloatColumn::new) :
                getBinaryColumn("o5_c5_c4_c3"));
    }

    /**
     * The c5_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c5_c4_c3_o3", FloatColumn::new) :
                getBinaryColumn("c5_c4_c3_o3"));
    }

    /**
     * The c4_c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4C3O3P() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_c3_o3_p", FloatColumn::new) :
                getBinaryColumn("c4_c3_o3_p"));
    }

    /**
     * The c3_o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3PO5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_o3_p_o5", FloatColumn::new) :
                getBinaryColumn("c3_o3_p_o5"));
    }

    /**
     * The c4_o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1N19() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_o4_c1_n1_9", FloatColumn::new) :
                getBinaryColumn("c4_o4_c1_n1_9"));
    }

    /**
     * The o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19C24() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1_n1_9_c2_4", FloatColumn::new) :
                getBinaryColumn("o4_c1_n1_9_c2_4"));
    }

    /**
     * The o4_c1_n1_9_c6_8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19C68() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1_n1_9_c6_8", FloatColumn::new) :
                getBinaryColumn("o4_c1_n1_9_c6_8"));
    }

    /**
     * The c4_o4_c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1C2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_o4_c1_c2", FloatColumn::new) :
                getBinaryColumn("c4_o4_c1_c2"));
    }

    /**
     * The o4_c1_c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1C2C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1_c2_c3", FloatColumn::new) :
                getBinaryColumn("o4_c1_c2_c3"));
    }

    /**
     * The c1_c2_c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2C3C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_c2_c3_c4", FloatColumn::new) :
                getBinaryColumn("c1_c2_c3_c4"));
    }

    /**
     * The c2_c3_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3C4O4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_c3_c4_o4", FloatColumn::new) :
                getBinaryColumn("c2_c3_c4_o4"));
    }

    /**
     * The c3_c4_o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4O4C1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_c4_o4_c1", FloatColumn::new) :
                getBinaryColumn("c3_c4_o4_c1"));
    }

    /**
     * The c5_c4_c3_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3C2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c5_c4_c3_c2", FloatColumn::new) :
                getBinaryColumn("c5_c4_c3_c2"));
    }

    /**
     * The o4_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C4C3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c4_c3_o3", FloatColumn::new) :
                getBinaryColumn("o4_c4_c3_o3"));
    }

    /**
     * The o3_c3_c2_o2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3C3C2O2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o3_c3_c2_o2", FloatColumn::new) :
                getBinaryColumn("o3_c3_c2_o2"));
    }

    /**
     * The o5_c5_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4O4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o5_c5_c4_o4", FloatColumn::new) :
                getBinaryColumn("o5_c5_c4_o4"));
    }

    /**
     * The pseudo rotation angle of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPseudorot() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pseudorot", FloatColumn::new) :
                getBinaryColumn("pseudorot"));
    }

    /**
     * The maximum torsion value sigma-m, c1_c2_c3_c4/cos(P) of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getMaxtorsion() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("maxtorsion", FloatColumn::new) :
                getBinaryColumn("maxtorsion"));
    }

    /**
     * The next_label_comp_id covalent element of this monomer.
     * @return StrColumn
     */
    public StrColumn getNextLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("next_label_comp_id", StrColumn::new) :
                getBinaryColumn("next_label_comp_id"));
    }

    /**
     * The next_label_seq_id covalent element of this monomer.
     * @return IntColumn
     */
    public IntColumn getNextLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("next_label_seq_id", IntColumn::new) :
                getBinaryColumn("next_label_seq_id"));
    }

    /**
     * The next_o3_p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO3PO5C5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_o3_p_o5_c5", FloatColumn::new) :
                getBinaryColumn("next_o3_p_o5_c5"));
    }

    /**
     * The next_p_o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextPO5C5C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_p_o5_c5_c4", FloatColumn::new) :
                getBinaryColumn("next_p_o5_c5_c4"));
    }

    /**
     * The next_o5_c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO5C5C4C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_o5_c5_c4_c3", FloatColumn::new) :
                getBinaryColumn("next_o5_c5_c4_c3"));
    }

    /**
     * The next_c5_c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC5C4C3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_c5_c4_c3_o3", FloatColumn::new) :
                getBinaryColumn("next_c5_c4_c3_o3"));
    }

    /**
     * The next_c4_c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC4C3O3P() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_c4_c3_o3_p", FloatColumn::new) :
                getBinaryColumn("next_c4_c3_o3_p"));
    }

    /**
     * The next_c3_o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC3O3PO5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_c3_o3_p_o5", FloatColumn::new) :
                getBinaryColumn("next_c3_o3_p_o5"));
    }

    /**
     * The next_c4_o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextC4O4C1N19() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_c4_o4_c1_n1_9", FloatColumn::new) :
                getBinaryColumn("next_c4_o4_c1_n1_9"));
    }

    /**
     * The next_o4_c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getNextO4C1N19C24() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("next_o4_c1_n1_9_c2_4", FloatColumn::new) :
                getBinaryColumn("next_o4_c1_n1_9_c2_4"));
    }

    /**
     * The c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_c2", FloatColumn::new) :
                getBinaryColumn("c1_c2"));
    }

    /**
     * The c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_c3", FloatColumn::new) :
                getBinaryColumn("c2_c3"));
    }

    /**
     * The c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_c4", FloatColumn::new) :
                getBinaryColumn("c3_c4"));
    }

    /**
     * The c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_o4", FloatColumn::new) :
                getBinaryColumn("c4_o4"));
    }

    /**
     * The o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1", FloatColumn::new) :
                getBinaryColumn("o4_c1"));
    }

    /**
     * The p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("p_o5", FloatColumn::new) :
                getBinaryColumn("p_o5"));
    }

    /**
     * The o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o5_c5", FloatColumn::new) :
                getBinaryColumn("o5_c5"));
    }

    /**
     * The c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c5_c4", FloatColumn::new) :
                getBinaryColumn("c5_c4"));
    }

    /**
     * The c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_o3", FloatColumn::new) :
                getBinaryColumn("c3_o3"));
    }

    /**
     * The o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3P() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o3_p", FloatColumn::new) :
                getBinaryColumn("o3_p"));
    }

    /**
     * The p_o1p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO1p() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("p_o1p", FloatColumn::new) :
                getBinaryColumn("p_o1p"));
    }

    /**
     * The p_o2p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO2p() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("p_o2p", FloatColumn::new) :
                getBinaryColumn("p_o2p"));
    }

    /**
     * The c1_n9_1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N91() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_n9_1", FloatColumn::new) :
                getBinaryColumn("c1_n9_1"));
    }

    /**
     * The n1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN1C2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("n1_c2", FloatColumn::new) :
                getBinaryColumn("n1_c2"));
    }

    /**
     * The n1_c6 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN1C6() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("n1_c6", FloatColumn::new) :
                getBinaryColumn("n1_c6"));
    }

    /**
     * The n9_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN9C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("n9_c4", FloatColumn::new) :
                getBinaryColumn("n9_c4"));
    }

    /**
     * The n9_c8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getN9C8() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("n9_c8", FloatColumn::new) :
                getBinaryColumn("n9_c8"));
    }

    /**
     * The c1_c2_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1C2C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_c2_c3", FloatColumn::new) :
                getBinaryColumn("c1_c2_c3"));
    }

    /**
     * The c2_c3_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_c3_c4", FloatColumn::new) :
                getBinaryColumn("c2_c3_c4"));
    }

    /**
     * The c3_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3C4O4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_c4_o4", FloatColumn::new) :
                getBinaryColumn("c3_c4_o4"));
    }

    /**
     * The c4_o4_c1 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4O4C1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_o4_c1", FloatColumn::new) :
                getBinaryColumn("c4_o4_c1"));
    }

    /**
     * The o4_c1_c2 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1C2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1_c2", FloatColumn::new) :
                getBinaryColumn("o4_c1_c2"));
    }

    /**
     * The p_o5_c5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getPO5C5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("p_o5_c5", FloatColumn::new) :
                getBinaryColumn("p_o5_c5"));
    }

    /**
     * The o5_c5_c4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO5C5C4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o5_c5_c4", FloatColumn::new) :
                getBinaryColumn("o5_c5_c4"));
    }

    /**
     * The c5_c4_c3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4C3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c5_c4_c3", FloatColumn::new) :
                getBinaryColumn("c5_c4_c3"));
    }

    /**
     * The c4_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC4C3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c4_c3_o3", FloatColumn::new) :
                getBinaryColumn("c4_c3_o3"));
    }

    /**
     * The c3_o3_p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC3O3P() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c3_o3_p", FloatColumn::new) :
                getBinaryColumn("c3_o3_p"));
    }

    /**
     * The o3_p_o5 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO3PO5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o3_p_o5", FloatColumn::new) :
                getBinaryColumn("o3_p_o5"));
    }

    /**
     * The o4_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO4C1N19() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o4_c1_n1_9", FloatColumn::new) :
                getBinaryColumn("o4_c1_n1_9"));
    }

    /**
     * The c1_n1_9_c2_4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N19C24() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_n1_9_c2_4", FloatColumn::new) :
                getBinaryColumn("c1_n1_9_c2_4"));
    }

    /**
     * The c5_c4_o4 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC5C4O4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c5_c4_o4", FloatColumn::new) :
                getBinaryColumn("c5_c4_o4"));
    }

    /**
     * The c2_c3_o3 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C3O3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_c3_o3", FloatColumn::new) :
                getBinaryColumn("c2_c3_o3"));
    }

    /**
     * The o1p_p_o2p covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getO1pPO2p() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("o1p_p_o2p", FloatColumn::new) :
                getBinaryColumn("o1p_p_o2p"));
    }

    /**
     * The c2_c1_n1_9 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC2C1N19() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c2_c1_n1_9", FloatColumn::new) :
                getBinaryColumn("c2_c1_n1_9"));
    }

    /**
     * The c1_n1_9_c6_8 covalent element of this monomer.
     * @return FloatColumn
     */
    public FloatColumn getC1N19C68() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c1_n1_9_c6_8", FloatColumn::new) :
                getBinaryColumn("c1_n1_9_c6_8"));
    }
}
