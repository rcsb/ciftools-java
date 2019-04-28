package org.rcsb.cif.model.generated.structsheethbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Range1BegLabelAtomId
     */
    public Range1BegLabelAtomId getRange1BegLabelAtomId() {
        return (Range1BegLabelAtomId) (isText ? textFields.computeIfAbsent("range_1_beg_label_atom_id",
                Range1BegLabelAtomId::new) : getBinaryColumn("range_1_beg_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range1BegLabelSeqId
     */
    public Range1BegLabelSeqId getRange1BegLabelSeqId() {
        return (Range1BegLabelSeqId) (isText ? textFields.computeIfAbsent("range_1_beg_label_seq_id",
                Range1BegLabelSeqId::new) : getBinaryColumn("range_1_beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Range1EndLabelAtomId
     */
    public Range1EndLabelAtomId getRange1EndLabelAtomId() {
        return (Range1EndLabelAtomId) (isText ? textFields.computeIfAbsent("range_1_end_label_atom_id",
                Range1EndLabelAtomId::new) : getBinaryColumn("range_1_end_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range1EndLabelSeqId
     */
    public Range1EndLabelSeqId getRange1EndLabelSeqId() {
        return (Range1EndLabelSeqId) (isText ? textFields.computeIfAbsent("range_1_end_label_seq_id",
                Range1EndLabelSeqId::new) : getBinaryColumn("range_1_end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Range2BegLabelAtomId
     */
    public Range2BegLabelAtomId getRange2BegLabelAtomId() {
        return (Range2BegLabelAtomId) (isText ? textFields.computeIfAbsent("range_2_beg_label_atom_id",
                Range2BegLabelAtomId::new) : getBinaryColumn("range_2_beg_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range2BegLabelSeqId
     */
    public Range2BegLabelSeqId getRange2BegLabelSeqId() {
        return (Range2BegLabelSeqId) (isText ? textFields.computeIfAbsent("range_2_beg_label_seq_id",
                Range2BegLabelSeqId::new) : getBinaryColumn("range_2_beg_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Range2EndLabelAtomId
     */
    public Range2EndLabelAtomId getRange2EndLabelAtomId() {
        return (Range2EndLabelAtomId) (isText ? textFields.computeIfAbsent("range_2_end_label_atom_id",
                Range2EndLabelAtomId::new) : getBinaryColumn("range_2_end_label_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range2EndLabelSeqId
     */
    public Range2EndLabelSeqId getRange2EndLabelSeqId() {
        return (Range2EndLabelSeqId) (isText ? textFields.computeIfAbsent("range_2_end_label_seq_id",
                Range2EndLabelSeqId::new) : getBinaryColumn("range_2_end_label_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range1BegAuthAtomId
     */
    public Range1BegAuthAtomId getRange1BegAuthAtomId() {
        return (Range1BegAuthAtomId) (isText ? textFields.computeIfAbsent("range_1_beg_auth_atom_id",
                Range1BegAuthAtomId::new) : getBinaryColumn("range_1_beg_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range1BegAuthSeqId
     */
    public Range1BegAuthSeqId getRange1BegAuthSeqId() {
        return (Range1BegAuthSeqId) (isText ? textFields.computeIfAbsent("range_1_beg_auth_seq_id",
                Range1BegAuthSeqId::new) : getBinaryColumn("range_1_beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range1EndAuthAtomId
     */
    public Range1EndAuthAtomId getRange1EndAuthAtomId() {
        return (Range1EndAuthAtomId) (isText ? textFields.computeIfAbsent("range_1_end_auth_atom_id",
                Range1EndAuthAtomId::new) : getBinaryColumn("range_1_end_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the first
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range1EndAuthSeqId
     */
    public Range1EndAuthSeqId getRange1EndAuthSeqId() {
        return (Range1EndAuthSeqId) (isText ? textFields.computeIfAbsent("range_1_end_auth_seq_id",
                Range1EndAuthSeqId::new) : getBinaryColumn("range_1_end_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range2BegAuthAtomId
     */
    public Range2BegAuthAtomId getRange2BegAuthAtomId() {
        return (Range2BegAuthAtomId) (isText ? textFields.computeIfAbsent("range_2_beg_auth_atom_id",
                Range2BegAuthAtomId::new) : getBinaryColumn("range_2_beg_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the first hydrogen bond between two residue ranges
     * in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range2BegAuthSeqId
     */
    public Range2BegAuthSeqId getRange2BegAuthSeqId() {
        return (Range2BegAuthSeqId) (isText ? textFields.computeIfAbsent("range_2_beg_auth_seq_id",
                Range2BegAuthSeqId::new) : getBinaryColumn("range_2_beg_auth_seq_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range2EndAuthAtomId
     */
    public Range2EndAuthAtomId getRange2EndAuthAtomId() {
        return (Range2EndAuthAtomId) (isText ? textFields.computeIfAbsent("range_2_end_auth_atom_id",
                Range2EndAuthAtomId::new) : getBinaryColumn("range_2_end_auth_atom_id"));
    }

    /**
     * A component of the identifier for the residue for the second
     * partner of the last hydrogen bond between two residue ranges in
     * a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range2EndAuthSeqId
     */
    public Range2EndAuthSeqId getRange2EndAuthSeqId() {
        return (Range2EndAuthSeqId) (isText ? textFields.computeIfAbsent("range_2_end_auth_seq_id",
                Range2EndAuthSeqId::new) : getBinaryColumn("range_2_end_auth_seq_id"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return RangeId1
     */
    public RangeId1 getRangeId1() {
        return (RangeId1) (isText ? textFields.computeIfAbsent("range_id_1",
                RangeId1::new) : getBinaryColumn("range_id_1"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return RangeId2
     */
    public RangeId2 getRangeId2() {
        return (RangeId2) (isText ? textFields.computeIfAbsent("range_id_2",
                RangeId2::new) : getBinaryColumn("range_id_2"));
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return SheetId
     */
    public SheetId getSheetId() {
        return (SheetId) (isText ? textFields.computeIfAbsent("sheet_id",
                SheetId::new) : getBinaryColumn("sheet_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id
     * @return PdbxRange1BegAuthCompId
     */
    public PdbxRange1BegAuthCompId getPdbxRange1BegAuthCompId() {
        return (PdbxRange1BegAuthCompId) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_auth_comp_id",
                PdbxRange1BegAuthCompId::new) : getBinaryColumn("pdbx_range_1_beg_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.auth_asym_id.
     * @return PdbxRange1BegAuthAsymId
     */
    public PdbxRange1BegAuthAsymId getPdbxRange1BegAuthAsymId() {
        return (PdbxRange1BegAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_auth_asym_id",
                PdbxRange1BegAuthAsymId::new) : getBinaryColumn("pdbx_range_1_beg_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return PdbxRange1EndAuthCompId
     */
    public PdbxRange1EndAuthCompId getPdbxRange1EndAuthCompId() {
        return (PdbxRange1EndAuthCompId) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_auth_comp_id",
                PdbxRange1EndAuthCompId::new) : getBinaryColumn("pdbx_range_1_end_auth_comp_id"));
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return PdbxRange1EndAuthAsymId
     */
    public PdbxRange1EndAuthAsymId getPdbxRange1EndAuthAsymId() {
        return (PdbxRange1EndAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_auth_asym_id",
                PdbxRange1EndAuthAsymId::new) : getBinaryColumn("pdbx_range_1_end_auth_asym_id"));
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return PdbxRange1BegLabelCompId
     */
    public PdbxRange1BegLabelCompId getPdbxRange1BegLabelCompId() {
        return (PdbxRange1BegLabelCompId) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_label_comp_id",
                PdbxRange1BegLabelCompId::new) : getBinaryColumn("pdbx_range_1_beg_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return PdbxRange1BegLabelAsymId
     */
    public PdbxRange1BegLabelAsymId getPdbxRange1BegLabelAsymId() {
        return (PdbxRange1BegLabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_label_asym_id",
                PdbxRange1BegLabelAsymId::new) : getBinaryColumn("pdbx_range_1_beg_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return PdbxRange1BegPDBInsCode
     */
    public PdbxRange1BegPDBInsCode getPdbxRange1BegPDBInsCode() {
        return (PdbxRange1BegPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_range_1_beg_PDB_ins_code",
                PdbxRange1BegPDBInsCode::new) : getBinaryColumn("pdbx_range_1_beg_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return PdbxRange1EndLabelCompId
     */
    public PdbxRange1EndLabelCompId getPdbxRange1EndLabelCompId() {
        return (PdbxRange1EndLabelCompId) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_label_comp_id",
                PdbxRange1EndLabelCompId::new) : getBinaryColumn("pdbx_range_1_end_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return PdbxRange1EndLabelAsymId
     */
    public PdbxRange1EndLabelAsymId getPdbxRange1EndLabelAsymId() {
        return (PdbxRange1EndLabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_label_asym_id",
                PdbxRange1EndLabelAsymId::new) : getBinaryColumn("pdbx_range_1_end_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return PdbxRange1EndPDBInsCode
     */
    public PdbxRange1EndPDBInsCode getPdbxRange1EndPDBInsCode() {
        return (PdbxRange1EndPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_range_1_end_PDB_ins_code",
                PdbxRange1EndPDBInsCode::new) : getBinaryColumn("pdbx_range_1_end_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return PdbxRange2BegLabelCompId
     */
    public PdbxRange2BegLabelCompId getPdbxRange2BegLabelCompId() {
        return (PdbxRange2BegLabelCompId) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_label_comp_id",
                PdbxRange2BegLabelCompId::new) : getBinaryColumn("pdbx_range_2_beg_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return PdbxRange2BegLabelAsymId
     */
    public PdbxRange2BegLabelAsymId getPdbxRange2BegLabelAsymId() {
        return (PdbxRange2BegLabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_label_asym_id",
                PdbxRange2BegLabelAsymId::new) : getBinaryColumn("pdbx_range_2_beg_label_asym_id"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return PdbxRange2BegPDBInsCode
     */
    public PdbxRange2BegPDBInsCode getPdbxRange2BegPDBInsCode() {
        return (PdbxRange2BegPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_range_2_beg_PDB_ins_code",
                PdbxRange2BegPDBInsCode::new) : getBinaryColumn("pdbx_range_2_beg_PDB_ins_code"));
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return PdbxRange2EndLabelCompId
     */
    public PdbxRange2EndLabelCompId getPdbxRange2EndLabelCompId() {
        return (PdbxRange2EndLabelCompId) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_comp_id",
                PdbxRange2EndLabelCompId::new) : getBinaryColumn("pdbx_range_2_end_label_comp_id"));
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return PdbxRange2EndLabelAsymId
     */
    public PdbxRange2EndLabelAsymId getPdbxRange2EndLabelAsymId() {
        return (PdbxRange2EndLabelAsymId) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_asym_id",
                PdbxRange2EndLabelAsymId::new) : getBinaryColumn("pdbx_range_2_end_label_asym_id"));
    }

    /**
     * Place holder for PDB insertion code.
     * @return PdbxRange2EndLabelInsCode
     */
    public PdbxRange2EndLabelInsCode getPdbxRange2EndLabelInsCode() {
        return (PdbxRange2EndLabelInsCode) (isText ? textFields.computeIfAbsent("pdbx_range_2_end_label_ins_code",
                PdbxRange2EndLabelInsCode::new) : getBinaryColumn("pdbx_range_2_end_label_ins_code"));
    }
}
