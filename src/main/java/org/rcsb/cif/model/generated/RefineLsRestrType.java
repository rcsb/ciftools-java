package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_LS_RESTR_TYPE category record details
 * about the restraint types used in the least-squares refinement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class RefineLsRestrType extends BaseCategory {
    public RefineLsRestrType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineLsRestrType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineLsRestrType(String name) {
        super(name);
    }

    /**
     * The upper limit in angstroms of the distance range applied to
     * the current restraint type.
     * @return FloatColumn
     */
    public FloatColumn getDistanceCutoffHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_cutoff_high", FloatColumn::new) :
                getBinaryColumn("distance_cutoff_high"));
    }

    /**
     * The lower limit in angstroms of the distance range applied to
     * the current restraint type.
     * @return FloatColumn
     */
    public FloatColumn getDistanceCutoffLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_cutoff_low", FloatColumn::new) :
                getBinaryColumn("distance_cutoff_low"));
    }

    /**
     * This data item is a pointer to _refine_ls_restr.type in the
     * REFINE_LS_RESTR category.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
