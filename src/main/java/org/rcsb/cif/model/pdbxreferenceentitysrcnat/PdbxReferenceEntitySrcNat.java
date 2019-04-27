package org.rcsb.cif.model.pdbxreferenceentitysrcnat;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? textFields.computeIfAbsent("ref_entity_id",
                RefEntityId::new) : getBinaryColumn("ref_entity_id"));
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ordinal distinguishes
     * source details for this entity.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The scientific name of the organism from which the entity was isolated.
     * @return OrganismScientific
     */
    public OrganismScientific getOrganismScientific() {
        return (OrganismScientific) (isText ? textFields.computeIfAbsent("organism_scientific",
                OrganismScientific::new) : getBinaryColumn("organism_scientific"));
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }

    /**
     * The NCBI TaxId of the organism from which the entity was isolated.
     * @return Taxid
     */
    public Taxid getTaxid() {
        return (Taxid) (isText ? textFields.computeIfAbsent("taxid",
                Taxid::new) : getBinaryColumn("taxid"));
    }

    /**
     * The Americal Tissue Culture Collection code for organism from which the entity was isolated.
     * @return Atcc
     */
    public Atcc getAtcc() {
        return (Atcc) (isText ? textFields.computeIfAbsent("atcc",
                Atcc::new) : getBinaryColumn("atcc"));
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

    /**
     * The data source for this information.
     * @return Source
     */
    public Source getSource() {
        return (Source) (isText ? textFields.computeIfAbsent("source",
                Source::new) : getBinaryColumn("source"));
    }

    /**
     * A identifier within the data source for this information.
     * @return SourceId
     */
    public SourceId getSourceId() {
        return (SourceId) (isText ? textFields.computeIfAbsent("source_id",
                SourceId::new) : getBinaryColumn("source_id"));
    }
}
