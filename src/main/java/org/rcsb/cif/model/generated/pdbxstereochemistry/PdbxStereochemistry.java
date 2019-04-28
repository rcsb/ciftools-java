package org.rcsb.cif.model.generated.pdbxstereochemistry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * Stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomIdU
     */
    public LabelAtomIdU getLabelAtomIdU() {
        return (LabelAtomIdU) (isText ? textFields.computeIfAbsent("label_atom_id_u",
                LabelAtomIdU::new) : getBinaryColumn("label_atom_id_u"));
    }

    /**
     * Alt_id for stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltIdU
     */
    public LabelAltIdU getLabelAltIdU() {
        return (LabelAltIdU) (isText ? textFields.computeIfAbsent("label_alt_id_u",
                LabelAltIdU::new) : getBinaryColumn("label_alt_id_u"));
    }

    /**
     * Stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomIdV
     */
    public LabelAtomIdV getLabelAtomIdV() {
        return (LabelAtomIdV) (isText ? textFields.computeIfAbsent("label_atom_id_v",
                LabelAtomIdV::new) : getBinaryColumn("label_atom_id_v"));
    }

    /**
     * Alt_id for stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltIdV
     */
    public LabelAltIdV getLabelAltIdV() {
        return (LabelAltIdV) (isText ? textFields.computeIfAbsent("label_alt_id_v",
                LabelAltIdV::new) : getBinaryColumn("label_alt_id_v"));
    }

    /**
     * Stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomIdW
     */
    public LabelAtomIdW getLabelAtomIdW() {
        return (LabelAtomIdW) (isText ? textFields.computeIfAbsent("label_atom_id_w",
                LabelAtomIdW::new) : getBinaryColumn("label_atom_id_w"));
    }

    /**
     * Alt_id for stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltIdW
     */
    public LabelAltIdW getLabelAltIdW() {
        return (LabelAltIdW) (isText ? textFields.computeIfAbsent("label_alt_id_w",
                LabelAltIdW::new) : getBinaryColumn("label_alt_id_w"));
    }

    /**
     * Chiral volume in degrees.  (U x V) * W
     * @return Volume3
     */
    public Volume3 getVolume3() {
        return (Volume3) (isText ? textFields.computeIfAbsent("volume3",
                Volume3::new) : getBinaryColumn("volume3"));
    }

    /**
     * Out-of-plane angle for neighbor W
     * @return AngleOutOfPlane
     */
    public AngleOutOfPlane getAngleOutOfPlane() {
        return (AngleOutOfPlane) (isText ? textFields.computeIfAbsent("angle_out_of_plane",
                AngleOutOfPlane::new) : getBinaryColumn("angle_out_of_plane"));
    }
}
