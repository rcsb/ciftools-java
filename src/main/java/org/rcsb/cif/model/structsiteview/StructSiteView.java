package org.rcsb.cif.model.structsiteview;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_site_view.id must uniquely identify a
     * record in the STRUCT_SITE_VIEW list.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category to an orientation useful for
     * visualizing the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * STRUCT_SITE_GEN category an orientation useful for visualizing
     * the site. The conventions used in the rotation are
     * described in _struct_site_view.details.
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
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return SiteId
     */
    public SiteId getSiteId() {
        return (SiteId) (isText ? textFields.computeIfAbsent("site_id",
                SiteId::new) : getBinaryColumn("site_id"));
    }
}
