package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_BOND category record details about
 * the bonds between atoms in a chemical component. Target values
 * may be specified as bond orders, as a distance between the two
 * atoms, or both.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
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
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value_order", StrColumn::new) :
                getBinaryColumn("value_order"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist", FloatColumn::new) :
                getBinaryColumn("value_dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_bond.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist_esd", FloatColumn::new) :
                getBinaryColumn("value_dist_esd"));
    }

    /**
     * Ordinal index for the component bond list.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * Stereochemical configuration across a double bond.
     * @return StrColumn
     */
    public StrColumn getPdbxStereoConfig() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_stereo_config", StrColumn::new) :
                getBinaryColumn("pdbx_stereo_config"));
    }

    /**
     * A flag indicating an aromatic bond.
     * @return StrColumn
     */
    public StrColumn getPdbxAromaticFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_aromatic_flag", StrColumn::new) :
                getBinaryColumn("pdbx_aromatic_flag"));
    }
}
