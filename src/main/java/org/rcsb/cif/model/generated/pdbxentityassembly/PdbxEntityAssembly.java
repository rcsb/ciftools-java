package org.rcsb.cif.model.generated.pdbxentityassembly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * An enity identifier.  A reference to _entity.id.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * An  identifier for the assembly.
     * @return BiolId
     */
    public BiolId getBiolId() {
        return (BiolId) (isText ? textFields.computeIfAbsent("biol_id",
                BiolId::new) : getBinaryColumn("biol_id"));
    }

    /**
     * The number of copies of this entity in the assembly.
     * @return NumCopies
     */
    public NumCopies getNumCopies() {
        return (NumCopies) (isText ? textFields.computeIfAbsent("num_copies",
                NumCopies::new) : getBinaryColumn("num_copies"));
    }
}
