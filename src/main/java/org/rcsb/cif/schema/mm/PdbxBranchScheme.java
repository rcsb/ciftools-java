package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_BRANCH_SCHEME category provides residue level nomenclature
 * mapping for branch chain entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxBranchScheme extends DelegatingCategory {
    public PdbxBranchScheme(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "hetero":
                return getHetero();
            case "asym_id":
                return getAsymId();
            case "mon_id":
                return getMonId();
            case "num":
                return getNum();
            case "pdb_asym_id":
                return getPdbAsymId();
            case "pdb_seq_num":
                return getPdbSeqNum();
            case "pdb_ins_code":
                return getPdbInsCode();
            case "pdb_mon_id":
                return getPdbMonId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_num":
                return getAuthSeqNum();
            case "auth_mon_id":
                return getAuthMonId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether this monomer in the entity is
     * heterogeneous in sequence.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return delegate.getColumn("hetero", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * PDBX_ENTITY_BRANCH_LIST category.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_entity_branch_list.num in the
     * PDBX_ENTITY_BRANCH_LIST category.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return delegate.getColumn("num", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbAsymId() {
        return delegate.getColumn("pdb_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbSeqNum() {
        return delegate.getColumn("pdb_seq_num", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbInsCode() {
        return delegate.getColumn("pdb_ins_code", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbMonId() {
        return delegate.getColumn("pdb_mon_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return delegate.getColumn("auth_seq_num", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return delegate.getColumn("auth_mon_id", DelegatingStrColumn::new);
    }

}