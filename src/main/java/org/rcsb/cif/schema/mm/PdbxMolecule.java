package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_MOLECULE category identify reference molecules
 * within a PDB entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxMolecule extends DelegatingCategory {
    public PdbxMolecule(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "instance_id":
                return getInstanceId();
            case "asym_id":
                return getAsymId();
            case "linked_entity_id":
                return getLinkedEntityId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_molecule.prd_id is the PDB accession code for this
     * reference molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_molecule.instance_id is identifies a particular molecule
     * in the molecule list.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return delegate.getColumn("instance_id", DelegatingIntColumn::new);
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * A reference to _pdbx_linked_entity.linked_entity_id in the PDBX_LINKED_ENTITY  category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return delegate.getColumn("linked_entity_id", DelegatingStrColumn::new);
    }

}