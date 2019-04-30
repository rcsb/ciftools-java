package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
 * of the biological assembly studied in terms of its constituent
 * entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityAssembly extends BaseCategory {
    public PdbxEntityAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityAssembly(String name) {
        super(name);
    }

    /**
     * An  identifier for the assembly.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An enity identifier.  A reference to _entity.id.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An  identifier for the assembly.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The number of copies of this entity in the assembly.
     * @return IntColumn
     */
    public IntColumn getNumCopies() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_copies", IntColumn::new) :
                getBinaryColumn("num_copies"));
    }
}
