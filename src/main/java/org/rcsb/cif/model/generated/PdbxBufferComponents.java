package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Constituents of buffer in sample
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxBufferComponents extends BaseCategory {
    public PdbxBufferComponents(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxBufferComponents(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxBufferComponents(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_buffer_components.id must
     * uniquely identify a component of the buffer.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _pdbx_buffer.id in the BUFFER category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("buffer_id", StrColumn::new) :
                getBinaryColumn("buffer_id"));
    }

    /**
     * The name of each buffer component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The volume of buffer component.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("volume", StrColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * The millimolar concentration of buffer component.
     * @return StrColumn
     */
    public StrColumn getConc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc", StrColumn::new) :
                getBinaryColumn("conc"));
    }

    /**
     * Any additional details to do with buffer composition.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The concentration units of the component.
     * @return StrColumn
     */
    public StrColumn getConcUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_units", StrColumn::new) :
                getBinaryColumn("conc_units"));
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
}
