package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of the software that was used for data collection, data processing,
 * data analysis, structure calculations and refinement. The description should
 * include the name of the software, the author of the software and the version used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSoftware extends DelegatingCategory {
    public PdbxNmrSoftware(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "classification":
                return getClassification();
            case "name":
                return getName();
            case "version":
                return getVersion();
            case "authors":
                return getAuthors();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The purpose of the software.
     * @return StrColumn
     */
    public StrColumn getClassification() {
        return delegate.getColumn("classification", DelegatingStrColumn::new);
    }

    /**
     * The name of the software used for the task.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return delegate.getColumn("version", DelegatingStrColumn::new);
    }

    /**
     * The name of the authors of the software used in this
     * procedure.
     * @return StrColumn
     */
    public StrColumn getAuthors() {
        return delegate.getColumn("authors", DelegatingStrColumn::new);
    }

    /**
     * Text description of the software.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}