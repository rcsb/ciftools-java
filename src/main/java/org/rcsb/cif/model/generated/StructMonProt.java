package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_MON_PROT category record details about
 * structural properties of a protein when analyzed at the monomer
 * level. Analogous data items for nucleic acids are given in the
 * STRUCT_MON_NUCL category. For items where the value of the
 * property depends on the method employed to calculate it,
 * details of the method of calculation are given using data items
 * in the STRUCT_MON_DETAILS category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructMonProt extends BaseCategory {
    public StructMonProt(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonProt(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonProt(String name) {
        super(name);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi1, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi1", FloatColumn::new) :
                getBinaryColumn("chi1"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi2, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi2", FloatColumn::new) :
                getBinaryColumn("chi2"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi3, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi3", FloatColumn::new) :
                getBinaryColumn("chi3"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi4, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi4() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi4", FloatColumn::new) :
                getBinaryColumn("chi4"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi5, for
     * those residues containing such an angle.
     * @return FloatColumn
     */
    public FloatColumn getChi5() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("chi5", FloatColumn::new) :
                getBinaryColumn("chi5"));
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect that
     * requires annotation.
     * @return FloatColumn
     */
    public FloatColumn getDetails() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("details", FloatColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_all", FloatColumn::new) :
                getBinaryColumn("RSCC_all"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_main", FloatColumn::new) :
                getBinaryColumn("RSCC_main"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_side", FloatColumn::new) :
                getBinaryColumn("RSCC_side"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_all", FloatColumn::new) :
                getBinaryColumn("RSR_all"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_main", FloatColumn::new) :
                getBinaryColumn("RSR_main"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_side", FloatColumn::new) :
                getBinaryColumn("RSR_side"));
    }

    /**
     * The mean value of the isotropic displacement parameter for all
     * atoms in the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_all", FloatColumn::new) :
                getBinaryColumn("mean_B_all"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the main chain of the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBMain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_main", FloatColumn::new) :
                getBinaryColumn("mean_B_main"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the side chain of the monomer.
     * @return FloatColumn
     */
    public FloatColumn getMeanBSide() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_B_side", FloatColumn::new) :
                getBinaryColumn("mean_B_side"));
    }

    /**
     * The value in degrees of the main-chain torsion angle omega.
     * @return FloatColumn
     */
    public FloatColumn getOmega() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("omega", FloatColumn::new) :
                getBinaryColumn("omega"));
    }

    /**
     * The value in degrees of the main-chain torsion angle phi.
     * @return FloatColumn
     */
    public FloatColumn getPhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phi", FloatColumn::new) :
                getBinaryColumn("phi"));
    }

    /**
     * The value in degrees of the main-chain torsion angle psi.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("psi", FloatColumn::new) :
                getBinaryColumn("psi"));
    }
}
