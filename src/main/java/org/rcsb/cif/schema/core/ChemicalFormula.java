package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalFormula extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chemical_formula";

    public ChemicalFormula(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Formula determined by standard chemical analysis including trace
     * elements. Parentheses are used only for standard uncertainties (su's).
     * @return StrColumn
     */
    public StrColumn getAnalytical() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_formula_analytical"));
    }

    /**
     * Formula expressed in conformance with IUPAC rules for inorganic
     * and metal-organic compounds where these conflict with the rules
     * for any other chemical_formula entries. Typically used for
     * formatting a formula in accordance with journal rules. This
     * should appear in the data block in addition to the most
     * appropriate of the other chemical_formula data names.
     * Ref: IUPAC (1990). Nomenclature of Inorganic Chemistry.
     * Oxford: Blackwell Scientific Publications.
     * @return StrColumn
     */
    public StrColumn getIupac() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_formula_iupac"));
    }

    /**
     * Formula with each discrete bonded residue or ion shown as a
     * separate moiety. See above CHEMICAL_FORMULA for rules
     * for writing chemical formulae. In addition to the general
     * formulae requirements, the following rules apply:
     * 1. Moieties are separated by commas ','.
     * 2. The order of elements within a moiety follows general rule
     * 5 in CHEMICAL_FORMULA.
     * 3. Parentheses are not used within moieties but may surround
     * a moiety. Parentheses may not be nested.
     * 4. Charges should be placed at the end of the moiety. The
     * Singlege '+' or '-' may be preceded by a numerical multiplier
     * and should be separated from the last (element symbol +
     * count) by a space. Pre- or post-multipliers may be used for
     * individual moieties.
     * @return StrColumn
     */
    public StrColumn getMoiety() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_formula_moiety"));
    }

    /**
     * This formula should correspond to the structure as reported, i.e.
     * trace elements not included in atom type and atom site lists should
     * not be included. See category description for the rules for writing
     * chemical formulae for inorganics, organometallics, metal complexes
     * etc., in which bonded groups are preserved as discrete entities
     * within parentheses, with post-multipliers as required. The order of
     * the elements should give as much information as possible about the
     * chemical structure. Parentheses may be used and nested as required.
     * This formula should correspond to the structure as actually reported,
     * i.e. trace elements not included in atom-type and atom-site lists
     * should not be included (see also _chemical_formula.analytical).
     * @return StrColumn
     */
    public StrColumn getStructural() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_formula_structural"));
    }

    /**
     * Chemical formulae in which all discrete bonded residues and ions are
     * summed over the constituent elements, following the ordering given
     * in rule 5 of the CATEGORY description. Parentheses normally not used.
     * @return StrColumn
     */
    public StrColumn getSum() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_formula_sum"));
    }

    /**
     * Mass corresponding to the formulae _chemical_formula.structural,
     * *_IUPAC, *_moiety or *_sum and, together with the Z value and cell
     * parameters yield the density given as _exptl_crystal.density_diffrn.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return new DelegatingFloatColumn(parentBlock.getColumn("chemical_formula_weight"));
    }

    /**
     * Formula mass measured by a non-diffraction experiment.
     * @return FloatColumn
     */
    public FloatColumn getWeightMeas() {
        return new DelegatingFloatColumn(parentBlock.getColumn("chemical_formula_weight_meas"));
    }

    /**
     * Standard uncertainty of _chemical_formula.weight_meas.
     * @return FloatColumn
     */
    public FloatColumn getWeightMeasSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("chemical_formula_weight_meas_su"));
    }

}