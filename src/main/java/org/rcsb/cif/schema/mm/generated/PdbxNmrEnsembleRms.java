package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Structural statistics are derived from molecular dynamics and simulated annealing
 * programs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrEnsembleRms extends BaseCategory {
    public PdbxNmrEnsembleRms(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrEnsembleRms(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrEnsembleRms(String name) {
        super(name);
    }

    /**
     * '?'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("residue_range_begin", IntColumn::new) :
                getBinaryColumn("residue_range_begin"));
    }

    /**
     * The beginning chain id.
     * @return StrColumn
     */
    public StrColumn getChainRangeBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_range_begin", StrColumn::new) :
                getBinaryColumn("chain_range_begin"));
    }

    /**
     * The ending residue number: e.g. 32,69.
     * @return IntColumn
     */
    public IntColumn getResidueRangeEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("residue_range_end", IntColumn::new) :
                getBinaryColumn("residue_range_end"));
    }

    /**
     * The ending chain id:
     * @return StrColumn
     */
    public StrColumn getChainRangeEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_range_end", StrColumn::new) :
                getBinaryColumn("chain_range_end"));
    }

    /**
     * Statistics are often calculated over only some of the atoms,
     * e.g. backbone, or heavy atoms. Describe which type of atoms are used for
     * the statistical analysis.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type", StrColumn::new) :
                getBinaryColumn("atom_type"));
    }

    /**
     * The distance rmsd to the mean structure for the ensemble of structures.
     * @return FloatColumn
     */
    public FloatColumn getDistanceRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_rms_dev", FloatColumn::new) :
                getBinaryColumn("distance_rms_dev"));
    }

    /**
     * The error in the distance rmsd.
     * @return FloatColumn
     */
    public FloatColumn getDistanceRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("distance_rms_dev_error"));
    }

    /**
     * The covalent bond rmsd to the target value for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getCovalentBondRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covalent_bond_rms_dev", FloatColumn::new) :
                getBinaryColumn("covalent_bond_rms_dev"));
    }

    /**
     * The error in the covalent bond rmsd.
     * @return FloatColumn
     */
    public FloatColumn getCovalentBondRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covalent_bond_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("covalent_bond_rms_dev_error"));
    }

    /**
     * The bond angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getBondAngleRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_angle_rms_dev", FloatColumn::new) :
                getBinaryColumn("bond_angle_rms_dev"));
    }

    /**
     * The error in the bond angle rmsd.
     * @return FloatColumn
     */
    public FloatColumn getBondAngleRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_angle_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("bond_angle_rms_dev_error"));
    }

    /**
     * The improper torsion angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getImproperTorsionAngleRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("improper_torsion_angle_rms_dev", FloatColumn::new) :
                getBinaryColumn("improper_torsion_angle_rms_dev"));
    }

    /**
     * The error in the improper torsion angle rmsd.
     * @return FloatColumn
     */
    public FloatColumn getImproperTorsionAngleRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("improper_torsion_angle_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("improper_torsion_angle_rms_dev_error"));
    }

    /**
     * The peptide planarity rmsd.
     * @return FloatColumn
     */
    public FloatColumn getPeptidePlanarityRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("peptide_planarity_rms_dev", FloatColumn::new) :
                getBinaryColumn("peptide_planarity_rms_dev"));
    }

    /**
     * The error in the peptide planarity rmsd.
     * @return FloatColumn
     */
    public FloatColumn getPeptidePlanarityRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("peptide_planarity_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("peptide_planarity_rms_dev_error"));
    }

    /**
     * The dihedral angle rmsd to the target values for the ensemble.
     * @return FloatColumn
     */
    public FloatColumn getDihedralAnglesRmsDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dihedral_angles_rms_dev", FloatColumn::new) :
                getBinaryColumn("dihedral_angles_rms_dev"));
    }

    /**
     * The error of the rmsd dihedral angles.
     * @return FloatColumn
     */
    public FloatColumn getDihedralAnglesRmsDevError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dihedral_angles_rms_dev_error", FloatColumn::new) :
                getBinaryColumn("dihedral_angles_rms_dev_error"));
    }

    /**
     * Describe the method for calculating the coordinate average rmsd.
     * @return StrColumn
     */
    public StrColumn getCoordAverageRmsdMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("coord_average_rmsd_method", StrColumn::new) :
                getBinaryColumn("coord_average_rmsd_method"));
    }
}
