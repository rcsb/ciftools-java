package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The chemical constituents of
 * each NMR sample. Each sample is identified by a number and
 * each component in the sample is identified by name.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrExptlSample extends BaseCategory {
    public PdbxNmrExptlSample(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrExptlSample(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrExptlSample(String name) {
        super(name);
    }

    /**
     * The name (number) of the sample.
     * @return StrColumn
     */
    public StrColumn getSolutionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solution_id", StrColumn::new) :
                getBinaryColumn("solution_id"));
    }

    /**
     * The name of each component in the sample
     * @return StrColumn
     */
    public StrColumn getComponent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("component", StrColumn::new) :
                getBinaryColumn("component"));
    }

    /**
     * The concentration value of the component.
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("concentration", FloatColumn::new) :
                getBinaryColumn("concentration"));
    }

    /**
     * The concentration range for the component.
     * @return StrColumn
     */
    public StrColumn getConcentrationRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("concentration_range", StrColumn::new) :
                getBinaryColumn("concentration_range"));
    }

    /**
     * The concentration units of the component.
     * @return StrColumn
     */
    public StrColumn getConcentrationUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("concentration_units", StrColumn::new) :
                getBinaryColumn("concentration_units"));
    }

    /**
     * The isotopic composition of each component, including
     * the % labeling level, if known. For example:
     * 1. Uniform (random) labeling with 15N: U-15N
     * 2. Uniform (random) labeling with 13C, 15N at known labeling
     * levels: U-95% 13C;U-98% 15N
     * 3. Residue selective labeling: U-95% 15N-Thymine
     * 4. Site specific labeling: 95% 13C-Ala18,
     * 5. Natural abundance labeling in an otherwise uniformly labled
     * biomolecule is designated by NA: U-13C; NA-K,H
     * @return StrColumn
     */
    public StrColumn getIsotopicLabeling() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("isotopic_labeling", StrColumn::new) :
                getBinaryColumn("isotopic_labeling"));
    }

    /**
     * 
     * Estimate for the standard error associated with the concentration value
     * of the sample component.
     * @return FloatColumn
     */
    public FloatColumn getConcentrationErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("concentration_err", FloatColumn::new) :
                getBinaryColumn("concentration_err"));
    }
}
