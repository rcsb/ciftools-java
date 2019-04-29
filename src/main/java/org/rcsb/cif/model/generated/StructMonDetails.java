package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_MON_DETAILS category record details
 * about specifics of calculations summarized in data items in the
 * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
 * include the coefficients used in map calculations,
 * the radii used for including points in a calculation and so on.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructMonDetails extends BaseCategory {
    public StructMonDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonDetails(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * An ideal cis peptide bond would have an omega torsion angle of
     * zero. This data item gives the value in degrees by which the
     * observed torsion angle can differ from 0.0 and still be
     * considered cis.
     * @return FloatColumn
     */
    public FloatColumn getProtCis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("prot_cis", FloatColumn::new) :
                getBinaryColumn("prot_cis"));
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSCC_all,
     * _struct_mon_prot.RSCC_main and _struct_mon_prot.RSCC_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return StrColumn
     */
    public StrColumn getRSCC() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("RSCC", StrColumn::new) :
                getBinaryColumn("RSCC"));
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSR_all,
     * _struct_mon_prot.RSR_main and _struct_mon_prot.RSR_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return StrColumn
     */
    public StrColumn getRSR() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("RSR", StrColumn::new) :
                getBinaryColumn("RSR"));
    }
}
