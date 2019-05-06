package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL_CRYSTAL_FACE category record details
 * of the crystal faces.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The chi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrChi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diffr_chi", FloatColumn::new) :
                getBinaryColumn("diffr_chi"));
    }

    /**
     * The kappa diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrKappa() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diffr_kappa", FloatColumn::new) :
                getBinaryColumn("diffr_kappa"));
    }

    /**
     * The phi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diffr_phi", FloatColumn::new) :
                getBinaryColumn("diffr_phi"));
    }

    /**
     * The psi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("diffr_psi", FloatColumn::new) :
                getBinaryColumn("diffr_psi"));
    }

    /**
     * Miller index h of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * The perpendicular distance in millimetres from the face to the
     * centre of rotation of the crystal.
     * @return FloatColumn
     */
    public FloatColumn getPerpDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("perp_dist", FloatColumn::new) :
                getBinaryColumn("perp_dist"));
    }
}
