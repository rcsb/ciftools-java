package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the ligation-based cloning steps used in
 * the overall protein production process.
 * _pdbx_entity_src_gen_clone_ligation.clone_step_id in this category
 * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
 * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
 * to cover ligation dependent cloning steps.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntitySrcGenCloneLigation extends BaseCategory {
    public PdbxEntitySrcGenCloneLigation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenCloneLigation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenCloneLigation(String name) {
        super(name);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entry_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * The names of the enzymes used to cleave the vector. In addition an enzyme
     * used to blunt the cut ends, etc., should be named here.
     * @return StrColumn
     */
    public StrColumn getCleavageEnzymes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cleavage_enzymes", StrColumn::new) :
                getBinaryColumn("cleavage_enzymes"));
    }

    /**
     * The names of the enzymes used to ligate the gene into the cleaved vector.
     * @return StrColumn
     */
    public StrColumn getLigationEnzymes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ligation_enzymes", StrColumn::new) :
                getBinaryColumn("ligation_enzymes"));
    }

    /**
     * The temperature at which the ligation experiment was performed, in degrees
     * celsius.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The duration of the ligation reaction in minutes.
     * @return IntColumn
     */
    public IntColumn getTime() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("time", IntColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * Any details to be associated with this ligation step, e.g. the protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
