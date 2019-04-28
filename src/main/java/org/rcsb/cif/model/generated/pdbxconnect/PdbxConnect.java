package org.rcsb.cif.model.generated.pdbxconnect;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxConnect extends BaseCategory {
    public PdbxConnect(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConnect(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConnect(String name) {
        super(name);
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return ResName
     */
    public ResName getResName() {
        return (ResName) (isText ? textFields.computeIfAbsent("res_name",
                ResName::new) : getBinaryColumn("res_name"));
    }

    /**
     * Place-holder for PDB record HET
     * @return HetgroupName
     */
    public HetgroupName getHetgroupName() {
        return (HetgroupName) (isText ? textFields.computeIfAbsent("hetgroup_name",
                HetgroupName::new) : getBinaryColumn("hetgroup_name"));
    }

    /**
     * Place-holder for PDB record FORMUL
     * @return Formul
     */
    public Formul getFormul() {
        return (Formul) (isText ? textFields.computeIfAbsent("formul",
                Formul::new) : getBinaryColumn("formul"));
    }

    /**
     * Place-holder for PDB record HETNAM
     * @return HetgroupChemicalName
     */
    public HetgroupChemicalName getHetgroupChemicalName() {
        return (HetgroupChemicalName) (isText ? textFields.computeIfAbsent("hetgroup_chemical_name",
                HetgroupChemicalName::new) : getBinaryColumn("hetgroup_chemical_name"));
    }

    /**
     * Parent residue
     * @return ParentResidue
     */
    public ParentResidue getParentResidue() {
        return (ParentResidue) (isText ? textFields.computeIfAbsent("parent_residue",
                ParentResidue::new) : getBinaryColumn("parent_residue"));
    }

    /**
     * Formal charge if nonzero
     * @return FormalCharge
     */
    public FormalCharge getFormalCharge() {
        return (FormalCharge) (isText ? textFields.computeIfAbsent("formal_charge",
                FormalCharge::new) : getBinaryColumn("formal_charge"));
    }

    /**
     * Internal classification type 1.
     * @return Class1
     */
    public Class1 getClass1() {
        return (Class1) (isText ? textFields.computeIfAbsent("class_1",
                Class1::new) : getBinaryColumn("class_1"));
    }

    /**
     * Internal classification type 2.
     * @return Class2
     */
    public Class2 getClass2() {
        return (Class2) (isText ? textFields.computeIfAbsent("class_2",
                Class2::new) : getBinaryColumn("class_2"));
    }

    /**
     * Approximately corresponds to _chem_comp.type
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Release status associated with this component.
     * @return Status
     */
    public Status getStatus() {
        return (Status) (isText ? textFields.computeIfAbsent("status",
                Status::new) : getBinaryColumn("status"));
    }

    /**
     * Date added.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Date of last modification.
     * @return ModifiedDate
     */
    public ModifiedDate getModifiedDate() {
        return (ModifiedDate) (isText ? textFields.computeIfAbsent("modified_date",
                ModifiedDate::new) : getBinaryColumn("modified_date"));
    }
}
