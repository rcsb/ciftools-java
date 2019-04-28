package org.rcsb.cif.model.generated.pdbxchemcompmodel;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * An identifier for chemical component definition.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }
}
