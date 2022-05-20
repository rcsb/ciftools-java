package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_CHEM_COMP_DESCRIPTOR category record the
 * details of the chemical components that are defined locally
 * within the mmCIF file instance.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaChemCompDescriptor extends DelegatingCategory {
    public MaChemCompDescriptor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "chem_comp_id":
                return getChemCompId();
            case "chem_comp_name":
                return getChemCompName();
            case "type":
                return getType();
            case "value":
                return getValue();
            case "software_id":
                return getSoftwareId();
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
     * An identifier for the chemical component.
     * This data item is a pointer to _chem_comp.id
     * in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return delegate.getColumn("chem_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the chemical component.
     * @return StrColumn
     */
    public StrColumn getChemCompName() {
        return delegate.getColumn("chem_comp_name", DelegatingStrColumn::new);
    }

    /**
     * The type of descriptor for the chemical component.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The value of the descriptor identified in _ma_chem_comp_descriptor.type.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * Identifier for the software used to generate the chemical descriptor defined in
     * _ma_chem_comp_descriptor.type and _ma_chem_comp_descriptor.value.
     * This data item is a pointer to _software.pdbx_ordinal in the SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details about the chemical component descriptor.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}