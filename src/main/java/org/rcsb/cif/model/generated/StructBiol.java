package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier for the parent biological assembly
     * if this biological unit is part of a complex assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxParentBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_parent_biol_id", StrColumn::new) :
                getBinaryColumn("pdbx_parent_biol_id"));
    }

    /**
     * Estimated formula mass in daltons of the
     * biological assembly.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFormulaWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight", FloatColumn::new) :
                getBinaryColumn("pdbx_formula_weight"));
    }

    /**
     * Method used to determine _struct_biol.pdbx_formula_weight.
     * @return StrColumn
     */
    public StrColumn getPdbxFormulaWeightMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_method", StrColumn::new) :
                getBinaryColumn("pdbx_formula_weight_method"));
    }

    /**
     * A description of the structural aggregation in this assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxAggregationState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_aggregation_state", StrColumn::new) :
                getBinaryColumn("pdbx_aggregation_state"));
    }

    /**
     * The method or experiment used to determine this assembly.
     * @return StrColumn
     */
    public StrColumn getPdbxAssemblyMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_assembly_method", StrColumn::new) :
                getBinaryColumn("pdbx_assembly_method"));
    }
}
