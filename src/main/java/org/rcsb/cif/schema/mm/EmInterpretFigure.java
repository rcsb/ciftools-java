package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Listing of all layer line files associated with the EM entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmInterpretFigure extends DelegatingCategory {
    public EmInterpretFigure(Category delegate) {
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
     * Details about the image file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The name of the image file associated with the map entry
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