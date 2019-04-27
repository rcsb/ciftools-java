package org.rcsb.cif.model.refinebiso;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineBIso extends BaseCategory {
    public RefineBIso(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineBIso(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineBIso(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_B_iso.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A class of atoms treated similarly for isotropic B-factor
     * (displacement-parameter) refinement.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * A description of special aspects of the isotropic B-factor
     * (displacement-parameter) refinement for the class of atoms
     * described in _refine_B_iso.class.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The treatment of isotropic B-factor (displacement-parameter)
     * refinement for a class of atoms defined in _refine_B_iso.class.
     * @return Treatment
     */
    public Treatment getTreatment() {
        return (Treatment) (isText ? textFields.computeIfAbsent("treatment",
                Treatment::new) : getBinaryColumn("treatment"));
    }

    /**
     * The value of the isotropic B factor (displacement parameter)
     * assigned to a class of atoms defined in _refine_B_iso.class.
     * Meaningful only for atoms with fixed isotropic B factors.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * 
     * Residue name of those residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return PdbxResidueName
     */
    public PdbxResidueName getPdbxResidueName() {
        return (PdbxResidueName) (isText ? textFields.computeIfAbsent("pdbx_residue_name",
                PdbxResidueName::new) : getBinaryColumn("pdbx_residue_name"));
    }

    /**
     * 
     * Asym chain id of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return PdbxStrand
     */
    public PdbxStrand getPdbxStrand() {
        return (PdbxStrand) (isText ? textFields.computeIfAbsent("pdbx_strand",
                PdbxStrand::new) : getBinaryColumn("pdbx_strand"));
    }

    /**
     * 
     * Resiude number of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return PdbxResidueNum
     */
    public PdbxResidueNum getPdbxResidueNum() {
        return (PdbxResidueNum) (isText ? textFields.computeIfAbsent("pdbx_residue_num",
                PdbxResidueNum::new) : getBinaryColumn("pdbx_residue_num"));
    }
}
