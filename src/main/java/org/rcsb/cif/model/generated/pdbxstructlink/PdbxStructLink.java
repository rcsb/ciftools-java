package org.rcsb.cif.model.generated.pdbxstructlink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * @return Ptnr1LabelAltId
     */
    public Ptnr1LabelAltId getPtnr1LabelAltId() {
        return (Ptnr1LabelAltId) (isText ? textFields.computeIfAbsent("ptnr1_label_alt_id",
                Ptnr1LabelAltId::new) : getBinaryColumn("ptnr1_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelAsymId
     */
    public Ptnr1LabelAsymId getPtnr1LabelAsymId() {
        return (Ptnr1LabelAsymId) (isText ? textFields.computeIfAbsent("ptnr1_label_asym_id",
                Ptnr1LabelAsymId::new) : getBinaryColumn("ptnr1_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return Ptnr1LabelAtomId
     */
    public Ptnr1LabelAtomId getPtnr1LabelAtomId() {
        return (Ptnr1LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr1_label_atom_id",
                Ptnr1LabelAtomId::new) : getBinaryColumn("ptnr1_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelCompId
     */
    public Ptnr1LabelCompId getPtnr1LabelCompId() {
        return (Ptnr1LabelCompId) (isText ? textFields.computeIfAbsent("ptnr1_label_comp_id",
                Ptnr1LabelCompId::new) : getBinaryColumn("ptnr1_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr1LabelSeqId
     */
    public Ptnr1LabelSeqId getPtnr1LabelSeqId() {
        return (Ptnr1LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr1_label_seq_id",
                Ptnr1LabelSeqId::new) : getBinaryColumn("ptnr1_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * @return Ptnr1LabelInsCode
     */
    public Ptnr1LabelInsCode getPtnr1LabelInsCode() {
        return (Ptnr1LabelInsCode) (isText ? textFields.computeIfAbsent("ptnr1_label_ins_code",
                Ptnr1LabelInsCode::new) : getBinaryColumn("ptnr1_label_ins_code"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr1_label* to generate the
     * first partner in the structure connection.
     * @return Ptnr1Symmetry
     */
    public Ptnr1Symmetry getPtnr1Symmetry() {
        return (Ptnr1Symmetry) (isText ? textFields.computeIfAbsent("ptnr1_symmetry",
                Ptnr1Symmetry::new) : getBinaryColumn("ptnr1_symmetry"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return Ptnr2LabelAltId
     */
    public Ptnr2LabelAltId getPtnr2LabelAltId() {
        return (Ptnr2LabelAltId) (isText ? textFields.computeIfAbsent("ptnr2_label_alt_id",
                Ptnr2LabelAltId::new) : getBinaryColumn("ptnr2_label_alt_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelAsymId
     */
    public Ptnr2LabelAsymId getPtnr2LabelAsymId() {
        return (Ptnr2LabelAsymId) (isText ? textFields.computeIfAbsent("ptnr2_label_asym_id",
                Ptnr2LabelAsymId::new) : getBinaryColumn("ptnr2_label_asym_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return Ptnr2LabelAtomId
     */
    public Ptnr2LabelAtomId getPtnr2LabelAtomId() {
        return (Ptnr2LabelAtomId) (isText ? textFields.computeIfAbsent("ptnr2_label_atom_id",
                Ptnr2LabelAtomId::new) : getBinaryColumn("ptnr2_label_atom_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelCompId
     */
    public Ptnr2LabelCompId getPtnr2LabelCompId() {
        return (Ptnr2LabelCompId) (isText ? textFields.computeIfAbsent("ptnr2_label_comp_id",
                Ptnr2LabelCompId::new) : getBinaryColumn("ptnr2_label_comp_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return Ptnr2LabelSeqId
     */
    public Ptnr2LabelSeqId getPtnr2LabelSeqId() {
        return (Ptnr2LabelSeqId) (isText ? textFields.computeIfAbsent("ptnr2_label_seq_id",
                Ptnr2LabelSeqId::new) : getBinaryColumn("ptnr2_label_seq_id"));
    }

    /**
     * A component of the identifier for partner 2 of the structure
     * connection.
     * @return Ptnr2LabelInsCode
     */
    public Ptnr2LabelInsCode getPtnr2LabelInsCode() {
        return (Ptnr2LabelInsCode) (isText ? textFields.computeIfAbsent("ptnr2_label_ins_code",
                Ptnr2LabelInsCode::new) : getBinaryColumn("ptnr2_label_ins_code"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_link.ptnr2_label* to generate the
     * second partner in the structure connection.
     * @return Ptnr2Symmetry
     */
    public Ptnr2Symmetry getPtnr2Symmetry() {
        return (Ptnr2Symmetry) (isText ? textFields.computeIfAbsent("ptnr2_symmetry",
                Ptnr2Symmetry::new) : getBinaryColumn("ptnr2_symmetry"));
    }

    /**
     * Text description of the linkage.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The linkage distance in angstroms.
     * @return PdbxDistValue
     */
    public PdbxDistValue getPdbxDistValue() {
        return (PdbxDistValue) (isText ? textFields.computeIfAbsent("pdbx_dist_value",
                PdbxDistValue::new) : getBinaryColumn("pdbx_dist_value"));
    }
}
