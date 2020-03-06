package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
 * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrConstraintFile extends DelegatingCategory {
    public PdbxNmrConstraintFile(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "constraint_filename":
                return getConstraintFilename();
            case "constraint_number":
                return getConstraintNumber();
            case "constraint_subtype":
                return getConstraintSubtype();
            case "constraint_type":
                return getConstraintType();
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "software_name":
                return getSoftwareName();
            case "software_ordinal":
                return getSoftwareOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Name of the uploaded file that contains the constraint data.
     * @return StrColumn
     */
    public StrColumn getConstraintFilename() {
        return delegate.getColumn("constraint_filename", DelegatingStrColumn::new);
    }

    /**
     * Number of constraints of this type and subtype in the file.
     * @return IntColumn
     */
    public IntColumn getConstraintNumber() {
        return delegate.getColumn("constraint_number", DelegatingIntColumn::new);
    }

    /**
     * Specific type of constraint.
     * @return StrColumn
     */
    public StrColumn getConstraintSubtype() {
        return delegate.getColumn("constraint_subtype", DelegatingStrColumn::new);
    }

    /**
     * The general type of constraint (distance, torsion angle, RDC, etc.)
     * @return StrColumn
     */
    public StrColumn getConstraintType() {
        return delegate.getColumn("constraint_type", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Local unique identifier for the listed constraint file.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Name of the software application that the listed constraint file is used
     * as input.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return delegate.getColumn("software_name", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _software.ordinal
     * @return IntColumn
     */
    public IntColumn getSoftwareOrdinal() {
        return delegate.getColumn("software_ordinal", DelegatingIntColumn::new);
    }

}