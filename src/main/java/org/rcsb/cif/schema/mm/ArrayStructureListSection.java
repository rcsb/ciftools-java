package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_STRUCTURE_LIST_SECTION  category identify
 * the dimension-by-dimension start, end and stride of each section of an
 * array that is to be referenced.
 * 
 * For any array with identifier ARRAYID, array section ids of the form
 * ARRAYID(start1:end1:stride1,start2:end2:stride2, ...) are defined
 * by default.
 * 
 * For the given index, the elements in the section are of indices:
 * _array_structure_list_section.start,
 * _array_structure_list_section.start + _array_structure_list_section.stride,
 * _array_structure_list_section.start + 2*_array_structure_list_section.stride,
 * ...
 * 
 * stopping either when the indices leave the limits of the indices
 * of that dimension or
 * [min(_array_structure_list_section.start, _array_structure_list_section.end),
 * max(_array_structure_list_section.start, _array_structure_list_section.end)].
 * 
 * 
 * The ordering of these elements is determined by the overall ordering of
 * _array_structure_list_section.array_id  and not by the ordering implied
 * by the stride.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayStructureListSection extends DelegatingCategory {
    public ArrayStructureListSection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "array_id":
                return getArrayId();
            case "end":
                return getEnd();
            case "id":
                return getId();
            case "index":
                return getIndex();
            case "start":
                return getStart();
            case "stride":
                return getStride();
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
     * Identifies the ending ordinal, numbered from 1, for an array
     * element of index _array_structure_list_section.index  in the
     * section.
     * 
     * The value defaults to the dimension for index
     * _array_structure_list_section.index
     * of the array.
     * 
     * Note that this agrees with the Fortran convention, rather than
     * the Python convention in that, if compatible with the stride,
     * the end element is included in the section as in Fortran, rather
     * than being one beyond the section as in Python.
     * @return IntColumn
     */
    public IntColumn getEnd() {
        return delegate.getColumn("end", DelegatingIntColumn::new);
    }

    /**
     * Uniquely identifies the array section chosen.
     * 
     * To avoid confusion array section IDs that contain parentheses
     * should conform to the default syntax
     * 
     * ARRAYID(start1:end1:stride1,start2:end2:stride2, ...)
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_structure_list.index
     * in the ARRAY_STRUCTURE_LIST  category.
     * 
     * Identifies the one-based index of the row, column, sheet ...
     * the ARRAY_STRUCTURE_LIST  category.
     * 
     * For a multidimensional array, a value must be explicitly given.
     * 
     * If an index is omitted from a section then all elements for that
     * index are assumed to be included in the section.
     * @return IntColumn
     */
    public IntColumn getIndex() {
        return delegate.getColumn("index", DelegatingIntColumn::new);
    }

    /**
     * Identifies the starting ordinal, numbered from 1,
     * for an array element of index _array_structure_list_section.index
     * in the section.
     * 
     * The value defaults to 1.   For the given index, the elements in
     * the section are of indices:
     * _array_structure_list_section.start,
     * _array_structure_list_section.start
     * + _array_structure_list_section.stride,
     * _array_structure_list_section.start
     * + 2*_array_structure_list_section.stride,
     * ...
     * 
     * stopping either when the indices leave the limits of the indices
     * of that dimension or
     * [min(_array_structure_list_section.start,
     * _array_structure_list_section.end ),
     * max(_array_structure_list_section.start,
     * _array_structure_list_section.end )].
     * 
     * 
     * The ordering of these elements is determined by the overall
     * ordering of _array_structure_list_section.array_id  and not by
     * the ordering implied by the stride.
     * @return IntColumn
     */
    public IntColumn getStart() {
        return delegate.getColumn("start", DelegatingIntColumn::new);
    }

    /**
     * Identifies the incremental steps to be taken when moving
     * element to element in the section in that particular
     * dimension.  The value of _array_structure_list_section.stride
     * may be positive or negative.  If the stride is zero, the section
     * is just defined by _array_structure_list_section.start.
     * @return IntColumn
     */
    public IntColumn getStride() {
        return delegate.getColumn("stride", DelegatingIntColumn::new);
    }

}