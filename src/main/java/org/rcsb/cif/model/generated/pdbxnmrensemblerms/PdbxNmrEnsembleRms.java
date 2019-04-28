package org.rcsb.cif.model.generated.pdbxnmrensemblerms;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Structure statistics are often calculated only over the well-ordered region(s)
     * of the biopolymer. Portions of the macromolecule are often mobile and
     * disordered,  hence they are excluded in calculating the statistics. To define
     * the range(s) over which the statistics are calculated, enter the beginning
     * residue number(s): e.g. if the regions used were 5-32 and 41-69, enter 5,41
     * @return ResidueRangeBegin
     */
    public ResidueRangeBegin getResidueRangeBegin() {
        return (ResidueRangeBegin) (isText ? textFields.computeIfAbsent("residue_range_begin",
                ResidueRangeBegin::new) : getBinaryColumn("residue_range_begin"));
    }

    /**
     * The beginning chain id.
     * @return ChainRangeBegin
     */
    public ChainRangeBegin getChainRangeBegin() {
        return (ChainRangeBegin) (isText ? textFields.computeIfAbsent("chain_range_begin",
                ChainRangeBegin::new) : getBinaryColumn("chain_range_begin"));
    }

    /**
     * The ending residue number: e.g. 32,69.
     * @return ResidueRangeEnd
     */
    public ResidueRangeEnd getResidueRangeEnd() {
        return (ResidueRangeEnd) (isText ? textFields.computeIfAbsent("residue_range_end",
                ResidueRangeEnd::new) : getBinaryColumn("residue_range_end"));
    }

    /**
     * The ending chain id:
     * @return ChainRangeEnd
     */
    public ChainRangeEnd getChainRangeEnd() {
        return (ChainRangeEnd) (isText ? textFields.computeIfAbsent("chain_range_end",
                ChainRangeEnd::new) : getBinaryColumn("chain_range_end"));
    }

    /**
     * Statistics are often calculated over only some of the atoms,
     * e.g. backbone, or heavy atoms. Describe which type of atoms are used for
     * the statistical analysis.
     * @return AtomType
     */
    public AtomType getAtomType() {
        return (AtomType) (isText ? textFields.computeIfAbsent("atom_type",
                AtomType::new) : getBinaryColumn("atom_type"));
    }

    /**
     * The distance rmsd to the mean structure for the ensemble of structures.
     * @return DistanceRmsDev
     */
    public DistanceRmsDev getDistanceRmsDev() {
        return (DistanceRmsDev) (isText ? textFields.computeIfAbsent("distance_rms_dev",
                DistanceRmsDev::new) : getBinaryColumn("distance_rms_dev"));
    }

    /**
     * The error in the distance rmsd.
     * @return DistanceRmsDevError
     */
    public DistanceRmsDevError getDistanceRmsDevError() {
        return (DistanceRmsDevError) (isText ? textFields.computeIfAbsent("distance_rms_dev_error",
                DistanceRmsDevError::new) : getBinaryColumn("distance_rms_dev_error"));
    }

    /**
     * The covalent bond rmsd to the target value for the ensemble.
     * @return CovalentBondRmsDev
     */
    public CovalentBondRmsDev getCovalentBondRmsDev() {
        return (CovalentBondRmsDev) (isText ? textFields.computeIfAbsent("covalent_bond_rms_dev",
                CovalentBondRmsDev::new) : getBinaryColumn("covalent_bond_rms_dev"));
    }

    /**
     * The error in the covalent bond rmsd.
     * @return CovalentBondRmsDevError
     */
    public CovalentBondRmsDevError getCovalentBondRmsDevError() {
        return (CovalentBondRmsDevError) (isText ? textFields.computeIfAbsent("covalent_bond_rms_dev_error",
                CovalentBondRmsDevError::new) : getBinaryColumn("covalent_bond_rms_dev_error"));
    }

    /**
     * The bond angle rmsd to the target values for the ensemble.
     * @return BondAngleRmsDev
     */
    public BondAngleRmsDev getBondAngleRmsDev() {
        return (BondAngleRmsDev) (isText ? textFields.computeIfAbsent("bond_angle_rms_dev",
                BondAngleRmsDev::new) : getBinaryColumn("bond_angle_rms_dev"));
    }

    /**
     * The error in the bond angle rmsd.
     * @return BondAngleRmsDevError
     */
    public BondAngleRmsDevError getBondAngleRmsDevError() {
        return (BondAngleRmsDevError) (isText ? textFields.computeIfAbsent("bond_angle_rms_dev_error",
                BondAngleRmsDevError::new) : getBinaryColumn("bond_angle_rms_dev_error"));
    }

    /**
     * The improper torsion angle rmsd to the target values for the ensemble.
     * @return ImproperTorsionAngleRmsDev
     */
    public ImproperTorsionAngleRmsDev getImproperTorsionAngleRmsDev() {
        return (ImproperTorsionAngleRmsDev) (isText ? textFields.computeIfAbsent("improper_torsion_angle_rms_dev",
                ImproperTorsionAngleRmsDev::new) : getBinaryColumn("improper_torsion_angle_rms_dev"));
    }

    /**
     * The error in the improper torsion angle rmsd.
     * @return ImproperTorsionAngleRmsDevError
     */
    public ImproperTorsionAngleRmsDevError getImproperTorsionAngleRmsDevError() {
        return (ImproperTorsionAngleRmsDevError) (isText ? textFields.computeIfAbsent("improper_torsion_angle_rms_dev_error",
                ImproperTorsionAngleRmsDevError::new) : getBinaryColumn("improper_torsion_angle_rms_dev_error"));
    }

    /**
     * The peptide planarity rmsd.
     * @return PeptidePlanarityRmsDev
     */
    public PeptidePlanarityRmsDev getPeptidePlanarityRmsDev() {
        return (PeptidePlanarityRmsDev) (isText ? textFields.computeIfAbsent("peptide_planarity_rms_dev",
                PeptidePlanarityRmsDev::new) : getBinaryColumn("peptide_planarity_rms_dev"));
    }

    /**
     * The error in the peptide planarity rmsd.
     * @return PeptidePlanarityRmsDevError
     */
    public PeptidePlanarityRmsDevError getPeptidePlanarityRmsDevError() {
        return (PeptidePlanarityRmsDevError) (isText ? textFields.computeIfAbsent("peptide_planarity_rms_dev_error",
                PeptidePlanarityRmsDevError::new) : getBinaryColumn("peptide_planarity_rms_dev_error"));
    }

    /**
     * The dihedral angle rmsd to the target values for the ensemble.
     * @return DihedralAnglesRmsDev
     */
    public DihedralAnglesRmsDev getDihedralAnglesRmsDev() {
        return (DihedralAnglesRmsDev) (isText ? textFields.computeIfAbsent("dihedral_angles_rms_dev",
                DihedralAnglesRmsDev::new) : getBinaryColumn("dihedral_angles_rms_dev"));
    }

    /**
     * The error of the rmsd dihedral angles.
     * @return DihedralAnglesRmsDevError
     */
    public DihedralAnglesRmsDevError getDihedralAnglesRmsDevError() {
        return (DihedralAnglesRmsDevError) (isText ? textFields.computeIfAbsent("dihedral_angles_rms_dev_error",
                DihedralAnglesRmsDevError::new) : getBinaryColumn("dihedral_angles_rms_dev_error"));
    }

    /**
     * Describe the method for calculating the coordinate average rmsd.
     * @return CoordAverageRmsdMethod
     */
    public CoordAverageRmsdMethod getCoordAverageRmsdMethod() {
        return (CoordAverageRmsdMethod) (isText ? textFields.computeIfAbsent("coord_average_rmsd_method",
                CoordAverageRmsdMethod::new) : getBinaryColumn("coord_average_rmsd_method"));
    }
}
