package org.rcsb.cif.model.structconf;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructConf extends BaseCategory {
    public StructConf(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConf(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructConf(String name) {
        super(name);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? textFields.computeIfAbsent("beg_auth_seq_id",
                BegAuthSeqId::new) : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * A description of special aspects of the conformation assignment.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * The value of _struct_conf.id must uniquely identify a record in
     * the STRUCT_CONF list.
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
     * A component of the identifier for the residue at which the
     * conformation segment starts.
     * @return PdbxBegPDBInsCode
     */
    public PdbxBegPDBInsCode getPdbxBegPDBInsCode() {
        return (PdbxBegPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_beg_PDB_ins_code",
                PdbxBegPDBInsCode::new) : getBinaryColumn("pdbx_beg_PDB_ins_code"));
    }

    /**
     * This item is a place holder for the helix class used in the PDB
     * HELIX record.
     * @return PdbxPDBHelixClass
     */
    public PdbxPDBHelixClass getPdbxPDBHelixClass() {
        return (PdbxPDBHelixClass) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_class",
                PdbxPDBHelixClass::new) : getBinaryColumn("pdbx_PDB_helix_class"));
    }

    /**
     * 
     * A placeholder for the lengths of the helix of the PDB
     * HELIX record.
     * @return PdbxPDBHelixLength
     */
    public PdbxPDBHelixLength getPdbxPDBHelixLength() {
        return (PdbxPDBHelixLength) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_length",
                PdbxPDBHelixLength::new) : getBinaryColumn("pdbx_PDB_helix_length"));
    }

    /**
     * 
     * A placeholder for the helix identifier of the PDB
     * HELIX record.
     * @return PdbxPDBHelixId
     */
    public PdbxPDBHelixId getPdbxPDBHelixId() {
        return (PdbxPDBHelixId) (isText ? textFields.computeIfAbsent("pdbx_PDB_helix_id",
                PdbxPDBHelixId::new) : getBinaryColumn("pdbx_PDB_helix_id"));
    }
}
