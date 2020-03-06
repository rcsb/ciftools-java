package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds links to other external data sources for the I/H model entry.
 * Input datasets held in other databases such as EMDB, BMRB, SASBDB etc.
 * are referenced in the IHM_DATASET_RELATED_DB_REFERENCE category.
 * This data category, along with IHM_EXTERNAL_FILES category, holds information
 * regarding other non-database external data sources, such as  DOIs (digital
 * object identifiers) or supplementary files stored locally. The DOIs can either
 * lead to the external data file(s) directly (as in case of DOIs provided by the PDB)
 * or might lead to an HTML landing page (as provided by Zenodo). In the latter case,
 * additional URL (Uniform Resource Locator) information is required to retrieve
 * the external data file(s).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmExternalReferenceInfo extends DelegatingCategory {
    public IhmExternalReferenceInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "reference_id":
                return getReferenceId();
            case "reference_provider":
                return getReferenceProvider();
            case "reference_type":
                return getReferenceType();
            case "reference":
                return getReference();
            case "refers_to":
                return getRefersTo();
            case "associated_url":
                return getAssociatedUrl();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the external reference.
     * @return IntColumn
     */
    public IntColumn getReferenceId() {
        return delegate.getColumn("reference_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the reference provider.
     * @return StrColumn
     */
    public StrColumn getReferenceProvider() {
        return delegate.getColumn("reference_provider", DelegatingStrColumn::new);
    }

    /**
     * The type of external reference.
     * Currently, only Digital Object Identifiers (DOIs) and supplementary files
     * stored locally are supported.
     * @return StrColumn
     */
    public StrColumn getReferenceType() {
        return delegate.getColumn("reference_type", DelegatingStrColumn::new);
    }

    /**
     * The external reference or the Digital Object Identifier (DOI).
     * This field is not relevant for local files.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return delegate.getColumn("reference", DelegatingStrColumn::new);
    }

    /**
     * The type of object that the external reference points to, usually
     * a single file or an archive.
     * @return StrColumn
     */
    public StrColumn getRefersTo() {
        return delegate.getColumn("refers_to", DelegatingStrColumn::new);
    }

    /**
     * The Uniform Resource Locator (URL) corresponding to the external reference (DOI).
     * This URL should link to the corresponding downloadable file or archive and is provided
     * to enable automated software to download the referenced file or archive.
     * @return StrColumn
     */
    public StrColumn getAssociatedUrl() {
        return delegate.getColumn("associated_url", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the external reference.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}