package org.rcsb.cif.model.generated.auditcontactauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuditContactAuthor extends BaseCategory {
    public AuditContactAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AuditContactAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AuditContactAuthor(String name) {
        super(name);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed.
     * @return Address
     */
    public Address getAddress() {
        return (Address) (isText ? textFields.computeIfAbsent("address",
                Address::new) : getBinaryColumn("address"));
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognizable
     * to international networks. The format of e-mail
     * addresses is given in Section 3.4, Address Specification, of
     * Internet Message Format, RFC 2822, P. Resnick (Editor),
     * Network Standards Group, April 2001.
     * @return Email
     */
    public Email getEmail() {
        return (Email) (isText ? textFields.computeIfAbsent("email",
                Email::new) : getBinaryColumn("email"));
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number with no spaces.
     * @return Fax
     */
    public Fax getFax() {
        return (Fax) (isText ? textFields.computeIfAbsent("fax",
                Fax::new) : getBinaryColumn("fax"));
    }

    /**
     * The name of the author of the data block to whom correspondence
     * should be addressed.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The telephone number of the author of the data block to whom
     * correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces.
     * @return Phone
     */
    public Phone getPhone() {
        return (Phone) (isText ? textFields.computeIfAbsent("phone",
                Phone::new) : getBinaryColumn("phone"));
    }
}
