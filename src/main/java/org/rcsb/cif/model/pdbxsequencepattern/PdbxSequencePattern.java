package org.rcsb.cif.model.pdbxsequencepattern;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSequencePattern extends BaseCategory {
    public PdbxSequencePattern(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSequencePattern(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSequencePattern(String name) {
        super(name);
    }

    /**
     * The identifier of the asym_id of the strand containing
     * the sequence pattern.
     * 
     * This data item is a pointer to _atom_site.label_asym_id
     * in the ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * The identifier of the author asym_id of the strand containing
     * the sequence pattern.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id
     * in the ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Number of occurences of the sequence pattern within the
     * named strand.
     * @return PatternCount
     */
    public PatternCount getPatternCount() {
        return (PatternCount) (isText ? textFields.computeIfAbsent("pattern_count",
                PatternCount::new) : getBinaryColumn("pattern_count"));
    }

    /**
     * Sequence singlet or doublet.
     * @return SequencePattern
     */
    public SequencePattern getSequencePattern() {
        return (SequencePattern) (isText ? textFields.computeIfAbsent("sequence_pattern",
                SequencePattern::new) : getBinaryColumn("sequence_pattern"));
    }
}
