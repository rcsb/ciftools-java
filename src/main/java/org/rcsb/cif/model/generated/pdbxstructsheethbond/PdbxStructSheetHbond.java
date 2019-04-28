package org.rcsb.cif.model.generated.pdbxstructsheethbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructSheetHbond extends BaseCategory {
    public PdbxStructSheetHbond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructSheetHbond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructSheetHbond(String name) {
        super(name);
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
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Range1LabelAtomId
     */
    public Range1LabelAtomId getRange1LabelAtomId() {
        return (Range1LabelAtomId) (isText ? textFields.computeIfAbsent("range_1_label_atom_id",
                Range1LabelAtomId::new) : getBinaryColumn("range_1_label_atom_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range1LabelSeqId
     */
    public Range1LabelSeqId getRange1LabelSeqId() {
        return (Range1LabelSeqId) (isText ? textFields.computeIfAbsent("range_1_label_seq_id",
                Range1LabelSeqId::new) : getBinaryColumn("range_1_label_seq_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Range1LabelCompId
     */
    public Range1LabelCompId getRange1LabelCompId() {
        return (Range1LabelCompId) (isText ? textFields.computeIfAbsent("range_1_label_comp_id",
                Range1LabelCompId::new) : getBinaryColumn("range_1_label_comp_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Range1LabelAsymId
     */
    public Range1LabelAsymId getRange1LabelAsymId() {
        return (Range1LabelAsymId) (isText ? textFields.computeIfAbsent("range_1_label_asym_id",
                Range1LabelAsymId::new) : getBinaryColumn("range_1_label_asym_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range1AuthAtomId
     */
    public Range1AuthAtomId getRange1AuthAtomId() {
        return (Range1AuthAtomId) (isText ? textFields.computeIfAbsent("range_1_auth_atom_id",
                Range1AuthAtomId::new) : getBinaryColumn("range_1_auth_atom_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range1AuthSeqId
     */
    public Range1AuthSeqId getRange1AuthSeqId() {
        return (Range1AuthSeqId) (isText ? textFields.computeIfAbsent("range_1_auth_seq_id",
                Range1AuthSeqId::new) : getBinaryColumn("range_1_auth_seq_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return Range1AuthCompId
     */
    public Range1AuthCompId getRange1AuthCompId() {
        return (Range1AuthCompId) (isText ? textFields.computeIfAbsent("range_1_auth_comp_id",
                Range1AuthCompId::new) : getBinaryColumn("range_1_auth_comp_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return Range1AuthAsymId
     */
    public Range1AuthAsymId getRange1AuthAsymId() {
        return (Range1AuthAsymId) (isText ? textFields.computeIfAbsent("range_1_auth_asym_id",
                Range1AuthAsymId::new) : getBinaryColumn("range_1_auth_asym_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Range1PDBInsCode
     */
    public Range1PDBInsCode getRange1PDBInsCode() {
        return (Range1PDBInsCode) (isText ? textFields.computeIfAbsent("range_1_PDB_ins_code",
                Range1PDBInsCode::new) : getBinaryColumn("range_1_PDB_ins_code"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return Range2LabelAtomId
     */
    public Range2LabelAtomId getRange2LabelAtomId() {
        return (Range2LabelAtomId) (isText ? textFields.computeIfAbsent("range_2_label_atom_id",
                Range2LabelAtomId::new) : getBinaryColumn("range_2_label_atom_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Range2LabelSeqId
     */
    public Range2LabelSeqId getRange2LabelSeqId() {
        return (Range2LabelSeqId) (isText ? textFields.computeIfAbsent("range_2_label_seq_id",
                Range2LabelSeqId::new) : getBinaryColumn("range_2_label_seq_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Range2LabelCompId
     */
    public Range2LabelCompId getRange2LabelCompId() {
        return (Range2LabelCompId) (isText ? textFields.computeIfAbsent("range_2_label_comp_id",
                Range2LabelCompId::new) : getBinaryColumn("range_2_label_comp_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Range2LabelAsymId
     */
    public Range2LabelAsymId getRange2LabelAsymId() {
        return (Range2LabelAsymId) (isText ? textFields.computeIfAbsent("range_2_label_asym_id",
                Range2LabelAsymId::new) : getBinaryColumn("range_2_label_asym_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return Range2AuthAtomId
     */
    public Range2AuthAtomId getRange2AuthAtomId() {
        return (Range2AuthAtomId) (isText ? textFields.computeIfAbsent("range_2_auth_atom_id",
                Range2AuthAtomId::new) : getBinaryColumn("range_2_auth_atom_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return Range2AuthSeqId
     */
    public Range2AuthSeqId getRange2AuthSeqId() {
        return (Range2AuthSeqId) (isText ? textFields.computeIfAbsent("range_2_auth_seq_id",
                Range2AuthSeqId::new) : getBinaryColumn("range_2_auth_seq_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return Range2AuthCompId
     */
    public Range2AuthCompId getRange2AuthCompId() {
        return (Range2AuthCompId) (isText ? textFields.computeIfAbsent("range_2_auth_comp_id",
                Range2AuthCompId::new) : getBinaryColumn("range_2_auth_comp_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return Range2AuthAsymId
     */
    public Range2AuthAsymId getRange2AuthAsymId() {
        return (Range2AuthAsymId) (isText ? textFields.computeIfAbsent("range_2_auth_asym_id",
                Range2AuthAsymId::new) : getBinaryColumn("range_2_auth_asym_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Range2PDBInsCode
     */
    public Range2PDBInsCode getRange2PDBInsCode() {
        return (Range2PDBInsCode) (isText ? textFields.computeIfAbsent("range_2_PDB_ins_code",
                Range2PDBInsCode::new) : getBinaryColumn("range_2_PDB_ins_code"));
    }
}
