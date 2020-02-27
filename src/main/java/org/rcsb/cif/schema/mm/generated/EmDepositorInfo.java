package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
 * that are provided by the depositor
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmDepositorInfo extends BaseCategory {
    public EmDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The selected EM experimental method.
     * @return StrColumn
     */
    public StrColumn getEmMethodSelection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("em_method_selection", StrColumn::new) :
                getBinaryColumn("em_method_selection"));
    }

    /**
     * Records whether molecular/polymer entities of the EM sample will be described.
     * @return StrColumn
     */
    public StrColumn getMolecularDescriptionFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("molecular_description_flag", StrColumn::new) :
                getBinaryColumn("molecular_description_flag"));
    }
}
