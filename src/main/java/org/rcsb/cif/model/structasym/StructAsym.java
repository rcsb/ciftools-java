package org.rcsb.cif.model.structasym;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructAsym extends BaseCategory {
    public StructAsym(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructAsym(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructAsym(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this portion of the contents
     * of the asymmetric unit.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The value of _struct_asym.id must uniquely identify a record in
     * the STRUCT_ASYM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item indicates whether the structural elements are modified.
     * @return PdbxModified
     */
    public PdbxModified getPdbxModified() {
        return (PdbxModified) (isText ? textFields.computeIfAbsent("pdbx_modified",
                PdbxModified::new) : getBinaryColumn("pdbx_modified"));
    }

    /**
     * A flag indicating that this entity was originally labeled
     * with a blank PDB chain id.
     * @return PdbxBlankPDBChainidFlag
     */
    public PdbxBlankPDBChainidFlag getPdbxBlankPDBChainidFlag() {
        return (PdbxBlankPDBChainidFlag) (isText ? textFields.computeIfAbsent("pdbx_blank_PDB_chainid_flag",
                PdbxBlankPDBChainidFlag::new) : getBinaryColumn("pdbx_blank_PDB_chainid_flag"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_PDB_strand_id the
     * ATOM_SITE category.
     * @return PdbxPDBId
     */
    public PdbxPDBId getPdbxPDBId() {
        return (PdbxPDBId) (isText ? textFields.computeIfAbsent("pdbx_PDB_id",
                PdbxPDBId::new) : getBinaryColumn("pdbx_PDB_id"));
    }

    /**
     * This data item is a pointer to _atom_site.ndb_alias_strand_id the
     * ATOM_SITE category.
     * @return PdbxAltId
     */
    public PdbxAltId getPdbxAltId() {
        return (PdbxAltId) (isText ? textFields.computeIfAbsent("pdbx_alt_id",
                PdbxAltId::new) : getBinaryColumn("pdbx_alt_id"));
    }

    /**
     * This data item describes the general type of the structural elements
     * in the ATOM_SITE category.
     * @return PdbxType
     */
    public PdbxType getPdbxType() {
        return (PdbxType) (isText ? textFields.computeIfAbsent("pdbx_type",
                PdbxType::new) : getBinaryColumn("pdbx_type"));
    }

    /**
     * This data item gives the order of the structural elements in the
     * ATOM_SITE category.
     * @return PdbxOrder
     */
    public PdbxOrder getPdbxOrder() {
        return (PdbxOrder) (isText ? textFields.computeIfAbsent("pdbx_order",
                PdbxOrder::new) : getBinaryColumn("pdbx_order"));
    }

    /**
     * This data item indicates wheather the structural elements exists
     * only as part of its whole molecule in the asymmetric unit.
     * @return PdbxFractionPerAsymUnit
     */
    public PdbxFractionPerAsymUnit getPdbxFractionPerAsymUnit() {
        return (PdbxFractionPerAsymUnit) (isText ? textFields.computeIfAbsent("pdbx_fraction_per_asym_unit",
                PdbxFractionPerAsymUnit::new) : getBinaryColumn("pdbx_fraction_per_asym_unit"));
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return PdbxMissingNumBeginOfChainNotInSeqres
     */
    public PdbxMissingNumBeginOfChainNotInSeqres getPdbxMissingNumBeginOfChainNotInSeqres() {
        return (PdbxMissingNumBeginOfChainNotInSeqres) (isText ? textFields.computeIfAbsent("pdbx_missing_num_begin_of_chain_not_in_seqres",
                PdbxMissingNumBeginOfChainNotInSeqres::new) : getBinaryColumn("pdbx_missing_num_begin_of_chain_not_in_seqres"));
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * end of the strand.
     * @return PdbxMissingNumEndOfChainNotInSeqres
     */
    public PdbxMissingNumEndOfChainNotInSeqres getPdbxMissingNumEndOfChainNotInSeqres() {
        return (PdbxMissingNumEndOfChainNotInSeqres) (isText ? textFields.computeIfAbsent("pdbx_missing_num_end_of_chain_not_in_seqres",
                PdbxMissingNumEndOfChainNotInSeqres::new) : getBinaryColumn("pdbx_missing_num_end_of_chain_not_in_seqres"));
    }

    /**
     * This data item provides the information of how many residues
     * which do appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return PdbxMissingNumBeginOfChainInSeqres
     */
    public PdbxMissingNumBeginOfChainInSeqres getPdbxMissingNumBeginOfChainInSeqres() {
        return (PdbxMissingNumBeginOfChainInSeqres) (isText ? textFields.computeIfAbsent("pdbx_missing_num_begin_of_chain_in_seqres",
                PdbxMissingNumBeginOfChainInSeqres::new) : getBinaryColumn("pdbx_missing_num_begin_of_chain_in_seqres"));
    }
}
