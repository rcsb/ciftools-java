package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY category record details (such as
 * chemical composition, name and source) about the molecular
 * entities that are present in the crystallographic structure.
 * 
 * Items in the various ENTITY subcategories provide a full
 * chemical description of these molecular entities.
 * 
 * Entities are of three types:  polymer, non-polymer and water.
 * Note that the water category includes only water;  ordered
 * solvent such as sulfate ion or acetone would be described as
 * individual non-polymer entities.
 * 
 * The ENTITY category is specific to macromolecular CIF
 * applications and replaces the function of the CHEMICAL category
 * in the CIF core.
 * 
 * It is important to remember that the ENTITY data are not the
 * result of the crystallographic experiment;  those results are
 * represented by the ATOM_SITE data items. ENTITY data items
 * describe the chemistry of the molecules under investigation
 * and can most usefully be thought of as the ideal groups to which
 * the structure is restrained or constrained during refinement.
 * 
 * It is also important to remember that entities do not correspond
 * directly to the enumeration of the contents of the asymmetric
 * unit. Entities are described only once, even in those structures
 * that contain multiple observations of an entity. The
 * STRUCT_ASYM data items, which reference the entity list,
 * describe and label the contents of the asymmetric unit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("formula_weight", FloatColumn::new) :
                getBinaryColumn("formula_weight"));
    }

    /**
     * The value of _entity.id must uniquely identify a record in the
     * ENTITY list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The method by which the sample for the entity was produced.
     * Entities isolated directly from natural sources (tissues, soil
     * samples etc.) are expected to have further information in the
     * ENTITY_SRC_NAT category. Entities isolated from genetically
     * manipulated sources are expected to have further information in
     * the ENTITY_SRC_GEN category.
     * @return StrColumn
     */
    public StrColumn getSrcMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("src_method", StrColumn::new) :
                getBinaryColumn("src_method"));
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
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A description of the entity.
     * 
     * Corresponds to the compound name in the PDB format.
     * @return StrColumn
     */
    public StrColumn getPdbxDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_description", StrColumn::new) :
                getBinaryColumn("pdbx_description"));
    }

    /**
     * A place holder for the number of molecules of the entity in
     * the entry.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberOfMolecules() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_of_molecules", IntColumn::new) :
                getBinaryColumn("pdbx_number_of_molecules"));
    }

    /**
     * An identifier for the parent entity if this entity
     * is part of a complex entity.  For instance a chimeric
     * entity may be decomposed into several independent
     * chemical entities where each component entity was
     * obtained from a different source.
     * @return StrColumn
     */
    public StrColumn getPdbxParentEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_parent_entity_id", StrColumn::new) :
                getBinaryColumn("pdbx_parent_entity_id"));
    }

    /**
     * Details about any entity mutation(s).
     * @return StrColumn
     */
    public StrColumn getPdbxMutation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_mutation", StrColumn::new) :
                getBinaryColumn("pdbx_mutation"));
    }

    /**
     * Entity fragment description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_fragment", StrColumn::new) :
                getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return StrColumn
     */
    public StrColumn getPdbxEc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ec", StrColumn::new) :
                getBinaryColumn("pdbx_ec"));
    }

    /**
     * Description(s) of any chemical or post-translational modifications
     * @return StrColumn
     */
    public StrColumn getPdbxModification() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_modification", StrColumn::new) :
                getBinaryColumn("pdbx_modification"));
    }

    /**
     * Experimentally determined formula mass in daltons of the entity
     * @return FloatColumn
     */
    public FloatColumn getPdbxFormulaWeightExptl() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_exptl", FloatColumn::new) :
                getBinaryColumn("pdbx_formula_weight_exptl"));
    }

    /**
     * Method used to determine _entity.pdbx_formula_weight_exptl.
     * @return StrColumn
     */
    public StrColumn getPdbxFormulaWeightExptlMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_exptl_method", StrColumn::new) :
                getBinaryColumn("pdbx_formula_weight_exptl_method"));
    }

    /**
     * The value of _entity.target_id points to a TARGETDB target idenitifier
     * from which this entity was generated.
     * @return StrColumn
     */
    public StrColumn getPdbxTargetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_target_id", StrColumn::new) :
                getBinaryColumn("pdbx_target_id"));
    }

    /**
     * Number of entity molecules in the biological assembly.
     * @return FloatColumn
     */
    public FloatColumn getPdbxEntitiesPerBiologicalUnit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_entities_per_biological_unit", FloatColumn::new) :
                getBinaryColumn("pdbx_entities_per_biological_unit"));
    }
}
