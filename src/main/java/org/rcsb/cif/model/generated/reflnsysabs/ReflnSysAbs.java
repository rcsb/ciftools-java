package org.rcsb.cif.model.generated.reflnsysabs;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return I
     */
    public I getI() {
        return (I) (isText ? textFields.computeIfAbsent("I",
                I::new) : getBinaryColumn("I"));
    }

    /**
     * The ratio of _refln_sys_abs.I to _refln_sys_abs.sigmaI.  Used
     * to evaluate whether a reflection that should be systematically
     * absent according to the designated space group is in fact
     * absent.
     * @return IOverSigmaI
     */
    public IOverSigmaI getIOverSigmaI() {
        return (IOverSigmaI) (isText ? textFields.computeIfAbsent("I_over_sigmaI",
                IOverSigmaI::new) : getBinaryColumn("I_over_sigmaI"));
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to
     * the cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln_sys_abs.I in arbitrary units.
     * @return SigmaI
     */
    public SigmaI getSigmaI() {
        return (SigmaI) (isText ? textFields.computeIfAbsent("sigmaI",
                SigmaI::new) : getBinaryColumn("sigmaI"));
    }
}
