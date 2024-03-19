package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * A category of items recording entries in databases that describe
 * the same or related data. Databases wishing to insert their own
 * canonical codes when archiving and delivering data blocks should
 * use items from the DATABASE category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabaseRelated extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "database_related";

    public DatabaseRelated(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * An identifier for the database that contains the related dataset.
     * @return StrColumn
     */
    public StrColumn getDatabaseId() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_related_database_id"));
    }

    /**
     * The code used by the database referred to in
     * _database_related.database_id to identify the
     * related dataset.
     * @return StrColumn
     */
    public StrColumn getEntryCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_related_entry_code"));
    }

    /**
     * An identifier for this database reference.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_related_id"));
    }

    /**
     * The general relationship of the data in the data block
     * to the dataset referred to in the database.
     * @return StrColumn
     */
    public StrColumn getRelation() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_related_relation"));
    }

    /**
     * Information about the external dataset and relationship not encoded
     * elsewhere.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_related_special_details"));
    }

}