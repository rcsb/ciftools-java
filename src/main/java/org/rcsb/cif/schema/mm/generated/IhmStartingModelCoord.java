package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STARTING_MODEL_COORD category records the coordinates
 * for structural templates used as starting inputs in the integrative model
 * building tasks.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStartingModelCoord extends BaseCategory {
    public IhmStartingModelCoord(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStartingModelCoord(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStartingModelCoord(String name) {
        super(name);
    }

    /**
     * A unique identifier for this coordinate position.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * The group of atoms to which the atom site in the starting model belongs. This data
     * item is provided for compatibility with the original Protein Data Bank format,
     * and only for that purpose.
     * @return StrColumn
     */
    public StrColumn getGroupPDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_PDB", StrColumn::new) :
                getBinaryColumn("group_PDB"));
    }

    /**
     * The serial number for this coordinate position.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The atom type symbol(element symbol) corresponding to this coordinate position.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }

    /**
     * The entity identifier corresponding to this coordinate position.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The atom identifier/name corresponding to this coordinate position.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * The component identifier corresponding to this coordinate position.
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The sequence index corresponding this to coordinate position.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id", IntColumn::new) :
                getBinaryColumn("seq_id"));
    }

    /**
     * The asym/strand id corresponding to this coordinate position.
     * 
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The Cartesian X component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The Cartesian Y component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The Cartesian Z component corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The isotropic temperature factor corresponding to this coordinate position.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquiv() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_or_equiv", FloatColumn::new) :
                getBinaryColumn("B_iso_or_equiv"));
    }

    /**
     * The formal charge corresponding to this coordinate position.
     * @return IntColumn
     */
    public IntColumn getFormalCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("formal_charge", IntColumn::new) :
                getBinaryColumn("formal_charge"));
    }
}
