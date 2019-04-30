package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category record details
 * about recombinant expression of the assembly or assembly component.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cell", StrColumn::new) :
                getBinaryColumn("cell"));
    }

    /**
     * Pointer to the expressed component described in the EM ENTITY ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Ordinal identifier
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The NCBI taxonomy id of the expression host used to produce the component.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ncbi_tax_id", IntColumn::new) :
                getBinaryColumn("ncbi_tax_id"));
    }

    /**
     * Expression system host organism used to produce the component.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism", StrColumn::new) :
                getBinaryColumn("organism"));
    }

    /**
     * The plasmid used to produce the component in the expression system.
     * @return StrColumn
     */
    public StrColumn getPlasmid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("plasmid", StrColumn::new) :
                getBinaryColumn("plasmid"));
    }

    /**
     * The strain of the host organism from which the expresed component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
    }
}
