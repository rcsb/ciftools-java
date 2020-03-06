package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SITE category record details about
 * portions of the structure that contribute to structurally
 * relevant sites (e.g. active sites, substrate-binding subsites,
 * metal-coordination sites).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSite extends DelegatingCategory {
    public StructSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "pdbx_num_residues":
                return getPdbxNumResidues();
            case "pdbx_evidence_code":
                return getPdbxEvidenceCode();
            case "pdbx_auth_asym_id":
                return getPdbxAuthAsymId();
            case "pdbx_auth_comp_id":
                return getPdbxAuthCompId();
            case "pdbx_auth_seq_id":
                return getPdbxAuthSeqId();
            case "pdbx_auth_ins_code":
                return getPdbxAuthInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the site.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_site.id must uniquely identify a record in
     * the STRUCT_SITE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Number of residues in the site.
     * @return IntColumn
     */
    public IntColumn getPdbxNumResidues() {
        return delegate.getColumn("pdbx_num_residues", DelegatingIntColumn::new);
    }

    /**
     * Source of evidence supporting the assignment of this site.
     * @return StrColumn
     */
    public StrColumn getPdbxEvidenceCode() {
        return delegate.getColumn("pdbx_evidence_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return delegate.getColumn("pdbx_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return delegate.getColumn("pdbx_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return delegate.getColumn("pdbx_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code for the ligand in the site.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode() {
        return delegate.getColumn("pdbx_auth_ins_code", DelegatingStrColumn::new);
    }

}