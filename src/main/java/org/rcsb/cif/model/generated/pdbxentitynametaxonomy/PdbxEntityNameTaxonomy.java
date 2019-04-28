package org.rcsb.cif.model.generated.pdbxentitynametaxonomy;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item holds an entity name or synonym.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * This data item classifies the entity name within
     * a taxonomic node.
     * @return NameType
     */
    public NameType getNameType() {
        return (NameType) (isText ? textFields.computeIfAbsent("name_type",
                NameType::new) : getBinaryColumn("name_type"));
    }
}
