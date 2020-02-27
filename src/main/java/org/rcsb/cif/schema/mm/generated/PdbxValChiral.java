package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VAL_CHIRAL category list the
 * atoms with nonstandard chiralities.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValChiral extends BaseCategory {
    public PdbxValChiral(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValChiral(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValChiral(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_val_chiral.id must
     * uniquely identify each item in the PDBX_VAL_CHIRAL list.
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
     * Identifier of chiral center atom.
     * @return StrColumn
     */
    public StrColumn getChiralCenterAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chiral_center_atom_name", StrColumn::new) :
                getBinaryColumn("chiral_center_atom_name"));
    }

    /**
     * Identifier of chiral neighbor atom.
     * @return StrColumn
     */
    public StrColumn getChiralNeighborAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chiral_neighbor_atom_name", StrColumn::new) :
                getBinaryColumn("chiral_neighbor_atom_name"));
    }

    /**
     * Identifier of chiral center atom alt ID.
     * @return StrColumn
     */
    public StrColumn getChiralCenterAtomAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chiral_center_atom_alt_id", StrColumn::new) :
                getBinaryColumn("chiral_center_atom_alt_id"));
    }

    /**
     * Identifier of chiral neighbor alt ID.
     * @return StrColumn
     */
    public StrColumn getChiralNeighborAtomAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chiral_neighbor_atom_alt_id", StrColumn::new) :
                getBinaryColumn("chiral_neighbor_atom_alt_id"));
    }
}
