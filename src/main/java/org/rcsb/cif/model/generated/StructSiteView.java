package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SITE_VIEW category record details
 * about how to draw and annotate an informative view of the
 * site.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructSiteView extends BaseCategory {
    public StructSiteView(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSiteView(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSiteView(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this view of the
     * site. This data item can be used as a figure legend.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_site_view.id must uniquely identify a
     * record in the STRUCT_SITE_VIEW list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][3]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][3]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][1]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][2]"));
    }

    /**
     * The elements of the matrix used to rotate the subset of the
     * Cartesian coordinates in the ATOM_SITE category identified in the
     * STRUCT_SITE_GEN category an orientation useful for visualizing
     * the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
     * 
     * |x'|                         |11 12 13| |x|
     * |y'|~reoriented Cartesian~ = |21 22 23| |y|~Cartesian~
     * |z'|                         |31 32 33| |z|
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][3]"));
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getSiteId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_id", StrColumn::new) :
                getBinaryColumn("site_id"));
    }
}
