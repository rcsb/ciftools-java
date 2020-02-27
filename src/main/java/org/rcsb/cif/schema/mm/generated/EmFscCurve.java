package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_VALIDATION_FSC_CURVE category
 * record details of the Fourier Shell Correlation (FSC) curve file.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * FSC file name.
     * @return StrColumn
     */
    public StrColumn getFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file", StrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item provides a unique identifier for each archived FSC curve.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
