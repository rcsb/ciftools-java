package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
 * structural diagnostics in chemical components instances.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A classification of the diagnostic for the chemical
     * component instance
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * PDB strand/chain id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbStrandId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_strand_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_strand_id"));
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * PDB  position in the sequence.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthSeqId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * 
     * Position in the sequence.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSeqNum() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("seq_num", SingleRowIntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * PDB component ID
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * Insertion code of the monomer or ligand .
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_ins_code"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOrdinal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ordinal", SingleRowIntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
