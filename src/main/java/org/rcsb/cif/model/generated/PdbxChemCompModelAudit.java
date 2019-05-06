package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
 * the status and tracking information for this component model instance.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The date associated with this audit record.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * The initials of the annotator creating of modifying the component.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotator", StrColumn::new) :
                getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the component.
     * @return StrColumn
     */
    public StrColumn getProcessingSite() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("processing_site", StrColumn::new) :
                getBinaryColumn("processing_site"));
    }

    /**
     * Additional details decribing this change.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The action associated with this audit record.
     * @return StrColumn
     */
    public StrColumn getActionType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("action_type", StrColumn::new) :
                getBinaryColumn("action_type"));
    }
}
