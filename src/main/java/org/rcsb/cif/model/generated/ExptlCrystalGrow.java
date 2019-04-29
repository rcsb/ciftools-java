package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL_GROW category record details
 * about the conditions and methods used to grow the crystal.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getApparatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("apparatus", SingleRowStrColumn::new) :
                getBinaryColumn("apparatus"));
    }

    /**
     * The nature of the gas or gas mixture in which the crystal was
     * grown.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAtmosphere() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("atmosphere", SingleRowStrColumn::new) :
                getBinaryColumn("atmosphere"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_id", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * A description of special aspects of the crystal growth.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The method used to grow the crystals.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * A literature reference that describes the method used to grow
     * the crystals.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethodRef() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method_ref", SingleRowStrColumn::new) :
                getBinaryColumn("method_ref"));
    }

    /**
     * The pH at which the crystal was grown. If more than one pH was
     * employed during the crystallization process, the final pH should
     * be noted here and the protocol involving multiple pH values
     * should be described in _exptl_crystal_grow.details.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPH() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pH", SingleRowFloatColumn::new) :
                getBinaryColumn("pH"));
    }

    /**
     * The ambient pressure in kilopascals at which the crystal was
     * grown.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPressure() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pressure", SingleRowFloatColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.pressure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPressureEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pressure_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("pressure_esd"));
    }

    /**
     * A description of the protocol used for seeding the crystal
     * growth.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSeeding() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("seeding", SingleRowStrColumn::new) :
                getBinaryColumn("seeding"));
    }

    /**
     * A literature reference that describes the protocol used to seed
     * the crystal.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSeedingRef() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("seeding_ref", SingleRowStrColumn::new) :
                getBinaryColumn("seeding_ref"));
    }

    /**
     * The temperature in kelvins at which the crystal was grown.
     * If more than one temperature was employed during the
     * crystallization process, the final temperature should be noted
     * here and the protocol  involving multiple temperatures should be
     * described in _exptl_crystal_grow.details.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTemp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temp", SingleRowFloatColumn::new) :
                getBinaryColumn("temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * crystal growth.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTempDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("temp_details", SingleRowStrColumn::new) :
                getBinaryColumn("temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _exptl_crystal_grow.temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTempEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("temp_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("temp_esd"));
    }

    /**
     * The approximate time that the crystal took to grow to the size
     * used for data collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTime() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("time", SingleRowStrColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Text description of crystal growth procedure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_details"));
    }

    /**
     * The range of pH values at which the crystal was grown.   Used when
     * a point estimate of pH is not appropriate.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPHRange() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_pH_range", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_pH_range"));
    }
}
