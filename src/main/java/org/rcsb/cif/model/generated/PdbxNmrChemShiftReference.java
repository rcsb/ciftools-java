package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrChemShiftReference extends BaseCategory {
    public PdbxNmrChemShiftReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrChemShiftReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrChemShiftReference(String name) {
        super(name);
    }

    /**
     * 
     * A value indicating if 13C chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCarbonShiftsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("carbon_shifts_flag", SingleRowStrColumn::new) :
                getBinaryColumn("carbon_shifts_flag"));
    }

    /**
     * 
     * Text providing additional information regarding the reported chemical shift
     * referencing values or methods.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * An integer value that uniquely identifies a set of chemical shift
     * reference values from other sets of chemical shift referencing values.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("id", SingleRowIntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies this list of chemical shift
     * referencing parameters used in reporting assigned chemical shifts and other chemical
     * shift data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLabel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("label", SingleRowStrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * A value indicating if 15N chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNitrogenShiftsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("nitrogen_shifts_flag", SingleRowStrColumn::new) :
                getBinaryColumn("nitrogen_shifts_flag"));
    }

    /**
     * 
     * A value indicating if chemical shifts other than 1H, 13C, 15N, or 31P are being deposited.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOtherShiftsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("other_shifts_flag", SingleRowStrColumn::new) :
                getBinaryColumn("other_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 31P chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhosphorusShiftsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phosphorus_shifts_flag", SingleRowStrColumn::new) :
                getBinaryColumn("phosphorus_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 1H chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * Please indicate yes or no$ if you are depositing 1H chemical shifts.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProtonShiftsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("proton_shifts_flag", SingleRowStrColumn::new) :
                getBinaryColumn("proton_shifts_flag"));
    }
}
