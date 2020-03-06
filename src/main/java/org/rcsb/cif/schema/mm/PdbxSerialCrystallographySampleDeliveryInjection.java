package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
 * category record details about sample delivery by injection
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDeliveryInjection extends DelegatingCategory {
    public PdbxSerialCrystallographySampleDeliveryInjection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "description":
                return getDescription();
            case "injector_diameter":
                return getInjectorDiameter();
            case "injector_temperature":
                return getInjectorTemperature();
            case "injector_pressure":
                return getInjectorPressure();
            case "flow_rate":
                return getFlowRate();
            case "carrier_solvent":
                return getCarrierSolvent();
            case "crystal_concentration":
                return getCrystalConcentration();
            case "preparation":
                return getPreparation();
            case "power_by":
                return getPowerBy();
            case "injector_nozzle":
                return getInjectorNozzle();
            case "jet_diameter":
                return getJetDiameter();
            case "filter_size":
                return getFilterSize();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * For continuous sample flow experiments, a description of the injector used
     * to move the sample into the beam.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * For continuous sample flow experiments, the diameter of the
     * injector in micrometres.
     * @return FloatColumn
     */
    public FloatColumn getInjectorDiameter() {
        return delegate.getColumn("injector_diameter", DelegatingFloatColumn::new);
    }

    /**
     * For continuous sample flow experiments, the temperature in
     * Kelvins of the speciman injected. This may be different from
     * the temperature of the sample.
     * @return FloatColumn
     */
    public FloatColumn getInjectorTemperature() {
        return delegate.getColumn("injector_temperature", DelegatingFloatColumn::new);
    }

    /**
     * For continuous sample flow experiments, the mean pressure
     * in kilopascals at which the sample is injected into the beam.
     * @return FloatColumn
     */
    public FloatColumn getInjectorPressure() {
        return delegate.getColumn("injector_pressure", DelegatingFloatColumn::new);
    }

    /**
     * For continuous sample flow experiments, the flow rate of
     * solution being injected  measured in ul/min.
     * @return FloatColumn
     */
    public FloatColumn getFlowRate() {
        return delegate.getColumn("flow_rate", DelegatingFloatColumn::new);
    }

    /**
     * For continuous sample flow experiments, the carrier buffer used
     * to move the sample into the beam. Should include protein
     * concentration.
     * @return StrColumn
     */
    public StrColumn getCarrierSolvent() {
        return delegate.getColumn("carrier_solvent", DelegatingStrColumn::new);
    }

    /**
     * For continuous sample flow experiments, the concentration of
     * crystals in the solution being injected.
     * 
     * The concentration is measured in million crystals/ml.
     * @return FloatColumn
     */
    public FloatColumn getCrystalConcentration() {
        return delegate.getColumn("crystal_concentration", DelegatingFloatColumn::new);
    }

    /**
     * Details of crystal growth and preparation of the crystals
     * @return StrColumn
     */
    public StrColumn getPreparation() {
        return delegate.getColumn("preparation", DelegatingStrColumn::new);
    }

    /**
     * Sample deliver driving force, e.g. Gas, Electronic Potential
     * @return StrColumn
     */
    public StrColumn getPowerBy() {
        return delegate.getColumn("power_by", DelegatingStrColumn::new);
    }

    /**
     * The type of nozzle to deliver and focus sample jet
     * @return StrColumn
     */
    public StrColumn getInjectorNozzle() {
        return delegate.getColumn("injector_nozzle", DelegatingStrColumn::new);
    }

    /**
     * Diameter in micrometres of jet stream of sample delivery
     * @return FloatColumn
     */
    public FloatColumn getJetDiameter() {
        return delegate.getColumn("jet_diameter", DelegatingFloatColumn::new);
    }

    /**
     * The size of filter in micrometres in filtering crystals
     * @return FloatColumn
     */
    public FloatColumn getFilterSize() {
        return delegate.getColumn("filter_size", DelegatingFloatColumn::new);
    }

}