package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
 * entity families.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceMoleculeFamily extends BaseCategory {
    public PdbxReferenceMoleculeFamily(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeFamily(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeFamily(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity.family_prd_id must uniquely identify a record in the
     * PDBX_REFERENCE_MOLECULE_FAMILY list.
     * 
     * By convention this ID uniquely identifies the reference family in
     * in the PDB reference dictionary.
     * 
     * The ID has the template form FAM_dddddd (e.g. FAM_000001)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFamilyPrdId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", SingleRowStrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }

    /**
     * The entity family name.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Assigns the current PDB release status for this family.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReleaseStatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("release_status", SingleRowStrColumn::new) :
                getBinaryColumn("release_status"));
    }

    /**
     * Assigns the identifier for the family which have been replaced by this family.
     * Multiple family identifier codes should be separated by commas.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReplaces() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("replaces", SingleRowStrColumn::new) :
                getBinaryColumn("replaces"));
    }

    /**
     * Assigns the identifier of the family that has replaced this component.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReplacedBy() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("replaced_by", SingleRowStrColumn::new) :
                getBinaryColumn("replaced_by"));
    }
}
