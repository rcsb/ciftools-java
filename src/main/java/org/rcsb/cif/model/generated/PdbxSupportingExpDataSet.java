package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
 * to experimental data set dependencies for this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxSupportingExpDataSet extends BaseCategory {
    public PdbxSupportingExpDataSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSupportingExpDataSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSupportingExpDataSet(String name) {
        super(name);
    }

    /**
     * Ordinal identifier for each experimental data set.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The type of the experimenatal data set.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_content_type", StrColumn::new) :
                getBinaryColumn("data_content_type"));
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return IntColumn
     */
    public IntColumn getDataVersionMajor() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("data_version_major", IntColumn::new) :
                getBinaryColumn("data_version_major"));
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return IntColumn
     */
    public IntColumn getDataVersionMinor() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("data_version_minor", IntColumn::new) :
                getBinaryColumn("data_version_minor"));
    }

    /**
     * Additional details describing the content of the supporting data set and its application to
     * the current investigation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
