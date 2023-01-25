package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_STRUCTURE_LIST  category record the size
 * and organization of each array dimension.
 * 
 * The relationship to physical axes may be given.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayStructureList extends DelegatingCategory {
    public ArrayStructureList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "array_id":
                return getArrayId();
            case "array_section_id":
                return getArraySectionId();
            case "axis_set_id":
                return getAxisSetId();
            case "dimension":
                return getDimension();
            case "direction":
                return getDirection();
            case "index":
                return getIndex();
            case "precedence":
                return getPrecedence();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This item is a pointer to _array_structure.id  in the
     * ARRAY_STRUCTURE  category.
     * @return StrColumn
     */
    public StrColumn getArrayId() {
        return delegate.getColumn("array_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_structure_list_section.id  in the
     * ARRAY_STRUCTURE_LIST_SECTION  category.
     * @return StrColumn
     */
    public StrColumn getArraySectionId() {
        return delegate.getColumn("array_section_id", DelegatingStrColumn::new);
    }

    /**
     * This is a descriptor for the physical axis or set of axes
     * corresponding to an array index.
     * 
     * This data item is related to the axes of the detector
     * itself given in DIFFRN_DETECTOR_AXIS, but usually differs
     * in that the axes in this category are the axes of the
     * coordinate system of reported data points, while the axes in
     * DIFFRN_DETECTOR_AXIS  are the physical axes
     * of the detector describing the 'poise' of the detector as an
     * overall physical object.
     * 
     * If there is only one axis in the set, the identifier of
     * that axis should be used as the identifier of the set.
     * @return StrColumn
     */
    public StrColumn getAxisSetId() {
        return delegate.getColumn("axis_set_id", DelegatingStrColumn::new);
    }

    /**
     * The number of elements stored in the array structure in
     * this dimension.
     * @return IntColumn
     */
    public IntColumn getDimension() {
        return delegate.getColumn("dimension", DelegatingIntColumn::new);
    }

    /**
     * Identifies the direction in which this array index changes.
     * @return StrColumn
     */
    public StrColumn getDirection() {
        return delegate.getColumn("direction", DelegatingStrColumn::new);
    }

    /**
     * Identifies the one-based index of the row or column in the
     * array structure.
     * @return IntColumn
     */
    public IntColumn getIndex() {
        return delegate.getColumn("index", DelegatingIntColumn::new);
    }

    /**
     * Identifies the rank order in which this array index changes
     * with respect to other array indices.  The precedence of 1
     * indicates the index which changes fastest.
     * @return IntColumn
     */
    public IntColumn getPrecedence() {
        return delegate.getColumn("precedence", DelegatingIntColumn::new);
    }

}