package org.rcsb.cif.model.pdbxnmrexptlsample;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return SolutionId
     */
    public SolutionId getSolutionId() {
        return (SolutionId) (isText ? textFields.computeIfAbsent("solution_id",
                SolutionId::new) : getBinaryColumn("solution_id"));
    }

    /**
     * The name of each component in the sample
     * @return Component
     */
    public Component getComponent() {
        return (Component) (isText ? textFields.computeIfAbsent("component",
                Component::new) : getBinaryColumn("component"));
    }

    /**
     * The concentration value of the component.
     * @return Concentration
     */
    public Concentration getConcentration() {
        return (Concentration) (isText ? textFields.computeIfAbsent("concentration",
                Concentration::new) : getBinaryColumn("concentration"));
    }

    /**
     * The concentration range for the component.
     * @return ConcentrationRange
     */
    public ConcentrationRange getConcentrationRange() {
        return (ConcentrationRange) (isText ? textFields.computeIfAbsent("concentration_range",
                ConcentrationRange::new) : getBinaryColumn("concentration_range"));
    }

    /**
     * The concentration units of the component.
     * @return ConcentrationUnits
     */
    public ConcentrationUnits getConcentrationUnits() {
        return (ConcentrationUnits) (isText ? textFields.computeIfAbsent("concentration_units",
                ConcentrationUnits::new) : getBinaryColumn("concentration_units"));
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
     * @return IsotopicLabeling
     */
    public IsotopicLabeling getIsotopicLabeling() {
        return (IsotopicLabeling) (isText ? textFields.computeIfAbsent("isotopic_labeling",
                IsotopicLabeling::new) : getBinaryColumn("isotopic_labeling"));
    }

    /**
     * 
     * Estimate for the standard error associated with the concentration value
     * of the sample component.
     * @return ConcentrationErr
     */
    public ConcentrationErr getConcentrationErr() {
        return (ConcentrationErr) (isText ? textFields.computeIfAbsent("concentration_err",
                ConcentrationErr::new) : getBinaryColumn("concentration_err"));
    }
}
