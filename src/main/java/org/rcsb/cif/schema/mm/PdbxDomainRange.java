package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DOMAIN_RANGE category identify the
 * beginning and ending points of polypeptide chain segments
 * that form all or part of a domain.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDomainRange extends DelegatingCategory {
    public PdbxDomainRange(Category delegate) {
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
            case "domain_id":
                return getDomainId();
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
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAltId() {
        return delegate.getColumn("beg_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegLabelCompId() {
        return delegate.getColumn("beg_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
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
     * This data item is a pointer to _pdbx_domain.id in the
     * PDBX_DOMAIN category.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return delegate.getColumn("domain_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAltId() {
        return delegate.getColumn("end_label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndLabelCompId() {
        return delegate.getColumn("end_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthCompId() {
        return delegate.getColumn("end_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer at which this
     * segment of the domain ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
    }

}