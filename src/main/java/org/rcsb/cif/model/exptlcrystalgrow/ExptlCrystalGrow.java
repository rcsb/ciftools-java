package org.rcsb.cif.model.exptlcrystalgrow;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExptlCrystalGrow extends BaseCategory {
    public ExptlCrystalGrow(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ExptlCrystalGrow(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ExptlCrystalGrow(String name) {
        super(name);
    }

    /**
     * The physical apparatus in which the crystal was grown.
     * @return Apparatus
     */
    public Apparatus getApparatus() {
        return (Apparatus) (isText ? textFields.computeIfAbsent("apparatus",
                Apparatus::new) : getBinaryColumn("apparatus"));
    }

    /**
     * The nature of the gas or gas mixture in which the crystal was
     * grown.
     * @return Atmosphere
     */
    public Atmosphere getAtmosphere() {
        return (Atmosphere) (isText ? textFields.computeIfAbsent("atmosphere",
                Atmosphere::new) : getBinaryColumn("atmosphere"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * A description of special aspects of the crystal growth.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The method used to grow the crystals.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * A literature reference that describes the method used to grow
     * the crystals.
     * @return MethodRef
     */
    public MethodRef getMethodRef() {
        return (MethodRef) (isText ? textFields.computeIfAbsent("method_ref",
                MethodRef::new) : getBinaryColumn("method_ref"));
    }

    /**
     * The pH at which the crystal was grown. If more than one pH was
     * employed during the crystallization process, the final pH should
     * be noted here and the protocol involving multiple pH values
     * should be described in _exptl_crystal_grow.details.
     * @return PH
     */
    public PH getPH() {
        return (PH) (isText ? textFields.computeIfAbsent("pH",
                PH::new) : getBinaryColumn("pH"));
    }

    /**
     * The ambient pressure in kilopascals at which the crystal was
     * grown.
     * @return Pressure
     */
    public Pressure getPressure() {
        return (Pressure) (isText ? textFields.computeIfAbsent("pressure",
                Pressure::new) : getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.pressure.
     * @return PressureEsd
     */
    public PressureEsd getPressureEsd() {
        return (PressureEsd) (isText ? textFields.computeIfAbsent("pressure_esd",
                PressureEsd::new) : getBinaryColumn("pressure_esd"));
    }

    /**
     * A description of the protocol used for seeding the crystal
     * growth.
     * @return Seeding
     */
    public Seeding getSeeding() {
        return (Seeding) (isText ? textFields.computeIfAbsent("seeding",
                Seeding::new) : getBinaryColumn("seeding"));
    }

    /**
     * A literature reference that describes the protocol used to seed
     * the crystal.
     * @return SeedingRef
     */
    public SeedingRef getSeedingRef() {
        return (SeedingRef) (isText ? textFields.computeIfAbsent("seeding_ref",
                SeedingRef::new) : getBinaryColumn("seeding_ref"));
    }

    /**
     * The temperature in kelvins at which the crystal was grown.
     * If more than one temperature was employed during the
     * crystallization process, the final temperature should be noted
     * here and the protocol  involving multiple temperatures should be
     * described in _exptl_crystal_grow.details.
     * @return Temp
     */
    public Temp getTemp() {
        return (Temp) (isText ? textFields.computeIfAbsent("temp",
                Temp::new) : getBinaryColumn("temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * crystal growth.
     * @return TempDetails
     */
    public TempDetails getTempDetails() {
        return (TempDetails) (isText ? textFields.computeIfAbsent("temp_details",
                TempDetails::new) : getBinaryColumn("temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.temp.
     * @return TempEsd
     */
    public TempEsd getTempEsd() {
        return (TempEsd) (isText ? textFields.computeIfAbsent("temp_esd",
                TempEsd::new) : getBinaryColumn("temp_esd"));
    }

    /**
     * The approximate time that the crystal took to grow to the size
     * used for data collection.
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }

    /**
     * Text description of crystal growth procedure.
     * @return PdbxDetails
     */
    public PdbxDetails getPdbxDetails() {
        return (PdbxDetails) (isText ? textFields.computeIfAbsent("pdbx_details",
                PdbxDetails::new) : getBinaryColumn("pdbx_details"));
    }

    /**
     * The range of pH values at which the crystal was grown.   Used when
     * a point estimate of pH is not appropriate.
     * @return PdbxPHRange
     */
    public PdbxPHRange getPdbxPHRange() {
        return (PdbxPHRange) (isText ? textFields.computeIfAbsent("pdbx_pH_range",
                PdbxPHRange::new) : getBinaryColumn("pdbx_pH_range"));
    }
}
