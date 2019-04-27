package org.rcsb.cif.model.pdbxreferenceentitypoly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntityPoly extends BaseCategory {
    public PdbxReferenceEntityPoly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityPoly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityPoly(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_poly.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the  PDBX_REFERENCE_ENTITY_LIST category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? textFields.computeIfAbsent("ref_entity_id",
                RefEntityId::new) : getBinaryColumn("ref_entity_id"));
    }

    /**
     * The type of the polymer.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The database code for this source information
     * @return DbCode
     */
    public DbCode getDbCode() {
        return (DbCode) (isText ? textFields.computeIfAbsent("db_code",
                DbCode::new) : getBinaryColumn("db_code"));
    }

    /**
     * The database name for this source information
     * @return DbName
     */
    public DbName getDbName() {
        return (DbName) (isText ? textFields.computeIfAbsent("db_name",
                DbName::new) : getBinaryColumn("db_name"));
    }
}
