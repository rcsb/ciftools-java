package org.rcsb.cif.model.entity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
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
}
