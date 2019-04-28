package org.rcsb.cif.model.generated.refinelsrestrtype;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DistanceCutoffHigh
     */
    public DistanceCutoffHigh getDistanceCutoffHigh() {
        return (DistanceCutoffHigh) (isText ? textFields.computeIfAbsent("distance_cutoff_high",
                DistanceCutoffHigh::new) : getBinaryColumn("distance_cutoff_high"));
    }

    /**
     * The lower limit in angstroms of the distance range applied to
     * the current restraint type.
     * @return DistanceCutoffLow
     */
    public DistanceCutoffLow getDistanceCutoffLow() {
        return (DistanceCutoffLow) (isText ? textFields.computeIfAbsent("distance_cutoff_low",
                DistanceCutoffLow::new) : getBinaryColumn("distance_cutoff_low"));
    }

    /**
     * This data item is a pointer to _refine_ls_restr.type in the
     * REFINE_LS_RESTR category.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
