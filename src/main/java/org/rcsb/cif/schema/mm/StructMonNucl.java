package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_MON_NUCL category record details about
 * structural properties of a nucleic acid when analyzed at the
 * monomer level. Analogous data items for proteins are given in
 * the STRUCT_MON_PROT category. For items where the value of the
 * property depends on the method employed to calculate it,
 * details of the method of calculation are given using data items
 * in the STRUCT_MON_DETAILS category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructMonNucl extends DelegatingCategory {
    public StructMonNucl(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "alpha":
                return getAlpha();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "beta":
                return getBeta();
            case "chi1":
                return getChi1();
            case "chi2":
                return getChi2();
            case "delta":
                return getDelta();
            case "details":
                return getDetails();
            case "epsilon":
                return getEpsilon();
            case "gamma":
                return getGamma();
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "mean_B_all":
                return getMeanBAll();
            case "mean_B_base":
                return getMeanBBase();
            case "mean_B_phos":
                return getMeanBPhos();
            case "mean_B_sugar":
                return getMeanBSugar();
            case "nu0":
                return getNu0();
            case "nu1":
                return getNu1();
            case "nu2":
                return getNu2();
            case "nu3":
                return getNu3();
            case "nu4":
                return getNu4();
            case "P":
                return getP();
            case "RSCC_all":
                return getRSCCAll();
            case "RSCC_base":
                return getRSCCBase();
            case "RSCC_phos":
                return getRSCCPhos();
            case "RSCC_sugar":
                return getRSCCSugar();
            case "RSR_all":
                return getRSRAll();
            case "RSR_base":
                return getRSRBase();
            case "RSR_phos":
                return getRSRPhos();
            case "RSR_sugar":
                return getRSRSugar();
            case "tau0":
                return getTau0();
            case "tau1":
                return getTau1();
            case "tau2":
                return getTau2();
            case "tau3":
                return getTau3();
            case "tau4":
                return getTau4();
            case "taum":
                return getTaum();
            case "zeta":
                return getZeta();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value in degrees of the backbone torsion angle alpha
     * (O3'-P-O5'-C5').
     * @return FloatColumn
     */
    public FloatColumn getAlpha() {
        return delegate.getColumn("alpha", DelegatingFloatColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * The value in degrees of the backbone torsion angle beta
     * (P-O5'-C5'-C4').
     * @return FloatColumn
     */
    public FloatColumn getBeta() {
        return delegate.getColumn("beta", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi1
     * (O4'-C1'-N1-C2).
     * @return FloatColumn
     */
    public FloatColumn getChi1() {
        return delegate.getColumn("chi1", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi2
     * (O4'-C1'-N9-C4).
     * @return FloatColumn
     */
    public FloatColumn getChi2() {
        return delegate.getColumn("chi2", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the backbone torsion angle delta
     * (C5'-C4'-C3'-O3').
     * @return FloatColumn
     */
    public FloatColumn getDelta() {
        return delegate.getColumn("delta", DelegatingFloatColumn::new);
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect
     * that requires annotation.
     * @return FloatColumn
     */
    public FloatColumn getDetails() {
        return delegate.getColumn("details", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the backbone torsion angle epsilon
     * (C4'-C3'-O3'-P).
     * @return FloatColumn
     */
    public FloatColumn getEpsilon() {
        return delegate.getColumn("epsilon", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the backbone torsion angle gamma
     * (O5'-C5'-C4'-C3').
     * @return FloatColumn
     */
    public FloatColumn getGamma() {
        return delegate.getColumn("gamma", DelegatingFloatColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for all atoms in the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBAll() {
        return delegate.getColumn("mean_B_all", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the base moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBBase() {
        return delegate.getColumn("mean_B_base", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the phosphate moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBPhos() {
        return delegate.getColumn("mean_B_phos", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the sugar moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBSugar() {
        return delegate.getColumn("mean_B_sugar", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle nu0
     * (C4'-O4'-C1'-C2').
     * @return FloatColumn
     */
    public FloatColumn getNu0() {
        return delegate.getColumn("nu0", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle nu1
     * (O4'-C1'-C2'-C3').
     * @return FloatColumn
     */
    public FloatColumn getNu1() {
        return delegate.getColumn("nu1", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle nu2
     * (C1'-C2'-C3'-C4').
     * @return FloatColumn
     */
    public FloatColumn getNu2() {
        return delegate.getColumn("nu2", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle nu3
     * (C2'-C3'-C4'-O4').
     * @return FloatColumn
     */
    public FloatColumn getNu3() {
        return delegate.getColumn("nu3", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle nu4
     * (C3'-C4'-O4'-C1').
     * @return FloatColumn
     */
    public FloatColumn getNu4() {
        return delegate.getColumn("nu4", DelegatingFloatColumn::new);
    }

    /**
     * P is the phase angle of pseudorotation for five-membered rings.
     * For ribose and deoxyribose sugars in nucleic
     * acids
     * (tau4 +tau1)-(tau3+tau0)
     * P = ATAN (-------------------------)
     * 2tau2 (sin 36+sin 72)
     * 
     * If tau2 is &lt;0, then P=P+180 degree (Altona &amp; Sundaralingam,
     * 1972).
     * 
     * Ref: Altona, C. &amp; Sundaralingam, M. (1972).
     * J. Am. Chem. Soc. 94, 8205-8212.
     * @return FloatColumn
     */
    public FloatColumn getP() {
        return delegate.getColumn("P", DelegatingFloatColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * nucleic acid monomer.
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
     * described by Jones et al. (1991), evaluated over all atoms in the
     * base moiety of the nucleic acid monomer.
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
    public FloatColumn getRSCCBase() {
        return delegate.getColumn("RSCC_base", DelegatingFloatColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * phosphate moiety of the nucleic acid monomer.
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
    public FloatColumn getRSCCPhos() {
        return delegate.getColumn("RSCC_phos", DelegatingFloatColumn::new);
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * sugar moiety of the nucleic acid monomer.
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
    public FloatColumn getRSCCSugar() {
        return delegate.getColumn("RSCC_sugar", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the nucleic acid monomer.
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
     * (1990), evaluated over all atoms in the base moiety of the
     * nucleic acid monomer.
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
    public FloatColumn getRSRBase() {
        return delegate.getColumn("RSR_base", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the phosphate moiety of the
     * nucleic acid monomer.
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
    public FloatColumn getRSRPhos() {
        return delegate.getColumn("RSR_phos", DelegatingFloatColumn::new);
    }

    /**
     * The real-space residual RSR, as described by Branden &amp; Jones
     * (1990), evaluated over all atoms in the sugar moiety of the
     * nucleic acid monomer.
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
    public FloatColumn getRSRSugar() {
        return delegate.getColumn("RSR_sugar", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle tau0
     * (C4'-O4'-C1'-C2').
     * @return FloatColumn
     */
    public FloatColumn getTau0() {
        return delegate.getColumn("tau0", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle tau1
     * (O4'-C1'-C2'-C3').
     * @return FloatColumn
     */
    public FloatColumn getTau1() {
        return delegate.getColumn("tau1", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle tau2
     * (C1'-C2'-C3'-C4').
     * @return FloatColumn
     */
    public FloatColumn getTau2() {
        return delegate.getColumn("tau2", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle tau3
     * (C2'-C3'-C4'-O4').
     * @return FloatColumn
     */
    public FloatColumn getTau3() {
        return delegate.getColumn("tau3", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the sugar torsion angle tau4
     * (C3'-C4'-O4'-C1').
     * @return FloatColumn
     */
    public FloatColumn getTau4() {
        return delegate.getColumn("tau4", DelegatingFloatColumn::new);
    }

    /**
     * The maximum amplitude of puckering. This is derived from the
     * pseudorotation value P and the torsion angles in the ribose
     * ring.
     * 
     * Tau2= Taum cosP
     * Tau3= Taum cos(P+144)
     * Tau4= Taum cos(P+288)
     * Tau0= Taum cos(P+ 72)
     * Tau1= Taum cos(P+216)
     * @return FloatColumn
     */
    public FloatColumn getTaum() {
        return delegate.getColumn("taum", DelegatingFloatColumn::new);
    }

    /**
     * The value in degrees of the backbone torsion angle zeta
     * (C3'-O3'-P-O5').
     * @return FloatColumn
     */
    public FloatColumn getZeta() {
        return delegate.getColumn("zeta", DelegatingFloatColumn::new);
    }

}