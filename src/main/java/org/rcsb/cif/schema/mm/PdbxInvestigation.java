package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_INVESTIGATION category provides a information of an investigation associated with this file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxInvestigation extends DelegatingCategory {
    public PdbxInvestigation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "type":
                return getType();
            case "resource_name":
                return getResourceName();
            case "resource_accession":
                return getResourceAccession();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Uniquely identifies an investigation
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Describes the type of investigation.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The name of the resource archiving this investigation
     * @return StrColumn
     */
    public StrColumn getResourceName() {
        return delegate.getColumn("resource_name", DelegatingStrColumn::new);
    }

    /**
     * The accession used to identify this investigation
     * @return StrColumn
     */
    public StrColumn getResourceAccession() {
        return delegate.getColumn("resource_accession", DelegatingStrColumn::new);
    }

    /**
     * Additional details relevant to the investigation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}