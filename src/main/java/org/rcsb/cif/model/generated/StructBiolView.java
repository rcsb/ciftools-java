package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_BIOL_VIEW category record details
 * about how to draw and annotate an informative view of the
 * biological structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBiolId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("biol_id", SingleRowStrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * A description of special aspects of this view of the biological
     * structure.
     * 
     * This data item can be used as a figure legend.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_biol_view.id must uniquely identify a
     * record in the STRUCT_BIOL_VIEW list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[1][1]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[1][2]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[1][3]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[2][1]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[2][2]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[2][3]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[3][1]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[3][2]"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotMatrix33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("rot_matrix[3][3]"));
    }

    /**
     * translation vector
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxVector1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_vector[1]", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_vector[1]"));
    }

    /**
     * translation vector
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxVector2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_vector[2]", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_vector[2]"));
    }

    /**
     * translation vector
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxVector3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_vector[3]", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_vector[3]"));
    }
}
