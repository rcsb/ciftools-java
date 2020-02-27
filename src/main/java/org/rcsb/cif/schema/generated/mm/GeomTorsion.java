package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the GEOM_TORSION category record details about
 * torsion angles as calculated from the
 * contents of the ATOM, CELL and SYMMETRY data.
 * 
 * The vector direction _geom_torsion.atom_site_id_2 to
 * _geom_torsion.atom_site_id_3 is the viewing direction, and the
 * torsion angle is the angle of twist required to superimpose the
 * projection of the vector between site 2 and site 1 onto the
 * projection of the vector between site 3 and site 4. Clockwise
 * torsions are positive, anticlockwise torsions are negative.
 * 
 * Ref: Klyne, W. &amp; Prelog, V. (1960). Experientia, 16, 521-523.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomTorsion extends DelegatingCategory {
    public GeomTorsion(Category delegate) {
        super(delegate);
    }

    /**
     * The identifier of the first of the four atom sites that define
     * the torsion angle.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return delegate.getColumn("atom_site_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId1() {
        return delegate.getColumn("atom_site_label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId1() {
        return delegate.getColumn("atom_site_label_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId1() {
        return delegate.getColumn("atom_site_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId1() {
        return delegate.getColumn("atom_site_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId1() {
        return delegate.getColumn("atom_site_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the second of the four atom sites that define
     * the torsion angle.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return delegate.getColumn("atom_site_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId2() {
        return delegate.getColumn("atom_site_label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId2() {
        return delegate.getColumn("atom_site_label_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId2() {
        return delegate.getColumn("atom_site_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId2() {
        return delegate.getColumn("atom_site_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId2() {
        return delegate.getColumn("atom_site_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the third of the four atom sites that define
     * the torsion angle.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId3() {
        return delegate.getColumn("atom_site_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId3() {
        return delegate.getColumn("atom_site_label_alt_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId3() {
        return delegate.getColumn("atom_site_label_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId3() {
        return delegate.getColumn("atom_site_label_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId3() {
        return delegate.getColumn("atom_site_label_seq_id_3", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId3() {
        return delegate.getColumn("atom_site_label_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the fourth of the four atom sites that define
     * the torsion angle.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId4() {
        return delegate.getColumn("atom_site_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId4() {
        return delegate.getColumn("atom_site_label_alt_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId4() {
        return delegate.getColumn("atom_site_label_atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId4() {
        return delegate.getColumn("atom_site_label_comp_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId4() {
        return delegate.getColumn("atom_site_label_seq_id_4", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId4() {
        return delegate.getColumn("atom_site_label_asym_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId1() {
        return delegate.getColumn("atom_site_auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId1() {
        return delegate.getColumn("atom_site_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId1() {
        return delegate.getColumn("atom_site_auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId1() {
        return delegate.getColumn("atom_site_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId2() {
        return delegate.getColumn("atom_site_auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId2() {
        return delegate.getColumn("atom_site_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId2() {
        return delegate.getColumn("atom_site_auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId2() {
        return delegate.getColumn("atom_site_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId3() {
        return delegate.getColumn("atom_site_auth_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId3() {
        return delegate.getColumn("atom_site_auth_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId3() {
        return delegate.getColumn("atom_site_auth_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId3() {
        return delegate.getColumn("atom_site_auth_seq_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId4() {
        return delegate.getColumn("atom_site_auth_atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId4() {
        return delegate.getColumn("atom_site_auth_asym_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId4() {
        return delegate.getColumn("atom_site_auth_comp_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId4() {
        return delegate.getColumn("atom_site_auth_seq_id_4", DelegatingStrColumn::new);
    }

    /**
     * This code signals whether the torsion angle is referred to in a
     * publication or should be placed in a table of significant
     * torsion angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return delegate.getColumn("publ_flag", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the first of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the second of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the third of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry3() {
        return delegate.getColumn("site_symmetry_3", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the fourth of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry4() {
        return delegate.getColumn("site_symmetry_4", DelegatingStrColumn::new);
    }

    /**
     * The value of the torsion angle in degrees.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_torsion.value.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return delegate.getColumn("value_esd", DelegatingFloatColumn::new);
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
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode3() {
        return delegate.getColumn("pdbx_atom_site_PDB_ins_code_3", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode4() {
        return delegate.getColumn("pdbx_atom_site_PDB_ins_code_4", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return delegate.getColumn("pdbx_PDB_model_num", DelegatingIntColumn::new);
    }
}
