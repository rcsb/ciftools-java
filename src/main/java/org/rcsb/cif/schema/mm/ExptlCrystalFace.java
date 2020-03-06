package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EXPTL_CRYSTAL_FACE category record details
 * of the crystal faces.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalFace extends DelegatingCategory {
    public ExptlCrystalFace(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_id":
                return getCrystalId();
            case "diffr_chi":
                return getDiffrChi();
            case "diffr_kappa":
                return getDiffrKappa();
            case "diffr_phi":
                return getDiffrPhi();
            case "diffr_psi":
                return getDiffrPsi();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "perp_dist":
                return getPerpDist();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The chi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrChi() {
        return delegate.getColumn("diffr_chi", DelegatingFloatColumn::new);
    }

    /**
     * The kappa diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrKappa() {
        return delegate.getColumn("diffr_kappa", DelegatingFloatColumn::new);
    }

    /**
     * The phi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPhi() {
        return delegate.getColumn("diffr_phi", DelegatingFloatColumn::new);
    }

    /**
     * The psi diffractometer setting angle in degrees for a specific
     * crystal face associated with _exptl_crystal_face.perp_dist.
     * @return FloatColumn
     */
    public FloatColumn getDiffrPsi() {
        return delegate.getColumn("diffr_psi", DelegatingFloatColumn::new);
    }

    /**
     * Miller index h of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of the crystal face associated with the value
     * _exptl_crystal_face.perp_dist.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * The perpendicular distance in millimetres from the face to the
     * centre of rotation of the crystal.
     * @return FloatColumn
     */
    public FloatColumn getPerpDist() {
        return delegate.getColumn("perp_dist", DelegatingFloatColumn::new);
    }

}