package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * PDBX_CHEM_COMP_SYNONYMS holds chemical name and synonym correspondences.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompSynonyms extends BaseCategory {
    public PdbxChemCompSynonyms(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompSynonyms(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompSynonyms(String name) {
        super(name);
    }

    /**
     * The synonym of this particular chemical component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The chemical component for which this synonym applies.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The provenance of this synonym.
     * @return StrColumn
     */
    public StrColumn getProvenance() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("provenance", StrColumn::new) :
                getBinaryColumn("provenance"));
    }
}
