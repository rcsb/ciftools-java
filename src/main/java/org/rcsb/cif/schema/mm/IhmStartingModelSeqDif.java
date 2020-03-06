package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STARTING_MODEL_SEQ_DIF category provide a
 * mechanism for indicating and annotating point differences
 * between the sequence of the entity or biological unit described
 * in the data block and the sequence of the starting model used in
 * the integrative modeling referenced from a database. The point
 * differences may be due to point mutations introduced in the
 * starting model or the presence of modified amino acid residues.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStartingModelSeqDif extends DelegatingCategory {
    public IhmStartingModelSeqDif(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "seq_id":
                return getSeqId();
            case "comp_id":
                return getCompId();
            case "starting_model_id":
                return getStartingModelId();
            case "db_entity_id":
                return getDbEntityId();
            case "db_asym_id":
                return getDbAsymId();
            case "db_seq_id":
                return getDbSeqId();
            case "db_comp_id":
                return getDbCompId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for the distinct molecular entities.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the entity molecule.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The residue index.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The component identifier for the residue.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * Unique identifier for the starting model record.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id in the
     * IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
    }

    /**
     * The molecular entity of the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbEntityId() {
        return delegate.getColumn("db_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The asym/strand identifier for the entity molecule of the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbAsymId() {
        return delegate.getColumn("db_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The corresponding residue index of the database starting model.
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return delegate.getColumn("db_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The correspinding component identifier for the residue in the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbCompId() {
        return delegate.getColumn("db_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the starting model referenced
     * from a database.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}