package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Complete description of each NMR sample, including the solvent
 * system used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSampleDetails extends DelegatingCategory {
    public PdbxNmrSampleDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "solution_id":
                return getSolutionId();
            case "contents":
                return getContents();
            case "solvent_system":
                return getSolventSystem();
            case "label":
                return getLabel();
            case "type":
                return getType();
            case "details":
                return getDetails();
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
        return delegate.getColumn("contents", DelegatingStrColumn::new);
    }

    /**
     * The solvent system used for this sample.
     * @return StrColumn
     */
    public StrColumn getSolventSystem() {
        return delegate.getColumn("solvent_system", DelegatingStrColumn::new);
    }

    /**
     * A value that uniquely identifies this sample from the other samples listed
     * in the entry.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * A descriptive term for the sample that defines the general physical properties
     * of the sample.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Brief description of the sample providing additional information not captured by other items in the category.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}