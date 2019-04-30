package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_LS_RESTR_NCS category record details
 * about the restraints applied to atom positions in domains
 * related by noncrystallographic symmetry during least-squares
 * refinement, and also about the deviation of the restrained
 * atomic parameters at the end of the refinement.  It is
 * expected that these values will only be reported once for each
 * set of restrained domains.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class RefineLsRestrNcs extends BaseCategory {
    public RefineLsRestrNcs(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineLsRestrNcs(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineLsRestrNcs(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_restr_ncs.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRefineId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDomId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dom_id", SingleRowStrColumn::new) :
                getBinaryColumn("dom_id"));
    }

    /**
     * Special aspects of the manner in which noncrystallographic
     * restraints were applied to atomic parameters in the domain
     * specified by _refine_ls_restr_ncs.dom_id and equivalent
     * atomic parameters in the domains against which it was restrained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNcsModelDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ncs_model_details", SingleRowStrColumn::new) :
                getBinaryColumn("ncs_model_details"));
    }

    /**
     * The root-mean-square deviation in equivalent isotropic
     * displacement parameters in the domain specified by
     * _refine_ls_restr_ncs.dom_id
     * and in the domains against which it was restrained.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRmsDevBIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rms_dev_B_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("rms_dev_B_iso"));
    }

    /**
     * The root-mean-square deviation in equivalent atom positions in
     * the domain specified by _refine_ls_restr_ncs.dom_id and in the
     * domains against which it was restrained.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRmsDevPosition() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rms_dev_position", SingleRowFloatColumn::new) :
                getBinaryColumn("rms_dev_position"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of isotropic displacement
     * parameters in  the domain specified by
     * _refine_ls_restr_ncs.dom_id to equivalent isotropic
     * displacement parameters in the domains against
     * which it was restrained.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getWeightBIso() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("weight_B_iso", SingleRowFloatColumn::new) :
                getBinaryColumn("weight_B_iso"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of atom positions in the
     * domain specified by _refine_ls_restr_ncs.dom_id to equivalent
     * atom positions in the domains against which it was restrained.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getWeightPosition() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("weight_position", SingleRowFloatColumn::new) :
                getBinaryColumn("weight_position"));
    }

    /**
     * An ordinal index for the list of NCS restraints.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxOrdinal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The type of NCS restraint. (for example: tight positional)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_type", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_type"));
    }

    /**
     * A reference to  _struct_asym.id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_asym_id"));
    }

    /**
     * A reference to the PDB Chain ID
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAuthAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Records the number restraints in the contributing to the RMS statistic.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumber() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number"));
    }

    /**
     * Records the standard deviation in the restraint between NCS related domains.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRms() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_rms", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_rms"));
    }

    /**
     * Records the weight used for NCS restraint.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxWeight() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_weight", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_weight"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxEnsId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_ens_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_ens_id"));
    }
}
