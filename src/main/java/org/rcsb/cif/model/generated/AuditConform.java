package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the AUDIT_CONFORM category describe the
 * dictionary versions against which the data names appearing in
 * the current data block are conformant.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuditConform extends BaseCategory {
    public AuditConform(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AuditConform(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AuditConform(String name) {
        super(name);
    }

    /**
     * A file name or uniform resource locator (URL) for the
     * dictionary to which the current data block conforms.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDictLocation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dict_location", SingleRowStrColumn::new) :
                getBinaryColumn("dict_location"));
    }

    /**
     * The string identifying the highest-level dictionary defining
     * data names used in this file.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDictName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dict_name", SingleRowStrColumn::new) :
                getBinaryColumn("dict_name"));
    }

    /**
     * The version number of the dictionary to which the current
     * data block conforms.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDictVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dict_version", SingleRowStrColumn::new) :
                getBinaryColumn("dict_version"));
    }
}
