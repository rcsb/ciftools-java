package org.rcsb.cif.model.pdbxchemcompsubcomponentstructconn;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The entity identifier for the first atom in the interaction.
     * @return EntityId1
     */
    public EntityId1 getEntityId1() {
        return (EntityId1) (isText ? textFields.computeIfAbsent("entity_id_1",
                EntityId1::new) : getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity identifier for the second atom in the interaction.
     * @return EntityId2
     */
    public EntityId2 getEntityId2() {
        return (EntityId2) (isText ? textFields.computeIfAbsent("entity_id_2",
                EntityId2::new) : getBinaryColumn("entity_id_2"));
    }

    /**
     * The atom identifier for the first atom in the interaction.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier for the second atom in the interaction.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The component identifier for the first atom in the interaction.
     * @return CompId1
     */
    public CompId1 getCompId1() {
        return (CompId1) (isText ? textFields.computeIfAbsent("comp_id_1",
                CompId1::new) : getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second atom in the interaction.
     * @return CompId2
     */
    public CompId2 getCompId2() {
        return (CompId2) (isText ? textFields.computeIfAbsent("comp_id_2",
                CompId2::new) : getBinaryColumn("comp_id_2"));
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return SeqId1
     */
    public SeqId1 getSeqId1() {
        return (SeqId1) (isText ? textFields.computeIfAbsent("seq_id_1",
                SeqId1::new) : getBinaryColumn("seq_id_1"));
    }

    /**
     * The positional index for the first atom in the interaction.
     * @return SeqId2
     */
    public SeqId2 getSeqId2() {
        return (SeqId2) (isText ? textFields.computeIfAbsent("seq_id_2",
                SeqId2::new) : getBinaryColumn("seq_id_2"));
    }
}
