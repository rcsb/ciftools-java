package org.rcsb.cif.model.pdbxnmrchemshiftreference;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CarbonShiftsFlag
     */
    public CarbonShiftsFlag getCarbonShiftsFlag() {
        return (CarbonShiftsFlag) (isText ? textFields.computeIfAbsent("carbon_shifts_flag",
                CarbonShiftsFlag::new) : getBinaryColumn("carbon_shifts_flag"));
    }

    /**
     * 
     * Text providing additional information regarding the reported chemical shift
     * referencing values or methods.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * An integer value that uniquely identifies a set of chemical shift
     * reference values from other sets of chemical shift referencing values.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies this list of chemical shift
     * referencing parameters used in reporting assigned chemical shifts and other chemical
     * shift data.
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * 
     * A value indicating if 15N chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return NitrogenShiftsFlag
     */
    public NitrogenShiftsFlag getNitrogenShiftsFlag() {
        return (NitrogenShiftsFlag) (isText ? textFields.computeIfAbsent("nitrogen_shifts_flag",
                NitrogenShiftsFlag::new) : getBinaryColumn("nitrogen_shifts_flag"));
    }

    /**
     * 
     * A value indicating if chemical shifts other than 1H, 13C, 15N, or 31P are being deposited.
     * @return OtherShiftsFlag
     */
    public OtherShiftsFlag getOtherShiftsFlag() {
        return (OtherShiftsFlag) (isText ? textFields.computeIfAbsent("other_shifts_flag",
                OtherShiftsFlag::new) : getBinaryColumn("other_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 31P chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * @return PhosphorusShiftsFlag
     */
    public PhosphorusShiftsFlag getPhosphorusShiftsFlag() {
        return (PhosphorusShiftsFlag) (isText ? textFields.computeIfAbsent("phosphorus_shifts_flag",
                PhosphorusShiftsFlag::new) : getBinaryColumn("phosphorus_shifts_flag"));
    }

    /**
     * 
     * A value indicating if 1H chemical shifts are being deposited and if IUPAC chemical shift referencing was used. This item
     * is a user interface item that is used to trigger the automated population of chemical shift referencing tags if IUPAC
     * chemical shift referencing parameters have been used.
     * Please indicate yes or no$ if you are depositing 1H chemical shifts.
     * @return ProtonShiftsFlag
     */
    public ProtonShiftsFlag getProtonShiftsFlag() {
        return (ProtonShiftsFlag) (isText ? textFields.computeIfAbsent("proton_shifts_flag",
                ProtonShiftsFlag::new) : getBinaryColumn("proton_shifts_flag"));
    }
}
