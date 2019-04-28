package org.rcsb.cif.model.generated.pdbxdbref;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return PdbIdCode
     */
    public PdbIdCode getPdbIdCode() {
        return (PdbIdCode) (isText ? textFields.computeIfAbsent("pdb_id_code",
                PdbIdCode::new) : getBinaryColumn("pdb_id_code"));
    }

    /**
     * Chain id.
     * @return ChainId
     */
    public ChainId getChainId() {
        return (ChainId) (isText ? textFields.computeIfAbsent("chain_id",
                ChainId::new) : getBinaryColumn("chain_id"));
    }

    /**
     * First residue number.
     * @return BeginResNumber
     */
    public BeginResNumber getBeginResNumber() {
        return (BeginResNumber) (isText ? textFields.computeIfAbsent("begin_res_number",
                BeginResNumber::new) : getBinaryColumn("begin_res_number"));
    }

    /**
     * Insertion code.
     * @return BeginInsCode
     */
    public BeginInsCode getBeginInsCode() {
        return (BeginInsCode) (isText ? textFields.computeIfAbsent("begin_ins_code",
                BeginInsCode::new) : getBinaryColumn("begin_ins_code"));
    }

    /**
     * Last residue number.
     * @return EndResNumber
     */
    public EndResNumber getEndResNumber() {
        return (EndResNumber) (isText ? textFields.computeIfAbsent("end_res_number",
                EndResNumber::new) : getBinaryColumn("end_res_number"));
    }

    /**
     * Insertion code.
     * @return EndInsCode
     */
    public EndInsCode getEndInsCode() {
        return (EndInsCode) (isText ? textFields.computeIfAbsent("end_ins_code",
                EndInsCode::new) : getBinaryColumn("end_ins_code"));
    }

    /**
     * Database name.
     * @return DatabaseName
     */
    public DatabaseName getDatabaseName() {
        return (DatabaseName) (isText ? textFields.computeIfAbsent("database_name",
                DatabaseName::new) : getBinaryColumn("database_name"));
    }

    /**
     * Database accession.
     * @return DatabaseAccession
     */
    public DatabaseAccession getDatabaseAccession() {
        return (DatabaseAccession) (isText ? textFields.computeIfAbsent("database_accession",
                DatabaseAccession::new) : getBinaryColumn("database_accession"));
    }

    /**
     * Database id code.
     * @return DatabaseIdCode
     */
    public DatabaseIdCode getDatabaseIdCode() {
        return (DatabaseIdCode) (isText ? textFields.computeIfAbsent("database_id_code",
                DatabaseIdCode::new) : getBinaryColumn("database_id_code"));
    }

    /**
     * First residue number.
     * @return DatabaseBeginResNumber
     */
    public DatabaseBeginResNumber getDatabaseBeginResNumber() {
        return (DatabaseBeginResNumber) (isText ? textFields.computeIfAbsent("database_begin_res_number",
                DatabaseBeginResNumber::new) : getBinaryColumn("database_begin_res_number"));
    }

    /**
     * Insertion code.
     * @return DatabaseBeginInsCode
     */
    public DatabaseBeginInsCode getDatabaseBeginInsCode() {
        return (DatabaseBeginInsCode) (isText ? textFields.computeIfAbsent("database_begin_ins_code",
                DatabaseBeginInsCode::new) : getBinaryColumn("database_begin_ins_code"));
    }

    /**
     * Last residue number.
     * @return DatabaseEndResNumber
     */
    public DatabaseEndResNumber getDatabaseEndResNumber() {
        return (DatabaseEndResNumber) (isText ? textFields.computeIfAbsent("database_end_res_number",
                DatabaseEndResNumber::new) : getBinaryColumn("database_end_res_number"));
    }

    /**
     * Insertion code.
     * @return DatabaseEndInsCode
     */
    public DatabaseEndInsCode getDatabaseEndInsCode() {
        return (DatabaseEndInsCode) (isText ? textFields.computeIfAbsent("database_end_ins_code",
                DatabaseEndInsCode::new) : getBinaryColumn("database_end_ins_code"));
    }
}
