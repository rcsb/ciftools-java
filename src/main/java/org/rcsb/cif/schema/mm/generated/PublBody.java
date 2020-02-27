package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PUBL_BODY category permit the labelling of
 * different text sections within the body of a paper.
 * Note that these should not be used in a paper which has
 * a standard format with sections tagged by specific data names
 * (such as in Acta Crystallographica Section C). Typically,
 * each journal will supply a list of the specific items it
 * requires in its Notes for Authors.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PublBody extends BaseCategory {
    public PublBody(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PublBody(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PublBody(String name) {
        super(name);
    }

    /**
     * A text section of a paper.
     * @return StrColumn
     */
    public StrColumn getContents() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contents", StrColumn::new) :
                getBinaryColumn("contents"));
    }

    /**
     * The functional role of the associated text section.
     * @return StrColumn
     */
    public StrColumn getElement() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("element", StrColumn::new) :
                getBinaryColumn("element"));
    }

    /**
     * Code indicating the appropriate typesetting conventions
     * for accented characters and special symbols in the text
     * section.
     * @return StrColumn
     */
    public StrColumn getFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("format", StrColumn::new) :
                getBinaryColumn("format"));
    }

    /**
     * Code identifying the section of text.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * Title of the associated section of text.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("title", StrColumn::new) :
                getBinaryColumn("title"));
    }
}
