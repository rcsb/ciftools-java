package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_INTERFACE_RESIDUE_FEATURE category captures the
 * details of residues that are identified to be at the binding interface
 * from experiments. This information is used by modeling software such as
 * HADDOCK to create a set of ambiguous distance restraints at the binding
 * interface between the molecular entities involved.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmInterfaceResidueFeature extends BaseCategory {
    public IhmInterfaceResidueFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmInterfaceResidueFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmInterfaceResidueFeature(String name) {
        super(name);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * Identifier for the interface residue feature that defines the interface residue.
     * This data item is a pointer to _ihm_poly_residue_feature.feature_id in the
     * IHM_POLY_RESIDUE_FEATURE category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * The entity identifier of the binding partner at the interface.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getBindingPartnerEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("binding_partner_entity_id", StrColumn::new) :
                getBinaryColumn("binding_partner_entity_id"));
    }

    /**
     * An asym/strand identifier for the binding partner at the interface, if applicable.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBindingPartnerAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("binding_partner_asym_id", StrColumn::new) :
                getBinaryColumn("binding_partner_asym_id"));
    }

    /**
     * Identifier to the input data from which the interface residue is determined.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * Additional details regarding the interface residue.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
