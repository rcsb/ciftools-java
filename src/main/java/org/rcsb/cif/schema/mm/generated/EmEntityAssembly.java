package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_ENTITY_ASSEMBLY category
 * record details about each component of
 * the complex.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmEntityAssembly extends BaseCategory {
    public EmEntityAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmEntityAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmEntityAssembly(String name) {
        super(name);
    }

    /**
     * The value of _em_entity_assembly.id identifies
     * one component of the complex.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_assembly.id in the
     * ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_id", StrColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * The parent of this assembly.
     * This data item is an internal category pointer to _em_entity_assembly.id.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * @return IntColumn
     */
    public IntColumn getParentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("parent_id", IntColumn::new) :
                getBinaryColumn("parent_id"));
    }

    /**
     * The assembly type.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source", StrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * A description of types of components of the
     * assembly of the biological structure.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Name of this component in the observed assembly.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Additional details about the component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The Gene Ontology (GO) identifier for the component.
     * The GO id is the appropriate identifier used by the Gene Ontology
     * Consortium. Reference: Nature Genetics vol 25:25-29 (2000).
     * @return StrColumn
     */
    public StrColumn getGoId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("go_id", StrColumn::new) :
                getBinaryColumn("go_id"));
    }

    /**
     * The InterPro (IPR) identifier for the component.
     * The IPR id is the appropriate identifier used by the Interpro Resource.
     * Reference: Nucleic Acid Research vol 29(1):37-40(2001).
     * @return StrColumn
     */
    public StrColumn getIprId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ipr_id", StrColumn::new) :
                getBinaryColumn("ipr_id"));
    }

    /**
     * Alternative name of the component.
     * @return StrColumn
     */
    public StrColumn getSynonym() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("synonym", StrColumn::new) :
                getBinaryColumn("synonym"));
    }

    /**
     * number of copies
     * @return IntColumn
     */
    public IntColumn getNumberOfCopies() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_copies", IntColumn::new) :
                getBinaryColumn("number_of_copies"));
    }

    /**
     * oligomeric details
     * @return StrColumn
     */
    public StrColumn getOligomericDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oligomeric_details", StrColumn::new) :
                getBinaryColumn("oligomeric_details"));
    }

    /**
     * macromolecules associated with this component, if defined
     * as comma separated list of entity ids (integers).
     * @return StrColumn
     */
    public StrColumn getEntityIdList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_list", StrColumn::new) :
                getBinaryColumn("entity_id_list"));
    }

    /**
     * The species of the natural organism from which the component
     * was obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganismScientific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_organism_scientific", StrColumn::new) :
                getBinaryColumn("ebi_organism_scientific"));
    }

    /**
     * The common name of the species of the natural organism from which
     * the component was obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganismCommon() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_organism_common", StrColumn::new) :
                getBinaryColumn("ebi_organism_common"));
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getEbiStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_strain", StrColumn::new) :
                getBinaryColumn("ebi_strain"));
    }

    /**
     * The tissue of the natural organism from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_tissue", StrColumn::new) :
                getBinaryColumn("ebi_tissue"));
    }

    /**
     * The cell from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_cell", StrColumn::new) :
                getBinaryColumn("ebi_cell"));
    }

    /**
     * The organelle from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganelle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_organelle", StrColumn::new) :
                getBinaryColumn("ebi_organelle"));
    }

    /**
     * The cellular location of the component.
     * @return StrColumn
     */
    public StrColumn getEbiCellularLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_cellular_location", StrColumn::new) :
                getBinaryColumn("ebi_cellular_location"));
    }

    /**
     * A flag to indicate whether the component is engineered.
     * @return StrColumn
     */
    public StrColumn getEbiEngineered() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_engineered", StrColumn::new) :
                getBinaryColumn("ebi_engineered"));
    }

    /**
     * The expression system used to produce the component.
     * @return StrColumn
     */
    public StrColumn getEbiExpressionSystem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_expression_system", StrColumn::new) :
                getBinaryColumn("ebi_expression_system"));
    }

    /**
     * The plasmid used to produce the component.
     * @return StrColumn
     */
    public StrColumn getEbiExpressionSystemPlasmid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ebi_expression_system_plasmid", StrColumn::new) :
                getBinaryColumn("ebi_expression_system_plasmid"));
    }

    /**
     * mutant flag
     * @return StrColumn
     */
    public StrColumn getMutantFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mutant_flag", StrColumn::new) :
                getBinaryColumn("mutant_flag"));
    }
}
