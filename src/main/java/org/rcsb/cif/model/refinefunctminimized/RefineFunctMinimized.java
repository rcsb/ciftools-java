package org.rcsb.cif.model.refinefunctminimized;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineFunctMinimized extends BaseCategory {
    public RefineFunctMinimized(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineFunctMinimized(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineFunctMinimized(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_funct_minimized.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The number of observations in this term.  For example, if the
     * term is a residual of the X-ray intensities, this item would
     * contain the number of reflections used in the refinement.
     * @return NumberTerms
     */
    public NumberTerms getNumberTerms() {
        return (NumberTerms) (isText ? textFields.computeIfAbsent("number_terms",
                NumberTerms::new) : getBinaryColumn("number_terms"));
    }

    /**
     * The residual for this term of the function that was minimized
     * during the refinement.
     * @return Residual
     */
    public Residual getResidual() {
        return (Residual) (isText ? textFields.computeIfAbsent("residual",
                Residual::new) : getBinaryColumn("residual"));
    }

    /**
     * The type of the function being minimized.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The weight applied to this term of the function that was
     * minimized during the refinement.
     * @return Weight
     */
    public Weight getWeight() {
        return (Weight) (isText ? textFields.computeIfAbsent("weight",
                Weight::new) : getBinaryColumn("weight"));
    }
}
