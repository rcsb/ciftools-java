package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
 * details of the source from which the entity was obtained.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntitySrcNat extends BaseCategory {
    public PdbxReferenceEntitySrcNat(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntitySrcNat(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntitySrcNat(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the  PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id", StrColumn::new) :
                getBinaryColumn("ref_entity_id"));
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ordinal distinguishes
     * source details for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The scientific name of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getOrganismScientific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism_scientific", StrColumn::new) :
                getBinaryColumn("organism_scientific"));
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
    }

    /**
     * The NCBI TaxId of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTaxid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("taxid", StrColumn::new) :
                getBinaryColumn("taxid"));
    }

    /**
     * The Americal Tissue Culture Collection code for organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getAtcc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atcc", StrColumn::new) :
                getBinaryColumn("atcc"));
    }

    /**
     * The database code for this source information
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_code", StrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The database name for this source information
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The data source for this information.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source", StrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * A identifier within the data source for this information.
     * @return StrColumn
     */
    public StrColumn getSourceId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_id", StrColumn::new) :
                getBinaryColumn("source_id"));
    }
}
