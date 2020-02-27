package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SHEET_HBOND category record details
 * about the hydrogen bonding between residue ranges in a beta-
 * sheet. It is necessary to treat hydrogen bonding independently
 * of the designation of ranges, because the hydrogen bonding may
 * begin in different places for the interactions of a given strand
 * with the one preceding it and the one following it in the sheet.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructSheetHbond extends BaseCategory {
    public StructSheetHbond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheetHbond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSheetHbond(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1BegLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_beg_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_beg_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange1BegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_1_beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_1_beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1EndLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_end_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_end_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange1EndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_1_end_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_1_end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2BegLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_beg_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_beg_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange2BegLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_2_beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_2_beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2EndLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_end_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_end_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange2EndLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_2_end_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_2_end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1BegAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_beg_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_beg_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1BegAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_1_beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1EndAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_end_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_end_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1EndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_1_end_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2BegAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_beg_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_beg_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2BegAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_2_beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2EndAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_end_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_end_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2EndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_2_end_auth_seq_id"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_id_1", StrColumn::new) :
                getBinaryColumn("range_id_1"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_id_2", StrColumn::new) :
                getBinaryColumn("range_id_2"));
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
     * Pointer to _atom_site.auth_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_beg_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.auth_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_beg_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_end_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_end_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_beg_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_beg_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_beg_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_end_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_end_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_range_1_end_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_beg_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_beg_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_beg_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_end_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_end_label_asym_id"));
    }

    /**
     * Place holder for PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_range_2_end_label_ins_code"));
    }
}
