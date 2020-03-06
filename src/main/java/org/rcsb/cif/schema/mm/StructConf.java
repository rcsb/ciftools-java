package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_CONF category record details about
 * the backbone conformation of a segment of polymer.
 * 
 * Data items in the STRUCT_CONF_TYPE category define the
 * criteria used to identify the backbone conformations.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructConf extends DelegatingCategory {
    public StructConf(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "beg_label_asym_id":
                return getBegLabelAsymId();
            case "beg_label_comp_id":
                return getBegLabelCompId();
            case "beg_label_seq_id":
                return getBegLabelSeqId();
            case "beg_auth_asym_id":
                return getBegAuthAsymId();
            case "beg_auth_comp_id":
                return getBegAuthCompId();
            case "beg_auth_seq_id":
                return getBegAuthSeqId();
            case "conf_type_id":
                return getConfTypeId();
            case "details":
                return getDetails();
            case "end_label_asym_id":
                return getEndLabelAsymId();
            case "end_label_comp_id":
                return getEndLabelCompId();
            case "end_label_seq_id":
                return getEndLabelSeqId();
            case "end_auth_asym_id":
                return getEndAuthAsymId();
            case "end_auth_comp_id":
                return getEndAuthCompId();
            case "end_auth_seq_id":
                return getEndAuthSeqId();
            case "id":
                return getId();
            case "pdbx_beg_PDB_ins_code":
                return getPdbxBegPDBInsCode();
            case "pdbx_end_PDB_ins_code":
                return getPdbxEndPDBInsCode();
            case "pdbx_PDB_helix_class":
                return getPdbxPDBHelixClass();
            case "pdbx_PDB_helix_length":
                return getPdbxPDBHelixLength();
            case "pdbx_PDB_helix_id":
                return getPdbxPDBHelixId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return delegate.getColumn("beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return delegate.getColumn("beg_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _struct_conf_type.id in the
     * STRUCT_CONF_TYPE category.
     * @return StrColumn
     */
    public StrColumn getConfTypeId() {
        return delegate.getColumn("conf_type_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the conformation assignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return delegate.getColumn("end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return delegate.getColumn("end_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _struct_conf.id must uniquely identify a record in
     * the STRUCT_CONF list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment starts.
     * @return StrColumn
     */
    public StrColumn getPdbxBegPDBInsCode() {
        return delegate.getColumn("pdbx_beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * @return StrColumn
     */
    public StrColumn getPdbxEndPDBInsCode() {
        return delegate.getColumn("pdbx_end_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * This item is a place holder for the helix class used in the PDB
     * HELIX record.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBHelixClass() {
        return delegate.getColumn("pdbx_PDB_helix_class", DelegatingStrColumn::new);
    }

    /**
     * A placeholder for the lengths of the helix of the PDB
     * HELIX record.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBHelixLength() {
        return delegate.getColumn("pdbx_PDB_helix_length", DelegatingIntColumn::new);
    }

    /**
     * A placeholder for the helix identifier of the PDB
     * HELIX record.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBHelixId() {
        return delegate.getColumn("pdbx_PDB_helix_id", DelegatingStrColumn::new);
    }

}