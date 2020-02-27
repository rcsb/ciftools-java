package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_RELATED_DATA_SET category record references
 * to experimental data sets related to the entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * A DOI reference to the related data set.
     * @return StrColumn
     */
    public StrColumn getDataReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_reference", StrColumn::new) :
                getBinaryColumn("data_reference"));
    }

    /**
     * A DOI reference to the metadata decribing the related data set.
     * @return StrColumn
     */
    public StrColumn getMetadataReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("metadata_reference", StrColumn::new) :
                getBinaryColumn("metadata_reference"));
    }

    /**
     * The type of the experimenatal data set.
     * @return StrColumn
     */
    public StrColumn getDataSetType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_set_type", StrColumn::new) :
                getBinaryColumn("data_set_type"));
    }

    /**
     * Additional details describing the content of the related data set and its application to
     * the current investigation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
