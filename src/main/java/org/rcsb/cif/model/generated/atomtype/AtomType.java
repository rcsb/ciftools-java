package org.rcsb.cif.model.generated.atomtype;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomType extends BaseCategory {
    public AtomType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomType(String name) {
        super(name);
    }

    /**
     * Mass percentage of this atom type derived from chemical analysis.
     * @return AnalyticalMassPercent
     */
    public AnalyticalMassPercent getAnalyticalMassPercent() {
        return (AnalyticalMassPercent) (isText ? textFields.computeIfAbsent("analytical_mass_percent",
                AnalyticalMassPercent::new) : getBinaryColumn("analytical_mass_percent"));
    }

    /**
     * A description of the atom(s) designated by this atom type. In
     * most cases, this is the element name and oxidation state of
     * a single atom species. For disordered or nonstoichiometric
     * structures it will describe a combination of atom species.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * Total number of atoms of this atom type in the unit cell.
     * @return NumberInCell
     */
    public NumberInCell getNumberInCell() {
        return (NumberInCell) (isText ? textFields.computeIfAbsent("number_in_cell",
                NumberInCell::new) : getBinaryColumn("number_in_cell"));
    }

    /**
     * Formal oxidation state of this atom type in the structure.
     * @return OxidationNumber
     */
    public OxidationNumber getOxidationNumber() {
        return (OxidationNumber) (isText ? textFields.computeIfAbsent("oxidation_number",
                OxidationNumber::new) : getBinaryColumn("oxidation_number"));
    }

    /**
     * The effective intramolecular bonding radius in angstroms
     * of this atom type.
     * @return RadiusBond
     */
    public RadiusBond getRadiusBond() {
        return (RadiusBond) (isText ? textFields.computeIfAbsent("radius_bond",
                RadiusBond::new) : getBinaryColumn("radius_bond"));
    }

    /**
     * The effective intermolecular bonding radius in angstroms
     * of this atom type.
     * @return RadiusContact
     */
    public RadiusContact getRadiusContact() {
        return (RadiusContact) (isText ? textFields.computeIfAbsent("radius_contact",
                RadiusContact::new) : getBinaryColumn("radius_contact"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a1 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannA1
     */
    public ScatCromerMannA1 getScatCromerMannA1() {
        return (ScatCromerMannA1) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a1",
                ScatCromerMannA1::new) : getBinaryColumn("scat_Cromer_Mann_a1"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a2 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannA2
     */
    public ScatCromerMannA2 getScatCromerMannA2() {
        return (ScatCromerMannA2) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a2",
                ScatCromerMannA2::new) : getBinaryColumn("scat_Cromer_Mann_a2"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a3 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannA3
     */
    public ScatCromerMannA3 getScatCromerMannA3() {
        return (ScatCromerMannA3) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a3",
                ScatCromerMannA3::new) : getBinaryColumn("scat_Cromer_Mann_a3"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient a4 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannA4
     */
    public ScatCromerMannA4 getScatCromerMannA4() {
        return (ScatCromerMannA4) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a4",
                ScatCromerMannA4::new) : getBinaryColumn("scat_Cromer_Mann_a4"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b1 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannB1
     */
    public ScatCromerMannB1 getScatCromerMannB1() {
        return (ScatCromerMannB1) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b1",
                ScatCromerMannB1::new) : getBinaryColumn("scat_Cromer_Mann_b1"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b2 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannB2
     */
    public ScatCromerMannB2 getScatCromerMannB2() {
        return (ScatCromerMannB2) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b2",
                ScatCromerMannB2::new) : getBinaryColumn("scat_Cromer_Mann_b2"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b3 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannB3
     */
    public ScatCromerMannB3 getScatCromerMannB3() {
        return (ScatCromerMannB3) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b3",
                ScatCromerMannB3::new) : getBinaryColumn("scat_Cromer_Mann_b3"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient b4 used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannB4
     */
    public ScatCromerMannB4 getScatCromerMannB4() {
        return (ScatCromerMannB4) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b4",
                ScatCromerMannB4::new) : getBinaryColumn("scat_Cromer_Mann_b4"));
    }

    /**
     * The Cromer-Mann scattering-factor coefficient c used to
     * calculate the scattering factors for this atom type.
     * 
     * Ref: International Tables for X-ray Crystallography (1974).
     * Vol. IV, Table 2.2B
     * or: International Tables for Crystallography  (2004). Vol. C,
     * Tables 6.1.1.4 and 6.1.1.5.
     * @return ScatCromerMannC
     */
    public ScatCromerMannC getScatCromerMannC() {
        return (ScatCromerMannC) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_c",
                ScatCromerMannC::new) : getBinaryColumn("scat_Cromer_Mann_c"));
    }

    /**
     * The imaginary component of the anomalous-dispersion
     * scattering factor, f'', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return ScatDispersionImag
     */
    public ScatDispersionImag getScatDispersionImag() {
        return (ScatDispersionImag) (isText ? textFields.computeIfAbsent("scat_dispersion_imag",
                ScatDispersionImag::new) : getBinaryColumn("scat_dispersion_imag"));
    }

    /**
     * The real component of the anomalous-dispersion
     * scattering factor, f', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return ScatDispersionReal
     */
    public ScatDispersionReal getScatDispersionReal() {
        return (ScatDispersionReal) (isText ? textFields.computeIfAbsent("scat_dispersion_real",
                ScatDispersionReal::new) : getBinaryColumn("scat_dispersion_real"));
    }

    /**
     * The bound coherent scattering length in femtometres for the
     * atom type at the isotopic composition used for the diffraction
     * experiment.
     * @return ScatLengthNeutron
     */
    public ScatLengthNeutron getScatLengthNeutron() {
        return (ScatLengthNeutron) (isText ? textFields.computeIfAbsent("scat_length_neutron",
                ScatLengthNeutron::new) : getBinaryColumn("scat_length_neutron"));
    }

    /**
     * Reference to the source of the scattering factors or scattering
     * lengths used for this atom type.
     * @return ScatSource
     */
    public ScatSource getScatSource() {
        return (ScatSource) (isText ? textFields.computeIfAbsent("scat_source",
                ScatSource::new) : getBinaryColumn("scat_source"));
    }

    /**
     * A table of scattering factors as a function of sin theta over
     * lambda. This table should be well commented to indicate the
     * items present. Regularly formatted lists are strongly
     * recommended.
     * @return ScatVersusStolList
     */
    public ScatVersusStolList getScatVersusStolList() {
        return (ScatVersusStolList) (isText ? textFields.computeIfAbsent("scat_versus_stol_list",
                ScatVersusStolList::new) : getBinaryColumn("scat_versus_stol_list"));
    }

    /**
     * The code used to identify the atom species (singular or plural)
     * representing this atom type. Normally this code is the element
     * symbol. The code may be composed of any character except
     * an underscore with the additional proviso that digits designate
     * an oxidation state and must be followed by a + or - character.
     * @return Symbol
     */
    public Symbol getSymbol() {
        return (Symbol) (isText ? textFields.computeIfAbsent("symbol",
                Symbol::new) : getBinaryColumn("symbol"));
    }

    /**
     * Reference to the source of the real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return ScatDispersionSource
     */
    public ScatDispersionSource getScatDispersionSource() {
        return (ScatDispersionSource) (isText ? textFields.computeIfAbsent("scat_dispersion_source",
                ScatDispersionSource::new) : getBinaryColumn("scat_dispersion_source"));
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
     * @return PdbxScatCromerMannA5
     */
    public PdbxScatCromerMannA5 getPdbxScatCromerMannA5() {
        return (PdbxScatCromerMannA5) (isText ? textFields.computeIfAbsent("pdbx_scat_Cromer_Mann_a5",
                PdbxScatCromerMannA5::new) : getBinaryColumn("pdbx_scat_Cromer_Mann_a5"));
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
     * @return PdbxScatCromerMannB5
     */
    public PdbxScatCromerMannB5 getPdbxScatCromerMannB5() {
        return (PdbxScatCromerMannB5) (isText ? textFields.computeIfAbsent("pdbx_scat_Cromer_Mann_b5",
                PdbxScatCromerMannB5::new) : getBinaryColumn("pdbx_scat_Cromer_Mann_b5"));
    }
}
