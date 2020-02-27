package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getCarbonShiftsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("carbon_shifts_flag", StrColumn::new) :
                getBinaryColumn("carbon_shifts_flag"));
    }

    /**
     * 
     * Text providing additional information regarding the reported chemical shift
     * referencing values or methods.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * An integer value that uniquely identifies a set of chemical shift
     * reference values from other sets of chemical shift referencing values.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies this list of chemical shift
     * referencing parameters used in reporting assigned chemical shifts and other chemical
     * shift data.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * A value indicating if 15N chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return StrColumn
     */
    public StrColumn getNitrogenShiftsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nitrogen_shifts_flag", StrColumn::new) :
                getBinaryColumn("nitrogen_shifts_flag"));
    }

    /**
     * 
     * A value indicating if chemical shifts other than 1H, 13C, 15N, or 31P are being deposited.
     * @return StrColumn
     */
    public StrColumn getOtherShiftsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("other_shifts_flag", StrColumn::new) :
                getBinaryColumn("other_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 31P chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return StrColumn
     */
    public StrColumn getPhosphorusShiftsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phosphorus_shifts_flag", StrColumn::new) :
                getBinaryColumn("phosphorus_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 1H chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * Please indicate yes or no$ if you are depositing 1H chemical shifts.
     * @return StrColumn
     */
    public StrColumn getProtonShiftsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("proton_shifts_flag", StrColumn::new) :
                getBinaryColumn("proton_shifts_flag"));
    }
}
