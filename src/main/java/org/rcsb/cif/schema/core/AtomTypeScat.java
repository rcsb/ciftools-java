package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used to describe atomic scattering
 * information used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomTypeScat extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_type_scat";

    public AtomTypeScat(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The set of Cromer-Mann 'a' coefficients for generating X-ray scattering
     * factors:
     * [ a1, a2, a3, a4 ].
     * 
     * See also: _atom_type_scat.Cromer_Mann_bs
     * _atom_type_scat.Cromer_Mann_c
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C, Table 6.1.1.4.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannAs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_cromer_mann_as"));
    }

    /**
     * The set of Cromer-Mann 'b' coefficients for generating X-ray scattering
     * factors:
     * [ b1, b2, b3, b4 ].
     * 
     * See also: _atom_type_scat.Cromer_Mann_as
     * _atom_type_scat.Cromer_Mann_c
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C, Table 6.1.1.4.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannBs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_cromer_mann_bs"));
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
     * for this atom type and Cu Kα radiation.
     * @return FloatColumn
     */
    public FloatColumn getDispersionImagCu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag_cu"));
    }

    /**
     * The imaginary component of the anomalous dispersion scattering factors
     * for this atom type and Mo Kα radiation.
     * @return FloatColumn
     */
    public FloatColumn getDispersionImagMo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_imag_mo"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Cu Kα radiation.
     * @return FloatColumn
     */
    public FloatColumn getDispersionRealCu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real_cu"));
    }

    /**
     * The real component of the anomalous dispersion scattering factors
     * for this atom type and Mo Kα radiation.
     * @return FloatColumn
     */
    public FloatColumn getDispersionRealMo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_dispersion_real_mo"));
    }

    /**
     * The set of polynomial coefficients for generating X-ray scattering factors:
     * [ a_0, a_1, ... , a_N ].
     * 
     * f(s; Z) = exp[Sum(a~i~ * s^i^), i=0:N]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getExponentialPolynomialCoefs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_exponential_polynomial_coefs"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.exponential_polynomial_coefs.
     * @return FloatColumn
     */
    public FloatColumn getExponentialPolynomialCoefsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_exponential_polynomial_coefs_su"));
    }

    /**
     * The inclusive lower limit of s for which the corresponding exponential
     * polynomial coefficients are valid.
     * 
     * See _atom_type_scat.exponential_polynomial_coefs.
     * @return FloatColumn
     */
    public FloatColumn getExponentialPolynomialLowerLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_exponential_polynomial_lower_limit"));
    }

    /**
     * The exclusive upper limit of s for which the corresponding exponential
     * polynomial coefficients are valid.
     * 
     * See _atom_type_scat.exponential_polynomial_coefs.
     * @return FloatColumn
     */
    public FloatColumn getExponentialPolynomialUpperLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_exponential_polynomial_upper_limit"));
    }

    /**
     * The set of Gaussian scalar coefficients for generating X-ray scattering
     * factors:
     * [ a_1, a_2, ... , a_N ].
     * 
     * f(s; Z) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:N]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.Gaussian_bs
     * _atom_type_scat.Gaussian_c
     * @return FloatColumn
     */
    public FloatColumn getGaussianAs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_as"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.Gaussian_as.
     * @return FloatColumn
     */
    public FloatColumn getGaussianAsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_as_su"));
    }

    /**
     * The set of Gaussian exponent coefficients for generating X-ray scattering
     * factors:
     * [ b_1, b_2, ... , b_N ].
     * 
     * f(s; Z) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:N]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.Gaussian_as
     * _atom_type_scat.Gaussian_c
     * @return FloatColumn
     */
    public FloatColumn getGaussianBs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_bs"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.Gaussian_bs.
     * @return FloatColumn
     */
    public FloatColumn getGaussianBsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_bs_su"));
    }

    /**
     * The Gaussian constant coefficient for generating X-ray scattering factors:
     * c.
     * 
     * f(s; Z) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:N]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.gaussian_as
     * _atom_type_scat.gaussian_bs
     * @return FloatColumn
     */
    public FloatColumn getGaussianC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_c"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.Gaussian_c.
     * @return FloatColumn
     */
    public FloatColumn getGaussianCSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_c_su"));
    }

    /**
     * The inclusive lower limit of s for which the corresponding Gaussian
     * coefficients are valid.
     * 
     * See also: _atom_type_scat.Gaussian_as
     * _atom_type_scat.Gaussian_bs
     * _atom_type_scat.Gaussian_c
     * @return FloatColumn
     */
    public FloatColumn getGaussianLowerLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_lower_limit"));
    }

    /**
     * The exclusive upper limit of s for which the corresponding Gaussian
     * coefficients are valid.
     * 
     * See also: _atom_type_scat.Gaussian_as
     * _atom_type_scat.Gaussian_bs
     * _atom_type_scat.Gaussian_c
     * @return FloatColumn
     */
    public FloatColumn getGaussianUpperLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_gaussian_upper_limit"));
    }

    /**
     * The set of data items used to define Fox et al. coefficients
     * for generation of high-angle (2.0 &lt; s &lt; 6.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = exp[Sum(c~i~ * s^i^, i=0:3)]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C,
     * Table 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC0() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_fox_c0"));
    }

    /**
     * The set of data items used to define Fox et al. coefficients
     * for generation of high-angle (2.0 &lt; s &lt; 6.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = exp[Sum(c~i~ * s^i^, i=0:3)]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C,
     * Table 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC1() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_fox_c1"));
    }

    /**
     * The set of data items used to define Fox et al. coefficients
     * for generation of high-angle (2.0 &lt; s &lt; 6.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = exp[Sum(c~i~ * s^i^, i=0:3)]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C,
     * Table 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC2() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_fox_c2"));
    }

    /**
     * The set of data items used to define Fox et al. coefficients
     * for generation of high-angle (2.0 &lt; s &lt; 6.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = exp[Sum(c~i~ * s^i^, i=0:3)]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C,
     * Table 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxC3() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_fox_c3"));
    }

    /**
     * The set of Fox et al. coefficients for generating high-angle
     * X-ray scattering factors: [ c0, c1, c2, c3 ]
     * 
     * Ref: International Tables for Crystallography (2004). Vol. C,
     * Table 6.1.1.5
     * @return FloatColumn
     */
    public FloatColumn getHiAngFoxCoefs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_hi_ang_fox_coefs"));
    }

    /**
     * The set of Gaussian scalar coefficients for use in the inverse Mott-Bethe
     * relationship for generating X-ray scattering factors:
     * [ a_1, a_2, ... , a_N ].
     * 
     * f(s; Z~0~) =
     * Z~0~ - 8π^2^ * r~B~ * s^2^ * {c + Sum[ a~i~ * exp(-b~i~ * s^2^), i=1:N]}
     * 
     * where s = sin(θ)/λ, r~B~ is the Bohr radius, and Z~0~ is the number of
     * electrons for the atom or ion. θ is the diffraction angle and λ is the
     * wavelength of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.inv_mott_bethe_bs
     * _atom_type_scat.inv_mott_bethe_c
     * 
     * Ref: Thorkildsen, G. (2023). Acta Cryst. A79, 318-330.
     * Thorkildsen, G. (2024). Acta Cryst. A80, 129-136.
     * Mott, N. F. &amp; Bragg, W. L. (1930). Proc. R. Soc. Lond. Ser. A,
     * 127, 658-665.
     * Bethe, H. (1930). Ann. Phys. 397, 325-400.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheAs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_as"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.inv_Mott_Bethe_as.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheAsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_as_su"));
    }

    /**
     * The set of Gaussian exponent coefficients for use in the inverse Mott-Bethe
     * relationship for generating X-ray scattering factors:
     * [ b_1, b_2, ... , b_N ].
     * 
     * f(s; Z~0~) =
     * Z~0~ - 8π^2^ * r~B~ * s^2^ * {c + Sum[ a~i~ * exp(-b~i~ * s^2^), i=1:N]}
     * 
     * where s = sin(θ)/λ, r~B~ is the Bohr radius, and Z~0~ is the number of
     * electrons for the atom or ion. θ is the diffraction angle and λ is the
     * wavelength of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.inv_mott_bethe_as
     * _atom_type_scat.inv_mott_bethe_c
     * 
     * Ref: Thorkildsen, G. (2023). Acta Cryst. A79, 318-330.
     * Thorkildsen, G. (2024). Acta Cryst. A80, 129-136.
     * Mott, N. F. &amp; Bragg, W. L. (1930). Proc. R. Soc. Lond. Ser. A,
     * 127, 658-665.
     * Bethe, H. (1930). Ann. Phys. 397, 325-400.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheBs() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_bs"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.inv_Mott_Bethe_bs.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheBsSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_bs_su"));
    }

    /**
     * The set of Gaussian constant coefficient for use in the inverse Mott-Bethe
     * relationship for generating X-ray scattering factors:
     * c.
     * 
     * f(s; Z~0~) =
     * Z~0~ - 8π^2^ * r~B~ * s^2^ * {c + Sum[ a~i~ * exp(-b~i~ * s^2^), i=1:N]}
     * 
     * where s = sin(θ)/λ, r~B~ is the Bohr radius, and Z~0~ is the number of
     * electrons for the atom or ion. θ is the diffraction angle and λ is the
     * wavelength of the incident radiation in angstroms.
     * 
     * See also: _atom_type_scat.inv_mott_bethe_as
     * _atom_type_scat.inv_mott_bethe_bs
     * 
     * Ref: Thorkildsen, G. (2023). Acta Cryst. A79, 318-330.
     * Thorkildsen, G. (2024). Acta Cryst. A80, 129-136.
     * Mott, N. F. &amp; Bragg, W. L. (1930). Proc. R. Soc. Lond. Ser. A,
     * 127, 658-665.
     * Bethe, H. (1930). Ann. Phys. 397, 325-400.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheC() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_c"));
    }

    /**
     * Standard uncertainty of _atom_type_scat.inv_Mott_Bethe_c.
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheCSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_c_su"));
    }

    /**
     * The inclusive lower limit of s for which the corresponding Gaussian
     * coefficients are valid.
     * 
     * See also: _atom_type_scat.inv_mott_bethe_as
     * _atom_type_scat.inv_mott_bethe_bs
     * _atom_type_scat.inv_mott_bethe_c
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheLowerLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_lower_limit"));
    }

    /**
     * The exclusive upper limit of s for which the corresponding Gaussian
     * coefficients are valid.
     * 
     * See also: _atom_type_scat.inv_mott_bethe_as
     * _atom_type_scat.inv_mott_bethe_bs
     * _atom_type_scat.inv_mott_bethe_c
     * @return FloatColumn
     */
    public FloatColumn getInvMottBetheUpperLimit() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_type_scat_inv_mott_bethe_upper_limit"));
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
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA1() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_a1", "atom_type_scat_cromer_mann_a1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA2() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_a2", "atom_type_scat_cromer_mann_a2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_a3", "atom_type_scat_cromer_mann_a3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannA4() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_a4", "atom_type_scat_cromer_mann_a4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB1() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_b1", "atom_type_scat_cromer_mann_b1"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB2() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_b2", "atom_type_scat_cromer_mann_b2"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB3() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_b3", "atom_type_scat_cromer_mann_b3"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannB4() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_b4", "atom_type_scat_cromer_mann_b4"));
    }

    /**
     * The set of data items used to define Cromer-Mann coefficients
     * for generation of (0.0 &lt; s &lt; 2.0 Å^-1^) X-ray scattering factors.
     * 
     * f(s) = c + Sum[a~i~ * exp(-b~i~ * s^2^), i=1:4]
     * 
     * where s = sin(θ)/λ, θ is the diffraction angle and λ is the wavelength
     * of the incident radiation in angstroms.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or   International Tables for Crystallography (2004).
     * Vol. C, Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getCromerMannC() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_type_scat_Cromer_Mann_c", "atom_type_scat_cromer_mann_c"));
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
     * Deprecated. Data items from the ATOM_SCAT_VERSUS_STOL category should be
     * used instead of this item.
     * 
     * A table of scattering factors as a function of sin(θ)/λ (sin theta over
     * lambda, stol). This table should be well-commented to indicate the items
     * present. Regularly formatted lists are strongly recommended.
     * @return StrColumn
     */
    public StrColumn getVersusStolList() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_type_scat_versus_stol_list"));
    }

}