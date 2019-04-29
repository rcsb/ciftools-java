package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Local data items describing ligand and monomer
 * chemical features.
 */
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
     * @return StrColumn
     */
    public StrColumn getResName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("res_name", StrColumn::new) :
                getBinaryColumn("res_name"));
    }

    /**
     * Place-holder for PDB record HET
     * @return StrColumn
     */
    public StrColumn getHetgroupName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetgroup_name", StrColumn::new) :
                getBinaryColumn("hetgroup_name"));
    }

    /**
     * Place-holder for PDB record FORMUL
     * @return StrColumn
     */
    public StrColumn getFormul() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("formul", StrColumn::new) :
                getBinaryColumn("formul"));
    }

    /**
     * Place-holder for PDB record HETNAM
     * @return StrColumn
     */
    public StrColumn getHetgroupChemicalName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetgroup_chemical_name", StrColumn::new) :
                getBinaryColumn("hetgroup_chemical_name"));
    }

    /**
     * Parent residue
     * @return StrColumn
     */
    public StrColumn getParentResidue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent_residue", StrColumn::new) :
                getBinaryColumn("parent_residue"));
    }

    /**
     * Formal charge if nonzero
     * @return IntColumn
     */
    public IntColumn getFormalCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("formal_charge", IntColumn::new) :
                getBinaryColumn("formal_charge"));
    }

    /**
     * Internal classification type 1.
     * @return StrColumn
     */
    public StrColumn getClass1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class_1", StrColumn::new) :
                getBinaryColumn("class_1"));
    }

    /**
     * Internal classification type 2.
     * @return StrColumn
     */
    public StrColumn getClass2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class_2", StrColumn::new) :
                getBinaryColumn("class_2"));
    }

    /**
     * Approximately corresponds to _chem_comp.type
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Release status associated with this component.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status", StrColumn::new) :
                getBinaryColumn("status"));
    }

    /**
     * Date added.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Date of last modification.
     * @return StrColumn
     */
    public StrColumn getModifiedDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("modified_date", StrColumn::new) :
                getBinaryColumn("modified_date"));
    }
}
