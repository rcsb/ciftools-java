package org.rcsb.cif.model.generated.pdbxentitysrcgencloneligation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * The names of the enzymes used to cleave the vector. In addition an enzyme
     * used to blunt the cut ends, etc., should be named here.
     * @return CleavageEnzymes
     */
    public CleavageEnzymes getCleavageEnzymes() {
        return (CleavageEnzymes) (isText ? textFields.computeIfAbsent("cleavage_enzymes",
                CleavageEnzymes::new) : getBinaryColumn("cleavage_enzymes"));
    }

    /**
     * The names of the enzymes used to ligate the gene into the cleaved vector.
     * @return LigationEnzymes
     */
    public LigationEnzymes getLigationEnzymes() {
        return (LigationEnzymes) (isText ? textFields.computeIfAbsent("ligation_enzymes",
                LigationEnzymes::new) : getBinaryColumn("ligation_enzymes"));
    }

    /**
     * The temperature at which the ligation experiment was performed, in degrees
     * celsius.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * The duration of the ligation reaction in minutes.
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }

    /**
     * Any details to be associated with this ligation step, e.g. the protocol.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
