package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSite extends BaseCategory {
    public AtomSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSite(String name) {
        super(name);
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_atom_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_comp_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_seq_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * 
     * Note that this is not necessarily a number, that the values do
     * not have to be positive, and that the value does not have to
     * correspond to the value of _atom_site.label_seq_id. The value
     * of _atom_site.label_seq_id is required to be a sequential list
     * of positive integers.
     * 
     * The author may assign values to _atom_site.auth_seq_id in any
     * desired way. For instance, the values may be used to relate
     * this structure to a numbering scheme in a homologous structure,
     * including sequence gaps or insertion codes. Alternatively, a
     * scheme may be used for a truncated polymer that maintains the
     * numbering scheme of the full length polymer. In all cases, the
     * scheme used here must match the scheme used in the publication
     * that describes the structure.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, B~eq~, calculated from the
     * anisotropic displacement parameters.
     * 
     * B~eq~ = (1/3) sum~i~[sum~j~(B^ij^ A~i~ A~j~ a*~i~ a*~j~)]
     * 
     * A     = the real space cell lengths
     * a*    = the reciprocal space cell lengths
     * B^ij^ = 8 pi^2^ U^ij^
     * 
     * Ref: Fischer, R. X. & Tillmanns, E. (1988). Acta Cryst. C44,
     * 775-776.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * 
     * Note -
     * 
     * The particular type of ADP stored in this item is qualified
     * by item _refine.pdbx_adp_type.
     * @return BIsoOrEquiv
     */
    public BIsoOrEquiv getBIsoOrEquiv() {
        return (BIsoOrEquiv) (isText ? textFields.computeIfAbsent("B_iso_or_equiv",
                BIsoOrEquiv::new) : getBinaryColumn("B_iso_or_equiv"));
    }

    /**
     * The x atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnX
     */
    public CartnX getCartnX() {
        return (CartnX) (isText ? textFields.computeIfAbsent("Cartn_x",
                CartnX::new) : getBinaryColumn("Cartn_x"));
    }

    /**
     * The y atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnY
     */
    public CartnY getCartnY() {
        return (CartnY) (isText ? textFields.computeIfAbsent("Cartn_y",
                CartnY::new) : getBinaryColumn("Cartn_y"));
    }

    /**
     * The z atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnZ
     */
    public CartnZ getCartnZ() {
        return (CartnZ) (isText ? textFields.computeIfAbsent("Cartn_z",
                CartnZ::new) : getBinaryColumn("Cartn_z"));
    }

    /**
     * The group of atoms to which the atom site belongs. This data
     * item is provided for compatibility with the original Protein
     * Data Bank format, and only for that purpose.
     * @return GroupPDB
     */
    public GroupPDB getGroupPDB() {
        return (GroupPDB) (isText ? textFields.computeIfAbsent("group_PDB",
                GroupPDB::new) : getBinaryColumn("group_PDB"));
    }

    /**
     * The value of _atom_site.id must uniquely identify a record in the
     * ATOM_SITE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * 
     * This data item was introduced to provide compatibility between
     * small-molecule and macromolecular CIFs. In a small-molecule
     * CIF, _atom_site_label is the identifier for the atom. In a
     * macromolecular CIF, the atom identifier is the aggregate of
     * _atom_site.label_alt_id, _atom_site.label_asym_id,
     * _atom_site.label_atom_id, _atom_site.label_comp_id and
     * _atom_site.label_seq_id. For the two types of files to be
     * compatible, a formal identifier for the category had to be
     * introduced that was independent of the different modes of
     * identifying the atoms. For compatibility with older CIFs,
     * _atom_site_label is aliased to _atom_site.id.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the ATOM_SITE_ALT
     * category.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the STRUCT_ASYM
     * category.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return LabelEntityId
     */
    public LabelEntityId getLabelEntityId() {
        return (LabelEntityId) (isText ? textFields.computeIfAbsent("label_entity_id",
                LabelEntityId::new) : getBinaryColumn("label_entity_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site.
     * @return Occupancy
     */
    public Occupancy getOccupancy() {
        return (Occupancy) (isText ? textFields.computeIfAbsent("occupancy",
                Occupancy::new) : getBinaryColumn("occupancy"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }

    /**
     * PDB insertion code.
     * @return PdbxPDBInsCode
     */
    public PdbxPDBInsCode getPdbxPDBInsCode() {
        return (PdbxPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code",
                PdbxPDBInsCode::new) : getBinaryColumn("pdbx_PDB_ins_code"));
    }

    /**
     * PDB model number.
     * @return PdbxPDBModelNum
     */
    public PdbxPDBModelNum getPdbxPDBModelNum() {
        return (PdbxPDBModelNum) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num",
                PdbxPDBModelNum::new) : getBinaryColumn("pdbx_PDB_model_num"));
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return PdbxFormalCharge
     */
    public PdbxFormalCharge getPdbxFormalCharge() {
        return (PdbxFormalCharge) (isText ? textFields.computeIfAbsent("pdbx_formal_charge",
                PdbxFormalCharge::new) : getBinaryColumn("pdbx_formal_charge"));
    }
}
