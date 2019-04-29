package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_ASSEMBLY category record details
 * about the imaged EM sample.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmAssembly extends BaseCategory {
    public EmAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmAssembly(String name) {
        super(name);
    }

    /**
     * The value of _em_assembly.id must uniquely identify
     * a collection of observed complexes.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The name of the assembly of observed complexes.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * A description of the aggregation state of the assembly.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAggregationState() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("aggregation_state", SingleRowStrColumn::new) :
                getBinaryColumn("aggregation_state"));
    }

    /**
     * The composition of the assembly.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getComposition() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("composition", SingleRowStrColumn::new) :
                getBinaryColumn("composition"));
    }

    /**
     * The number of components of the biological assembly.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumComponents() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("num_components", SingleRowIntColumn::new) :
                getBinaryColumn("num_components"));
    }

    /**
     * The value (in megadaltons) of the experimentally
     * determined molecular weight of the assembly.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMolWtExp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("mol_wt_exp", SingleRowFloatColumn::new) :
                getBinaryColumn("mol_wt_exp"));
    }

    /**
     * The value (in megadaltons) of the theoretically
     * determined molecular weight of the assembly.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMolWtTheo() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("mol_wt_theo", SingleRowFloatColumn::new) :
                getBinaryColumn("mol_wt_theo"));
    }

    /**
     * The method used to determine the molecular weight.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMolWtMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mol_wt_method", SingleRowStrColumn::new) :
                getBinaryColumn("mol_wt_method"));
    }

    /**
     * Any additional details describing the imaged sample.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
