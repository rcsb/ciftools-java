package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_AUTHOR category record details about
 * the author(s) of the data block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("address", StrColumn::new) :
                getBinaryColumn("address"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _pdbx_audit_author.name is looped with _pdbx_audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic compoents, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * A unique sequential integer identifier for each author.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
