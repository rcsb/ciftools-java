package org.rcsb.cif.model.generated.em3dfittinglist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The value of _em_3d_fitting_list.3d_fitting_id is a pointer
     * to  _em_3d_fitting.id in the 3d_fitting category
     * @return _3dFittingId
     */
    public _3dFittingId get_3dFittingId() {
        return (_3dFittingId) (isText ? textFields.computeIfAbsent("3d_fitting_id",
                _3dFittingId::new) : getBinaryColumn("3d_fitting_id"));
    }

    /**
     * The PDB code for the entry used in fitting.
     * @return PdbEntryId
     */
    public PdbEntryId getPdbEntryId() {
        return (PdbEntryId) (isText ? textFields.computeIfAbsent("pdb_entry_id",
                PdbEntryId::new) : getBinaryColumn("pdb_entry_id"));
    }

    /**
     * The ID of the biopolymer chain used for fitting, e.g., A.  Please note that
     * only one chain can be specified per instance.  If all chains of a particular
     * structure have been used for fitting, this field can be left blank.
     * @return PdbChainId
     */
    public PdbChainId getPdbChainId() {
        return (PdbChainId) (isText ? textFields.computeIfAbsent("pdb_chain_id",
                PdbChainId::new) : getBinaryColumn("pdb_chain_id"));
    }

    /**
     * The molecular entities represented in this fitting description.
     * @return PdbChainResidueRange
     */
    public PdbChainResidueRange getPdbChainResidueRange() {
        return (PdbChainResidueRange) (isText ? textFields.computeIfAbsent("pdb_chain_residue_range",
                PdbChainResidueRange::new) : getBinaryColumn("pdb_chain_residue_range"));
    }

    /**
     * Details about the model used in fitting.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
