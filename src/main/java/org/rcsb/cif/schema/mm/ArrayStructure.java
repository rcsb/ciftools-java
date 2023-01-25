package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_STRUCTURE  category record the organization and
 * encoding of array data that may be stored in the ARRAY_DATA  category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayStructure extends DelegatingCategory {
    public ArrayStructure(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "byte_order":
                return getByteOrder();
            case "compression_type":
                return getCompressionType();
            case "compression_type_flag":
                return getCompressionTypeFlag();
            case "encoding_type":
                return getEncodingType();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The order of bytes for integer values which require more
     * than 1 byte.
     * 
     * (IBM-PCs and compatibles, and DEC VAXs use low-byte-first
     * ordered integers, whereas Hewlett Packard 700
     * series, Sun-4 and Silicon Graphics use high-byte-first
     * ordered integers.  DEC Alphas can produce/use either
     * depending on a compiler switch.)
     * @return StrColumn
     */
    public StrColumn getByteOrder() {
        return delegate.getColumn("byte_order", DelegatingStrColumn::new);
    }

    /**
     * Type of data-compression method used to compress the array
     * data.
     * @return StrColumn
     */
    public StrColumn getCompressionType() {
        return delegate.getColumn("compression_type", DelegatingStrColumn::new);
    }

    /**
     * Flags modifying the type of data-compression method used to
     * compress the arraydata.
     * @return StrColumn
     */
    public StrColumn getCompressionTypeFlag() {
        return delegate.getColumn("compression_type_flag", DelegatingStrColumn::new);
    }

    /**
     * Data encoding of a single element of array data.
     * 
     * The type 'unsigned 1-bit integer' is used for
     * packed Boolean arrays for masks.  Each element
     * of the array corresponds to a single bit
     * packed in unsigned 8-bit data.
     * 
     * In several cases, the IEEE format is referenced.
     * See IEEE Standard 754-1985 (IEEE, 1985).
     * 
     * Reference: IEEE (1985). IEEE Standard for Binary Floating-Point
     * Arithmetic. ANSI/IEEE Std 754-1985. New York: Institute of
     * Electrical and Electronics Engineers.
     * @return StrColumn
     */
    public StrColumn getEncodingType() {
        return delegate.getColumn("encoding_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _array_structure.id  must uniquely identify
     * each item of array data.
     * 
     * This item has been made implicit and given a default value of 1
     * as a convenience in writing miniCBF files.  Normally an
     * explicit name with useful content should be used.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}