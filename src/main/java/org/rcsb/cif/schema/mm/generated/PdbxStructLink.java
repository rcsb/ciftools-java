package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_LINK category record details about
 * covalent linkages in the structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructLink extends BaseCategory {
    public PdbxStructLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructLink(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_link.id must uniquely identify a record in
     * the PDBX_STRUCT_LINK list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr1_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr1LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1LabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_label_ins_code", StrColumn::new) :
                getBinaryColumn("ptnr1_label_ins_code"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr1_label* to generate the
     * first partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr1Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr1_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_alt_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_asym_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_comp_id", StrColumn::new) :
                getBinaryColumn("ptnr2_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPtnr2LabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_seq_id", IntColumn::new) :
                getBinaryColumn("ptnr2_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2LabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_label_ins_code", StrColumn::new) :
                getBinaryColumn("ptnr2_label_ins_code"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return StrColumn
     */
    public StrColumn getPtnr2Symmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ptnr2_symmetry", StrColumn::new) :
                getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * Text description of the linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The linkage distance in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDistValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_dist_value", FloatColumn::new) :
                getBinaryColumn("pdbx_dist_value"));
    }
}
