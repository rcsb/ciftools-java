package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_REF category allow the author of a
 * data block to relate the entities or biological units
 * described in the data block to information archived in external
 * databases.
 * 
 * For references to the sequence of a polymer, the value of
 * the data item _struct_ref.seq_align is used to indicate
 * whether the correspondence between the sequence of the entity
 * or biological unit in the data block and the sequence in the
 * referenced database entry is 'complete' or 'partial'. If
 * this value is 'partial', the region (or regions) of the
 * alignment may be delimited using data items in the
 * STRUCT_REF_SEQ category.
 * 
 * Similarly, the value of _struct_ref.seq_dif is used to indicate
 * whether the two sequences contain point differences. If the
 * value is 'yes', the differences may be identified and annotated
 * using data items in the STRUCT_REF_SEQ_DIF category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructRef extends DelegatingCategory {
    public StructRef(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "biol_id":
                return getBiolId();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            case "details":
                return getDetails();
            case "entity_id":
                return getEntityId();
            case "id":
                return getId();
            case "seq_align":
                return getSeqAlign();
            case "seq_dif":
                return getSeqDif();
            case "pdbx_db_accession":
                return getPdbxDbAccession();
            case "pdbx_db_isoform":
                return getPdbxDbIsoform();
            case "pdbx_seq_one_letter_code":
                return getPdbxSeqOneLetterCode();
            case "pdbx_align_begin":
                return getPdbxAlignBegin();
            case "pdbx_align_end":
                return getPdbxAlignEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_biol.id in the
     * STRUCT_BIOL category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
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
     * A description of special aspects of the relationship between
     * the entity or biological unit described in the data block and
     * that in the referenced database entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_ref.id must uniquely identify a record
     * in the STRUCT_REF list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the scope of the alignment between the
     * sequence of the entity or biological unit described in the data
     * block and that in the referenced database entry. 'entire'
     * indicates that alignment spans the entire length of both
     * sequences (although point differences may occur and can be
     * annotated using the data items in the STRUCT_REF_SEQ_DIF
     * category). 'partial' indicates a partial alignment. The region
     * (or regions) of the alignment may be delimited using data items
     * in the STRUCT_REF_SEQ category. This data item may also take
     * the value '.', indicating that the reference is not to a
     * sequence.
     * @return StrColumn
     */
    public StrColumn getSeqAlign() {
        return delegate.getColumn("seq_align", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate the presence ('yes') or absence ('no') of
     * point differences between the sequence of the entity or
     * biological unit described in the data block and that in
     * the referenced database entry. This data item may also
     * take the value '.', indicating that the reference is not to a
     * sequence.
     * @return StrColumn
     */
    public StrColumn getSeqDif() {
        return delegate.getColumn("seq_dif", DelegatingStrColumn::new);
    }

    /**
     * Accession code assigned by the reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAccession() {
        return delegate.getColumn("pdbx_db_accession", DelegatingStrColumn::new);
    }

    /**
     * Database code assigned by the reference database for a sequence isoform.   An isoform sequence is an
     * alternative protein sequence that can be generated from the same gene by a single or by a combination of
     * biological events such as: alternative promoter usage, alternative splicing, alternative initiation
     * and ribosomal frameshifting.
     * @return StrColumn
     */
    public StrColumn getPdbxDbIsoform() {
        return delegate.getColumn("pdbx_db_isoform", DelegatingStrColumn::new);
    }

    /**
     * Database chemical sequence expressed as string of one-letter
     * amino acid codes.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCode() {
        return delegate.getColumn("pdbx_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Beginning index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxAlignBegin() {
        return delegate.getColumn("pdbx_align_begin", DelegatingStrColumn::new);
    }

    /**
     * Ending index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxAlignEnd() {
        return delegate.getColumn("pdbx_align_end", DelegatingStrColumn::new);
    }

}