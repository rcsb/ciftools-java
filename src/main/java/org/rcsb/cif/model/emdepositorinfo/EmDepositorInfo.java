package org.rcsb.cif.model.emdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The selected EM experimental method.
     * @return EmMethodSelection
     */
    public EmMethodSelection getEmMethodSelection() {
        return (EmMethodSelection) (isText ? textFields.computeIfAbsent("em_method_selection",
                EmMethodSelection::new) : getBinaryColumn("em_method_selection"));
    }

    /**
     * Records whether molecular/polymer entities of the EM sample will be described.
     * @return MolecularDescriptionFlag
     */
    public MolecularDescriptionFlag getMolecularDescriptionFlag() {
        return (MolecularDescriptionFlag) (isText ? textFields.computeIfAbsent("molecular_description_flag",
                MolecularDescriptionFlag::new) : getBinaryColumn("molecular_description_flag"));
    }
}
