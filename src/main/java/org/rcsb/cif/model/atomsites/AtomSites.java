package org.rcsb.cif.model.atomsites;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class AtomSites extends BaseCategory {
    public AtomSites(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSites(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSites(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
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
        return (FractTransfMatrix) (isText ? textFields.computeIfAbsent("fract_transf_matrix",
                FractTransfMatrix::new) : getBinaryColumn("fract_transf_matrix"));
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
        return (FractTransfVector) (isText ? textFields.computeIfAbsent("fract_transf_vector",
                FractTransfVector::new) : getBinaryColumn("fract_transf_vector"));
    }
}
