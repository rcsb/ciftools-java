package org.rcsb.cif.model.pdbxnonpolyscheme;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxNonpolyScheme extends BaseCifCategory {
    public PdbxNonpolyScheme(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxNonpolyScheme(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? getTextColumn("asym_id") : getBinaryColumn("asym_id"));
    }

    /**
     * Pointer to _atom_site.label_entity_id.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? getTextColumn("entity_id") : getBinaryColumn("entity_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return MonId
     */
    public MonId getMonId() {
        return (MonId) (isText ? getTextColumn("mon_id") : getBinaryColumn("mon_id"));
    }

    /**
     * PDB strand/chain id.
     * @return PdbStrandId
     */
    public PdbStrandId getPdbStrandId() {
        return (PdbStrandId) (isText ? getTextColumn("pdb_strand_id") : getBinaryColumn("pdb_strand_id"));
    }

    /**
     * NDB/RCSB residue number.
     * @return NdbSeqNum
     */
    public NdbSeqNum getNdbSeqNum() {
        return (NdbSeqNum) (isText ? getTextColumn("ndb_seq_num") : getBinaryColumn("ndb_seq_num"));
    }

    /**
     * PDB residue number.
     * @return PdbSeqNum
     */
    public PdbSeqNum getPdbSeqNum() {
        return (PdbSeqNum) (isText ? getTextColumn("pdb_seq_num") : getBinaryColumn("pdb_seq_num"));
    }

    /**
     * Author provided residue numbering.   This value may differ from the PDB residue
     * number and may not correspond to residue numbering within the coordinate records.
     * @return AuthSeqNum
     */
    public AuthSeqNum getAuthSeqNum() {
        return (AuthSeqNum) (isText ? getTextColumn("auth_seq_num") : getBinaryColumn("auth_seq_num"));
    }

    /**
     * PDB residue identifier.
     * @return PdbMonId
     */
    public PdbMonId getPdbMonId() {
        return (PdbMonId) (isText ? getTextColumn("pdb_mon_id") : getBinaryColumn("pdb_mon_id"));
    }

    /**
     * Author provided residue identifier.   This value may differ from the PDB residue
     * identifier and may not correspond to residue identification within the coordinate records.
     * @return AuthMonId
     */
    public AuthMonId getAuthMonId() {
        return (AuthMonId) (isText ? getTextColumn("auth_mon_id") : getBinaryColumn("auth_mon_id"));
    }

    /**
     * PDB insertion code.
     * @return PdbInsCode
     */
    public PdbInsCode getPdbInsCode() {
        return (PdbInsCode) (isText ? getTextColumn("pdb_ins_code") : getBinaryColumn("pdb_ins_code"));
    }
}
