package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the AUDIT_CONFORM category describe the
 * dictionary versions against which the data names appearing in
 * the current data block are conformant.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDictLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dict_location", StrColumn::new) :
                getBinaryColumn("dict_location"));
    }

    /**
     * The string identifying the highest-level dictionary defining
     * data names used in this file.
     * @return StrColumn
     */
    public StrColumn getDictName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dict_name", StrColumn::new) :
                getBinaryColumn("dict_name"));
    }

    /**
     * The version number of the dictionary to which the current
     * data block conforms.
     * @return StrColumn
     */
    public StrColumn getDictVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dict_version", StrColumn::new) :
                getBinaryColumn("dict_version"));
    }
}
