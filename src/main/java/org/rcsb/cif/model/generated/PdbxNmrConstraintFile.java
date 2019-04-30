package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
 * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getConstraintFilename() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("constraint_filename", StrColumn::new) :
                getBinaryColumn("constraint_filename"));
    }

    /**
     * 
     * Number of constraints of this type and subtype in the file.
     * @return IntColumn
     */
    public IntColumn getConstraintNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("constraint_number", IntColumn::new) :
                getBinaryColumn("constraint_number"));
    }

    /**
     * 
     * Specific type of constraint.
     * @return StrColumn
     */
    public StrColumn getConstraintSubtype() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("constraint_subtype", StrColumn::new) :
                getBinaryColumn("constraint_subtype"));
    }

    /**
     * 
     * The general type of constraint (distance, torsion angle, RDC, etc.)
     * @return StrColumn
     */
    public StrColumn getConstraintType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("constraint_type", StrColumn::new) :
                getBinaryColumn("constraint_type"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Local unique identifier for the listed constraint file.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 
     * Name of the software application that the listed constraint file is used
     * as input.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("software_name", StrColumn::new) :
                getBinaryColumn("software_name"));
    }

    /**
     * 
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_ordinal", IntColumn::new) :
                getBinaryColumn("software_ordinal"));
    }
}
