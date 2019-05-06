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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A feature type associated with entity instance.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_type", StrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * Author instance identifier (formerly PDB Chain ID)
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Instance identifier for this entity.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Author provided residue number.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_num", StrColumn::new) :
                getBinaryColumn("auth_seq_num"));
    }

    /**
     * 
     * Position in the sequence.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_num", IntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * Chemical component identifier
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * 
     * The author provided chemical component identifier
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
