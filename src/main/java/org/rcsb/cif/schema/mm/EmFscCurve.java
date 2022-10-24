package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EMD_VALIDATION_FSC_CURVE category
 * record details of the Fourier Shell Correlation (FSC) curve file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmFscCurve extends DelegatingCategory {
    public EmFscCurve(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "file":
                return getFile();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Details about the FSC file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * FSC file name.
     * @return StrColumn
     */
    public StrColumn getFile() {
        return delegate.getColumn("file", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}