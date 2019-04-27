package org.rcsb.cif.model.emvirusentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The host category description for the virus.
     * @return VirusHostCategory
     */
    public VirusHostCategory getVirusHostCategory() {
        return (VirusHostCategory) (isText ? textFields.computeIfAbsent("virus_host_category",
                VirusHostCategory::new) : getBinaryColumn("virus_host_category"));
    }

    /**
     * The host species from which the virus was isolated.
     * @return VirusHostSpecies
     */
    public VirusHostSpecies getVirusHostSpecies() {
        return (VirusHostSpecies) (isText ? textFields.computeIfAbsent("virus_host_species",
                VirusHostSpecies::new) : getBinaryColumn("virus_host_species"));
    }

    /**
     * The host cell from which the virus was isolated.
     * @return VirusHostGrowthCell
     */
    public VirusHostGrowthCell getVirusHostGrowthCell() {
        return (VirusHostGrowthCell) (isText ? textFields.computeIfAbsent("virus_host_growth_cell",
                VirusHostGrowthCell::new) : getBinaryColumn("virus_host_growth_cell"));
    }

    /**
     * The type of virus.
     * @return VirusType
     */
    public VirusType getVirusType() {
        return (VirusType) (isText ? textFields.computeIfAbsent("virus_type",
                VirusType::new) : getBinaryColumn("virus_type"));
    }

    /**
     * The isolate from which the virus was obtained.
     * @return VirusIsolate
     */
    public VirusIsolate getVirusIsolate() {
        return (VirusIsolate) (isText ? textFields.computeIfAbsent("virus_isolate",
                VirusIsolate::new) : getBinaryColumn("virus_isolate"));
    }

    /**
     * The International Committee on Taxonomy of Viruses
     * (ICTV) Taxon Identifier is the Virus Code used throughout the
     * ICTV database (ICTVdb). The ICTVdb id is the appropriate
     * identifier used by the International Committee on Taxonomy of Viruses
     * Resource. Reference: Virus Taxonomy, Academic Press (1999).
     * ISBN:0123702003.
     * NOTE: ICTV no longer maintains ids; maintained for legacy only.
     * @return IctvdbId
     */
    public IctvdbId getIctvdbId() {
        return (IctvdbId) (isText ? textFields.computeIfAbsent("ictvdb_id",
                IctvdbId::new) : getBinaryColumn("ictvdb_id"));
    }

    /**
     * This data item is a pointer to _em_virus_entity.id in the
     * ENTITY_ASSEMBLY category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Flag to indicate if the virus is enveloped or not.
     * @return Enveloped
     */
    public Enveloped getEnveloped() {
        return (Enveloped) (isText ? textFields.computeIfAbsent("enveloped",
                Enveloped::new) : getBinaryColumn("enveloped"));
    }

    /**
     * Flag to indicate if the virus is empty or not.
     * @return Empty
     */
    public Empty getEmpty() {
        return (Empty) (isText ? textFields.computeIfAbsent("empty",
                Empty::new) : getBinaryColumn("empty"));
    }

    /**
     * Additional details about this virus entity
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
