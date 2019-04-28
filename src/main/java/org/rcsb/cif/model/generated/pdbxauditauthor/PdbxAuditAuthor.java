package org.rcsb.cif.model.generated.pdbxauditauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuditAuthor extends BaseCategory {
    public PdbxAuditAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditAuthor(String name) {
        super(name);
    }

    /**
     * The address of an author of this data block. If there are
     * multiple authors, _pdbx_audit_author.address is looped with
     * _pdbx_audit_author.name.
     * @return Address
     */
    public Address getAddress() {
        return (Address) (isText ? textFields.computeIfAbsent("address",
                Address::new) : getBinaryColumn("address"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _pdbx_audit_author.name is looped with _pdbx_audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic compoents, precedes the first name(s) or initial(s).
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * A unique sequential integer identifier for each author.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
