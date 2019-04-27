package org.rcsb.cif.model.pdbxstructassemblyauthevidencedepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * Provides the experimental method to determine the state of this assembly
     * @return ExperimentalSupport
     */
    public ExperimentalSupport getExperimentalSupport() {
        return (ExperimentalSupport) (isText ? textFields.computeIfAbsent("experimental_support",
                ExperimentalSupport::new) : getBinaryColumn("experimental_support"));
    }

    /**
     * Provides any additional information regarding the evidence of this assembly
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
