package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY_GEN.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyGenDepositorInfo extends DelegatingCategory {
    public PdbxStructAssemblyGenDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "asym_id_list":
                return getAsymIdList();
            case "assembly_id":
                return getAssemblyId();
            case "oper_expression":
                return getOperExpression();
            case "full_matrices":
                return getFullMatrices();
            case "symmetry_operation":
                return getSymmetryOperation();
            case "at_unit_matrix":
                return getAtUnitMatrix();
            case "chain_id_list":
                return getChainIdList();
            case "all_chains":
                return getAllChains();
            case "helical_rotation":
                return getHelicalRotation();
            case "helical_rise":
                return getHelicalRise();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_struct_assembly_gen_depositor_info.id must
     * uniquely identify a record in the
     * PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAsymIdList() {
        return delegate.getColumn("asym_id_list", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("oper_expression", DelegatingStrColumn::new);
    }

    /**
     * Transformation matrix as provided by depositor
     * @return StrColumn
     */
    public StrColumn getFullMatrices() {
        return delegate.getColumn("full_matrices", DelegatingStrColumn::new);
    }

    /**
     * This item expresses the transformation
     * on an X, Y and Z basis.
     * @return StrColumn
     */
    public StrColumn getSymmetryOperation() {
        return delegate.getColumn("symmetry_operation", DelegatingStrColumn::new);
    }

    /**
     * Flag indicating unit matrix
     * @return StrColumn
     */
    public StrColumn getAtUnitMatrix() {
        return delegate.getColumn("at_unit_matrix", DelegatingStrColumn::new);
    }

    /**
     * This data item is the author provided chain names for the
     * assembly
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getChainIdList() {
        return delegate.getColumn("chain_id_list", DelegatingStrColumn::new);
    }

    /**
     * Flag indicating that all polymer chains are used in the assembly
     * @return StrColumn
     */
    public StrColumn getAllChains() {
        return delegate.getColumn("all_chains", DelegatingStrColumn::new);
    }

    /**
     * Angular rotation (degrees) along the helical axis
     * @return FloatColumn
     */
    public FloatColumn getHelicalRotation() {
        return delegate.getColumn("helical_rotation", DelegatingFloatColumn::new);
    }

    /**
     * The axial rise per subunit in the helical assembly.
     * @return FloatColumn
     */
    public FloatColumn getHelicalRise() {
        return delegate.getColumn("helical_rise", DelegatingFloatColumn::new);
    }

}