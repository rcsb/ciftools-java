package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
 * depositor provided information about the chemical context of component instances.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompInstanceDepositorInfo extends DelegatingCategory {
    public PdbxChemCompInstanceDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "label_alt_id":
                return getLabelAltId();
            case "comp_id":
                return getCompId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "in_polymer_flag":
                return getInPolymerFlag();
            case "author_provided_flag":
                return getAuthorProvidedFlag();
            case "formula":
                return getFormula();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of pdbx_chem_comp_instance_depositor_info.ordinal must uniquely identify a record in
     * the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO list.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * Optional element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the chemical component instance is a part of a polymer molecule.
     * @return StrColumn
     */
    public StrColumn getInPolymerFlag() {
        return delegate.getColumn("in_polymer_flag", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if details about this chemical component instance have been provided by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthorProvidedFlag() {
        return delegate.getColumn("author_provided_flag", DelegatingStrColumn::new);
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
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

}