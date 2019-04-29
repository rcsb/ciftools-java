package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DOMAIN_RANGE category identify the
 * beginning and ending points of polypeptide chain segments
 * that form all or part of a domain.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDomainRange extends BaseCategory {
    public PdbxDomainRange(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDomainRange(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDomainRange(String name) {
        super(name);
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_alt_id", StrColumn::new) :
                getBinaryColumn("beg_label_alt_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_asym_id", StrColumn::new) :
                getBinaryColumn("beg_label_asym_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_label_comp_id", StrColumn::new) :
                getBinaryColumn("beg_label_comp_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_label_seq_id", IntColumn::new) :
                getBinaryColumn("beg_label_seq_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_asym_id", StrColumn::new) :
                getBinaryColumn("beg_auth_asym_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_comp_id", StrColumn::new) :
                getBinaryColumn("beg_auth_comp_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * This data item is a pointer to _pdbx_domain.id in the
     * PDBX_DOMAIN category.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("domain_id", StrColumn::new) :
                getBinaryColumn("domain_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_alt_id", StrColumn::new) :
                getBinaryColumn("end_label_alt_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_asym_id", StrColumn::new) :
                getBinaryColumn("end_label_asym_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_label_comp_id", StrColumn::new) :
                getBinaryColumn("end_label_comp_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_label_seq_id", IntColumn::new) :
                getBinaryColumn("end_label_seq_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_asym_id", StrColumn::new) :
                getBinaryColumn("end_auth_asym_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_comp_id", StrColumn::new) :
                getBinaryColumn("end_auth_comp_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }
}
