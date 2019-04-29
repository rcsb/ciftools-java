package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL_FACE category record details
 * of the crystal faces.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExptlCrystalFace extends BaseCategory {
    public ExptlCrystalFace(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ExptlCrystalFace(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ExptlCrystalFace(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_id", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The chi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffrChi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diffr_chi", SingleRowFloatColumn::new) :
                getBinaryColumn("diffr_chi"));
    }

    /**
     * The kappa diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffrKappa() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diffr_kappa", SingleRowFloatColumn::new) :
                getBinaryColumn("diffr_kappa"));
    }

    /**
     * The phi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffrPhi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diffr_phi", SingleRowFloatColumn::new) :
                getBinaryColumn("diffr_phi"));
    }

    /**
     * The psi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDiffrPsi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("diffr_psi", SingleRowFloatColumn::new) :
                getBinaryColumn("diffr_psi"));
    }

    /**
     * Miller index h of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexH() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_h", SingleRowIntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexK() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_k", SingleRowIntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexL() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_l", SingleRowIntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * The perpendicular distance in millimetres from the face to the
     * centre of rotation of the crystal.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPerpDist() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("perp_dist", SingleRowFloatColumn::new) :
                getBinaryColumn("perp_dist"));
    }
}
