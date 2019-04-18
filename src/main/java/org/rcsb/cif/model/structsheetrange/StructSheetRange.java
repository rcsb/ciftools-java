package org.rcsb.cif.model.structsheetrange;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructSheetRange extends BaseCategory {
    public StructSheetRange(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheetRange(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return BegLabelAsymId
     */
    public BegLabelAsymId getBegLabelAsymId() {
        return (BegLabelAsymId) (isText ? getTextColumn("beg_label_asym_id") : getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return BegLabelCompId
     */
    public BegLabelCompId getBegLabelCompId() {
        return (BegLabelCompId) (isText ? getTextColumn("beg_label_comp_id") : getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return BegLabelSeqId
     */
    public BegLabelSeqId getBegLabelSeqId() {
        return (BegLabelSeqId) (isText ? getTextColumn("beg_label_seq_id") : getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return EndLabelAsymId
     */
    public EndLabelAsymId getEndLabelAsymId() {
        return (EndLabelAsymId) (isText ? getTextColumn("end_label_asym_id") : getBinaryColumn("end_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return EndLabelCompId
     */
    public EndLabelCompId getEndLabelCompId() {
        return (EndLabelCompId) (isText ? getTextColumn("end_label_comp_id") : getBinaryColumn("end_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return EndLabelSeqId
     */
    public EndLabelSeqId getEndLabelSeqId() {
        return (EndLabelSeqId) (isText ? getTextColumn("end_label_seq_id") : getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return BegAuthAsymId
     */
    public BegAuthAsymId getBegAuthAsymId() {
        return (BegAuthAsymId) (isText ? getTextColumn("beg_auth_asym_id") : getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return BegAuthCompId
     */
    public BegAuthCompId getBegAuthCompId() {
        return (BegAuthCompId) (isText ? getTextColumn("beg_auth_comp_id") : getBinaryColumn("beg_auth_comp_id"));
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
        return (BegAuthSeqId) (isText ? getTextColumn("beg_auth_seq_id") : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return EndAuthAsymId
     */
    public EndAuthAsymId getEndAuthAsymId() {
        return (EndAuthAsymId) (isText ? getTextColumn("end_auth_asym_id") : getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return EndAuthCompId
     */
    public EndAuthCompId getEndAuthCompId() {
        return (EndAuthCompId) (isText ? getTextColumn("end_auth_comp_id") : getBinaryColumn("end_auth_comp_id"));
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
        return (EndAuthSeqId) (isText ? getTextColumn("end_auth_seq_id") : getBinaryColumn("end_auth_seq_id"));
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
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return SheetId
     */
    public SheetId getSheetId() {
        return (SheetId) (isText ? getTextColumn("sheet_id") : getBinaryColumn("sheet_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range begins.  Insertion code.
     * @return PdbxBegPDBInsCode
     */
    public PdbxBegPDBInsCode getPdbxBegPDBInsCode() {
        return (PdbxBegPDBInsCode) (isText ? getTextColumn("pdbx_beg_PDB_ins_code") : getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range ends. Insertion code.
     * @return PdbxEndPDBInsCode
     */
    public PdbxEndPDBInsCode getPdbxEndPDBInsCode() {
        return (PdbxEndPDBInsCode) (isText ? getTextColumn("pdbx_end_PDB_ins_code") : getBinaryColumn("pdbx_end_PDB_ins_code"));
    }
}
