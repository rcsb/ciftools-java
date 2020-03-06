package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.IntColumnBuilder;
import org.rcsb.cif.model.StrColumnBuilder;
import org.rcsb.cif.model.builder.CategoryBuilderImpl;
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;
import org.rcsb.cif.model.builder.IntColumnBuilderImpl;
import org.rcsb.cif.model.builder.StrColumnBuilderImpl;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CifCoreCategoryBuilder extends CategoryBuilderImpl<CifCoreBlockBuilder, CifCoreFileBuilder> {
    public CifCoreCategoryBuilder(String blockName, CifCoreBlockBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public void digest(IntColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

    @Override
    public void digest(FloatColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

    @Override
    public void digest(StrColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> columnBuilder) {
        parent.digest(columnBuilder);
    }

    public static class CifCoreBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cif_core";

        public CifCoreBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class DiffractionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffraction";

        public DiffractionBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class DiffrnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn";

        public DiffrnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientEnvironment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ambient_environment", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientPressure() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_pressure", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientPressureGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_pressure_gt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientPressureLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_pressure_lt", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalSupport() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_support", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalTreatment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_treatment", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasuredFractionThetaFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "measured_fraction_theta_full", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasuredFractionThetaMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "measured_fraction_theta_max", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymmetryDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symmetry_description", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientPressureEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_pressure_esd", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientPressureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_pressure_su", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemp() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperature() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTempDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperatureDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature_details", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTempGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp_gt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperatureGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature_gt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTempLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp_lt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperatureLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature_lt", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTempEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp_esd", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperatureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature_su", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementDeviceClass() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_device_class", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDevice() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceClass() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_class", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementDeviceDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_device_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_details", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementDeviceMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_device_make", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_type", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_make", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_method", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "method", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasurementSpecimenSupport() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "measurement_specimen_support", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecimenSupport() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "specimen_support", this);
        }

    }

    public static class DiffrnAttenuatorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_attenuator";

        public DiffrnAttenuatorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnAttenuatorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<DiffrnAttenuatorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMaterial() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "material", this);
        }

        public FloatColumnBuilder<DiffrnAttenuatorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScale() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale", this);
        }

    }

    public static class DiffrnDetectorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_detector";

        public DiffrnDetectorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAreaResolMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "area_resol_mean", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetector() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "detector", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public FloatColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDtime() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dtime", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

        public StrColumnBuilder<DiffrnDetectorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "make", this);
        }

    }

    public static class DiffrnMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_measurement";

        public DiffrnMeasurementBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDevice() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceClass() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_class", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_details", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_type", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDeviceMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device_make", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "method", this);
        }

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecimenSupport() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "specimen_support", this);
        }

    }

    public static class DiffrnOrientBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient";

        public DiffrnOrientBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class DiffrnOrientMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient_matrix";

        public DiffrnOrientMatrixBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUBIJ() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UBIJ", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][3]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][3]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][3]", this);
        }

    }

    public static class DiffrnOrientReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_orient_refln";

        public DiffrnOrientReflnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleChi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_chi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleKappa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_kappa", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleOmega() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_omega", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePhi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_phi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePsi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_psi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleTheta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_theta", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

    }

    public static class DiffrnRadiationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_radiation";

        public DiffrnRadiationBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCollimation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "collimation", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFilterEdge() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "filter_edge", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInhomogeneity() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "inhomogeneity", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMonochromator() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "monochromator", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPolarisnNorm() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "polarisn_norm", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPolarisnRatio() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "polarisn_ratio", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProbe() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "probe", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterXraySymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "xray_symbol", this);
        }

        public FloatColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetectorDtime() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "detector_dtime", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_details", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthDetermination() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_determination", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetermination() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "determination", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_id", this);
        }

        public StrColumnBuilder<DiffrnRadiationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

    }

    public static class DiffrnRadiationWavelengthBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_radiation_wavelength";

        public DiffrnRadiationWavelengthBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wt", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetermination() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "determination", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelength() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wavelength", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValue() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_su", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value_su", this);
        }

    }

    public static class DiffrnReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_refln";

        public DiffrnReflnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleChi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_chi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleKappa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_kappa", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleOmega() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_omega", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePhi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_phi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePsi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_psi", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleTheta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_theta", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAttenuatorCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "attenuator_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterClassCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "class_code", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsBg1() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "counts_bg_1", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsBg2() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "counts_bg_2", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsNet() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "counts_net", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsPeak() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "counts_peak", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsTotal() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "counts_total", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetectSlitHoriz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "detect_slit_horiz", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetectSlitVert() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "detect_slit_vert", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterElapsedTime() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "elapsed_time", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityNet() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_net", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleGroupCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scale_group_code", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScanMode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scan_mode", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScanModeBackgd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scan_mode_backgd", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScanRate() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scan_rate", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScanTimeBackgd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scan_time_backgd", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScanWidth() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scan_width", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStandardCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "standard_code", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelength() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wavelength", this);
        }

        public StrColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_id", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensitySigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_sigma", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_u", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityNetSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_net_su", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSintOverLambda() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "sint_over_lambda", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSinThetaOverLambda() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

    }

    public static class DiffrnReflnsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns";

        public DiffrnReflnsBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvREquivalents() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_R_equivalents", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueMeasuredFractionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Laue_measured_fraction_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueMeasuredFractionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Laue_measured_fraction_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitHMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_h_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitHMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_h_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitKMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_k_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitKMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_k_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitLMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_l_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitLMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_l_min", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "limit_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "limit_min", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPointMeasuredFractionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "point_measured_fraction_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPointMeasuredFractionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "point_measured_fraction_max", this);
        }

        public StrColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReductionProcess() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "reduction_process", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterResolutionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "resolution_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterResolutionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "resolution_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_max", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_min", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvUnetI_netI() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_unetI/netI", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSigmaIOverNetI() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_sigmaI_over_netI", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSunetIOverNetI() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_sunetI_over_netI", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[1][1]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "11", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[1][2]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "12", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[1][3]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "13", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[2][1]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "21", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[2][2]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "22", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[2][3]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "23", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[3][1]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "31", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[3][2]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "32", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransfMatrix33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transf_matrix[3][3]", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "33", this);
        }

    }

    public static class DiffrnReflnsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_class";

        public DiffrnReflnsClassBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvREq() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_R_eq", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public IntColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvUI_I() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_uI/I", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSgI_I() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_sgI/I", this);
        }

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSuIOverI() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_suI_over_I", this);
        }

    }

    public static class DiffrnReflnsTransfMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_transf_matrix";

        public DiffrnReflnsTransfMatrixBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTIJ() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "TIJ", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "11", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "12", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "13", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "21", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "22", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "23", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "31", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "32", this);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enter_33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "33", this);
        }

    }

    public static class DiffrnScaleGroupBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_scale_group";

        public DiffrnScaleGroupBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnScaleGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public FloatColumnBuilder<DiffrnScaleGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterINet() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "I_net", this);
        }

    }

    public static class DiffrnSourceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_source";

        public DiffrnSourceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCurrent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "current", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDevice() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "device", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPower() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "power", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSize() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "size", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTarget() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "target", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVoltage() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "voltage", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "source", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "make", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTake_offAngle() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "take-off_angle", this);
        }

        public FloatColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTakeOffAngle() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "take_off_angle", this);
        }

    }

    public static class DiffrnStandardBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standard";

        public DiffrnStandardBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecay() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_%", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecayPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_percent", this);
        }

        public IntColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntervalCount() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "interval_count", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntervalTime() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "interval_time", this);
        }

        public IntColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_sigma", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_u", this);
        }

        public FloatColumnBuilder<DiffrnStandardBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSuAverage() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_su_average", this);
        }

    }

    public static class DiffrnStandardReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standard_refln";

        public DiffrnStandardReflnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

        public StrColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrnId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "diffrn_id", this);
        }

        public StrColumnBuilder<DiffrnStandardReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

    }

    public static class ReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refln";

        public ReflnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterACalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "A_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "A_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterClassCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "class_code", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDSpacing() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_spacing", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_calc", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFComplex() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "F_complex", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_squared_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_squared_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFom() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fom", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFormFactorTable() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "form_factor_table", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLpFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Lp_factor", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanPathLengthTbar() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mean_path_length_tbar", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_meas", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefinementStatus() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "refinement_status", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleGroupCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scale_group_code", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymmetryEpsilon() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "symmetry_epsilon", this);
        }

        public IntColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymmetryMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "symmetry_multiplicity", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelength() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wavelength", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelengthId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wavelength_id", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFMeasSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_meas_sigma", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_squared_sigma", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_squared_meas_su", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterObservedStatus() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "observed_status", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStatus() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "status", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIncludeStatus() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "include_status", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensitySigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_sigma", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSintOverLambda() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "sint_over_lambda", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSinThetaOverLambda() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "sin_theta_over_lambda", this);
        }

    }

    public static class ReflnsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns";

        public ReflnsBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterApplyDispersionToFcalc() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "apply_dispersion_to_Fcalc", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResolutionHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_resolution_high", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResolutionLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_resolution_low", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelCoverage() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Friedel_coverage", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelFractionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Friedel_fraction_full", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelFractionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Friedel_fraction_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitHMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_h_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitHMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_h_min", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitKMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_k_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitKMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_k_min", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitLMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_l_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitLMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_l_min", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "limit_max", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberObs() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_obs", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_gt", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberAll() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_all", this);
        }

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberTotal() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_total", this);
        }

        public StrColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterObservedCriterion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "observed_criterion", this);
        }

        public StrColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThresholdExpression() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "threshold_expression", this);
        }

    }

    public static class ReflnsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_class";

        public ReflnsClassBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public StrColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public IntColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_gt", this);
        }

        public IntColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberTotal() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_total", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_all", this);
        }

    }

    public static class ReflnsScaleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_scale";

        public ReflnsScaleBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGroupCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "group_code", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasF() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_F", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasFSquared() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_F_squared", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasIntensity() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_intensity", this);
        }

    }

    public static class ReflnsShellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "reflns_shell";

        public ReflnsShellBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLimits() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_limits", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberMeasuredAll() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_measured_all", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberUniqueAll() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_unique_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPercentPossibleAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "percent_possible_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeFAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_F_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_I_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSigIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_sigI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverUIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_uI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSuIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_suI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSigIObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_sigI_obs", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSigIGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_sigI_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverUIGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_uI_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSuIGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_suI_gt", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberMeasuredObs() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_measured_obs", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberMeasuredGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_measured_gt", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberPossibleAll() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_possible_all", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberPossible() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_possible", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberUniqueObs() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_unique_obs", this);
        }

        public IntColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberUniqueGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_unique_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPercentPossibleObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "percent_possible_obs", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPercentPossibleGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "percent_possible_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeFObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_F_obs", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeFGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_F_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_I_obs", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_I_gt", this);
        }

    }

    public static class ExptlBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl";

        public ExptlBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalsNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "crystals_number", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "method", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMethodDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "method_details", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransmissionFactorMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transmission_factor_max", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransmissionFactorMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transmission_factor_min", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptCoefficientMu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_coefficient_mu", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoefficientMu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "coefficient_mu", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptCorrectionTMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_correction_T_max", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_T_max", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_correction_T_min", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_T_min", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptCorrectionType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_correction_type", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "correction_type", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptProcessDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_process_details", this);
        }

        public StrColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProcessDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "process_details", this);
        }

    }

    public static class CellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell";

        public CellBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomicMass() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public IntColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFormulaUnitsZ() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "formula_units_Z", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMetricTensor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOrthogonalMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "orthogonal_matrix", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVolume() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "volume", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleAlpha() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_alpha", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_beta", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleGamma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_gamma", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_c", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUijToBetaij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_Uij_to_betaij", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUisoToUij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_Uiso_to_Uij", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalMetricTensor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalOrthogonalMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_orthogonal_matrix", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleAlpha() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_alpha", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_beta", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleGamma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_gamma", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_c", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_c", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_c", this);
        }

        public StrColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVolumeEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "volume_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVolumeSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "volume_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleAlphaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_alpha_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleAlphaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_alpha_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleBetaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_beta_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_beta_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGammaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gamma_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleGammaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_gamma_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleGammaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_gamma_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_a_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthBEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_b_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthBSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthCEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_c_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthCSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_c_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleAlphaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_alpha_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleAlphaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_alpha_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleBetaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_beta_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_beta_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleGammaEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_gamma_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalAngleGammaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_angle_gamma_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_a_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthBEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_b_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthBSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthCEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_c_esd", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalLengthCSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_length_c_su", this);
        }

    }

    public static class CellMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement";

        public CellMeasurementBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPressure() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "pressure", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRadiation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "radiation", this);
        }

        public IntColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReflnsUsed() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "reflns_used", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_max", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_min", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWavelength() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wavelength", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPressureEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "pressure_esd", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPressureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "pressure_su", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemp() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temp", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperature() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTempEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temp_esd", this);
        }

        public FloatColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_su", this);
        }

    }

    public static class CellMeasurementReflnBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement_refln";

        public CellMeasurementReflnBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTheta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta", this);
        }

    }

    public static class ChemicalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical";

        public ChemicalBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsoluteConfiguration() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "absolute_configuration", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCompoundSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "compound_source", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessBulk() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_bulk", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessBulkTechnique() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_bulk_technique", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessCrystal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_crystal", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessCrystalTechnique() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_crystal_technique", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdentifierInchi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "identifier_inchi", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdentifierInchiKey() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "identifier_inchi_key", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdentifierInchiVersion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "identifier_inchi_version", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeltingPoint() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "melting_point", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeltingPointGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "melting_point_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeltingPointLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "melting_point_lt", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameCommon() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_common", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameMineral() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_mineral", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameStructureType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_structure_type", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameSystematic() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_systematic", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOpticalRotation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "optical_rotation", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPropertiesBiological() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "properties_biological", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPropertiesPhysical() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "properties_physical", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureDecomposition() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_decomposition", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureDecompositionGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_decomposition_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureDecompositionLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_decomposition_lt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSublimation() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_sublimation", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSublimationGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_sublimation_gt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSublimationLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_sublimation_lt", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureDecompositionEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_decomposition_esd", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureDecompositionSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_decomposition_su", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSublimationEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_sublimation_esd", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSublimationSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_sublimation_su", this);
        }

    }

    public static class ChemicalConnAtomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_conn_atom";

        public ChemicalConnAtomBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCharge() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "charge", this);
        }

        public FloatColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisplayX() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "display_x", this);
        }

        public FloatColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisplayY() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "display_y", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNCA() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "NCA", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "NH", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number", this);
        }

        public StrColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

    }

    public static class ChemicalConnBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_conn_bond";

        public ChemicalConnBondBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ChemicalConnBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom1() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "atom_1", this);
        }

        public IntColumnBuilder<ChemicalConnBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom2() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "atom_2", this);
        }

        public FloatColumnBuilder<ChemicalConnBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistance() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance", this);
        }

        public StrColumnBuilder<ChemicalConnBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

    }

    public static class ChemicalFormulaBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chemical_formula";

        public ChemicalFormulaBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalytical() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "analytical", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIupac() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "iupac", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMoiety() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "moiety", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStructural() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "structural", this);
        }

        public StrColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSum() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "sum", this);
        }

        public FloatColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeight() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "weight", this);
        }

        public FloatColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "weight_meas", this);
        }

    }

    public static class ExptlAbsorptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_absorpt";

        public ExptlAbsorptBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoefficientMu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "coefficient_mu", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_T_max", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_T_min", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "correction_type", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProcessDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "process_details", this);
        }

    }

    public static class ExptlCrystalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal";

        public ExptlCrystalBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterColour() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "colour", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityDiffrn() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_diffrn", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_gt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_lt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasTemp() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_temp", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasTempGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_temp_gt", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasTempLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_temp_lt", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "density_method", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterF000() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_000", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPreparation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "preparation", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPressureHistory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pressure_history", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecrystallizationMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recrystallization_method", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeLength() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_length", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_max", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMid() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_mid", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_min", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeRad() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_rad", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThermalHistory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "thermal_history", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_esd", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasTempEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_temp_esd", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMeasTempSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_meas_temp_su", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterColourLustre() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "colour_lustre", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGeneral() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "general", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterColourPrimary() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "colour_primary", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHue() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "hue", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterColourModifier() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "colour_modifier", this);
        }

        public StrColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensity() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "intensity", this);
        }

    }

    public static class ExptlCrystalAppearanceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal_appearance";

        public ExptlCrystalAppearanceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGeneral() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "general", this);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHue() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "hue", this);
        }

        public StrColumnBuilder<ExptlCrystalAppearanceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensity() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "intensity", this);
        }

    }

    public static class ExptlCrystalFaceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_crystal_face";

        public ExptlCrystalFaceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrChi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_chi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrKappa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_kappa", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPhi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_phi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPsi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_psi", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHkl() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "hkl", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexH() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_h", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexK() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_k", this);
        }

        public IntColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndexL() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index_l", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPerpDist() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "perp_dist", this);
        }

    }

    public static class SpaceGroupBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group";

        public SpaceGroupBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBravaisType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Bravais_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCentringType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "centring_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalSystem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_system", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterITCoordinateSystemCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "IT_coordinate_system_code", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueClass() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Laue_class", this);
        }

        public IntColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_MAlt() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_H-M_alt", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_MRef() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_H-M_ref", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_MAltDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_H-M_alt_description", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameSchoenflies() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_Schoenflies", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPattersonNameH_M() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Patterson_name_H-M", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPointGroupH_M() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "point_group_H-M", this);
        }

        public IntColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterITNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "IT_number", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameHall() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_Hall", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_MFull() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_H-M_full", this);
        }

    }

    public static class SpaceGroupGeneratorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_generator";

        public SpaceGroupGeneratorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupGeneratorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterKey() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "key", this);
        }

        public StrColumnBuilder<SpaceGroupGeneratorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterXyz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "xyz", this);
        }

    }

    public static class SpaceGroupSymopBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_symop";

        public SpaceGroupSymopBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOperationDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "operation_description", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterR() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRT() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "RT", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSeitzMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Seitz_matrix", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterT() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "T", this);
        }

        public IntColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOperationXyz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "operation_xyz", this);
        }

    }

    public static class SpaceGroupWyckoffBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group_wyckoff";

        public SpaceGroupWyckoffBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoordsXyz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coords_xyz", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLetter() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "letter", this);
        }

        public IntColumnBuilder<SpaceGroupWyckoffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<SpaceGroupWyckoffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry", this);
        }

    }

    public static class FunctionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "function";

        public FunctionBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "AtomType", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterClosest() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Closest", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSeitzFromJones() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "SeitzFromJones", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "SymEquiv", this);
        }

        public IntColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymKey() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "SymKey", this);
        }

        public IntColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymLat() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "SymLat", this);
        }

        public StrColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymop() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Symop", this);
        }

    }

    public static class ModelBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "model";

        public ModelBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class GeomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom";

        public GeomBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBondDistanceIncr() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "bond_distance_incr", this);
        }

        public FloatColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBondDistanceMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "bond_distance_min", this);
        }

        public FloatColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactDistanceIncr() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "contact_distance_incr", this);
        }

        public FloatColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactDistanceMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "contact_distance_min", this);
        }

        public StrColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<GeomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

    }

    public static class GeomAngleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_angle";

        public GeomAngleBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistances() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_3", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValue() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_1", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_3", this);
        }

        public StrColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_3", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value_esd", this);
        }

        public FloatColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value_su", this);
        }

    }

    public static class GeomBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_bond";

        public GeomBondBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public IntColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValence() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "valence", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_1", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_2", this);
        }

        public StrColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDist() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist", this);
        }

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistance() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance", this);
        }

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_esd", this);
        }

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_su", this);
        }

    }

    public static class GeomContactBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_contact";

        public GeomContactBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_1", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_2", this);
        }

        public StrColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public FloatColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDist() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist", this);
        }

        public FloatColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistance() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance", this);
        }

        public FloatColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_esd", this);
        }

        public FloatColumnBuilder<GeomContactBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_su", this);
        }

    }

    public static class GeomHbondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_hbond";

        public GeomHbondBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDHA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_DHA", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_H", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDHAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_DHA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDHASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_DHA_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_H", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_H", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_DA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_DA_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDH() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DH", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDH() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_DH", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDHEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DH_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDHSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_DH_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistHA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_HA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceHA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_HA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistHAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_HA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceHASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_HA_su", this);
        }

    }

    public static class GeomTorsionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "geom_torsion";

        public GeomTorsionBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistances() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distances", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_1", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_2", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_3", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetry4() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_4", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValue() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngle() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value_esd", this);
        }

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_su", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_1", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_1", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_2", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_2", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_3", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_3", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteId4() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_4", this);
        }

        public StrColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabel4() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_4", this);
        }

    }

    public static class ModelSiteBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "model_site";

        public ModelSiteBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpEigenSystem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "adp_eigen_system", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpMatrixBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_matrix_beta", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisplayColour() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "display_colour", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public IntColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIndex() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "index", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabel() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label", this);
        }

        public IntColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMoleIndex() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "mole_index", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRadiusBond() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "radius_bond", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRadiusContact() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "radius_contact", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymop() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symop", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

    }

    public static class ValenceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence";

        public ValenceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class ValenceParamBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence_param";

        public ValenceParamBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_1", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom1Valence() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "atom_1_valence", this);
        }

        public StrColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_2", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtom2Valence() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "atom_2_valence", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B", this);
        }

        public StrColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public IntColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ref_id", this);
        }

        public FloatColumnBuilder<ValenceParamBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRo() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Ro", this);
        }

    }

    public static class ValenceRefBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "valence_ref";

        public ValenceRefBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ValenceRefBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<ValenceRefBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReference() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "reference", this);
        }

    }

    public static class PublicationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publication";

        public PublicationBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class AuditBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit";

        public AuditBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBlockDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "block_doi", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCreationDate() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "creation_date", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCreationMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "creation_method", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSchema() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "schema", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUpdateRecord() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "update_record", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRevisionId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "revision_id", this);
        }

        public StrColumnBuilder<AuditBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBlockCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "block_code", this);
        }

    }

    public static class AuditAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_author";

        public AuditAuthorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

    }

    public static class AuditConformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_conform";

        public AuditConformBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditConformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDictLocation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dict_location", this);
        }

        public StrColumnBuilder<AuditConformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDictName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dict_name", this);
        }

        public StrColumnBuilder<AuditConformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDictVersion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dict_version", this);
        }

    }

    public static class AuditContactAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_contact_author";

        public AuditContactAuthorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class AuditLinkBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_link";

        public AuditLinkBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditLinkBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBlockCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "block_code", this);
        }

        public StrColumnBuilder<AuditLinkBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBlockDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "block_description", this);
        }

    }

    public static class CitationBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation";

        public CitationBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbstract() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abstract", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbstractIdCAS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abstract_id_CAS", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBookIdISBN() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "book_id_ISBN", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBookPublisher() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "book_publisher", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBookPublisherCity() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "book_publisher_city", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBookTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "book_title", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoordinateLinkage() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coordinate_linkage", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountry() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "country", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseIdCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id_CSD", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseIdMedline() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id_Medline", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "doi", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalAbbrev() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_abbrev", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalFull() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_full", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdASTM() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_ASTM", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_CSD", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdISSN() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_ISSN", this);
        }

        public IntColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIssue() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "journal_issue", this);
        }

        public IntColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalVolume() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "journal_volume", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLanguage() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "language", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPageFirst() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "page_first", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPageLast() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "page_last", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublisher() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publisher", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterYear() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "year", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

    }

    public static class CitationAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation_author";

        public CitationAuthorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterKey() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "key", this);
        }

        public StrColumnBuilder<CitationAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCitationId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "citation_id", this);
        }

        public StrColumnBuilder<CitationAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public IntColumnBuilder<CitationAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOrdinal() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ordinal", this);
        }

    }

    public static class CitationEditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "citation_editor";

        public CitationEditorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CitationEditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCitationId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "citation_id", this);
        }

        public StrColumnBuilder<CitationEditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<CitationEditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public IntColumnBuilder<CitationEditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOrdinal() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ordinal", this);
        }

    }

    public static class ComputingBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "computing";

        public ComputingBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCellRefinement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cell_refinement", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMolecularGraphics() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "molecular_graphics", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublicationMaterial() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publication_material", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStructureRefinement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "structure_refinement", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStructureSolution() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "structure_solution", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDataCollection() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "data_collection", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrnCollection() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "diffrn_collection", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDataReduction() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "data_reduction", this);
        }

        public StrColumnBuilder<ComputingBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrnReduction() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "diffrn_reduction", this);
        }

    }

    public static class DatabaseBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database";

        public DatabaseBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCSDHistory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "CSD_history", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatasetDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dataset_doi", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalASTM() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_ASTM", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_CSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCAS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_CAS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCAS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "CAS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCOD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_COD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCOD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "COD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_CSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "CSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCcdcArchive() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_ccdc_archive", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcArchive() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_archive", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCcdcFiz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_ccdc_fiz", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcFiz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_fiz", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCcdcJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_ccdc_journal", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_journal", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeICSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_ICSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterICSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ICSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeMDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_MDF", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "MDF", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeNBS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_NBS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNBS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "NBS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodePDB() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_PDB", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPDB() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "PDB", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodePDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_PDF", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "PDF", this);
        }

    }

    public static class DatabaseCodeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_code";

        public DatabaseCodeBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCAS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "CAS", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCOD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "COD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "CSD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcArchive() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_archive", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcFiz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_fiz", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_journal", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterICSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ICSD", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "MDF", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNBS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "NBS", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPDB() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "PDB", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "PDF", this);
        }

    }

    public static class DatabaseRelatedBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_related";

        public DatabaseRelatedBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEntryCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "entry_code", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRelation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "relation", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

    }

    public static class DisplayBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "display";

        public DisplayBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class DisplayColourBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "display_colour";

        public DisplayColourBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBlue() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "blue", this);
        }

        public IntColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGreen() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "green", this);
        }

        public StrColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHue() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "hue", this);
        }

        public IntColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRed() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "red", this);
        }

        public IntColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRGB() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "RGB", this);
        }

    }

    public static class JournalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal";

        public JournalBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodenASTM() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coden_ASTM", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodenCambridge() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coden_Cambridge", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDataValidationNumber() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "data_validation_number", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIssue() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "issue", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLanguage() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "language", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameFull() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_full", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPageFirst() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "page_first", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPageLast() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "page_last", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPaperCategory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "paper_category", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPaperDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "paper_doi", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSupplPublNumber() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "suppl_publ_number", this);
        }

        public IntColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSupplPublPages() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "suppl_publ_pages", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValidationNumber() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "validation_number", this);
        }

        public IntColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVolume() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "volume", this);
        }

        public IntColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterYear() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "year", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_address", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_code", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_email", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_fax", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_name", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorNotes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_notes", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNotes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "notes", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_phone", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateAccepted() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_accepted", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAccepted() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "accepted", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateFromCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_from_coeditor", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFromCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "from_coeditor", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatePrintersFinal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_printers_final", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPrintersFinal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "printers_final", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatePrintersFirst() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_printers_first", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPrintersFirst() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "printers_first", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateProofsIn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_proofs_in", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProofsIn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "proofs_in", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateProofsOut() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_proofs_out", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProofsOut() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "proofs_out", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateRecdCopyright() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_recd_copyright", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdCopyright() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_copyright", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateRecdElectronic() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_recd_electronic", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdElectronic() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_electronic", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateRecdHardCopy() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_recd_hard_copy", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdHardCopy() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_hard_copy", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDateToCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "date_to_coeditor", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterToCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "to_coeditor", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_address", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_code", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_email", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_fax", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_name", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorNotes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_notes", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTecheditorPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "techeditor_phone", this);
        }

    }

    public static class JournalCoeditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_coeditor";

        public JournalCoeditorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNotes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "notes", this);
        }

        public StrColumnBuilder<JournalCoeditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class JournalDateBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_date";

        public JournalDateBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAccepted() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "accepted", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFromCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "from_coeditor", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPrintersFinal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "printers_final", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPrintersFirst() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "printers_first", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProofsIn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "proofs_in", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProofsOut() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "proofs_out", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdCopyright() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_copyright", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdElectronic() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_electronic", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRecdHardCopy() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "recd_hard_copy", this);
        }

        public StrColumnBuilder<JournalDateBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterToCoeditor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "to_coeditor", this);
        }

    }

    public static class JournalIndexBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_index";

        public JournalIndexBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<JournalIndexBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<JournalIndexBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSubterm() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "subterm", this);
        }

        public StrColumnBuilder<JournalIndexBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTerm() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "term", this);
        }

        public StrColumnBuilder<JournalIndexBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

    }

    public static class JournalTecheditorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal_techeditor";

        public JournalTecheditorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNotes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "notes", this);
        }

        public StrColumnBuilder<JournalTecheditorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class PublBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ";

        public PublBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactLetter() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_letter", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthorAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author_address", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthorEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author_email", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthorFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author_fax", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthor() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author_name", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContactAuthorPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contact_author_phone", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterManuscriptCreation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "manuscript_creation", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCreation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "creation", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterManuscriptProcessed() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "manuscript_processed", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProcessed() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "processed", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterManuscriptText() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "manuscript_text", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterText() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "text", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRequestedCategory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "requested_category", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCategory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "category", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRequestedCoeditorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "requested_coeditor_name", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_name", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRequestedJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "requested_journal", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionAbstract() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_abstract", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbstract() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abstract", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionAcknowledgements() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_acknowledgements", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAcknowledgements() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "acknowledgements", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionComment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_comment", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterComment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "comment", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionDiscussion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_discussion", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiscussion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "discussion", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionExperimental() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_experimental", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExperimental() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "experimental", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionExptlPrep() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_exptl_prep", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlPrep() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_prep", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionExptlRefinement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_exptl_refinement", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlRefinement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_refinement", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionExptlSolution() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_exptl_solution", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlSolution() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_solution", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionFigureCaptions() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_figure_captions", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFigureCaptions() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "figure_captions", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionIntroduction() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_introduction", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntroduction() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "introduction", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionKeywords() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_keywords", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterKeywords() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "keywords", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionReferences() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_references", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReferences() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "references", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionRelatedLiterature() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_related_literature", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRelatedLiterature() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "related_literature", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionSynopsis() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_synopsis", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSynopsis() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "synopsis", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionTableLegends() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_table_legends", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTableLegends() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "table_legends", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_title", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSectionTitleFootnote() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "section_title_footnote", this);
        }

        public StrColumnBuilder<PublBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitleFootnote() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title_footnote", this);
        }

    }

    public static class PublAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_author";

        public PublAuthorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFootnote() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "footnote", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdIucr() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_iucr", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdOrcid() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_orcid", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class PublBodyBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_body";

        public PublBodyBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublBodyBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterContents() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "contents", this);
        }

        public StrColumnBuilder<PublBodyBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterElement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "element", this);
        }

        public StrColumnBuilder<PublBodyBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFormat() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "format", this);
        }

        public StrColumnBuilder<PublBodyBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabel() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label", this);
        }

        public StrColumnBuilder<PublBodyBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title", this);
        }

    }

    public static class PublContactAuthorBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_contact_author";

        public PublContactAuthorBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdIucr() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_iucr", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdOrcid() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_orcid", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAddress() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "address", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class PublManuscriptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_manuscript";

        public PublManuscriptBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublManuscriptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCreation() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "creation", this);
        }

        public StrColumnBuilder<PublManuscriptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterProcessed() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "processed", this);
        }

        public StrColumnBuilder<PublManuscriptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterText() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "text", this);
        }

    }

    public static class PublManuscriptInclExtraBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_manuscript_incl_extra";

        public PublManuscriptInclExtraBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDefn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "defn", this);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInfo() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "info", this);
        }

        public StrColumnBuilder<PublManuscriptInclExtraBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterItem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "item", this);
        }

    }

    public static class PublRequestedBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_requested";

        public PublRequestedBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublRequestedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCategory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "category", this);
        }

        public StrColumnBuilder<PublRequestedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoeditorName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coeditor_name", this);
        }

        public StrColumnBuilder<PublRequestedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal", this);
        }

    }

    public static class PublSectionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_section";

        public PublSectionBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbstract() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abstract", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAcknowledgements() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "acknowledgements", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterComment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "comment", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiscussion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "discussion", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExperimental() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "experimental", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlPrep() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_prep", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlRefinement() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_refinement", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExptlSolution() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "exptl_solution", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFigureCaptions() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "figure_captions", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntroduction() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "introduction", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterKeywords() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "keywords", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReferences() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "references", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRelatedLiterature() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "related_literature", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSynopsis() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "synopsis", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTableLegends() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "table_legends", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitle() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title", this);
        }

        public StrColumnBuilder<PublSectionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTitleFootnote() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "title_footnote", this);
        }

    }

    public static class StructureBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "structure";

        public StructureBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class AtomBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom";

        public AtomBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }


    }

    public static class AtomSiteBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site";

        public AtomSiteBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAttachedHydrogens() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "attached_hydrogens", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBEquivGeomMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCalcAttachedAtom() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "calc_attached_atom", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCalcFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "calc_flag", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnX() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnY() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_y", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZ() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_z", this);
        }

        public IntColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterChemicalConnNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "chemical_conn_number", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConstraints() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "constraints", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisorderAssembly() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "disorder_assembly", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisorderGroup() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "disorder_group", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractX() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractY() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_y", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractZ() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_z", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent0() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_0", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent1() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_1", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent2() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_2", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent3() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_3", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent4() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_4", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent5() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_5", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabelComponent6() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label_component_6", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOccupancy() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "occupancy", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefinementFlags() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "refinement_flags", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefinementFlagsAdp() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "refinement_flags_adp", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefinementFlagsOccupancy() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "refinement_flags_occupancy", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRefinementFlagsPosn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "refinement_flags_posn", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestraints() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "restraints", this);
        }

        public IntColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryOrder() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_order", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTensorBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "tensor_beta", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUEquivGeomMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWyckoffSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Wyckoff_symbol", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThermalDisplaceType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "thermal_displace_type", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "adp_type", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBEquivGeomMeanEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_equiv_geom_mean_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBEquivGeomMeanSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquivEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquivSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_x_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_x_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnYEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_y_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnYSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_y_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_z_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_z_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_x_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_x_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractYEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_y_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractYSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_y_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractZEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_z_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractZSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_z_su", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabel() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOccupancyEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "occupancy_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOccupancySu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "occupancy_su", this);
        }

        public IntColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymmetryMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "symmetry_multiplicity", this);
        }

        public IntColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_multiplicity", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUEquivGeomMeanEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_equiv_geom_mean_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUEquivGeomMeanSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquivEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_iso_or_equiv_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquivSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_iso_or_equiv_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoB33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_B[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_33_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRatio() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ratio", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoRatio() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_ratio", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnisoU33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "aniso_U[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_33_su", this);
        }

    }

    public static class AtomSiteAnisoBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site_aniso";

        public AtomSiteAnisoBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_B", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_U", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_33_su", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabel() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRatio() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ratio", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_33_su", this);
        }

    }

    public static class AtomSitesBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites";

        public AtomSitesBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSolutionHydrogens() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "solution_hydrogens", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSolutionPrimary() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "solution_primary", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSolutionSecondary() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "solution_secondary", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransformAxes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transform_axes", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAxes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "axes", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[1][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_11", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[1][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_12", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[1][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_13", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[2][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_21", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[2][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_22", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[2][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_23", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[3][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_31", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[3][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_32", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfMatrix33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_matrix[3][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_33", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfVector1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_vector[1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfVector2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_vector[2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnTransfVector3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_transf_vector[3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3", this);
        }

        public StrColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransformAxes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fract_transform_axes", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[1][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[1][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[1][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[2][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[2][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[2][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[3][1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[3][2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfMatrix33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_matrix[3][3]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfVector1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_vector[1]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfVector2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_vector[2]", this);
        }

        public FloatColumnBuilder<AtomSitesBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractTransfVector3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_transf_vector[3]", this);
        }

    }

    public static class AtomSitesCartnTransformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites_cartn_transform";

        public AtomSitesCartnTransformBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAxes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "axes", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_11", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_12", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_13", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_21", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_22", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_23", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_31", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_32", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_33", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVector() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector", this);
        }

    }

    public static class AtomSitesFractTransformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites_fract_transform";

        public AtomSitesFractTransformBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVector() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector", this);
        }

        public StrColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAxes() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "axes", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_11", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_12", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_13", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_21", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_22", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_23", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_31", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_32", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_33", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3", this);
        }

    }

    public static class AtomTypeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_type";

        public AtomTypeBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomicMass() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public IntColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomicNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "atomic_number", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "description", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisplayColour() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "display_colour", this);
        }

        public IntColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterElectronCount() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "electron_count", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterElementSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "element_symbol", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterKey() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "key", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberInCell() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "number_in_cell", this);
        }

        public IntColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOxidationNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "oxidation_number", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRadiusBond() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "radius_bond", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRadiusContact() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "radius_contact", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symbol", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyticalMass() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "analytical_mass_%", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyticalMassPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "analytical_mass_percent", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_c", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_c", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatDispersionImag() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_dispersion_imag", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionImag() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_imag", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatDispersionReal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_dispersion_real", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionReal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_real", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatDispersionSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scat_dispersion_source", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_source", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatLengthNeutron() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_length_neutron", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthNeutron() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_neutron", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scat_source", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "source", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatVersusStolList() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "scat_versus_stol_list", this);
        }

        public StrColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVersusStolList() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "versus_stol_list", this);
        }

    }

    public static class AtomTypeScatBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_type_scat";

        public AtomTypeScatBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannCoeffs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_coeffs", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersion() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dispersion", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionImagCu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_imag_cu", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionImagMo() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_imag_mo", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionRealCu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_real_cu", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionRealMo() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_real_mo", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC0() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_Fox_c0", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_Fox_c1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_Fox_c2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_Fox_c3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxCoeffs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_Fox_coeffs", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symbol", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cromer_Mann_c", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionImag() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_imag", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionReal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_real", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDispersionSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dispersion_source", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLengthNeutron() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "length_neutron", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSource() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "source", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVersusStolList() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "versus_stol_list", this);
        }

    }

    public static class RefineBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine";

        public RefineBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "details", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_max", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_max", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityMaxEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_max_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMaxSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_max_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_min", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_min", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityMinEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_min_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMinSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_min_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityRms() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_rms", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityRms() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_rms", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityRmsEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_rms_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityRmsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_rms_su", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_details", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_details", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureFlack() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Flack", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlack() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Flack", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureFlackEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Flack_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlackSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Flack_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Rogers", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Rogers", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureRogersEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Rogers_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogersSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Rogers_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_d_res_high", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_d_res_low", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsExtinctionCoef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_extinction_coef", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionCoef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "extinction_coef", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsExtinctionCoefEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_extinction_coef_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionCoefSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "extinction_coef_su", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsExtinctionExpression() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_extinction_expression", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionExpression() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extinction_expression", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsExtinctionMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_extinction_method", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extinction_method", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitAllEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_all_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitAllSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_all_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitGtEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_gt_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitObsEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_obs_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitGtSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_gt_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsGoodnessOfFitRef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_goodness_of_fit_ref", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitRef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_ref", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsHydrogenTreatment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_hydrogen_treatment", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHydrogenTreatment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "hydrogen_treatment", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsMatrixType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_matrix_type", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "matrix_type", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsNumberConstraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ls_number_constraints", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberConstraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_constraints", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsNumberParameters() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ls_number_parameters", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberParameters() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_parameters", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsNumberReflnsAll() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ls_number_reflns_all", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberReflns() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_reflns", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsNumberReflnsObs() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ls_number_reflns_obs", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberReflnsGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_reflns_gt", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsNumberRestraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "ls_number_restraints", this);
        }

        public IntColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberRestraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_restraints", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFsqdFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_Fsqd_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRIFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_I_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_restrained_S_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_S_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRestrainedSObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_restrained_S_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_S_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverEsdMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_esd_max", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverSuMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_su_max", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_max", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverSuMaxLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_su_max_lt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMaxLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_max_lt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverEsdMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_esd_mean", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverSuMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_su_mean", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_mean", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsShiftOverSuMeanLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_shift_over_su_mean_lt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMeanLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_mean_lt", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsStructureFactorCoef() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_structure_factor_coef", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStructureFactorCoef() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "structure_factor_coef", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsWeightingDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_weighting_details", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightingDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "weighting_details", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsWeightingScheme() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "ls_weighting_scheme", this);
        }

        public StrColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightingScheme() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "weighting_scheme", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsWRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_wR_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsWRFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_wR_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_gt", this);
        }

    }

    public static class RefineDiffBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_diff";

        public RefineDiffBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_max", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMaxSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_max_su", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_min", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityMinSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_min_su", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityRms() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_rms", this);
        }

        public FloatColumnBuilder<RefineDiffBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityRmsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_rms_su", this);
        }

    }

    public static class RefineLsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_ls";

        public RefineLsBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "F_calc_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcFormula() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "F_calc_formula", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcPrecision() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_calc_precision", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorRef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_ref", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_details", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlack() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Flack", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlackSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Flack_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Rogers", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogersSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_Rogers_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionCoef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "extinction_coef", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionCoefSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "extinction_coef_su", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionExpression() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extinction_expression", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtinctionMethod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extinction_method", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitAllSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_all_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitGtSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_gt_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitRef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_ref", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHydrogenTreatment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "hydrogen_treatment", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "matrix_type", this);
        }

        public IntColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberConstraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_constraints", this);
        }

        public IntColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberParameters() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_parameters", this);
        }

        public IntColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberReflns() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_reflns", this);
        }

        public IntColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberReflnsGt() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_reflns_gt", this);
        }

        public IntColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumberRestraints() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number_restraints", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_S_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_S_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_max", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMaxLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_max_lt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_mean", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterShiftOverSuMeanLt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "shift_over_su_mean_lt", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStructureFactorCoef() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "structure_factor_coef", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightingDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "weighting_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightingScheme() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "weighting_scheme", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_gt", this);
        }

    }

    public static class RefineLsClassBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "refine_ls_class";

        public RefineLsClassBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_high", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_res_low", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_Fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "R_I_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWRFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wR_factor_all", this);
        }

    }

    public static class SymmetryBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "symmetry";

        public SymmetryBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCellSetting() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cell_setting", this);
        }

        public IntColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntTablesNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "Int_Tables_number", this);
        }

        public StrColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpaceGroupNameHall() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "space_group_name_Hall", this);
        }

        public StrColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpaceGroupNameH_M() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "space_group_name_H-M", this);
        }

    }

    public static class DiffrnStandardsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standards";

        public DiffrnStandardsBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecay() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_%", this);
        }

        public IntColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntervalCount() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "interval_count", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntervalTime() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "interval_time", this);
        }

        public IntColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "number", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_sigma", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_u", this);
        }

    }

    public static class CellAngleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_angle";

        public CellAngleBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<CellAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_su", this);
        }

        public FloatColumnBuilder<CellAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGammaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gamma_su", this);
        }

    }

    public static class ChemCompBondBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "chem_comp_bond";

        public ChemCompBondBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<ChemCompBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomId1() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "atom_id_1", this);
        }

        public IntColumnBuilder<ChemCompBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomId2() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "atom_id_2", this);
        }

        public FloatColumnBuilder<ChemCompBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueDist() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "value_dist", this);
        }

        public StrColumnBuilder<ChemCompBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValueOrder() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "value_order", this);
        }

    }

    public static class SymmetryEquivBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "symmetry_equiv";

        public SymmetryEquivBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public IntColumnBuilder<SymmetryEquivBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPosSiteId() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "pos_site_id", this);
        }

        public StrColumnBuilder<SymmetryEquivBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPosAsXyz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pos_as_xyz", this);
        }

    }

    public static class PublManuscriptInclBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "publ_manuscript_incl";

        public PublManuscriptInclBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtraDefn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extra_defn", this);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDefn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "defn", this);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtraInfo() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extra_info", this);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInfo() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "info", this);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExtraItem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "extra_item", this);
        }

        public StrColumnBuilder<PublManuscriptInclBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterItem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "item", this);
        }

    }

    public static class AtomSiteAnisotropBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site_anisotrop";

        public AtomSiteAnisotropBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]_esd", this);
        }

        public StrColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRatio() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ratio", this);
        }

        public StrColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisotropBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]_esd", this);
        }

    }

}