package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * PDBX_CHEM_COMP_RELATED describes the relationship between two chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompRelated extends DelegatingCategory {
    public PdbxChemCompRelated(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "comp_id":
                return getCompId();
            case "related_comp_id":
                return getRelatedCompId();
            case "relationship_type":
                return getRelationshipType();
            case "details":
                return getDetails();
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
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getRelationshipType() {
        return delegate.getColumn("relationship_type", DelegatingStrColumn::new);
    }

    /**
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}