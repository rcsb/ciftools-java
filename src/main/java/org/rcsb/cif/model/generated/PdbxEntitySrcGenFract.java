package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the fraction steps used in
 * the overall protein production process. Examples of fractionation
 * steps are centrifugation and magnetic bead pull-down purification.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenFract extends BaseCategory {
    public PdbxEntitySrcGenFract(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenFract(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenFract(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_fract.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_fract.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this fractionation step.
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
     * acid sequence of the expressed product after the fractionation
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
     * The date of this production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * This item describes the method of fractionation.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The temperature in degrees celsius at which the fractionation was performed.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * String value containing details of the fractionation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The fraction containing the protein of interest.
     * @return StrColumn
     */
    public StrColumn getProteinLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protein_location", StrColumn::new) :
                getBinaryColumn("protein_location"));
    }

    /**
     * The volume of the fraction containing the protein.
     * @return FloatColumn
     */
    public FloatColumn getProteinVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_volume", FloatColumn::new) :
                getBinaryColumn("protein_volume"));
    }

    /**
     * The yield in milligrams of protein from the fractionation.
     * @return FloatColumn
     */
    public FloatColumn getProteinYield() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_yield", FloatColumn::new) :
                getBinaryColumn("protein_yield"));
    }

    /**
     * The method used to determine the yield
     * @return StrColumn
     */
    public StrColumn getProteinYieldMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protein_yield_method", StrColumn::new) :
                getBinaryColumn("protein_yield_method"));
    }
}
