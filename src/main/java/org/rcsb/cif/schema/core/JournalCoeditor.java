package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items recording coeditor details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class JournalCoeditor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "journal_coeditor";

    public JournalCoeditor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The postal address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_address"));
    }

    /**
     * The coeditor identifier.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_code"));
    }

    /**
     * The email address of the coeditor.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_email"));
    }

    /**
     * The fax number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_fax"));
    }

    /**
     * The name of the coeditor.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_name"));
    }

    /**
     * Notes on coeditor interaction wrt this publication.
     * @return StrColumn
     */
    public StrColumn getNotes() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_notes"));
    }

    /**
     * The phone number of the coeditor.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_coeditor_phone"));
    }

}