package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SEQUENCE_PATTERN category record
 * the number of occurences of common step sequence patterns
 * (e.g. AA, CG, AT).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * The identifier of the author asym_id of the strand containing
     * the sequence pattern.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Number of occurences of the sequence pattern within the
     * named strand.
     * @return IntColumn
     */
    public IntColumn getPatternCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pattern_count", IntColumn::new) :
                getBinaryColumn("pattern_count"));
    }

    /**
     * Sequence singlet or doublet.
     * @return StrColumn
     */
    public StrColumn getSequencePattern() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sequence_pattern", StrColumn::new) :
                getBinaryColumn("sequence_pattern"));
    }
}
