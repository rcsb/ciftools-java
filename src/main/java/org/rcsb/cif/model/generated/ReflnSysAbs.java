package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFLN_SYS_ABS category record details about
 * the reflection data that should be systematically absent,
 * given the designated space group.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReflnSysAbs extends BaseCategory {
    public ReflnSysAbs(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ReflnSysAbs(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ReflnSysAbs(String name) {
        super(name);
    }

    /**
     * The measured value of the intensity in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("I", FloatColumn::new) :
                getBinaryColumn("I"));
    }

    /**
     * The ratio of _refln_sys_abs.I to _refln_sys_abs.sigmaI.  Used
     * to evaluate whether a reflection that should be systematically
     * absent according to the designated space group is in fact
     * absent.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigmaI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("I_over_sigmaI", FloatColumn::new) :
                getBinaryColumn("I_over_sigmaI"));
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to
     * the cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln_sys_abs.I in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getSigmaI() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigmaI", FloatColumn::new) :
                getBinaryColumn("sigmaI"));
    }
}
