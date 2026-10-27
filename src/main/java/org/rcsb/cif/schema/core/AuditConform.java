package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used describe dictionary versions
 * by which data names in the current data block are conformant.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditConform extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_conform";

    public AuditConform(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The digital object identifier (DOI) registered to identify
     * a CIF dictionary to which data names in this data block are
     * conformant. This should resolve to a machine-readable dictionary
     * and not to a descriptive landing page.
     * 
     * A DOI is a unique character string identifying any
     * object of intellectual property. It provides a
     * persistent identifier for an object on a digital network
     * and permits the association of related current data in a
     * structured extensible way. A DOI is an implementation
     * of the Internet concepts of Uniform Resource Name and
     * Universal Resource Locator managed according to the
     * specifications of the International DOI Foundation
     * (see https://www.doi.org/).
     * @return StrColumn
     */
    public StrColumn getDictDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_conform_dict_doi"));
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