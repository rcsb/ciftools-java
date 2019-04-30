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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ref_id", SingleRowStrColumn::new) :
                getBinaryColumn("ref_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDbAlignBeg() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("db_align_beg", SingleRowIntColumn::new) :
                getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDbAlignEnd() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("db_align_end", SingleRowIntColumn::new) :
                getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Accession code of the reference database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbAccession() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_accession", SingleRowStrColumn::new) :
                getBinaryColumn("db_accession"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_code", SingleRowStrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_name", SingleRowStrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * Database chemical sequence expressed as string of one-letter
     * residue codes.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbSeqOneLetterCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_seq_one_letter_code", SingleRowStrColumn::new) :
                getBinaryColumn("db_seq_one_letter_code"));
    }

    /**
     * 
     * Beginning index in the author provided chemical sequence.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSeqAlignBegin() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("seq_align_begin", SingleRowStrColumn::new) :
                getBinaryColumn("seq_align_begin"));
    }

    /**
     * 
     * Ending index in the author provided chemical sequence.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSeqAlignEnd() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("seq_align_end", SingleRowStrColumn::new) :
                getBinaryColumn("seq_align_end"));
    }
}
