package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_NONPOLY_FEATURE category provide
 * a selected list of atom level features for the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNonpolyFeature extends DelegatingCategory {
    public PdbxNonpolyFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_seq_id":
                return getLabelSeqId();
            case "label_comp_id":
                return getLabelCompId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_comp_id":
                return getAuthCompId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "type":
                return getType();
            case "value":
                return getValue();
            case "provenance":
                return getProvenance();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the instance of the STRUCT_ASYM_ID to which this feature applies.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The feature assigned to this atom.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The feature assigned to this atom.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * The feature assigned to this atom.
     * @return StrColumn
     */
    public StrColumn getProvenance() {
        return delegate.getColumn("provenance", DelegatingStrColumn::new);
    }

}