package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_COEVOLUTION_MSA_DETAILS category record details about
 * the coevolution MSA used in the modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaCoevolutionMsaDetails extends DelegatingCategory {
    public MaCoevolutionMsaDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "msa_id":
                return getMsaId();
            case "target_entity_id":
                return getTargetEntityId();
            case "target_sequence":
                return getTargetSequence();
            case "seq_clust_db":
                return getSeqClustDb();
            case "seq_clust_db_other_details":
                return getSeqClustDbOtherDetails();
            case "seq_clust_db_version":
                return getSeqClustDbVersion();
            case "data_id":
                return getDataId();
            case "software_group_id":
                return getSoftwareGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the coevolution MSA.
     * @return IntColumn
     */
    public IntColumn getMsaId() {
        return delegate.getColumn("msa_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the target entity.
     * @return StrColumn
     */
    public StrColumn getTargetEntityId() {
        return delegate.getColumn("target_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The one letter code of the target sequence with gaps as in the alignment.
     * @return StrColumn
     */
    public StrColumn getTargetSequence() {
        return delegate.getColumn("target_sequence", DelegatingStrColumn::new);
    }

    /**
     * The sequence cluster database used to obtain the coevolution MSA.
     * @return StrColumn
     */
    public StrColumn getSeqClustDb() {
        return delegate.getColumn("seq_clust_db", DelegatingStrColumn::new);
    }

    /**
     * Other details for sequence cluster database used.
     * @return StrColumn
     */
    public StrColumn getSeqClustDbOtherDetails() {
        return delegate.getColumn("seq_clust_db_other_details", DelegatingStrColumn::new);
    }

    /**
     * Version of the sequence cluster database.
     * This might correspond to the release date of the database.
     * @return StrColumn
     */
    public StrColumn getSeqClustDbVersion() {
        return delegate.getColumn("seq_clust_db_version", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the set of software used to obtain the coevolution multiple sequence alignment.
     * This data item is a pointer to the _ma_software_group.group_id in the
     * MA_SOFTWARE_GROUP category.
     * @return IntColumn
     */
    public IntColumn getSoftwareGroupId() {
        return delegate.getColumn("software_group_id", DelegatingIntColumn::new);
    }

}