package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records
 * synonym names for reference entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeSynonyms extends DelegatingCategory {
    public PdbxReferenceMoleculeSynonyms(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "family_prd_id":
                return getFamilyPrdId();
            case "prd_id":
                return getPrdId();
            case "ordinal":
                return getOrdinal();
            case "name":
                return getName();
            case "source":
                return getSource();
            case "chem_comp_id":
                return getChemCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_synonyms.ordinal is an ordinal
     * to distinguish synonyms for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A synonym name for the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The source of this synonym name for the entity.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return delegate.getColumn("chem_comp_id", DelegatingStrColumn::new);
    }

}