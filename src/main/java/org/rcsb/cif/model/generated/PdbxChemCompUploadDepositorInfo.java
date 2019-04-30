package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
 * details of the uploaded files related to depositor provided chemical assignments.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompUploadDepositorInfo extends BaseCategory {
    public PdbxChemCompUploadDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompUploadDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompUploadDepositorInfo(String name) {
        super(name);
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The type of the uploaded file containing information about this component.
     * @return StrColumn
     */
    public StrColumn getUploadFileType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_type", StrColumn::new) :
                getBinaryColumn("upload_file_type"));
    }

    /**
     * The name of the uploaded file containing information about this component.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }
}
