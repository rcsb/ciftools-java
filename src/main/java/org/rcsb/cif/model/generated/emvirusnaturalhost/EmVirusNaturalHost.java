package org.rcsb.cif.model.generated.emvirusnaturalhost;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmVirusNaturalHost extends BaseCategory {
    public EmVirusNaturalHost(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmVirusNaturalHost(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmVirusNaturalHost(String name) {
        super(name);
    }

    /**
     * Pointer to _em_entity_assembly.id.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Unique identifier for the virus natural host.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy of the host species from which the virus was isolated.
     * @return NcbiTaxId
     */
    public NcbiTaxId getNcbiTaxId() {
        return (NcbiTaxId) (isText ? textFields.computeIfAbsent("ncbi_tax_id",
                NcbiTaxId::new) : getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * The host organism from which the virus was isolated.
     * @return Organism
     */
    public Organism getOrganism() {
        return (Organism) (isText ? textFields.computeIfAbsent("organism",
                Organism::new) : getBinaryColumn("organism"));
    }

    /**
     * The strain of the host organism from which the virus was
     * obtained, if relevant.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }
}
