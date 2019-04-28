package org.rcsb.cif.model.generated.phasingmirderrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DerId
     */
    public DerId getDerId() {
        return (DerId) (isText ? textFields.computeIfAbsent("der_id",
                DerId::new) : getBinaryColumn("der_id"));
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in electrons.
     * @return FCalc
     */
    public FCalc getFCalc() {
        return (FCalc) (isText ? textFields.computeIfAbsent("F_calc",
                FCalc::new) : getBinaryColumn("F_calc"));
    }

    /**
     * The calculated value of the structure factor for this derivative,
     * in arbitrary units.
     * @return FCalcAu
     */
    public FCalcAu getFCalcAu() {
        return (FCalcAu) (isText ? textFields.computeIfAbsent("F_calc_au",
                FCalcAu::new) : getBinaryColumn("F_calc_au"));
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in electrons.
     * @return FMeas
     */
    public FMeas getFMeas() {
        return (FMeas) (isText ? textFields.computeIfAbsent("F_meas",
                FMeas::new) : getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor for this derivative,
     * in arbitrary units.
     * @return FMeasAu
     */
    public FMeasAu getFMeasAu() {
        return (FMeasAu) (isText ? textFields.computeIfAbsent("F_meas_au",
                FMeasAu::new) : getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas, in electrons.
     * @return FMeasSigma
     */
    public FMeasSigma getFMeasSigma() {
        return (FMeasSigma) (isText ? textFields.computeIfAbsent("F_meas_sigma",
                FMeasSigma::new) : getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_refln.F_meas_au, in arbitrary units.
     * @return FMeasSigmaAu
     */
    public FMeasSigmaAu getFMeasSigmaAu() {
        return (FMeasSigmaAu) (isText ? textFields.computeIfAbsent("F_meas_sigma_au",
                FMeasSigmaAu::new) : getBinaryColumn("F_meas_sigma_au"));
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
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return HLAIso
     */
    public HLAIso getHLAIso() {
        return (HLAIso) (isText ? textFields.computeIfAbsent("HL_A_iso",
                HLAIso::new) : getBinaryColumn("HL_A_iso"));
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
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return HLBIso
     */
    public HLBIso getHLBIso() {
        return (HLBIso) (isText ? textFields.computeIfAbsent("HL_B_iso",
                HLBIso::new) : getBinaryColumn("HL_B_iso"));
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
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return HLCIso
     */
    public HLCIso getHLCIso() {
        return (HLCIso) (isText ? textFields.computeIfAbsent("HL_C_iso",
                HLCIso::new) : getBinaryColumn("HL_C_iso"));
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
     * Ref: Hendrickson, W. A. & Lattman, E. E. (1970). Acta
     * Cryst. B26, 136-143.
     * @return HLDIso
     */
    public HLDIso getHLDIso() {
        return (HLDIso) (isText ? textFields.computeIfAbsent("HL_D_iso",
                HLDIso::new) : getBinaryColumn("HL_D_iso"));
    }

    /**
     * Miller index h for this reflection for this derivative.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k for this reflection for this derivative.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l for this reflection for this derivative.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * The calculated value of the structure-factor phase based on the
     * heavy-atom model for this derivative in degrees.
     * @return PhaseCalc
     */
    public PhaseCalc getPhaseCalc() {
        return (PhaseCalc) (isText ? textFields.computeIfAbsent("phase_calc",
                PhaseCalc::new) : getBinaryColumn("phase_calc"));
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return SetId
     */
    public SetId getSetId() {
        return (SetId) (isText ? textFields.computeIfAbsent("set_id",
                SetId::new) : getBinaryColumn("set_id"));
    }
}
