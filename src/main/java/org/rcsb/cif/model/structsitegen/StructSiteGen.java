package org.rcsb.cif.model.structsitegen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructSiteGen extends BaseCategory {
    public StructSiteGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSiteGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSiteGen(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the symmetry generation of
     * this portion of the structural site.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_site_gen.id must uniquely identify a record
     * in the STRUCT_SITE_GEN list.
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
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _struct_site_gen.label* to generate a
     * portion of the site.
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return (Symmetry) (isText ? textFields.computeIfAbsent("symmetry",
                Symmetry::new) : getBinaryColumn("symmetry"));
    }

    /**
     * PDB insertion code.
     * @return PdbxAuthInsCode
     */
    public PdbxAuthInsCode getPdbxAuthInsCode() {
        return (PdbxAuthInsCode) (isText ? textFields.computeIfAbsent("pdbx_auth_ins_code",
                PdbxAuthInsCode::new) : getBinaryColumn("pdbx_auth_ins_code"));
    }

    /**
     * Number of residues in the site.
     * @return PdbxNumRes
     */
    public PdbxNumRes getPdbxNumRes() {
        return (PdbxNumRes) (isText ? textFields.computeIfAbsent("pdbx_num_res",
                PdbxNumRes::new) : getBinaryColumn("pdbx_num_res"));
    }
}
