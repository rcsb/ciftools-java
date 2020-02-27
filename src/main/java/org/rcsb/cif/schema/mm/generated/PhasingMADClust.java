package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MAD_CLUST category record details
 * about a cluster of experiments that contributed to the
 * generation of a set of phases.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMADClust extends BaseCategory {
    public PhasingMADClust(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMADClust(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMADClust(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("expt_id", StrColumn::new) :
                getBinaryColumn("expt_id"));
    }

    /**
     * The value of _phasing_MAD_clust.id must, together with
     * _phasing_MAD_clust.expt_id, uniquely identify a record in the
     * PHASING_MAD_CLUST list.
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
     * The number of data sets in this cluster of data sets.
     * @return IntColumn
     */
    public IntColumn getNumberSet() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_set", IntColumn::new) :
                getBinaryColumn("number_set"));
    }
}
