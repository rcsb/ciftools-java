package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAtomGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_group", StrColumn::new) :
                getBinaryColumn("atom_group"));
    }

    /**
     * 
     * The mass number for the chemical element defined by the tag '_pdbx_nmr_chem_shift_ref.atom_type'
     * or any of its related tags.
     * @return IntColumn
     */
    public IntColumn getAtomIsotopeNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_isotope_number", IntColumn::new) :
                getBinaryColumn("atom_isotope_number"));
    }

    /**
     * 
     * The value for this tag is a standard IUPAC abbreviation for an element
     * (i.e., H, C, P, etc).
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type", StrColumn::new) :
                getBinaryColumn("atom_type"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_chem_shift_reference.id'
     * @return IntColumn
     */
    public IntColumn getChemShiftReferenceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("chem_shift_reference_id", IntColumn::new) :
                getBinaryColumn("chem_shift_reference_id"));
    }

    /**
     * 
     * Units for the chemical shift value assigned to the atoms of the chemical
     * shift reference.
     * @return StrColumn
     */
    public StrColumn getChemShiftUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chem_shift_units", StrColumn::new) :
                getBinaryColumn("chem_shift_units"));
    }

    /**
     * 
     * Value assigned to the chemical shift of the reference compound.
     * @return FloatColumn
     */
    public FloatColumn getChemShiftVal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chem_shift_val", FloatColumn::new) :
                getBinaryColumn("chem_shift_val"));
    }

    /**
     * 
     * An uniform correction value that was applied because of an extenuating
     * circumstance such as data collection at an unusual temperature.
     * @return FloatColumn
     */
    public FloatColumn getCorrectionVal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correction_val", FloatColumn::new) :
                getBinaryColumn("correction_val"));
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
     * The axis of the external chemical shift reference sample relative to the
     * static field (Bo) of the spectrometer.
     * @return StrColumn
     */
    public StrColumn getExternalRefAxis() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("external_ref_axis", StrColumn::new) :
                getBinaryColumn("external_ref_axis"));
    }

    /**
     * 
     * External chemical shift references are defined as either located within
     * the sample (e.g., as a capillary) or external to the sample and are inserted into
     * the spectrometer before, after, or both before and after the sample containing
     * the molecular system studied in the entry.
     * @return StrColumn
     */
    public StrColumn getExternalRefLoc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("external_ref_loc", StrColumn::new) :
                getBinaryColumn("external_ref_loc"));
    }

    /**
     * 
     * The geometrical shape of the external reference sample.
     * @return StrColumn
     */
    public StrColumn getExternalRefSampleGeometry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("external_ref_sample_geometry", StrColumn::new) :
                getBinaryColumn("external_ref_sample_geometry"));
    }

    /**
     * 
     * The Chi value used in calculating the chemical shift referencing values
     * for nuclei that are referenced indirectly.  The values used should be those recommended
     * by the IUPAC Taskforce on the deposition of data to the public databases
     * (Markley, et al.  Pure and Appl. Chem. 70, 117-142 (1998).
     * @return FloatColumn
     */
    public FloatColumn getIndirectShiftRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("indirect_shift_ratio", FloatColumn::new) :
                getBinaryColumn("indirect_shift_ratio"));
    }

    /**
     * 
     * Common name or abbreviation used in the literature for the molecule used
     * as a chemical shift reference.
     * @return StrColumn
     */
    public StrColumn getMolCommonName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mol_common_name", StrColumn::new) :
                getBinaryColumn("mol_common_name"));
    }

    /**
     * 
     * The rank of the chemical shift reference. A primary reference is the one
     * used in reporting the data. A secondary reference would be the compound in the
     * sample or used as an external reference.
     * @return StrColumn
     */
    public StrColumn getRank() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("rank", StrColumn::new) :
                getBinaryColumn("rank"));
    }

    /**
     * 
     * If a correction value is applied to calculate the reported chemical shifts
     * the source of the correction (pH; temperature; etc.).
     * @return StrColumn
     */
    public StrColumn getRefCorrectionType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_correction_type", StrColumn::new) :
                getBinaryColumn("ref_correction_type"));
    }

    /**
     * 
     * The chemical shift reference may be either internal (the compound is located
     * in the sample) or external (the compound is in a container external to the sample).
     * @return StrColumn
     */
    public StrColumn getRefMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_method", StrColumn::new) :
                getBinaryColumn("ref_method"));
    }

    /**
     * 
     * The reference type may be either direct (against a value measured with
     * a chemical compound) or indirect (calculated from chemical shift ratios).
     * @return StrColumn
     */
    public StrColumn getRefType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_type", StrColumn::new) :
                getBinaryColumn("ref_type"));
    }

    /**
     * 
     * Solvent used for the external reference sample.
     * @return StrColumn
     */
    public StrColumn getSolvent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solvent", StrColumn::new) :
                getBinaryColumn("solvent"));
    }
}
