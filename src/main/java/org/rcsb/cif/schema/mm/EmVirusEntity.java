package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_VIRUS_ENTITY category record details
 * of the icosahedral virus.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVirusEntity extends DelegatingCategory {
    public EmVirusEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "virus_host_category":
                return getVirusHostCategory();
            case "virus_host_species":
                return getVirusHostSpecies();
            case "virus_host_growth_cell":
                return getVirusHostGrowthCell();
            case "virus_type":
                return getVirusType();
            case "virus_isolate":
                return getVirusIsolate();
            case "ictvdb_id":
                return getIctvdbId();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "enveloped":
                return getEnveloped();
            case "empty":
                return getEmpty();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The host category description for the virus.
     * @return StrColumn
     */
    public StrColumn getVirusHostCategory() {
        return delegate.getColumn("virus_host_category", DelegatingStrColumn::new);
    }

    /**
     * The host species from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getVirusHostSpecies() {
        return delegate.getColumn("virus_host_species", DelegatingStrColumn::new);
    }

    /**
     * The host cell from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getVirusHostGrowthCell() {
        return delegate.getColumn("virus_host_growth_cell", DelegatingStrColumn::new);
    }

    /**
     * The type of virus.
     * @return StrColumn
     */
    public StrColumn getVirusType() {
        return delegate.getColumn("virus_type", DelegatingStrColumn::new);
    }

    /**
     * The isolate from which the virus was obtained.
     * @return StrColumn
     */
    public StrColumn getVirusIsolate() {
        return delegate.getColumn("virus_isolate", DelegatingStrColumn::new);
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
        return delegate.getColumn("ictvdb_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_virus_entity.id in the
     * ENTITY_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Flag to indicate if the virus is enveloped or not.
     * @return StrColumn
     */
    public StrColumn getEnveloped() {
        return delegate.getColumn("enveloped", DelegatingStrColumn::new);
    }

    /**
     * Flag to indicate if the virus is empty or not.
     * @return StrColumn
     */
    public StrColumn getEmpty() {
        return delegate.getColumn("empty", DelegatingStrColumn::new);
    }

    /**
     * Additional details about this virus entity
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}