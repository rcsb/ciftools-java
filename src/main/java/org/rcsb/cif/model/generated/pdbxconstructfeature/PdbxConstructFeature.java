package org.rcsb.cif.model.generated.pdbxconstructfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxConstructFeature extends BaseCategory {
    public PdbxConstructFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConstructFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConstructFeature(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_construct_feature.id must uniquely
     * identify a record in the PDBX_CONSTRUCT_FEATURE list.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of _pdbx_construct_feature.construct_id uniquely
     * identifies the construct with which the feature is
     * associated. This is a pointer to _pdbx_construct.id
     * This item may be a site dependent bar code.
     * @return ConstructId
     */
    public ConstructId getConstructId() {
        return (ConstructId) (isText ? textFields.computeIfAbsent("construct_id",
                ConstructId::new) : getBinaryColumn("construct_id"));
    }

    /**
     * The value of _pdbx_construct_feature.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The sequence position at which the feature begins
     * @return StartSeq
     */
    public StartSeq getStartSeq() {
        return (StartSeq) (isText ? textFields.computeIfAbsent("start_seq",
                StartSeq::new) : getBinaryColumn("start_seq"));
    }

    /**
     * The sequence position at which the feature ends
     * @return EndSeq
     */
    public EndSeq getEndSeq() {
        return (EndSeq) (isText ? textFields.computeIfAbsent("end_seq",
                EndSeq::new) : getBinaryColumn("end_seq"));
    }

    /**
     * The type of the feature
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Details that describe the feature
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
