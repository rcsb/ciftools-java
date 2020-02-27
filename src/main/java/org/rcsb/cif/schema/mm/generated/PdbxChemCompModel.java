package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
 * of the chemical component model instances.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompModel extends BaseCategory {
    public PdbxChemCompModel(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModel(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModel(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_chem_comp_model.id must uniquely identify each
     * model instance the PDBX_CHEM_COMP_MODEL list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier for chemical component definition.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }
}
