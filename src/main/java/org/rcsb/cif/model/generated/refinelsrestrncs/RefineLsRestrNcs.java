package org.rcsb.cif.model.generated.refinelsrestrncs;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return DomId
     */
    public DomId getDomId() {
        return (DomId) (isText ? textFields.computeIfAbsent("dom_id",
                DomId::new) : getBinaryColumn("dom_id"));
    }

    /**
     * Special aspects of the manner in which noncrystallographic
     * restraints were applied to atomic parameters in the domain
     * specified by _refine_ls_restr_ncs.dom_id and equivalent
     * atomic parameters in the domains against which it was restrained.
     * @return NcsModelDetails
     */
    public NcsModelDetails getNcsModelDetails() {
        return (NcsModelDetails) (isText ? textFields.computeIfAbsent("ncs_model_details",
                NcsModelDetails::new) : getBinaryColumn("ncs_model_details"));
    }

    /**
     * The root-mean-square deviation in equivalent isotropic
     * displacement parameters in the domain specified by
     * _refine_ls_restr_ncs.dom_id
     * and in the domains against which it was restrained.
     * @return RmsDevBIso
     */
    public RmsDevBIso getRmsDevBIso() {
        return (RmsDevBIso) (isText ? textFields.computeIfAbsent("rms_dev_B_iso",
                RmsDevBIso::new) : getBinaryColumn("rms_dev_B_iso"));
    }

    /**
     * The root-mean-square deviation in equivalent atom positions in
     * the domain specified by _refine_ls_restr_ncs.dom_id and in the
     * domains against which it was restrained.
     * @return RmsDevPosition
     */
    public RmsDevPosition getRmsDevPosition() {
        return (RmsDevPosition) (isText ? textFields.computeIfAbsent("rms_dev_position",
                RmsDevPosition::new) : getBinaryColumn("rms_dev_position"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of isotropic displacement
     * parameters in  the domain specified by
     * _refine_ls_restr_ncs.dom_id to equivalent isotropic
     * displacement parameters in the domains against
     * which it was restrained.
     * @return WeightBIso
     */
    public WeightBIso getWeightBIso() {
        return (WeightBIso) (isText ? textFields.computeIfAbsent("weight_B_iso",
                WeightBIso::new) : getBinaryColumn("weight_B_iso"));
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of atom positions in the
     * domain specified by _refine_ls_restr_ncs.dom_id to equivalent
     * atom positions in the domains against which it was restrained.
     * @return WeightPosition
     */
    public WeightPosition getWeightPosition() {
        return (WeightPosition) (isText ? textFields.computeIfAbsent("weight_position",
                WeightPosition::new) : getBinaryColumn("weight_position"));
    }

    /**
     * An ordinal index for the list of NCS restraints.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The type of NCS restraint. (for example: tight positional)
     * @return PdbxType
     */
    public PdbxType getPdbxType() {
        return (PdbxType) (isText ? textFields.computeIfAbsent("pdbx_type",
                PdbxType::new) : getBinaryColumn("pdbx_type"));
    }

    /**
     * A reference to  _struct_asym.id.
     * @return PdbxAsymId
     */
    public PdbxAsymId getPdbxAsymId() {
        return (PdbxAsymId) (isText ? textFields.computeIfAbsent("pdbx_asym_id",
                PdbxAsymId::new) : getBinaryColumn("pdbx_asym_id"));
    }

    /**
     * A reference to the PDB Chain ID
     * @return PdbxAuthAsymId
     */
    public PdbxAuthAsymId getPdbxAuthAsymId() {
        return (PdbxAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id",
                PdbxAuthAsymId::new) : getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Records the number restraints in the contributing to the RMS statistic.
     * @return PdbxNumber
     */
    public PdbxNumber getPdbxNumber() {
        return (PdbxNumber) (isText ? textFields.computeIfAbsent("pdbx_number",
                PdbxNumber::new) : getBinaryColumn("pdbx_number"));
    }

    /**
     * Records the standard deviation in the restraint between NCS related domains.
     * @return PdbxRms
     */
    public PdbxRms getPdbxRms() {
        return (PdbxRms) (isText ? textFields.computeIfAbsent("pdbx_rms",
                PdbxRms::new) : getBinaryColumn("pdbx_rms"));
    }

    /**
     * Records the weight used for NCS restraint.
     * @return PdbxWeight
     */
    public PdbxWeight getPdbxWeight() {
        return (PdbxWeight) (isText ? textFields.computeIfAbsent("pdbx_weight",
                PdbxWeight::new) : getBinaryColumn("pdbx_weight"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return PdbxEnsId
     */
    public PdbxEnsId getPdbxEnsId() {
        return (PdbxEnsId) (isText ? textFields.computeIfAbsent("pdbx_ens_id",
                PdbxEnsId::new) : getBinaryColumn("pdbx_ens_id"));
    }
}
