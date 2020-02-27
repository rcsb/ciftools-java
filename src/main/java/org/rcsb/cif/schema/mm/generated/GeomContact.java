package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the GEOM_CONTACT category record details about
 * interatomic contacts as calculated from the contents
 * of the ATOM, CELL and SYMMETRY data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class GeomContact extends BaseCategory {
    public GeomContact(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public GeomContact(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public GeomContact(String name) {
        super(name);
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_1"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_1", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_alt_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_alt_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_atom_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_comp_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_comp_id_2"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("atom_site_label_seq_id_2", IntColumn::new) :
                getBinaryColumn("atom_site_label_seq_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_label_asym_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_label_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_atom_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_asym_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_comp_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_site_auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("atom_site_auth_seq_id_2"));
    }

    /**
     * The interatomic contact distance in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist", FloatColumn::new) :
                getBinaryColumn("dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _geom_contact.dist.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_esd", FloatColumn::new) :
                getBinaryColumn("dist_esd"));
    }

    /**
     * This code signals whether the contact distance is referred to
     * in a publication or should be placed in a list of significant
     * contact distances.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("publ_flag", StrColumn::new) :
                getBinaryColumn("publ_flag"));
    }

    /**
     * The symmetry code of the first of the two atom sites that
     * define the contact.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_1", StrColumn::new) :
                getBinaryColumn("site_symmetry_1"));
    }

    /**
     * The symmetry code of the second of the two atom sites that
     * define the contact.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_2", StrColumn::new) :
                getBinaryColumn("site_symmetry_2"));
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
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_model_num"));
    }
}
