package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Local data items describing ligand and monomer
 * atom names and connectivity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxConnectAtom extends BaseCategory {
    public PdbxConnectAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConnectAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConnectAtom(String name) {
        super(name);
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("res_name", StrColumn::new) :
                getBinaryColumn("res_name"));
    }

    /**
     * Uniquely identifies the atom within the component.
     * @return StrColumn
     */
    public StrColumn getAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_name", StrColumn::new) :
                getBinaryColumn("atom_name"));
    }

    /**
     * Identifies a connected atom within the component.
     * @return StrColumn
     */
    public StrColumn getConnectTo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("connect_to", StrColumn::new) :
                getBinaryColumn("connect_to"));
    }

    /**
     * Element symbol
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }

    /**
     * Charge
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("charge", IntColumn::new) :
                getBinaryColumn("charge"));
    }

    /**
     * Bond type.
     * @return StrColumn
     */
    public StrColumn getBondType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("bond_type", StrColumn::new) :
                getBinaryColumn("bond_type"));
    }

    /**
     * Starting column of atom name in PDB atom field.
     * @return IntColumn
     */
    public IntColumn getAlignPos() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("align_pos", IntColumn::new) :
                getBinaryColumn("align_pos"));
    }
}
