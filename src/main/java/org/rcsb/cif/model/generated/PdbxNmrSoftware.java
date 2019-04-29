package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Description of the software that was used for data collection, data processing,
 * data analysis, structure calculations and refinement. The description should
 * include the name of the software, the author of the software and the version used.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSoftware extends BaseCategory {
    public PdbxNmrSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSoftware(String name) {
        super(name);
    }

    /**
     * 
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The purpose of the software.
     * @return StrColumn
     */
    public StrColumn getClassification() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("classification", StrColumn::new) :
                getBinaryColumn("classification"));
    }

    /**
     * The name of the software used for the task.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("version", StrColumn::new) :
                getBinaryColumn("version"));
    }

    /**
     * The name of the authors of the software used in this
     * procedure.
     * @return StrColumn
     */
    public StrColumn getAuthors() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("authors", StrColumn::new) :
                getBinaryColumn("authors"));
    }

    /**
     * 
     * Text description of the software.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
