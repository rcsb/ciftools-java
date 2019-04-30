package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_entity_instance_feature category records
 * special features of selected entity instances.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityInstanceFeature extends BaseCategory {
    public PdbxEntityInstanceFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityInstanceFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityInstanceFeature(String name) {
        super(name);
    }

    /**
     * Special structural details about this entity instance.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A feature type associated with entity instance.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFeatureType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("feature_type", SingleRowStrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * Author instance identifier (formerly PDB Chain ID)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Instance identifier for this entity.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Author provided residue number.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthSeqNum() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_seq_num", SingleRowStrColumn::new) :
                getBinaryColumn("auth_seq_num"));
    }

    /**
     * 
     * Position in the sequence.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSeqNum() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("seq_num", SingleRowIntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * Chemical component identifier
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * 
     * The author provided chemical component identifier
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOrdinal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ordinal", SingleRowIntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
