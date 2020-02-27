package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record the overall deviations about
 * geometry (such as bond length, angle, dihedral, chirality,
 * planarity). These data are calculated with the phenix module
 * model_vs_data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbid", StrColumn::new) :
                getBinaryColumn("pdbid"));
    }

    /**
     * Percentage of outliers in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranOutlierPercent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Ramachandran_outlier_percent", FloatColumn::new) :
                getBinaryColumn("Ramachandran_outlier_percent"));
    }

    /**
     * Number of outliers in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranOutlierNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("Ramachandran_outlier_number", IntColumn::new) :
                getBinaryColumn("Ramachandran_outlier_number"));
    }

    /**
     * Percentage of allowed residues in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranAllowedPercent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Ramachandran_allowed_percent", FloatColumn::new) :
                getBinaryColumn("Ramachandran_allowed_percent"));
    }

    /**
     * Number of allowed residues in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranAllowedNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("Ramachandran_allowed_number", IntColumn::new) :
                getBinaryColumn("Ramachandran_allowed_number"));
    }

    /**
     * Percentage of favored residues in Ramachandran plot.
     * @return FloatColumn
     */
    public FloatColumn getRamachandranFavoredPercent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Ramachandran_favored_percent", FloatColumn::new) :
                getBinaryColumn("Ramachandran_favored_percent"));
    }

    /**
     * Number of favored residues in Ramachandran plot.
     * @return IntColumn
     */
    public IntColumn getRamachandranFavoredNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("Ramachandran_favored_number", IntColumn::new) :
                getBinaryColumn("Ramachandran_favored_number"));
    }

    /**
     * Percentage of rotamer outliers.
     * @return FloatColumn
     */
    public FloatColumn getRotamerOutliersPercent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rotamer_outliers_percent", FloatColumn::new) :
                getBinaryColumn("rotamer_outliers_percent"));
    }

    /**
     * Number of rotamer outliers.
     * @return IntColumn
     */
    public IntColumn getRotamerOutliersNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("rotamer_outliers_number", IntColumn::new) :
                getBinaryColumn("rotamer_outliers_number"));
    }

    /**
     * Number of Cbeta deviations &gt;0.25A.
     * @return IntColumn
     */
    public IntColumn getCbetaDeviations() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("cbeta_deviations", IntColumn::new) :
                getBinaryColumn("cbeta_deviations"));
    }

    /**
     * All atom score is determined by steric overlaps &gt;0.4A per 1000
     * atoms.
     * @return FloatColumn
     */
    public FloatColumn getAllAtomClashscore() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("all_atom_clashscore", FloatColumn::new) :
                getBinaryColumn("all_atom_clashscore"));
    }

    /**
     * The overall score for the geometry (the smaller the better).
     * @return FloatColumn
     */
    public FloatColumn getOverallScore() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("overall_score", FloatColumn::new) :
                getBinaryColumn("overall_score"));
    }

    /**
     * The overall root mean square deviation for bond lengths (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getBondOverallRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_overall_rms", FloatColumn::new) :
                getBinaryColumn("bond_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for bond lengths (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getBondOverallMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_overall_max", FloatColumn::new) :
                getBinaryColumn("bond_overall_max"));
    }

    /**
     * The overall root mean square deviation for bond lengths (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getBondLigandRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_ligand_rms", FloatColumn::new) :
                getBinaryColumn("bond_ligand_rms"));
    }

    /**
     * The maximum root mean square deviation for bond lengths (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getBondLigandMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("bond_ligand_max", FloatColumn::new) :
                getBinaryColumn("bond_ligand_max"));
    }

    /**
     * The overall root mean square deviation for bond angles (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getAngleOverallRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_overall_rms", FloatColumn::new) :
                getBinaryColumn("angle_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for bond angles (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getAngleOverallMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_overall_max", FloatColumn::new) :
                getBinaryColumn("angle_overall_max"));
    }

    /**
     * The overall root mean square deviation for bond angles (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getAngleLigandRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_ligand_rms", FloatColumn::new) :
                getBinaryColumn("angle_ligand_rms"));
    }

    /**
     * The maximum root mean square deviation for bond angles (ligand only).
     * @return FloatColumn
     */
    public FloatColumn getAngleLigandMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_ligand_max", FloatColumn::new) :
                getBinaryColumn("angle_ligand_max"));
    }

    /**
     * The overall root mean square deviation for dihedrals (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getDihedralOverallRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dihedral_overall_rms", FloatColumn::new) :
                getBinaryColumn("dihedral_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for dihedrals (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getDihedralOverallMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dihedral_overall_max", FloatColumn::new) :
                getBinaryColumn("dihedral_overall_max"));
    }

    /**
     * The overall root mean square deviation for chirality (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getChiralityOverallRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chirality_overall_rms", FloatColumn::new) :
                getBinaryColumn("chirality_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for chirality (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getChiralityOverallMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chirality_overall_max", FloatColumn::new) :
                getBinaryColumn("chirality_overall_max"));
    }

    /**
     * The overall root mean square deviation for planarity (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getPlanarityOverallRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("planarity_overall_rms", FloatColumn::new) :
                getBinaryColumn("planarity_overall_rms"));
    }

    /**
     * The maximum root mean square deviation for planarity (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getPlanarityOverallMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("planarity_overall_max", FloatColumn::new) :
                getBinaryColumn("planarity_overall_max"));
    }

    /**
     * The overall on-bonded distance (all atoms).
     * @return FloatColumn
     */
    public FloatColumn getNon_bondedRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("non-bonded_rms", FloatColumn::new) :
                getBinaryColumn("non-bonded_rms"));
    }
}
