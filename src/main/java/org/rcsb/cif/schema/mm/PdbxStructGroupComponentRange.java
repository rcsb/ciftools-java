package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
 * group as a continuous span chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructGroupComponentRange extends DelegatingCategory {
    public PdbxStructGroupComponentRange(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "struct_group_id":
                return getStructGroupId();
            case "PDB_model_num":
                return getPDBModelNum();
            case "beg_auth_asym_id":
                return getBegAuthAsymId();
            case "beg_auth_comp_id":
                return getBegAuthCompId();
            case "beg_auth_seq_id":
                return getBegAuthSeqId();
            case "beg_PDB_ins_code":
                return getBegPDBInsCode();
            case "beg_label_asym_id":
                return getBegLabelAsymId();
            case "beg_label_comp_id":
                return getBegLabelCompId();
            case "beg_label_seq_id":
                return getBegLabelSeqId();
            case "beg_label_alt_id":
                return getBegLabelAltId();
            case "end_auth_asym_id":
                return getEndAuthAsymId();
            case "end_auth_comp_id":
                return getEndAuthCompId();
            case "end_auth_seq_id":
                return getEndAuthSeqId();
            case "end_PDB_ins_code":
                return getEndPDBInsCode();
            case "end_label_asym_id":
                return getEndLabelAsymId();
            case "end_label_comp_id":
                return getEndLabelCompId();
            case "end_label_seq_id":
                return getEndLabelSeqId();
            case "end_label_alt_id":
                return getEndLabelAltId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_struct_group_component_range.id must uniquely identify
     * a record in the PDBX_STRUCT_GROUP_COMPONENT_RANGE list.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_struct_group_list.struct_group_id in the
     * PDBX_STRUCT_GROUP_LIST category.
     * @return StrColumn
     */
    public StrColumn getStructGroupId() {
        return delegate.getColumn("struct_group_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return delegate.getColumn("beg_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegPDBInsCode() {
        return delegate.getColumn("beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return delegate.getColumn("beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAltId() {
        return delegate.getColumn("beg_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return delegate.getColumn("end_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndPDBInsCode() {
        return delegate.getColumn("end_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return delegate.getColumn("end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier for the component range in this group assignment.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAltId() {
        return delegate.getColumn("end_label_alt_id", DelegatingStrColumn::new);
    }

}