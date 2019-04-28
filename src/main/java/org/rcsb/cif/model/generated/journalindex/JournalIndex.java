package org.rcsb.cif.model.generated.journalindex;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class JournalIndex extends BaseCategory {
    public JournalIndex(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public JournalIndex(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public JournalIndex(String name) {
        super(name);
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return Subterm
     */
    public Subterm getSubterm() {
        return (Subterm) (isText ? textFields.computeIfAbsent("subterm",
                Subterm::new) : getBinaryColumn("subterm"));
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return Term
     */
    public Term getTerm() {
        return (Term) (isText ? textFields.computeIfAbsent("term",
                Term::new) : getBinaryColumn("term"));
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
