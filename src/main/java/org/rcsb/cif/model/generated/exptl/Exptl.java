package org.rcsb.cif.model.generated.exptl;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class Exptl extends BaseCifCategory {
    public Exptl(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public Exptl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id"));
    }

    /**
     * The method used in the experiment.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? getTextColumn("method") : getBinaryColumn("method"));
    }
}
