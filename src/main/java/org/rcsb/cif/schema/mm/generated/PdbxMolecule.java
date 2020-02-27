package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_MOLECULE category identify reference molecules
 * within a PDB entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxMolecule extends BaseCategory {
    public PdbxMolecule(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxMolecule(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxMolecule(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_molecule.prd_id is the PDB accession code for this
     * reference molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_molecule.instance_id is identifies a particular molecule
     * in the molecule list.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("instance_id", IntColumn::new) :
                getBinaryColumn("instance_id"));
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * A reference to _pdbx_linked_entity.linked_entity_id in the PDBX_LINKED_ENTITY  category.
     * @return StrColumn
     */
    public StrColumn getLinkedEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linked_entity_id", StrColumn::new) :
                getBinaryColumn("linked_entity_id"));
    }
}
