package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompFeature extends BaseCategory {
    public PdbxChemCompFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompFeature(String name) {
        super(name);
    }

    /**
     * The component identifier for this feature.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The component feature type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The supporting evidence for this feature.
     * @return StrColumn
     */
    public StrColumn getSupport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("support", StrColumn::new) :
                getBinaryColumn("support"));
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value", StrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * The information source for the component feature.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source", StrColumn::new) :
                getBinaryColumn("source"));
    }
}
