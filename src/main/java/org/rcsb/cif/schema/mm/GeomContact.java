package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the GEOM_CONTACT category record details about
 * interatomic contacts as calculated from the contents
 * of the ATOM, CELL and SYMMETRY data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomContact extends DelegatingCategory {
    public GeomContact(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
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
            case "atom_site_auth_atom_id_1":
                return getAtomSiteAuthAtomId1();
            case "atom_site_auth_asym_id_1":
                return getAtomSiteAuthAsymId1();
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
            case "dist":
                return getDist();
            case "dist_esd":
                return getDistEsd();
            case "publ_flag":
                return getPublFlag();
            case "site_symmetry_1":
                return getSiteSymmetry1();
            case "site_symmetry_2":
                return getSiteSymmetry2();
            case "pdbx_atom_site_PDB_ins_code_1":
                return getPdbxAtomSitePDBInsCode1();
            case "pdbx_atom_site_PDB_ins_code_2":
                return getPdbxAtomSitePDBInsCode2();
            case "pdbx_PDB_model_num":
                return getPdbxPDBModelNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The identifier of the first of the two atom sites that define the
     * contact.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return delegate.getColumn("atom_site_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId1() {
        return delegate.getColumn("atom_site_label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId1() {
        return delegate.getColumn("atom_site_label_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId1() {
        return delegate.getColumn("atom_site_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId1() {
        return delegate.getColumn("atom_site_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId1() {
        return delegate.getColumn("atom_site_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the second of the two atom sites that define
     * the contact.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return delegate.getColumn("atom_site_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId2() {
        return delegate.getColumn("atom_site_label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId2() {
        return delegate.getColumn("atom_site_label_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId2() {
        return delegate.getColumn("atom_site_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId2() {
        return delegate.getColumn("atom_site_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId2() {
        return delegate.getColumn("atom_site_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId1() {
        return delegate.getColumn("atom_site_auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId1() {
        return delegate.getColumn("atom_site_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId1() {
        return delegate.getColumn("atom_site_auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId1() {
        return delegate.getColumn("atom_site_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId2() {
        return delegate.getColumn("atom_site_auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId2() {
        return delegate.getColumn("atom_site_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId2() {
        return delegate.getColumn("atom_site_auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atom sites that
     * define the contact.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId2() {
        return delegate.getColumn("atom_site_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * The interatomic contact distance in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return delegate.getColumn("dist", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_contact.dist.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return delegate.getColumn("dist_esd", DelegatingFloatColumn::new);
    }

    /**
     * This code signals whether the contact distance is referred to
     * in a publication or should be placed in a list of significant
     * contact distances.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return delegate.getColumn("publ_flag", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the first of the two atom sites that
     * define the contact.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the second of the two atom sites that
     * define the contact.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode1() {
        return delegate.getColumn("pdbx_atom_site_PDB_ins_code_1", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode2() {
        return delegate.getColumn("pdbx_atom_site_PDB_ins_code_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return delegate.getColumn("pdbx_PDB_model_num", DelegatingIntColumn::new);
    }

}