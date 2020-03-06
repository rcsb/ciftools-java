package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
 * about the TLS contribution to anisotropic displacement parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAtomSiteAnisoTls extends DelegatingCategory {
    public PdbxAtomSiteAnisoTls(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "type_symbol":
                return getTypeSymbol();
            case "tls_group_id":
                return getTlsGroupId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "U_tls[1][1]":
                return getUTls11();
            case "U_tls[2][2]":
                return getUTls22();
            case "U_tls[3][3]":
                return getUTls33();
            case "U_tls[1][2]":
                return getUTls12();
            case "U_tls[1][3]":
                return getUTls13();
            case "U_tls[2][3]":
                return getUTls23();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the TLS group membership for
     * this atom.
     * @return StrColumn
     */
    public StrColumn getTlsGroupId() {
        return delegate.getColumn("tls_group_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
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
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls11() {
        return delegate.getColumn("U_tls[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls22() {
        return delegate.getColumn("U_tls[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls33() {
        return delegate.getColumn("U_tls[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls12() {
        return delegate.getColumn("U_tls[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls13() {
        return delegate.getColumn("U_tls[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getUTls23() {
        return delegate.getColumn("U_tls[2][3]", DelegatingFloatColumn::new);
    }

}