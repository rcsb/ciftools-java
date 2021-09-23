package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_POLY category record details about
 * the polymeric structural templates used in homology/comparative modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplatePoly extends DelegatingCategory {
    public MaTemplatePoly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "template_id":
                return getTemplateId();
            case "seq_one_letter_code":
                return getSeqOneLetterCode();
            case "seq_one_letter_code_can":
                return getSeqOneLetterCodeCan();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the template.
     * This data item is a pointer to _ma_template_details.template_id
     * in the MA_TEMPLATE_DETAILS caategory.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * Chemical sequence of the template expressed as string of one-letter amino acid / nucleotide codes.
     * Modifications and non-standard amino acids are included as three-letter codes within parentheses.
     * @return StrColumn
     */
    public StrColumn getSeqOneLetterCode() {
        return delegate.getColumn("seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * The canonical chemical sequence of the template expressed as string of one-letter amino acid / nucleotide codes.
     * Modifications are coded as the parent amino acid / nucleotide where possible.
     * @return StrColumn
     */
    public StrColumn getSeqOneLetterCodeCan() {
        return delegate.getColumn("seq_one_letter_code_can", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the polymeric template.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}