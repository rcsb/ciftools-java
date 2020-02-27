package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_ASYM category record details about the
 * structural elements in the asymmetric unit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * The value of _struct_asym.id must uniquely identify a record in
     * the STRUCT_ASYM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item indicates whether the structural elements are modified.
     * @return StrColumn
     */
    public StrColumn getPdbxModified() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_modified", StrColumn::new) :
                getBinaryColumn("pdbx_modified"));
    }

    /**
     * A flag indicating that this entity was originally labeled
     * with a blank PDB chain id.
     * @return StrColumn
     */
    public StrColumn getPdbxBlankPDBChainidFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_blank_PDB_chainid_flag", StrColumn::new) :
                getBinaryColumn("pdbx_blank_PDB_chainid_flag"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_PDB_strand_id the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_id", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_id"));
    }

    /**
     * This data item is a pointer to _atom_site.ndb_alias_strand_id the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_alt_id"));
    }

    /**
     * This data item describes the general type of the structural elements
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_type", StrColumn::new) :
                getBinaryColumn("pdbx_type"));
    }

    /**
     * This data item gives the order of the structural elements in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPdbxOrder() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_order", IntColumn::new) :
                getBinaryColumn("pdbx_order"));
    }

    /**
     * This data item indicates wheather the structural elements exists
     * only as part of its whole molecule in the asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getPdbxFractionPerAsymUnit() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_fraction_per_asym_unit", StrColumn::new) :
                getBinaryColumn("pdbx_fraction_per_asym_unit"));
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumBeginOfChainNotInSeqres() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_missing_num_begin_of_chain_not_in_seqres", IntColumn::new) :
                getBinaryColumn("pdbx_missing_num_begin_of_chain_not_in_seqres"));
    }

    /**
     * This data item provides the information of how many residues
     * which do not appear in the SEQRES record are missing at the
     * end of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumEndOfChainNotInSeqres() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_missing_num_end_of_chain_not_in_seqres", IntColumn::new) :
                getBinaryColumn("pdbx_missing_num_end_of_chain_not_in_seqres"));
    }

    /**
     * This data item provides the information of how many residues
     * which do appear in the SEQRES record are missing at the
     * beginning of the strand.
     * @return IntColumn
     */
    public IntColumn getPdbxMissingNumBeginOfChainInSeqres() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_missing_num_begin_of_chain_in_seqres", IntColumn::new) :
                getBinaryColumn("pdbx_missing_num_begin_of_chain_in_seqres"));
    }
}
