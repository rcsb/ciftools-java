package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STEREOCHEMISTRY identify chiral
 * centers and associated chiral volumes.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStereochemistry extends DelegatingCategory {
    public PdbxStereochemistry(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_stereochemistry.id must uniquely identify
     * each item in the PDBX_STEREOCHEMISTRY list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdU() {
        return delegate.getColumn("label_atom_id_u", DelegatingStrColumn::new);
    }

    /**
     * Alt_id for stereochemically related atom U.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdU() {
        return delegate.getColumn("label_alt_id_u", DelegatingStrColumn::new);
    }

    /**
     * Stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdV() {
        return delegate.getColumn("label_atom_id_v", DelegatingStrColumn::new);
    }

    /**
     * Alt_id for stereochemically related atom V.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdV() {
        return delegate.getColumn("label_alt_id_v", DelegatingStrColumn::new);
    }

    /**
     * Stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomIdW() {
        return delegate.getColumn("label_atom_id_w", DelegatingStrColumn::new);
    }

    /**
     * Alt_id for stereochemically related atom W.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltIdW() {
        return delegate.getColumn("label_alt_id_w", DelegatingStrColumn::new);
    }

    /**
     * Chiral volume in degrees.  (U x V) * W
     * @return FloatColumn
     */
    public FloatColumn getVolume3() {
        return delegate.getColumn("volume3", DelegatingFloatColumn::new);
    }

    /**
     * Out-of-plane angle for neighbor W
     * @return FloatColumn
     */
    public FloatColumn getAngleOutOfPlane() {
        return delegate.getColumn("angle_out_of_plane", DelegatingFloatColumn::new);
    }
}
