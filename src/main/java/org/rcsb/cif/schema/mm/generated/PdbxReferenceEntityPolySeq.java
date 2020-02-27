package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
 * of monomers in a polymer.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_poly_seq.ref_entity_id is a reference
     * to _pdbx_reference_entity_poly.ref_entity_id in PDBX_REFERENCE_ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id", StrColumn::new) :
                getBinaryColumn("ref_entity_id"));
    }

    /**
     * This data item is the chemical component identifier of monomer.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_id", StrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * This data item is the chemical component identifier for the parent component corresponding to this monomer.
     * @return StrColumn
     */
    public StrColumn getParentMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent_mon_id", StrColumn::new) :
                getBinaryColumn("parent_mon_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("num", IntColumn::new) :
                getBinaryColumn("num"));
    }

    /**
     * A flag to indicate that this monomer is observed in the instance example.
     * @return StrColumn
     */
    public StrColumn getObserved() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("observed", StrColumn::new) :
                getBinaryColumn("observed"));
    }

    /**
     * A flag to indicate that sequence heterogeneity at this monomer position.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetero", StrColumn::new) :
                getBinaryColumn("hetero"));
    }
}
