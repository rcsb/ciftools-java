package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category to collect the authors of this entry
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmAuthorList extends BaseCategory {
    public EmAuthorList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmAuthorList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmAuthorList(String name) {
        super(name);
    }

    /**
     * Author of the EMDB entry in PDB format: Taylor, T.J.
     * @return StrColumn
     */
    public StrColumn getAuthor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("author", StrColumn::new) :
                getBinaryColumn("author"));
    }

    /**
     * ID 1 corresponds to the main author of the entry
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
