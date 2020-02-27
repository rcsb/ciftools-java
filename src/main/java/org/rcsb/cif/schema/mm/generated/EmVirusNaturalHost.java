package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category record details of a virus entity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Unique identifier for the virus natural host.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy of the host species from which the virus was isolated.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ncbi_tax_id", IntColumn::new) :
                getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * The host organism from which the virus was isolated.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism", StrColumn::new) :
                getBinaryColumn("organism"));
    }

    /**
     * The strain of the host organism from which the virus was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
    }
}
