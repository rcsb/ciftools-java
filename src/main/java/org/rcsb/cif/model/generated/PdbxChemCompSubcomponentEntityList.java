package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_chem_comp_subcomponent_entity_list category
 * list the constituent chemical entities and entity features in this chemical component.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompSubcomponentEntityList extends BaseCategory {
    public PdbxChemCompSubcomponentEntityList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompSubcomponentEntityList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompSubcomponentEntityList(String name) {
        super(name);
    }

    /**
     * Ordinal index for the entities listed in this category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The parent component identifier corresponding to this entity.
     * @return StrColumn
     */
    public StrColumn getParentCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent_comp_id", StrColumn::new) :
                getBinaryColumn("parent_comp_id"));
    }

    /**
     * Defines the type of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Defines the predominant linking type of the entity.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }
}
