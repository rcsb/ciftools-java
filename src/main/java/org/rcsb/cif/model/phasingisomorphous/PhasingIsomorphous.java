package org.rcsb.cif.model.phasingisomorphous;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
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
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * Reference to the structure used to generate starting phases
     * if the structure referenced in this data block was phased
     * by virtue of being isomorphous to a known structure (e.g.
     * a mutant that crystallizes in the same space group as the
     * wild-type protein.)
     * @return Parent
     */
    public Parent getParent() {
        return (Parent) (isText ? textFields.computeIfAbsent("parent",
                Parent::new) : getBinaryColumn("parent"));
    }
}
