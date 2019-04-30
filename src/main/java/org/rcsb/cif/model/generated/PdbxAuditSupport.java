package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_SUPPORT category record details about
 * funding support for the entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxAuditSupport extends BaseCategory {
    public PdbxAuditSupport(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditSupport(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditSupport(String name) {
        super(name);
    }

    /**
     * The name of the organization providing funding support for the
     * entry.
     * @return StrColumn
     */
    public StrColumn getFundingOrganization() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("funding_organization", StrColumn::new) :
                getBinaryColumn("funding_organization"));
    }

    /**
     * The country providing the funding support for the entry.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("country", StrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * The grant number associated with this source of support.
     * @return StrColumn
     */
    public StrColumn getGrantNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("grant_number", StrColumn::new) :
                getBinaryColumn("grant_number"));
    }

    /**
     * Additional details regarding the funding of this entry
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A unique sequential integer identifier for each source of support for this entry.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
