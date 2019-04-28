package org.rcsb.cif.model.generated.geomhbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GeomHbond extends BaseCategory {
    public GeomHbond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public GeomHbond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public GeomHbond(String name) {
        super(name);
    }

    /**
     * The angle in degrees defined by the donor-, hydrogen- and
     * acceptor-atom sites in a hydrogen bond.
     * @return AngleDHA
     */
    public AngleDHA getAngleDHA() {
        return (AngleDHA) (isText ? textFields.computeIfAbsent("angle_DHA",
                AngleDHA::new) : getBinaryColumn("angle_DHA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_hbond.angle_DHA.
     * @return AngleDHAEsd
     */
    public AngleDHAEsd getAngleDHAEsd() {
        return (AngleDHAEsd) (isText ? textFields.computeIfAbsent("angle_DHA_esd",
                AngleDHAEsd::new) : getBinaryColumn("angle_DHA_esd"));
    }

    /**
     * The identifier of the acceptor-atom site that defines the
     * hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteIdA
     */
    public AtomSiteIdA getAtomSiteIdA() {
        return (AtomSiteIdA) (isText ? textFields.computeIfAbsent("atom_site_id_A",
                AtomSiteIdA::new) : getBinaryColumn("atom_site_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltIdA
     */
    public AtomSiteLabelAltIdA getAtomSiteLabelAltIdA() {
        return (AtomSiteLabelAltIdA) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_A",
                AtomSiteLabelAltIdA::new) : getBinaryColumn("atom_site_label_alt_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymIdA
     */
    public AtomSiteLabelAsymIdA getAtomSiteLabelAsymIdA() {
        return (AtomSiteLabelAsymIdA) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_A",
                AtomSiteLabelAsymIdA::new) : getBinaryColumn("atom_site_label_asym_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomIdA
     */
    public AtomSiteLabelAtomIdA getAtomSiteLabelAtomIdA() {
        return (AtomSiteLabelAtomIdA) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_A",
                AtomSiteLabelAtomIdA::new) : getBinaryColumn("atom_site_label_atom_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompIdA
     */
    public AtomSiteLabelCompIdA getAtomSiteLabelCompIdA() {
        return (AtomSiteLabelCompIdA) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_A",
                AtomSiteLabelCompIdA::new) : getBinaryColumn("atom_site_label_comp_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqIdA
     */
    public AtomSiteLabelSeqIdA getAtomSiteLabelSeqIdA() {
        return (AtomSiteLabelSeqIdA) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_A",
                AtomSiteLabelSeqIdA::new) : getBinaryColumn("atom_site_label_seq_id_A"));
    }

    /**
     * The identifier of the donor-atom site that defines the hydrogen
     * bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteIdD
     */
    public AtomSiteIdD getAtomSiteIdD() {
        return (AtomSiteIdD) (isText ? textFields.computeIfAbsent("atom_site_id_D",
                AtomSiteIdD::new) : getBinaryColumn("atom_site_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltIdD
     */
    public AtomSiteLabelAltIdD getAtomSiteLabelAltIdD() {
        return (AtomSiteLabelAltIdD) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_D",
                AtomSiteLabelAltIdD::new) : getBinaryColumn("atom_site_label_alt_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymIdD
     */
    public AtomSiteLabelAsymIdD getAtomSiteLabelAsymIdD() {
        return (AtomSiteLabelAsymIdD) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_D",
                AtomSiteLabelAsymIdD::new) : getBinaryColumn("atom_site_label_asym_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomIdD
     */
    public AtomSiteLabelAtomIdD getAtomSiteLabelAtomIdD() {
        return (AtomSiteLabelAtomIdD) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_D",
                AtomSiteLabelAtomIdD::new) : getBinaryColumn("atom_site_label_atom_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompIdD
     */
    public AtomSiteLabelCompIdD getAtomSiteLabelCompIdD() {
        return (AtomSiteLabelCompIdD) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_D",
                AtomSiteLabelCompIdD::new) : getBinaryColumn("atom_site_label_comp_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqIdD
     */
    public AtomSiteLabelSeqIdD getAtomSiteLabelSeqIdD() {
        return (AtomSiteLabelSeqIdD) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_D",
                AtomSiteLabelSeqIdD::new) : getBinaryColumn("atom_site_label_seq_id_D"));
    }

    /**
     * The identifier of the hydrogen-atom site that defines the
     * hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteIdH
     */
    public AtomSiteIdH getAtomSiteIdH() {
        return (AtomSiteIdH) (isText ? textFields.computeIfAbsent("atom_site_id_H",
                AtomSiteIdH::new) : getBinaryColumn("atom_site_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltIdH
     */
    public AtomSiteLabelAltIdH getAtomSiteLabelAltIdH() {
        return (AtomSiteLabelAltIdH) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_H",
                AtomSiteLabelAltIdH::new) : getBinaryColumn("atom_site_label_alt_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymIdH
     */
    public AtomSiteLabelAsymIdH getAtomSiteLabelAsymIdH() {
        return (AtomSiteLabelAsymIdH) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_H",
                AtomSiteLabelAsymIdH::new) : getBinaryColumn("atom_site_label_asym_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomIdH
     */
    public AtomSiteLabelAtomIdH getAtomSiteLabelAtomIdH() {
        return (AtomSiteLabelAtomIdH) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_H",
                AtomSiteLabelAtomIdH::new) : getBinaryColumn("atom_site_label_atom_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompIdH
     */
    public AtomSiteLabelCompIdH getAtomSiteLabelCompIdH() {
        return (AtomSiteLabelCompIdH) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_H",
                AtomSiteLabelCompIdH::new) : getBinaryColumn("atom_site_label_comp_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqIdH
     */
    public AtomSiteLabelSeqIdH getAtomSiteLabelSeqIdH() {
        return (AtomSiteLabelSeqIdH) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_H",
                AtomSiteLabelSeqIdH::new) : getBinaryColumn("atom_site_label_seq_id_H"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymIdA
     */
    public AtomSiteAuthAsymIdA getAtomSiteAuthAsymIdA() {
        return (AtomSiteAuthAsymIdA) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_A",
                AtomSiteAuthAsymIdA::new) : getBinaryColumn("atom_site_auth_asym_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomIdA
     */
    public AtomSiteAuthAtomIdA getAtomSiteAuthAtomIdA() {
        return (AtomSiteAuthAtomIdA) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_A",
                AtomSiteAuthAtomIdA::new) : getBinaryColumn("atom_site_auth_atom_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompIdA
     */
    public AtomSiteAuthCompIdA getAtomSiteAuthCompIdA() {
        return (AtomSiteAuthCompIdA) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_A",
                AtomSiteAuthCompIdA::new) : getBinaryColumn("atom_site_auth_comp_id_A"));
    }

    /**
     * An optional identifier of the acceptor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqIdA
     */
    public AtomSiteAuthSeqIdA getAtomSiteAuthSeqIdA() {
        return (AtomSiteAuthSeqIdA) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_A",
                AtomSiteAuthSeqIdA::new) : getBinaryColumn("atom_site_auth_seq_id_A"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymIdD
     */
    public AtomSiteAuthAsymIdD getAtomSiteAuthAsymIdD() {
        return (AtomSiteAuthAsymIdD) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_D",
                AtomSiteAuthAsymIdD::new) : getBinaryColumn("atom_site_auth_asym_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomIdD
     */
    public AtomSiteAuthAtomIdD getAtomSiteAuthAtomIdD() {
        return (AtomSiteAuthAtomIdD) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_D",
                AtomSiteAuthAtomIdD::new) : getBinaryColumn("atom_site_auth_atom_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompIdD
     */
    public AtomSiteAuthCompIdD getAtomSiteAuthCompIdD() {
        return (AtomSiteAuthCompIdD) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_D",
                AtomSiteAuthCompIdD::new) : getBinaryColumn("atom_site_auth_comp_id_D"));
    }

    /**
     * An optional identifier of the donor-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqIdD
     */
    public AtomSiteAuthSeqIdD getAtomSiteAuthSeqIdD() {
        return (AtomSiteAuthSeqIdD) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_D",
                AtomSiteAuthSeqIdD::new) : getBinaryColumn("atom_site_auth_seq_id_D"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymIdH
     */
    public AtomSiteAuthAsymIdH getAtomSiteAuthAsymIdH() {
        return (AtomSiteAuthAsymIdH) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_H",
                AtomSiteAuthAsymIdH::new) : getBinaryColumn("atom_site_auth_asym_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomIdH
     */
    public AtomSiteAuthAtomIdH getAtomSiteAuthAtomIdH() {
        return (AtomSiteAuthAtomIdH) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_H",
                AtomSiteAuthAtomIdH::new) : getBinaryColumn("atom_site_auth_atom_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompIdH
     */
    public AtomSiteAuthCompIdH getAtomSiteAuthCompIdH() {
        return (AtomSiteAuthCompIdH) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_H",
                AtomSiteAuthCompIdH::new) : getBinaryColumn("atom_site_auth_comp_id_H"));
    }

    /**
     * An optional identifier of the hydrogen-atom site that defines
     * the hydrogen bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqIdH
     */
    public AtomSiteAuthSeqIdH getAtomSiteAuthSeqIdH() {
        return (AtomSiteAuthSeqIdH) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_H",
                AtomSiteAuthSeqIdH::new) : getBinaryColumn("atom_site_auth_seq_id_H"));
    }

    /**
     * The distance in angstroms between the donor- and acceptor-atom
     * sites in a hydrogen bond.
     * @return DistDA
     */
    public DistDA getDistDA() {
        return (DistDA) (isText ? textFields.computeIfAbsent("dist_DA",
                DistDA::new) : getBinaryColumn("dist_DA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DA.
     * @return DistDAEsd
     */
    public DistDAEsd getDistDAEsd() {
        return (DistDAEsd) (isText ? textFields.computeIfAbsent("dist_DA_esd",
                DistDAEsd::new) : getBinaryColumn("dist_DA_esd"));
    }

    /**
     * The distance in angstroms between the donor- and hydrogen-atom
     * sites in a hydrogen bond.
     * @return DistDH
     */
    public DistDH getDistDH() {
        return (DistDH) (isText ? textFields.computeIfAbsent("dist_DH",
                DistDH::new) : getBinaryColumn("dist_DH"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DH.
     * @return DistDHEsd
     */
    public DistDHEsd getDistDHEsd() {
        return (DistDHEsd) (isText ? textFields.computeIfAbsent("dist_DH_esd",
                DistDHEsd::new) : getBinaryColumn("dist_DH_esd"));
    }

    /**
     * The distance in angstroms between the hydrogen- and acceptor-
     * atom sites in a hydrogen bond.
     * @return DistHA
     */
    public DistHA getDistHA() {
        return (DistHA) (isText ? textFields.computeIfAbsent("dist_HA",
                DistHA::new) : getBinaryColumn("dist_HA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_HA.
     * @return DistHAEsd
     */
    public DistHAEsd getDistHAEsd() {
        return (DistHAEsd) (isText ? textFields.computeIfAbsent("dist_HA_esd",
                DistHAEsd::new) : getBinaryColumn("dist_HA_esd"));
    }

    /**
     * This code signals whether the hydrogen-bond information is
     * referred to in a publication or should be placed in a table of
     * significant hydrogen-bond geometry.
     * @return PublFlag
     */
    public PublFlag getPublFlag() {
        return (PublFlag) (isText ? textFields.computeIfAbsent("publ_flag",
                PublFlag::new) : getBinaryColumn("publ_flag"));
    }

    /**
     * The symmetry code of the acceptor-atom site that defines the
     * hydrogen bond.
     * @return SiteSymmetryA
     */
    public SiteSymmetryA getSiteSymmetryA() {
        return (SiteSymmetryA) (isText ? textFields.computeIfAbsent("site_symmetry_A",
                SiteSymmetryA::new) : getBinaryColumn("site_symmetry_A"));
    }

    /**
     * The symmetry code of the donor-atom site that defines the
     * hydrogen bond.
     * @return SiteSymmetryD
     */
    public SiteSymmetryD getSiteSymmetryD() {
        return (SiteSymmetryD) (isText ? textFields.computeIfAbsent("site_symmetry_D",
                SiteSymmetryD::new) : getBinaryColumn("site_symmetry_D"));
    }

    /**
     * The symmetry code of the hydrogen-atom site that defines the
     * hydrogen bond.
     * @return SiteSymmetryH
     */
    public SiteSymmetryH getSiteSymmetryH() {
        return (SiteSymmetryH) (isText ? textFields.computeIfAbsent("site_symmetry_H",
                SiteSymmetryH::new) : getBinaryColumn("site_symmetry_H"));
    }
}
