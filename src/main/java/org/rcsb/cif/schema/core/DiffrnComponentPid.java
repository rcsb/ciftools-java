package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items providing persistent identifiers for
 * instrumentation associated with data collection. These identifiers
 * will generally be registered with independent organisations.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnComponentPid extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_component_pid";

    public DiffrnComponentPid(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The part of the instrumentation to which the PID refers. This
     * value is purely descriptive; the metadata obtained via the PID
     * should be used for rigorous classification and identification.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_component_pid_details"));
    }

    /**
     * The framework to which the metadata for the PID conform. A framework
     * includes both the PID type and a metadata schema.
     * @return StrColumn
     */
    public StrColumn getFramework() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_component_pid_framework"));
    }

    /**
     * A persistent identifier (PID) for a component of the instrumentation
     * used during the experiment, which may include the entire instrument.
     * The PID should be registered with an external body and be resolvable
     * to a resource providing further metadata about the object.
     * @return StrColumn
     */
    public StrColumn getPid() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_component_pid_pid"));
    }

}