package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EXPTL_CRYSTAL_GROW category record details
 * about the conditions and methods used to grow the crystal.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalGrow extends DelegatingCategory {
    public ExptlCrystalGrow(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "apparatus":
                return getApparatus();
            case "atmosphere":
                return getAtmosphere();
            case "crystal_id":
                return getCrystalId();
            case "details":
                return getDetails();
            case "method":
                return getMethod();
            case "method_ref":
                return getMethodRef();
            case "pH":
                return getPH();
            case "pressure":
                return getPressure();
            case "pressure_esd":
                return getPressureEsd();
            case "seeding":
                return getSeeding();
            case "seeding_ref":
                return getSeedingRef();
            case "temp_details":
                return getTempDetails();
            case "temp_esd":
                return getTempEsd();
            case "time":
                return getTime();
            case "pdbx_details":
                return getPdbxDetails();
            case "pdbx_pH_range":
                return getPdbxPHRange();
            case "temp":
                return getTemp();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The physical apparatus in which the crystal was grown.
     * @return StrColumn
     */
    public StrColumn getApparatus() {
        return delegate.getColumn("apparatus", DelegatingStrColumn::new);
    }

    /**
     * The nature of the gas or gas mixture in which the crystal was
     * grown.
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return delegate.getColumn("atmosphere", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the crystal growth.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The method used to grow the crystals.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * A literature reference that describes the method used to grow
     * the crystals.
     * @return StrColumn
     */
    public StrColumn getMethodRef() {
        return delegate.getColumn("method_ref", DelegatingStrColumn::new);
    }

    /**
     * The pH at which the crystal was grown. If more than one pH was
     * employed during the crystallization process, the final pH should
     * be noted here and the protocol involving multiple pH values
     * should be described in _exptl_crystal_grow.details.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return delegate.getColumn("pH", DelegatingFloatColumn::new);
    }

    /**
     * The ambient pressure in kilopascals at which the crystal was
     * grown.
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return delegate.getColumn("pressure", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureEsd() {
        return delegate.getColumn("pressure_esd", DelegatingFloatColumn::new);
    }

    /**
     * A description of the protocol used for seeding the crystal
     * growth.
     * @return StrColumn
     */
    public StrColumn getSeeding() {
        return delegate.getColumn("seeding", DelegatingStrColumn::new);
    }

    /**
     * A literature reference that describes the protocol used to seed
     * the crystal.
     * @return StrColumn
     */
    public StrColumn getSeedingRef() {
        return delegate.getColumn("seeding_ref", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of temperature control during
     * crystal growth.
     * @return StrColumn
     */
    public StrColumn getTempDetails() {
        return delegate.getColumn("temp_details", DelegatingStrColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.temp.
     * @return FloatColumn
     */
    public FloatColumn getTempEsd() {
        return delegate.getColumn("temp_esd", DelegatingFloatColumn::new);
    }

    /**
     * The approximate time that the crystal took to grow to the size
     * used for data collection.
     * @return StrColumn
     */
    public StrColumn getTime() {
        return delegate.getColumn("time", DelegatingStrColumn::new);
    }

    /**
     * Text description of crystal growth procedure.
     * @return StrColumn
     */
    public StrColumn getPdbxDetails() {
        return delegate.getColumn("pdbx_details", DelegatingStrColumn::new);
    }

    /**
     * The range of pH values at which the crystal was grown.   Used when
     * a point estimate of pH is not appropriate.
     * @return StrColumn
     */
    public StrColumn getPdbxPHRange() {
        return delegate.getColumn("pdbx_pH_range", DelegatingStrColumn::new);
    }

    /**
     * The temperature in kelvins at which the crystal was grown.
     * If more than one temperature was employed during the
     * crystallization process, the final temperature should be noted
     * here and the protocol  involving multiple temperatures should be
     * described in _exptl_crystal_grow.details.
     * @return FloatColumn
     */
    public FloatColumn getTemp() {
        return delegate.getColumn("temp", DelegatingFloatColumn::new);
    }

}