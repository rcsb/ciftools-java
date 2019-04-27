package org.rcsb.cif.model.pdbxchemcompdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompDepositorInfo extends BaseCategory {
    public PdbxChemCompDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompDepositorInfo(String name) {
        super(name);
    }

    /**
     * Ordinal index for this category.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The alternate chemical component identifier matching the deposited chemical component.
     * @return AltCompId
     */
    public AltCompId getAltCompId() {
        return (AltCompId) (isText ? textFields.computeIfAbsent("alt_comp_id",
                AltCompId::new) : getBinaryColumn("alt_comp_id"));
    }

    /**
     * The chemical name of the component.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
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
     * @return Formula
     */
    public Formula getFormula() {
        return (Formula) (isText ? textFields.computeIfAbsent("formula",
                Formula::new) : getBinaryColumn("formula"));
    }

    /**
     * This data item contains the chemical component type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return Descriptor
     */
    public Descriptor getDescriptor() {
        return (Descriptor) (isText ? textFields.computeIfAbsent("descriptor",
                Descriptor::new) : getBinaryColumn("descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return DescriptorType
     */
    public DescriptorType getDescriptorType() {
        return (DescriptorType) (isText ? textFields.computeIfAbsent("descriptor_type",
                DescriptorType::new) : getBinaryColumn("descriptor_type"));
    }

    /**
     * A flag to indicate if the chemical component is defined in the chemical component dictionary.
     * @return InDictionaryFlag
     */
    public InDictionaryFlag getInDictionaryFlag() {
        return (InDictionaryFlag) (isText ? textFields.computeIfAbsent("in_dictionary_flag",
                InDictionaryFlag::new) : getBinaryColumn("in_dictionary_flag"));
    }

    /**
     * This data item contains additional details about this
     * component.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
