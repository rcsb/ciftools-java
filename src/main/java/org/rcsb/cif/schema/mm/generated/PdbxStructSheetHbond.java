package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
 * about the hydrogen bonding between residue ranges in a beta sheet.
 * This category is provided for cases where only a single hydrogen
 * bond is used to register the two residue ranges.   Category
 * STRUCT_SHEET_HBOND should be used when the initial and terminal
 * hydrogen bonds for strand pair are known.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_label_atom_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange1LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_1_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_1_label_seq_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_label_comp_id", StrColumn::new) :
                getBinaryColumn("range_1_label_comp_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_label_asym_id", StrColumn::new) :
                getBinaryColumn("range_1_label_asym_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_1_auth_atom_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_1_auth_seq_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_auth_comp_id", StrColumn::new) :
                getBinaryColumn("range_1_auth_comp_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_auth_asym_id", StrColumn::new) :
                getBinaryColumn("range_1_auth_asym_id"));
    }

    /**
     * A component of the residue identifier for the first partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange1PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_1_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("range_1_PDB_ins_code"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_label_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_label_atom_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getRange2LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("range_2_label_seq_id", IntColumn::new) :
                getBinaryColumn("range_2_label_seq_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_label_comp_id", StrColumn::new) :
                getBinaryColumn("range_2_label_comp_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_label_asym_id", StrColumn::new) :
                getBinaryColumn("range_2_label_asym_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2AuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_auth_atom_id", StrColumn::new) :
                getBinaryColumn("range_2_auth_atom_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2AuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_auth_seq_id", StrColumn::new) :
                getBinaryColumn("range_2_auth_seq_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2AuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_auth_comp_id", StrColumn::new) :
                getBinaryColumn("range_2_auth_comp_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2AuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_auth_asym_id", StrColumn::new) :
                getBinaryColumn("range_2_auth_asym_id"));
    }

    /**
     * A component of the residue identifier for the second partner of the
     * registration hydrogen bond between two residue ranges in a sheet.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getRange2PDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_2_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("range_2_PDB_ins_code"));
    }
}
