package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PUBL_AUTHOR category record details of
 * the authors of a manuscript submitted for publication.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PublAuthor extends BaseCategory {
    public PublAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PublAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PublAuthor(String name) {
        super(name);
    }

    /**
     * The address of a publication author. If there is more than one
     * author this is looped with _publ_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address", StrColumn::new) :
                getBinaryColumn("address"));
    }

    /**
     * The e-mail address of a publication author. If there is more
     * than one author, this will be looped with _publ_author.name.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of  Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("email", StrColumn::new) :
                getBinaryColumn("email"));
    }

    /**
     * A footnote accompanying an author's name in the list of authors
     * of a paper. Typically indicates sabbatical address, additional
     * affiliations or date of decease.
     * @return StrColumn
     */
    public StrColumn getFootnote() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("footnote", StrColumn::new) :
                getBinaryColumn("footnote"));
    }

    /**
     * The name of a publication author. If there are multiple authors
     * this will be looped with _publ_author.address. The family
     * name(s), followed by a comma and including any dynastic
     * components, precedes the first names or initials.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Identifier in the IUCr contact database of a publication
     * author.  This identifier may be available from the World
     * Directory of Crystallographers (http://wdc.iucr.org).
     * @return StrColumn
     */
    public StrColumn getIdIucr() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id_iucr", StrColumn::new) :
                getBinaryColumn("id_iucr"));
    }
}
