package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
 * mapping for polymer entities.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPolySeqScheme extends BaseCategory {
    public PdbxPolySeqScheme(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPolySeqScheme(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPolySeqScheme(String name) {
        super(name);
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
     * Pointer to _entity.id.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * Pointer to _entity_poly_seq.num
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id", IntColumn::new) :
                getBinaryColumn("seq_id"));
    }

    /**
     * Pointer to _entity_poly_seq.hetero
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetero", StrColumn::new) :
                getBinaryColumn("hetero"));
    }

    /**
     * Pointer to _entity_poly_seq.mon_id.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_id", StrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_strand_id", StrColumn::new) :
                getBinaryColumn("pdb_strand_id"));
    }

    /**
     * NDB residue number.
     * @return IntColumn
     */
    public IntColumn getNdbSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ndb_seq_num", IntColumn::new) :
                getBinaryColumn("ndb_seq_num"));
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_seq_num", StrColumn::new) :
                getBinaryColumn("pdb_seq_num"));
    }

    /**
     * Author provided residue number.   This value may differ from the PDB residue
     * number and may not correspond to residue numbering within the coordinate records.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_num", StrColumn::new) :
                getBinaryColumn("auth_seq_num"));
    }

    /**
     * PDB residue identifier.
     * @return StrColumn
     */
    public StrColumn getPdbMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_mon_id", StrColumn::new) :
                getBinaryColumn("pdb_mon_id"));
    }

    /**
     * Author provided residue identifier.   This value may differ from the PDB residue
     * identifier and may not correspond to residue identifier within the coordinate records.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_mon_id", StrColumn::new) :
                getBinaryColumn("auth_mon_id"));
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_ins_code", StrColumn::new) :
                getBinaryColumn("pdb_ins_code"));
    }
}
