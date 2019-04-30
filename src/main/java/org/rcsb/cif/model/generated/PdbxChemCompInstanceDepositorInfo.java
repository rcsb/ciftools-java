package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
 * depositor provided information about the chemical context of component instances.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompInstanceDepositorInfo extends BaseCategory {
    public PdbxChemCompInstanceDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompInstanceDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompInstanceDepositorInfo(String name) {
        super(name);
    }

    /**
     * The value of pdbx_chem_comp_instance_depositor_info.ordinal must uniquely identify a record in
     * the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO list.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * Optional element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * A flag to indicate if the chemical component instance is a part of a polymer molecule.
     * @return StrColumn
     */
    public StrColumn getInPolymerFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("in_polymer_flag", StrColumn::new) :
                getBinaryColumn("in_polymer_flag"));
    }

    /**
     * A flag to indicate if details about this chemical component instance have been provided by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthorProvidedFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("author_provided_flag", StrColumn::new) :
                getBinaryColumn("author_provided_flag"));
    }

    /**
     * The observed formula for the chemical component in the deposited coordinates.
     * Formulae are written according to the following rules:
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
}
