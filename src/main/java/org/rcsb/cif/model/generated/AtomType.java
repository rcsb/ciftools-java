package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_TYPE category record details about the
 * properties of the atoms that occupy the atom sites, such as the
 * atomic scattering factors.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAnalyticalMassPercent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("analytical_mass_percent", FloatColumn::new) :
                getBinaryColumn("analytical_mass_percent"));
    }

    /**
     * A description of the atom(s) designated by this atom type. In
     * most cases, this is the element name and oxidation state of
     * a single atom species. For disordered or nonstoichiometric
     * structures it will describe a combination of atom species.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * Total number of atoms of this atom type in the unit cell.
     * @return IntColumn
     */
    public IntColumn getNumberInCell() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_in_cell", IntColumn::new) :
                getBinaryColumn("number_in_cell"));
    }

    /**
     * Formal oxidation state of this atom type in the structure.
     * @return IntColumn
     */
    public IntColumn getOxidationNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("oxidation_number", IntColumn::new) :
                getBinaryColumn("oxidation_number"));
    }

    /**
     * The effective intramolecular bonding radius in angstroms
     * of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusBond() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radius_bond", FloatColumn::new) :
                getBinaryColumn("radius_bond"));
    }

    /**
     * The effective intermolecular bonding radius in angstroms
     * of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusContact() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radius_contact", FloatColumn::new) :
                getBinaryColumn("radius_contact"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a1", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_a1"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a2", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_a2"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a3", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_a3"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_a4", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_a4"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b1", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_b1"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b2", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_b2"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b3", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_b3"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_b4", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_b4"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_Cromer_Mann_c", FloatColumn::new) :
                getBinaryColumn("scat_Cromer_Mann_c"));
    }

    /**
     * The imaginary component of the anomalous-dispersion
     * scattering factor, f'', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionImag() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_dispersion_imag", FloatColumn::new) :
                getBinaryColumn("scat_dispersion_imag"));
    }

    /**
     * The real component of the anomalous-dispersion
     * scattering factor, f', in electrons for this atom type and
     * the radiation identified by _diffrn_radiation_wavelength.id.
     * @return FloatColumn
     */
    public FloatColumn getScatDispersionReal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scat_dispersion_real", FloatColumn::new) :
                getBinaryColumn("scat_dispersion_real"));
    }

    /**
     * The bound coherent scattering length in femtometres for the
     * atom type at the isotopic composition used for the diffraction
     * experiment.
     * @return StrColumn
     */
    public StrColumn getScatLengthNeutron() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scat_length_neutron", StrColumn::new) :
                getBinaryColumn("scat_length_neutron"));
    }

    /**
     * Reference to the source of the scattering factors or scattering
     * lengths used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scat_source", StrColumn::new) :
                getBinaryColumn("scat_source"));
    }

    /**
     * A table of scattering factors as a function of sin theta over
     * lambda. This table should be well commented to indicate the
     * items present. Regularly formatted lists are strongly
     * recommended.
     * @return StrColumn
     */
    public StrColumn getScatVersusStolList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scat_versus_stol_list", StrColumn::new) :
                getBinaryColumn("scat_versus_stol_list"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("symbol", StrColumn::new) :
                getBinaryColumn("symbol"));
    }

    /**
     * Reference to the source of the real and imaginary dispersion
     * corrections for scattering factors used for this atom type.
     * @return StrColumn
     */
    public StrColumn getScatDispersionSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("scat_dispersion_source", StrColumn::new) :
                getBinaryColumn("scat_dispersion_source"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_scat_Cromer_Mann_a5", FloatColumn::new) :
                getBinaryColumn("pdbx_scat_Cromer_Mann_a5"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_scat_Cromer_Mann_b5", FloatColumn::new) :
                getBinaryColumn("pdbx_scat_Cromer_Mann_b5"));
    }
}
