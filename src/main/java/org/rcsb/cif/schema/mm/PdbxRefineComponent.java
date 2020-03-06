package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFINE_COMPONENT category record
 * statistics of the final model relative to the density map.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefineComponent extends DelegatingCategory {
    public PdbxRefineComponent(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "B_iso":
                return getBIso();
            case "B_iso_main_chain":
                return getBIsoMainChain();
            case "B_iso_side_chain":
                return getBIsoSideChain();
            case "shift":
                return getShift();
            case "shift_side_chain":
                return getShiftSideChain();
            case "shift_main_chain":
                return getShiftMainChain();
            case "correlation":
                return getCorrelation();
            case "correlation_side_chain":
                return getCorrelationSideChain();
            case "correlation_main_chain":
                return getCorrelationMainChain();
            case "real_space_R":
                return getRealSpaceR();
            case "real_space_R_side_chain":
                return getRealSpaceRSideChain();
            case "real_space_R_main_chain":
                return getRealSpaceRMainChain();
            case "connect":
                return getConnect();
            case "density_index":
                return getDensityIndex();
            case "density_index_main_chain":
                return getDensityIndexMainChain();
            case "density_index_side_chain":
                return getDensityIndexSideChain();
            case "density_ratio":
                return getDensityRatio();
            case "density_ratio_main_chain":
                return getDensityRatioMainChain();
            case "density_ratio_side_chain":
                return getDensityRatioSideChain();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the component.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return delegate.getColumn("B_iso", DelegatingFloatColumn::new);
    }

    /**
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIsoMainChain() {
        return delegate.getColumn("B_iso_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The average isotropic B factors for the group of atoms
     * (e.g. residue or ligand, side chain, main chain).
     * The B factors for each atom is given by _atom_site.B_iso_or_equiv
     * @return FloatColumn
     */
    public FloatColumn getBIsoSideChain() {
        return delegate.getColumn("B_iso_side_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("shift", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("shift_side_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("shift_main_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("correlation", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("correlation_side_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("correlation_main_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("real_space_R", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("real_space_R_side_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("real_space_R_main_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("connect", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_index", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_index_main_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_index_side_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_ratio", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_ratio_main_chain", DelegatingFloatColumn::new);
    }

    /**
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
        return delegate.getColumn("density_ratio_side_chain", DelegatingFloatColumn::new);
    }

}