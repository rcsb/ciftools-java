package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditSupport extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_support";

    public AuditSupport(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The award number associated with this source of support.
     * @return StrColumn
     */
    public StrColumn getAwardNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_award_number"));
    }

    /**
     * The recipient of the support. May be an
     * individual or institution.
     * @return StrColumn
     */
    public StrColumn getAwardRecipient() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_award_recipient"));
    }

    /**
     * Type or kind of award.
     * @return StrColumn
     */
    public StrColumn getAwardType() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_award_type"));
    }

    /**
     * The name of the organization providing funding support for
     * the data collected and analysed in the data block. The
     * recommended source for such names is the Open Funder Registry
     * (https://gitlab.com/crossref/open_funder_registry).
     * @return StrColumn
     */
    public StrColumn getFundingOrganization() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_funding_organization"));
    }

    /**
     * The Digital Object Identifier (DOI) associated with the
     * Organization providing funding support for
     * the data collected and analysed in the data block. In
     * accordance with CrossRef guidelines, the full URI of
     * the resolved page describing the funding organization
     * should be given (i.e. including the https://doi.org/
     * component).
     * @return StrColumn
     */
    public StrColumn getFundingOrganizationDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_funding_organization_doi"));
    }

    /**
     * The Uniform Resource Locator (URL) associated with the funding organisation.
     * 
     * The _audit_support.funding_organization_DOI data item should be provided
     * alongside this item when possible.
     * @return StrColumn
     */
    public StrColumn getFundingOrganizationUrl() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_funding_organization_url"));
    }

    /**
     * An arbitrary unique identifier for each source of support for
     * the data collected and analysed in the data block.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_id"));
    }

    /**
     * Details of the funding support that cannot be specified by other data items
     * from the AUDIT_SUPPORT category.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_support_special_details"));
    }

}