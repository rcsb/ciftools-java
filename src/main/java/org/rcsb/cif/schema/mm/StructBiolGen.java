package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_BIOL_GEN category record details about
 * the generation of each biological unit. The STRUCT_BIOL_GEN
 * data items provide the specifications of the components that
 * constitute that biological unit, which may include symmetry
 * elements.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructBiolGen extends DelegatingCategory {
    public StructBiolGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "asym_id":
                return getAsymId();
            case "biol_id":
                return getBiolId();
            case "details":
                return getDetails();
            case "symmetry":
                return getSymmetry();
            case "pdbx_full_symmetry_operation":
                return getPdbxFullSymmetryOperation();
            case "pdbx_PDB_order":
                return getPdbxPDBOrder();
            case "pdbx_new_asym_id":
                return getPdbxNewAsymId();
            case "pdbx_new_pdb_asym_id":
                return getPdbxNewPdbAsymId();
            case "pdbx_color_red":
                return getPdbxColorRed();
            case "pdbx_color_green":
                return getPdbxColorGreen();
            case "pdbx_color_blue":
                return getPdbxColorBlue();
            case "pdbx_after_begin_residue_no":
                return getPdbxAfterBeginResidueNo();
            case "pdbx_after_end_residue_no":
                return getPdbxAfterEndResidueNo();
            case "pdbx_before_begin_residue_no":
                return getPdbxBeforeBeginResidueNo();
            case "pdbx_before_end_residue_no":
                return getPdbxBeforeEndResidueNo();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM
     * category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the biological structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_biol_gen.asym_id to generate a
     * portion of the biological structure.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * This item expresses category _struct_biol_gen.symmetry
     * on an X, Y and Z basis.
     * @return StrColumn
     */
    public StrColumn getPdbxFullSymmetryOperation() {
        return delegate.getColumn("pdbx_full_symmetry_operation", DelegatingStrColumn::new);
    }

    /**
     * An ordering index used to reproduce the presentation of
     * chain order in the original PDB format data files.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBOrder() {
        return delegate.getColumn("pdbx_PDB_order", DelegatingIntColumn::new);
    }

    /**
     * This category gives the NDB strand ids for the complete
     * biomolecule after it is generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNewAsymId() {
        return delegate.getColumn("pdbx_new_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the PDB strand ID of the strand which will be
     * generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNewPdbAsymId() {
        return delegate.getColumn("pdbx_new_pdb_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorRed() {
        return delegate.getColumn("pdbx_color_red", DelegatingFloatColumn::new);
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorGreen() {
        return delegate.getColumn("pdbx_color_green", DelegatingFloatColumn::new);
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorBlue() {
        return delegate.getColumn("pdbx_color_blue", DelegatingFloatColumn::new);
    }

    /**
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxAfterBeginResidueNo() {
        return delegate.getColumn("pdbx_after_begin_residue_no", DelegatingStrColumn::new);
    }

    /**
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxAfterEndResidueNo() {
        return delegate.getColumn("pdbx_after_end_residue_no", DelegatingStrColumn::new);
    }

    /**
     * The number of the first residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxBeforeBeginResidueNo() {
        return delegate.getColumn("pdbx_before_begin_residue_no", DelegatingStrColumn::new);
    }

    /**
     * The number of the last residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxBeforeEndResidueNo() {
        return delegate.getColumn("pdbx_before_end_residue_no", DelegatingStrColumn::new);
    }

}