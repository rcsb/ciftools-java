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

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_id", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalSupport() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_support", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalTreatment() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_treatment", this);
        }

        public StrColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTempEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temp_esd", this);
        }

        public FloatColumnBuilder<DiffrnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAmbientTemperatureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ambient_temperature_su", this);
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

    public static class CellBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell";

        public CellBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
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

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomicMass() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "atomic_mass", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUijToBetaij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_uij_to_betaij", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUijToBetaijSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_uij_to_betaij_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUisoToUij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_uiso_to_uij", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConvertUisoToUijSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "convert_uiso_to_uij_su", this);
        }

        public StrColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrnId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "diffrn_id", this);
        }

        public IntColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFormulaUnitsZ() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "formula_units_z", this);
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

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMetricTensor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterOrthogonalMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "orthogonal_matrix", this);
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

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalMetricTensor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_metric_tensor", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalMetricTensorSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_metric_tensor_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalOrthogonalMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_orthogonal_matrix", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalOrthogonalMatrixSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_orthogonal_matrix_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorBSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_c", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterReciprocalVectorCSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "reciprocal_vector_c_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_a", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorASu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_a_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_b", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorBSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_b_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_c", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorCSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_c_su", this);
        }

        public FloatColumnBuilder<CellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVolume() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "volume", this);
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

    }

    public static class CellMeasurementBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "cell_measurement";

        public CellMeasurementBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterConditionId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "condition_id", this);
        }

        public StrColumnBuilder<CellMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrnId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "diffrn_id", this);
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

        public FloatColumnBuilder<CellMeasurementReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterThetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "theta_su", this);
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

        public StrColumnBuilder<DiffrnMeasurementBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecimenAttachmentType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "specimen_attachment_type", this);
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

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUbij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ubij", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_11", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_12", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[1][3]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_13", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb21() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_21", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_22", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[2][3]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_23", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][1]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb31() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_31", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][2]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb32() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_32", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "UB[3][3]", this);
        }

        public FloatColumnBuilder<DiffrnOrientMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUb33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ub_33", this);
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

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleChiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_chi_su", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleKappa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_kappa", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleKappaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_kappa_su", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleOmega() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_omega", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleOmegaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_omega_su", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePhi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_phi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePhiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_phi_su", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePsi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_psi", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnglePsiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_psi_su", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleTheta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_theta", this);
        }

        public FloatColumnBuilder<DiffrnOrientReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleThetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_theta_su", this);
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

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type", this);
        }

        public FloatColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wt", this);
        }

        public StrColumnBuilder<DiffrnRadiationWavelengthBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterXraySymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "xray_symbol", this);
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

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsNet() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "counts_net", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCountsNetSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "counts_net_su", this);
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

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityBg1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_bg_1", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityBg1Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_bg_1_su", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityBg2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_bg_2", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityBg2Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_bg_2_su", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityNet() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_net", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityPeak() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_peak", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityPeakSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_peak_su", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityTotal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_total", this);
        }

        public FloatColumnBuilder<DiffrnReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityTotalSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_total_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_r_equivalents", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueMeasuredFractionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "laue_measured_fraction_full", this);
        }

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueMeasuredFractionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "laue_measured_fraction_max", this);
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

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMax() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_max", this);
        }

        public IntColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_min", this);
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

        public FloatColumnBuilder<DiffrnReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSunetiOverNeti() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_suneti_over_neti", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_r_eq", this);
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

        public FloatColumnBuilder<DiffrnReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAvSuiOverI() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "av_sui_over_i", this);
        }

    }

    public static class DiffrnReflnsTransfMatrixBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_reflns_transf_matrix";

        public DiffrnReflnsTransfMatrixBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnReflnsTransfMatrixBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTij() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "tij", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "i_net", this);
        }

        public FloatColumnBuilder<DiffrnScaleGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterINetSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "i_net_su", this);
        }

    }

    public static class DiffrnSourceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_source";

        public DiffrnSourceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeamline() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "beamline", this);
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

        public StrColumnBuilder<DiffrnSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFacility() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "facility", this);
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

    public static class DiffrnStandardsBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "diffrn_standards";

        public DiffrnStandardsBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecayPercentSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_percent_su", this);
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

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSuAverageSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_su_average_su", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecay() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_%", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDecayPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "decay_percent", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_sigma", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scale_u", this);
        }

        public FloatColumnBuilder<DiffrnStandardsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScaleSuAverage() {
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "a_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterACalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "a_calc_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "a_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "a_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBCalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_calc_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_meas_su", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterClassCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "class_code", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDSpacing() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_spacing", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_calc_su", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFComplex() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "f_complex", this);
        }

        public StrColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFComplexSu() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "f_complex_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_squared_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredCalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_squared_calc_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_squared_meas", this);
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

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityCalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_calc_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIntensityMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "intensity_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLpFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "lp_factor", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanPathLengthTbar() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mean_path_length_tbar", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseCalc() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_calc", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseCalcSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_calc_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseMeas() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_meas", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhaseMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "phase_meas_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_meas_su", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredSigma() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "F_squared_sigma", this);
        }

        public FloatColumnBuilder<ReflnBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFSquaredMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_squared_meas_su", this);
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
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "apply_dispersion_to_fcalc", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResolutionHigh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_resolution_high", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDResolutionLow() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "d_resolution_low", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelCoverage() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "friedel_coverage", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelFractionFull() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "friedel_fraction_full", this);
        }

        public FloatColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFriedelFractionMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "friedel_fraction_max", this);
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

        public IntColumnBuilder<ReflnsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLimitMin() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "limit_min", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_all", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_gt", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_fsqd_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_i_factor", this);
        }

        public FloatColumnBuilder<ReflnsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_all", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_f", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasFSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_f_su", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasFSquared() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_f_squared", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasFSquaredSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_f_squared_su", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasIntensity() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_intensity", this);
        }

        public FloatColumnBuilder<ReflnsScaleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasIntensitySu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meas_intensity_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "rmerge_f_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "rmerge_i_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverSigIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_sigI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeanIOverUIAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meanI_over_uI_all", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeaniOverSuiAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meani_over_sui_all", this);
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

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeaniOverSuiGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "meani_over_sui_gt", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "rmerge_f_gt", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Rmerge_I_obs", this);
        }

        public FloatColumnBuilder<ReflnsShellBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRmergeIGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "rmerge_i_gt", this);
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

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransmissionFactorMaxSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transmission_factor_max_su", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransmissionFactorMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transmission_factor_min", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTransmissionFactorMinSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "transmission_factor_min_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_t_max", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsorptCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "absorpt_correction_T_min", this);
        }

        public FloatColumnBuilder<ExptlBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_t_min", this);
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

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessBulkSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_bulk_su", this);
        }

        public StrColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessBulkTechnique() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_bulk_technique", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessCrystal() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_crystal", this);
        }

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEnantioexcessCrystalSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "enantioexcess_crystal_su", this);
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

        public FloatColumnBuilder<ChemicalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeltingPointSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "melting_point_su", this);
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

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNca() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "nca", this);
        }

        public IntColumnBuilder<ChemicalConnAtomBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNh() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "nh", this);
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

        public StrColumnBuilder<ChemicalConnBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

        public FloatColumnBuilder<ChemicalFormulaBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWeightMeasSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "weight_meas_su", this);
        }

    }

    public static class ExptlAbsorptBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "exptl_absorpt";

        public ExptlAbsorptBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoefficientMuSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "coefficient_mu_su", this);
        }

        public StrColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCoefficientMu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "coefficient_mu", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_t_max", this);
        }

        public FloatColumnBuilder<ExptlAbsorptBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCorrectionTMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "correction_t_min", this);
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

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityDiffrnSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_diffrn_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_000", this);
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

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeLengthSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_length_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMax() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_max", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMaxSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_max_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMid() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_mid", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMidSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_mid_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMin() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_min", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeMinSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_min_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeRad() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_rad", this);
        }

        public FloatColumnBuilder<ExptlCrystalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSizeRadSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "size_rad_su", this);
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

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrChiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_chi_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrKappa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_kappa", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrKappaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_kappa_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPhi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_phi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPhiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_phi_su", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPsi() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_psi", this);
        }

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffrPsiSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diffr_psi_su", this);
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

        public FloatColumnBuilder<ExptlCrystalFaceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPerpDistSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "perp_dist_su", this);
        }

    }

    public static class SpaceGroupBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "space_group";

        public SpaceGroupBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBravaisType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "bravais_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCentringType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "centring_type", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCrystalSystem() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "crystal_system", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterItCoordinateSystemCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "it_coordinate_system_code", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLaueClass() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "laue_class", this);
        }

        public IntColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMultiplicity() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "multiplicity", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_mAlt() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_h-m_alt", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_mAltDescription() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_h-m_alt_description", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_mRef() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_h-m_ref", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameSchoenflies() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_schoenflies", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPattersonNameH_m() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "patterson_name_h-m", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPointGroupH_m() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "point_group_h-m", this);
        }

        public IntColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterItNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "it_number", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameH_mFull() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_h-m_full", this);
        }

        public StrColumnBuilder<SpaceGroupBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNameHall() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name_hall", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "rt", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSeitzMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "seitz_matrix", this);
        }

        public FloatColumnBuilder<SpaceGroupSymopBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterT() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "t", this);
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

        public FloatColumnBuilder<GeomAngleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistancesSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distances_su", this);
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

        public FloatColumnBuilder<GeomBondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterValenceSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "valence_su", this);
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

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDha() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_dha", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPublFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "publ_flag", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_a", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_d", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSiteSymmetryH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "site_symmetry_h", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDHAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_DHA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAngleDhaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "angle_dha_su", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_A", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelA() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_a", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_D", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_d", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteIdH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_id_H", this);
        }

        public StrColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomSiteLabelH() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_site_label_h", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_da", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_da_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDH() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DH", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDh() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_dh", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistDHEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_DH_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceDhSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_dh_su", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistHA() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_HA", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceHa() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_ha", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistHAEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "dist_HA_esd", this);
        }

        public FloatColumnBuilder<GeomHbondBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistanceHaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distance_ha_su", this);
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

        public FloatColumnBuilder<GeomTorsionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDistancesSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "distances_su", this);
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

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpEigenvalues() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_eigenvalues", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpEigenvaluesSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_eigenvalues_su", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpEigenvectors() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_eigenvectors", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpEigenvectorsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_eigenvectors_su", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpMatrixBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_matrix_beta", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAdpMatrixBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "adp_matrix_beta_su", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_xyz", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyzSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_xyz_su", this);
        }

        public StrColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDisplayColour() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "display_colour", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public FloatColumnBuilder<ModelSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyzSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ro", this);
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

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEmail() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "email", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFax() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fax", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdOrcid() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_orcid", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterName() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "name", this);
        }

        public StrColumnBuilder<AuditAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPhone() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "phone", this);
        }

    }

    public static class AuditAuthorRoleBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_author_role";

        public AuditAuthorRoleBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditAuthorRoleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AuditAuthorRoleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRole() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "role", this);
        }

        public StrColumnBuilder<AuditAuthorRoleBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
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

        public StrColumnBuilder<AuditContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

    public static class AuditSupportBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "audit_support";

        public AuditSupportBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAwardNumber() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "award_number", this);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAwardRecipient() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "award_recipient", this);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAwardType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "award_type", this);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFundingOrganization() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "funding_organization", this);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFundingOrganizationDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "funding_organization_doi", this);
        }

        public StrColumnBuilder<AuditSupportBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbstractIdCas() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abstract_id_cas", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBookIdIsbn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "book_id_isbn", this);
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

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseIdCsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id_csd", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseIdMedline() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id_medline", this);
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

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdAstm() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_astm", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdCsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_csd", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIdIssn() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_id_issn", this);
        }

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalIssue() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_issue", this);
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

        public StrColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUrl() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "url", this);
        }

        public IntColumnBuilder<CitationBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterYear() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "year", this);
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

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCsdHistory() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "csd_history", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatasetDoi() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "dataset_doi", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalAstm() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_astm", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterJournalCsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "journal_csd", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCAS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_CAS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCas() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cas", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCOD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_COD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cod", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeCSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_CSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "csd", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCCDCArchive() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_CCDC_archive", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcArchive() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_archive", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCCDCFiz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_CCDC_fiz", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcFiz() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_fiz", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeDepnumCCDCJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_depnum_CCDC_journal", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDepnumCcdcJournal() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "depnum_ccdc_journal", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeICSD() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_ICSD", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIcsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "icsd", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeMDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_MDF", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMdf() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "mdf", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodeNBS() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_NBS", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNbs() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "nbs", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodePDB() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_PDB", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPdb() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pdb", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodePDF() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "code_PDF", this);
        }

        public StrColumnBuilder<DatabaseBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPdf() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pdf", this);
        }

    }

    public static class DatabaseCodeBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_code";

        public DatabaseCodeBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCas() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cas", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCod() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "cod", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "csd", this);
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

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIcsd() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "icsd", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMdf() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "mdf", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterNbs() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "nbs", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPdb() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pdb", this);
        }

        public StrColumnBuilder<DatabaseCodeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPdf() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "pdf", this);
        }

    }

    public static class DatabaseRelatedBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "database_related";

        public DatabaseRelatedBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDatabaseId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "database_id", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEntryCode() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "entry_code", this);
        }

        public StrColumnBuilder<DatabaseRelatedBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

        public IntColumnBuilder<DisplayColourBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRgb() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "rgb", this);
        }

    }

    public static class JournalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "journal";

        public JournalBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodenAstm() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coden_astm", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCodenCambridge() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "coden_cambridge", this);
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

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPaperNumber() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "paper_number", this);
        }

        public IntColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPaperPages() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "paper_pages", this);
        }

        public StrColumnBuilder<JournalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPaperUrl() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "paper_url", this);
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

        public StrColumnBuilder<JournalIndexBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<PublAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterIdAudit() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id_audit", this);
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

        public StrColumnBuilder<PublContactAuthorBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
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

    public static class AtomAnalyticalBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_analytical";

        public AtomAnalyticalBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyte() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "analyte", this);
        }

        public FloatColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyteMassPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "analyte_mass_percent", this);
        }

        public FloatColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyteMassPercentSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "analyte_mass_percent_su", this);
        }

        public StrColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterChemicalSpecies() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "chemical_species", this);
        }

        public FloatColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterChemicalSpeciesMassPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "chemical_species_mass_percent", this);
        }

        public FloatColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterChemicalSpeciesMassPercentSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "chemical_species_mass_percent_su", this);
        }

        public StrColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomAnalyticalBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "meas_id", this);
        }

    }

    public static class AtomAnalyticalMassLossBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_analytical_mass_loss";

        public AtomAnalyticalMassLossBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMeasId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "meas_id", this);
        }

        public FloatColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPercent() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "percent", this);
        }

        public FloatColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterPercentSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "percent_su", this);
        }

        public StrColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public FloatColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperature() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature", this);
        }

        public FloatColumnBuilder<AtomAnalyticalMassLossBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTemperatureSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "temperature_su", this);
        }

    }

    public static class AtomAnalyticalSourceBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_analytical_source";

        public AtomAnalyticalSourceBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomAnalyticalSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterEquipmentMake() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "equipment_make", this);
        }

        public StrColumnBuilder<AtomAnalyticalSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomAnalyticalSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpecialDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "special_details", this);
        }

        public StrColumnBuilder<AtomAnalyticalSourceBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTechnique() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "technique", this);
        }

    }

    public static class AtomScatVersusStolBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_scat_versus_stol";

        public AtomScatVersusStolBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<AtomScatVersusStolBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomType() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atom_type", this);
        }

        public FloatColumnBuilder<AtomScatVersusStolBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatValue() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_value", this);
        }

        public FloatColumnBuilder<AtomScatVersusStolBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatValueSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_value_su", this);
        }

        public FloatColumnBuilder<AtomScatVersusStolBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterStolValue() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "stol_value", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCalcAttachedAtom() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "calc_attached_atom", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCalcFlag() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "calc_flag", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnX() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXyzSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_xyz_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnY() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_y", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZ() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_z", this);
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

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractSymmform() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "fract_symmform", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractX() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_x", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyz() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFractXyzSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "fract_xyz_su", this);
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

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTypeSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "type_symbol", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUEquivGeomMean() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_equiv_geom_mean", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_iso_or_equiv", this);
        }

        public StrColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWyckoffSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "wyckoff_symbol", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquivEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B_iso_or_equiv_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBIsoOrEquivSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_iso_or_equiv_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_x_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnXSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_x_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnYEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_y_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnYSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_y_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "Cartn_z_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCartnZSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cartn_z_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_equiv_geom_mean_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquivEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U_iso_or_equiv_esd", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterUIsoOrEquivSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_iso_or_equiv_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_11_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_12_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_13_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_22_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_23_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_33_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTensorBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "tensor_beta", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_beta", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterTensorBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "tensor_beta_su", this);
        }

        public FloatColumnBuilder<AtomSiteBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_beta_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_11_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_12_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_13_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_22_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_23_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_33_su", this);
        }

    }

    public static class AtomSiteAnisoBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_site_aniso";

        public AtomSiteAnisoBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_11", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_12", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_13", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_22", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_23", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_33", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterBeta33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "beta_33_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixB() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_b", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixBSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_b_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixU() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_u", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixUSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_u_su", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymmform() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symmform", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][1]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "B[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterB33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "b_33_su", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterId() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "id", this);
        }

        public StrColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLabel() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "label", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixBeta() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_beta", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixBetaSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_beta_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_11_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_12_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[1][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_13_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][2]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_22_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[2][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_23_su", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Esd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "U[3][3]_esd", this);
        }

        public FloatColumnBuilder<AtomSiteAnisoBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterU33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "u_33_su", this);
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

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_11_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_12_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_13_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat21Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_21_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_22_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_23_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat31Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_31_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat32Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_32_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_33_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3_su", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVector() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_su", this);
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

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2", this);
        }

        public FloatColumnBuilder<AtomSitesCartnTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3", this);
        }

    }

    public static class AtomSitesFractTransformBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "atom_sites_fract_transform";

        public AtomSitesFractTransformBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat11Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_11_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat12Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_12_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat13Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_13_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat21Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_21_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat22Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_22_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat23Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_23_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat31Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_31_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat32Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_32_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMat33Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "mat_33_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrix() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMatrixSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "matrix_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec1Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_1_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec2Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_2_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVec3Su() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vec_3_su", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVector() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector", this);
        }

        public FloatColumnBuilder<AtomSitesFractTransformBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterVectorSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "vector_su", this);
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

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAnalyticalMassPercentSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "analytical_mass_percent_su", this);
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

        public IntColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterMassNumber() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "mass_number", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterScatCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "scat_Cromer_Mann_c", this);
        }

        public FloatColumnBuilder<AtomTypeBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_c", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_coeffs", this);
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

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExponentialPolynomialCoefs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "exponential_polynomial_coefs", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExponentialPolynomialCoefsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "exponential_polynomial_coefs_su", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExponentialPolynomialLowerLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "exponential_polynomial_lower_limit", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterExponentialPolynomialUpperLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "exponential_polynomial_upper_limit", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGaussianCoefs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gaussian_coefs", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGaussianCoefsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gaussian_coefs_su", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGaussianLowerLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gaussian_lower_limit", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGaussianUpperLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "gaussian_upper_limit", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC0() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_fox_c0", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_fox_c1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_fox_c2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxC3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_fox_c3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterHiAngFoxCoeffs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "hi_ang_fox_coeffs", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInvMottBetheCoefs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "inv_mott_bethe_coefs", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInvMottBetheCoefsSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "inv_mott_bethe_coefs_su", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInvMottBetheLowerLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "inv_mott_bethe_lower_limit", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterInvMottBetheUpperLimit() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "inv_mott_bethe_upper_limit", this);
        }

        public StrColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymbol() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symbol", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannA4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_a4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB1() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b1", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB2() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b2", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB3() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b3", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannB4() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_b4", this);
        }

        public FloatColumnBuilder<AtomTypeScatBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterCromerMannC() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "cromer_mann_c", this);
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

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityRMS() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_RMS", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDensityRms() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "density_rms", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterDiffDensityRMSEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "diff_density_RMS_esd", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_flack", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureFlackEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Flack_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlackSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_flack_su", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Rogers", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_rogers", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsAbsStructureRogersEsd() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_abs_structure_Rogers_esd", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogersSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_rogers_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_factor_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_gt", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRFsqdFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_Fsqd_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRIFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_R_I_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_i_factor", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_restrained_S_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsRestrainedSObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_restrained_S_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_gt", this);
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

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_all", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterLsWRFactorObs() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "ls_wR_factor_obs", this);
        }

        public FloatColumnBuilder<RefineBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_gt", this);
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
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "f_calc_details", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcFormula() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "f_calc_formula", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcPrecision() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_calc_precision", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterFCalcPrecisionSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "f_calc_precision_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterGoodnessOfFitRefSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "goodness_of_fit_ref_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSAllSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_all_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSGtSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_gt_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorRef() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_ref", this);
        }

        public StrColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureDetails() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_details", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlack() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_flack", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureFlackSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_flack_su", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogers() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_rogers", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAbsStructureRogersSu() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "abs_structure_rogers_su", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_i_factor", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRestrainedSGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "restrained_s_gt", this);
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

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_gt", this);
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
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_all", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFactorGt() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_factor_gt", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRFsqdFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_fsqd_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterRIFactor() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "r_i_factor", this);
        }

        public FloatColumnBuilder<RefineLsClassBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterWrFactorAll() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "wr_factor_all", this);
        }

    }

    public static class FunctionBuilder extends CifCoreCategoryBuilder {
        private static final String CATEGORY_NAME = "function";

        public FunctionBuilder(CifCoreBlockBuilder parent) {
            super(CATEGORY_NAME, parent);
        }

        public StrColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterAtomtype() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "atomtype", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterClosest() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "closest", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSeitzfromjones() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "seitzfromjones", this);
        }

        public FloatColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymequiv() {
            return new FloatColumnBuilderImpl<>(CATEGORY_NAME, "symequiv", this);
        }

        public IntColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymkey() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "symkey", this);
        }

        public IntColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymlat() {
            return new IntColumnBuilderImpl<>(CATEGORY_NAME, "symlat", this);
        }

        public StrColumnBuilder<FunctionBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSymop() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "symop", this);
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

        public StrColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpaceGroupNameH_M() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "space_group_name_H-M", this);
        }

        public StrColumnBuilder<SymmetryBuilder, CifCoreBlockBuilder, CifCoreFileBuilder> enterSpaceGroupNameHall() {
            return new StrColumnBuilderImpl<>(CATEGORY_NAME, "space_group_name_Hall", this);
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