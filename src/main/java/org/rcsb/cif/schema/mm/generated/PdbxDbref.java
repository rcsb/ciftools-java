package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * These records are used in the DBREF record of a PDB file and
 * are used as place holders for NDB ID's in PDB files.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDbref extends BaseCategory {
    public PdbxDbref(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDbref(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDbref(String name) {
        super(name);
    }

    /**
     * PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id_code", StrColumn::new) :
                getBinaryColumn("pdb_id_code"));
    }

    /**
     * Chain id.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_id", StrColumn::new) :
                getBinaryColumn("chain_id"));
    }

    /**
     * First residue number.
     * @return StrColumn
     */
    public StrColumn getBeginResNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("begin_res_number", StrColumn::new) :
                getBinaryColumn("begin_res_number"));
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getBeginInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("begin_ins_code", StrColumn::new) :
                getBinaryColumn("begin_ins_code"));
    }

    /**
     * Last residue number.
     * @return StrColumn
     */
    public StrColumn getEndResNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_res_number", StrColumn::new) :
                getBinaryColumn("end_res_number"));
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getEndInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_ins_code", StrColumn::new) :
                getBinaryColumn("end_ins_code"));
    }

    /**
     * Database name.
     * @return StrColumn
     */
    public StrColumn getDatabaseName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_name", StrColumn::new) :
                getBinaryColumn("database_name"));
    }

    /**
     * Database accession.
     * @return StrColumn
     */
    public StrColumn getDatabaseAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_accession", StrColumn::new) :
                getBinaryColumn("database_accession"));
    }

    /**
     * Database id code.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_id_code", StrColumn::new) :
                getBinaryColumn("database_id_code"));
    }

    /**
     * First residue number.
     * @return StrColumn
     */
    public StrColumn getDatabaseBeginResNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_begin_res_number", StrColumn::new) :
                getBinaryColumn("database_begin_res_number"));
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getDatabaseBeginInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_begin_ins_code", StrColumn::new) :
                getBinaryColumn("database_begin_ins_code"));
    }

    /**
     * Last residue number.
     * @return StrColumn
     */
    public StrColumn getDatabaseEndResNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_end_res_number", StrColumn::new) :
                getBinaryColumn("database_end_res_number"));
    }

    /**
     * Insertion code.
     * @return StrColumn
     */
    public StrColumn getDatabaseEndInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_end_ins_code", StrColumn::new) :
                getBinaryColumn("database_end_ins_code"));
    }
}
