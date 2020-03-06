package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Constituents of buffer in sample
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxBufferComponents extends DelegatingCategory {
    public PdbxBufferComponents(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "buffer_id":
                return getBufferId();
            case "name":
                return getName();
            case "volume":
                return getVolume();
            case "conc":
                return getConc();
            case "details":
                return getDetails();
            case "conc_units":
                return getConcUnits();
            case "isotopic_labeling":
                return getIsotopicLabeling();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_buffer_components.id must
     * uniquely identify a component of the buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_buffer.id in the BUFFER category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return delegate.getColumn("buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The name of each buffer component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The volume of buffer component.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return delegate.getColumn("volume", DelegatingStrColumn::new);
    }

    /**
     * The millimolar concentration of buffer component.
     * @return StrColumn
     */
    public StrColumn getConc() {
        return delegate.getColumn("conc", DelegatingStrColumn::new);
    }

    /**
     * Any additional details to do with buffer composition.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The concentration units of the component.
     * @return StrColumn
     */
    public StrColumn getConcUnits() {
        return delegate.getColumn("conc_units", DelegatingStrColumn::new);
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

}