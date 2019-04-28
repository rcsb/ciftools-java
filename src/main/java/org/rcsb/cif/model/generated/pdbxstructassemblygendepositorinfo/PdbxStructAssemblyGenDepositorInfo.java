package org.rcsb.cif.model.generated.pdbxstructassemblygendepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return AsymIdList
     */
    public AsymIdList getAsymIdList() {
        return (AsymIdList) (isText ? textFields.computeIfAbsent("asym_id_list",
                AsymIdList::new) : getBinaryColumn("asym_id_list"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return AssemblyId
     */
    public AssemblyId getAssemblyId() {
        return (AssemblyId) (isText ? textFields.computeIfAbsent("assembly_id",
                AssemblyId::new) : getBinaryColumn("assembly_id"));
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
     * @return OperExpression
     */
    public OperExpression getOperExpression() {
        return (OperExpression) (isText ? textFields.computeIfAbsent("oper_expression",
                OperExpression::new) : getBinaryColumn("oper_expression"));
    }

    /**
     * Transformation matrix as provided by depositor
     * @return FullMatrices
     */
    public FullMatrices getFullMatrices() {
        return (FullMatrices) (isText ? textFields.computeIfAbsent("full_matrices",
                FullMatrices::new) : getBinaryColumn("full_matrices"));
    }

    /**
     * 
     * This item expresses the transformation
     * on an X, Y and Z basis.
     * @return SymmetryOperation
     */
    public SymmetryOperation getSymmetryOperation() {
        return (SymmetryOperation) (isText ? textFields.computeIfAbsent("symmetry_operation",
                SymmetryOperation::new) : getBinaryColumn("symmetry_operation"));
    }

    /**
     * Flag indicating unit matrix
     * @return AtUnitMatrix
     */
    public AtUnitMatrix getAtUnitMatrix() {
        return (AtUnitMatrix) (isText ? textFields.computeIfAbsent("at_unit_matrix",
                AtUnitMatrix::new) : getBinaryColumn("at_unit_matrix"));
    }

    /**
     * This data item is the author provided chain names for the
     * assembly
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return ChainIdList
     */
    public ChainIdList getChainIdList() {
        return (ChainIdList) (isText ? textFields.computeIfAbsent("chain_id_list",
                ChainIdList::new) : getBinaryColumn("chain_id_list"));
    }

    /**
     * Flag indicating that all polymer chains are used in the assembly
     * @return AllChains
     */
    public AllChains getAllChains() {
        return (AllChains) (isText ? textFields.computeIfAbsent("all_chains",
                AllChains::new) : getBinaryColumn("all_chains"));
    }

    /**
     * Angular rotation (degrees) along the helical axis
     * @return HelicalRotation
     */
    public HelicalRotation getHelicalRotation() {
        return (HelicalRotation) (isText ? textFields.computeIfAbsent("helical_rotation",
                HelicalRotation::new) : getBinaryColumn("helical_rotation"));
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return HelicalRise
     */
    public HelicalRise getHelicalRise() {
        return (HelicalRise) (isText ? textFields.computeIfAbsent("helical_rise",
                HelicalRise::new) : getBinaryColumn("helical_rise"));
    }
}
