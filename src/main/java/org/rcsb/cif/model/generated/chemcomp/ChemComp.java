package org.rcsb.cif.model.generated.chemcomp;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import java.util.Map;

public class ChemComp extends BaseCifCategory {
    public ChemComp(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public ChemComp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
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
        return (Formula) (isText ? getTextColumn("formula") : getBinaryColumn("formula", "Formula"));
    }

    /**
     * Formula mass in daltons of the chemical component.
     * @return FormulaWeight
     */
    public FormulaWeight getFormulaWeight() {
        return (FormulaWeight) (isText ? getTextColumn("formula_weight") : getBinaryColumn("formula_weight", "FormulaWeight"));
    }

    /**
     * The value of _chem_comp.id must uniquely identify each item in
     * the CHEM_COMP list.
     * 
     * For protein polymer entities, this is the three-letter code for
     * the amino acid.
     * 
     * For nucleic acid polymer entities, this is the one-letter code
     * for the base.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id", "Id"));
    }

    /**
     * 'yes' indicates that this is a 'standard' monomer, 'no'
     * indicates that it is 'nonstandard'. Nonstandard monomers
     * should be described in more detail using the
     * _chem_comp.mon_nstd_parent, _chem_comp.mon_nstd_class and
     * _chem_comp.mon_nstd_details data items.
     * @return MonNstdFlag
     */
    public MonNstdFlag getMonNstdFlag() {
        return (MonNstdFlag) (isText ? getTextColumn("mon_nstd_flag") : getBinaryColumn("mon_nstd_flag", "MonNstdFlag"));
    }

    /**
     * The full name of the component.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? getTextColumn("name") : getBinaryColumn("name", "Name"));
    }

    /**
     * For standard polymer components, the type of the monomer.
     * Note that monomers that will form polymers are of three types:
     * linking monomers, monomers with some type of N-terminal (or 5')
     * cap and monomers with some type of C-terminal (or 3') cap.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type", "Type"));
    }

    /**
     * Synonym list for the component.
     * @return PdbxSynonyms
     */
    public PdbxSynonyms getPdbxSynonyms() {
        return (PdbxSynonyms) (isText ? getTextColumn("pdbx_synonyms") : getBinaryColumn("pdbx_synonyms", "PdbxSynonyms"));
    }
}
