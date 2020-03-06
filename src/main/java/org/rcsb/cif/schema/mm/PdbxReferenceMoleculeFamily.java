package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
 * entity families.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeFamily extends DelegatingCategory {
    public PdbxReferenceMoleculeFamily(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "family_prd_id":
                return getFamilyPrdId();
            case "name":
                return getName();
            case "release_status":
                return getReleaseStatus();
            case "replaces":
                return getReplaces();
            case "replaced_by":
                return getReplacedBy();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity.family_prd_id must uniquely identify a record in the
     * PDBX_REFERENCE_MOLECULE_FAMILY list.
     * 
     * By convention this ID uniquely identifies the reference family in
     * in the PDB reference dictionary.
     * 
     * The ID has the template form FAM_dddddd (e.g. FAM_000001)
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * The entity family name.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Assigns the current PDB release status for this family.
     * @return StrColumn
     */
    public StrColumn getReleaseStatus() {
        return delegate.getColumn("release_status", DelegatingStrColumn::new);
    }

    /**
     * Assigns the identifier for the family which have been replaced by this family.
     * Multiple family identifier codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return delegate.getColumn("replaces", DelegatingStrColumn::new);
    }

    /**
     * Assigns the identifier of the family that has replaced this component.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return delegate.getColumn("replaced_by", DelegatingStrColumn::new);
    }

}