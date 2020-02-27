package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.schema.DelegatingCategory;
import org.rcsb.cif.schema.DelegatingStrColumn;

public class Entry extends DelegatingCategory {
    public Entry(Category delegate) {
        super(delegate);
    }

    public StrColumn getId() {
        return getColumn("id", DelegatingStrColumn::new);
    }
}
