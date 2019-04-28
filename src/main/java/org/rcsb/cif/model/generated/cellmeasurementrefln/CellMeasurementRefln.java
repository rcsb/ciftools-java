package org.rcsb.cif.model.generated.cellmeasurementrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CellMeasurementRefln extends BaseCategory {
    public CellMeasurementRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public CellMeasurementRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public CellMeasurementRefln(String name) {
        super(name);
    }

    /**
     * Miller index h of a reflection used for measurement of the unit
     * cell.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection used for measurement of the unit
     * cell.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection used for measurement of the unit
     * cell.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * Theta angle for a reflection used for measurement of
     * the unit cell in degrees.
     * @return Theta
     */
    public Theta getTheta() {
        return (Theta) (isText ? textFields.computeIfAbsent("theta",
                Theta::new) : getBinaryColumn("theta"));
    }
}
