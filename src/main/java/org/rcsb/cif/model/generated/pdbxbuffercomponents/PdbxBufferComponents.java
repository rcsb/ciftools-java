package org.rcsb.cif.model.generated.pdbxbuffercomponents;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _pdbx_buffer.id in the BUFFER category.
     * @return BufferId
     */
    public BufferId getBufferId() {
        return (BufferId) (isText ? textFields.computeIfAbsent("buffer_id",
                BufferId::new) : getBinaryColumn("buffer_id"));
    }

    /**
     * The name of each buffer component.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The volume of buffer component.
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * The millimolar concentration of buffer component.
     * @return Conc
     */
    public Conc getConc() {
        return (Conc) (isText ? textFields.computeIfAbsent("conc",
                Conc::new) : getBinaryColumn("conc"));
    }

    /**
     * Any additional details to do with buffer composition.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The concentration units of the component.
     * @return ConcUnits
     */
    public ConcUnits getConcUnits() {
        return (ConcUnits) (isText ? textFields.computeIfAbsent("conc_units",
                ConcUnits::new) : getBinaryColumn("conc_units"));
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
}
