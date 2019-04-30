package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_DATABASE_PDB_MASTER category provides placeholders
 * for the count of various PDB record types.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabasePDBMaster extends BaseCategory {
    public PdbxDatabasePDBMaster(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabasePDBMaster(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabasePDBMaster(String name) {
        super(name);
    }

    /**
     * A link to _ENTRY.id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumRemark() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_remark", IntColumn::new) :
                getBinaryColumn("num_remark"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumFtnote() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_ftnote", IntColumn::new) :
                getBinaryColumn("num_ftnote"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumHet() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_het", IntColumn::new) :
                getBinaryColumn("num_het"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumHelix() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_helix", IntColumn::new) :
                getBinaryColumn("num_helix"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSheet() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_sheet", IntColumn::new) :
                getBinaryColumn("num_sheet"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTurn() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_turn", IntColumn::new) :
                getBinaryColumn("num_turn"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSite() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_site", IntColumn::new) :
                getBinaryColumn("num_site"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTrans() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_trans", IntColumn::new) :
                getBinaryColumn("num_trans"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumCoord() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_coord", IntColumn::new) :
                getBinaryColumn("num_coord"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumTer() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_ter", IntColumn::new) :
                getBinaryColumn("num_ter"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumConect() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_conect", IntColumn::new) :
                getBinaryColumn("num_conect"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return IntColumn
     */
    public IntColumn getNumSeqres() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_seqres", IntColumn::new) :
                getBinaryColumn("num_seqres"));
    }
}
