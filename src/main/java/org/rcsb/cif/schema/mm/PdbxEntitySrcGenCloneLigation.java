package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the ligation-based cloning steps used in
 * the overall protein production process.
 * _pdbx_entity_src_gen_clone_ligation.clone_step_id in this category
 * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
 * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
 * to cover ligation dependent cloning steps.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenCloneLigation extends DelegatingCategory {
    public PdbxEntitySrcGenCloneLigation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "cleavage_enzymes":
                return getCleavageEnzymes();
            case "ligation_enzymes":
                return getLigationEnzymes();
            case "temperature":
                return getTemperature();
            case "time":
                return getTime();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entry_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * The names of the enzymes used to cleave the vector. In addition an enzyme
     * used to blunt the cut ends, etc., should be named here.
     * @return StrColumn
     */
    public StrColumn getCleavageEnzymes() {
        return delegate.getColumn("cleavage_enzymes", DelegatingStrColumn::new);
    }

    /**
     * The names of the enzymes used to ligate the gene into the cleaved vector.
     * @return StrColumn
     */
    public StrColumn getLigationEnzymes() {
        return delegate.getColumn("ligation_enzymes", DelegatingStrColumn::new);
    }

    /**
     * The temperature at which the ligation experiment was performed, in degrees
     * celsius.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingFloatColumn::new);
    }

    /**
     * The duration of the ligation reaction in minutes.
     * @return IntColumn
     */
    public IntColumn getTime() {
        return delegate.getColumn("time", DelegatingIntColumn::new);
    }

    /**
     * Any details to be associated with this ligation step, e.g. the protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}