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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The final force constant for distance (NOEs) constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDistanceTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_distance_term", FloatColumn::new) :
                getBinaryColumn("exptl_distance_term"));
    }

    /**
     * The units for the force constant for the distance
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDistanceTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_distance_term_units", StrColumn::new) :
                getBinaryColumn("exptl_distance_term_units"));
    }

    /**
     * The final force constant for the torsion angle term employed in
     * the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlTorsionAnglesTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term", FloatColumn::new) :
                getBinaryColumn("exptl_torsion_angles_term"));
    }

    /**
     * The units for the force constant for the torsion angle
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlTorsionAnglesTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_torsion_angles_term_units", StrColumn::new) :
                getBinaryColumn("exptl_torsion_angles_term_units"));
    }

    /**
     * The final force constant for J coupling term employed in the
     * target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlJCouplingTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term", FloatColumn::new) :
                getBinaryColumn("exptl_J_coupling_term"));
    }

    /**
     * The units for the force constant for the J coupling term.
     * @return StrColumn
     */
    public StrColumn getExptlJCouplingTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_J_coupling_term_units", StrColumn::new) :
                getBinaryColumn("exptl_J_coupling_term_units"));
    }

    /**
     * The final force constant for 13C shift constraints term employed
     * in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptl13CShiftTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term", FloatColumn::new) :
                getBinaryColumn("exptl_13C_shift_term"));
    }

    /**
     * The units for the force constant for the 13C shift constraints
     * term.
     * @return StrColumn
     */
    public StrColumn getExptl13CShiftTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_13C_shift_term_units", StrColumn::new) :
                getBinaryColumn("exptl_13C_shift_term_units"));
    }

    /**
     * The final force constant for 1H shift constraints term employed
     * in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptl1HShiftTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term", FloatColumn::new) :
                getBinaryColumn("exptl_1H_shift_term"));
    }

    /**
     * The units for the force constant for the 1H shift constraints term.
     * @return StrColumn
     */
    public StrColumn getExptl1HShiftTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_1H_shift_term_units", StrColumn::new) :
                getBinaryColumn("exptl_1H_shift_term_units"));
    }

    /**
     * The final force constant for dipolar coupling constraint term
     * employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDipolarCouplingTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term", FloatColumn::new) :
                getBinaryColumn("exptl_dipolar_coupling_term"));
    }

    /**
     * The units for the force constant for the dipolar coupling
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDipolarCouplingTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_dipolar_coupling_term_units", StrColumn::new) :
                getBinaryColumn("exptl_dipolar_coupling_term_units"));
    }

    /**
     * The final force constant for Deuterium isotope shift constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDIsotopeShiftTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term", FloatColumn::new) :
                getBinaryColumn("exptl_D_isotope_shift_term"));
    }

    /**
     * The units for the force constant for the Deuterium isotope
     * shift constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDIsotopeShiftTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("exptl_D_isotope_shift_term_units", StrColumn::new) :
                getBinaryColumn("exptl_D_isotope_shift_term_units"));
    }

    /**
     * The final force constant for the covalent geometry bond length
     * constraints term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomBondTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term", FloatColumn::new) :
                getBinaryColumn("covalent_geom_bond_term"));
    }

    /**
     * The units for the force constant for the covalent geometry bond
     * length constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomBondTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_bond_term_units", StrColumn::new) :
                getBinaryColumn("covalent_geom_bond_term_units"));
    }

    /**
     * The final force constant for covalent geometry angle constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomAnglesTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term", FloatColumn::new) :
                getBinaryColumn("covalent_geom_angles_term"));
    }

    /**
     * The units for the force constant for the covalent geometry angle
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomAnglesTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_angles_term_units", StrColumn::new) :
                getBinaryColumn("covalent_geom_angles_term_units"));
    }

    /**
     * The final force constant for covalent geometry impropers
     * contstraints term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomImpropersTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term", FloatColumn::new) :
                getBinaryColumn("covalent_geom_impropers_term"));
    }

    /**
     * The units for the force constant for the covalent geometry
     * impropers constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomImpropersTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("covalent_geom_impropers_term_units", StrColumn::new) :
                getBinaryColumn("covalent_geom_impropers_term_units"));
    }

    /**
     * The type of van der Waals term employed in the target function
     * used for simulated annealing.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterVanDerWaalsTermType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_type", StrColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term_type"));
    }

    /**
     * The force constant used for the non-bonded interaction van der Waals
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterVanDerWaalsTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term", FloatColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term"));
    }

    /**
     * The units for the force constant for the van der Waals term.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterVanDerWaalsTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_van_der_Waals_term_units", StrColumn::new) :
                getBinaryColumn("non-bonded_inter_van_der_Waals_term_units"));
    }

    /**
     * The force constant used for the non-bonded interaction conformational
     * database potential term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterConfDbPotentialTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_conf_db_potential_term", FloatColumn::new) :
                getBinaryColumn("non-bonded_inter_conf_db_potential_term"));
    }

    /**
     * The force constant used for the non-bonded interaction radius of
     * gyration term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterRadiusOfGyrationTerm() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term", FloatColumn::new) :
                getBinaryColumn("non-bonded_inter_radius_of_gyration_term"));
    }

    /**
     * The units for the force constant for the radius of gyration term.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterRadiusOfGyrationTermUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("non-bonded_inter_radius_of_gyration_term_units", StrColumn::new) :
                getBinaryColumn("non-bonded_inter_radius_of_gyration_term_units"));
    }
}
