package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", StrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * The wwPDB internal site configuration identifier.
     * @return StrColumn
     */
    public StrColumn getWwpdbSiteId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("wwpdb_site_id", StrColumn::new) :
                getBinaryColumn("wwpdb_site_id"));
    }

    /**
     * Comma separated list of supported experimental methods.
     * @return StrColumn
     */
    public StrColumn getExperimentalMethods() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experimental_methods", StrColumn::new) :
                getBinaryColumn("experimental_methods"));
    }

    /**
     * Comma separated list of requested accession code types.
     * @return StrColumn
     */
    public StrColumn getRequestedAccessionTypes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("requested_accession_types", StrColumn::new) :
                getBinaryColumn("requested_accession_types"));
    }

    /**
     * The validated contact e-mail address for the correponding depositor.
     * @return StrColumn
     */
    public StrColumn getValidatedContactEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("validated_contact_email", StrColumn::new) :
                getBinaryColumn("validated_contact_email"));
    }

    /**
     * The country location of the institution submitting the deposition.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("country", StrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * A flag to indicate the that the deposition is a contribution from a structural genomics project.
     * @return StrColumn
     */
    public StrColumn getStructuralGenomicsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structural_genomics_flag", StrColumn::new) :
                getBinaryColumn("structural_genomics_flag"));
    }

    /**
     * The name of the database associated with the related database code.
     * @return StrColumn
     */
    public StrColumn getRelatedDatabaseName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_database_name", StrColumn::new) :
                getBinaryColumn("related_database_name"));
    }

    /**
     * A database code closely related to the current deposition.
     * @return StrColumn
     */
    public StrColumn getRelatedDatabaseCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_database_code", StrColumn::new) :
                getBinaryColumn("related_database_code"));
    }

    /**
     * The PDB ID code of the entry that is superseded by this entry.
     * @return StrColumn
     */
    public StrColumn getReplacePdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replace_pdb_id", StrColumn::new) :
                getBinaryColumn("replace_pdb_id"));
    }
}
