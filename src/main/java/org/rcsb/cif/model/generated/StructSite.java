package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SITE category record details about
 * portions of the structure that contribute to structurally
 * relevant sites (e.g. active sites, substrate-binding subsites,
 * metal-coordination sites).
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Number of residues in the site.
     * @return IntColumn
     */
    public IntColumn getPdbxNumResidues() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_num_residues", IntColumn::new) :
                getBinaryColumn("pdbx_num_residues"));
    }

    /**
     * Source of evidence supporting the assignment of this site.
     * @return StrColumn
     */
    public StrColumn getPdbxEvidenceCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_evidence_code", StrColumn::new) :
                getBinaryColumn("pdbx_evidence_code"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * A component of the identifier for the ligand in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * PDB insertion code for the ligand in the site.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_auth_ins_code"));
    }
}
