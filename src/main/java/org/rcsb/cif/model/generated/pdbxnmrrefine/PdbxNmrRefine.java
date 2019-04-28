package org.rcsb.cif.model.generated.pdbxnmrrefine;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The method used to determine the structure.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * Additional details about the NMR refinement.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Pointer to _software.ordinal
     * @return SoftwareOrdinal
     */
    public SoftwareOrdinal getSoftwareOrdinal() {
        return (SoftwareOrdinal) (isText ? textFields.computeIfAbsent("software_ordinal",
                SoftwareOrdinal::new) : getBinaryColumn("software_ordinal"));
    }
}
