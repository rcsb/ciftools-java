package org.rcsb.cif.model.pdbxvalidateplanesatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return PlaneId
     */
    public PlaneId getPlaneId() {
        return (PlaneId) (isText ? textFields.computeIfAbsent("plane_id",
                PlaneId::new) : getBinaryColumn("plane_id"));
    }

    /**
     * The value of _pdbx_validate_planes_atom.id must uniquely identify
     * each item in the PDBX_VALIDATE_PLANES_ATOM list.
     * 
     * This is an integer serial number.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model number for an atom site defining the plane
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return PDBModelNum
     */
    public PDBModelNum getPDBModelNum() {
        return (PDBModelNum) (isText ? textFields.computeIfAbsent("PDB_model_num",
                PDBModelNum::new) : getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Optional identifier of an atom site that defines the plane
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * The deviation from the plane per atom
     * @return AtomDeviation
     */
    public AtomDeviation getAtomDeviation() {
        return (AtomDeviation) (isText ? textFields.computeIfAbsent("atom_deviation",
                AtomDeviation::new) : getBinaryColumn("atom_deviation"));
    }
}
