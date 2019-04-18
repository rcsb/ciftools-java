package org.rcsb.cif.model.structsite;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructSite extends BaseCategory {
    public StructSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSite(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the site.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_site.id must uniquely identify a record in
     * the STRUCT_SITE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * Number of residues in the site.
     * @return PdbxNumResidues
     */
    public PdbxNumResidues getPdbxNumResidues() {
        return (PdbxNumResidues) (isText ? getTextColumn("pdbx_num_residues") : getBinaryColumn("pdbx_num_residues"));
    }

    /**
     * Source of evidence supporting the assignment of this site.
     * @return PdbxEvidenceCode
     */
    public PdbxEvidenceCode getPdbxEvidenceCode() {
        return (PdbxEvidenceCode) (isText ? getTextColumn("pdbx_evidence_code") : getBinaryColumn("pdbx_evidence_code"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return PdbxAuthAsymId
     */
    public PdbxAuthAsymId getPdbxAuthAsymId() {
        return (PdbxAuthAsymId) (isText ? getTextColumn("pdbx_auth_asym_id") : getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return PdbxAuthCompId
     */
    public PdbxAuthCompId getPdbxAuthCompId() {
        return (PdbxAuthCompId) (isText ? getTextColumn("pdbx_auth_comp_id") : getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return PdbxAuthSeqId
     */
    public PdbxAuthSeqId getPdbxAuthSeqId() {
        return (PdbxAuthSeqId) (isText ? getTextColumn("pdbx_auth_seq_id") : getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * PDB insertion code for the ligand in the site.
     * @return PdbxAuthInsCode
     */
    public PdbxAuthInsCode getPdbxAuthInsCode() {
        return (PdbxAuthInsCode) (isText ? getTextColumn("pdbx_auth_ins_code") : getBinaryColumn("pdbx_auth_ins_code"));
    }
}
