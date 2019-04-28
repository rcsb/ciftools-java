package org.rcsb.cif.model.generated.embuffercomponent;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmBufferComponent extends BaseCategory {
    public EmBufferComponent(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmBufferComponent(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmBufferComponent(String name) {
        super(name);
    }

    /**
     * Foreign key to the entry category.
     * @return BufferId
     */
    public BufferId getBufferId() {
        return (BufferId) (isText ? textFields.computeIfAbsent("buffer_id",
                BufferId::new) : getBinaryColumn("buffer_id"));
    }

    /**
     * The concentration of the sample (arbitrary units).
     * @return Concentration
     */
    public Concentration getConcentration() {
        return (Concentration) (isText ? textFields.computeIfAbsent("concentration",
                Concentration::new) : getBinaryColumn("concentration"));
    }

    /**
     * Units for the sample concentration value.
     * @return ConcentrationUnits
     */
    public ConcentrationUnits getConcentrationUnits() {
        return (ConcentrationUnits) (isText ? textFields.computeIfAbsent("concentration_units",
                ConcentrationUnits::new) : getBinaryColumn("concentration_units"));
    }

    /**
     * formula for buffer component
     * @return Formula
     */
    public Formula getFormula() {
        return (Formula) (isText ? textFields.computeIfAbsent("formula",
                Formula::new) : getBinaryColumn("formula"));
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
     * name of the buffer component
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }
}
