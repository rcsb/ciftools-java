package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_CHEM_COMP_FEATURE category provides
 * structural annotations in chemical components instances.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructChemCompFeature extends DelegatingCategory {
    public PdbxStructChemCompFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "type":
                return getType();
            case "pdb_strand_id":
                return getPdbStrandId();
            case "asym_id":
                return getAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "seq_num":
                return getSeqNum();
            case "auth_comp_id":
                return getAuthCompId();
            case "pdb_ins_code":
                return getPdbInsCode();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Special structural details about this chemical component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A classification of the annotation for the chemical
     * component instance
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbStrandId() {
        return delegate.getColumn("pdb_strand_id", DelegatingStrColumn::new);
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * PDB position in the sequence.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Position in the sequence.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return delegate.getColumn("seq_num", DelegatingIntColumn::new);
    }

    /**
     * PDB component ID
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Insertion code of the monomer or ligand .
     * @return StrColumn
     */
    public StrColumn getPdbInsCode() {
        return delegate.getColumn("pdb_ins_code", DelegatingStrColumn::new);
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}