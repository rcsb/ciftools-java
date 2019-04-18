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
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Number of residues in the site.
     * @return PdbxNumResidues
     */
    public PdbxNumResidues getPdbxNumResidues() {
        return (PdbxNumResidues) (isText ? textFields.computeIfAbsent("pdbx_num_residues",
                PdbxNumResidues::new) : getBinaryColumn("pdbx_num_residues"));
    }

    /**
     * Source of evidence supporting the assignment of this site.
     * @return PdbxEvidenceCode
     */
    public PdbxEvidenceCode getPdbxEvidenceCode() {
        return (PdbxEvidenceCode) (isText ? textFields.computeIfAbsent("pdbx_evidence_code",
                PdbxEvidenceCode::new) : getBinaryColumn("pdbx_evidence_code"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return PdbxAuthAsymId
     */
    public PdbxAuthAsymId getPdbxAuthAsymId() {
        return (PdbxAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id",
                PdbxAuthAsymId::new) : getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return PdbxAuthCompId
     */
    public PdbxAuthCompId getPdbxAuthCompId() {
        return (PdbxAuthCompId) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id",
                PdbxAuthCompId::new) : getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return PdbxAuthSeqId
     */
    public PdbxAuthSeqId getPdbxAuthSeqId() {
        return (PdbxAuthSeqId) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id",
                PdbxAuthSeqId::new) : getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * PDB insertion code for the ligand in the site.
     * @return PdbxAuthInsCode
     */
    public PdbxAuthInsCode getPdbxAuthInsCode() {
        return (PdbxAuthInsCode) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code",
                PdbxAuthInsCode::new) : getBinaryColumn("pdbx_auth_ins_code"));
    }
}
