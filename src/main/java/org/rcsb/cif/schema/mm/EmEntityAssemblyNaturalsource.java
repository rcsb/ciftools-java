package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record taxonomic details about the natural source for EM
 * assemblies and assembly components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmEntityAssemblyNaturalsource extends DelegatingCategory {
    public EmEntityAssemblyNaturalsource(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "cell":
                return getCell();
            case "cellular_location":
                return getCellularLocation();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "id":
                return getId();
            case "ncbi_tax_id":
                return getNcbiTaxId();
            case "organism":
                return getOrganism();
            case "organelle":
                return getOrganelle();
            case "organ":
                return getOrgan();
            case "strain":
                return getStrain();
            case "tissue":
                return getTissue();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The cell type from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getCell() {
        return delegate.getColumn("cell", DelegatingStrColumn::new);
    }

    /**
     * The cellular location of the component.
     * @return StrColumn
     */
    public StrColumn getCellularLocation() {
        return delegate.getColumn("cellular_location", DelegatingStrColumn::new);
    }

    /**
     * Pointer to the assembly component defined in the EM ENTITY ASSEMBLY category.
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
     * The NCBI taxonomy id for the natural organism source of the component.
     * @return IntColumn
     */
    public IntColumn getNcbiTaxId() {
        return delegate.getColumn("ncbi_tax_id", DelegatingIntColumn::new);
    }

    /**
     * The scientific name of the source organism for the component
     * @return StrColumn
     */
    public StrColumn getOrganism() {
        return delegate.getColumn("organism", DelegatingStrColumn::new);
    }

    /**
     * The organelle from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getOrganelle() {
        return delegate.getColumn("organelle", DelegatingStrColumn::new);
    }

    /**
     * The organ of the organism from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getOrgan() {
        return delegate.getColumn("organ", DelegatingStrColumn::new);
    }

    /**
     * The strain of the natural organism from which the component was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
    }

    /**
     * The tissue of the natural organism from which the component was obtained.
     * @return StrColumn
     */
    public StrColumn getTissue() {
        return delegate.getColumn("tissue", DelegatingStrColumn::new);
    }

    /**
     * Additional details describing this natural source.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}