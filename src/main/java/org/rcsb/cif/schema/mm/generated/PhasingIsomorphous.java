package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_ISOMORPHOUS category record details
 * about the phasing of the structure where a model isomorphous
 * to the structure being phased was used to generate the initial
 * phases.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingIsomorphous extends BaseCategory {
    public PhasingIsomorphous(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingIsomorphous(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingIsomorphous(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the isomorphous phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A description of the isomorphous-phasing method used to
     * phase this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the isomorphous phasing
     * program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * Reference to the structure used to generate starting phases
     * if the structure referenced in this data block was phased
     * by virtue of being isomorphous to a known structure (e.g.
     * a mutant that crystallizes in the same space group as the
     * wild-type protein.)
     * @return StrColumn
     */
    public StrColumn getParent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent", StrColumn::new) :
                getBinaryColumn("parent"));
    }
}
