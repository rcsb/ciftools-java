package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_FAMILY_GROUP_INDEX category record
 * the family membership in family groups.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a reference to the BIRD identifier for families.
     * 
     * This data item is a pointer to _pdbx_reference_molecule_family.family_prd_id in the
     * pdbx_reference_molecule category.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }
}
