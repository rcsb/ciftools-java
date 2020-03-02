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

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientPressure() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_pressure", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientPressureGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_gt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientPressureLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_lt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientPressureSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_pressure_su", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientTemperature() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_temperature", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterAmbientTemperatureDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_details", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientTemperatureGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_gt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientTemperatureLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_lt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterAmbientTemperatureSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ambient_temperature_su", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterCrystalSupport() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystal_support", this);
        }

        public StrColumnBuilder<DiffrnBuilder> enterCrystalTreatment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "crystal_treatment", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterMeasuredFractionThetaFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "measured_fraction_theta_full", this);
        }

        public FloatColumnBuilder<DiffrnBuilder> enterMeasuredFractionThetaMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "measured_fraction_theta_max", this);
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

        public FloatColumnBuilder<DiffrnAttenuatorBuilder> enterScale() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "scale", this);
        }
    }

    public static class DiffrnDetectorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_detector";

        public DiffrnDetectorBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnDetectorBuilder> enterAreaResolMean() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "area_resol_mean", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public FloatColumnBuilder<DiffrnDetectorBuilder> enterDtime() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dtime", this);
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

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_11", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_12", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_13", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB21() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_21", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_22", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_23", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB31() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_31", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB32() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_32", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUB33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UB_33", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder> enterUBIJ() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "UBIJ", this);
        }
    }

    public static class DiffrnOrientReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient_refln";

        public DiffrnOrientReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAngleChi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_chi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAngleKappa() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_kappa", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAngleOmega() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_omega", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAnglePhi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_phi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAnglePsi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_psi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder> enterAngleTheta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_theta", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
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

        public FloatColumnBuilder<DiffrnRadiationBuilder> enterFilterEdge() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "filter_edge", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder> enterInhomogeneity() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "inhomogeneity", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder> enterMonochromator() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "monochromator", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder> enterPolarisnNorm() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "polarisn_norm", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder> enterPolarisnRatio() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "polarisn_ratio", this);
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

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder> enterValue() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "value", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder> enterValueSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "value_su", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder> enterWt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wt", this);
        }
    }

    public static class DiffrnReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_refln";

        public DiffrnReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAngleChi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_chi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAngleKappa() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_kappa", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAngleOmega() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_omega", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAnglePhi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_phi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAnglePsi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_psi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterAngleTheta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_theta", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterAttenuatorCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "attenuator_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterClassCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "class_code", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterCountsBg1() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "counts_bg_1", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterCountsBg2() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "counts_bg_2", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterCountsNet() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "counts_net", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterCountsPeak() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "counts_peak", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterCountsTotal() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "counts_total", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterDetectSlitHoriz() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "detect_slit_horiz", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterDetectSlitVert() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "detect_slit_vert", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterElapsedTime() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "elapsed_time", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterIntensityNet() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "intensity_net", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterIntensityNetSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "intensity_net_su", this);
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

        public FloatColumnBuilder<DiffrnReflnBuilder> enterScanRate() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "scan_rate", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterScanTimeBackgd() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "scan_time_backgd", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterScanWidth() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "scan_width", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterSinThetaOverLambda() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder> enterStandardCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "standard_code", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder> enterWavelength() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
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

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterAvREquivalents() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "av_R_equivalents", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterAvSunetIOverNetI() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "av_sunetI_over_netI", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterLaueMeasuredFractionFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Laue_measured_fraction_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterLaueMeasuredFractionMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Laue_measured_fraction_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitHMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_h_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitHMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_h_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitKMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_k_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitKMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_k_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitLMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_l_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterLimitLMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_l_min", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterLimitMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "limit_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterLimitMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "limit_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder> enterNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterPointMeasuredFractionFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "point_measured_fraction_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterPointMeasuredFractionMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "point_measured_fraction_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder> enterReductionProcess() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "reduction_process", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterResolutionFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "resolution_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterResolutionMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "resolution_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterThetaFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterThetaMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder> enterThetaMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta_min", this);
        }
    }

    public static class DiffrnReflnsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_class";

        public DiffrnReflnsClassBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder> enterAvREq() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "av_R_eq", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder> enterAvSuIOverI() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "av_suI_over_I", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "code", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder> enterDResHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder> enterDResLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public IntColumnBuilder<DiffrnReflnsClassBuilder> enterNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number", this);
        }
    }

    public static class DiffrnReflnsTransfMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_transf_matrix";

        public DiffrnReflnsTransfMatrixBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "11", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "12", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "13", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_21() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "21", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "22", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "23", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_31() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "31", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_32() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "32", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enter_33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "33", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder> enterTIJ() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "TIJ", this);
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

        public FloatColumnBuilder<DiffrnScaleGroupBuilder> enterINet() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "I_net", this);
        }
    }

    public static class DiffrnSourceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_source";

        public DiffrnSourceBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder> enterCurrent() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "current", this);
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

        public FloatColumnBuilder<DiffrnSourceBuilder> enterPower() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "power", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterSize() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "size", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder> enterTakeOffAngle() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "take_off_angle", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder> enterTarget() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "target", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder> enterVoltage() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "voltage", this);
        }
    }

    public static class DiffrnStandardBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standard";

        public DiffrnStandardBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder> enterDecayPercent() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "decay_percent", this);
        }

        public IntColumnBuilder<DiffrnStandardBuilder> enterIntervalCount() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "interval_count", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder> enterIntervalTime() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "interval_time", this);
        }

        public IntColumnBuilder<DiffrnStandardBuilder> enterNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder> enterScaleSuAverage() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "scale_su_average", this);
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

        public IntColumnBuilder<DiffrnStandardReflnBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
        }
    }

    public static class ReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refln";

        public ReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ReflnBuilder> enterACalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "A_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterAMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "A_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterBCalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterBMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterClassCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "class_code", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterDSpacing() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_spacing", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFCalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterFComplex() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "F_complex", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFMeasSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFSquaredCalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_squared_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFSquaredMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_squared_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFSquaredMeasSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_squared_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFom() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fom", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterFormFactorTable() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "form_factor_table", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterIncludeStatus() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "include_status", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterIntensityCalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "intensity_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterIntensityMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "intensity_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterIntensityMeasSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "intensity_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterLpFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Lp_factor", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterMeanPathLengthTbar() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mean_path_length_tbar", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterPhaseCalc() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "phase_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterPhaseMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "phase_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterRefinementStatus() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "refinement_status", this);
        }

        public StrColumnBuilder<ReflnBuilder> enterScaleGroupCode() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "scale_group_code", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterSinThetaOverLambda() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterSymmetryEpsilon() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "symmetry_epsilon", this);
        }

        public IntColumnBuilder<ReflnBuilder> enterSymmetryMultiplicity() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "symmetry_multiplicity", this);
        }

        public FloatColumnBuilder<ReflnBuilder> enterWavelength() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
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

        public FloatColumnBuilder<ReflnsBuilder> enterDResolutionHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_resolution_high", this);
        }

        public FloatColumnBuilder<ReflnsBuilder> enterDResolutionLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_resolution_low", this);
        }

        public FloatColumnBuilder<ReflnsBuilder> enterFriedelCoverage() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Friedel_coverage", this);
        }

        public FloatColumnBuilder<ReflnsBuilder> enterFriedelFractionFull() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Friedel_fraction_full", this);
        }

        public FloatColumnBuilder<ReflnsBuilder> enterFriedelFractionMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Friedel_fraction_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitHMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_h_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitHMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_h_min", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitKMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_k_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitKMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_k_min", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitLMax() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_l_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterLimitLMin() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "limit_l_min", this);
        }

        public FloatColumnBuilder<ReflnsBuilder> enterLimitMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "limit_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterNumberGt() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_gt", this);
        }

        public IntColumnBuilder<ReflnsBuilder> enterNumberTotal() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_total", this);
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

        public FloatColumnBuilder<ReflnsClassBuilder> enterDResHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterDResLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public IntColumnBuilder<ReflnsClassBuilder> enterNumberGt() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_gt", this);
        }

        public IntColumnBuilder<ReflnsClassBuilder> enterNumberTotal() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_total", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterRFactorGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterRIFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder> enterWRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
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

        public FloatColumnBuilder<ReflnsScaleBuilder> enterMeasF() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "meas_F", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder> enterMeasFSquared() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "meas_F_squared", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder> enterMeasIntensity() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "meas_intensity", this);
        }
    }

    public static class ReflnsShellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_shell";

        public ReflnsShellBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterDResHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterDResLimits() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_limits", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterDResLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterMeanIOverSuIAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "meanI_over_suI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterMeanIOverSuIGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "meanI_over_suI_gt", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder> enterNumberMeasuredAll() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_measured_all", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder> enterNumberMeasuredGt() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_measured_gt", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder> enterNumberPossible() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_possible", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder> enterNumberUniqueAll() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_unique_all", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder> enterNumberUniqueGt() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_unique_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterPercentPossibleAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "percent_possible_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterPercentPossibleGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "percent_possible_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterRmergeFAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Rmerge_F_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterRmergeFGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Rmerge_F_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterRmergeIAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Rmerge_I_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder> enterRmergeIGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Rmerge_I_gt", this);
        }
    }

    public static class ExptlBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl";

        public ExptlBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ExptlBuilder> enterCrystalsNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "crystals_number", this);
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

        public FloatColumnBuilder<ExptlBuilder> enterTransmissionFactorMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "transmission_factor_max", this);
        }

        public FloatColumnBuilder<ExptlBuilder> enterTransmissionFactorMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "transmission_factor_min", this);
        }
    }

    public static class CellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell";

        public CellBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<CellBuilder> enterAtomicMass() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public IntColumnBuilder<CellBuilder> enterFormulaUnitsZ() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "formula_units_Z", this);
        }

        public FloatColumnBuilder<CellBuilder> enterMetricTensor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder> enterOrthogonalMatrix() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "orthogonal_matrix", this);
        }

        public StrColumnBuilder<CellBuilder> enterSpecialDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<CellBuilder> enterVolume() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "volume", this);
        }

        public FloatColumnBuilder<CellBuilder> enterVolumeSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "volume_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleAlpha() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_alpha", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleAlphaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_alpha_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleBeta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_beta", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleBetaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_beta_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleGamma() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_gamma", this);
        }

        public FloatColumnBuilder<CellBuilder> enterAngleGammaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_gamma_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_a", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthASu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_b", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthBSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthC() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_c", this);
        }

        public FloatColumnBuilder<CellBuilder> enterLengthCSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_c_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterConvertUijToBetaij() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "convert_Uij_to_betaij", this);
        }

        public FloatColumnBuilder<CellBuilder> enterConvertUisoToUij() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "convert_Uiso_to_Uij", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalMetricTensor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalOrthogonalMatrix() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_orthogonal_matrix", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleAlpha() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_alpha", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleAlphaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_alpha_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleBeta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_beta", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleBetaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_beta_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleGamma() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_gamma", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalAngleGammaSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_angle_gamma_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_a", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthASu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_b", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthBSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthC() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_c", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalLengthCSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_length_c_su", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalVectorA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalVectorB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder> enterReciprocalVectorC() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "reciprocal_vector_c", this);
        }

        public FloatColumnBuilder<CellBuilder> enterVectorA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder> enterVectorB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder> enterVectorC() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vector_c", this);
        }
    }

    public static class CellMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement";

        public CellMeasurementBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterPressure() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "pressure", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterPressureSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "pressure_su", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder> enterRadiation() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "radiation", this);
        }

        public IntColumnBuilder<CellMeasurementBuilder> enterReflnsUsed() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "reflns_used", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterTemperature() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterTemperatureSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_su", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterThetaMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta_max", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterThetaMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta_min", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder> enterWavelength() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wavelength", this);
        }
    }

    public static class CellMeasurementReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement_refln";

        public CellMeasurementReflnBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<CellMeasurementReflnBuilder> enterTheta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "theta", this);
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

        public FloatColumnBuilder<ChemicalBuilder> enterEnantioexcessBulk() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "enantioexcess_bulk", this);
        }

        public StrColumnBuilder<ChemicalBuilder> enterEnantioexcessBulkTechnique() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "enantioexcess_bulk_technique", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterEnantioexcessCrystal() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "enantioexcess_crystal", this);
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

        public FloatColumnBuilder<ChemicalBuilder> enterMeltingPoint() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "melting_point", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterMeltingPointGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "melting_point_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterMeltingPointLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "melting_point_lt", this);
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

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureDecomposition() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_lt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureDecompositionSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_decomposition_su", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureSublimation() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureSublimationGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureSublimationLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_lt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder> enterTemperatureSublimationSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "temperature_sublimation_su", this);
        }
    }

    public static class ChemicalConnAtomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_conn_atom";

        public ChemicalConnAtomBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder> enterCharge() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "charge", this);
        }

        public FloatColumnBuilder<ChemicalConnAtomBuilder> enterDisplayX() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "display_x", this);
        }

        public FloatColumnBuilder<ChemicalConnAtomBuilder> enterDisplayY() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "display_y", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder> enterNCA() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "NCA", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder> enterNH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "NH", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder> enterNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number", this);
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

        public IntColumnBuilder<ChemicalConnBondBuilder> enterAtom1() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "atom_1", this);
        }

        public IntColumnBuilder<ChemicalConnBondBuilder> enterAtom2() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "atom_2", this);
        }

        public FloatColumnBuilder<ChemicalConnBondBuilder> enterDistance() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance", this);
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

        public FloatColumnBuilder<ChemicalFormulaBuilder> enterWeight() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "weight", this);
        }

        public FloatColumnBuilder<ChemicalFormulaBuilder> enterWeightMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "weight_meas", this);
        }
    }

    public static class ExptlAbsorptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_absorpt";

        public ExptlAbsorptBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder> enterCoefficientMu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "coefficient_mu", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder> enterCorrectionTMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "correction_T_max", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder> enterCorrectionTMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "correction_T_min", this);
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

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityDiffrn() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_diffrn", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeas() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_gt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_lt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTemp() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_temp", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_gt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_lt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterDensityMeasTempSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_meas_temp_su", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDensityMethod() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "density_method", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterF000() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_000", this);
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

        public FloatColumnBuilder<ExptlCrystalBuilder> enterSizeLength() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "size_length", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterSizeMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "size_max", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterSizeMid() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "size_mid", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterSizeMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "size_min", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder> enterSizeRad() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "size_rad", this);
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

        public FloatColumnBuilder<ExptlCrystalFaceBuilder> enterDiffrChi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "diffr_chi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder> enterDiffrKappa() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "diffr_kappa", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder> enterDiffrPhi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "diffr_phi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder> enterDiffrPsi() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "diffr_psi", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder> enterHkl() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder> enterIndexH() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder> enterIndexK() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder> enterIndexL() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder> enterPerpDist() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "perp_dist", this);
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

        public IntColumnBuilder<SpaceGroupBuilder> enterITNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "IT_number", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder> enterLaueClass() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "Laue_class", this);
        }

        public IntColumnBuilder<SpaceGroupBuilder> enterMultiplicity() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
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

        public IntColumnBuilder<SpaceGroupSymopBuilder> enterId() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterOperationXyz() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "operation_xyz", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder> enterOperationDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "operation_description", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder> enterR() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder> enterRT() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "RT", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder> enterSeitzMatrix() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Seitz_matrix", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder> enterT() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "T", this);
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

        public IntColumnBuilder<SpaceGroupWyckoffBuilder> enterMultiplicity() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
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

        public FloatColumnBuilder<FunctionBuilder> enterClosest() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Closest", this);
        }

        public FloatColumnBuilder<FunctionBuilder> enterSeitzFromJones() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "SeitzFromJones", this);
        }

        public FloatColumnBuilder<FunctionBuilder> enterSymEquiv() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "SymEquiv", this);
        }

        public IntColumnBuilder<FunctionBuilder> enterSymKey() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "SymKey", this);
        }

        public IntColumnBuilder<FunctionBuilder> enterSymLat() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "SymLat", this);
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

        public FloatColumnBuilder<GeomBuilder> enterBondDistanceIncr() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "bond_distance_incr", this);
        }

        public FloatColumnBuilder<GeomBuilder> enterBondDistanceMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "bond_distance_min", this);
        }

        public FloatColumnBuilder<GeomBuilder> enterContactDistanceIncr() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "contact_distance_incr", this);
        }

        public FloatColumnBuilder<GeomBuilder> enterContactDistanceMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "contact_distance_min", this);
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

        public StrColumnBuilder<GeomAngleBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterAtomSiteLabel3() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_3", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder> enterDistances() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder> enterSiteSymmetry3() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_3", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder> enterValue() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "value", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder> enterValueSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "value_su", this);
        }
    }

    public static class GeomBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_bond";

        public GeomBondBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomBondBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public FloatColumnBuilder<GeomBondBuilder> enterDistance() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance", this);
        }

        public FloatColumnBuilder<GeomBondBuilder> enterDistanceSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_su", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public IntColumnBuilder<GeomBondBuilder> enterMultiplicity() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomBondBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public FloatColumnBuilder<GeomBondBuilder> enterValence() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "valence", this);
        }
    }

    public static class GeomContactBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_contact";

        public GeomContactBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomContactBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public FloatColumnBuilder<GeomContactBuilder> enterDistance() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance", this);
        }

        public FloatColumnBuilder<GeomContactBuilder> enterDistanceSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_su", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomContactBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_2", this);
        }
    }

    public static class GeomHbondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_hbond";

        public GeomHbondBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterAngleDHA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_DHA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterAngleDHASu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_DHA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterAtomSiteLabelA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterAtomSiteLabelD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterAtomSiteLabelH() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_H", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceDA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_DA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceDASu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_DA_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceDH() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_DH", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceDHSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_DH_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceHA() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_HA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder> enterDistanceHASu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distance_HA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterSiteSymmetryA() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterSiteSymmetryD() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder> enterSiteSymmetryH() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_H", this);
        }
    }

    public static class GeomTorsionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_torsion";

        public GeomTorsionBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomTorsionBuilder> enterAngle() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder> enterAngleSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "angle_su", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAtomSiteLabel3() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_3", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterAtomSiteLabel4() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_site_label_4", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder> enterDistances() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterPublFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterSiteSymmetry3() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_3", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder> enterSiteSymmetry4() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "site_symmetry_4", this);
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

        public FloatColumnBuilder<ModelSiteBuilder> enterAdpMatrixBeta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "adp_matrix_beta", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder> enterCartnXyz() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterDisplayColour() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_colour", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder> enterFractXyz() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public IntColumnBuilder<ModelSiteBuilder> enterIndex() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "index", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public IntColumnBuilder<ModelSiteBuilder> enterMoleIndex() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "mole_index", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder> enterRadiusBond() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "radius_bond", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder> enterRadiusContact() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "radius_contact", this);
        }

        public StrColumnBuilder<ModelSiteBuilder> enterSymop() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "symop", this);
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

        public FloatColumnBuilder<ValenceParamBuilder> enterAtom1Valence() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "atom_1_valence", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterAtom2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "atom_2", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder> enterAtom2Valence() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "atom_2_valence", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder> enterB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterDetails() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "details", this);
        }

        public IntColumnBuilder<ValenceParamBuilder> enterId() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ValenceParamBuilder> enterRefId() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "ref_id", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder> enterRo() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Ro", this);
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

        public IntColumnBuilder<CitationBuilder> enterJournalIssue() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "journal_issue", this);
        }

        public IntColumnBuilder<CitationBuilder> enterJournalVolume() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "journal_volume", this);
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

        public IntColumnBuilder<CitationAuthorBuilder> enterOrdinal() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "ordinal", this);
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

        public IntColumnBuilder<CitationEditorBuilder> enterOrdinal() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "ordinal", this);
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

        public IntColumnBuilder<DisplayColourBuilder> enterBlue() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "blue", this);
        }

        public IntColumnBuilder<DisplayColourBuilder> enterGreen() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "green", this);
        }

        public StrColumnBuilder<DisplayColourBuilder> enterHue() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hue", this);
        }

        public IntColumnBuilder<DisplayColourBuilder> enterRed() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "red", this);
        }

        public IntColumnBuilder<DisplayColourBuilder> enterRGB() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "RGB", this);
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

        public IntColumnBuilder<JournalBuilder> enterSupplPublPages() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "suppl_publ_pages", this);
        }

        public StrColumnBuilder<JournalBuilder> enterValidationNumber() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "validation_number", this);
        }

        public IntColumnBuilder<JournalBuilder> enterVolume() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "volume", this);
        }

        public IntColumnBuilder<JournalBuilder> enterYear() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "year", this);
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

        public IntColumnBuilder<JournalIndexBuilder> enterId() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "id", this);
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

        public IntColumnBuilder<AtomSiteBuilder> enterAttachedHydrogens() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "attached_hydrogens", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterBEquivGeomMean() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterBEquivGeomMeanSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterBIsoOrEquiv() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_iso_or_equiv", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterBIsoOrEquivSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_iso_or_equiv_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterCalcAttachedAtom() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "calc_attached_atom", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterCalcFlag() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "calc_flag", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnX() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnXSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_x_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnXyz() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnY() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_y", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnYSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_y_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnZ() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_z", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterCartnZSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cartn_z_su", this);
        }

        public IntColumnBuilder<AtomSiteBuilder> enterChemicalConnNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "chemical_conn_number", this);
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

        public FloatColumnBuilder<AtomSiteBuilder> enterFractX() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractXSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_x_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractXyz() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractY() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_y", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractYSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_y_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractZ() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_z", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterFractZSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "fract_z_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent0() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_0", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent1() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_1", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent2() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_2", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent3() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_3", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent4() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_4", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent5() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_5", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterLabelComponent6() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label_component_6", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterOccupancy() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "occupancy", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterOccupancySu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "occupancy_su", this);
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

        public IntColumnBuilder<AtomSiteBuilder> enterSiteSymmetryMultiplicity() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "site_symmetry_multiplicity", this);
        }

        public IntColumnBuilder<AtomSiteBuilder> enterSiteSymmetryOrder() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "site_symmetry_order", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterTensorBeta() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "tensor_beta", this);
        }

        public StrColumnBuilder<AtomSiteBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterUEquivGeomMean() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterUEquivGeomMeanSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterUIsoOrEquiv() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_iso_or_equiv", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder> enterUIsoOrEquivSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_iso_or_equiv_su", this);
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

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_11", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB11Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_12", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB12Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_13", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB13Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_22", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB22Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_23", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB23Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_33", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterB33Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "B_33_su", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterLabel() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "label", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterMatrixB() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "matrix_B", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterMatrixU() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "matrix_U", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterRatio() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "ratio", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder> enterTypeSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_11", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU11Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_12", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU12Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_13", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU13Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_22", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU22Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_23", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU23Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_33", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder> enterU33Su() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "U_33_su", this);
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

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_11", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_12", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_13", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat21() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_21", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_22", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_23", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat31() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_31", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat32() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_32", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMat33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_33", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterMatrix() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterVec1() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterVec2() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterVec3() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_3", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder> enterVector() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vector", this);
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

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat11() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_11", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat12() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_12", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat13() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_13", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat21() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_21", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat22() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_22", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat23() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_23", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat31() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_31", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat32() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_32", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMat33() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "mat_33", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterMatrix() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterVec1() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterVec2() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterVec3() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vec_3", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder> enterVector() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "vector", this);
        }
    }

    public static class AtomTypeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_type";

        public AtomTypeBuilder(BlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomTypeBuilder> enterAnalyticalMassPercent() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "analytical_mass_percent", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder> enterAtomicMass() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public IntColumnBuilder<AtomTypeBuilder> enterAtomicNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "atomic_number", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterDescription() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterDisplayColour() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "display_colour", this);
        }

        public IntColumnBuilder<AtomTypeBuilder> enterElectronCount() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "electron_count", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterElementSymbol() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "element_symbol", this);
        }

        public StrColumnBuilder<AtomTypeBuilder> enterKey() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "key", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder> enterNumberInCell() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "number_in_cell", this);
        }

        public IntColumnBuilder<AtomTypeBuilder> enterOxidationNumber() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "oxidation_number", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder> enterRadiusBond() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "radius_bond", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder> enterRadiusContact() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "radius_contact", this);
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

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannA1() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannA2() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannA3() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannA4() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannB1() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannB2() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannB3() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannB4() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannC() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_c", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterCromerMannCoeffs() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "Cromer_Mann_coeffs", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersion() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionImag() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_imag", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionImagCu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_imag_cu", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionImagMo() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_imag_mo", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionReal() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_real", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionRealCu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_real_cu", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterDispersionRealMo() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "dispersion_real_mo", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder> enterDispersionSource() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "dispersion_source", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxC0() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_c0", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxC1() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_c1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxC2() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_c2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxC3() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_c3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterHiAngFoxCoeffs() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "hi_ang_Fox_coeffs", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder> enterLengthNeutron() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "length_neutron", this);
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

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_max", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityMaxSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_max_su", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityMin() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_min", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityMinSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_min_su", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityRms() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_rms", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder> enterDensityRmsSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "density_rms_su", this);
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

        public FloatColumnBuilder<RefineLsBuilder> enterAbsStructureFlack() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "abs_structure_Flack", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterAbsStructureFlackSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "abs_structure_Flack_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterAbsStructureRogers() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "abs_structure_Rogers", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterAbsStructureRogersSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "abs_structure_Rogers_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterDResHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterDResLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterExtinctionCoef() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "extinction_coef", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterExtinctionCoefSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "extinction_coef_su", this);
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

        public FloatColumnBuilder<RefineLsBuilder> enterFCalcPrecision() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "F_calc_precision", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterGoodnessOfFitAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterGoodnessOfFitAllSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_all_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterGoodnessOfFitGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterGoodnessOfFitGtSu() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_gt_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterGoodnessOfFitRef() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "goodness_of_fit_ref", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterHydrogenTreatment() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "hydrogen_treatment", this);
        }

        public StrColumnBuilder<RefineLsBuilder> enterMatrixType() {
            return new StrColumnBuilder<>(CATEGORY_NAME, "matrix_type", this);
        }

        public IntColumnBuilder<RefineLsBuilder> enterNumberConstraints() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_constraints", this);
        }

        public IntColumnBuilder<RefineLsBuilder> enterNumberParameters() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_parameters", this);
        }

        public IntColumnBuilder<RefineLsBuilder> enterNumberReflns() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_reflns", this);
        }

        public IntColumnBuilder<RefineLsBuilder> enterNumberReflnsGt() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_reflns_gt", this);
        }

        public IntColumnBuilder<RefineLsBuilder> enterNumberRestraints() {
            return new IntColumnBuilder<>(CATEGORY_NAME, "number_restraints", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRFactorGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRIFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRestrainedSAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "restrained_S_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterRestrainedSGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "restrained_S_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterShiftOverSuMax() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "shift_over_su_max", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterShiftOverSuMaxLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "shift_over_su_max_lt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterShiftOverSuMean() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "shift_over_su_mean", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterShiftOverSuMeanLt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "shift_over_su_mean_lt", this);
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

        public FloatColumnBuilder<RefineLsBuilder> enterWRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterWRFactorGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wR_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder> enterWRFactorRef() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wR_factor_ref", this);
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

        public FloatColumnBuilder<RefineLsClassBuilder> enterDResHigh() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterDResLow() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterRFactorGt() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterRIFactor() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder> enterWRFactorAll() {
            return new FloatColumnBuilder<>(CATEGORY_NAME, "wR_factor_all", this);
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