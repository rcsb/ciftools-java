package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the AUDIT_CONTACT_AUTHOR category record details
 * about the name and address of the author to be contacted
 * concerning the content of this data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditContactAuthor extends DelegatingCategory {
    public AuditContactAuthor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "address":
                return getAddress();
            case "email":
                return getEmail();
            case "fax":
                return getFax();
            case "name":
                return getName();
            case "phone":
                return getPhone();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return delegate.getColumn("address", DelegatingStrColumn::new);
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognizable
     * to international networks. The format of e-mail
     * addresses is given in Section 3.4, Address Specification, of
     * Internet Message Format, RFC 2822, P. Resnick (Editor),
     * Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return delegate.getColumn("email", DelegatingStrColumn::new);
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number with no spaces.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return delegate.getColumn("fax", DelegatingStrColumn::new);
    }

    /**
     * The name of the author of the data block to whom correspondence
     * should be addressed.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The telephone number of the author of the data block to whom
     * correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return delegate.getColumn("phone", DelegatingStrColumn::new);
    }

}