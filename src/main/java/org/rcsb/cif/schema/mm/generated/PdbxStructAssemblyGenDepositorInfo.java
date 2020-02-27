package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY_GEN.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssemblyGenDepositorInfo extends BaseCategory {
    public PdbxStructAssemblyGenDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyGenDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyGenDepositorInfo(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_assembly_gen_depositor_info.id must
     * uniquely identify a record in the
     * PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAsymIdList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_list", StrColumn::new) :
                getBinaryColumn("asym_id_list"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_id", StrColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * Identifies the operation of collection of operations
     * from category PDBX_STRUCT_OPER_LIST.
     * 
     * Operation expressions may have the forms:
     * 
     * (1)        the single operation 1
     * (1,2,5)    the operations 1, 2, 5
     * (1-4)      the operations 1,2,3 and 4
     * (1,2)(3,4) the combinations of operations
     * 3 and 4 followed by 1 and 2 (i.e.
     * the cartesian product of parenthetical
     * groups applied from right to left)
     * @return StrColumn
     */
    public StrColumn getOperExpression() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oper_expression", StrColumn::new) :
                getBinaryColumn("oper_expression"));
    }

    /**
     * Transformation matrix as provided by depositor
     * @return StrColumn
     */
    public StrColumn getFullMatrices() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("full_matrices", StrColumn::new) :
                getBinaryColumn("full_matrices"));
    }

    /**
     * 
     * This item expresses the transformation
     * on an X, Y and Z basis.
     * @return StrColumn
     */
    public StrColumn getSymmetryOperation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_operation", StrColumn::new) :
                getBinaryColumn("symmetry_operation"));
    }

    /**
     * Flag indicating unit matrix
     * @return StrColumn
     */
    public StrColumn getAtUnitMatrix() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("at_unit_matrix", StrColumn::new) :
                getBinaryColumn("at_unit_matrix"));
    }

    /**
     * This data item is the author provided chain names for the
     * assembly
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getChainIdList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_id_list", StrColumn::new) :
                getBinaryColumn("chain_id_list"));
    }

    /**
     * Flag indicating that all polymer chains are used in the assembly
     * @return StrColumn
     */
    public StrColumn getAllChains() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("all_chains", StrColumn::new) :
                getBinaryColumn("all_chains"));
    }

    /**
     * Angular rotation (degrees) along the helical axis
     * @return FloatColumn
     */
    public FloatColumn getHelicalRotation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("helical_rotation", FloatColumn::new) :
                getBinaryColumn("helical_rotation"));
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return FloatColumn
     */
    public FloatColumn getHelicalRise() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("helical_rise", FloatColumn::new) :
                getBinaryColumn("helical_rise"));
    }
}
