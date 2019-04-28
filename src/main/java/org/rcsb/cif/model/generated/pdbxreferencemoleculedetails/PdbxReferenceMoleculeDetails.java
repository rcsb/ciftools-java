package org.rcsb.cif.model.generated.pdbxreferencemoleculedetails;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceMoleculeDetails extends BaseCategory {
    public PdbxReferenceMoleculeDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeDetails(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule_details.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id' in category PDBX_REFERENCE_MOLECULE_FAMILY.
     * @return FamilyPrdId
     */
    public FamilyPrdId getFamilyPrdId() {
        return (FamilyPrdId) (isText ? textFields.computeIfAbsent("family_prd_id",
                FamilyPrdId::new) : getBinaryColumn("family_prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_details.prd_id is a reference to
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_details.ordinal is an ordinal that
     * distinguishes each descriptive text for this entity.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * A data source of this information (e.g. PubMed, Merck Index)
     * @return Source
     */
    public Source getSource() {
        return (Source) (isText ? textFields.computeIfAbsent("source",
                Source::new) : getBinaryColumn("source"));
    }

    /**
     * A identifier within the data source for this information.
     * @return SourceId
     */
    public SourceId getSourceId() {
        return (SourceId) (isText ? textFields.computeIfAbsent("source_id",
                SourceId::new) : getBinaryColumn("source_id"));
    }

    /**
     * The text of the description of special aspects of the entity.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
