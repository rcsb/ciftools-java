package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the 3D_FITTING_LIST category
 * lists the methods of fitting atomic coordinates from a PDB file
 * into a 3d-em volume map file
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Em3dFittingList extends BaseCategory {
    public Em3dFittingList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Em3dFittingList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Em3dFittingList(String name) {
        super(name);
    }

    /**
     * This data item is a unique identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_3d_fitting_list.3d_fitting_id is a pointer
     * to  _em_3d_fitting.id in the 3d_fitting category
     * @return StrColumn
     */
    public StrColumn get_3dFittingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("3d_fitting_id", StrColumn::new) :
                getBinaryColumn("3d_fitting_id"));
    }

    /**
     * The PDB code for the entry used in fitting.
     * @return StrColumn
     */
    public StrColumn getPdbEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_entry_id", StrColumn::new) :
                getBinaryColumn("pdb_entry_id"));
    }

    /**
     * The ID of the biopolymer chain used for fitting, e.g., A.  Please note that
     * only one chain can be specified per instance.  If all chains of a particular
     * structure have been used for fitting, this field can be left blank.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_id", StrColumn::new) :
                getBinaryColumn("pdb_chain_id"));
    }

    /**
     * The molecular entities represented in this fitting description.
     * @return StrColumn
     */
    public StrColumn getPdbChainResidueRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_residue_range", StrColumn::new) :
                getBinaryColumn("pdb_chain_residue_range"));
    }

    /**
     * Details about the model used in fitting.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
