package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the chem_shift_software category provide pointers to the software category and methods category.
 */
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
     * @return IntColumn
     */
    public IntColumn getAssignedChemShiftListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assigned_chem_shift_list_id", IntColumn::new) :
                getBinaryColumn("assigned_chem_shift_list_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_software.ordinal'
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }

    /**
     * 
     * Name given to the software. The name should match the name provided when the software was described in the software category.
     * @return StrColumn
     */
    public StrColumn getSoftwareLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_label", StrColumn::new) :
                getBinaryColumn("software_label"));
    }
}
