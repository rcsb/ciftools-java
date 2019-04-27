package org.rcsb.cif.model.pdbxchemcompuploaddepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The type of the uploaded file containing information about this component.
     * @return UploadFileType
     */
    public UploadFileType getUploadFileType() {
        return (UploadFileType) (isText ? textFields.computeIfAbsent("upload_file_type",
                UploadFileType::new) : getBinaryColumn("upload_file_type"));
    }

    /**
     * The name of the uploaded file containing information about this component.
     * @return UploadFileName
     */
    public UploadFileName getUploadFileName() {
        return (UploadFileName) (isText ? textFields.computeIfAbsent("upload_file_name",
                UploadFileName::new) : getBinaryColumn("upload_file_name"));
    }
}
