package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
 * the status and tracking information for this component model instance.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModelAudit extends DelegatingCategory {
    public PdbxChemCompModelAudit(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "date":
                return getDate();
            case "annotator":
                return getAnnotator();
            case "processing_site":
                return getProcessingSite();
            case "details":
                return getDetails();
            case "action_type":
                return getActionType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingStrColumn::new);
    }

    /**
     * The date associated with this audit record.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The initials of the annotator creating of modifying the component.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return delegate.getColumn("annotator", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the wwPDB site creating or modifying the component.
     * @return StrColumn
     */
    public StrColumn getProcessingSite() {
        return delegate.getColumn("processing_site", DelegatingStrColumn::new);
    }

    /**
     * Additional details decribing this change.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The action associated with this audit record.
     * @return StrColumn
     */
    public StrColumn getActionType() {
        return delegate.getColumn("action_type", DelegatingStrColumn::new);
    }

}