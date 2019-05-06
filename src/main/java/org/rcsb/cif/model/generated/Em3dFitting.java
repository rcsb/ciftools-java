package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the 3D_FITTING category
 * record details of the method of fitting atomic
 * coordinates from a PDB file into a 3d-em
 * volume map file
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Em3dFitting extends BaseCategory {
    public Em3dFitting(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em3dFitting(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em3dFitting(String name) {
        super(name);
    }

    /**
     * The value of _em_3d_fitting.id must uniquely identify
     * a fitting procedure of atomic coordinates
     * into 3dem reconstructed map volume.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry_id in
     * the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The method used to fit atomic coordinates
     * into the 3dem reconstructed map.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The measure used to assess quality of fit of the atomic coordinates in the
     * 3DEM map volume.
     * @return StrColumn
     */
    public StrColumn getTargetCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("target_criteria", StrColumn::new) :
                getBinaryColumn("target_criteria"));
    }

    /**
     * The software used for fitting atomic coordinates to the map.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_name", StrColumn::new) :
                getBinaryColumn("software_name"));
    }

    /**
     * Any additional details regarding fitting of atomic coordinates into
     * the 3DEM volume, including data and considerations from other
     * methods used in computation of the model.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The overall B (temperature factor) value for the 3d-em volume.
     * @return FloatColumn
     */
    public FloatColumn getOverallBValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("overall_b_value", FloatColumn::new) :
                getBinaryColumn("overall_b_value"));
    }

    /**
     * A flag to indicate whether fitting was carried out in real
     * or reciprocal refinement space.
     * @return StrColumn
     */
    public StrColumn getRefSpace() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_space", StrColumn::new) :
                getBinaryColumn("ref_space"));
    }

    /**
     * The refinement protocol used.
     * @return StrColumn
     */
    public StrColumn getRefProtocol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_protocol", StrColumn::new) :
                getBinaryColumn("ref_protocol"));
    }
}
