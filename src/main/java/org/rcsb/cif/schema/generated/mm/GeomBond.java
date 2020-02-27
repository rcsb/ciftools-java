package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the GEOM_BOND category record details about
 * the bond lengths as calculated from the contents
 * of the ATOM, CELL and SYMMETRY data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomBond extends DelegatingCategory {
    public GeomBond(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier of the first of the two atom sites that define the
     * bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
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
     * define the bond.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId2() {
        return delegate.getColumn("atom_site_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * The intramolecular bond distance in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return delegate.getColumn("dist", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_bond.dist.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return delegate.getColumn("dist_esd", DelegatingFloatColumn::new);
    }

    /**
     * This code signals whether the bond distance is referred to in a
     * publication or should be placed in a list of significant bond
     * distances.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return delegate.getColumn("publ_flag", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the first of the two atom sites that
     * define the bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the second of the two atom sites that
     * define the bond.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * The bond valence calculated from _geom_bond.dist.
     * @return IntColumn
     */
    public IntColumn getValence() {
        return delegate.getColumn("valence", DelegatingIntColumn::new);
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
