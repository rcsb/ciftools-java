package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CHEMICAL_COMPONENT_DESCRIPTOR category records the
 * details of the chemical descriptors of various non-polymeric
 * chemical components (fluorescent probes, crosslinking agents etc.)
 * used in the experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmChemicalComponentDescriptor extends DelegatingCategory {
    public IhmChemicalComponentDescriptor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "chemical_name":
                return getChemicalName();
            case "common_name":
                return getCommonName();
            case "auth_name":
                return getAuthName();
            case "smiles":
                return getSmiles();
            case "smiles_canonical":
                return getSmilesCanonical();
            case "inchi":
                return getInchi();
            case "inchi_key":
                return getInchiKey();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the chemical descriptor.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The chemical name of the component.
     * @return StrColumn
     */
    public StrColumn getChemicalName() {
        return delegate.getColumn("chemical_name", DelegatingStrColumn::new);
    }

    /**
     * The common name of the component.
     * @return StrColumn
     */
    public StrColumn getCommonName() {
        return delegate.getColumn("common_name", DelegatingStrColumn::new);
    }

    /**
     * The author-provided name of the component.
     * @return StrColumn
     */
    public StrColumn getAuthName() {
        return delegate.getColumn("auth_name", DelegatingStrColumn::new);
    }

    /**
     * The smile string of the component.
     * @return StrColumn
     */
    public StrColumn getSmiles() {
        return delegate.getColumn("smiles", DelegatingStrColumn::new);
    }

    /**
     * The canonical smile string of the component.
     * @return StrColumn
     */
    public StrColumn getSmilesCanonical() {
        return delegate.getColumn("smiles_canonical", DelegatingStrColumn::new);
    }

    /**
     * The IUPAC INCHI descriptor of the component.
     * @return StrColumn
     */
    public StrColumn getInchi() {
        return delegate.getColumn("inchi", DelegatingStrColumn::new);
    }

    /**
     * The hashed INCHI key of the component.
     * @return StrColumn
     */
    public StrColumn getInchiKey() {
        return delegate.getColumn("inchi_key", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the chemical component.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}