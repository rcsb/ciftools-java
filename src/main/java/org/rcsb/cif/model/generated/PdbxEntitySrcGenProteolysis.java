package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the protein purification
 * tag removal steps used in the overall protein production process
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntitySrcGenProteolysis extends BaseCategory {
    public PdbxEntitySrcGenProteolysis(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenProteolysis(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenProteolysis(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_proteolysis.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_proteolysis.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this tag removal step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("next_step_id", IntColumn::new) :
                getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product after the proteolysis
     * step.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_construct_id", StrColumn::new) :
                getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("robot_id", StrColumn::new) :
                getBinaryColumn("robot_id"));
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Details of this tag removal step.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The name of the protease used for cleavage.
     * @return StrColumn
     */
    public StrColumn getProtease() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protease", StrColumn::new) :
                getBinaryColumn("protease"));
    }

    /**
     * The ratio of protein to protease used for the cleavage.
     * = mol protein / mol protease
     * @return FloatColumn
     */
    public FloatColumn getProteinProteaseRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_protease_ratio", FloatColumn::new) :
                getBinaryColumn("protein_protease_ratio"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the cleavage was performed.
     * @return StrColumn
     */
    public StrColumn getCleavageBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cleavage_buffer_id", StrColumn::new) :
                getBinaryColumn("cleavage_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the cleavage was performed.
     * @return FloatColumn
     */
    public FloatColumn getCleavageTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cleavage_temperature", FloatColumn::new) :
                getBinaryColumn("cleavage_temperature"));
    }

    /**
     * The time in minutes for the cleavage reaction
     * @return FloatColumn
     */
    public FloatColumn getCleavageTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cleavage_time", FloatColumn::new) :
                getBinaryColumn("cleavage_time"));
    }
}
