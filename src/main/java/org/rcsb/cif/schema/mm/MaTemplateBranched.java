package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_BRANCHED category record details about
 * the structural templates for branched polymers used in the
 * homology/comparative modeling.
 * The table can be populated using values from PDBx/mmCIF tables
 * _pdbx_entity_branch_descriptor and _pdbx_entity_branch for the template,
 * if available.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateBranched extends DelegatingCategory {
    public MaTemplateBranched(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "template_id":
                return getTemplateId();
            case "name":
                return getName();
            case "descriptor_type":
                return getDescriptorType();
            case "descriptor_value":
                return getDescriptorValue();
            case "descriptor_software_id":
                return getDescriptorSoftwareId();
            case "type":
                return getType();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the template.
     * This data item is a pointer to _ma_template_details.template_id
     * in the MA_TEMPLATE_DETAILS category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * Name of the branched polymer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Descriptor type for the branched polymer.
     * @return StrColumn
     */
    public StrColumn getDescriptorType() {
        return delegate.getColumn("descriptor_type", DelegatingStrColumn::new);
    }

    /**
     * Descriptor value for the branched polymer provided in
     * _ma_template_branched.descriptor_type.
     * @return StrColumn
     */
    public StrColumn getDescriptorValue() {
        return delegate.getColumn("descriptor_value", DelegatingStrColumn::new);
    }

    /**
     * Identifier for the software used to compute the descriptor provided in
     * _ma_template_branched.descriptor_value.
     * This data item is a pointer to _software.pdbx_ordinal
     * in the SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getDescriptorSoftwareId() {
        return delegate.getColumn("descriptor_software_id", DelegatingIntColumn::new);
    }

    /**
     * Type of branched polymer used as template.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the branched template.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}