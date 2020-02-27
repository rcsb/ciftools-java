package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Provides reason a particular assembly in pdbx_struct_assembly is
 * of interest.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssemblyAuthClassification extends BaseCategory {
    public PdbxStructAssemblyAuthClassification(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyAuthClassification(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyAuthClassification(String name) {
        super(name);
    }

    /**
     * This item references an assembly in pdbx_struct_assembly
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_id", StrColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * Provides the reason that a particular assembly is being studied
     * @return StrColumn
     */
    public StrColumn getReasonForInterest() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reason_for_interest", StrColumn::new) :
                getBinaryColumn("reason_for_interest"));
    }
}
