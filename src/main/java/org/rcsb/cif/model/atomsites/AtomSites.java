package org.rcsb.cif.model.atomsites;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
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
     * @return CartnTransfMatrix11
     */
    public CartnTransfMatrix11 getCartnTransfMatrix11() {
        return (CartnTransfMatrix11) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][1]",
                CartnTransfMatrix11::new) : getBinaryColumn("Cartn_transf_matrix[1][1]"));
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
     * @return CartnTransfMatrix12
     */
    public CartnTransfMatrix12 getCartnTransfMatrix12() {
        return (CartnTransfMatrix12) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][2]",
                CartnTransfMatrix12::new) : getBinaryColumn("Cartn_transf_matrix[1][2]"));
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
     * @return CartnTransfMatrix13
     */
    public CartnTransfMatrix13 getCartnTransfMatrix13() {
        return (CartnTransfMatrix13) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[1][3]",
                CartnTransfMatrix13::new) : getBinaryColumn("Cartn_transf_matrix[1][3]"));
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
     * @return CartnTransfMatrix21
     */
    public CartnTransfMatrix21 getCartnTransfMatrix21() {
        return (CartnTransfMatrix21) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][1]",
                CartnTransfMatrix21::new) : getBinaryColumn("Cartn_transf_matrix[2][1]"));
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
     * @return CartnTransfMatrix22
     */
    public CartnTransfMatrix22 getCartnTransfMatrix22() {
        return (CartnTransfMatrix22) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][2]",
                CartnTransfMatrix22::new) : getBinaryColumn("Cartn_transf_matrix[2][2]"));
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
     * @return CartnTransfMatrix23
     */
    public CartnTransfMatrix23 getCartnTransfMatrix23() {
        return (CartnTransfMatrix23) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[2][3]",
                CartnTransfMatrix23::new) : getBinaryColumn("Cartn_transf_matrix[2][3]"));
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
     * @return CartnTransfMatrix31
     */
    public CartnTransfMatrix31 getCartnTransfMatrix31() {
        return (CartnTransfMatrix31) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][1]",
                CartnTransfMatrix31::new) : getBinaryColumn("Cartn_transf_matrix[3][1]"));
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
     * @return CartnTransfMatrix32
     */
    public CartnTransfMatrix32 getCartnTransfMatrix32() {
        return (CartnTransfMatrix32) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][2]",
                CartnTransfMatrix32::new) : getBinaryColumn("Cartn_transf_matrix[3][2]"));
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
     * @return CartnTransfMatrix33
     */
    public CartnTransfMatrix33 getCartnTransfMatrix33() {
        return (CartnTransfMatrix33) (isText ? textFields.computeIfAbsent("Cartn_transf_matrix[3][3]",
                CartnTransfMatrix33::new) : getBinaryColumn("Cartn_transf_matrix[3][3]"));
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
     * @return CartnTransfVector1
     */
    public CartnTransfVector1 getCartnTransfVector1() {
        return (CartnTransfVector1) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[1]",
                CartnTransfVector1::new) : getBinaryColumn("Cartn_transf_vector[1]"));
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
     * @return CartnTransfVector2
     */
    public CartnTransfVector2 getCartnTransfVector2() {
        return (CartnTransfVector2) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[2]",
                CartnTransfVector2::new) : getBinaryColumn("Cartn_transf_vector[2]"));
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
     * @return CartnTransfVector3
     */
    public CartnTransfVector3 getCartnTransfVector3() {
        return (CartnTransfVector3) (isText ? textFields.computeIfAbsent("Cartn_transf_vector[3]",
                CartnTransfVector3::new) : getBinaryColumn("Cartn_transf_vector[3]"));
    }

    /**
     * A description of the relative alignment of the crystal cell
     * axes to the Cartesian orthogonal axes as applied in the
     * transformation matrix _atom_sites.Cartn_transf_matrix[][].
     * @return CartnTransformAxes
     */
    public CartnTransformAxes getCartnTransformAxes() {
        return (CartnTransformAxes) (isText ? textFields.computeIfAbsent("Cartn_transform_axes",
                CartnTransformAxes::new) : getBinaryColumn("Cartn_transform_axes"));
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
     * @return FractTransfMatrix11
     */
    public FractTransfMatrix11 getFractTransfMatrix11() {
        return (FractTransfMatrix11) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][1]",
                FractTransfMatrix11::new) : getBinaryColumn("fract_transf_matrix[1][1]"));
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
     * @return FractTransfMatrix12
     */
    public FractTransfMatrix12 getFractTransfMatrix12() {
        return (FractTransfMatrix12) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][2]",
                FractTransfMatrix12::new) : getBinaryColumn("fract_transf_matrix[1][2]"));
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
     * @return FractTransfMatrix13
     */
    public FractTransfMatrix13 getFractTransfMatrix13() {
        return (FractTransfMatrix13) (isText ? textFields.computeIfAbsent("fract_transf_matrix[1][3]",
                FractTransfMatrix13::new) : getBinaryColumn("fract_transf_matrix[1][3]"));
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
     * @return FractTransfMatrix21
     */
    public FractTransfMatrix21 getFractTransfMatrix21() {
        return (FractTransfMatrix21) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][1]",
                FractTransfMatrix21::new) : getBinaryColumn("fract_transf_matrix[2][1]"));
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
     * @return FractTransfMatrix22
     */
    public FractTransfMatrix22 getFractTransfMatrix22() {
        return (FractTransfMatrix22) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][2]",
                FractTransfMatrix22::new) : getBinaryColumn("fract_transf_matrix[2][2]"));
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
     * @return FractTransfMatrix23
     */
    public FractTransfMatrix23 getFractTransfMatrix23() {
        return (FractTransfMatrix23) (isText ? textFields.computeIfAbsent("fract_transf_matrix[2][3]",
                FractTransfMatrix23::new) : getBinaryColumn("fract_transf_matrix[2][3]"));
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
     * @return FractTransfMatrix31
     */
    public FractTransfMatrix31 getFractTransfMatrix31() {
        return (FractTransfMatrix31) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][1]",
                FractTransfMatrix31::new) : getBinaryColumn("fract_transf_matrix[3][1]"));
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
     * @return FractTransfMatrix32
     */
    public FractTransfMatrix32 getFractTransfMatrix32() {
        return (FractTransfMatrix32) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][2]",
                FractTransfMatrix32::new) : getBinaryColumn("fract_transf_matrix[3][2]"));
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
     * @return FractTransfMatrix33
     */
    public FractTransfMatrix33 getFractTransfMatrix33() {
        return (FractTransfMatrix33) (isText ? textFields.computeIfAbsent("fract_transf_matrix[3][3]",
                FractTransfMatrix33::new) : getBinaryColumn("fract_transf_matrix[3][3]"));
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
     * @return FractTransfVector1
     */
    public FractTransfVector1 getFractTransfVector1() {
        return (FractTransfVector1) (isText ? textFields.computeIfAbsent("fract_transf_vector[1]",
                FractTransfVector1::new) : getBinaryColumn("fract_transf_vector[1]"));
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
     * @return FractTransfVector2
     */
    public FractTransfVector2 getFractTransfVector2() {
        return (FractTransfVector2) (isText ? textFields.computeIfAbsent("fract_transf_vector[2]",
                FractTransfVector2::new) : getBinaryColumn("fract_transf_vector[2]"));
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
     * @return FractTransfVector3
     */
    public FractTransfVector3 getFractTransfVector3() {
        return (FractTransfVector3) (isText ? textFields.computeIfAbsent("fract_transf_vector[3]",
                FractTransfVector3::new) : getBinaryColumn("fract_transf_vector[3]"));
    }

    /**
     * This code identifies the method used to locate the initial
     * atom sites.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SolutionPrimary
     */
    public SolutionPrimary getSolutionPrimary() {
        return (SolutionPrimary) (isText ? textFields.computeIfAbsent("solution_primary",
                SolutionPrimary::new) : getBinaryColumn("solution_primary"));
    }

    /**
     * This code identifies the method used to locate the
     * non-hydrogen-atom sites not found by
     * _atom_sites.solution_primary.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SolutionSecondary
     */
    public SolutionSecondary getSolutionSecondary() {
        return (SolutionSecondary) (isText ? textFields.computeIfAbsent("solution_secondary",
                SolutionSecondary::new) : getBinaryColumn("solution_secondary"));
    }

    /**
     * This code identifies the method used to locate the
     * hydrogen atoms.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return SolutionHydrogens
     */
    public SolutionHydrogens getSolutionHydrogens() {
        return (SolutionHydrogens) (isText ? textFields.computeIfAbsent("solution_hydrogens",
                SolutionHydrogens::new) : getBinaryColumn("solution_hydrogens"));
    }

    /**
     * Additional information about the atomic coordinates not coded
     * elsewhere in the CIF.
     * @return SpecialDetails
     */
    public SpecialDetails getSpecialDetails() {
        return (SpecialDetails) (isText ? textFields.computeIfAbsent("special_details",
                SpecialDetails::new) : getBinaryColumn("special_details"));
    }
}
