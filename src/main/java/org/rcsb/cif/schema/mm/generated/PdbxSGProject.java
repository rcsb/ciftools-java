package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CONTACT_AUTHOR category record details
 * about the Structural Genomics Project and name and initials
 * for each Center.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value identifies the Structural Genomics project.
     * @return StrColumn
     */
    public StrColumn getProjectName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("project_name", StrColumn::new) :
                getBinaryColumn("project_name"));
    }

    /**
     * The value identifies the full name of center.
     * @return StrColumn
     */
    public StrColumn getFullNameOfCenter() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("full_name_of_center", StrColumn::new) :
                getBinaryColumn("full_name_of_center"));
    }

    /**
     * The value identifies the full name of center.
     * @return StrColumn
     */
    public StrColumn getInitialOfCenter() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("initial_of_center", StrColumn::new) :
                getBinaryColumn("initial_of_center"));
    }
}
