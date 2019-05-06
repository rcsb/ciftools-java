package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFINE_COMPONENT category record
 * statistics of the final model relative to the density map.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso", FloatColumn::new) :
                getBinaryColumn("B_iso"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIsoMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_main_chain", FloatColumn::new) :
                getBinaryColumn("B_iso_main_chain"));
    }

    /**
     * 
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIsoSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_side_chain", FloatColumn::new) :
                getBinaryColumn("B_iso_side_chain"));
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getShift() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift", FloatColumn::new) :
                getBinaryColumn("shift"));
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getShiftSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift_side_chain", FloatColumn::new) :
                getBinaryColumn("shift_side_chain"));
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getShiftMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift_main_chain", FloatColumn::new) :
                getBinaryColumn("shift_main_chain"));
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
     * D_corr =  &lt;Robs&gt;&lt;Rcalc&gt;/sqrt(&lt;Robs**2&gt;&lt;Rcalc**2&gt;)
     * 
     * where &lt;Robs&gt; is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * &lt;Rcalc&gt; is the mean of "calculated" densities of
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation", FloatColumn::new) :
                getBinaryColumn("correlation"));
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
     * D_corr =  &lt;Robs&gt;&lt;Rcalc&gt;/sqrt(&lt;Robs**2&gt;&lt;Rcalc**2&gt;)
     * 
     * where &lt;Robs&gt; is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * &lt;Rcalc&gt; is the mean of "calculated" densities of
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getCorrelationSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_side_chain", FloatColumn::new) :
                getBinaryColumn("correlation_side_chain"));
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
     * D_corr =  &lt;Robs&gt;&lt;Rcalc&gt;/sqrt(&lt;Robs**2&gt;&lt;Rcalc**2&gt;)
     * 
     * where &lt;Robs&gt; is the mean of "observed" densities of atoms of the
     * component (backbone or side chain).
     * 
     * &lt;Rcalc&gt; is the mean of "calculated" densities of
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
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getCorrelationMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation_main_chain", FloatColumn::new) :
                getBinaryColumn("correlation_main_chain"));
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
     * Ref: Branden, C.I. &amp; Jones, T.A. (1990).  Nature, 343, 687-689
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R", FloatColumn::new) :
                getBinaryColumn("real_space_R"));
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
     * Ref: Branden, C.I. &amp; Jones, T.A. (1990).  Nature, 343, 687-689
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceRSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R_side_chain", FloatColumn::new) :
                getBinaryColumn("real_space_R_side_chain"));
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
     * Ref: Branden, C.I. &amp; Jones, T.A. (1990).  Nature, 343, 687-689
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceRMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R_main_chain", FloatColumn::new) :
                getBinaryColumn("real_space_R_main_chain"));
    }

    /**
     * 
     * The index of connectivity is the product of the (2Fobs-Fcal) electron
     * density values for the backbone atoms (N, CA and C) divided by the
     * average value for the structure. Low values (less than 1.0) of this
     * index indicate breaks in the backbone electron density which may be
     * due to flexibility of the chain or incorrect tracing.
     * 
     * connect = [(D(xi)...D(xi))^(1/N)] /&lt;D&gt;_all
     * 
     * Where:
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getConnect() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("connect", FloatColumn::new) :
                getBinaryColumn("connect"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /&lt;D&gt;_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getDensityIndex() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_index", FloatColumn::new) :
                getBinaryColumn("density_index"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /&lt;D&gt;_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_index_main_chain", FloatColumn::new) :
                getBinaryColumn("density_index_main_chain"));
    }

    /**
     * 
     * The index of density is the product of the (2Fobs-Fcal) electron
     * density values for the group of atoms divided by the average value
     * for the structure. Low values (less than 1.0) may be problematic for
     * model fitting.
     * 
     * index = [(D(xi)...D(xi))^(1/N)] /&lt;D&gt;_all
     * 
     * Where :
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the averaged value of density for the structure.
     * The product is for N atoms of group.
     * 
     * Ref: Vaguine, A.A., Richelle, J. &amp; Wodak, S.J. (1999). Acta Cryst. D55,199-205
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_index_side_chain", FloatColumn::new) :
                getBinaryColumn("density_index_side_chain"));
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
     * index = [Sum~i D(xi)]/&lt;D&gt;_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return FloatColumn
     */
    public FloatColumn getDensityRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_ratio", FloatColumn::new) :
                getBinaryColumn("density_ratio"));
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
     * index = [Sum~i D(xi)]/&lt;D&gt;_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return FloatColumn
     */
    public FloatColumn getDensityRatioMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_ratio_main_chain", FloatColumn::new) :
                getBinaryColumn("density_ratio_main_chain"));
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
     * index = [Sum~i D(xi)]/&lt;D&gt;_all
     * 
     * Where:
     * 
     * D(xi) = (2*Fobs - Fcal)
     * &lt;D&gt;_all is the average value of density for the structure.
     * The summation is for all the atoms of group.
     * @return FloatColumn
     */
    public FloatColumn getDensityRatioSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_ratio_side_chain", FloatColumn::new) :
                getBinaryColumn("density_ratio_side_chain"));
    }
}
