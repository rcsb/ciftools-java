package org.rcsb.cif.model.pdbxstructrefseqdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return RefId
     */
    public RefId getRefId() {
        return (RefId) (isText ? textFields.computeIfAbsent("ref_id",
                RefId::new) : getBinaryColumn("ref_id"));
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
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return DbAlignBeg
     */
    public DbAlignBeg getDbAlignBeg() {
        return (DbAlignBeg) (isText ? textFields.computeIfAbsent("db_align_beg",
                DbAlignBeg::new) : getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return DbAlignEnd
     */
    public DbAlignEnd getDbAlignEnd() {
        return (DbAlignEnd) (isText ? textFields.computeIfAbsent("db_align_end",
                DbAlignEnd::new) : getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Accession code of the reference database.
     * @return DbAccession
     */
    public DbAccession getDbAccession() {
        return (DbAccession) (isText ? textFields.computeIfAbsent("db_accession",
                DbAccession::new) : getBinaryColumn("db_accession"));
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
     * Database chemical sequence expressed as string of one-letter
     * residue codes.
     * @return DbSeqOneLetterCode
     */
    public DbSeqOneLetterCode getDbSeqOneLetterCode() {
        return (DbSeqOneLetterCode) (isText ? textFields.computeIfAbsent("db_seq_one_letter_code",
                DbSeqOneLetterCode::new) : getBinaryColumn("db_seq_one_letter_code"));
    }

    /**
     * 
     * Beginning index in the author provided chemical sequence.
     * @return SeqAlignBegin
     */
    public SeqAlignBegin getSeqAlignBegin() {
        return (SeqAlignBegin) (isText ? textFields.computeIfAbsent("seq_align_begin",
                SeqAlignBegin::new) : getBinaryColumn("seq_align_begin"));
    }

    /**
     * 
     * Ending index in the author provided chemical sequence.
     * @return SeqAlignEnd
     */
    public SeqAlignEnd getSeqAlignEnd() {
        return (SeqAlignEnd) (isText ? textFields.computeIfAbsent("seq_align_end",
                SeqAlignEnd::new) : getBinaryColumn("seq_align_end"));
    }
}
