package org.rcsb.cif.model.generated.exptlcrystalface;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The chi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return DiffrChi
     */
    public DiffrChi getDiffrChi() {
        return (DiffrChi) (isText ? textFields.computeIfAbsent("diffr_chi",
                DiffrChi::new) : getBinaryColumn("diffr_chi"));
    }

    /**
     * The kappa diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return DiffrKappa
     */
    public DiffrKappa getDiffrKappa() {
        return (DiffrKappa) (isText ? textFields.computeIfAbsent("diffr_kappa",
                DiffrKappa::new) : getBinaryColumn("diffr_kappa"));
    }

    /**
     * The phi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return DiffrPhi
     */
    public DiffrPhi getDiffrPhi() {
        return (DiffrPhi) (isText ? textFields.computeIfAbsent("diffr_phi",
                DiffrPhi::new) : getBinaryColumn("diffr_phi"));
    }

    /**
     * The psi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return DiffrPsi
     */
    public DiffrPsi getDiffrPsi() {
        return (DiffrPsi) (isText ? textFields.computeIfAbsent("diffr_psi",
                DiffrPsi::new) : getBinaryColumn("diffr_psi"));
    }

    /**
     * Miller index h of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * The perpendicular distance in millimetres from the face to the
     * centre of rotation of the crystal.
     * @return PerpDist
     */
    public PerpDist getPerpDist() {
        return (PerpDist) (isText ? textFields.computeIfAbsent("perp_dist",
                PerpDist::new) : getBinaryColumn("perp_dist"));
    }
}
