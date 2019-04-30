package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_code", StrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * A description of special aspects of the relationship between
     * the entity or biological unit described in the data block and
     * that in the referenced database entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_align", StrColumn::new) :
                getBinaryColumn("seq_align"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_dif", StrColumn::new) :
                getBinaryColumn("seq_dif"));
    }

    /**
     * Accession code assigned by the reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_accession", StrColumn::new) :
                getBinaryColumn("pdbx_db_accession"));
    }

    /**
     * Database code assigned by the reference database for a sequence isoform.   An isoform sequence is an
     * alternative protein sequence that can be generated from the same gene by a single or by a combination of
     * biological events such as: alternative promoter usage, alternative splicing, alternative initiation
     * and ribosomal frameshifting.
     * @return StrColumn
     */
    public StrColumn getPdbxDbIsoform() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_isoform", StrColumn::new) :
                getBinaryColumn("pdbx_db_isoform"));
    }

    /**
     * Database chemical sequence expressed as string of one-letter
     * amino acid codes.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_one_letter_code"));
    }

    /**
     * 
     * Beginning index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxAlignBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_align_begin", StrColumn::new) :
                getBinaryColumn("pdbx_align_begin"));
    }

    /**
     * 
     * Ending index in the chemical sequence from the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxAlignEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_align_end", StrColumn::new) :
                getBinaryColumn("pdbx_align_end"));
    }
}
