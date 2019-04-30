package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Provides author supplied evidentiary support for assemblies
 * in pdbx_struct_assembly.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssemblyAuthEvidenceDepositorInfo extends BaseCategory {
    public PdbxStructAssemblyAuthEvidenceDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyAuthEvidenceDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyAuthEvidenceDepositorInfo(String name) {
        super(name);
    }

    /**
     * Identifies a unique record in pdbx_struct_assembly_auth_evidence_depositor_info.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
     * Provides the experimental method to determine the state of this assembly
     * @return StrColumn
     */
    public StrColumn getExperimentalSupport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experimental_support", StrColumn::new) :
                getBinaryColumn("experimental_support"));
    }

    /**
     * Provides any additional information regarding the evidence of this assembly
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
