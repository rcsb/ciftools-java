package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
 * related to PDB citation data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferencePublicationList extends DelegatingCategory {
    public PdbxReferencePublicationList(Category delegate) {
        super(delegate);
    }

    /**
     * Abbreviated name of the reference publication.
     * @return StrColumn
     */
    public StrColumn getPublicationAbbrev() {
        return delegate.getColumn("publication_abbrev", DelegatingStrColumn::new);
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * type.
     * @return StrColumn
     */
    public StrColumn getASTMCodeType() {
        return delegate.getColumn("ASTM_code_type", DelegatingStrColumn::new);
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assignment.
     * @return StrColumn
     */
    public StrColumn getASTMCodeValue() {
        return delegate.getColumn("ASTM_code_value", DelegatingStrColumn::new);
    }

    /**
     * The International Standard Serial Number (ISSN/ISBN/ESSN) code type.
     * @return StrColumn
     */
    public StrColumn getISSNCodeType() {
        return delegate.getColumn("ISSN_code_type", DelegatingStrColumn::new);
    }

    /**
     * The International Standard Serial Number (ISSN) code value.
     * @return StrColumn
     */
    public StrColumn getISSNCodeValue() {
        return delegate.getColumn("ISSN_code_value", DelegatingStrColumn::new);
    }

    /**
     * The country of publication.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return delegate.getColumn("country", DelegatingStrColumn::new);
    }

    /**
     * Year in which publications began operation..
     * @return StrColumn
     */
    public StrColumn getStartYear() {
        return delegate.getColumn("start_year", DelegatingStrColumn::new);
    }

    /**
     * Year in which publication terminated operation.
     * @return StrColumn
     */
    public StrColumn getEndYear() {
        return delegate.getColumn("end_year", DelegatingStrColumn::new);
    }
}
