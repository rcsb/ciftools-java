package org.rcsb.cif.model.generated.pdbxdepuientrydetails;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepuiEntryDetails extends BaseCategory {
    public PdbxDepuiEntryDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiEntryDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiEntryDetails(String name) {
        super(name);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return DepDatasetId
     */
    public DepDatasetId getDepDatasetId() {
        return (DepDatasetId) (isText ? textFields.computeIfAbsent("dep_dataset_id",
                DepDatasetId::new) : getBinaryColumn("dep_dataset_id"));
    }

    /**
     * The wwPDB internal site configuration identifier.
     * @return WwpdbSiteId
     */
    public WwpdbSiteId getWwpdbSiteId() {
        return (WwpdbSiteId) (isText ? textFields.computeIfAbsent("wwpdb_site_id",
                WwpdbSiteId::new) : getBinaryColumn("wwpdb_site_id"));
    }

    /**
     * Comma separated list of supported experimental methods.
     * @return ExperimentalMethods
     */
    public ExperimentalMethods getExperimentalMethods() {
        return (ExperimentalMethods) (isText ? textFields.computeIfAbsent("experimental_methods",
                ExperimentalMethods::new) : getBinaryColumn("experimental_methods"));
    }

    /**
     * Comma separated list of requested accession code types.
     * @return RequestedAccessionTypes
     */
    public RequestedAccessionTypes getRequestedAccessionTypes() {
        return (RequestedAccessionTypes) (isText ? textFields.computeIfAbsent("requested_accession_types",
                RequestedAccessionTypes::new) : getBinaryColumn("requested_accession_types"));
    }

    /**
     * The validated contact e-mail address for the correponding depositor.
     * @return ValidatedContactEmail
     */
    public ValidatedContactEmail getValidatedContactEmail() {
        return (ValidatedContactEmail) (isText ? textFields.computeIfAbsent("validated_contact_email",
                ValidatedContactEmail::new) : getBinaryColumn("validated_contact_email"));
    }

    /**
     * The country location of the institution submitting the deposition.
     * @return Country
     */
    public Country getCountry() {
        return (Country) (isText ? textFields.computeIfAbsent("country",
                Country::new) : getBinaryColumn("country"));
    }

    /**
     * A flag to indicate the that the deposition is a contribution from a structural genomics project.
     * @return StructuralGenomicsFlag
     */
    public StructuralGenomicsFlag getStructuralGenomicsFlag() {
        return (StructuralGenomicsFlag) (isText ? textFields.computeIfAbsent("structural_genomics_flag",
                StructuralGenomicsFlag::new) : getBinaryColumn("structural_genomics_flag"));
    }

    /**
     * The name of the database associated with the related database code.
     * @return RelatedDatabaseName
     */
    public RelatedDatabaseName getRelatedDatabaseName() {
        return (RelatedDatabaseName) (isText ? textFields.computeIfAbsent("related_database_name",
                RelatedDatabaseName::new) : getBinaryColumn("related_database_name"));
    }

    /**
     * A database code closely related to the current deposition.
     * @return RelatedDatabaseCode
     */
    public RelatedDatabaseCode getRelatedDatabaseCode() {
        return (RelatedDatabaseCode) (isText ? textFields.computeIfAbsent("related_database_code",
                RelatedDatabaseCode::new) : getBinaryColumn("related_database_code"));
    }

    /**
     * The PDB ID code of the entry that is superseded by this entry.
     * @return ReplacePdbId
     */
    public ReplacePdbId getReplacePdbId() {
        return (ReplacePdbId) (isText ? textFields.computeIfAbsent("replace_pdb_id",
                ReplacePdbId::new) : getBinaryColumn("replace_pdb_id"));
    }
}
