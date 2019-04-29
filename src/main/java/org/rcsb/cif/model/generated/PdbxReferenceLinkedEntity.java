package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_reference_linked_entity category describe
 * common observed interaction patterns within linked entities.
 */
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
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Broadly classifies of this linked entity example.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * The name of the linked entity example.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The NCBI taxonomy identifier of the organism for the linked entity example.
     * @return StrColumn
     */
    public StrColumn getTaxonomyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("taxonomy_id", StrColumn::new) :
                getBinaryColumn("taxonomy_id"));
    }

    /**
     * The NCBI taxonomy classification  of the organism for this linked entity example.
     * @return StrColumn
     */
    public StrColumn getTaxonomyClass() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("taxonomy_class", StrColumn::new) :
                getBinaryColumn("taxonomy_class"));
    }

    /**
     * The polymer linking type of the first partner entity in example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkToEntityType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_to_entity_type", StrColumn::new) :
                getBinaryColumn("link_to_entity_type"));
    }

    /**
     * The component identifer for the component in the first partner of the example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkToCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_to_comp_id", StrColumn::new) :
                getBinaryColumn("link_to_comp_id"));
    }

    /**
     * The polymer linking type of the second partner entity in example linkage.
     * @return StrColumn
     */
    public StrColumn getLinkFromEntityType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_from_entity_type", StrColumn::new) :
                getBinaryColumn("link_from_entity_type"));
    }
}
