package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the AUDIT_AUTHOR category record details about
 * the author(s) of the data block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address", StrColumn::new) :
                getBinaryColumn("address"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _audit_author.name is looped with _audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * This data item defines the order of the author's name in the
     * list of audit authors.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("identifier_ORCID", StrColumn::new) :
                getBinaryColumn("identifier_ORCID"));
    }
}
