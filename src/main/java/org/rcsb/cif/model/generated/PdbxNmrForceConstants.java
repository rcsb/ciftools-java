package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * The final force constants, including units, employed for the various
 * experimental constraints, covalent geometry constraints, and the non-bonded
 * interaction terms in the target function used for simulated annealing.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The final force constant for distance (NOEs) constraints
     * term employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptlDistanceTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_distance_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_distance_term"));
    }

    /**
     * The units for the force constant for the distance
     * constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptlDistanceTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_distance_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_distance_term_units"));
    }

    /**
     * The final force constant for the torsion angle term employed in
     * the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptlTorsionAnglesTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_torsion_angles_term"));
    }

    /**
     * The units for the force constant for the torsion angle
     * constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptlTorsionAnglesTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_torsion_angles_term_units"));
    }

    /**
     * The final force constant for J coupling term employed in the
     * target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptlJCouplingTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_J_coupling_term"));
    }

    /**
     * The units for the force constant for the J coupling term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptlJCouplingTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_J_coupling_term_units"));
    }

    /**
     * The final force constant for 13C shift constraints term employed
     * in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptl13CShiftTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_13C_shift_term"));
    }

    /**
     * The units for the force constant for the 13C shift constraints
     * term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptl13CShiftTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_13C_shift_term_units"));
    }

    /**
     * The final force constant for 1H shift constraints term employed
     * in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptl1HShiftTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_1H_shift_term"));
    }

    /**
     * The units for the force constant for the 1H shift constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptl1HShiftTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_1H_shift_term_units"));
    }

    /**
     * The final force constant for dipolar coupling constraint term
     * employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptlDipolarCouplingTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_dipolar_coupling_term"));
    }

    /**
     * The units for the force constant for the dipolar coupling
     * constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptlDipolarCouplingTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_dipolar_coupling_term_units"));
    }

    /**
     * The final force constant for Deuterium isotope shift constraints
     * term employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getExptlDIsotopeShiftTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term", SingleRowFloatColumn::new) :
                getBinaryColumn("exptl_D_isotope_shift_term"));
    }

    /**
     * The units for the force constant for the Deuterium isotope
     * shift constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExptlDIsotopeShiftTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("exptl_D_isotope_shift_term_units"));
    }

    /**
     * The final force constant for the covalent geometry bond length
     * constraints term employed in the target function used for simulated
     * annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCovalentGeomBondTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term", SingleRowFloatColumn::new) :
                getBinaryColumn("covalent_geom_bond_term"));
    }

    /**
     * The units for the force constant for the covalent geometry bond
     * length constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCovalentGeomBondTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("covalent_geom_bond_term_units"));
    }

    /**
     * The final force constant for covalent geometry angle constraints
     * term employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCovalentGeomAnglesTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term", SingleRowFloatColumn::new) :
                getBinaryColumn("covalent_geom_angles_term"));
    }

    /**
     * The units for the force constant for the covalent geometry angle
     * constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCovalentGeomAnglesTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("covalent_geom_angles_term_units"));
    }

    /**
     * The final force constant for covalent geometry impropers
     * contstraints term employed in the target function used for simulated
     * annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCovalentGeomImpropersTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term", SingleRowFloatColumn::new) :
                getBinaryColumn("covalent_geom_impropers_term"));
    }

    /**
     * The units for the force constant for the covalent geometry
     * impropers constraints term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCovalentGeomImpropersTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("covalent_geom_impropers_term_units"));
    }

    /**
     * The type of van der Waals term employed in the target function
     * used for simulated annealing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNon_bondedInterVanDerWaalsTermType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_type", SingleRowStrColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term_type"));
    }

    /**
     * The force constant used for the non-bonded interaction van der Waals
     * term employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNon_bondedInterVanDerWaalsTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term", SingleRowFloatColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term"));
    }

    /**
     * The units for the force constant for the van der Waals term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNon_bondedInterVanDerWaalsTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term_units"));
    }

    /**
     * The force constant used for the non-bonded interaction conformational
     * database potential term employed in the target function used for simulated
     * annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNon_bondedInterConfDbPotentialTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_conf_db_potential_term", SingleRowFloatColumn::new) :
                getBinaryColumn("non-bonded_inter_conf_db_potential_term"));
    }

    /**
     * The force constant used for the non-bonded interaction radius of
     * gyration term employed in the target function used for simulated annealing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getNon_bondedInterRadiusOfGyrationTerm() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term", SingleRowFloatColumn::new) :
                getBinaryColumn("non-bonded_inter_radius_of_gyration_term"));
    }

    /**
     * The units for the force constant for the radius of gyration term.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNon_bondedInterRadiusOfGyrationTermUnits() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term_units", SingleRowStrColumn::new) :
                getBinaryColumn("non-bonded_inter_radius_of_gyration_term_units"));
    }
}
