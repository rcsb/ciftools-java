package org.rcsb.cif.model.emshadowing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmShadowing extends BaseCategory {
    public EmShadowing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmShadowing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmShadowing(String name) {
        super(name);
    }

    /**
     * The shadowing angle (degrees)
     * @return Angle
     */
    public Angle getAngle() {
        return (Angle) (isText ? textFields.computeIfAbsent("angle",
                Angle::new) : getBinaryColumn("angle"));
    }

    /**
     * Additional details about specimen shadowing
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * The material used in the shadowing.
     * @return Material
     */
    public Material getMaterial() {
        return (Material) (isText ? textFields.computeIfAbsent("material",
                Material::new) : getBinaryColumn("material"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * Thickness of the deposited shadow coat, in Angstroms.
     * @return Thickness
     */
    public Thickness getThickness() {
        return (Thickness) (isText ? textFields.computeIfAbsent("thickness",
                Thickness::new) : getBinaryColumn("thickness"));
    }
}
