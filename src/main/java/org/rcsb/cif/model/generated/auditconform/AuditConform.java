package org.rcsb.cif.model.generated.auditconform;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return DictLocation
     */
    public DictLocation getDictLocation() {
        return (DictLocation) (isText ? textFields.computeIfAbsent("dict_location",
                DictLocation::new) : getBinaryColumn("dict_location"));
    }

    /**
     * The string identifying the highest-level dictionary defining
     * data names used in this file.
     * @return DictName
     */
    public DictName getDictName() {
        return (DictName) (isText ? textFields.computeIfAbsent("dict_name",
                DictName::new) : getBinaryColumn("dict_name"));
    }

    /**
     * The version number of the dictionary to which the current
     * data block conforms.
     * @return DictVersion
     */
    public DictVersion getDictVersion() {
        return (DictVersion) (isText ? textFields.computeIfAbsent("dict_version",
                DictVersion::new) : getBinaryColumn("dict_version"));
    }
}
