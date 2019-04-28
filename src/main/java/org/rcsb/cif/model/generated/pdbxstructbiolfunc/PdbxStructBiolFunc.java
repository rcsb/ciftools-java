package org.rcsb.cif.model.generated.pdbxstructbiolfunc;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return BiolId
     */
    public BiolId getBiolId() {
        return (BiolId) (isText ? textFields.computeIfAbsent("biol_id",
                BiolId::new) : getBinaryColumn("biol_id"));
    }

    /**
     * The function assigned to the biological assembly.
     * @return Function
     */
    public Function getFunction() {
        return (Function) (isText ? textFields.computeIfAbsent("function",
                Function::new) : getBinaryColumn("function"));
    }
}
