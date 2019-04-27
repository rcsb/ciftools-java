package org.rcsb.cif.model.structmondetails;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * An ideal cis peptide bond would have an omega torsion angle of
     * zero. This data item gives the value in degrees by which the
     * observed torsion angle can differ from 0.0 and still be
     * considered cis.
     * @return ProtCis
     */
    public ProtCis getProtCis() {
        return (ProtCis) (isText ? textFields.computeIfAbsent("prot_cis",
                ProtCis::new) : getBinaryColumn("prot_cis"));
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSCC_all,
     * _struct_mon_prot.RSCC_main and _struct_mon_prot.RSCC_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return RSCC
     */
    public RSCC getRSCC() {
        return (RSCC) (isText ? textFields.computeIfAbsent("RSCC",
                RSCC::new) : getBinaryColumn("RSCC"));
    }

    /**
     * This data item describes the specifics of the calculations that
     * generated the values given in _struct_mon_prot.RSR_all,
     * _struct_mon_prot.RSR_main and _struct_mon_prot.RSR_side. The
     * coefficients used to calculate the p(o) and p(c) maps should be
     * given as well as the criterion for the inclusion of map grid
     * points in the calculation.
     * @return RSR
     */
    public RSR getRSR() {
        return (RSR) (isText ? textFields.computeIfAbsent("RSR",
                RSR::new) : getBinaryColumn("RSR"));
    }
}
