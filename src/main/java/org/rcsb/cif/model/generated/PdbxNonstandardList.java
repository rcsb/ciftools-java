package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The information in this category is exclusively used to store
 * the HET records of a PDB file.  This record will be generated
 * by the PROGRAM.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNonstandardList extends BaseCategory {
    public PdbxNonstandardList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNonstandardList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNonstandardList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_nonstandard_list.id must uniquely identify each item in
     * the PDBX_NONSTANDARD_LIST list.
     * 
     * For protein polymer entities, this is the three-letter code for
     * amino acids.
     * 
     * For nucleic acid polymer entities, this is the one-letter code
     * for the bases.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * Chain id of the nonstandard group used by the author.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * 
     * Residue number of the nonstandard group used by the
     * author.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Chain ID of het group.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * Residue number of het group.
     * @return StrColumn
     */
    public StrColumn getLabelSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_seq_num", StrColumn::new) :
                getBinaryColumn("label_seq_num"));
    }

    /**
     * Residue id of het group.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * Insertion code of het group.
     * @return StrColumn
     */
    public StrColumn getInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ins_code", StrColumn::new) :
                getBinaryColumn("ins_code"));
    }

    /**
     * The number of non-hydrogen atoms in the het group.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_nh", IntColumn::new) :
                getBinaryColumn("number_atoms_nh"));
    }
}
