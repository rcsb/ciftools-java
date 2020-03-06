package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Structural statistics are derived from molecular dynamics and simulated annealing
 * programs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrEnsembleRms extends DelegatingCategory {
    public PdbxNmrEnsembleRms(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "residue_range_begin":
                return getResidueRangeBegin();
            case "chain_range_begin":
                return getChainRangeBegin();
            case "residue_range_end":
                return getResidueRangeEnd();
            case "chain_range_end":
                return getChainRangeEnd();
            case "atom_type":
                return getAtomType();
            case "distance_rms_dev":
                return getDistanceRmsDev();
            case "distance_rms_dev_error":
                return getDistanceRmsDevError();
            case "covalent_bond_rms_dev":
                return getCovalentBondRmsDev();
            case "covalent_bond_rms_dev_error":
                return getCovalentBondRmsDevError();
            case "bond_angle_rms_dev":
                return getBondAngleRmsDev();
            case "bond_angle_rms_dev_error":
                return getBondAngleRmsDevError();
            case "improper_torsion_angle_rms_dev":
                return getImproperTorsionAngleRmsDev();
            case "improper_torsion_angle_rms_dev_error":
                return getImproperTorsionAngleRmsDevError();
            case "peptide_planarity_rms_dev":
                return getPeptidePlanarityRmsDev();
            case "peptide_planarity_rms_dev_error":
                return getPeptidePlanarityRmsDevError();
            case "dihedral_angles_rms_dev":
                return getDihedralAnglesRmsDev();
            case "dihedral_angles_rms_dev_error":
                return getDihedralAnglesRmsDevError();
            case "coord_average_rmsd_method":
                return getCoordAverageRmsdMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * '?'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Structure statistics are often calculated only over the well-ordered region(s)
     * of the biopolymer. Portions of the macromolecule are often mobile and
     * disordered,  hence they are excluded in calculating the statistics. To define
     * the range(s) over which the statistics are calculated, enter the beginning
     * residue number(s): e.g. if the regions used were 5-32 and 41-69, enter 5,41
     * @return IntColumn
     */
    public IntColumn getResidueRangeBegin() {
        return delegate.getColumn("residue_range_begin", DelegatingIntColumn::new);
    }

    /**
     * The beginning chain id.
     * @return StrColumn
     */
    public StrColumn getChainRangeBegin() {
        return delegate.getColumn("chain_range_begin", DelegatingStrColumn::new);
    }

    /**
     * The ending residue number: e.g. 32,69.
     * @return IntColumn
     */
    public IntColumn getResidueRangeEnd() {
        return delegate.getColumn("residue_range_end", DelegatingIntColumn::new);
    }

    /**
     * The ending chain id:
     * @return StrColumn
     */
    public StrColumn getChainRangeEnd() {
        return delegate.getColumn("chain_range_end", DelegatingStrColumn::new);
    }

    /**
     * Statistics are often calculated over only some of the atoms,
     * e.g. backbone, or heavy atoms. Describe which type of atoms are used for
     * the statistical analysis.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return delegate.getColumn("atom_type", DelegatingStrColumn::new);
    }

    /**
     * The distance rmsd to the mean structure for the ensemble of structures.
     * @return FloatColumn
     */
    public FloatColumn getDistanceRmsDev() {
        return delegate.getColumn("distance_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error in the distance rmsd.
     * @return FloatColumn
     */
    public FloatColumn getDistanceRmsDevError() {
        return delegate.getColumn("distance_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * The covalent bond rmsd to the target value for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getCovalentBondRmsDev() {
        return delegate.getColumn("covalent_bond_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error in the covalent bond rmsd.
     * @return FloatColumn
     */
    public FloatColumn getCovalentBondRmsDevError() {
        return delegate.getColumn("covalent_bond_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * The bond angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getBondAngleRmsDev() {
        return delegate.getColumn("bond_angle_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error in the bond angle rmsd.
     * @return FloatColumn
     */
    public FloatColumn getBondAngleRmsDevError() {
        return delegate.getColumn("bond_angle_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * The improper torsion angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getImproperTorsionAngleRmsDev() {
        return delegate.getColumn("improper_torsion_angle_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error in the improper torsion angle rmsd.
     * @return FloatColumn
     */
    public FloatColumn getImproperTorsionAngleRmsDevError() {
        return delegate.getColumn("improper_torsion_angle_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * The peptide planarity rmsd.
     * @return FloatColumn
     */
    public FloatColumn getPeptidePlanarityRmsDev() {
        return delegate.getColumn("peptide_planarity_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error in the peptide planarity rmsd.
     * @return FloatColumn
     */
    public FloatColumn getPeptidePlanarityRmsDevError() {
        return delegate.getColumn("peptide_planarity_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * The dihedral angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getDihedralAnglesRmsDev() {
        return delegate.getColumn("dihedral_angles_rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The error of the rmsd dihedral angles.
     * @return FloatColumn
     */
    public FloatColumn getDihedralAnglesRmsDevError() {
        return delegate.getColumn("dihedral_angles_rms_dev_error", DelegatingFloatColumn::new);
    }

    /**
     * Describe the method for calculating the coordinate average rmsd.
     * @return StrColumn
     */
    public StrColumn getCoordAverageRmsdMethod() {
        return delegate.getColumn("coord_average_rmsd_method", DelegatingStrColumn::new);
    }

}