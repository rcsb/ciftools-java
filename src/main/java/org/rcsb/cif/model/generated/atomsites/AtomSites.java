package org.rcsb.cif.model.generated.atomsites;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import java.util.Map;

public class AtomSites extends BaseCifCategory {
    public AtomSites(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public AtomSites(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id", "EntryId"));
    }

    /**
     * The elements of the 3x3 matrix used to transform Cartesian
     * coordinates in the ATOM_SITE category to fractional coordinates
     * in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x1 translation is defined in
     * _atom_sites.fract_transf_vector[].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return FractTransfMatrix
     */
    public FractTransfMatrix getFractTransfMatrix() {
        return (FractTransfMatrix) (isText ? getTextColumn("fract_transf_matrix") : getBinaryColumn("fract_transf_matrix", "FractTransfMatrix"));
    }

    /**
     * The elements of the three-element vector used to transform
     * Cartesian coordinates in the ATOM_SITE category to fractional
     * coordinates in the same category. The axial alignments of this
     * transformation are described in _atom_sites.Cartn_transform_axes.
     * The 3x3 rotation is defined in
     * _atom_sites.fract_transf_matrix[][].
     * 
     * |x'|               |11 12 13| |x|              |1|
     * |y'|~fractional~ = |21 22 23| |y|~Cartesian~ + |2|
     * |z'|               |31 32 33| |z|              |3|
     * @return FractTransfVector
     */
    public FractTransfVector getFractTransfVector() {
        return (FractTransfVector) (isText ? getTextColumn("fract_transf_vector") : getBinaryColumn("fract_transf_vector", "FractTransfVector"));
    }
}
