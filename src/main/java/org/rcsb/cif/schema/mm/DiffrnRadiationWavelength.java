package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_RADIATION_WAVELENGTH category
 * describe the wavelength of the radiation used to measure the
 * diffraction intensities. Items may be looped to identify
 * and assign weights to distinct components of a
 * polychromatic beam.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnRadiationWavelength extends DelegatingCategory {
    public DiffrnRadiationWavelength(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "wavelength":
                return getWavelength();
            case "wt":
                return getWt();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The code identifying each value of
     * _diffrn_radiation_wavelength.wavelength.
     * Items in the DIFFRN_RADIATION_WAVELENGTH category are looped
     * when multiple wavelengths are used.
     * 
     * This code is used to link with the DIFFRN_REFLN category.
     * The _diffrn_refln.wavelength_id codes must match one of
     * the codes defined in this category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The radiation wavelength in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * The relative weight of a wavelength identified by the code
     * _diffrn_radiation_wavelength.id in the list of wavelengths.
     * @return FloatColumn
     */
    public FloatColumn getWt() {
        return delegate.getColumn("wt", DelegatingFloatColumn::new);
    }

}