package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_VIRUS_ENTITY category record details
 * of the icosahedral virus.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmVirusEntity extends BaseCategory {
    public EmVirusEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmVirusEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmVirusEntity(String name) {
        super(name);
    }

    /**
     * Is the unique identifier for VIRUS_ENTITY category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The host category description for the virus.
     * @return StrColumn
     */
    public StrColumn getVirusHostCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("virus_host_category", StrColumn::new) :
                getBinaryColumn("virus_host_category"));
    }

    /**
     * The host species from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getVirusHostSpecies() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("virus_host_species", StrColumn::new) :
                getBinaryColumn("virus_host_species"));
    }

    /**
     * The host cell from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getVirusHostGrowthCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("virus_host_growth_cell", StrColumn::new) :
                getBinaryColumn("virus_host_growth_cell"));
    }

    /**
     * The type of virus.
     * @return StrColumn
     */
    public StrColumn getVirusType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("virus_type", StrColumn::new) :
                getBinaryColumn("virus_type"));
    }

    /**
     * The isolate from which the virus was obtained.
     * @return StrColumn
     */
    public StrColumn getVirusIsolate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("virus_isolate", StrColumn::new) :
                getBinaryColumn("virus_isolate"));
    }

    /**
     * The International Committee on Taxonomy of Viruses
     * (ICTV) Taxon Identifier is the Virus Code used throughout the
     * ICTV database (ICTVdb). The ICTVdb id is the appropriate
     * identifier used by the International Committee on Taxonomy of Viruses
     * Resource. Reference: Virus Taxonomy, Academic Press (1999).
     * ISBN:0123702003.
     * NOTE: ICTV no longer maintains ids; maintained for legacy only.
     * @return StrColumn
     */
    public StrColumn getIctvdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ictvdb_id", StrColumn::new) :
                getBinaryColumn("ictvdb_id"));
    }

    /**
     * This data item is a pointer to _em_virus_entity.id in the
     * ENTITY_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Flag to indicate if the virus is enveloped or not.
     * @return StrColumn
     */
    public StrColumn getEnveloped() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("enveloped", StrColumn::new) :
                getBinaryColumn("enveloped"));
    }

    /**
     * Flag to indicate if the virus is empty or not.
     * @return StrColumn
     */
    public StrColumn getEmpty() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("empty", StrColumn::new) :
                getBinaryColumn("empty"));
    }

    /**
     * Additional details about this virus entity
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
