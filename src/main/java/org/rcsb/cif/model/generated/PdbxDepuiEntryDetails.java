package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
 * information required to identify the depositor and route
 * deposition to an appropriate processing site.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepDatasetId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", SingleRowStrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * The wwPDB internal site configuration identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getWwpdbSiteId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("wwpdb_site_id", SingleRowStrColumn::new) :
                getBinaryColumn("wwpdb_site_id"));
    }

    /**
     * Comma separated list of supported experimental methods.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentalMethods() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experimental_methods", SingleRowStrColumn::new) :
                getBinaryColumn("experimental_methods"));
    }

    /**
     * Comma separated list of requested accession code types.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRequestedAccessionTypes() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("requested_accession_types", SingleRowStrColumn::new) :
                getBinaryColumn("requested_accession_types"));
    }

    /**
     * The validated contact e-mail address for the correponding depositor.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getValidatedContactEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("validated_contact_email", SingleRowStrColumn::new) :
                getBinaryColumn("validated_contact_email"));
    }

    /**
     * The country location of the institution submitting the deposition.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCountry() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("country", SingleRowStrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * A flag to indicate the that the deposition is a contribution from a structural genomics project.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStructuralGenomicsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("structural_genomics_flag", SingleRowStrColumn::new) :
                getBinaryColumn("structural_genomics_flag"));
    }

    /**
     * The name of the database associated with the related database code.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRelatedDatabaseName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("related_database_name", SingleRowStrColumn::new) :
                getBinaryColumn("related_database_name"));
    }

    /**
     * A database code closely related to the current deposition.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRelatedDatabaseCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("related_database_code", SingleRowStrColumn::new) :
                getBinaryColumn("related_database_code"));
    }

    /**
     * The PDB ID code of the entry that is superseded by this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReplacePdbId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("replace_pdb_id", SingleRowStrColumn::new) :
                getBinaryColumn("replace_pdb_id"));
    }
}
