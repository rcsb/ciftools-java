package org.rcsb.cif.model.pdbxsgproject;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value identifies the Structural Genomics project.
     * @return ProjectName
     */
    public ProjectName getProjectName() {
        return (ProjectName) (isText ? textFields.computeIfAbsent("project_name",
                ProjectName::new) : getBinaryColumn("project_name"));
    }

    /**
     * The value identifies the full name of center.
     * @return FullNameOfCenter
     */
    public FullNameOfCenter getFullNameOfCenter() {
        return (FullNameOfCenter) (isText ? textFields.computeIfAbsent("full_name_of_center",
                FullNameOfCenter::new) : getBinaryColumn("full_name_of_center"));
    }

    /**
     * The value identifies the full name of center.
     * @return InitialOfCenter
     */
    public InitialOfCenter getInitialOfCenter() {
        return (InitialOfCenter) (isText ? textFields.computeIfAbsent("initial_of_center",
                InitialOfCenter::new) : getBinaryColumn("initial_of_center"));
    }
}
