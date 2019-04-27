package org.rcsb.cif.model.pdbxstructassemblyauthclassification;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AssemblyId
     */
    public AssemblyId getAssemblyId() {
        return (AssemblyId) (isText ? textFields.computeIfAbsent("assembly_id",
                AssemblyId::new) : getBinaryColumn("assembly_id"));
    }

    /**
     * Provides the reason that a particular assembly is being studied
     * @return ReasonForInterest
     */
    public ReasonForInterest getReasonForInterest() {
        return (ReasonForInterest) (isText ? textFields.computeIfAbsent("reason_for_interest",
                ReasonForInterest::new) : getBinaryColumn("reason_for_interest"));
    }
}
