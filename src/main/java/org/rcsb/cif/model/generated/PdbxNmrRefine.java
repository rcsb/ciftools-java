package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Describe the method and details of the refinement of the deposited structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrRefine extends BaseCategory {
    public PdbxNmrRefine(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrRefine(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrRefine(String name) {
        super(name);
    }

    /**
     * You can leave this blank as an ID will be assigned by the RCSB
     * to the constraint file.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The method used to determine the structure.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * Additional details about the NMR refinement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_ordinal", IntColumn::new) :
                getBinaryColumn("software_ordinal"));
    }
}
