package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_MAIN_CHAIN_PLANE category list the
 * residues that contain unexpected deviations from planes
 * for main chain atoms as defined by the improper torsion
 * angle describing planarity:
 * 
 * PLANARITY = C(i-1) - CA(i-1) - N(i) - O(i-1) ==&gt; planar &lt; 5
 * as a pseudo torsion
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValidateMainChainPlane extends BaseCategory {
    public PdbxValidateMainChainPlane(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateMainChainPlane(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateMainChainPlane(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_main_chain_plane.id must uniquely identify
     * each item in the PDBX_VALIDATE_MAIN_CHAIN_PLANE list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the residue in which the plane is calculated
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
     * Part of the identifier of the residue in which the plane is calculated
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
     * Part of the identifier of the residue in which the plane is calculated
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
     * Part of the identifier of the residue in which the plane is calculated
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
     * Optional identifier of the residue in which the plane is calculated
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * Optional identifier of the residue in which the plane is calculated
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * The value for the torsion angle  C(i-1) - CA(i-1) - N(i) - O(i-1)
     * @return FloatColumn
     */
    public FloatColumn getImproperTorsionAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("improper_torsion_angle", FloatColumn::new) :
                getBinaryColumn("improper_torsion_angle"));
    }
}
