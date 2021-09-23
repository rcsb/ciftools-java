package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
 * within a PDB entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxMoleculeFeatures extends DelegatingCategory {
    public PdbxMoleculeFeatures(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "class":
                return getClazz();
            case "type":
                return getType();
            case "name":
                return getName();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_molecule_features.prd_id is the accession code for this
     * reference molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * Broadly defines the function of the molecule.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * Defines the structural classification of the molecule.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A name of the molecule.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Additional details describing the molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}