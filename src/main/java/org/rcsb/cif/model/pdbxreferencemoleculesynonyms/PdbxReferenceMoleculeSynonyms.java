package org.rcsb.cif.model.pdbxreferencemoleculesynonyms;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceMoleculeSynonyms extends BaseCategory {
    public PdbxReferenceMoleculeSynonyms(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeSynonyms(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeSynonyms(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return FamilyPrdId
     */
    public FamilyPrdId getFamilyPrdId() {
        return (FamilyPrdId) (isText ? textFields.computeIfAbsent("family_prd_id",
                FamilyPrdId::new) : getBinaryColumn("family_prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.ordinal is an ordinal
     * to distinguish synonyms for this entity.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * A synonym name for the entity.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The source of this synonym name for the entity.
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
