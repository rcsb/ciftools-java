package org.rcsb.cif.model.pdbxreferencemoleculeannotation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return FamilyPrdId
     */
    public FamilyPrdId getFamilyPrdId() {
        return (FamilyPrdId) (isText ? textFields.computeIfAbsent("family_prd_id",
                FamilyPrdId::new) : getBinaryColumn("family_prd_id"));
    }

    /**
     * This data item is a pointer to _pdbx_reference_molecule.prd_id in the
     * PDB_REFERENCE_MOLECULE category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * This data item distinguishes anotations for this entity.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * Text describing the annotation for this entity.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }

    /**
     * Type of annotation for this entity.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Text describing the experimentation or computational evidence for
     * the annotation.
     * @return Support
     */
    public Support getSupport() {
        return (Support) (isText ? textFields.computeIfAbsent("support",
                Support::new) : getBinaryColumn("support"));
    }

    /**
     * The source of the annoation for this entity.
     * @return Source
     */
    public Source getSource() {
        return (Source) (isText ? textFields.computeIfAbsent("source",
                Source::new) : getBinaryColumn("source"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return ChemCompId
     */
    public ChemCompId getChemCompId() {
        return (ChemCompId) (isText ? textFields.computeIfAbsent("chem_comp_id",
                ChemCompId::new) : getBinaryColumn("chem_comp_id"));
    }
}
