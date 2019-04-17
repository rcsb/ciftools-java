package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class Entity extends BaseCifCategory {
    public Entity(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public Entity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * A description of special aspects of the entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FormulaWeight
     */
    public FormulaWeight getFormulaWeight() {
        return (FormulaWeight) (isText ? getTextColumn("formula_weight") : getBinaryColumn("formula_weight"));
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
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
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
        return (SrcMethod) (isText ? getTextColumn("src_method") : getBinaryColumn("src_method"));
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
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type"));
    }

    /**
     * A description of the entity.
     * 
     * Corresponds to the compound name in the PDB format.
     * @return PdbxDescription
     */
    public PdbxDescription getPdbxDescription() {
        return (PdbxDescription) (isText ? getTextColumn("pdbx_description") : getBinaryColumn("pdbx_description"));
    }

    /**
     * A place holder for the number of molecules of the entity in
     * the entry.
     * @return PdbxNumberOfMolecules
     */
    public PdbxNumberOfMolecules getPdbxNumberOfMolecules() {
        return (PdbxNumberOfMolecules) (isText ? getTextColumn("pdbx_number_of_molecules") : getBinaryColumn("pdbx_number_of_molecules"));
    }

    /**
     * Details about any entity mutation(s).
     * @return PdbxMutation
     */
    public PdbxMutation getPdbxMutation() {
        return (PdbxMutation) (isText ? getTextColumn("pdbx_mutation") : getBinaryColumn("pdbx_mutation"));
    }

    /**
     * Entity fragment description(s).
     * @return PdbxFragment
     */
    public PdbxFragment getPdbxFragment() {
        return (PdbxFragment) (isText ? getTextColumn("pdbx_fragment") : getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return PdbxEc
     */
    public PdbxEc getPdbxEc() {
        return (PdbxEc) (isText ? getTextColumn("pdbx_ec") : getBinaryColumn("pdbx_ec"));
    }
}
