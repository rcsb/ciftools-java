package org.rcsb.cif.model.pdbxreferencelinkedentity;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceLinkedEntity extends BaseCategory {
    public PdbxReferenceLinkedEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceLinkedEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceLinkedEntity(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_linked_entity.id uniquely identifies
     * examples in the list of observed linking patterns.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Broadly classifies of this linked entity example.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * The name of the linked entity example.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The NCBI taxonomy identifier of the organism for the linked entity example.
     * @return TaxonomyId
     */
    public TaxonomyId getTaxonomyId() {
        return (TaxonomyId) (isText ? textFields.computeIfAbsent("taxonomy_id",
                TaxonomyId::new) : getBinaryColumn("taxonomy_id"));
    }

    /**
     * The NCBI taxonomy classification  of the organism for this linked entity example.
     * @return TaxonomyClass
     */
    public TaxonomyClass getTaxonomyClass() {
        return (TaxonomyClass) (isText ? textFields.computeIfAbsent("taxonomy_class",
                TaxonomyClass::new) : getBinaryColumn("taxonomy_class"));
    }

    /**
     * The polymer linking type of the first partner entity in example linkage.
     * @return LinkToEntityType
     */
    public LinkToEntityType getLinkToEntityType() {
        return (LinkToEntityType) (isText ? textFields.computeIfAbsent("link_to_entity_type",
                LinkToEntityType::new) : getBinaryColumn("link_to_entity_type"));
    }

    /**
     * The component identifer for the component in the first partner of the example linkage.
     * @return LinkToCompId
     */
    public LinkToCompId getLinkToCompId() {
        return (LinkToCompId) (isText ? textFields.computeIfAbsent("link_to_comp_id",
                LinkToCompId::new) : getBinaryColumn("link_to_comp_id"));
    }

    /**
     * The polymer linking type of the second partner entity in example linkage.
     * @return LinkFromEntityType
     */
    public LinkFromEntityType getLinkFromEntityType() {
        return (LinkFromEntityType) (isText ? textFields.computeIfAbsent("link_from_entity_type",
                LinkFromEntityType::new) : getBinaryColumn("link_from_entity_type"));
    }
}
