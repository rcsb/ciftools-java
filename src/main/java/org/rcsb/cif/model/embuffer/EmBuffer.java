package org.rcsb.cif.model.embuffer;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmBuffer extends BaseCategory {
    public EmBuffer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmBuffer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmBuffer(String name) {
        super(name);
    }

    /**
     * The value of _em_buffer.id must
     * uniquely identify the sample buffer.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * pointer to  _em_specimen.id
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * The name of the buffer.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Additional details about the buffer.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Additional details about the buffer.
     * @return PH
     */
    public PH getPH() {
        return (PH) (isText ? textFields.computeIfAbsent("pH",
                PH::new) : getBinaryColumn("pH"));
    }
}
