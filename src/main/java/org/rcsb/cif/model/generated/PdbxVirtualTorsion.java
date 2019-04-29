package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VIRTUAL_TORSION category record details about
 * virtual torsion angles, as calculated from the contents of the ATOM,
 * CELL, and SYMMETRY data.
 */
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
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The identifier of the first of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * The symmetry code of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_1", StrColumn::new) :
                getBinaryColumn("site_symmetry_1"));
    }

    /**
     * The symmetry code of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_2", StrColumn::new) :
                getBinaryColumn("site_symmetry_2"));
    }

    /**
     * The symmetry code of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("site_symmetry_3", StrColumn::new) :
                getBinaryColumn("site_symmetry_3"));
    }

    /**
     * The symmetry code of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
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
     * The estimated standard deviation of _pdbx_virtual_torsion.value.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_esd", FloatColumn::new) :
                getBinaryColumn("value_esd"));
    }
}
