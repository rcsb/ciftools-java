package org.rcsb.cif.model.generated.cell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Cell extends BaseCategory {
    public Cell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Cell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Cell(String name) {
        super(name);
    }

    /**
     * Unit-cell angle alpha of the reported structure in degrees.
     * @return AngleAlpha
     */
    public AngleAlpha getAngleAlpha() {
        return (AngleAlpha) (isText ? textFields.computeIfAbsent("angle_alpha",
                AngleAlpha::new) : getBinaryColumn("angle_alpha"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_alpha.
     * @return AngleAlphaEsd
     */
    public AngleAlphaEsd getAngleAlphaEsd() {
        return (AngleAlphaEsd) (isText ? textFields.computeIfAbsent("angle_alpha_esd",
                AngleAlphaEsd::new) : getBinaryColumn("angle_alpha_esd"));
    }

    /**
     * Unit-cell angle beta of the reported structure in degrees.
     * @return AngleBeta
     */
    public AngleBeta getAngleBeta() {
        return (AngleBeta) (isText ? textFields.computeIfAbsent("angle_beta",
                AngleBeta::new) : getBinaryColumn("angle_beta"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_beta.
     * @return AngleBetaEsd
     */
    public AngleBetaEsd getAngleBetaEsd() {
        return (AngleBetaEsd) (isText ? textFields.computeIfAbsent("angle_beta_esd",
                AngleBetaEsd::new) : getBinaryColumn("angle_beta_esd"));
    }

    /**
     * Unit-cell angle gamma of the reported structure in degrees.
     * @return AngleGamma
     */
    public AngleGamma getAngleGamma() {
        return (AngleGamma) (isText ? textFields.computeIfAbsent("angle_gamma",
                AngleGamma::new) : getBinaryColumn("angle_gamma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_gamma.
     * @return AngleGammaEsd
     */
    public AngleGammaEsd getAngleGammaEsd() {
        return (AngleGammaEsd) (isText ? textFields.computeIfAbsent("angle_gamma_esd",
                AngleGammaEsd::new) : getBinaryColumn("angle_gamma_esd"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum.
     * @return FormulaUnitsZ
     */
    public FormulaUnitsZ getFormulaUnitsZ() {
        return (FormulaUnitsZ) (isText ? textFields.computeIfAbsent("formula_units_Z",
                FormulaUnitsZ::new) : getBinaryColumn("formula_units_Z"));
    }

    /**
     * Unit-cell length a corresponding to the structure reported in
     * angstroms.
     * @return LengthA
     */
    public LengthA getLengthA() {
        return (LengthA) (isText ? textFields.computeIfAbsent("length_a",
                LengthA::new) : getBinaryColumn("length_a"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_a.
     * @return LengthAEsd
     */
    public LengthAEsd getLengthAEsd() {
        return (LengthAEsd) (isText ? textFields.computeIfAbsent("length_a_esd",
                LengthAEsd::new) : getBinaryColumn("length_a_esd"));
    }

    /**
     * Unit-cell length b corresponding to the structure reported in
     * angstroms.
     * @return LengthB
     */
    public LengthB getLengthB() {
        return (LengthB) (isText ? textFields.computeIfAbsent("length_b",
                LengthB::new) : getBinaryColumn("length_b"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_b.
     * @return LengthBEsd
     */
    public LengthBEsd getLengthBEsd() {
        return (LengthBEsd) (isText ? textFields.computeIfAbsent("length_b_esd",
                LengthBEsd::new) : getBinaryColumn("length_b_esd"));
    }

    /**
     * Unit-cell length c corresponding to the structure reported in
     * angstroms.
     * @return LengthC
     */
    public LengthC getLengthC() {
        return (LengthC) (isText ? textFields.computeIfAbsent("length_c",
                LengthC::new) : getBinaryColumn("length_c"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_c.
     * @return LengthCEsd
     */
    public LengthCEsd getLengthCEsd() {
        return (LengthCEsd) (isText ? textFields.computeIfAbsent("length_c_esd",
                LengthCEsd::new) : getBinaryColumn("length_c_esd"));
    }

    /**
     * Cell volume V in angstroms cubed.
     * 
     * V = a b c (1 - cos^2^~alpha~ - cos^2^~beta~ - cos^2^~gamma~
     * + 2 cos~alpha~ cos~beta~ cos~gamma~)^1/2^
     * 
     * a     = _cell.length_a
     * b     = _cell.length_b
     * c     = _cell.length_c
     * alpha = _cell.angle_alpha
     * beta  = _cell.angle_beta
     * gamma = _cell.angle_gamma
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.volume.
     * @return VolumeEsd
     */
    public VolumeEsd getVolumeEsd() {
        return (VolumeEsd) (isText ? textFields.computeIfAbsent("volume_esd",
                VolumeEsd::new) : getBinaryColumn("volume_esd"));
    }

    /**
     * The number of the polymeric chains in a unit cell. In the case
     * of heteropolymers, Z is the number of occurrences of the most
     * populous chain.
     * 
     * This data item is provided for compatibility with the original
     * Protein Data Bank format, and only for that purpose.
     * @return ZPDB
     */
    public ZPDB getZPDB() {
        return (ZPDB) (isText ? textFields.computeIfAbsent("Z_PDB",
                ZPDB::new) : getBinaryColumn("Z_PDB"));
    }

    /**
     * The angle (recip-alpha) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalAngleAlpha
     */
    public ReciprocalAngleAlpha getReciprocalAngleAlpha() {
        return (ReciprocalAngleAlpha) (isText ? textFields.computeIfAbsent("reciprocal_angle_alpha",
                ReciprocalAngleAlpha::new) : getBinaryColumn("reciprocal_angle_alpha"));
    }

    /**
     * The angle (recip-beta) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalAngleBeta
     */
    public ReciprocalAngleBeta getReciprocalAngleBeta() {
        return (ReciprocalAngleBeta) (isText ? textFields.computeIfAbsent("reciprocal_angle_beta",
                ReciprocalAngleBeta::new) : getBinaryColumn("reciprocal_angle_beta"));
    }

    /**
     * The angle (recip-gamma) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalAngleGamma
     */
    public ReciprocalAngleGamma getReciprocalAngleGamma() {
        return (ReciprocalAngleGamma) (isText ? textFields.computeIfAbsent("reciprocal_angle_gamma",
                ReciprocalAngleGamma::new) : getBinaryColumn("reciprocal_angle_gamma"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_alpha.
     * @return ReciprocalAngleAlphaEsd
     */
    public ReciprocalAngleAlphaEsd getReciprocalAngleAlphaEsd() {
        return (ReciprocalAngleAlphaEsd) (isText ? textFields.computeIfAbsent("reciprocal_angle_alpha_esd",
                ReciprocalAngleAlphaEsd::new) : getBinaryColumn("reciprocal_angle_alpha_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_beta.
     * @return ReciprocalAngleBetaEsd
     */
    public ReciprocalAngleBetaEsd getReciprocalAngleBetaEsd() {
        return (ReciprocalAngleBetaEsd) (isText ? textFields.computeIfAbsent("reciprocal_angle_beta_esd",
                ReciprocalAngleBetaEsd::new) : getBinaryColumn("reciprocal_angle_beta_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_gamma.
     * @return ReciprocalAngleGammaEsd
     */
    public ReciprocalAngleGammaEsd getReciprocalAngleGammaEsd() {
        return (ReciprocalAngleGammaEsd) (isText ? textFields.computeIfAbsent("reciprocal_angle_gamma_esd",
                ReciprocalAngleGammaEsd::new) : getBinaryColumn("reciprocal_angle_gamma_esd"));
    }

    /**
     * The reciprocal cell length (recip-a) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalLengthA
     */
    public ReciprocalLengthA getReciprocalLengthA() {
        return (ReciprocalLengthA) (isText ? textFields.computeIfAbsent("reciprocal_length_a",
                ReciprocalLengthA::new) : getBinaryColumn("reciprocal_length_a"));
    }

    /**
     * The reciprocal cell length (recip-b) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalLengthB
     */
    public ReciprocalLengthB getReciprocalLengthB() {
        return (ReciprocalLengthB) (isText ? textFields.computeIfAbsent("reciprocal_length_b",
                ReciprocalLengthB::new) : getBinaryColumn("reciprocal_length_b"));
    }

    /**
     * The reciprocal cell length (recip-c) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley & Sons Inc.
     * @return ReciprocalLengthC
     */
    public ReciprocalLengthC getReciprocalLengthC() {
        return (ReciprocalLengthC) (isText ? textFields.computeIfAbsent("reciprocal_length_c",
                ReciprocalLengthC::new) : getBinaryColumn("reciprocal_length_c"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_a.
     * @return ReciprocalLengthAEsd
     */
    public ReciprocalLengthAEsd getReciprocalLengthAEsd() {
        return (ReciprocalLengthAEsd) (isText ? textFields.computeIfAbsent("reciprocal_length_a_esd",
                ReciprocalLengthAEsd::new) : getBinaryColumn("reciprocal_length_a_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_b.
     * @return ReciprocalLengthBEsd
     */
    public ReciprocalLengthBEsd getReciprocalLengthBEsd() {
        return (ReciprocalLengthBEsd) (isText ? textFields.computeIfAbsent("reciprocal_length_b_esd",
                ReciprocalLengthBEsd::new) : getBinaryColumn("reciprocal_length_b_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_c.
     * @return ReciprocalLengthCEsd
     */
    public ReciprocalLengthCEsd getReciprocalLengthCEsd() {
        return (ReciprocalLengthCEsd) (isText ? textFields.computeIfAbsent("reciprocal_length_c_esd",
                ReciprocalLengthCEsd::new) : getBinaryColumn("reciprocal_length_c_esd"));
    }

    /**
     * To further identify unique axis if necessary.  E.g., P 21 with
     * an unique C axis will have 'C' in this field.
     * @return PdbxUniqueAxis
     */
    public PdbxUniqueAxis getPdbxUniqueAxis() {
        return (PdbxUniqueAxis) (isText ? textFields.computeIfAbsent("pdbx_unique_axis",
                PdbxUniqueAxis::new) : getBinaryColumn("pdbx_unique_axis"));
    }
}
