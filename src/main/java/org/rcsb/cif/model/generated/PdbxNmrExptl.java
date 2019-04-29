package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * In this section, enter information on those experiments that were
 * used to generate constraint data. For each NMR experiment indicate
 * which sample and which sample conditions were used for the experiment.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrExptl extends BaseCategory {
    public PdbxNmrExptl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrExptl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrExptl(String name) {
        super(name);
    }

    /**
     * A numerical ID for each experiment.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_id", StrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The number to identify the set of sample conditions.
     * @return StrColumn
     */
    public StrColumn getConditionsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conditions_id", StrColumn::new) :
                getBinaryColumn("conditions_id"));
    }

    /**
     * The solution_id from the Experimental Sample to identify the sample
     * that these conditions refer to.
     * 
     * [Remember to save the entries here before returning to the
     * Experimental Sample form]
     * @return StrColumn
     */
    public StrColumn getSolutionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_id", StrColumn::new) :
                getBinaryColumn("solution_id"));
    }

    /**
     * The type of NMR experiment.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectrometer.spectrometer_id'
     * @return IntColumn
     */
    public IntColumn getSpectrometerId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spectrometer_id", IntColumn::new) :
                getBinaryColumn("spectrometer_id"));
    }

    /**
     * 
     * Physical state of the sample either anisotropic or isotropic.
     * @return StrColumn
     */
    public StrColumn getSampleState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_state", StrColumn::new) :
                getBinaryColumn("sample_state"));
    }
}
