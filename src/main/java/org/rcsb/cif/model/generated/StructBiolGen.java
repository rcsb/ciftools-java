package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_BIOL_GEN category record details about
 * the generation of each biological unit. The STRUCT_BIOL_GEN
 * data items provide the specifications of the components that
 * constitute that biological unit, which may include symmetry
 * elements.
 */
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
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the biological structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_biol_gen.asym_id to generate a
     * portion of the biological structure.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry", StrColumn::new) :
                getBinaryColumn("symmetry"));
    }

    /**
     * 
     * This item expresses category _struct_biol_gen.symmetry
     * on an X, Y and Z basis.
     * @return StrColumn
     */
    public StrColumn getPdbxFullSymmetryOperation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_full_symmetry_operation", StrColumn::new) :
                getBinaryColumn("pdbx_full_symmetry_operation"));
    }

    /**
     * An ordering index used to reproduce the presentation of
     * chain order in the original PDB format data files.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBOrder() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_order", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_order"));
    }

    /**
     * 
     * This category gives the NDB strand ids for the complete
     * biomolecule after it is generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNewAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_new_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_new_asym_id"));
    }

    /**
     * This data item is the PDB strand ID of the strand which will be
     * generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNewPdbAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_new_pdb_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_new_pdb_asym_id"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorRed() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_color_red", FloatColumn::new) :
                getBinaryColumn("pdbx_color_red"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorGreen() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_color_green", FloatColumn::new) :
                getBinaryColumn("pdbx_color_green"));
    }

    /**
     * Gives rgb color code of this strand.
     * @return FloatColumn
     */
    public FloatColumn getPdbxColorBlue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_color_blue", FloatColumn::new) :
                getBinaryColumn("pdbx_color_blue"));
    }

    /**
     * 
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxAfterBeginResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_after_begin_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_after_begin_residue_no"));
    }

    /**
     * 
     * The new residue number after generation of portions of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxAfterEndResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_after_end_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_after_end_residue_no"));
    }

    /**
     * 
     * The number of the first residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxBeforeBeginResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_before_begin_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_before_begin_residue_no"));
    }

    /**
     * 
     * The number of the last residue to which the symmetry
     * operations have to be applied to generate a portion of
     * the biomolecule.
     * @return StrColumn
     */
    public StrColumn getPdbxBeforeEndResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_before_end_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_before_end_residue_no"));
    }
}
