package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

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
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIRDerRefln extends DelegatingCategory {
    public PhasingMIRDerRefln(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "der_id":
                return getDerId();
            case "F_calc":
                return getFCalc();
            case "F_calc_au":
                return getFCalcAu();
            case "F_meas":
                return getFMeas();
            case "F_meas_au":
                return getFMeasAu();
            case "F_meas_sigma":
                return getFMeasSigma();
            case "F_meas_sigma_au":
                return getFMeasSigmaAu();
            case "HL_A_iso":
                return getHLAIso();
            case "HL_B_iso":
                return getHLBIso();
            case "HL_C_iso":
                return getHLCIso();
            case "HL_D_iso":
                return getHLDIso();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "phase_calc":
                return getPhaseCalc();
            case "set_id":
                return getSetId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return StrColumn
     */
    public StrColumn getDerId() {
        return delegate.getColumn("der_id", DelegatingStrColumn::new);
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFCalc() {
        return delegate.getColumn("F_calc", DelegatingFloatColumn::new);
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFCalcAu() {
        return delegate.getColumn("F_calc_au", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return delegate.getColumn("F_meas", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasAu() {
        return delegate.getColumn("F_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas, in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return delegate.getColumn("F_meas_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas_au, in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigmaAu() {
        return delegate.getColumn("F_meas_sigma_au", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getHLAIso() {
        return delegate.getColumn("HL_A_iso", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getHLBIso() {
        return delegate.getColumn("HL_B_iso", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getHLCIso() {
        return delegate.getColumn("HL_C_iso", DelegatingFloatColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getHLDIso() {
        return delegate.getColumn("HL_D_iso", DelegatingFloatColumn::new);
    }

    /**
     * Miller index h for this reflection for this derivative.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k for this reflection for this derivative.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l for this reflection for this derivative.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * The calculated value of the structure-factor phase based on the
     * heavy-atom model for this derivative in degrees.
     * @return FloatColumn
     */
    public FloatColumn getPhaseCalc() {
        return delegate.getColumn("phase_calc", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return delegate.getColumn("set_id", DelegatingStrColumn::new);
    }

}