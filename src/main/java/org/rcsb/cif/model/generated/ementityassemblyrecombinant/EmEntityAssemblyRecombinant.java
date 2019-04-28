package org.rcsb.cif.model.generated.ementityassemblyrecombinant;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmEntityAssemblyRecombinant extends BaseCategory {
    public EmEntityAssemblyRecombinant(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmEntityAssemblyRecombinant(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmEntityAssemblyRecombinant(String name) {
        super(name);
    }

    /**
     * The cell of the host organism from which the expressed component was
     * obtained, if relevant.
     * @return Cell
     */
    public Cell getCell() {
        return (Cell) (isText ? textFields.computeIfAbsent("cell",
                Cell::new) : getBinaryColumn("cell"));
    }

    /**
     * Pointer to the expressed component described in the EM ENTITY ASSEMBLY category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Ordinal identifier
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy id of the expression host used to produce the component.
     * @return NcbiTaxId
     */
    public NcbiTaxId getNcbiTaxId() {
        return (NcbiTaxId) (isText ? textFields.computeIfAbsent("ncbi_tax_id",
                NcbiTaxId::new) : getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * Expression system host organism used to produce the component.
     * @return Organism
     */
    public Organism getOrganism() {
        return (Organism) (isText ? textFields.computeIfAbsent("organism",
                Organism::new) : getBinaryColumn("organism"));
    }

    /**
     * The plasmid used to produce the component in the expression system.
     * @return Plasmid
     */
    public Plasmid getPlasmid() {
        return (Plasmid) (isText ? textFields.computeIfAbsent("plasmid",
                Plasmid::new) : getBinaryColumn("plasmid"));
    }

    /**
     * The strain of the host organism from which the expresed component was
     * obtained, if relevant.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }
}
