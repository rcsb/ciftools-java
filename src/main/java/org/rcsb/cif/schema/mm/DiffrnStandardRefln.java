package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_STANDARD_REFLN category record details
 * about the reflections treated as standards during the measurement
 * of a set of diffraction intensities.
 * 
 * Note that these are the individual standard reflections, not the
 * results of the analysis of the standard reflections.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnStandardRefln extends DelegatingCategory {
    public DiffrnStandardRefln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "code":
                return getCode();
            case "diffrn_id":
                return getDiffrnId();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The code identifying a reflection measured as a standard
     * reflection with the indices _diffrn_standard_refln.index_h,
     * _diffrn_standard_refln.index_k and
     * _diffrn_standard_refln.index_l. This is the same code as the
     * _diffrn_refln.standard_code in the DIFFRN_REFLN list.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return delegate.getColumn("code", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * Miller index h of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

}