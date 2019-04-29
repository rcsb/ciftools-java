package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_MON_NUCL category record details about
 * structural properties of a nucleic acid when analyzed at the
 * monomer level. Analogous data items for proteins are given in
 * the STRUCT_MON_PROT category. For items where the value of the
 * property depends on the method employed to calculate it,
 * details of the method of calculation are given using data items
 * in the STRUCT_MON_DETAILS category.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructMonNucl extends BaseCategory {
    public StructMonNucl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonNucl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonNucl(String name) {
        super(name);
    }

    /**
     * The value in degrees of the backbone torsion angle alpha
     * (O3'-P-O5'-C5').
     * @return FloatColumn
     */
    public FloatColumn getAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("alpha", FloatColumn::new) :
                getBinaryColumn("alpha"));
    }

    /**
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
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
     * The value in degrees of the backbone torsion angle beta
     * (P-O5'-C5'-C4').
     * @return FloatColumn
     */
    public FloatColumn getBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("beta", FloatColumn::new) :
                getBinaryColumn("beta"));
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi1
     * (O4'-C1'-N1-C2).
     * @return FloatColumn
     */
    public FloatColumn getChi1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi1", FloatColumn::new) :
                getBinaryColumn("chi1"));
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi2
     * (O4'-C1'-N9-C4).
     * @return FloatColumn
     */
    public FloatColumn getChi2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi2", FloatColumn::new) :
                getBinaryColumn("chi2"));
    }

    /**
     * The value in degrees of the backbone torsion angle delta
     * (C5'-C4'-C3'-O3').
     * @return FloatColumn
     */
    public FloatColumn getDelta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta", FloatColumn::new) :
                getBinaryColumn("delta"));
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect
     * that requires annotation.
     * @return FloatColumn
     */
    public FloatColumn getDetails() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("details", FloatColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value in degrees of the backbone torsion angle epsilon
     * (C4'-C3'-O3'-P).
     * @return FloatColumn
     */
    public FloatColumn getEpsilon() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("epsilon", FloatColumn::new) :
                getBinaryColumn("epsilon"));
    }

    /**
     * The value in degrees of the backbone torsion angle gamma
     * (O5'-C5'-C4'-C3').
     * @return FloatColumn
     */
    public FloatColumn getGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("gamma", FloatColumn::new) :
                getBinaryColumn("gamma"));
    }

    /**
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
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
     * The mean value of the isotropic displacement parameter
     * for all atoms in the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_all", FloatColumn::new) :
                getBinaryColumn("mean_B_all"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the base moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBBase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_base", FloatColumn::new) :
                getBinaryColumn("mean_B_base"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the phosphate moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBPhos() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_phos", FloatColumn::new) :
                getBinaryColumn("mean_B_phos"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the sugar moiety of the nucleic acid monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBSugar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_sugar", FloatColumn::new) :
                getBinaryColumn("mean_B_sugar"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu0
     * (C4'-O4'-C1'-C2').
     * @return FloatColumn
     */
    public FloatColumn getNu0() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nu0", FloatColumn::new) :
                getBinaryColumn("nu0"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu1
     * (O4'-C1'-C2'-C3').
     * @return FloatColumn
     */
    public FloatColumn getNu1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nu1", FloatColumn::new) :
                getBinaryColumn("nu1"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu2
     * (C1'-C2'-C3'-C4').
     * @return FloatColumn
     */
    public FloatColumn getNu2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nu2", FloatColumn::new) :
                getBinaryColumn("nu2"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu3
     * (C2'-C3'-C4'-O4').
     * @return FloatColumn
     */
    public FloatColumn getNu3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nu3", FloatColumn::new) :
                getBinaryColumn("nu3"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu4
     * (C3'-C4'-O4'-C1').
     * @return FloatColumn
     */
    public FloatColumn getNu4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("nu4", FloatColumn::new) :
                getBinaryColumn("nu4"));
    }

    /**
     * P is the phase angle of pseudorotation for five-membered rings.
     * For ribose and deoxyribose sugars in nucleic
     * acids
     * (tau4 +tau1)-(tau3+tau0)
     * P = ATAN (-------------------------)
     * 2tau2 (sin 36+sin 72)
     * 
     * If tau2 is <0, then P=P+180 degree (Altona & Sundaralingam,
     * 1972).
     * 
     * Ref: Altona, C. & Sundaralingam, M. (1972).
     * J. Am. Chem. Soc. 94, 8205-8212.
     * @return FloatColumn
     */
    public FloatColumn getP() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("P", FloatColumn::new) :
                getBinaryColumn("P"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_all", FloatColumn::new) :
                getBinaryColumn("RSCC_all"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * base moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCBase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_base", FloatColumn::new) :
                getBinaryColumn("RSCC_base"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * phosphate moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCPhos() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_phos", FloatColumn::new) :
                getBinaryColumn("RSCC_phos"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * sugar moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return FloatColumn
     */
    public FloatColumn getRSCCSugar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_sugar", FloatColumn::new) :
                getBinaryColumn("RSCC_sugar"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
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
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_all", FloatColumn::new) :
                getBinaryColumn("RSR_all"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
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
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRBase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_base", FloatColumn::new) :
                getBinaryColumn("RSR_base"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
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
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRPhos() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_phos", FloatColumn::new) :
                getBinaryColumn("RSR_phos"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
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
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return FloatColumn
     */
    public FloatColumn getRSRSugar() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_sugar", FloatColumn::new) :
                getBinaryColumn("RSR_sugar"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau0
     * (C4'-O4'-C1'-C2').
     * @return FloatColumn
     */
    public FloatColumn getTau0() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tau0", FloatColumn::new) :
                getBinaryColumn("tau0"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau1
     * (O4'-C1'-C2'-C3').
     * @return FloatColumn
     */
    public FloatColumn getTau1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tau1", FloatColumn::new) :
                getBinaryColumn("tau1"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau2
     * (C1'-C2'-C3'-C4').
     * @return FloatColumn
     */
    public FloatColumn getTau2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tau2", FloatColumn::new) :
                getBinaryColumn("tau2"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau3
     * (C2'-C3'-C4'-O4').
     * @return FloatColumn
     */
    public FloatColumn getTau3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tau3", FloatColumn::new) :
                getBinaryColumn("tau3"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau4
     * (C3'-C4'-O4'-C1').
     * @return FloatColumn
     */
    public FloatColumn getTau4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tau4", FloatColumn::new) :
                getBinaryColumn("tau4"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("taum", FloatColumn::new) :
                getBinaryColumn("taum"));
    }

    /**
     * The value in degrees of the backbone torsion angle zeta
     * (C3'-O3'-P-O5').
     * @return FloatColumn
     */
    public FloatColumn getZeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("zeta", FloatColumn::new) :
                getBinaryColumn("zeta"));
    }
}
