package org.rcsb.cif.model.generated.pdbxhybrid;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxHybrid extends BaseCategory {
    public PdbxHybrid(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxHybrid(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxHybrid(String name) {
        super(name);
    }

    /**
     * ID code.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Name of sugar group of residue.
     * @return SugarName
     */
    public SugarName getSugarName() {
        return (SugarName) (isText ? textFields.computeIfAbsent("sugar_name",
                SugarName::new) : getBinaryColumn("sugar_name"));
    }

    /**
     * Strand id.
     * @return StrandId
     */
    public StrandId getStrandId() {
        return (StrandId) (isText ? textFields.computeIfAbsent("strand_id",
                StrandId::new) : getBinaryColumn("strand_id"));
    }

    /**
     * List of residues + number (see example) which have the same sugar
     * group in a particular strand.
     * @return ResidueNames
     */
    public ResidueNames getResidueNames() {
        return (ResidueNames) (isText ? textFields.computeIfAbsent("residue_names",
                ResidueNames::new) : getBinaryColumn("residue_names"));
    }
}
