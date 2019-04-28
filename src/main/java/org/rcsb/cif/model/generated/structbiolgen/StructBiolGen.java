package org.rcsb.cif.model.generated.structbiolgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructBiolGen extends BaseCategory {
    public StructBiolGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructBiolGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructBiolGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM
     * category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return BiolId
     */
    public BiolId getBiolId() {
        return (BiolId) (isText ? textFields.computeIfAbsent("biol_id",
                BiolId::new) : getBinaryColumn("biol_id"));
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the biological structure.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_biol_gen.asym_id to generate a
     * portion of the biological structure.
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return (Symmetry) (isText ? textFields.computeIfAbsent("symmetry",
                Symmetry::new) : getBinaryColumn("symmetry"));
    }

    /**
     * 
     * This item expresses category _struct_biol_gen.symmetry
     * on an X, Y and Z basis.
     * @return PdbxFullSymmetryOperation
     */
    public PdbxFullSymmetryOperation getPdbxFullSymmetryOperation() {
        return (PdbxFullSymmetryOperation) (isText ? textFields.computeIfAbsent("pdbx_full_symmetry_operation",
                PdbxFullSymmetryOperation::new) : getBinaryColumn("pdbx_full_symmetry_operation"));
    }

    /**
     * An ordering index used to reproduce the presentation of
     * chain order in the original PDB format data files.
     * @return PdbxPDBOrder
     */
    public PdbxPDBOrder getPdbxPDBOrder() {
        return (PdbxPDBOrder) (isText ? textFields.computeIfAbsent("pdbx_PDB_order",
                PdbxPDBOrder::new) : getBinaryColumn("pdbx_PDB_order"));
    }

    /**
     * 
     * This category gives the NDB strand ids for the complete
     * biomolecule after it is generated.
     * @return PdbxNewAsymId
     */
    public PdbxNewAsymId getPdbxNewAsymId() {
        return (PdbxNewAsymId) (isText ? textFields.computeIfAbsent("pdbx_new_asym_id",
                PdbxNewAsymId::new) : getBinaryColumn("pdbx_new_asym_id"));
    }

    /**
     * This data item is the PDB strand ID of the strand which will be
     * generated.
     * @return PdbxNewPdbAsymId
     */
    public PdbxNewPdbAsymId getPdbxNewPdbAsymId() {
        return (PdbxNewPdbAsymId) (isText ? textFields.computeIfAbsent("pdbx_new_pdb_asym_id",
                PdbxNewPdbAsymId::new) : getBinaryColumn("pdbx_new_pdb_asym_id"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return PdbxColorRed
     */
    public PdbxColorRed getPdbxColorRed() {
        return (PdbxColorRed) (isText ? textFields.computeIfAbsent("pdbx_color_red",
                PdbxColorRed::new) : getBinaryColumn("pdbx_color_red"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return PdbxColorGreen
     */
    public PdbxColorGreen getPdbxColorGreen() {
        return (PdbxColorGreen) (isText ? textFields.computeIfAbsent("pdbx_color_green",
                PdbxColorGreen::new) : getBinaryColumn("pdbx_color_green"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return PdbxColorBlue
     */
    public PdbxColorBlue getPdbxColorBlue() {
        return (PdbxColorBlue) (isText ? textFields.computeIfAbsent("pdbx_color_blue",
                PdbxColorBlue::new) : getBinaryColumn("pdbx_color_blue"));
    }

    /**
     * 
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return PdbxAfterBeginResidueNo
     */
    public PdbxAfterBeginResidueNo getPdbxAfterBeginResidueNo() {
        return (PdbxAfterBeginResidueNo) (isText ? textFields.computeIfAbsent("pdbx_after_begin_residue_no",
                PdbxAfterBeginResidueNo::new) : getBinaryColumn("pdbx_after_begin_residue_no"));
    }

    /**
     * 
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return PdbxAfterEndResidueNo
     */
    public PdbxAfterEndResidueNo getPdbxAfterEndResidueNo() {
        return (PdbxAfterEndResidueNo) (isText ? textFields.computeIfAbsent("pdbx_after_end_residue_no",
                PdbxAfterEndResidueNo::new) : getBinaryColumn("pdbx_after_end_residue_no"));
    }

    /**
     * 
     * The number of the first residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return PdbxBeforeBeginResidueNo
     */
    public PdbxBeforeBeginResidueNo getPdbxBeforeBeginResidueNo() {
        return (PdbxBeforeBeginResidueNo) (isText ? textFields.computeIfAbsent("pdbx_before_begin_residue_no",
                PdbxBeforeBeginResidueNo::new) : getBinaryColumn("pdbx_before_begin_residue_no"));
    }

    /**
     * 
     * The number of the last residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return PdbxBeforeEndResidueNo
     */
    public PdbxBeforeEndResidueNo getPdbxBeforeEndResidueNo() {
        return (PdbxBeforeEndResidueNo) (isText ? textFields.computeIfAbsent("pdbx_before_end_residue_no",
                PdbxBeforeEndResidueNo::new) : getBinaryColumn("pdbx_before_end_residue_no"));
    }
}
