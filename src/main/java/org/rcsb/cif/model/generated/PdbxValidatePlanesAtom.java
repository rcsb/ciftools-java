package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
 * residues that contain unexpected deviations from planes
 * centers.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxValidatePlanesAtom extends BaseCategory {
    public PdbxValidatePlanesAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidatePlanesAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidatePlanesAtom(String name) {
        super(name);
    }

    /**
     * A pointer to _pdbx_validate_planes.id
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getPlaneId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("plane_id", IntColumn::new) :
                getBinaryColumn("plane_id"));
    }

    /**
     * The value of _pdbx_validate_planes_atom.id must uniquely identify
     * each item in the PDBX_VALIDATE_PLANES_ATOM list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for an atom site defining the plane
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Optional identifier of an atom site that defines the plane
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * The deviation from the plane per atom
     * @return FloatColumn
     */
    public FloatColumn getAtomDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("atom_deviation", FloatColumn::new) :
                getBinaryColumn("atom_deviation"));
    }
}
