package org.rcsb.cif.model.generated.emobsolete;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmObsolete extends BaseCategory {
    public EmObsolete(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmObsolete(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmObsolete(String name) {
        super(name);
    }

    /**
     * Dated when the entry made obsolete the other entry
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Details
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Entry made obsolete
     * @return Entry
     */
    public Entry getEntry() {
        return (Entry) (isText ? textFields.computeIfAbsent("entry",
                Entry::new) : getBinaryColumn("entry"));
    }

    /**
     * Primary key
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
