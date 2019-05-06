package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * PDBX_CHEM_COMP_RELATED describes the relationship between two chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompRelated extends BaseCategory {
    public PdbxChemCompRelated(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompRelated(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompRelated(String name) {
        super(name);
    }

    /**
     * The chemical component for which this relationship applies.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The related chemical component for which this chemical component is based.
     * @return StrColumn
     */
    public StrColumn getRelatedCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_comp_id", StrColumn::new) :
                getBinaryColumn("related_comp_id"));
    }

    /**
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getRelationshipType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("relationship_type", StrColumn::new) :
                getBinaryColumn("relationship_type"));
    }

    /**
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
