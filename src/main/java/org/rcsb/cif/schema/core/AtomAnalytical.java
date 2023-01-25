package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe elemental
 * composition information used in crystallographic
 * structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomAnalytical extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_analytical";

    public AtomAnalytical(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Symbol of the element for which a particular composition
     * refers to, as given by _atom_analytical.analyte_mass_percent.
     * @return StrColumn
     */
    public StrColumn getAnalyte() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_analyte"));
    }

    /**
     * Mass percentage of the analyte element derived from elemental analysis.
     * @return FloatColumn
     */
    public FloatColumn getAnalyteMassPercent() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_analyte_mass_percent"));
    }

    /**
     * Standard uncertainty of _atom_analytical.analyte_mass_percent.
     * @return FloatColumn
     */
    public FloatColumn getAnalyteMassPercentSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_analyte_mass_percent_su"));
    }

    /**
     * Chemical formula of the species for which the corresponding
     * _atom_analytical.chemical_species_mass_percent refers.
     * 
     * The following rules apply in the construction of the formula:
     * 
     * 1. Only recognized element symbols may be used.
     * 
     * 2. The first element corresponds to the analyte. The remaining
     * elements should be given in alphabetical order by symbol.
     * 
     * 3. Each element symbol is followed by a 'count' number. A count of
     * '1' may be omitted.
     * 
     * 4. A space or parenthesis must separate each cluster of (element
     * symbol + count). A formula cannot begin with a paranthesis.
     * 
     * 5. Where a group of elements is enclosed in parentheses, the
     * multiplier for the group must follow the closing parentheses.
     * That is, all element and group multipliers are assumed to be
     * printed as subscripted numbers.
     * @return StrColumn
     */
    public StrColumn getChemicalSpecies() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_chemical_species"));
    }

    /**
     * Mass percentage of the chemical species given in
     * _atom_analytical.chemical_species as derived from elemental analysis.
     * 
     * This is most often used in elemental compositions determined by XRF,
     * where elements are reported as equivalent mass percentages of their
     * relevant oxide. For example: Al is reported as Al2O3, P is reported
     * as P2O5.
     * @return FloatColumn
     */
    public FloatColumn getChemicalSpeciesMassPercent() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_chemical_species_mass_percent"));
    }

    /**
     * Standard uncertainty of _atom_analytical.chemical_species_mass_percent.
     * @return FloatColumn
     */
    public FloatColumn getChemicalSpeciesMassPercentSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_chemical_species_mass_percent_su"));
    }

    /**
     * Arbitrary label uniquely identifying a single composition value.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_id"));
    }

    /**
     * Arbitrary label identifying the source of an elemental composition.
     * This code must match the _atom_analytical_source.id of the associated
     * technique in the analytical source list.
     * @return StrColumn
     */
    public StrColumn getMeasId() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_meas_id"));
    }

}