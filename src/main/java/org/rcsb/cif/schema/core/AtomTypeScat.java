package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * The set of Cromer-Mann coefficients for generating X-ray scattering
     * factors. [ a1, b1, a2, b2, a3, b3, a4, b4, c]
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.4
     * @return FloatColumn
     */
    public FloatColumn getCromerMannCoeffs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_coeffs"));
    }

    /**
     * The anomalous dispersion scattering factor in its complex form
     * for this atom type and radiation by _diffrn_radiation_wavelength.value
     * @return StrColumn
     */
    public StrColumn getDispersion() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_dispersion"));
    }

    /**
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and Cu K alpha radiation
     * @return FloatColumn
     */
    public FloatColumn getDispersionImagCu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag_cu"));
    }

    /**
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and Mo K alpha radiation
     * @return FloatColumn
     */
    public FloatColumn getDispersionImagMo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag_mo"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Cu K alpha radiation
     * @return FloatColumn
     */
    public FloatColumn getDispersionRealCu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real_cu"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Mo K alpha radiation
     * @return FloatColumn
     */
    public FloatColumn getDispersionRealMo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real_mo"));
    }

    /**
     * The set of data items used to define Fox et al.  coefficients
     * for generation of high angle (s &gt;2.0) X-ray scattering factors.
     * 
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC0() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_Fox_c0"));
    }

    /**
     * The set of data items used to define Fox et al.  coefficients
     * for generation of high angle (s &gt;2.0) X-ray scattering factors.
     * 
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_Fox_c1"));
    }

    /**
     * The set of data items used to define Fox et al.  coefficients
     * for generation of high angle (s &gt;2.0) X-ray scattering factors.
     * 
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_Fox_c2"));
    }

    /**
     * The set of data items used to define Fox et al.  coefficients
     * for generation of high angle (s &gt;2.0) X-ray scattering factors.
     * 
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_Fox_c3"));
    }

    /**
     * The set of Fox et al. coefficients for generating high angle
     * X-ray scattering factors. [ c0, c1, c2, c3 ]
     * Ref: International Tables for Crystallography, Vol. C
     * (1991) Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxCoeffs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_Fox_coeffs"));
    }

    /**
     * The identity of the atom specie(s) representing this atom type.
     * See _atom_type.symbol for further details.
     * @return StrColumn
     */
    public StrColumn getSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_symbol"));
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
    public FloatColumn getCromerMannC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_Cromer_Mann_c"));
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
    public FloatColumn getDispersionReal() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real"));
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
    public FloatColumn getLengthNeutron() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_length_neutron"));
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
    public StrColumn getVersusStolList() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_versus_stol_list"));
    }

}