package org.rcsb.cif.model.generated.emassembly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The name of the assembly of observed complexes.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * A description of the aggregation state of the assembly.
     * @return AggregationState
     */
    public AggregationState getAggregationState() {
        return (AggregationState) (isText ? textFields.computeIfAbsent("aggregation_state",
                AggregationState::new) : getBinaryColumn("aggregation_state"));
    }

    /**
     * The composition of the assembly.
     * @return Composition
     */
    public Composition getComposition() {
        return (Composition) (isText ? textFields.computeIfAbsent("composition",
                Composition::new) : getBinaryColumn("composition"));
    }

    /**
     * The number of components of the biological assembly.
     * @return NumComponents
     */
    public NumComponents getNumComponents() {
        return (NumComponents) (isText ? textFields.computeIfAbsent("num_components",
                NumComponents::new) : getBinaryColumn("num_components"));
    }

    /**
     * The value (in megadaltons) of the experimentally
     * determined molecular weight of the assembly.
     * @return MolWtExp
     */
    public MolWtExp getMolWtExp() {
        return (MolWtExp) (isText ? textFields.computeIfAbsent("mol_wt_exp",
                MolWtExp::new) : getBinaryColumn("mol_wt_exp"));
    }

    /**
     * The value (in megadaltons) of the theoretically
     * determined molecular weight of the assembly.
     * @return MolWtTheo
     */
    public MolWtTheo getMolWtTheo() {
        return (MolWtTheo) (isText ? textFields.computeIfAbsent("mol_wt_theo",
                MolWtTheo::new) : getBinaryColumn("mol_wt_theo"));
    }

    /**
     * The method used to determine the molecular weight.
     * @return MolWtMethod
     */
    public MolWtMethod getMolWtMethod() {
        return (MolWtMethod) (isText ? textFields.computeIfAbsent("mol_wt_method",
                MolWtMethod::new) : getBinaryColumn("mol_wt_method"));
    }

    /**
     * Any additional details describing the imaged sample.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
