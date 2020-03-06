package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used describe dictionary versions
 * by which data names in the current data block are conformant.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditConform extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_conform";

    public AuditConform(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * File name or uniform resource locator (URL) where the
     * conformant data dictionary resides.
     * @return StrColumn
     */
    public StrColumn getDictLocation() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_conform_dict_location"));
    }

    /**
     * Name identifying highest-level data dictionary defining
     * data names used in this file.
     * @return StrColumn
     */
    public StrColumn getDictName() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_conform_dict_name"));
    }

    /**
     * Code for the version of data dictionary defining data names
     * used in this file.
     * @return StrColumn
     */
    public StrColumn getDictVersion() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_conform_dict_version"));
    }

}