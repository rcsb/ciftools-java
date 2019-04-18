package org.rcsb.cif.model.pdbxnonpolyscheme;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxNonpolyScheme extends BaseCategory {
    public PdbxNonpolyScheme(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNonpolyScheme(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNonpolyScheme(String name) {
        super(name);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * Pointer to _atom_site.label_entity_id.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return MonId
     */
    public MonId getMonId() {
        return (MonId) (isText ? textFields.computeIfAbsent("mon_id",
                MonId::new) : getBinaryColumn("mon_id"));
    }

    /**
     * PDB strand/chain id.
     * @return PdbStrandId
     */
    public PdbStrandId getPdbStrandId() {
        return (PdbStrandId) (isText ? textFields.computeIfAbsent("pdb_strand_id",
                PdbStrandId::new) : getBinaryColumn("pdb_strand_id"));
    }

    /**
     * NDB/RCSB residue number.
     * @return NdbSeqNum
     */
    public NdbSeqNum getNdbSeqNum() {
        return (NdbSeqNum) (isText ? textFields.computeIfAbsent("ndb_seq_num",
                NdbSeqNum::new) : getBinaryColumn("ndb_seq_num"));
    }

    /**
     * PDB residue number.
     * @return PdbSeqNum
     */
    public PdbSeqNum getPdbSeqNum() {
        return (PdbSeqNum) (isText ? textFields.computeIfAbsent("pdb_seq_num",
                PdbSeqNum::new) : getBinaryColumn("pdb_seq_num"));
    }

    /**
     * Author provided residue numbering.   This value may differ from the PDB residue
     * number and may not correspond to residue numbering within the coordinate records.
     * @return AuthSeqNum
     */
    public AuthSeqNum getAuthSeqNum() {
        return (AuthSeqNum) (isText ? textFields.computeIfAbsent("auth_seq_num",
                AuthSeqNum::new) : getBinaryColumn("auth_seq_num"));
    }

    /**
     * PDB residue identifier.
     * @return PdbMonId
     */
    public PdbMonId getPdbMonId() {
        return (PdbMonId) (isText ? textFields.computeIfAbsent("pdb_mon_id",
                PdbMonId::new) : getBinaryColumn("pdb_mon_id"));
    }

    /**
     * Author provided residue identifier.   This value may differ from the PDB residue
     * identifier and may not correspond to residue identification within the coordinate records.
     * @return AuthMonId
     */
    public AuthMonId getAuthMonId() {
        return (AuthMonId) (isText ? textFields.computeIfAbsent("auth_mon_id",
                AuthMonId::new) : getBinaryColumn("auth_mon_id"));
    }

    /**
     * PDB insertion code.
     * @return PdbInsCode
     */
    public PdbInsCode getPdbInsCode() {
        return (PdbInsCode) (isText ? textFields.computeIfAbsent("pdb_ins_code",
                PdbInsCode::new) : getBinaryColumn("pdb_ins_code"));
    }
}
