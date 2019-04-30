package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_FUNCT_MINIMIZED category record
 * details about the individual terms of the function minimized
 * during refinement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The number of observations in this term.  For example, if the
     * term is a residual of the X-ray intensities, this item would
     * contain the number of reflections used in the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberTerms() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_terms", IntColumn::new) :
                getBinaryColumn("number_terms"));
    }

    /**
     * The residual for this term of the function that was minimized
     * during the refinement.
     * @return FloatColumn
     */
    public FloatColumn getResidual() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("residual", FloatColumn::new) :
                getBinaryColumn("residual"));
    }

    /**
     * The type of the function being minimized.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The weight applied to this term of the function that was
     * minimized during the refinement.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight", FloatColumn::new) :
                getBinaryColumn("weight"));
    }
}
