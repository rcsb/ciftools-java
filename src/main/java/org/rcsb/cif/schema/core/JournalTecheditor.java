package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items recording details of the technical editor
 * processing this publication.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class JournalTecheditor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "journal_techeditor";

    public JournalTecheditor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Postal address of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_address"));
    }

    /**
     * Code of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_code"));
    }

    /**
     * Email address of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_email"));
    }

    /**
     * Fax number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_fax"));
    }

    /**
     * Name of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_name"));
    }

    /**
     * Notes of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getNotes() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_notes"));
    }

    /**
     * Phone number of the technical editor for this publication.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_techeditor_phone"));
    }

}