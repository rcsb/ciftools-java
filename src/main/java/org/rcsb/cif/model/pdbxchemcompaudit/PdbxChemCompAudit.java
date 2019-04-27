package org.rcsb.cif.model.pdbxchemcompaudit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompAudit extends BaseCategory {
    public PdbxChemCompAudit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompAudit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompAudit(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The date associated with this audit record.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * The initials of the annotator creating of modifying the component.
     * @return Annotator
     */
    public Annotator getAnnotator() {
        return (Annotator) (isText ? textFields.computeIfAbsent("annotator",
                Annotator::new) : getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the component.
     * @return ProcessingSite
     */
    public ProcessingSite getProcessingSite() {
        return (ProcessingSite) (isText ? textFields.computeIfAbsent("processing_site",
                ProcessingSite::new) : getBinaryColumn("processing_site"));
    }

    /**
     * Additional details decribing this change.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The action associated with this audit record.
     * @return ActionType
     */
    public ActionType getActionType() {
        return (ActionType) (isText ? textFields.computeIfAbsent("action_type",
                ActionType::new) : getBinaryColumn("action_type"));
    }
}
