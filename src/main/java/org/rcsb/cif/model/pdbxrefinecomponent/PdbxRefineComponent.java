package org.rcsb.cif.model.pdbxrefinecomponent;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRefineComponent extends BaseCategory {
    public PdbxRefineComponent(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefineComponent(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefineComponent(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return BIso
     */
    public BIso getBIso() {
        return (BIso) (isText ? textFields.computeIfAbsent("B_iso",
                BIso::new) : getBinaryColumn("B_iso"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return BIsoMainChain
     */
    public BIsoMainChain getBIsoMainChain() {
        return (BIsoMainChain) (isText ? textFields.computeIfAbsent("B_iso_main_chain",
                BIsoMainChain::new) : getBinaryColumn("B_iso_main_chain"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return BIsoSideChain
     */
    public BIsoSideChain getBIsoSideChain() {
        return (BIsoSideChain) (isText ? textFields.computeIfAbsent("B_iso_side_chain",
                BIsoSideChain::new) : getBinaryColumn("B_iso_side_chain"));
    }

    /**
     * 
     * The tendency of the group of atoms (e.g. residue
     * or ligand, side chain, main chain)  to move away from its current position.
     * 
     * Displacement of atoms from electron density is estimated from the
     * difference (Fobs - Fcal) map. The displacement vector is the ratio of
     * the gradient of difference density to the curvature. The amplitude of
     * the displacement vector is an indicator of the positional error.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return Shift
     */
    public Shift getShift() {
        return (Shift) (isText ? textFields.computeIfAbsent("shift",
                Shift::new) : getBinaryColumn("shift"));
    }

    /**
     * 
     * The tendency of the group of atoms (e.g. residue
     * or ligand, side chain, main chain)  to move away from its current position.
     * 
     * Displacement of atoms from electron density is estimated from the
     * difference (Fobs - Fcal) map. The displacement vector is the ratio of
     * the gradient of difference density to the curvature. The amplitude of
     * the displacement vector is an indicator of the positional error.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return ShiftSideChain
     */
    public ShiftSideChain getShiftSideChain() {
        return (ShiftSideChain) (isText ? textFields.computeIfAbsent("shift_side_chain",
                ShiftSideChain::new) : getBinaryColumn("shift_side_chain"));
    }

    /**
     * 
     * The tendency of the group of atoms (e.g. residue
     * or ligand, side chain, main chain)  to move away from its current position.
     * 
     * Displacement of atoms from electron density is estimated from the
     * difference (Fobs - Fcal) map. The displacement vector is the ratio of
     * the gradient of difference density to the curvature. The amplitude of
     * the displacement vector is an indicator of the positional error.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return ShiftMainChain
     */
    public ShiftMainChain getShiftMainChain() {
        return (ShiftMainChain) (isText ? textFields.computeIfAbsent("shift_main_chain",
                ShiftMainChain::new) : getBinaryColumn("shift_main_chain"));
    }

    /**
     * 
     * Correlation coefficient of electron density for each residue or ligand,
     * side chain, main chain
     * 
     * The density correlation coefficient is calculated for each component
     * from atomic densities of (2Fobs-Fcalc) map - "Robs" and the model
     * map (Fcalc) - "Rcalc" :
     * 
     * D_corr =  <Robs><Rcalc>/sqrt(<Robs**2><Rcalc**2>)
     * 
     * where <Robs> is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * <Rcalc> is the mean of "calculated" densities of
     * component atoms.
     * 
     * The value of density for some atom from map R(x) is:
     * 
     * sum_i ( R(xi) * Ratom(xi - xa) )
     * Dens =  ----------------------------------
     * sum_i ( Ratom(xi - xa) )
     * 
     * where  Ratom(x) is atomic electron density for the x-th grid point.
     * xa - vector of the centre of atom.
     * xi - vector of the i-th point of grid.
     * Sum is taken over all grid points which have distance
     * from the center of the atom less than the Radius_limit.
     * For all atoms Radius_limit = 2.5 A.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return Correlation
     */
    public Correlation getCorrelation() {
        return (Correlation) (isText ? textFields.computeIfAbsent("correlation",
                Correlation::new) : getBinaryColumn("correlation"));
    }

    /**
     * 
     * Correlation coefficient of electron density for each residue or ligand,
     * side chain, main chain
     * 
     * The density correlation coefficient is calculated for each component
     * from atomic densities of (2Fobs-Fcalc) map - "Robs" and the model
     * map (Fcalc) - "Rcalc" :
     * 
     * D_corr =  <Robs><Rcalc>/sqrt(<Robs**2><Rcalc**2>)
     * 
     * where <Robs> is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * <Rcalc> is the mean of "calculated" densities of
     * component atoms.
     * 
     * The value of density for some atom from map R(x) is:
     * 
     * sum_i ( R(xi) * Ratom(xi - xa) )
     * Dens =  ----------------------------------
     * sum_i ( Ratom(xi - xa) )
     * 
     * where  Ratom(x) is atomic electron density for the x-th grid point.
     * xa - vector of the centre of atom.
     * xi - vector of the i-th point of grid.
     * Sum is taken over all grid points which have distance
     * from the center of the atom less than the Radius_limit.
     * For all atoms Radius_limit = 2.5 A.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return CorrelationSideChain
     */
    public CorrelationSideChain getCorrelationSideChain() {
        return (CorrelationSideChain) (isText ? textFields.computeIfAbsent("correlation_side_chain",
                CorrelationSideChain::new) : getBinaryColumn("correlation_side_chain"));
    }

    /**
     * 
     * Correlation coefficient of electron density for each residue or ligand,
     * side chain, main chain
     * 
     * The density correlation coefficient is calculated for each component
     * from atomic densities of (2Fobs-Fcalc) map - "Robs" and the model
     * map (Fcalc) - "Rcalc" :
     * 
     * D_corr =  <Robs><Rcalc>/sqrt(<Robs**2><Rcalc**2>)
     * 
     * where <Robs> is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * <Rcalc> is the mean of "calculated" densities of
     * component atoms.
     * 
     * The value of density for some atom from map R(x) is:
     * 
     * sum_i ( R(xi) * Ratom(xi - xa) )
     * Dens =  ----------------------------------
     * sum_i ( Ratom(xi - xa) )
     * 
     * where  Ratom(x) is atomic electron density for the x-th grid point.
     * xa - vector of the centre of atom.
     * xi - vector of the i-th point of grid.
     * Sum is taken over all grid points which have distance
     * from the center of the atom less than the Radius_limit.
     * For all atoms Radius_limit = 2.5 A.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return CorrelationMainChain
     */
    public CorrelationMainChain getCorrelationMainChain() {
        return (CorrelationMainChain) (isText ? textFields.computeIfAbsent("correlation_main_chain",
                CorrelationMainChain::new) : getBinaryColumn("correlation_main_chain"));
    }

    /**
     * 
     * Real space R factor of electron density for each component,
     * residue side chain, or main chain.
     * 
     * The real space R factor is calculated by the equation
     * 
     * R_real = [Sum~i (|Dobs - Dcal|)]/[Sum~i (|Dobs + Dcal|)]
     * 
     * Where:
     * Dobs is the observed  electron density,
     * Dcal is the calculated  electron density,
     * summation is for all the grid points
     * 
     * Ref: Branden, C.I. & Jones, T.A. (1990).  Nature, 343, 687-689
     * @return RealSpaceR
     */
    public RealSpaceR getRealSpaceR() {
        return (RealSpaceR) (isText ? textFields.computeIfAbsent("real_space_R",
                RealSpaceR::new) : getBinaryColumn("real_space_R"));
    }

    /**
     * 
     * Real space R factor of electron density for each component,
     * residue side chain, or main chain.
     * 
     * The real space R factor is calculated by the equation
     * 
     * R_real = [Sum~i (|Dobs - Dcal|)]/[Sum~i (|Dobs + Dcal|)]
     * 
     * Where:
     * Dobs is the observed  electron density,
     * Dcal is the calculated  electron density,
     * summation is for all the grid points
     * 
     * Ref: Branden, C.I. & Jones, T.A. (1990).  Nature, 343, 687-689
     * @return RealSpaceRSideChain
     */
    public RealSpaceRSideChain getRealSpaceRSideChain() {
        return (RealSpaceRSideChain) (isText ? textFields.computeIfAbsent("real_space_R_side_chain",
                RealSpaceRSideChain::new) : getBinaryColumn("real_space_R_side_chain"));
    }

    /**
     * 
     * Real space R factor of electron density for each component,
     * residue side chain, or main chain.
     * 
     * The real space R factor is calculated by the equation
     * 
     * R_real = [Sum~i (|Dobs - Dcal|)]/[Sum~i (|Dobs + Dcal|)]
     * 
     * Where:
     * Dobs is the observed  electron density,
     * Dcal is the calculated  electron density,
     * summation is for all the grid points
     * 
     * Ref: Branden, C.I. & Jones, T.A. (1990).  Nature, 343, 687-689
     * @return RealSpaceRMainChain
     */
    public RealSpaceRMainChain getRealSpaceRMainChain() {
        return (RealSpaceRMainChain) (isText ? textFields.computeIfAbsent("real_space_R_main_chain",
                RealSpaceRMainChain::new) : getBinaryColumn("real_space_R_main_chain"));
    }

    /**
     * 
     * The index of connectivity is the product of the (2Fobs-Fcal) electron
     * density values for the backbone atoms (N, CA and C) divided by the
     * average value for the structure. Low values (less than 1.0) of this
     * index indicate breaks in the backbone electron density which may be
     * due to flexibility of the chain or incorrect tracing.
     * 
     * connect = [(D(xi)...D(xi))^(1/N)] /<D>_all
     * 
     * Where:
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return Connect
     */
    public Connect getConnect() {
        return (Connect) (isText ? textFields.computeIfAbsent("connect",
                Connect::new) : getBinaryColumn("connect"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /<D>_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return DensityIndex
     */
    public DensityIndex getDensityIndex() {
        return (DensityIndex) (isText ? textFields.computeIfAbsent("density_index",
                DensityIndex::new) : getBinaryColumn("density_index"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /<D>_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return DensityIndexMainChain
     */
    public DensityIndexMainChain getDensityIndexMainChain() {
        return (DensityIndexMainChain) (isText ? textFields.computeIfAbsent("density_index_main_chain",
                DensityIndexMainChain::new) : getBinaryColumn("density_index_main_chain"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /<D>_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. & Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return DensityIndexSideChain
     */
    public DensityIndexSideChain getDensityIndexSideChain() {
        return (DensityIndexSideChain) (isText ? textFields.computeIfAbsent("density_index_side_chain",
                DensityIndexSideChain::new) : getBinaryColumn("density_index_side_chain"));
    }

    /**
     * 
     * The density ratio is similar to the density index, but summation of the
     * density for the group is used for calculation.
     * 
     * The ratio of density is the summation of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 0.4) of this ratio may be
     * problematic for the group.
     * 
     * 
     * index = [Sum~i D(xi)]/<D>_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return DensityRatio
     */
    public DensityRatio getDensityRatio() {
        return (DensityRatio) (isText ? textFields.computeIfAbsent("density_ratio",
                DensityRatio::new) : getBinaryColumn("density_ratio"));
    }

    /**
     * 
     * The density ratio is similar to the density index, but summation of the
     * density for the group is used for calculation.
     * 
     * The ratio of density is the summation of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 0.4) of this ratio may be
     * problematic for the group.
     * 
     * 
     * index = [Sum~i D(xi)]/<D>_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return DensityRatioMainChain
     */
    public DensityRatioMainChain getDensityRatioMainChain() {
        return (DensityRatioMainChain) (isText ? textFields.computeIfAbsent("density_ratio_main_chain",
                DensityRatioMainChain::new) : getBinaryColumn("density_ratio_main_chain"));
    }

    /**
     * 
     * The density ratio is similar to the density index, but summation of the
     * density for the group is used for calculation.
     * 
     * The ratio of density is the summation of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 0.4) of this ratio may be
     * problematic for the group.
     * 
     * 
     * index = [Sum~i D(xi)]/<D>_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * <D>_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return DensityRatioSideChain
     */
    public DensityRatioSideChain getDensityRatioSideChain() {
        return (DensityRatioSideChain) (isText ? textFields.computeIfAbsent("density_ratio_side_chain",
                DensityRatioSideChain::new) : getBinaryColumn("density_ratio_side_chain"));
    }
}
