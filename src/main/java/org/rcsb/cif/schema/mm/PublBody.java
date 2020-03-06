package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PUBL_BODY category permit the labelling of
 * different text sections within the body of a paper.
 * Note that these should not be used in a paper which has
 * a standard format with sections tagged by specific data names
 * (such as in Acta Crystallographica Section C). Typically,
 * each journal will supply a list of the specific items it
 * requires in its Notes for Authors.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublBody extends DelegatingCategory {
    public PublBody(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "contents":
                return getContents();
            case "element":
                return getElement();
            case "format":
                return getFormat();
            case "label":
                return getLabel();
            case "title":
                return getTitle();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A text section of a paper.
     * @return StrColumn
     */
    public StrColumn getContents() {
        return delegate.getColumn("contents", DelegatingStrColumn::new);
    }

    /**
     * The functional role of the associated text section.
     * @return StrColumn
     */
    public StrColumn getElement() {
        return delegate.getColumn("element", DelegatingStrColumn::new);
    }

    /**
     * Code indicating the appropriate typesetting conventions
     * for accented characters and special symbols in the text
     * section.
     * @return StrColumn
     */
    public StrColumn getFormat() {
        return delegate.getColumn("format", DelegatingStrColumn::new);
    }

    /**
     * Code identifying the section of text.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * Title of the associated section of text.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return delegate.getColumn("title", DelegatingStrColumn::new);
    }

}