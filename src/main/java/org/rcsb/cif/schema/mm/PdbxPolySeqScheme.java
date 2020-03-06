package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
 * mapping for polymer entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPolySeqScheme extends DelegatingCategory {
    public PdbxPolySeqScheme(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "asym_id":
                return getAsymId();
            case "entity_id":
                return getEntityId();
            case "seq_id":
                return getSeqId();
            case "hetero":
                return getHetero();
            case "mon_id":
                return getMonId();
            case "pdb_strand_id":
                return getPdbStrandId();
            case "ndb_seq_num":
                return getNdbSeqNum();
            case "pdb_seq_num":
                return getPdbSeqNum();
            case "auth_seq_num":
                return getAuthSeqNum();
            case "pdb_mon_id":
                return getPdbMonId();
            case "auth_mon_id":
                return getAuthMonId();
            case "pdb_ins_code":
                return getPdbInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _entity.id.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _entity_poly_seq.num
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to _entity_poly_seq.hetero
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return delegate.getColumn("hetero", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _entity_poly_seq.mon_id.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbStrandId() {
        return delegate.getColumn("pdb_strand_id", DelegatingStrColumn::new);
    }

    /**
     * NDB residue number.
     * @return IntColumn
     */
    public IntColumn getNdbSeqNum() {
        return delegate.getColumn("ndb_seq_num", DelegatingIntColumn::new);
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbSeqNum() {
        return delegate.getColumn("pdb_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Author provided residue number.   This value may differ from the PDB residue
     * number and may not correspond to residue numbering within the coordinate records.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return delegate.getColumn("auth_seq_num", DelegatingStrColumn::new);
    }

    /**
     * PDB residue identifier.
     * @return StrColumn
     */
    public StrColumn getPdbMonId() {
        return delegate.getColumn("pdb_mon_id", DelegatingStrColumn::new);
    }

    /**
     * Author provided residue identifier.   This value may differ from the PDB residue
     * identifier and may not correspond to residue identifier within the coordinate records.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return delegate.getColumn("auth_mon_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbInsCode() {
        return delegate.getColumn("pdb_ins_code", DelegatingStrColumn::new);
    }

}