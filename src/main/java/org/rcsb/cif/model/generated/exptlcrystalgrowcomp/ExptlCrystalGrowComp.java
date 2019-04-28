package org.rcsb.cif.model.generated.exptlcrystalgrowcomp;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Conc
     */
    public Conc getConc() {
        return (Conc) (isText ? textFields.computeIfAbsent("conc",
                Conc::new) : getBinaryColumn("conc"));
    }

    /**
     * A description of any special aspects of the solution component.
     * When the solution component is the one that contains the
     * macromolecule, this could be the specification of the buffer in
     * which the macromolecule was stored. When the solution component
     * is a buffer component, this could be the methods (or formula)
     * used to achieve a desired pH.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The value of _exptl_crystal_grow_comp.id must uniquely identify
     * each item in the EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A common name for the component of the solution.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return SolId
     */
    public SolId getSolId() {
        return (SolId) (isText ? textFields.computeIfAbsent("sol_id",
                SolId::new) : getBinaryColumn("sol_id"));
    }

    /**
     * The volume of the solution component.
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * The concentration of this component in the final
     * crystallization solution. This data item should
     * include units of concentration.
     * @return PdbxConcFinal
     */
    public PdbxConcFinal getPdbxConcFinal() {
        return (PdbxConcFinal) (isText ? textFields.computeIfAbsent("pdbx_conc_final",
                PdbxConcFinal::new) : getBinaryColumn("pdbx_conc_final"));
    }

    /**
     * The identification of the cystallization bath.
     * @return PdbxBath
     */
    public PdbxBath getPdbxBath() {
        return (PdbxBath) (isText ? textFields.computeIfAbsent("pdbx_bath",
                PdbxBath::new) : getBinaryColumn("pdbx_bath"));
    }

    /**
     * The identification of the crystallization salt.
     * @return PdbxSalt
     */
    public PdbxSalt getPdbxSalt() {
        return (PdbxSalt) (isText ? textFields.computeIfAbsent("pdbx_salt",
                PdbxSalt::new) : getBinaryColumn("pdbx_salt"));
    }

    /**
     * The identification of the crystallization soaking salt.
     * @return PdbxSoakSalt
     */
    public PdbxSoakSalt getPdbxSoakSalt() {
        return (PdbxSoakSalt) (isText ? textFields.computeIfAbsent("pdbx_soak_salt",
                PdbxSoakSalt::new) : getBinaryColumn("pdbx_soak_salt"));
    }

    /**
     * The identification of the crystallization soaking solvent
     * @return PdbxSoakSolv
     */
    public PdbxSoakSolv getPdbxSoakSolv() {
        return (PdbxSoakSolv) (isText ? textFields.computeIfAbsent("pdbx_soak_solv",
                PdbxSoakSolv::new) : getBinaryColumn("pdbx_soak_solv"));
    }

    /**
     * The identification of the crystallization solvent.
     * @return PdbxSolv
     */
    public PdbxSolv getPdbxSolv() {
        return (PdbxSolv) (isText ? textFields.computeIfAbsent("pdbx_solv",
                PdbxSolv::new) : getBinaryColumn("pdbx_solv"));
    }
}
