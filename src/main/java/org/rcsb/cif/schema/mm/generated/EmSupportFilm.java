package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The support material covering the em grid.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("material", StrColumn::new) :
                getBinaryColumn("material"));
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_support_id", StrColumn::new) :
                getBinaryColumn("sample_support_id"));
    }

    /**
     * Thickness of the support film, in Angstroms
     * @return FloatColumn
     */
    public FloatColumn getThickness() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("thickness", FloatColumn::new) :
                getBinaryColumn("thickness"));
    }

    /**
     * The topology of the material from which the grid is made.
     * @return StrColumn
     */
    public StrColumn getTopology() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("topology", StrColumn::new) :
                getBinaryColumn("topology"));
    }
}
