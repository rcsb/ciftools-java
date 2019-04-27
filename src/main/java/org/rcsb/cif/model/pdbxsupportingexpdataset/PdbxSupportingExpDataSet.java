package org.rcsb.cif.model.pdbxsupportingexpdataset;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The type of the experimenatal data set.
     * @return DataContentType
     */
    public DataContentType getDataContentType() {
        return (DataContentType) (isText ? textFields.computeIfAbsent("data_content_type",
                DataContentType::new) : getBinaryColumn("data_content_type"));
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return DataVersionMajor
     */
    public DataVersionMajor getDataVersionMajor() {
        return (DataVersionMajor) (isText ? textFields.computeIfAbsent("data_version_major",
                DataVersionMajor::new) : getBinaryColumn("data_version_major"));
    }

    /**
     * The major version on data of the experimental data content on which this entry depends.
     * @return DataVersionMinor
     */
    public DataVersionMinor getDataVersionMinor() {
        return (DataVersionMinor) (isText ? textFields.computeIfAbsent("data_version_minor",
                DataVersionMinor::new) : getBinaryColumn("data_version_minor"));
    }

    /**
     * Additional details describing the content of the supporting data set and its application to
     * the current investigation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
