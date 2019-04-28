package org.rcsb.cif.model.generated.pdbxdatabasepdbmaster;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumRemark
     */
    public NumRemark getNumRemark() {
        return (NumRemark) (isText ? textFields.computeIfAbsent("num_remark",
                NumRemark::new) : getBinaryColumn("num_remark"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumFtnote
     */
    public NumFtnote getNumFtnote() {
        return (NumFtnote) (isText ? textFields.computeIfAbsent("num_ftnote",
                NumFtnote::new) : getBinaryColumn("num_ftnote"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumHet
     */
    public NumHet getNumHet() {
        return (NumHet) (isText ? textFields.computeIfAbsent("num_het",
                NumHet::new) : getBinaryColumn("num_het"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumHelix
     */
    public NumHelix getNumHelix() {
        return (NumHelix) (isText ? textFields.computeIfAbsent("num_helix",
                NumHelix::new) : getBinaryColumn("num_helix"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumSheet
     */
    public NumSheet getNumSheet() {
        return (NumSheet) (isText ? textFields.computeIfAbsent("num_sheet",
                NumSheet::new) : getBinaryColumn("num_sheet"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumTurn
     */
    public NumTurn getNumTurn() {
        return (NumTurn) (isText ? textFields.computeIfAbsent("num_turn",
                NumTurn::new) : getBinaryColumn("num_turn"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumSite
     */
    public NumSite getNumSite() {
        return (NumSite) (isText ? textFields.computeIfAbsent("num_site",
                NumSite::new) : getBinaryColumn("num_site"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumTrans
     */
    public NumTrans getNumTrans() {
        return (NumTrans) (isText ? textFields.computeIfAbsent("num_trans",
                NumTrans::new) : getBinaryColumn("num_trans"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumCoord
     */
    public NumCoord getNumCoord() {
        return (NumCoord) (isText ? textFields.computeIfAbsent("num_coord",
                NumCoord::new) : getBinaryColumn("num_coord"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumTer
     */
    public NumTer getNumTer() {
        return (NumTer) (isText ? textFields.computeIfAbsent("num_ter",
                NumTer::new) : getBinaryColumn("num_ter"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumConect
     */
    public NumConect getNumConect() {
        return (NumConect) (isText ? textFields.computeIfAbsent("num_conect",
                NumConect::new) : getBinaryColumn("num_conect"));
    }

    /**
     * The number of PDB records of a particular type.
     * @return NumSeqres
     */
    public NumSeqres getNumSeqres() {
        return (NumSeqres) (isText ? textFields.computeIfAbsent("num_seqres",
                NumSeqres::new) : getBinaryColumn("num_seqres"));
    }
}
