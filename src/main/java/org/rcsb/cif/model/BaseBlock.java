package org.rcsb.cif.model;

import org.rcsb.cif.internal.ModelFactory;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Generated("org.rcsb.cif.internal.Schema")
public class BaseBlock implements Block {
    private final Map<String, Category> categories;
    private final List<Block> saveFrames;
    private final String header;

    public BaseBlock(Map<String, Category> categories, String header, List<Block> saveFrames) {
        this.categories = categories;
        this.saveFrames = saveFrames;
        this.header = header;
    }

    public BaseBlock(Map<String, Category> categories, String header) {
        this(categories, header, new ArrayList<>());
    }

    @Override
    public String getBlockHeader() {
        return header;
    }

    @Override
    public Category getCategory(String name) {
        // try to return category, if unknown and not present, return empty category
        return categories.computeIfAbsent(name, ModelFactory::createEmptyCategory);
    }

    @Override
    public List<String> getCategoryNames() {
        return new ArrayList<>(categories.keySet());
    }

    @Override
    public List<Block> getSaveFrames() {
        return saveFrames;
    }

    /**
     * Data items in the ATOM_SITE category record details about
     * the atom sites in a macromolecular crystal structure, such as
     * the positional coordinates, atomic displacement parameters,
     * magnetic moments and directions.
     *
     * The data items for describing anisotropic atomic
     * displacement factors are only used if the corresponding items
     * are not given in the ATOM_SITE_ANISOTROP category.
     * @return AtomSite
     */
    public org.rcsb.cif.model.atomsite.AtomSite getAtomSite() {
        return (org.rcsb.cif.model.atomsite.AtomSite) categories.computeIfAbsent("atom_site",
                org.rcsb.cif.model.atomsite.AtomSite::new);
    }

    /**
     * Data items in the ATOM_SITE_ANISOTROP category record details
     * about anisotropic displacement parameters.
     * If the ATOM_SITE_ANISOTROP category is used for storing these
     * data, the corresponding ATOM_SITE data items are not used.
     * @return AtomSiteAnisotrop
     */
    public org.rcsb.cif.model.atomsiteanisotrop.AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return (org.rcsb.cif.model.atomsiteanisotrop.AtomSiteAnisotrop) categories.computeIfAbsent("atom_site_anisotrop",
                org.rcsb.cif.model.atomsiteanisotrop.AtomSiteAnisotrop::new);
    }

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    public org.rcsb.cif.model.atomsites.AtomSites getAtomSites() {
        return (org.rcsb.cif.model.atomsites.AtomSites) categories.computeIfAbsent("atom_sites",
                org.rcsb.cif.model.atomsites.AtomSites::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT category record details
     * about the structural ensembles that should be generated from
     * atom sites or groups of atom sites that are modelled in
     * alternative conformations in this data block.
     * @return AtomSitesAlt
     */
    public org.rcsb.cif.model.atomsitesalt.AtomSitesAlt getAtomSitesAlt() {
        return (org.rcsb.cif.model.atomsitesalt.AtomSitesAlt) categories.computeIfAbsent("atom_sites_alt",
                org.rcsb.cif.model.atomsitesalt.AtomSitesAlt::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT_ENS category record details
     * about the ensemble structure generated from atoms with various
     * alternative conformation IDs.
     * @return AtomSitesAltEns
     */
    public org.rcsb.cif.model.atomsitesaltens.AtomSitesAltEns getAtomSitesAltEns() {
        return (org.rcsb.cif.model.atomsitesaltens.AtomSitesAltEns) categories.computeIfAbsent("atom_sites_alt_ens",
                org.rcsb.cif.model.atomsitesaltens.AtomSitesAltEns::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT_GEN category record details
     * about the interpretation of multiple conformations in the
     * structure.
     * @return AtomSitesAltGen
     */
    public org.rcsb.cif.model.atomsitesaltgen.AtomSitesAltGen getAtomSitesAltGen() {
        return (org.rcsb.cif.model.atomsitesaltgen.AtomSitesAltGen) categories.computeIfAbsent("atom_sites_alt_gen",
                org.rcsb.cif.model.atomsitesaltgen.AtomSitesAltGen::new);
    }

    /**
     * Data items in the ATOM_SITES_FOOTNOTE category record detailed
     * comments about an atom site or a group of atom sites.
     * @return AtomSitesFootnote
     */
    public org.rcsb.cif.model.atomsitesfootnote.AtomSitesFootnote getAtomSitesFootnote() {
        return (org.rcsb.cif.model.atomsitesfootnote.AtomSitesFootnote) categories.computeIfAbsent("atom_sites_footnote",
                org.rcsb.cif.model.atomsitesfootnote.AtomSitesFootnote::new);
    }

    /**
     * Data items in the ATOM_TYPE category record details about the
     * properties of the atoms that occupy the atom sites, such as the
     * atomic scattering factors.
     * @return AtomType
     */
    public org.rcsb.cif.model.atomtype.AtomType getAtomType() {
        return (org.rcsb.cif.model.atomtype.AtomType) categories.computeIfAbsent("atom_type",
                org.rcsb.cif.model.atomtype.AtomType::new);
    }

    /**
     * Data items in the AUDIT category record details about the
     * creation and subsequent updating of the data block.
     *
     * Note that these items apply only to the creation and updating of
     * the data block, and should not be confused with the data items
     * in the JOURNAL category that record different stages in the
     * publication of the material in the data block.
     * @return Audit
     */
    public org.rcsb.cif.model.audit.Audit getAudit() {
        return (org.rcsb.cif.model.audit.Audit) categories.computeIfAbsent("audit",
                org.rcsb.cif.model.audit.Audit::new);
    }

    /**
     * Data items in the AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return AuditAuthor
     */
    public org.rcsb.cif.model.auditauthor.AuditAuthor getAuditAuthor() {
        return (org.rcsb.cif.model.auditauthor.AuditAuthor) categories.computeIfAbsent("audit_author",
                org.rcsb.cif.model.auditauthor.AuditAuthor::new);
    }

    /**
     * Data items in the AUDIT_CONFORM category describe the
     * dictionary versions against which the data names appearing in
     * the current data block are conformant.
     * @return AuditConform
     */
    public org.rcsb.cif.model.auditconform.AuditConform getAuditConform() {
        return (org.rcsb.cif.model.auditconform.AuditConform) categories.computeIfAbsent("audit_conform",
                org.rcsb.cif.model.auditconform.AuditConform::new);
    }

    /**
     * Data items in the AUDIT_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the content of this data block.
     * @return AuditContactAuthor
     */
    public org.rcsb.cif.model.auditcontactauthor.AuditContactAuthor getAuditContactAuthor() {
        return (org.rcsb.cif.model.auditcontactauthor.AuditContactAuthor) categories.computeIfAbsent("audit_contact_author",
                org.rcsb.cif.model.auditcontactauthor.AuditContactAuthor::new);
    }

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    public org.rcsb.cif.model.cell.Cell getCell() {
        return (org.rcsb.cif.model.cell.Cell) categories.computeIfAbsent("cell",
                org.rcsb.cif.model.cell.Cell::new);
    }

    /**
     * Data items in the CELL_MEASUREMENT category record details
     * about the measurement of the crystallographic cell parameters.
     * @return CellMeasurement
     */
    public org.rcsb.cif.model.cellmeasurement.CellMeasurement getCellMeasurement() {
        return (org.rcsb.cif.model.cellmeasurement.CellMeasurement) categories.computeIfAbsent("cell_measurement",
                org.rcsb.cif.model.cellmeasurement.CellMeasurement::new);
    }

    /**
     * Data items in the CELL_MEASUREMENT_REFLN category record
     * details about the reflections used to determine the
     * crystallographic cell parameters.
     *
     * The CELL_MEASUREMENT_REFLN data items would in general be used
     * only for diffractometer data.
     * @return CellMeasurementRefln
     */
    public org.rcsb.cif.model.cellmeasurementrefln.CellMeasurementRefln getCellMeasurementRefln() {
        return (org.rcsb.cif.model.cellmeasurementrefln.CellMeasurementRefln) categories.computeIfAbsent("cell_measurement_refln",
                org.rcsb.cif.model.cellmeasurementrefln.CellMeasurementRefln::new);
    }

    /**
     * Data items in the CHEM_COMP category give details about each
     * of the chemical components from which the relevant chemical
     * structures can be constructed, such as name, mass or charge.
     *
     * The related categories CHEM_COMP_ATOM, CHEM_COMP_BOND,
     * CHEM_COMP_ANGLE etc. describe the detailed geometry of these
     * chemical components.
     * @return ChemComp
     */
    public org.rcsb.cif.model.chemcomp.ChemComp getChemComp() {
        return (org.rcsb.cif.model.chemcomp.ChemComp) categories.computeIfAbsent("chem_comp",
                org.rcsb.cif.model.chemcomp.ChemComp::new);
    }

    /**
     * Data items in the CHEM_COMP_ANGLE category record details about
     * angles in a chemical component. Angles are designated by three
     * atoms, with the second atom forming the vertex of the angle.
     * Target values may be specified as angles in degrees, as a
     * distance between the first and third atoms, or both.
     * @return ChemCompAngle
     */
    public org.rcsb.cif.model.chemcompangle.ChemCompAngle getChemCompAngle() {
        return (org.rcsb.cif.model.chemcompangle.ChemCompAngle) categories.computeIfAbsent("chem_comp_angle",
                org.rcsb.cif.model.chemcompangle.ChemCompAngle::new);
    }

    /**
     * Data items in the CHEM_COMP_ATOM category record details about
     * the atoms in a chemical component. Specifying the atomic
     * coordinates for the components in this category is an
     * alternative to specifying the structure of the component
     * via bonds, angles, planes etc. in the appropriate
     * CHEM_COMP subcategories.
     * @return ChemCompAtom
     */
    public org.rcsb.cif.model.chemcompatom.ChemCompAtom getChemCompAtom() {
        return (org.rcsb.cif.model.chemcompatom.ChemCompAtom) categories.computeIfAbsent("chem_comp_atom",
                org.rcsb.cif.model.chemcompatom.ChemCompAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    public org.rcsb.cif.model.chemcompbond.ChemCompBond getChemCompBond() {
        return (org.rcsb.cif.model.chemcompbond.ChemCompBond) categories.computeIfAbsent("chem_comp_bond",
                org.rcsb.cif.model.chemcompbond.ChemCompBond::new);
    }

    /**
     * Data items in the CHEM_COMP_CHIR category provide details about
     * the chiral centres in a chemical component. The atoms bonded
     * to the chiral atom are specified in the CHEM_COMP_CHIR_ATOM
     * category.
     * @return ChemCompChir
     */
    public org.rcsb.cif.model.chemcompchir.ChemCompChir getChemCompChir() {
        return (org.rcsb.cif.model.chemcompchir.ChemCompChir) categories.computeIfAbsent("chem_comp_chir",
                org.rcsb.cif.model.chemcompchir.ChemCompChir::new);
    }

    /**
     * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom within a chemical component.
     * @return ChemCompChirAtom
     */
    public org.rcsb.cif.model.chemcompchiratom.ChemCompChirAtom getChemCompChirAtom() {
        return (org.rcsb.cif.model.chemcompchiratom.ChemCompChirAtom) categories.computeIfAbsent("chem_comp_chir_atom",
                org.rcsb.cif.model.chemcompchiratom.ChemCompChirAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_LINK category give details about
     * the links between chemical components.
     * @return ChemCompLink
     */
    public org.rcsb.cif.model.chemcomplink.ChemCompLink getChemCompLink() {
        return (org.rcsb.cif.model.chemcomplink.ChemCompLink) categories.computeIfAbsent("chem_comp_link",
                org.rcsb.cif.model.chemcomplink.ChemCompLink::new);
    }

    /**
     * Data items in the CHEM_COMP_PLANE category provide identifiers
     * for the planes in a chemical component.  The atoms in the plane
     * are specified in the CHEM_COMP_PLANE_ATOM category.
     * @return ChemCompPlane
     */
    public org.rcsb.cif.model.chemcompplane.ChemCompPlane getChemCompPlane() {
        return (org.rcsb.cif.model.chemcompplane.ChemCompPlane) categories.computeIfAbsent("chem_comp_plane",
                org.rcsb.cif.model.chemcompplane.ChemCompPlane::new);
    }

    /**
     * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
     * atoms in a plane within a chemical component.
     * @return ChemCompPlaneAtom
     */
    public org.rcsb.cif.model.chemcompplaneatom.ChemCompPlaneAtom getChemCompPlaneAtom() {
        return (org.rcsb.cif.model.chemcompplaneatom.ChemCompPlaneAtom) categories.computeIfAbsent("chem_comp_plane_atom",
                org.rcsb.cif.model.chemcompplaneatom.ChemCompPlaneAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_TOR category record details about
     * the torsion angles in a chemical component. As torsion angles
     * can have more than one target value, the target values are
     * specified in the CHEM_COMP_TOR_VALUE category.
     * @return ChemCompTor
     */
    public org.rcsb.cif.model.chemcomptor.ChemCompTor getChemCompTor() {
        return (org.rcsb.cif.model.chemcomptor.ChemCompTor) categories.computeIfAbsent("chem_comp_tor",
                org.rcsb.cif.model.chemcomptor.ChemCompTor::new);
    }

    /**
     * Data items in the CHEM_COMP_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_COMP_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemCompTorValue
     */
    public org.rcsb.cif.model.chemcomptorvalue.ChemCompTorValue getChemCompTorValue() {
        return (org.rcsb.cif.model.chemcomptorvalue.ChemCompTorValue) categories.computeIfAbsent("chem_comp_tor_value",
                org.rcsb.cif.model.chemcomptorvalue.ChemCompTorValue::new);
    }

    /**
     * Data items in the CHEM_LINK category give details about
     * the links between chemical components.
     * @return ChemLink
     */
    public org.rcsb.cif.model.chemlink.ChemLink getChemLink() {
        return (org.rcsb.cif.model.chemlink.ChemLink) categories.computeIfAbsent("chem_link",
                org.rcsb.cif.model.chemlink.ChemLink::new);
    }

    /**
     * Data items in the CHEM_LINK_ANGLE category record details
     * about angles in a link between chemical components.
     * @return ChemLinkAngle
     */
    public org.rcsb.cif.model.chemlinkangle.ChemLinkAngle getChemLinkAngle() {
        return (org.rcsb.cif.model.chemlinkangle.ChemLinkAngle) categories.computeIfAbsent("chem_link_angle",
                org.rcsb.cif.model.chemlinkangle.ChemLinkAngle::new);
    }

    /**
     * Data items in the CHEM_LINK_BOND category record details about
     * bonds in a link between components in the chemical structure.
     * @return ChemLinkBond
     */
    public org.rcsb.cif.model.chemlinkbond.ChemLinkBond getChemLinkBond() {
        return (org.rcsb.cif.model.chemlinkbond.ChemLinkBond) categories.computeIfAbsent("chem_link_bond",
                org.rcsb.cif.model.chemlinkbond.ChemLinkBond::new);
    }

    /**
     * Data items in the CHEM_LINK_CHIR category provide details about
     * the chiral centres in a link between two chemical components.
     * The atoms bonded to the chiral atom are specified in the
     * CHEM_LINK_CHIR_ATOM category.
     * @return ChemLinkChir
     */
    public org.rcsb.cif.model.chemlinkchir.ChemLinkChir getChemLinkChir() {
        return (org.rcsb.cif.model.chemlinkchir.ChemLinkChir) categories.computeIfAbsent("chem_link_chir",
                org.rcsb.cif.model.chemlinkchir.ChemLinkChir::new);
    }

    /**
     * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom in a link between two
     * chemical components.
     * @return ChemLinkChirAtom
     */
    public org.rcsb.cif.model.chemlinkchiratom.ChemLinkChirAtom getChemLinkChirAtom() {
        return (org.rcsb.cif.model.chemlinkchiratom.ChemLinkChirAtom) categories.computeIfAbsent("chem_link_chir_atom",
                org.rcsb.cif.model.chemlinkchiratom.ChemLinkChirAtom::new);
    }

    /**
     * Data items in the CHEM_LINK_PLANE category provide identifiers
     * for the planes in a link between two chemical components.
     * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
     * category.
     * @return ChemLinkPlane
     */
    public org.rcsb.cif.model.chemlinkplane.ChemLinkPlane getChemLinkPlane() {
        return (org.rcsb.cif.model.chemlinkplane.ChemLinkPlane) categories.computeIfAbsent("chem_link_plane",
                org.rcsb.cif.model.chemlinkplane.ChemLinkPlane::new);
    }

    /**
     * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
     * atoms in a plane in a link between two chemical components.
     * @return ChemLinkPlaneAtom
     */
    public org.rcsb.cif.model.chemlinkplaneatom.ChemLinkPlaneAtom getChemLinkPlaneAtom() {
        return (org.rcsb.cif.model.chemlinkplaneatom.ChemLinkPlaneAtom) categories.computeIfAbsent("chem_link_plane_atom",
                org.rcsb.cif.model.chemlinkplaneatom.ChemLinkPlaneAtom::new);
    }

    /**
     * Data items in the CHEM_LINK_TOR category record details about
     * the torsion angles in a link between two chemical components.
     * As torsion angles can have more than one target value, the
     * target values are specified in the CHEM_LINK_TOR_VALUE category.
     * @return ChemLinkTor
     */
    public org.rcsb.cif.model.chemlinktor.ChemLinkTor getChemLinkTor() {
        return (org.rcsb.cif.model.chemlinktor.ChemLinkTor) categories.computeIfAbsent("chem_link_tor",
                org.rcsb.cif.model.chemlinktor.ChemLinkTor::new);
    }

    /**
     * Data items in the CHEM_LINK_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_LINK_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemLinkTorValue
     */
    public org.rcsb.cif.model.chemlinktorvalue.ChemLinkTorValue getChemLinkTorValue() {
        return (org.rcsb.cif.model.chemlinktorvalue.ChemLinkTorValue) categories.computeIfAbsent("chem_link_tor_value",
                org.rcsb.cif.model.chemlinktorvalue.ChemLinkTorValue::new);
    }

    /**
     * Data items in the CHEMICAL category would not in general be
     * used in a macromolecular CIF. See instead the ENTITY data
     * items.
     *
     * Data items in the CHEMICAL category record details about the
     * composition and chemical properties of the compounds. The
     * formula data items must agree with those that specify the
     * density, unit-cell and Z values.
     * @return Chemical
     */
    public org.rcsb.cif.model.chemical.Chemical getChemical() {
        return (org.rcsb.cif.model.chemical.Chemical) categories.computeIfAbsent("chemical",
                org.rcsb.cif.model.chemical.Chemical::new);
    }

    /**
     * Data items in the CHEMICAL_CONN_ATOM category would not, in
     * general, be used in a macromolecular CIF. See instead the
     * ENTITY data items.
     *
     * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
     * categories record details about the two-dimensional (2D)
     * chemical structure of the molecular species. They allow
     * a 2D chemical diagram to be reconstructed for use in a
     * publication or in a database search for structural and
     * substructural relationships.
     *
     * The CHEMICAL_CONN_ATOM data items provide information about the
     * chemical properties of the atoms in the structure. In cases
     * where crystallographic and molecular symmetry elements coincide,
     * they must also contain symmetry-generated atoms, so that the
     * CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND data items will always
     * describe a complete chemical entity.
     * @return ChemicalConnAtom
     */
    public org.rcsb.cif.model.chemicalconnatom.ChemicalConnAtom getChemicalConnAtom() {
        return (org.rcsb.cif.model.chemicalconnatom.ChemicalConnAtom) categories.computeIfAbsent("chemical_conn_atom",
                org.rcsb.cif.model.chemicalconnatom.ChemicalConnAtom::new);
    }

    /**
     * Data items in the CHEMICAL_CONN_BOND category would not, in
     * general, be used in a macromolecular CIF. See instead the
     * ENTITY data items.
     *
     * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
     * categories record details about the two-dimensional (2D)
     * chemical structure of the molecular species. They allow a
     * 2D chemical diagram to be reconstructed for use in a
     * publication or in a database search for structural and
     * substructural relationships.
     *
     * The CHEMICAL_CONN_BOND data items specify the connections
     * between the atoms in the CHEMICAL_CONN_ATOM list and the nature
     * of the chemical bond between these atoms.
     * @return ChemicalConnBond
     */
    public org.rcsb.cif.model.chemicalconnbond.ChemicalConnBond getChemicalConnBond() {
        return (org.rcsb.cif.model.chemicalconnbond.ChemicalConnBond) categories.computeIfAbsent("chemical_conn_bond",
                org.rcsb.cif.model.chemicalconnbond.ChemicalConnBond::new);
    }

    /**
     * Data items in the CHEMICAL_FORMULA category would not, in
     * general, be used in a macromolecular CIF. See instead the
     * ENTITY data items.
     *
     * Data items in the CHEMICAL_FORMULA category specify the
     * composition and chemical properties of the compound. The formula
     * data items must agree with those that specify the density,
     * unit-cell and Z values.
     *
     * The following rules apply to the construction of the data items
     * _chemical_formula.analytical, _chemical_formula.structural and
     * _chemical_formula.sum. For the data item
     * _chemical_formula.moiety, the formula construction is broken up
     * into residues or moieties, i.e. groups of atoms that form a
     * molecular unit or molecular ion. The rules given below apply
     * within each moiety but different requirements apply to the way
     * that moieties are connected (see _chemical_formula.moiety).
     *
     * (1) Only recognized element symbols may be used.
     *
     * (2) Each element symbol is followed by a 'count' number. A count
     * of '1' may be omitted.
     *
     * (3) A space or parenthesis must separate each cluster of (element
     * symbol + count).
     *
     * (4) Where a group of elements is enclosed in parentheses, the
     * multiplier for the group must follow the closing parenthesis.
     * That is, all element and group multipliers are assumed to be
     * printed as subscripted numbers. (An exception to this rule
     * exists for _chemical_formula.moiety formulae where pre- and
     * post-multipliers are permitted for molecular units.)
     *
     * (5) Unless the elements are ordered in a manner that corresponds
     * to their chemical structure, as in
     * _chemical_formula.structural, the order of the elements within
     * any group or moiety should be:  C, then H, then the other
     * elements in alphabetical order of their symbol. This is the
     * 'Hill' system used by Chemical Abstracts. This ordering is
     * used in _chemical_formula.moiety and _chemical_formula.sum.
     * @return ChemicalFormula
     */
    public org.rcsb.cif.model.chemicalformula.ChemicalFormula getChemicalFormula() {
        return (org.rcsb.cif.model.chemicalformula.ChemicalFormula) categories.computeIfAbsent("chemical_formula",
                org.rcsb.cif.model.chemicalformula.ChemicalFormula::new);
    }

    /**
     * Data items in the CITATION category record details about the
     * literature cited as being relevant to the contents of the data
     * block.
     * @return Citation
     */
    public org.rcsb.cif.model.citation.Citation getCitation() {
        return (org.rcsb.cif.model.citation.Citation) categories.computeIfAbsent("citation",
                org.rcsb.cif.model.citation.Citation::new);
    }

    /**
     * Data items in the CITATION_AUTHOR category record details
     * about the authors associated with the citations in the
     * CITATION list.
     * @return CitationAuthor
     */
    public org.rcsb.cif.model.citationauthor.CitationAuthor getCitationAuthor() {
        return (org.rcsb.cif.model.citationauthor.CitationAuthor) categories.computeIfAbsent("citation_author",
                org.rcsb.cif.model.citationauthor.CitationAuthor::new);
    }

    /**
     * Data items in the CITATION_EDITOR category record details
     * about the editors associated with the books or book chapters
     * cited in the CITATION list.
     * @return CitationEditor
     */
    public org.rcsb.cif.model.citationeditor.CitationEditor getCitationEditor() {
        return (org.rcsb.cif.model.citationeditor.CitationEditor) categories.computeIfAbsent("citation_editor",
                org.rcsb.cif.model.citationeditor.CitationEditor::new);
    }

    /**
     * Data items in the COMPUTING category record details about the
     * computer programs used in the crystal structure analysis.
     *
     * Data items in this category would not, in general, be used in
     * a macromolecular CIF.  The category SOFTWARE, which allows
     * a more detailed description of computer programs and
     * their attributes to be given, would be used instead.
     * @return Computing
     */
    public org.rcsb.cif.model.computing.Computing getComputing() {
        return (org.rcsb.cif.model.computing.Computing) categories.computeIfAbsent("computing",
                org.rcsb.cif.model.computing.Computing::new);
    }

    /**
     * Data items in the DATABASE category have been superseded by
     * data items in the DATABASE_2 category. They are included
     * here only for compliance with older CIFs.
     * @return Database
     */
    public org.rcsb.cif.model.database.Database getDatabase() {
        return (org.rcsb.cif.model.database.Database) categories.computeIfAbsent("database",
                org.rcsb.cif.model.database.Database::new);
    }

    /**
     * Data items in the DATABASE_2 category record details about the
     * database identifiers of the data block.
     *
     * These data items are assigned by database managers and should
     * only appear in a data block if they originate from that source.
     *
     * The name of this category, DATABASE_2, arose because the
     * category name DATABASE was already in use in the core CIF
     * dictionary, but was used differently from the way it needed
     * to be used in the mmCIF dictionary. Since CIF data names
     * cannot be changed once they have been adopted, a new category
     * had to be created.
     * @return Database2
     */
    public org.rcsb.cif.model.database2.Database2 getDatabase2() {
        return (org.rcsb.cif.model.database2.Database2) categories.computeIfAbsent("database_2",
                org.rcsb.cif.model.database2.Database2::new);
    }

    /**
     * Data items in the DATABASE_PDB_CAVEAT category record details
     * about features of the data block flagged as 'caveats' by the
     * Protein Data Bank (PDB).
     *
     * These data items are included only for consistency with PDB
     * format files. They should appear in a data block only if that
     * data block was created by reformatting a PDB format file.
     * @return DatabasePDBCaveat
     */
    public org.rcsb.cif.model.databasepdbcaveat.DatabasePDBCaveat getDatabasePDBCaveat() {
        return (org.rcsb.cif.model.databasepdbcaveat.DatabasePDBCaveat) categories.computeIfAbsent("database_PDB_caveat",
                org.rcsb.cif.model.databasepdbcaveat.DatabasePDBCaveat::new);
    }

    /**
     * The DATABASE_PDB_MATRIX category provides placeholders for
     * transformation matrices and vectors used by the Protein Data
     * Bank (PDB).
     *
     * These data items are included only for consistency with older
     * PDB format files. They should appear in a data block only if
     * that data block was created by reformatting a PDB format file.
     * @return DatabasePDBMatrix
     */
    public org.rcsb.cif.model.databasepdbmatrix.DatabasePDBMatrix getDatabasePDBMatrix() {
        return (org.rcsb.cif.model.databasepdbmatrix.DatabasePDBMatrix) categories.computeIfAbsent("database_PDB_matrix",
                org.rcsb.cif.model.databasepdbmatrix.DatabasePDBMatrix::new);
    }

    /**
     * Data items in the DATABASE_PDB_REMARK category record details
     * about the data block as archived by the Protein Data Bank (PDB).
     *
     * Some data appearing in PDB REMARK records can be
     * algorithmically extracted into the appropriate data items
     * in the data block.
     *
     * These data items are included only for consistency with older
     * PDB format files. They should appear in a data block only if
     * that data block was created by reformatting a PDB format file.
     *
     * NOTE: These remark records in this category are not uniformly
     * annotated by the PDB and may not be consistent with
     * nomenclature or labeling used in the entry.
     * @return DatabasePDBRemark
     */
    public org.rcsb.cif.model.databasepdbremark.DatabasePDBRemark getDatabasePDBRemark() {
        return (org.rcsb.cif.model.databasepdbremark.DatabasePDBRemark) categories.computeIfAbsent("database_PDB_remark",
                org.rcsb.cif.model.databasepdbremark.DatabasePDBRemark::new);
    }

    /**
     * Data items in the DATABASE_PDB_REV category record details
     * about the history of the data block as archived by the Protein
     * Data Bank (PDB).
     *
     * These data items are assigned by the PDB database managers and
     * should only appear in a data block if they originate from that
     * source.
     * @return DatabasePDBRev
     */
    public org.rcsb.cif.model.databasepdbrev.DatabasePDBRev getDatabasePDBRev() {
        return (org.rcsb.cif.model.databasepdbrev.DatabasePDBRev) categories.computeIfAbsent("database_PDB_rev",
                org.rcsb.cif.model.databasepdbrev.DatabasePDBRev::new);
    }

    /**
     * Data items in the DATABASE_PDB_REV_RECORD category record
     * details about specific record types that were changed in a
     * given revision of a PDB entry.
     *
     * These data items are assigned by the PDB database managers and
     * should only appear in a data block if they originate from that
     * source.
     * @return DatabasePDBRevRecord
     */
    public org.rcsb.cif.model.databasepdbrevrecord.DatabasePDBRevRecord getDatabasePDBRevRecord() {
        return (org.rcsb.cif.model.databasepdbrevrecord.DatabasePDBRevRecord) categories.computeIfAbsent("database_PDB_rev_record",
                org.rcsb.cif.model.databasepdbrevrecord.DatabasePDBRevRecord::new);
    }

    /**
     * The DATABASE_PDB_TVECT category provides placeholders for
     * the TVECT matrices and vectors used by the Protein Data
     * Bank (PDB).
     *
     * These data items are included only for consistency with older
     * PDB format files. They should appear in a data block only if
     * the data block was created by reformatting a PDB format file.
     * @return DatabasePDBTvect
     */
    public org.rcsb.cif.model.databasepdbtvect.DatabasePDBTvect getDatabasePDBTvect() {
        return (org.rcsb.cif.model.databasepdbtvect.DatabasePDBTvect) categories.computeIfAbsent("database_PDB_tvect",
                org.rcsb.cif.model.databasepdbtvect.DatabasePDBTvect::new);
    }

    /**
     * Data items in the DIFFRN category record details about the
     * diffraction data and their measurement.
     * @return Diffrn
     */
    public org.rcsb.cif.model.diffrn.Diffrn getDiffrn() {
        return (org.rcsb.cif.model.diffrn.Diffrn) categories.computeIfAbsent("diffrn",
                org.rcsb.cif.model.diffrn.Diffrn::new);
    }

    /**
     * Data items in the DIFFRN_ATTENUATOR category record details
     * about the diffraction attenuator scales employed.
     * @return DiffrnAttenuator
     */
    public org.rcsb.cif.model.diffrnattenuator.DiffrnAttenuator getDiffrnAttenuator() {
        return (org.rcsb.cif.model.diffrnattenuator.DiffrnAttenuator) categories.computeIfAbsent("diffrn_attenuator",
                org.rcsb.cif.model.diffrnattenuator.DiffrnAttenuator::new);
    }

    /**
     * Data items in the DIFFRN_DETECTOR category describe the
     * detector used to measure the scattered radiation, including
     * any analyser and post-sample collimation.
     * @return DiffrnDetector
     */
    public org.rcsb.cif.model.diffrndetector.DiffrnDetector getDiffrnDetector() {
        return (org.rcsb.cif.model.diffrndetector.DiffrnDetector) categories.computeIfAbsent("diffrn_detector",
                org.rcsb.cif.model.diffrndetector.DiffrnDetector::new);
    }

    /**
     * Data items in the DIFFRN_MEASUREMENT category record details
     * about the device used to orient and/or position the crystal
     * during data measurement and the manner in which the diffraction
     * data were measured.
     * @return DiffrnMeasurement
     */
    public org.rcsb.cif.model.diffrnmeasurement.DiffrnMeasurement getDiffrnMeasurement() {
        return (org.rcsb.cif.model.diffrnmeasurement.DiffrnMeasurement) categories.computeIfAbsent("diffrn_measurement",
                org.rcsb.cif.model.diffrnmeasurement.DiffrnMeasurement::new);
    }

    /**
     * Data items in the DIFFRN_ORIENT_MATRIX category record details
     * about the orientation matrix used in the measurement of the
     * diffraction data.
     * @return DiffrnOrientMatrix
     */
    public org.rcsb.cif.model.diffrnorientmatrix.DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return (org.rcsb.cif.model.diffrnorientmatrix.DiffrnOrientMatrix) categories.computeIfAbsent("diffrn_orient_matrix",
                org.rcsb.cif.model.diffrnorientmatrix.DiffrnOrientMatrix::new);
    }

    /**
     * Data items in the DIFFRN_ORIENT_REFLN category record details
     * about the reflections that define the orientation matrix used in
     * the measurement of the diffraction intensities.
     * @return DiffrnOrientRefln
     */
    public org.rcsb.cif.model.diffrnorientrefln.DiffrnOrientRefln getDiffrnOrientRefln() {
        return (org.rcsb.cif.model.diffrnorientrefln.DiffrnOrientRefln) categories.computeIfAbsent("diffrn_orient_refln",
                org.rcsb.cif.model.diffrnorientrefln.DiffrnOrientRefln::new);
    }

    /**
     * Data items in the DIFFRN_RADIATION category describe
     * the radiation used in measuring the diffraction intensities,
     * its collimation and monochromatization before the sample.
     *
     * Post-sample treatment of the beam is described by data
     * items in the DIFFRN_DETECTOR category.
     * @return DiffrnRadiation
     */
    public org.rcsb.cif.model.diffrnradiation.DiffrnRadiation getDiffrnRadiation() {
        return (org.rcsb.cif.model.diffrnradiation.DiffrnRadiation) categories.computeIfAbsent("diffrn_radiation",
                org.rcsb.cif.model.diffrnradiation.DiffrnRadiation::new);
    }

    /**
     * Data items in the DIFFRN_RADIATION_WAVELENGTH category
     * describe the wavelength of the radiation used to measure the
     * diffraction intensities. Items may be looped to identify
     * and assign weights to distinct components of a
     * polychromatic beam.
     * @return DiffrnRadiationWavelength
     */
    public org.rcsb.cif.model.diffrnradiationwavelength.DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return (org.rcsb.cif.model.diffrnradiationwavelength.DiffrnRadiationWavelength) categories.computeIfAbsent("diffrn_radiation_wavelength",
                org.rcsb.cif.model.diffrnradiationwavelength.DiffrnRadiationWavelength::new);
    }

    /**
     * Data items in the DIFFRN_REFLN category record details about
     * the intensities in the diffraction data set
     * identified by _diffrn_refln.diffrn_id.
     *
     * The DIFFRN_REFLN data items refer to individual intensity
     * measurements and must be included in looped lists.
     *
     * The DIFFRN_REFLNS data items specify the parameters that apply
     * to all intensity  measurements in the particular diffraction
     * data set identified by _diffrn_reflns.diffrn_id.
     * @return DiffrnRefln
     */
    public org.rcsb.cif.model.diffrnrefln.DiffrnRefln getDiffrnRefln() {
        return (org.rcsb.cif.model.diffrnrefln.DiffrnRefln) categories.computeIfAbsent("diffrn_refln",
                org.rcsb.cif.model.diffrnrefln.DiffrnRefln::new);
    }

    /**
     * Data items in the DIFFRN_REFLNS category record details about
     * the set of intensities measured in the diffraction experiment.
     *
     * The DIFFRN_REFLN data items refer to individual intensity
     * measurements and must be included in looped lists.
     *
     * The DIFFRN_REFLNS data items specify the parameters that apply
     * to all intensity measurements in a diffraction data set.
     * @return DiffrnReflns
     */
    public org.rcsb.cif.model.diffrnreflns.DiffrnReflns getDiffrnReflns() {
        return (org.rcsb.cif.model.diffrnreflns.DiffrnReflns) categories.computeIfAbsent("diffrn_reflns",
                org.rcsb.cif.model.diffrnreflns.DiffrnReflns::new);
    }

    /**
     * Data items in the DIFFRN_SCALE_GROUP category record details
     * of the scaling factors applied to place all intensities in the
     * reflection lists on a common scale.
     * Scaling groups might, for example, correspond to each film in a
     * multi-film data set or each crystal in a multi-crystal data set.
     * @return DiffrnScaleGroup
     */
    public org.rcsb.cif.model.diffrnscalegroup.DiffrnScaleGroup getDiffrnScaleGroup() {
        return (org.rcsb.cif.model.diffrnscalegroup.DiffrnScaleGroup) categories.computeIfAbsent("diffrn_scale_group",
                org.rcsb.cif.model.diffrnscalegroup.DiffrnScaleGroup::new);
    }

    /**
     * Data items in the DIFFRN_SOURCE category record details of
     * the source of radiation used in the diffraction experiment.
     * @return DiffrnSource
     */
    public org.rcsb.cif.model.diffrnsource.DiffrnSource getDiffrnSource() {
        return (org.rcsb.cif.model.diffrnsource.DiffrnSource) categories.computeIfAbsent("diffrn_source",
                org.rcsb.cif.model.diffrnsource.DiffrnSource::new);
    }

    /**
     * Data items in the DIFFRN_STANDARD_REFLN category record details
     * about the reflections treated as standards during the measurement
     * of a set of diffraction intensities.
     *
     * Note that these are the individual standard reflections, not the
     * results of the analysis of the standard reflections.
     * @return DiffrnStandardRefln
     */
    public org.rcsb.cif.model.diffrnstandardrefln.DiffrnStandardRefln getDiffrnStandardRefln() {
        return (org.rcsb.cif.model.diffrnstandardrefln.DiffrnStandardRefln) categories.computeIfAbsent("diffrn_standard_refln",
                org.rcsb.cif.model.diffrnstandardrefln.DiffrnStandardRefln::new);
    }

    /**
     * Data items in the DIFFRN_STANDARDS category record details
     * about the set of standard reflections used to monitor intensity
     * stability during the measurement of diffraction intensities.
     *
     * Note that these records describe properties common to the set of
     * standard reflections, not the standard reflections themselves.
     * @return DiffrnStandards
     */
    public org.rcsb.cif.model.diffrnstandards.DiffrnStandards getDiffrnStandards() {
        return (org.rcsb.cif.model.diffrnstandards.DiffrnStandards) categories.computeIfAbsent("diffrn_standards",
                org.rcsb.cif.model.diffrnstandards.DiffrnStandards::new);
    }

    /**
     * Data items in the ENTITY category record details (such as
     * chemical composition, name and source) about the molecular
     * entities that are present in the crystallographic structure.
     *
     * Items in the various ENTITY subcategories provide a full
     * chemical description of these molecular entities.
     *
     * Entities are of three types:  polymer, non-polymer and water.
     * Note that the water category includes only water;  ordered
     * solvent such as sulfate ion or acetone would be described as
     * individual non-polymer entities.
     *
     * The ENTITY category is specific to macromolecular CIF
     * applications and replaces the function of the CHEMICAL category
     * in the CIF core.
     *
     * It is important to remember that the ENTITY data are not the
     * result of the crystallographic experiment;  those results are
     * represented by the ATOM_SITE data items. ENTITY data items
     * describe the chemistry of the molecules under investigation
     * and can most usefully be thought of as the ideal groups to which
     * the structure is restrained or constrained during refinement.
     *
     * It is also important to remember that entities do not correspond
     * directly to the enumeration of the contents of the asymmetric
     * unit. Entities are described only once, even in those structures
     * that contain multiple observations of an entity. The
     * STRUCT_ASYM data items, which reference the entity list,
     * describe and label the contents of the asymmetric unit.
     * @return Entity
     */
    public org.rcsb.cif.model.entity.Entity getEntity() {
        return (org.rcsb.cif.model.entity.Entity) categories.computeIfAbsent("entity",
                org.rcsb.cif.model.entity.Entity::new);
    }

    /**
     * Data items in the ENTITY_KEYWORDS category specify keywords
     * relevant to the molecular entities. Note that this list of
     * keywords is separate from the list that is used for the
     * STRUCT_BIOL data items and is intended to provide only the
     * information that one would know about the molecular entity *if
     * one did not know its structure*. Hence polypeptides are simply
     * polypeptides, not cytokines or beta-alpha-barrels, and
     * polyribonucleic acids are simply poly-RNA, not transfer-
     * RNA.
     * @return EntityKeywords
     */
    public org.rcsb.cif.model.entitykeywords.EntityKeywords getEntityKeywords() {
        return (org.rcsb.cif.model.entitykeywords.EntityKeywords) categories.computeIfAbsent("entity_keywords",
                org.rcsb.cif.model.entitykeywords.EntityKeywords::new);
    }

    /**
     * Data items in the ENTITY_LINK category give details about
     * the links between entities.
     * @return EntityLink
     */
    public org.rcsb.cif.model.entitylink.EntityLink getEntityLink() {
        return (org.rcsb.cif.model.entitylink.EntityLink) categories.computeIfAbsent("entity_link",
                org.rcsb.cif.model.entitylink.EntityLink::new);
    }

    /**
     * Data items in the ENTITY_NAME_COM category record the common name
     * or names associated with the entity. In some cases, the entity
     * name may not be the same as the name of the biological structure.
     * For example, haemoglobin alpha chain would be the entity common
     * name, not haemoglobin.
     * @return EntityNameCom
     */
    public org.rcsb.cif.model.entitynamecom.EntityNameCom getEntityNameCom() {
        return (org.rcsb.cif.model.entitynamecom.EntityNameCom) categories.computeIfAbsent("entity_name_com",
                org.rcsb.cif.model.entitynamecom.EntityNameCom::new);
    }

    /**
     * Data items in the ENTITY_NAME_SYS category record the systematic
     * name or names associated with the entity and the system that
     * was used to construct the systematic name. In some cases, the
     * entity name may not be the same as the name of the biological
     * structure.
     * @return EntityNameSys
     */
    public org.rcsb.cif.model.entitynamesys.EntityNameSys getEntityNameSys() {
        return (org.rcsb.cif.model.entitynamesys.EntityNameSys) categories.computeIfAbsent("entity_name_sys",
                org.rcsb.cif.model.entitynamesys.EntityNameSys::new);
    }

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    public org.rcsb.cif.model.entitypoly.EntityPoly getEntityPoly() {
        return (org.rcsb.cif.model.entitypoly.EntityPoly) categories.computeIfAbsent("entity_poly",
                org.rcsb.cif.model.entitypoly.EntityPoly::new);
    }

    /**
     * Data items in the ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer. Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return EntityPolySeq
     */
    public org.rcsb.cif.model.entitypolyseq.EntityPolySeq getEntityPolySeq() {
        return (org.rcsb.cif.model.entitypolyseq.EntityPolySeq) categories.computeIfAbsent("entity_poly_seq",
                org.rcsb.cif.model.entitypolyseq.EntityPolySeq::new);
    }

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    public org.rcsb.cif.model.entry.Entry getEntry() {
        return (org.rcsb.cif.model.entry.Entry) categories.computeIfAbsent("entry",
                org.rcsb.cif.model.entry.Entry::new);
    }

    /**
     * Data items in the ENTRY_LINK category record the
     * relationships between the current data block
     * identified by _entry.id and other data blocks
     * within the current file which may be referenced
     * in the current data block.
     * @return EntryLink
     */
    public org.rcsb.cif.model.entrylink.EntryLink getEntryLink() {
        return (org.rcsb.cif.model.entrylink.EntryLink) categories.computeIfAbsent("entry_link",
                org.rcsb.cif.model.entrylink.EntryLink::new);
    }

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    public org.rcsb.cif.model.exptl.Exptl getExptl() {
        return (org.rcsb.cif.model.exptl.Exptl) categories.computeIfAbsent("exptl",
                org.rcsb.cif.model.exptl.Exptl::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL category record the results of
     * experimental measurements on the crystal or crystals used,
     * such as shape, size or density.
     * @return ExptlCrystal
     */
    public org.rcsb.cif.model.exptlcrystal.ExptlCrystal getExptlCrystal() {
        return (org.rcsb.cif.model.exptlcrystal.ExptlCrystal) categories.computeIfAbsent("exptl_crystal",
                org.rcsb.cif.model.exptlcrystal.ExptlCrystal::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL_FACE category record details
     * of the crystal faces.
     * @return ExptlCrystalFace
     */
    public org.rcsb.cif.model.exptlcrystalface.ExptlCrystalFace getExptlCrystalFace() {
        return (org.rcsb.cif.model.exptlcrystalface.ExptlCrystalFace) categories.computeIfAbsent("exptl_crystal_face",
                org.rcsb.cif.model.exptlcrystalface.ExptlCrystalFace::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL_GROW category record details
     * about the conditions and methods used to grow the crystal.
     * @return ExptlCrystalGrow
     */
    public org.rcsb.cif.model.exptlcrystalgrow.ExptlCrystalGrow getExptlCrystalGrow() {
        return (org.rcsb.cif.model.exptlcrystalgrow.ExptlCrystalGrow) categories.computeIfAbsent("exptl_crystal_grow",
                org.rcsb.cif.model.exptlcrystalgrow.ExptlCrystalGrow::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL_GROW_COMP category record
     * details about the components of the solutions that were 'mixed'
     * (by whatever means) to produce the crystal.
     *
     * In general, solution 1 is the solution that contains the
     * molecule to be crystallized and solution 2 is the solution
     * that contains the precipitant. However, the number of solutions
     * required to describe the crystallization protocol is not limited
     * to 2.
     *
     * Details of the crystallization protocol should be given in
     * _exptl_crystal_grow_comp.details using the solutions
     * described in EXPTL_CRYSTAL_GROW_COMP.
     * @return ExptlCrystalGrowComp
     */
    public org.rcsb.cif.model.exptlcrystalgrowcomp.ExptlCrystalGrowComp getExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.exptlcrystalgrowcomp.ExptlCrystalGrowComp) categories.computeIfAbsent("exptl_crystal_grow_comp",
                org.rcsb.cif.model.exptlcrystalgrowcomp.ExptlCrystalGrowComp::new);
    }

    /**
     * Data items in the GEOM and related (GEOM_ANGLE,
     * GEOM_BOND, GEOM_CONTACT, GEOM_HBOND and GEOM_TORSION)
     * categories record details about the molecular
     * geometry as calculated from the contents of the ATOM, CELL
     * and SYMMETRY data.
     *
     * Geometry data are therefore redundant, in that they can be
     * calculated from other more fundamental quantities in the data
     * block. However, they provide a check on the correctness of
     * both sets of data and enable the most important geometric data
     * to be identified for publication by setting the appropriate
     * publication flag.
     * @return Geom
     */
    public org.rcsb.cif.model.geom.Geom getGeom() {
        return (org.rcsb.cif.model.geom.Geom) categories.computeIfAbsent("geom",
                org.rcsb.cif.model.geom.Geom::new);
    }

    /**
     * Data items in the GEOM_ANGLE category record details about the
     * bond angles as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomAngle
     */
    public org.rcsb.cif.model.geomangle.GeomAngle getGeomAngle() {
        return (org.rcsb.cif.model.geomangle.GeomAngle) categories.computeIfAbsent("geom_angle",
                org.rcsb.cif.model.geomangle.GeomAngle::new);
    }

    /**
     * Data items in the GEOM_BOND category record details about
     * the bond lengths as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomBond
     */
    public org.rcsb.cif.model.geombond.GeomBond getGeomBond() {
        return (org.rcsb.cif.model.geombond.GeomBond) categories.computeIfAbsent("geom_bond",
                org.rcsb.cif.model.geombond.GeomBond::new);
    }

    /**
     * Data items in the GEOM_CONTACT category record details about
     * interatomic contacts as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomContact
     */
    public org.rcsb.cif.model.geomcontact.GeomContact getGeomContact() {
        return (org.rcsb.cif.model.geomcontact.GeomContact) categories.computeIfAbsent("geom_contact",
                org.rcsb.cif.model.geomcontact.GeomContact::new);
    }

    /**
     * Data items in the GEOM_HBOND category record details about
     * hydrogen bonds as calculated from the contents of the ATOM,
     * CELL and SYMMETRY data.
     * @return GeomHbond
     */
    public org.rcsb.cif.model.geomhbond.GeomHbond getGeomHbond() {
        return (org.rcsb.cif.model.geomhbond.GeomHbond) categories.computeIfAbsent("geom_hbond",
                org.rcsb.cif.model.geomhbond.GeomHbond::new);
    }

    /**
     * Data items in the GEOM_TORSION category record details about
     * torsion angles as calculated from the
     * contents of the ATOM, CELL and SYMMETRY data.
     *
     * The vector direction _geom_torsion.atom_site_id_2 to
     * _geom_torsion.atom_site_id_3 is the viewing direction, and the
     * torsion angle is the angle of twist required to superimpose the
     * projection of the vector between site 2 and site 1 onto the
     * projection of the vector between site 3 and site 4. Clockwise
     * torsions are positive, anticlockwise torsions are negative.
     *
     * Ref: Klyne, W. & Prelog, V. (1960). Experientia, 16, 521-523.
     * @return GeomTorsion
     */
    public org.rcsb.cif.model.geomtorsion.GeomTorsion getGeomTorsion() {
        return (org.rcsb.cif.model.geomtorsion.GeomTorsion) categories.computeIfAbsent("geom_torsion",
                org.rcsb.cif.model.geomtorsion.GeomTorsion::new);
    }

    /**
     * Data items in the JOURNAL category record details about the
     * book-keeping by the journal staff when processing
     * a data block submitted for publication.
     *
     * The creator of a data block will not normally specify these data.
     * The data names are not defined in the dictionary because they are
     * for journal use only.
     * @return Journal
     */
    public org.rcsb.cif.model.journal.Journal getJournal() {
        return (org.rcsb.cif.model.journal.Journal) categories.computeIfAbsent("journal",
                org.rcsb.cif.model.journal.Journal::new);
    }

    /**
     * Data items in the JOURNAL_INDEX category are used to list terms
     * used to generate the journal indexes.
     *
     * The creator of a data block will not normally specify these data
     * items.
     * @return JournalIndex
     */
    public org.rcsb.cif.model.journalindex.JournalIndex getJournalIndex() {
        return (org.rcsb.cif.model.journalindex.JournalIndex) categories.computeIfAbsent("journal_index",
                org.rcsb.cif.model.journalindex.JournalIndex::new);
    }

    /**
     * Data items in the PHASING category record details about the
     * phasing of the structure, listing the various methods used in
     * the phasing process. Details about the application of each
     * method are listed in the appropriate subcategories.
     * @return Phasing
     */
    public org.rcsb.cif.model.phasing.Phasing getPhasing() {
        return (org.rcsb.cif.model.phasing.Phasing) categories.computeIfAbsent("phasing",
                org.rcsb.cif.model.phasing.Phasing::new);
    }

    /**
     * Data items in the PHASING_AVERAGING category record details
     * about the phasing of the structure where methods involving
     * averaging of multiple observations of the molecule in the
     * asymmetric unit are involved.
     * @return PhasingAveraging
     */
    public org.rcsb.cif.model.phasingaveraging.PhasingAveraging getPhasingAveraging() {
        return (org.rcsb.cif.model.phasingaveraging.PhasingAveraging) categories.computeIfAbsent("phasing_averaging",
                org.rcsb.cif.model.phasingaveraging.PhasingAveraging::new);
    }

    /**
     * Data items in the PHASING_ISOMORPHOUS category record details
     * about the phasing of the structure where a model isomorphous
     * to the structure being phased was used to generate the initial
     * phases.
     * @return PhasingIsomorphous
     */
    public org.rcsb.cif.model.phasingisomorphous.PhasingIsomorphous getPhasingIsomorphous() {
        return (org.rcsb.cif.model.phasingisomorphous.PhasingIsomorphous) categories.computeIfAbsent("phasing_isomorphous",
                org.rcsb.cif.model.phasingisomorphous.PhasingIsomorphous::new);
    }

    /**
     * Data items in the PHASING_MAD category record details about
     * the phasing of the structure where methods involving
     * multiple-wavelength anomalous-dispersion techniques are involved.
     * @return PhasingMAD
     */
    public org.rcsb.cif.model.phasingmad.PhasingMAD getPhasingMAD() {
        return (org.rcsb.cif.model.phasingmad.PhasingMAD) categories.computeIfAbsent("phasing_MAD",
                org.rcsb.cif.model.phasingmad.PhasingMAD::new);
    }

    /**
     * Data items in the PHASING_MAD_CLUST category record details
     * about a cluster of experiments that contributed to the
     * generation of a set of phases.
     * @return PhasingMADClust
     */
    public org.rcsb.cif.model.phasingmadclust.PhasingMADClust getPhasingMADClust() {
        return (org.rcsb.cif.model.phasingmadclust.PhasingMADClust) categories.computeIfAbsent("phasing_MAD_clust",
                org.rcsb.cif.model.phasingmadclust.PhasingMADClust::new);
    }

    /**
     * Data items in the PHASING_MAD_EXPT category record details about
     * a MAD phasing experiment, such as the number of experiments that
     * were clustered together to produce a set of phases or the
     * statistics for those phases.
     * @return PhasingMADExpt
     */
    public org.rcsb.cif.model.phasingmadexpt.PhasingMADExpt getPhasingMADExpt() {
        return (org.rcsb.cif.model.phasingmadexpt.PhasingMADExpt) categories.computeIfAbsent("phasing_MAD_expt",
                org.rcsb.cif.model.phasingmadexpt.PhasingMADExpt::new);
    }

    /**
     * Data items in the PHASING_MAD_RATIO category record
     * the ratios of phasing statistics between pairs of data sets
     * in a MAD phasing experiment, in given shells of resolution.
     * @return PhasingMADRatio
     */
    public org.rcsb.cif.model.phasingmadratio.PhasingMADRatio getPhasingMADRatio() {
        return (org.rcsb.cif.model.phasingmadratio.PhasingMADRatio) categories.computeIfAbsent("phasing_MAD_ratio",
                org.rcsb.cif.model.phasingmadratio.PhasingMADRatio::new);
    }

    /**
     * Data items in the PHASING_MAD_SET category record
     * details about the individual data sets used in a MAD phasing
     * experiment.
     * @return PhasingMADSet
     */
    public org.rcsb.cif.model.phasingmadset.PhasingMADSet getPhasingMADSet() {
        return (org.rcsb.cif.model.phasingmadset.PhasingMADSet) categories.computeIfAbsent("phasing_MAD_set",
                org.rcsb.cif.model.phasingmadset.PhasingMADSet::new);
    }

    /**
     * Data items in the PHASING_MIR category record details about
     * the phasing of the structure where methods involving isomorphous
     * replacement are involved.
     *
     * All isomorphous-replacement-based techniques are covered
     * by this category, including single isomorphous replacement (SIR),
     * multiple isomorphous replacement (MIR) and single or multiple
     * isomorphous replacement plus anomalous scattering (SIRAS, MIRAS).
     * @return PhasingMIR
     */
    public org.rcsb.cif.model.phasingmir.PhasingMIR getPhasingMIR() {
        return (org.rcsb.cif.model.phasingmir.PhasingMIR) categories.computeIfAbsent("phasing_MIR",
                org.rcsb.cif.model.phasingmir.PhasingMIR::new);
    }

    /**
     * Data items in the PHASING_MIR_DER category record details
     * about individual derivatives used in the phasing of the
     * structure when methods involving isomorphous replacement are
     * involved.
     *
     * A derivative in this context does not necessarily equate with
     * a data set; for instance, the same data set could be used to
     * one resolution limit as an isomorphous scatterer and to a
     * different resolution (and with a different sigma cutoff) as an
     * anomalous scatterer. These would be treated as two distinct
     * derivatives, although both derivatives would point to the same
     * data sets via _phasing_MIR_der.der_set_id and
     * _phasing_MIR_der.native_set_id.
     * @return PhasingMIRDer
     */
    public org.rcsb.cif.model.phasingmirder.PhasingMIRDer getPhasingMIRDer() {
        return (org.rcsb.cif.model.phasingmirder.PhasingMIRDer) categories.computeIfAbsent("phasing_MIR_der",
                org.rcsb.cif.model.phasingmirder.PhasingMIRDer::new);
    }

    /**
     * Data items in the PHASING_MIR_DER_REFLN category record details
     * about the calculated structure factors obtained in an MIR
     * phasing experiment.
     *
     * This list may contain information from a number of different
     * derivatives; _phasing_MIR_der_refln.der_id indicates to which
     * derivative a given record corresponds. (A derivative in this
     * context does not necessarily equate with a data set; see the
     * definition of the PHASING_MIR_DER category for a
     * discussion of the meaning of derivative.)
     *
     * It is not necessary for the data items describing the measured
     * value of F to appear in this list, as they will be
     * given in the PHASING_SET_REFLN category. However, these
     * items can also be listed here for completeness.
     * @return PhasingMIRDerRefln
     */
    public org.rcsb.cif.model.phasingmirderrefln.PhasingMIRDerRefln getPhasingMIRDerRefln() {
        return (org.rcsb.cif.model.phasingmirderrefln.PhasingMIRDerRefln) categories.computeIfAbsent("phasing_MIR_der_refln",
                org.rcsb.cif.model.phasingmirderrefln.PhasingMIRDerRefln::new);
    }

    /**
     * Data items in the PHASING_MIR_DER_SHELL category record
     * statistics, broken down into shells of resolution, for an MIR
     * phasing experiment.
     *
     * This list may contain information from a number of different
     * derivatives; _phasing_MIR_der_shell.der_id indicates to which
     * derivative a given record corresponds. (A derivative in this
     * context does not necessarily equate with a data set; see the
     * definition of the PHASING_MIR_DER category for a
     * discussion of the meaning of derivative.)
     * @return PhasingMIRDerShell
     */
    public org.rcsb.cif.model.phasingmirdershell.PhasingMIRDerShell getPhasingMIRDerShell() {
        return (org.rcsb.cif.model.phasingmirdershell.PhasingMIRDerShell) categories.computeIfAbsent("phasing_MIR_der_shell",
                org.rcsb.cif.model.phasingmirdershell.PhasingMIRDerShell::new);
    }

    /**
     * Data items in the PHASING_MIR_DER_SITE category record details
     * about the heavy-atom sites in an MIR phasing experiment.
     *
     * This list may contain information from a number of different
     * derivatives; _phasing_MIR_der_site.der_id indicates to which
     * derivative a given record corresponds. (A derivative in this
     * context does not necessarily equate with a data set; see the
     * definition of the PHASING_MIR_DER category for a
     * discussion of the meaning of derivative.)
     * @return PhasingMIRDerSite
     */
    public org.rcsb.cif.model.phasingmirdersite.PhasingMIRDerSite getPhasingMIRDerSite() {
        return (org.rcsb.cif.model.phasingmirdersite.PhasingMIRDerSite) categories.computeIfAbsent("phasing_MIR_der_site",
                org.rcsb.cif.model.phasingmirdersite.PhasingMIRDerSite::new);
    }

    /**
     * Data items in the PHASING_MIR_SHELL category record statistics
     * for an isomorphous replacement phasing experiment.broken
     * down into shells of resolution.
     * @return PhasingMIRShell
     */
    public org.rcsb.cif.model.phasingmirshell.PhasingMIRShell getPhasingMIRShell() {
        return (org.rcsb.cif.model.phasingmirshell.PhasingMIRShell) categories.computeIfAbsent("phasing_MIR_shell",
                org.rcsb.cif.model.phasingmirshell.PhasingMIRShell::new);
    }

    /**
     * Data items in the PHASING_SET category record details about
     * the data sets used in a phasing experiment. A given data set
     * may be used in a number of different ways; for instance, a
     * single data set could be used both as an isomorphous derivative
     * and as a component of a multiple-wavelength calculation. This
     * category establishes identifiers for each data set and permits
     * the archiving of a subset of experimental information for each
     * data set (cell constants, wavelength, temperature etc.).
     *
     * This and related categories of data items are provided so that
     * derivative intensity and phase information can be stored in
     * the same data block as the information for the refined
     * structure.
     *
     * If all the possible experimental information for each data
     * set (raw data sets, crystal growth conditions etc.) is to be
     * archived, these data items should be recorded in a separate
     * data block.
     * @return PhasingSet
     */
    public org.rcsb.cif.model.phasingset.PhasingSet getPhasingSet() {
        return (org.rcsb.cif.model.phasingset.PhasingSet) categories.computeIfAbsent("phasing_set",
                org.rcsb.cif.model.phasingset.PhasingSet::new);
    }

    /**
     * Data items in the PHASING_SET_REFLN category record the values
     * of the measured structure factors used in a phasing experiment.
     * This list may contain information from a number of different
     * data sets; _phasing_set_refln.set_id indicates the data set
     * to which a given record corresponds.
     * @return PhasingSetRefln
     */
    public org.rcsb.cif.model.phasingsetrefln.PhasingSetRefln getPhasingSetRefln() {
        return (org.rcsb.cif.model.phasingsetrefln.PhasingSetRefln) categories.computeIfAbsent("phasing_set_refln",
                org.rcsb.cif.model.phasingsetrefln.PhasingSetRefln::new);
    }

    /**
     * Data items in the PUBL category are used when submitting a
     * manuscript for publication.
     * @return Publ
     */
    public org.rcsb.cif.model.publ.Publ getPubl() {
        return (org.rcsb.cif.model.publ.Publ) categories.computeIfAbsent("publ",
                org.rcsb.cif.model.publ.Publ::new);
    }

    /**
     * Data items in the PUBL_AUTHOR category record details of
     * the authors of a manuscript submitted for publication.
     * @return PublAuthor
     */
    public org.rcsb.cif.model.publauthor.PublAuthor getPublAuthor() {
        return (org.rcsb.cif.model.publauthor.PublAuthor) categories.computeIfAbsent("publ_author",
                org.rcsb.cif.model.publauthor.PublAuthor::new);
    }

    /**
     * Data items in the PUBL_BODY category permit the labelling of
     * different text sections within the body of a paper.
     * Note that these should not be used in a paper which has
     * a standard format with sections tagged by specific data names
     * (such as in Acta Crystallographica Section C). Typically,
     * each journal will supply a list of the specific items it
     * requires in its Notes for Authors.
     * @return PublBody
     */
    public org.rcsb.cif.model.publbody.PublBody getPublBody() {
        return (org.rcsb.cif.model.publbody.PublBody) categories.computeIfAbsent("publ_body",
                org.rcsb.cif.model.publbody.PublBody::new);
    }

    /**
     * Data items in the PUBL_MANUSCRIPT_INCL category allow
     * the authors of a manuscript submitted for publication to list
     * data names that should be added to the standard request list
     * used by the journal printing software.
     * @return PublManuscriptIncl
     */
    public org.rcsb.cif.model.publmanuscriptincl.PublManuscriptIncl getPublManuscriptIncl() {
        return (org.rcsb.cif.model.publmanuscriptincl.PublManuscriptIncl) categories.computeIfAbsent("publ_manuscript_incl",
                org.rcsb.cif.model.publmanuscriptincl.PublManuscriptIncl::new);
    }

    /**
     * Data items in the REFINE category record details about the
     * structure-refinement parameters.
     * @return Refine
     */
    public org.rcsb.cif.model.refine.Refine getRefine() {
        return (org.rcsb.cif.model.refine.Refine) categories.computeIfAbsent("refine",
                org.rcsb.cif.model.refine.Refine::new);
    }

    /**
     * Data items in the REFINE_ANALYZE category record details
     * about the refined structure that are often used to analyze the
     * refinement and assess its quality. A given computer program
     * may or may not produce values corresponding to these data
     * names.
     * @return RefineAnalyze
     */
    public org.rcsb.cif.model.refineanalyze.RefineAnalyze getRefineAnalyze() {
        return (org.rcsb.cif.model.refineanalyze.RefineAnalyze) categories.computeIfAbsent("refine_analyze",
                org.rcsb.cif.model.refineanalyze.RefineAnalyze::new);
    }

    /**
     * Data items in the REFINE_B_ISO category record details about
     * the treatment of isotropic B factors (displacement parameters)
     * during refinement.
     * @return RefineBIso
     */
    public org.rcsb.cif.model.refinebiso.RefineBIso getRefineBIso() {
        return (org.rcsb.cif.model.refinebiso.RefineBIso) categories.computeIfAbsent("refine_B_iso",
                org.rcsb.cif.model.refinebiso.RefineBIso::new);
    }

    /**
     * Data items in the REFINE_FUNCT_MINIMIZED category record
     * details about the individual terms of the function minimized
     * during refinement.
     * @return RefineFunctMinimized
     */
    public org.rcsb.cif.model.refinefunctminimized.RefineFunctMinimized getRefineFunctMinimized() {
        return (org.rcsb.cif.model.refinefunctminimized.RefineFunctMinimized) categories.computeIfAbsent("refine_funct_minimized",
                org.rcsb.cif.model.refinefunctminimized.RefineFunctMinimized::new);
    }

    /**
     * Data items in the REFINE_HIST category record details about the
     * steps during the refinement of the structure.
     * These data items are not meant to be as thorough a description
     * of the refinement as is provided for the final model in other
     * categories; rather, these data items provide a mechanism for
     * sketching out the progress of the refinement, supported by a
     * small set of representative statistics.
     * @return RefineHist
     */
    public org.rcsb.cif.model.refinehist.RefineHist getRefineHist() {
        return (org.rcsb.cif.model.refinehist.RefineHist) categories.computeIfAbsent("refine_hist",
                org.rcsb.cif.model.refinehist.RefineHist::new);
    }

    /**
     * Data items in the REFINE_LS_RESTR category record details about
     * the restraints applied to various classes of parameters during
     * the least-squares refinement.
     * @return RefineLsRestr
     */
    public org.rcsb.cif.model.refinelsrestr.RefineLsRestr getRefineLsRestr() {
        return (org.rcsb.cif.model.refinelsrestr.RefineLsRestr) categories.computeIfAbsent("refine_ls_restr",
                org.rcsb.cif.model.refinelsrestr.RefineLsRestr::new);
    }

    /**
     * Data items in the REFINE_LS_RESTR_NCS category record details
     * about the restraints applied to atom positions in domains
     * related by noncrystallographic symmetry during least-squares
     * refinement, and also about the deviation of the restrained
     * atomic parameters at the end of the refinement.  It is
     * expected that these values will only be reported once for each
     * set of restrained domains.
     * @return RefineLsRestrNcs
     */
    public org.rcsb.cif.model.refinelsrestrncs.RefineLsRestrNcs getRefineLsRestrNcs() {
        return (org.rcsb.cif.model.refinelsrestrncs.RefineLsRestrNcs) categories.computeIfAbsent("refine_ls_restr_ncs",
                org.rcsb.cif.model.refinelsrestrncs.RefineLsRestrNcs::new);
    }

    /**
     * Data items in the REFINE_LS_RESTR_TYPE category record details
     * about the restraint types used in the least-squares refinement.
     * @return RefineLsRestrType
     */
    public org.rcsb.cif.model.refinelsrestrtype.RefineLsRestrType getRefineLsRestrType() {
        return (org.rcsb.cif.model.refinelsrestrtype.RefineLsRestrType) categories.computeIfAbsent("refine_ls_restr_type",
                org.rcsb.cif.model.refinelsrestrtype.RefineLsRestrType::new);
    }

    /**
     * Data items in the REFINE_LS_SHELL category record details about
     * the results of the least-squares refinement broken down into
     * shells of resolution.
     * @return RefineLsShell
     */
    public org.rcsb.cif.model.refinelsshell.RefineLsShell getRefineLsShell() {
        return (org.rcsb.cif.model.refinelsshell.RefineLsShell) categories.computeIfAbsent("refine_ls_shell",
                org.rcsb.cif.model.refinelsshell.RefineLsShell::new);
    }

    /**
     * Data items in the REFINE_OCCUPANCY category record details
     * about the treatment of atom occupancies during refinement.
     * @return RefineOccupancy
     */
    public org.rcsb.cif.model.refineoccupancy.RefineOccupancy getRefineOccupancy() {
        return (org.rcsb.cif.model.refineoccupancy.RefineOccupancy) categories.computeIfAbsent("refine_occupancy",
                org.rcsb.cif.model.refineoccupancy.RefineOccupancy::new);
    }

    /**
     * Data items in the REFLN category record details about the
     * reflection data used to determine the ATOM_SITE data items.
     *
     * The REFLN data items refer to individual reflections and must
     * be included in looped lists.
     *
     * The REFLNS data items specify the parameters that apply to all
     * reflections. The REFLNS data items are not looped.
     * @return Refln
     */
    public org.rcsb.cif.model.refln.Refln getRefln() {
        return (org.rcsb.cif.model.refln.Refln) categories.computeIfAbsent("refln",
                org.rcsb.cif.model.refln.Refln::new);
    }

    /**
     * Data items in the REFLN_SYS_ABS category record details about
     * the reflection data that should be systematically absent,
     * given the designated space group.
     * @return ReflnSysAbs
     */
    public org.rcsb.cif.model.reflnsysabs.ReflnSysAbs getReflnSysAbs() {
        return (org.rcsb.cif.model.reflnsysabs.ReflnSysAbs) categories.computeIfAbsent("refln_sys_abs",
                org.rcsb.cif.model.reflnsysabs.ReflnSysAbs::new);
    }

    /**
     * Data items in the REFLNS category record details about the
     * reflection data used to determine the ATOM_SITE data items.
     *
     * The REFLN data items refer to individual reflections and must
     * be included in looped lists.
     *
     * The REFLNS data items specify the parameters that apply to all
     * reflections. The REFLNS data items are not looped.
     * @return Reflns
     */
    public org.rcsb.cif.model.reflns.Reflns getReflns() {
        return (org.rcsb.cif.model.reflns.Reflns) categories.computeIfAbsent("reflns",
                org.rcsb.cif.model.reflns.Reflns::new);
    }

    /**
     * Data items in the REFLNS_SCALE category record details about
     * the structure-factor scales. They are referenced from within
     * the REFLN list through _refln.scale_group_code.
     * @return ReflnsScale
     */
    public org.rcsb.cif.model.reflnsscale.ReflnsScale getReflnsScale() {
        return (org.rcsb.cif.model.reflnsscale.ReflnsScale) categories.computeIfAbsent("reflns_scale",
                org.rcsb.cif.model.reflnsscale.ReflnsScale::new);
    }

    /**
     * Data items in the REFLNS_SHELL category record details about
     * the reflection data used to determine the ATOM_SITE data items
     * broken down into shells of resolution.
     * @return ReflnsShell
     */
    public org.rcsb.cif.model.reflnsshell.ReflnsShell getReflnsShell() {
        return (org.rcsb.cif.model.reflnsshell.ReflnsShell) categories.computeIfAbsent("reflns_shell",
                org.rcsb.cif.model.reflnsshell.ReflnsShell::new);
    }

    /**
     * Data items in the SOFTWARE category record details about
     * the software used in the structure analysis, which implies
     * any software used in the generation of any data items
     * associated with the structure determination and
     * structure representation.
     *
     * These data items allow computer programs to be referenced
     * in more detail than data items in the COMPUTING category do.
     * @return Software
     */
    public org.rcsb.cif.model.software.Software getSoftware() {
        return (org.rcsb.cif.model.software.Software) categories.computeIfAbsent("software",
                org.rcsb.cif.model.software.Software::new);
    }

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    public org.rcsb.cif.model.struct.Struct getStruct() {
        return (org.rcsb.cif.model.struct.Struct) categories.computeIfAbsent("struct",
                org.rcsb.cif.model.struct.Struct::new);
    }

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    public org.rcsb.cif.model.structasym.StructAsym getStructAsym() {
        return (org.rcsb.cif.model.structasym.StructAsym) categories.computeIfAbsent("struct_asym",
                org.rcsb.cif.model.structasym.StructAsym::new);
    }

    /**
     * Data items in the STRUCT_BIOL category record details about
     * the structural elements that form each structure of biological
     * significance.
     *
     * A given crystal structure may contain many different biological
     * structures. A given structural component in the asymmetric
     * unit may be part of more than one biological unit. A given
     * biological structure may involve crystallographic symmetry.
     *
     * For instance, in a structure of a lysozyme-FAB structure, the
     * light- and heavy-chain components of the FAB could be one
     * biological unit, while the two chains of the FAB and the lysozyme
     * could constitute a second biological unit.
     * @return StructBiol
     */
    public org.rcsb.cif.model.structbiol.StructBiol getStructBiol() {
        return (org.rcsb.cif.model.structbiol.StructBiol) categories.computeIfAbsent("struct_biol",
                org.rcsb.cif.model.structbiol.StructBiol::new);
    }

    /**
     * Data items in the STRUCT_BIOL_GEN category record details about
     * the generation of each biological unit. The STRUCT_BIOL_GEN
     * data items provide the specifications of the components that
     * constitute that biological unit, which may include symmetry
     * elements.
     * @return StructBiolGen
     */
    public org.rcsb.cif.model.structbiolgen.StructBiolGen getStructBiolGen() {
        return (org.rcsb.cif.model.structbiolgen.StructBiolGen) categories.computeIfAbsent("struct_biol_gen",
                org.rcsb.cif.model.structbiolgen.StructBiolGen::new);
    }

    /**
     * Data items in the STRUCT_BIOL_KEYWORDS category record
     * keywords that describe each biological unit.
     * @return StructBiolKeywords
     */
    public org.rcsb.cif.model.structbiolkeywords.StructBiolKeywords getStructBiolKeywords() {
        return (org.rcsb.cif.model.structbiolkeywords.StructBiolKeywords) categories.computeIfAbsent("struct_biol_keywords",
                org.rcsb.cif.model.structbiolkeywords.StructBiolKeywords::new);
    }

    /**
     * Data items in the STRUCT_BIOL_VIEW category record details
     * about how to draw and annotate an informative view of the
     * biological structure.
     * @return StructBiolView
     */
    public org.rcsb.cif.model.structbiolview.StructBiolView getStructBiolView() {
        return (org.rcsb.cif.model.structbiolview.StructBiolView) categories.computeIfAbsent("struct_biol_view",
                org.rcsb.cif.model.structbiolview.StructBiolView::new);
    }

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     *
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    public org.rcsb.cif.model.structconf.StructConf getStructConf() {
        return (org.rcsb.cif.model.structconf.StructConf) categories.computeIfAbsent("struct_conf",
                org.rcsb.cif.model.structconf.StructConf::new);
    }

    /**
     * Data items in the STRUCT_CONF_TYPE category record details
     * about the criteria used to identify backbone conformations of a
     * segment of polymer.
     * @return StructConfType
     */
    public org.rcsb.cif.model.structconftype.StructConfType getStructConfType() {
        return (org.rcsb.cif.model.structconftype.StructConfType) categories.computeIfAbsent("struct_conf_type",
                org.rcsb.cif.model.structconftype.StructConfType::new);
    }

    /**
     * Data items in the STRUCT_CONN category record details about
     * the connections between portions of the structure. These can be
     * hydrogen bonds, salt bridges, disulfide bridges and so on.
     *
     * The STRUCT_CONN_TYPE records define the criteria used to
     * identify these connections.
     * @return StructConn
     */
    public org.rcsb.cif.model.structconn.StructConn getStructConn() {
        return (org.rcsb.cif.model.structconn.StructConn) categories.computeIfAbsent("struct_conn",
                org.rcsb.cif.model.structconn.StructConn::new);
    }

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    public org.rcsb.cif.model.structconntype.StructConnType getStructConnType() {
        return (org.rcsb.cif.model.structconntype.StructConnType) categories.computeIfAbsent("struct_conn_type",
                org.rcsb.cif.model.structconntype.StructConnType::new);
    }

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    public org.rcsb.cif.model.structkeywords.StructKeywords getStructKeywords() {
        return (org.rcsb.cif.model.structkeywords.StructKeywords) categories.computeIfAbsent("struct_keywords",
                org.rcsb.cif.model.structkeywords.StructKeywords::new);
    }

    /**
     * Data items in the STRUCT_MON_DETAILS category record details
     * about specifics of calculations summarized in data items in the
     * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
     * include the coefficients used in map calculations,
     * the radii used for including points in a calculation and so on.
     * @return StructMonDetails
     */
    public org.rcsb.cif.model.structmondetails.StructMonDetails getStructMonDetails() {
        return (org.rcsb.cif.model.structmondetails.StructMonDetails) categories.computeIfAbsent("struct_mon_details",
                org.rcsb.cif.model.structmondetails.StructMonDetails::new);
    }

    /**
     * Data items in the STRUCT_MON_NUCL category record details about
     * structural properties of a nucleic acid when analyzed at the
     * monomer level. Analogous data items for proteins are given in
     * the STRUCT_MON_PROT category. For items where the value of the
     * property depends on the method employed to calculate it,
     * details of the method of calculation are given using data items
     * in the STRUCT_MON_DETAILS category.
     * @return StructMonNucl
     */
    public org.rcsb.cif.model.structmonnucl.StructMonNucl getStructMonNucl() {
        return (org.rcsb.cif.model.structmonnucl.StructMonNucl) categories.computeIfAbsent("struct_mon_nucl",
                org.rcsb.cif.model.structmonnucl.StructMonNucl::new);
    }

    /**
     * Data items in the STRUCT_MON_PROT category record details about
     * structural properties of a protein when analyzed at the monomer
     * level. Analogous data items for nucleic acids are given in the
     * STRUCT_MON_NUCL category. For items where the value of the
     * property depends on the method employed to calculate it,
     * details of the method of calculation are given using data items
     * in the STRUCT_MON_DETAILS category.
     * @return StructMonProt
     */
    public org.rcsb.cif.model.structmonprot.StructMonProt getStructMonProt() {
        return (org.rcsb.cif.model.structmonprot.StructMonProt) categories.computeIfAbsent("struct_mon_prot",
                org.rcsb.cif.model.structmonprot.StructMonProt::new);
    }

    /**
     * Data items in the STRUCT_MON_PROT_CIS category identify
     * monomers that have been found to have the peptide bond in the cis
     * conformation. The criterion used to select residues to be
     * designated as containing cis peptide bonds is given in
     * _struct_mon_details.prot_cis.
     * @return StructMonProtCis
     */
    public org.rcsb.cif.model.structmonprotcis.StructMonProtCis getStructMonProtCis() {
        return (org.rcsb.cif.model.structmonprotcis.StructMonProtCis) categories.computeIfAbsent("struct_mon_prot_cis",
                org.rcsb.cif.model.structmonprotcis.StructMonProtCis::new);
    }

    /**
     * Data items in the STRUCT_NCS_DOM category record information
     * about the domains in an ensemble of domains related by one or
     * more noncrystallographic symmetry operators.
     *
     * A domain need not correspond to a complete polypeptide chain;
     * it can be composed of one or more segments in a single chain,
     * or by segments from more than one chain.
     * @return StructNcsDom
     */
    public org.rcsb.cif.model.structncsdom.StructNcsDom getStructNcsDom() {
        return (org.rcsb.cif.model.structncsdom.StructNcsDom) categories.computeIfAbsent("struct_ncs_dom",
                org.rcsb.cif.model.structncsdom.StructNcsDom::new);
    }

    /**
     * Data items in the STRUCT_NCS_DOM_LIM category identify the
     * start and end points of polypeptide chain segments
     * that form all or part of a domain in an ensemble of domains
     * related by noncrystallographic symmetry.
     * @return StructNcsDomLim
     */
    public org.rcsb.cif.model.structncsdomlim.StructNcsDomLim getStructNcsDomLim() {
        return (org.rcsb.cif.model.structncsdomlim.StructNcsDomLim) categories.computeIfAbsent("struct_ncs_dom_lim",
                org.rcsb.cif.model.structncsdomlim.StructNcsDomLim::new);
    }

    /**
     * Data items in the STRUCT_NCS_ENS category record information
     * about ensembles of domains related by noncrystallographic
     * symmetry. The point group of the ensemble when taken as a
     * whole may be specified, as well as any special aspects of the
     * ensemble that require description.
     * @return StructNcsEns
     */
    public org.rcsb.cif.model.structncsens.StructNcsEns getStructNcsEns() {
        return (org.rcsb.cif.model.structncsens.StructNcsEns) categories.computeIfAbsent("struct_ncs_ens",
                org.rcsb.cif.model.structncsens.StructNcsEns::new);
    }

    /**
     * Data items in the STRUCT_NCS_ENS_GEN category list domains
     * related by a noncrystallographic symmetry operation and
     * identify the operator.
     * @return StructNcsEnsGen
     */
    public org.rcsb.cif.model.structncsensgen.StructNcsEnsGen getStructNcsEnsGen() {
        return (org.rcsb.cif.model.structncsensgen.StructNcsEnsGen) categories.computeIfAbsent("struct_ncs_ens_gen",
                org.rcsb.cif.model.structncsensgen.StructNcsEnsGen::new);
    }

    /**
     * Data items in the STRUCT_NCS_OPER category describe the
     * noncrystallographic symmetry operations.
     *
     * Each operator is specified as a matrix and a subsequent
     * translation vector. Operators need not represent proper
     * rotations.
     * @return StructNcsOper
     */
    public org.rcsb.cif.model.structncsoper.StructNcsOper getStructNcsOper() {
        return (org.rcsb.cif.model.structncsoper.StructNcsOper) categories.computeIfAbsent("struct_ncs_oper",
                org.rcsb.cif.model.structncsoper.StructNcsOper::new);
    }

    /**
     * Data items in the STRUCT_REF category allow the author of a
     * data block to relate the entities or biological units
     * described in the data block to information archived in external
     * databases.
     *
     * For references to the sequence of a polymer, the value of
     * the data item _struct_ref.seq_align is used to indicate
     * whether the correspondence between the sequence of the entity
     * or biological unit in the data block and the sequence in the
     * referenced database entry is 'complete' or 'partial'. If
     * this value is 'partial', the region (or regions) of the
     * alignment may be delimited using data items in the
     * STRUCT_REF_SEQ category.
     *
     * Similarly, the value of _struct_ref.seq_dif is used to indicate
     * whether the two sequences contain point differences. If the
     * value is 'yes', the differences may be identified and annotated
     * using data items in the STRUCT_REF_SEQ_DIF category.
     * @return StructRef
     */
    public org.rcsb.cif.model.structref.StructRef getStructRef() {
        return (org.rcsb.cif.model.structref.StructRef) categories.computeIfAbsent("struct_ref",
                org.rcsb.cif.model.structref.StructRef::new);
    }

    /**
     * Data items in the STRUCT_REF_SEQ category provide a mechanism
     * for indicating and annotating a region (or regions) of alignment
     * between the sequence of an entity or biological unit described
     * in the data block and the sequence in the referenced database
     * entry.
     * @return StructRefSeq
     */
    public org.rcsb.cif.model.structrefseq.StructRefSeq getStructRefSeq() {
        return (org.rcsb.cif.model.structrefseq.StructRefSeq) categories.computeIfAbsent("struct_ref_seq",
                org.rcsb.cif.model.structrefseq.StructRefSeq::new);
    }

    /**
     * Data items in the STRUCT_REF_SEQ_DIF category provide a
     * mechanism for indicating and annotating point differences
     * between the sequence of the entity or biological unit described
     * in the data block and the sequence of the referenced database
     * entry.
     * @return StructRefSeqDif
     */
    public org.rcsb.cif.model.structrefseqdif.StructRefSeqDif getStructRefSeqDif() {
        return (org.rcsb.cif.model.structrefseqdif.StructRefSeqDif) categories.computeIfAbsent("struct_ref_seq_dif",
                org.rcsb.cif.model.structrefseqdif.StructRefSeqDif::new);
    }

    /**
     * Data items in the STRUCT_SHEET category record details about
     * the beta-sheets.
     * @return StructSheet
     */
    public org.rcsb.cif.model.structsheet.StructSheet getStructSheet() {
        return (org.rcsb.cif.model.structsheet.StructSheet) categories.computeIfAbsent("struct_sheet",
                org.rcsb.cif.model.structsheet.StructSheet::new);
    }

    /**
     * Data items in the STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta-
     * sheet. It is necessary to treat hydrogen bonding independently
     * of the designation of ranges, because the hydrogen bonding may
     * begin in different places for the interactions of a given strand
     * with the one preceding it and the one following it in the sheet.
     * @return StructSheetHbond
     */
    public org.rcsb.cif.model.structsheethbond.StructSheetHbond getStructSheetHbond() {
        return (org.rcsb.cif.model.structsheethbond.StructSheetHbond) categories.computeIfAbsent("struct_sheet_hbond",
                org.rcsb.cif.model.structsheethbond.StructSheetHbond::new);
    }

    /**
     * Data items in the STRUCT_SHEET_ORDER category record details
     * about the order of the residue ranges that form a beta-sheet.
     * All order links are pairwise and the specified pairs are
     * assumed to be adjacent to one another in the sheet. These data
     * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
     * items and they allow all manner of sheets to be described.
     * @return StructSheetOrder
     */
    public org.rcsb.cif.model.structsheetorder.StructSheetOrder getStructSheetOrder() {
        return (org.rcsb.cif.model.structsheetorder.StructSheetOrder) categories.computeIfAbsent("struct_sheet_order",
                org.rcsb.cif.model.structsheetorder.StructSheetOrder::new);
    }

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    public org.rcsb.cif.model.structsheetrange.StructSheetRange getStructSheetRange() {
        return (org.rcsb.cif.model.structsheetrange.StructSheetRange) categories.computeIfAbsent("struct_sheet_range",
                org.rcsb.cif.model.structsheetrange.StructSheetRange::new);
    }

    /**
     * Data items in the STRUCT_SHEET_TOPOLOGY category record details
     * about the topology of the residue ranges that form a beta-sheet.
     * All topology links are pairwise and the specified pairs are
     * assumed to be successive in the amino-acid sequence. These
     * data items are useful in describing various simple and complex
     * folds, but they become inadequate when the strands in the sheet
     * come from more than one chain. The
     * STRUCT_SHEET_ORDER data items can be used to describe
     * single- and multiple-chain-containing sheets.
     * @return StructSheetTopology
     */
    public org.rcsb.cif.model.structsheettopology.StructSheetTopology getStructSheetTopology() {
        return (org.rcsb.cif.model.structsheettopology.StructSheetTopology) categories.computeIfAbsent("struct_sheet_topology",
                org.rcsb.cif.model.structsheettopology.StructSheetTopology::new);
    }

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    public org.rcsb.cif.model.structsite.StructSite getStructSite() {
        return (org.rcsb.cif.model.structsite.StructSite) categories.computeIfAbsent("struct_site",
                org.rcsb.cif.model.structsite.StructSite::new);
    }

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    public org.rcsb.cif.model.structsitegen.StructSiteGen getStructSiteGen() {
        return (org.rcsb.cif.model.structsitegen.StructSiteGen) categories.computeIfAbsent("struct_site_gen",
                org.rcsb.cif.model.structsitegen.StructSiteGen::new);
    }

    /**
     * Data items in the STRUCT_SITE_KEYWORDS category record
     * keywords describing the site.
     * @return StructSiteKeywords
     */
    public org.rcsb.cif.model.structsitekeywords.StructSiteKeywords getStructSiteKeywords() {
        return (org.rcsb.cif.model.structsitekeywords.StructSiteKeywords) categories.computeIfAbsent("struct_site_keywords",
                org.rcsb.cif.model.structsitekeywords.StructSiteKeywords::new);
    }

    /**
     * Data items in the STRUCT_SITE_VIEW category record details
     * about how to draw and annotate an informative view of the
     * site.
     * @return StructSiteView
     */
    public org.rcsb.cif.model.structsiteview.StructSiteView getStructSiteView() {
        return (org.rcsb.cif.model.structsiteview.StructSiteView) categories.computeIfAbsent("struct_site_view",
                org.rcsb.cif.model.structsiteview.StructSiteView::new);
    }

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    public org.rcsb.cif.model.symmetry.Symmetry getSymmetry() {
        return (org.rcsb.cif.model.symmetry.Symmetry) categories.computeIfAbsent("symmetry",
                org.rcsb.cif.model.symmetry.Symmetry::new);
    }

    /**
     * Data items in the SYMMETRY_EQUIV category list the
     * symmetry-equivalent positions for the space group.
     * @return SymmetryEquiv
     */
    public org.rcsb.cif.model.symmetryequiv.SymmetryEquiv getSymmetryEquiv() {
        return (org.rcsb.cif.model.symmetryequiv.SymmetryEquiv) categories.computeIfAbsent("symmetry_equiv",
                org.rcsb.cif.model.symmetryequiv.SymmetryEquiv::new);
    }

    /**
     * Data items in the AUDIT_LINK category record details about the
     * relationships between data blocks in the current CIF.
     * @return AuditLink
     */
    public org.rcsb.cif.model.auditlink.AuditLink getAuditLink() {
        return (org.rcsb.cif.model.auditlink.AuditLink) categories.computeIfAbsent("audit_link",
                org.rcsb.cif.model.auditlink.AuditLink::new);
    }

    /**
     * Data items in the DIFFRN_REFLNS_CLASS category record details
     * about the classes of reflections measured in the diffraction
     * experiment.
     * @return DiffrnReflnsClass
     */
    public org.rcsb.cif.model.diffrnreflnsclass.DiffrnReflnsClass getDiffrnReflnsClass() {
        return (org.rcsb.cif.model.diffrnreflnsclass.DiffrnReflnsClass) categories.computeIfAbsent("diffrn_reflns_class",
                org.rcsb.cif.model.diffrnreflnsclass.DiffrnReflnsClass::new);
    }

    /**
     * Data items in the REFINE_LS_CLASS category record details
     * about the reflections used for the structure refinement
     * for each reflection class separately.
     * @return RefineLsClass
     */
    public org.rcsb.cif.model.refinelsclass.RefineLsClass getRefineLsClass() {
        return (org.rcsb.cif.model.refinelsclass.RefineLsClass) categories.computeIfAbsent("refine_ls_class",
                org.rcsb.cif.model.refinelsclass.RefineLsClass::new);
    }

    /**
     * Data items in the REFLNS_CLASS category record details
     * of the reflections used to determine the structural
     * parameters for each reflection class.
     * @return ReflnsClass
     */
    public org.rcsb.cif.model.reflnsclass.ReflnsClass getReflnsClass() {
        return (org.rcsb.cif.model.reflnsclass.ReflnsClass) categories.computeIfAbsent("reflns_class",
                org.rcsb.cif.model.reflnsclass.ReflnsClass::new);
    }

    /**
     * Contains all the data items that refer to the space group as a
     * whole, such as its name or crystal system. They may be looped,
     * for example, in a list of space groups and their properties.
     *
     * Only a subset of the SPACE_GROUP category items appear in
     * this dictionary.  The remainder are found in the symmetry CIF
     * dictionary.
     *
     * Space-group types are identified by their number as given in
     * International Tables for Crystallography Vol. A. Specific
     * settings of the space groups can be identified either by their
     * Hall symbol or by specifying their symmetry operations.
     *
     * The commonly used Hermann-Mauguin symbol determines the
     * space-group type uniquely but several different Hermann-Mauguin
     * symbols may refer to the same space-group type. A Hermann-Mauguin
     * symbol contains information on the choice of the basis, but not
     * on the choice of origin.  Different formats for the
     * Hermann-Mauguin symbol are found in the symmetry CIF dictionary.
     * @return SpaceGroup
     */
    public org.rcsb.cif.model.spacegroup.SpaceGroup getSpaceGroup() {
        return (org.rcsb.cif.model.spacegroup.SpaceGroup) categories.computeIfAbsent("space_group",
                org.rcsb.cif.model.spacegroup.SpaceGroup::new);
    }

    /**
     * Contains information about the symmetry operations of the
     * space group.
     * @return SpaceGroupSymop
     */
    public org.rcsb.cif.model.spacegroupsymop.SpaceGroupSymop getSpaceGroupSymop() {
        return (org.rcsb.cif.model.spacegroupsymop.SpaceGroupSymop) categories.computeIfAbsent("space_group_symop",
                org.rcsb.cif.model.spacegroupsymop.SpaceGroupSymop::new);
    }

    /**
     * Data items in the VALENCE_PARAM category define the
     * parameters used for calculating bond valences from bond
     * lengths.  In addition to the parameters, a pointer
     * is given to the reference (in VALENCE_REF) from which
     * the bond-valence parameters were taken.
     * @return ValenceParam
     */
    public org.rcsb.cif.model.valenceparam.ValenceParam getValenceParam() {
        return (org.rcsb.cif.model.valenceparam.ValenceParam) categories.computeIfAbsent("valence_param",
                org.rcsb.cif.model.valenceparam.ValenceParam::new);
    }

    /**
     * Data items in the VALENCE_REF category list the references
     * from which the bond-valence parameters have been taken.
     * @return ValenceRef
     */
    public org.rcsb.cif.model.valenceref.ValenceRef getValenceRef() {
        return (org.rcsb.cif.model.valenceref.ValenceRef) categories.computeIfAbsent("valence_ref",
                org.rcsb.cif.model.valenceref.ValenceRef::new);
    }

    /**
     * The PDBX_AUDIT holds current version information.
     * @return PdbxAudit
     */
    public org.rcsb.cif.model.pdbxaudit.PdbxAudit getPdbxAudit() {
        return (org.rcsb.cif.model.pdbxaudit.PdbxAudit) categories.computeIfAbsent("pdbx_audit",
                org.rcsb.cif.model.pdbxaudit.PdbxAudit::new);
    }

    /**
     * Data items in the PDBX_VERSION category record details about the
     * version of this entry.
     * @return PdbxVersion
     */
    public org.rcsb.cif.model.pdbxversion.PdbxVersion getPdbxVersion() {
        return (org.rcsb.cif.model.pdbxversion.PdbxVersion) categories.computeIfAbsent("pdbx_version",
                org.rcsb.cif.model.pdbxversion.PdbxVersion::new);
    }

    /**
     * Data items in the PDBX_AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return PdbxAuditAuthor
     */
    public org.rcsb.cif.model.pdbxauditauthor.PdbxAuditAuthor getPdbxAuditAuthor() {
        return (org.rcsb.cif.model.pdbxauditauthor.PdbxAuditAuthor) categories.computeIfAbsent("pdbx_audit_author",
                org.rcsb.cif.model.pdbxauditauthor.PdbxAuditAuthor::new);
    }

    /**
     * The PDBX_DATABASE_MESSAGE category provides information about
     * correspondance related to a structure deposition.
     * @return PdbxDatabaseMessage
     */
    public org.rcsb.cif.model.pdbxdatabasemessage.PdbxDatabaseMessage getPdbxDatabaseMessage() {
        return (org.rcsb.cif.model.pdbxdatabasemessage.PdbxDatabaseMessage) categories.computeIfAbsent("pdbx_database_message",
                org.rcsb.cif.model.pdbxdatabasemessage.PdbxDatabaseMessage::new);
    }

    /**
     * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
     * for information on obsolete/superseded PDB entries
     * @return PdbxDatabasePDBObsSpr
     */
    public org.rcsb.cif.model.pdbxdatabasepdbobsspr.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr() {
        return (org.rcsb.cif.model.pdbxdatabasepdbobsspr.PdbxDatabasePDBObsSpr) categories.computeIfAbsent("pdbx_database_PDB_obs_spr",
                org.rcsb.cif.model.pdbxdatabasepdbobsspr.PdbxDatabasePDBObsSpr::new);
    }

    /**
     * Internal records to track the data processing cycle.
     * @return PdbxDatabaseProc
     */
    public org.rcsb.cif.model.pdbxdatabaseproc.PdbxDatabaseProc getPdbxDatabaseProc() {
        return (org.rcsb.cif.model.pdbxdatabaseproc.PdbxDatabaseProc) categories.computeIfAbsent("pdbx_database_proc",
                org.rcsb.cif.model.pdbxdatabaseproc.PdbxDatabaseProc::new);
    }

    /**
     *
     * Data items in the PDBX_DATABASE_REMARK category record keep additional
     * information about the entry.  They are mostly used to create
     * 'non-standard' PDB REMARK annotations (6-99).
     * @return PdbxDatabaseRemark
     */
    public org.rcsb.cif.model.pdbxdatabaseremark.PdbxDatabaseRemark getPdbxDatabaseRemark() {
        return (org.rcsb.cif.model.pdbxdatabaseremark.PdbxDatabaseRemark) categories.computeIfAbsent("pdbx_database_remark",
                org.rcsb.cif.model.pdbxdatabaseremark.PdbxDatabaseRemark::new);
    }

    /**
     * These are internal RCSB records to keep track of data processing
     * and status of the entry.
     * @return PdbxDatabaseStatus
     */
    public org.rcsb.cif.model.pdbxdatabasestatus.PdbxDatabaseStatus getPdbxDatabaseStatus() {
        return (org.rcsb.cif.model.pdbxdatabasestatus.PdbxDatabaseStatus) categories.computeIfAbsent("pdbx_database_status",
                org.rcsb.cif.model.pdbxdatabasestatus.PdbxDatabaseStatus::new);
    }

    /**
     * The PDBX_ENTITY_NAME records additional name information for
     * each entity.
     * @return PdbxEntityName
     */
    public org.rcsb.cif.model.pdbxentityname.PdbxEntityName getPdbxEntityName() {
        return (org.rcsb.cif.model.pdbxentityname.PdbxEntityName) categories.computeIfAbsent("pdbx_entity_name",
                org.rcsb.cif.model.pdbxentityname.PdbxEntityName::new);
    }

    /**
     * This category provides a placeholder for pre-release
     * sequence information.  After release this category
     * should be discarded.
     * @return PdbxPrereleaseSeq
     */
    public org.rcsb.cif.model.pdbxprereleaseseq.PdbxPrereleaseSeq getPdbxPrereleaseSeq() {
        return (org.rcsb.cif.model.pdbxprereleaseseq.PdbxPrereleaseSeq) categories.computeIfAbsent("pdbx_prerelease_seq",
                org.rcsb.cif.model.pdbxprereleaseseq.PdbxPrereleaseSeq::new);
    }

    /**
     * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
     * mapping for polymer entities.
     * @return PdbxPolySeqScheme
     */
    public org.rcsb.cif.model.pdbxpolyseqscheme.PdbxPolySeqScheme getPdbxPolySeqScheme() {
        return (org.rcsb.cif.model.pdbxpolyseqscheme.PdbxPolySeqScheme) categories.computeIfAbsent("pdbx_poly_seq_scheme",
                org.rcsb.cif.model.pdbxpolyseqscheme.PdbxPolySeqScheme::new);
    }

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    public org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return (org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme) categories.computeIfAbsent("pdbx_nonpoly_scheme",
                org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme::new);
    }

    /**
     * Data items in the PDBX_REFINE category record details about
     * additional structure refinement parameters which are needed
     * to complete legacy REMARK 3 refinement templates in PDB
     * format files.
     * @return PdbxRefine
     */
    public org.rcsb.cif.model.pdbxrefine.PdbxRefine getPdbxRefine() {
        return (org.rcsb.cif.model.pdbxrefine.PdbxRefine) categories.computeIfAbsent("pdbx_refine",
                org.rcsb.cif.model.pdbxrefine.PdbxRefine::new);
    }

    /**
     * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta sheet.
     * This category is provided for cases where only a single hydrogen
     * bond is used to register the two residue ranges.   Category
     * STRUCT_SHEET_HBOND should be used when the initial and terminal
     * hydrogen bonds for strand pair are known.
     * @return PdbxStructSheetHbond
     */
    public org.rcsb.cif.model.pdbxstructsheethbond.PdbxStructSheetHbond getPdbxStructSheetHbond() {
        return (org.rcsb.cif.model.pdbxstructsheethbond.PdbxStructSheetHbond) categories.computeIfAbsent("pdbx_struct_sheet_hbond",
                org.rcsb.cif.model.pdbxstructsheethbond.PdbxStructSheetHbond::new);
    }

    /**
     *
     * Parameter and topology files used in X-PLOR/CNS refinement.
     * @return PdbxXplorFile
     */
    public org.rcsb.cif.model.pdbxxplorfile.PdbxXplorFile getPdbxXplorFile() {
        return (org.rcsb.cif.model.pdbxxplorfile.PdbxXplorFile) categories.computeIfAbsent("pdbx_xplor_file",
                org.rcsb.cif.model.pdbxxplorfile.PdbxXplorFile::new);
    }

    /**
     *
     * Auxilary parameter and topology files used in refinement.
     * @return PdbxRefineAuxFile
     */
    public org.rcsb.cif.model.pdbxrefineauxfile.PdbxRefineAuxFile getPdbxRefineAuxFile() {
        return (org.rcsb.cif.model.pdbxrefineauxfile.PdbxRefineAuxFile) categories.computeIfAbsent("pdbx_refine_aux_file",
                org.rcsb.cif.model.pdbxrefineauxfile.PdbxRefineAuxFile::new);
    }

    /**
     * Data items in PDBX_DATABASE_RELATED contain references to entries
     * that are related to the this entry.
     * @return PdbxDatabaseRelated
     */
    public org.rcsb.cif.model.pdbxdatabaserelated.PdbxDatabaseRelated getPdbxDatabaseRelated() {
        return (org.rcsb.cif.model.pdbxdatabaserelated.PdbxDatabaseRelated) categories.computeIfAbsent("pdbx_database_related",
                org.rcsb.cif.model.pdbxdatabaserelated.PdbxDatabaseRelated::new);
    }

    /**
     * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
     * of the biological assembly studied in terms of its constituent
     * entities.
     * @return PdbxEntityAssembly
     */
    public org.rcsb.cif.model.pdbxentityassembly.PdbxEntityAssembly getPdbxEntityAssembly() {
        return (org.rcsb.cif.model.pdbxentityassembly.PdbxEntityAssembly) categories.computeIfAbsent("pdbx_entity_assembly",
                org.rcsb.cif.model.pdbxentityassembly.PdbxEntityAssembly::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
     * details about the components of the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowComp
     */
    public org.rcsb.cif.model.pdbxexptlcrystalgrowcomp.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.pdbxexptlcrystalgrowcomp.PdbxExptlCrystalGrowComp) categories.computeIfAbsent("pdbx_exptl_crystal_grow_comp",
                org.rcsb.cif.model.pdbxexptlcrystalgrowcomp.PdbxExptlCrystalGrowComp::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
     * details about the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowSol
     */
    public org.rcsb.cif.model.pdbxexptlcrystalgrowsol.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol() {
        return (org.rcsb.cif.model.pdbxexptlcrystalgrowsol.PdbxExptlCrystalGrowSol) categories.computeIfAbsent("pdbx_exptl_crystal_grow_sol",
                org.rcsb.cif.model.pdbxexptlcrystalgrowsol.PdbxExptlCrystalGrowSol::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
     * record details cryogenic treatments applied to this crystal.
     * @return PdbxExptlCrystalCryoTreatment
     */
    public org.rcsb.cif.model.pdbxexptlcrystalcryotreatment.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment() {
        return (org.rcsb.cif.model.pdbxexptlcrystalcryotreatment.PdbxExptlCrystalCryoTreatment) categories.computeIfAbsent("pdbx_exptl_crystal_cryo_treatment",
                org.rcsb.cif.model.pdbxexptlcrystalcryotreatment.PdbxExptlCrystalCryoTreatment::new);
    }

    /**
     * Data items in the REFINE_TLS category record details about
     * TLS parameters used in structure refinement. Note that the
     * intention is primarily to describe directly refined TLS
     * parameters, although other methods of obtaining TLS parameters
     * may be covered, see item _pdbx_refine_tls.method
     * @return PdbxRefineTls
     */
    public org.rcsb.cif.model.pdbxrefinetls.PdbxRefineTls getPdbxRefineTls() {
        return (org.rcsb.cif.model.pdbxrefinetls.PdbxRefineTls) categories.computeIfAbsent("pdbx_refine_tls",
                org.rcsb.cif.model.pdbxrefinetls.PdbxRefineTls::new);
    }

    /**
     * Data items in the PDBX_REFINE_TLS_GROUP category record details about
     * a fragment of a TLS group.
     *
     * Properties of the TLS group are recorded in PDBX_REFINE_TLS
     * @return PdbxRefineTlsGroup
     */
    public org.rcsb.cif.model.pdbxrefinetlsgroup.PdbxRefineTlsGroup getPdbxRefineTlsGroup() {
        return (org.rcsb.cif.model.pdbxrefinetlsgroup.PdbxRefineTlsGroup) categories.computeIfAbsent("pdbx_refine_tls_group",
                org.rcsb.cif.model.pdbxrefinetlsgroup.PdbxRefineTlsGroup::new);
    }

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the contents of this data block.  This category atomizes
     * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
     * category.
     * @return PdbxContactAuthor
     */
    public org.rcsb.cif.model.pdbxcontactauthor.PdbxContactAuthor getPdbxContactAuthor() {
        return (org.rcsb.cif.model.pdbxcontactauthor.PdbxContactAuthor) categories.computeIfAbsent("pdbx_contact_author",
                org.rcsb.cif.model.pdbxcontactauthor.PdbxContactAuthor::new);
    }

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the Structural Genomics Project and name and initials
     * for each Center.
     * @return PdbxSGProject
     */
    public org.rcsb.cif.model.pdbxsgproject.PdbxSGProject getPdbxSGProject() {
        return (org.rcsb.cif.model.pdbxsgproject.PdbxSGProject) categories.computeIfAbsent("pdbx_SG_project",
                org.rcsb.cif.model.pdbxsgproject.PdbxSGProject::new);
    }

    /**
     * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
     * about the TLS contribution to anisotropic displacement parameters.
     * @return PdbxAtomSiteAnisoTls
     */
    public org.rcsb.cif.model.pdbxatomsiteanisotls.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls() {
        return (org.rcsb.cif.model.pdbxatomsiteanisotls.PdbxAtomSiteAnisoTls) categories.computeIfAbsent("pdbx_atom_site_aniso_tls",
                org.rcsb.cif.model.pdbxatomsiteanisotls.PdbxAtomSiteAnisoTls::new);
    }

    /**
     *
     * Experimental details of the NMR study that have not been
     * described elsewhere in this deposition.
     * @return PdbxNmrDetails
     */
    public org.rcsb.cif.model.pdbxnmrdetails.PdbxNmrDetails getPdbxNmrDetails() {
        return (org.rcsb.cif.model.pdbxnmrdetails.PdbxNmrDetails) categories.computeIfAbsent("pdbx_nmr_details",
                org.rcsb.cif.model.pdbxnmrdetails.PdbxNmrDetails::new);
    }

    /**
     *
     * Complete description of each NMR sample, including the solvent
     * system used.
     * @return PdbxNmrSampleDetails
     */
    public org.rcsb.cif.model.pdbxnmrsampledetails.PdbxNmrSampleDetails getPdbxNmrSampleDetails() {
        return (org.rcsb.cif.model.pdbxnmrsampledetails.PdbxNmrSampleDetails) categories.computeIfAbsent("pdbx_nmr_sample_details",
                org.rcsb.cif.model.pdbxnmrsampledetails.PdbxNmrSampleDetails::new);
    }

    /**
     * The chemical constituents of
     * each NMR sample. Each sample is identified by a number and
     * each component in the sample is identified by name.
     * @return PdbxNmrExptlSample
     */
    public org.rcsb.cif.model.pdbxnmrexptlsample.PdbxNmrExptlSample getPdbxNmrExptlSample() {
        return (org.rcsb.cif.model.pdbxnmrexptlsample.PdbxNmrExptlSample) categories.computeIfAbsent("pdbx_nmr_exptl_sample",
                org.rcsb.cif.model.pdbxnmrexptlsample.PdbxNmrExptlSample::new);
    }

    /**
     *
     * The experimental conditions used to for each sample.  Each set of conditions
     * is identified by a numerical code.
     * @return PdbxNmrExptlSampleConditions
     */
    public org.rcsb.cif.model.pdbxnmrexptlsampleconditions.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions() {
        return (org.rcsb.cif.model.pdbxnmrexptlsampleconditions.PdbxNmrExptlSampleConditions) categories.computeIfAbsent("pdbx_nmr_exptl_sample_conditions",
                org.rcsb.cif.model.pdbxnmrexptlsampleconditions.PdbxNmrExptlSampleConditions::new);
    }

    /**
     *
     * The details about each spectrometer used to collect data for this
     * deposition.
     * @return PdbxNmrSpectrometer
     */
    public org.rcsb.cif.model.pdbxnmrspectrometer.PdbxNmrSpectrometer getPdbxNmrSpectrometer() {
        return (org.rcsb.cif.model.pdbxnmrspectrometer.PdbxNmrSpectrometer) categories.computeIfAbsent("pdbx_nmr_spectrometer",
                org.rcsb.cif.model.pdbxnmrspectrometer.PdbxNmrSpectrometer::new);
    }

    /**
     *
     * In this section, enter information on those experiments that were
     * used to generate constraint data. For each NMR experiment indicate
     * which sample and which sample conditions were used for the experiment.
     * @return PdbxNmrExptl
     */
    public org.rcsb.cif.model.pdbxnmrexptl.PdbxNmrExptl getPdbxNmrExptl() {
        return (org.rcsb.cif.model.pdbxnmrexptl.PdbxNmrExptl) categories.computeIfAbsent("pdbx_nmr_exptl",
                org.rcsb.cif.model.pdbxnmrexptl.PdbxNmrExptl::new);
    }

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return PdbxNmrSoftware
     */
    public org.rcsb.cif.model.pdbxnmrsoftware.PdbxNmrSoftware getPdbxNmrSoftware() {
        return (org.rcsb.cif.model.pdbxnmrsoftware.PdbxNmrSoftware) categories.computeIfAbsent("pdbx_nmr_software",
                org.rcsb.cif.model.pdbxnmrsoftware.PdbxNmrSoftware::new);
    }

    /**
     * This section provides a tabulation of constraint data.
     * @return PdbxNmrConstraints
     */
    public org.rcsb.cif.model.pdbxnmrconstraints.PdbxNmrConstraints getPdbxNmrConstraints() {
        return (org.rcsb.cif.model.pdbxnmrconstraints.PdbxNmrConstraints) categories.computeIfAbsent("pdbx_nmr_constraints",
                org.rcsb.cif.model.pdbxnmrconstraints.PdbxNmrConstraints::new);
    }

    /**
     * This category contains the information that describes the
     * ensemble of deposited structures. If only an average structure
     * has been deposited skip this section.
     * @return PdbxNmrEnsemble
     */
    public org.rcsb.cif.model.pdbxnmrensemble.PdbxNmrEnsemble getPdbxNmrEnsemble() {
        return (org.rcsb.cif.model.pdbxnmrensemble.PdbxNmrEnsemble) categories.computeIfAbsent("pdbx_nmr_ensemble",
                org.rcsb.cif.model.pdbxnmrensemble.PdbxNmrEnsemble::new);
    }

    /**
     * Structural statistics are derived from molecular dynamics and simulated annealing
     * programs.
     * @return PdbxNmrEnsembleRms
     */
    public org.rcsb.cif.model.pdbxnmrensemblerms.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms() {
        return (org.rcsb.cif.model.pdbxnmrensemblerms.PdbxNmrEnsembleRms) categories.computeIfAbsent("pdbx_nmr_ensemble_rms",
                org.rcsb.cif.model.pdbxnmrensemblerms.PdbxNmrEnsembleRms::new);
    }

    /**
     * An average structure is often calculated in addition to the ensemble, or one
     * of the ensemble is selected as a representative structure. This section
     * describes selection of the representative structure.
     * @return PdbxNmrRepresentative
     */
    public org.rcsb.cif.model.pdbxnmrrepresentative.PdbxNmrRepresentative getPdbxNmrRepresentative() {
        return (org.rcsb.cif.model.pdbxnmrrepresentative.PdbxNmrRepresentative) categories.computeIfAbsent("pdbx_nmr_representative",
                org.rcsb.cif.model.pdbxnmrrepresentative.PdbxNmrRepresentative::new);
    }

    /**
     *
     * Describe the method and details of the refinement of the deposited structure.
     * @return PdbxNmrRefine
     */
    public org.rcsb.cif.model.pdbxnmrrefine.PdbxNmrRefine getPdbxNmrRefine() {
        return (org.rcsb.cif.model.pdbxnmrrefine.PdbxNmrRefine) categories.computeIfAbsent("pdbx_nmr_refine",
                org.rcsb.cif.model.pdbxnmrrefine.PdbxNmrRefine::new);
    }

    /**
     *
     * The final force constants, including units, employed for the various
     * experimental constraints, covalent geometry constraints, and the non-bonded
     * interaction terms in the target function used for simulated annealing.
     * @return PdbxNmrForceConstants
     */
    public org.rcsb.cif.model.pdbxnmrforceconstants.PdbxNmrForceConstants getPdbxNmrForceConstants() {
        return (org.rcsb.cif.model.pdbxnmrforceconstants.PdbxNmrForceConstants) categories.computeIfAbsent("pdbx_nmr_force_constants",
                org.rcsb.cif.model.pdbxnmrforceconstants.PdbxNmrForceConstants::new);
    }

    /**
     * Data items in the NDB_STRUCT_CONF_NA category
     * describes secondary structure features in this entry.
     * @return NdbStructConfNa
     */
    public org.rcsb.cif.model.ndbstructconfna.NdbStructConfNa getNdbStructConfNa() {
        return (org.rcsb.cif.model.ndbstructconfna.NdbStructConfNa) categories.computeIfAbsent("ndb_struct_conf_na",
                org.rcsb.cif.model.ndbstructconfna.NdbStructConfNa::new);
    }

    /**
     * Data items in the NDB_STRUCT_FEATURE_NA category
     * describes tertiary and other special structural
     * features in this entry.
     * @return NdbStructFeatureNa
     */
    public org.rcsb.cif.model.ndbstructfeaturena.NdbStructFeatureNa getNdbStructFeatureNa() {
        return (org.rcsb.cif.model.ndbstructfeaturena.NdbStructFeatureNa) categories.computeIfAbsent("ndb_struct_feature_na",
                org.rcsb.cif.model.ndbstructfeaturena.NdbStructFeatureNa::new);
    }

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
     * of base pairing interactions.
     * @return NdbStructNaBasePair
     */
    public org.rcsb.cif.model.ndbstructnabasepair.NdbStructNaBasePair getNdbStructNaBasePair() {
        return (org.rcsb.cif.model.ndbstructnabasepair.NdbStructNaBasePair) categories.computeIfAbsent("ndb_struct_na_base_pair",
                org.rcsb.cif.model.ndbstructnabasepair.NdbStructNaBasePair::new);
    }

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
     * of base pair step interactions.
     * @return NdbStructNaBasePairStep
     */
    public org.rcsb.cif.model.ndbstructnabasepairstep.NdbStructNaBasePairStep getNdbStructNaBasePairStep() {
        return (org.rcsb.cif.model.ndbstructnabasepairstep.NdbStructNaBasePairStep) categories.computeIfAbsent("ndb_struct_na_base_pair_step",
                org.rcsb.cif.model.ndbstructnabasepairstep.NdbStructNaBasePairStep::new);
    }

    /**
     * Placeholder category for PDB coordinate data.
     * @return NdbOriginalNdbCoordinates
     */
    public org.rcsb.cif.model.ndboriginalndbcoordinates.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates() {
        return (org.rcsb.cif.model.ndboriginalndbcoordinates.NdbOriginalNdbCoordinates) categories.computeIfAbsent("ndb_original_ndb_coordinates",
                org.rcsb.cif.model.ndboriginalndbcoordinates.NdbOriginalNdbCoordinates::new);
    }

    /**

     * @return PdbxEntityNonpoly
     */
    public org.rcsb.cif.model.pdbxentitynonpoly.PdbxEntityNonpoly getPdbxEntityNonpoly() {
        return (org.rcsb.cif.model.pdbxentitynonpoly.PdbxEntityNonpoly) categories.computeIfAbsent("pdbx_entity_nonpoly",
                org.rcsb.cif.model.pdbxentitynonpoly.PdbxEntityNonpoly::new);
    }

    /**
     * Data items in the PDBX_PHASING_DM category record details about
     * density modification
     * @return PdbxPhasingDm
     */
    public org.rcsb.cif.model.pdbxphasingdm.PdbxPhasingDm getPdbxPhasingDm() {
        return (org.rcsb.cif.model.pdbxphasingdm.PdbxPhasingDm) categories.computeIfAbsent("pdbx_phasing_dm",
                org.rcsb.cif.model.pdbxphasingdm.PdbxPhasingDm::new);
    }

    /**
     * Data items in the PDBX_PHASING_DM_SHELL category record details about
     * density modification in resolution shell.
     * @return PdbxPhasingDmShell
     */
    public org.rcsb.cif.model.pdbxphasingdmshell.PdbxPhasingDmShell getPdbxPhasingDmShell() {
        return (org.rcsb.cif.model.pdbxphasingdmshell.PdbxPhasingDmShell) categories.computeIfAbsent("pdbx_phasing_dm_shell",
                org.rcsb.cif.model.pdbxphasingdmshell.PdbxPhasingDmShell::new);
    }

    /**
     * Data items in the PDBX_PHASING_MAD_SHELL category record details about
     * the phasing of the structure, when methods involving multiple
     * anomalous dispersion techniques are involved (note: the
     * values are overall, but broken down into shells of resolution)
     * @return PdbxPhasingMADShell
     */
    public org.rcsb.cif.model.pdbxphasingmadshell.PdbxPhasingMADShell getPdbxPhasingMADShell() {
        return (org.rcsb.cif.model.pdbxphasingmadshell.PdbxPhasingMADShell) categories.computeIfAbsent("pdbx_phasing_MAD_shell",
                org.rcsb.cif.model.pdbxphasingmadshell.PdbxPhasingMADShell::new);
    }

    /**
     * Record details about each phasing set: (Note: the phasing
     * set is different from data set. for example: if there are
     * three data sets, the inflection point (IP), the peak (PK)
     * and the high remote (HR), the combination of the phasing
     * set will be IP_iso, PK_iso (the isomorphous repleacement
     * with HR as 'native'), IP_ano, PK_ano and HR_ano (the
     * anomalous difference with itself). Therefore, there are
     * five set used for phasing.
     * @return PdbxPhasingMADSet
     */
    public org.rcsb.cif.model.pdbxphasingmadset.PdbxPhasingMADSet getPdbxPhasingMADSet() {
        return (org.rcsb.cif.model.pdbxphasingmadset.PdbxPhasingMADSet) categories.computeIfAbsent("pdbx_phasing_MAD_set",
                org.rcsb.cif.model.pdbxphasingmadset.PdbxPhasingMADSet::new);
    }

    /**
     * The same as category pdbx_phasing_MAD_set, but
     * broken into shells.
     * @return PdbxPhasingMADSetShell
     */
    public org.rcsb.cif.model.pdbxphasingmadsetshell.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell() {
        return (org.rcsb.cif.model.pdbxphasingmadsetshell.PdbxPhasingMADSetShell) categories.computeIfAbsent("pdbx_phasing_MAD_set_shell",
                org.rcsb.cif.model.pdbxphasingmadsetshell.PdbxPhasingMADSetShell::new);
    }

    /**
     * record the details (coordinates etc.) of anomalous scatters.
     * @return PdbxPhasingMADSetSite
     */
    public org.rcsb.cif.model.pdbxphasingmadsetsite.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite() {
        return (org.rcsb.cif.model.pdbxphasingmadsetsite.PdbxPhasingMADSetSite) categories.computeIfAbsent("pdbx_phasing_MAD_set_site",
                org.rcsb.cif.model.pdbxphasingmadsetsite.PdbxPhasingMADSetSite::new);
    }

    /**
     * Data items in the PDBX_PHASING_MR category record details about
     * molecular replacement.
     * @return PdbxPhasingMR
     */
    public org.rcsb.cif.model.pdbxphasingmr.PdbxPhasingMR getPdbxPhasingMR() {
        return (org.rcsb.cif.model.pdbxphasingmr.PdbxPhasingMR) categories.computeIfAbsent("pdbx_phasing_MR",
                org.rcsb.cif.model.pdbxphasingmr.PdbxPhasingMR::new);
    }

    /**
     * Data items in the PDBX_REFINE_COMPONENT category record
     * statistics of the final model relative to the density map.
     * @return PdbxRefineComponent
     */
    public org.rcsb.cif.model.pdbxrefinecomponent.PdbxRefineComponent getPdbxRefineComponent() {
        return (org.rcsb.cif.model.pdbxrefinecomponent.PdbxRefineComponent) categories.computeIfAbsent("pdbx_refine_component",
                org.rcsb.cif.model.pdbxrefinecomponent.PdbxRefineComponent::new);
    }

    /**
     * This category contains descriptive protocols for the production
     * of this entity.
     * @return PdbxEntityProdProtocol
     */
    public org.rcsb.cif.model.pdbxentityprodprotocol.PdbxEntityProdProtocol getPdbxEntityProdProtocol() {
        return (org.rcsb.cif.model.pdbxentityprodprotocol.PdbxEntityProdProtocol) categories.computeIfAbsent("pdbx_entity_prod_protocol",
                org.rcsb.cif.model.pdbxentityprodprotocol.PdbxEntityProdProtocol::new);
    }

    /**
     * This category contains details for process steps that are
     * not explicitly catered for elsewhere. It provides some basic
     * details as well as placeholders for a list of parameters and
     * values (the category PDBX_ENTITY_SRC_GEN_PROD_OTHER_PARAMETER).
     * Note that processes that have been modelled explicitly should
     * not be represented using this category.
     * @return PdbxEntitySrcGenProdOther
     */
    public org.rcsb.cif.model.pdbxentitysrcgenprodother.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther() {
        return (org.rcsb.cif.model.pdbxentitysrcgenprodother.PdbxEntitySrcGenProdOther) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other",
                org.rcsb.cif.model.pdbxentitysrcgenprodother.PdbxEntitySrcGenProdOther::new);
    }

    /**
     * This category contains parameters and values required to capture
     * information about a particular process step
     * @return PdbxEntitySrcGenProdOtherParameter
     */
    public org.rcsb.cif.model.pdbxentitysrcgenprodotherparameter.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter() {
        return (org.rcsb.cif.model.pdbxentitysrcgenprodotherparameter.PdbxEntitySrcGenProdOtherParameter) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other_parameter",
                org.rcsb.cif.model.pdbxentitysrcgenprodotherparameter.PdbxEntitySrcGenProdOtherParameter::new);
    }

    /**
     * This category contains details for the PCR steps used in
     * the overall protein production process. The PCR is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdPcr
     */
    public org.rcsb.cif.model.pdbxentitysrcgenprodpcr.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr() {
        return (org.rcsb.cif.model.pdbxentitysrcgenprodpcr.PdbxEntitySrcGenProdPcr) categories.computeIfAbsent("pdbx_entity_src_gen_prod_pcr",
                org.rcsb.cif.model.pdbxentitysrcgenprodpcr.PdbxEntitySrcGenProdPcr::new);
    }

    /**
     * This category contains details for the DIGEST steps used in
     * the overall protein production process. The digestion is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdDigest
     */
    public org.rcsb.cif.model.pdbxentitysrcgenproddigest.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest() {
        return (org.rcsb.cif.model.pdbxentitysrcgenproddigest.PdbxEntitySrcGenProdDigest) categories.computeIfAbsent("pdbx_entity_src_gen_prod_digest",
                org.rcsb.cif.model.pdbxentitysrcgenproddigest.PdbxEntitySrcGenProdDigest::new);
    }

    /**
     * This category contains details for the cloning steps used in
     * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
     * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
     * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
     * provided data in the later two categories may be omitted.
     * @return PdbxEntitySrcGenClone
     */
    public org.rcsb.cif.model.pdbxentitysrcgenclone.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone() {
        return (org.rcsb.cif.model.pdbxentitysrcgenclone.PdbxEntitySrcGenClone) categories.computeIfAbsent("pdbx_entity_src_gen_clone",
                org.rcsb.cif.model.pdbxentitysrcgenclone.PdbxEntitySrcGenClone::new);
    }

    /**
     * This category contains details for the ligation-based cloning steps used in
     * the overall protein production process.
     * _pdbx_entity_src_gen_clone_ligation.clone_step_id in this category
     * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
     * to cover ligation dependent cloning steps.
     * @return PdbxEntitySrcGenCloneLigation
     */
    public org.rcsb.cif.model.pdbxentitysrcgencloneligation.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation() {
        return (org.rcsb.cif.model.pdbxentitysrcgencloneligation.PdbxEntitySrcGenCloneLigation) categories.computeIfAbsent("pdbx_entity_src_gen_clone_ligation",
                org.rcsb.cif.model.pdbxentitysrcgencloneligation.PdbxEntitySrcGenCloneLigation::new);
    }

    /**
     * This category contains details for the recombination-based cloning steps
     * used in the overall protein production process. It is assumed that these
     * reactions will use commercially available kits.
     * _pdbx_entity_src_gen_clone_recombination.clone_step_id in this category
     * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
     * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
     * to cover recombination dependent cloning steps.
     * @return PdbxEntitySrcGenCloneRecombination
     */
    public org.rcsb.cif.model.pdbxentitysrcgenclonerecombination.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination() {
        return (org.rcsb.cif.model.pdbxentitysrcgenclonerecombination.PdbxEntitySrcGenCloneRecombination) categories.computeIfAbsent("pdbx_entity_src_gen_clone_recombination",
                org.rcsb.cif.model.pdbxentitysrcgenclonerecombination.PdbxEntitySrcGenCloneRecombination::new);
    }

    /**
     * This category contains details for the EXPRESSION steps used in
     * the overall protein production process. It is hoped that this category
     * will cover all forms of cell-based expression by reading induction as
     * induction/transformation/transfection.
     * @return PdbxEntitySrcGenExpress
     */
    public org.rcsb.cif.model.pdbxentitysrcgenexpress.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress() {
        return (org.rcsb.cif.model.pdbxentitysrcgenexpress.PdbxEntitySrcGenExpress) categories.computeIfAbsent("pdbx_entity_src_gen_express",
                org.rcsb.cif.model.pdbxentitysrcgenexpress.PdbxEntitySrcGenExpress::new);
    }

    /**
     * This category contains details for OD time series used to monitor a
     * given EXPRESSION step used in the overall protein production process.
     * @return PdbxEntitySrcGenExpressTimepoint
     */
    public org.rcsb.cif.model.pdbxentitysrcgenexpresstimepoint.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint() {
        return (org.rcsb.cif.model.pdbxentitysrcgenexpresstimepoint.PdbxEntitySrcGenExpressTimepoint) categories.computeIfAbsent("pdbx_entity_src_gen_express_timepoint",
                org.rcsb.cif.model.pdbxentitysrcgenexpresstimepoint.PdbxEntitySrcGenExpressTimepoint::new);
    }

    /**
     * This category contains details for the cell lysis steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenLysis
     */
    public org.rcsb.cif.model.pdbxentitysrcgenlysis.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis() {
        return (org.rcsb.cif.model.pdbxentitysrcgenlysis.PdbxEntitySrcGenLysis) categories.computeIfAbsent("pdbx_entity_src_gen_lysis",
                org.rcsb.cif.model.pdbxentitysrcgenlysis.PdbxEntitySrcGenLysis::new);
    }

    /**
     * This category contains details for the refolding steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenRefold
     */
    public org.rcsb.cif.model.pdbxentitysrcgenrefold.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold() {
        return (org.rcsb.cif.model.pdbxentitysrcgenrefold.PdbxEntitySrcGenRefold) categories.computeIfAbsent("pdbx_entity_src_gen_refold",
                org.rcsb.cif.model.pdbxentitysrcgenrefold.PdbxEntitySrcGenRefold::new);
    }

    /**
     * This category contains details for the protein purification
     * tag removal steps used in the overall protein production process
     * @return PdbxEntitySrcGenProteolysis
     */
    public org.rcsb.cif.model.pdbxentitysrcgenproteolysis.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis() {
        return (org.rcsb.cif.model.pdbxentitysrcgenproteolysis.PdbxEntitySrcGenProteolysis) categories.computeIfAbsent("pdbx_entity_src_gen_proteolysis",
                org.rcsb.cif.model.pdbxentitysrcgenproteolysis.PdbxEntitySrcGenProteolysis::new);
    }

    /**
     * This category contains details for the chromatographic steps used in the
     * purification of the protein.
     * @return PdbxEntitySrcGenChrom
     */
    public org.rcsb.cif.model.pdbxentitysrcgenchrom.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom() {
        return (org.rcsb.cif.model.pdbxentitysrcgenchrom.PdbxEntitySrcGenChrom) categories.computeIfAbsent("pdbx_entity_src_gen_chrom",
                org.rcsb.cif.model.pdbxentitysrcgenchrom.PdbxEntitySrcGenChrom::new);
    }

    /**
     * This category contains details for the fraction steps used in
     * the overall protein production process. Examples of fractionation
     * steps are centrifugation and magnetic bead pull-down purification.
     * @return PdbxEntitySrcGenFract
     */
    public org.rcsb.cif.model.pdbxentitysrcgenfract.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract() {
        return (org.rcsb.cif.model.pdbxentitysrcgenfract.PdbxEntitySrcGenFract) categories.computeIfAbsent("pdbx_entity_src_gen_fract",
                org.rcsb.cif.model.pdbxentitysrcgenfract.PdbxEntitySrcGenFract::new);
    }

    /**
     * This category contains details for the final purified protein product. Note
     * that this category does not contain the amino acid sequence of the protein.
     * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
     * entity_id.
     * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
     * no step_id for this category.
     * @return PdbxEntitySrcGenPure
     */
    public org.rcsb.cif.model.pdbxentitysrcgenpure.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure() {
        return (org.rcsb.cif.model.pdbxentitysrcgenpure.PdbxEntitySrcGenPure) categories.computeIfAbsent("pdbx_entity_src_gen_pure",
                org.rcsb.cif.model.pdbxentitysrcgenpure.PdbxEntitySrcGenPure::new);
    }

    /**
     * This category contains details of protein characterisation. It
     * refers to the characteristion of the product of a specific
     * step.
     * @return PdbxEntitySrcGenCharacter
     */
    public org.rcsb.cif.model.pdbxentitysrcgencharacter.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter() {
        return (org.rcsb.cif.model.pdbxentitysrcgencharacter.PdbxEntitySrcGenCharacter) categories.computeIfAbsent("pdbx_entity_src_gen_character",
                org.rcsb.cif.model.pdbxentitysrcgencharacter.PdbxEntitySrcGenCharacter::new);
    }

    /**
     * Data items in the PDBX_CONSTRUCT category specify a sequence of
     * nucleic acids or amino acids. It is a catch-all that may be used to
     * provide details of sequences known to be relevant to the project as well
     * as primers, plasmids, proteins and such like that are either used or
     * produced during the protein production process. Molecules described
     * here are not necessarily complete, so for instance it would be
     * possible to include either a complete plasmid or just its insert.
     * This category may be considered as an abbreviated form of _entity where
     * the molecules described are not required to appear in the final co-ordinates.
     *
     * Note that the details provided here all pertain to a single entry as defined
     * at deposition. It is anticipated that _pdbx_construct.id would also be
     * composed of a sequence that is unique within a given site prefixed by a code
     * that identifies that site and would, therefore, be GLOBALLY unique. Thus
     * this category could also be used locally to store details about the different
     * constructs used during protein production without reference to the entry_id
     * (which only becomes a  meaningful concept during deposition).
     * @return PdbxConstruct
     */
    public org.rcsb.cif.model.pdbxconstruct.PdbxConstruct getPdbxConstruct() {
        return (org.rcsb.cif.model.pdbxconstruct.PdbxConstruct) categories.computeIfAbsent("pdbx_construct",
                org.rcsb.cif.model.pdbxconstruct.PdbxConstruct::new);
    }

    /**
     * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
     * specify various properties of a nucleic acid sequence used during
     * protein production.
     * @return PdbxConstructFeature
     */
    public org.rcsb.cif.model.pdbxconstructfeature.PdbxConstructFeature getPdbxConstructFeature() {
        return (org.rcsb.cif.model.pdbxconstructfeature.PdbxConstructFeature) categories.computeIfAbsent("pdbx_construct_feature",
                org.rcsb.cif.model.pdbxconstructfeature.PdbxConstructFeature::new);
    }

    /**
     * The details about each robotic system used to collect data for this
     * project.
     * @return PdbxRobotSystem
     */
    public org.rcsb.cif.model.pdbxrobotsystem.PdbxRobotSystem getPdbxRobotSystem() {
        return (org.rcsb.cif.model.pdbxrobotsystem.PdbxRobotSystem) categories.computeIfAbsent("pdbx_robot_system",
                org.rcsb.cif.model.pdbxrobotsystem.PdbxRobotSystem::new);
    }

    /**
     * Data items in the PDBX_BUFFER category
     * record details of the sample buffer.
     * @return PdbxBuffer
     */
    public org.rcsb.cif.model.pdbxbuffer.PdbxBuffer getPdbxBuffer() {
        return (org.rcsb.cif.model.pdbxbuffer.PdbxBuffer) categories.computeIfAbsent("pdbx_buffer",
                org.rcsb.cif.model.pdbxbuffer.PdbxBuffer::new);
    }

    /**
     * Constituents of buffer in sample
     * @return PdbxBufferComponents
     */
    public org.rcsb.cif.model.pdbxbuffercomponents.PdbxBufferComponents getPdbxBufferComponents() {
        return (org.rcsb.cif.model.pdbxbuffercomponents.PdbxBufferComponents) categories.computeIfAbsent("pdbx_buffer_components",
                org.rcsb.cif.model.pdbxbuffercomponents.PdbxBufferComponents::new);
    }

    /**
     * Data items in the PDBX_DOMAIN category record information
     * about domain definitions.
     *
     * A domain need not correspond to a completely polypeptide chain;
     * it can be composed of one or more segments in a single chain,
     * or by segments from more than one chain.
     * @return PdbxDomain
     */
    public org.rcsb.cif.model.pdbxdomain.PdbxDomain getPdbxDomain() {
        return (org.rcsb.cif.model.pdbxdomain.PdbxDomain) categories.computeIfAbsent("pdbx_domain",
                org.rcsb.cif.model.pdbxdomain.PdbxDomain::new);
    }

    /**
     * Data items in the PDBX_DOMAIN_RANGE category identify the
     * beginning and ending points of polypeptide chain segments
     * that form all or part of a domain.
     * @return PdbxDomainRange
     */
    public org.rcsb.cif.model.pdbxdomainrange.PdbxDomainRange getPdbxDomainRange() {
        return (org.rcsb.cif.model.pdbxdomainrange.PdbxDomainRange) categories.computeIfAbsent("pdbx_domain_range",
                org.rcsb.cif.model.pdbxdomainrange.PdbxDomainRange::new);
    }

    /**
     * Data items in the PDBX_SEQUENCE_RANGE category identify the
     * beginning and ending points of polypeptide sequence segments.
     * @return PdbxSequenceRange
     */
    public org.rcsb.cif.model.pdbxsequencerange.PdbxSequenceRange getPdbxSequenceRange() {
        return (org.rcsb.cif.model.pdbxsequencerange.PdbxSequenceRange) categories.computeIfAbsent("pdbx_sequence_range",
                org.rcsb.cif.model.pdbxsequencerange.PdbxSequenceRange::new);
    }

    /**
     * Data items in the PDBX_FEATURE_ENTRY category records
     * information about properties pertaining to this
     * structure entry.
     * @return PdbxFeatureEntry
     */
    public org.rcsb.cif.model.pdbxfeatureentry.PdbxFeatureEntry getPdbxFeatureEntry() {
        return (org.rcsb.cif.model.pdbxfeatureentry.PdbxFeatureEntry) categories.computeIfAbsent("pdbx_feature_entry",
                org.rcsb.cif.model.pdbxfeatureentry.PdbxFeatureEntry::new);
    }

    /**
     * Data items in the PDBX_FEATURE_DOMAIN category records
     * information about properties pertaining to this structure
     * domain.
     * @return PdbxFeatureDomain
     */
    public org.rcsb.cif.model.pdbxfeaturedomain.PdbxFeatureDomain getPdbxFeatureDomain() {
        return (org.rcsb.cif.model.pdbxfeaturedomain.PdbxFeatureDomain) categories.computeIfAbsent("pdbx_feature_domain",
                org.rcsb.cif.model.pdbxfeaturedomain.PdbxFeatureDomain::new);
    }

    /**
     * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category
     * records information about properties pertaining to
     * this structure sequence_range.
     * @return PdbxFeatureSequenceRange
     */
    public org.rcsb.cif.model.pdbxfeaturesequencerange.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange() {
        return (org.rcsb.cif.model.pdbxfeaturesequencerange.PdbxFeatureSequenceRange) categories.computeIfAbsent("pdbx_feature_sequence_range",
                org.rcsb.cif.model.pdbxfeaturesequencerange.PdbxFeatureSequenceRange::new);
    }

    /**
     * Data items in the PDBX_FEATURE_ASSEMBLY category records
     * information about properties pertaining to this
     * structural assembly.
     * @return PdbxFeatureAssembly
     */
    public org.rcsb.cif.model.pdbxfeatureassembly.PdbxFeatureAssembly getPdbxFeatureAssembly() {
        return (org.rcsb.cif.model.pdbxfeatureassembly.PdbxFeatureAssembly) categories.computeIfAbsent("pdbx_feature_assembly",
                org.rcsb.cif.model.pdbxfeatureassembly.PdbxFeatureAssembly::new);
    }

    /**
     * Data items in the PDBX_FEATURE_MONOMER category records
     * information about properties pertaining to particular
     * monomers in this structure.
     * @return PdbxFeatureMonomer
     */
    public org.rcsb.cif.model.pdbxfeaturemonomer.PdbxFeatureMonomer getPdbxFeatureMonomer() {
        return (org.rcsb.cif.model.pdbxfeaturemonomer.PdbxFeatureMonomer) categories.computeIfAbsent("pdbx_feature_monomer",
                org.rcsb.cif.model.pdbxfeaturemonomer.PdbxFeatureMonomer::new);
    }

    /**
     * Data items in the pdbx_exptl_pd record information about
     * powder sample preparations.
     * @return PdbxExptlPd
     */
    public org.rcsb.cif.model.pdbxexptlpd.PdbxExptlPd getPdbxExptlPd() {
        return (org.rcsb.cif.model.pdbxexptlpd.PdbxExptlPd) categories.computeIfAbsent("pdbx_exptl_pd",
                org.rcsb.cif.model.pdbxexptlpd.PdbxExptlPd::new);
    }

    /**
     * Details decribing crystallographic twinning.
     * @return PdbxReflnsTwin
     */
    public org.rcsb.cif.model.pdbxreflnstwin.PdbxReflnsTwin getPdbxReflnsTwin() {
        return (org.rcsb.cif.model.pdbxreflnstwin.PdbxReflnsTwin) categories.computeIfAbsent("pdbx_reflns_twin",
                org.rcsb.cif.model.pdbxreflnstwin.PdbxReflnsTwin::new);
    }

    /**
     * Special features of this structural entry.
     * @return PdbxStructInfo
     */
    public org.rcsb.cif.model.pdbxstructinfo.PdbxStructInfo getPdbxStructInfo() {
        return (org.rcsb.cif.model.pdbxstructinfo.PdbxStructInfo) categories.computeIfAbsent("pdbx_struct_info",
                org.rcsb.cif.model.pdbxstructinfo.PdbxStructInfo::new);
    }

    /**
     * Describes the origin of the experimental data used in this
     * entry.
     * @return PdbxReRefinement
     */
    public org.rcsb.cif.model.pdbxrerefinement.PdbxReRefinement getPdbxReRefinement() {
        return (org.rcsb.cif.model.pdbxrerefinement.PdbxReRefinement) categories.computeIfAbsent("pdbx_re_refinement",
                org.rcsb.cif.model.pdbxrerefinement.PdbxReRefinement::new);
    }

    /**
     * Properties and features of structural assemblies.
     * @return PdbxStructAssemblyProp
     */
    public org.rcsb.cif.model.pdbxstructassemblyprop.PdbxStructAssemblyProp getPdbxStructAssemblyProp() {
        return (org.rcsb.cif.model.pdbxstructassemblyprop.PdbxStructAssemblyProp) categories.computeIfAbsent("pdbx_struct_assembly_prop",
                org.rcsb.cif.model.pdbxstructassemblyprop.PdbxStructAssemblyProp::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
     * mechanism for identifying and annotating sequence features.
     * @return PdbxStructRefSeqFeature
     */
    public org.rcsb.cif.model.pdbxstructrefseqfeature.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature() {
        return (org.rcsb.cif.model.pdbxstructrefseqfeature.PdbxStructRefSeqFeature) categories.computeIfAbsent("pdbx_struct_ref_seq_feature",
                org.rcsb.cif.model.pdbxstructrefseqfeature.PdbxStructRefSeqFeature::new);
    }

    /**
     *
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
     * mechanism for identifying and annotating properties of sequence features.
     * @return PdbxStructRefSeqFeatureProp
     */
    public org.rcsb.cif.model.pdbxstructrefseqfeatureprop.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp() {
        return (org.rcsb.cif.model.pdbxstructrefseqfeatureprop.PdbxStructRefSeqFeatureProp) categories.computeIfAbsent("pdbx_struct_ref_seq_feature_prop",
                org.rcsb.cif.model.pdbxstructrefseqfeatureprop.PdbxStructRefSeqFeatureProp::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
     * structural diagnostics in chemical components instances.
     * @return PdbxStructChemCompDiagnostics
     */
    public org.rcsb.cif.model.pdbxstructchemcompdiagnostics.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics() {
        return (org.rcsb.cif.model.pdbxstructchemcompdiagnostics.PdbxStructChemCompDiagnostics) categories.computeIfAbsent("pdbx_struct_chem_comp_diagnostics",
                org.rcsb.cif.model.pdbxstructchemcompdiagnostics.PdbxStructChemCompDiagnostics::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompFeature
     */
    public org.rcsb.cif.model.pdbxchemcompfeature.PdbxChemCompFeature getPdbxChemCompFeature() {
        return (org.rcsb.cif.model.pdbxchemcompfeature.PdbxChemCompFeature) categories.computeIfAbsent("pdbx_chem_comp_feature",
                org.rcsb.cif.model.pdbxchemcompfeature.PdbxChemCompFeature::new);
    }

    /**
     * The details of the composition of the coordinate model.
     * @return PdbxCoordinateModel
     */
    public org.rcsb.cif.model.pdbxcoordinatemodel.PdbxCoordinateModel getPdbxCoordinateModel() {
        return (org.rcsb.cif.model.pdbxcoordinatemodel.PdbxCoordinateModel) categories.computeIfAbsent("pdbx_coordinate_model",
                org.rcsb.cif.model.pdbxcoordinatemodel.PdbxCoordinateModel::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_FEATURE category provides
     * structural annotations in chemical components instances.
     * @return PdbxStructChemCompFeature
     */
    public org.rcsb.cif.model.pdbxstructchemcompfeature.PdbxStructChemCompFeature getPdbxStructChemCompFeature() {
        return (org.rcsb.cif.model.pdbxstructchemcompfeature.PdbxStructChemCompFeature) categories.computeIfAbsent("pdbx_struct_chem_comp_feature",
                org.rcsb.cif.model.pdbxstructchemcompfeature.PdbxStructChemCompFeature::new);
    }

    /**
     * Data items in the DIFFRN_REFLNS_SHELL category record details about
     * the reflection data set within shells of resolution.
     * @return PdbxDiffrnReflnsShell
     */
    public org.rcsb.cif.model.pdbxdiffrnreflnsshell.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell() {
        return (org.rcsb.cif.model.pdbxdiffrnreflnsshell.PdbxDiffrnReflnsShell) categories.computeIfAbsent("pdbx_diffrn_reflns_shell",
                org.rcsb.cif.model.pdbxdiffrnreflnsshell.PdbxDiffrnReflnsShell::new);
    }

    /**
     * This category provides a table of upper and lower distance
     * limits used as criteria in determining covalent bonds.
     * The table is organized by atom type pairs.
     * @return PdbxBondDistanceLimits
     */
    public org.rcsb.cif.model.pdbxbonddistancelimits.PdbxBondDistanceLimits getPdbxBondDistanceLimits() {
        return (org.rcsb.cif.model.pdbxbonddistancelimits.PdbxBondDistanceLimits) categories.computeIfAbsent("pdbx_bond_distance_limits",
                org.rcsb.cif.model.pdbxbonddistancelimits.PdbxBondDistanceLimits::new);
    }

    /**
     * Data items in the PDBX_SOLN_SCATTER category record details about a
     * solution scattering experiment
     * @return PdbxSolnScatter
     */
    public org.rcsb.cif.model.pdbxsolnscatter.PdbxSolnScatter getPdbxSolnScatter() {
        return (org.rcsb.cif.model.pdbxsolnscatter.PdbxSolnScatter) categories.computeIfAbsent("pdbx_soln_scatter",
                org.rcsb.cif.model.pdbxsolnscatter.PdbxSolnScatter::new);
    }

    /**
     * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
     * homology model fitting to the solution scatter data.
     * @return PdbxSolnScatterModel
     */
    public org.rcsb.cif.model.pdbxsolnscattermodel.PdbxSolnScatterModel getPdbxSolnScatterModel() {
        return (org.rcsb.cif.model.pdbxsolnscattermodel.PdbxSolnScatterModel) categories.computeIfAbsent("pdbx_soln_scatter_model",
                org.rcsb.cif.model.pdbxsolnscattermodel.PdbxSolnScatterModel::new);
    }

    /**
     * Data items in the CHEM_COMP_DESCRIPTOR category provide
     * string descriptors of component chemical structure.
     * @return PdbxChemCompDescriptor
     */
    public org.rcsb.cif.model.pdbxchemcompdescriptor.PdbxChemCompDescriptor getPdbxChemCompDescriptor() {
        return (org.rcsb.cif.model.pdbxchemcompdescriptor.PdbxChemCompDescriptor) categories.computeIfAbsent("pdbx_chem_comp_descriptor",
                org.rcsb.cif.model.pdbxchemcompdescriptor.PdbxChemCompDescriptor::new);
    }

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    public org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return (org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier) categories.computeIfAbsent("pdbx_chem_comp_identifier",
                org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_IMPORT category identify
     * existing chemical components to be imported into the
     * current component definition.  Components in this list
     * can be edited by instructions in categories
     * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
     * @return PdbxChemCompImport
     */
    public org.rcsb.cif.model.pdbxchemcompimport.PdbxChemCompImport getPdbxChemCompImport() {
        return (org.rcsb.cif.model.pdbxchemcompimport.PdbxChemCompImport) categories.computeIfAbsent("pdbx_chem_comp_import",
                org.rcsb.cif.model.pdbxchemcompimport.PdbxChemCompImport::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
     * atom level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompAtomEdit
     */
    public org.rcsb.cif.model.pdbxchemcompatomedit.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit() {
        return (org.rcsb.cif.model.pdbxchemcompatomedit.PdbxChemCompAtomEdit) categories.computeIfAbsent("pdbx_chem_comp_atom_edit",
                org.rcsb.cif.model.pdbxchemcompatomedit.PdbxChemCompAtomEdit::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
     * bond level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompBondEdit
     */
    public org.rcsb.cif.model.pdbxchemcompbondedit.PdbxChemCompBondEdit getPdbxChemCompBondEdit() {
        return (org.rcsb.cif.model.pdbxchemcompbondedit.PdbxChemCompBondEdit) categories.computeIfAbsent("pdbx_chem_comp_bond_edit",
                org.rcsb.cif.model.pdbxchemcompbondedit.PdbxChemCompBondEdit::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_AUDIT category records
     * the status and tracking information for this component.
     * @return PdbxChemCompAudit
     */
    public org.rcsb.cif.model.pdbxchemcompaudit.PdbxChemCompAudit getPdbxChemCompAudit() {
        return (org.rcsb.cif.model.pdbxchemcompaudit.PdbxChemCompAudit) categories.computeIfAbsent("pdbx_chem_comp_audit",
                org.rcsb.cif.model.pdbxchemcompaudit.PdbxChemCompAudit::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_CLOSE_CONTACT category list the
     * atoms within the entry that are in close contact with regard
     * the distances expected from either covalent bonding or closest
     * approach by van der Waals contacts. Contacts within
     * the asymmetric unit are considered.
     *
     * For those contacts not involving hydrogen a limit of
     * 2.2 Angstroms is used. For contacts involving a hydrogen atom
     * a cutoff of 1.6 Angstroms is used.
     * @return PdbxValidateCloseContact
     */
    public org.rcsb.cif.model.pdbxvalidateclosecontact.PdbxValidateCloseContact getPdbxValidateCloseContact() {
        return (org.rcsb.cif.model.pdbxvalidateclosecontact.PdbxValidateCloseContact) categories.computeIfAbsent("pdbx_validate_close_contact",
                org.rcsb.cif.model.pdbxvalidateclosecontact.PdbxValidateCloseContact::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_SYMM_CONTACT category list the
     * atoms within the entry that are in close contact with regard
     * the distances expected from either covalent bonding or closest
     * approach by van der Waals contacts. Contacts with
     * for symmetry related contacts are considered.
     * For those contacts not involving hydrogen a limit of
     * 2.2 Angstroms is used. For contacts involving a hydrogen atom
     * a cutoff of 1.6Angstrom is used.
     * @return PdbxValidateSymmContact
     */
    public org.rcsb.cif.model.pdbxvalidatesymmcontact.PdbxValidateSymmContact getPdbxValidateSymmContact() {
        return (org.rcsb.cif.model.pdbxvalidatesymmcontact.PdbxValidateSymmContact) categories.computeIfAbsent("pdbx_validate_symm_contact",
                org.rcsb.cif.model.pdbxvalidatesymmcontact.PdbxValidateSymmContact::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_RMSD_BOND category list the
     * covalent bonds that have values which deviate from expected
     * values by more than 6*rmsd.
     * @return PdbxValidateRmsdBond
     */
    public org.rcsb.cif.model.pdbxvalidatermsdbond.PdbxValidateRmsdBond getPdbxValidateRmsdBond() {
        return (org.rcsb.cif.model.pdbxvalidatermsdbond.PdbxValidateRmsdBond) categories.computeIfAbsent("pdbx_validate_rmsd_bond",
                org.rcsb.cif.model.pdbxvalidatermsdbond.PdbxValidateRmsdBond::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
     * the covalent bond angles found in an entry that have
     * values which deviate from expected values by more
     * than 6*rmsd for the particular entry from the expected standard
     * value
     * @return PdbxValidateRmsdAngle
     */
    public org.rcsb.cif.model.pdbxvalidatermsdangle.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle() {
        return (org.rcsb.cif.model.pdbxvalidatermsdangle.PdbxValidateRmsdAngle) categories.computeIfAbsent("pdbx_validate_rmsd_angle",
                org.rcsb.cif.model.pdbxvalidatermsdangle.PdbxValidateRmsdAngle::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_TORSION category list the
     * residues with torsion angles outside the expected ramachandran regions
     * @return PdbxValidateTorsion
     */
    public org.rcsb.cif.model.pdbxvalidatetorsion.PdbxValidateTorsion getPdbxValidateTorsion() {
        return (org.rcsb.cif.model.pdbxvalidatetorsion.PdbxValidateTorsion) categories.computeIfAbsent("pdbx_validate_torsion",
                org.rcsb.cif.model.pdbxvalidatetorsion.PdbxValidateTorsion::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_PEPTIDE_OMEGA category list the
     * residues that contain peptide bonds deviate
     * significantly from both cis and trans conformation.
     * cis bonds, if any, are listed on cispep records.
     * trans is defined as 180 +/- 30 and
     * cis is defined as 0 +/- 30 degrees.
     * @return PdbxValidatePeptideOmega
     */
    public org.rcsb.cif.model.pdbxvalidatepeptideomega.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega() {
        return (org.rcsb.cif.model.pdbxvalidatepeptideomega.PdbxValidatePeptideOmega) categories.computeIfAbsent("pdbx_validate_peptide_omega",
                org.rcsb.cif.model.pdbxvalidatepeptideomega.PdbxValidatePeptideOmega::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_CHIRAL category list the
     * residues that contain unexpected configuration of chiral
     * centers.
     * IMPROPER   HA  N   C   CB   chirality CA
     * IMPROPER   HB1 HB2 CA  CG   stereo CB
     * as this number approaches (+) or (-) 180.0, then the
     * error in predicting the true chirality of the center increases.
     * Improper dihedrals are a measure of the chirality/planarity of the
     * structure at a specific atom. Values around -35 or +35 are expected
     * for chiral atoms, and values around 0 for planar atoms.
     * HERE improper C---N----CA---CB done
     * expected answer is around -120 mean -122.52
     * D-amino acid is +120.0
     * @return PdbxValidateChiral
     */
    public org.rcsb.cif.model.pdbxvalidatechiral.PdbxValidateChiral getPdbxValidateChiral() {
        return (org.rcsb.cif.model.pdbxvalidatechiral.PdbxValidateChiral) categories.computeIfAbsent("pdbx_validate_chiral",
                org.rcsb.cif.model.pdbxvalidatechiral.PdbxValidateChiral::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_PLANES category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanes
     */
    public org.rcsb.cif.model.pdbxvalidateplanes.PdbxValidatePlanes getPdbxValidatePlanes() {
        return (org.rcsb.cif.model.pdbxvalidateplanes.PdbxValidatePlanes) categories.computeIfAbsent("pdbx_validate_planes",
                org.rcsb.cif.model.pdbxvalidateplanes.PdbxValidatePlanes::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanesAtom
     */
    public org.rcsb.cif.model.pdbxvalidateplanesatom.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom() {
        return (org.rcsb.cif.model.pdbxvalidateplanesatom.PdbxValidatePlanesAtom) categories.computeIfAbsent("pdbx_validate_planes_atom",
                org.rcsb.cif.model.pdbxvalidateplanesatom.PdbxValidatePlanesAtom::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_MAIN_CHAIN_PLANE category list the
     * residues that contain unexpected deviations from planes
     * for main chain atoms as defined by the improper torsion
     * angle describing planarity:
     *
     * PLANARITY = C(i-1) - CA(i-1) - N(i) - O(i-1) ==> planar < 5
     * as a pseudo torsion
     * @return PdbxValidateMainChainPlane
     */
    public org.rcsb.cif.model.pdbxvalidatemainchainplane.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane() {
        return (org.rcsb.cif.model.pdbxvalidatemainchainplane.PdbxValidateMainChainPlane) categories.computeIfAbsent("pdbx_validate_main_chain_plane",
                org.rcsb.cif.model.pdbxvalidatemainchainplane.PdbxValidateMainChainPlane::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
     * in connections between portions of the structure.
     * @return PdbxStructConnAngle
     */
    public org.rcsb.cif.model.pdbxstructconnangle.PdbxStructConnAngle getPdbxStructConnAngle() {
        return (org.rcsb.cif.model.pdbxstructconnangle.PdbxStructConnAngle) categories.computeIfAbsent("pdbx_struct_conn_angle",
                org.rcsb.cif.model.pdbxstructconnangle.PdbxStructConnAngle::new);
    }

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_RESIDUES category list the
     * residues within the entry that are not observed or have zero occupancy.
     * @return PdbxUnobsOrZeroOccResidues
     */
    public org.rcsb.cif.model.pdbxunobsorzerooccresidues.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues() {
        return (org.rcsb.cif.model.pdbxunobsorzerooccresidues.PdbxUnobsOrZeroOccResidues) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_residues",
                org.rcsb.cif.model.pdbxunobsorzerooccresidues.PdbxUnobsOrZeroOccResidues::new);
    }

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
     * atoms within the entry that are either unobserved or have zero occupancy/
     * @return PdbxUnobsOrZeroOccAtoms
     */
    public org.rcsb.cif.model.pdbxunobsorzerooccatoms.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms() {
        return (org.rcsb.cif.model.pdbxunobsorzerooccatoms.PdbxUnobsOrZeroOccAtoms) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_atoms",
                org.rcsb.cif.model.pdbxunobsorzerooccatoms.PdbxUnobsOrZeroOccAtoms::new);
    }

    /**
     * Data items in the PDBX_ENTRY_DETAILS category provide additional
     * details about this entry.
     * @return PdbxEntryDetails
     */
    public org.rcsb.cif.model.pdbxentrydetails.PdbxEntryDetails getPdbxEntryDetails() {
        return (org.rcsb.cif.model.pdbxentrydetails.PdbxEntryDetails) categories.computeIfAbsent("pdbx_entry_details",
                org.rcsb.cif.model.pdbxentrydetails.PdbxEntryDetails::new);
    }

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    public org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue getPdbxStructModResidue() {
        return (org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue) categories.computeIfAbsent("pdbx_struct_mod_residue",
                org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate insertions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqInsertion
     */
    public org.rcsb.cif.model.pdbxstructrefseqinsertion.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion() {
        return (org.rcsb.cif.model.pdbxstructrefseqinsertion.PdbxStructRefSeqInsertion) categories.computeIfAbsent("pdbx_struct_ref_seq_insertion",
                org.rcsb.cif.model.pdbxstructrefseqinsertion.PdbxStructRefSeqInsertion::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate deletions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqDeletion
     */
    public org.rcsb.cif.model.pdbxstructrefseqdeletion.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion() {
        return (org.rcsb.cif.model.pdbxstructrefseqdeletion.PdbxStructRefSeqDeletion) categories.computeIfAbsent("pdbx_struct_ref_seq_deletion",
                org.rcsb.cif.model.pdbxstructrefseqdeletion.PdbxStructRefSeqDeletion::new);
    }

    /**
     * Data items in the PDBX_REMEDIATION_ATOM_SITE_MAPPING category records
     * mapping information between selected molecular entities that have been
     * chemically redefined.   The prior and current atom nomenclature is
     * tabulated in this category.
     * @return PdbxRemediationAtomSiteMapping
     */
    public org.rcsb.cif.model.pdbxremediationatomsitemapping.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping() {
        return (org.rcsb.cif.model.pdbxremediationatomsitemapping.PdbxRemediationAtomSiteMapping) categories.computeIfAbsent("pdbx_remediation_atom_site_mapping",
                org.rcsb.cif.model.pdbxremediationatomsitemapping.PdbxRemediationAtomSiteMapping::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
     * polymer linkages within the entry that are outside of typlical
     * covalent distances.
     * @return PdbxValidatePolymerLinkage
     */
    public org.rcsb.cif.model.pdbxvalidatepolymerlinkage.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage() {
        return (org.rcsb.cif.model.pdbxvalidatepolymerlinkage.PdbxValidatePolymerLinkage) categories.computeIfAbsent("pdbx_validate_polymer_linkage",
                org.rcsb.cif.model.pdbxvalidatepolymerlinkage.PdbxValidatePolymerLinkage::new);
    }

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
     * helical symmetry group associated with this entry.
     * @return PdbxHelicalSymmetry
     */
    public org.rcsb.cif.model.pdbxhelicalsymmetry.PdbxHelicalSymmetry getPdbxHelicalSymmetry() {
        return (org.rcsb.cif.model.pdbxhelicalsymmetry.PdbxHelicalSymmetry) categories.computeIfAbsent("pdbx_helical_symmetry",
                org.rcsb.cif.model.pdbxhelicalsymmetry.PdbxHelicalSymmetry::new);
    }

    /**
     * Data items in the PDBX_POINT_SYMMETRY category record details about the
     * point symmetry group associated with this entry.
     * @return PdbxPointSymmetry
     */
    public org.rcsb.cif.model.pdbxpointsymmetry.PdbxPointSymmetry getPdbxPointSymmetry() {
        return (org.rcsb.cif.model.pdbxpointsymmetry.PdbxPointSymmetry) categories.computeIfAbsent("pdbx_point_symmetry",
                org.rcsb.cif.model.pdbxpointsymmetry.PdbxPointSymmetry::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
     * structural elements in the deposited entry.  The entity instance is a method
     * neutral identifier for the observed molecular entities in the deposited coordinate
     * set.
     * @return PdbxStructEntityInst
     */
    public org.rcsb.cif.model.pdbxstructentityinst.PdbxStructEntityInst getPdbxStructEntityInst() {
        return (org.rcsb.cif.model.pdbxstructentityinst.PdbxStructEntityInst) categories.computeIfAbsent("pdbx_struct_entity_inst",
                org.rcsb.cif.model.pdbxstructentityinst.PdbxStructEntityInst::new);
    }

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    public org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList getPdbxStructOperList() {
        return (org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList) categories.computeIfAbsent("pdbx_struct_oper_list",
                org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    public org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly getPdbxStructAssembly() {
        return (org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly) categories.computeIfAbsent("pdbx_struct_assembly",
                org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    public org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return (org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen) categories.computeIfAbsent("pdbx_struct_assembly_gen",
                org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
     * the generation of the crystallographic asymmetric unit. The
     * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
     * components that constitute the asymmetric unit in terms of cartesian
     * transformations of deposited coordinates.
     * @return PdbxStructAsymGen
     */
    public org.rcsb.cif.model.pdbxstructasymgen.PdbxStructAsymGen getPdbxStructAsymGen() {
        return (org.rcsb.cif.model.pdbxstructasymgen.PdbxStructAsymGen) categories.computeIfAbsent("pdbx_struct_asym_gen",
                org.rcsb.cif.model.pdbxstructasymgen.PdbxStructAsymGen::new);
    }

    /**
     * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
     * the generation of the minimal asymmetric unit. For instance, this
     * category can be used to provide this information for helical and point
     * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the
     * specifications of the components that constitute the asymmetric unit
     * in terms of cartesian transformations of deposited coordinates.
     * @return PdbxStructMsymGen
     */
    public org.rcsb.cif.model.pdbxstructmsymgen.PdbxStructMsymGen getPdbxStructMsymGen() {
        return (org.rcsb.cif.model.pdbxstructmsymgen.PdbxStructMsymGen) categories.computeIfAbsent("pdbx_struct_msym_gen",
                org.rcsb.cif.model.pdbxstructmsymgen.PdbxStructMsymGen::new);
    }

    /**
     * Data items in the PDBX_STRUCT_LEGACY_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     *
     * This category provides a container for matrices used to construct
     * icosahedral assemblies in legacy entries.
     * @return PdbxStructLegacyOperList
     */
    public org.rcsb.cif.model.pdbxstructlegacyoperlist.PdbxStructLegacyOperList getPdbxStructLegacyOperList() {
        return (org.rcsb.cif.model.pdbxstructlegacyoperlist.PdbxStructLegacyOperList) categories.computeIfAbsent("pdbx_struct_legacy_oper_list",
                org.rcsb.cif.model.pdbxstructlegacyoperlist.PdbxStructLegacyOperList::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_FEATURE category provide
     * a selected list of atom level features for the chemical component.
     * @return PdbxChemCompAtomFeature
     */
    public org.rcsb.cif.model.pdbxchemcompatomfeature.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature() {
        return (org.rcsb.cif.model.pdbxchemcompatomfeature.PdbxChemCompAtomFeature) categories.computeIfAbsent("pdbx_chem_comp_atom_feature",
                org.rcsb.cif.model.pdbxchemcompatomfeature.PdbxChemCompAtomFeature::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
     * entity families.
     * @return PdbxReferenceMoleculeFamily
     */
    public org.rcsb.cif.model.pdbxreferencemoleculefamily.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily() {
        return (org.rcsb.cif.model.pdbxreferencemoleculefamily.PdbxReferenceMoleculeFamily) categories.computeIfAbsent("pdbx_reference_molecule_family",
                org.rcsb.cif.model.pdbxreferencemoleculefamily.PdbxReferenceMoleculeFamily::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMoleculeList
     */
    public org.rcsb.cif.model.pdbxreferencemoleculelist.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList() {
        return (org.rcsb.cif.model.pdbxreferencemoleculelist.PdbxReferenceMoleculeList) categories.computeIfAbsent("pdbx_reference_molecule_list",
                org.rcsb.cif.model.pdbxreferencemoleculelist.PdbxReferenceMoleculeList::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMolecule
     */
    public org.rcsb.cif.model.pdbxreferencemolecule.PdbxReferenceMolecule getPdbxReferenceMolecule() {
        return (org.rcsb.cif.model.pdbxreferencemolecule.PdbxReferenceMolecule) categories.computeIfAbsent("pdbx_reference_molecule",
                org.rcsb.cif.model.pdbxreferencemolecule.PdbxReferenceMolecule::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    public org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return (org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList) categories.computeIfAbsent("pdbx_reference_entity_list",
                org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_NONPOLY category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityNonpoly
     */
    public org.rcsb.cif.model.pdbxreferenceentitynonpoly.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly() {
        return (org.rcsb.cif.model.pdbxreferenceentitynonpoly.PdbxReferenceEntityNonpoly) categories.computeIfAbsent("pdbx_reference_entity_nonpoly",
                org.rcsb.cif.model.pdbxreferenceentitynonpoly.PdbxReferenceEntityNonpoly::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    public org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return (org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink) categories.computeIfAbsent("pdbx_reference_entity_link",
                org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    public org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return (org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink) categories.computeIfAbsent("pdbx_reference_entity_poly_link",
                org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY category record details about
     * the polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return PdbxReferenceEntityPoly
     */
    public org.rcsb.cif.model.pdbxreferenceentitypoly.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly() {
        return (org.rcsb.cif.model.pdbxreferenceentitypoly.PdbxReferenceEntityPoly) categories.computeIfAbsent("pdbx_reference_entity_poly",
                org.rcsb.cif.model.pdbxreferenceentitypoly.PdbxReferenceEntityPoly::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer.
     * @return PdbxReferenceEntityPolySeq
     */
    public org.rcsb.cif.model.pdbxreferenceentitypolyseq.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq() {
        return (org.rcsb.cif.model.pdbxreferenceentitypolyseq.PdbxReferenceEntityPolySeq) categories.computeIfAbsent("pdbx_reference_entity_poly_seq",
                org.rcsb.cif.model.pdbxreferenceentitypolyseq.PdbxReferenceEntityPolySeq::new);
    }

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceEntitySequence
     */
    public org.rcsb.cif.model.pdbxreferenceentitysequence.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence() {
        return (org.rcsb.cif.model.pdbxreferenceentitysequence.PdbxReferenceEntitySequence) categories.computeIfAbsent("pdbx_reference_entity_sequence",
                org.rcsb.cif.model.pdbxreferenceentitysequence.PdbxReferenceEntitySequence::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
     * details of the source from which the entity was obtained.
     * @return PdbxReferenceEntitySrcNat
     */
    public org.rcsb.cif.model.pdbxreferenceentitysrcnat.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat() {
        return (org.rcsb.cif.model.pdbxreferenceentitysrcnat.PdbxReferenceEntitySrcNat) categories.computeIfAbsent("pdbx_reference_entity_src_nat",
                org.rcsb.cif.model.pdbxreferenceentitysrcnat.PdbxReferenceEntitySrcNat::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
     * textual details about small polymer molecules.
     * @return PdbxReferenceMoleculeDetails
     */
    public org.rcsb.cif.model.pdbxreferencemoleculedetails.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails() {
        return (org.rcsb.cif.model.pdbxreferencemoleculedetails.PdbxReferenceMoleculeDetails) categories.computeIfAbsent("pdbx_reference_molecule_details",
                org.rcsb.cif.model.pdbxreferencemoleculedetails.PdbxReferenceMoleculeDetails::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records
     * synonym names for reference entities.
     * @return PdbxReferenceMoleculeSynonyms
     */
    public org.rcsb.cif.model.pdbxreferencemoleculesynonyms.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms() {
        return (org.rcsb.cif.model.pdbxreferencemoleculesynonyms.PdbxReferenceMoleculeSynonyms) categories.computeIfAbsent("pdbx_reference_molecule_synonyms",
                org.rcsb.cif.model.pdbxreferencemoleculesynonyms.PdbxReferenceMoleculeSynonyms::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
     * subcomponent sequence from which this entity could be built.
     * @return PdbxReferenceEntitySubcomponents
     */
    public org.rcsb.cif.model.pdbxreferenceentitysubcomponents.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents() {
        return (org.rcsb.cif.model.pdbxreferenceentitysubcomponents.PdbxReferenceEntitySubcomponents) categories.computeIfAbsent("pdbx_reference_entity_subcomponents",
                org.rcsb.cif.model.pdbxreferenceentitysubcomponents.PdbxReferenceEntitySubcomponents::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
     * additional annotation relevant to the molecular entities.
     * @return PdbxReferenceMoleculeAnnotation
     */
    public org.rcsb.cif.model.pdbxreferencemoleculeannotation.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation() {
        return (org.rcsb.cif.model.pdbxreferencemoleculeannotation.PdbxReferenceMoleculeAnnotation) categories.computeIfAbsent("pdbx_reference_molecule_annotation",
                org.rcsb.cif.model.pdbxreferencemoleculeannotation.PdbxReferenceMoleculeAnnotation::new);
    }

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceMoleculeFeatures
     */
    public org.rcsb.cif.model.pdbxreferencemoleculefeatures.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures() {
        return (org.rcsb.cif.model.pdbxreferencemoleculefeatures.PdbxReferenceMoleculeFeatures) categories.computeIfAbsent("pdbx_reference_molecule_features",
                org.rcsb.cif.model.pdbxreferencemoleculefeatures.PdbxReferenceMoleculeFeatures::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
     * details of the structural examples in related databases for this entity.
     * @return PdbxReferenceMoleculeRelatedStructures
     */
    public org.rcsb.cif.model.pdbxreferencemoleculerelatedstructures.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures() {
        return (org.rcsb.cif.model.pdbxreferencemoleculerelatedstructures.PdbxReferenceMoleculeRelatedStructures) categories.computeIfAbsent("pdbx_reference_molecule_related_structures",
                org.rcsb.cif.model.pdbxreferencemoleculerelatedstructures.PdbxReferenceMoleculeRelatedStructures::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
     * or atoms.
     * @return PdbxStructGroupList
     */
    public org.rcsb.cif.model.pdbxstructgrouplist.PdbxStructGroupList getPdbxStructGroupList() {
        return (org.rcsb.cif.model.pdbxstructgrouplist.PdbxStructGroupList) categories.computeIfAbsent("pdbx_struct_group_list",
                org.rcsb.cif.model.pdbxstructgrouplist.PdbxStructGroupList::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENTS category list component-level
     * group assignments within the entry.  Groups are defined and described in category
     * PDBX_STRUCT_GROUP_LIST.
     * @return PdbxStructGroupComponents
     */
    public org.rcsb.cif.model.pdbxstructgroupcomponents.PdbxStructGroupComponents getPdbxStructGroupComponents() {
        return (org.rcsb.cif.model.pdbxstructgroupcomponents.PdbxStructGroupComponents) categories.computeIfAbsent("pdbx_struct_group_components",
                org.rcsb.cif.model.pdbxstructgroupcomponents.PdbxStructGroupComponents::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
     * group as a continuous span chemical components.
     * @return PdbxStructGroupComponentRange
     */
    public org.rcsb.cif.model.pdbxstructgroupcomponentrange.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange() {
        return (org.rcsb.cif.model.pdbxstructgroupcomponentrange.PdbxStructGroupComponentRange) categories.computeIfAbsent("pdbx_struct_group_component_range",
                org.rcsb.cif.model.pdbxstructgroupcomponentrange.PdbxStructGroupComponentRange::new);
    }

    /**
     * Data items in the PDBX_PRD_AUDIT category records
     * the status and tracking information for this molecule.
     * @return PdbxPrdAudit
     */
    public org.rcsb.cif.model.pdbxprdaudit.PdbxPrdAudit getPdbxPrdAudit() {
        return (org.rcsb.cif.model.pdbxprdaudit.PdbxPrdAudit) categories.computeIfAbsent("pdbx_prd_audit",
                org.rcsb.cif.model.pdbxprdaudit.PdbxPrdAudit::new);
    }

    /**
     * Data items in the PDBX_FAMILY_PRD_AUDIT category records
     * the status and tracking information for this family.
     * @return PdbxFamilyPrdAudit
     */
    public org.rcsb.cif.model.pdbxfamilyprdaudit.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit() {
        return (org.rcsb.cif.model.pdbxfamilyprdaudit.PdbxFamilyPrdAudit) categories.computeIfAbsent("pdbx_family_prd_audit",
                org.rcsb.cif.model.pdbxfamilyprdaudit.PdbxFamilyPrdAudit::new);
    }

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    public org.rcsb.cif.model.pdbxmolecule.PdbxMolecule getPdbxMolecule() {
        return (org.rcsb.cif.model.pdbxmolecule.PdbxMolecule) categories.computeIfAbsent("pdbx_molecule",
                org.rcsb.cif.model.pdbxmolecule.PdbxMolecule::new);
    }

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    public org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return (org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures) categories.computeIfAbsent("pdbx_molecule_features",
                org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures::new);
    }

    /**
     * Data items in the PDBX_FAMILY_GROUP_INDEX category record
     * the family membership in family groups.
     * @return PdbxFamilyGroupIndex
     */
    public org.rcsb.cif.model.pdbxfamilygroupindex.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex() {
        return (org.rcsb.cif.model.pdbxfamilygroupindex.PdbxFamilyGroupIndex) categories.computeIfAbsent("pdbx_family_group_index",
                org.rcsb.cif.model.pdbxfamilygroupindex.PdbxFamilyGroupIndex::new);
    }

    /**
     * Data items in the PDBX_DISTANT_SOLVENT_ATOMS category list the
     * solvent atoms remote from any macromolecule.
     * @return PdbxDistantSolventAtoms
     */
    public org.rcsb.cif.model.pdbxdistantsolventatoms.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms() {
        return (org.rcsb.cif.model.pdbxdistantsolventatoms.PdbxDistantSolventAtoms) categories.computeIfAbsent("pdbx_distant_solvent_atoms",
                org.rcsb.cif.model.pdbxdistantsolventatoms.PdbxDistantSolventAtoms::new);
    }

    /**
     * Data items in the PDBX_STRUCT_SPECIAL_SYMMETRY category list the
     * molecular components that lie on special symmetry positions.
     * @return PdbxStructSpecialSymmetry
     */
    public org.rcsb.cif.model.pdbxstructspecialsymmetry.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry() {
        return (org.rcsb.cif.model.pdbxstructspecialsymmetry.PdbxStructSpecialSymmetry) categories.computeIfAbsent("pdbx_struct_special_symmetry",
                org.rcsb.cif.model.pdbxstructspecialsymmetry.PdbxStructSpecialSymmetry::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
     * related to PDB citation data.
     * @return PdbxReferencePublicationList
     */
    public org.rcsb.cif.model.pdbxreferencepublicationlist.PdbxReferencePublicationList getPdbxReferencePublicationList() {
        return (org.rcsb.cif.model.pdbxreferencepublicationlist.PdbxReferencePublicationList) categories.computeIfAbsent("pdbx_reference_publication_list",
                org.rcsb.cif.model.pdbxreferencepublicationlist.PdbxReferencePublicationList::new);
    }

    /**
     *
     * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
     * @return PdbxNmrAssignedChemShiftList
     */
    public org.rcsb.cif.model.pdbxnmrassignedchemshiftlist.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList() {
        return (org.rcsb.cif.model.pdbxnmrassignedchemshiftlist.PdbxNmrAssignedChemShiftList) categories.computeIfAbsent("pdbx_nmr_assigned_chem_shift_list",
                org.rcsb.cif.model.pdbxnmrassignedchemshiftlist.PdbxNmrAssignedChemShiftList::new);
    }

    /**
     *
     * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
     * @return PdbxNmrChemShiftExperiment
     */
    public org.rcsb.cif.model.pdbxnmrchemshiftexperiment.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment() {
        return (org.rcsb.cif.model.pdbxnmrchemshiftexperiment.PdbxNmrChemShiftExperiment) categories.computeIfAbsent("pdbx_nmr_chem_shift_experiment",
                org.rcsb.cif.model.pdbxnmrchemshiftexperiment.PdbxNmrChemShiftExperiment::new);
    }

    /**
     *
     * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
     * @return PdbxNmrChemShiftRef
     */
    public org.rcsb.cif.model.pdbxnmrchemshiftref.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef() {
        return (org.rcsb.cif.model.pdbxnmrchemshiftref.PdbxNmrChemShiftRef) categories.computeIfAbsent("pdbx_nmr_chem_shift_ref",
                org.rcsb.cif.model.pdbxnmrchemshiftref.PdbxNmrChemShiftRef::new);
    }

    /**
     *
     * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
     * @return PdbxNmrChemShiftReference
     */
    public org.rcsb.cif.model.pdbxnmrchemshiftreference.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference() {
        return (org.rcsb.cif.model.pdbxnmrchemshiftreference.PdbxNmrChemShiftReference) categories.computeIfAbsent("pdbx_nmr_chem_shift_reference",
                org.rcsb.cif.model.pdbxnmrchemshiftreference.PdbxNmrChemShiftReference::new);
    }

    /**
     *
     * Items in the chem_shift_software category provide pointers to the software category and methods category.
     * @return PdbxNmrChemShiftSoftware
     */
    public org.rcsb.cif.model.pdbxnmrchemshiftsoftware.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware() {
        return (org.rcsb.cif.model.pdbxnmrchemshiftsoftware.PdbxNmrChemShiftSoftware) categories.computeIfAbsent("pdbx_nmr_chem_shift_software",
                org.rcsb.cif.model.pdbxnmrchemshiftsoftware.PdbxNmrChemShiftSoftware::new);
    }

    /**
     *
     * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
     * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
     * @return PdbxNmrConstraintFile
     */
    public org.rcsb.cif.model.pdbxnmrconstraintfile.PdbxNmrConstraintFile getPdbxNmrConstraintFile() {
        return (org.rcsb.cif.model.pdbxnmrconstraintfile.PdbxNmrConstraintFile) categories.computeIfAbsent("pdbx_nmr_constraint_file",
                org.rcsb.cif.model.pdbxnmrconstraintfile.PdbxNmrConstraintFile::new);
    }

    /**
     *
     * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
     * @return PdbxNmrSoftwareTask
     */
    public org.rcsb.cif.model.pdbxnmrsoftwaretask.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask() {
        return (org.rcsb.cif.model.pdbxnmrsoftwaretask.PdbxNmrSoftwareTask) categories.computeIfAbsent("pdbx_nmr_software_task",
                org.rcsb.cif.model.pdbxnmrsoftwaretask.PdbxNmrSoftwareTask::new);
    }

    /**
     *
     * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
     * @return PdbxNmrSpectralDim
     */
    public org.rcsb.cif.model.pdbxnmrspectraldim.PdbxNmrSpectralDim getPdbxNmrSpectralDim() {
        return (org.rcsb.cif.model.pdbxnmrspectraldim.PdbxNmrSpectralDim) categories.computeIfAbsent("pdbx_nmr_spectral_dim",
                org.rcsb.cif.model.pdbxnmrspectraldim.PdbxNmrSpectralDim::new);
    }

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
     * @return PdbxNmrSpectralPeakList
     */
    public org.rcsb.cif.model.pdbxnmrspectralpeaklist.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList() {
        return (org.rcsb.cif.model.pdbxnmrspectralpeaklist.PdbxNmrSpectralPeakList) categories.computeIfAbsent("pdbx_nmr_spectral_peak_list",
                org.rcsb.cif.model.pdbxnmrspectralpeaklist.PdbxNmrSpectralPeakList::new);
    }

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
     * and methods category where descriptions of software applications and methods can be found.
     * @return PdbxNmrSpectralPeakSoftware
     */
    public org.rcsb.cif.model.pdbxnmrspectralpeaksoftware.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware() {
        return (org.rcsb.cif.model.pdbxnmrspectralpeaksoftware.PdbxNmrSpectralPeakSoftware) categories.computeIfAbsent("pdbx_nmr_spectral_peak_software",
                org.rcsb.cif.model.pdbxnmrspectralpeaksoftware.PdbxNmrSpectralPeakSoftware::new);
    }

    /**
     *
     * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
     * @return PdbxNmrSystematicChemShiftOffset
     */
    public org.rcsb.cif.model.pdbxnmrsystematicchemshiftoffset.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset() {
        return (org.rcsb.cif.model.pdbxnmrsystematicchemshiftoffset.PdbxNmrSystematicChemShiftOffset) categories.computeIfAbsent("pdbx_nmr_systematic_chem_shift_offset",
                org.rcsb.cif.model.pdbxnmrsystematicchemshiftoffset.PdbxNmrSystematicChemShiftOffset::new);
    }

    /**
     *
     * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
     * @return PdbxNmrUpload
     */
    public org.rcsb.cif.model.pdbxnmrupload.PdbxNmrUpload getPdbxNmrUpload() {
        return (org.rcsb.cif.model.pdbxnmrupload.PdbxNmrUpload) categories.computeIfAbsent("pdbx_nmr_upload",
                org.rcsb.cif.model.pdbxnmrupload.PdbxNmrUpload::new);
    }

    /**
     * Data items in the PDBX_AUDIT_SUPPORT category record details about
     * funding support for the entry.
     * @return PdbxAuditSupport
     */
    public org.rcsb.cif.model.pdbxauditsupport.PdbxAuditSupport getPdbxAuditSupport() {
        return (org.rcsb.cif.model.pdbxauditsupport.PdbxAuditSupport) categories.computeIfAbsent("pdbx_audit_support",
                org.rcsb.cif.model.pdbxauditsupport.PdbxAuditSupport::new);
    }

    /**
     * Data items in the pdbx_chem_comp_subcomponent_struct_conn
     * list the chemical interactions among the subcomponents in
     * the chemical component.
     * @return PdbxChemCompSubcomponentStructConn
     */
    public org.rcsb.cif.model.pdbxchemcompsubcomponentstructconn.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn() {
        return (org.rcsb.cif.model.pdbxchemcompsubcomponentstructconn.PdbxChemCompSubcomponentStructConn) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_struct_conn",
                org.rcsb.cif.model.pdbxchemcompsubcomponentstructconn.PdbxChemCompSubcomponentStructConn::new);
    }

    /**
     * Data items in the pdbx_chem_comp_subcomponent_entity_list category
     * list the constituent chemical entities and entity features in this chemical component.
     * @return PdbxChemCompSubcomponentEntityList
     */
    public org.rcsb.cif.model.pdbxchemcompsubcomponententitylist.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList() {
        return (org.rcsb.cif.model.pdbxchemcompsubcomponententitylist.PdbxChemCompSubcomponentEntityList) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_entity_list",
                org.rcsb.cif.model.pdbxchemcompsubcomponententitylist.PdbxChemCompSubcomponentEntityList::new);
    }

    /**
     * Data items in the ENTITY_SRC_NAT category record details of
     * the source from which the entity was obtained in cases
     * where the entity was isolated directly from a natural tissue.
     * @return EntitySrcNat
     */
    public org.rcsb.cif.model.entitysrcnat.EntitySrcNat getEntitySrcNat() {
        return (org.rcsb.cif.model.entitysrcnat.EntitySrcNat) categories.computeIfAbsent("entity_src_nat",
                org.rcsb.cif.model.entitysrcnat.EntitySrcNat::new);
    }

    /**
     * Data items in the ENTITY_SRC_GEN category record details of
     * the source from which the entity was obtained in cases
     * where the source was genetically manipulated.  The
     * following are treated separately:  items pertaining to the tissue
     * from which the gene was obtained, items pertaining to the host
     * organism for gene expression and items pertaining to the actual
     * producing organism (plasmid).
     * @return EntitySrcGen
     */
    public org.rcsb.cif.model.entitysrcgen.EntitySrcGen getEntitySrcGen() {
        return (org.rcsb.cif.model.entitysrcgen.EntitySrcGen) categories.computeIfAbsent("entity_src_gen",
                org.rcsb.cif.model.entitysrcgen.EntitySrcGen::new);
    }

    /**
     * The data items in category PDBX_ENTITY_SRC_SYN record the source details
     * about chemically synthesized molecules.
     * @return PdbxEntitySrcSyn
     */
    public org.rcsb.cif.model.pdbxentitysrcsyn.PdbxEntitySrcSyn getPdbxEntitySrcSyn() {
        return (org.rcsb.cif.model.pdbxentitysrcsyn.PdbxEntitySrcSyn) categories.computeIfAbsent("pdbx_entity_src_syn",
                org.rcsb.cif.model.pdbxentitysrcsyn.PdbxEntitySrcSyn::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
     * the linkages between components within the polymer entity.
     * @return PdbxEntityPolyCompLinkList
     */
    public org.rcsb.cif.model.pdbxentitypolycomplinklist.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList() {
        return (org.rcsb.cif.model.pdbxentitypolycomplinklist.PdbxEntityPolyCompLinkList) categories.computeIfAbsent("pdbx_entity_poly_comp_link_list",
                org.rcsb.cif.model.pdbxentitypolycomplinklist.PdbxEntityPolyCompLinkList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY category record
     * information about molecules composed of linked entities.
     * @return PdbxLinkedEntity
     */
    public org.rcsb.cif.model.pdbxlinkedentity.PdbxLinkedEntity getPdbxLinkedEntity() {
        return (org.rcsb.cif.model.pdbxlinkedentity.PdbxLinkedEntity) categories.computeIfAbsent("pdbx_linked_entity",
                org.rcsb.cif.model.pdbxlinkedentity.PdbxLinkedEntity::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
     * molecules represented as linked entities within an entry.
     * @return PdbxLinkedEntityInstanceList
     */
    public org.rcsb.cif.model.pdbxlinkedentityinstancelist.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList() {
        return (org.rcsb.cif.model.pdbxlinkedentityinstancelist.PdbxLinkedEntityInstanceList) categories.computeIfAbsent("pdbx_linked_entity_instance_list",
                org.rcsb.cif.model.pdbxlinkedentityinstancelist.PdbxLinkedEntityInstanceList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_LIST category record
     * the list of entity constituents for this molecule.
     * @return PdbxLinkedEntityList
     */
    public org.rcsb.cif.model.pdbxlinkedentitylist.PdbxLinkedEntityList getPdbxLinkedEntityList() {
        return (org.rcsb.cif.model.pdbxlinkedentitylist.PdbxLinkedEntityList) categories.computeIfAbsent("pdbx_linked_entity_list",
                org.rcsb.cif.model.pdbxlinkedentitylist.PdbxLinkedEntityList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
     * the linkages with molecules represented as linked entities.
     * @return PdbxLinkedEntityLinkList
     */
    public org.rcsb.cif.model.pdbxlinkedentitylinklist.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList() {
        return (org.rcsb.cif.model.pdbxlinkedentitylinklist.PdbxLinkedEntityLinkList) categories.computeIfAbsent("pdbx_linked_entity_link_list",
                org.rcsb.cif.model.pdbxlinkedentitylinklist.PdbxLinkedEntityLinkList::new);
    }

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    public org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return (org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor) categories.computeIfAbsent("pdbx_entity_descriptor",
                org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity category describe
     * common observed interaction patterns within linked entities.
     * @return PdbxReferenceLinkedEntity
     */
    public org.rcsb.cif.model.pdbxreferencelinkedentity.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity() {
        return (org.rcsb.cif.model.pdbxreferencelinkedentity.PdbxReferenceLinkedEntity) categories.computeIfAbsent("pdbx_reference_linked_entity",
                org.rcsb.cif.model.pdbxreferencelinkedentity.PdbxReferenceLinkedEntity::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_comp_list category lists
     * the constituents of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompList
     */
    public org.rcsb.cif.model.pdbxreferencelinkedentitycomplist.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList() {
        return (org.rcsb.cif.model.pdbxreferencelinkedentitycomplist.PdbxReferenceLinkedEntityCompList) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_list",
                org.rcsb.cif.model.pdbxreferencelinkedentitycomplist.PdbxReferenceLinkedEntityCompList::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
     * inter-entity linkages between the components of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompLink
     */
    public org.rcsb.cif.model.pdbxreferencelinkedentitycomplink.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink() {
        return (org.rcsb.cif.model.pdbxreferencelinkedentitycomplink.PdbxReferenceLinkedEntityCompLink) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_link",
                org.rcsb.cif.model.pdbxreferencelinkedentitycomplink.PdbxReferenceLinkedEntityCompLink::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_link category enumerate
     * linkages between the entities in common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityLink
     */
    public org.rcsb.cif.model.pdbxreferencelinkedentitylink.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink() {
        return (org.rcsb.cif.model.pdbxreferencelinkedentitylink.PdbxReferenceLinkedEntityLink) categories.computeIfAbsent("pdbx_reference_linked_entity_link",
                org.rcsb.cif.model.pdbxreferencelinkedentitylink.PdbxReferenceLinkedEntityLink::new);
    }

    /**
     * Data items in the PDBX_RELATED_DATA_SET category record references
     * to experimental data sets related to the entry.
     * @return PdbxRelatedExpDataSet
     */
    public org.rcsb.cif.model.pdbxrelatedexpdataset.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet() {
        return (org.rcsb.cif.model.pdbxrelatedexpdataset.PdbxRelatedExpDataSet) categories.computeIfAbsent("pdbx_related_exp_data_set",
                org.rcsb.cif.model.pdbxrelatedexpdataset.PdbxRelatedExpDataSet::new);
    }

    /**
     * The pdbx_database_status_history category records the time evolution of entry
     * processing status.
     * @return PdbxDatabaseStatusHistory
     */
    public org.rcsb.cif.model.pdbxdatabasestatushistory.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory() {
        return (org.rcsb.cif.model.pdbxdatabasestatushistory.PdbxDatabaseStatusHistory) categories.computeIfAbsent("pdbx_database_status_history",
                org.rcsb.cif.model.pdbxdatabasestatushistory.PdbxDatabaseStatusHistory::new);
    }

    /**
     * Data items in the EM_ASSEMBLY category record details
     * about the imaged EM sample.
     * @return EmAssembly
     */
    public org.rcsb.cif.model.emassembly.EmAssembly getEmAssembly() {
        return (org.rcsb.cif.model.emassembly.EmAssembly) categories.computeIfAbsent("em_assembly",
                org.rcsb.cif.model.emassembly.EmAssembly::new);
    }

    /**
     * Data items in the EM_ENTITY_ASSEMBLY category
     * record details about each component of
     * the complex.
     * @return EmEntityAssembly
     */
    public org.rcsb.cif.model.ementityassembly.EmEntityAssembly getEmEntityAssembly() {
        return (org.rcsb.cif.model.ementityassembly.EmEntityAssembly) categories.computeIfAbsent("em_entity_assembly",
                org.rcsb.cif.model.ementityassembly.EmEntityAssembly::new);
    }

    /**
     * Data items in the EM_VIRUS_ENTITY category record details
     * of the icosahedral virus.
     * @return EmVirusEntity
     */
    public org.rcsb.cif.model.emvirusentity.EmVirusEntity getEmVirusEntity() {
        return (org.rcsb.cif.model.emvirusentity.EmVirusEntity) categories.computeIfAbsent("em_virus_entity",
                org.rcsb.cif.model.emvirusentity.EmVirusEntity::new);
    }

    /**
     * Data items in the EM_SAMPLE_PREPARATION category
     * record details of sample conditions prior to and upon loading
     * onto grid support.
     * @return EmSamplePreparation
     */
    public org.rcsb.cif.model.emsamplepreparation.EmSamplePreparation getEmSamplePreparation() {
        return (org.rcsb.cif.model.emsamplepreparation.EmSamplePreparation) categories.computeIfAbsent("em_sample_preparation",
                org.rcsb.cif.model.emsamplepreparation.EmSamplePreparation::new);
    }

    /**
     * Data items in the EM_SAMPLE_SUPPORT category record details
     * of the electron microscope grid type, grid support film and pretreatment
     * of whole before sample is applied
     * @return EmSampleSupport
     */
    public org.rcsb.cif.model.emsamplesupport.EmSampleSupport getEmSampleSupport() {
        return (org.rcsb.cif.model.emsamplesupport.EmSampleSupport) categories.computeIfAbsent("em_sample_support",
                org.rcsb.cif.model.emsamplesupport.EmSampleSupport::new);
    }

    /**
     * Data items in the BUFFER category
     * record details of the sample buffer.
     * @return EmBuffer
     */
    public org.rcsb.cif.model.embuffer.EmBuffer getEmBuffer() {
        return (org.rcsb.cif.model.embuffer.EmBuffer) categories.computeIfAbsent("em_buffer",
                org.rcsb.cif.model.embuffer.EmBuffer::new);
    }

    /**
     * Data items in the EM_VITRIFICATION category
     * record details about the method and cryogen used in
     * rapid freezing of the sample on the grid prior to its
     * insertion in the electron microscope
     * @return EmVitrification
     */
    public org.rcsb.cif.model.emvitrification.EmVitrification getEmVitrification() {
        return (org.rcsb.cif.model.emvitrification.EmVitrification) categories.computeIfAbsent("em_vitrification",
                org.rcsb.cif.model.emvitrification.EmVitrification::new);
    }

    /**
     * Data items in the EM_IMAGING category record details about
     * the parameters used in imaging the sample in the electron microscope.
     * @return EmImaging
     */
    public org.rcsb.cif.model.emimaging.EmImaging getEmImaging() {
        return (org.rcsb.cif.model.emimaging.EmImaging) categories.computeIfAbsent("em_imaging",
                org.rcsb.cif.model.emimaging.EmImaging::new);
    }

    /**
     * Data items in the EM_DETECTOR category record details
     * of the image detector type.
     * @return EmDetector
     */
    public org.rcsb.cif.model.emdetector.EmDetector getEmDetector() {
        return (org.rcsb.cif.model.emdetector.EmDetector) categories.computeIfAbsent("em_detector",
                org.rcsb.cif.model.emdetector.EmDetector::new);
    }

    /**
     * Data items in the EM_IMAGE_SCANS category record details
     * of the image scanning device (microdensitometer)
     * and parameters for digitization of the image.
     * @return EmImageScans
     */
    public org.rcsb.cif.model.emimagescans.EmImageScans getEmImageScans() {
        return (org.rcsb.cif.model.emimagescans.EmImageScans) categories.computeIfAbsent("em_image_scans",
                org.rcsb.cif.model.emimagescans.EmImageScans::new);
    }

    /**
     * Data items in the EM_2D_PROJECTION_SELECTION category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return Em2dProjectionSelection
     */
    public org.rcsb.cif.model.em2dprojectionselection.Em2dProjectionSelection getEm2dProjectionSelection() {
        return (org.rcsb.cif.model.em2dprojectionselection.Em2dProjectionSelection) categories.computeIfAbsent("em_2d_projection_selection",
                org.rcsb.cif.model.em2dprojectionselection.Em2dProjectionSelection::new);
    }

    /**
     * Data items in the EM_3D_RECONSTRUCTION category
     * record details of the 3D reconstruction procedure from 2D projections.
     * @return Em3dReconstruction
     */
    public org.rcsb.cif.model.em3dreconstruction.Em3dReconstruction getEm3dReconstruction() {
        return (org.rcsb.cif.model.em3dreconstruction.Em3dReconstruction) categories.computeIfAbsent("em_3d_reconstruction",
                org.rcsb.cif.model.em3dreconstruction.Em3dReconstruction::new);
    }

    /**
     * Data items in the 3D_FITTING category
     * record details of the method of fitting atomic
     * coordinates from a PDB file into a 3d-em
     * volume map file
     * @return Em3dFitting
     */
    public org.rcsb.cif.model.em3dfitting.Em3dFitting getEm3dFitting() {
        return (org.rcsb.cif.model.em3dfitting.Em3dFitting) categories.computeIfAbsent("em_3d_fitting",
                org.rcsb.cif.model.em3dfitting.Em3dFitting::new);
    }

    /**
     * Data items in the 3D_FITTING_LIST category
     * lists the methods of fitting atomic coordinates from a PDB file
     * into a 3d-em volume map file
     * @return Em3dFittingList
     */
    public org.rcsb.cif.model.em3dfittinglist.Em3dFittingList getEm3dFittingList() {
        return (org.rcsb.cif.model.em3dfittinglist.Em3dFittingList) categories.computeIfAbsent("em_3d_fitting_list",
                org.rcsb.cif.model.em3dfittinglist.Em3dFittingList::new);
    }

    /**
     * Data items in the EM_HELICAL_ENTITY category record details
     * for a helical or filament type of assembly component.
     * @return EmHelicalEntity
     */
    public org.rcsb.cif.model.emhelicalentity.EmHelicalEntity getEmHelicalEntity() {
        return (org.rcsb.cif.model.emhelicalentity.EmHelicalEntity) categories.computeIfAbsent("em_helical_entity",
                org.rcsb.cif.model.emhelicalentity.EmHelicalEntity::new);
    }

    /**
     * Data items in the EM_EXPERIMENT category provide
     * high-level classification of the EM experiment.
     * @return EmExperiment
     */
    public org.rcsb.cif.model.emexperiment.EmExperiment getEmExperiment() {
        return (org.rcsb.cif.model.emexperiment.EmExperiment) categories.computeIfAbsent("em_experiment",
                org.rcsb.cif.model.emexperiment.EmExperiment::new);
    }

    /**
     * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
     * the details of the symmetry for a single particle entity type.
     * @return EmSingleParticleEntity
     */
    public org.rcsb.cif.model.emsingleparticleentity.EmSingleParticleEntity getEmSingleParticleEntity() {
        return (org.rcsb.cif.model.emsingleparticleentity.EmSingleParticleEntity) categories.computeIfAbsent("em_single_particle_entity",
                org.rcsb.cif.model.emsingleparticleentity.EmSingleParticleEntity::new);
    }

    /**
     * Administration-related data items
     * @return EmAdmin
     */
    public org.rcsb.cif.model.emadmin.EmAdmin getEmAdmin() {
        return (org.rcsb.cif.model.emadmin.EmAdmin) categories.computeIfAbsent("em_admin",
                org.rcsb.cif.model.emadmin.EmAdmin::new);
    }

    /**
     * Category to collect the authors of this entry
     * @return EmAuthorList
     */
    public org.rcsb.cif.model.emauthorlist.EmAuthorList getEmAuthorList() {
        return (org.rcsb.cif.model.emauthorlist.EmAuthorList) categories.computeIfAbsent("em_author_list",
                org.rcsb.cif.model.emauthorlist.EmAuthorList::new);
    }

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReference
     */
    public org.rcsb.cif.model.emdbreference.EmDbReference getEmDbReference() {
        return (org.rcsb.cif.model.emdbreference.EmDbReference) categories.computeIfAbsent("em_db_reference",
                org.rcsb.cif.model.emdbreference.EmDbReference::new);
    }

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReferenceAuxiliary
     */
    public org.rcsb.cif.model.emdbreferenceauxiliary.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary() {
        return (org.rcsb.cif.model.emdbreferenceauxiliary.EmDbReferenceAuxiliary) categories.computeIfAbsent("em_db_reference_auxiliary",
                org.rcsb.cif.model.emdbreferenceauxiliary.EmDbReferenceAuxiliary::new);
    }

    /**
     * Some internal items to power the deposition interface
     * @return EmDepui
     */
    public org.rcsb.cif.model.emdepui.EmDepui getEmDepui() {
        return (org.rcsb.cif.model.emdepui.EmDepui) categories.computeIfAbsent("em_depui",
                org.rcsb.cif.model.emdepui.EmDepui::new);
    }

    /**
     * List of EMD entries made obsolete by this entry.
     * @return EmObsolete
     */
    public org.rcsb.cif.model.emobsolete.EmObsolete getEmObsolete() {
        return (org.rcsb.cif.model.emobsolete.EmObsolete) categories.computeIfAbsent("em_obsolete",
                org.rcsb.cif.model.emobsolete.EmObsolete::new);
    }

    /**
     * List of newer entries that replace this entry.
     * @return EmSupersede
     */
    public org.rcsb.cif.model.emsupersede.EmSupersede getEmSupersede() {
        return (org.rcsb.cif.model.emsupersede.EmSupersede) categories.computeIfAbsent("em_supersede",
                org.rcsb.cif.model.emsupersede.EmSupersede::new);
    }

    /**
     * Data items in this category record details about the molecular weight of
     * an assembly component of the sample.
     * @return EmEntityAssemblyMolwt
     */
    public org.rcsb.cif.model.ementityassemblymolwt.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt() {
        return (org.rcsb.cif.model.ementityassemblymolwt.EmEntityAssemblyMolwt) categories.computeIfAbsent("em_entity_assembly_molwt",
                org.rcsb.cif.model.ementityassemblymolwt.EmEntityAssemblyMolwt::new);
    }

    /**
     * Data items in this category record taxonomic details about the natural source for EM
     * assemblies and assembly components.
     * @return EmEntityAssemblyNaturalsource
     */
    public org.rcsb.cif.model.ementityassemblynaturalsource.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource() {
        return (org.rcsb.cif.model.ementityassemblynaturalsource.EmEntityAssemblyNaturalsource) categories.computeIfAbsent("em_entity_assembly_naturalsource",
                org.rcsb.cif.model.ementityassemblynaturalsource.EmEntityAssemblyNaturalsource::new);
    }

    /**
     * Data items in this category record details
     * about recombinant expression of the assembly or assembly component.
     * @return EmEntityAssemblyRecombinant
     */
    public org.rcsb.cif.model.ementityassemblyrecombinant.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant() {
        return (org.rcsb.cif.model.ementityassemblyrecombinant.EmEntityAssemblyRecombinant) categories.computeIfAbsent("em_entity_assembly_recombinant",
                org.rcsb.cif.model.ementityassemblyrecombinant.EmEntityAssemblyRecombinant::new);
    }

    /**
     * Data items in this category record details of a virus entity.
     * @return EmVirusNaturalHost
     */
    public org.rcsb.cif.model.emvirusnaturalhost.EmVirusNaturalHost getEmVirusNaturalHost() {
        return (org.rcsb.cif.model.emvirusnaturalhost.EmVirusNaturalHost) categories.computeIfAbsent("em_virus_natural_host",
                org.rcsb.cif.model.emvirusnaturalhost.EmVirusNaturalHost::new);
    }

    /**
     * Data items in the EMD_VIRUS_SHELL category record details
     * of the viral shell number, shell diameter, and icosahedral triangulation number.
     * @return EmVirusShell
     */
    public org.rcsb.cif.model.emvirusshell.EmVirusShell getEmVirusShell() {
        return (org.rcsb.cif.model.emvirusshell.EmVirusShell) categories.computeIfAbsent("em_virus_shell",
                org.rcsb.cif.model.emvirusshell.EmVirusShell::new);
    }

    /**
     * Data items in the EMD_SPECIMEN category record details
     * about specimens prepared for imaging by electron microscopy.
     * @return EmSpecimen
     */
    public org.rcsb.cif.model.emspecimen.EmSpecimen getEmSpecimen() {
        return (org.rcsb.cif.model.emspecimen.EmSpecimen) categories.computeIfAbsent("em_specimen",
                org.rcsb.cif.model.emspecimen.EmSpecimen::new);
    }

    /**
     * Sugar embedding category
     * @return EmEmbedding
     */
    public org.rcsb.cif.model.emembedding.EmEmbedding getEmEmbedding() {
        return (org.rcsb.cif.model.emembedding.EmEmbedding) categories.computeIfAbsent("em_embedding",
                org.rcsb.cif.model.emembedding.EmEmbedding::new);
    }

    /**
     * Description of fiducial markers.
     * @return EmFiducialMarkers
     */
    public org.rcsb.cif.model.emfiducialmarkers.EmFiducialMarkers getEmFiducialMarkers() {
        return (org.rcsb.cif.model.emfiducialmarkers.EmFiducialMarkers) categories.computeIfAbsent("em_fiducial_markers",
                org.rcsb.cif.model.emfiducialmarkers.EmFiducialMarkers::new);
    }

    /**
     * Description of sectioning by focused_ion_beam
     * @return EmFocusedIonBeam
     */
    public org.rcsb.cif.model.emfocusedionbeam.EmFocusedIonBeam getEmFocusedIonBeam() {
        return (org.rcsb.cif.model.emfocusedionbeam.EmFocusedIonBeam) categories.computeIfAbsent("em_focused_ion_beam",
                org.rcsb.cif.model.emfocusedionbeam.EmFocusedIonBeam::new);
    }

    /**
     * Data items describing glow discharge pretreatment for an EM grid
     * @return EmGridPretreatment
     */
    public org.rcsb.cif.model.emgridpretreatment.EmGridPretreatment getEmGridPretreatment() {
        return (org.rcsb.cif.model.emgridpretreatment.EmGridPretreatment) categories.computeIfAbsent("em_grid_pretreatment",
                org.rcsb.cif.model.emgridpretreatment.EmGridPretreatment::new);
    }

    /**
     * Description of sectioning by ultramicrotomy
     * @return EmUltramicrotomy
     */
    public org.rcsb.cif.model.emultramicrotomy.EmUltramicrotomy getEmUltramicrotomy() {
        return (org.rcsb.cif.model.emultramicrotomy.EmUltramicrotomy) categories.computeIfAbsent("em_ultramicrotomy",
                org.rcsb.cif.model.emultramicrotomy.EmUltramicrotomy::new);
    }

    /**
     * Description of high pressure freezing
     * @return EmHighPressureFreezing
     */
    public org.rcsb.cif.model.emhighpressurefreezing.EmHighPressureFreezing getEmHighPressureFreezing() {
        return (org.rcsb.cif.model.emhighpressurefreezing.EmHighPressureFreezing) categories.computeIfAbsent("em_high_pressure_freezing",
                org.rcsb.cif.model.emhighpressurefreezing.EmHighPressureFreezing::new);
    }

    /**
     * Data items related to shadowing of an EM specimen
     * @return EmShadowing
     */
    public org.rcsb.cif.model.emshadowing.EmShadowing getEmShadowing() {
        return (org.rcsb.cif.model.emshadowing.EmShadowing) categories.computeIfAbsent("em_shadowing",
                org.rcsb.cif.model.emshadowing.EmShadowing::new);
    }

    /**
     * Description specimen preparation for imaging using tomography.
     * @return EmTomographySpecimen
     */
    public org.rcsb.cif.model.emtomographyspecimen.EmTomographySpecimen getEmTomographySpecimen() {
        return (org.rcsb.cif.model.emtomographyspecimen.EmTomographySpecimen) categories.computeIfAbsent("em_tomography_specimen",
                org.rcsb.cif.model.emtomographyspecimen.EmTomographySpecimen::new);
    }

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return EmCrystalFormation
     */
    public org.rcsb.cif.model.emcrystalformation.EmCrystalFormation getEmCrystalFormation() {
        return (org.rcsb.cif.model.emcrystalformation.EmCrystalFormation) categories.computeIfAbsent("em_crystal_formation",
                org.rcsb.cif.model.emcrystalformation.EmCrystalFormation::new);
    }

    /**
     * Staining category
     * @return EmStaining
     */
    public org.rcsb.cif.model.emstaining.EmStaining getEmStaining() {
        return (org.rcsb.cif.model.emstaining.EmStaining) categories.computeIfAbsent("em_staining",
                org.rcsb.cif.model.emstaining.EmStaining::new);
    }

    /**
     * Data items to describe films supporting the specimen
     * @return EmSupportFilm
     */
    public org.rcsb.cif.model.emsupportfilm.EmSupportFilm getEmSupportFilm() {
        return (org.rcsb.cif.model.emsupportfilm.EmSupportFilm) categories.computeIfAbsent("em_support_film",
                org.rcsb.cif.model.emsupportfilm.EmSupportFilm::new);
    }

    /**
     * Buffer category
     * @return EmBufferComponent
     */
    public org.rcsb.cif.model.embuffercomponent.EmBufferComponent getEmBufferComponent() {
        return (org.rcsb.cif.model.embuffercomponent.EmBufferComponent) categories.computeIfAbsent("em_buffer_component",
                org.rcsb.cif.model.embuffercomponent.EmBufferComponent::new);
    }

    /**
     * Microscopy parameters relevant only for crystallography
     * @return EmDiffraction
     */
    public org.rcsb.cif.model.emdiffraction.EmDiffraction getEmDiffraction() {
        return (org.rcsb.cif.model.emdiffraction.EmDiffraction) categories.computeIfAbsent("em_diffraction",
                org.rcsb.cif.model.emdiffraction.EmDiffraction::new);
    }

    /**
     * Statistical parameters for electron diffraction measurements
     * within a resolution shell
     * @return EmDiffractionShell
     */
    public org.rcsb.cif.model.emdiffractionshell.EmDiffractionShell getEmDiffractionShell() {
        return (org.rcsb.cif.model.emdiffractionshell.EmDiffractionShell) categories.computeIfAbsent("em_diffraction_shell",
                org.rcsb.cif.model.emdiffractionshell.EmDiffractionShell::new);
    }

    /**
     * Statistical parameters for electron diffraction measurements
     * @return EmDiffractionStats
     */
    public org.rcsb.cif.model.emdiffractionstats.EmDiffractionStats getEmDiffractionStats() {
        return (org.rcsb.cif.model.emdiffractionstats.EmDiffractionStats) categories.computeIfAbsent("em_diffraction_stats",
                org.rcsb.cif.model.emdiffractionstats.EmDiffractionStats::new);
    }

    /**
     * Microscopy parameters only relevant for tomography
     * @return EmTomography
     */
    public org.rcsb.cif.model.emtomography.EmTomography getEmTomography() {
        return (org.rcsb.cif.model.emtomography.EmTomography) categories.computeIfAbsent("em_tomography",
                org.rcsb.cif.model.emtomography.EmTomography::new);
    }

    /**
     * Data items in the EM_IMAGE_RECORDING category record details
     * of the image recording (either film/microdensitometer or electronic detector)
     * and parameters for image digitization.
     * @return EmImageRecording
     */
    public org.rcsb.cif.model.emimagerecording.EmImageRecording getEmImageRecording() {
        return (org.rcsb.cif.model.emimagerecording.EmImageRecording) categories.computeIfAbsent("em_image_recording",
                org.rcsb.cif.model.emimagerecording.EmImageRecording::new);
    }

    /**
     * Description of a few specialist optics apparatus
     * @return EmImagingOptics
     */
    public org.rcsb.cif.model.emimagingoptics.EmImagingOptics getEmImagingOptics() {
        return (org.rcsb.cif.model.emimagingoptics.EmImagingOptics) categories.computeIfAbsent("em_imaging_optics",
                org.rcsb.cif.model.emimagingoptics.EmImagingOptics::new);
    }

    /**
     * Information about the final image classification
     * @return EmFinalClassification
     */
    public org.rcsb.cif.model.emfinalclassification.EmFinalClassification getEmFinalClassification() {
        return (org.rcsb.cif.model.emfinalclassification.EmFinalClassification) categories.computeIfAbsent("em_final_classification",
                org.rcsb.cif.model.emfinalclassification.EmFinalClassification::new);
    }

    /**
     * The startup model employed to begin refinement of the parameters for
     * a 3DEM reconstruction
     * @return EmStartModel
     */
    public org.rcsb.cif.model.emstartmodel.EmStartModel getEmStartModel() {
        return (org.rcsb.cif.model.emstartmodel.EmStartModel) categories.computeIfAbsent("em_start_model",
                org.rcsb.cif.model.emstartmodel.EmStartModel::new);
    }

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return EmSoftware
     */
    public org.rcsb.cif.model.emsoftware.EmSoftware getEmSoftware() {
        return (org.rcsb.cif.model.emsoftware.EmSoftware) categories.computeIfAbsent("em_software",
                org.rcsb.cif.model.emsoftware.EmSoftware::new);
    }

    /**
     * Category to describe the euler angle assignement
     * @return EmEulerAngleAssignment
     */
    public org.rcsb.cif.model.emeulerangleassignment.EmEulerAngleAssignment getEmEulerAngleAssignment() {
        return (org.rcsb.cif.model.emeulerangleassignment.EmEulerAngleAssignment) categories.computeIfAbsent("em_euler_angle_assignment",
                org.rcsb.cif.model.emeulerangleassignment.EmEulerAngleAssignment::new);
    }

    /**
     * Description of the Contrast Transfer Function (CTF) correction
     * @return EmCtfCorrection
     */
    public org.rcsb.cif.model.emctfcorrection.EmCtfCorrection getEmCtfCorrection() {
        return (org.rcsb.cif.model.emctfcorrection.EmCtfCorrection) categories.computeIfAbsent("em_ctf_correction",
                org.rcsb.cif.model.emctfcorrection.EmCtfCorrection::new);
    }

    /**
     * Volume selection in image processing
     * @return EmVolumeSelection
     */
    public org.rcsb.cif.model.emvolumeselection.EmVolumeSelection getEmVolumeSelection() {
        return (org.rcsb.cif.model.emvolumeselection.EmVolumeSelection) categories.computeIfAbsent("em_volume_selection",
                org.rcsb.cif.model.emvolumeselection.EmVolumeSelection::new);
    }

    /**
     * Data items in the EM_SYMMETRY_3DX category record
     * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
     * @return Em3dCrystalEntity
     */
    public org.rcsb.cif.model.em3dcrystalentity.Em3dCrystalEntity getEm3dCrystalEntity() {
        return (org.rcsb.cif.model.em3dcrystalentity.Em3dCrystalEntity) categories.computeIfAbsent("em_3d_crystal_entity",
                org.rcsb.cif.model.em3dcrystalentity.Em3dCrystalEntity::new);
    }

    /**
     * Data items in the EM_SYMMETRY_2DX category record
     * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
     * @return Em2dCrystalEntity
     */
    public org.rcsb.cif.model.em2dcrystalentity.Em2dCrystalEntity getEm2dCrystalEntity() {
        return (org.rcsb.cif.model.em2dcrystalentity.Em2dCrystalEntity) categories.computeIfAbsent("em_2d_crystal_entity",
                org.rcsb.cif.model.em2dcrystalentity.Em2dCrystalEntity::new);
    }

    /**
     * Data items in the EM_IMAGE_PROCESSING category
     * record details of the EM image processing procedure.
     * @return EmImageProcessing
     */
    public org.rcsb.cif.model.emimageprocessing.EmImageProcessing getEmImageProcessing() {
        return (org.rcsb.cif.model.emimageprocessing.EmImageProcessing) categories.computeIfAbsent("em_image_processing",
                org.rcsb.cif.model.emimageprocessing.EmImageProcessing::new);
    }

    /**
     * Data items in this category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return EmParticleSelection
     */
    public org.rcsb.cif.model.emparticleselection.EmParticleSelection getEmParticleSelection() {
        return (org.rcsb.cif.model.emparticleselection.EmParticleSelection) categories.computeIfAbsent("em_particle_selection",
                org.rcsb.cif.model.emparticleselection.EmParticleSelection::new);
    }

    /**
     * Data items in the EMD_MAP category record parameters of the CCP4 binary-format map file header
     * (see ftp://ftp.wwpdb.org/pub/emdb/doc/map_format/EMDB_mapFormat_v1.0.pdf),
     * parameters derived from the map header, pixel size, contour level, and annotation details from the depositor.
     * The map is a three-dimensional array of data-values of the same data-type.
     * Important parameters are data-type and  array size in three dimensions
     * (i.e. the number of columns, rows and sections).
     * Columns are the fastest changing, followed by rows and sections.
     * @return EmMap
     */
    public org.rcsb.cif.model.emmap.EmMap getEmMap() {
        return (org.rcsb.cif.model.emmap.EmMap) categories.computeIfAbsent("em_map",
                org.rcsb.cif.model.emmap.EmMap::new);
    }

    /**
     * Data items in the EMD_VALIDATION_FSC_CURVE category
     * record details of the Fourier Shell Correlation (FSC) curve file.
     * @return EmFscCurve
     */
    public org.rcsb.cif.model.emfsccurve.EmFscCurve getEmFscCurve() {
        return (org.rcsb.cif.model.emfsccurve.EmFscCurve) categories.computeIfAbsent("em_fsc_curve",
                org.rcsb.cif.model.emfsccurve.EmFscCurve::new);
    }

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmInterpretFigure
     */
    public org.rcsb.cif.model.eminterpretfigure.EmInterpretFigure getEmInterpretFigure() {
        return (org.rcsb.cif.model.eminterpretfigure.EmInterpretFigure) categories.computeIfAbsent("em_interpret_figure",
                org.rcsb.cif.model.eminterpretfigure.EmInterpretFigure::new);
    }

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmLayerLines
     */
    public org.rcsb.cif.model.emlayerlines.EmLayerLines getEmLayerLines() {
        return (org.rcsb.cif.model.emlayerlines.EmLayerLines) categories.computeIfAbsent("em_layer_lines",
                org.rcsb.cif.model.emlayerlines.EmLayerLines::new);
    }

    /**
     * Listing of all structure factor files associated with the EM entry
     * @return EmStructureFactors
     */
    public org.rcsb.cif.model.emstructurefactors.EmStructureFactors getEmStructureFactors() {
        return (org.rcsb.cif.model.emstructurefactors.EmStructureFactors) categories.computeIfAbsent("em_structure_factors",
                org.rcsb.cif.model.emstructurefactors.EmStructureFactors::new);
    }

    /**
     * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
     * that are provided by the depositor
     * @return EmDepositorInfo
     */
    public org.rcsb.cif.model.emdepositorinfo.EmDepositorInfo getEmDepositorInfo() {
        return (org.rcsb.cif.model.emdepositorinfo.EmDepositorInfo) categories.computeIfAbsent("em_depositor_info",
                org.rcsb.cif.model.emdepositorinfo.EmDepositorInfo::new);
    }

    /**
     * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
     * that are provided by the depositor
     * @return EmMapDepositorInfo
     */
    public org.rcsb.cif.model.emmapdepositorinfo.EmMapDepositorInfo getEmMapDepositorInfo() {
        return (org.rcsb.cif.model.emmapdepositorinfo.EmMapDepositorInfo) categories.computeIfAbsent("em_map_depositor_info",
                org.rcsb.cif.model.emmapdepositorinfo.EmMapDepositorInfo::new);
    }

    /**
     * Data items in the EM_MASK_DEPOSITOR_INFO category record mask parameters
     * that are provided by the depositor
     * @return EmMaskDepositorInfo
     */
    public org.rcsb.cif.model.emmaskdepositorinfo.EmMaskDepositorInfo getEmMaskDepositorInfo() {
        return (org.rcsb.cif.model.emmaskdepositorinfo.EmMaskDepositorInfo) categories.computeIfAbsent("em_mask_depositor_info",
                org.rcsb.cif.model.emmaskdepositorinfo.EmMaskDepositorInfo::new);
    }

    /**
     * Listing of image files (figures) associated with an EMDB entry
     * @return EmFigureDepositorInfo
     */
    public org.rcsb.cif.model.emfiguredepositorinfo.EmFigureDepositorInfo getEmFigureDepositorInfo() {
        return (org.rcsb.cif.model.emfiguredepositorinfo.EmFigureDepositorInfo) categories.computeIfAbsent("em_figure_depositor_info",
                org.rcsb.cif.model.emfiguredepositorinfo.EmFigureDepositorInfo::new);
    }

    /**
     * Listing of layer line files associated with the EM entry
     * @return EmLayerLinesDepositorInfo
     */
    public org.rcsb.cif.model.emlayerlinesdepositorinfo.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo() {
        return (org.rcsb.cif.model.emlayerlinesdepositorinfo.EmLayerLinesDepositorInfo) categories.computeIfAbsent("em_layer_lines_depositor_info",
                org.rcsb.cif.model.emlayerlinesdepositorinfo.EmLayerLinesDepositorInfo::new);
    }

    /**
     * Structure factor files associated with the EM entry
     * @return EmStructureFactorsDepositorInfo
     */
    public org.rcsb.cif.model.emstructurefactorsdepositorinfo.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo() {
        return (org.rcsb.cif.model.emstructurefactorsdepositorinfo.EmStructureFactorsDepositorInfo) categories.computeIfAbsent("em_structure_factors_depositor_info",
                org.rcsb.cif.model.emstructurefactorsdepositorinfo.EmStructureFactorsDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
     * details about the mapping sample and coordinate sequences.
     * @return PdbxSeqMapDepositorInfo
     */
    public org.rcsb.cif.model.pdbxseqmapdepositorinfo.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo() {
        return (org.rcsb.cif.model.pdbxseqmapdepositorinfo.PdbxSeqMapDepositorInfo) categories.computeIfAbsent("pdbx_seq_map_depositor_info",
                org.rcsb.cif.model.pdbxseqmapdepositorinfo.PdbxSeqMapDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
     * details provided by depositors about deposited chemical components.
     * @return PdbxChemCompDepositorInfo
     */
    public org.rcsb.cif.model.pdbxchemcompdepositorinfo.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo() {
        return (org.rcsb.cif.model.pdbxchemcompdepositorinfo.PdbxChemCompDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_depositor_info",
                org.rcsb.cif.model.pdbxchemcompdepositorinfo.PdbxChemCompDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ.
     * @return PdbxStructRefSeqDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructrefseqdepositorinfo.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructrefseqdepositorinfo.PdbxStructRefSeqDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_depositor_info",
                org.rcsb.cif.model.pdbxstructrefseqdepositorinfo.PdbxStructRefSeqDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ_DIF.
     * @return PdbxStructRefSeqDifDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructrefseqdifdepositorinfo.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructrefseqdifdepositorinfo.PdbxStructRefSeqDifDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_dif_depositor_info",
                org.rcsb.cif.model.pdbxstructrefseqdifdepositorinfo.PdbxStructRefSeqDifDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_PROP.
     * @return PdbxStructAssemblyPropDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructassemblypropdepositorinfo.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructassemblypropdepositorinfo.PdbxStructAssemblyPropDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_prop_depositor_info",
                org.rcsb.cif.model.pdbxstructassemblypropdepositorinfo.PdbxStructAssemblyPropDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY.
     * @return PdbxStructAssemblyDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructassemblydepositorinfo.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructassemblydepositorinfo.PdbxStructAssemblyDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_depositor_info",
                org.rcsb.cif.model.pdbxstructassemblydepositorinfo.PdbxStructAssemblyDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_GEN.
     * @return PdbxStructAssemblyGenDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructassemblygendepositorinfo.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructassemblygendepositorinfo.PdbxStructAssemblyGenDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_gen_depositor_info",
                org.rcsb.cif.model.pdbxstructassemblygendepositorinfo.PdbxStructAssemblyGenDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_OPER_LIST.
     * @return PdbxStructOperListDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructoperlistdepositorinfo.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructoperlistdepositorinfo.PdbxStructOperListDepositorInfo) categories.computeIfAbsent("pdbx_struct_oper_list_depositor_info",
                org.rcsb.cif.model.pdbxstructoperlistdepositorinfo.PdbxStructOperListDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_POINT_SYMMETRY.
     * @return PdbxPointSymmetryDepositorInfo
     */
    public org.rcsb.cif.model.pdbxpointsymmetrydepositorinfo.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.pdbxpointsymmetrydepositorinfo.PdbxPointSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_point_symmetry_depositor_info",
                org.rcsb.cif.model.pdbxpointsymmetrydepositorinfo.PdbxPointSymmetryDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_HELICAL_SYMMETRY.
     * @return PdbxHelicalSymmetryDepositorInfo
     */
    public org.rcsb.cif.model.pdbxhelicalsymmetrydepositorinfo.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.pdbxhelicalsymmetrydepositorinfo.PdbxHelicalSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_helical_symmetry_depositor_info",
                org.rcsb.cif.model.pdbxhelicalsymmetrydepositorinfo.PdbxHelicalSymmetryDepositorInfo::new);
    }

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidenceDepositorInfo
     */
    public org.rcsb.cif.model.pdbxstructassemblyauthevidencedepositorinfo.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return (org.rcsb.cif.model.pdbxstructassemblyauthevidencedepositorinfo.PdbxStructAssemblyAuthEvidenceDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence_depositor_info",
                org.rcsb.cif.model.pdbxstructassemblyauthevidencedepositorinfo.PdbxStructAssemblyAuthEvidenceDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
     * mapping information between solvent atoms before and after symmetry
     * repositioning.
     * @return PdbxSolventAtomSiteMapping
     */
    public org.rcsb.cif.model.pdbxsolventatomsitemapping.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping() {
        return (org.rcsb.cif.model.pdbxsolventatomsitemapping.PdbxSolventAtomSiteMapping) categories.computeIfAbsent("pdbx_solvent_atom_site_mapping",
                org.rcsb.cif.model.pdbxsolventatomsitemapping.PdbxSolventAtomSiteMapping::new);
    }

    /**
     * Data items in the PDBX_MOLECULE_FEATURES_DEPOSITOR_INFO  category capture
     * depositor provided information related to the archival cateogory
     * PDBX_MOLECULE_FEATURES.
     * @return PdbxMoleculeFeaturesDepositorInfo
     */
    public org.rcsb.cif.model.pdbxmoleculefeaturesdepositorinfo.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo() {
        return (org.rcsb.cif.model.pdbxmoleculefeaturesdepositorinfo.PdbxMoleculeFeaturesDepositorInfo) categories.computeIfAbsent("pdbx_molecule_features_depositor_info",
                org.rcsb.cif.model.pdbxmoleculefeaturesdepositorinfo.PdbxMoleculeFeaturesDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
     * depositor provided information about the chemical context of component instances.
     * @return PdbxChemCompInstanceDepositorInfo
     */
    public org.rcsb.cif.model.pdbxchemcompinstancedepositorinfo.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo() {
        return (org.rcsb.cif.model.pdbxchemcompinstancedepositorinfo.PdbxChemCompInstanceDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_instance_depositor_info",
                org.rcsb.cif.model.pdbxchemcompinstancedepositorinfo.PdbxChemCompInstanceDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
     * details used to maintain state within the wwPDB deposition system.
     * @return PdbxDepuiStatusFlags
     */
    public org.rcsb.cif.model.pdbxdepuistatusflags.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags() {
        return (org.rcsb.cif.model.pdbxdepuistatusflags.PdbxDepuiStatusFlags) categories.computeIfAbsent("pdbx_depui_status_flags",
                org.rcsb.cif.model.pdbxdepuistatusflags.PdbxDepuiStatusFlags::new);
    }

    /**
     * Data items in the PDBX_DEPUI_UPLOAD category record the
     * details of uploaded data files.
     * @return PdbxDepuiUpload
     */
    public org.rcsb.cif.model.pdbxdepuiupload.PdbxDepuiUpload getPdbxDepuiUpload() {
        return (org.rcsb.cif.model.pdbxdepuiupload.PdbxDepuiUpload) categories.computeIfAbsent("pdbx_depui_upload",
                org.rcsb.cif.model.pdbxdepuiupload.PdbxDepuiUpload::new);
    }

    /**
     * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
     * details that assess the status of selected validation diagnostics.
     * @return PdbxDepuiValidationStatusFlags
     */
    public org.rcsb.cif.model.pdbxdepuivalidationstatusflags.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags() {
        return (org.rcsb.cif.model.pdbxdepuivalidationstatusflags.PdbxDepuiValidationStatusFlags) categories.computeIfAbsent("pdbx_depui_validation_status_flags",
                org.rcsb.cif.model.pdbxdepuivalidationstatusflags.PdbxDepuiValidationStatusFlags::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
     * details of the uploaded files related to depositor provided chemical assignments.
     * @return PdbxChemCompUploadDepositorInfo
     */
    public org.rcsb.cif.model.pdbxchemcompuploaddepositorinfo.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo() {
        return (org.rcsb.cif.model.pdbxchemcompuploaddepositorinfo.PdbxChemCompUploadDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_upload_depositor_info",
                org.rcsb.cif.model.pdbxchemcompuploaddepositorinfo.PdbxChemCompUploadDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
     * details related to individual entities.
     * @return PdbxDepuiEntityStatusFlags
     */
    public org.rcsb.cif.model.pdbxdepuientitystatusflags.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags() {
        return (org.rcsb.cif.model.pdbxdepuientitystatusflags.PdbxDepuiEntityStatusFlags) categories.computeIfAbsent("pdbx_depui_entity_status_flags",
                org.rcsb.cif.model.pdbxdepuientitystatusflags.PdbxDepuiEntityStatusFlags::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
     * details related to the features of individual entities.
     * @return PdbxDepuiEntityFeatures
     */
    public org.rcsb.cif.model.pdbxdepuientityfeatures.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures() {
        return (org.rcsb.cif.model.pdbxdepuientityfeatures.PdbxDepuiEntityFeatures) categories.computeIfAbsent("pdbx_depui_entity_features",
                org.rcsb.cif.model.pdbxdepuientityfeatures.PdbxDepuiEntityFeatures::new);
    }

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
     * within the depositon and annotation system.
     * @return PdbxDepositionMessageInfo
     */
    public org.rcsb.cif.model.pdbxdepositionmessageinfo.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo() {
        return (org.rcsb.cif.model.pdbxdepositionmessageinfo.PdbxDepositionMessageInfo) categories.computeIfAbsent("pdbx_deposition_message_info",
                org.rcsb.cif.model.pdbxdepositionmessageinfo.PdbxDepositionMessageInfo::new);
    }

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
     * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
     * data category.
     * @return PdbxDepositionMessageFileReference
     */
    public org.rcsb.cif.model.pdbxdepositionmessagefilereference.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference() {
        return (org.rcsb.cif.model.pdbxdepositionmessagefilereference.PdbxDepositionMessageFileReference) categories.computeIfAbsent("pdbx_deposition_message_file_reference",
                org.rcsb.cif.model.pdbxdepositionmessagefilereference.PdbxDepositionMessageFileReference::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
     * information required to identify the depositor and route
     * deposition to an appropriate processing site.
     * @return PdbxDepuiEntryDetails
     */
    public org.rcsb.cif.model.pdbxdepuientrydetails.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails() {
        return (org.rcsb.cif.model.pdbxdepuientrydetails.PdbxDepuiEntryDetails) categories.computeIfAbsent("pdbx_depui_entry_details",
                org.rcsb.cif.model.pdbxdepuientrydetails.PdbxDepuiEntryDetails::new);
    }

    /**
     * Data items in the PDBX_DATA_PROCESSING_STATUS category record
     * data processing instructions for workflow processing tasks.
     * @return PdbxDataProcessingStatus
     */
    public org.rcsb.cif.model.pdbxdataprocessingstatus.PdbxDataProcessingStatus getPdbxDataProcessingStatus() {
        return (org.rcsb.cif.model.pdbxdataprocessingstatus.PdbxDataProcessingStatus) categories.computeIfAbsent("pdbx_data_processing_status",
                org.rcsb.cif.model.pdbxdataprocessingstatus.PdbxDataProcessingStatus::new);
    }

    /**
     * Data items in the pdbx_entity_instance_feature category records
     * special features of selected entity instances.
     * @return PdbxEntityInstanceFeature
     */
    public org.rcsb.cif.model.pdbxentityinstancefeature.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature() {
        return (org.rcsb.cif.model.pdbxentityinstancefeature.PdbxEntityInstanceFeature) categories.computeIfAbsent("pdbx_entity_instance_feature",
                org.rcsb.cif.model.pdbxentityinstancefeature.PdbxEntityInstanceFeature::new);
    }

    /**
     * Data items in the PDBX_ENTITY_SRC_GEN_DEPOSITOR_INFO category record details of
     * the source from which the entity was obtained in cases
     * where the source was genetically manipulated.  The
     * following are treated separately:  items pertaining to the tissue
     * from which the gene was obtained, items pertaining to the host
     * organism for gene expression and items pertaining to the actual
     * producing organism (plasmid).
     * @return PdbxEntitySrcGenDepositorInfo
     */
    public org.rcsb.cif.model.pdbxentitysrcgendepositorinfo.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo() {
        return (org.rcsb.cif.model.pdbxentitysrcgendepositorinfo.PdbxEntitySrcGenDepositorInfo) categories.computeIfAbsent("pdbx_entity_src_gen_depositor_info",
                org.rcsb.cif.model.pdbxentitysrcgendepositorinfo.PdbxEntitySrcGenDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
     * of the chemical component model instances.
     * @return PdbxChemCompModel
     */
    public org.rcsb.cif.model.pdbxchemcompmodel.PdbxChemCompModel getPdbxChemCompModel() {
        return (org.rcsb.cif.model.pdbxchemcompmodel.PdbxChemCompModel) categories.computeIfAbsent("pdbx_chem_comp_model",
                org.rcsb.cif.model.pdbxchemcompmodel.PdbxChemCompModel::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
     * for the chemical component model instance.
     * @return PdbxChemCompModelAtom
     */
    public org.rcsb.cif.model.pdbxchemcompmodelatom.PdbxChemCompModelAtom getPdbxChemCompModelAtom() {
        return (org.rcsb.cif.model.pdbxchemcompmodelatom.PdbxChemCompModelAtom) categories.computeIfAbsent("pdbx_chem_comp_model_atom",
                org.rcsb.cif.model.pdbxchemcompmodelatom.PdbxChemCompModelAtom::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
     * the bonds between atoms in a chemical component model instance.
     * @return PdbxChemCompModelBond
     */
    public org.rcsb.cif.model.pdbxchemcompmodelbond.PdbxChemCompModelBond getPdbxChemCompModelBond() {
        return (org.rcsb.cif.model.pdbxchemcompmodelbond.PdbxChemCompModelBond) categories.computeIfAbsent("pdbx_chem_comp_model_bond",
                org.rcsb.cif.model.pdbxchemcompmodelbond.PdbxChemCompModelBond::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelFeature
     */
    public org.rcsb.cif.model.pdbxchemcompmodelfeature.PdbxChemCompModelFeature getPdbxChemCompModelFeature() {
        return (org.rcsb.cif.model.pdbxchemcompmodelfeature.PdbxChemCompModelFeature) categories.computeIfAbsent("pdbx_chem_comp_model_feature",
                org.rcsb.cif.model.pdbxchemcompmodelfeature.PdbxChemCompModelFeature::new);
    }

    /**
     * Data items in the CHEM_COMP_MODEL_DESCRIPTOR category provide
     * string descriptors for component model structures.
     * @return PdbxChemCompModelDescriptor
     */
    public org.rcsb.cif.model.pdbxchemcompmodeldescriptor.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor() {
        return (org.rcsb.cif.model.pdbxchemcompmodeldescriptor.PdbxChemCompModelDescriptor) categories.computeIfAbsent("pdbx_chem_comp_model_descriptor",
                org.rcsb.cif.model.pdbxchemcompmodeldescriptor.PdbxChemCompModelDescriptor::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
     * the status and tracking information for this component model instance.
     * @return PdbxChemCompModelAudit
     */
    public org.rcsb.cif.model.pdbxchemcompmodelaudit.PdbxChemCompModelAudit getPdbxChemCompModelAudit() {
        return (org.rcsb.cif.model.pdbxchemcompmodelaudit.PdbxChemCompModelAudit) categories.computeIfAbsent("pdbx_chem_comp_model_audit",
                org.rcsb.cif.model.pdbxchemcompmodelaudit.PdbxChemCompModelAudit::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelReference
     */
    public org.rcsb.cif.model.pdbxchemcompmodelreference.PdbxChemCompModelReference getPdbxChemCompModelReference() {
        return (org.rcsb.cif.model.pdbxchemcompmodelreference.PdbxChemCompModelReference) categories.computeIfAbsent("pdbx_chem_comp_model_reference",
                org.rcsb.cif.model.pdbxchemcompmodelreference.PdbxChemCompModelReference::new);
    }

    /**
     * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
     * of related mmCIF categories.  Views provide a vehicle for
     * presenting different logical arrangements of dictionary contents.
     * @return PdbxViewCategoryGroup
     */
    public org.rcsb.cif.model.pdbxviewcategorygroup.PdbxViewCategoryGroup getPdbxViewCategoryGroup() {
        return (org.rcsb.cif.model.pdbxviewcategorygroup.PdbxViewCategoryGroup) categories.computeIfAbsent("pdbx_view_category_group",
                org.rcsb.cif.model.pdbxviewcategorygroup.PdbxViewCategoryGroup::new);
    }

    /**
     * Data items in the PDBX_VIEW_CATEGORY specify the categories
     * belonging to a category view group.  An alias name for the
     * the mmCIF category may also be specified for the each
     * category in the view.
     * @return PdbxViewCategory
     */
    public org.rcsb.cif.model.pdbxviewcategory.PdbxViewCategory getPdbxViewCategory() {
        return (org.rcsb.cif.model.pdbxviewcategory.PdbxViewCategory) categories.computeIfAbsent("pdbx_view_category",
                org.rcsb.cif.model.pdbxviewcategory.PdbxViewCategory::new);
    }

    /**
     * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
     * belonging to a view category.  An alias name for the
     * the mmCIF item may be specified for the each item in the
     * view category.  The role of the item in the view category
     * can be designated as mandatory, optional, or hidden.
     * @return PdbxViewItem
     */
    public org.rcsb.cif.model.pdbxviewitem.PdbxViewItem getPdbxViewItem() {
        return (org.rcsb.cif.model.pdbxviewitem.PdbxViewItem) categories.computeIfAbsent("pdbx_view_item",
                org.rcsb.cif.model.pdbxviewitem.PdbxViewItem::new);
    }

    /**
     * Gives information about what kind of coordinates are available.
     * @return PdbxCoord
     */
    public org.rcsb.cif.model.pdbxcoord.PdbxCoord getPdbxCoord() {
        return (org.rcsb.cif.model.pdbxcoord.PdbxCoord) categories.computeIfAbsent("pdbx_coord",
                org.rcsb.cif.model.pdbxcoord.PdbxCoord::new);
    }

    /**
     * Local data items describing ligand and monomer
     * chemical features.
     * @return PdbxConnect
     */
    public org.rcsb.cif.model.pdbxconnect.PdbxConnect getPdbxConnect() {
        return (org.rcsb.cif.model.pdbxconnect.PdbxConnect) categories.computeIfAbsent("pdbx_connect",
                org.rcsb.cif.model.pdbxconnect.PdbxConnect::new);
    }

    /**
     * Local data items describing ligand and monomer
     * type information.
     * @return PdbxConnectType
     */
    public org.rcsb.cif.model.pdbxconnecttype.PdbxConnectType getPdbxConnectType() {
        return (org.rcsb.cif.model.pdbxconnecttype.PdbxConnectType) categories.computeIfAbsent("pdbx_connect_type",
                org.rcsb.cif.model.pdbxconnecttype.PdbxConnectType::new);
    }

    /**
     * Local data items describing ligand and monomer
     * modifications.
     * @return PdbxConnectModification
     */
    public org.rcsb.cif.model.pdbxconnectmodification.PdbxConnectModification getPdbxConnectModification() {
        return (org.rcsb.cif.model.pdbxconnectmodification.PdbxConnectModification) categories.computeIfAbsent("pdbx_connect_modification",
                org.rcsb.cif.model.pdbxconnectmodification.PdbxConnectModification::new);
    }

    /**
     * Local data items describing ligand and monomer
     * atom names and connectivity.
     * @return PdbxConnectAtom
     */
    public org.rcsb.cif.model.pdbxconnectatom.PdbxConnectAtom getPdbxConnectAtom() {
        return (org.rcsb.cif.model.pdbxconnectatom.PdbxConnectAtom) categories.computeIfAbsent("pdbx_connect_atom",
                org.rcsb.cif.model.pdbxconnectatom.PdbxConnectAtom::new);
    }

    /**
     * The PDBX_DATABASE_PDB_MASTER category provides placeholders
     * for the count of various PDB record types.
     * @return PdbxDatabasePDBMaster
     */
    public org.rcsb.cif.model.pdbxdatabasepdbmaster.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster() {
        return (org.rcsb.cif.model.pdbxdatabasepdbmaster.PdbxDatabasePDBMaster) categories.computeIfAbsent("pdbx_database_PDB_master",
                org.rcsb.cif.model.pdbxdatabasepdbmaster.PdbxDatabasePDBMaster::new);
    }

    /**
     *
     * Data items in the PDBX_DATABASE_PDB_OMIT category record
     * list PDB record names that should be omitted in the PDB
     * format file.
     * @return PdbxDatabasePdbOmit
     */
    public org.rcsb.cif.model.pdbxdatabasepdbomit.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit() {
        return (org.rcsb.cif.model.pdbxdatabasepdbomit.PdbxDatabasePdbOmit) categories.computeIfAbsent("pdbx_database_pdb_omit",
                org.rcsb.cif.model.pdbxdatabasepdbomit.PdbxDatabasePdbOmit::new);
    }

    /**
     * These records are used in the DBREF record of a PDB file and
     * are used as place holders for NDB ID's in PDB files.
     * @return PdbxDbref
     */
    public org.rcsb.cif.model.pdbxdbref.PdbxDbref getPdbxDbref() {
        return (org.rcsb.cif.model.pdbxdbref.PdbxDbref) categories.computeIfAbsent("pdbx_dbref",
                org.rcsb.cif.model.pdbxdbref.PdbxDbref::new);
    }

    /**
     * Data items in the PDBX_DRUG_INFO category are still used until
     * the 'entity' categories are entered into the database, even
     * though the information is repeated.
     * @return PdbxDrugInfo
     */
    public org.rcsb.cif.model.pdbxdruginfo.PdbxDrugInfo getPdbxDrugInfo() {
        return (org.rcsb.cif.model.pdbxdruginfo.PdbxDrugInfo) categories.computeIfAbsent("pdbx_drug_info",
                org.rcsb.cif.model.pdbxdruginfo.PdbxDrugInfo::new);
    }

    /**
     * Data items in the PDBX_INHIBITOR_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * inhibitor is repeated.
     * @return PdbxInhibitorInfo
     */
    public org.rcsb.cif.model.pdbxinhibitorinfo.PdbxInhibitorInfo getPdbxInhibitorInfo() {
        return (org.rcsb.cif.model.pdbxinhibitorinfo.PdbxInhibitorInfo) categories.computeIfAbsent("pdbx_inhibitor_info",
                org.rcsb.cif.model.pdbxinhibitorinfo.PdbxInhibitorInfo::new);
    }

    /**
     * Data items in the PDBX_ION_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxIonInfo
     */
    public org.rcsb.cif.model.pdbxioninfo.PdbxIonInfo getPdbxIonInfo() {
        return (org.rcsb.cif.model.pdbxioninfo.PdbxIonInfo) categories.computeIfAbsent("pdbx_ion_info",
                org.rcsb.cif.model.pdbxioninfo.PdbxIonInfo::new);
    }

    /**
     * Data items in the PDBX_HYBRID category are used to describe the chimeric
     * characteristics of a DNA/RNA structure.
     * @return PdbxHybrid
     */
    public org.rcsb.cif.model.pdbxhybrid.PdbxHybrid getPdbxHybrid() {
        return (org.rcsb.cif.model.pdbxhybrid.PdbxHybrid) categories.computeIfAbsent("pdbx_hybrid",
                org.rcsb.cif.model.pdbxhybrid.PdbxHybrid::new);
    }

    /**
     * Data items in the PDBX_NA_STRAND_INFO category are still used until
     * the 'entity' categories are entered into the database, even though
     * the information is repeated.
     * @return PdbxNaStrandInfo
     */
    public org.rcsb.cif.model.pdbxnastrandinfo.PdbxNaStrandInfo getPdbxNaStrandInfo() {
        return (org.rcsb.cif.model.pdbxnastrandinfo.PdbxNaStrandInfo) categories.computeIfAbsent("pdbx_na_strand_info",
                org.rcsb.cif.model.pdbxnastrandinfo.PdbxNaStrandInfo::new);
    }

    /**
     * The information in this category is exclusively used to store
     * the HET records of a PDB file.  This record will be generated
     * by the PROGRAM.
     * @return PdbxNonstandardList
     */
    public org.rcsb.cif.model.pdbxnonstandardlist.PdbxNonstandardList getPdbxNonstandardList() {
        return (org.rcsb.cif.model.pdbxnonstandardlist.PdbxNonstandardList) categories.computeIfAbsent("pdbx_nonstandard_list",
                org.rcsb.cif.model.pdbxnonstandardlist.PdbxNonstandardList::new);
    }

    /**
     * This is a place holder for the PDB COMPND.
     * @return PdbxPdbCompnd
     */
    public org.rcsb.cif.model.pdbxpdbcompnd.PdbxPdbCompnd getPdbxPdbCompnd() {
        return (org.rcsb.cif.model.pdbxpdbcompnd.PdbxPdbCompnd) categories.computeIfAbsent("pdbx_pdb_compnd",
                org.rcsb.cif.model.pdbxpdbcompnd.PdbxPdbCompnd::new);
    }

    /**
     * This is a place holder for the PDB SOURCE.
     * @return PdbxPdbSource
     */
    public org.rcsb.cif.model.pdbxpdbsource.PdbxPdbSource getPdbxPdbSource() {
        return (org.rcsb.cif.model.pdbxpdbsource.PdbxPdbSource) categories.computeIfAbsent("pdbx_pdb_source",
                org.rcsb.cif.model.pdbxpdbsource.PdbxPdbSource::new);
    }

    /**
     * Data items in the PDBX_PROTEIN_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxProteinInfo
     */
    public org.rcsb.cif.model.pdbxproteininfo.PdbxProteinInfo getPdbxProteinInfo() {
        return (org.rcsb.cif.model.pdbxproteininfo.PdbxProteinInfo) categories.computeIfAbsent("pdbx_protein_info",
                org.rcsb.cif.model.pdbxproteininfo.PdbxProteinInfo::new);
    }

    /**
     * Data items in the PDBX_SOLVENT_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxSolventInfo
     */
    public org.rcsb.cif.model.pdbxsolventinfo.PdbxSolventInfo getPdbxSolventInfo() {
        return (org.rcsb.cif.model.pdbxsolventinfo.PdbxSolventInfo) categories.computeIfAbsent("pdbx_solvent_info",
                org.rcsb.cif.model.pdbxsolventinfo.PdbxSolventInfo::new);
    }

    /**
     * Data item will still be used until the ENTITY category is fully
     * adopted by NDBQuery.
     * @return PdbxSource
     */
    public org.rcsb.cif.model.pdbxsource.PdbxSource getPdbxSource() {
        return (org.rcsb.cif.model.pdbxsource.PdbxSource) categories.computeIfAbsent("pdbx_source",
                org.rcsb.cif.model.pdbxsource.PdbxSource::new);
    }

    /**
     * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
     * the function of a particular biological assembly.
     * @return PdbxStructBiolFunc
     */
    public org.rcsb.cif.model.pdbxstructbiolfunc.PdbxStructBiolFunc getPdbxStructBiolFunc() {
        return (org.rcsb.cif.model.pdbxstructbiolfunc.PdbxStructBiolFunc) categories.computeIfAbsent("pdbx_struct_biol_func",
                org.rcsb.cif.model.pdbxstructbiolfunc.PdbxStructBiolFunc::new);
    }

    /**
     * Data items in the PDBX_STRUCT_PACK_GEN category record details about
     * the generation of the packing picture(s).
     * @return PdbxStructPackGen
     */
    public org.rcsb.cif.model.pdbxstructpackgen.PdbxStructPackGen getPdbxStructPackGen() {
        return (org.rcsb.cif.model.pdbxstructpackgen.PdbxStructPackGen) categories.computeIfAbsent("pdbx_struct_pack_gen",
                org.rcsb.cif.model.pdbxstructpackgen.PdbxStructPackGen::new);
    }

    /**
     * Data items in the PDBX_TRNA_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * T-RNA is repeated.
     * @return PdbxTrnaInfo
     */
    public org.rcsb.cif.model.pdbxtrnainfo.PdbxTrnaInfo getPdbxTrnaInfo() {
        return (org.rcsb.cif.model.pdbxtrnainfo.PdbxTrnaInfo) categories.computeIfAbsent("pdbx_trna_info",
                org.rcsb.cif.model.pdbxtrnainfo.PdbxTrnaInfo::new);
    }

    /**
     * These records give information about residues which do not pair
     * (h-bond) in the asymmetric unit.
     *
     * The records about Watson-Crick base pairing depend on these
     * records.
     * @return PdbxUnpair
     */
    public org.rcsb.cif.model.pdbxunpair.PdbxUnpair getPdbxUnpair() {
        return (org.rcsb.cif.model.pdbxunpair.PdbxUnpair) categories.computeIfAbsent("pdbx_unpair",
                org.rcsb.cif.model.pdbxunpair.PdbxUnpair::new);
    }

    /**
     * Holds details of NCS restraints in cases where multiple
     * conditions are provided for each domain.
     * @return PdbxRefineLsRestrNcs
     */
    public org.rcsb.cif.model.pdbxrefinelsrestrncs.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs() {
        return (org.rcsb.cif.model.pdbxrefinelsrestrncs.PdbxRefineLsRestrNcs) categories.computeIfAbsent("pdbx_refine_ls_restr_ncs",
                org.rcsb.cif.model.pdbxrefinelsrestrncs.PdbxRefineLsRestrNcs::new);
    }

    /**
     * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
     * about the generation of virus structures from NCS matrix operators.
     * @return PdbxStructNcsVirusGen
     */
    public org.rcsb.cif.model.pdbxstructncsvirusgen.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen() {
        return (org.rcsb.cif.model.pdbxstructncsvirusgen.PdbxStructNcsVirusGen) categories.computeIfAbsent("pdbx_struct_ncs_virus_gen",
                org.rcsb.cif.model.pdbxstructncsvirusgen.PdbxStructNcsVirusGen::new);
    }

    /**
     * PDBX_SEQUENCE_ANNOTATION holds internal details about molecular sequences
     * described in the context of PDB chains.
     * @return PdbxSequenceAnnotation
     */
    public org.rcsb.cif.model.pdbxsequenceannotation.PdbxSequenceAnnotation getPdbxSequenceAnnotation() {
        return (org.rcsb.cif.model.pdbxsequenceannotation.PdbxSequenceAnnotation) categories.computeIfAbsent("pdbx_sequence_annotation",
                org.rcsb.cif.model.pdbxsequenceannotation.PdbxSequenceAnnotation::new);
    }

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS identify
     * problems or errors encountered in the post-processing
     * of this entry.
     * @return PdbxPostProcessDetails
     */
    public org.rcsb.cif.model.pdbxpostprocessdetails.PdbxPostProcessDetails getPdbxPostProcessDetails() {
        return (org.rcsb.cif.model.pdbxpostprocessdetails.PdbxPostProcessDetails) categories.computeIfAbsent("pdbx_post_process_details",
                org.rcsb.cif.model.pdbxpostprocessdetails.PdbxPostProcessDetails::new);
    }

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS record
     * the status of post-processed entries.
     * @return PdbxPostProcessStatus
     */
    public org.rcsb.cif.model.pdbxpostprocessstatus.PdbxPostProcessStatus getPdbxPostProcessStatus() {
        return (org.rcsb.cif.model.pdbxpostprocessstatus.PdbxPostProcessStatus) categories.computeIfAbsent("pdbx_post_process_status",
                org.rcsb.cif.model.pdbxpostprocessstatus.PdbxPostProcessStatus::new);
    }

    /**
     * Data items in the PDBX_STRUCT_LINK category record details about
     * covalent linkages in the structure.
     * @return PdbxStructLink
     */
    public org.rcsb.cif.model.pdbxstructlink.PdbxStructLink getPdbxStructLink() {
        return (org.rcsb.cif.model.pdbxstructlink.PdbxStructLink) categories.computeIfAbsent("pdbx_struct_link",
                org.rcsb.cif.model.pdbxstructlink.PdbxStructLink::new);
    }

    /**
     * Provides a place-holder for PDB REMARK 465 data.
     * @return PdbxMissingResidueList
     */
    public org.rcsb.cif.model.pdbxmissingresiduelist.PdbxMissingResidueList getPdbxMissingResidueList() {
        return (org.rcsb.cif.model.pdbxmissingresiduelist.PdbxMissingResidueList) categories.computeIfAbsent("pdbx_missing_residue_list",
                org.rcsb.cif.model.pdbxmissingresiduelist.PdbxMissingResidueList::new);
    }

    /**
     * Crystallographic cell specifications used in data processing.
     * @return PdbxDataProcessingCell
     */
    public org.rcsb.cif.model.pdbxdataprocessingcell.PdbxDataProcessingCell getPdbxDataProcessingCell() {
        return (org.rcsb.cif.model.pdbxdataprocessingcell.PdbxDataProcessingCell) categories.computeIfAbsent("pdbx_data_processing_cell",
                org.rcsb.cif.model.pdbxdataprocessingcell.PdbxDataProcessingCell::new);
    }

    /**
     * Details of reflections used in data processing.
     * @return PdbxDataProcessingReflns
     */
    public org.rcsb.cif.model.pdbxdataprocessingreflns.PdbxDataProcessingReflns getPdbxDataProcessingReflns() {
        return (org.rcsb.cif.model.pdbxdataprocessingreflns.PdbxDataProcessingReflns) categories.computeIfAbsent("pdbx_data_processing_reflns",
                org.rcsb.cif.model.pdbxdataprocessingreflns.PdbxDataProcessingReflns::new);
    }

    /**
     * Details of the detector used at data collection site.
     * @return PdbxDataProcessingDetector
     */
    public org.rcsb.cif.model.pdbxdataprocessingdetector.PdbxDataProcessingDetector getPdbxDataProcessingDetector() {
        return (org.rcsb.cif.model.pdbxdataprocessingdetector.PdbxDataProcessingDetector) categories.computeIfAbsent("pdbx_data_processing_detector",
                org.rcsb.cif.model.pdbxdataprocessingdetector.PdbxDataProcessingDetector::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
     * common nucleotide modifications and nonstandard features.
     * @return PdbxChemCompNonstandard
     */
    public org.rcsb.cif.model.pdbxchemcompnonstandard.PdbxChemCompNonstandard getPdbxChemCompNonstandard() {
        return (org.rcsb.cif.model.pdbxchemcompnonstandard.PdbxChemCompNonstandard) categories.computeIfAbsent("pdbx_chem_comp_nonstandard",
                org.rcsb.cif.model.pdbxchemcompnonstandard.PdbxChemCompNonstandard::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_PROTEIN_CLASS category
     * provides a top-level protein classification.
     * @return PdbxEntityPolyProteinClass
     */
    public org.rcsb.cif.model.pdbxentitypolyproteinclass.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass() {
        return (org.rcsb.cif.model.pdbxentitypolyproteinclass.PdbxEntityPolyProteinClass) categories.computeIfAbsent("pdbx_entity_poly_protein_class",
                org.rcsb.cif.model.pdbxentitypolyproteinclass.PdbxEntityPolyProteinClass::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
     * define the tree structure of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomyTree
     */
    public org.rcsb.cif.model.pdbxentitynametaxonomytree.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree() {
        return (org.rcsb.cif.model.pdbxentitynametaxonomytree.PdbxEntityNameTaxonomyTree) categories.computeIfAbsent("pdbx_entity_name_taxonomy_tree",
                org.rcsb.cif.model.pdbxentitynametaxonomytree.PdbxEntityNameTaxonomyTree::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
     * define the names and synonyms of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomy
     */
    public org.rcsb.cif.model.pdbxentitynametaxonomy.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy() {
        return (org.rcsb.cif.model.pdbxentitynametaxonomy.PdbxEntityNameTaxonomy) categories.computeIfAbsent("pdbx_entity_name_taxonomy",
                org.rcsb.cif.model.pdbxentitynametaxonomy.PdbxEntityNameTaxonomy::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_INSTANCE category
     * list names used to define entities with their
     * associated database, entity, chain, and molecule
     * identifiers.
     * @return PdbxEntityNameInstance
     */
    public org.rcsb.cif.model.pdbxentitynameinstance.PdbxEntityNameInstance getPdbxEntityNameInstance() {
        return (org.rcsb.cif.model.pdbxentitynameinstance.PdbxEntityNameInstance) categories.computeIfAbsent("pdbx_entity_name_instance",
                org.rcsb.cif.model.pdbxentitynameinstance.PdbxEntityNameInstance::new);
    }

    /**

     * @return PdbxTableinfo
     */
    public org.rcsb.cif.model.pdbxtableinfo.PdbxTableinfo getPdbxTableinfo() {
        return (org.rcsb.cif.model.pdbxtableinfo.PdbxTableinfo) categories.computeIfAbsent("pdbx_tableinfo",
                org.rcsb.cif.model.pdbxtableinfo.PdbxTableinfo::new);
    }

    /**

     * @return PdbxColumninfo
     */
    public org.rcsb.cif.model.pdbxcolumninfo.PdbxColumninfo getPdbxColumninfo() {
        return (org.rcsb.cif.model.pdbxcolumninfo.PdbxColumninfo) categories.computeIfAbsent("pdbx_columninfo",
                org.rcsb.cif.model.pdbxcolumninfo.PdbxColumninfo::new);
    }

    /**
     * The PDBX_VAL_ANGLE category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValAngle
     */
    public org.rcsb.cif.model.pdbxvalangle.PdbxValAngle getPdbxValAngle() {
        return (org.rcsb.cif.model.pdbxvalangle.PdbxValAngle) categories.computeIfAbsent("pdbx_val_angle",
                org.rcsb.cif.model.pdbxvalangle.PdbxValAngle::new);
    }

    /**
     * The PDBX_VAL_BOND category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValBond
     */
    public org.rcsb.cif.model.pdbxvalbond.PdbxValBond getPdbxValBond() {
        return (org.rcsb.cif.model.pdbxvalbond.PdbxValBond) categories.computeIfAbsent("pdbx_val_bond",
                org.rcsb.cif.model.pdbxvalbond.PdbxValBond::new);
    }

    /**
     * The PDBX_VAL_CONTACT category lists non-bonded atoms within the
     * assymetric unit of the entry that are in close contact.
     *
     * For those contacts not involving hydrogen a limit of
     * 2.2 Angstroms is used. For contacts involving a hydrogen atom
     * a cutoff of 1.6 Angstrom is used.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValContact
     */
    public org.rcsb.cif.model.pdbxvalcontact.PdbxValContact getPdbxValContact() {
        return (org.rcsb.cif.model.pdbxvalcontact.PdbxValContact) categories.computeIfAbsent("pdbx_val_contact",
                org.rcsb.cif.model.pdbxvalcontact.PdbxValContact::new);
    }

    /**
     * The PDBX_VAL_SYM_CONTACT category lists symmetry related
     * contacts amoung non-bonded atoms.
     *
     * For those contacts not involving hydrogen a limit of
     * 2.2 Angstroms is used. For contacts involving a hydrogen atom
     * a cutoff of 1.6 Angstrom is used.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValSymContact
     */
    public org.rcsb.cif.model.pdbxvalsymcontact.PdbxValSymContact getPdbxValSymContact() {
        return (org.rcsb.cif.model.pdbxvalsymcontact.PdbxValSymContact) categories.computeIfAbsent("pdbx_val_sym_contact",
                org.rcsb.cif.model.pdbxvalsymcontact.PdbxValSymContact::new);
    }

    /**
     * Data items in the PDBX_RMCH_OUTLIER category list the
     * residues with torsion angles outside the expected
     * Ramachandran regions.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxRmchOutlier
     */
    public org.rcsb.cif.model.pdbxrmchoutlier.PdbxRmchOutlier getPdbxRmchOutlier() {
        return (org.rcsb.cif.model.pdbxrmchoutlier.PdbxRmchOutlier) categories.computeIfAbsent("pdbx_rmch_outlier",
                org.rcsb.cif.model.pdbxrmchoutlier.PdbxRmchOutlier::new);
    }

    /**
     * Data items in the PDBX_MISSING_ATOM_POLY category lists
     * atoms missing in polymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomPoly
     */
    public org.rcsb.cif.model.pdbxmissingatompoly.PdbxMissingAtomPoly getPdbxMissingAtomPoly() {
        return (org.rcsb.cif.model.pdbxmissingatompoly.PdbxMissingAtomPoly) categories.computeIfAbsent("pdbx_missing_atom_poly",
                org.rcsb.cif.model.pdbxmissingatompoly.PdbxMissingAtomPoly::new);
    }

    /**
     * Data items in the PDBX_MISSING_ATOM_NONPOLY category list the
     * atoms missing in nonpolymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomNonpoly
     */
    public org.rcsb.cif.model.pdbxmissingatomnonpoly.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly() {
        return (org.rcsb.cif.model.pdbxmissingatomnonpoly.PdbxMissingAtomNonpoly) categories.computeIfAbsent("pdbx_missing_atom_nonpoly",
                org.rcsb.cif.model.pdbxmissingatomnonpoly.PdbxMissingAtomNonpoly::new);
    }

    /**
     * Data items in the PDBX_VAL_CHIRAL category list the
     * atoms with nonstandard chiralities.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValChiral
     */
    public org.rcsb.cif.model.pdbxvalchiral.PdbxValChiral getPdbxValChiral() {
        return (org.rcsb.cif.model.pdbxvalchiral.PdbxValChiral) categories.computeIfAbsent("pdbx_val_chiral",
                org.rcsb.cif.model.pdbxvalchiral.PdbxValChiral::new);
    }

    /**
     * Gives information about the organization of the
     * NDB Structural Atlas.
     * @return PdbxAtlas
     */
    public org.rcsb.cif.model.pdbxatlas.PdbxAtlas getPdbxAtlas() {
        return (org.rcsb.cif.model.pdbxatlas.PdbxAtlas) categories.computeIfAbsent("pdbx_atlas",
                org.rcsb.cif.model.pdbxatlas.PdbxAtlas::new);
    }

    /**
     * Container category for a list of feature flags associated
     * with each structure entry.
     * @return PdbxSummaryFlags
     */
    public org.rcsb.cif.model.pdbxsummaryflags.PdbxSummaryFlags getPdbxSummaryFlags() {
        return (org.rcsb.cif.model.pdbxsummaryflags.PdbxSummaryFlags) categories.computeIfAbsent("pdbx_summary_flags",
                org.rcsb.cif.model.pdbxsummaryflags.PdbxSummaryFlags::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
     * characteristics of protein oligonucleotide binding.
     * @return PdbxEntityFuncBindMode
     */
    public org.rcsb.cif.model.pdbxentityfuncbindmode.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode() {
        return (org.rcsb.cif.model.pdbxentityfuncbindmode.PdbxEntityFuncBindMode) categories.computeIfAbsent("pdbx_entity_func_bind_mode",
                org.rcsb.cif.model.pdbxentityfuncbindmode.PdbxEntityFuncBindMode::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is enzymatic.
     * @return PdbxEntityFuncEnzyme
     */
    public org.rcsb.cif.model.pdbxentityfuncenzyme.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme() {
        return (org.rcsb.cif.model.pdbxentityfuncenzyme.PdbxEntityFuncEnzyme) categories.computeIfAbsent("pdbx_entity_func_enzyme",
                org.rcsb.cif.model.pdbxentityfuncenzyme.PdbxEntityFuncEnzyme::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_REGULATORY category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is regulatory.
     * @return PdbxEntityFuncRegulatory
     */
    public org.rcsb.cif.model.pdbxentityfuncregulatory.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory() {
        return (org.rcsb.cif.model.pdbxentityfuncregulatory.PdbxEntityFuncRegulatory) categories.computeIfAbsent("pdbx_entity_func_regulatory",
                org.rcsb.cif.model.pdbxentityfuncregulatory.PdbxEntityFuncRegulatory::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_STRUCTURAL category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is structural.
     * @return PdbxEntityFuncStructural
     */
    public org.rcsb.cif.model.pdbxentityfuncstructural.PdbxEntityFuncStructural getPdbxEntityFuncStructural() {
        return (org.rcsb.cif.model.pdbxentityfuncstructural.PdbxEntityFuncStructural) categories.computeIfAbsent("pdbx_entity_func_structural",
                org.rcsb.cif.model.pdbxentityfuncstructural.PdbxEntityFuncStructural::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_OTHER category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is not classified.
     * @return PdbxEntityFuncOther
     */
    public org.rcsb.cif.model.pdbxentityfuncother.PdbxEntityFuncOther getPdbxEntityFuncOther() {
        return (org.rcsb.cif.model.pdbxentityfuncother.PdbxEntityFuncOther) categories.computeIfAbsent("pdbx_entity_func_other",
                org.rcsb.cif.model.pdbxentityfuncother.PdbxEntityFuncOther::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
     * of monomers within a polymer.
     * @return PdbxEntityPolyDomain
     */
    public org.rcsb.cif.model.pdbxentitypolydomain.PdbxEntityPolyDomain getPdbxEntityPolyDomain() {
        return (org.rcsb.cif.model.pdbxentitypolydomain.PdbxEntityPolyDomain) categories.computeIfAbsent("pdbx_entity_poly_domain",
                org.rcsb.cif.model.pdbxentitypolydomain.PdbxEntityPolyDomain::new);
    }

    /**
     * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
     * about structural features of the NA.
     * @return PdbxNaStructKeywds
     */
    public org.rcsb.cif.model.pdbxnastructkeywds.PdbxNaStructKeywds getPdbxNaStructKeywds() {
        return (org.rcsb.cif.model.pdbxnastructkeywds.PdbxNaStructKeywds) categories.computeIfAbsent("pdbx_na_struct_keywds",
                org.rcsb.cif.model.pdbxnastructkeywds.PdbxNaStructKeywds::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_TYPE category describe
     * type of nucleic acid polymer entities.
     * @return PdbxEntityPolyNaType
     */
    public org.rcsb.cif.model.pdbxentitypolynatype.PdbxEntityPolyNaType getPdbxEntityPolyNaType() {
        return (org.rcsb.cif.model.pdbxentitypolynatype.PdbxEntityPolyNaType) categories.computeIfAbsent("pdbx_entity_poly_na_type",
                org.rcsb.cif.model.pdbxentitypolynatype.PdbxEntityPolyNaType::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
     * describe the nonstandard features of the nucleic acid polymer entities.
     * @return PdbxEntityPolyNaNonstandard
     */
    public org.rcsb.cif.model.pdbxentitypolynanonstandard.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard() {
        return (org.rcsb.cif.model.pdbxentitypolynanonstandard.PdbxEntityPolyNaNonstandard) categories.computeIfAbsent("pdbx_entity_poly_na_nonstandard",
                org.rcsb.cif.model.pdbxentitypolynanonstandard.PdbxEntityPolyNaNonstandard::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_ANGLE category record details about the
     * molecular virtual angles, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualAngle
     */
    public org.rcsb.cif.model.pdbxvirtualangle.PdbxVirtualAngle getPdbxVirtualAngle() {
        return (org.rcsb.cif.model.pdbxvirtualangle.PdbxVirtualAngle) categories.computeIfAbsent("pdbx_virtual_angle",
                org.rcsb.cif.model.pdbxvirtualangle.PdbxVirtualAngle::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_BOND category record details about
     * virtual bonds, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualBond
     */
    public org.rcsb.cif.model.pdbxvirtualbond.PdbxVirtualBond getPdbxVirtualBond() {
        return (org.rcsb.cif.model.pdbxvirtualbond.PdbxVirtualBond) categories.computeIfAbsent("pdbx_virtual_bond",
                org.rcsb.cif.model.pdbxvirtualbond.PdbxVirtualBond::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_TORSION category record details about
     * virtual torsion angles, as calculated from the contents of the ATOM,
     * CELL, and SYMMETRY data.
     * @return PdbxVirtualTorsion
     */
    public org.rcsb.cif.model.pdbxvirtualtorsion.PdbxVirtualTorsion getPdbxVirtualTorsion() {
        return (org.rcsb.cif.model.pdbxvirtualtorsion.PdbxVirtualTorsion) categories.computeIfAbsent("pdbx_virtual_torsion",
                org.rcsb.cif.model.pdbxvirtualtorsion.PdbxVirtualTorsion::new);
    }

    /**
     * Data items in the PDBX_SEQUENCE_PATTERN category record
     * the number of occurences of common step sequence patterns
     * (e.g. AA, CG, AT).
     * @return PdbxSequencePattern
     */
    public org.rcsb.cif.model.pdbxsequencepattern.PdbxSequencePattern getPdbxSequencePattern() {
        return (org.rcsb.cif.model.pdbxsequencepattern.PdbxSequencePattern) categories.computeIfAbsent("pdbx_sequence_pattern",
                org.rcsb.cif.model.pdbxsequencepattern.PdbxSequencePattern::new);
    }

    /**
     * Data items in the PDBX_STEREOCHEMISTRY identify chiral
     * centers and associated chiral volumes.
     * @return PdbxStereochemistry
     */
    public org.rcsb.cif.model.pdbxstereochemistry.PdbxStereochemistry getPdbxStereochemistry() {
        return (org.rcsb.cif.model.pdbxstereochemistry.PdbxStereochemistry) categories.computeIfAbsent("pdbx_stereochemistry",
                org.rcsb.cif.model.pdbxstereochemistry.PdbxStereochemistry::new);
    }

    /**
     * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
     * for nucleic acid covalent geometry relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovalent
     */
    public org.rcsb.cif.model.pdbxrmsdevscovalent.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent() {
        return (org.rcsb.cif.model.pdbxrmsdevscovalent.PdbxRmsDevsCovalent) categories.computeIfAbsent("pdbx_rms_devs_covalent",
                org.rcsb.cif.model.pdbxrmsdevscovalent.PdbxRmsDevsCovalent::new);
    }

    /**
     * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovByMonomer
     */
    public org.rcsb.cif.model.pdbxrmsdevscovbymonomer.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer() {
        return (org.rcsb.cif.model.pdbxrmsdevscovbymonomer.PdbxRmsDevsCovByMonomer) categories.computeIfAbsent("pdbx_rms_devs_cov_by_monomer",
                org.rcsb.cif.model.pdbxrmsdevscovbymonomer.PdbxRmsDevsCovByMonomer::new);
    }

    /**
     * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxSugarPhosphateGeometry
     */
    public org.rcsb.cif.model.pdbxsugarphosphategeometry.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry() {
        return (org.rcsb.cif.model.pdbxsugarphosphategeometry.PdbxSugarPhosphateGeometry) categories.computeIfAbsent("pdbx_sugar_phosphate_geometry",
                org.rcsb.cif.model.pdbxsugarphosphategeometry.PdbxSugarPhosphateGeometry::new);
    }

    /**
     * The table in this section is used to describe the software
     * that was used for data collection, data processing, data analysis,
     * structure calculations and refinement. The description should include
     * both the name of the software and the version used.
     * @return PdbxNmrComputing
     */
    public org.rcsb.cif.model.pdbxnmrcomputing.PdbxNmrComputing getPdbxNmrComputing() {
        return (org.rcsb.cif.model.pdbxnmrcomputing.PdbxNmrComputing) categories.computeIfAbsent("pdbx_nmr_computing",
                org.rcsb.cif.model.pdbxnmrcomputing.PdbxNmrComputing::new);
    }

    /**
     * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
     * extension dictionary versions against which the data names appearing
     * the current data block are conformant.
     * @return PdbxAuditConformExtension
     */
    public org.rcsb.cif.model.pdbxauditconformextension.PdbxAuditConformExtension getPdbxAuditConformExtension() {
        return (org.rcsb.cif.model.pdbxauditconformextension.PdbxAuditConformExtension) categories.computeIfAbsent("pdbx_audit_conform_extension",
                org.rcsb.cif.model.pdbxauditconformextension.PdbxAuditConformExtension::new);
    }

    /**
     * Data items in the category record details from the output of mapman
     * used by the DCC program.
     * @return PdbxDccMapman
     */
    public org.rcsb.cif.model.pdbxdccmapman.PdbxDccMapman getPdbxDccMapman() {
        return (org.rcsb.cif.model.pdbxdccmapman.PdbxDccMapman) categories.computeIfAbsent("pdbx_dcc_mapman",
                org.rcsb.cif.model.pdbxdccmapman.PdbxDccMapman::new);
    }

    /**
     * Data items in this category record residual map properties such as
     * correlation, real space Rfactors and the Zscore calculated from
     * refmac and mapman.
     * @return PdbxDccRsccMapman
     */
    public org.rcsb.cif.model.pdbxdccrsccmapman.PdbxDccRsccMapman getPdbxDccRsccMapman() {
        return (org.rcsb.cif.model.pdbxdccrsccmapman.PdbxDccRsccMapman) categories.computeIfAbsent("pdbx_dcc_rscc_mapman",
                org.rcsb.cif.model.pdbxdccrsccmapman.PdbxDccRsccMapman::new);
    }

    /**
     * Data items in the category record overall map properties such
     * as correlation, real space Rfactors and the Zscore calculated
     * from refmac and mapman.
     * @return PdbxDccRsccMapmanOverall
     */
    public org.rcsb.cif.model.pdbxdccrsccmapmanoverall.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall() {
        return (org.rcsb.cif.model.pdbxdccrsccmapmanoverall.PdbxDccRsccMapmanOverall) categories.computeIfAbsent("pdbx_dcc_rscc_mapman_overall",
                org.rcsb.cif.model.pdbxdccrsccmapmanoverall.PdbxDccRsccMapmanOverall::new);
    }

    /**
     * Data items in the category record various overall metrics
     * calculated by DCC and various wrapped programs (such as Xtriage,
     * pointless, REFMAC ...).
     * @return PdbxDccDensity
     */
    public org.rcsb.cif.model.pdbxdccdensity.PdbxDccDensity getPdbxDccDensity() {
        return (org.rcsb.cif.model.pdbxdccdensity.PdbxDccDensity) categories.computeIfAbsent("pdbx_dcc_density",
                org.rcsb.cif.model.pdbxdccdensity.PdbxDccDensity::new);
    }

    /**
     * Data items in the category record the overall deviations about
     * geometry (such as bond length, angle, dihedral, chirality,
     * planarity). These data are calculated with the phenix module
     * model_vs_data.
     * @return PdbxDccGeometry
     */
    public org.rcsb.cif.model.pdbxdccgeometry.PdbxDccGeometry getPdbxDccGeometry() {
        return (org.rcsb.cif.model.pdbxdccgeometry.PdbxDccGeometry) categories.computeIfAbsent("pdbx_dcc_geometry",
                org.rcsb.cif.model.pdbxdccgeometry.PdbxDccGeometry::new);
    }

    /**
     * Data items in the category record calculated metrics from various
     * programs (such as phenix, refmac, cns, sfcheck).
     * @return PdbxDccDensityCorr
     */
    public org.rcsb.cif.model.pdbxdccdensitycorr.PdbxDccDensityCorr getPdbxDccDensityCorr() {
        return (org.rcsb.cif.model.pdbxdccdensitycorr.PdbxDccDensityCorr) categories.computeIfAbsent("pdbx_dcc_density_corr",
                org.rcsb.cif.model.pdbxdccdensitycorr.PdbxDccDensityCorr::new);
    }

    /**
     * Data items in the category record residual map properties such as
     * Real Space electron density Correlation Coefficient (RSCC), real space R
     * factors (RSR) and the Zscores for each residue, the main/side chains.
     * @return PdbxDccMap
     */
    public org.rcsb.cif.model.pdbxdccmap.PdbxDccMap getPdbxDccMap() {
        return (org.rcsb.cif.model.pdbxdccmap.PdbxDccMap) categories.computeIfAbsent("pdbx_dcc_map",
                org.rcsb.cif.model.pdbxdccmap.PdbxDccMap::new);
    }

    /**
     * Data items in the pdbx_deposit_group category provide identifiers
     * and related information for groups of entries deposited in a collection.
     * @return PdbxDepositGroup
     */
    public org.rcsb.cif.model.pdbxdepositgroup.PdbxDepositGroup getPdbxDepositGroup() {
        return (org.rcsb.cif.model.pdbxdepositgroup.PdbxDepositGroup) categories.computeIfAbsent("pdbx_deposit_group",
                org.rcsb.cif.model.pdbxdepositgroup.PdbxDepositGroup::new);
    }

    /**
     * Data items in the pdbx_deposit_group_index category provides details
     * about the individual data files in the collection of deposited entries.
     * @return PdbxDepositGroupIndex
     */
    public org.rcsb.cif.model.pdbxdepositgroupindex.PdbxDepositGroupIndex getPdbxDepositGroupIndex() {
        return (org.rcsb.cif.model.pdbxdepositgroupindex.PdbxDepositGroupIndex) categories.computeIfAbsent("pdbx_deposit_group_index",
                org.rcsb.cif.model.pdbxdepositgroupindex.PdbxDepositGroupIndex::new);
    }

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidence
     */
    public org.rcsb.cif.model.pdbxstructassemblyauthevidence.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence() {
        return (org.rcsb.cif.model.pdbxstructassemblyauthevidence.PdbxStructAssemblyAuthEvidence) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence",
                org.rcsb.cif.model.pdbxstructassemblyauthevidence.PdbxStructAssemblyAuthEvidence::new);
    }

    /**
     * Provides reason a particular assembly in pdbx_struct_assembly is
     * of interest.
     * @return PdbxStructAssemblyAuthClassification
     */
    public org.rcsb.cif.model.pdbxstructassemblyauthclassification.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification() {
        return (org.rcsb.cif.model.pdbxstructassemblyauthclassification.PdbxStructAssemblyAuthClassification) categories.computeIfAbsent("pdbx_struct_assembly_auth_classification",
                org.rcsb.cif.model.pdbxstructassemblyauthclassification.PdbxStructAssemblyAuthClassification::new);
    }

    /**
     * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
     * programs during indexing
     * @return PdbxCrystalAlignment
     */
    public org.rcsb.cif.model.pdbxcrystalalignment.PdbxCrystalAlignment getPdbxCrystalAlignment() {
        return (org.rcsb.cif.model.pdbxcrystalalignment.PdbxCrystalAlignment) categories.computeIfAbsent("pdbx_crystal_alignment",
                org.rcsb.cif.model.pdbxcrystalalignment.PdbxCrystalAlignment::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
     * the revision history for a data entry.
     * @return PdbxAuditRevisionHistory
     */
    public org.rcsb.cif.model.pdbxauditrevisionhistory.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory() {
        return (org.rcsb.cif.model.pdbxauditrevisionhistory.PdbxAuditRevisionHistory) categories.computeIfAbsent("pdbx_audit_revision_history",
                org.rcsb.cif.model.pdbxauditrevisionhistory.PdbxAuditRevisionHistory::new);
    }

    /**
     * Data items in the PDBX_AUDIT_revision_group category
     * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
     * record.
     * @return PdbxAuditRevisionGroup
     */
    public org.rcsb.cif.model.pdbxauditrevisiongroup.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup() {
        return (org.rcsb.cif.model.pdbxauditrevisiongroup.PdbxAuditRevisionGroup) categories.computeIfAbsent("pdbx_audit_revision_group",
                org.rcsb.cif.model.pdbxauditrevisiongroup.PdbxAuditRevisionGroup::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
     * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionCategory
     */
    public org.rcsb.cif.model.pdbxauditrevisioncategory.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory() {
        return (org.rcsb.cif.model.pdbxauditrevisioncategory.PdbxAuditRevisionCategory) categories.computeIfAbsent("pdbx_audit_revision_category",
                org.rcsb.cif.model.pdbxauditrevisioncategory.PdbxAuditRevisionCategory::new);
    }

    /**
     * Data items in the PDBX_audit_revision_details category
     * record descriptions of changes associated with
     * PDBX_AUDIT_REVISION_HISTORY records.
     * @return PdbxAuditRevisionDetails
     */
    public org.rcsb.cif.model.pdbxauditrevisiondetails.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails() {
        return (org.rcsb.cif.model.pdbxauditrevisiondetails.PdbxAuditRevisionDetails) categories.computeIfAbsent("pdbx_audit_revision_details",
                org.rcsb.cif.model.pdbxauditrevisiondetails.PdbxAuditRevisionDetails::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_ITEM category
     * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionItem
     */
    public org.rcsb.cif.model.pdbxauditrevisionitem.PdbxAuditRevisionItem getPdbxAuditRevisionItem() {
        return (org.rcsb.cif.model.pdbxauditrevisionitem.PdbxAuditRevisionItem) categories.computeIfAbsent("pdbx_audit_revision_item",
                org.rcsb.cif.model.pdbxauditrevisionitem.PdbxAuditRevisionItem::new);
    }

    /**
     * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
     * to experimental data set dependencies for this entry.
     * @return PdbxSupportingExpDataSet
     */
    public org.rcsb.cif.model.pdbxsupportingexpdataset.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet() {
        return (org.rcsb.cif.model.pdbxsupportingexpdataset.PdbxSupportingExpDataSet) categories.computeIfAbsent("pdbx_supporting_exp_data_set",
                org.rcsb.cif.model.pdbxsupportingexpdataset.PdbxSupportingExpDataSet::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
     * details the beam that is impinging on the sample
     * @return PdbxSerialCrystallographyMeasurement
     */
    public org.rcsb.cif.model.pdbxserialcrystallographymeasurement.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement() {
        return (org.rcsb.cif.model.pdbxserialcrystallographymeasurement.PdbxSerialCrystallographyMeasurement) categories.computeIfAbsent("pdbx_serial_crystallography_measurement",
                org.rcsb.cif.model.pdbxserialcrystallographymeasurement.PdbxSerialCrystallographyMeasurement::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
     * record general details about the sample delivery
     * @return PdbxSerialCrystallographySampleDelivery
     */
    public org.rcsb.cif.model.pdbxserialcrystallographysampledelivery.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery() {
        return (org.rcsb.cif.model.pdbxserialcrystallographysampledelivery.PdbxSerialCrystallographySampleDelivery) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery",
                org.rcsb.cif.model.pdbxserialcrystallographysampledelivery.PdbxSerialCrystallographySampleDelivery::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
     * category record details about sample delivery by injection
     * @return PdbxSerialCrystallographySampleDeliveryInjection
     */
    public org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryinjection.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection() {
        return (org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryinjection.PdbxSerialCrystallographySampleDeliveryInjection) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_injection",
                org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryinjection.PdbxSerialCrystallographySampleDeliveryInjection::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
     * category record details about sample delivery using a fixed taget.
     * @return PdbxSerialCrystallographySampleDeliveryFixedTarget
     */
    public org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryfixedtarget.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return (org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryfixedtarget.PdbxSerialCrystallographySampleDeliveryFixedTarget) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_fixed_target",
                org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryfixedtarget.PdbxSerialCrystallographySampleDeliveryFixedTarget::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
     * details about data processing that are unique to XFEL experiments.
     * These will compliment data recorded in category pdbx_diffrn_merge_stat.
     * @return PdbxSerialCrystallographyDataReduction
     */
    public org.rcsb.cif.model.pdbxserialcrystallographydatareduction.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction() {
        return (org.rcsb.cif.model.pdbxserialcrystallographydatareduction.PdbxSerialCrystallographyDataReduction) categories.computeIfAbsent("pdbx_serial_crystallography_data_reduction",
                org.rcsb.cif.model.pdbxserialcrystallographydatareduction.PdbxSerialCrystallographyDataReduction::new);
    }
}
