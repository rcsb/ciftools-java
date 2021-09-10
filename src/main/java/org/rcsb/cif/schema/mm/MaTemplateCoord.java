package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_COORD category records the coordinates
 * for customized structural templates used in model building. These are
 * provided by the user and not referenced from an existing database.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateCoord extends DelegatingCategory {
    public MaTemplateCoord(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "template_id":
                return getTemplateId();
            case "group_PDB":
                return getGroupPDB();
            case "type_symbol":
                return getTypeSymbol();
            case "label_entity_id":
                return getLabelEntityId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "label_asym_id":
                return getLabelAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "occupancy":
                return getOccupancy();
            case "B_iso_or_equiv":
                return getBIsoOrEquiv();
            case "formal_charge":
                return getFormalCharge();
            case "pdb_model_num":
                return getPdbModelNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this coordinate position.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the customized template structure.
     * This data item is a pointer to _ma_template_customized.template_id
     * in the MA_TEMPLATE_CUSTOMIZED category.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The group of atoms to which the atom site in the starting model belongs. This data
     * item is provided for compatibility with the original Protein Data Bank format,
     * and only for that purpose.
     * @return StrColumn
     */
    public StrColumn getGroupPDB() {
        return delegate.getColumn("group_PDB", DelegatingStrColumn::new);
    }

    /**
     * The atom type symbol(element symbol) corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getLabelEntityId() {
        return delegate.getColumn("label_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence index corresponding this to coordinate position.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The asym/strand id corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided sequence index corresponding this to coordinate position.
     * @return IntColumn
     */
    public IntColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The author provided atom identifier/name corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided component identifier corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided asym/strand id corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The Cartesian X component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Y component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Z component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return delegate.getColumn("occupancy", DelegatingFloatColumn::new);
    }

    /**
     * The isotropic temperature factor corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquiv() {
        return delegate.getColumn("B_iso_or_equiv", DelegatingFloatColumn::new);
    }

    /**
     * The formal charge corresponding to this coordinate position.
     * @return IntColumn
     */
    public IntColumn getFormalCharge() {
        return delegate.getColumn("formal_charge", DelegatingIntColumn::new);
    }

    /**
     * The PDB model number.
     * @return IntColumn
     */
    public IntColumn getPdbModelNum() {
        return delegate.getColumn("pdb_model_num", DelegatingIntColumn::new);
    }

}