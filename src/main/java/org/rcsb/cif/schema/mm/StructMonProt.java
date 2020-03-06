package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_MON_PROT category record details about
 * structural properties of a protein when analyzed at the monomer
 * level. Analogous data items for nucleic acids are given in the
 * STRUCT_MON_NUCL category. For items where the value of the
 * property depends on the method employed to calculate it,
 * details of the method of calculation are given using data items
 * in the STRUCT_MON_DETAILS category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructMonProt extends DelegatingCategory {
    public StructMonProt(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "chi1":
                return getChi1();
            case "chi2":
                return getChi2();
            case "chi3":
                return getChi3();
            case "chi4":
                return getChi4();
            case "chi5":
                return getChi5();
            case "details":
                return getDetails();
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
            case "RSCC_all":
                return getRSCCAll();
            case "RSCC_main":
                return getRSCCMain();
            case "RSCC_side":
                return getRSCCSide();
            case "RSR_all":
                return getRSRAll();
            case "RSR_main":
                return getRSRMain();
            case "RSR_side":
                return getRSRSide();
            case "mean_B_all":
                return getMeanBAll();
            case "mean_B_main":
                return getMeanBMain();
            case "mean_B_side":
                return getMeanBSide();
            case "omega":
                return getOmega();
            case "phi":
                return getPhi();
            case "psi":
                return getPsi();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value in degrees of the side-chain torsion angle chi1, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi1() {
        return delegate.getColumn("chi1", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi2, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi2() {
        return delegate.getColumn("chi2", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi3, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi3() {
        return delegate.getColumn("chi3", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi4, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi4() {
        return delegate.getColumn("chi4", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi5, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi5() {
        return delegate.getColumn("chi5", DelegatingFloatColumn::new);
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect that
     * requires annotation.
     * @return FloatColumn
     */
    public FloatColumn getDetails() {
        return delegate.getColumn("details", DelegatingFloatColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991),  evaluated over all atoms
     * in the monomer.
     * 
     * sum|p~obs~ - &lt;p~obs~&gt;| * sum|p~calc~ - &lt;p~calc~&gt;|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - &lt;p~obs~&gt; |^2^
     * * sum|p~calc~ - &lt;p~calc~&gt;|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. &lt; &gt; indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. &amp; Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCAll() {
        return delegate.getColumn("RSCC_all", DelegatingFloatColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms
     * in the main chain of the monomer.
     * 
     * sum|p~obs~ - &lt;p~obs~&gt;| * sum|p~calc~ - &lt;p~calc~&gt;|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - &lt;p~obs~&gt; |^2^
     * * sum|p~calc~ - &lt;p~calc~&gt;|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. &lt; &gt; indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. &amp; Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCMain() {
        return delegate.getColumn("RSCC_main", DelegatingFloatColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms
     * in the side chain of the monomer.
     * 
     * sum|p~obs~ - &lt;p~obs~&gt;| * sum|p~calc~ - &lt;p~calc~&gt;|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - &lt;p~obs~&gt; |^2^
     * * sum|p~calc~ - &lt;p~calc~&gt;|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. &lt; &gt; indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. &amp; Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCSide() {
        return delegate.getColumn("RSCC_side", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. &amp; Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRAll() {
        return delegate.getColumn("RSR_all", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the main chain of the
     * monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. &amp; Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRMain() {
        return delegate.getColumn("RSR_main", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the side chain of the
     * monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. &amp; Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRSide() {
        return delegate.getColumn("RSR_side", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter for all
     * atoms in the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBAll() {
        return delegate.getColumn("mean_B_all", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the main chain of the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBMain() {
        return delegate.getColumn("mean_B_main", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the side chain of the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBSide() {
        return delegate.getColumn("mean_B_side", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the main-chain torsion angle omega.
     * @return FloatColumn
     */
    public FloatColumn getOmega() {
        return delegate.getColumn("omega", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the main-chain torsion angle phi.
     * @return FloatColumn
     */
    public FloatColumn getPhi() {
        return delegate.getColumn("phi", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the main-chain torsion angle psi.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return delegate.getColumn("psi", DelegatingFloatColumn::new);
    }

}