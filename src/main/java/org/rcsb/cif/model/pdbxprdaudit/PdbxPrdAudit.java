package org.rcsb.cif.model.pdbxprdaudit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPrdAudit extends BaseCategory {
    public PdbxPrdAudit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPrdAudit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPrdAudit(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_reference_molecule.prd_id in the
     * pdbx_reference_molecule category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
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
     * The initials of the annotator creating of modifying the molecule.
     * @return Annotator
     */
    public Annotator getAnnotator() {
        return (Annotator) (isText ? textFields.computeIfAbsent("annotator",
                Annotator::new) : getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the molecule.
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
