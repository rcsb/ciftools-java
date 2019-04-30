package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PRD_AUDIT category records
 * the status and tracking information for this molecule.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
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
     * The initials of the annotator creating of modifying the molecule.
     * @return StrColumn
     */
    public StrColumn getAnnotator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotator", StrColumn::new) :
                getBinaryColumn("annotator"));
    }

    /**
     * An identifier for the wwPDB site creating or modifying the molecule.
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
