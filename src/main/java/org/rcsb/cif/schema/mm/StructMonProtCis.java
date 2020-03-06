package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_MON_PROT_CIS category identify
 * monomers that have been found to have the peptide bond in the cis
 * conformation. The criterion used to select residues to be
 * designated as containing cis peptide bonds is given in
 * _struct_mon_details.prot_cis.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructMonProtCis extends DelegatingCategory {
    public StructMonProtCis(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_seq_id":
                return getLabelSeqId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "pdbx_auth_asym_id_2":
                return getPdbxAuthAsymId2();
            case "pdbx_auth_comp_id_2":
                return getPdbxAuthCompId2();
            case "pdbx_auth_seq_id_2":
                return getPdbxAuthSeqId2();
            case "pdbx_label_asym_id_2":
                return getPdbxLabelAsymId2();
            case "pdbx_label_comp_id_2":
                return getPdbxLabelCompId2();
            case "pdbx_label_seq_id_2":
                return getPdbxLabelSeqId2();
            case "pdbx_PDB_ins_code":
                return getPdbxPDBInsCode();
            case "pdbx_PDB_ins_code_2":
                return getPdbxPDBInsCode2();
            case "pdbx_PDB_model_num":
                return getPdbxPDBModelNum();
            case "pdbx_omega_angle":
                return getPdbxOmegaAngle();
            case "pdbx_id":
                return getPdbxId();
            case "pdbx_auth_ins_code":
                return getPdbxAuthInsCode();
            case "pdbx_auth_ins_code_2":
                return getPdbxAuthInsCode2();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId2() {
        return delegate.getColumn("pdbx_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId2() {
        return delegate.getColumn("pdbx_auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.auth_seq_id
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId2() {
        return delegate.getColumn("pdbx_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_asym_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelAsymId2() {
        return delegate.getColumn("pdbx_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_comp_id.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelCompId2() {
        return delegate.getColumn("pdbx_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.label_seq_id
     * @return IntColumn
     */
    public IntColumn getPdbxLabelSeqId2() {
        return delegate.getColumn("pdbx_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode() {
        return delegate.getColumn("pdbx_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_ins_code
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode2() {
        return delegate.getColumn("pdbx_PDB_ins_code_2", DelegatingStrColumn::new);
    }

    /**
     * Pointer to _atom_site.pdbx_PDB_model_num
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return delegate.getColumn("pdbx_PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * omega torsion angle
     * @return StrColumn
     */
    public StrColumn getPdbxOmegaAngle() {
        return delegate.getColumn("pdbx_omega_angle", DelegatingStrColumn::new);
    }

    /**
     * ordinal index
     * @return StrColumn
     */
    public StrColumn getPdbxId() {
        return delegate.getColumn("pdbx_id", DelegatingStrColumn::new);
    }

    /**
     * PDB Insertion code
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode() {
        return delegate.getColumn("pdbx_auth_ins_code", DelegatingStrColumn::new);
    }

    /**
     * PDB Insertion code
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode2() {
        return delegate.getColumn("pdbx_auth_ins_code_2", DelegatingStrColumn::new);
    }

}