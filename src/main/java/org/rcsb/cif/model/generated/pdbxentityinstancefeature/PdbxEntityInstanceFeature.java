package org.rcsb.cif.model.generated.pdbxentityinstancefeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A feature type associated with entity instance.
     * @return FeatureType
     */
    public FeatureType getFeatureType() {
        return (FeatureType) (isText ? textFields.computeIfAbsent("feature_type",
                FeatureType::new) : getBinaryColumn("feature_type"));
    }

    /**
     * Author instance identifier (formerly PDB Chain ID)
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Instance identifier for this entity.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Author provided residue number.
     * @return AuthSeqNum
     */
    public AuthSeqNum getAuthSeqNum() {
        return (AuthSeqNum) (isText ? textFields.computeIfAbsent("auth_seq_num",
                AuthSeqNum::new) : getBinaryColumn("auth_seq_num"));
    }

    /**
     * 
     * Position in the sequence.
     * @return SeqNum
     */
    public SeqNum getSeqNum() {
        return (SeqNum) (isText ? textFields.computeIfAbsent("seq_num",
                SeqNum::new) : getBinaryColumn("seq_num"));
    }

    /**
     * 
     * Chemical component identifier
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * 
     * The author provided chemical component identifier
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
