package org.rcsb.cif.model.pdbxentitysrcgenfract;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_fract.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this fractionation step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return NextStepId
     */
    public NextStepId getNextStepId() {
        return (NextStepId) (isText ? textFields.computeIfAbsent("next_step_id",
                NextStepId::new) : getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product after the fractionation
     * step.
     * @return EndConstructId
     */
    public EndConstructId getEndConstructId() {
        return (EndConstructId) (isText ? textFields.computeIfAbsent("end_construct_id",
                EndConstructId::new) : getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return RobotId
     */
    public RobotId getRobotId() {
        return (RobotId) (isText ? textFields.computeIfAbsent("robot_id",
                RobotId::new) : getBinaryColumn("robot_id"));
    }

    /**
     * The date of this production step.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * This item describes the method of fractionation.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The temperature in degrees celsius at which the fractionation was performed.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * String value containing details of the fractionation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The fraction containing the protein of interest.
     * @return ProteinLocation
     */
    public ProteinLocation getProteinLocation() {
        return (ProteinLocation) (isText ? textFields.computeIfAbsent("protein_location",
                ProteinLocation::new) : getBinaryColumn("protein_location"));
    }

    /**
     * The volume of the fraction containing the protein.
     * @return ProteinVolume
     */
    public ProteinVolume getProteinVolume() {
        return (ProteinVolume) (isText ? textFields.computeIfAbsent("protein_volume",
                ProteinVolume::new) : getBinaryColumn("protein_volume"));
    }

    /**
     * The yield in milligrams of protein from the fractionation.
     * @return ProteinYield
     */
    public ProteinYield getProteinYield() {
        return (ProteinYield) (isText ? textFields.computeIfAbsent("protein_yield",
                ProteinYield::new) : getBinaryColumn("protein_yield"));
    }

    /**
     * The method used to determine the yield
     * @return ProteinYieldMethod
     */
    public ProteinYieldMethod getProteinYieldMethod() {
        return (ProteinYieldMethod) (isText ? textFields.computeIfAbsent("protein_yield_method",
                ProteinYieldMethod::new) : getBinaryColumn("protein_yield_method"));
    }
}
