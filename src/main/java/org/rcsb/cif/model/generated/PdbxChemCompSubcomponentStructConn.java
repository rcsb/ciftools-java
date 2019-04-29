package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_chem_comp_subcomponent_struct_conn
 * list the chemical interactions among the subcomponents in
 * the chemical component.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompSubcomponentStructConn extends BaseCategory {
    public PdbxChemCompSubcomponentStructConn(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompSubcomponentStructConn(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompSubcomponentStructConn(String name) {
        super(name);
    }

    /**
     * Ordinal index for the interactions listed in this category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The entity identifier for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getEntityId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_id_1", IntColumn::new) :
                getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity identifier for the second atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getEntityId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("entity_id_2", IntColumn::new) :
                getBinaryColumn("entity_id_2"));
    }

    /**
     * The atom identifier for the first atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier for the second atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The component identifier for the first atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second atom in the interaction.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_1", IntColumn::new) :
                getBinaryColumn("seq_id_1"));
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_2", IntColumn::new) :
                getBinaryColumn("seq_id_2"));
    }
}
