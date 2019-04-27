package org.rcsb.cif.model.chemicalformula;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemicalFormula extends BaseCategory {
    public ChemicalFormula(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemicalFormula(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemicalFormula(String name) {
        super(name);
    }

    /**
     * Formula determined by standard chemical analysis including trace
     * elements. See the CHEMICAL_FORMULA category description for
     * rules for writing chemical formulae. Parentheses are used only
     * for standard uncertainties (estimated standard deviations).
     * @return Analytical
     */
    public Analytical getAnalytical() {
        return (Analytical) (isText ? textFields.computeIfAbsent("analytical",
                Analytical::new) : getBinaryColumn("analytical"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
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
     * @return Iupac
     */
    public Iupac getIupac() {
        return (Iupac) (isText ? textFields.computeIfAbsent("iupac",
                Iupac::new) : getBinaryColumn("iupac"));
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
     * @return Moiety
     */
    public Moiety getMoiety() {
        return (Moiety) (isText ? textFields.computeIfAbsent("moiety",
                Moiety::new) : getBinaryColumn("moiety"));
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
     * @return Structural
     */
    public Structural getStructural() {
        return (Structural) (isText ? textFields.computeIfAbsent("structural",
                Structural::new) : getBinaryColumn("structural"));
    }

    /**
     * See the CHEMICAL_FORMULA category description for the rules
     * for writing chemical formulae in which all discrete bonded
     * residues and ions are summed over the constituent elements,
     * following the ordering given in general rule (5) in the
     * CHEMICAL_FORMULA category description. Parentheses are not
     * normally used.
     * @return Sum
     */
    public Sum getSum() {
        return (Sum) (isText ? textFields.computeIfAbsent("sum",
                Sum::new) : getBinaryColumn("sum"));
    }

    /**
     * Formula mass in daltons. This mass should correspond to the
     * formulae given under _chemical_formula.structural,
     * _chemical_formula.moiety or _chemical_formula.sum and,
     * together with the Z value and cell parameters, should
     * yield the density given as _exptl_crystal.density_diffrn.
     * @return Weight
     */
    public Weight getWeight() {
        return (Weight) (isText ? textFields.computeIfAbsent("weight",
                Weight::new) : getBinaryColumn("weight"));
    }

    /**
     * Formula mass in daltons measured by a non-diffraction experiment.
     * @return WeightMeas
     */
    public WeightMeas getWeightMeas() {
        return (WeightMeas) (isText ? textFields.computeIfAbsent("weight_meas",
                WeightMeas::new) : getBinaryColumn("weight_meas"));
    }
}
