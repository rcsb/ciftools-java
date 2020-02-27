package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_CROSS_LINK_LIST category records the
 * list of spatial restraints derived from chemical crosslinking
 * experiment.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmCrossLinkList extends BaseCategory {
    public IhmCrossLinkList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmCrossLinkList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmCrossLinkList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the cross link restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier for a set of ambiguous crosslink restraints.
     * Handles experimental uncertainties in the identities of
     * crosslinked residues.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * A text description of molecular entity 1.
     * @return StrColumn
     */
    public StrColumn getEntityDescription1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description_1", StrColumn::new) :
                getBinaryColumn("entity_description_1"));
    }

    /**
     * A text description of molecular entity 2.
     * @return StrColumn
     */
    public StrColumn getEntityDescription2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description_2", StrColumn::new) :
                getBinaryColumn("entity_description_2"));
    }

    /**
     * The entity identifier for the first monomer partner in the cross link
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_1", StrColumn::new) :
                getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity identifier for the second monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_2", StrColumn::new) :
                getBinaryColumn("entity_id_2"));
    }

    /**
     * The component identifier for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The sequence index for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_1", IntColumn::new) :
                getBinaryColumn("seq_id_1"));
    }

    /**
     * The sequence index for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_2", IntColumn::new) :
                getBinaryColumn("seq_id_2"));
    }

    /**
     * The type of crosslinker used.
     * @return StrColumn
     */
    public StrColumn getLinkerType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("linker_type", StrColumn::new) :
                getBinaryColumn("linker_type"));
    }

    /**
     * Identifier to the crosslinking dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }
}
