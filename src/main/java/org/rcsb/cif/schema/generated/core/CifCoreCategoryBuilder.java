package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.builder.BlockBuilder;
import org.rcsb.cif.model.builder.CategoryBuilder;
import org.rcsb.cif.model.builder.FloatColumnBuilder;
import org.rcsb.cif.model.builder.IntColumnBuilder;
import org.rcsb.cif.model.builder.StrColumnBuilder;

public class CifCoreCategoryBuilder extends CategoryBuilder {
    public CifCoreCategoryBuilder(String blockName, BlockBuilder parent) {
        super(blockName, parent);
    }

    public static class CifCoreBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cif_core";

        public CifCoreBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class DiffractionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffraction";

        public DiffractionBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class DiffrnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn";

        public DiffrnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientEnvironment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_environment", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientPressure() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_pressure", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientPressureGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_gt", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientPressureLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_lt", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientPressureSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_su", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperature() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperatureDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperatureGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_gt", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperatureLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_lt", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperatureSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_su", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterCrystalSupport() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystal_support", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterCrystalTreatment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystal_treatment", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterMeasuredFractionThetaFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "measured_fraction_theta_full", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterMeasuredFractionThetaMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "measured_fraction_theta_max", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterSymmetryDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symmetry_description", this);
        }
    }

    public static class DiffrnAttenuatorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_attenuator";

        public DiffrnAttenuatorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnAttenuatorBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<DiffrnAttenuatorBuilder> enterMaterial() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "material", this);
        }

        public StrColumnBuilder<DiffrnAttenuatorBuilder> enterScale() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scale", this);
        }
    }

    public static class DiffrnDetectorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_detector";

        public DiffrnDetectorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterAreaResolMean() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "area_resol_mean", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterDtime() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dtime", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterMake() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "make", this);
        }
    }

    public static class DiffrnMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_measurement";

        public DiffrnMeasurementBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterDeviceClass() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "device_class", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterDeviceDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "device_details", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterDeviceMake() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "device_make", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "method", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder> enterSpecimenSupport() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "specimen_support", this);
        }
    }

    public static class DiffrnOrientBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient";

        public DiffrnOrientBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class DiffrnOrientMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient_matrix";

        public DiffrnOrientMatrixBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnOrientMatrixBuilder> enterType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type", this);
        }

        public StrColumnBuilder<DiffrnOrientMatrixBuilder> enterUBIJ() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "UBIJ", this);
        }
    }

    public static class DiffrnOrientReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient_refln";

        public DiffrnOrientReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnOrientReflnBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }
    }

    public static class DiffrnRadiationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_radiation";

        public DiffrnRadiationBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterCollimation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "collimation", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterFilterEdge() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "filter_edge", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterInhomogeneity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "inhomogeneity", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterMonochromator() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "monochromator", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterPolarisnNorm() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "polarisn_norm", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterPolarisnRatio() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "polarisn_ratio", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterProbe() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "probe", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterXraySymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "xray_symbol", this);
        }
    }

    public static class DiffrnRadiationWavelengthBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_radiation_wavelength";

        public DiffrnRadiationWavelengthBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterDetermination() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "determination", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterValue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "value", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterValueSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "value_su", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder> enterWt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wt", this);
        }
    }

    public static class DiffrnReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_refln";

        public DiffrnReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterAttenuatorCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "attenuator_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterClassCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "class_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterDetectSlitHoriz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "detect_slit_horiz", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterDetectSlitVert() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "detect_slit_vert", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterElapsedTime() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "elapsed_time", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterIntensityNet() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity_net", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterIntensityNetSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity_net_su", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScaleGroupCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scale_group_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScanMode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scan_mode", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScanModeBackgd() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scan_mode_backgd", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScanRate() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scan_rate", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScanTimeBackgd() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scan_time_backgd", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterScanWidth() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scan_width", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterSinThetaOverLambda() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterStandardCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "standard_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterWavelength() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterWavelengthId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wavelength_id", this);
        }
    }

    public static class DiffrnReflnsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns";

        public DiffrnReflnsBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterAvREquivalents() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "av_R_equivalents", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterAvSunetIOverNetI() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "av_sunetI_over_netI", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterLaueMeasuredFractionFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Laue_measured_fraction_full", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterLaueMeasuredFractionMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Laue_measured_fraction_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterLimitMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "limit_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterLimitMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "limit_min", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterPointMeasuredFractionFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "point_measured_fraction_full", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterPointMeasuredFractionMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "point_measured_fraction_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterReductionProcess() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reduction_process", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterResolutionFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "resolution_full", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterResolutionMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "resolution_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterThetaFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta_full", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterThetaMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterThetaMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta_min", this);
        }
    }

    public static class DiffrnReflnsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_class";

        public DiffrnReflnsClassBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterAvREq() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "av_R_eq", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterAvSuIOverI() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "av_suI_over_I", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterDResHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterDResLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number", this);
        }
    }

    public static class DiffrnReflnsTransfMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_transf_matrix";

        public DiffrnReflnsTransfMatrixBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enterTIJ() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "TIJ", this);
        }
    }

    public static class DiffrnScaleGroupBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_scale_group";

        public DiffrnScaleGroupBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnScaleGroupBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<DiffrnScaleGroupBuilder> enterINet() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "I_net", this);
        }
    }

    public static class DiffrnSourceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_source";

        public DiffrnSourceBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterCurrent() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "current", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterDevice() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "device", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterMake() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "make", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterPower() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "power", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterSize() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterTakeOffAngle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "take_off_angle", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterTarget() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "target", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterVoltage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "voltage", this);
        }
    }

    public static class DiffrnStandardBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standard";

        public DiffrnStandardBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnStandardBuilder> enterDecayPercent() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "decay_percent", this);
        }

        public StrColumnBuilder<DiffrnStandardBuilder> enterIntervalCount() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "interval_count", this);
        }

        public StrColumnBuilder<DiffrnStandardBuilder> enterIntervalTime() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "interval_time", this);
        }

        public StrColumnBuilder<DiffrnStandardBuilder> enterNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number", this);
        }

        public StrColumnBuilder<DiffrnStandardBuilder> enterScaleSuAverage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scale_su_average", this);
        }
    }

    public static class DiffrnStandardReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standard_refln";

        public DiffrnStandardReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnStandardReflnBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<DiffrnStandardReflnBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }
    }

    public static class ReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refln";

        public ReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnBuilder> enterACalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "A_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterAMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "A_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterBCalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterBMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterClassCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "class_code", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterDSpacing() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_spacing", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFCalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFComplex() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_complex", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFMeasSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_meas_su", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFSquaredCalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_squared_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFSquaredMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_squared_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFSquaredMeasSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_squared_meas_su", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFom() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fom", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFormFactorTable() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "form_factor_table", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterIncludeStatus() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "include_status", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterIntensityCalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterIntensityMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterIntensityMeasSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity_meas_su", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterLpFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Lp_factor", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterMeanPathLengthTbar() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "mean_path_length_tbar", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterPhaseCalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phase_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterPhaseMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phase_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterRefinementStatus() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_status", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterScaleGroupCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scale_group_code", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterSinThetaOverLambda() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterSymmetryEpsilon() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symmetry_epsilon", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterSymmetryMultiplicity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symmetry_multiplicity", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterWavelength() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterWavelengthId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wavelength_id", this);
        }
    }

    public static class ReflnsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns";

        public ReflnsBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsBuilder> enterApplyDispersionToFcalc() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "apply_dispersion_to_Fcalc", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterDResolutionHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_resolution_high", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterDResolutionLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_resolution_low", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterFriedelCoverage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Friedel_coverage", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterFriedelFractionFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Friedel_fraction_full", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterFriedelFractionMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Friedel_fraction_max", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterLimitMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "limit_max", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterNumberGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_gt", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterNumberTotal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_total", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<ReflnsBuilder> enterThresholdExpression() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "threshold_expression", this);
        }
    }

    public static class ReflnsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_class";

        public ReflnsClassBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterDResHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterDResLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterNumberGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_gt", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterNumberTotal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_total", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterRFactorGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterRFsqdFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterRIFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterWRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
        }
    }

    public static class ReflnsScaleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_scale";

        public ReflnsScaleBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsScaleBuilder> enterGroupCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "group_code", this);
        }

        public StrColumnBuilder<ReflnsScaleBuilder> enterMeasF() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "meas_F", this);
        }

        public StrColumnBuilder<ReflnsScaleBuilder> enterMeasFSquared() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "meas_F_squared", this);
        }

        public StrColumnBuilder<ReflnsScaleBuilder> enterMeasIntensity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "meas_intensity", this);
        }
    }

    public static class ReflnsShellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_shell";

        public ReflnsShellBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterDResHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterDResLimits() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_limits", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterDResLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterMeanIOverSuIAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "meanI_over_suI_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterMeanIOverSuIGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "meanI_over_suI_gt", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterNumberMeasuredAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_measured_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterNumberMeasuredGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_measured_gt", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterNumberPossible() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_possible", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterNumberUniqueAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_unique_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterNumberUniqueGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_unique_gt", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterPercentPossibleAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "percent_possible_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterPercentPossibleGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "percent_possible_gt", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterRmergeFAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Rmerge_F_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterRmergeFGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Rmerge_F_gt", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterRmergeIAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Rmerge_I_all", this);
        }

        public StrColumnBuilder<ReflnsShellBuilder> enterRmergeIGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Rmerge_I_gt", this);
        }
    }

    public static class ExptlBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl";

        public ExptlBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlBuilder> enterCrystalsNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystals_number", this);
        }

        public StrColumnBuilder<ExptlBuilder> enterMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "method", this);
        }

        public StrColumnBuilder<ExptlBuilder> enterMethodDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "method_details", this);
        }

        public StrColumnBuilder<ExptlBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<ExptlBuilder> enterTransmissionFactorMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "transmission_factor_max", this);
        }

        public StrColumnBuilder<ExptlBuilder> enterTransmissionFactorMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "transmission_factor_min", this);
        }
    }

    public static class CellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell";

        public CellBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CellBuilder> enterAtomicMass() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public StrColumnBuilder<CellBuilder> enterFormulaUnitsZ() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "formula_units_Z", this);
        }

        public StrColumnBuilder<CellBuilder> enterMetricTensor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "metric_tensor", this);
        }

        public StrColumnBuilder<CellBuilder> enterOrthogonalMatrix() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "orthogonal_matrix", this);
        }

        public StrColumnBuilder<CellBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<CellBuilder> enterVolume() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "volume", this);
        }

        public StrColumnBuilder<CellBuilder> enterVolumeSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "volume_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterConvertUijToBetaij() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "convert_Uij_to_betaij", this);
        }

        public StrColumnBuilder<CellBuilder> enterConvertUisoToUij() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "convert_Uiso_to_Uij", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalMetricTensor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_metric_tensor", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalOrthogonalMatrix() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_orthogonal_matrix", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleAlpha() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_alpha", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleAlphaSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_alpha_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleBeta() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_beta", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleBetaSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_beta_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleGamma() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_gamma", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalAngleGammaSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_gamma_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_a", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthASu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_a_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_b", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthBSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_b_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthC() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_c", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalLengthCSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_c_su", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalVectorA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_a", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalVectorB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_b", this);
        }

        public StrColumnBuilder<CellBuilder> enterReciprocalVectorC() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_c", this);
        }

        public StrColumnBuilder<CellBuilder> enterVectorA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "vector_a", this);
        }

        public StrColumnBuilder<CellBuilder> enterVectorB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "vector_b", this);
        }

        public StrColumnBuilder<CellBuilder> enterVectorC() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "vector_c", this);
        }
    }

    public static class CellMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement";

        public CellMeasurementBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterPressure() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "pressure", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterPressureSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "pressure_su", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterRadiation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radiation", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterReflnsUsed() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reflns_used", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterTemperature() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterTemperatureSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_su", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterThetaMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta_max", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterThetaMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta_min", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterWavelength() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
        }
    }

    public static class CellMeasurementReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement_refln";

        public CellMeasurementReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CellMeasurementReflnBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public StrColumnBuilder<CellMeasurementReflnBuilder> enterTheta() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "theta", this);
        }
    }

    public static class ChemicalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical";

        public ChemicalBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalBuilder> enterAbsoluteConfiguration() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "absolute_configuration", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterCompoundSource() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "compound_source", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterEnantioexcessBulk() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "enantioexcess_bulk", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterEnantioexcessBulkTechnique() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "enantioexcess_bulk_technique", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterEnantioexcessCrystal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "enantioexcess_crystal", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterEnantioexcessCrystalTechnique() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "enantioexcess_crystal_technique", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterIdentifierInchi() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "identifier_inchi", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterIdentifierInchiKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "identifier_inchi_key", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterIdentifierInchiVersion() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "identifier_inchi_version", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterMeltingPoint() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "melting_point", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterMeltingPointGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "melting_point_gt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterMeltingPointLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "melting_point_lt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterNameCommon() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_common", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterNameMineral() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_mineral", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterNameStructureType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_structure_type", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterNameSystematic() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_systematic", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterOpticalRotation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "optical_rotation", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterPropertiesBiological() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "properties_biological", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterPropertiesPhysical() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "properties_physical", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureDecomposition() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_gt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_lt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_su", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureSublimation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureSublimationGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_gt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureSublimationLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_lt", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterTemperatureSublimationSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_su", this);
        }
    }

    public static class ChemicalConnAtomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_conn_atom";

        public ChemicalConnAtomBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterCharge() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "charge", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterDisplayX() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_x", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterDisplayY() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_y", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterNCA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "NCA", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterNH() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "NH", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }
    }

    public static class ChemicalConnBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_conn_bond";

        public ChemicalConnBondBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalConnBondBuilder> enterAtom1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_1", this);
        }

        public StrColumnBuilder<ChemicalConnBondBuilder> enterAtom2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_2", this);
        }

        public StrColumnBuilder<ChemicalConnBondBuilder> enterDistance() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance", this);
        }

        public StrColumnBuilder<ChemicalConnBondBuilder> enterType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type", this);
        }
    }

    public static class ChemicalFormulaBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_formula";

        public ChemicalFormulaBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterAnalytical() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "analytical", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterIupac() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "iupac", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterMoiety() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "moiety", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterStructural() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "structural", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterSum() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "sum", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterWeight() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "weight", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder> enterWeightMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "weight_meas", this);
        }
    }

    public static class ExptlAbsorptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_absorpt";

        public ExptlAbsorptBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder> enterCoefficientMu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coefficient_mu", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder> enterCorrectionTMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "correction_T_max", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder> enterCorrectionTMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "correction_T_min", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder> enterCorrectionType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "correction_type", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder> enterProcessDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "process_details", this);
        }
    }

    public static class ExptlCrystalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal";

        public ExptlCrystalBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterColour() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "colour", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityDiffrn() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_diffrn", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeas() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_gt", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_lt", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_su", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTemp() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_temp", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_gt", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_lt", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_su", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_method", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterF000() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_000", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterPreparation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "preparation", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterPressureHistory() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "pressure_history", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterRecrystallizationMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "recrystallization_method", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterSizeLength() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size_length", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterSizeMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size_max", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterSizeMid() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size_mid", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterSizeMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size_min", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterSizeRad() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size_rad", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterThermalHistory() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "thermal_history", this);
        }
    }

    public static class ExptlCrystalAppearanceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal_appearance";

        public ExptlCrystalAppearanceBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder> enterGeneral() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "general", this);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder> enterHue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hue", this);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder> enterIntensity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "intensity", this);
        }
    }

    public static class ExptlCrystalFaceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal_face";

        public ExptlCrystalFaceBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlCrystalFaceBuilder> enterHkl() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public StrColumnBuilder<ExptlCrystalFaceBuilder> enterPerpDist() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "perp_dist", this);
        }
    }

    public static class SpaceGroupBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group";

        public SpaceGroupBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterBravaisType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Bravais_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterCentringType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "centring_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterCrystalSystem() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystal_system", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterITCoordinateSystemCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "IT_coordinate_system_code", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterITNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "IT_number", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterLaueClass() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Laue_class", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterMultiplicity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameH_MAlt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_H-M_alt", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameH_MRef() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_H-M_ref", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameHall() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_Hall", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameH_MAltDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_H-M_alt_description", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameH_MFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_H-M_full", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterNameSchoenflies() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_Schoenflies", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterPattersonNameH_M() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Patterson_name_H-M", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterPointGroupH_M() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "point_group_H-M", this);
        }
    }

    public static class SpaceGroupGeneratorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_generator";

        public SpaceGroupGeneratorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupGeneratorBuilder> enterKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "key", this);
        }

        public StrColumnBuilder<SpaceGroupGeneratorBuilder> enterXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "xyz", this);
        }
    }

    public static class SpaceGroupSymopBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_symop";

        public SpaceGroupSymopBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterOperationXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "operation_xyz", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterOperationDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "operation_description", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterR() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterRT() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "RT", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterSeitzMatrix() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Seitz_matrix", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterT() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "T", this);
        }
    }

    public static class SpaceGroupWyckoffBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_wyckoff";

        public SpaceGroupWyckoffBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder> enterCoordsXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coords_xyz", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder> enterLetter() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "letter", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder> enterMultiplicity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder> enterSiteSymmetry() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry", this);
        }
    }

    public static class FunctionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "function";

        public FunctionBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<FunctionBuilder> enterAtomType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "AtomType", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterClosest() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Closest", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterSeitzFromJones() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "SeitzFromJones", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterSymEquiv() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "SymEquiv", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterSymKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "SymKey", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterSymLat() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "SymLat", this);
        }

        public StrColumnBuilder<FunctionBuilder> enterSymop() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Symop", this);
        }
    }

    public static class ModelBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "model";

        public ModelBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class GeomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom";

        public GeomBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomBuilder> enterBondDistanceIncr() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "bond_distance_incr", this);
        }

        public StrColumnBuilder<GeomBuilder> enterBondDistanceMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "bond_distance_min", this);
        }

        public StrColumnBuilder<GeomBuilder> enterContactDistanceIncr() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "contact_distance_incr", this);
        }

        public StrColumnBuilder<GeomBuilder> enterContactDistanceMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "contact_distance_min", this);
        }

        public StrColumnBuilder<GeomBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }
    }

    public static class GeomAngleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_angle";

        public GeomAngleBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterDistances() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterValue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "value", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterValueSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "value_su", this);
        }
    }

    public static class GeomBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_bond";

        public GeomBondBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomBondBuilder> enterDistance() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterDistanceSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_su", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterMultiplicity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterValence() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "valence", this);
        }
    }

    public static class GeomContactBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_contact";

        public GeomContactBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomContactBuilder> enterDistance() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterDistanceSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_su", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }
    }

    public static class GeomHbondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_hbond";

        public GeomHbondBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterAngleDHA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "angle_DHA", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterAngleDHASu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "angle_DHA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceDA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_DA", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceDASu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_DA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceDH() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_DH", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceDHSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_DH_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceHA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_HA", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterDistanceHASu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distance_HA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }
    }

    public static class GeomTorsionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_torsion";

        public GeomTorsionBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAngle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "angle", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAngleSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "angle_su", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterDistances() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }
    }

    public static class ModelSiteBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "model_site";

        public ModelSiteBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterAdpEigenSystem() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "adp_eigen_system", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterAdpMatrixBeta() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "adp_matrix_beta", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterCartnXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterDisplayColour() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_colour", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterFractXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterIndex() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "index", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterMoleIndex() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "mole_index", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterRadiusBond() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radius_bond", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterRadiusContact() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radius_contact", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }
    }

    public static class ValenceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence";

        public ValenceBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class ValenceParamBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence_param";

        public ValenceParamBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterAtom1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_1", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterAtom1Valence() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_1_valence", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterAtom2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_2", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterAtom2Valence() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_2_valence", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterRefId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ref_id", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterRo() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Ro", this);
        }
    }

    public static class ValenceRefBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence_ref";

        public ValenceRefBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ValenceRefBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ValenceRefBuilder> enterReference() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reference", this);
        }
    }

    public static class PublicationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publication";

        public PublicationBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class AuditBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit";

        public AuditBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditBuilder> enterBlockCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "block_code", this);
        }

        public StrColumnBuilder<AuditBuilder> enterBlockDoi() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "block_doi", this);
        }

        public StrColumnBuilder<AuditBuilder> enterCreationDate() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "creation_date", this);
        }

        public StrColumnBuilder<AuditBuilder> enterCreationMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "creation_method", this);
        }

        public StrColumnBuilder<AuditBuilder> enterSchema() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "schema", this);
        }

        public StrColumnBuilder<AuditBuilder> enterUpdateRecord() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "update_record", this);
        }
    }

    public static class AuditAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_author";

        public AuditAuthorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditAuthorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }
    }

    public static class AuditConformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_conform";

        public AuditConformBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditConformBuilder> enterDictLocation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dict_location", this);
        }

        public StrColumnBuilder<AuditConformBuilder> enterDictName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dict_name", this);
        }

        public StrColumnBuilder<AuditConformBuilder> enterDictVersion() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dict_version", this);
        }
    }

    public static class AuditContactAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_contact_author";

        public AuditContactAuthorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder> enterEmail() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder> enterFax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder> enterPhone() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phone", this);
        }
    }

    public static class AuditLinkBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_link";

        public AuditLinkBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditLinkBuilder> enterBlockCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "block_code", this);
        }

        public StrColumnBuilder<AuditLinkBuilder> enterBlockDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "block_description", this);
        }
    }

    public static class CitationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation";

        public CitationBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationBuilder> enterAbstract() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abstract", this);
        }

        public StrColumnBuilder<CitationBuilder> enterAbstractIdCAS() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abstract_id_CAS", this);
        }

        public StrColumnBuilder<CitationBuilder> enterBookIdISBN() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "book_id_ISBN", this);
        }

        public StrColumnBuilder<CitationBuilder> enterBookPublisher() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "book_publisher", this);
        }

        public StrColumnBuilder<CitationBuilder> enterBookPublisherCity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "book_publisher_city", this);
        }

        public StrColumnBuilder<CitationBuilder> enterBookTitle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "book_title", this);
        }

        public StrColumnBuilder<CitationBuilder> enterCoordinateLinkage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coordinate_linkage", this);
        }

        public StrColumnBuilder<CitationBuilder> enterCountry() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "country", this);
        }

        public StrColumnBuilder<CitationBuilder> enterDatabaseIdCSD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "database_id_CSD", this);
        }

        public StrColumnBuilder<CitationBuilder> enterDatabaseIdMedline() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "database_id_Medline", this);
        }

        public StrColumnBuilder<CitationBuilder> enterDoi() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "doi", this);
        }

        public StrColumnBuilder<CitationBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalAbbrev() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_abbrev", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_full", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalIdASTM() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_id_ASTM", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalIdCSD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_id_CSD", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalIdISSN() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_id_ISSN", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalIssue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_issue", this);
        }

        public StrColumnBuilder<CitationBuilder> enterJournalVolume() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_volume", this);
        }

        public StrColumnBuilder<CitationBuilder> enterLanguage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "language", this);
        }

        public StrColumnBuilder<CitationBuilder> enterPageFirst() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "page_first", this);
        }

        public StrColumnBuilder<CitationBuilder> enterPageLast() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "page_last", this);
        }

        public StrColumnBuilder<CitationBuilder> enterPublisher() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publisher", this);
        }

        public StrColumnBuilder<CitationBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<CitationBuilder> enterTitle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "title", this);
        }

        public StrColumnBuilder<CitationBuilder> enterYear() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "year", this);
        }
    }

    public static class CitationAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation_author";

        public CitationAuthorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationAuthorBuilder> enterKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "key", this);
        }

        public StrColumnBuilder<CitationAuthorBuilder> enterCitationId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "citation_id", this);
        }

        public StrColumnBuilder<CitationAuthorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<CitationAuthorBuilder> enterOrdinal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ordinal", this);
        }
    }

    public static class CitationEditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation_editor";

        public CitationEditorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationEditorBuilder> enterCitationId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "citation_id", this);
        }

        public StrColumnBuilder<CitationEditorBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<CitationEditorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<CitationEditorBuilder> enterOrdinal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ordinal", this);
        }
    }

    public static class ComputingBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "computing";

        public ComputingBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ComputingBuilder> enterCellRefinement() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "cell_refinement", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterDiffrnCollection() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "diffrn_collection", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterDiffrnReduction() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "diffrn_reduction", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterMolecularGraphics() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "molecular_graphics", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterPublicationMaterial() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publication_material", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterStructureRefinement() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "structure_refinement", this);
        }

        public StrColumnBuilder<ComputingBuilder> enterStructureSolution() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "structure_solution", this);
        }
    }

    public static class DatabaseBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database";

        public DatabaseBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseBuilder> enterCSDHistory() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "CSD_history", this);
        }

        public StrColumnBuilder<DatabaseBuilder> enterDatasetDoi() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dataset_doi", this);
        }

        public StrColumnBuilder<DatabaseBuilder> enterJournalASTM() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_ASTM", this);
        }

        public StrColumnBuilder<DatabaseBuilder> enterJournalCSD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal_CSD", this);
        }
    }

    public static class DatabaseCodeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_code";

        public DatabaseCodeBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterCAS() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "CAS", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterCOD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "COD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterCSD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "CSD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterDepnumCcdcArchive() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "depnum_ccdc_archive", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterDepnumCcdcFiz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "depnum_ccdc_fiz", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterDepnumCcdcJournal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "depnum_ccdc_journal", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterICSD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ICSD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterMDF() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "MDF", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterNBS() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "NBS", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterPDB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "PDB", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder> enterPDF() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "PDF", this);
        }
    }

    public static class DatabaseRelatedBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_related";

        public DatabaseRelatedBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder> enterDatabaseId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "database_id", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder> enterEntryCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "entry_code", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder> enterRelation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "relation", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }
    }

    public static class DisplayBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "display";

        public DisplayBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class DisplayColourBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "display_colour";

        public DisplayColourBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DisplayColourBuilder> enterHue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hue", this);
        }

        public StrColumnBuilder<DisplayColourBuilder> enterRGB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "RGB", this);
        }
    }

    public static class JournalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal";

        public JournalBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalBuilder> enterCodenASTM() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coden_ASTM", this);
        }

        public StrColumnBuilder<JournalBuilder> enterCodenCambridge() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coden_Cambridge", this);
        }

        public StrColumnBuilder<JournalBuilder> enterDataValidationNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "data_validation_number", this);
        }

        public StrColumnBuilder<JournalBuilder> enterIssue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "issue", this);
        }

        public StrColumnBuilder<JournalBuilder> enterLanguage() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "language", this);
        }

        public StrColumnBuilder<JournalBuilder> enterNameFull() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name_full", this);
        }

        public StrColumnBuilder<JournalBuilder> enterPageFirst() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "page_first", this);
        }

        public StrColumnBuilder<JournalBuilder> enterPageLast() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "page_last", this);
        }

        public StrColumnBuilder<JournalBuilder> enterPaperCategory() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "paper_category", this);
        }

        public StrColumnBuilder<JournalBuilder> enterPaperDoi() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "paper_doi", this);
        }

        public StrColumnBuilder<JournalBuilder> enterSupplPublNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "suppl_publ_number", this);
        }

        public StrColumnBuilder<JournalBuilder> enterSupplPublPages() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "suppl_publ_pages", this);
        }

        public StrColumnBuilder<JournalBuilder> enterValidationNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "validation_number", this);
        }

        public StrColumnBuilder<JournalBuilder> enterVolume() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "volume", this);
        }

        public StrColumnBuilder<JournalBuilder> enterYear() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "year", this);
        }
    }

    public static class JournalCoeditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_coeditor";

        public JournalCoeditorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterEmail() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterFax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterNotes() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "notes", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder> enterPhone() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phone", this);
        }
    }

    public static class JournalDateBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_date";

        public JournalDateBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalDateBuilder> enterAccepted() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "accepted", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterFromCoeditor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "from_coeditor", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterPrintersFinal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "printers_final", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterPrintersFirst() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "printers_first", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterProofsIn() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "proofs_in", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterProofsOut() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "proofs_out", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterRecdCopyright() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "recd_copyright", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterRecdElectronic() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "recd_electronic", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterRecdHardCopy() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "recd_hard_copy", this);
        }

        public StrColumnBuilder<JournalDateBuilder> enterToCoeditor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "to_coeditor", this);
        }
    }

    public static class JournalIndexBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_index";

        public JournalIndexBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalIndexBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<JournalIndexBuilder> enterSubterm() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "subterm", this);
        }

        public StrColumnBuilder<JournalIndexBuilder> enterTerm() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "term", this);
        }

        public StrColumnBuilder<JournalIndexBuilder> enterType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type", this);
        }
    }

    public static class JournalTecheditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_techeditor";

        public JournalTecheditorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterEmail() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterFax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterNotes() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "notes", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder> enterPhone() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phone", this);
        }
    }

    public static class PublBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ";

        public PublBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublBuilder> enterContactLetter() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "contact_letter", this);
        }
    }

    public static class PublAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_author";

        public PublAuthorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterEmail() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterFootnote() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "footnote", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterIdIucr() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id_iucr", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterIdOrcid() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id_orcid", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<PublAuthorBuilder> enterPhone() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phone", this);
        }
    }

    public static class PublBodyBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_body";

        public PublBodyBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublBodyBuilder> enterContents() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "contents", this);
        }

        public StrColumnBuilder<PublBodyBuilder> enterElement() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "element", this);
        }

        public StrColumnBuilder<PublBodyBuilder> enterFormat() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "format", this);
        }

        public StrColumnBuilder<PublBodyBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public StrColumnBuilder<PublBodyBuilder> enterTitle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "title", this);
        }
    }

    public static class PublContactAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_contact_author";

        public PublContactAuthorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterAddress() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterEmail() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterFax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterIdIucr() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id_iucr", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterIdOrcid() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id_orcid", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder> enterPhone() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "phone", this);
        }
    }

    public static class PublManuscriptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_manuscript";

        public PublManuscriptBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublManuscriptBuilder> enterCreation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "creation", this);
        }

        public StrColumnBuilder<PublManuscriptBuilder> enterProcessed() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "processed", this);
        }

        public StrColumnBuilder<PublManuscriptBuilder> enterText() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "text", this);
        }
    }

    public static class PublManuscriptInclExtraBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_manuscript_incl_extra";

        public PublManuscriptInclExtraBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder> enterDefn() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "defn", this);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder> enterInfo() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "info", this);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder> enterItem() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "item", this);
        }
    }

    public static class PublRequestedBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_requested";

        public PublRequestedBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublRequestedBuilder> enterCategory() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "category", this);
        }

        public StrColumnBuilder<PublRequestedBuilder> enterCoeditorName() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "coeditor_name", this);
        }

        public StrColumnBuilder<PublRequestedBuilder> enterJournal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "journal", this);
        }
    }

    public static class PublSectionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_section";

        public PublSectionBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublSectionBuilder> enterAbstract() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abstract", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterAcknowledgements() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "acknowledgements", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterComment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "comment", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterDiscussion() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "discussion", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterExperimental() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "experimental", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterExptlPrep() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "exptl_prep", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterExptlRefinement() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "exptl_refinement", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterExptlSolution() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "exptl_solution", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterFigureCaptions() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "figure_captions", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterIntroduction() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "introduction", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterKeywords() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "keywords", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterReferences() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "references", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterRelatedLiterature() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "related_literature", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterSynopsis() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "synopsis", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterTableLegends() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "table_legends", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterTitle() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "title", this);
        }

        public StrColumnBuilder<PublSectionBuilder> enterTitleFootnote() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "title_footnote", this);
        }
    }

    public static class StructureBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "structure";

        public StructureBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class AtomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom";

        public AtomBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }
    }

    public static class AtomSiteBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site";

        public AtomSiteBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterAdpType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "adp_type", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterAttachedHydrogens() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "attached_hydrogens", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterBEquivGeomMean() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_equiv_geom_mean", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterBEquivGeomMeanSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_equiv_geom_mean_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterBIsoOrEquiv() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterBIsoOrEquivSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "B_iso_or_equiv_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterCalcAttachedAtom() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "calc_attached_atom", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterCalcFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "calc_flag", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterCartnXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterChemicalConnNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "chemical_conn_number", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterConstraints() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "constraints", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterDisorderAssembly() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "disorder_assembly", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterDisorderGroup() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "disorder_group", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterFractXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterOccupancy() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "occupancy", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterOccupancySu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "occupancy_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterRefinementFlags() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_flags", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterRefinementFlagsAdp() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_flags_adp", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterRefinementFlagsOccupancy() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_flags_occupancy", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterRefinementFlagsPosn() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_flags_posn", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterRestraints() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "restraints", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterSiteSymmetryMultiplicity() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_multiplicity", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterSiteSymmetryOrder() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_order", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterTensorBeta() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "tensor_beta", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterUEquivGeomMean() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "U_equiv_geom_mean", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterUEquivGeomMeanSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "U_equiv_geom_mean_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterUIsoOrEquiv() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "U_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterUIsoOrEquivSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "U_iso_or_equiv_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterWyckoffSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Wyckoff_symbol", this);
        }
    }

    public static class AtomSiteAnisoBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site_aniso";

        public AtomSiteAnisoBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterMatrixB() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix_B", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterMatrixU() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix_U", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterRatio() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ratio", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }
    }

    public static class AtomSitesBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites";

        public AtomSitesBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSitesBuilder> enterSolutionHydrogens() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "solution_hydrogens", this);
        }

        public StrColumnBuilder<AtomSitesBuilder> enterSolutionPrimary() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "solution_primary", this);
        }

        public StrColumnBuilder<AtomSitesBuilder> enterSolutionSecondary() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "solution_secondary", this);
        }

        public StrColumnBuilder<AtomSitesBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }
    }

    public static class AtomSitesCartnTransformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites_cartn_transform";

        public AtomSitesCartnTransformBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSitesCartnTransformBuilder> enterAxes() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "axes", this);
        }

        public StrColumnBuilder<AtomSitesCartnTransformBuilder> enterMatrix() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix", this);
        }

        public StrColumnBuilder<AtomSitesCartnTransformBuilder> enterVector() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "vector", this);
        }
    }

    public static class AtomSitesFractTransformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites_fract_transform";

        public AtomSitesFractTransformBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSitesFractTransformBuilder> enterAxes() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "axes", this);
        }

        public StrColumnBuilder<AtomSitesFractTransformBuilder> enterMatrix() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix", this);
        }

        public StrColumnBuilder<AtomSitesFractTransformBuilder> enterVector() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "vector", this);
        }
    }

    public static class AtomTypeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_type";

        public AtomTypeBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterAnalyticalMassPercent() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "analytical_mass_percent", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterAtomicMass() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterAtomicNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atomic_number", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterDisplayColour() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_colour", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterElectronCount() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "electron_count", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterElementSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "element_symbol", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "key", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterNumberInCell() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_in_cell", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterOxidationNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "oxidation_number", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterRadiusBond() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radius_bond", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterRadiusContact() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radius_contact", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symbol", this);
        }
    }

    public static class AtomTypeScatBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_type_scat";

        public AtomTypeScatBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterCromerMannCoeffs() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_coeffs", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersion() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionImag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_imag", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionImagCu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_imag_cu", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionImagMo() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_imag_mo", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionReal() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_real", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionRealCu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_real_cu", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionRealMo() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_real_mo", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionSource() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_source", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxCoeffs() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_coeffs", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterLengthNeutron() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "length_neutron", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterSource() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "source", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symbol", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterVersusStolList() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "versus_stol_list", this);
        }
    }

    public static class RefineBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine";

        public RefineBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }
    }

    public static class RefineDiffBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_diff";

        public RefineDiffBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_max", this);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityMaxSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_max_su", this);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityMin() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_min", this);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityMinSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_min_su", this);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityRms() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_rms", this);
        }

        public StrColumnBuilder<RefineDiffBuilder> enterDensityRmsSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_rms_su", this);
        }
    }

    public static class RefineLsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_ls";

        public RefineLsBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineLsBuilder> enterAbsStructureDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abs_structure_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterAbsStructureFlack() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abs_structure_Flack", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterAbsStructureFlackSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abs_structure_Flack_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterAbsStructureRogers() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abs_structure_Rogers", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterAbsStructureRogersSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "abs_structure_Rogers_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterDResHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterDResLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterExtinctionCoef() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "extinction_coef", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterExtinctionCoefSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "extinction_coef_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterExtinctionExpression() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "extinction_expression", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterExtinctionMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "extinction_method", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterFCalcDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_calc_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterFCalcFormula() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_calc_formula", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterFCalcPrecision() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_calc_precision", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterGoodnessOfFitAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_all", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterGoodnessOfFitAllSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_all_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterGoodnessOfFitGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_gt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterGoodnessOfFitGtSu() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_gt_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterGoodnessOfFitRef() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_ref", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterHydrogenTreatment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hydrogen_treatment", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterMatrixType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix_type", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterNumberConstraints() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_constraints", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterNumberParameters() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_parameters", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterNumberReflns() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_reflns", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterNumberReflnsGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_reflns_gt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterNumberRestraints() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "number_restraints", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRFactorGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRFsqdFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRIFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRestrainedSAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "restrained_S_all", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterRestrainedSGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "restrained_S_gt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterShiftOverSuMax() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "shift_over_su_max", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterShiftOverSuMaxLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "shift_over_su_max_lt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterShiftOverSuMean() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "shift_over_su_mean", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterShiftOverSuMeanLt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "shift_over_su_mean_lt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterStructureFactorCoef() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "structure_factor_coef", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterWeightingDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "weighting_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterWeightingScheme() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "weighting_scheme", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterWRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterWRFactorGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wR_factor_gt", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterWRFactorRef() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wR_factor_ref", this);
        }
    }

    public static class RefineLsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_ls_class";

        public RefineLsClassBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterDResHigh() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterDResLow() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterRFactorGt() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterRFsqdFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterRIFactor() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public StrColumnBuilder<RefineLsClassBuilder> enterWRFactorAll() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
        }
    }

    public static class SymmetryBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "symmetry";

        public SymmetryBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SymmetryBuilder> enterCellSetting() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "cell_setting", this);
        }
    }
}