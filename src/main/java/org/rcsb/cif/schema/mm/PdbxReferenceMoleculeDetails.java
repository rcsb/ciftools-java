package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
 * textual details about small polymer molecules.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeDetails extends DelegatingCategory {
    public PdbxReferenceMoleculeDetails(Category delegate) {
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
            case "source":
                return getSource();
            case "source_id":
                return getSourceId();
            case "text":
                return getText();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_molecule_details.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id' in category PDBX_REFERENCE_MOLECULE_FAMILY.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_details.prd_id is a reference to
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_details.ordinal is an ordinal that
     * distinguishes each descriptive text for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A data source of this information (e.g. PubMed, Merck Index)
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * A identifier within the data source for this information.
     * @return StrColumn
     */
    public StrColumn getSourceId() {
        return delegate.getColumn("source_id", DelegatingStrColumn::new);
    }

    /**
     * The text of the description of special aspects of the entity.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

}