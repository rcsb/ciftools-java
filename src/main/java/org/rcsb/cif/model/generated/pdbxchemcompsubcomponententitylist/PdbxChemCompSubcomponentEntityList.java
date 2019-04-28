package org.rcsb.cif.model.generated.pdbxchemcompsubcomponententitylist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The parent component identifier corresponding to this entity.
     * @return ParentCompId
     */
    public ParentCompId getParentCompId() {
        return (ParentCompId) (isText ? textFields.computeIfAbsent("parent_comp_id",
                ParentCompId::new) : getBinaryColumn("parent_comp_id"));
    }

    /**
     * Defines the type of the entity.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Defines the predominant linking type of the entity.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }
}
