package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_BIOL category record details about
 * the structural elements that form each structure of biological
 * significance.
 * 
 * A given crystal structure may contain many different biological
 * structures. A given structural component in the asymmetric
 * unit may be part of more than one biological unit. A given
 * biological structure may involve crystallographic symmetry.
 * 
 * For instance, in a structure of a lysozyme-FAB structure, the
 * light- and heavy-chain components of the FAB could be one
 * biological unit, while the two chains of the FAB and the lysozyme
 * could constitute a second biological unit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructBiol extends DelegatingCategory {
    public StructBiol(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "pdbx_parent_biol_id":
                return getPdbxParentBiolId();
            case "pdbx_formula_weight":
                return getPdbxFormulaWeight();
            case "pdbx_formula_weight_method":
                return getPdbxFormulaWeightMethod();
            case "pdbx_aggregation_state":
                return getPdbxAggregationState();
            case "pdbx_assembly_method":
                return getPdbxAssemblyMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the biological unit.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_biol.id must uniquely identify a record in
     * the STRUCT_BIOL list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the parent biological assembly
     * if this biological unit is part of a complex assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxParentBiolId() {
        return delegate.getColumn("pdbx_parent_biol_id", DelegatingStrColumn::new);
    }

    /**
     * Estimated formula mass in daltons of the
     * biological assembly.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFormulaWeight() {
        return delegate.getColumn("pdbx_formula_weight", DelegatingFloatColumn::new);
    }

    /**
     * Method used to determine _struct_biol.pdbx_formula_weight.
     * @return StrColumn
     */
    public StrColumn getPdbxFormulaWeightMethod() {
        return delegate.getColumn("pdbx_formula_weight_method", DelegatingStrColumn::new);
    }

    /**
     * A description of the structural aggregation in this assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxAggregationState() {
        return delegate.getColumn("pdbx_aggregation_state", DelegatingStrColumn::new);
    }

    /**
     * The method or experiment used to determine this assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxAssemblyMethod() {
        return delegate.getColumn("pdbx_assembly_method", DelegatingStrColumn::new);
    }

}