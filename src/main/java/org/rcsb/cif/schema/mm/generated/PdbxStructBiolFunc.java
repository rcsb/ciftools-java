package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
 * the function of a particular biological assembly.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructBiolFunc extends BaseCategory {
    public PdbxStructBiolFunc(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructBiolFunc(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructBiolFunc(String name) {
        super(name);
    }

    /**
     * A code which must uniquely identify each function assigned to
     * a biological assembly.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The function assigned to the biological assembly.
     * @return StrColumn
     */
    public StrColumn getFunction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("function", StrColumn::new) :
                getBinaryColumn("function"));
    }
}
