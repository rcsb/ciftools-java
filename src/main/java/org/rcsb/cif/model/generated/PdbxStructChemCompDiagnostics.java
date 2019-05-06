package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
 * structural diagnostics in chemical components instances.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructChemCompDiagnostics extends BaseCategory {
    public PdbxStructChemCompDiagnostics(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructChemCompDiagnostics(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructChemCompDiagnostics(String name) {
        super(name);
    }

    /**
     * Special structural details about this chemical component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A classification of the diagnostic for the chemical
     * component instance
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
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
     * Instance identifier for the polymer molecule.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * PDB  position in the sequence.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * 
     * Position in the sequence.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_num", IntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * PDB component ID
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * Insertion code of the monomer or ligand .
     * @return StrColumn
     */
    public StrColumn getPdbInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_ins_code", StrColumn::new) :
                getBinaryColumn("pdb_ins_code"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
