package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

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
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Entity extends DelegatingCategory {
    public Entity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "formula_weight":
                return getFormulaWeight();
            case "id":
                return getId();
            case "src_method":
                return getSrcMethod();
            case "type":
                return getType();
            case "pdbx_description":
                return getPdbxDescription();
            case "pdbx_number_of_molecules":
                return getPdbxNumberOfMolecules();
            case "pdbx_parent_entity_id":
                return getPdbxParentEntityId();
            case "pdbx_mutation":
                return getPdbxMutation();
            case "pdbx_fragment":
                return getPdbxFragment();
            case "pdbx_ec":
                return getPdbxEc();
            case "pdbx_modification":
                return getPdbxModification();
            case "pdbx_formula_weight_exptl":
                return getPdbxFormulaWeightExptl();
            case "pdbx_formula_weight_exptl_method":
                return getPdbxFormulaWeightExptlMethod();
            case "pdbx_target_id":
                return getPdbxTargetId();
            case "pdbx_entities_per_biological_unit":
                return getPdbxEntitiesPerBiologicalUnit();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return delegate.getColumn("formula_weight", DelegatingFloatColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
        return delegate.getColumn("src_method", DelegatingStrColumn::new);
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
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A description of the entity.
     * 
     * Corresponds to the compound name in the PDB format.
     * @return StrColumn
     */
    public StrColumn getPdbxDescription() {
        return delegate.getColumn("pdbx_description", DelegatingStrColumn::new);
    }

    /**
     * A place holder for the number of molecules of the entity in
     * the entry.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberOfMolecules() {
        return delegate.getColumn("pdbx_number_of_molecules", DelegatingIntColumn::new);
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
        return delegate.getColumn("pdbx_parent_entity_id", DelegatingStrColumn::new);
    }

    /**
     * Details about any entity mutation(s).
     * @return StrColumn
     */
    public StrColumn getPdbxMutation() {
        return delegate.getColumn("pdbx_mutation", DelegatingStrColumn::new);
    }

    /**
     * Entity fragment description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return delegate.getColumn("pdbx_fragment", DelegatingStrColumn::new);
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return StrColumn
     */
    public StrColumn getPdbxEc() {
        return delegate.getColumn("pdbx_ec", DelegatingStrColumn::new);
    }

    /**
     * Description(s) of any chemical or post-translational modifications
     * @return StrColumn
     */
    public StrColumn getPdbxModification() {
        return delegate.getColumn("pdbx_modification", DelegatingStrColumn::new);
    }

    /**
     * Experimentally determined formula mass in daltons of the entity
     * @return FloatColumn
     */
    public FloatColumn getPdbxFormulaWeightExptl() {
        return delegate.getColumn("pdbx_formula_weight_exptl", DelegatingFloatColumn::new);
    }

    /**
     * Method used to determine _entity.pdbx_formula_weight_exptl.
     * @return StrColumn
     */
    public StrColumn getPdbxFormulaWeightExptlMethod() {
        return delegate.getColumn("pdbx_formula_weight_exptl_method", DelegatingStrColumn::new);
    }

    /**
     * The value of _entity.target_id points to a TARGETDB target idenitifier
     * from which this entity was generated.
     * @return StrColumn
     */
    public StrColumn getPdbxTargetId() {
        return delegate.getColumn("pdbx_target_id", DelegatingStrColumn::new);
    }

    /**
     * Number of entity molecules in the biological assembly.
     * @return FloatColumn
     */
    public FloatColumn getPdbxEntitiesPerBiologicalUnit() {
        return delegate.getColumn("pdbx_entities_per_biological_unit", DelegatingFloatColumn::new);
    }

}