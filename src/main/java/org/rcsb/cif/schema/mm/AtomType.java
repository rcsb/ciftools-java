package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_TYPE category record details about the
 * properties of the atoms that occupy the atom sites, such as the
 * atomic scattering factors.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomType extends DelegatingCategory {
    public AtomType(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "analytical_mass_percent":
                return getAnalyticalMassPercent();
            case "description":
                return getDescription();
            case "number_in_cell":
                return getNumberInCell();
            case "oxidation_number":
                return getOxidationNumber();
            case "radius_bond":
                return getRadiusBond();
            case "radius_contact":
                return getRadiusContact();
            case "scat_Cromer_Mann_a1":
                return getScatCromerMannA1();
            case "scat_Cromer_Mann_a2":
                return getScatCromerMannA2();
            case "scat_Cromer_Mann_a3":
                return getScatCromerMannA3();
            case "scat_Cromer_Mann_a4":
                return getScatCromerMannA4();
            case "scat_Cromer_Mann_b1":
                return getScatCromerMannB1();
            case "scat_Cromer_Mann_b2":
                return getScatCromerMannB2();
            case "scat_Cromer_Mann_b3":
                return getScatCromerMannB3();
            case "scat_Cromer_Mann_b4":
                return getScatCromerMannB4();
            case "scat_Cromer_Mann_c":
                return getScatCromerMannC();
            case "scat_dispersion_imag":
                return getScatDispersionImag();
            case "scat_dispersion_real":
                return getScatDispersionReal();
            case "scat_length_neutron":
                return getScatLengthNeutron();
            case "scat_source":
                return getScatSource();
            case "scat_versus_stol_list":
                return getScatVersusStolList();
            case "symbol":
                return getSymbol();
            case "scat_dispersion_source":
                return getScatDispersionSource();
            case "pdbx_scat_Cromer_Mann_a5":
                return getPdbxScatCromerMannA5();
            case "pdbx_scat_Cromer_Mann_b5":
                return getPdbxScatCromerMannB5();
            case "pdbx_scat_Cromer_Mann_a6":
                return getPdbxScatCromerMannA6();
            case "pdbx_scat_Cromer_Mann_b6":
                return getPdbxScatCromerMannB6();
            case "pdbx_scat_Z":
                return getPdbxScatZ();
            case "pdbx_N_electrons":
                return getPdbxNElectrons();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Mass percentage of this atom type derived from chemical analysis.
     * @return FloatColumn
     */
    public FloatColumn getAnalyticalMassPercent() {
        return delegate.getColumn("analytical_mass_percent", DelegatingFloatColumn::new);
    }

    /**
     * A description of the atom(s) designated by this atom type. In
     * most cases, this is the element name and oxidation state of
     * a single atom species. For disordered or nonstoichiometric
     * structures it will describe a combination of atom species.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * Total number of atoms of this atom type in the unit cell.
     * @return IntColumn
     */
    public IntColumn getNumberInCell() {
        return delegate.getColumn("number_in_cell", DelegatingIntColumn::new);
    }

    /**
     * Formal oxidation state of this atom type in the structure.
     * @return IntColumn
     */
    public IntColumn getOxidationNumber() {
        return delegate.getColumn("oxidation_number", DelegatingIntColumn::new);
    }

    /**
     * The effective intramolecular bonding radius in angstroms
     * of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusBond() {
        return delegate.getColumn("radius_bond", DelegatingFloatColumn::new);
    }

    /**
     * The effective intermolecular bonding radius in angstroms
     * of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusContact() {
        return delegate.getColumn("radius_contact", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a1 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA1() {
        return delegate.getColumn("scat_Cromer_Mann_a1", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a2 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA2() {
        return delegate.getColumn("scat_Cromer_Mann_a2", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a3 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA3() {
        return delegate.getColumn("scat_Cromer_Mann_a3", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a4 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannA4() {
        return delegate.getColumn("scat_Cromer_Mann_a4", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b1 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB1() {
        return delegate.getColumn("scat_Cromer_Mann_b1", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b2 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB2() {
        return delegate.getColumn("scat_Cromer_Mann_b2", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b3 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB3() {
        return delegate.getColumn("scat_Cromer_Mann_b3", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b4 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannB4() {
        return delegate.getColumn("scat_Cromer_Mann_b4", DelegatingFloatColumn::new);
    }

    /**
     * The Cromer-Mann scattering-factor coefficient c used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getScatCromerMannC() {
        return delegate.getColumn("scat_Cromer_Mann_c", DelegatingFloatColumn::new);
    }

    /**
     * The imaginary component of the anomalous-dispersion
     * scattering factor, f'', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionImag() {
        return delegate.getColumn("scat_dispersion_imag", DelegatingFloatColumn::new);
    }

    /**
     * The real component of the anomalous-dispersion
     * scattering factor, f', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionReal() {
        return delegate.getColumn("scat_dispersion_real", DelegatingFloatColumn::new);
    }

    /**
     * The bound coherent scattering length in femtometres for the
     * atom type at the isotopic composition used for the diffraction
     * experiment.
     * @return StrColumn
     */
    public StrColumn getScatLengthNeutron() {
        return delegate.getColumn("scat_length_neutron", DelegatingStrColumn::new);
    }

    /**
     * Reference to the source of the scattering factors or scattering
     * lengths used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatSource() {
        return delegate.getColumn("scat_source", DelegatingStrColumn::new);
    }

    /**
     * A table of scattering factors as a function of sin theta over
     * lambda. This table should be well commented to indicate the
     * items present. Regularly formatted lists are strongly
     * recommended.
     * @return StrColumn
     */
    public StrColumn getScatVersusStolList() {
        return delegate.getColumn("scat_versus_stol_list", DelegatingStrColumn::new);
    }

    /**
     * The code used to identify the atom species (singular or plural)
     * representing this atom type. Normally this code is the element
     * symbol. The code may be composed of any character except
     * an underscore with the additional proviso that digits designate
     * an oxidation state and must be followed by a + or - character.
     * @return StrColumn
     */
    public StrColumn getSymbol() {
        return delegate.getColumn("symbol", DelegatingStrColumn::new);
    }

    /**
     * Reference to the source of the real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatDispersionSource() {
        return delegate.getColumn("scat_dispersion_source", DelegatingStrColumn::new);
    }

    /**
     * Scattering-factor coefficient a5, used to calculate electron
     * elastic atomic scattering factors for the defined atom type.
     * 
     * Electron Elastic Scattering Factors Ref:
     * International Tables for X-ray Crystallography (2006).
     * Vol. C, Table 4.3.2.2, pp. 282-283.
     * 
     * Cromer_Mann equation Ref:
     * International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScatCromerMannA5() {
        return delegate.getColumn("pdbx_scat_Cromer_Mann_a5", DelegatingFloatColumn::new);
    }

    /**
     * Scattering-factor coefficient b5, used to calculate electron
     * elastic atomic scattering factors for the defined atom type.
     * 
     * Electron Elastic Scattering Factors Ref:
     * International Tables for X-ray Crystallography (2006).
     * Vol. C, Table 4.3.2.2, pp. 282-283.
     * 
     * Cromer_Mann equation Ref:
     * International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScatCromerMannB5() {
        return delegate.getColumn("pdbx_scat_Cromer_Mann_b5", DelegatingFloatColumn::new);
    }

    /**
     * Scattering-factor coefficient a6, used to calculate electron
     * elastic atomic scattering factors for the defined atom type.
     * 
     * Electron Elastic Scattering Factors Ref:
     * International Tables for X-ray Crystallography (2006).
     * Vol. C, Table 4.3.2.2, pp. 282-283.
     * 
     * Cromer_Mann equation Ref:
     * International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScatCromerMannA6() {
        return delegate.getColumn("pdbx_scat_Cromer_Mann_a6", DelegatingFloatColumn::new);
    }

    /**
     * Scattering-factor coefficient b6, used to calculate electron
     * elastic atomic scattering factors for the defined atom type.
     * 
     * Electron Elastic Scattering Factors Ref:
     * International Tables for X-ray Crystallography (2006).
     * Vol. C, Table 4.3.2.2, pp. 282-283.
     * 
     * Cromer_Mann equation Ref:
     * International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return FloatColumn
     */
    public FloatColumn getPdbxScatCromerMannB6() {
        return delegate.getColumn("pdbx_scat_Cromer_Mann_b6", DelegatingFloatColumn::new);
    }

    /**
     * Atomic number of atom in scattering amplitude.
     * @return IntColumn
     */
    public IntColumn getPdbxScatZ() {
        return delegate.getColumn("pdbx_scat_Z", DelegatingIntColumn::new);
    }

    /**
     * Number of electrons in atom used in scattering factor
     * @return IntColumn
     */
    public IntColumn getPdbxNElectrons() {
        return delegate.getColumn("pdbx_N_electrons", DelegatingIntColumn::new);
    }

}