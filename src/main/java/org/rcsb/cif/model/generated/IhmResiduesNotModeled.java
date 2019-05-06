package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_RESIDUES_NOT_MODELED category record the
 * details of the residues that are defined in the
 * IHM_STRUCT_ASSEMBLY category but are missing in the
 * three-dimensional model (ATOM_SITE, IHM_SPHERE_OBJ_SITE,
 * IHM_GAUSSIAN_OBJ_SITE categories) i.e., residues in the
 * assembly that are not modeled.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmResiduesNotModeled extends BaseCategory {
    public IhmResiduesNotModeled(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmResiduesNotModeled(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmResiduesNotModeled(String name) {
        super(name);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the structural model.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * A text description of the molecular entity, whose residues are not modeled.
     * This data item is a pointer to _entity.pdbx_description in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description", StrColumn::new) :
                getBinaryColumn("entity_description"));
    }

    /**
     * A unique identifier to the molecular entity, whose residues are not modeled.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An asym/strand identifier.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The starting residue index for the sequence segment of missing residues.
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The ending residue index for the sequence segment of missing residues.
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * The reason why the residues are missing in the structural model.
     * @return StrColumn
     */
    public StrColumn getReason() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reason", StrColumn::new) :
                getBinaryColumn("reason"));
    }

    /**
     * Additional details regarding the missing segments.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
