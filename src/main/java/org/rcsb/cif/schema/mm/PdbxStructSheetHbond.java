package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
 * about the hydrogen bonding between residue ranges in a beta sheet.
 * This category is provided for cases where only a single hydrogen
 * bond is used to register the two residue ranges.   Category
 * STRUCT_SHEET_HBOND should be used when the initial and terminal
 * hydrogen bonds for strand pair are known.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructSheetHbond extends DelegatingCategory {
    public PdbxStructSheetHbond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "range_id_1":
                return getRangeId1();
            case "range_id_2":
                return getRangeId2();
            case "sheet_id":
                return getSheetId();
            case "range_1_label_atom_id":
                return getRange1LabelAtomId();
            case "range_1_label_seq_id":
                return getRange1LabelSeqId();
            case "range_1_label_comp_id":
                return getRange1LabelCompId();
            case "range_1_label_asym_id":
                return getRange1LabelAsymId();
            case "range_1_auth_atom_id":
                return getRange1AuthAtomId();
            case "range_1_auth_seq_id":
                return getRange1AuthSeqId();
            case "range_1_auth_comp_id":
                return getRange1AuthCompId();
            case "range_1_auth_asym_id":
                return getRange1AuthAsymId();
            case "range_1_PDB_ins_code":
                return getRange1PDBInsCode();
            case "range_2_label_atom_id":
                return getRange2LabelAtomId();
            case "range_2_label_seq_id":
                return getRange2LabelSeqId();
            case "range_2_label_comp_id":
                return getRange2LabelCompId();
            case "range_2_label_asym_id":
                return getRange2LabelAsymId();
            case "range_2_auth_atom_id":
                return getRange2AuthAtomId();
            case "range_2_auth_seq_id":
                return getRange2AuthSeqId();
            case "range_2_auth_comp_id":
                return getRange2AuthCompId();
            case "range_2_auth_asym_id":
                return getRange2AuthAsymId();
            case "range_2_PDB_ins_code":
                return getRange2PDBInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId1() {
        return delegate.getColumn("range_id_1", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId2() {
        return delegate.getColumn("range_id_2", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return StrColumn
     */
    public StrColumn getSheetId() {
        return delegate.getColumn("sheet_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_1_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_PDB_ins_code", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_2_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_PDB_ins_code", DelegatingStrColumn::new);
    }

}