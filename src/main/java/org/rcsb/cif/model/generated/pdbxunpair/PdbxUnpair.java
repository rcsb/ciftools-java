package org.rcsb.cif.model.generated.pdbxunpair;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxUnpair extends BaseCategory {
    public PdbxUnpair(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxUnpair(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxUnpair(String name) {
        super(name);
    }

    /**
     * Strand id.
     * @return ChainId
     */
    public ChainId getChainId() {
        return (ChainId) (isText ? textFields.computeIfAbsent("chain_id",
                ChainId::new) : getBinaryColumn("chain_id"));
    }

    /**
     * Name of residue which does not pair.
     * @return ResidueName
     */
    public ResidueName getResidueName() {
        return (ResidueName) (isText ? textFields.computeIfAbsent("residue_name",
                ResidueName::new) : getBinaryColumn("residue_name"));
    }

    /**
     * Number of residue which does not pair.
     * @return ResidueNumber
     */
    public ResidueNumber getResidueNumber() {
        return (ResidueNumber) (isText ? textFields.computeIfAbsent("residue_number",
                ResidueNumber::new) : getBinaryColumn("residue_number"));
    }
}
