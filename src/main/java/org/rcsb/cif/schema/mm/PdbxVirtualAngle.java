package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VIRTUAL_ANGLE category record details about the
 * molecular virtual angles, as calculated from the contents
 * of the ATOM, CELL, and SYMMETRY data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxVirtualAngle extends DelegatingCategory {
    public PdbxVirtualAngle(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "atom_site_id_1":
                return getAtomSiteId1();
            case "atom_site_label_alt_id_1":
                return getAtomSiteLabelAltId1();
            case "atom_site_label_atom_id_1":
                return getAtomSiteLabelAtomId1();
            case "atom_site_label_comp_id_1":
                return getAtomSiteLabelCompId1();
            case "atom_site_label_seq_id_1":
                return getAtomSiteLabelSeqId1();
            case "atom_site_label_asym_id_1":
                return getAtomSiteLabelAsymId1();
            case "atom_site_id_2":
                return getAtomSiteId2();
            case "atom_site_label_alt_id_2":
                return getAtomSiteLabelAltId2();
            case "atom_site_label_atom_id_2":
                return getAtomSiteLabelAtomId2();
            case "atom_site_label_comp_id_2":
                return getAtomSiteLabelCompId2();
            case "atom_site_label_seq_id_2":
                return getAtomSiteLabelSeqId2();
            case "atom_site_label_asym_id_2":
                return getAtomSiteLabelAsymId2();
            case "atom_site_id_3":
                return getAtomSiteId3();
            case "atom_site_label_alt_id_3":
                return getAtomSiteLabelAltId3();
            case "atom_site_label_atom_id_3":
                return getAtomSiteLabelAtomId3();
            case "atom_site_label_comp_id_3":
                return getAtomSiteLabelCompId3();
            case "atom_site_label_seq_id_3":
                return getAtomSiteLabelSeqId3();
            case "atom_site_label_asym_id_3":
                return getAtomSiteLabelAsymId3();
            case "atom_site_auth_asym_id_1":
                return getAtomSiteAuthAsymId1();
            case "atom_site_auth_atom_id_1":
                return getAtomSiteAuthAtomId1();
            case "atom_site_auth_comp_id_1":
                return getAtomSiteAuthCompId1();
            case "atom_site_auth_seq_id_1":
                return getAtomSiteAuthSeqId1();
            case "atom_site_auth_atom_id_2":
                return getAtomSiteAuthAtomId2();
            case "atom_site_auth_asym_id_2":
                return getAtomSiteAuthAsymId2();
            case "atom_site_auth_comp_id_2":
                return getAtomSiteAuthCompId2();
            case "atom_site_auth_seq_id_2":
                return getAtomSiteAuthSeqId2();
            case "atom_site_auth_atom_id_3":
                return getAtomSiteAuthAtomId3();
            case "atom_site_auth_asym_id_3":
                return getAtomSiteAuthAsymId3();
            case "atom_site_auth_comp_id_3":
                return getAtomSiteAuthCompId3();
            case "atom_site_auth_seq_id_3":
                return getAtomSiteAuthSeqId3();
            case "site_symmetry_1":
                return getSiteSymmetry1();
            case "site_symmetry_2":
                return getSiteSymmetry2();
            case "site_symmetry_3":
                return getSiteSymmetry3();
            case "value":
                return getValue();
            case "value_esd":
                return getValueEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the first of the three atom sites that define
     * the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return delegate.getColumn("atom_site_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId1() {
        return delegate.getColumn("atom_site_label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId1() {
        return delegate.getColumn("atom_site_label_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId1() {
        return delegate.getColumn("atom_site_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId1() {
        return delegate.getColumn("atom_site_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId1() {
        return delegate.getColumn("atom_site_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the second of the three atom sites that define
     * the angle specified by _pdbx_virtual_angle.value. The second atom is
     * taken to be the apex of the angle.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return delegate.getColumn("atom_site_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId2() {
        return delegate.getColumn("atom_site_label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId2() {
        return delegate.getColumn("atom_site_label_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId2() {
        return delegate.getColumn("atom_site_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId2() {
        return delegate.getColumn("atom_site_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId2() {
        return delegate.getColumn("atom_site_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the third of the three atom sites that define
     * the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId3() {
        return delegate.getColumn("atom_site_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId3() {
        return delegate.getColumn("atom_site_label_alt_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId3() {
        return delegate.getColumn("atom_site_label_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId3() {
        return delegate.getColumn("atom_site_label_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId3() {
        return delegate.getColumn("atom_site_label_seq_id_3", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId3() {
        return delegate.getColumn("atom_site_label_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId1() {
        return delegate.getColumn("atom_site_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId1() {
        return delegate.getColumn("atom_site_auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId1() {
        return delegate.getColumn("atom_site_auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId1() {
        return delegate.getColumn("atom_site_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId2() {
        return delegate.getColumn("atom_site_auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId2() {
        return delegate.getColumn("atom_site_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId2() {
        return delegate.getColumn("atom_site_auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the three atom sites
     * that define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId2() {
        return delegate.getColumn("atom_site_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId3() {
        return delegate.getColumn("atom_site_auth_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId3() {
        return delegate.getColumn("atom_site_auth_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId3() {
        return delegate.getColumn("atom_site_auth_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId3() {
        return delegate.getColumn("atom_site_auth_seq_id_3", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the first of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the second of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the third of the three atom sites that
     * define the angle specified by _pdbx_virtual_angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry3() {
        return delegate.getColumn("site_symmetry_3", DelegatingStrColumn::new);
    }

    /**
     * Angle in degrees bounded by the three sites
     * _pdbx_virtual_angle.atom_site_id_1, _pdbx_virtual_angle.atom_site_id_2 and
     * _pdbx_virtual_angle.atom_site_id_3.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_virtual_angle.value.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return delegate.getColumn("value_esd", DelegatingFloatColumn::new);
    }

}