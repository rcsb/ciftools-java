package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTRY_DETAILS category provide additional
 * details about this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntryDetails extends DelegatingCategory {
    public PdbxEntryDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "nonpolymer_details":
                return getNonpolymerDetails();
            case "sequence_details":
                return getSequenceDetails();
            case "compound_details":
                return getCompoundDetails();
            case "source_details":
                return getSourceDetails();
            case "has_ligand_of_interest":
                return getHasLigandOfInterest();
            case "has_protein_modification":
                return getHasProteinModification();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This item identifies the entry.  This is a reference to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the non-polymer components in this entry.
     * @return StrColumn
     */
    public StrColumn getNonpolymerDetails() {
        return delegate.getColumn("nonpolymer_details", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the sequence or sequence database correspondences
     * for this entry.
     * @return StrColumn
     */
    public StrColumn getSequenceDetails() {
        return delegate.getColumn("sequence_details", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the macromolecular compounds in this entry.
     * @return StrColumn
     */
    public StrColumn getCompoundDetails() {
        return delegate.getColumn("compound_details", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the source and taxonomy of the macromolecular
     * components in this entry.
     * @return StrColumn
     */
    public StrColumn getSourceDetails() {
        return delegate.getColumn("source_details", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if author has indicated that there are any or no ligands
     * that are the focus of research.
     * @return StrColumn
     */
    public StrColumn getHasLigandOfInterest() {
        return delegate.getColumn("has_ligand_of_interest", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the model contains any protein modifications.
     * @return StrColumn
     */
    public StrColumn getHasProteinModification() {
        return delegate.getColumn("has_protein_modification", DelegatingStrColumn::new);
    }

}