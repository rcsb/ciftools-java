package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CELL category record details about the
 * crystallographic cell parameters.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_alpha", FloatColumn::new) :
                getBinaryColumn("angle_alpha"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_alpha_esd", FloatColumn::new) :
                getBinaryColumn("angle_alpha_esd"));
    }

    /**
     * Unit-cell angle beta of the reported structure in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_beta", FloatColumn::new) :
                getBinaryColumn("angle_beta"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_beta_esd", FloatColumn::new) :
                getBinaryColumn("angle_beta_esd"));
    }

    /**
     * Unit-cell angle gamma of the reported structure in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_gamma", FloatColumn::new) :
                getBinaryColumn("angle_gamma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_gamma_esd", FloatColumn::new) :
                getBinaryColumn("angle_gamma_esd"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum.
     * @return IntColumn
     */
    public IntColumn getFormulaUnitsZ() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("formula_units_Z", IntColumn::new) :
                getBinaryColumn("formula_units_Z"));
    }

    /**
     * Unit-cell length a corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_a", FloatColumn::new) :
                getBinaryColumn("length_a"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getLengthAEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_a_esd", FloatColumn::new) :
                getBinaryColumn("length_a_esd"));
    }

    /**
     * Unit-cell length b corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_b", FloatColumn::new) :
                getBinaryColumn("length_b"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getLengthBEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_b_esd", FloatColumn::new) :
                getBinaryColumn("length_b_esd"));
    }

    /**
     * Unit-cell length c corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_c", FloatColumn::new) :
                getBinaryColumn("length_c"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getLengthCEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("length_c_esd", FloatColumn::new) :
                getBinaryColumn("length_c_esd"));
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
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume", FloatColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.volume.
     * @return FloatColumn
     */
    public FloatColumn getVolumeEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume_esd", FloatColumn::new) :
                getBinaryColumn("volume_esd"));
    }

    /**
     * The number of the polymeric chains in a unit cell. In the case
     * of heteropolymers, Z is the number of occurrences of the most
     * populous chain.
     * 
     * This data item is provided for compatibility with the original
     * Protein Data Bank format, and only for that purpose.
     * @return IntColumn
     */
    public IntColumn getZPDB() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("Z_PDB", IntColumn::new) :
                getBinaryColumn("Z_PDB"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_alpha", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_alpha"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_beta", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_beta"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_gamma", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_gamma"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlphaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_alpha_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_alpha_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBetaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_beta_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_beta_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGammaEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_angle_gamma_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_angle_gamma_esd"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_a", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_a"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_b", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_b"));
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
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_c", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_c"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthAEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_a_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_a_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthBEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_b_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_b_esd"));
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthCEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reciprocal_length_c_esd", FloatColumn::new) :
                getBinaryColumn("reciprocal_length_c_esd"));
    }

    /**
     * To further identify unique axis if necessary.  E.g., P 21 with
     * an unique C axis will have 'C' in this field.
     * @return StrColumn
     */
    public StrColumn getPdbxUniqueAxis() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_unique_axis", StrColumn::new) :
                getBinaryColumn("pdbx_unique_axis"));
    }
}
