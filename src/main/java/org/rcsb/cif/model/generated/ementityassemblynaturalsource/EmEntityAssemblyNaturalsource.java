package org.rcsb.cif.model.generated.ementityassemblynaturalsource;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Cell
     */
    public Cell getCell() {
        return (Cell) (isText ? textFields.computeIfAbsent("cell",
                Cell::new) : getBinaryColumn("cell"));
    }

    /**
     * The cellular location of the component.
     * @return CellularLocation
     */
    public CellularLocation getCellularLocation() {
        return (CellularLocation) (isText ? textFields.computeIfAbsent("cellular_location",
                CellularLocation::new) : getBinaryColumn("cellular_location"));
    }

    /**
     * Pointer to the assembly component defined in the EM ENTITY ASSEMBLY category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Ordinal key for the em_entity_assembly_naturalsource category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy id for the natural organism source of the component.
     * @return NcbiTaxId
     */
    public NcbiTaxId getNcbiTaxId() {
        return (NcbiTaxId) (isText ? textFields.computeIfAbsent("ncbi_tax_id",
                NcbiTaxId::new) : getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * The genus-species of the natural organism from which the component was obtained.
     * @return Organism
     */
    public Organism getOrganism() {
        return (Organism) (isText ? textFields.computeIfAbsent("organism",
                Organism::new) : getBinaryColumn("organism"));
    }

    /**
     * The organelle from which the component was obtained.
     * @return Organelle
     */
    public Organelle getOrganelle() {
        return (Organelle) (isText ? textFields.computeIfAbsent("organelle",
                Organelle::new) : getBinaryColumn("organelle"));
    }

    /**
     * The organ of the organism from which the component was obtained.
     * @return Organ
     */
    public Organ getOrgan() {
        return (Organ) (isText ? textFields.computeIfAbsent("organ",
                Organ::new) : getBinaryColumn("organ"));
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }

    /**
     * The tissue of the natural organism from which the component was obtained.
     * @return Tissue
     */
    public Tissue getTissue() {
        return (Tissue) (isText ? textFields.computeIfAbsent("tissue",
                Tissue::new) : getBinaryColumn("tissue"));
    }
}
