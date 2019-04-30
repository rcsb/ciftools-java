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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChi1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chi1", SingleRowFloatColumn::new) :
                getBinaryColumn("chi1"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi2, for
     * those residues containing such an angle.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChi2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chi2", SingleRowFloatColumn::new) :
                getBinaryColumn("chi2"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi3, for
     * those residues containing such an angle.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChi3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chi3", SingleRowFloatColumn::new) :
                getBinaryColumn("chi3"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi4, for
     * those residues containing such an angle.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChi4() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chi4", SingleRowFloatColumn::new) :
                getBinaryColumn("chi4"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi5, for
     * those residues containing such an angle.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getChi5() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("chi5", SingleRowFloatColumn::new) :
                getBinaryColumn("chi5"));
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect that
     * requires annotation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDetails() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("details", SingleRowFloatColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLabelAltId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", SingleRowStrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLabelAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLabelCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLabelSeqId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", SingleRowIntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthSeqId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", SingleRowStrColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSCCAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSCC_all", SingleRowFloatColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSCCMain() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSCC_main", SingleRowFloatColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSCCSide() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSCC_side", SingleRowFloatColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSRAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSR_all", SingleRowFloatColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSRMain() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSR_main", SingleRowFloatColumn::new) :
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRSRSide() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("RSR_side", SingleRowFloatColumn::new) :
                getBinaryColumn("RSR_side"));
    }

    /**
     * The mean value of the isotropic displacement parameter for all
     * atoms in the monomer.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeanBAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("mean_B_all", SingleRowFloatColumn::new) :
                getBinaryColumn("mean_B_all"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the main chain of the monomer.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeanBMain() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("mean_B_main", SingleRowFloatColumn::new) :
                getBinaryColumn("mean_B_main"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the side chain of the monomer.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeanBSide() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("mean_B_side", SingleRowFloatColumn::new) :
                getBinaryColumn("mean_B_side"));
    }

    /**
     * The value in degrees of the main-chain torsion angle omega.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOmega() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("omega", SingleRowFloatColumn::new) :
                getBinaryColumn("omega"));
    }

    /**
     * The value in degrees of the main-chain torsion angle phi.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPhi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("phi", SingleRowFloatColumn::new) :
                getBinaryColumn("phi"));
    }

    /**
     * The value in degrees of the main-chain torsion angle psi.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPsi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("psi", SingleRowFloatColumn::new) :
                getBinaryColumn("psi"));
    }
}
