package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PUBL_AUTHOR category record details of
 * the authors of a manuscript submitted for publication.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublAuthor extends DelegatingCategory {
    public PublAuthor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "address":
                return getAddress();
            case "email":
                return getEmail();
            case "footnote":
                return getFootnote();
            case "name":
                return getName();
            case "id_iucr":
                return getIdIucr();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The address of a publication author. If there is more than one
     * author this is looped with _publ_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return delegate.getColumn("address", DelegatingStrColumn::new);
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
        return delegate.getColumn("email", DelegatingStrColumn::new);
    }

    /**
     * A footnote accompanying an author's name in the list of authors
     * of a paper. Typically indicates sabbatical address, additional
     * affiliations or date of decease.
     * @return StrColumn
     */
    public StrColumn getFootnote() {
        return delegate.getColumn("footnote", DelegatingStrColumn::new);
    }

    /**
     * The name of a publication author. If there are multiple authors
     * this will be looped with _publ_author.address. The family
     * name(s), followed by a comma and including any dynastic
     * components, precedes the first names or initials.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Identifier in the IUCr contact database of a publication
     * author.  This identifier may be available from the World
     * Directory of Crystallographers (http://wdc.iucr.org).
     * @return StrColumn
     */
    public StrColumn getIdIucr() {
        return delegate.getColumn("id_iucr", DelegatingStrColumn::new);
    }

}