package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * STRUCT_REF_SEQ.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructRefSeqDepositorInfo extends BaseCategory {
    public PdbxStructRefSeqDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is a unique identifier for reference sequence information.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_id", StrColumn::new) :
                getBinaryColumn("ref_id"));
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
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return IntColumn
     */
    public IntColumn getDbAlignBeg() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_align_beg", IntColumn::new) :
                getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return IntColumn
     */
    public IntColumn getDbAlignEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_align_end", IntColumn::new) :
                getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Accession code of the reference database.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_accession", StrColumn::new) :
                getBinaryColumn("db_accession"));
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
     * Database chemical sequence expressed as string of one-letter
     * residue codes.
     * @return StrColumn
     */
    public StrColumn getDbSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("db_seq_one_letter_code"));
    }

    /**
     * 
     * Beginning index in the author provided chemical sequence.
     * @return StrColumn
     */
    public StrColumn getSeqAlignBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_align_begin", StrColumn::new) :
                getBinaryColumn("seq_align_begin"));
    }

    /**
     * 
     * Ending index in the author provided chemical sequence.
     * @return StrColumn
     */
    public StrColumn getSeqAlignEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_align_end", StrColumn::new) :
                getBinaryColumn("seq_align_end"));
    }
}
