package org.rcsb.cif.model.generated.diffrnradiationwavelength;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnRadiationWavelength extends BaseCategory {
    public DiffrnRadiationWavelength(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnRadiationWavelength(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnRadiationWavelength(String name) {
        super(name);
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The radiation wavelength in angstroms.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * The relative weight of a wavelength identified by the code
     * _diffrn_radiation_wavelength.id in the list of wavelengths.
     * @return Wt
     */
    public Wt getWt() {
        return (Wt) (isText ? textFields.computeIfAbsent("wt",
                Wt::new) : getBinaryColumn("wt"));
    }
}
