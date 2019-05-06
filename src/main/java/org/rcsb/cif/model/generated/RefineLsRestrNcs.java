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
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dom_id", StrColumn::new) :
                getBinaryColumn("dom_id"));
    }

    /**
     * Special aspects of the manner in which noncrystallographic
     * restraints were applied to atomic parameters in the domain
     * specified by _refine_ls_restr_ncs.dom_id and equivalent
     * atomic parameters in the domains against which it was restrained.
     * @return StrColumn
     */
    public StrColumn getNcsModelDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ncs_model_details", StrColumn::new) :
                getBinaryColumn("ncs_model_details"));
    }

    /**
     * The root-mean-square deviation in equivalent isotropic
     * displacement parameters in the domain specified by
     * _refine_ls_restr_ncs.dom_id
     * and in the domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDevBIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_dev_B_iso", FloatColumn::new) :
                getBinaryColumn("rms_dev_B_iso"));
    }

    /**
     * The root-mean-square deviation in equivalent atom positions in
     * the domain specified by _refine_ls_restr_ncs.dom_id and in the
     * domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDevPosition() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rms_dev_position", FloatColumn::new) :
                getBinaryColumn("rms_dev_position"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of isotropic displacement
     * parameters in  the domain specified by
     * _refine_ls_restr_ncs.dom_id to equivalent isotropic
     * displacement parameters in the domains against
     * which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeightBIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight_B_iso", FloatColumn::new) :
                getBinaryColumn("weight_B_iso"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of atom positions in the
     * domain specified by _refine_ls_restr_ncs.dom_id to equivalent
     * atom positions in the domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeightPosition() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight_position", FloatColumn::new) :
                getBinaryColumn("weight_position"));
    }

    /**
     * An ordinal index for the list of NCS restraints.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The type of NCS restraint. (for example: tight positional)
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_type", StrColumn::new) :
                getBinaryColumn("pdbx_type"));
    }

    /**
     * A reference to  _struct_asym.id.
     * @return StrColumn
     */
    public StrColumn getPdbxAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_asym_id"));
    }

    /**
     * A reference to the PDB Chain ID
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Records the number restraints in the contributing to the RMS statistic.
     * @return IntColumn
     */
    public IntColumn getPdbxNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number", IntColumn::new) :
                getBinaryColumn("pdbx_number"));
    }

    /**
     * Records the standard deviation in the restraint between NCS related domains.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRms() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_rms", FloatColumn::new) :
                getBinaryColumn("pdbx_rms"));
    }

    /**
     * Records the weight used for NCS restraint.
     * @return FloatColumn
     */
    public FloatColumn getPdbxWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_weight", FloatColumn::new) :
                getBinaryColumn("pdbx_weight"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ens_id", StrColumn::new) :
                getBinaryColumn("pdbx_ens_id"));
    }
}
