package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_REF_DB_DETAILS category record details about
 * the structural templates obtained from the reference database.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateRefDbDetails extends DelegatingCategory {
    public MaTemplateRefDbDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "template_id":
                return getTemplateId();
            case "db_name":
                return getDbName();
            case "db_name_other_details":
                return getDbNameOtherDetails();
            case "db_accession_code":
                return getDbAccessionCode();
            case "db_version_date":
                return getDbVersionDate();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this template record. This data item is a
     * pointer to '_ma_template_details.template_id in the
     * MA_TEMPLATE_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the reference database.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The name of the other reference database.
     * @return StrColumn
     */
    public StrColumn getDbNameOtherDetails() {
        return delegate.getColumn("db_name_other_details", DelegatingStrColumn::new);
    }

    /**
     * The accession code corresponding to the reference database entry.
     * @return StrColumn
     */
    public StrColumn getDbAccessionCode() {
        return delegate.getColumn("db_accession_code", DelegatingStrColumn::new);
    }

    /**
     * The version date of the reference database entry.
     * @return StrColumn
     */
    public StrColumn getDbVersionDate() {
        return delegate.getColumn("db_version_date", DelegatingStrColumn::new);
    }

}