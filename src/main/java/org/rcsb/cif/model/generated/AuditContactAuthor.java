package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the AUDIT_CONTACT_AUTHOR category record details
 * about the name and address of the author to be contacted
 * concerning the content of this data block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAddress() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("address", SingleRowStrColumn::new) :
                getBinaryColumn("address"));
    }

    /**
     * The electronic mail address of the author of the data block to
     * whom correspondence should be addressed, in a form recognizable
     * to international networks. The format of e-mail
     * addresses is given in Section 3.4, Address Specification, of
     * Internet Message Format, RFC 2822, P. Resnick (Editor),
     * Network Standards Group, April 2001.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmail() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("email", SingleRowStrColumn::new) :
                getBinaryColumn("email"));
    }

    /**
     * The facsimile telephone number of the author of the data
     * block to whom correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number with no spaces.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFax() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("fax", SingleRowStrColumn::new) :
                getBinaryColumn("fax"));
    }

    /**
     * The name of the author of the data block to whom correspondence
     * should be addressed.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The telephone number of the author of the data block to whom
     * correspondence should be addressed.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhone() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phone", SingleRowStrColumn::new) :
                getBinaryColumn("phone"));
    }
}
