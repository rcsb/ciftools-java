package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe atomic scattering
 * information used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomTypeScat extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_type_scat";

    public AtomTypeScat(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The set of Cromer-Mann coefficients for generating X-ray scattering
     * factors. [ a1, b1, a2, b2, a3, b3, a4, b4, c]
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.4
     * @return StrColumn
     */
    public StrColumn getCromerMannCoeffs() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Cromer_Mann_coeffs"));
    }

    /**
     * 
     * The anomalous dispersion scattering factor in its complex form
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return StrColumn
     */
    public StrColumn getDispersion() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion"));
    }

    /**
     * 
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return StrColumn
     */
    public StrColumn getDispersionImag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_imag"));
    }

    /**
     * 
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and Cu K alpha radiation
     * @return StrColumn
     */
    public StrColumn getDispersionImagCu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_imag_cu"));
    }

    /**
     * 
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and Mo K alpha radiation
     * @return StrColumn
     */
    public StrColumn getDispersionImagMo() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_imag_mo"));
    }

    /**
     * 
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return StrColumn
     */
    public StrColumn getDispersionReal() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_real"));
    }

    /**
     * 
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Cu K alpha radiation
     * @return StrColumn
     */
    public StrColumn getDispersionRealCu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_real_cu"));
    }

    /**
     * 
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Mo K alpha radiation
     * @return StrColumn
     */
    public StrColumn getDispersionRealMo() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_real_mo"));
    }

    /**
     * 
     * Reference to source of real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getDispersionSource() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_dispersion_source"));
    }

    /**
     * 
     * The set of Fox et al. coefficients for generating high angle
     * X-ray scattering factors. [ c0, c1, c2, c3 ]
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return StrColumn
     */
    public StrColumn getHiAngFoxCoeffs() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hi_ang_Fox_coeffs"));
    }

    /**
     * 
     * The bound coherent scattering length for the atom type at the
     * isotopic composition used for the diffraction experiment.
     * @return StrColumn
     */
    public StrColumn getLengthNeutron() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_length_neutron"));
    }

    /**
     * 
     * Reference to source of scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_source"));
    }

    /**
     * 
     * The identity of the atom specie(s) representing this atom type.
     * See _atom_type.symbol for further details.
     * @return StrColumn
     */
    public StrColumn getSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_symbol"));
    }

    /**
     * 
     * List of scattering factors as a function of sin theta on lambda.
     * List has the form [[&lt;stol value 1&gt; &lt;scatfac 1&gt;] [&lt;stol value 2&gt; &lt;scatfac 2&gt;] ....] in
     * increments of 0.01, increasing from 0.0.
     * @return StrColumn
     */
    public StrColumn getVersusStolList() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_versus_stol_list"));
    }
}
