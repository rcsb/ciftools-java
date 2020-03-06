package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STARTING_MODEL_COORD category records the coordinates
 * for structural templates used as starting inputs in the integrative model
 * building tasks.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStartingModelCoord extends DelegatingCategory {
    public IhmStartingModelCoord(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "starting_model_id":
                return getStartingModelId();
            case "group_PDB":
                return getGroupPDB();
            case "id":
                return getId();
            case "type_symbol":
                return getTypeSymbol();
            case "entity_id":
                return getEntityId();
            case "atom_id":
                return getAtomId();
            case "comp_id":
                return getCompId();
            case "seq_id":
                return getSeqId();
            case "asym_id":
                return getAsymId();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "B_iso_or_equiv":
                return getBIsoOrEquiv();
            case "formal_charge":
                return getFormalCharge();
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
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
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
     * The serial number for this coordinate position.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
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
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name corresponding to this coordinate position.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier corresponding to this coordinate position.
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence index corresponding this to coordinate position.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The asym/strand id corresponding to this coordinate position.
     * 
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
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

}