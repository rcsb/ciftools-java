package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * (by whatever means) to produce the crystal.
 * 
 * In general, solution 1 is the solution that contains the
 * molecule to be crystallized and solution 2 is the solution
 * that contains the precipitant. However, the number of solutions
 * required to describe the crystallization protocol is not limited
 * to 2.
 * 
 * Details of the crystallization protocol should be given in
 * _exptl_crystal_grow_comp.details using the solutions
 * described in EXPTL_CRYSTAL_GROW_COMP.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExptlCrystalGrowComp extends BaseCategory {
    public ExptlCrystalGrowComp(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ExptlCrystalGrowComp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ExptlCrystalGrowComp(String name) {
        super(name);
    }

    /**
     * The concentration of the solution component.
     * @return StrColumn
     */
    public StrColumn getConc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc", StrColumn::new) :
                getBinaryColumn("conc"));
    }

    /**
     * A description of any special aspects of the solution component.
     * When the solution component is the one that contains the
     * macromolecule, this could be the specification of the buffer in
     * which the macromolecule was stored. When the solution component
     * is a buffer component, this could be the methods (or formula)
     * used to achieve a desired pH.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The value of _exptl_crystal_grow_comp.id must uniquely identify
     * each item in the EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A common name for the component of the solution.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sol_id", StrColumn::new) :
                getBinaryColumn("sol_id"));
    }

    /**
     * The volume of the solution component.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("volume", StrColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * The concentration of this component in the final
     * crystallization solution. This data item should
     * include units of concentration.
     * @return StrColumn
     */
    public StrColumn getPdbxConcFinal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_conc_final", StrColumn::new) :
                getBinaryColumn("pdbx_conc_final"));
    }

    /**
     * The identification of the cystallization bath.
     * @return StrColumn
     */
    public StrColumn getPdbxBath() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_bath", StrColumn::new) :
                getBinaryColumn("pdbx_bath"));
    }

    /**
     * The identification of the crystallization salt.
     * @return StrColumn
     */
    public StrColumn getPdbxSalt() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_salt", StrColumn::new) :
                getBinaryColumn("pdbx_salt"));
    }

    /**
     * The identification of the crystallization soaking salt.
     * @return StrColumn
     */
    public StrColumn getPdbxSoakSalt() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_soak_salt", StrColumn::new) :
                getBinaryColumn("pdbx_soak_salt"));
    }

    /**
     * The identification of the crystallization soaking solvent
     * @return StrColumn
     */
    public StrColumn getPdbxSoakSolv() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_soak_solv", StrColumn::new) :
                getBinaryColumn("pdbx_soak_solv"));
    }

    /**
     * The identification of the crystallization solvent.
     * @return StrColumn
     */
    public StrColumn getPdbxSolv() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_solv", StrColumn::new) :
                getBinaryColumn("pdbx_solv"));
    }
}
