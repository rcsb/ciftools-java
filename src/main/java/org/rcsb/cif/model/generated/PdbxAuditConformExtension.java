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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExtensionDictLocation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("extension_dict_location", SingleRowStrColumn::new) :
                getBinaryColumn("extension_dict_location"));
    }

    /**
     * An identifier for the extension dictionary to which the current data block conforms.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExtensionDictName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("extension_dict_name", SingleRowStrColumn::new) :
                getBinaryColumn("extension_dict_name"));
    }

    /**
     * The version number of the extension dictionary to which the currrent data block conforms.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExtensionDictVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("extension_dict_version", SingleRowStrColumn::new) :
                getBinaryColumn("extension_dict_version"));
    }
}
