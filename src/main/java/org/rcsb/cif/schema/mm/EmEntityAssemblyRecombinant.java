package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record details
 * about recombinant expression of the assembly or assembly component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmEntityAssemblyRecombinant extends DelegatingCategory {
    public EmEntityAssemblyRecombinant(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "cell":
                return getCell();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "id":
                return getId();
            case "ncbi_tax_id":
                return getNcbiTaxId();
            case "organism":
                return getOrganism();
            case "plasmid":
                return getPlasmid();
            case "strain":
                return getStrain();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The cell of the host organism from which the expressed component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getCell() {
        return delegate.getColumn("cell", DelegatingStrColumn::new);
    }

    /**
     * Pointer to the expressed component described in the EM ENTITY ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The NCBI taxonomy id of the expression host used to produce the component.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return delegate.getColumn("ncbi_tax_id", DelegatingIntColumn::new);
    }

    /**
     * Expression system host organism used to produce the component.
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return delegate.getColumn("organism", DelegatingStrColumn::new);
    }

    /**
     * The plasmid used to produce the component in the expression system.
     * @return StrColumn
     */
    public StrColumn getPlasmid() {
        return delegate.getColumn("plasmid", DelegatingStrColumn::new);
    }

    /**
     * The strain of the host organism from which the expresed component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
    }

}