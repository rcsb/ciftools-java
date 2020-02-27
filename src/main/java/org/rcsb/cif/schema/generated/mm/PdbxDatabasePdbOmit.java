package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Data items in the PDBX_DATABASE_PDB_OMIT category record
 * list PDB record names that should be omitted in the PDB
 * format file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabasePdbOmit extends DelegatingCategory {
    public PdbxDatabasePdbOmit(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_database_pdb_omit.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * PDB record or REMARK name to be omitted.
     * @return StrColumn
     */
    public StrColumn getRecordName() {
        return delegate.getColumn("record_name", DelegatingStrColumn::new);
    }
}
