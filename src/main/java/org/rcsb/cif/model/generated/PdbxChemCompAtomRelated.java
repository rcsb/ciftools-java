package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * PDBX_CHEM_COMP_ATOM_RELATED provides atom level nomenclature mapping between two related chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompAtomRelated extends BaseCategory {
    public PdbxChemCompAtomRelated(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompAtomRelated(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompAtomRelated(String name) {
        super(name);
    }

    /**
     * The chemical component for which this relationship applies.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The related chemical component for which this chemical component is based.
     * @return StrColumn
     */
    public StrColumn getRelatedCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_comp_id", StrColumn::new) :
                getBinaryColumn("related_comp_id"));
    }

    /**
     * 
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The atom identifier/name for the atom mapping
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * The atom identifier/name for the atom mapping in the related chemical component
     * @return StrColumn
     */
    public StrColumn getRelatedAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_atom_id", StrColumn::new) :
                getBinaryColumn("related_atom_id"));
    }

    /**
     * Describes the type of relationship
     * @return StrColumn
     */
    public StrColumn getRelatedType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("related_type", StrColumn::new) :
                getBinaryColumn("related_type"));
    }
}
