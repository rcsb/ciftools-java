package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITES category record details about
 * the crystallographic cell and cell transformations, which are
 * common to all atom sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSites extends DelegatingCategory {
    public AtomSites(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[1][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[1][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[1][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[2][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[2][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[2][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[3][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[3][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_matrix[3][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_vector[1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_vector[2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("Cartn_transf_vector[3]", DelegatingFloatColumn::new);
    }

    /**
     * A description of the relative alignment of the crystal cell
     * axes to the Cartesian orthogonal axes as applied in the
     * transformation matrix _atom_sites.Cartn_transf_matrix[][].
     * @return StrColumn
     */
    public StrColumn getCartnTransformAxes() {
        return delegate.getColumn("Cartn_transform_axes", DelegatingStrColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[1][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[1][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[1][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[2][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[2][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[2][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[3][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[3][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_matrix[3][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_vector[1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_vector[2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("fract_transf_vector[3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("solution_primary", DelegatingStrColumn::new);
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
        return delegate.getColumn("solution_secondary", DelegatingStrColumn::new);
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
        return delegate.getColumn("solution_hydrogens", DelegatingStrColumn::new);
    }

    /**
     * Additional information about the atomic coordinates not coded
     * elsewhere in the CIF.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return delegate.getColumn("special_details", DelegatingStrColumn::new);
    }
}
