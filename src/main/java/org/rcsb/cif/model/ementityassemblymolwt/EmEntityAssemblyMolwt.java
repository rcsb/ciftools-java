package org.rcsb.cif.model.ementityassemblymolwt;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Identifies whether the given molecular weight was derived experimentally.
     * @return ExperimentalFlag
     */
    public ExperimentalFlag getExperimentalFlag() {
        return (ExperimentalFlag) (isText ? textFields.computeIfAbsent("experimental_flag",
                ExperimentalFlag::new) : getBinaryColumn("experimental_flag"));
    }

    /**
     * Ordinal key for the em_entity_assembly_molwt category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Molecular weight units.
     * @return Units
     */
    public Units getUnits() {
        return (Units) (isText ? textFields.computeIfAbsent("units",
                Units::new) : getBinaryColumn("units"));
    }

    /**
     * The molecular weight of the assembly component.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * The method used to determine the molecular weight.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }
}
