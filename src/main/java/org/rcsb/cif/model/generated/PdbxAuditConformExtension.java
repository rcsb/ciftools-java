package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
 * extension dictionary versions against which the data names appearing
 * the current data block are conformant.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getExtensionDictLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extension_dict_location", StrColumn::new) :
                getBinaryColumn("extension_dict_location"));
    }

    /**
     * An identifier for the extension dictionary to which the current data block conforms.
     * @return StrColumn
     */
    public StrColumn getExtensionDictName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extension_dict_name", StrColumn::new) :
                getBinaryColumn("extension_dict_name"));
    }

    /**
     * The version number of the extension dictionary to which the currrent data block conforms.
     * @return StrColumn
     */
    public StrColumn getExtensionDictVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extension_dict_version", StrColumn::new) :
                getBinaryColumn("extension_dict_version"));
    }
}
