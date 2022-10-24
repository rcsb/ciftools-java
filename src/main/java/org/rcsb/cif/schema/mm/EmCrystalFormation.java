package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of growth of a 2D, 3D, or helical crystal array.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmCrystalFormation extends DelegatingCategory {
    public EmCrystalFormation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atmosphere":
                return getAtmosphere();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "instrument":
                return getInstrument();
            case "lipid_mixture":
                return getLipidMixture();
            case "lipid_protein_ratio":
                return getLipidProteinRatio();
            case "specimen_id":
                return getSpecimenId();
            case "temperature":
                return getTemperature();
            case "time":
                return getTime();
            case "time_unit":
                return getTimeUnit();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The type of atmosphere in which crystals were grown
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return delegate.getColumn("atmosphere", DelegatingStrColumn::new);
    }

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Instrument used to prepare the crystalline array
     * @return StrColumn
     */
    public StrColumn getInstrument() {
        return delegate.getColumn("instrument", DelegatingStrColumn::new);
    }

    /**
     * Description of the lipid mixture used for crystallization
     * @return StrColumn
     */
    public StrColumn getLipidMixture() {
        return delegate.getColumn("lipid_mixture", DelegatingStrColumn::new);
    }

    /**
     * The molar ratio of lipid to protein in the crystallized sample
     * @return FloatColumn
     */
    public FloatColumn getLipidProteinRatio() {
        return delegate.getColumn("lipid_protein_ratio", DelegatingFloatColumn::new);
    }

    /**
     * Foreign key relationship to the em_specimen category
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * The value of the temperature in kelvin used for
     * growing the crystals.
     * @return IntColumn
     */
    public IntColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingIntColumn::new);
    }

    /**
     * Time period for array crystallization, in time unit indicated (min, hr, day, month, year)
     * @return IntColumn
     */
    public IntColumn getTime() {
        return delegate.getColumn("time", DelegatingIntColumn::new);
    }

    /**
     * Time unit for array crystallization
     * @return StrColumn
     */
    public StrColumn getTimeUnit() {
        return delegate.getColumn("time_unit", DelegatingStrColumn::new);
    }

}