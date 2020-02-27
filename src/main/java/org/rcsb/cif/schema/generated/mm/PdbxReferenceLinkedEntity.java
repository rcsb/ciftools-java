package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_reference_linked_entity category describe
 * common observed interaction patterns within linked entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntity extends DelegatingCategory {
    public PdbxReferenceLinkedEntity(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_reference_linked_entity.id uniquely identifies
     * examples in the list of observed linking patterns.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Broadly classifies of this linked entity example.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * The name of the linked entity example.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The NCBI taxonomy identifier of the organism for the linked entity example.
     * @return StrColumn
     */
    public StrColumn getTaxonomyId() {
        return delegate.getColumn("taxonomy_id", DelegatingStrColumn::new);
    }

    /**
     * The NCBI taxonomy classification  of the organism for this linked entity example.
     * @return StrColumn
     */
    public StrColumn getTaxonomyClass() {
        return delegate.getColumn("taxonomy_class", DelegatingStrColumn::new);
    }

    /**
     * The polymer linking type of the first partner entity in example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkToEntityType() {
        return delegate.getColumn("link_to_entity_type", DelegatingStrColumn::new);
    }

    /**
     * The component identifer for the component in the first partner of the example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkToCompId() {
        return delegate.getColumn("link_to_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The polymer linking type of the second partner entity in example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkFromEntityType() {
        return delegate.getColumn("link_from_entity_type", DelegatingStrColumn::new);
    }
}
