package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
 * details of the structural examples in related databases for this entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeRelatedStructures extends DelegatingCategory {
    public PdbxReferenceMoleculeRelatedStructures(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "family_prd_id":
                return getFamilyPrdId();
            case "ordinal":
                return getOrdinal();
            case "db_name":
                return getDbName();
            case "db_code":
                return getDbCode();
            case "db_accession":
                return getDbAccession();
            case "name":
                return getName();
            case "formula":
                return getFormula();
            case "citation_id":
                return getCitationId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_molecule_related_structures.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_related_structures.ordinal distinguishes
     * related structural data for each entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The database name for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The database identifier code for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }

    /**
     * The database accession code for the related structure reference.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return delegate.getColumn("db_accession", DelegatingStrColumn::new);
    }

    /**
     * The chemical name for the structure entry in the related database
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
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
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * A link to related reference information in the citation category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

}