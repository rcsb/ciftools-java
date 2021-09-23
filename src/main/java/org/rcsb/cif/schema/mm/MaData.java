package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_DATA category capture the different kinds of
 * data used in the modeling. These can be multiple sequence
 * alignments, spatial restraints, template structures etc.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaData extends DelegatingCategory {
    public MaData(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "content_type":
                return getContentType();
            case "content_type_other_details":
                return getContentTypeOtherDetails();
            case "name":
                return getName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the data.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The type of data held in the dataset.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }

    /**
     * Details for other content types.
     * @return StrColumn
     */
    public StrColumn getContentTypeOtherDetails() {
        return delegate.getColumn("content_type_other_details", DelegatingStrColumn::new);
    }

    /**
     * An author-given name for the content held in the dataset.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

}