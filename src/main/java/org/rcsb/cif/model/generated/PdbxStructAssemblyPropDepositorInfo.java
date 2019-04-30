package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY_PROP.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssemblyPropDepositorInfo extends BaseCategory {
    public PdbxStructAssemblyPropDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyPropDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyPropDepositorInfo(String name) {
        super(name);
    }

    /**
     * The identifier for the assembly used in category STRUCT_BIOL.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBiolId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("biol_id", SingleRowStrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The property type for the assembly.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The value of the assembly property.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getValue() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("value", SingleRowStrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * Additional details about this assembly property.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
