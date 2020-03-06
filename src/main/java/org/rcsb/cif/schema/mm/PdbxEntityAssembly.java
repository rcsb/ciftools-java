package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
 * of the biological assembly studied in terms of its constituent
 * entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityAssembly extends DelegatingCategory {
    public PdbxEntityAssembly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "biol_id":
                return getBiolId();
            case "num_copies":
                return getNumCopies();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An  identifier for the assembly.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * An enity identifier.  A reference to _entity.id.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An  identifier for the assembly.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * The number of copies of this entity in the assembly.
     * @return IntColumn
     */
    public IntColumn getNumCopies() {
        return delegate.getColumn("num_copies", DelegatingIntColumn::new);
    }

}