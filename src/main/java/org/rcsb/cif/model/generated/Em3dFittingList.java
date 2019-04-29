package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the 3D_FITTING_LIST category
 * lists the methods of fitting atomic coordinates from a PDB file
 * into a 3d-em volume map file
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _em_3d_fitting_list.3d_fitting_id is a pointer
     * to  _em_3d_fitting.id in the 3d_fitting category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn get_3dFittingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("3d_fitting_id", SingleRowStrColumn::new) :
                getBinaryColumn("3d_fitting_id"));
    }

    /**
     * The PDB code for the entry used in fitting.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_entry_id"));
    }

    /**
     * The ID of the biopolymer chain used for fitting, e.g., A.  Please note that
     * only one chain can be specified per instance.  If all chains of a particular
     * structure have been used for fitting, this field can be left blank.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbChainId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_chain_id"));
    }

    /**
     * The molecular entities represented in this fitting description.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbChainResidueRange() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_residue_range", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_chain_residue_range"));
    }

    /**
     * Details about the model used in fitting.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
