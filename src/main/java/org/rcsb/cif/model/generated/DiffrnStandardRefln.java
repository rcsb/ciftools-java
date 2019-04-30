package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_STANDARD_REFLN category record details
 * about the reflections treated as standards during the measurement
 * of a set of diffraction intensities.
 * 
 * Note that these are the individual standard reflections, not the
 * results of the analysis of the standard reflections.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DiffrnStandardRefln extends BaseCategory {
    public DiffrnStandardRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnStandardRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnStandardRefln(String name) {
        super(name);
    }

    /**
     * The code identifying a reflection measured as a standard
     * reflection with the indices _diffrn_standard_refln.index_h,
     * _diffrn_standard_refln.index_k and
     * _diffrn_standard_refln.index_l. This is the same code as the
     * _diffrn_refln.standard_code in the DIFFRN_REFLN list.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code", StrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * Miller index h of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a standard reflection used in the diffraction
     * measurement process.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }
}
