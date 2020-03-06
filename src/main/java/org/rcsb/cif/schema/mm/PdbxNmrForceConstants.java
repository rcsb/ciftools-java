package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The final force constants, including units, employed for the various
 * experimental constraints, covalent geometry constraints, and the non-bonded
 * interaction terms in the target function used for simulated annealing.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrForceConstants extends DelegatingCategory {
    public PdbxNmrForceConstants(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "exptl_distance_term":
                return getExptlDistanceTerm();
            case "exptl_distance_term_units":
                return getExptlDistanceTermUnits();
            case "exptl_torsion_angles_term":
                return getExptlTorsionAnglesTerm();
            case "exptl_torsion_angles_term_units":
                return getExptlTorsionAnglesTermUnits();
            case "exptl_J_coupling_term":
                return getExptlJCouplingTerm();
            case "exptl_J_coupling_term_units":
                return getExptlJCouplingTermUnits();
            case "exptl_13C_shift_term":
                return getExptl13CShiftTerm();
            case "exptl_13C_shift_term_units":
                return getExptl13CShiftTermUnits();
            case "exptl_1H_shift_term":
                return getExptl1HShiftTerm();
            case "exptl_1H_shift_term_units":
                return getExptl1HShiftTermUnits();
            case "exptl_dipolar_coupling_term":
                return getExptlDipolarCouplingTerm();
            case "exptl_dipolar_coupling_term_units":
                return getExptlDipolarCouplingTermUnits();
            case "exptl_D_isotope_shift_term":
                return getExptlDIsotopeShiftTerm();
            case "exptl_D_isotope_shift_term_units":
                return getExptlDIsotopeShiftTermUnits();
            case "covalent_geom_bond_term":
                return getCovalentGeomBondTerm();
            case "covalent_geom_bond_term_units":
                return getCovalentGeomBondTermUnits();
            case "covalent_geom_angles_term":
                return getCovalentGeomAnglesTerm();
            case "covalent_geom_angles_term_units":
                return getCovalentGeomAnglesTermUnits();
            case "covalent_geom_impropers_term":
                return getCovalentGeomImpropersTerm();
            case "covalent_geom_impropers_term_units":
                return getCovalentGeomImpropersTermUnits();
            case "non-bonded_inter_van_der_Waals_term_type":
                return getNon_bondedInterVanDerWaalsTermType();
            case "non-bonded_inter_van_der_Waals_term":
                return getNon_bondedInterVanDerWaalsTerm();
            case "non-bonded_inter_van_der_Waals_term_units":
                return getNon_bondedInterVanDerWaalsTermUnits();
            case "non-bonded_inter_conf_db_potential_term":
                return getNon_bondedInterConfDbPotentialTerm();
            case "non-bonded_inter_radius_of_gyration_term":
                return getNon_bondedInterRadiusOfGyrationTerm();
            case "non-bonded_inter_radius_of_gyration_term_units":
                return getNon_bondedInterRadiusOfGyrationTermUnits();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * You can leave this blank as an ID will be assigned by the RCSB.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for distance (NOEs) constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDistanceTerm() {
        return delegate.getColumn("exptl_distance_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the distance
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDistanceTermUnits() {
        return delegate.getColumn("exptl_distance_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for the torsion angle term employed in
     * the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlTorsionAnglesTerm() {
        return delegate.getColumn("exptl_torsion_angles_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the torsion angle
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlTorsionAnglesTermUnits() {
        return delegate.getColumn("exptl_torsion_angles_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for J coupling term employed in the
     * target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlJCouplingTerm() {
        return delegate.getColumn("exptl_J_coupling_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the J coupling term.
     * @return StrColumn
     */
    public StrColumn getExptlJCouplingTermUnits() {
        return delegate.getColumn("exptl_J_coupling_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for 13C shift constraints term employed
     * in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptl13CShiftTerm() {
        return delegate.getColumn("exptl_13C_shift_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the 13C shift constraints
     * term.
     * @return StrColumn
     */
    public StrColumn getExptl13CShiftTermUnits() {
        return delegate.getColumn("exptl_13C_shift_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for 1H shift constraints term employed
     * in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptl1HShiftTerm() {
        return delegate.getColumn("exptl_1H_shift_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the 1H shift constraints term.
     * @return StrColumn
     */
    public StrColumn getExptl1HShiftTermUnits() {
        return delegate.getColumn("exptl_1H_shift_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for dipolar coupling constraint term
     * employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDipolarCouplingTerm() {
        return delegate.getColumn("exptl_dipolar_coupling_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the dipolar coupling
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDipolarCouplingTermUnits() {
        return delegate.getColumn("exptl_dipolar_coupling_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for Deuterium isotope shift constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getExptlDIsotopeShiftTerm() {
        return delegate.getColumn("exptl_D_isotope_shift_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the Deuterium isotope
     * shift constraints term.
     * @return StrColumn
     */
    public StrColumn getExptlDIsotopeShiftTermUnits() {
        return delegate.getColumn("exptl_D_isotope_shift_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for the covalent geometry bond length
     * constraints term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomBondTerm() {
        return delegate.getColumn("covalent_geom_bond_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the covalent geometry bond
     * length constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomBondTermUnits() {
        return delegate.getColumn("covalent_geom_bond_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for covalent geometry angle constraints
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomAnglesTerm() {
        return delegate.getColumn("covalent_geom_angles_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the covalent geometry angle
     * constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomAnglesTermUnits() {
        return delegate.getColumn("covalent_geom_angles_term_units", DelegatingStrColumn::new);
    }

    /**
     * The final force constant for covalent geometry impropers
     * contstraints term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getCovalentGeomImpropersTerm() {
        return delegate.getColumn("covalent_geom_impropers_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the covalent geometry
     * impropers constraints term.
     * @return StrColumn
     */
    public StrColumn getCovalentGeomImpropersTermUnits() {
        return delegate.getColumn("covalent_geom_impropers_term_units", DelegatingStrColumn::new);
    }

    /**
     * The type of van der Waals term employed in the target function
     * used for simulated annealing.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterVanDerWaalsTermType() {
        return delegate.getColumn("non-bonded_inter_van_der_Waals_term_type", DelegatingStrColumn::new);
    }

    /**
     * The force constant used for the non-bonded interaction van der Waals
     * term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterVanDerWaalsTerm() {
        return delegate.getColumn("non-bonded_inter_van_der_Waals_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the van der Waals term.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterVanDerWaalsTermUnits() {
        return delegate.getColumn("non-bonded_inter_van_der_Waals_term_units", DelegatingStrColumn::new);
    }

    /**
     * The force constant used for the non-bonded interaction conformational
     * database potential term employed in the target function used for simulated
     * annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterConfDbPotentialTerm() {
        return delegate.getColumn("non-bonded_inter_conf_db_potential_term", DelegatingFloatColumn::new);
    }

    /**
     * The force constant used for the non-bonded interaction radius of
     * gyration term employed in the target function used for simulated annealing.
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedInterRadiusOfGyrationTerm() {
        return delegate.getColumn("non-bonded_inter_radius_of_gyration_term", DelegatingFloatColumn::new);
    }

    /**
     * The units for the force constant for the radius of gyration term.
     * @return StrColumn
     */
    public StrColumn getNon_bondedInterRadiusOfGyrationTermUnits() {
        return delegate.getColumn("non-bonded_inter_radius_of_gyration_term_units", DelegatingStrColumn::new);
    }

}