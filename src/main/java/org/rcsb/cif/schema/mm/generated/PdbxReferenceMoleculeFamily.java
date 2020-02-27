package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
 * entity families.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }

    /**
     * The entity family name.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Assigns the current PDB release status for this family.
     * @return StrColumn
     */
    public StrColumn getReleaseStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("release_status", StrColumn::new) :
                getBinaryColumn("release_status"));
    }

    /**
     * Assigns the identifier for the family which have been replaced by this family.
     * Multiple family identifier codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaces", StrColumn::new) :
                getBinaryColumn("replaces"));
    }

    /**
     * Assigns the identifier of the family that has replaced this component.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaced_by", StrColumn::new) :
                getBinaryColumn("replaced_by"));
    }
}
