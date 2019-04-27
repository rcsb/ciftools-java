package org.rcsb.cif.model.phasingmadclust;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return ExptId
     */
    public ExptId getExptId() {
        return (ExptId) (isText ? textFields.computeIfAbsent("expt_id",
                ExptId::new) : getBinaryColumn("expt_id"));
    }

    /**
     * The value of _phasing_MAD_clust.id must, together with
     * _phasing_MAD_clust.expt_id, uniquely identify a record in the
     * PHASING_MAD_CLUST list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The number of data sets in this cluster of data sets.
     * @return NumberSet
     */
    public NumberSet getNumberSet() {
        return (NumberSet) (isText ? textFields.computeIfAbsent("number_set",
                NumberSet::new) : getBinaryColumn("number_set"));
    }
}
