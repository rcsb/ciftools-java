package org.rcsb.cif.model.generated.pdbxnmrforceconstants;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrForceConstants extends BaseCategory {
    public PdbxNmrForceConstants(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrForceConstants(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrForceConstants(String name) {
        super(name);
    }

    /**
     * You can leave this blank as an ID will be assigned by the RCSB.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The final force constant for distance (NOEs) constraints
     * term employed in the target function used for simulated annealing.
     * @return ExptlDistanceTerm
     */
    public ExptlDistanceTerm getExptlDistanceTerm() {
        return (ExptlDistanceTerm) (isText ? textFields.computeIfAbsent("exptl_distance_term",
                ExptlDistanceTerm::new) : getBinaryColumn("exptl_distance_term"));
    }

    /**
     * The units for the force constant for the distance
     * constraints term.
     * @return ExptlDistanceTermUnits
     */
    public ExptlDistanceTermUnits getExptlDistanceTermUnits() {
        return (ExptlDistanceTermUnits) (isText ? textFields.computeIfAbsent("exptl_distance_term_units",
                ExptlDistanceTermUnits::new) : getBinaryColumn("exptl_distance_term_units"));
    }

    /**
     * The final force constant for the torsion angle term employed in
     * the target function used for simulated annealing.
     * @return ExptlTorsionAnglesTerm
     */
    public ExptlTorsionAnglesTerm getExptlTorsionAnglesTerm() {
        return (ExptlTorsionAnglesTerm) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term",
                ExptlTorsionAnglesTerm::new) : getBinaryColumn("exptl_torsion_angles_term"));
    }

    /**
     * The units for the force constant for the torsion angle
     * constraints term.
     * @return ExptlTorsionAnglesTermUnits
     */
    public ExptlTorsionAnglesTermUnits getExptlTorsionAnglesTermUnits() {
        return (ExptlTorsionAnglesTermUnits) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term_units",
                ExptlTorsionAnglesTermUnits::new) : getBinaryColumn("exptl_torsion_angles_term_units"));
    }

    /**
     * The final force constant for J coupling term employed in the
     * target function used for simulated annealing.
     * @return ExptlJCouplingTerm
     */
    public ExptlJCouplingTerm getExptlJCouplingTerm() {
        return (ExptlJCouplingTerm) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term",
                ExptlJCouplingTerm::new) : getBinaryColumn("exptl_J_coupling_term"));
    }

    /**
     * The units for the force constant for the J coupling term.
     * @return ExptlJCouplingTermUnits
     */
    public ExptlJCouplingTermUnits getExptlJCouplingTermUnits() {
        return (ExptlJCouplingTermUnits) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term_units",
                ExptlJCouplingTermUnits::new) : getBinaryColumn("exptl_J_coupling_term_units"));
    }

    /**
     * The final force constant for 13C shift constraints term employed
     * in the target function used for simulated annealing.
     * @return Exptl13CShiftTerm
     */
    public Exptl13CShiftTerm getExptl13CShiftTerm() {
        return (Exptl13CShiftTerm) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term",
                Exptl13CShiftTerm::new) : getBinaryColumn("exptl_13C_shift_term"));
    }

    /**
     * The units for the force constant for the 13C shift constraints
     * term.
     * @return Exptl13CShiftTermUnits
     */
    public Exptl13CShiftTermUnits getExptl13CShiftTermUnits() {
        return (Exptl13CShiftTermUnits) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term_units",
                Exptl13CShiftTermUnits::new) : getBinaryColumn("exptl_13C_shift_term_units"));
    }

    /**
     * The final force constant for 1H shift constraints term employed
     * in the target function used for simulated annealing.
     * @return Exptl1HShiftTerm
     */
    public Exptl1HShiftTerm getExptl1HShiftTerm() {
        return (Exptl1HShiftTerm) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term",
                Exptl1HShiftTerm::new) : getBinaryColumn("exptl_1H_shift_term"));
    }

    /**
     * The units for the force constant for the 1H shift constraints term.
     * @return Exptl1HShiftTermUnits
     */
    public Exptl1HShiftTermUnits getExptl1HShiftTermUnits() {
        return (Exptl1HShiftTermUnits) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term_units",
                Exptl1HShiftTermUnits::new) : getBinaryColumn("exptl_1H_shift_term_units"));
    }

    /**
     * The final force constant for dipolar coupling constraint term
     * employed in the target function used for simulated annealing.
     * @return ExptlDipolarCouplingTerm
     */
    public ExptlDipolarCouplingTerm getExptlDipolarCouplingTerm() {
        return (ExptlDipolarCouplingTerm) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term",
                ExptlDipolarCouplingTerm::new) : getBinaryColumn("exptl_dipolar_coupling_term"));
    }

    /**
     * The units for the force constant for the dipolar coupling
     * constraints term.
     * @return ExptlDipolarCouplingTermUnits
     */
    public ExptlDipolarCouplingTermUnits getExptlDipolarCouplingTermUnits() {
        return (ExptlDipolarCouplingTermUnits) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term_units",
                ExptlDipolarCouplingTermUnits::new) : getBinaryColumn("exptl_dipolar_coupling_term_units"));
    }

    /**
     * The final force constant for Deuterium isotope shift constraints
     * term employed in the target function used for simulated annealing.
     * @return ExptlDIsotopeShiftTerm
     */
    public ExptlDIsotopeShiftTerm getExptlDIsotopeShiftTerm() {
        return (ExptlDIsotopeShiftTerm) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term",
                ExptlDIsotopeShiftTerm::new) : getBinaryColumn("exptl_D_isotope_shift_term"));
    }

    /**
     * The units for the force constant for the Deuterium isotope
     * shift constraints term.
     * @return ExptlDIsotopeShiftTermUnits
     */
    public ExptlDIsotopeShiftTermUnits getExptlDIsotopeShiftTermUnits() {
        return (ExptlDIsotopeShiftTermUnits) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term_units",
                ExptlDIsotopeShiftTermUnits::new) : getBinaryColumn("exptl_D_isotope_shift_term_units"));
    }

    /**
     * The final force constant for the covalent geometry bond length
     * constraints term employed in the target function used for simulated
     * annealing.
     * @return CovalentGeomBondTerm
     */
    public CovalentGeomBondTerm getCovalentGeomBondTerm() {
        return (CovalentGeomBondTerm) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term",
                CovalentGeomBondTerm::new) : getBinaryColumn("covalent_geom_bond_term"));
    }

    /**
     * The units for the force constant for the covalent geometry bond
     * length constraints term.
     * @return CovalentGeomBondTermUnits
     */
    public CovalentGeomBondTermUnits getCovalentGeomBondTermUnits() {
        return (CovalentGeomBondTermUnits) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term_units",
                CovalentGeomBondTermUnits::new) : getBinaryColumn("covalent_geom_bond_term_units"));
    }

    /**
     * The final force constant for covalent geometry angle constraints
     * term employed in the target function used for simulated annealing.
     * @return CovalentGeomAnglesTerm
     */
    public CovalentGeomAnglesTerm getCovalentGeomAnglesTerm() {
        return (CovalentGeomAnglesTerm) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term",
                CovalentGeomAnglesTerm::new) : getBinaryColumn("covalent_geom_angles_term"));
    }

    /**
     * The units for the force constant for the covalent geometry angle
     * constraints term.
     * @return CovalentGeomAnglesTermUnits
     */
    public CovalentGeomAnglesTermUnits getCovalentGeomAnglesTermUnits() {
        return (CovalentGeomAnglesTermUnits) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term_units",
                CovalentGeomAnglesTermUnits::new) : getBinaryColumn("covalent_geom_angles_term_units"));
    }

    /**
     * The final force constant for covalent geometry impropers
     * contstraints term employed in the target function used for simulated
     * annealing.
     * @return CovalentGeomImpropersTerm
     */
    public CovalentGeomImpropersTerm getCovalentGeomImpropersTerm() {
        return (CovalentGeomImpropersTerm) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term",
                CovalentGeomImpropersTerm::new) : getBinaryColumn("covalent_geom_impropers_term"));
    }

    /**
     * The units for the force constant for the covalent geometry
     * impropers constraints term.
     * @return CovalentGeomImpropersTermUnits
     */
    public CovalentGeomImpropersTermUnits getCovalentGeomImpropersTermUnits() {
        return (CovalentGeomImpropersTermUnits) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term_units",
                CovalentGeomImpropersTermUnits::new) : getBinaryColumn("covalent_geom_impropers_term_units"));
    }

    /**
     * The type of van der Waals term employed in the target function
     * used for simulated annealing.
     * @return Non_bondedInterVanDerWaalsTermType
     */
    public Non_bondedInterVanDerWaalsTermType getNon_bondedInterVanDerWaalsTermType() {
        return (Non_bondedInterVanDerWaalsTermType) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_type",
                Non_bondedInterVanDerWaalsTermType::new) : getBinaryColumn("non-bonded_inter_van_der_Waals_term_type"));
    }

    /**
     * The force constant used for the non-bonded interaction van der Waals
     * term employed in the target function used for simulated annealing.
     * @return Non_bondedInterVanDerWaalsTerm
     */
    public Non_bondedInterVanDerWaalsTerm getNon_bondedInterVanDerWaalsTerm() {
        return (Non_bondedInterVanDerWaalsTerm) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term",
                Non_bondedInterVanDerWaalsTerm::new) : getBinaryColumn("non-bonded_inter_van_der_Waals_term"));
    }

    /**
     * The units for the force constant for the van der Waals term.
     * @return Non_bondedInterVanDerWaalsTermUnits
     */
    public Non_bondedInterVanDerWaalsTermUnits getNon_bondedInterVanDerWaalsTermUnits() {
        return (Non_bondedInterVanDerWaalsTermUnits) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_units",
                Non_bondedInterVanDerWaalsTermUnits::new) : getBinaryColumn("non-bonded_inter_van_der_Waals_term_units"));
    }

    /**
     * The force constant used for the non-bonded interaction conformational
     * database potential term employed in the target function used for simulated
     * annealing.
     * @return Non_bondedInterConfDbPotentialTerm
     */
    public Non_bondedInterConfDbPotentialTerm getNon_bondedInterConfDbPotentialTerm() {
        return (Non_bondedInterConfDbPotentialTerm) (isText ? textFields.computeIfAbsent("non-bonded_inter_conf_db_potential_term",
                Non_bondedInterConfDbPotentialTerm::new) : getBinaryColumn("non-bonded_inter_conf_db_potential_term"));
    }

    /**
     * The force constant used for the non-bonded interaction radius of
     * gyration term employed in the target function used for simulated annealing.
     * @return Non_bondedInterRadiusOfGyrationTerm
     */
    public Non_bondedInterRadiusOfGyrationTerm getNon_bondedInterRadiusOfGyrationTerm() {
        return (Non_bondedInterRadiusOfGyrationTerm) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term",
                Non_bondedInterRadiusOfGyrationTerm::new) : getBinaryColumn("non-bonded_inter_radius_of_gyration_term"));
    }

    /**
     * The units for the force constant for the radius of gyration term.
     * @return Non_bondedInterRadiusOfGyrationTermUnits
     */
    public Non_bondedInterRadiusOfGyrationTermUnits getNon_bondedInterRadiusOfGyrationTermUnits() {
        return (Non_bondedInterRadiusOfGyrationTermUnits) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term_units",
                Non_bondedInterRadiusOfGyrationTermUnits::new) : getBinaryColumn("non-bonded_inter_radius_of_gyration_term_units"));
    }
}
