package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_SAS_RESTRAINT category records the
 * details of the SAS data used as restraints in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmSasRestraint extends BaseCategory {
    public IhmSasRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmSasRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmSasRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the SAS restraint description.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * Identifier to the SAS data used.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The model number corresponding to the SAS fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the SAS data
     * or if only a subset of the structural assembly is fit into the data.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the SAS data.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("struct_assembly_id", IntColumn::new) :
                getBinaryColumn("struct_assembly_id"));
    }

    /**
     * A flag that indicates whether or not the SAS profile is segmented i.e.,
     * whether the whole SAS profile is used or only a portion of it is used
     * (by masking or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getProfileSegmentFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("profile_segment_flag", StrColumn::new) :
                getBinaryColumn("profile_segment_flag"));
    }

    /**
     * The type of atoms in the model fit to the SAS data.
     * @return StrColumn
     */
    public StrColumn getFittingAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_atom_type", StrColumn::new) :
                getBinaryColumn("fitting_atom_type"));
    }

    /**
     * The method used for fitting the model to the SAS data.
     * @return StrColumn
     */
    public StrColumn getFittingMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_method", StrColumn::new) :
                getBinaryColumn("fitting_method"));
    }

    /**
     * An indicator to single or multiple state fitting.
     * @return StrColumn
     */
    public StrColumn getFittingState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_state", StrColumn::new) :
                getBinaryColumn("fitting_state"));
    }

    /**
     * Radius of gyration obtained from the SAS profile, if used as input restraint.
     * @return FloatColumn
     */
    public FloatColumn getRadiusOfGyration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radius_of_gyration", FloatColumn::new) :
                getBinaryColumn("radius_of_gyration"));
    }

    /**
     * The chi value resulting from fitting the model to the SAS data.
     * @return FloatColumn
     */
    public FloatColumn getChiValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi_value", FloatColumn::new) :
                getBinaryColumn("chi_value"));
    }

    /**
     * Additional details regarding the SAS restraint used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
