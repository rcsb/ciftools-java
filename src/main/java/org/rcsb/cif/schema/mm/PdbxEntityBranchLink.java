package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_BRANCH_LINK category give details about
 * the linkages between components within a branched entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityBranchLink extends DelegatingCategory {
    public PdbxEntityBranchLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "link_id":
                return getLinkId();
            case "details":
                return getDetails();
            case "entity_id":
                return getEntityId();
            case "entity_branch_list_num_1":
                return getEntityBranchListNum1();
            case "entity_branch_list_num_2":
                return getEntityBranchListNum2();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "atom_id_1":
                return getAtomId1();
            case "leaving_atom_id_1":
                return getLeavingAtomId1();
            case "atom_stereo_config_1":
                return getAtomStereoConfig1();
            case "atom_id_2":
                return getAtomId2();
            case "leaving_atom_id_2":
                return getLeavingAtomId2();
            case "atom_stereo_config_2":
                return getAtomStereoConfig2();
            case "value_order":
                return getValueOrder();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_branch_link.link_id uniquely identifies
     * linkages within the branched entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of this linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The entity id for this branched entity.
     * 
     * This data item is a pointer to _pdbx_entity_branch_list.entity_id
     * in the PDBX_ENTITY_BRANCH_LIST category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The component number for the first component making the linkage.
     * 
     * This data item is a pointer to _pdbx_entity_branch_list.num
     * in the PDBX_ENTITY_BRANCH_LIST category.
     * @return IntColumn
     */
    public IntColumn getEntityBranchListNum1() {
        return delegate.getColumn("entity_branch_list_num_1", DelegatingIntColumn::new);
    }

    /**
     * The component number for the second component making the linkage.
     * 
     * This data item is a pointer to _pdbx_entity_branch_list.num
     * in the PDBX_ENTITY_BRANCH_LIST category.
     * @return IntColumn
     */
    public IntColumn getEntityBranchListNum2() {
        return delegate.getColumn("entity_branch_list_num_2", DelegatingIntColumn::new);
    }

    /**
     * The component identifier for the first component making the linkage.
     * 
     * This data item is a pointer to _pdbx_entity_branch_list.comp_id
     * in the PDBX_ENTITY_BRANCH_LIST category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second component making the linkage.
     * 
     * This data item is a pointer to _pdbx_entity_branch_list.comp_id
     * in the PDBX_ENTITY_BRANCH_LIST category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name for the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId1() {
        return delegate.getColumn("leaving_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig1() {
        return delegate.getColumn("atom_stereo_config_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name for the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId2() {
        return delegate.getColumn("leaving_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig2() {
        return delegate.getColumn("atom_stereo_config_2", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

}