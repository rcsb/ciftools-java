package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Entity extends BaseCategory {
    public Entity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Entity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Entity(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FormulaWeight
     */
    public FormulaWeight getFormulaWeight() {
        return (FormulaWeight) (isText ? textFields.computeIfAbsent("formula_weight",
                FormulaWeight::new) : getBinaryColumn("formula_weight"));
    }

    /**
     * The value of _entity.id must uniquely identify a record in the
     * ENTITY list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The method by which the sample for the entity was produced.
     * Entities isolated directly from natural sources (tissues, soil
     * samples etc.) are expected to have further information in the
     * ENTITY_SRC_NAT category. Entities isolated from genetically
     * manipulated sources are expected to have further information in
     * the ENTITY_SRC_GEN category.
     * @return SrcMethod
     */
    public SrcMethod getSrcMethod() {
        return (SrcMethod) (isText ? textFields.computeIfAbsent("src_method",
                SrcMethod::new) : getBinaryColumn("src_method"));
    }

    /**
     * Defines the type of the entity.
     * 
     * Polymer entities are expected to have corresponding
     * ENTITY_POLY and associated entries.
     * 
     * Non-polymer entities are expected to have corresponding
     * CHEM_COMP and associated entries.
     * 
     * Water entities are not expected to have corresponding
     * entries in the ENTITY category.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A description of the entity.
     * 
     * Corresponds to the compound name in the PDB format.
     * @return PdbxDescription
     */
    public PdbxDescription getPdbxDescription() {
        return (PdbxDescription) (isText ? textFields.computeIfAbsent("pdbx_description",
                PdbxDescription::new) : getBinaryColumn("pdbx_description"));
    }

    /**
     * A place holder for the number of molecules of the entity in
     * the entry.
     * @return PdbxNumberOfMolecules
     */
    public PdbxNumberOfMolecules getPdbxNumberOfMolecules() {
        return (PdbxNumberOfMolecules) (isText ? textFields.computeIfAbsent("pdbx_number_of_molecules",
                PdbxNumberOfMolecules::new) : getBinaryColumn("pdbx_number_of_molecules"));
    }

    /**
     * An identifier for the parent entity if this entity
     * is part of a complex entity.  For instance a chimeric
     * entity may be decomposed into several independent
     * chemical entities where each component entity was
     * obtained from a different source.
     * @return PdbxParentEntityId
     */
    public PdbxParentEntityId getPdbxParentEntityId() {
        return (PdbxParentEntityId) (isText ? textFields.computeIfAbsent("pdbx_parent_entity_id",
                PdbxParentEntityId::new) : getBinaryColumn("pdbx_parent_entity_id"));
    }

    /**
     * Details about any entity mutation(s).
     * @return PdbxMutation
     */
    public PdbxMutation getPdbxMutation() {
        return (PdbxMutation) (isText ? textFields.computeIfAbsent("pdbx_mutation",
                PdbxMutation::new) : getBinaryColumn("pdbx_mutation"));
    }

    /**
     * Entity fragment description(s).
     * @return PdbxFragment
     */
    public PdbxFragment getPdbxFragment() {
        return (PdbxFragment) (isText ? textFields.computeIfAbsent("pdbx_fragment",
                PdbxFragment::new) : getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return PdbxEc
     */
    public PdbxEc getPdbxEc() {
        return (PdbxEc) (isText ? textFields.computeIfAbsent("pdbx_ec",
                PdbxEc::new) : getBinaryColumn("pdbx_ec"));
    }

    /**
     * Description(s) of any chemical or post-translational modifications
     * @return PdbxModification
     */
    public PdbxModification getPdbxModification() {
        return (PdbxModification) (isText ? textFields.computeIfAbsent("pdbx_modification",
                PdbxModification::new) : getBinaryColumn("pdbx_modification"));
    }

    /**
     * Experimentally determined formula mass in daltons of the entity
     * @return PdbxFormulaWeightExptl
     */
    public PdbxFormulaWeightExptl getPdbxFormulaWeightExptl() {
        return (PdbxFormulaWeightExptl) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_exptl",
                PdbxFormulaWeightExptl::new) : getBinaryColumn("pdbx_formula_weight_exptl"));
    }

    /**
     * Method used to determine _entity.pdbx_formula_weight_exptl.
     * @return PdbxFormulaWeightExptlMethod
     */
    public PdbxFormulaWeightExptlMethod getPdbxFormulaWeightExptlMethod() {
        return (PdbxFormulaWeightExptlMethod) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_exptl_method",
                PdbxFormulaWeightExptlMethod::new) : getBinaryColumn("pdbx_formula_weight_exptl_method"));
    }

    /**
     * The value of _entity.target_id points to a TARGETDB target idenitifier
     * from which this entity was generated.
     * @return PdbxTargetId
     */
    public PdbxTargetId getPdbxTargetId() {
        return (PdbxTargetId) (isText ? textFields.computeIfAbsent("pdbx_target_id",
                PdbxTargetId::new) : getBinaryColumn("pdbx_target_id"));
    }

    /**
     * Number of entity molecules in the biological assembly.
     * @return PdbxEntitiesPerBiologicalUnit
     */
    public PdbxEntitiesPerBiologicalUnit getPdbxEntitiesPerBiologicalUnit() {
        return (PdbxEntitiesPerBiologicalUnit) (isText ? textFields.computeIfAbsent("pdbx_entities_per_biological_unit",
                PdbxEntitiesPerBiologicalUnit::new) : getBinaryColumn("pdbx_entities_per_biological_unit"));
    }
}
