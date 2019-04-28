package org.rcsb.cif.model.generated.pdbxfamilygroupindex;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxFamilyGroupIndex extends BaseCategory {
    public PdbxFamilyGroupIndex(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxFamilyGroupIndex(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxFamilyGroupIndex(String name) {
        super(name);
    }

    /**
     * This data item is the identifier for the a group of related BIRD families.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a reference to the BIRD identifier for families.
     * 
     * This data item is a pointer to _pdbx_reference_molecule_family.family_prd_id in the
     * pdbx_reference_molecule category.
     * @return FamilyPrdId
     */
    public FamilyPrdId getFamilyPrdId() {
        return (FamilyPrdId) (isText ? textFields.computeIfAbsent("family_prd_id",
                FamilyPrdId::new) : getBinaryColumn("family_prd_id"));
    }
}
