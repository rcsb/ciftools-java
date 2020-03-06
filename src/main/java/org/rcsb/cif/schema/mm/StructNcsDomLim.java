package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_NCS_DOM_LIM category identify the
 * start and end points of polypeptide chain segments
 * that form all or part of a domain in an ensemble of domains
 * related by noncrystallographic symmetry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsDomLim extends DelegatingCategory {
    public StructNcsDomLim(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "beg_label_alt_id":
                return getBegLabelAltId();
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
            case "dom_id":
                return getDomId();
            case "end_label_alt_id":
                return getEndLabelAltId();
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
            case "selection_details":
                return getSelectionDetails();
            case "pdbx_component_id":
                return getPdbxComponentId();
            case "pdbx_refine_code":
                return getPdbxRefineCode();
            case "pdbx_ens_id":
                return getPdbxEnsId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegLabelAltId() {
        return delegate.getColumn("beg_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return delegate.getColumn("beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthCompId() {
        return delegate.getColumn("beg_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return delegate.getColumn("dom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndLabelAltId() {
        return delegate.getColumn("end_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return delegate.getColumn("end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return delegate.getColumn("end_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A text description of the selection of residues that
     * correspond to this domain.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return delegate.getColumn("selection_details", DelegatingStrColumn::new);
    }

    /**
     * Record number of the NCS domain limit assignment.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentId() {
        return delegate.getColumn("pdbx_component_id", DelegatingIntColumn::new);
    }

    /**
     * record the refinement code number (from CCP4.)
     * @return FloatColumn
     */
    public FloatColumn getPdbxRefineCode() {
        return delegate.getColumn("pdbx_refine_code", DelegatingFloatColumn::new);
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return delegate.getColumn("pdbx_ens_id", DelegatingStrColumn::new);
    }

}