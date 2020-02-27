package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Local data items describing ligand and monomer
 * chemical features.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConnect extends DelegatingCategory {
    public PdbxConnect(Category delegate) {
        super(delegate);
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return delegate.getColumn("res_name", DelegatingStrColumn::new);
    }

    /**
     * Place-holder for PDB record HET
     * @return StrColumn
     */
    public StrColumn getHetgroupName() {
        return delegate.getColumn("hetgroup_name", DelegatingStrColumn::new);
    }

    /**
     * Place-holder for PDB record FORMUL
     * @return StrColumn
     */
    public StrColumn getFormul() {
        return delegate.getColumn("formul", DelegatingStrColumn::new);
    }

    /**
     * Place-holder for PDB record HETNAM
     * @return StrColumn
     */
    public StrColumn getHetgroupChemicalName() {
        return delegate.getColumn("hetgroup_chemical_name", DelegatingStrColumn::new);
    }

    /**
     * Parent residue
     * @return StrColumn
     */
    public StrColumn getParentResidue() {
        return delegate.getColumn("parent_residue", DelegatingStrColumn::new);
    }

    /**
     * Formal charge if nonzero
     * @return IntColumn
     */
    public IntColumn getFormalCharge() {
        return delegate.getColumn("formal_charge", DelegatingIntColumn::new);
    }

    /**
     * Internal classification type 1.
     * @return StrColumn
     */
    public StrColumn getClass1() {
        return delegate.getColumn("class_1", DelegatingStrColumn::new);
    }

    /**
     * Internal classification type 2.
     * @return StrColumn
     */
    public StrColumn getClass2() {
        return delegate.getColumn("class_2", DelegatingStrColumn::new);
    }

    /**
     * Approximately corresponds to _chem_comp.type
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Release status associated with this component.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return delegate.getColumn("status", DelegatingStrColumn::new);
    }

    /**
     * Date added.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Date of last modification.
     * @return StrColumn
     */
    public StrColumn getModifiedDate() {
        return delegate.getColumn("modified_date", DelegatingStrColumn::new);
    }
}
