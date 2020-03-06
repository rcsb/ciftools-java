package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The chemical constituents of
 * each NMR sample. Each sample is identified by a number and
 * each component in the sample is identified by name.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrExptlSample extends DelegatingCategory {
    public PdbxNmrExptlSample(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "solution_id":
                return getSolutionId();
            case "component":
                return getComponent();
            case "concentration":
                return getConcentration();
            case "concentration_range":
                return getConcentrationRange();
            case "concentration_units":
                return getConcentrationUnits();
            case "isotopic_labeling":
                return getIsotopicLabeling();
            case "concentration_err":
                return getConcentrationErr();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The name (number) of the sample.
     * @return StrColumn
     */
    public StrColumn getSolutionId() {
        return delegate.getColumn("solution_id", DelegatingStrColumn::new);
    }

    /**
     * The name of each component in the sample
     * @return StrColumn
     */
    public StrColumn getComponent() {
        return delegate.getColumn("component", DelegatingStrColumn::new);
    }

    /**
     * The concentration value of the component.
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return delegate.getColumn("concentration", DelegatingFloatColumn::new);
    }

    /**
     * The concentration range for the component.
     * @return StrColumn
     */
    public StrColumn getConcentrationRange() {
        return delegate.getColumn("concentration_range", DelegatingStrColumn::new);
    }

    /**
     * The concentration units of the component.
     * @return StrColumn
     */
    public StrColumn getConcentrationUnits() {
        return delegate.getColumn("concentration_units", DelegatingStrColumn::new);
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
        return delegate.getColumn("isotopic_labeling", DelegatingStrColumn::new);
    }

    /**
     * Estimate for the standard error associated with the concentration value
     * of the sample component.
     * @return FloatColumn
     */
    public FloatColumn getConcentrationErr() {
        return delegate.getColumn("concentration_err", DelegatingFloatColumn::new);
    }

}