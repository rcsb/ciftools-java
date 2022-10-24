package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_ENTITY_ASSEMBLY category
 * record details about each component of
 * the complex.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmEntityAssembly extends DelegatingCategory {
    public EmEntityAssembly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "assembly_id":
                return getAssemblyId();
            case "parent_id":
                return getParentId();
            case "source":
                return getSource();
            case "type":
                return getType();
            case "name":
                return getName();
            case "details":
                return getDetails();
            case "go_id":
                return getGoId();
            case "ipr_id":
                return getIprId();
            case "synonym":
                return getSynonym();
            case "number_of_copies":
                return getNumberOfCopies();
            case "oligomeric_details":
                return getOligomericDetails();
            case "entity_id_list":
                return getEntityIdList();
            case "ebi_organism_scientific":
                return getEbiOrganismScientific();
            case "ebi_organism_common":
                return getEbiOrganismCommon();
            case "ebi_strain":
                return getEbiStrain();
            case "ebi_tissue":
                return getEbiTissue();
            case "ebi_cell":
                return getEbiCell();
            case "ebi_organelle":
                return getEbiOrganelle();
            case "ebi_cellular_location":
                return getEbiCellularLocation();
            case "ebi_engineered":
                return getEbiEngineered();
            case "ebi_expression_system":
                return getEbiExpressionSystem();
            case "ebi_expression_system_plasmid":
                return getEbiExpressionSystemPlasmid();
            case "mutant_flag":
                return getMutantFlag();
            case "chimera":
                return getChimera();
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
     * This data item is a pointer to _em_assembly.id in the
     * ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
    }

    /**
     * The parent of this assembly.
     * This data item is an internal category pointer to _em_entity_assembly.id.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * @return IntColumn
     */
    public IntColumn getParentId() {
        return delegate.getColumn("parent_id", DelegatingIntColumn::new);
    }

    /**
     * The type of source (e.g., natural source) for the component (sample or sample
     * subcomponent)
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * The general type of the sample or sample subcomponent.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The name of the sample or sample subcomponent.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the sample or sample subcomponent.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The Gene Ontology (GO) identifier for the component.
     * The GO id is the appropriate identifier used by the Gene Ontology
     * Consortium. Reference: Nature Genetics vol 25:25-29 (2000).
     * @return StrColumn
     */
    public StrColumn getGoId() {
        return delegate.getColumn("go_id", DelegatingStrColumn::new);
    }

    /**
     * The InterPro (IPR) identifier for the component.
     * The IPR id is the appropriate identifier used by the Interpro Resource.
     * Reference: Nucleic Acid Research vol 29(1):37-40(2001).
     * @return StrColumn
     */
    public StrColumn getIprId() {
        return delegate.getColumn("ipr_id", DelegatingStrColumn::new);
    }

    /**
     * Alternative name of the component.
     * @return StrColumn
     */
    public StrColumn getSynonym() {
        return delegate.getColumn("synonym", DelegatingStrColumn::new);
    }

    /**
     * number of copies
     * @return IntColumn
     */
    public IntColumn getNumberOfCopies() {
        return delegate.getColumn("number_of_copies", DelegatingIntColumn::new);
    }

    /**
     * oligomeric details
     * @return StrColumn
     */
    public StrColumn getOligomericDetails() {
        return delegate.getColumn("oligomeric_details", DelegatingStrColumn::new);
    }

    /**
     * macromolecules associated with this component, if defined
     * as comma separated list of entity ids (integers).
     * @return StrColumn
     */
    public StrColumn getEntityIdList() {
        return delegate.getColumn("entity_id_list", DelegatingStrColumn::new);
    }

    /**
     * The species of the natural organism from which the component
     * was obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganismScientific() {
        return delegate.getColumn("ebi_organism_scientific", DelegatingStrColumn::new);
    }

    /**
     * The common name of the species of the natural organism from which
     * the component was obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganismCommon() {
        return delegate.getColumn("ebi_organism_common", DelegatingStrColumn::new);
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getEbiStrain() {
        return delegate.getColumn("ebi_strain", DelegatingStrColumn::new);
    }

    /**
     * The tissue of the natural organism from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiTissue() {
        return delegate.getColumn("ebi_tissue", DelegatingStrColumn::new);
    }

    /**
     * The cell from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiCell() {
        return delegate.getColumn("ebi_cell", DelegatingStrColumn::new);
    }

    /**
     * The organelle from which the component was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getEbiOrganelle() {
        return delegate.getColumn("ebi_organelle", DelegatingStrColumn::new);
    }

    /**
     * The cellular location of the component.
     * @return StrColumn
     */
    public StrColumn getEbiCellularLocation() {
        return delegate.getColumn("ebi_cellular_location", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the component is engineered.
     * @return StrColumn
     */
    public StrColumn getEbiEngineered() {
        return delegate.getColumn("ebi_engineered", DelegatingStrColumn::new);
    }

    /**
     * The expression system used to produce the component.
     * @return StrColumn
     */
    public StrColumn getEbiExpressionSystem() {
        return delegate.getColumn("ebi_expression_system", DelegatingStrColumn::new);
    }

    /**
     * The plasmid used to produce the component.
     * @return StrColumn
     */
    public StrColumn getEbiExpressionSystemPlasmid() {
        return delegate.getColumn("ebi_expression_system_plasmid", DelegatingStrColumn::new);
    }

    /**
     * mutant flag
     * @return StrColumn
     */
    public StrColumn getMutantFlag() {
        return delegate.getColumn("mutant_flag", DelegatingStrColumn::new);
    }

    /**
     * An indication if an assembly is contains a chimeric polymer
     * @return StrColumn
     */
    public StrColumn getChimera() {
        return delegate.getColumn("chimera", DelegatingStrColumn::new);
    }

}