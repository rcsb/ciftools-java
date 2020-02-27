package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the GEOM_HBOND category record details about
 * hydrogen bonds as calculated from the contents of the ATOM,
 * CELL and SYMMETRY data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomHbond extends DelegatingCategory {
    public GeomHbond(Category delegate) {
        super(delegate);
    }

    /**
     * The angle in degrees defined by the donor-, hydrogen- and
     * acceptor-atom sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHA() {
        return delegate.getColumn("angle_DHA", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_hbond.angle_DHA.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHAEsd() {
        return delegate.getColumn("angle_DHA_esd", DelegatingFloatColumn::new);
    }

    /**
     * The identifier of the acceptor-atom site that defines the
     * hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdA() {
        return delegate.getColumn("atom_site_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltIdA() {
        return delegate.getColumn("atom_site_label_alt_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymIdA() {
        return delegate.getColumn("atom_site_label_asym_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomIdA() {
        return delegate.getColumn("atom_site_label_atom_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompIdA() {
        return delegate.getColumn("atom_site_label_comp_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqIdA() {
        return delegate.getColumn("atom_site_label_seq_id_A", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the donor-atom site that defines the hydrogen
     * bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdD() {
        return delegate.getColumn("atom_site_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltIdD() {
        return delegate.getColumn("atom_site_label_alt_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymIdD() {
        return delegate.getColumn("atom_site_label_asym_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomIdD() {
        return delegate.getColumn("atom_site_label_atom_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompIdD() {
        return delegate.getColumn("atom_site_label_comp_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqIdD() {
        return delegate.getColumn("atom_site_label_seq_id_D", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the hydrogen-atom site that defines the
     * hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdH() {
        return delegate.getColumn("atom_site_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltIdH() {
        return delegate.getColumn("atom_site_label_alt_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymIdH() {
        return delegate.getColumn("atom_site_label_asym_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomIdH() {
        return delegate.getColumn("atom_site_label_atom_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompIdH() {
        return delegate.getColumn("atom_site_label_comp_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqIdH() {
        return delegate.getColumn("atom_site_label_seq_id_H", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymIdA() {
        return delegate.getColumn("atom_site_auth_asym_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomIdA() {
        return delegate.getColumn("atom_site_auth_atom_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompIdA() {
        return delegate.getColumn("atom_site_auth_comp_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqIdA() {
        return delegate.getColumn("atom_site_auth_seq_id_A", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymIdD() {
        return delegate.getColumn("atom_site_auth_asym_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomIdD() {
        return delegate.getColumn("atom_site_auth_atom_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompIdD() {
        return delegate.getColumn("atom_site_auth_comp_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqIdD() {
        return delegate.getColumn("atom_site_auth_seq_id_D", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymIdH() {
        return delegate.getColumn("atom_site_auth_asym_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomIdH() {
        return delegate.getColumn("atom_site_auth_atom_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompIdH() {
        return delegate.getColumn("atom_site_auth_comp_id_H", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqIdH() {
        return delegate.getColumn("atom_site_auth_seq_id_H", DelegatingStrColumn::new);
    }

    /**
     * The distance in angstroms between the donor- and acceptor-atom
     * sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistDA() {
        return delegate.getColumn("dist_DA", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DA.
     * @return FloatColumn
     */
    public FloatColumn getDistDAEsd() {
        return delegate.getColumn("dist_DA_esd", DelegatingFloatColumn::new);
    }

    /**
     * The distance in angstroms between the donor- and hydrogen-atom
     * sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistDH() {
        return delegate.getColumn("dist_DH", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DH.
     * @return FloatColumn
     */
    public FloatColumn getDistDHEsd() {
        return delegate.getColumn("dist_DH_esd", DelegatingFloatColumn::new);
    }

    /**
     * The distance in angstroms between the hydrogen- and acceptor-
     * atom sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistHA() {
        return delegate.getColumn("dist_HA", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_HA.
     * @return FloatColumn
     */
    public FloatColumn getDistHAEsd() {
        return delegate.getColumn("dist_HA_esd", DelegatingFloatColumn::new);
    }

    /**
     * This code signals whether the hydrogen-bond information is
     * referred to in a publication or should be placed in a table of
     * significant hydrogen-bond geometry.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return delegate.getColumn("publ_flag", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the acceptor-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryA() {
        return delegate.getColumn("site_symmetry_A", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the donor-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryD() {
        return delegate.getColumn("site_symmetry_D", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the hydrogen-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryH() {
        return delegate.getColumn("site_symmetry_H", DelegatingStrColumn::new);
    }
}
