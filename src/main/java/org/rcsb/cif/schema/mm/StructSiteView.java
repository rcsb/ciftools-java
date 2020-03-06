package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SITE_VIEW category record details
 * about how to draw and annotate an informative view of the
 * site.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSiteView extends DelegatingCategory {
    public StructSiteView(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "rot_matrix[1][1]":
                return getRotMatrix11();
            case "rot_matrix[1][2]":
                return getRotMatrix12();
            case "rot_matrix[1][3]":
                return getRotMatrix13();
            case "rot_matrix[2][1]":
                return getRotMatrix21();
            case "rot_matrix[2][2]":
                return getRotMatrix22();
            case "rot_matrix[2][3]":
                return getRotMatrix23();
            case "rot_matrix[3][1]":
                return getRotMatrix31();
            case "rot_matrix[3][2]":
                return getRotMatrix32();
            case "rot_matrix[3][3]":
                return getRotMatrix33();
            case "site_id":
                return getSiteId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of this view of the
     * site. This data item can be used as a figure legend.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
        return delegate.getColumn("rot_matrix[1][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[1][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[1][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[2][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[2][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[2][3]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[3][1]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[3][2]", DelegatingFloatColumn::new);
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
        return delegate.getColumn("rot_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getSiteId() {
        return delegate.getColumn("site_id", DelegatingStrColumn::new);
    }

}