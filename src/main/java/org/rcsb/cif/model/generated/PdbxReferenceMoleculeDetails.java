package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
 * textual details about small polymer molecules.
 */
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
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_details.prd_id is a reference to
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_details.ordinal is an ordinal that
     * distinguishes each descriptive text for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * A data source of this information (e.g. PubMed, Merck Index)
     * @return StrColumn
     */
    public StrColumn getSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source", StrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * A identifier within the data source for this information.
     * @return StrColumn
     */
    public StrColumn getSourceId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_id", StrColumn::new) :
                getBinaryColumn("source_id"));
    }

    /**
     * The text of the description of special aspects of the entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
