package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Category of items recording dates of publication processing.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class JournalDate extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "journal_date";

    public JournalDate(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Date the publication was accepted.
     * @return StrColumn
     */
    public StrColumn getAccepted() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_accepted"));
    }

    /**
     * 
     * Date the publication recieved from coeditor.
     * @return StrColumn
     */
    public StrColumn getFromCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_from_coeditor"));
    }

    /**
     * 
     * Date the publication last sent to the printers.
     * @return StrColumn
     */
    public StrColumn getPrintersFinal() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_printers_final"));
    }

    /**
     * 
     * Date the publication first sent to the printers.
     * @return StrColumn
     */
    public StrColumn getPrintersFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_printers_first"));
    }

    /**
     * 
     * Date the publication proofs recieved.
     * @return StrColumn
     */
    public StrColumn getProofsIn() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_proofs_in"));
    }

    /**
     * 
     * Date the publication proofs sent out.
     * @return StrColumn
     */
    public StrColumn getProofsOut() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_proofs_out"));
    }

    /**
     * 
     * Date completed copyright recieved.
     * @return StrColumn
     */
    public StrColumn getRecdCopyright() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_recd_copyright"));
    }

    /**
     * 
     * Date publication recieved electronically.
     * @return StrColumn
     */
    public StrColumn getRecdElectronic() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_recd_electronic"));
    }

    /**
     * 
     * Date publication recieved as hard copy.
     * @return StrColumn
     */
    public StrColumn getRecdHardCopy() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_recd_hard_copy"));
    }

    /**
     * 
     * Date the publication sent to the coeditor.
     * @return StrColumn
     */
    public StrColumn getToCoeditor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_to_coeditor"));
    }
}
