package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
 * to experimental data set dependencies for this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSupportingExpDataSet extends DelegatingCategory {
    public PdbxSupportingExpDataSet(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "data_content_type":
                return getDataContentType();
            case "data_version_major":
                return getDataVersionMajor();
            case "data_version_minor":
                return getDataVersionMinor();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal identifier for each experimental data set.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of the experimenatal data set.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return delegate.getColumn("data_content_type", DelegatingStrColumn::new);
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return IntColumn
     */
    public IntColumn getDataVersionMajor() {
        return delegate.getColumn("data_version_major", DelegatingIntColumn::new);
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return IntColumn
     */
    public IntColumn getDataVersionMinor() {
        return delegate.getColumn("data_version_minor", DelegatingIntColumn::new);
    }

    /**
     * Additional details describing the content of the supporting data set and its application to
     * the current investigation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}