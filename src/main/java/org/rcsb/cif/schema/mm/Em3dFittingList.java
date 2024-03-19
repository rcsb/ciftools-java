package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the 3D_FITTING_LIST category
 * lists the methods of fitting atomic coordinates from a PDB file
 * into a 3d-em volume map file
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em3dFittingList extends DelegatingCategory {
    public Em3dFittingList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "3d_fitting_id":
                return get_3dFittingId();
            case "pdb_entry_id":
                return getPdbEntryId();
            case "pdb_chain_id":
                return getPdbChainId();
            case "pdb_chain_residue_range":
                return getPdbChainResidueRange();
            case "details":
                return getDetails();
            case "chain_id":
                return getChainId();
            case "chain_residue_range":
                return getChainResidueRange();
            case "source_name":
                return getSourceName();
            case "type":
                return getType();
            case "accession_code":
                return getAccessionCode();
            case "initial_refinement_model_id":
                return getInitialRefinementModelId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_3d_fitting_list.3d_fitting_id is a pointer
     * to  _em_3d_fitting.id in the 3d_fitting category
     * @return StrColumn
     */
    public StrColumn get_3dFittingId() {
        return delegate.getColumn("3d_fitting_id", DelegatingStrColumn::new);
    }

    /**
     * The PDB code for the entry used in fitting.
     * @return StrColumn
     */
    public StrColumn getPdbEntryId() {
        return delegate.getColumn("pdb_entry_id", DelegatingStrColumn::new);
    }

    /**
     * The ID of the biopolymer chain used for fitting, e.g., A.  Please note that
     * only one chain can be specified per instance.  If all chains of a particular
     * structure have been used for fitting, this field can be left blank.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }

    /**
     * Residue range for the identified chain.
     * @return StrColumn
     */
    public StrColumn getPdbChainResidueRange() {
        return delegate.getColumn("pdb_chain_residue_range", DelegatingStrColumn::new);
    }

    /**
     * Details about the model used in fitting.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The ID of the biopolymer chain used for fitting, e.g., A.  Please note that
     * only one chain can be specified per instance.  If all chains of a particular
     * structure have been used for fitting, this field can be left blank.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return delegate.getColumn("chain_id", DelegatingStrColumn::new);
    }

    /**
     * The residue ranges of the initial model used in this fitting.
     * @return StrColumn
     */
    public StrColumn getChainResidueRange() {
        return delegate.getColumn("chain_residue_range", DelegatingStrColumn::new);
    }

    /**
     * This item identifies the resource of initial model used for refinement
     * @return StrColumn
     */
    public StrColumn getSourceName() {
        return delegate.getColumn("source_name", DelegatingStrColumn::new);
    }

    /**
     * This item describes the type of the initial model was generated
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This item identifies an accession code of the resource where the initial model
     * is used
     * @return StrColumn
     */
    public StrColumn getAccessionCode() {
        return delegate.getColumn("accession_code", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_3d_fitting.initial_refinement_model_id itentifies the id
     * in the _pdbx_initial_refinement_model
     * @return IntColumn
     */
    public IntColumn getInitialRefinementModelId() {
        return delegate.getColumn("initial_refinement_model_id", DelegatingIntColumn::new);
    }

}