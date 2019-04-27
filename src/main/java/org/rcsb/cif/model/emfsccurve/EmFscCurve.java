package org.rcsb.cif.model.emfsccurve;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmFscCurve extends BaseCategory {
    public EmFscCurve(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFscCurve(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFscCurve(String name) {
        super(name);
    }

    /**
     * Details about the FSC file.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * FSC file name.
     * @return File
     */
    public File getFile() {
        return (File) (isText ? textFields.computeIfAbsent("file",
                File::new) : getBinaryColumn("file"));
    }

    /**
     * This data item provides a unique identifier for each archived FSC curve.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
