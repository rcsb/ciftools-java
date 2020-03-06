package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
 * extension dictionary versions against which the data names appearing
 * the current data block are conformant.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditConformExtension extends DelegatingCategory {
    public PdbxAuditConformExtension(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "extension_dict_location":
                return getExtensionDictLocation();
            case "extension_dict_name":
                return getExtensionDictName();
            case "extension_dict_version":
                return getExtensionDictVersion();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A file name or uniform resource locator (URL) for the
     * file containing the extension dictionary.
     * @return StrColumn
     */
    public StrColumn getExtensionDictLocation() {
        return delegate.getColumn("extension_dict_location", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the extension dictionary to which the current data block conforms.
     * @return StrColumn
     */
    public StrColumn getExtensionDictName() {
        return delegate.getColumn("extension_dict_name", DelegatingStrColumn::new);
    }

    /**
     * The version number of the extension dictionary to which the currrent data block conforms.
     * @return StrColumn
     */
    public StrColumn getExtensionDictVersion() {
        return delegate.getColumn("extension_dict_version", DelegatingStrColumn::new);
    }

}