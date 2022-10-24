package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EMD_VIRUS_SHELL category record details
 * of the viral shell number, shell diameter, and icosahedral triangulation number.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVirusShell extends DelegatingCategory {
    public EmVirusShell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diameter":
                return getDiameter();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "id":
                return getId();
            case "name":
                return getName();
            case "triangulation":
                return getTriangulation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of the diameter (in angstroms) for this virus shell.
     * @return FloatColumn
     */
    public FloatColumn getDiameter() {
        return delegate.getColumn("diameter", DelegatingFloatColumn::new);
    }

    /**
     * The value of _em_virus_shell.entity_assembly_id is
     * a pointer to _em_entity_assembly.id
     * category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The name for this virus shell.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The triangulation number, T, describes the organization of subunits within an
     * icosahedron. T is defined as T= h^2 + h*k + k^2, where h and k are positive
     * integers that define the position of the five-fold vertex on the original
     * hexagonal net.
     * @return IntColumn
     */
    public IntColumn getTriangulation() {
        return delegate.getColumn("triangulation", DelegatingIntColumn::new);
    }

}