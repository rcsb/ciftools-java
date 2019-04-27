package org.rcsb.cif.model.pdbxnmrchemshiftref;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrChemShiftRef extends BaseCategory {
    public PdbxNmrChemShiftRef(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrChemShiftRef(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrChemShiftRef(String name) {
        super(name);
    }

    /**
     * 
     * Group of atoms within a molecule whose chemical shift was used as the standard
     * chemical shift reference for the defined observed nuclei.
     * @return AtomGroup
     */
    public AtomGroup getAtomGroup() {
        return (AtomGroup) (isText ? textFields.computeIfAbsent("atom_group",
                AtomGroup::new) : getBinaryColumn("atom_group"));
    }

    /**
     * 
     * The mass number for the chemical element defined by the tag '_pdbx_nmr_chem_shift_ref.atom_type'
     * or any of its related tags.
     * @return AtomIsotopeNumber
     */
    public AtomIsotopeNumber getAtomIsotopeNumber() {
        return (AtomIsotopeNumber) (isText ? textFields.computeIfAbsent("atom_isotope_number",
                AtomIsotopeNumber::new) : getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, P, etc).
     * @return AtomType
     */
    public AtomType getAtomType() {
        return (AtomType) (isText ? textFields.computeIfAbsent("atom_type",
                AtomType::new) : getBinaryColumn("atom_type"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return ChemShiftReferenceId
     */
    public ChemShiftReferenceId getChemShiftReferenceId() {
        return (ChemShiftReferenceId) (isText ? textFields.computeIfAbsent("chem_shift_reference_id",
                ChemShiftReferenceId::new) : getBinaryColumn("chem_shift_reference_id"));
    }

    /**
     * 
     * Units for the chemical shift value assigned to the atoms of the chemical
     * shift reference.
     * @return ChemShiftUnits
     */
    public ChemShiftUnits getChemShiftUnits() {
        return (ChemShiftUnits) (isText ? textFields.computeIfAbsent("chem_shift_units",
                ChemShiftUnits::new) : getBinaryColumn("chem_shift_units"));
    }

    /**
     * 
     * Value assigned to the chemical shift of the reference compound.
     * @return ChemShiftVal
     */
    public ChemShiftVal getChemShiftVal() {
        return (ChemShiftVal) (isText ? textFields.computeIfAbsent("chem_shift_val",
                ChemShiftVal::new) : getBinaryColumn("chem_shift_val"));
    }

    /**
     * 
     * An uniform correction value that was applied because of an extenuating
     * circumstance such as data collection at an unusual temperature.
     * @return CorrectionVal
     */
    public CorrectionVal getCorrectionVal() {
        return (CorrectionVal) (isText ? textFields.computeIfAbsent("correction_val",
                CorrectionVal::new) : getBinaryColumn("correction_val"));
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
     * The axis of the external chemical shift reference sample relative to the
     * static field (Bo) of the spectrometer.
     * @return ExternalRefAxis
     */
    public ExternalRefAxis getExternalRefAxis() {
        return (ExternalRefAxis) (isText ? textFields.computeIfAbsent("external_ref_axis",
                ExternalRefAxis::new) : getBinaryColumn("external_ref_axis"));
    }

    /**
     * 
     * External chemical shift references are defined as either located within
     * the sample (e.g., as a capillary) or external to the sample and are inserted into
     * the spectrometer before, after, or both before and after the sample containing
     * the molecular system studied in the entry.
     * @return ExternalRefLoc
     */
    public ExternalRefLoc getExternalRefLoc() {
        return (ExternalRefLoc) (isText ? textFields.computeIfAbsent("external_ref_loc",
                ExternalRefLoc::new) : getBinaryColumn("external_ref_loc"));
    }

    /**
     * 
     * The geometrical shape of the external reference sample.
     * @return ExternalRefSampleGeometry
     */
    public ExternalRefSampleGeometry getExternalRefSampleGeometry() {
        return (ExternalRefSampleGeometry) (isText ? textFields.computeIfAbsent("external_ref_sample_geometry",
                ExternalRefSampleGeometry::new) : getBinaryColumn("external_ref_sample_geometry"));
    }

    /**
     * 
     * The Chi value used in calculating the chemical shift referencing values
     * for nuclei that are referenced indirectly.  The values used should be those recommended
     * by the IUPAC Taskforce on the deposition of data to the public databases
     * (Markley, et al.  Pure and Appl. Chem. 70, 117-142 (1998).
     * @return IndirectShiftRatio
     */
    public IndirectShiftRatio getIndirectShiftRatio() {
        return (IndirectShiftRatio) (isText ? textFields.computeIfAbsent("indirect_shift_ratio",
                IndirectShiftRatio::new) : getBinaryColumn("indirect_shift_ratio"));
    }

    /**
     * 
     * Common name or abbreviation used in the literature for the molecule used
     * as a chemical shift reference.
     * @return MolCommonName
     */
    public MolCommonName getMolCommonName() {
        return (MolCommonName) (isText ? textFields.computeIfAbsent("mol_common_name",
                MolCommonName::new) : getBinaryColumn("mol_common_name"));
    }

    /**
     * 
     * The rank of the chemical shift reference. A primary reference is the one
     * used in reporting the data. A secondary reference would be the compound in the
     * sample or used as an external reference.
     * @return Rank
     */
    public Rank getRank() {
        return (Rank) (isText ? textFields.computeIfAbsent("rank",
                Rank::new) : getBinaryColumn("rank"));
    }

    /**
     * 
     * If a correction value is applied to calculate the reported chemical shifts
     * the source of the correction (pH; temperature; etc.).
     * @return RefCorrectionType
     */
    public RefCorrectionType getRefCorrectionType() {
        return (RefCorrectionType) (isText ? textFields.computeIfAbsent("ref_correction_type",
                RefCorrectionType::new) : getBinaryColumn("ref_correction_type"));
    }

    /**
     * 
     * The chemical shift reference may be either internal (the compound is located
     * in the sample) or external (the compound is in a container external to the sample).
     * @return RefMethod
     */
    public RefMethod getRefMethod() {
        return (RefMethod) (isText ? textFields.computeIfAbsent("ref_method",
                RefMethod::new) : getBinaryColumn("ref_method"));
    }

    /**
     * 
     * The reference type may be either direct (against a value measured with
     * a chemical compound) or indirect (calculated from chemical shift ratios).
     * @return RefType
     */
    public RefType getRefType() {
        return (RefType) (isText ? textFields.computeIfAbsent("ref_type",
                RefType::new) : getBinaryColumn("ref_type"));
    }

    /**
     * 
     * Solvent used for the external reference sample.
     * @return Solvent
     */
    public Solvent getSolvent() {
        return (Solvent) (isText ? textFields.computeIfAbsent("solvent",
                Solvent::new) : getBinaryColumn("solvent"));
    }
}
