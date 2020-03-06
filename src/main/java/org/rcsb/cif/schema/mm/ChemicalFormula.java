package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEMICAL_FORMULA category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_FORMULA category specify the
 * composition and chemical properties of the compound. The formula
 * data items must agree with those that specify the density,
 * unit-cell and Z values.
 * 
 * The following rules apply to the construction of the data items
 * _chemical_formula.analytical, _chemical_formula.structural and
 * _chemical_formula.sum. For the data item
 * _chemical_formula.moiety, the formula construction is broken up
 * into residues or moieties, i.e. groups of atoms that form a
 * molecular unit or molecular ion. The rules given below apply
 * within each moiety but different requirements apply to the way
 * that moieties are connected (see _chemical_formula.moiety).
 * 
 * (1) Only recognized element symbols may be used.
 * 
 * (2) Each element symbol is followed by a 'count' number. A count
 * of '1' may be omitted.
 * 
 * (3) A space or parenthesis must separate each cluster of (element
 * symbol + count).
 * 
 * (4) Where a group of elements is enclosed in parentheses, the
 * multiplier for the group must follow the closing parenthesis.
 * That is, all element and group multipliers are assumed to be
 * printed as subscripted numbers. (An exception to this rule
 * exists for _chemical_formula.moiety formulae where pre- and
 * post-multipliers are permitted for molecular units.)
 * 
 * (5) Unless the elements are ordered in a manner that corresponds
 * to their chemical structure, as in
 * _chemical_formula.structural, the order of the elements within
 * any group or moiety should be:  C, then H, then the other
 * elements in alphabetical order of their symbol. This is the
 * 'Hill' system used by Chemical Abstracts. This ordering is
 * used in _chemical_formula.moiety and _chemical_formula.sum.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalFormula extends DelegatingCategory {
    public ChemicalFormula(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "analytical":
                return getAnalytical();
            case "entry_id":
                return getEntryId();
            case "iupac":
                return getIupac();
            case "moiety":
                return getMoiety();
            case "structural":
                return getStructural();
            case "sum":
                return getSum();
            case "weight":
                return getWeight();
            case "weight_meas":
                return getWeightMeas();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Formula determined by standard chemical analysis including trace
     * elements. See the CHEMICAL_FORMULA category description for
     * rules for writing chemical formulae. Parentheses are used only
     * for standard uncertainties (estimated standard deviations).
     * @return StrColumn
     */
    public StrColumn getAnalytical() {
        return delegate.getColumn("analytical", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Formula expressed in conformance with IUPAC rules for inorganic
     * and metal-organic compounds where these conflict with the rules
     * for any other CHEMICAL_FORMULA entries. Typically used for
     * formatting a formula in accordance with journal rules. This
     * should appear in the data block in addition to the most
     * appropriate of the other CHEMICAL_FORMULA data names.
     * 
     * Ref: IUPAC (1990). Nomenclature of Inorganic Chemistry.
     * Oxford: Blackwell Scientific Publications.
     * @return StrColumn
     */
    public StrColumn getIupac() {
        return delegate.getColumn("iupac", DelegatingStrColumn::new);
    }

    /**
     * Formula with each discrete bonded residue or ion shown as a
     * separate moiety. See the CHEMICAL_FORMULA category description
     * for rules for writing chemical formulae. In addition to the
     * general formulae requirements, the following rules apply:
     * (1) Moieties are separated by commas ','.
     * (2) The order of elements within a moiety follows general rule
     * (5) in the CHEMICAL_FORMULA category description.
     * (3) Parentheses are not used within moieties but may surround
     * a moiety. Parentheses may not be nested.
     * (4) Charges should be placed at the end of the moiety. The
     * charge '+' or '-' may be preceded by a numerical multiplier
     * and should be separated from the last (element symbol +
     * count) by a space. Pre- or post-multipliers may be used for
     * individual moieties.
     * @return StrColumn
     */
    public StrColumn getMoiety() {
        return delegate.getColumn("moiety", DelegatingStrColumn::new);
    }

    /**
     * See the CHEMICAL_FORMULA category description for the rules for
     * writing chemical formulae for inorganics, organometallics, metal
     * complexes etc., in which bonded groups are preserved as
     * discrete entities within parentheses, with post-multipliers as
     * required. The order of the elements should give as much
     * information as possible about the chemical structure.
     * Parentheses may be used and nested as required. This formula
     * should correspond to the structure as actually reported, i.e.
     * trace elements not included in atom-type and atom-site data
     * should not be included in this formula (see also
     * _chemical_formula.analytical).
     * @return StrColumn
     */
    public StrColumn getStructural() {
        return delegate.getColumn("structural", DelegatingStrColumn::new);
    }

    /**
     * See the CHEMICAL_FORMULA category description for the rules
     * for writing chemical formulae in which all discrete bonded
     * residues and ions are summed over the constituent elements,
     * following the ordering given in general rule (5) in the
     * CHEMICAL_FORMULA category description. Parentheses are not
     * normally used.
     * @return StrColumn
     */
    public StrColumn getSum() {
        return delegate.getColumn("sum", DelegatingStrColumn::new);
    }

    /**
     * Formula mass in daltons. This mass should correspond to the
     * formulae given under _chemical_formula.structural,
     * _chemical_formula.moiety or _chemical_formula.sum and,
     * together with the Z value and cell parameters, should
     * yield the density given as _exptl_crystal.density_diffrn.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return delegate.getColumn("weight", DelegatingFloatColumn::new);
    }

    /**
     * Formula mass in daltons measured by a non-diffraction experiment.
     * @return FloatColumn
     */
    public FloatColumn getWeightMeas() {
        return delegate.getColumn("weight_meas", DelegatingFloatColumn::new);
    }

}