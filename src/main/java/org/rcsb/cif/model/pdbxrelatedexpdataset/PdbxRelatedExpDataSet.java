package org.rcsb.cif.model.pdbxrelatedexpdataset;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRelatedExpDataSet extends BaseCategory {
    public PdbxRelatedExpDataSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRelatedExpDataSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRelatedExpDataSet(String name) {
        super(name);
    }

    /**
     * Ordinal identifier for each related experimental data set.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * A DOI reference to the related data set.
     * @return DataReference
     */
    public DataReference getDataReference() {
        return (DataReference) (isText ? textFields.computeIfAbsent("data_reference",
                DataReference::new) : getBinaryColumn("data_reference"));
    }

    /**
     * A DOI reference to the metadata decribing the related data set.
     * @return MetadataReference
     */
    public MetadataReference getMetadataReference() {
        return (MetadataReference) (isText ? textFields.computeIfAbsent("metadata_reference",
                MetadataReference::new) : getBinaryColumn("metadata_reference"));
    }

    /**
     * The type of the experimenatal data set.
     * @return DataSetType
     */
    public DataSetType getDataSetType() {
        return (DataSetType) (isText ? textFields.computeIfAbsent("data_set_type",
                DataSetType::new) : getBinaryColumn("data_set_type"));
    }

    /**
     * Additional details describing the content of the related data set and its application to
     * the current investigation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
