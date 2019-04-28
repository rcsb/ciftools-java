package org.rcsb.cif.model.generated.pdbxauditconformextension;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuditConformExtension extends BaseCategory {
    public PdbxAuditConformExtension(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditConformExtension(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditConformExtension(String name) {
        super(name);
    }

    /**
     * A file name or uniform resource locator (URL) for the
     * file containing the extension dictionary.
     * @return ExtensionDictLocation
     */
    public ExtensionDictLocation getExtensionDictLocation() {
        return (ExtensionDictLocation) (isText ? textFields.computeIfAbsent("extension_dict_location",
                ExtensionDictLocation::new) : getBinaryColumn("extension_dict_location"));
    }

    /**
     * An identifier for the extension dictionary to which the current data block conforms.
     * @return ExtensionDictName
     */
    public ExtensionDictName getExtensionDictName() {
        return (ExtensionDictName) (isText ? textFields.computeIfAbsent("extension_dict_name",
                ExtensionDictName::new) : getBinaryColumn("extension_dict_name"));
    }

    /**
     * The version number of the extension dictionary to which the currrent data block conforms.
     * @return ExtensionDictVersion
     */
    public ExtensionDictVersion getExtensionDictVersion() {
        return (ExtensionDictVersion) (isText ? textFields.computeIfAbsent("extension_dict_version",
                ExtensionDictVersion::new) : getBinaryColumn("extension_dict_version"));
    }
}
