package org.rcsb.cif.model.generated.pdbxvirtualtorsion;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxVirtualTorsion extends BaseCategory {
    public PdbxVirtualTorsion(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxVirtualTorsion(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxVirtualTorsion(String name) {
        super(name);
    }

    /**
     * The model number for the given angle
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The identifier of the first of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteId1
     */
    public AtomSiteId1 getAtomSiteId1() {
        return (AtomSiteId1) (isText ? textFields.computeIfAbsent("atom_site_id_1",
                AtomSiteId1::new) : getBinaryColumn("atom_site_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltId1
     */
    public AtomSiteLabelAltId1 getAtomSiteLabelAltId1() {
        return (AtomSiteLabelAltId1) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_1",
                AtomSiteLabelAltId1::new) : getBinaryColumn("atom_site_label_alt_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomId1
     */
    public AtomSiteLabelAtomId1 getAtomSiteLabelAtomId1() {
        return (AtomSiteLabelAtomId1) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_1",
                AtomSiteLabelAtomId1::new) : getBinaryColumn("atom_site_label_atom_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompId1
     */
    public AtomSiteLabelCompId1 getAtomSiteLabelCompId1() {
        return (AtomSiteLabelCompId1) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_1",
                AtomSiteLabelCompId1::new) : getBinaryColumn("atom_site_label_comp_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqId1
     */
    public AtomSiteLabelSeqId1 getAtomSiteLabelSeqId1() {
        return (AtomSiteLabelSeqId1) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_1",
                AtomSiteLabelSeqId1::new) : getBinaryColumn("atom_site_label_seq_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymId1
     */
    public AtomSiteLabelAsymId1 getAtomSiteLabelAsymId1() {
        return (AtomSiteLabelAsymId1) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_1",
                AtomSiteLabelAsymId1::new) : getBinaryColumn("atom_site_label_asym_id_1"));
    }

    /**
     * The identifier of the second of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteId2
     */
    public AtomSiteId2 getAtomSiteId2() {
        return (AtomSiteId2) (isText ? textFields.computeIfAbsent("atom_site_id_2",
                AtomSiteId2::new) : getBinaryColumn("atom_site_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltId2
     */
    public AtomSiteLabelAltId2 getAtomSiteLabelAltId2() {
        return (AtomSiteLabelAltId2) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_2",
                AtomSiteLabelAltId2::new) : getBinaryColumn("atom_site_label_alt_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomId2
     */
    public AtomSiteLabelAtomId2 getAtomSiteLabelAtomId2() {
        return (AtomSiteLabelAtomId2) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_2",
                AtomSiteLabelAtomId2::new) : getBinaryColumn("atom_site_label_atom_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompId2
     */
    public AtomSiteLabelCompId2 getAtomSiteLabelCompId2() {
        return (AtomSiteLabelCompId2) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_2",
                AtomSiteLabelCompId2::new) : getBinaryColumn("atom_site_label_comp_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqId2
     */
    public AtomSiteLabelSeqId2 getAtomSiteLabelSeqId2() {
        return (AtomSiteLabelSeqId2) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_2",
                AtomSiteLabelSeqId2::new) : getBinaryColumn("atom_site_label_seq_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymId2
     */
    public AtomSiteLabelAsymId2 getAtomSiteLabelAsymId2() {
        return (AtomSiteLabelAsymId2) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_2",
                AtomSiteLabelAsymId2::new) : getBinaryColumn("atom_site_label_asym_id_2"));
    }

    /**
     * The identifier of the third of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteId3
     */
    public AtomSiteId3 getAtomSiteId3() {
        return (AtomSiteId3) (isText ? textFields.computeIfAbsent("atom_site_id_3",
                AtomSiteId3::new) : getBinaryColumn("atom_site_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltId3
     */
    public AtomSiteLabelAltId3 getAtomSiteLabelAltId3() {
        return (AtomSiteLabelAltId3) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_3",
                AtomSiteLabelAltId3::new) : getBinaryColumn("atom_site_label_alt_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomId3
     */
    public AtomSiteLabelAtomId3 getAtomSiteLabelAtomId3() {
        return (AtomSiteLabelAtomId3) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_3",
                AtomSiteLabelAtomId3::new) : getBinaryColumn("atom_site_label_atom_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompId3
     */
    public AtomSiteLabelCompId3 getAtomSiteLabelCompId3() {
        return (AtomSiteLabelCompId3) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_3",
                AtomSiteLabelCompId3::new) : getBinaryColumn("atom_site_label_comp_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqId3
     */
    public AtomSiteLabelSeqId3 getAtomSiteLabelSeqId3() {
        return (AtomSiteLabelSeqId3) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_3",
                AtomSiteLabelSeqId3::new) : getBinaryColumn("atom_site_label_seq_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymId3
     */
    public AtomSiteLabelAsymId3 getAtomSiteLabelAsymId3() {
        return (AtomSiteLabelAsymId3) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_3",
                AtomSiteLabelAsymId3::new) : getBinaryColumn("atom_site_label_asym_id_3"));
    }

    /**
     * The identifier of the fourth of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return AtomSiteId4
     */
    public AtomSiteId4 getAtomSiteId4() {
        return (AtomSiteId4) (isText ? textFields.computeIfAbsent("atom_site_id_4",
                AtomSiteId4::new) : getBinaryColumn("atom_site_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAltId4
     */
    public AtomSiteLabelAltId4 getAtomSiteLabelAltId4() {
        return (AtomSiteLabelAltId4) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_4",
                AtomSiteLabelAltId4::new) : getBinaryColumn("atom_site_label_alt_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAtomId4
     */
    public AtomSiteLabelAtomId4 getAtomSiteLabelAtomId4() {
        return (AtomSiteLabelAtomId4) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_4",
                AtomSiteLabelAtomId4::new) : getBinaryColumn("atom_site_label_atom_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelCompId4
     */
    public AtomSiteLabelCompId4 getAtomSiteLabelCompId4() {
        return (AtomSiteLabelCompId4) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_4",
                AtomSiteLabelCompId4::new) : getBinaryColumn("atom_site_label_comp_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelSeqId4
     */
    public AtomSiteLabelSeqId4 getAtomSiteLabelSeqId4() {
        return (AtomSiteLabelSeqId4) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_4",
                AtomSiteLabelSeqId4::new) : getBinaryColumn("atom_site_label_seq_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteLabelAsymId4
     */
    public AtomSiteLabelAsymId4 getAtomSiteLabelAsymId4() {
        return (AtomSiteLabelAsymId4) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_4",
                AtomSiteLabelAsymId4::new) : getBinaryColumn("atom_site_label_asym_id_4"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomId1
     */
    public AtomSiteAuthAtomId1 getAtomSiteAuthAtomId1() {
        return (AtomSiteAuthAtomId1) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_1",
                AtomSiteAuthAtomId1::new) : getBinaryColumn("atom_site_auth_atom_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymId1
     */
    public AtomSiteAuthAsymId1 getAtomSiteAuthAsymId1() {
        return (AtomSiteAuthAsymId1) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_1",
                AtomSiteAuthAsymId1::new) : getBinaryColumn("atom_site_auth_asym_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompId1
     */
    public AtomSiteAuthCompId1 getAtomSiteAuthCompId1() {
        return (AtomSiteAuthCompId1) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_1",
                AtomSiteAuthCompId1::new) : getBinaryColumn("atom_site_auth_comp_id_1"));
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqId1
     */
    public AtomSiteAuthSeqId1 getAtomSiteAuthSeqId1() {
        return (AtomSiteAuthSeqId1) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_1",
                AtomSiteAuthSeqId1::new) : getBinaryColumn("atom_site_auth_seq_id_1"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomId2
     */
    public AtomSiteAuthAtomId2 getAtomSiteAuthAtomId2() {
        return (AtomSiteAuthAtomId2) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_2",
                AtomSiteAuthAtomId2::new) : getBinaryColumn("atom_site_auth_atom_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymId2
     */
    public AtomSiteAuthAsymId2 getAtomSiteAuthAsymId2() {
        return (AtomSiteAuthAsymId2) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_2",
                AtomSiteAuthAsymId2::new) : getBinaryColumn("atom_site_auth_asym_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompId2
     */
    public AtomSiteAuthCompId2 getAtomSiteAuthCompId2() {
        return (AtomSiteAuthCompId2) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_2",
                AtomSiteAuthCompId2::new) : getBinaryColumn("atom_site_auth_comp_id_2"));
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqId2
     */
    public AtomSiteAuthSeqId2 getAtomSiteAuthSeqId2() {
        return (AtomSiteAuthSeqId2) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_2",
                AtomSiteAuthSeqId2::new) : getBinaryColumn("atom_site_auth_seq_id_2"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomId3
     */
    public AtomSiteAuthAtomId3 getAtomSiteAuthAtomId3() {
        return (AtomSiteAuthAtomId3) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_3",
                AtomSiteAuthAtomId3::new) : getBinaryColumn("atom_site_auth_atom_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymId3
     */
    public AtomSiteAuthAsymId3 getAtomSiteAuthAsymId3() {
        return (AtomSiteAuthAsymId3) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_3",
                AtomSiteAuthAsymId3::new) : getBinaryColumn("atom_site_auth_asym_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompId3
     */
    public AtomSiteAuthCompId3 getAtomSiteAuthCompId3() {
        return (AtomSiteAuthCompId3) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_3",
                AtomSiteAuthCompId3::new) : getBinaryColumn("atom_site_auth_comp_id_3"));
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqId3
     */
    public AtomSiteAuthSeqId3 getAtomSiteAuthSeqId3() {
        return (AtomSiteAuthSeqId3) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_3",
                AtomSiteAuthSeqId3::new) : getBinaryColumn("atom_site_auth_seq_id_3"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAtomId4
     */
    public AtomSiteAuthAtomId4 getAtomSiteAuthAtomId4() {
        return (AtomSiteAuthAtomId4) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_4",
                AtomSiteAuthAtomId4::new) : getBinaryColumn("atom_site_auth_atom_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthAsymId4
     */
    public AtomSiteAuthAsymId4 getAtomSiteAuthAsymId4() {
        return (AtomSiteAuthAsymId4) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_4",
                AtomSiteAuthAsymId4::new) : getBinaryColumn("atom_site_auth_asym_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthCompId4
     */
    public AtomSiteAuthCompId4 getAtomSiteAuthCompId4() {
        return (AtomSiteAuthCompId4) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_4",
                AtomSiteAuthCompId4::new) : getBinaryColumn("atom_site_auth_comp_id_4"));
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AtomSiteAuthSeqId4
     */
    public AtomSiteAuthSeqId4 getAtomSiteAuthSeqId4() {
        return (AtomSiteAuthSeqId4) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_4",
                AtomSiteAuthSeqId4::new) : getBinaryColumn("atom_site_auth_seq_id_4"));
    }

    /**
     * The symmetry code of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return SiteSymmetry1
     */
    public SiteSymmetry1 getSiteSymmetry1() {
        return (SiteSymmetry1) (isText ? textFields.computeIfAbsent("site_symmetry_1",
                SiteSymmetry1::new) : getBinaryColumn("site_symmetry_1"));
    }

    /**
     * The symmetry code of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return SiteSymmetry2
     */
    public SiteSymmetry2 getSiteSymmetry2() {
        return (SiteSymmetry2) (isText ? textFields.computeIfAbsent("site_symmetry_2",
                SiteSymmetry2::new) : getBinaryColumn("site_symmetry_2"));
    }

    /**
     * The symmetry code of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return SiteSymmetry3
     */
    public SiteSymmetry3 getSiteSymmetry3() {
        return (SiteSymmetry3) (isText ? textFields.computeIfAbsent("site_symmetry_3",
                SiteSymmetry3::new) : getBinaryColumn("site_symmetry_3"));
    }

    /**
     * The symmetry code of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return SiteSymmetry4
     */
    public SiteSymmetry4 getSiteSymmetry4() {
        return (SiteSymmetry4) (isText ? textFields.computeIfAbsent("site_symmetry_4",
                SiteSymmetry4::new) : getBinaryColumn("site_symmetry_4"));
    }

    /**
     * The value of the torsion angle in degrees.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * The estimated standard deviation of _pdbx_virtual_torsion.value.
     * @return ValueEsd
     */
    public ValueEsd getValueEsd() {
        return (ValueEsd) (isText ? textFields.computeIfAbsent("value_esd",
                ValueEsd::new) : getBinaryColumn("value_esd"));
    }
}
