package org.rcsb.cif.model.auditauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuditAuthor extends BaseCategory {
    public AuditAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AuditAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AuditAuthor(String name) {
        super(name);
    }

    /**
     * The address of an author of this data block. If there are
     * multiple authors, _audit_author.address is looped with
     * _audit_author.name.
     * @return Address
     */
    public Address getAddress() {
        return (Address) (isText ? textFields.computeIfAbsent("address",
                Address::new) : getBinaryColumn("address"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _audit_author.name is looped with _audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * This data item defines the order of the author's name in the
     * list of audit authors.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return IdentifierORCID
     */
    public IdentifierORCID getIdentifierORCID() {
        return (IdentifierORCID) (isText ? textFields.computeIfAbsent("identifier_ORCID",
                IdentifierORCID::new) : getBinaryColumn("identifier_ORCID"));
    }
}
