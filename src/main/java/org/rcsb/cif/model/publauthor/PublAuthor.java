package org.rcsb.cif.model.publauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Address
     */
    public Address getAddress() {
        return (Address) (isText ? textFields.computeIfAbsent("address",
                Address::new) : getBinaryColumn("address"));
    }

    /**
     * The e-mail address of a publication author. If there is more
     * than one author, this will be looped with _publ_author.name.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of  Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return Email
     */
    public Email getEmail() {
        return (Email) (isText ? textFields.computeIfAbsent("email",
                Email::new) : getBinaryColumn("email"));
    }

    /**
     * A footnote accompanying an author's name in the list of authors
     * of a paper. Typically indicates sabbatical address, additional
     * affiliations or date of decease.
     * @return Footnote
     */
    public Footnote getFootnote() {
        return (Footnote) (isText ? textFields.computeIfAbsent("footnote",
                Footnote::new) : getBinaryColumn("footnote"));
    }

    /**
     * The name of a publication author. If there are multiple authors
     * this will be looped with _publ_author.address. The family
     * name(s), followed by a comma and including any dynastic
     * components, precedes the first names or initials.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Identifier in the IUCr contact database of a publication
     * author.  This identifier may be available from the World
     * Directory of Crystallographers (http://wdc.iucr.org).
     * @return IdIucr
     */
    public IdIucr getIdIucr() {
        return (IdIucr) (isText ? textFields.computeIfAbsent("id_iucr",
                IdIucr::new) : getBinaryColumn("id_iucr"));
    }
}
