package org.rcsb.cif.model.structsheetrange;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheetRange extends BaseCategory {
    public StructSheetRange(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheetRange(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSheetRange(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? textFields.computeIfAbsent("beg_auth_seq_id",
                BegAuthSeqId::new) : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * The value of _struct_sheet_range.id must uniquely identify a
     * range in a given sheet in the STRUCT_SHEET_RANGE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range begins.  Insertion code.
     * @return PdbxBegPDBInsCode
     */
    public PdbxBegPDBInsCode getPdbxBegPDBInsCode() {
        return (PdbxBegPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_beg_PDB_ins_code",
                PdbxBegPDBInsCode::new) : getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range ends. Insertion code.
     * @return PdbxEndPDBInsCode
     */
    public PdbxEndPDBInsCode getPdbxEndPDBInsCode() {
        return (PdbxEndPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_end_PDB_ins_code",
                PdbxEndPDBInsCode::new) : getBinaryColumn("pdbx_end_PDB_ins_code"));
    }
}
