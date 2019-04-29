package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The DATABASE_PDB_TVECT category provides placeholders for
 * the TVECT matrices and vectors used by the Protein Data
 * Bank (PDB).
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * the data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabasePDBTvect extends BaseCategory {
    public DatabasePDBTvect(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBTvect(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBTvect(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this TVECT.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _database_PDB_tvect.id must uniquely identify a
     * record in the DATABASE_PDB_TVECT list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[1]", FloatColumn::new) :
                getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[2]", FloatColumn::new) :
                getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the PDB TVECT vector.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[3]", FloatColumn::new) :
                getBinaryColumn("vector[3]"));
    }
}
