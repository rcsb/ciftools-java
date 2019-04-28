package org.rcsb.cif.model.generated.structbiol;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructBiol extends BaseCategory {
    public StructBiol(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructBiol(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructBiol(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the biological unit.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_biol.id must uniquely identify a record in
     * the STRUCT_BIOL list.
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
     * An identifier for the parent biological assembly
     * if this biological unit is part of a complex assembly.
     * @return PdbxParentBiolId
     */
    public PdbxParentBiolId getPdbxParentBiolId() {
        return (PdbxParentBiolId) (isText ? textFields.computeIfAbsent("pdbx_parent_biol_id",
                PdbxParentBiolId::new) : getBinaryColumn("pdbx_parent_biol_id"));
    }

    /**
     * Estimated formula mass in daltons of the
     * biological assembly.
     * @return PdbxFormulaWeight
     */
    public PdbxFormulaWeight getPdbxFormulaWeight() {
        return (PdbxFormulaWeight) (isText ? textFields.computeIfAbsent("pdbx_formula_weight",
                PdbxFormulaWeight::new) : getBinaryColumn("pdbx_formula_weight"));
    }

    /**
     * Method used to determine _struct_biol.pdbx_formula_weight.
     * @return PdbxFormulaWeightMethod
     */
    public PdbxFormulaWeightMethod getPdbxFormulaWeightMethod() {
        return (PdbxFormulaWeightMethod) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_method",
                PdbxFormulaWeightMethod::new) : getBinaryColumn("pdbx_formula_weight_method"));
    }

    /**
     * A description of the structural aggregation in this assembly.
     * @return PdbxAggregationState
     */
    public PdbxAggregationState getPdbxAggregationState() {
        return (PdbxAggregationState) (isText ? textFields.computeIfAbsent("pdbx_aggregation_state",
                PdbxAggregationState::new) : getBinaryColumn("pdbx_aggregation_state"));
    }

    /**
     * The method or experiment used to determine this assembly.
     * @return PdbxAssemblyMethod
     */
    public PdbxAssemblyMethod getPdbxAssemblyMethod() {
        return (PdbxAssemblyMethod) (isText ? textFields.computeIfAbsent("pdbx_assembly_method",
                PdbxAssemblyMethod::new) : getBinaryColumn("pdbx_assembly_method"));
    }
}
