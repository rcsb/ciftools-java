package org.rcsb.cif.model.generated.pdbxmoleculefeaturesdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxMoleculeFeaturesDepositorInfo extends BaseCategory {
    public PdbxMoleculeFeaturesDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxMoleculeFeaturesDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxMoleculeFeaturesDepositorInfo(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_molecule_features_depositor_info.entity_id is a reference to
     * to the entity identifier for this molecule.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * Broadly defines the function of the molecule.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * Defines the structural classification of the molecule.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A name of the molecule.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Additional details describing the molecule.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
