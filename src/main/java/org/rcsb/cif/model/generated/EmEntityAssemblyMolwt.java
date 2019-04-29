package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category record details about the molecular weight of
 * an assembly component of the sample.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmEntityAssemblyMolwt extends BaseCategory {
    public EmEntityAssemblyMolwt(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmEntityAssemblyMolwt(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmEntityAssemblyMolwt(String name) {
        super(name);
    }

    /**
     * A reference to  _em_entity_assembly.id which uniquely identifies
     * one assembly or assembly component of the imaged sample.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Identifies whether the given molecular weight was derived experimentally.
     * @return StrColumn
     */
    public StrColumn getExperimentalFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experimental_flag", StrColumn::new) :
                getBinaryColumn("experimental_flag"));
    }

    /**
     * Ordinal key for the em_entity_assembly_molwt category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Molecular weight units.
     * @return StrColumn
     */
    public StrColumn getUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("units", StrColumn::new) :
                getBinaryColumn("units"));
    }

    /**
     * The molecular weight of the assembly component.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value", FloatColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * The method used to determine the molecular weight.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }
}
