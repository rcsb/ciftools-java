package org.rcsb.cif.model.structref;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructRef extends BaseCategory {
    public StructRef(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructRef(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructRef(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the
     * STRUCT_BIOL category.
     * @return BiolId
     */
    public BiolId getBiolId() {
        return (BiolId) (isText ? textFields.computeIfAbsent("biol_id",
                BiolId::new) : getBinaryColumn("biol_id"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return DbCode
     */
    public DbCode getDbCode() {
        return (DbCode) (isText ? textFields.computeIfAbsent("db_code",
                DbCode::new) : getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return DbName
     */
    public DbName getDbName() {
        return (DbName) (isText ? textFields.computeIfAbsent("db_name",
                DbName::new) : getBinaryColumn("db_name"));
    }

    /**
     * A description of special aspects of the relationship between
     * the entity or biological unit described in the data block and
     * that in the referenced database entry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The value of _struct_ref.id must uniquely identify a record
     * in the STRUCT_REF list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * @return SeqAlign
     */
    public SeqAlign getSeqAlign() {
        return (SeqAlign) (isText ? textFields.computeIfAbsent("seq_align",
                SeqAlign::new) : getBinaryColumn("seq_align"));
    }

    /**
     * A flag to indicate the presence ('yes') or absence ('no') of
     * point differences between the sequence of the entity or
     * biological unit described in the data block and that in
     * the referenced database entry. This data item may also
     * take the value '.', indicating that the reference is not to a
     * sequence.
     * @return SeqDif
     */
    public SeqDif getSeqDif() {
        return (SeqDif) (isText ? textFields.computeIfAbsent("seq_dif",
                SeqDif::new) : getBinaryColumn("seq_dif"));
    }

    /**
     * Accession code assigned by the reference database.
     * @return PdbxDbAccession
     */
    public PdbxDbAccession getPdbxDbAccession() {
        return (PdbxDbAccession) (isText ? textFields.computeIfAbsent("pdbx_db_accession",
                PdbxDbAccession::new) : getBinaryColumn("pdbx_db_accession"));
    }

    /**
     * Database code assigned by the reference database for a sequence isoform.   An isoform sequence is an
     * alternative protein sequence that can be generated from the same gene by a single or by a combination of
     * biological events such as: alternative promoter usage, alternative splicing, alternative initiation
     * and ribosomal frameshifting.
     * @return PdbxDbIsoform
     */
    public PdbxDbIsoform getPdbxDbIsoform() {
        return (PdbxDbIsoform) (isText ? textFields.computeIfAbsent("pdbx_db_isoform",
                PdbxDbIsoform::new) : getBinaryColumn("pdbx_db_isoform"));
    }

    /**
     * Database chemical sequence expressed as string of one-letter
     * amino acid codes.
     * @return PdbxSeqOneLetterCode
     */
    public PdbxSeqOneLetterCode getPdbxSeqOneLetterCode() {
        return (PdbxSeqOneLetterCode) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code",
                PdbxSeqOneLetterCode::new) : getBinaryColumn("pdbx_seq_one_letter_code"));
    }

    /**
     * 
     * Beginning index in the chemical sequence from the
     * reference database.
     * @return PdbxAlignBegin
     */
    public PdbxAlignBegin getPdbxAlignBegin() {
        return (PdbxAlignBegin) (isText ? textFields.computeIfAbsent("pdbx_align_begin",
                PdbxAlignBegin::new) : getBinaryColumn("pdbx_align_begin"));
    }

    /**
     * 
     * Ending index in the chemical sequence from the
     * reference database.
     * @return PdbxAlignEnd
     */
    public PdbxAlignEnd getPdbxAlignEnd() {
        return (PdbxAlignEnd) (isText ? textFields.computeIfAbsent("pdbx_align_end",
                PdbxAlignEnd::new) : getBinaryColumn("pdbx_align_end"));
    }
}
