package org.rcsb.cif.model.eminterpretfigure;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The name of the image file associated with the map entry
     * @return File
     */
    public File getFile() {
        return (File) (isText ? textFields.computeIfAbsent("file",
                File::new) : getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the image file.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
