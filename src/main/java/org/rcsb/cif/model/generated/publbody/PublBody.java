package org.rcsb.cif.model.generated.publbody;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Contents
     */
    public Contents getContents() {
        return (Contents) (isText ? textFields.computeIfAbsent("contents",
                Contents::new) : getBinaryColumn("contents"));
    }

    /**
     * The functional role of the associated text section.
     * @return Element
     */
    public Element getElement() {
        return (Element) (isText ? textFields.computeIfAbsent("element",
                Element::new) : getBinaryColumn("element"));
    }

    /**
     * Code indicating the appropriate typesetting conventions
     * for accented characters and special symbols in the text
     * section.
     * @return Format
     */
    public Format getFormat() {
        return (Format) (isText ? textFields.computeIfAbsent("format",
                Format::new) : getBinaryColumn("format"));
    }

    /**
     * Code identifying the section of text.
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * Title of the associated section of text.
     * @return Title
     */
    public Title getTitle() {
        return (Title) (isText ? textFields.computeIfAbsent("title",
                Title::new) : getBinaryColumn("title"));
    }
}
