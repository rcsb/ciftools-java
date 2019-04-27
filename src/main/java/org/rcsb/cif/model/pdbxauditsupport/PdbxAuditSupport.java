package org.rcsb.cif.model.pdbxauditsupport;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return FundingOrganization
     */
    public FundingOrganization getFundingOrganization() {
        return (FundingOrganization) (isText ? textFields.computeIfAbsent("funding_organization",
                FundingOrganization::new) : getBinaryColumn("funding_organization"));
    }

    /**
     * The country providing the funding support for the entry.
     * @return Country
     */
    public Country getCountry() {
        return (Country) (isText ? textFields.computeIfAbsent("country",
                Country::new) : getBinaryColumn("country"));
    }

    /**
     * The grant number associated with this source of support.
     * @return GrantNumber
     */
    public GrantNumber getGrantNumber() {
        return (GrantNumber) (isText ? textFields.computeIfAbsent("grant_number",
                GrantNumber::new) : getBinaryColumn("grant_number"));
    }

    /**
     * Additional details regarding the funding of this entry
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A unique sequential integer identifier for each source of support for this entry.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
