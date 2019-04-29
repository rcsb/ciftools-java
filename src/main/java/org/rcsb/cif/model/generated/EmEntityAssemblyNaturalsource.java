package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category record taxonomic details about the natural source for EM
 * assemblies and assembly components.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmEntityAssemblyNaturalsource extends BaseCategory {
    public EmEntityAssemblyNaturalsource(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmEntityAssemblyNaturalsource(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmEntityAssemblyNaturalsource(String name) {
        super(name);
    }

    /**
     * The cell type from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cell", StrColumn::new) :
                getBinaryColumn("cell"));
    }

    /**
     * The cellular location of the component.
     * @return StrColumn
     */
    public StrColumn getCellularLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cellular_location", StrColumn::new) :
                getBinaryColumn("cellular_location"));
    }

    /**
     * Pointer to the assembly component defined in the EM ENTITY ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Ordinal key for the em_entity_assembly_naturalsource category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy id for the natural organism source of the component.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ncbi_tax_id", IntColumn::new) :
                getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * The genus-species of the natural organism from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism", StrColumn::new) :
                getBinaryColumn("organism"));
    }

    /**
     * The organelle from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getOrganelle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organelle", StrColumn::new) :
                getBinaryColumn("organelle"));
    }

    /**
     * The organ of the organism from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getOrgan() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organ", StrColumn::new) :
                getBinaryColumn("organ"));
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
    }

    /**
     * The tissue of the natural organism from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tissue", StrColumn::new) :
                getBinaryColumn("tissue"));
    }
}
