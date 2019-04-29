package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_VALIDATION_FSC_CURVE category
 * record details of the Fourier Shell Correlation (FSC) curve file.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * FSC file name.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file", SingleRowStrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * This data item provides a unique identifier for each archived FSC curve.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }
}
