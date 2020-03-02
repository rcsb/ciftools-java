package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items recording database deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Database extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "database";

    public Database(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The history of changes made by the Cambridge Crystallographic Data
     * Centre and incorporated into the Cambridge Structural Database (CSD).
     * @return StrColumn
     */
    public StrColumn getCSDHistory() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_CSD_history"));
    }

    /**
     * The digital object identifier (DOI) registered to identify
     * a data set publication associated with the structure
     * described in the current datablock. This should be used
     * for a dataset obtained from a curated database such as
     * CSD or PDB.
     * 
     * A DOI is a unique character string identifying any
     * object of intellectual property. It provides a
     * persistent identifier for an object on a digital network
     * and permits the association of related current data in a
     * structured extensible way. A DOI is an implementation
     * of the Internet concepts of Uniform Resource Name and
     * Universal Resource Locator managed according to the
     * specifications of the International DOI Foundation (see
     * http://www.doi.org).
     * @return StrColumn
     */
    public StrColumn getDatasetDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dataset_doi"));
    }

    /**
     * 
     * ASTM CODEN designator for a journal as given in the Chemical
     * Source List maintained by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getJournalASTM() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_journal_ASTM"));
    }

    /**
     * 
     * The journal code used in the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getJournalCSD() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_journal_CSD"));
    }

    public StrColumn getCodeDepnumCcdcArchive() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_code_depnum_ccdc_archive"));
    }
}
