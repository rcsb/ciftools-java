package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_KEYWORDS category specify keywords
 * relevant to the molecular entities. Note that this list of
 * keywords is separate from the list that is used for the
 * STRUCT_BIOL data items and is intended to provide only the
 * information that one would know about the molecular entity *if
 * one did not know its structure*. Hence polypeptides are simply
 * polypeptides, not cytokines or beta-alpha-barrels, and
 * polyribonucleic acids are simply poly-RNA, not transfer-
 * RNA.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityKeywords extends DelegatingCategory {
    public EntityKeywords(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "text":
                return getText();
            case "pdbx_mutation":
                return getPdbxMutation();
            case "pdbx_fragment":
                return getPdbxFragment();
            case "pdbx_ec":
                return getPdbxEc();
            case "pdbx_antibody_isotype":
                return getPdbxAntibodyIsotype();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Keywords describing this entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

    /**
     * Entity mutation description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxMutation() {
        return delegate.getColumn("pdbx_mutation", DelegatingStrColumn::new);
    }

    /**
     * Entity fragment description(s).
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return delegate.getColumn("pdbx_fragment", DelegatingStrColumn::new);
    }

    /**
     * Enzyme Commission (EC) number(s)
     * @return StrColumn
     */
    public StrColumn getPdbxEc() {
        return delegate.getColumn("pdbx_ec", DelegatingStrColumn::new);
    }

    /**
     * PDB placeholder.
     * @return StrColumn
     */
    public StrColumn getPdbxAntibodyIsotype() {
        return delegate.getColumn("pdbx_antibody_isotype", DelegatingStrColumn::new);
    }

}