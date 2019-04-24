package org.rcsb.cif.model.chemcompbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompBond extends BaseCategory {
    public ChemCompBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompBond(String name) {
        super(name);
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? textFields.computeIfAbsent("value_order",
                ValueOrder::new) : getBinaryColumn("value_order"));
    }

    /**
     * Ordinal index for the component bond list.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * Stereochemical configuration across a double bond.
     * @return PdbxStereoConfig
     */
    public PdbxStereoConfig getPdbxStereoConfig() {
        return (PdbxStereoConfig) (isText ? textFields.computeIfAbsent("pdbx_stereo_config",
                PdbxStereoConfig::new) : getBinaryColumn("pdbx_stereo_config"));
    }

    /**
     * A flag indicating an aromatic bond.
     * @return PdbxAromaticFlag
     */
    public PdbxAromaticFlag getPdbxAromaticFlag() {
        return (PdbxAromaticFlag) (isText ? textFields.computeIfAbsent("pdbx_aromatic_flag",
                PdbxAromaticFlag::new) : getBinaryColumn("pdbx_aromatic_flag"));
    }
}
