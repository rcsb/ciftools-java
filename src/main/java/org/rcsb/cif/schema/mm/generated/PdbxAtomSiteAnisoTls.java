package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
 * about the TLS contribution to anisotropic displacement parameters.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }

    /**
     * This data item identifies the TLS group membership for
     * this atom.
     * @return StrColumn
     */
    public StrColumn getTlsGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tls_group_id", StrColumn::new) :
                getBinaryColumn("tls_group_id"));
    }

    /**
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.pdbx_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id", StrColumn::new) :
                getBinaryColumn("label_atom_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[1][1]", FloatColumn::new) :
                getBinaryColumn("U_tls[1][1]"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[2][2]", FloatColumn::new) :
                getBinaryColumn("U_tls[2][2]"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[3][3]", FloatColumn::new) :
                getBinaryColumn("U_tls[3][3]"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[1][2]", FloatColumn::new) :
                getBinaryColumn("U_tls[1][2]"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[1][3]", FloatColumn::new) :
                getBinaryColumn("U_tls[1][3]"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_tls[2][3]", FloatColumn::new) :
                getBinaryColumn("U_tls[2][3]"));
    }
}
