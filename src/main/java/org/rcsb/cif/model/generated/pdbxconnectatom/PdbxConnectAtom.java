package org.rcsb.cif.model.generated.pdbxconnectatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return ResName
     */
    public ResName getResName() {
        return (ResName) (isText ? textFields.computeIfAbsent("res_name",
                ResName::new) : getBinaryColumn("res_name"));
    }

    /**
     * Uniquely identifies the atom within the component.
     * @return AtomName
     */
    public AtomName getAtomName() {
        return (AtomName) (isText ? textFields.computeIfAbsent("atom_name",
                AtomName::new) : getBinaryColumn("atom_name"));
    }

    /**
     * Identifies a connected atom within the component.
     * @return ConnectTo
     */
    public ConnectTo getConnectTo() {
        return (ConnectTo) (isText ? textFields.computeIfAbsent("connect_to",
                ConnectTo::new) : getBinaryColumn("connect_to"));
    }

    /**
     * Element symbol
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }

    /**
     * Charge
     * @return Charge
     */
    public Charge getCharge() {
        return (Charge) (isText ? textFields.computeIfAbsent("charge",
                Charge::new) : getBinaryColumn("charge"));
    }

    /**
     * Bond type.
     * @return BondType
     */
    public BondType getBondType() {
        return (BondType) (isText ? textFields.computeIfAbsent("bond_type",
                BondType::new) : getBinaryColumn("bond_type"));
    }

    /**
     * Starting column of atom name in PDB atom field.
     * @return AlignPos
     */
    public AlignPos getAlignPos() {
        return (AlignPos) (isText ? textFields.computeIfAbsent("align_pos",
                AlignPos::new) : getBinaryColumn("align_pos"));
    }
}
