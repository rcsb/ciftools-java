package org.rcsb.cif.model.pdbxnmrchemshiftsoftware;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrChemShiftSoftware extends BaseCategory {
    public PdbxNmrChemShiftSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrChemShiftSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrChemShiftSoftware(String name) {
        super(name);
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_assigned_chem_shift_list.id'
     * @return AssignedChemShiftListId
     */
    public AssignedChemShiftListId getAssignedChemShiftListId() {
        return (AssignedChemShiftListId) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id",
                AssignedChemShiftListId::new) : getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_software.ordinal'
     * @return SoftwareId
     */
    public SoftwareId getSoftwareId() {
        return (SoftwareId) (isText ? textFields.computeIfAbsent("software_id",
                SoftwareId::new) : getBinaryColumn("software_id"));
    }

    /**
     * 
     * Name given to the software. The name should match the name provided when the software was described in the software category.
     * @return SoftwareLabel
     */
    public SoftwareLabel getSoftwareLabel() {
        return (SoftwareLabel) (isText ? textFields.computeIfAbsent("software_label",
                SoftwareLabel::new) : getBinaryColumn("software_label"));
    }
}
