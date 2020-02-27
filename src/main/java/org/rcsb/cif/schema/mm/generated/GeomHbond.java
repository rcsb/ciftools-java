package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the GEOM_HBOND category record details about
 * hydrogen bonds as calculated from the contents of the ATOM,
 * CELL and SYMMETRY data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAngleDHA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_DHA", FloatColumn::new) :
                getBinaryColumn("angle_DHA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_hbond.angle_DHA.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHAEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_DHA_esd", FloatColumn::new) :
                getBinaryColumn("angle_DHA_esd"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_A"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_A", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_D"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_D", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_H"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_H", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_A", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_A"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_D", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_D"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_H"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_H", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_H"));
    }

    /**
     * The distance in angstroms between the donor- and acceptor-atom
     * sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistDA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_DA", FloatColumn::new) :
                getBinaryColumn("dist_DA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DA.
     * @return FloatColumn
     */
    public FloatColumn getDistDAEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_DA_esd", FloatColumn::new) :
                getBinaryColumn("dist_DA_esd"));
    }

    /**
     * The distance in angstroms between the donor- and hydrogen-atom
     * sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistDH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_DH", FloatColumn::new) :
                getBinaryColumn("dist_DH"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_DH.
     * @return FloatColumn
     */
    public FloatColumn getDistDHEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_DH_esd", FloatColumn::new) :
                getBinaryColumn("dist_DH_esd"));
    }

    /**
     * The distance in angstroms between the hydrogen- and acceptor-
     * atom sites in a hydrogen bond.
     * @return FloatColumn
     */
    public FloatColumn getDistHA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_HA", FloatColumn::new) :
                getBinaryColumn("dist_HA"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * in angstroms of _geom_hbond.dist_HA.
     * @return FloatColumn
     */
    public FloatColumn getDistHAEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_HA_esd", FloatColumn::new) :
                getBinaryColumn("dist_HA_esd"));
    }

    /**
     * This code signals whether the hydrogen-bond information is
     * referred to in a publication or should be placed in a table of
     * significant hydrogen-bond geometry.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("publ_flag", StrColumn::new) :
                getBinaryColumn("publ_flag"));
    }

    /**
     * The symmetry code of the acceptor-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryA() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_A", StrColumn::new) :
                getBinaryColumn("site_symmetry_A"));
    }

    /**
     * The symmetry code of the donor-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_D", StrColumn::new) :
                getBinaryColumn("site_symmetry_D"));
    }

    /**
     * The symmetry code of the hydrogen-atom site that defines the
     * hydrogen bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetryH() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_H", StrColumn::new) :
                getBinaryColumn("site_symmetry_H"));
    }
}
