package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_LINKED_ENTITY category record
 * information about molecules composed of linked entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxLinkedEntity extends BaseCategory {
    public PdbxLinkedEntity(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxLinkedEntity(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxLinkedEntity(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_linked_entity.linked_entity_id is the unique identifier
     * for the molecule represented as a collection of linked entities.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", StrColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }

    /**
     * Defines the structural classification of this molecule.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Broadly defines the function of this molecule.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * A name of the molecule.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Description of this molecule.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * The identifier used by the PDB corresponding to the chemical definition
     * for the molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }
}
