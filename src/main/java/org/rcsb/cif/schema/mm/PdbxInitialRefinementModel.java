package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_initial_refinement_model record the starting model(s) used in structure determination.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxInitialRefinementModel extends DelegatingCategory {
    public PdbxInitialRefinementModel(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id_list":
                return getEntityIdList();
            case "type":
                return getType();
            case "source_name":
                return getSourceName();
            case "accession_code":
                return getAccessionCode();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the starting model record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A comma separated list of entities reflecting the initial model used for refinement
     * @return StrColumn
     */
    public StrColumn getEntityIdList() {
        return delegate.getColumn("entity_id_list", DelegatingStrColumn::new);
    }

    /**
     * This item describes the type of the initial model was generated
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This item identifies the resource of initial model used for refinement
     * @return StrColumn
     */
    public StrColumn getSourceName() {
        return delegate.getColumn("source_name", DelegatingStrColumn::new);
    }

    /**
     * This item identifies an accession code of the resource where the initial model
     * is used
     * @return StrColumn
     */
    public StrColumn getAccessionCode() {
        return delegate.getColumn("accession_code", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the initial model
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}