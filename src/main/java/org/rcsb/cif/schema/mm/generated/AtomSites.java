package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES category record details about
 * the crystallographic cell and cell transformations, which are
 * common to all atom sites.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getCartnTransfVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[3]", FloatColumn::new) :
                getBinaryColumn("Cartn_transf_vector[3]"));
    }

    /**
     * A description of the relative alignment of the crystal cell
     * axes to the Cartesian orthogonal axes as applied in the
     * transformation matrix _atom_sites.Cartn_transf_matrix[][].
     * @return StrColumn
     */
    public StrColumn getCartnTransformAxes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("Cartn_transform_axes", StrColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][3]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[1]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[2]", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFractTransfVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_transf_vector[3]", FloatColumn::new) :
                getBinaryColumn("fract_transf_vector[3]"));
    }

    /**
     * This code identifies the method used to locate the initial
     * atom sites.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return StrColumn
     */
    public StrColumn getSolutionPrimary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_primary", StrColumn::new) :
                getBinaryColumn("solution_primary"));
    }

    /**
     * This code identifies the method used to locate the
     * non-hydrogen-atom sites not found by
     * _atom_sites.solution_primary.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return StrColumn
     */
    public StrColumn getSolutionSecondary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_secondary", StrColumn::new) :
                getBinaryColumn("solution_secondary"));
    }

    /**
     * This code identifies the method used to locate the
     * hydrogen atoms.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return StrColumn
     */
    public StrColumn getSolutionHydrogens() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_hydrogens", StrColumn::new) :
                getBinaryColumn("solution_hydrogens"));
    }

    /**
     * Additional information about the atomic coordinates not coded
     * elsewhere in the CIF.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("special_details", StrColumn::new) :
                getBinaryColumn("special_details"));
    }
}
