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
            case "ncbi_taxonomy_id":
                return getNcbiTaxonomyId();
            case "organism_scientific":
                return getOrganismScientific();
            case "gene_name":
                return getGeneName();
            case "seq_db_sequence_checksum":
                return getSeqDbSequenceChecksum();
            case "seq_db_sequence_version_date":
                return getSeqDbSequenceVersionDate();
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

    /**
     * Taxonomy identifier provided by NCBI.
     * @return StrColumn
     */
    public StrColumn getNcbiTaxonomyId() {
        return delegate.getColumn("ncbi_taxonomy_id", DelegatingStrColumn::new);
    }

    /**
     * Scientific name of the organism.
     * @return StrColumn
     */
    public StrColumn getOrganismScientific() {
        return delegate.getColumn("organism_scientific", DelegatingStrColumn::new);
    }

    /**
     * Name of the gene corresponding to the target entity.
     * @return StrColumn
     */
    public StrColumn getGeneName() {
        return delegate.getColumn("gene_name", DelegatingStrColumn::new);
    }

    /**
     * Checksum (CRC64) for the sequence in the reference sequence database.
     * @return StrColumn
     */
    public StrColumn getSeqDbSequenceChecksum() {
        return delegate.getColumn("seq_db_sequence_checksum", DelegatingStrColumn::new);
    }

    /**
     * The version date of the sequence in the reference sequence database.
     * @return StrColumn
     */
    public StrColumn getSeqDbSequenceVersionDate() {
        return delegate.getColumn("seq_db_sequence_version_date", DelegatingStrColumn::new);
    }

}