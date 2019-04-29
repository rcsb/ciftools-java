package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
 * the status and tracking information for this component model instance.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompModelAudit extends BaseCategory {
    public PdbxChemCompModelAudit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelAudit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelAudit(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getModelId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("model_id", SingleRowStrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The date associated with this audit record.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("date", SingleRowStrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * The initials of the annotator creating of modifying the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAnnotator() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("annotator", SingleRowStrColumn::new) :
                getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProcessingSite() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("processing_site", SingleRowStrColumn::new) :
                getBinaryColumn("processing_site"));
    }

    /**
     * Additional details decribing this change.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The action associated with this audit record.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getActionType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("action_type", SingleRowStrColumn::new) :
                getBinaryColumn("action_type"));
    }
}
