package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SHEET_HBOND category record details
 * about the hydrogen bonding between residue ranges in a beta-
 * sheet. It is necessary to treat hydrogen bonding independently
 * of the designation of ranges, because the hydrogen bonding may
 * begin in different places for the interactions of a given strand
 * with the one preceding it and the one following it in the sheet.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheetHbond extends DelegatingCategory {
    public StructSheetHbond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "range_1_beg_label_atom_id":
                return getRange1BegLabelAtomId();
            case "range_1_beg_label_seq_id":
                return getRange1BegLabelSeqId();
            case "range_1_end_label_atom_id":
                return getRange1EndLabelAtomId();
            case "range_1_end_label_seq_id":
                return getRange1EndLabelSeqId();
            case "range_2_beg_label_atom_id":
                return getRange2BegLabelAtomId();
            case "range_2_beg_label_seq_id":
                return getRange2BegLabelSeqId();
            case "range_2_end_label_atom_id":
                return getRange2EndLabelAtomId();
            case "range_2_end_label_seq_id":
                return getRange2EndLabelSeqId();
            case "range_1_beg_auth_atom_id":
                return getRange1BegAuthAtomId();
            case "range_1_beg_auth_seq_id":
                return getRange1BegAuthSeqId();
            case "range_1_end_auth_atom_id":
                return getRange1EndAuthAtomId();
            case "range_1_end_auth_seq_id":
                return getRange1EndAuthSeqId();
            case "range_2_beg_auth_atom_id":
                return getRange2BegAuthAtomId();
            case "range_2_beg_auth_seq_id":
                return getRange2BegAuthSeqId();
            case "range_2_end_auth_atom_id":
                return getRange2EndAuthAtomId();
            case "range_2_end_auth_seq_id":
                return getRange2EndAuthSeqId();
            case "range_id_1":
                return getRangeId1();
            case "range_id_2":
                return getRangeId2();
            case "sheet_id":
                return getSheetId();
            case "pdbx_range_1_beg_auth_comp_id":
                return getPdbxRange1BegAuthCompId();
            case "pdbx_range_1_beg_auth_asym_id":
                return getPdbxRange1BegAuthAsymId();
            case "pdbx_range_1_end_auth_comp_id":
                return getPdbxRange1EndAuthCompId();
            case "pdbx_range_1_end_auth_asym_id":
                return getPdbxRange1EndAuthAsymId();
            case "pdbx_range_1_beg_label_comp_id":
                return getPdbxRange1BegLabelCompId();
            case "pdbx_range_1_beg_label_asym_id":
                return getPdbxRange1BegLabelAsymId();
            case "pdbx_range_1_beg_PDB_ins_code":
                return getPdbxRange1BegPDBInsCode();
            case "pdbx_range_1_end_label_comp_id":
                return getPdbxRange1EndLabelCompId();
            case "pdbx_range_1_end_label_asym_id":
                return getPdbxRange1EndLabelAsymId();
            case "pdbx_range_1_end_PDB_ins_code":
                return getPdbxRange1EndPDBInsCode();
            case "pdbx_range_2_beg_label_comp_id":
                return getPdbxRange2BegLabelCompId();
            case "pdbx_range_2_beg_label_asym_id":
                return getPdbxRange2BegLabelAsymId();
            case "pdbx_range_2_beg_PDB_ins_code":
                return getPdbxRange2BegPDBInsCode();
            case "pdbx_range_2_end_label_comp_id":
                return getPdbxRange2EndLabelCompId();
            case "pdbx_range_2_end_label_asym_id":
                return getPdbxRange2EndLabelAsymId();
            case "pdbx_range_2_end_label_ins_code":
                return getPdbxRange2EndLabelInsCode();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("range_1_beg_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_beg_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_1_end_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_end_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_2_beg_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_beg_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_2_end_label_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_end_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("range_1_beg_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_beg_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_end_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_1_end_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_beg_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_beg_auth_seq_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_end_auth_atom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("range_2_end_auth_seq_id", DelegatingStrColumn::new);
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
     * Pointer to _atom_site.auth_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegAuthCompId() {
        return delegate.getColumn("pdbx_range_1_beg_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegAuthAsymId() {
        return delegate.getColumn("pdbx_range_1_beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndAuthCompId() {
        return delegate.getColumn("pdbx_range_1_end_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndAuthAsymId() {
        return delegate.getColumn("pdbx_range_1_end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegLabelCompId() {
        return delegate.getColumn("pdbx_range_1_beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegLabelAsymId() {
        return delegate.getColumn("pdbx_range_1_beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1BegPDBInsCode() {
        return delegate.getColumn("pdbx_range_1_beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndLabelCompId() {
        return delegate.getColumn("pdbx_range_1_end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndLabelAsymId() {
        return delegate.getColumn("pdbx_range_1_end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange1EndPDBInsCode() {
        return delegate.getColumn("pdbx_range_1_end_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegLabelCompId() {
        return delegate.getColumn("pdbx_range_2_beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegLabelAsymId() {
        return delegate.getColumn("pdbx_range_2_beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2BegPDBInsCode() {
        return delegate.getColumn("pdbx_range_2_beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelCompId() {
        return delegate.getColumn("pdbx_range_2_end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelAsymId() {
        return delegate.getColumn("pdbx_range_2_end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Place holder for PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxRange2EndLabelInsCode() {
        return delegate.getColumn("pdbx_range_2_end_label_ins_code", DelegatingStrColumn::new);
    }

}