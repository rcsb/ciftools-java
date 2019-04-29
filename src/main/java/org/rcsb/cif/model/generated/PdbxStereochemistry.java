package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STEREOCHEMISTRY identify chiral
 * centers and associated chiral volumes.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStereochemistry extends BaseCategory {
    public PdbxStereochemistry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStereochemistry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStereochemistry(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_stereochemistry.id must uniquely identify
     * each item in the PDBX_STEREOCHEMISTRY list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
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
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id", StrColumn::new) :
                getBinaryColumn("label_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * Stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdU() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_u", StrColumn::new) :
                getBinaryColumn("label_atom_id_u"));
    }

    /**
     * Alt_id for stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdU() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_u", StrColumn::new) :
                getBinaryColumn("label_alt_id_u"));
    }

    /**
     * Stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdV() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_v", StrColumn::new) :
                getBinaryColumn("label_atom_id_v"));
    }

    /**
     * Alt_id for stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdV() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_v", StrColumn::new) :
                getBinaryColumn("label_alt_id_v"));
    }

    /**
     * Stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdW() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_w", StrColumn::new) :
                getBinaryColumn("label_atom_id_w"));
    }

    /**
     * Alt_id for stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdW() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_w", StrColumn::new) :
                getBinaryColumn("label_alt_id_w"));
    }

    /**
     * Chiral volume in degrees.  (U x V) * W
     * @return FloatColumn
     */
    public FloatColumn getVolume3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume3", FloatColumn::new) :
                getBinaryColumn("volume3"));
    }

    /**
     * Out-of-plane angle for neighbor W
     * @return FloatColumn
     */
    public FloatColumn getAngleOutOfPlane() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_out_of_plane", FloatColumn::new) :
                getBinaryColumn("angle_out_of_plane"));
    }
}
