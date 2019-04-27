package org.rcsb.cif.model.emsupportfilm;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmSupportFilm extends BaseCategory {
    public EmSupportFilm(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSupportFilm(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSupportFilm(String name) {
        super(name);
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
     * The support material covering the em grid.
     * @return Material
     */
    public Material getMaterial() {
        return (Material) (isText ? textFields.computeIfAbsent("material",
                Material::new) : getBinaryColumn("material"));
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
     * Thickness of the support film, in Angstroms
     * @return Thickness
     */
    public Thickness getThickness() {
        return (Thickness) (isText ? textFields.computeIfAbsent("thickness",
                Thickness::new) : getBinaryColumn("thickness"));
    }

    /**
     * The topology of the material from which the grid is made.
     * @return Topology
     */
    public Topology getTopology() {
        return (Topology) (isText ? textFields.computeIfAbsent("topology",
                Topology::new) : getBinaryColumn("topology"));
    }
}
