package org.rcsb.cif.model.structbiolview;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructBiolView extends BaseCategory {
    public StructBiolView(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructBiolView(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructBiolView(String name) {
        super(name);
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
     * A description of special aspects of this view of the biological
     * structure.
     * 
     * This data item can be used as a figure legend.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_biol_view.id must uniquely identify a
     * record in the STRUCT_BIOL_VIEW list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix11
     */
    public RotMatrix11 getRotMatrix11() {
        return (RotMatrix11) (isText ? textFields.computeIfAbsent("rot_matrix[1][1]",
                RotMatrix11::new) : getBinaryColumn("rot_matrix[1][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix12
     */
    public RotMatrix12 getRotMatrix12() {
        return (RotMatrix12) (isText ? textFields.computeIfAbsent("rot_matrix[1][2]",
                RotMatrix12::new) : getBinaryColumn("rot_matrix[1][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix13
     */
    public RotMatrix13 getRotMatrix13() {
        return (RotMatrix13) (isText ? textFields.computeIfAbsent("rot_matrix[1][3]",
                RotMatrix13::new) : getBinaryColumn("rot_matrix[1][3]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix21
     */
    public RotMatrix21 getRotMatrix21() {
        return (RotMatrix21) (isText ? textFields.computeIfAbsent("rot_matrix[2][1]",
                RotMatrix21::new) : getBinaryColumn("rot_matrix[2][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix22
     */
    public RotMatrix22 getRotMatrix22() {
        return (RotMatrix22) (isText ? textFields.computeIfAbsent("rot_matrix[2][2]",
                RotMatrix22::new) : getBinaryColumn("rot_matrix[2][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix23
     */
    public RotMatrix23 getRotMatrix23() {
        return (RotMatrix23) (isText ? textFields.computeIfAbsent("rot_matrix[2][3]",
                RotMatrix23::new) : getBinaryColumn("rot_matrix[2][3]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix31
     */
    public RotMatrix31 getRotMatrix31() {
        return (RotMatrix31) (isText ? textFields.computeIfAbsent("rot_matrix[3][1]",
                RotMatrix31::new) : getBinaryColumn("rot_matrix[3][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix32
     */
    public RotMatrix32 getRotMatrix32() {
        return (RotMatrix32) (isText ? textFields.computeIfAbsent("rot_matrix[3][2]",
                RotMatrix32::new) : getBinaryColumn("rot_matrix[3][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_BIOL_GEN category to give a view useful for describing the
     * structure. The conventions used in the rotation are described in
     * _struct_biol_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return RotMatrix33
     */
    public RotMatrix33 getRotMatrix33() {
        return (RotMatrix33) (isText ? textFields.computeIfAbsent("rot_matrix[3][3]",
                RotMatrix33::new) : getBinaryColumn("rot_matrix[3][3]"));
    }

    /**
     * translation vector
     * @return PdbxVector1
     */
    public PdbxVector1 getPdbxVector1() {
        return (PdbxVector1) (isText ? textFields.computeIfAbsent("pdbx_vector[1]",
                PdbxVector1::new) : getBinaryColumn("pdbx_vector[1]"));
    }

    /**
     * translation vector
     * @return PdbxVector2
     */
    public PdbxVector2 getPdbxVector2() {
        return (PdbxVector2) (isText ? textFields.computeIfAbsent("pdbx_vector[2]",
                PdbxVector2::new) : getBinaryColumn("pdbx_vector[2]"));
    }

    /**
     * translation vector
     * @return PdbxVector3
     */
    public PdbxVector3 getPdbxVector3() {
        return (PdbxVector3) (isText ? textFields.computeIfAbsent("pdbx_vector[3]",
                PdbxVector3::new) : getBinaryColumn("pdbx_vector[3]"));
    }
}
