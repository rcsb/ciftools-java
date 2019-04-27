package org.rcsb.cif.model.emgridpretreatment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmGridPretreatment extends BaseCategory {
    public EmGridPretreatment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmGridPretreatment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmGridPretreatment(String name) {
        super(name);
    }

    /**
     * The atmosphere used for glow discharge of the em grid.
     * @return Atmosphere
     */
    public Atmosphere getAtmosphere() {
        return (Atmosphere) (isText ? textFields.computeIfAbsent("atmosphere",
                Atmosphere::new) : getBinaryColumn("atmosphere"));
    }

    /**
     * This data item is the primary key of the category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Pressure of the glow discharge chamber, in pascals
     * @return Pressure
     */
    public Pressure getPressure() {
        return (Pressure) (isText ? textFields.computeIfAbsent("pressure",
                Pressure::new) : getBinaryColumn("pressure"));
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return SampleSupportId
     */
    public SampleSupportId getSampleSupportId() {
        return (SampleSupportId) (isText ? textFields.computeIfAbsent("sample_support_id",
                SampleSupportId::new) : getBinaryColumn("sample_support_id"));
    }

    /**
     * Time period for glow discharge of the em grid, in seconds
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }

    /**
     * Type of grid pretreatment
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
