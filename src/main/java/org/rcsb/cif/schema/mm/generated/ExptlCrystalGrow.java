package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL_GROW category record details
 * about the conditions and methods used to grow the crystal.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getApparatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("apparatus", StrColumn::new) :
                getBinaryColumn("apparatus"));
    }

    /**
     * The nature of the gas or gas mixture in which the crystal was
     * grown.
     * @return StrColumn
     */
    public StrColumn getAtmosphere() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atmosphere", StrColumn::new) :
                getBinaryColumn("atmosphere"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * A description of special aspects of the crystal growth.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The method used to grow the crystals.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * A literature reference that describes the method used to grow
     * the crystals.
     * @return StrColumn
     */
    public StrColumn getMethodRef() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method_ref", StrColumn::new) :
                getBinaryColumn("method_ref"));
    }

    /**
     * The pH at which the crystal was grown. If more than one pH was
     * employed during the crystallization process, the final pH should
     * be noted here and the protocol involving multiple pH values
     * should be described in _exptl_crystal_grow.details.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pH", FloatColumn::new) :
                getBinaryColumn("pH"));
    }

    /**
     * The ambient pressure in kilopascals at which the crystal was
     * grown.
     * @return FloatColumn
     */
    public FloatColumn getPressure() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure", FloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure_esd", FloatColumn::new) :
                getBinaryColumn("pressure_esd"));
    }

    /**
     * A description of the protocol used for seeding the crystal
     * growth.
     * @return StrColumn
     */
    public StrColumn getSeeding() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seeding", StrColumn::new) :
                getBinaryColumn("seeding"));
    }

    /**
     * A literature reference that describes the protocol used to seed
     * the crystal.
     * @return StrColumn
     */
    public StrColumn getSeedingRef() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seeding_ref", StrColumn::new) :
                getBinaryColumn("seeding_ref"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp", FloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * crystal growth.
     * @return StrColumn
     */
    public StrColumn getTempDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("temp_details", StrColumn::new) :
                getBinaryColumn("temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.temp.
     * @return FloatColumn
     */
    public FloatColumn getTempEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temp_esd", FloatColumn::new) :
                getBinaryColumn("temp_esd"));
    }

    /**
     * The approximate time that the crystal took to grow to the size
     * used for data collection.
     * @return StrColumn
     */
    public StrColumn getTime() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("time", StrColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Text description of crystal growth procedure.
     * @return StrColumn
     */
    public StrColumn getPdbxDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_details", StrColumn::new) :
                getBinaryColumn("pdbx_details"));
    }

    /**
     * The range of pH values at which the crystal was grown.   Used when
     * a point estimate of pH is not appropriate.
     * @return StrColumn
     */
    public StrColumn getPdbxPHRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_pH_range", StrColumn::new) :
                getBinaryColumn("pdbx_pH_range"));
    }
}
