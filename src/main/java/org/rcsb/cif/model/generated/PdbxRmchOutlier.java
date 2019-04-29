package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_RMCH_OUTLIER category list the
 * residues with torsion angles outside the expected
 * Ramachandran regions.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRmchOutlier extends BaseCategory {
    public PdbxRmchOutlier(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRmchOutlier(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRmchOutlier(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_rmch_outlier.id must
     * uniquely identify each item in the PDBX_RMCH_OUTLIER list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given residue
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Identifier of the residue
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id"));
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * Identifier of the residue.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * The phi value that for the residue that lies outside
     * normal regions of the Rammachandran plot
     * @return FloatColumn
     */
    public FloatColumn getPhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phi", FloatColumn::new) :
                getBinaryColumn("phi"));
    }

    /**
     * The Psi value that for the residue that lies outside
     * of the normal region of the rammachandran plot
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("psi", FloatColumn::new) :
                getBinaryColumn("psi"));
    }
}
