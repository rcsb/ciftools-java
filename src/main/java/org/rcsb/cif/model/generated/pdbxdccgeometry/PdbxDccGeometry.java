package org.rcsb.cif.model.generated.pdbxdccgeometry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDccGeometry extends BaseCategory {
    public PdbxDccGeometry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccGeometry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccGeometry(String name) {
        super(name);
    }

    /**
     * The PDB id code.
     * @return Pdbid
     */
    public Pdbid getPdbid() {
        return (Pdbid) (isText ? textFields.computeIfAbsent("pdbid",
                Pdbid::new) : getBinaryColumn("pdbid"));
    }

    /**
     * Percentage of outliers in Ramachandran plot.
     * @return RamachandranOutlierPercent
     */
    public RamachandranOutlierPercent getRamachandranOutlierPercent() {
        return (RamachandranOutlierPercent) (isText ? textFields.computeIfAbsent("Ramachandran_outlier_percent",
                RamachandranOutlierPercent::new) : getBinaryColumn("Ramachandran_outlier_percent"));
    }

    /**
     * Number of outliers in Ramachandran plot.
     * @return RamachandranOutlierNumber
     */
    public RamachandranOutlierNumber getRamachandranOutlierNumber() {
        return (RamachandranOutlierNumber) (isText ? textFields.computeIfAbsent("Ramachandran_outlier_number",
                RamachandranOutlierNumber::new) : getBinaryColumn("Ramachandran_outlier_number"));
    }

    /**
     * Percentage of allowed residues in Ramachandran plot.
     * @return RamachandranAllowedPercent
     */
    public RamachandranAllowedPercent getRamachandranAllowedPercent() {
        return (RamachandranAllowedPercent) (isText ? textFields.computeIfAbsent("Ramachandran_allowed_percent",
                RamachandranAllowedPercent::new) : getBinaryColumn("Ramachandran_allowed_percent"));
    }

    /**
     * Number of allowed residues in Ramachandran plot.
     * @return RamachandranAllowedNumber
     */
    public RamachandranAllowedNumber getRamachandranAllowedNumber() {
        return (RamachandranAllowedNumber) (isText ? textFields.computeIfAbsent("Ramachandran_allowed_number",
                RamachandranAllowedNumber::new) : getBinaryColumn("Ramachandran_allowed_number"));
    }

    /**
     * Percentage of favored residues in Ramachandran plot.
     * @return RamachandranFavoredPercent
     */
    public RamachandranFavoredPercent getRamachandranFavoredPercent() {
        return (RamachandranFavoredPercent) (isText ? textFields.computeIfAbsent("Ramachandran_favored_percent",
                RamachandranFavoredPercent::new) : getBinaryColumn("Ramachandran_favored_percent"));
    }

    /**
     * Number of favored residues in Ramachandran plot.
     * @return RamachandranFavoredNumber
     */
    public RamachandranFavoredNumber getRamachandranFavoredNumber() {
        return (RamachandranFavoredNumber) (isText ? textFields.computeIfAbsent("Ramachandran_favored_number",
                RamachandranFavoredNumber::new) : getBinaryColumn("Ramachandran_favored_number"));
    }

    /**
     * Percentage of rotamer outliers.
     * @return RotamerOutliersPercent
     */
    public RotamerOutliersPercent getRotamerOutliersPercent() {
        return (RotamerOutliersPercent) (isText ? textFields.computeIfAbsent("rotamer_outliers_percent",
                RotamerOutliersPercent::new) : getBinaryColumn("rotamer_outliers_percent"));
    }

    /**
     * Number of rotamer outliers.
     * @return RotamerOutliersNumber
     */
    public RotamerOutliersNumber getRotamerOutliersNumber() {
        return (RotamerOutliersNumber) (isText ? textFields.computeIfAbsent("rotamer_outliers_number",
                RotamerOutliersNumber::new) : getBinaryColumn("rotamer_outliers_number"));
    }

    /**
     * Number of Cbeta deviations >0.25A.
     * @return CbetaDeviations
     */
    public CbetaDeviations getCbetaDeviations() {
        return (CbetaDeviations) (isText ? textFields.computeIfAbsent("cbeta_deviations",
                CbetaDeviations::new) : getBinaryColumn("cbeta_deviations"));
    }

    /**
     * All atom score is determined by steric overlaps >0.4A per 1000
     * atoms.
     * @return AllAtomClashscore
     */
    public AllAtomClashscore getAllAtomClashscore() {
        return (AllAtomClashscore) (isText ? textFields.computeIfAbsent("all_atom_clashscore",
                AllAtomClashscore::new) : getBinaryColumn("all_atom_clashscore"));
    }

    /**
     * The overall score for the geometry (the smaller the better).
     * @return OverallScore
     */
    public OverallScore getOverallScore() {
        return (OverallScore) (isText ? textFields.computeIfAbsent("overall_score",
                OverallScore::new) : getBinaryColumn("overall_score"));
    }

    /**
     * The overall root mean square deviation for bond lengths (all atoms).
     * @return BondOverallRms
     */
    public BondOverallRms getBondOverallRms() {
        return (BondOverallRms) (isText ? textFields.computeIfAbsent("bond_overall_rms",
                BondOverallRms::new) : getBinaryColumn("bond_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for bond lengths (all atoms).
     * @return BondOverallMax
     */
    public BondOverallMax getBondOverallMax() {
        return (BondOverallMax) (isText ? textFields.computeIfAbsent("bond_overall_max",
                BondOverallMax::new) : getBinaryColumn("bond_overall_max"));
    }

    /**
     * The overall root mean square deviation for bond lengths (ligand only).
     * @return BondLigandRms
     */
    public BondLigandRms getBondLigandRms() {
        return (BondLigandRms) (isText ? textFields.computeIfAbsent("bond_ligand_rms",
                BondLigandRms::new) : getBinaryColumn("bond_ligand_rms"));
    }

    /**
     * The maximum root mean square deviation for bond lengths (ligand only).
     * @return BondLigandMax
     */
    public BondLigandMax getBondLigandMax() {
        return (BondLigandMax) (isText ? textFields.computeIfAbsent("bond_ligand_max",
                BondLigandMax::new) : getBinaryColumn("bond_ligand_max"));
    }

    /**
     * The overall root mean square deviation for bond angles (all atoms).
     * @return AngleOverallRms
     */
    public AngleOverallRms getAngleOverallRms() {
        return (AngleOverallRms) (isText ? textFields.computeIfAbsent("angle_overall_rms",
                AngleOverallRms::new) : getBinaryColumn("angle_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for bond angles (all atoms).
     * @return AngleOverallMax
     */
    public AngleOverallMax getAngleOverallMax() {
        return (AngleOverallMax) (isText ? textFields.computeIfAbsent("angle_overall_max",
                AngleOverallMax::new) : getBinaryColumn("angle_overall_max"));
    }

    /**
     * The overall root mean square deviation for bond angles (ligand only).
     * @return AngleLigandRms
     */
    public AngleLigandRms getAngleLigandRms() {
        return (AngleLigandRms) (isText ? textFields.computeIfAbsent("angle_ligand_rms",
                AngleLigandRms::new) : getBinaryColumn("angle_ligand_rms"));
    }

    /**
     * The maximum root mean square deviation for bond angles (ligand only).
     * @return AngleLigandMax
     */
    public AngleLigandMax getAngleLigandMax() {
        return (AngleLigandMax) (isText ? textFields.computeIfAbsent("angle_ligand_max",
                AngleLigandMax::new) : getBinaryColumn("angle_ligand_max"));
    }

    /**
     * The overall root mean square deviation for dihedrals (all atoms).
     * @return DihedralOverallRms
     */
    public DihedralOverallRms getDihedralOverallRms() {
        return (DihedralOverallRms) (isText ? textFields.computeIfAbsent("dihedral_overall_rms",
                DihedralOverallRms::new) : getBinaryColumn("dihedral_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for dihedrals (all atoms).
     * @return DihedralOverallMax
     */
    public DihedralOverallMax getDihedralOverallMax() {
        return (DihedralOverallMax) (isText ? textFields.computeIfAbsent("dihedral_overall_max",
                DihedralOverallMax::new) : getBinaryColumn("dihedral_overall_max"));
    }

    /**
     * The overall root mean square deviation for chirality (all atoms).
     * @return ChiralityOverallRms
     */
    public ChiralityOverallRms getChiralityOverallRms() {
        return (ChiralityOverallRms) (isText ? textFields.computeIfAbsent("chirality_overall_rms",
                ChiralityOverallRms::new) : getBinaryColumn("chirality_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for chirality (all atoms).
     * @return ChiralityOverallMax
     */
    public ChiralityOverallMax getChiralityOverallMax() {
        return (ChiralityOverallMax) (isText ? textFields.computeIfAbsent("chirality_overall_max",
                ChiralityOverallMax::new) : getBinaryColumn("chirality_overall_max"));
    }

    /**
     * The overall root mean square deviation for planarity (all atoms).
     * @return PlanarityOverallRms
     */
    public PlanarityOverallRms getPlanarityOverallRms() {
        return (PlanarityOverallRms) (isText ? textFields.computeIfAbsent("planarity_overall_rms",
                PlanarityOverallRms::new) : getBinaryColumn("planarity_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for planarity (all atoms).
     * @return PlanarityOverallMax
     */
    public PlanarityOverallMax getPlanarityOverallMax() {
        return (PlanarityOverallMax) (isText ? textFields.computeIfAbsent("planarity_overall_max",
                PlanarityOverallMax::new) : getBinaryColumn("planarity_overall_max"));
    }

    /**
     * The overall on-bonded distance (all atoms).
     * @return Non_bondedRms
     */
    public Non_bondedRms getNon_bondedRms() {
        return (Non_bondedRms) (isText ? textFields.computeIfAbsent("non-bonded_rms",
                Non_bondedRms::new) : getBinaryColumn("non-bonded_rms"));
    }
}
