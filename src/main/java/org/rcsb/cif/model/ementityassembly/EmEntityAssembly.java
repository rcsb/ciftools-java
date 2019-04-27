package org.rcsb.cif.model.ementityassembly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _em_assembly.id in the
     * ASSEMBLY category.
     * @return AssemblyId
     */
    public AssemblyId getAssemblyId() {
        return (AssemblyId) (isText ? textFields.computeIfAbsent("assembly_id",
                AssemblyId::new) : getBinaryColumn("assembly_id"));
    }

    /**
     * The parent of this assembly.
     * This data item is an internal category pointer to _em_entity_assembly.id.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * @return ParentId
     */
    public ParentId getParentId() {
        return (ParentId) (isText ? textFields.computeIfAbsent("parent_id",
                ParentId::new) : getBinaryColumn("parent_id"));
    }

    /**
     * The assembly type.
     * @return Source
     */
    public Source getSource() {
        return (Source) (isText ? textFields.computeIfAbsent("source",
                Source::new) : getBinaryColumn("source"));
    }

    /**
     * A description of types of components of the
     * assembly of the biological structure.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Name of this component in the observed assembly.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Additional details about the component.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The Gene Ontology (GO) identifier for the component.
     * The GO id is the appropriate identifier used by the Gene Ontology
     * Consortium. Reference: Nature Genetics vol 25:25-29 (2000).
     * @return GoId
     */
    public GoId getGoId() {
        return (GoId) (isText ? textFields.computeIfAbsent("go_id",
                GoId::new) : getBinaryColumn("go_id"));
    }

    /**
     * The InterPro (IPR) identifier for the component.
     * The IPR id is the appropriate identifier used by the Interpro Resource.
     * Reference: Nucleic Acid Research vol 29(1):37-40(2001).
     * @return IprId
     */
    public IprId getIprId() {
        return (IprId) (isText ? textFields.computeIfAbsent("ipr_id",
                IprId::new) : getBinaryColumn("ipr_id"));
    }

    /**
     * Alternative name of the component.
     * @return Synonym
     */
    public Synonym getSynonym() {
        return (Synonym) (isText ? textFields.computeIfAbsent("synonym",
                Synonym::new) : getBinaryColumn("synonym"));
    }

    /**
     * number of copies
     * @return NumberOfCopies
     */
    public NumberOfCopies getNumberOfCopies() {
        return (NumberOfCopies) (isText ? textFields.computeIfAbsent("number_of_copies",
                NumberOfCopies::new) : getBinaryColumn("number_of_copies"));
    }

    /**
     * oligomeric details
     * @return OligomericDetails
     */
    public OligomericDetails getOligomericDetails() {
        return (OligomericDetails) (isText ? textFields.computeIfAbsent("oligomeric_details",
                OligomericDetails::new) : getBinaryColumn("oligomeric_details"));
    }

    /**
     * macromolecules associated with this component, if defined
     * as comma separated list of entity ids (integers).
     * @return EntityIdList
     */
    public EntityIdList getEntityIdList() {
        return (EntityIdList) (isText ? textFields.computeIfAbsent("entity_id_list",
                EntityIdList::new) : getBinaryColumn("entity_id_list"));
    }

    /**
     * The species of the natural organism from which the component
     * was obtained.
     * @return EbiOrganismScientific
     */
    public EbiOrganismScientific getEbiOrganismScientific() {
        return (EbiOrganismScientific) (isText ? textFields.computeIfAbsent("ebi_organism_scientific",
                EbiOrganismScientific::new) : getBinaryColumn("ebi_organism_scientific"));
    }

    /**
     * The common name of the species of the natural organism from which
     * the component was obtained.
     * @return EbiOrganismCommon
     */
    public EbiOrganismCommon getEbiOrganismCommon() {
        return (EbiOrganismCommon) (isText ? textFields.computeIfAbsent("ebi_organism_common",
                EbiOrganismCommon::new) : getBinaryColumn("ebi_organism_common"));
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return EbiStrain
     */
    public EbiStrain getEbiStrain() {
        return (EbiStrain) (isText ? textFields.computeIfAbsent("ebi_strain",
                EbiStrain::new) : getBinaryColumn("ebi_strain"));
    }

    /**
     * The tissue of the natural organism from which the component was
     * obtained.
     * @return EbiTissue
     */
    public EbiTissue getEbiTissue() {
        return (EbiTissue) (isText ? textFields.computeIfAbsent("ebi_tissue",
                EbiTissue::new) : getBinaryColumn("ebi_tissue"));
    }

    /**
     * The cell from which the component was
     * obtained.
     * @return EbiCell
     */
    public EbiCell getEbiCell() {
        return (EbiCell) (isText ? textFields.computeIfAbsent("ebi_cell",
                EbiCell::new) : getBinaryColumn("ebi_cell"));
    }

    /**
     * The organelle from which the component was
     * obtained.
     * @return EbiOrganelle
     */
    public EbiOrganelle getEbiOrganelle() {
        return (EbiOrganelle) (isText ? textFields.computeIfAbsent("ebi_organelle",
                EbiOrganelle::new) : getBinaryColumn("ebi_organelle"));
    }

    /**
     * The cellular location of the component.
     * @return EbiCellularLocation
     */
    public EbiCellularLocation getEbiCellularLocation() {
        return (EbiCellularLocation) (isText ? textFields.computeIfAbsent("ebi_cellular_location",
                EbiCellularLocation::new) : getBinaryColumn("ebi_cellular_location"));
    }

    /**
     * A flag to indicate whether the component is engineered.
     * @return EbiEngineered
     */
    public EbiEngineered getEbiEngineered() {
        return (EbiEngineered) (isText ? textFields.computeIfAbsent("ebi_engineered",
                EbiEngineered::new) : getBinaryColumn("ebi_engineered"));
    }

    /**
     * The expression system used to produce the component.
     * @return EbiExpressionSystem
     */
    public EbiExpressionSystem getEbiExpressionSystem() {
        return (EbiExpressionSystem) (isText ? textFields.computeIfAbsent("ebi_expression_system",
                EbiExpressionSystem::new) : getBinaryColumn("ebi_expression_system"));
    }

    /**
     * The plasmid used to produce the component.
     * @return EbiExpressionSystemPlasmid
     */
    public EbiExpressionSystemPlasmid getEbiExpressionSystemPlasmid() {
        return (EbiExpressionSystemPlasmid) (isText ? textFields.computeIfAbsent("ebi_expression_system_plasmid",
                EbiExpressionSystemPlasmid::new) : getBinaryColumn("ebi_expression_system_plasmid"));
    }

    /**
     * mutant flag
     * @return MutantFlag
     */
    public MutantFlag getMutantFlag() {
        return (MutantFlag) (isText ? textFields.computeIfAbsent("mutant_flag",
                MutantFlag::new) : getBinaryColumn("mutant_flag"));
    }
}
