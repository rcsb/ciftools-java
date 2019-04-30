package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Listing of all layer line files associated with the EM entry
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmInterpretFigure extends BaseCategory {
    public EmInterpretFigure(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmInterpretFigure(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmInterpretFigure(String name) {
        super(name);
    }

    /**
     * Details about the image file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The name of the image file associated with the map entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file", SingleRowStrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the image file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }
}
