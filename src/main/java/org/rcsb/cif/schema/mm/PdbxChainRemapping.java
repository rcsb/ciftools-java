package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * When producing a biological assembly model file, data items in the pdbx_chain_remapping provide a mapping
 * from the entity in original model file to this data file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChainRemapping extends DelegatingCategory {
    public PdbxChainRemapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "label_asym_id":
                return getLabelAsymId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "orig_label_asym_id":
                return getOrigLabelAsymId();
            case "orig_auth_asym_id":
                return getOrigAuthAsymId();
            case "applied_operations":
                return getAppliedOperations();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Identifies an _entity.id in this data block.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id. Frequently the
     * chain id.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category in the original model file.
     * @return StrColumn
     */
    public StrColumn getOrigLabelAsymId() {
        return delegate.getColumn("orig_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id in the original
     * model file. Frequently the author's chain id.
     * @return StrColumn
     */
    public StrColumn getOrigAuthAsymId() {
        return delegate.getColumn("orig_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The set of operations identified pdbx_struct_oper_list.id
     * that were applied to original atom_site coordinates to produce
     * the coordinates in atom_site in this data block.
     * @return StrColumn
     */
    public StrColumn getAppliedOperations() {
        return delegate.getColumn("applied_operations", DelegatingStrColumn::new);
    }

}