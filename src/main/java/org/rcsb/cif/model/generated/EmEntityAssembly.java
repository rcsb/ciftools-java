package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_assembly.id in the
     * ASSEMBLY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAssemblyId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("assembly_id", SingleRowStrColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * The parent of this assembly.
     * This data item is an internal category pointer to _em_entity_assembly.id.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getParentId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("parent_id", SingleRowIntColumn::new) :
                getBinaryColumn("parent_id"));
    }

    /**
     * The assembly type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSource() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("source", SingleRowStrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * A description of types of components of the
     * assembly of the biological structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Name of this component in the observed assembly.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Additional details about the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The Gene Ontology (GO) identifier for the component.
     * The GO id is the appropriate identifier used by the Gene Ontology
     * Consortium. Reference: Nature Genetics vol 25:25-29 (2000).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getGoId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("go_id", SingleRowStrColumn::new) :
                getBinaryColumn("go_id"));
    }

    /**
     * The InterPro (IPR) identifier for the component.
     * The IPR id is the appropriate identifier used by the Interpro Resource.
     * Reference: Nucleic Acid Research vol 29(1):37-40(2001).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIprId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ipr_id", SingleRowStrColumn::new) :
                getBinaryColumn("ipr_id"));
    }

    /**
     * Alternative name of the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSynonym() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("synonym", SingleRowStrColumn::new) :
                getBinaryColumn("synonym"));
    }

    /**
     * number of copies
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberOfCopies() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_of_copies", SingleRowIntColumn::new) :
                getBinaryColumn("number_of_copies"));
    }

    /**
     * oligomeric details
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOligomericDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("oligomeric_details", SingleRowStrColumn::new) :
                getBinaryColumn("oligomeric_details"));
    }

    /**
     * macromolecules associated with this component, if defined
     * as comma separated list of entity ids (integers).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityIdList() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_id_list", SingleRowStrColumn::new) :
                getBinaryColumn("entity_id_list"));
    }

    /**
     * The species of the natural organism from which the component
     * was obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiOrganismScientific() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_organism_scientific", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_organism_scientific"));
    }

    /**
     * The common name of the species of the natural organism from which
     * the component was obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiOrganismCommon() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_organism_common", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_organism_common"));
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiStrain() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_strain", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_strain"));
    }

    /**
     * The tissue of the natural organism from which the component was
     * obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiTissue() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_tissue", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_tissue"));
    }

    /**
     * The cell from which the component was
     * obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiCell() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_cell", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_cell"));
    }

    /**
     * The organelle from which the component was
     * obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiOrganelle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_organelle", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_organelle"));
    }

    /**
     * The cellular location of the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiCellularLocation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_cellular_location", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_cellular_location"));
    }

    /**
     * A flag to indicate whether the component is engineered.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiEngineered() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_engineered", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_engineered"));
    }

    /**
     * The expression system used to produce the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiExpressionSystem() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_expression_system", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_expression_system"));
    }

    /**
     * The plasmid used to produce the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEbiExpressionSystemPlasmid() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ebi_expression_system_plasmid", SingleRowStrColumn::new) :
                getBinaryColumn("ebi_expression_system_plasmid"));
    }

    /**
     * mutant flag
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMutantFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mutant_flag", SingleRowStrColumn::new) :
                getBinaryColumn("mutant_flag"));
    }
}
