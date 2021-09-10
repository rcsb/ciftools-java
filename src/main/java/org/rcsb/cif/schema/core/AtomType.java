package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe atomic type information
 * used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomType extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_type";

    public AtomType(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Mass of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getAtomicMass() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_atomic_mass"));
    }

    /**
     * Atomic number of this atom type.
     * @return IntColumn
     */
    public IntColumn getAtomicNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_type_atomic_number"));
    }

    /**
     * A description of the atom(s) designated by this atom type. In
     * most cases this will be the element name and oxidation state of
     * a single atom  species. For disordered or nonstoichiometric
     * structures it will describe a combination of atom species.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_description"));
    }

    /**
     * The display colour assigned to this atom type. Note that the
     * possible colours are enumerated in the display_colour list
     * category of items.
     * @return StrColumn
     */
    public StrColumn getDisplayColour() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_display_colour"));
    }

    /**
     * Number of electrons in this atom type.
     * @return IntColumn
     */
    public IntColumn getElectronCount() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_type_electron_count"));
    }

    /**
     * Element symbol for of this atom type. The default value is extracted
     * from the ion-to-element enumeration_default list using the index
     * value of _atom_type.symbol.
     * @return StrColumn
     */
    public StrColumn getElementSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_element_symbol"));
    }

    /**
     * Value is a unique key to a set of ATOM_TYPE items
     * in a looped list.
     * @return StrColumn
     */
    public StrColumn getKey() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_key"));
    }

    /**
     * Total number of atoms of this atom type in the unit cell.
     * @return FloatColumn
     */
    public FloatColumn getNumberInCell() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_number_in_cell"));
    }

    /**
     * Formal oxidation state of this atom type in the structure.
     * @return IntColumn
     */
    public IntColumn getOxidationNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_type_oxidation_number"));
    }

    /**
     * The effective intra-molecular bonding radius of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusBond() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_radius_bond"));
    }

    /**
     * The effective inter-molecular bonding radius of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusContact() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_radius_contact"));
    }

    /**
     * The identity of the atom specie(s) representing this atom type.
     * Normally this code is the element symbol followed by the charge
     * if there is one. The symbol may be composed of any character except
     * an underline or a blank, with the proviso that digits designate an
     * oxidation state and must be followed by a + or - character.
     * @return StrColumn
     */
    public StrColumn getSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_symbol"));
    }

    /**
     * Mass percentage of this atom type derived from chemical analysis.
     * @return FloatColumn
     */
    public FloatColumn getAnalyticalMass() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_analytical_mass_%", "atom_type_analytical_mass_percent"));
    }

    /**
     * Mass percentage of this atom type derived from chemical analysis.
     * @return FloatColumn
     */
    public FloatColumn getAnalyticalMassPercent() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_analytical_mass_%", "atom_type_analytical_mass_percent"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA4() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA4() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_a4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB4() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB4() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_b4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_c"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of X-ray scattering factors.
     * 
     * Ref: International Tables for X-ray Crystallography, Vol. IV
     * (1974) Table 2.2B
     * or   International Tables for Crystallography, Vol. C
     * (1991) Tables 6.1.1.4 and 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getCromerMannC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_c"));
    }

    /**
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionImag() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag"));
    }

    /**
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return FloatColumn
     */
    public FloatColumn getDispersionImag() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionReal() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return FloatColumn
     */
    public FloatColumn getDispersionReal() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real"));
    }

    /**
     * Reference to source of real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatDispersionSource() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_dispersion_source"));
    }

    /**
     * Reference to source of real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getDispersionSource() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_dispersion_source"));
    }

    /**
     * The bound coherent scattering length for the atom type at the
     * isotopic composition used for the diffraction experiment.
     * @return FloatColumn
     */
    public FloatColumn getScatLengthNeutron() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_length_neutron"));
    }

    /**
     * The bound coherent scattering length for the atom type at the
     * isotopic composition used for the diffraction experiment.
     * @return FloatColumn
     */
    public FloatColumn getLengthNeutron() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_length_neutron"));
    }

    /**
     * Reference to source of scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatSource() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_source"));
    }

    /**
     * Reference to source of scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_source"));
    }

    /**
     * List of scattering factors as a function of sin theta on lambda.
     * List has the form [[&lt;stol value 1&gt; &lt;scatfac 1&gt;] [&lt;stol value 2&gt; &lt;scatfac 2&gt;] ....] in
     * increments of 0.01, increasing from 0.0.
     * @return StrColumn
     */
    public StrColumn getScatVersusStolList() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_versus_stol_list"));
    }

    /**
     * List of scattering factors as a function of sin theta on lambda.
     * List has the form [[&lt;stol value 1&gt; &lt;scatfac 1&gt;] [&lt;stol value 2&gt; &lt;scatfac 2&gt;] ....] in
     * increments of 0.01, increasing from 0.0.
     * @return StrColumn
     */
    public StrColumn getVersusStolList() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_versus_stol_list"));
    }

}