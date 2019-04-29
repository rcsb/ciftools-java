package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Complete description of each NMR sample, including the solvent
 * system used.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSampleDetails extends BaseCategory {
    public PdbxNmrSampleDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSampleDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSampleDetails(String name) {
        super(name);
    }

    /**
     * 
     * The name (number) of the sample.
     * @return StrColumn
     */
    public StrColumn getSolutionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_id", StrColumn::new) :
                getBinaryColumn("solution_id"));
    }

    /**
     * 
     * A complete description of each NMR sample. Include the concentration
     * and concentration units for each component (include buffers, etc.). For each
     * component describe the isotopic composition, including the % labeling level,
     * if known.
     * 
     * For example:
     * 1. Uniform (random) labeling with 15N: U-15N
     * 2. Uniform (random) labeling with 13C, 15N at known labeling
     * levels: U-95% 13C;U-98% 15N
     * 3. Residue selective labeling: U-95% 15N-Thymine
     * 4. Site specific labeling: 95% 13C-Ala18,
     * 5. Natural abundance labeling in an otherwise uniformly labeled
     * biomolecule is designated by NA: U-13C; NA-K,H
     * @return StrColumn
     */
    public StrColumn getContents() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contents", StrColumn::new) :
                getBinaryColumn("contents"));
    }

    /**
     * 
     * The solvent system used for this sample.
     * @return StrColumn
     */
    public StrColumn getSolventSystem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solvent_system", StrColumn::new) :
                getBinaryColumn("solvent_system"));
    }

    /**
     * 
     * A value that uniquely identifies this sample from the other samples listed
     * in the entry.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * A descriptive term for the sample that defines the general physical properties
     * of the sample.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * 
     * Brief description of the sample providing additional information not captured by other items in the category.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
