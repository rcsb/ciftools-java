package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_ASSEMBLY category record details
 * about the imaged EM sample.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The name of the assembly of observed complexes.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * A description of the aggregation state of the assembly.
     * @return StrColumn
     */
    public StrColumn getAggregationState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("aggregation_state", StrColumn::new) :
                getBinaryColumn("aggregation_state"));
    }

    /**
     * The composition of the assembly.
     * @return StrColumn
     */
    public StrColumn getComposition() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("composition", StrColumn::new) :
                getBinaryColumn("composition"));
    }

    /**
     * The number of components of the biological assembly.
     * @return IntColumn
     */
    public IntColumn getNumComponents() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_components", IntColumn::new) :
                getBinaryColumn("num_components"));
    }

    /**
     * The value (in megadaltons) of the experimentally
     * determined molecular weight of the assembly.
     * @return FloatColumn
     */
    public FloatColumn getMolWtExp() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mol_wt_exp", FloatColumn::new) :
                getBinaryColumn("mol_wt_exp"));
    }

    /**
     * The value (in megadaltons) of the theoretically
     * determined molecular weight of the assembly.
     * @return FloatColumn
     */
    public FloatColumn getMolWtTheo() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mol_wt_theo", FloatColumn::new) :
                getBinaryColumn("mol_wt_theo"));
    }

    /**
     * The method used to determine the molecular weight.
     * @return StrColumn
     */
    public StrColumn getMolWtMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mol_wt_method", StrColumn::new) :
                getBinaryColumn("mol_wt_method"));
    }

    /**
     * Any additional details describing the imaged sample.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
