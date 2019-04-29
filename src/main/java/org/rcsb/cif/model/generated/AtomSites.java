package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES category record details about
 * the crystallographic cell and cell transformations, which are
 * common to all atom sites.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSites extends BaseCategory {
    public AtomSites(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSites(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSites(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.Cartn_transf_vector[].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfMatrix33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The rotation matrix is defined in
     * _atom_sites.Cartn_transf_matrix[][].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfVector1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[1]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_vector[1]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The rotation matrix is defined in
     * _atom_sites.Cartn_transf_matrix[][].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfVector2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[2]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_vector[2]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * fractional coordinates in the ATOM_SITE category to Cartesian
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The rotation matrix is defined in
     * _atom_sites.Cartn_transf_matrix[][].
     * 
     * |x'|              |11 12 13| |x|               |1|
     * |y'|~Cartesian~ = |21 22 23| |y|~fractional~ + |2|
     * |z'|              |31 32 33| |z|               |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCartnTransfVector3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[3]", SingleRowFloatColumn::new) :
                getBinaryColumn("Cartn_transf_vector[3]"));
    }

    /**
     * A description of the relative alignment of the crystal cell
     * axes to the Cartesian orthogonal axes as applied in the
     * transformation matrix _atom_sites.Cartn_transf_matrix[][].
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCartnTransformAxes() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("Cartn_transform_axes", SingleRowStrColumn::new) :
                getBinaryColumn("Cartn_transform_axes"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfMatrix33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x3 rotation is defined in
     * _atom_sites.fract_transf_matrix[][].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfVector1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[1]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_vector[1]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x3 rotation is defined in
     * _atom_sites.fract_transf_matrix[][].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfVector2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[2]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_vector[2]"));
    }

    /**
     * The elements of the three-element vector used to transform
     * Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x3 rotation is defined in
     * _atom_sites.fract_transf_matrix[][].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFractTransfVector3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[3]", SingleRowFloatColumn::new) :
                getBinaryColumn("fract_transf_vector[3]"));
    }

    /**
     * This code identifies the method used to locate the initial
     * atom sites.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSolutionPrimary() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("solution_primary", SingleRowStrColumn::new) :
                getBinaryColumn("solution_primary"));
    }

    /**
     * This code identifies the method used to locate the
     * non-hydrogen-atom sites not found by
     * _atom_sites.solution_primary.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSolutionSecondary() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("solution_secondary", SingleRowStrColumn::new) :
                getBinaryColumn("solution_secondary"));
    }

    /**
     * This code identifies the method used to locate the
     * hydrogen atoms.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSolutionHydrogens() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("solution_hydrogens", SingleRowStrColumn::new) :
                getBinaryColumn("solution_hydrogens"));
    }

    /**
     * Additional information about the atomic coordinates not coded
     * elsewhere in the CIF.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecialDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("special_details", SingleRowStrColumn::new) :
                getBinaryColumn("special_details"));
    }
}
