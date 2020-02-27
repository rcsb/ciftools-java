package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_BRANCH_SCHEME category provides residue level nomenclature
 * mapping for branch chain entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxBranchScheme extends BaseCategory {
    public PdbxBranchScheme(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxBranchScheme(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxBranchScheme(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate whether this monomer in the entity is
     * heterogeneous in sequence.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetero", StrColumn::new) :
                getBinaryColumn("hetero"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * PDBX_ENTITY_BRANCH_LIST category.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_id", StrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * This data item is a pointer to _pdbx_entity_branch_list.num in the
     * PDBX_ENTITY_BRANCH_LIST category.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num", IntColumn::new) :
                getBinaryColumn("num"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_asym_id", StrColumn::new) :
                getBinaryColumn("pdb_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_seq_num", StrColumn::new) :
                getBinaryColumn("pdb_seq_num"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_mon_id", StrColumn::new) :
                getBinaryColumn("pdb_mon_id"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_num", StrColumn::new) :
                getBinaryColumn("auth_seq_num"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_mon_id", StrColumn::new) :
                getBinaryColumn("auth_mon_id"));
    }
}
