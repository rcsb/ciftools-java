package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_ASYM category record details about the
 * structural elements in the asymmetric unit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructAsym extends DelegatingCategory {
    public StructAsym(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "entity_id":
                return getEntityId();
            case "id":
                return getId();
            case "pdbx_modified":
                return getPdbxModified();
            case "pdbx_blank_PDB_chainid_flag":
                return getPdbxBlankPDBChainidFlag();
            case "pdbx_PDB_id":
                return getPdbxPDBId();
            case "pdbx_alt_id":
                return getPdbxAltId();
            case "pdbx_type":
                return getPdbxType();
            case "pdbx_order":
                return getPdbxOrder();
            case "pdbx_fraction_per_asym_unit":
                return getPdbxFractionPerAsymUnit();
            case "pdbx_missing_num_begin_of_chain_not_in_seqres":
                return getPdbxMissingNumBeginOfChainNotInSeqres();
            case "pdbx_missing_num_end_of_chain_not_in_seqres":
                return getPdbxMissingNumEndOfChainNotInSeqres();
            case "pdbx_missing_num_begin_of_chain_in_seqres":
                return getPdbxMissingNumBeginOfChainInSeqres();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of this portion of the contents
     * of the asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_asym.id must uniquely identify a record in
     * the STRUCT_ASYM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether the structural elements are modified.
     * @return StrColumn
     */
    public StrColumn getPdbxModified() {
        return delegate.getColumn("pdbx_modified", DelegatingStrColumn::new);
    }

    /**
     * A flag indicating that this entity was originally labeled
     * with a blank PDB chain id.
     * @return StrColumn
     */
    public StrColumn getPdbxBlankPDBChainidFlag() {
        return delegate.getColumn("pdbx_blank_PDB_chainid_flag", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_PDB_strand_id the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBId() {
        return delegate.getColumn("pdbx_PDB_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.ndb_alias_strand_id the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAltId() {
        return delegate.getColumn("pdbx_alt_id", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the general type of the structural elements
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return delegate.getColumn("pdbx_type", DelegatingStrColumn::new);
    }

    /**
     * This data item gives the order of the structural elements in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPdbxOrder() {
        return delegate.getColumn("pdbx_order", DelegatingIntColumn::new);
    }

    /**
     * This data item indicates wheather the structural elements exists
     * only as part of its whole molecule in the asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getPdbxFractionPerAsymUnit() {
        return delegate.getColumn("pdbx_fraction_per_asym_unit", DelegatingStrColumn::new);
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumBeginOfChainNotInSeqres() {
        return delegate.getColumn("pdbx_missing_num_begin_of_chain_not_in_seqres", DelegatingIntColumn::new);
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * end of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumEndOfChainNotInSeqres() {
        return delegate.getColumn("pdbx_missing_num_end_of_chain_not_in_seqres", DelegatingIntColumn::new);
    }

    /**
     * This data item provides the information of how many residues
     * which do appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumBeginOfChainInSeqres() {
        return delegate.getColumn("pdbx_missing_num_begin_of_chain_in_seqres", DelegatingIntColumn::new);
    }

}