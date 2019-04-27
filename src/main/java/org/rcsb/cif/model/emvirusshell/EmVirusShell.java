package org.rcsb.cif.model.emvirusshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmVirusShell extends BaseCategory {
    public EmVirusShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmVirusShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmVirusShell(String name) {
        super(name);
    }

    /**
     * The value of the diameter (in angstroms) for this virus shell.
     * @return Diameter
     */
    public Diameter getDiameter() {
        return (Diameter) (isText ? textFields.computeIfAbsent("diameter",
                Diameter::new) : getBinaryColumn("diameter"));
    }

    /**
     * The value of _em_virus_shell.entity_assembly_id is
     * a pointer to _em_entity_assembly.id
     * category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * The value of _em_em_virus_shell.id is a unique identifier for
     * one virus shell.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The name for this virus shell.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The triangulation number (T number) is a geometric
     * concept that refers to the organisation of subunits within the icosahedron.
     * The triangulation number, T is given by the relationship
     * T= h*2 + hk +k*2,  where h and k are positive integers which define the
     * position of the five-fold vertex on the original hexagonal net.
     * @return Triangulation
     */
    public Triangulation getTriangulation() {
        return (Triangulation) (isText ? textFields.computeIfAbsent("triangulation",
                Triangulation::new) : getBinaryColumn("triangulation"));
    }
}
