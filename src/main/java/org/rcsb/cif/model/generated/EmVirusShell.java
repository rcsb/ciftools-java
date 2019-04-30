package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_VIRUS_SHELL category record details
 * of the viral shell number, shell diameter, and icosahedral triangulation number.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getDiameter() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diameter", FloatColumn::new) :
                getBinaryColumn("diameter"));
    }

    /**
     * The value of _em_virus_shell.entity_assembly_id is
     * a pointer to _em_entity_assembly.id
     * category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * The value of _em_em_virus_shell.id is a unique identifier for
     * one virus shell.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The name for this virus shell.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The triangulation number (T number) is a geometric
     * concept that refers to the organisation of subunits within the icosahedron.
     * The triangulation number, T is given by the relationship
     * T= h*2 + hk +k*2,  where h and k are positive integers which define the
     * position of the five-fold vertex on the original hexagonal net.
     * @return IntColumn
     */
    public IntColumn getTriangulation() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("triangulation", IntColumn::new) :
                getBinaryColumn("triangulation"));
    }
}
