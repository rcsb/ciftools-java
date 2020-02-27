package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmExternalReferenceInfo extends BaseCategory {
    public IhmExternalReferenceInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmExternalReferenceInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmExternalReferenceInfo(String name) {
        super(name);
    }

    /**
     * A unique identifier for the external reference.
     * @return IntColumn
     */
    public IntColumn getReferenceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reference_id", IntColumn::new) :
                getBinaryColumn("reference_id"));
    }

    /**
     * The name of the reference provider.
     * @return StrColumn
     */
    public StrColumn getReferenceProvider() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference_provider", StrColumn::new) :
                getBinaryColumn("reference_provider"));
    }

    /**
     * The type of external reference.
     * Currently, only Digital Object Identifiers (DOIs) and supplementary files
     * stored locally are supported.
     * @return StrColumn
     */
    public StrColumn getReferenceType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference_type", StrColumn::new) :
                getBinaryColumn("reference_type"));
    }

    /**
     * The external reference or the Digital Object Identifier (DOI).
     * This field is not relevant for local files.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference", StrColumn::new) :
                getBinaryColumn("reference"));
    }

    /**
     * The type of object that the external reference points to, usually
     * a single file or an archive.
     * @return StrColumn
     */
    public StrColumn getRefersTo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refers_to", StrColumn::new) :
                getBinaryColumn("refers_to"));
    }

    /**
     * The Uniform Resource Locator (URL) corresponding to the external reference (DOI).
     * This URL should link to the corresponding downloadable file or archive and is provided
     * to enable automated software to download the referenced file or archive.
     * @return StrColumn
     */
    public StrColumn getAssociatedUrl() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("associated_url", StrColumn::new) :
                getBinaryColumn("associated_url"));
    }
}
