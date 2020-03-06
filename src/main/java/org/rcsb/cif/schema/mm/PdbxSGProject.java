package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the Structural Genomics Project and name and initials
 * for each Center.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSGProject extends DelegatingCategory {
    public PdbxSGProject(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "project_name":
                return getProjectName();
            case "full_name_of_center":
                return getFullNameOfCenter();
            case "initial_of_center":
                return getInitialOfCenter();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique integer identifier for this center
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value identifies the Structural Genomics project.
     * @return StrColumn
     */
    public StrColumn getProjectName() {
        return delegate.getColumn("project_name", DelegatingStrColumn::new);
    }

    /**
     * The value identifies the full name of center.
     * @return StrColumn
     */
    public StrColumn getFullNameOfCenter() {
        return delegate.getColumn("full_name_of_center", DelegatingStrColumn::new);
    }

    /**
     * The value identifies the full name of center.
     * @return StrColumn
     */
    public StrColumn getInitialOfCenter() {
        return delegate.getColumn("initial_of_center", DelegatingStrColumn::new);
    }

}