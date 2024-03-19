package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to record details about the
 * creation and subsequent updating of the data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Audit extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit";

    public Audit(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The digital object identifier (DOI) registered to identify
     * the data set publication represented by the current
     * data block. This can be used as a unique identifier for
     * the data block so long as the code used is a valid DOI
     * (i.e. begins with a valid publisher prefix assigned by a
     * Registration Agency and a suffix guaranteed to be unique
     * by the publisher) and has had its metadata deposited
     * with a DOI Registration Agency.
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
    public StrColumn getBlockDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_block_doi"));
    }

    /**
     * The timestamp of the data revision.
     * @return StrColumn
     */
    public StrColumn getCreationDate() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_creation_date"));
    }

    /**
     * A description of how the revision was applied to the data.
     * @return StrColumn
     */
    public StrColumn getCreationMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_creation_method"));
    }

    /**
     * This data item identifies the type of information contained in the
     * data block. Software written for one schema will not, in general,
     * correctly interpret datafiles written against a different schema.
     * 
     * Specifically, each value of _audit.schema corresponds to a list
     * of categories that were (potentially implicitly) restricted to a
     * single packet in the default Base schema, but which can contain
     * multiple packets in the specified schema.  All categories
     * containing child keys of the listed categories may also contain
     * multiple packets and do not need to be listed.
     * 
     * The category list for each schema may instead be determined from
     * examination of the dictionaries that this data block conforms to
     * (see _audit_conform.dict_name).
     * @return StrColumn
     */
    public StrColumn getSchema() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_schema"));
    }

    /**
     * A description of the revision applied to the data.
     * @return StrColumn
     */
    public StrColumn getUpdateRecord() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_update_record"));
    }

    /**
     * A unique block code identifier for each revision.
     * @return StrColumn
     */
    public StrColumn getRevisionId() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("audit_revision_id", "audit_block_code"));
    }

    /**
     * A unique block code identifier for each revision.
     * @return StrColumn
     */
    public StrColumn getBlockCode() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("audit_revision_id", "audit_block_code"));
    }

}