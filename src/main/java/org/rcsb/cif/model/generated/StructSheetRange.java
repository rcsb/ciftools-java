package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SHEET_RANGE category record details
 * about the residue ranges that form a beta-sheet. Residues are
 * included in a range if they made beta-sheet-type hydrogen-bonding
 * interactions with at least one adjacent strand and if there are
 * at least two residues in the range.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("beg_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("beg_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_asym_id", StrColumn::new) :
                getBinaryColumn("end_label_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_comp_id", StrColumn::new) :
                getBinaryColumn("end_label_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_label_seq_id", IntColumn::new) :
                getBinaryColumn("end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("beg_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("beg_auth_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", IntColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("end_auth_asym_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_comp_id", StrColumn::new) :
                getBinaryColumn("end_auth_comp_id"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta-sheet range ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", IntColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * The value of _struct_sheet_range.id must uniquely identify a
     * range in a given sheet in the STRUCT_SHEET_RANGE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return StrColumn
     */
    public StrColumn getSheetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sheet_id", StrColumn::new) :
                getBinaryColumn("sheet_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * residues delimited by the start and end designators in
     * order to generate the appropriate strand in this sheet.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry", StrColumn::new) :
                getBinaryColumn("symmetry"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range begins.  Insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxBegPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_beg_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range ends. Insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxEndPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_end_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_end_PDB_ins_code"));
    }
}
