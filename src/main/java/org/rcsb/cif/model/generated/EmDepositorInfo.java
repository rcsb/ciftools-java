package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The selected EM experimental method.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmMethodSelection() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("em_method_selection", SingleRowStrColumn::new) :
                getBinaryColumn("em_method_selection"));
    }

    /**
     * Records whether molecular/polymer entities of the EM sample will be described.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMolecularDescriptionFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("molecular_description_flag", SingleRowStrColumn::new) :
                getBinaryColumn("molecular_description_flag"));
    }
}
