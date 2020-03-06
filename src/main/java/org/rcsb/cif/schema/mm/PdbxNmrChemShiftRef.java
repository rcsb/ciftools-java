package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrChemShiftRef extends DelegatingCategory {
    public PdbxNmrChemShiftRef(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_group":
                return getAtomGroup();
            case "atom_isotope_number":
                return getAtomIsotopeNumber();
            case "atom_type":
                return getAtomType();
            case "chem_shift_reference_id":
                return getChemShiftReferenceId();
            case "chem_shift_units":
                return getChemShiftUnits();
            case "chem_shift_val":
                return getChemShiftVal();
            case "correction_val":
                return getCorrectionVal();
            case "entry_id":
                return getEntryId();
            case "external_ref_axis":
                return getExternalRefAxis();
            case "external_ref_loc":
                return getExternalRefLoc();
            case "external_ref_sample_geometry":
                return getExternalRefSampleGeometry();
            case "indirect_shift_ratio":
                return getIndirectShiftRatio();
            case "mol_common_name":
                return getMolCommonName();
            case "rank":
                return getRank();
            case "ref_correction_type":
                return getRefCorrectionType();
            case "ref_method":
                return getRefMethod();
            case "ref_type":
                return getRefType();
            case "solvent":
                return getSolvent();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Group of atoms within a molecule whose chemical shift was used as the standard
     * chemical shift reference for the defined observed nuclei.
     * @return StrColumn
     */
    public StrColumn getAtomGroup() {
        return delegate.getColumn("atom_group", DelegatingStrColumn::new);
    }

    /**
     * The mass number for the chemical element defined by the tag '_pdbx_nmr_chem_shift_ref.atom_type'
     * or any of its related tags.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return delegate.getColumn("atom_isotope_number", DelegatingIntColumn::new);
    }

    /**
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, P, etc).
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return delegate.getColumn("atom_type", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return IntColumn
     */
    public IntColumn getChemShiftReferenceId() {
        return delegate.getColumn("chem_shift_reference_id", DelegatingIntColumn::new);
    }

    /**
     * Units for the chemical shift value assigned to the atoms of the chemical
     * shift reference.
     * @return StrColumn
     */
    public StrColumn getChemShiftUnits() {
        return delegate.getColumn("chem_shift_units", DelegatingStrColumn::new);
    }

    /**
     * Value assigned to the chemical shift of the reference compound.
     * @return FloatColumn
     */
    public FloatColumn getChemShiftVal() {
        return delegate.getColumn("chem_shift_val", DelegatingFloatColumn::new);
    }

    /**
     * An uniform correction value that was applied because of an extenuating
     * circumstance such as data collection at an unusual temperature.
     * @return FloatColumn
     */
    public FloatColumn getCorrectionVal() {
        return delegate.getColumn("correction_val", DelegatingFloatColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The axis of the external chemical shift reference sample relative to the
     * static field (Bo) of the spectrometer.
     * @return StrColumn
     */
    public StrColumn getExternalRefAxis() {
        return delegate.getColumn("external_ref_axis", DelegatingStrColumn::new);
    }

    /**
     * External chemical shift references are defined as either located within
     * the sample (e.g., as a capillary) or external to the sample and are inserted into
     * the spectrometer before, after, or both before and after the sample containing
     * the molecular system studied in the entry.
     * @return StrColumn
     */
    public StrColumn getExternalRefLoc() {
        return delegate.getColumn("external_ref_loc", DelegatingStrColumn::new);
    }

    /**
     * The geometrical shape of the external reference sample.
     * @return StrColumn
     */
    public StrColumn getExternalRefSampleGeometry() {
        return delegate.getColumn("external_ref_sample_geometry", DelegatingStrColumn::new);
    }

    /**
     * The Chi value used in calculating the chemical shift referencing values
     * for nuclei that are referenced indirectly.  The values used should be those recommended
     * by the IUPAC Taskforce on the deposition of data to the public databases
     * (Markley, et al.  Pure and Appl. Chem. 70, 117-142 (1998).
     * @return FloatColumn
     */
    public FloatColumn getIndirectShiftRatio() {
        return delegate.getColumn("indirect_shift_ratio", DelegatingFloatColumn::new);
    }

    /**
     * Common name or abbreviation used in the literature for the molecule used
     * as a chemical shift reference.
     * @return StrColumn
     */
    public StrColumn getMolCommonName() {
        return delegate.getColumn("mol_common_name", DelegatingStrColumn::new);
    }

    /**
     * The rank of the chemical shift reference. A primary reference is the one
     * used in reporting the data. A secondary reference would be the compound in the
     * sample or used as an external reference.
     * @return StrColumn
     */
    public StrColumn getRank() {
        return delegate.getColumn("rank", DelegatingStrColumn::new);
    }

    /**
     * If a correction value is applied to calculate the reported chemical shifts
     * the source of the correction (pH; temperature; etc.).
     * @return StrColumn
     */
    public StrColumn getRefCorrectionType() {
        return delegate.getColumn("ref_correction_type", DelegatingStrColumn::new);
    }

    /**
     * The chemical shift reference may be either internal (the compound is located
     * in the sample) or external (the compound is in a container external to the sample).
     * @return StrColumn
     */
    public StrColumn getRefMethod() {
        return delegate.getColumn("ref_method", DelegatingStrColumn::new);
    }

    /**
     * The reference type may be either direct (against a value measured with
     * a chemical compound) or indirect (calculated from chemical shift ratios).
     * @return StrColumn
     */
    public StrColumn getRefType() {
        return delegate.getColumn("ref_type", DelegatingStrColumn::new);
    }

    /**
     * Solvent used for the external reference sample.
     * @return StrColumn
     */
    public StrColumn getSolvent() {
        return delegate.getColumn("solvent", DelegatingStrColumn::new);
    }

}