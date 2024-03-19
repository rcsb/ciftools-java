package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
 * details provided by depositors about deposited chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompDepositorInfo extends DelegatingCategory {
    public PdbxChemCompDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "comp_id":
                return getCompId();
            case "alt_comp_id":
                return getAltCompId();
            case "name":
                return getName();
            case "formula":
                return getFormula();
            case "type":
                return getType();
            case "descriptor":
                return getDescriptor();
            case "descriptor_type":
                return getDescriptorType();
            case "in_dictionary_flag":
                return getInDictionaryFlag();
            case "details":
                return getDetails();
            case "upload_file_name":
                return getUploadFileName();
            case "upload_file_type":
                return getUploadFileType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The alternate chemical component identifier matching the deposited chemical component.
     * @return StrColumn
     */
    public StrColumn getAltCompId() {
        return delegate.getColumn("alt_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The chemical name of the component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The formula for the chemical component. Formulae are written
     * according to the following rules:
     * 
     * (1) Only recognized element symbols may be used.
     * 
     * (2) Each element symbol is followed by a 'count' number. A count
     * of '1' may be omitted.
     * 
     * (3) A space or parenthesis must separate each cluster of
     * (element symbol + count), but in general parentheses are
     * not used.
     * 
     * (4) The order of elements depends on whether carbon is
     * present or not. If carbon is present, the order should be:
     * C, then H, then the other elements in alphabetical order
     * of their symbol. If carbon is not present, the elements
     * are listed purely in alphabetic order of their symbol. This
     * is the 'Hill' system used by Chemical Abstracts.
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the chemical component type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return delegate.getColumn("descriptor", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getDescriptorType() {
        return delegate.getColumn("descriptor_type", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the chemical component is defined in the chemical component dictionary.
     * @return StrColumn
     */
    public StrColumn getInDictionaryFlag() {
        return delegate.getColumn("in_dictionary_flag", DelegatingStrColumn::new);
    }

    /**
     * This data item contains additional details about this
     * component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The filename of an uploaded description of a component
     * component.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return delegate.getColumn("upload_file_name", DelegatingStrColumn::new);
    }

    /**
     * The type of an uploaded description of a component
     * component.
     * @return StrColumn
     */
    public StrColumn getUploadFileType() {
        return delegate.getColumn("upload_file_type", DelegatingStrColumn::new);
    }

}