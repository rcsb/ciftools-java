package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_BRANCH_LIST category specify the list
 * of monomers in a branched entity.  Allowance is made for the possibility
 * of microheterogeneity in a sample by allowing a given sequence
 * number to be correlated with more than one monomer ID. The
 * corresponding ATOM_SITE entries should reflect this
 * heterogeneity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityBranchList extends BaseCategory {
    public PdbxEntityBranchList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityBranchList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityBranchList(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate whether this monomer in the entity is
     * heterogeneous in sequence.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetero", StrColumn::new) :
                getBinaryColumn("hetero"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The value pair  _pdbx_entity_branch_list.num and _pdbx_entity_branch_list.comp_id
     * must uniquely identify a record in the PDBX_ENTITY_BRANCH_LIST list.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num", IntColumn::new) :
                getBinaryColumn("num"));
    }
}
