package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
 * define the names and synonyms of the entity name taxonomy.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityNameTaxonomy extends BaseCategory {
    public PdbxEntityNameTaxonomy(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityNameTaxonomy(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityNameTaxonomy(String name) {
        super(name);
    }

    /**
     * This data item holds an node identifier in the
     * entity name taxonomy tree.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item holds an entity name or synonym.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * This data item classifies the entity name within
     * a taxonomic node.
     * @return StrColumn
     */
    public StrColumn getNameType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name_type", StrColumn::new) :
                getBinaryColumn("name_type"));
    }
}
