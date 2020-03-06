package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
 * details of the source from which the entity was obtained.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntitySrcNat extends DelegatingCategory {
    public PdbxReferenceEntitySrcNat(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "ref_entity_id":
                return getRefEntityId();
            case "ordinal":
                return getOrdinal();
            case "organism_scientific":
                return getOrganismScientific();
            case "strain":
                return getStrain();
            case "taxid":
                return getTaxid();
            case "atcc":
                return getAtcc();
            case "db_code":
                return getDbCode();
            case "db_name":
                return getDbName();
            case "source":
                return getSource();
            case "source_id":
                return getSourceId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the  PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return delegate.getColumn("ref_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_src_nat.ordinal distinguishes
     * source details for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The scientific name of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getOrganismScientific() {
        return delegate.getColumn("organism_scientific", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
    }

    /**
     * The NCBI TaxId of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTaxid() {
        return delegate.getColumn("taxid", DelegatingStrColumn::new);
    }

    /**
     * The Americal Tissue Culture Collection code for organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getAtcc() {
        return delegate.getColumn("atcc", DelegatingStrColumn::new);
    }

    /**
     * The database code for this source information
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }

    /**
     * The database name for this source information
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The data source for this information.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * A identifier within the data source for this information.
     * @return StrColumn
     */
    public StrColumn getSourceId() {
        return delegate.getColumn("source_id", DelegatingStrColumn::new);
    }

}