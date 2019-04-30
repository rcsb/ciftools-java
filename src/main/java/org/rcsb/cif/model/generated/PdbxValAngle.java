package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_VAL_ANGLE category lists the covalent bond angles
 * in this entry deviating by greater than 6*sigma from
 * standard values.
 * 
 * This is a completely derived category.  Do not edit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValAngle extends BaseCategory {
    public PdbxValAngle(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValAngle(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValAngle(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_val_angle.id must uniquely identify
     * each item in the PDBX_VAL_ANGLE list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("auth_atom_id_1"));
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * Identifier of the first of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("auth_atom_id_2"));
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * Identifier of the second of the three atom sites
     * that define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("auth_seq_id_2"));
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_3", StrColumn::new) :
                getBinaryColumn("auth_atom_id_3"));
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_3", StrColumn::new) :
                getBinaryColumn("auth_asym_id_3"));
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_3", StrColumn::new) :
                getBinaryColumn("auth_comp_id_3"));
    }

    /**
     * Identifier of the third of the three atom sites that
     * define the angle.
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_3", StrColumn::new) :
                getBinaryColumn("auth_seq_id_3"));
    }

    /**
     * Optional identifier of the first of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_1", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_1"));
    }

    /**
     * Optional identifier of the second of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_2", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_2"));
    }

    /**
     * Optional identifier of the third of the three atom sites that
     * define the angle.
     * @return StrColumn
     */
    public StrColumn getAuthPDBInsertId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_PDB_insert_id_3", StrColumn::new) :
                getBinaryColumn("auth_PDB_insert_id_3"));
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id_1", StrColumn::new) :
                getBinaryColumn("label_asym_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_1", StrColumn::new) :
                getBinaryColumn("label_atom_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id_1", StrColumn::new) :
                getBinaryColumn("label_comp_id_1"));
    }

    /**
     * A component of the identifier for partner 1 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id_1", IntColumn::new) :
                getBinaryColumn("label_seq_id_1"));
    }

    /**
     * A component of the identifier for partner 2 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_2", StrColumn::new) :
                getBinaryColumn("label_alt_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id_2", StrColumn::new) :
                getBinaryColumn("label_asym_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the angle
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_2", StrColumn::new) :
                getBinaryColumn("label_atom_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id_2", StrColumn::new) :
                getBinaryColumn("label_comp_id_2"));
    }

    /**
     * A component of the identifier for partner 2 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id_2", IntColumn::new) :
                getBinaryColumn("label_seq_id_2"));
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * @return StrColumn
     */
    public StrColumn getLabelAltId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_3", StrColumn::new) :
                getBinaryColumn("label_alt_id_3"));
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id_3", StrColumn::new) :
                getBinaryColumn("label_asym_id_3"));
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id_3", StrColumn::new) :
                getBinaryColumn("label_atom_id_3"));
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id_3", StrColumn::new) :
                getBinaryColumn("label_comp_id_3"));
    }

    /**
     * A component of the identifier for partner 3 of the angle
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId3() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id_3", IntColumn::new) :
                getBinaryColumn("label_seq_id_3"));
    }

    /**
     * Value of the angle deviating by more than 6*RMSD from
     * the expected dictionary value.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle", FloatColumn::new) :
                getBinaryColumn("angle"));
    }

    /**
     * Value of the deviation (in degrees)  from 6*RMSD for
     * the angle bounded by the three sites from the expected
     * dictionary value
     * @return FloatColumn
     */
    public FloatColumn getAngleDeviation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_deviation", FloatColumn::new) :
                getBinaryColumn("angle_deviation"));
    }
}
