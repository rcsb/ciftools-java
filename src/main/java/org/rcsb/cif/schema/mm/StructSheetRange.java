package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SHEET_RANGE category record details
 * about the residue ranges that form a beta-sheet. Residues are
 * included in a range if they made beta-sheet-type hydrogen-bonding
 * interactions with at least one adjacent strand and if there are
 * at least two residues in the range.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheetRange extends DelegatingCategory {
    public StructSheetRange(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "beg_label_asym_id":
                return getBegLabelAsymId();
            case "beg_label_comp_id":
                return getBegLabelCompId();
            case "beg_label_seq_id":
                return getBegLabelSeqId();
            case "end_label_asym_id":
                return getEndLabelAsymId();
            case "end_label_comp_id":
                return getEndLabelCompId();
            case "end_label_seq_id":
                return getEndLabelSeqId();
            case "beg_auth_asym_id":
                return getBegAuthAsymId();
            case "beg_auth_comp_id":
                return getBegAuthCompId();
            case "beg_auth_seq_id":
                return getBegAuthSeqId();
            case "end_auth_asym_id":
                return getEndAuthAsymId();
            case "end_auth_comp_id":
                return getEndAuthCompId();
            case "end_auth_seq_id":
                return getEndAuthSeqId();
            case "id":
                return getId();
            case "sheet_id":
                return getSheetId();
            case "symmetry":
                return getSymmetry();
            case "pdbx_beg_PDB_ins_code":
                return getPdbxBegPDBInsCode();
            case "pdbx_end_PDB_ins_code":
                return getPdbxEndPDBInsCode();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("beg_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("end_label_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("beg_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("beg_auth_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("end_auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("end_auth_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
     * Describes the symmetry operation that should be applied to the
     * residues delimited by the start and end designators in
     * order to generate the appropriate strand in this sheet.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range begins.  Insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxBegPDBInsCode() {
        return delegate.getColumn("pdbx_beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * beta sheet range ends. Insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxEndPDBInsCode() {
        return delegate.getColumn("pdbx_end_PDB_ins_code", DelegatingStrColumn::new);
    }

}