package org.rcsb.cif.model.generated.diffrnstandardrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * Miller index h of a standard reflection used in the diffraction
     * measurement process.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a standard reflection used in the diffraction
     * measurement process.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a standard reflection used in the diffraction
     * measurement process.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }
}
