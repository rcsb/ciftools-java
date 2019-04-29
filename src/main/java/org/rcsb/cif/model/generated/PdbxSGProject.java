package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the Structural Genomics Project and name and initials
 * for each Center.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSGProject extends BaseCategory {
    public PdbxSGProject(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSGProject(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSGProject(String name) {
        super(name);
    }

    /**
     * A unique integer identifier for this center
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value identifies the Structural Genomics project.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProjectName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("project_name", SingleRowStrColumn::new) :
                getBinaryColumn("project_name"));
    }

    /**
     * The value identifies the full name of center.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFullNameOfCenter() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("full_name_of_center", SingleRowStrColumn::new) :
                getBinaryColumn("full_name_of_center"));
    }

    /**
     * The value identifies the full name of center.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getInitialOfCenter() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("initial_of_center", SingleRowStrColumn::new) :
                getBinaryColumn("initial_of_center"));
    }
}
