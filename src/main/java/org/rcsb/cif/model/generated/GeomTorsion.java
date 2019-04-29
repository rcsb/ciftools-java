package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
 * Ref: Klyne, W. & Prelog, V. (1960). Experientia, 16, 521-523.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GeomTorsion extends BaseCategory {
    public GeomTorsion(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public GeomTorsion(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public GeomTorsion(String name) {
        super(name);
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_1", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_2", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_3"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_3", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_4"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_4", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_3", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_4"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_4", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_4"));
    }

    /**
     * This code signals whether the torsion angle is referred to in a
     * publication or should be placed in a table of significant
     * torsion angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("publ_flag", StrColumn::new) :
                getBinaryColumn("publ_flag"));
    }

    /**
     * The symmetry code of the first of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_1", StrColumn::new) :
                getBinaryColumn("site_symmetry_1"));
    }

    /**
     * The symmetry code of the second of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_2", StrColumn::new) :
                getBinaryColumn("site_symmetry_2"));
    }

    /**
     * The symmetry code of the third of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_3", StrColumn::new) :
                getBinaryColumn("site_symmetry_3"));
    }

    /**
     * The symmetry code of the fourth of the four atom sites that
     * define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry4() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_4", StrColumn::new) :
                getBinaryColumn("site_symmetry_4"));
    }

    /**
     * The value of the torsion angle in degrees.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value", FloatColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_torsion.value.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_esd", FloatColumn::new) :
                getBinaryColumn("value_esd"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_site_PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("pdbx_atom_site_PDB_ins_code_1"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_site_PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("pdbx_atom_site_PDB_ins_code_2"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_site_PDB_ins_code_3", StrColumn::new) :
                getBinaryColumn("pdbx_atom_site_PDB_ins_code_3"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomSitePDBInsCode4() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_site_PDB_ins_code_4", StrColumn::new) :
                getBinaryColumn("pdbx_atom_site_PDB_ins_code_4"));
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_model_num"));
    }
}
