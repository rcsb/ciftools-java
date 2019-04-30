package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
 * details provided by depositors about deposited chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The alternate chemical component identifier matching the deposited chemical component.
     * @return StrColumn
     */
    public StrColumn getAltCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("alt_comp_id", StrColumn::new) :
                getBinaryColumn("alt_comp_id"));
    }

    /**
     * The chemical name of the component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("formula", StrColumn::new) :
                getBinaryColumn("formula"));
    }

    /**
     * This data item contains the chemical component type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("descriptor", StrColumn::new) :
                getBinaryColumn("descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getDescriptorType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("descriptor_type", StrColumn::new) :
                getBinaryColumn("descriptor_type"));
    }

    /**
     * A flag to indicate if the chemical component is defined in the chemical component dictionary.
     * @return StrColumn
     */
    public StrColumn getInDictionaryFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("in_dictionary_flag", StrColumn::new) :
                getBinaryColumn("in_dictionary_flag"));
    }

    /**
     * This data item contains additional details about this
     * component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
