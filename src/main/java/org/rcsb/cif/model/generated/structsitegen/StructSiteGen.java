package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructSiteGen extends BaseCifCategory {
    public StructSiteGen(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public StructSiteGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the structural site.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_site_gen.id must uniquely identify a record
     * in the STRUCT_SITE_GEN list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? getTextColumn("label_alt_id") : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? getTextColumn("label_asym_id") : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? getTextColumn("label_atom_id") : getBinaryColumn("label_atom_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? getTextColumn("label_comp_id") : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? getTextColumn("label_seq_id") : getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? getTextColumn("auth_asym_id") : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? getTextColumn("auth_comp_id") : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? getTextColumn("auth_seq_id") : getBinaryColumn("auth_seq_id"));
    }

    /**
     * This data item is a pointer to _struct_site.id in the STRUCT_SITE
     * category.
     * @return SiteId
     */
    public SiteId getSiteId() {
        return (SiteId) (isText ? getTextColumn("site_id") : getBinaryColumn("site_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_site_gen.label* to generate a
     * portion of the site.
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return (Symmetry) (isText ? getTextColumn("symmetry") : getBinaryColumn("symmetry"));
    }

    /**
     * PDB insertion code.
     * @return PdbxAuthInsCode
     */
    public PdbxAuthInsCode getPdbxAuthInsCode() {
        return (PdbxAuthInsCode) (isText ? getTextColumn("pdbx_auth_ins_code") : getBinaryColumn("pdbx_auth_ins_code"));
    }

    /**
     * Number of residues in the site.
     * @return PdbxNumRes
     */
    public PdbxNumRes getPdbxNumRes() {
        return (PdbxNumRes) (isText ? getTextColumn("pdbx_num_res") : getBinaryColumn("pdbx_num_res"));
    }
}
