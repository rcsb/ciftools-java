package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
 * additional annotation relevant to the molecular entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceMoleculeAnnotation extends BaseCategory {
    public PdbxReferenceMoleculeAnnotation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeAnnotation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeAnnotation(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule_annotation.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }

    /**
     * This data item is a pointer to _pdbx_reference_molecule.prd_id in the
     * PDB_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * This data item distinguishes anotations for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * Text describing the annotation for this entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }

    /**
     * Type of annotation for this entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Text describing the experimentation or computational evidence for
     * the annotation.
     * @return StrColumn
     */
    public StrColumn getSupport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("support", StrColumn::new) :
                getBinaryColumn("support"));
    }

    /**
     * The source of the annoation for this entity.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source", StrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chem_comp_id", StrColumn::new) :
                getBinaryColumn("chem_comp_id"));
    }
}
