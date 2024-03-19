package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
 * information required to identify the depositor and route
 * deposition to an appropriate processing site.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiEntryDetails extends DelegatingCategory {
    public PdbxDepuiEntryDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dep_dataset_id":
                return getDepDatasetId();
            case "wwpdb_site_id":
                return getWwpdbSiteId();
            case "experimental_methods":
                return getExperimentalMethods();
            case "requested_accession_types":
                return getRequestedAccessionTypes();
            case "validated_contact_email":
                return getValidatedContactEmail();
            case "validated_identifier_ORCID":
                return getValidatedIdentifierORCID();
            case "country":
                return getCountry();
            case "structural_genomics_flag":
                return getStructuralGenomicsFlag();
            case "related_database_name":
                return getRelatedDatabaseName();
            case "related_database_code":
                return getRelatedDatabaseCode();
            case "replace_pdb_id":
                return getReplacePdbId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return delegate.getColumn("dep_dataset_id", DelegatingStrColumn::new);
    }

    /**
     * The wwPDB internal site configuration identifier.
     * @return StrColumn
     */
    public StrColumn getWwpdbSiteId() {
        return delegate.getColumn("wwpdb_site_id", DelegatingStrColumn::new);
    }

    /**
     * Comma separated list of supported experimental methods.
     * @return StrColumn
     */
    public StrColumn getExperimentalMethods() {
        return delegate.getColumn("experimental_methods", DelegatingStrColumn::new);
    }

    /**
     * Comma separated list of requested accession code types.
     * @return StrColumn
     */
    public StrColumn getRequestedAccessionTypes() {
        return delegate.getColumn("requested_accession_types", DelegatingStrColumn::new);
    }

    /**
     * The validated contact e-mail address for the correponding depositor.
     * @return StrColumn
     */
    public StrColumn getValidatedContactEmail() {
        return delegate.getColumn("validated_contact_email", DelegatingStrColumn::new);
    }

    /**
     * The validated contact Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getValidatedIdentifierORCID() {
        return delegate.getColumn("validated_identifier_ORCID", DelegatingStrColumn::new);
    }

    /**
     * The country/region location of the institution submitting the deposition.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return delegate.getColumn("country", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the that the deposition is a contribution from a structural genomics project.
     * @return StrColumn
     */
    public StrColumn getStructuralGenomicsFlag() {
        return delegate.getColumn("structural_genomics_flag", DelegatingStrColumn::new);
    }

    /**
     * The name of the database associated with the related database code.
     * @return StrColumn
     */
    public StrColumn getRelatedDatabaseName() {
        return delegate.getColumn("related_database_name", DelegatingStrColumn::new);
    }

    /**
     * A database code closely related to the current deposition.
     * @return StrColumn
     */
    public StrColumn getRelatedDatabaseCode() {
        return delegate.getColumn("related_database_code", DelegatingStrColumn::new);
    }

    /**
     * The PDB ID code of the entry that is superseded by this entry.
     * @return StrColumn
     */
    public StrColumn getReplacePdbId() {
        return delegate.getColumn("replace_pdb_id", DelegatingStrColumn::new);
    }

}