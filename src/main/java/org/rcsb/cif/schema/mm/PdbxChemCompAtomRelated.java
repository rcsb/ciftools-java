package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * PDBX_CHEM_COMP_ATOM_RELATED provides atom level nomenclature mapping between two related chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompAtomRelated extends DelegatingCategory {
    public PdbxChemCompAtomRelated(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "comp_id":
                return getCompId();
            case "related_comp_id":
                return getRelatedCompId();
            case "ordinal":
                return getOrdinal();
            case "atom_id":
                return getAtomId();
            case "related_atom_id":
                return getRelatedAtomId();
            case "related_type":
                return getRelatedType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The chemical component for which this relationship applies.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The related chemical component for which this chemical component is based.
     * @return StrColumn
     */
    public StrColumn getRelatedCompId() {
        return delegate.getColumn("related_comp_id", DelegatingStrColumn::new);
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The atom identifier/name for the atom mapping
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name for the atom mapping in the related chemical component
     * @return StrColumn
     */
    public StrColumn getRelatedAtomId() {
        return delegate.getColumn("related_atom_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getRelatedType() {
        return delegate.getColumn("related_type", DelegatingStrColumn::new);
    }

}