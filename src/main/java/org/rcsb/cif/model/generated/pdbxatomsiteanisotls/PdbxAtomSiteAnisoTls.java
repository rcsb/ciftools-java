package org.rcsb.cif.model.generated.pdbxatomsiteanisotls;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAtomSiteAnisoTls extends BaseCategory {
    public PdbxAtomSiteAnisoTls(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAtomSiteAnisoTls(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAtomSiteAnisoTls(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }

    /**
     * This data item identifies the TLS group membership for
     * this atom.
     * @return TlsGroupId
     */
    public TlsGroupId getTlsGroupId() {
        return (TlsGroupId) (isText ? textFields.computeIfAbsent("tls_group_id",
                TlsGroupId::new) : getBinaryColumn("tls_group_id"));
    }

    /**
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITE category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls11
     */
    public UTls11 getUTls11() {
        return (UTls11) (isText ? textFields.computeIfAbsent("U_tls[1][1]",
                UTls11::new) : getBinaryColumn("U_tls[1][1]"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls22
     */
    public UTls22 getUTls22() {
        return (UTls22) (isText ? textFields.computeIfAbsent("U_tls[2][2]",
                UTls22::new) : getBinaryColumn("U_tls[2][2]"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls33
     */
    public UTls33 getUTls33() {
        return (UTls33) (isText ? textFields.computeIfAbsent("U_tls[3][3]",
                UTls33::new) : getBinaryColumn("U_tls[3][3]"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls12
     */
    public UTls12 getUTls12() {
        return (UTls12) (isText ? textFields.computeIfAbsent("U_tls[1][2]",
                UTls12::new) : getBinaryColumn("U_tls[1][2]"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls13
     */
    public UTls13 getUTls13() {
        return (UTls13) (isText ? textFields.computeIfAbsent("U_tls[1][3]",
                UTls13::new) : getBinaryColumn("U_tls[1][3]"));
    }

    /**
     * The elements of the TLS contribution to the atomic
     * displacement matrix U.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return UTls23
     */
    public UTls23 getUTls23() {
        return (UTls23) (isText ? textFields.computeIfAbsent("U_tls[2][3]",
                UTls23::new) : getBinaryColumn("U_tls[2][3]"));
    }
}
