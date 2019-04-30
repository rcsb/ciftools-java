package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_MOLECULE_FEATURES_DEPOSITOR_INFO  category capture
 * depositor provided information related to the archival cateogory
 * PDBX_MOLECULE_FEATURES.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * Broadly defines the function of the molecule.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * Defines the structural classification of the molecule.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
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
     * Additional details describing the molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
