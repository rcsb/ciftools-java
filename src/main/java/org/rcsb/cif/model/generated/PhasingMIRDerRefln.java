package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MIR_DER_REFLN category record details
 * about the calculated structure factors obtained in an MIR
 * phasing experiment.
 * 
 * This list may contain information from a number of different
 * derivatives; _phasing_MIR_der_refln.der_id indicates to which
 * derivative a given record corresponds. (A derivative in this
 * context does not necessarily equate with a data set; see the
 * definition of the PHASING_MIR_DER category for a
 * discussion of the meaning of derivative.)
 * 
 * It is not necessary for the data items describing the measured
 * value of F to appear in this list, as they will be
 * given in the PHASING_SET_REFLN category. However, these
 * items can also be listed here for completeness.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMIRDerRefln extends BaseCategory {
    public PhasingMIRDerRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRDerRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRDerRefln(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDerId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("der_id", SingleRowStrColumn::new) :
                getBinaryColumn("der_id"));
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in electrons.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFCalc() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_calc", SingleRowFloatColumn::new) :
                getBinaryColumn("F_calc"));
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in arbitrary units.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFCalcAu() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_calc_au", SingleRowFloatColumn::new) :
                getBinaryColumn("F_calc_au"));
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in electrons.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFMeas() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_meas", SingleRowFloatColumn::new) :
                getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in arbitrary units.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFMeasAu() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_meas_au", SingleRowFloatColumn::new) :
                getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas, in electrons.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFMeasSigma() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma", SingleRowFloatColumn::new) :
                getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas_au, in arbitrary units.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFMeasSigmaAu() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma_au", SingleRowFloatColumn::new) :
                getBinaryColumn("F_meas_sigma_au"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient A~iso~ for this
     * reflection for this derivative.
     * 
     * -2.0 * (Fp~obs~^2^ + Fh~calc~^2^ - Fph~obs~^2^)
     * *  Fp~obs~ * cos(alphah~calc~)
     * A~iso~ =  -----------------------------------------------
     * E^2^
     * 
     * E            = (Fph~obs~ - Fp~obs~ - Fh~calc~)^2^
     * for centric reflections
     * = [(Fph~obs~ - Fp~obs~) * 2^1/2^ - Fh~calc~]^2^
     * for acentric reflections
     * 
     * Fp~obs~      = the observed structure-factor amplitude of the
     * native
     * Fph~obs~     = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~     = the calculated structure-factor amplitude
     * from the heavy-atom model
     * alphah~calc~ = the calculated phase from the heavy-atom model
     * 
     * This coefficient appears in the expression for the phase
     * probability of each isomorphous derivative:
     * 
     * P~i~(alpha) = exp[k + A * cos(alpha) + B * sin(alpha)
     * + C * cos(2 * alpha) + D * sin(2 * alpha)]
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHLAIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("HL_A_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("HL_A_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient B~iso~ for this
     * reflection for this derivative.
     * 
     * -2.0 * (Fp~obs~^2^ + Fh~calc~^2^ - Fph~obs~^2^)
     * *  Fp~obs~ * sin(alphah~calc~)
     * B~iso~ =  -----------------------------------------------
     * E^2^
     * 
     * E            = (Fph~obs~ - Fp~obs~ - Fh~calc~)^2^
     * for centric reflections
     * = [(Fph~obs~ - Fp~obs~) * 2^1/2^ - Fh~calc~]^2^
     * for acentric reflections
     * 
     * Fp~obs~      = the observed structure-factor amplitude of the
     * native
     * Fph~obs~     = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~     = the calculated structure-factor amplitude
     * from the heavy-atom model
     * alphah~calc~ = the phase calculated from the heavy-atom model
     * 
     * This coefficient appears in the expression for the phase
     * probability of each isomorphous derivative:
     * 
     * P~i~(alpha) = exp[k + A * cos(alpha) + B * sin(alpha)
     * + C * cos(2 * alpha) + D * sin(2 * alpha)]
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHLBIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("HL_B_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("HL_B_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient C~iso~ for this
     * reflection for this derivative.
     * 
     * -Fp~obs~^2^ * [sin(alphah~calc~)^2^
     * -  cos(alphah~calc~)^2^]
     * C~iso~ =  ------------------------------------
     * E^2^
     * 
     * E            = (Fph~obs~ - Fp~obs~ - Fh~calc~)^2^
     * for centric reflections
     * = [(Fph~obs~ - Fp~obs~) * 2^1/2^ - Fh~calc~]^2^
     * for acentric reflections
     * 
     * Fp~obs~      = the observed structure-factor amplitude of the
     * native
     * Fph~obs~     = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~     = the calculated structure-factor amplitude
     * from the heavy-atom model
     * alphah~calc~ = the phase calculated from the heavy-atom model
     * 
     * This coefficient appears in the expression for the phase
     * probability of each isomorphous derivative:
     * 
     * P~i~(alpha) = exp[k + A * cos(alpha) + B * sin(alpha)
     * + C * cos(2 * alpha) + D * sin(2 * alpha)]
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHLCIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("HL_C_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("HL_C_iso"));
    }

    /**
     * The isomorphous Hendrickson-Lattman coefficient D~iso~ for this
     * reflection for this derivative.
     * 
     * -2.0 * Fp~obs~^2^ * sin(alphah~calc~)^2^
     * * cos(alphah~calc~)^2^
     * D~iso~ =  ----------------------------------------
     * E^2^
     * 
     * E            = (Fph~obs~ - Fp~obs~ - Fh~calc~)^2^
     * for centric reflections
     * = [(Fph~obs~ - Fp~obs~) * 2^1/2^ - Fh~calc~]^2^
     * for acentric reflections
     * 
     * Fp~obs~      = the observed structure-factor amplitude of the
     * native
     * Fph~obs~     = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~     = the calculated structure-factor amplitude
     * from the heavy-atom model
     * alphah~calc~ = the phase calculated from the heavy-atom model
     * 
     * This coefficient appears in the expression for the phase
     * probability of each isomorphous derivative:
     * 
     * P~i~(alpha) = exp[k + A * cos(alpha) + B * sin(alpha)
     * + C * cos(2 * alpha) + D * sin(2 * alpha)]
     * 
     * Ref: Hendrickson, W. A. &amp; Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getHLDIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("HL_D_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("HL_D_iso"));
    }

    /**
     * Miller index h for this reflection for this derivative.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexH() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_h", SingleRowIntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k for this reflection for this derivative.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexK() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_k", SingleRowIntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l for this reflection for this derivative.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexL() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_l", SingleRowIntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * The calculated value of the structure-factor phase based on the
     * heavy-atom model for this derivative in degrees.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPhaseCalc() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("phase_calc", SingleRowFloatColumn::new) :
                getBinaryColumn("phase_calc"));
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSetId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("set_id", SingleRowStrColumn::new) :
                getBinaryColumn("set_id"));
    }
}
