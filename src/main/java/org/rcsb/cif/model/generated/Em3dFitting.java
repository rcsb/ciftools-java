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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry_id in
     * the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The method used to fit atomic coordinates
     * into the 3dem reconstructed map.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The measure used to assess quality of fit of the atomic coordinates in the
     * 3DEM map volume.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTargetCriteria() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("target_criteria", SingleRowStrColumn::new) :
                getBinaryColumn("target_criteria"));
    }

    /**
     * The software used for fitting atomic coordinates to the map.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSoftwareName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("software_name", SingleRowStrColumn::new) :
                getBinaryColumn("software_name"));
    }

    /**
     * Any additional details regarding fitting of atomic coordinates into
     * the 3DEM volume, including data and considerations from other
     * methods used in computation of the model.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The overall B (temperature factor) value for the 3d-em volume.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOverallBValue() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("overall_b_value", SingleRowFloatColumn::new) :
                getBinaryColumn("overall_b_value"));
    }

    /**
     * A flag to indicate whether fitting was carried out in real
     * or reciprocal refinement space.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefSpace() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ref_space", SingleRowStrColumn::new) :
                getBinaryColumn("ref_space"));
    }

    /**
     * The refinement protocol used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefProtocol() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ref_protocol", SingleRowStrColumn::new) :
                getBinaryColumn("ref_protocol"));
    }
}
