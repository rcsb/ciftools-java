package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Local data items describing ligand and monomer
 * atom names and connectivity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConnectAtom extends DelegatingCategory {
    public PdbxConnectAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "res_name":
                return getResName();
            case "atom_name":
                return getAtomName();
            case "connect_to":
                return getConnectTo();
            case "type_symbol":
                return getTypeSymbol();
            case "charge":
                return getCharge();
            case "bond_type":
                return getBondType();
            case "align_pos":
                return getAlignPos();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return delegate.getColumn("res_name", DelegatingStrColumn::new);
    }

    /**
     * Uniquely identifies the atom within the component.
     * @return StrColumn
     */
    public StrColumn getAtomName() {
        return delegate.getColumn("atom_name", DelegatingStrColumn::new);
    }

    /**
     * Identifies a connected atom within the component.
     * @return StrColumn
     */
    public StrColumn getConnectTo() {
        return delegate.getColumn("connect_to", DelegatingStrColumn::new);
    }

    /**
     * Element symbol
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

    /**
     * Charge
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return delegate.getColumn("charge", DelegatingIntColumn::new);
    }

    /**
     * Bond type.
     * @return StrColumn
     */
    public StrColumn getBondType() {
        return delegate.getColumn("bond_type", DelegatingStrColumn::new);
    }

    /**
     * Starting column of atom name in PDB atom field.
     * @return IntColumn
     */
    public IntColumn getAlignPos() {
        return delegate.getColumn("align_pos", DelegatingIntColumn::new);
    }

}