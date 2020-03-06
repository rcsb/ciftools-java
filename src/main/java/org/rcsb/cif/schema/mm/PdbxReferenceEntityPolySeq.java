package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
 * of monomers in a polymer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntityPolySeq extends DelegatingCategory {
    public PdbxReferenceEntityPolySeq(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "ref_entity_id":
                return getRefEntityId();
            case "mon_id":
                return getMonId();
            case "parent_mon_id":
                return getParentMonId();
            case "num":
                return getNum();
            case "observed":
                return getObserved();
            case "hetero":
                return getHetero();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.prd_id is a reference
     * _pdbx_reference_entity_poly.prd_id in the  PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.ref_entity_id is a reference
     * to _pdbx_reference_entity_poly.ref_entity_id in PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return delegate.getColumn("ref_entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the chemical component identifier of monomer.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is the chemical component identifier for the parent component corresponding to this monomer.
     * @return StrColumn
     */
    public StrColumn getParentMonId() {
        return delegate.getColumn("parent_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.num must uniquely and sequentially
     * identify a record in the PDBX_REFERENCE_ENTITY_POLY_SEQ list.
     * 
     * This value is conforms to author numbering conventions and does not map directly
     * to the numbering conventions used for _entity_poly_seq.num.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return delegate.getColumn("num", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate that this monomer is observed in the instance example.
     * @return StrColumn
     */
    public StrColumn getObserved() {
        return delegate.getColumn("observed", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that sequence heterogeneity at this monomer position.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return delegate.getColumn("hetero", DelegatingStrColumn::new);
    }

}