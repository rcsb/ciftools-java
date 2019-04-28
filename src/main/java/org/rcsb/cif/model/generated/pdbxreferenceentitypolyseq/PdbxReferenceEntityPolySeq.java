package org.rcsb.cif.model.generated.pdbxreferenceentitypolyseq;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntityPolySeq extends BaseCategory {
    public PdbxReferenceEntityPolySeq(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityPolySeq(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityPolySeq(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.prd_id is a reference
     * _pdbx_reference_entity_poly.prd_id in the  PDBX_REFERENCE_ENTITY_POLY category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.ref_entity_id is a reference
     * to _pdbx_reference_entity_poly.ref_entity_id in PDBX_REFERENCE_ENTITY_POLY category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? textFields.computeIfAbsent("ref_entity_id",
                RefEntityId::new) : getBinaryColumn("ref_entity_id"));
    }

    /**
     * This data item is the chemical component identifier of monomer.
     * @return MonId
     */
    public MonId getMonId() {
        return (MonId) (isText ? textFields.computeIfAbsent("mon_id",
                MonId::new) : getBinaryColumn("mon_id"));
    }

    /**
     * This data item is the chemical component identifier for the parent component corresponding to this monomer.
     * @return ParentMonId
     */
    public ParentMonId getParentMonId() {
        return (ParentMonId) (isText ? textFields.computeIfAbsent("parent_mon_id",
                ParentMonId::new) : getBinaryColumn("parent_mon_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.num must uniquely and sequentially
     * identify a record in the PDBX_REFERENCE_ENTITY_POLY_SEQ list.
     * 
     * This value is conforms to author numbering conventions and does not map directly
     * to the numbering conventions used for _entity_poly_seq.num.
     * @return Num
     */
    public Num getNum() {
        return (Num) (isText ? textFields.computeIfAbsent("num",
                Num::new) : getBinaryColumn("num"));
    }

    /**
     * A flag to indicate that this monomer is observed in the instance example.
     * @return Observed
     */
    public Observed getObserved() {
        return (Observed) (isText ? textFields.computeIfAbsent("observed",
                Observed::new) : getBinaryColumn("observed"));
    }

    /**
     * A flag to indicate that sequence heterogeneity at this monomer position.
     * @return Hetero
     */
    public Hetero getHetero() {
        return (Hetero) (isText ? textFields.computeIfAbsent("hetero",
                Hetero::new) : getBinaryColumn("hetero"));
    }
}
