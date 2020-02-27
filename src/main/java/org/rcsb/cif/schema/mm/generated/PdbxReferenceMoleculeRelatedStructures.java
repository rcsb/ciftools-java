package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
 * details of the structural examples in related databases for this entity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceMoleculeRelatedStructures extends BaseCategory {
    public PdbxReferenceMoleculeRelatedStructures(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeRelatedStructures(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeRelatedStructures(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule_related_structures.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_related_structures.ordinal distinguishes
     * related structural data for each entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The database name for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The database identifier code for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_code", StrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The database accession code for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_accession", StrColumn::new) :
                getBinaryColumn("db_accession"));
    }

    /**
     * The chemical name for the structure entry in the related database
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The formula for the reference entity. Formulae are written
     * according to the rules:
     * 
     * 1. Only recognised element symbols may be used.
     * 
     * 2. Each element symbol is followed by a 'count' number. A count
     * of '1' may be omitted.
     * 
     * 3. A space or parenthesis must separate each element symbol and
     * its count, but in general parentheses are not used.
     * 
     * 4. The order of elements depends on whether or not carbon is
     * present. If carbon is present, the order should be: C, then
     * H, then the other elements in alphabetical order of their
     * symbol. If carbon is not present, the elements are listed
     * purely in alphabetic order of their symbol. This is the
     * 'Hill' system used by Chemical Abstracts.
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("formula", StrColumn::new) :
                getBinaryColumn("formula"));
    }

    /**
     * A link to related reference information in the citation category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }
}
