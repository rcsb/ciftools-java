package org.rcsb.cif.model.generated.pdbxreferencemoleculefamily;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return FamilyPrdId
     */
    public FamilyPrdId getFamilyPrdId() {
        return (FamilyPrdId) (isText ? textFields.computeIfAbsent("family_prd_id",
                FamilyPrdId::new) : getBinaryColumn("family_prd_id"));
    }

    /**
     * The entity family name.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Assigns the current PDB release status for this family.
     * @return ReleaseStatus
     */
    public ReleaseStatus getReleaseStatus() {
        return (ReleaseStatus) (isText ? textFields.computeIfAbsent("release_status",
                ReleaseStatus::new) : getBinaryColumn("release_status"));
    }

    /**
     * Assigns the identifier for the family which have been replaced by this family.
     * Multiple family identifier codes should be separated by commas.
     * @return Replaces
     */
    public Replaces getReplaces() {
        return (Replaces) (isText ? textFields.computeIfAbsent("replaces",
                Replaces::new) : getBinaryColumn("replaces"));
    }

    /**
     * Assigns the identifier of the family that has replaced this component.
     * @return ReplacedBy
     */
    public ReplacedBy getReplacedBy() {
        return (ReplacedBy) (isText ? textFields.computeIfAbsent("replaced_by",
                ReplacedBy::new) : getBinaryColumn("replaced_by"));
    }
}
