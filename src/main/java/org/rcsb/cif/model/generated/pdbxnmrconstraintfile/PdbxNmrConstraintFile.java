package org.rcsb.cif.model.generated.pdbxnmrconstraintfile;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrConstraintFile extends BaseCategory {
    public PdbxNmrConstraintFile(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrConstraintFile(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrConstraintFile(String name) {
        super(name);
    }

    /**
     * 
     * Name of the uploaded file that contains the constraint data.
     * @return ConstraintFilename
     */
    public ConstraintFilename getConstraintFilename() {
        return (ConstraintFilename) (isText ? textFields.computeIfAbsent("constraint_filename",
                ConstraintFilename::new) : getBinaryColumn("constraint_filename"));
    }

    /**
     * 
     * Number of constraints of this type and subtype in the file.
     * @return ConstraintNumber
     */
    public ConstraintNumber getConstraintNumber() {
        return (ConstraintNumber) (isText ? textFields.computeIfAbsent("constraint_number",
                ConstraintNumber::new) : getBinaryColumn("constraint_number"));
    }

    /**
     * 
     * Specific type of constraint.
     * @return ConstraintSubtype
     */
    public ConstraintSubtype getConstraintSubtype() {
        return (ConstraintSubtype) (isText ? textFields.computeIfAbsent("constraint_subtype",
                ConstraintSubtype::new) : getBinaryColumn("constraint_subtype"));
    }

    /**
     * 
     * The general type of constraint (distance, torsion angle, RDC, etc.)
     * @return ConstraintType
     */
    public ConstraintType getConstraintType() {
        return (ConstraintType) (isText ? textFields.computeIfAbsent("constraint_type",
                ConstraintType::new) : getBinaryColumn("constraint_type"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Local unique identifier for the listed constraint file.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * Name of the software application that the listed constraint file is used
     * as input.
     * @return SoftwareName
     */
    public SoftwareName getSoftwareName() {
        return (SoftwareName) (isText ? textFields.computeIfAbsent("software_name",
                SoftwareName::new) : getBinaryColumn("software_name"));
    }

    /**
     * 
     * Pointer to _software.ordinal
     * @return SoftwareOrdinal
     */
    public SoftwareOrdinal getSoftwareOrdinal() {
        return (SoftwareOrdinal) (isText ? textFields.computeIfAbsent("software_ordinal",
                SoftwareOrdinal::new) : getBinaryColumn("software_ordinal"));
    }
}
