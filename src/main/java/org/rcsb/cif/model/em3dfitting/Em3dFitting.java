package org.rcsb.cif.model.em3dfitting;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _entry_id in
     * the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The method used to fit atomic coordinates
     * into the 3dem reconstructed map.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The measure used to assess quality of fit of the atomic coordinates in the
     * 3DEM map volume.
     * @return TargetCriteria
     */
    public TargetCriteria getTargetCriteria() {
        return (TargetCriteria) (isText ? textFields.computeIfAbsent("target_criteria",
                TargetCriteria::new) : getBinaryColumn("target_criteria"));
    }

    /**
     * The software used for fitting atomic coordinates to the map.
     * @return SoftwareName
     */
    public SoftwareName getSoftwareName() {
        return (SoftwareName) (isText ? textFields.computeIfAbsent("software_name",
                SoftwareName::new) : getBinaryColumn("software_name"));
    }

    /**
     * Any additional details regarding fitting of atomic coordinates into
     * the 3DEM volume, including data and considerations from other
     * methods used in computation of the model.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The overall B (temperature factor) value for the 3d-em volume.
     * @return OverallBValue
     */
    public OverallBValue getOverallBValue() {
        return (OverallBValue) (isText ? textFields.computeIfAbsent("overall_b_value",
                OverallBValue::new) : getBinaryColumn("overall_b_value"));
    }

    /**
     * A flag to indicate whether fitting was carried out in real
     * or reciprocal refinement space.
     * @return RefSpace
     */
    public RefSpace getRefSpace() {
        return (RefSpace) (isText ? textFields.computeIfAbsent("ref_space",
                RefSpace::new) : getBinaryColumn("ref_space"));
    }

    /**
     * The refinement protocol used.
     * @return RefProtocol
     */
    public RefProtocol getRefProtocol() {
        return (RefProtocol) (isText ? textFields.computeIfAbsent("ref_protocol",
                RefProtocol::new) : getBinaryColumn("ref_protocol"));
    }
}
