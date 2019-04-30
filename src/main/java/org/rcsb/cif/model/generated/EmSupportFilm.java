package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items to describe films supporting the specimen
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The support material covering the em grid.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("material", SingleRowStrColumn::new) :
                getBinaryColumn("material"));
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleSupportId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", SingleRowStrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * Thickness of the support film, in Angstroms
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getThickness() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("thickness", SingleRowFloatColumn::new) :
                getBinaryColumn("thickness"));
    }

    /**
     * The topology of the material from which the grid is made.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTopology() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("topology", SingleRowStrColumn::new) :
                getBinaryColumn("topology"));
    }
}
