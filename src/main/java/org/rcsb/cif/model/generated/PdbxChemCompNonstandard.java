package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
 * common nucleotide modifications and nonstandard features.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompNonstandard extends BaseCategory {
    public PdbxChemCompNonstandard(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompNonstandard(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompNonstandard(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * This data item describes modification  type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
