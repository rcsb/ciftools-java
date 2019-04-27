package org.rcsb.cif.model.pdbxstructchemcompfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructChemCompFeature extends BaseCategory {
    public PdbxStructChemCompFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructChemCompFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructChemCompFeature(String name) {
        super(name);
    }

    /**
     * Special structural details about this chemical component.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A classification of the annotation for the chemical
     * component instance
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
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
     * Instance identifier for the polymer molecule.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * 
     * PDB position in the sequence.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * 
     * Position in the sequence.
     * @return SeqNum
     */
    public SeqNum getSeqNum() {
        return (SeqNum) (isText ? textFields.computeIfAbsent("seq_num",
                SeqNum::new) : getBinaryColumn("seq_num"));
    }

    /**
     * 
     * PDB component ID
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * Insertion code of the monomer or ligand .
     * @return PdbInsCode
     */
    public PdbInsCode getPdbInsCode() {
        return (PdbInsCode) (isText ? textFields.computeIfAbsent("pdb_ins_code",
                PdbInsCode::new) : getBinaryColumn("pdb_ins_code"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
