package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_FAMILY_PRD_AUDIT category records
 * the status and tracking information for this family.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxFamilyPrdAudit extends BaseCategory {
    public PdbxFamilyPrdAudit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxFamilyPrdAudit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxFamilyPrdAudit(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_reference_molecule_family.family_prd_id in the
     * pdbx_reference_molecule category.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
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
     * The initials of the annotator creating of modifying the family.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotator", StrColumn::new) :
                getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the family.
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
