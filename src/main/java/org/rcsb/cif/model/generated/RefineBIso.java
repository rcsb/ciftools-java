package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_B_ISO category record details about
 * the treatment of isotropic B factors (displacement parameters)
 * during refinement.
 */
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
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A class of atoms treated similarly for isotropic B-factor
     * (displacement-parameter) refinement.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * A description of special aspects of the isotropic B-factor
     * (displacement-parameter) refinement for the class of atoms
     * described in _refine_B_iso.class.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The treatment of isotropic B-factor (displacement-parameter)
     * refinement for a class of atoms defined in _refine_B_iso.class.
     * @return StrColumn
     */
    public StrColumn getTreatment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("treatment", StrColumn::new) :
                getBinaryColumn("treatment"));
    }

    /**
     * The value of the isotropic B factor (displacement parameter)
     * assigned to a class of atoms defined in _refine_B_iso.class.
     * Meaningful only for atoms with fixed isotropic B factors.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value", FloatColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * 
     * Residue name of those residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxResidueName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_residue_name", StrColumn::new) :
                getBinaryColumn("pdbx_residue_name"));
    }

    /**
     * 
     * Asym chain id of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxStrand() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_strand", StrColumn::new) :
                getBinaryColumn("pdbx_strand"));
    }

    /**
     * 
     * Resiude number of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxResidueNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_residue_num", StrColumn::new) :
                getBinaryColumn("pdbx_residue_num"));
    }
}
