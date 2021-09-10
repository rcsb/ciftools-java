package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TARGET_REF_DB_DETAILS category record details about
 * the reference databases for the target sequences.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTargetRefDbDetails extends DelegatingCategory {
    public MaTargetRefDbDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "target_entity_id":
                return getTargetEntityId();
            case "db_name":
                return getDbName();
            case "db_name_other_details":
                return getDbNameOtherDetails();
            case "db_code":
                return getDbCode();
            case "db_accession":
                return getDbAccession();
            case "seq_db_isoform":
                return getSeqDbIsoform();
            case "seq_db_align_begin":
                return getSeqDbAlignBegin();
            case "seq_db_align_end":
                return getSeqDbAlignEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the target entity.
     * @return StrColumn
     */
    public StrColumn getTargetEntityId() {
        return delegate.getColumn("target_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The other database name.
     * @return StrColumn
     */
    public StrColumn getDbNameOtherDetails() {
        return delegate.getColumn("db_name_other_details", DelegatingStrColumn::new);
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * This can include the version number.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }

    /**
     * Accession code assigned by the reference database.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return delegate.getColumn("db_accession", DelegatingStrColumn::new);
    }

    /**
     * Database code assigned by the reference database for a sequence isoform.   An isoform sequence is an
     * alternative protein sequence that can be generated from the same gene by a single or by a combination of
     * biological events such as: alternative promoter usage, alternative splicing, alternative initiation
     * and ribosomal frameshifting.
     * @return StrColumn
     */
    public StrColumn getSeqDbIsoform() {
        return delegate.getColumn("seq_db_isoform", DelegatingStrColumn::new);
    }

    /**
     * Beginning index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getSeqDbAlignBegin() {
        return delegate.getColumn("seq_db_align_begin", DelegatingStrColumn::new);
    }

    /**
     * Ending index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getSeqDbAlignEnd() {
        return delegate.getColumn("seq_db_align_end", DelegatingStrColumn::new);
    }

}