package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.model.Block;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MmCifBlock extends DelegatingBlock {
    public MmCifBlock(Block delegate) {
        super(delegate);
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
    public AtomSite getAtomSite() {
        return delegate.getCategory("atom_site", AtomSite::new);
    }

    /**
     * Data items in the ATOM_SITE_ANISOTROP category record details
     * about anisotropic displacement parameters.
     * If the ATOM_SITE_ANISOTROP category is used for storing these
     * data, the corresponding ATOM_SITE data items are not used.
     * @return AtomSiteAnisotrop
     */
    public AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return delegate.getCategory("atom_site_anisotrop", AtomSiteAnisotrop::new);
    }

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    public AtomSites getAtomSites() {
        return delegate.getCategory("atom_sites", AtomSites::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT category record details
     * about the structural ensembles that should be generated from
     * atom sites or groups of atom sites that are modelled in
     * alternative conformations in this data block.
     * @return AtomSitesAlt
     */
    public AtomSitesAlt getAtomSitesAlt() {
        return delegate.getCategory("atom_sites_alt", AtomSitesAlt::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT_ENS category record details
     * about the ensemble structure generated from atoms with various
     * alternative conformation IDs.
     * @return AtomSitesAltEns
     */
    public AtomSitesAltEns getAtomSitesAltEns() {
        return delegate.getCategory("atom_sites_alt_ens", AtomSitesAltEns::new);
    }

    /**
     * Data items in the ATOM_SITES_ALT_GEN category record details
     * about the interpretation of multiple conformations in the
     * structure.
     * @return AtomSitesAltGen
     */
    public AtomSitesAltGen getAtomSitesAltGen() {
        return delegate.getCategory("atom_sites_alt_gen", AtomSitesAltGen::new);
    }

    /**
     * Data items in the ATOM_SITES_FOOTNOTE category record detailed
     * comments about an atom site or a group of atom sites.
     * @return AtomSitesFootnote
     */
    public AtomSitesFootnote getAtomSitesFootnote() {
        return delegate.getCategory("atom_sites_footnote", AtomSitesFootnote::new);
    }

    /**
     * Data items in the ATOM_TYPE category record details about the
     * properties of the atoms that occupy the atom sites, such as the
     * atomic scattering factors.
     * @return AtomType
     */
    public AtomType getAtomType() {
        return delegate.getCategory("atom_type", AtomType::new);
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
    public Audit getAudit() {
        return delegate.getCategory("audit", Audit::new);
    }

    /**
     * Data items in the AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return AuditAuthor
     */
    public AuditAuthor getAuditAuthor() {
        return delegate.getCategory("audit_author", AuditAuthor::new);
    }

    /**
     * Data items in the AUDIT_CONFORM category describe the
     * dictionary versions against which the data names appearing in
     * the current data block are conformant.
     * @return AuditConform
     */
    public AuditConform getAuditConform() {
        return delegate.getCategory("audit_conform", AuditConform::new);
    }

    /**
     * Data items in the AUDIT_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the content of this data block.
     * @return AuditContactAuthor
     */
    public AuditContactAuthor getAuditContactAuthor() {
        return delegate.getCategory("audit_contact_author", AuditContactAuthor::new);
    }

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    public Cell getCell() {
        return delegate.getCategory("cell", Cell::new);
    }

    /**
     * Data items in the CELL_MEASUREMENT category record details
     * about the measurement of the crystallographic cell parameters.
     * @return CellMeasurement
     */
    public CellMeasurement getCellMeasurement() {
        return delegate.getCategory("cell_measurement", CellMeasurement::new);
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
    public CellMeasurementRefln getCellMeasurementRefln() {
        return delegate.getCategory("cell_measurement_refln", CellMeasurementRefln::new);
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
    public ChemComp getChemComp() {
        return delegate.getCategory("chem_comp", ChemComp::new);
    }

    /**
     * Data items in the CHEM_COMP_ANGLE category record details about
     * angles in a chemical component. Angles are designated by three
     * atoms, with the second atom forming the vertex of the angle.
     * Target values may be specified as angles in degrees, as a
     * distance between the first and third atoms, or both.
     * @return ChemCompAngle
     */
    public ChemCompAngle getChemCompAngle() {
        return delegate.getCategory("chem_comp_angle", ChemCompAngle::new);
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
    public ChemCompAtom getChemCompAtom() {
        return delegate.getCategory("chem_comp_atom", ChemCompAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    public ChemCompBond getChemCompBond() {
        return delegate.getCategory("chem_comp_bond", ChemCompBond::new);
    }

    /**
     * Data items in the CHEM_COMP_CHIR category provide details about
     * the chiral centres in a chemical component. The atoms bonded
     * to the chiral atom are specified in the CHEM_COMP_CHIR_ATOM
     * category.
     * @return ChemCompChir
     */
    public ChemCompChir getChemCompChir() {
        return delegate.getCategory("chem_comp_chir", ChemCompChir::new);
    }

    /**
     * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom within a chemical component.
     * @return ChemCompChirAtom
     */
    public ChemCompChirAtom getChemCompChirAtom() {
        return delegate.getCategory("chem_comp_chir_atom", ChemCompChirAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_LINK category give details about
     * the links between chemical components.
     * @return ChemCompLink
     */
    public ChemCompLink getChemCompLink() {
        return delegate.getCategory("chem_comp_link", ChemCompLink::new);
    }

    /**
     * Data items in the CHEM_COMP_PLANE category provide identifiers
     * for the planes in a chemical component.  The atoms in the plane
     * are specified in the CHEM_COMP_PLANE_ATOM category.
     * @return ChemCompPlane
     */
    public ChemCompPlane getChemCompPlane() {
        return delegate.getCategory("chem_comp_plane", ChemCompPlane::new);
    }

    /**
     * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
     * atoms in a plane within a chemical component.
     * @return ChemCompPlaneAtom
     */
    public ChemCompPlaneAtom getChemCompPlaneAtom() {
        return delegate.getCategory("chem_comp_plane_atom", ChemCompPlaneAtom::new);
    }

    /**
     * Data items in the CHEM_COMP_TOR category record details about
     * the torsion angles in a chemical component. As torsion angles
     * can have more than one target value, the target values are
     * specified in the CHEM_COMP_TOR_VALUE category.
     * @return ChemCompTor
     */
    public ChemCompTor getChemCompTor() {
        return delegate.getCategory("chem_comp_tor", ChemCompTor::new);
    }

    /**
     * Data items in the CHEM_COMP_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_COMP_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemCompTorValue
     */
    public ChemCompTorValue getChemCompTorValue() {
        return delegate.getCategory("chem_comp_tor_value", ChemCompTorValue::new);
    }

    /**
     * Data items in the CHEM_LINK category give details about
     * the links between chemical components.
     * @return ChemLink
     */
    public ChemLink getChemLink() {
        return delegate.getCategory("chem_link", ChemLink::new);
    }

    /**
     * Data items in the CHEM_LINK_ANGLE category record details
     * about angles in a link between chemical components.
     * @return ChemLinkAngle
     */
    public ChemLinkAngle getChemLinkAngle() {
        return delegate.getCategory("chem_link_angle", ChemLinkAngle::new);
    }

    /**
     * Data items in the CHEM_LINK_BOND category record details about
     * bonds in a link between components in the chemical structure.
     * @return ChemLinkBond
     */
    public ChemLinkBond getChemLinkBond() {
        return delegate.getCategory("chem_link_bond", ChemLinkBond::new);
    }

    /**
     * Data items in the CHEM_LINK_CHIR category provide details about
     * the chiral centres in a link between two chemical components.
     * The atoms bonded to the chiral atom are specified in the
     * CHEM_LINK_CHIR_ATOM category.
     * @return ChemLinkChir
     */
    public ChemLinkChir getChemLinkChir() {
        return delegate.getCategory("chem_link_chir", ChemLinkChir::new);
    }

    /**
     * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom in a link between two
     * chemical components.
     * @return ChemLinkChirAtom
     */
    public ChemLinkChirAtom getChemLinkChirAtom() {
        return delegate.getCategory("chem_link_chir_atom", ChemLinkChirAtom::new);
    }

    /**
     * Data items in the CHEM_LINK_PLANE category provide identifiers
     * for the planes in a link between two chemical components.
     * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
     * category.
     * @return ChemLinkPlane
     */
    public ChemLinkPlane getChemLinkPlane() {
        return delegate.getCategory("chem_link_plane", ChemLinkPlane::new);
    }

    /**
     * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
     * atoms in a plane in a link between two chemical components.
     * @return ChemLinkPlaneAtom
     */
    public ChemLinkPlaneAtom getChemLinkPlaneAtom() {
        return delegate.getCategory("chem_link_plane_atom", ChemLinkPlaneAtom::new);
    }

    /**
     * Data items in the CHEM_LINK_TOR category record details about
     * the torsion angles in a link between two chemical components.
     * As torsion angles can have more than one target value, the
     * target values are specified in the CHEM_LINK_TOR_VALUE category.
     * @return ChemLinkTor
     */
    public ChemLinkTor getChemLinkTor() {
        return delegate.getCategory("chem_link_tor", ChemLinkTor::new);
    }

    /**
     * Data items in the CHEM_LINK_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_LINK_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemLinkTorValue
     */
    public ChemLinkTorValue getChemLinkTorValue() {
        return delegate.getCategory("chem_link_tor_value", ChemLinkTorValue::new);
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
    public Chemical getChemical() {
        return delegate.getCategory("chemical", Chemical::new);
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
    public ChemicalConnAtom getChemicalConnAtom() {
        return delegate.getCategory("chemical_conn_atom", ChemicalConnAtom::new);
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
    public ChemicalConnBond getChemicalConnBond() {
        return delegate.getCategory("chemical_conn_bond", ChemicalConnBond::new);
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
    public ChemicalFormula getChemicalFormula() {
        return delegate.getCategory("chemical_formula", ChemicalFormula::new);
    }

    /**
     * Data items in the CITATION category record details about the
     * literature cited as being relevant to the contents of the data
     * block.
     * @return Citation
     */
    public Citation getCitation() {
        return delegate.getCategory("citation", Citation::new);
    }

    /**
     * Data items in the CITATION_AUTHOR category record details
     * about the authors associated with the citations in the
     * CITATION list.
     * @return CitationAuthor
     */
    public CitationAuthor getCitationAuthor() {
        return delegate.getCategory("citation_author", CitationAuthor::new);
    }

    /**
     * Data items in the CITATION_EDITOR category record details
     * about the editors associated with the books or book chapters
     * cited in the CITATION list.
     * @return CitationEditor
     */
    public CitationEditor getCitationEditor() {
        return delegate.getCategory("citation_editor", CitationEditor::new);
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
    public Computing getComputing() {
        return delegate.getCategory("computing", Computing::new);
    }

    /**
     * Data items in the DATABASE category have been superseded by
     * data items in the DATABASE_2 category. They are included
     * here only for compliance with older CIFs.
     * @return Database
     */
    public Database getDatabase() {
        return delegate.getCategory("database", Database::new);
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
    public Database2 getDatabase2() {
        return delegate.getCategory("database_2", Database2::new);
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
    public DatabasePDBCaveat getDatabasePDBCaveat() {
        return delegate.getCategory("database_PDB_caveat", DatabasePDBCaveat::new);
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
    public DatabasePDBMatrix getDatabasePDBMatrix() {
        return delegate.getCategory("database_PDB_matrix", DatabasePDBMatrix::new);
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
    public DatabasePDBRemark getDatabasePDBRemark() {
        return delegate.getCategory("database_PDB_remark", DatabasePDBRemark::new);
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
    public DatabasePDBRev getDatabasePDBRev() {
        return delegate.getCategory("database_PDB_rev", DatabasePDBRev::new);
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
    public DatabasePDBRevRecord getDatabasePDBRevRecord() {
        return delegate.getCategory("database_PDB_rev_record", DatabasePDBRevRecord::new);
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
    public DatabasePDBTvect getDatabasePDBTvect() {
        return delegate.getCategory("database_PDB_tvect", DatabasePDBTvect::new);
    }

    /**
     * Data items in the DIFFRN category record details about the
     * diffraction data and their measurement.
     * @return Diffrn
     */
    public Diffrn getDiffrn() {
        return delegate.getCategory("diffrn", Diffrn::new);
    }

    /**
     * Data items in the DIFFRN_ATTENUATOR category record details
     * about the diffraction attenuator scales employed.
     * @return DiffrnAttenuator
     */
    public DiffrnAttenuator getDiffrnAttenuator() {
        return delegate.getCategory("diffrn_attenuator", DiffrnAttenuator::new);
    }

    /**
     * Data items in the DIFFRN_DETECTOR category describe the
     * detector used to measure the scattered radiation, including
     * any analyser and post-sample collimation.
     * @return DiffrnDetector
     */
    public DiffrnDetector getDiffrnDetector() {
        return delegate.getCategory("diffrn_detector", DiffrnDetector::new);
    }

    /**
     * Data items in the DIFFRN_MEASUREMENT category record details
     * about the device used to orient and/or position the crystal
     * during data measurement and the manner in which the diffraction
     * data were measured.
     * @return DiffrnMeasurement
     */
    public DiffrnMeasurement getDiffrnMeasurement() {
        return delegate.getCategory("diffrn_measurement", DiffrnMeasurement::new);
    }

    /**
     * Data items in the DIFFRN_ORIENT_MATRIX category record details
     * about the orientation matrix used in the measurement of the
     * diffraction data.
     * @return DiffrnOrientMatrix
     */
    public DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return delegate.getCategory("diffrn_orient_matrix", DiffrnOrientMatrix::new);
    }

    /**
     * Data items in the DIFFRN_ORIENT_REFLN category record details
     * about the reflections that define the orientation matrix used in
     * the measurement of the diffraction intensities.
     * @return DiffrnOrientRefln
     */
    public DiffrnOrientRefln getDiffrnOrientRefln() {
        return delegate.getCategory("diffrn_orient_refln", DiffrnOrientRefln::new);
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
    public DiffrnRadiation getDiffrnRadiation() {
        return delegate.getCategory("diffrn_radiation", DiffrnRadiation::new);
    }

    /**
     * Data items in the DIFFRN_RADIATION_WAVELENGTH category
     * describe the wavelength of the radiation used to measure the
     * diffraction intensities. Items may be looped to identify
     * and assign weights to distinct components of a
     * polychromatic beam.
     * @return DiffrnRadiationWavelength
     */
    public DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return delegate.getCategory("diffrn_radiation_wavelength", DiffrnRadiationWavelength::new);
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
    public DiffrnRefln getDiffrnRefln() {
        return delegate.getCategory("diffrn_refln", DiffrnRefln::new);
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
    public DiffrnReflns getDiffrnReflns() {
        return delegate.getCategory("diffrn_reflns", DiffrnReflns::new);
    }

    /**
     * Data items in the DIFFRN_SCALE_GROUP category record details
     * of the scaling factors applied to place all intensities in the
     * reflection lists on a common scale.
     * Scaling groups might, for example, correspond to each film in a
     * multi-film data set or each crystal in a multi-crystal data set.
     * @return DiffrnScaleGroup
     */
    public DiffrnScaleGroup getDiffrnScaleGroup() {
        return delegate.getCategory("diffrn_scale_group", DiffrnScaleGroup::new);
    }

    /**
     * Data items in the DIFFRN_SOURCE category record details of
     * the source of radiation used in the diffraction experiment.
     * @return DiffrnSource
     */
    public DiffrnSource getDiffrnSource() {
        return delegate.getCategory("diffrn_source", DiffrnSource::new);
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
    public DiffrnStandardRefln getDiffrnStandardRefln() {
        return delegate.getCategory("diffrn_standard_refln", DiffrnStandardRefln::new);
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
    public DiffrnStandards getDiffrnStandards() {
        return delegate.getCategory("diffrn_standards", DiffrnStandards::new);
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
    public Entity getEntity() {
        return delegate.getCategory("entity", Entity::new);
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
    public EntityKeywords getEntityKeywords() {
        return delegate.getCategory("entity_keywords", EntityKeywords::new);
    }

    /**
     * Data items in the ENTITY_LINK category give details about
     * the links between entities.
     * @return EntityLink
     */
    public EntityLink getEntityLink() {
        return delegate.getCategory("entity_link", EntityLink::new);
    }

    /**
     * Data items in the ENTITY_NAME_COM category record the common name
     * or names associated with the entity. In some cases, the entity
     * name may not be the same as the name of the biological structure.
     * For example, haemoglobin alpha chain would be the entity common
     * name, not haemoglobin.
     * @return EntityNameCom
     */
    public EntityNameCom getEntityNameCom() {
        return delegate.getCategory("entity_name_com", EntityNameCom::new);
    }

    /**
     * Data items in the ENTITY_NAME_SYS category record the systematic
     * name or names associated with the entity and the system that
     * was used to construct the systematic name. In some cases, the
     * entity name may not be the same as the name of the biological
     * structure.
     * @return EntityNameSys
     */
    public EntityNameSys getEntityNameSys() {
        return delegate.getCategory("entity_name_sys", EntityNameSys::new);
    }

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    public EntityPoly getEntityPoly() {
        return delegate.getCategory("entity_poly", EntityPoly::new);
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
    public EntityPolySeq getEntityPolySeq() {
        return delegate.getCategory("entity_poly_seq", EntityPolySeq::new);
    }

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    public Entry getEntry() {
        return delegate.getCategory("entry", Entry::new);
    }

    /**
     * Data items in the ENTRY_LINK category record the
     * relationships between the current data block
     * identified by _entry.id and other data blocks
     * within the current file which may be referenced
     * in the current data block.
     * @return EntryLink
     */
    public EntryLink getEntryLink() {
        return delegate.getCategory("entry_link", EntryLink::new);
    }

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    public Exptl getExptl() {
        return delegate.getCategory("exptl", Exptl::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL category record the results of
     * experimental measurements on the crystal or crystals used,
     * such as shape, size or density.
     * @return ExptlCrystal
     */
    public ExptlCrystal getExptlCrystal() {
        return delegate.getCategory("exptl_crystal", ExptlCrystal::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL_FACE category record details
     * of the crystal faces.
     * @return ExptlCrystalFace
     */
    public ExptlCrystalFace getExptlCrystalFace() {
        return delegate.getCategory("exptl_crystal_face", ExptlCrystalFace::new);
    }

    /**
     * Data items in the EXPTL_CRYSTAL_GROW category record details
     * about the conditions and methods used to grow the crystal.
     * @return ExptlCrystalGrow
     */
    public ExptlCrystalGrow getExptlCrystalGrow() {
        return delegate.getCategory("exptl_crystal_grow", ExptlCrystalGrow::new);
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
    public ExptlCrystalGrowComp getExptlCrystalGrowComp() {
        return delegate.getCategory("exptl_crystal_grow_comp", ExptlCrystalGrowComp::new);
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
    public Geom getGeom() {
        return delegate.getCategory("geom", Geom::new);
    }

    /**
     * Data items in the GEOM_ANGLE category record details about the
     * bond angles as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomAngle
     */
    public GeomAngle getGeomAngle() {
        return delegate.getCategory("geom_angle", GeomAngle::new);
    }

    /**
     * Data items in the GEOM_BOND category record details about
     * the bond lengths as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomBond
     */
    public GeomBond getGeomBond() {
        return delegate.getCategory("geom_bond", GeomBond::new);
    }

    /**
     * Data items in the GEOM_CONTACT category record details about
     * interatomic contacts as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomContact
     */
    public GeomContact getGeomContact() {
        return delegate.getCategory("geom_contact", GeomContact::new);
    }

    /**
     * Data items in the GEOM_HBOND category record details about
     * hydrogen bonds as calculated from the contents of the ATOM,
     * CELL and SYMMETRY data.
     * @return GeomHbond
     */
    public GeomHbond getGeomHbond() {
        return delegate.getCategory("geom_hbond", GeomHbond::new);
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
     * Ref: Klyne, W. &amp; Prelog, V. (1960). Experientia, 16, 521-523.
     * @return GeomTorsion
     */
    public GeomTorsion getGeomTorsion() {
        return delegate.getCategory("geom_torsion", GeomTorsion::new);
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
    public Journal getJournal() {
        return delegate.getCategory("journal", Journal::new);
    }

    /**
     * Data items in the JOURNAL_INDEX category are used to list terms
     * used to generate the journal indexes.
     * 
     * The creator of a data block will not normally specify these data
     * items.
     * @return JournalIndex
     */
    public JournalIndex getJournalIndex() {
        return delegate.getCategory("journal_index", JournalIndex::new);
    }

    /**
     * Data items in the PHASING category record details about the
     * phasing of the structure, listing the various methods used in
     * the phasing process. Details about the application of each
     * method are listed in the appropriate subcategories.
     * @return Phasing
     */
    public Phasing getPhasing() {
        return delegate.getCategory("phasing", Phasing::new);
    }

    /**
     * Data items in the PHASING_AVERAGING category record details
     * about the phasing of the structure where methods involving
     * averaging of multiple observations of the molecule in the
     * asymmetric unit are involved.
     * @return PhasingAveraging
     */
    public PhasingAveraging getPhasingAveraging() {
        return delegate.getCategory("phasing_averaging", PhasingAveraging::new);
    }

    /**
     * Data items in the PHASING_ISOMORPHOUS category record details
     * about the phasing of the structure where a model isomorphous
     * to the structure being phased was used to generate the initial
     * phases.
     * @return PhasingIsomorphous
     */
    public PhasingIsomorphous getPhasingIsomorphous() {
        return delegate.getCategory("phasing_isomorphous", PhasingIsomorphous::new);
    }

    /**
     * Data items in the PHASING_MAD category record details about
     * the phasing of the structure where methods involving
     * multiple-wavelength anomalous-dispersion techniques are involved.
     * @return PhasingMAD
     */
    public PhasingMAD getPhasingMAD() {
        return delegate.getCategory("phasing_MAD", PhasingMAD::new);
    }

    /**
     * Data items in the PHASING_MAD_CLUST category record details
     * about a cluster of experiments that contributed to the
     * generation of a set of phases.
     * @return PhasingMADClust
     */
    public PhasingMADClust getPhasingMADClust() {
        return delegate.getCategory("phasing_MAD_clust", PhasingMADClust::new);
    }

    /**
     * Data items in the PHASING_MAD_EXPT category record details about
     * a MAD phasing experiment, such as the number of experiments that
     * were clustered together to produce a set of phases or the
     * statistics for those phases.
     * @return PhasingMADExpt
     */
    public PhasingMADExpt getPhasingMADExpt() {
        return delegate.getCategory("phasing_MAD_expt", PhasingMADExpt::new);
    }

    /**
     * Data items in the PHASING_MAD_RATIO category record
     * the ratios of phasing statistics between pairs of data sets
     * in a MAD phasing experiment, in given shells of resolution.
     * @return PhasingMADRatio
     */
    public PhasingMADRatio getPhasingMADRatio() {
        return delegate.getCategory("phasing_MAD_ratio", PhasingMADRatio::new);
    }

    /**
     * Data items in the PHASING_MAD_SET category record
     * details about the individual data sets used in a MAD phasing
     * experiment.
     * @return PhasingMADSet
     */
    public PhasingMADSet getPhasingMADSet() {
        return delegate.getCategory("phasing_MAD_set", PhasingMADSet::new);
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
    public PhasingMIR getPhasingMIR() {
        return delegate.getCategory("phasing_MIR", PhasingMIR::new);
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
    public PhasingMIRDer getPhasingMIRDer() {
        return delegate.getCategory("phasing_MIR_der", PhasingMIRDer::new);
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
    public PhasingMIRDerRefln getPhasingMIRDerRefln() {
        return delegate.getCategory("phasing_MIR_der_refln", PhasingMIRDerRefln::new);
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
    public PhasingMIRDerShell getPhasingMIRDerShell() {
        return delegate.getCategory("phasing_MIR_der_shell", PhasingMIRDerShell::new);
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
    public PhasingMIRDerSite getPhasingMIRDerSite() {
        return delegate.getCategory("phasing_MIR_der_site", PhasingMIRDerSite::new);
    }

    /**
     * Data items in the PHASING_MIR_SHELL category record statistics
     * for an isomorphous replacement phasing experiment.broken
     * down into shells of resolution.
     * @return PhasingMIRShell
     */
    public PhasingMIRShell getPhasingMIRShell() {
        return delegate.getCategory("phasing_MIR_shell", PhasingMIRShell::new);
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
    public PhasingSet getPhasingSet() {
        return delegate.getCategory("phasing_set", PhasingSet::new);
    }

    /**
     * Data items in the PHASING_SET_REFLN category record the values
     * of the measured structure factors used in a phasing experiment.
     * This list may contain information from a number of different
     * data sets; _phasing_set_refln.set_id indicates the data set
     * to which a given record corresponds.
     * @return PhasingSetRefln
     */
    public PhasingSetRefln getPhasingSetRefln() {
        return delegate.getCategory("phasing_set_refln", PhasingSetRefln::new);
    }

    /**
     * Data items in the PUBL category are used when submitting a
     * manuscript for publication.
     * @return Publ
     */
    public Publ getPubl() {
        return delegate.getCategory("publ", Publ::new);
    }

    /**
     * Data items in the PUBL_AUTHOR category record details of
     * the authors of a manuscript submitted for publication.
     * @return PublAuthor
     */
    public PublAuthor getPublAuthor() {
        return delegate.getCategory("publ_author", PublAuthor::new);
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
    public PublBody getPublBody() {
        return delegate.getCategory("publ_body", PublBody::new);
    }

    /**
     * Data items in the PUBL_MANUSCRIPT_INCL category allow
     * the authors of a manuscript submitted for publication to list
     * data names that should be added to the standard request list
     * used by the journal printing software.
     * @return PublManuscriptIncl
     */
    public PublManuscriptIncl getPublManuscriptIncl() {
        return delegate.getCategory("publ_manuscript_incl", PublManuscriptIncl::new);
    }

    /**
     * Data items in the REFINE category record details about the
     * structure-refinement parameters.
     * @return Refine
     */
    public Refine getRefine() {
        return delegate.getCategory("refine", Refine::new);
    }

    /**
     * Data items in the REFINE_ANALYZE category record details
     * about the refined structure that are often used to analyze the
     * refinement and assess its quality. A given computer program
     * may or may not produce values corresponding to these data
     * names.
     * @return RefineAnalyze
     */
    public RefineAnalyze getRefineAnalyze() {
        return delegate.getCategory("refine_analyze", RefineAnalyze::new);
    }

    /**
     * Data items in the REFINE_B_ISO category record details about
     * the treatment of isotropic B factors (displacement parameters)
     * during refinement.
     * @return RefineBIso
     */
    public RefineBIso getRefineBIso() {
        return delegate.getCategory("refine_B_iso", RefineBIso::new);
    }

    /**
     * Data items in the REFINE_FUNCT_MINIMIZED category record
     * details about the individual terms of the function minimized
     * during refinement.
     * @return RefineFunctMinimized
     */
    public RefineFunctMinimized getRefineFunctMinimized() {
        return delegate.getCategory("refine_funct_minimized", RefineFunctMinimized::new);
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
    public RefineHist getRefineHist() {
        return delegate.getCategory("refine_hist", RefineHist::new);
    }

    /**
     * Data items in the REFINE_LS_RESTR category record details about
     * the restraints applied to various classes of parameters during
     * the least-squares refinement.
     * @return RefineLsRestr
     */
    public RefineLsRestr getRefineLsRestr() {
        return delegate.getCategory("refine_ls_restr", RefineLsRestr::new);
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
    public RefineLsRestrNcs getRefineLsRestrNcs() {
        return delegate.getCategory("refine_ls_restr_ncs", RefineLsRestrNcs::new);
    }

    /**
     * Data items in the REFINE_LS_RESTR_TYPE category record details
     * about the restraint types used in the least-squares refinement.
     * @return RefineLsRestrType
     */
    public RefineLsRestrType getRefineLsRestrType() {
        return delegate.getCategory("refine_ls_restr_type", RefineLsRestrType::new);
    }

    /**
     * Data items in the REFINE_LS_SHELL category record details about
     * the results of the least-squares refinement broken down into
     * shells of resolution.
     * @return RefineLsShell
     */
    public RefineLsShell getRefineLsShell() {
        return delegate.getCategory("refine_ls_shell", RefineLsShell::new);
    }

    /**
     * Data items in the REFINE_OCCUPANCY category record details
     * about the treatment of atom occupancies during refinement.
     * @return RefineOccupancy
     */
    public RefineOccupancy getRefineOccupancy() {
        return delegate.getCategory("refine_occupancy", RefineOccupancy::new);
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
    public Refln getRefln() {
        return delegate.getCategory("refln", Refln::new);
    }

    /**
     * Data items in the REFLN_SYS_ABS category record details about
     * the reflection data that should be systematically absent,
     * given the designated space group.
     * @return ReflnSysAbs
     */
    public ReflnSysAbs getReflnSysAbs() {
        return delegate.getCategory("refln_sys_abs", ReflnSysAbs::new);
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
    public Reflns getReflns() {
        return delegate.getCategory("reflns", Reflns::new);
    }

    /**
     * Data items in the REFLNS_SCALE category record details about
     * the structure-factor scales. They are referenced from within
     * the REFLN list through _refln.scale_group_code.
     * @return ReflnsScale
     */
    public ReflnsScale getReflnsScale() {
        return delegate.getCategory("reflns_scale", ReflnsScale::new);
    }

    /**
     * Data items in the REFLNS_SHELL category record details about
     * the reflection data used to determine the ATOM_SITE data items
     * broken down into shells of resolution.
     * @return ReflnsShell
     */
    public ReflnsShell getReflnsShell() {
        return delegate.getCategory("reflns_shell", ReflnsShell::new);
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
    public Software getSoftware() {
        return delegate.getCategory("software", Software::new);
    }

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    public Struct getStruct() {
        return delegate.getCategory("struct", Struct::new);
    }

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    public StructAsym getStructAsym() {
        return delegate.getCategory("struct_asym", StructAsym::new);
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
    public StructBiol getStructBiol() {
        return delegate.getCategory("struct_biol", StructBiol::new);
    }

    /**
     * Data items in the STRUCT_BIOL_GEN category record details about
     * the generation of each biological unit. The STRUCT_BIOL_GEN
     * data items provide the specifications of the components that
     * constitute that biological unit, which may include symmetry
     * elements.
     * @return StructBiolGen
     */
    public StructBiolGen getStructBiolGen() {
        return delegate.getCategory("struct_biol_gen", StructBiolGen::new);
    }

    /**
     * Data items in the STRUCT_BIOL_KEYWORDS category record
     * keywords that describe each biological unit.
     * @return StructBiolKeywords
     */
    public StructBiolKeywords getStructBiolKeywords() {
        return delegate.getCategory("struct_biol_keywords", StructBiolKeywords::new);
    }

    /**
     * Data items in the STRUCT_BIOL_VIEW category record details
     * about how to draw and annotate an informative view of the
     * biological structure.
     * @return StructBiolView
     */
    public StructBiolView getStructBiolView() {
        return delegate.getCategory("struct_biol_view", StructBiolView::new);
    }

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     * 
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    public StructConf getStructConf() {
        return delegate.getCategory("struct_conf", StructConf::new);
    }

    /**
     * Data items in the STRUCT_CONF_TYPE category record details
     * about the criteria used to identify backbone conformations of a
     * segment of polymer.
     * @return StructConfType
     */
    public StructConfType getStructConfType() {
        return delegate.getCategory("struct_conf_type", StructConfType::new);
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
    public StructConn getStructConn() {
        return delegate.getCategory("struct_conn", StructConn::new);
    }

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    public StructConnType getStructConnType() {
        return delegate.getCategory("struct_conn_type", StructConnType::new);
    }

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    public StructKeywords getStructKeywords() {
        return delegate.getCategory("struct_keywords", StructKeywords::new);
    }

    /**
     * Data items in the STRUCT_MON_DETAILS category record details
     * about specifics of calculations summarized in data items in the
     * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
     * include the coefficients used in map calculations,
     * the radii used for including points in a calculation and so on.
     * @return StructMonDetails
     */
    public StructMonDetails getStructMonDetails() {
        return delegate.getCategory("struct_mon_details", StructMonDetails::new);
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
    public StructMonNucl getStructMonNucl() {
        return delegate.getCategory("struct_mon_nucl", StructMonNucl::new);
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
    public StructMonProt getStructMonProt() {
        return delegate.getCategory("struct_mon_prot", StructMonProt::new);
    }

    /**
     * Data items in the STRUCT_MON_PROT_CIS category identify
     * monomers that have been found to have the peptide bond in the cis
     * conformation. The criterion used to select residues to be
     * designated as containing cis peptide bonds is given in
     * _struct_mon_details.prot_cis.
     * @return StructMonProtCis
     */
    public StructMonProtCis getStructMonProtCis() {
        return delegate.getCategory("struct_mon_prot_cis", StructMonProtCis::new);
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
    public StructNcsDom getStructNcsDom() {
        return delegate.getCategory("struct_ncs_dom", StructNcsDom::new);
    }

    /**
     * Data items in the STRUCT_NCS_DOM_LIM category identify the
     * start and end points of polypeptide chain segments
     * that form all or part of a domain in an ensemble of domains
     * related by noncrystallographic symmetry.
     * @return StructNcsDomLim
     */
    public StructNcsDomLim getStructNcsDomLim() {
        return delegate.getCategory("struct_ncs_dom_lim", StructNcsDomLim::new);
    }

    /**
     * Data items in the STRUCT_NCS_ENS category record information
     * about ensembles of domains related by noncrystallographic
     * symmetry. The point group of the ensemble when taken as a
     * whole may be specified, as well as any special aspects of the
     * ensemble that require description.
     * @return StructNcsEns
     */
    public StructNcsEns getStructNcsEns() {
        return delegate.getCategory("struct_ncs_ens", StructNcsEns::new);
    }

    /**
     * Data items in the STRUCT_NCS_ENS_GEN category list domains
     * related by a noncrystallographic symmetry operation and
     * identify the operator.
     * @return StructNcsEnsGen
     */
    public StructNcsEnsGen getStructNcsEnsGen() {
        return delegate.getCategory("struct_ncs_ens_gen", StructNcsEnsGen::new);
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
    public StructNcsOper getStructNcsOper() {
        return delegate.getCategory("struct_ncs_oper", StructNcsOper::new);
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
    public StructRef getStructRef() {
        return delegate.getCategory("struct_ref", StructRef::new);
    }

    /**
     * Data items in the STRUCT_REF_SEQ category provide a mechanism
     * for indicating and annotating a region (or regions) of alignment
     * between the sequence of an entity or biological unit described
     * in the data block and the sequence in the referenced database
     * entry.
     * @return StructRefSeq
     */
    public StructRefSeq getStructRefSeq() {
        return delegate.getCategory("struct_ref_seq", StructRefSeq::new);
    }

    /**
     * Data items in the STRUCT_REF_SEQ_DIF category provide a
     * mechanism for indicating and annotating point differences
     * between the sequence of the entity or biological unit described
     * in the data block and the sequence of the referenced database
     * entry.
     * @return StructRefSeqDif
     */
    public StructRefSeqDif getStructRefSeqDif() {
        return delegate.getCategory("struct_ref_seq_dif", StructRefSeqDif::new);
    }

    /**
     * Data items in the STRUCT_SHEET category record details about
     * the beta-sheets.
     * @return StructSheet
     */
    public StructSheet getStructSheet() {
        return delegate.getCategory("struct_sheet", StructSheet::new);
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
    public StructSheetHbond getStructSheetHbond() {
        return delegate.getCategory("struct_sheet_hbond", StructSheetHbond::new);
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
    public StructSheetOrder getStructSheetOrder() {
        return delegate.getCategory("struct_sheet_order", StructSheetOrder::new);
    }

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    public StructSheetRange getStructSheetRange() {
        return delegate.getCategory("struct_sheet_range", StructSheetRange::new);
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
    public StructSheetTopology getStructSheetTopology() {
        return delegate.getCategory("struct_sheet_topology", StructSheetTopology::new);
    }

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    public StructSite getStructSite() {
        return delegate.getCategory("struct_site", StructSite::new);
    }

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    public StructSiteGen getStructSiteGen() {
        return delegate.getCategory("struct_site_gen", StructSiteGen::new);
    }

    /**
     * Data items in the STRUCT_SITE_KEYWORDS category record
     * keywords describing the site.
     * @return StructSiteKeywords
     */
    public StructSiteKeywords getStructSiteKeywords() {
        return delegate.getCategory("struct_site_keywords", StructSiteKeywords::new);
    }

    /**
     * Data items in the STRUCT_SITE_VIEW category record details
     * about how to draw and annotate an informative view of the
     * site.
     * @return StructSiteView
     */
    public StructSiteView getStructSiteView() {
        return delegate.getCategory("struct_site_view", StructSiteView::new);
    }

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return delegate.getCategory("symmetry", Symmetry::new);
    }

    /**
     * Data items in the SYMMETRY_EQUIV category list the
     * symmetry-equivalent positions for the space group.
     * @return SymmetryEquiv
     */
    public SymmetryEquiv getSymmetryEquiv() {
        return delegate.getCategory("symmetry_equiv", SymmetryEquiv::new);
    }

    /**
     * Data items in the AUDIT_LINK category record details about the
     * relationships between data blocks in the current CIF.
     * @return AuditLink
     */
    public AuditLink getAuditLink() {
        return delegate.getCategory("audit_link", AuditLink::new);
    }

    /**
     * Data items in the DIFFRN_REFLNS_CLASS category record details
     * about the classes of reflections measured in the diffraction
     * experiment.
     * @return DiffrnReflnsClass
     */
    public DiffrnReflnsClass getDiffrnReflnsClass() {
        return delegate.getCategory("diffrn_reflns_class", DiffrnReflnsClass::new);
    }

    /**
     * Data items in the REFINE_LS_CLASS category record details
     * about the reflections used for the structure refinement
     * for each reflection class separately.
     * @return RefineLsClass
     */
    public RefineLsClass getRefineLsClass() {
        return delegate.getCategory("refine_ls_class", RefineLsClass::new);
    }

    /**
     * Data items in the REFLNS_CLASS category record details
     * of the reflections used to determine the structural
     * parameters for each reflection class.
     * @return ReflnsClass
     */
    public ReflnsClass getReflnsClass() {
        return delegate.getCategory("reflns_class", ReflnsClass::new);
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
    public SpaceGroup getSpaceGroup() {
        return delegate.getCategory("space_group", SpaceGroup::new);
    }

    /**
     * Contains information about the symmetry operations of the
     * space group.
     * @return SpaceGroupSymop
     */
    public SpaceGroupSymop getSpaceGroupSymop() {
        return delegate.getCategory("space_group_symop", SpaceGroupSymop::new);
    }

    /**
     * Data items in the VALENCE_PARAM category define the
     * parameters used for calculating bond valences from bond
     * lengths.  In addition to the parameters, a pointer
     * is given to the reference (in VALENCE_REF) from which
     * the bond-valence parameters were taken.
     * @return ValenceParam
     */
    public ValenceParam getValenceParam() {
        return delegate.getCategory("valence_param", ValenceParam::new);
    }

    /**
     * Data items in the VALENCE_REF category list the references
     * from which the bond-valence parameters have been taken.
     * @return ValenceRef
     */
    public ValenceRef getValenceRef() {
        return delegate.getCategory("valence_ref", ValenceRef::new);
    }

    /**
     * The PDBX_AUDIT holds current version information.
     * @return PdbxAudit
     */
    public PdbxAudit getPdbxAudit() {
        return delegate.getCategory("pdbx_audit", PdbxAudit::new);
    }

    /**
     * Data items in the PDBX_VERSION category record details about the
     * version of this entry.
     * @return PdbxVersion
     */
    public PdbxVersion getPdbxVersion() {
        return delegate.getCategory("pdbx_version", PdbxVersion::new);
    }

    /**
     * Data items in the PDBX_AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return PdbxAuditAuthor
     */
    public PdbxAuditAuthor getPdbxAuditAuthor() {
        return delegate.getCategory("pdbx_audit_author", PdbxAuditAuthor::new);
    }

    /**
     * The PDBX_DATABASE_MESSAGE category provides information about
     * correspondance related to a structure deposition.
     * @return PdbxDatabaseMessage
     */
    public PdbxDatabaseMessage getPdbxDatabaseMessage() {
        return delegate.getCategory("pdbx_database_message", PdbxDatabaseMessage::new);
    }

    /**
     * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
     * for information on obsolete/superseded PDB entries
     * @return PdbxDatabasePDBObsSpr
     */
    public PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr() {
        return delegate.getCategory("pdbx_database_PDB_obs_spr", PdbxDatabasePDBObsSpr::new);
    }

    /**
     * Internal records to track the data processing cycle.
     * @return PdbxDatabaseProc
     */
    public PdbxDatabaseProc getPdbxDatabaseProc() {
        return delegate.getCategory("pdbx_database_proc", PdbxDatabaseProc::new);
    }

    /**
     * 
     * Data items in the PDBX_DATABASE_REMARK category record keep additional
     * information about the entry.  They are mostly used to create
     * 'non-standard' PDB REMARK annotations (6-99).
     * @return PdbxDatabaseRemark
     */
    public PdbxDatabaseRemark getPdbxDatabaseRemark() {
        return delegate.getCategory("pdbx_database_remark", PdbxDatabaseRemark::new);
    }

    /**
     * These are internal RCSB records to keep track of data processing
     * and status of the entry.
     * @return PdbxDatabaseStatus
     */
    public PdbxDatabaseStatus getPdbxDatabaseStatus() {
        return delegate.getCategory("pdbx_database_status", PdbxDatabaseStatus::new);
    }

    /**
     * The PDBX_ENTITY_NAME records additional name information for
     * each entity.
     * @return PdbxEntityName
     */
    public PdbxEntityName getPdbxEntityName() {
        return delegate.getCategory("pdbx_entity_name", PdbxEntityName::new);
    }

    /**
     * This category provides a placeholder for pre-release
     * sequence information.  After release this category
     * should be discarded.
     * @return PdbxPrereleaseSeq
     */
    public PdbxPrereleaseSeq getPdbxPrereleaseSeq() {
        return delegate.getCategory("pdbx_prerelease_seq", PdbxPrereleaseSeq::new);
    }

    /**
     * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
     * mapping for polymer entities.
     * @return PdbxPolySeqScheme
     */
    public PdbxPolySeqScheme getPdbxPolySeqScheme() {
        return delegate.getCategory("pdbx_poly_seq_scheme", PdbxPolySeqScheme::new);
    }

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    public PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return delegate.getCategory("pdbx_nonpoly_scheme", PdbxNonpolyScheme::new);
    }

    /**
     * Data items in the PDBX_REFINE category record details about
     * additional structure refinement parameters which are needed
     * to complete legacy REMARK 3 refinement templates in PDB
     * format files.
     * @return PdbxRefine
     */
    public PdbxRefine getPdbxRefine() {
        return delegate.getCategory("pdbx_refine", PdbxRefine::new);
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
    public PdbxStructSheetHbond getPdbxStructSheetHbond() {
        return delegate.getCategory("pdbx_struct_sheet_hbond", PdbxStructSheetHbond::new);
    }

    /**
     * 
     * Parameter and topology files used in X-PLOR/CNS refinement.
     * @return PdbxXplorFile
     */
    public PdbxXplorFile getPdbxXplorFile() {
        return delegate.getCategory("pdbx_xplor_file", PdbxXplorFile::new);
    }

    /**
     * 
     * Auxilary parameter and topology files used in refinement.
     * @return PdbxRefineAuxFile
     */
    public PdbxRefineAuxFile getPdbxRefineAuxFile() {
        return delegate.getCategory("pdbx_refine_aux_file", PdbxRefineAuxFile::new);
    }

    /**
     * Data items in PDBX_DATABASE_RELATED contain references to entries
     * that are related to the this entry.
     * @return PdbxDatabaseRelated
     */
    public PdbxDatabaseRelated getPdbxDatabaseRelated() {
        return delegate.getCategory("pdbx_database_related", PdbxDatabaseRelated::new);
    }

    /**
     * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
     * of the biological assembly studied in terms of its constituent
     * entities.
     * @return PdbxEntityAssembly
     */
    public PdbxEntityAssembly getPdbxEntityAssembly() {
        return delegate.getCategory("pdbx_entity_assembly", PdbxEntityAssembly::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
     * details about the components of the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowComp
     */
    public PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp() {
        return delegate.getCategory("pdbx_exptl_crystal_grow_comp", PdbxExptlCrystalGrowComp::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
     * details about the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowSol
     */
    public PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol() {
        return delegate.getCategory("pdbx_exptl_crystal_grow_sol", PdbxExptlCrystalGrowSol::new);
    }

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
     * record details cryogenic treatments applied to this crystal.
     * @return PdbxExptlCrystalCryoTreatment
     */
    public PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment() {
        return delegate.getCategory("pdbx_exptl_crystal_cryo_treatment", PdbxExptlCrystalCryoTreatment::new);
    }

    /**
     * Data items in the REFINE_TLS category record details about
     * TLS parameters used in structure refinement. Note that the
     * intention is primarily to describe directly refined TLS
     * parameters, although other methods of obtaining TLS parameters
     * may be covered, see item _pdbx_refine_tls.method
     * @return PdbxRefineTls
     */
    public PdbxRefineTls getPdbxRefineTls() {
        return delegate.getCategory("pdbx_refine_tls", PdbxRefineTls::new);
    }

    /**
     * Data items in the PDBX_REFINE_TLS_GROUP category record details about
     * a fragment of a TLS group.
     * 
     * Properties of the TLS group are recorded in PDBX_REFINE_TLS
     * @return PdbxRefineTlsGroup
     */
    public PdbxRefineTlsGroup getPdbxRefineTlsGroup() {
        return delegate.getCategory("pdbx_refine_tls_group", PdbxRefineTlsGroup::new);
    }

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the contents of this data block.  This category atomizes
     * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
     * category.
     * @return PdbxContactAuthor
     */
    public PdbxContactAuthor getPdbxContactAuthor() {
        return delegate.getCategory("pdbx_contact_author", PdbxContactAuthor::new);
    }

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the Structural Genomics Project and name and initials
     * for each Center.
     * @return PdbxSGProject
     */
    public PdbxSGProject getPdbxSGProject() {
        return delegate.getCategory("pdbx_SG_project", PdbxSGProject::new);
    }

    /**
     * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
     * about the TLS contribution to anisotropic displacement parameters.
     * @return PdbxAtomSiteAnisoTls
     */
    public PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls() {
        return delegate.getCategory("pdbx_atom_site_aniso_tls", PdbxAtomSiteAnisoTls::new);
    }

    /**
     * 
     * Experimental details of the NMR study that have not been
     * described elsewhere in this deposition.
     * @return PdbxNmrDetails
     */
    public PdbxNmrDetails getPdbxNmrDetails() {
        return delegate.getCategory("pdbx_nmr_details", PdbxNmrDetails::new);
    }

    /**
     * 
     * Complete description of each NMR sample, including the solvent
     * system used.
     * @return PdbxNmrSampleDetails
     */
    public PdbxNmrSampleDetails getPdbxNmrSampleDetails() {
        return delegate.getCategory("pdbx_nmr_sample_details", PdbxNmrSampleDetails::new);
    }

    /**
     * The chemical constituents of
     * each NMR sample. Each sample is identified by a number and
     * each component in the sample is identified by name.
     * @return PdbxNmrExptlSample
     */
    public PdbxNmrExptlSample getPdbxNmrExptlSample() {
        return delegate.getCategory("pdbx_nmr_exptl_sample", PdbxNmrExptlSample::new);
    }

    /**
     * 
     * The experimental conditions used to for each sample.  Each set of conditions
     * is identified by a numerical code.
     * @return PdbxNmrExptlSampleConditions
     */
    public PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions() {
        return delegate.getCategory("pdbx_nmr_exptl_sample_conditions", PdbxNmrExptlSampleConditions::new);
    }

    /**
     * 
     * The details about each spectrometer used to collect data for this
     * deposition.
     * @return PdbxNmrSpectrometer
     */
    public PdbxNmrSpectrometer getPdbxNmrSpectrometer() {
        return delegate.getCategory("pdbx_nmr_spectrometer", PdbxNmrSpectrometer::new);
    }

    /**
     * 
     * In this section, enter information on those experiments that were
     * used to generate constraint data. For each NMR experiment indicate
     * which sample and which sample conditions were used for the experiment.
     * @return PdbxNmrExptl
     */
    public PdbxNmrExptl getPdbxNmrExptl() {
        return delegate.getCategory("pdbx_nmr_exptl", PdbxNmrExptl::new);
    }

    /**
     * 
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return PdbxNmrSoftware
     */
    public PdbxNmrSoftware getPdbxNmrSoftware() {
        return delegate.getCategory("pdbx_nmr_software", PdbxNmrSoftware::new);
    }

    /**
     * This section provides a tabulation of constraint data.
     * @return PdbxNmrConstraints
     */
    public PdbxNmrConstraints getPdbxNmrConstraints() {
        return delegate.getCategory("pdbx_nmr_constraints", PdbxNmrConstraints::new);
    }

    /**
     * This category contains the information that describes the
     * ensemble of deposited structures. If only an average structure
     * has been deposited skip this section.
     * @return PdbxNmrEnsemble
     */
    public PdbxNmrEnsemble getPdbxNmrEnsemble() {
        return delegate.getCategory("pdbx_nmr_ensemble", PdbxNmrEnsemble::new);
    }

    /**
     * Structural statistics are derived from molecular dynamics and simulated annealing
     * programs.
     * @return PdbxNmrEnsembleRms
     */
    public PdbxNmrEnsembleRms getPdbxNmrEnsembleRms() {
        return delegate.getCategory("pdbx_nmr_ensemble_rms", PdbxNmrEnsembleRms::new);
    }

    /**
     * An average structure is often calculated in addition to the ensemble, or one
     * of the ensemble is selected as a representative structure. This section
     * describes selection of the representative structure.
     * @return PdbxNmrRepresentative
     */
    public PdbxNmrRepresentative getPdbxNmrRepresentative() {
        return delegate.getCategory("pdbx_nmr_representative", PdbxNmrRepresentative::new);
    }

    /**
     * 
     * Describe the method and details of the refinement of the deposited structure.
     * @return PdbxNmrRefine
     */
    public PdbxNmrRefine getPdbxNmrRefine() {
        return delegate.getCategory("pdbx_nmr_refine", PdbxNmrRefine::new);
    }

    /**
     * 
     * The final force constants, including units, employed for the various
     * experimental constraints, covalent geometry constraints, and the non-bonded
     * interaction terms in the target function used for simulated annealing.
     * @return PdbxNmrForceConstants
     */
    public PdbxNmrForceConstants getPdbxNmrForceConstants() {
        return delegate.getCategory("pdbx_nmr_force_constants", PdbxNmrForceConstants::new);
    }

    /**
     * Data items in the NDB_STRUCT_CONF_NA category
     * describes secondary structure features in this entry.
     * @return NdbStructConfNa
     */
    public NdbStructConfNa getNdbStructConfNa() {
        return delegate.getCategory("ndb_struct_conf_na", NdbStructConfNa::new);
    }

    /**
     * Data items in the NDB_STRUCT_FEATURE_NA category
     * describes tertiary and other special structural
     * features in this entry.
     * @return NdbStructFeatureNa
     */
    public NdbStructFeatureNa getNdbStructFeatureNa() {
        return delegate.getCategory("ndb_struct_feature_na", NdbStructFeatureNa::new);
    }

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
     * of base pairing interactions.
     * @return NdbStructNaBasePair
     */
    public NdbStructNaBasePair getNdbStructNaBasePair() {
        return delegate.getCategory("ndb_struct_na_base_pair", NdbStructNaBasePair::new);
    }

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
     * of base pair step interactions.
     * @return NdbStructNaBasePairStep
     */
    public NdbStructNaBasePairStep getNdbStructNaBasePairStep() {
        return delegate.getCategory("ndb_struct_na_base_pair_step", NdbStructNaBasePairStep::new);
    }

    /**
     * Placeholder category for PDB coordinate data.
     * @return NdbOriginalNdbCoordinates
     */
    public NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates() {
        return delegate.getCategory("ndb_original_ndb_coordinates", NdbOriginalNdbCoordinates::new);
    }

    /**
     * 
     * @return PdbxEntityNonpoly
     */
    public PdbxEntityNonpoly getPdbxEntityNonpoly() {
        return delegate.getCategory("pdbx_entity_nonpoly", PdbxEntityNonpoly::new);
    }

    /**
     * Data items in the PDBX_PHASING_DM category record details about
     * density modification
     * @return PdbxPhasingDm
     */
    public PdbxPhasingDm getPdbxPhasingDm() {
        return delegate.getCategory("pdbx_phasing_dm", PdbxPhasingDm::new);
    }

    /**
     * Data items in the PDBX_PHASING_DM_SHELL category record details about
     * density modification in resolution shell.
     * @return PdbxPhasingDmShell
     */
    public PdbxPhasingDmShell getPdbxPhasingDmShell() {
        return delegate.getCategory("pdbx_phasing_dm_shell", PdbxPhasingDmShell::new);
    }

    /**
     * Data items in the PDBX_PHASING_MAD_SHELL category record details about
     * the phasing of the structure, when methods involving multiple
     * anomalous dispersion techniques are involved (note: the
     * values are overall, but broken down into shells of resolution)
     * @return PdbxPhasingMADShell
     */
    public PdbxPhasingMADShell getPdbxPhasingMADShell() {
        return delegate.getCategory("pdbx_phasing_MAD_shell", PdbxPhasingMADShell::new);
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
    public PdbxPhasingMADSet getPdbxPhasingMADSet() {
        return delegate.getCategory("pdbx_phasing_MAD_set", PdbxPhasingMADSet::new);
    }

    /**
     * The same as category pdbx_phasing_MAD_set, but
     * broken into shells.
     * @return PdbxPhasingMADSetShell
     */
    public PdbxPhasingMADSetShell getPdbxPhasingMADSetShell() {
        return delegate.getCategory("pdbx_phasing_MAD_set_shell", PdbxPhasingMADSetShell::new);
    }

    /**
     * record the details (coordinates etc.) of anomalous scatters.
     * @return PdbxPhasingMADSetSite
     */
    public PdbxPhasingMADSetSite getPdbxPhasingMADSetSite() {
        return delegate.getCategory("pdbx_phasing_MAD_set_site", PdbxPhasingMADSetSite::new);
    }

    /**
     * Data items in the PDBX_PHASING_MR category record details about
     * molecular replacement.
     * @return PdbxPhasingMR
     */
    public PdbxPhasingMR getPdbxPhasingMR() {
        return delegate.getCategory("pdbx_phasing_MR", PdbxPhasingMR::new);
    }

    /**
     * Data items in the PDBX_REFINE_COMPONENT category record
     * statistics of the final model relative to the density map.
     * @return PdbxRefineComponent
     */
    public PdbxRefineComponent getPdbxRefineComponent() {
        return delegate.getCategory("pdbx_refine_component", PdbxRefineComponent::new);
    }

    /**
     * This category contains descriptive protocols for the production
     * of this entity.
     * @return PdbxEntityProdProtocol
     */
    public PdbxEntityProdProtocol getPdbxEntityProdProtocol() {
        return delegate.getCategory("pdbx_entity_prod_protocol", PdbxEntityProdProtocol::new);
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
    public PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther() {
        return delegate.getCategory("pdbx_entity_src_gen_prod_other", PdbxEntitySrcGenProdOther::new);
    }

    /**
     * This category contains parameters and values required to capture
     * information about a particular process step
     * @return PdbxEntitySrcGenProdOtherParameter
     */
    public PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter() {
        return delegate.getCategory("pdbx_entity_src_gen_prod_other_parameter", PdbxEntitySrcGenProdOtherParameter::new);
    }

    /**
     * This category contains details for the PCR steps used in
     * the overall protein production process. The PCR is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdPcr
     */
    public PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr() {
        return delegate.getCategory("pdbx_entity_src_gen_prod_pcr", PdbxEntitySrcGenProdPcr::new);
    }

    /**
     * This category contains details for the DIGEST steps used in
     * the overall protein production process. The digestion is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdDigest
     */
    public PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest() {
        return delegate.getCategory("pdbx_entity_src_gen_prod_digest", PdbxEntitySrcGenProdDigest::new);
    }

    /**
     * This category contains details for the cloning steps used in
     * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
     * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
     * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
     * provided data in the later two categories may be omitted.
     * @return PdbxEntitySrcGenClone
     */
    public PdbxEntitySrcGenClone getPdbxEntitySrcGenClone() {
        return delegate.getCategory("pdbx_entity_src_gen_clone", PdbxEntitySrcGenClone::new);
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
    public PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation() {
        return delegate.getCategory("pdbx_entity_src_gen_clone_ligation", PdbxEntitySrcGenCloneLigation::new);
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
    public PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination() {
        return delegate.getCategory("pdbx_entity_src_gen_clone_recombination", PdbxEntitySrcGenCloneRecombination::new);
    }

    /**
     * This category contains details for the EXPRESSION steps used in
     * the overall protein production process. It is hoped that this category
     * will cover all forms of cell-based expression by reading induction as
     * induction/transformation/transfection.
     * @return PdbxEntitySrcGenExpress
     */
    public PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress() {
        return delegate.getCategory("pdbx_entity_src_gen_express", PdbxEntitySrcGenExpress::new);
    }

    /**
     * This category contains details for OD time series used to monitor a
     * given EXPRESSION step used in the overall protein production process.
     * @return PdbxEntitySrcGenExpressTimepoint
     */
    public PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint() {
        return delegate.getCategory("pdbx_entity_src_gen_express_timepoint", PdbxEntitySrcGenExpressTimepoint::new);
    }

    /**
     * This category contains details for the cell lysis steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenLysis
     */
    public PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis() {
        return delegate.getCategory("pdbx_entity_src_gen_lysis", PdbxEntitySrcGenLysis::new);
    }

    /**
     * This category contains details for the refolding steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenRefold
     */
    public PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold() {
        return delegate.getCategory("pdbx_entity_src_gen_refold", PdbxEntitySrcGenRefold::new);
    }

    /**
     * This category contains details for the protein purification
     * tag removal steps used in the overall protein production process
     * @return PdbxEntitySrcGenProteolysis
     */
    public PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis() {
        return delegate.getCategory("pdbx_entity_src_gen_proteolysis", PdbxEntitySrcGenProteolysis::new);
    }

    /**
     * This category contains details for the chromatographic steps used in the
     * purification of the protein.
     * @return PdbxEntitySrcGenChrom
     */
    public PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom() {
        return delegate.getCategory("pdbx_entity_src_gen_chrom", PdbxEntitySrcGenChrom::new);
    }

    /**
     * This category contains details for the fraction steps used in
     * the overall protein production process. Examples of fractionation
     * steps are centrifugation and magnetic bead pull-down purification.
     * @return PdbxEntitySrcGenFract
     */
    public PdbxEntitySrcGenFract getPdbxEntitySrcGenFract() {
        return delegate.getCategory("pdbx_entity_src_gen_fract", PdbxEntitySrcGenFract::new);
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
    public PdbxEntitySrcGenPure getPdbxEntitySrcGenPure() {
        return delegate.getCategory("pdbx_entity_src_gen_pure", PdbxEntitySrcGenPure::new);
    }

    /**
     * This category contains details of protein characterisation. It
     * refers to the characteristion of the product of a specific
     * step.
     * @return PdbxEntitySrcGenCharacter
     */
    public PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter() {
        return delegate.getCategory("pdbx_entity_src_gen_character", PdbxEntitySrcGenCharacter::new);
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
    public PdbxConstruct getPdbxConstruct() {
        return delegate.getCategory("pdbx_construct", PdbxConstruct::new);
    }

    /**
     * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
     * specify various properties of a nucleic acid sequence used during
     * protein production.
     * @return PdbxConstructFeature
     */
    public PdbxConstructFeature getPdbxConstructFeature() {
        return delegate.getCategory("pdbx_construct_feature", PdbxConstructFeature::new);
    }

    /**
     * The details about each robotic system used to collect data for this
     * project.
     * @return PdbxRobotSystem
     */
    public PdbxRobotSystem getPdbxRobotSystem() {
        return delegate.getCategory("pdbx_robot_system", PdbxRobotSystem::new);
    }

    /**
     * Data items in the PDBX_BUFFER category
     * record details of the sample buffer.
     * @return PdbxBuffer
     */
    public PdbxBuffer getPdbxBuffer() {
        return delegate.getCategory("pdbx_buffer", PdbxBuffer::new);
    }

    /**
     * Constituents of buffer in sample
     * @return PdbxBufferComponents
     */
    public PdbxBufferComponents getPdbxBufferComponents() {
        return delegate.getCategory("pdbx_buffer_components", PdbxBufferComponents::new);
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
    public PdbxDomain getPdbxDomain() {
        return delegate.getCategory("pdbx_domain", PdbxDomain::new);
    }

    /**
     * Data items in the PDBX_DOMAIN_RANGE category identify the
     * beginning and ending points of polypeptide chain segments
     * that form all or part of a domain.
     * @return PdbxDomainRange
     */
    public PdbxDomainRange getPdbxDomainRange() {
        return delegate.getCategory("pdbx_domain_range", PdbxDomainRange::new);
    }

    /**
     * Data items in the PDBX_SEQUENCE_RANGE category identify the
     * beginning and ending points of polypeptide sequence segments.
     * @return PdbxSequenceRange
     */
    public PdbxSequenceRange getPdbxSequenceRange() {
        return delegate.getCategory("pdbx_sequence_range", PdbxSequenceRange::new);
    }

    /**
     * Data items in the PDBX_FEATURE_ENTRY category records
     * information about properties pertaining to this
     * structure entry.
     * @return PdbxFeatureEntry
     */
    public PdbxFeatureEntry getPdbxFeatureEntry() {
        return delegate.getCategory("pdbx_feature_entry", PdbxFeatureEntry::new);
    }

    /**
     * Data items in the PDBX_FEATURE_DOMAIN category records
     * information about properties pertaining to this structure
     * domain.
     * @return PdbxFeatureDomain
     */
    public PdbxFeatureDomain getPdbxFeatureDomain() {
        return delegate.getCategory("pdbx_feature_domain", PdbxFeatureDomain::new);
    }

    /**
     * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category
     * records information about properties pertaining to
     * this structure sequence_range.
     * @return PdbxFeatureSequenceRange
     */
    public PdbxFeatureSequenceRange getPdbxFeatureSequenceRange() {
        return delegate.getCategory("pdbx_feature_sequence_range", PdbxFeatureSequenceRange::new);
    }

    /**
     * Data items in the PDBX_FEATURE_ASSEMBLY category records
     * information about properties pertaining to this
     * structural assembly.
     * @return PdbxFeatureAssembly
     */
    public PdbxFeatureAssembly getPdbxFeatureAssembly() {
        return delegate.getCategory("pdbx_feature_assembly", PdbxFeatureAssembly::new);
    }

    /**
     * Data items in the PDBX_FEATURE_MONOMER category records
     * information about properties pertaining to particular
     * monomers in this structure.
     * @return PdbxFeatureMonomer
     */
    public PdbxFeatureMonomer getPdbxFeatureMonomer() {
        return delegate.getCategory("pdbx_feature_monomer", PdbxFeatureMonomer::new);
    }

    /**
     * Data items in the pdbx_exptl_pd record information about
     * powder sample preparations.
     * @return PdbxExptlPd
     */
    public PdbxExptlPd getPdbxExptlPd() {
        return delegate.getCategory("pdbx_exptl_pd", PdbxExptlPd::new);
    }

    /**
     * Details decribing crystallographic twinning.
     * @return PdbxReflnsTwin
     */
    public PdbxReflnsTwin getPdbxReflnsTwin() {
        return delegate.getCategory("pdbx_reflns_twin", PdbxReflnsTwin::new);
    }

    /**
     * Special features of this structural entry.
     * @return PdbxStructInfo
     */
    public PdbxStructInfo getPdbxStructInfo() {
        return delegate.getCategory("pdbx_struct_info", PdbxStructInfo::new);
    }

    /**
     * Describes the origin of the experimental data used in this
     * entry.
     * @return PdbxReRefinement
     */
    public PdbxReRefinement getPdbxReRefinement() {
        return delegate.getCategory("pdbx_re_refinement", PdbxReRefinement::new);
    }

    /**
     * Properties and features of structural assemblies.
     * @return PdbxStructAssemblyProp
     */
    public PdbxStructAssemblyProp getPdbxStructAssemblyProp() {
        return delegate.getCategory("pdbx_struct_assembly_prop", PdbxStructAssemblyProp::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
     * mechanism for identifying and annotating sequence features.
     * @return PdbxStructRefSeqFeature
     */
    public PdbxStructRefSeqFeature getPdbxStructRefSeqFeature() {
        return delegate.getCategory("pdbx_struct_ref_seq_feature", PdbxStructRefSeqFeature::new);
    }

    /**
     * 
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
     * mechanism for identifying and annotating properties of sequence features.
     * @return PdbxStructRefSeqFeatureProp
     */
    public PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp() {
        return delegate.getCategory("pdbx_struct_ref_seq_feature_prop", PdbxStructRefSeqFeatureProp::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
     * structural diagnostics in chemical components instances.
     * @return PdbxStructChemCompDiagnostics
     */
    public PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics() {
        return delegate.getCategory("pdbx_struct_chem_comp_diagnostics", PdbxStructChemCompDiagnostics::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompFeature
     */
    public PdbxChemCompFeature getPdbxChemCompFeature() {
        return delegate.getCategory("pdbx_chem_comp_feature", PdbxChemCompFeature::new);
    }

    /**
     * The details of the composition of the coordinate model.
     * @return PdbxCoordinateModel
     */
    public PdbxCoordinateModel getPdbxCoordinateModel() {
        return delegate.getCategory("pdbx_coordinate_model", PdbxCoordinateModel::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_FEATURE category provides
     * structural annotations in chemical components instances.
     * @return PdbxStructChemCompFeature
     */
    public PdbxStructChemCompFeature getPdbxStructChemCompFeature() {
        return delegate.getCategory("pdbx_struct_chem_comp_feature", PdbxStructChemCompFeature::new);
    }

    /**
     * Data items in the DIFFRN_REFLNS_SHELL category record details about
     * the reflection data set within shells of resolution.
     * @return PdbxDiffrnReflnsShell
     */
    public PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell() {
        return delegate.getCategory("pdbx_diffrn_reflns_shell", PdbxDiffrnReflnsShell::new);
    }

    /**
     * This category provides a table of upper and lower distance
     * limits used as criteria in determining covalent bonds.
     * The table is organized by atom type pairs.
     * @return PdbxBondDistanceLimits
     */
    public PdbxBondDistanceLimits getPdbxBondDistanceLimits() {
        return delegate.getCategory("pdbx_bond_distance_limits", PdbxBondDistanceLimits::new);
    }

    /**
     * Data items in the PDBX_SOLN_SCATTER category record details about a
     * solution scattering experiment
     * @return PdbxSolnScatter
     */
    public PdbxSolnScatter getPdbxSolnScatter() {
        return delegate.getCategory("pdbx_soln_scatter", PdbxSolnScatter::new);
    }

    /**
     * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
     * homology model fitting to the solution scatter data.
     * @return PdbxSolnScatterModel
     */
    public PdbxSolnScatterModel getPdbxSolnScatterModel() {
        return delegate.getCategory("pdbx_soln_scatter_model", PdbxSolnScatterModel::new);
    }

    /**
     * Data items in the CHEM_COMP_DESCRIPTOR category provide
     * string descriptors of component chemical structure.
     * @return PdbxChemCompDescriptor
     */
    public PdbxChemCompDescriptor getPdbxChemCompDescriptor() {
        return delegate.getCategory("pdbx_chem_comp_descriptor", PdbxChemCompDescriptor::new);
    }

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    public PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return delegate.getCategory("pdbx_chem_comp_identifier", PdbxChemCompIdentifier::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_IMPORT category identify
     * existing chemical components to be imported into the
     * current component definition.  Components in this list
     * can be edited by instructions in categories
     * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
     * @return PdbxChemCompImport
     */
    public PdbxChemCompImport getPdbxChemCompImport() {
        return delegate.getCategory("pdbx_chem_comp_import", PdbxChemCompImport::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
     * atom level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompAtomEdit
     */
    public PdbxChemCompAtomEdit getPdbxChemCompAtomEdit() {
        return delegate.getCategory("pdbx_chem_comp_atom_edit", PdbxChemCompAtomEdit::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
     * bond level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompBondEdit
     */
    public PdbxChemCompBondEdit getPdbxChemCompBondEdit() {
        return delegate.getCategory("pdbx_chem_comp_bond_edit", PdbxChemCompBondEdit::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_AUDIT category records
     * the status and tracking information for this component.
     * @return PdbxChemCompAudit
     */
    public PdbxChemCompAudit getPdbxChemCompAudit() {
        return delegate.getCategory("pdbx_chem_comp_audit", PdbxChemCompAudit::new);
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
    public PdbxValidateCloseContact getPdbxValidateCloseContact() {
        return delegate.getCategory("pdbx_validate_close_contact", PdbxValidateCloseContact::new);
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
    public PdbxValidateSymmContact getPdbxValidateSymmContact() {
        return delegate.getCategory("pdbx_validate_symm_contact", PdbxValidateSymmContact::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_RMSD_BOND category list the
     * covalent bonds that have values which deviate from expected
     * values by more than 6*rmsd.
     * @return PdbxValidateRmsdBond
     */
    public PdbxValidateRmsdBond getPdbxValidateRmsdBond() {
        return delegate.getCategory("pdbx_validate_rmsd_bond", PdbxValidateRmsdBond::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
     * the covalent bond angles found in an entry that have
     * values which deviate from expected values by more
     * than 6*rmsd for the particular entry from the expected standard
     * value
     * @return PdbxValidateRmsdAngle
     */
    public PdbxValidateRmsdAngle getPdbxValidateRmsdAngle() {
        return delegate.getCategory("pdbx_validate_rmsd_angle", PdbxValidateRmsdAngle::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_TORSION category list the
     * residues with torsion angles outside the expected ramachandran regions
     * @return PdbxValidateTorsion
     */
    public PdbxValidateTorsion getPdbxValidateTorsion() {
        return delegate.getCategory("pdbx_validate_torsion", PdbxValidateTorsion::new);
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
    public PdbxValidatePeptideOmega getPdbxValidatePeptideOmega() {
        return delegate.getCategory("pdbx_validate_peptide_omega", PdbxValidatePeptideOmega::new);
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
    public PdbxValidateChiral getPdbxValidateChiral() {
        return delegate.getCategory("pdbx_validate_chiral", PdbxValidateChiral::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_PLANES category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanes
     */
    public PdbxValidatePlanes getPdbxValidatePlanes() {
        return delegate.getCategory("pdbx_validate_planes", PdbxValidatePlanes::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanesAtom
     */
    public PdbxValidatePlanesAtom getPdbxValidatePlanesAtom() {
        return delegate.getCategory("pdbx_validate_planes_atom", PdbxValidatePlanesAtom::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_MAIN_CHAIN_PLANE category list the
     * residues that contain unexpected deviations from planes
     * for main chain atoms as defined by the improper torsion
     * angle describing planarity:
     * 
     * PLANARITY = C(i-1) - CA(i-1) - N(i) - O(i-1) ==&gt; planar &lt; 5
     * as a pseudo torsion
     * @return PdbxValidateMainChainPlane
     */
    public PdbxValidateMainChainPlane getPdbxValidateMainChainPlane() {
        return delegate.getCategory("pdbx_validate_main_chain_plane", PdbxValidateMainChainPlane::new);
    }

    /**
     * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
     * in connections between portions of the structure.
     * @return PdbxStructConnAngle
     */
    public PdbxStructConnAngle getPdbxStructConnAngle() {
        return delegate.getCategory("pdbx_struct_conn_angle", PdbxStructConnAngle::new);
    }

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_RESIDUES category list the
     * residues within the entry that are not observed or have zero occupancy.
     * @return PdbxUnobsOrZeroOccResidues
     */
    public PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues() {
        return delegate.getCategory("pdbx_unobs_or_zero_occ_residues", PdbxUnobsOrZeroOccResidues::new);
    }

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
     * atoms within the entry that are either unobserved or have zero occupancy/
     * @return PdbxUnobsOrZeroOccAtoms
     */
    public PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms() {
        return delegate.getCategory("pdbx_unobs_or_zero_occ_atoms", PdbxUnobsOrZeroOccAtoms::new);
    }

    /**
     * Data items in the PDBX_ENTRY_DETAILS category provide additional
     * details about this entry.
     * @return PdbxEntryDetails
     */
    public PdbxEntryDetails getPdbxEntryDetails() {
        return delegate.getCategory("pdbx_entry_details", PdbxEntryDetails::new);
    }

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    public PdbxStructModResidue getPdbxStructModResidue() {
        return delegate.getCategory("pdbx_struct_mod_residue", PdbxStructModResidue::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate insertions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqInsertion
     */
    public PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion() {
        return delegate.getCategory("pdbx_struct_ref_seq_insertion", PdbxStructRefSeqInsertion::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate deletions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqDeletion
     */
    public PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion() {
        return delegate.getCategory("pdbx_struct_ref_seq_deletion", PdbxStructRefSeqDeletion::new);
    }

    /**
     * Data items in the PDBX_REMEDIATION_ATOM_SITE_MAPPING category records
     * mapping information between selected molecular entities that have been
     * chemically redefined.   The prior and current atom nomenclature is
     * tabulated in this category.
     * @return PdbxRemediationAtomSiteMapping
     */
    public PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping() {
        return delegate.getCategory("pdbx_remediation_atom_site_mapping", PdbxRemediationAtomSiteMapping::new);
    }

    /**
     * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
     * polymer linkages within the entry that are outside of typlical
     * covalent distances.
     * @return PdbxValidatePolymerLinkage
     */
    public PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage() {
        return delegate.getCategory("pdbx_validate_polymer_linkage", PdbxValidatePolymerLinkage::new);
    }

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
     * helical symmetry group associated with this entry.
     * @return PdbxHelicalSymmetry
     */
    public PdbxHelicalSymmetry getPdbxHelicalSymmetry() {
        return delegate.getCategory("pdbx_helical_symmetry", PdbxHelicalSymmetry::new);
    }

    /**
     * Data items in the PDBX_POINT_SYMMETRY category record details about the
     * point symmetry group associated with this entry.
     * @return PdbxPointSymmetry
     */
    public PdbxPointSymmetry getPdbxPointSymmetry() {
        return delegate.getCategory("pdbx_point_symmetry", PdbxPointSymmetry::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
     * structural elements in the deposited entry.  The entity instance is a method
     * neutral identifier for the observed molecular entities in the deposited coordinate
     * set.
     * @return PdbxStructEntityInst
     */
    public PdbxStructEntityInst getPdbxStructEntityInst() {
        return delegate.getCategory("pdbx_struct_entity_inst", PdbxStructEntityInst::new);
    }

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    public PdbxStructOperList getPdbxStructOperList() {
        return delegate.getCategory("pdbx_struct_oper_list", PdbxStructOperList::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    public PdbxStructAssembly getPdbxStructAssembly() {
        return delegate.getCategory("pdbx_struct_assembly", PdbxStructAssembly::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    public PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return delegate.getCategory("pdbx_struct_assembly_gen", PdbxStructAssemblyGen::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
     * the generation of the crystallographic asymmetric unit. The
     * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
     * components that constitute the asymmetric unit in terms of cartesian
     * transformations of deposited coordinates.
     * @return PdbxStructAsymGen
     */
    public PdbxStructAsymGen getPdbxStructAsymGen() {
        return delegate.getCategory("pdbx_struct_asym_gen", PdbxStructAsymGen::new);
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
    public PdbxStructMsymGen getPdbxStructMsymGen() {
        return delegate.getCategory("pdbx_struct_msym_gen", PdbxStructMsymGen::new);
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
    public PdbxStructLegacyOperList getPdbxStructLegacyOperList() {
        return delegate.getCategory("pdbx_struct_legacy_oper_list", PdbxStructLegacyOperList::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_FEATURE category provide
     * a selected list of atom level features for the chemical component.
     * @return PdbxChemCompAtomFeature
     */
    public PdbxChemCompAtomFeature getPdbxChemCompAtomFeature() {
        return delegate.getCategory("pdbx_chem_comp_atom_feature", PdbxChemCompAtomFeature::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
     * entity families.
     * @return PdbxReferenceMoleculeFamily
     */
    public PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily() {
        return delegate.getCategory("pdbx_reference_molecule_family", PdbxReferenceMoleculeFamily::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMoleculeList
     */
    public PdbxReferenceMoleculeList getPdbxReferenceMoleculeList() {
        return delegate.getCategory("pdbx_reference_molecule_list", PdbxReferenceMoleculeList::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMolecule
     */
    public PdbxReferenceMolecule getPdbxReferenceMolecule() {
        return delegate.getCategory("pdbx_reference_molecule", PdbxReferenceMolecule::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    public PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return delegate.getCategory("pdbx_reference_entity_list", PdbxReferenceEntityList::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_NONPOLY category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityNonpoly
     */
    public PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly() {
        return delegate.getCategory("pdbx_reference_entity_nonpoly", PdbxReferenceEntityNonpoly::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    public PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return delegate.getCategory("pdbx_reference_entity_link", PdbxReferenceEntityLink::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    public PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return delegate.getCategory("pdbx_reference_entity_poly_link", PdbxReferenceEntityPolyLink::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY category record details about
     * the polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return PdbxReferenceEntityPoly
     */
    public PdbxReferenceEntityPoly getPdbxReferenceEntityPoly() {
        return delegate.getCategory("pdbx_reference_entity_poly", PdbxReferenceEntityPoly::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer.
     * @return PdbxReferenceEntityPolySeq
     */
    public PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq() {
        return delegate.getCategory("pdbx_reference_entity_poly_seq", PdbxReferenceEntityPolySeq::new);
    }

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceEntitySequence
     */
    public PdbxReferenceEntitySequence getPdbxReferenceEntitySequence() {
        return delegate.getCategory("pdbx_reference_entity_sequence", PdbxReferenceEntitySequence::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
     * details of the source from which the entity was obtained.
     * @return PdbxReferenceEntitySrcNat
     */
    public PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat() {
        return delegate.getCategory("pdbx_reference_entity_src_nat", PdbxReferenceEntitySrcNat::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
     * textual details about small polymer molecules.
     * @return PdbxReferenceMoleculeDetails
     */
    public PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails() {
        return delegate.getCategory("pdbx_reference_molecule_details", PdbxReferenceMoleculeDetails::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records
     * synonym names for reference entities.
     * @return PdbxReferenceMoleculeSynonyms
     */
    public PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms() {
        return delegate.getCategory("pdbx_reference_molecule_synonyms", PdbxReferenceMoleculeSynonyms::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
     * subcomponent sequence from which this entity could be built.
     * @return PdbxReferenceEntitySubcomponents
     */
    public PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents() {
        return delegate.getCategory("pdbx_reference_entity_subcomponents", PdbxReferenceEntitySubcomponents::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
     * additional annotation relevant to the molecular entities.
     * @return PdbxReferenceMoleculeAnnotation
     */
    public PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation() {
        return delegate.getCategory("pdbx_reference_molecule_annotation", PdbxReferenceMoleculeAnnotation::new);
    }

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceMoleculeFeatures
     */
    public PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures() {
        return delegate.getCategory("pdbx_reference_molecule_features", PdbxReferenceMoleculeFeatures::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
     * details of the structural examples in related databases for this entity.
     * @return PdbxReferenceMoleculeRelatedStructures
     */
    public PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures() {
        return delegate.getCategory("pdbx_reference_molecule_related_structures", PdbxReferenceMoleculeRelatedStructures::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
     * or atoms.
     * @return PdbxStructGroupList
     */
    public PdbxStructGroupList getPdbxStructGroupList() {
        return delegate.getCategory("pdbx_struct_group_list", PdbxStructGroupList::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENTS category list component-level
     * group assignments within the entry.  Groups are defined and described in category
     * PDBX_STRUCT_GROUP_LIST.
     * @return PdbxStructGroupComponents
     */
    public PdbxStructGroupComponents getPdbxStructGroupComponents() {
        return delegate.getCategory("pdbx_struct_group_components", PdbxStructGroupComponents::new);
    }

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
     * group as a continuous span chemical components.
     * @return PdbxStructGroupComponentRange
     */
    public PdbxStructGroupComponentRange getPdbxStructGroupComponentRange() {
        return delegate.getCategory("pdbx_struct_group_component_range", PdbxStructGroupComponentRange::new);
    }

    /**
     * Data items in the PDBX_PRD_AUDIT category records
     * the status and tracking information for this molecule.
     * @return PdbxPrdAudit
     */
    public PdbxPrdAudit getPdbxPrdAudit() {
        return delegate.getCategory("pdbx_prd_audit", PdbxPrdAudit::new);
    }

    /**
     * Data items in the PDBX_FAMILY_PRD_AUDIT category records
     * the status and tracking information for this family.
     * @return PdbxFamilyPrdAudit
     */
    public PdbxFamilyPrdAudit getPdbxFamilyPrdAudit() {
        return delegate.getCategory("pdbx_family_prd_audit", PdbxFamilyPrdAudit::new);
    }

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    public PdbxMolecule getPdbxMolecule() {
        return delegate.getCategory("pdbx_molecule", PdbxMolecule::new);
    }

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    public PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return delegate.getCategory("pdbx_molecule_features", PdbxMoleculeFeatures::new);
    }

    /**
     * Data items in the PDBX_FAMILY_GROUP_INDEX category record
     * the family membership in family groups.
     * @return PdbxFamilyGroupIndex
     */
    public PdbxFamilyGroupIndex getPdbxFamilyGroupIndex() {
        return delegate.getCategory("pdbx_family_group_index", PdbxFamilyGroupIndex::new);
    }

    /**
     * Data items in the PDBX_DISTANT_SOLVENT_ATOMS category list the
     * solvent atoms remote from any macromolecule.
     * @return PdbxDistantSolventAtoms
     */
    public PdbxDistantSolventAtoms getPdbxDistantSolventAtoms() {
        return delegate.getCategory("pdbx_distant_solvent_atoms", PdbxDistantSolventAtoms::new);
    }

    /**
     * Data items in the PDBX_STRUCT_SPECIAL_SYMMETRY category list the
     * molecular components that lie on special symmetry positions.
     * @return PdbxStructSpecialSymmetry
     */
    public PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry() {
        return delegate.getCategory("pdbx_struct_special_symmetry", PdbxStructSpecialSymmetry::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
     * related to PDB citation data.
     * @return PdbxReferencePublicationList
     */
    public PdbxReferencePublicationList getPdbxReferencePublicationList() {
        return delegate.getCategory("pdbx_reference_publication_list", PdbxReferencePublicationList::new);
    }

    /**
     * 
     * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
     * @return PdbxNmrAssignedChemShiftList
     */
    public PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList() {
        return delegate.getCategory("pdbx_nmr_assigned_chem_shift_list", PdbxNmrAssignedChemShiftList::new);
    }

    /**
     * 
     * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
     * @return PdbxNmrChemShiftExperiment
     */
    public PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment() {
        return delegate.getCategory("pdbx_nmr_chem_shift_experiment", PdbxNmrChemShiftExperiment::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
     * @return PdbxNmrChemShiftRef
     */
    public PdbxNmrChemShiftRef getPdbxNmrChemShiftRef() {
        return delegate.getCategory("pdbx_nmr_chem_shift_ref", PdbxNmrChemShiftRef::new);
    }

    /**
     * 
     * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
     * @return PdbxNmrChemShiftReference
     */
    public PdbxNmrChemShiftReference getPdbxNmrChemShiftReference() {
        return delegate.getCategory("pdbx_nmr_chem_shift_reference", PdbxNmrChemShiftReference::new);
    }

    /**
     * 
     * Items in the chem_shift_software category provide pointers to the software category and methods category.
     * @return PdbxNmrChemShiftSoftware
     */
    public PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware() {
        return delegate.getCategory("pdbx_nmr_chem_shift_software", PdbxNmrChemShiftSoftware::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
     * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
     * @return PdbxNmrConstraintFile
     */
    public PdbxNmrConstraintFile getPdbxNmrConstraintFile() {
        return delegate.getCategory("pdbx_nmr_constraint_file", PdbxNmrConstraintFile::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
     * @return PdbxNmrSoftwareTask
     */
    public PdbxNmrSoftwareTask getPdbxNmrSoftwareTask() {
        return delegate.getCategory("pdbx_nmr_software_task", PdbxNmrSoftwareTask::new);
    }

    /**
     * 
     * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
     * @return PdbxNmrSpectralDim
     */
    public PdbxNmrSpectralDim getPdbxNmrSpectralDim() {
        return delegate.getCategory("pdbx_nmr_spectral_dim", PdbxNmrSpectralDim::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
     * @return PdbxNmrSpectralPeakList
     */
    public PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList() {
        return delegate.getCategory("pdbx_nmr_spectral_peak_list", PdbxNmrSpectralPeakList::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
     * and methods category where descriptions of software applications and methods can be found.
     * @return PdbxNmrSpectralPeakSoftware
     */
    public PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware() {
        return delegate.getCategory("pdbx_nmr_spectral_peak_software", PdbxNmrSpectralPeakSoftware::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
     * @return PdbxNmrSystematicChemShiftOffset
     */
    public PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset() {
        return delegate.getCategory("pdbx_nmr_systematic_chem_shift_offset", PdbxNmrSystematicChemShiftOffset::new);
    }

    /**
     * 
     * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
     * @return PdbxNmrUpload
     */
    public PdbxNmrUpload getPdbxNmrUpload() {
        return delegate.getCategory("pdbx_nmr_upload", PdbxNmrUpload::new);
    }

    /**
     * Data items in the PDBX_AUDIT_SUPPORT category record details about
     * funding support for the entry.
     * @return PdbxAuditSupport
     */
    public PdbxAuditSupport getPdbxAuditSupport() {
        return delegate.getCategory("pdbx_audit_support", PdbxAuditSupport::new);
    }

    /**
     * Data items in the pdbx_chem_comp_subcomponent_struct_conn
     * list the chemical interactions among the subcomponents in
     * the chemical component.
     * @return PdbxChemCompSubcomponentStructConn
     */
    public PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn() {
        return delegate.getCategory("pdbx_chem_comp_subcomponent_struct_conn", PdbxChemCompSubcomponentStructConn::new);
    }

    /**
     * Data items in the pdbx_chem_comp_subcomponent_entity_list category
     * list the constituent chemical entities and entity features in this chemical component.
     * @return PdbxChemCompSubcomponentEntityList
     */
    public PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList() {
        return delegate.getCategory("pdbx_chem_comp_subcomponent_entity_list", PdbxChemCompSubcomponentEntityList::new);
    }

    /**
     * Data items in the ENTITY_SRC_NAT category record details of
     * the source from which the entity was obtained in cases
     * where the entity was isolated directly from a natural tissue.
     * @return EntitySrcNat
     */
    public EntitySrcNat getEntitySrcNat() {
        return delegate.getCategory("entity_src_nat", EntitySrcNat::new);
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
    public EntitySrcGen getEntitySrcGen() {
        return delegate.getCategory("entity_src_gen", EntitySrcGen::new);
    }

    /**
     * The data items in category PDBX_ENTITY_SRC_SYN record the source details
     * about chemically synthesized molecules.
     * @return PdbxEntitySrcSyn
     */
    public PdbxEntitySrcSyn getPdbxEntitySrcSyn() {
        return delegate.getCategory("pdbx_entity_src_syn", PdbxEntitySrcSyn::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
     * the linkages between components within the polymer entity.
     * @return PdbxEntityPolyCompLinkList
     */
    public PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList() {
        return delegate.getCategory("pdbx_entity_poly_comp_link_list", PdbxEntityPolyCompLinkList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY category record
     * information about molecules composed of linked entities.
     * @return PdbxLinkedEntity
     */
    public PdbxLinkedEntity getPdbxLinkedEntity() {
        return delegate.getCategory("pdbx_linked_entity", PdbxLinkedEntity::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
     * molecules represented as linked entities within an entry.
     * @return PdbxLinkedEntityInstanceList
     */
    public PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList() {
        return delegate.getCategory("pdbx_linked_entity_instance_list", PdbxLinkedEntityInstanceList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_LIST category record
     * the list of entity constituents for this molecule.
     * @return PdbxLinkedEntityList
     */
    public PdbxLinkedEntityList getPdbxLinkedEntityList() {
        return delegate.getCategory("pdbx_linked_entity_list", PdbxLinkedEntityList::new);
    }

    /**
     * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
     * the linkages with molecules represented as linked entities.
     * @return PdbxLinkedEntityLinkList
     */
    public PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList() {
        return delegate.getCategory("pdbx_linked_entity_link_list", PdbxLinkedEntityLinkList::new);
    }

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    public PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return delegate.getCategory("pdbx_entity_descriptor", PdbxEntityDescriptor::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity category describe
     * common observed interaction patterns within linked entities.
     * @return PdbxReferenceLinkedEntity
     */
    public PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity() {
        return delegate.getCategory("pdbx_reference_linked_entity", PdbxReferenceLinkedEntity::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_comp_list category lists
     * the constituents of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompList
     */
    public PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList() {
        return delegate.getCategory("pdbx_reference_linked_entity_comp_list", PdbxReferenceLinkedEntityCompList::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
     * inter-entity linkages between the components of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompLink
     */
    public PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink() {
        return delegate.getCategory("pdbx_reference_linked_entity_comp_link", PdbxReferenceLinkedEntityCompLink::new);
    }

    /**
     * Data items in the pdbx_reference_linked_entity_link category enumerate
     * linkages between the entities in common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityLink
     */
    public PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink() {
        return delegate.getCategory("pdbx_reference_linked_entity_link", PdbxReferenceLinkedEntityLink::new);
    }

    /**
     * Data items in the PDBX_RELATED_DATA_SET category record references
     * to experimental data sets related to the entry.
     * @return PdbxRelatedExpDataSet
     */
    public PdbxRelatedExpDataSet getPdbxRelatedExpDataSet() {
        return delegate.getCategory("pdbx_related_exp_data_set", PdbxRelatedExpDataSet::new);
    }

    /**
     * The pdbx_database_status_history category records the time evolution of entry
     * processing status.
     * @return PdbxDatabaseStatusHistory
     */
    public PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory() {
        return delegate.getCategory("pdbx_database_status_history", PdbxDatabaseStatusHistory::new);
    }

    /**
     * Data items in the EM_ASSEMBLY category record details
     * about the imaged EM sample.
     * @return EmAssembly
     */
    public EmAssembly getEmAssembly() {
        return delegate.getCategory("em_assembly", EmAssembly::new);
    }

    /**
     * Data items in the EM_ENTITY_ASSEMBLY category
     * record details about each component of
     * the complex.
     * @return EmEntityAssembly
     */
    public EmEntityAssembly getEmEntityAssembly() {
        return delegate.getCategory("em_entity_assembly", EmEntityAssembly::new);
    }

    /**
     * Data items in the EM_VIRUS_ENTITY category record details
     * of the icosahedral virus.
     * @return EmVirusEntity
     */
    public EmVirusEntity getEmVirusEntity() {
        return delegate.getCategory("em_virus_entity", EmVirusEntity::new);
    }

    /**
     * Data items in the EM_SAMPLE_PREPARATION category
     * record details of sample conditions prior to and upon loading
     * onto grid support.
     * @return EmSamplePreparation
     */
    public EmSamplePreparation getEmSamplePreparation() {
        return delegate.getCategory("em_sample_preparation", EmSamplePreparation::new);
    }

    /**
     * Data items in the EM_SAMPLE_SUPPORT category record details
     * of the electron microscope grid type, grid support film and pretreatment
     * of whole before sample is applied
     * @return EmSampleSupport
     */
    public EmSampleSupport getEmSampleSupport() {
        return delegate.getCategory("em_sample_support", EmSampleSupport::new);
    }

    /**
     * Data items in the BUFFER category
     * record details of the sample buffer.
     * @return EmBuffer
     */
    public EmBuffer getEmBuffer() {
        return delegate.getCategory("em_buffer", EmBuffer::new);
    }

    /**
     * Data items in the EM_VITRIFICATION category
     * record details about the method and cryogen used in
     * rapid freezing of the sample on the grid prior to its
     * insertion in the electron microscope
     * @return EmVitrification
     */
    public EmVitrification getEmVitrification() {
        return delegate.getCategory("em_vitrification", EmVitrification::new);
    }

    /**
     * Data items in the EM_IMAGING category record details about
     * the parameters used in imaging the sample in the electron microscope.
     * @return EmImaging
     */
    public EmImaging getEmImaging() {
        return delegate.getCategory("em_imaging", EmImaging::new);
    }

    /**
     * Data items in the EM_DETECTOR category record details
     * of the image detector type.
     * @return EmDetector
     */
    public EmDetector getEmDetector() {
        return delegate.getCategory("em_detector", EmDetector::new);
    }

    /**
     * Data items in the EM_IMAGE_SCANS category record details
     * of the image scanning device (microdensitometer)
     * and parameters for digitization of the image.
     * @return EmImageScans
     */
    public EmImageScans getEmImageScans() {
        return delegate.getCategory("em_image_scans", EmImageScans::new);
    }

    /**
     * Data items in the EM_2D_PROJECTION_SELECTION category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return Em2dProjectionSelection
     */
    public Em2dProjectionSelection getEm2dProjectionSelection() {
        return delegate.getCategory("em_2d_projection_selection", Em2dProjectionSelection::new);
    }

    /**
     * Data items in the EM_3D_RECONSTRUCTION category
     * record details of the 3D reconstruction procedure from 2D projections.
     * @return Em3dReconstruction
     */
    public Em3dReconstruction getEm3dReconstruction() {
        return delegate.getCategory("em_3d_reconstruction", Em3dReconstruction::new);
    }

    /**
     * Data items in the 3D_FITTING category
     * record details of the method of fitting atomic
     * coordinates from a PDB file into a 3d-em
     * volume map file
     * @return Em3dFitting
     */
    public Em3dFitting getEm3dFitting() {
        return delegate.getCategory("em_3d_fitting", Em3dFitting::new);
    }

    /**
     * Data items in the 3D_FITTING_LIST category
     * lists the methods of fitting atomic coordinates from a PDB file
     * into a 3d-em volume map file
     * @return Em3dFittingList
     */
    public Em3dFittingList getEm3dFittingList() {
        return delegate.getCategory("em_3d_fitting_list", Em3dFittingList::new);
    }

    /**
     * Data items in the EM_HELICAL_ENTITY category record details
     * for a helical or filament type of assembly component.
     * @return EmHelicalEntity
     */
    public EmHelicalEntity getEmHelicalEntity() {
        return delegate.getCategory("em_helical_entity", EmHelicalEntity::new);
    }

    /**
     * Data items in the EM_EXPERIMENT category provide
     * high-level classification of the EM experiment.
     * @return EmExperiment
     */
    public EmExperiment getEmExperiment() {
        return delegate.getCategory("em_experiment", EmExperiment::new);
    }

    /**
     * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
     * the details of the symmetry for a single particle entity type.
     * @return EmSingleParticleEntity
     */
    public EmSingleParticleEntity getEmSingleParticleEntity() {
        return delegate.getCategory("em_single_particle_entity", EmSingleParticleEntity::new);
    }

    /**
     * Administration-related data items
     * @return EmAdmin
     */
    public EmAdmin getEmAdmin() {
        return delegate.getCategory("em_admin", EmAdmin::new);
    }

    /**
     * Category to collect the authors of this entry
     * @return EmAuthorList
     */
    public EmAuthorList getEmAuthorList() {
        return delegate.getCategory("em_author_list", EmAuthorList::new);
    }

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReference
     */
    public EmDbReference getEmDbReference() {
        return delegate.getCategory("em_db_reference", EmDbReference::new);
    }

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReferenceAuxiliary
     */
    public EmDbReferenceAuxiliary getEmDbReferenceAuxiliary() {
        return delegate.getCategory("em_db_reference_auxiliary", EmDbReferenceAuxiliary::new);
    }

    /**
     * Some internal items to power the deposition interface
     * @return EmDepui
     */
    public EmDepui getEmDepui() {
        return delegate.getCategory("em_depui", EmDepui::new);
    }

    /**
     * List of EMD entries made obsolete by this entry.
     * @return EmObsolete
     */
    public EmObsolete getEmObsolete() {
        return delegate.getCategory("em_obsolete", EmObsolete::new);
    }

    /**
     * List of newer entries that replace this entry.
     * @return EmSupersede
     */
    public EmSupersede getEmSupersede() {
        return delegate.getCategory("em_supersede", EmSupersede::new);
    }

    /**
     * Data items in this category record details about the molecular weight of
     * an assembly component of the sample.
     * @return EmEntityAssemblyMolwt
     */
    public EmEntityAssemblyMolwt getEmEntityAssemblyMolwt() {
        return delegate.getCategory("em_entity_assembly_molwt", EmEntityAssemblyMolwt::new);
    }

    /**
     * Data items in this category record taxonomic details about the natural source for EM
     * assemblies and assembly components.
     * @return EmEntityAssemblyNaturalsource
     */
    public EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource() {
        return delegate.getCategory("em_entity_assembly_naturalsource", EmEntityAssemblyNaturalsource::new);
    }

    /**
     * Data items in this category record details
     * about recombinant expression of the assembly or assembly component.
     * @return EmEntityAssemblyRecombinant
     */
    public EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant() {
        return delegate.getCategory("em_entity_assembly_recombinant", EmEntityAssemblyRecombinant::new);
    }

    /**
     * Data items in this category record details of a virus entity.
     * @return EmVirusNaturalHost
     */
    public EmVirusNaturalHost getEmVirusNaturalHost() {
        return delegate.getCategory("em_virus_natural_host", EmVirusNaturalHost::new);
    }

    /**
     * Data items in the EMD_VIRUS_SHELL category record details
     * of the viral shell number, shell diameter, and icosahedral triangulation number.
     * @return EmVirusShell
     */
    public EmVirusShell getEmVirusShell() {
        return delegate.getCategory("em_virus_shell", EmVirusShell::new);
    }

    /**
     * Data items in the EMD_SPECIMEN category record details
     * about specimens prepared for imaging by electron microscopy.
     * @return EmSpecimen
     */
    public EmSpecimen getEmSpecimen() {
        return delegate.getCategory("em_specimen", EmSpecimen::new);
    }

    /**
     * Sugar embedding category
     * @return EmEmbedding
     */
    public EmEmbedding getEmEmbedding() {
        return delegate.getCategory("em_embedding", EmEmbedding::new);
    }

    /**
     * Description of fiducial markers.
     * @return EmFiducialMarkers
     */
    public EmFiducialMarkers getEmFiducialMarkers() {
        return delegate.getCategory("em_fiducial_markers", EmFiducialMarkers::new);
    }

    /**
     * Description of sectioning by focused_ion_beam
     * @return EmFocusedIonBeam
     */
    public EmFocusedIonBeam getEmFocusedIonBeam() {
        return delegate.getCategory("em_focused_ion_beam", EmFocusedIonBeam::new);
    }

    /**
     * Data items describing glow discharge pretreatment for an EM grid
     * @return EmGridPretreatment
     */
    public EmGridPretreatment getEmGridPretreatment() {
        return delegate.getCategory("em_grid_pretreatment", EmGridPretreatment::new);
    }

    /**
     * Description of sectioning by ultramicrotomy
     * @return EmUltramicrotomy
     */
    public EmUltramicrotomy getEmUltramicrotomy() {
        return delegate.getCategory("em_ultramicrotomy", EmUltramicrotomy::new);
    }

    /**
     * Description of high pressure freezing
     * @return EmHighPressureFreezing
     */
    public EmHighPressureFreezing getEmHighPressureFreezing() {
        return delegate.getCategory("em_high_pressure_freezing", EmHighPressureFreezing::new);
    }

    /**
     * Data items related to shadowing of an EM specimen
     * @return EmShadowing
     */
    public EmShadowing getEmShadowing() {
        return delegate.getCategory("em_shadowing", EmShadowing::new);
    }

    /**
     * Description specimen preparation for imaging using tomography.
     * @return EmTomographySpecimen
     */
    public EmTomographySpecimen getEmTomographySpecimen() {
        return delegate.getCategory("em_tomography_specimen", EmTomographySpecimen::new);
    }

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return EmCrystalFormation
     */
    public EmCrystalFormation getEmCrystalFormation() {
        return delegate.getCategory("em_crystal_formation", EmCrystalFormation::new);
    }

    /**
     * Staining category
     * @return EmStaining
     */
    public EmStaining getEmStaining() {
        return delegate.getCategory("em_staining", EmStaining::new);
    }

    /**
     * Data items to describe films supporting the specimen
     * @return EmSupportFilm
     */
    public EmSupportFilm getEmSupportFilm() {
        return delegate.getCategory("em_support_film", EmSupportFilm::new);
    }

    /**
     * Buffer category
     * @return EmBufferComponent
     */
    public EmBufferComponent getEmBufferComponent() {
        return delegate.getCategory("em_buffer_component", EmBufferComponent::new);
    }

    /**
     * Microscopy parameters relevant only for crystallography
     * @return EmDiffraction
     */
    public EmDiffraction getEmDiffraction() {
        return delegate.getCategory("em_diffraction", EmDiffraction::new);
    }

    /**
     * Statistical parameters for electron diffraction measurements
     * within a resolution shell
     * @return EmDiffractionShell
     */
    public EmDiffractionShell getEmDiffractionShell() {
        return delegate.getCategory("em_diffraction_shell", EmDiffractionShell::new);
    }

    /**
     * Statistical parameters for electron diffraction measurements
     * @return EmDiffractionStats
     */
    public EmDiffractionStats getEmDiffractionStats() {
        return delegate.getCategory("em_diffraction_stats", EmDiffractionStats::new);
    }

    /**
     * Microscopy parameters only relevant for tomography
     * @return EmTomography
     */
    public EmTomography getEmTomography() {
        return delegate.getCategory("em_tomography", EmTomography::new);
    }

    /**
     * Data items in the EM_IMAGE_RECORDING category record details
     * of the image recording (either film/microdensitometer or electronic detector)
     * and parameters for image digitization.
     * @return EmImageRecording
     */
    public EmImageRecording getEmImageRecording() {
        return delegate.getCategory("em_image_recording", EmImageRecording::new);
    }

    /**
     * Description of a few specialist optics apparatus
     * @return EmImagingOptics
     */
    public EmImagingOptics getEmImagingOptics() {
        return delegate.getCategory("em_imaging_optics", EmImagingOptics::new);
    }

    /**
     * Information about the final image classification
     * @return EmFinalClassification
     */
    public EmFinalClassification getEmFinalClassification() {
        return delegate.getCategory("em_final_classification", EmFinalClassification::new);
    }

    /**
     * The startup model employed to begin refinement of the parameters for
     * a 3DEM reconstruction
     * @return EmStartModel
     */
    public EmStartModel getEmStartModel() {
        return delegate.getCategory("em_start_model", EmStartModel::new);
    }

    /**
     * 
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return EmSoftware
     */
    public EmSoftware getEmSoftware() {
        return delegate.getCategory("em_software", EmSoftware::new);
    }

    /**
     * Category to describe the euler angle assignement
     * @return EmEulerAngleAssignment
     */
    public EmEulerAngleAssignment getEmEulerAngleAssignment() {
        return delegate.getCategory("em_euler_angle_assignment", EmEulerAngleAssignment::new);
    }

    /**
     * Description of the Contrast Transfer Function (CTF) correction
     * @return EmCtfCorrection
     */
    public EmCtfCorrection getEmCtfCorrection() {
        return delegate.getCategory("em_ctf_correction", EmCtfCorrection::new);
    }

    /**
     * Volume selection in image processing
     * @return EmVolumeSelection
     */
    public EmVolumeSelection getEmVolumeSelection() {
        return delegate.getCategory("em_volume_selection", EmVolumeSelection::new);
    }

    /**
     * Data items in the EM_SYMMETRY_3DX category record
     * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
     * @return Em3dCrystalEntity
     */
    public Em3dCrystalEntity getEm3dCrystalEntity() {
        return delegate.getCategory("em_3d_crystal_entity", Em3dCrystalEntity::new);
    }

    /**
     * Data items in the EM_SYMMETRY_2DX category record
     * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
     * @return Em2dCrystalEntity
     */
    public Em2dCrystalEntity getEm2dCrystalEntity() {
        return delegate.getCategory("em_2d_crystal_entity", Em2dCrystalEntity::new);
    }

    /**
     * Data items in the EM_IMAGE_PROCESSING category
     * record details of the EM image processing procedure.
     * @return EmImageProcessing
     */
    public EmImageProcessing getEmImageProcessing() {
        return delegate.getCategory("em_image_processing", EmImageProcessing::new);
    }

    /**
     * Data items in this category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return EmParticleSelection
     */
    public EmParticleSelection getEmParticleSelection() {
        return delegate.getCategory("em_particle_selection", EmParticleSelection::new);
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
    public EmMap getEmMap() {
        return delegate.getCategory("em_map", EmMap::new);
    }

    /**
     * Data items in the EMD_VALIDATION_FSC_CURVE category
     * record details of the Fourier Shell Correlation (FSC) curve file.
     * @return EmFscCurve
     */
    public EmFscCurve getEmFscCurve() {
        return delegate.getCategory("em_fsc_curve", EmFscCurve::new);
    }

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmInterpretFigure
     */
    public EmInterpretFigure getEmInterpretFigure() {
        return delegate.getCategory("em_interpret_figure", EmInterpretFigure::new);
    }

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmLayerLines
     */
    public EmLayerLines getEmLayerLines() {
        return delegate.getCategory("em_layer_lines", EmLayerLines::new);
    }

    /**
     * Listing of all structure factor files associated with the EM entry
     * @return EmStructureFactors
     */
    public EmStructureFactors getEmStructureFactors() {
        return delegate.getCategory("em_structure_factors", EmStructureFactors::new);
    }

    /**
     * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
     * that are provided by the depositor
     * @return EmDepositorInfo
     */
    public EmDepositorInfo getEmDepositorInfo() {
        return delegate.getCategory("em_depositor_info", EmDepositorInfo::new);
    }

    /**
     * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
     * that are provided by the depositor
     * @return EmMapDepositorInfo
     */
    public EmMapDepositorInfo getEmMapDepositorInfo() {
        return delegate.getCategory("em_map_depositor_info", EmMapDepositorInfo::new);
    }

    /**
     * Data items in the EM_MASK_DEPOSITOR_INFO category record mask parameters
     * that are provided by the depositor
     * @return EmMaskDepositorInfo
     */
    public EmMaskDepositorInfo getEmMaskDepositorInfo() {
        return delegate.getCategory("em_mask_depositor_info", EmMaskDepositorInfo::new);
    }

    /**
     * Listing of image files (figures) associated with an EMDB entry
     * @return EmFigureDepositorInfo
     */
    public EmFigureDepositorInfo getEmFigureDepositorInfo() {
        return delegate.getCategory("em_figure_depositor_info", EmFigureDepositorInfo::new);
    }

    /**
     * Listing of layer line files associated with the EM entry
     * @return EmLayerLinesDepositorInfo
     */
    public EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo() {
        return delegate.getCategory("em_layer_lines_depositor_info", EmLayerLinesDepositorInfo::new);
    }

    /**
     * Structure factor files associated with the EM entry
     * @return EmStructureFactorsDepositorInfo
     */
    public EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo() {
        return delegate.getCategory("em_structure_factors_depositor_info", EmStructureFactorsDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
     * details about the mapping sample and coordinate sequences.
     * @return PdbxSeqMapDepositorInfo
     */
    public PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo() {
        return delegate.getCategory("pdbx_seq_map_depositor_info", PdbxSeqMapDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
     * details provided by depositors about deposited chemical components.
     * @return PdbxChemCompDepositorInfo
     */
    public PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo() {
        return delegate.getCategory("pdbx_chem_comp_depositor_info", PdbxChemCompDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ.
     * @return PdbxStructRefSeqDepositorInfo
     */
    public PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo() {
        return delegate.getCategory("pdbx_struct_ref_seq_depositor_info", PdbxStructRefSeqDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ_DIF.
     * @return PdbxStructRefSeqDifDepositorInfo
     */
    public PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo() {
        return delegate.getCategory("pdbx_struct_ref_seq_dif_depositor_info", PdbxStructRefSeqDifDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_PROP.
     * @return PdbxStructAssemblyPropDepositorInfo
     */
    public PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo() {
        return delegate.getCategory("pdbx_struct_assembly_prop_depositor_info", PdbxStructAssemblyPropDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY.
     * @return PdbxStructAssemblyDepositorInfo
     */
    public PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo() {
        return delegate.getCategory("pdbx_struct_assembly_depositor_info", PdbxStructAssemblyDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_GEN.
     * @return PdbxStructAssemblyGenDepositorInfo
     */
    public PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo() {
        return delegate.getCategory("pdbx_struct_assembly_gen_depositor_info", PdbxStructAssemblyGenDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_OPER_LIST.
     * @return PdbxStructOperListDepositorInfo
     */
    public PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo() {
        return delegate.getCategory("pdbx_struct_oper_list_depositor_info", PdbxStructOperListDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_POINT_SYMMETRY.
     * @return PdbxPointSymmetryDepositorInfo
     */
    public PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo() {
        return delegate.getCategory("pdbx_point_symmetry_depositor_info", PdbxPointSymmetryDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_HELICAL_SYMMETRY.
     * @return PdbxHelicalSymmetryDepositorInfo
     */
    public PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo() {
        return delegate.getCategory("pdbx_helical_symmetry_depositor_info", PdbxHelicalSymmetryDepositorInfo::new);
    }

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidenceDepositorInfo
     */
    public PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return delegate.getCategory("pdbx_struct_assembly_auth_evidence_depositor_info", PdbxStructAssemblyAuthEvidenceDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
     * mapping information between solvent atoms before and after symmetry
     * repositioning.
     * @return PdbxSolventAtomSiteMapping
     */
    public PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping() {
        return delegate.getCategory("pdbx_solvent_atom_site_mapping", PdbxSolventAtomSiteMapping::new);
    }

    /**
     * Data items in the PDBX_MOLECULE_FEATURES_DEPOSITOR_INFO  category capture
     * depositor provided information related to the archival cateogory
     * PDBX_MOLECULE_FEATURES.
     * @return PdbxMoleculeFeaturesDepositorInfo
     */
    public PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo() {
        return delegate.getCategory("pdbx_molecule_features_depositor_info", PdbxMoleculeFeaturesDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
     * depositor provided information about the chemical context of component instances.
     * @return PdbxChemCompInstanceDepositorInfo
     */
    public PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo() {
        return delegate.getCategory("pdbx_chem_comp_instance_depositor_info", PdbxChemCompInstanceDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
     * details used to maintain state within the wwPDB deposition system.
     * @return PdbxDepuiStatusFlags
     */
    public PdbxDepuiStatusFlags getPdbxDepuiStatusFlags() {
        return delegate.getCategory("pdbx_depui_status_flags", PdbxDepuiStatusFlags::new);
    }

    /**
     * Data items in the PDBX_DEPUI_UPLOAD category record the
     * details of uploaded data files.
     * @return PdbxDepuiUpload
     */
    public PdbxDepuiUpload getPdbxDepuiUpload() {
        return delegate.getCategory("pdbx_depui_upload", PdbxDepuiUpload::new);
    }

    /**
     * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
     * details that assess the status of selected validation diagnostics.
     * @return PdbxDepuiValidationStatusFlags
     */
    public PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags() {
        return delegate.getCategory("pdbx_depui_validation_status_flags", PdbxDepuiValidationStatusFlags::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
     * details of the uploaded files related to depositor provided chemical assignments.
     * @return PdbxChemCompUploadDepositorInfo
     */
    public PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo() {
        return delegate.getCategory("pdbx_chem_comp_upload_depositor_info", PdbxChemCompUploadDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
     * details related to individual entities.
     * @return PdbxDepuiEntityStatusFlags
     */
    public PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags() {
        return delegate.getCategory("pdbx_depui_entity_status_flags", PdbxDepuiEntityStatusFlags::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
     * details related to the features of individual entities.
     * @return PdbxDepuiEntityFeatures
     */
    public PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures() {
        return delegate.getCategory("pdbx_depui_entity_features", PdbxDepuiEntityFeatures::new);
    }

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
     * within the depositon and annotation system.
     * @return PdbxDepositionMessageInfo
     */
    public PdbxDepositionMessageInfo getPdbxDepositionMessageInfo() {
        return delegate.getCategory("pdbx_deposition_message_info", PdbxDepositionMessageInfo::new);
    }

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
     * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
     * data category.
     * @return PdbxDepositionMessageFileReference
     */
    public PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference() {
        return delegate.getCategory("pdbx_deposition_message_file_reference", PdbxDepositionMessageFileReference::new);
    }

    /**
     * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
     * information required to identify the depositor and route
     * deposition to an appropriate processing site.
     * @return PdbxDepuiEntryDetails
     */
    public PdbxDepuiEntryDetails getPdbxDepuiEntryDetails() {
        return delegate.getCategory("pdbx_depui_entry_details", PdbxDepuiEntryDetails::new);
    }

    /**
     * Data items in the PDBX_DATA_PROCESSING_STATUS category record
     * data processing instructions for workflow processing tasks.
     * @return PdbxDataProcessingStatus
     */
    public PdbxDataProcessingStatus getPdbxDataProcessingStatus() {
        return delegate.getCategory("pdbx_data_processing_status", PdbxDataProcessingStatus::new);
    }

    /**
     * Data items in the pdbx_entity_instance_feature category records
     * special features of selected entity instances.
     * @return PdbxEntityInstanceFeature
     */
    public PdbxEntityInstanceFeature getPdbxEntityInstanceFeature() {
        return delegate.getCategory("pdbx_entity_instance_feature", PdbxEntityInstanceFeature::new);
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
    public PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo() {
        return delegate.getCategory("pdbx_entity_src_gen_depositor_info", PdbxEntitySrcGenDepositorInfo::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
     * of the chemical component model instances.
     * @return PdbxChemCompModel
     */
    public PdbxChemCompModel getPdbxChemCompModel() {
        return delegate.getCategory("pdbx_chem_comp_model", PdbxChemCompModel::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
     * for the chemical component model instance.
     * @return PdbxChemCompModelAtom
     */
    public PdbxChemCompModelAtom getPdbxChemCompModelAtom() {
        return delegate.getCategory("pdbx_chem_comp_model_atom", PdbxChemCompModelAtom::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
     * the bonds between atoms in a chemical component model instance.
     * @return PdbxChemCompModelBond
     */
    public PdbxChemCompModelBond getPdbxChemCompModelBond() {
        return delegate.getCategory("pdbx_chem_comp_model_bond", PdbxChemCompModelBond::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelFeature
     */
    public PdbxChemCompModelFeature getPdbxChemCompModelFeature() {
        return delegate.getCategory("pdbx_chem_comp_model_feature", PdbxChemCompModelFeature::new);
    }

    /**
     * Data items in the CHEM_COMP_MODEL_DESCRIPTOR category provide
     * string descriptors for component model structures.
     * @return PdbxChemCompModelDescriptor
     */
    public PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor() {
        return delegate.getCategory("pdbx_chem_comp_model_descriptor", PdbxChemCompModelDescriptor::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
     * the status and tracking information for this component model instance.
     * @return PdbxChemCompModelAudit
     */
    public PdbxChemCompModelAudit getPdbxChemCompModelAudit() {
        return delegate.getCategory("pdbx_chem_comp_model_audit", PdbxChemCompModelAudit::new);
    }

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelReference
     */
    public PdbxChemCompModelReference getPdbxChemCompModelReference() {
        return delegate.getCategory("pdbx_chem_comp_model_reference", PdbxChemCompModelReference::new);
    }

    /**
     * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
     * of related mmCIF categories.  Views provide a vehicle for
     * presenting different logical arrangements of dictionary contents.
     * @return PdbxViewCategoryGroup
     */
    public PdbxViewCategoryGroup getPdbxViewCategoryGroup() {
        return delegate.getCategory("pdbx_view_category_group", PdbxViewCategoryGroup::new);
    }

    /**
     * Data items in the PDBX_VIEW_CATEGORY specify the categories
     * belonging to a category view group.  An alias name for the
     * the mmCIF category may also be specified for the each
     * category in the view.
     * @return PdbxViewCategory
     */
    public PdbxViewCategory getPdbxViewCategory() {
        return delegate.getCategory("pdbx_view_category", PdbxViewCategory::new);
    }

    /**
     * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
     * belonging to a view category.  An alias name for the
     * the mmCIF item may be specified for the each item in the
     * view category.  The role of the item in the view category
     * can be designated as mandatory, optional, or hidden.
     * @return PdbxViewItem
     */
    public PdbxViewItem getPdbxViewItem() {
        return delegate.getCategory("pdbx_view_item", PdbxViewItem::new);
    }

    /**
     * Gives information about what kind of coordinates are available.
     * @return PdbxCoord
     */
    public PdbxCoord getPdbxCoord() {
        return delegate.getCategory("pdbx_coord", PdbxCoord::new);
    }

    /**
     * Local data items describing ligand and monomer
     * chemical features.
     * @return PdbxConnect
     */
    public PdbxConnect getPdbxConnect() {
        return delegate.getCategory("pdbx_connect", PdbxConnect::new);
    }

    /**
     * Local data items describing ligand and monomer
     * type information.
     * @return PdbxConnectType
     */
    public PdbxConnectType getPdbxConnectType() {
        return delegate.getCategory("pdbx_connect_type", PdbxConnectType::new);
    }

    /**
     * Local data items describing ligand and monomer
     * modifications.
     * @return PdbxConnectModification
     */
    public PdbxConnectModification getPdbxConnectModification() {
        return delegate.getCategory("pdbx_connect_modification", PdbxConnectModification::new);
    }

    /**
     * Local data items describing ligand and monomer
     * atom names and connectivity.
     * @return PdbxConnectAtom
     */
    public PdbxConnectAtom getPdbxConnectAtom() {
        return delegate.getCategory("pdbx_connect_atom", PdbxConnectAtom::new);
    }

    /**
     * The PDBX_DATABASE_PDB_MASTER category provides placeholders
     * for the count of various PDB record types.
     * @return PdbxDatabasePDBMaster
     */
    public PdbxDatabasePDBMaster getPdbxDatabasePDBMaster() {
        return delegate.getCategory("pdbx_database_PDB_master", PdbxDatabasePDBMaster::new);
    }

    /**
     * 
     * Data items in the PDBX_DATABASE_PDB_OMIT category record
     * list PDB record names that should be omitted in the PDB
     * format file.
     * @return PdbxDatabasePdbOmit
     */
    public PdbxDatabasePdbOmit getPdbxDatabasePdbOmit() {
        return delegate.getCategory("pdbx_database_pdb_omit", PdbxDatabasePdbOmit::new);
    }

    /**
     * These records are used in the DBREF record of a PDB file and
     * are used as place holders for NDB ID's in PDB files.
     * @return PdbxDbref
     */
    public PdbxDbref getPdbxDbref() {
        return delegate.getCategory("pdbx_dbref", PdbxDbref::new);
    }

    /**
     * Data items in the PDBX_DRUG_INFO category are still used until
     * the 'entity' categories are entered into the database, even
     * though the information is repeated.
     * @return PdbxDrugInfo
     */
    public PdbxDrugInfo getPdbxDrugInfo() {
        return delegate.getCategory("pdbx_drug_info", PdbxDrugInfo::new);
    }

    /**
     * Data items in the PDBX_INHIBITOR_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * inhibitor is repeated.
     * @return PdbxInhibitorInfo
     */
    public PdbxInhibitorInfo getPdbxInhibitorInfo() {
        return delegate.getCategory("pdbx_inhibitor_info", PdbxInhibitorInfo::new);
    }

    /**
     * Data items in the PDBX_ION_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxIonInfo
     */
    public PdbxIonInfo getPdbxIonInfo() {
        return delegate.getCategory("pdbx_ion_info", PdbxIonInfo::new);
    }

    /**
     * Data items in the PDBX_HYBRID category are used to describe the chimeric
     * characteristics of a DNA/RNA structure.
     * @return PdbxHybrid
     */
    public PdbxHybrid getPdbxHybrid() {
        return delegate.getCategory("pdbx_hybrid", PdbxHybrid::new);
    }

    /**
     * Data items in the PDBX_NA_STRAND_INFO category are still used until
     * the 'entity' categories are entered into the database, even though
     * the information is repeated.
     * @return PdbxNaStrandInfo
     */
    public PdbxNaStrandInfo getPdbxNaStrandInfo() {
        return delegate.getCategory("pdbx_na_strand_info", PdbxNaStrandInfo::new);
    }

    /**
     * The information in this category is exclusively used to store
     * the HET records of a PDB file.  This record will be generated
     * by the PROGRAM.
     * @return PdbxNonstandardList
     */
    public PdbxNonstandardList getPdbxNonstandardList() {
        return delegate.getCategory("pdbx_nonstandard_list", PdbxNonstandardList::new);
    }

    /**
     * This is a place holder for the PDB COMPND.
     * @return PdbxPdbCompnd
     */
    public PdbxPdbCompnd getPdbxPdbCompnd() {
        return delegate.getCategory("pdbx_pdb_compnd", PdbxPdbCompnd::new);
    }

    /**
     * This is a place holder for the PDB SOURCE.
     * @return PdbxPdbSource
     */
    public PdbxPdbSource getPdbxPdbSource() {
        return delegate.getCategory("pdbx_pdb_source", PdbxPdbSource::new);
    }

    /**
     * Data items in the PDBX_PROTEIN_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxProteinInfo
     */
    public PdbxProteinInfo getPdbxProteinInfo() {
        return delegate.getCategory("pdbx_protein_info", PdbxProteinInfo::new);
    }

    /**
     * Data items in the PDBX_SOLVENT_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxSolventInfo
     */
    public PdbxSolventInfo getPdbxSolventInfo() {
        return delegate.getCategory("pdbx_solvent_info", PdbxSolventInfo::new);
    }

    /**
     * Data item will still be used until the ENTITY category is fully
     * adopted by NDBQuery.
     * @return PdbxSource
     */
    public PdbxSource getPdbxSource() {
        return delegate.getCategory("pdbx_source", PdbxSource::new);
    }

    /**
     * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
     * the function of a particular biological assembly.
     * @return PdbxStructBiolFunc
     */
    public PdbxStructBiolFunc getPdbxStructBiolFunc() {
        return delegate.getCategory("pdbx_struct_biol_func", PdbxStructBiolFunc::new);
    }

    /**
     * Data items in the PDBX_STRUCT_PACK_GEN category record details about
     * the generation of the packing picture(s).
     * @return PdbxStructPackGen
     */
    public PdbxStructPackGen getPdbxStructPackGen() {
        return delegate.getCategory("pdbx_struct_pack_gen", PdbxStructPackGen::new);
    }

    /**
     * Data items in the PDBX_TRNA_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * T-RNA is repeated.
     * @return PdbxTrnaInfo
     */
    public PdbxTrnaInfo getPdbxTrnaInfo() {
        return delegate.getCategory("pdbx_trna_info", PdbxTrnaInfo::new);
    }

    /**
     * These records give information about residues which do not pair
     * (h-bond) in the asymmetric unit.
     * 
     * The records about Watson-Crick base pairing depend on these
     * records.
     * @return PdbxUnpair
     */
    public PdbxUnpair getPdbxUnpair() {
        return delegate.getCategory("pdbx_unpair", PdbxUnpair::new);
    }

    /**
     * Holds details of NCS restraints in cases where multiple
     * conditions are provided for each domain.
     * @return PdbxRefineLsRestrNcs
     */
    public PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs() {
        return delegate.getCategory("pdbx_refine_ls_restr_ncs", PdbxRefineLsRestrNcs::new);
    }

    /**
     * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
     * about the generation of virus structures from NCS matrix operators.
     * @return PdbxStructNcsVirusGen
     */
    public PdbxStructNcsVirusGen getPdbxStructNcsVirusGen() {
        return delegate.getCategory("pdbx_struct_ncs_virus_gen", PdbxStructNcsVirusGen::new);
    }

    /**
     * PDBX_SEQUENCE_ANNOTATION holds internal details about molecular sequences
     * described in the context of PDB chains.
     * @return PdbxSequenceAnnotation
     */
    public PdbxSequenceAnnotation getPdbxSequenceAnnotation() {
        return delegate.getCategory("pdbx_sequence_annotation", PdbxSequenceAnnotation::new);
    }

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS identify
     * problems or errors encountered in the post-processing
     * of this entry.
     * @return PdbxPostProcessDetails
     */
    public PdbxPostProcessDetails getPdbxPostProcessDetails() {
        return delegate.getCategory("pdbx_post_process_details", PdbxPostProcessDetails::new);
    }

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS record
     * the status of post-processed entries.
     * @return PdbxPostProcessStatus
     */
    public PdbxPostProcessStatus getPdbxPostProcessStatus() {
        return delegate.getCategory("pdbx_post_process_status", PdbxPostProcessStatus::new);
    }

    /**
     * Data items in the PDBX_STRUCT_LINK category record details about
     * covalent linkages in the structure.
     * @return PdbxStructLink
     */
    public PdbxStructLink getPdbxStructLink() {
        return delegate.getCategory("pdbx_struct_link", PdbxStructLink::new);
    }

    /**
     * Provides a place-holder for PDB REMARK 465 data.
     * @return PdbxMissingResidueList
     */
    public PdbxMissingResidueList getPdbxMissingResidueList() {
        return delegate.getCategory("pdbx_missing_residue_list", PdbxMissingResidueList::new);
    }

    /**
     * Crystallographic cell specifications used in data processing.
     * @return PdbxDataProcessingCell
     */
    public PdbxDataProcessingCell getPdbxDataProcessingCell() {
        return delegate.getCategory("pdbx_data_processing_cell", PdbxDataProcessingCell::new);
    }

    /**
     * Details of reflections used in data processing.
     * @return PdbxDataProcessingReflns
     */
    public PdbxDataProcessingReflns getPdbxDataProcessingReflns() {
        return delegate.getCategory("pdbx_data_processing_reflns", PdbxDataProcessingReflns::new);
    }

    /**
     * Details of the detector used at data collection site.
     * @return PdbxDataProcessingDetector
     */
    public PdbxDataProcessingDetector getPdbxDataProcessingDetector() {
        return delegate.getCategory("pdbx_data_processing_detector", PdbxDataProcessingDetector::new);
    }

    /**
     * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
     * common nucleotide modifications and nonstandard features.
     * @return PdbxChemCompNonstandard
     */
    public PdbxChemCompNonstandard getPdbxChemCompNonstandard() {
        return delegate.getCategory("pdbx_chem_comp_nonstandard", PdbxChemCompNonstandard::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_PROTEIN_CLASS category
     * provides a top-level protein classification.
     * @return PdbxEntityPolyProteinClass
     */
    public PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass() {
        return delegate.getCategory("pdbx_entity_poly_protein_class", PdbxEntityPolyProteinClass::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
     * define the tree structure of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomyTree
     */
    public PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree() {
        return delegate.getCategory("pdbx_entity_name_taxonomy_tree", PdbxEntityNameTaxonomyTree::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
     * define the names and synonyms of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomy
     */
    public PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy() {
        return delegate.getCategory("pdbx_entity_name_taxonomy", PdbxEntityNameTaxonomy::new);
    }

    /**
     * Data items in the PDBX_ENTITY_NAME_INSTANCE category
     * list names used to define entities with their
     * associated database, entity, chain, and molecule
     * identifiers.
     * @return PdbxEntityNameInstance
     */
    public PdbxEntityNameInstance getPdbxEntityNameInstance() {
        return delegate.getCategory("pdbx_entity_name_instance", PdbxEntityNameInstance::new);
    }

    /**
     * 
     * @return PdbxTableinfo
     */
    public PdbxTableinfo getPdbxTableinfo() {
        return delegate.getCategory("pdbx_tableinfo", PdbxTableinfo::new);
    }

    /**
     * 
     * @return PdbxColumninfo
     */
    public PdbxColumninfo getPdbxColumninfo() {
        return delegate.getCategory("pdbx_columninfo", PdbxColumninfo::new);
    }

    /**
     * The PDBX_VAL_ANGLE category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxValAngle
     */
    public PdbxValAngle getPdbxValAngle() {
        return delegate.getCategory("pdbx_val_angle", PdbxValAngle::new);
    }

    /**
     * The PDBX_VAL_BOND category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxValBond
     */
    public PdbxValBond getPdbxValBond() {
        return delegate.getCategory("pdbx_val_bond", PdbxValBond::new);
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
    public PdbxValContact getPdbxValContact() {
        return delegate.getCategory("pdbx_val_contact", PdbxValContact::new);
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
    public PdbxValSymContact getPdbxValSymContact() {
        return delegate.getCategory("pdbx_val_sym_contact", PdbxValSymContact::new);
    }

    /**
     * Data items in the PDBX_RMCH_OUTLIER category list the
     * residues with torsion angles outside the expected
     * Ramachandran regions.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxRmchOutlier
     */
    public PdbxRmchOutlier getPdbxRmchOutlier() {
        return delegate.getCategory("pdbx_rmch_outlier", PdbxRmchOutlier::new);
    }

    /**
     * Data items in the PDBX_MISSING_ATOM_POLY category lists
     * atoms missing in polymer residues.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomPoly
     */
    public PdbxMissingAtomPoly getPdbxMissingAtomPoly() {
        return delegate.getCategory("pdbx_missing_atom_poly", PdbxMissingAtomPoly::new);
    }

    /**
     * Data items in the PDBX_MISSING_ATOM_NONPOLY category list the
     * atoms missing in nonpolymer residues.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomNonpoly
     */
    public PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly() {
        return delegate.getCategory("pdbx_missing_atom_nonpoly", PdbxMissingAtomNonpoly::new);
    }

    /**
     * Data items in the PDBX_VAL_CHIRAL category list the
     * atoms with nonstandard chiralities.
     * 
     * This is a completely derived category.  Do not edit.
     * @return PdbxValChiral
     */
    public PdbxValChiral getPdbxValChiral() {
        return delegate.getCategory("pdbx_val_chiral", PdbxValChiral::new);
    }

    /**
     * Gives information about the organization of the
     * NDB Structural Atlas.
     * @return PdbxAtlas
     */
    public PdbxAtlas getPdbxAtlas() {
        return delegate.getCategory("pdbx_atlas", PdbxAtlas::new);
    }

    /**
     * Container category for a list of feature flags associated
     * with each structure entry.
     * @return PdbxSummaryFlags
     */
    public PdbxSummaryFlags getPdbxSummaryFlags() {
        return delegate.getCategory("pdbx_summary_flags", PdbxSummaryFlags::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
     * characteristics of protein oligonucleotide binding.
     * @return PdbxEntityFuncBindMode
     */
    public PdbxEntityFuncBindMode getPdbxEntityFuncBindMode() {
        return delegate.getCategory("pdbx_entity_func_bind_mode", PdbxEntityFuncBindMode::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is enzymatic.
     * @return PdbxEntityFuncEnzyme
     */
    public PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme() {
        return delegate.getCategory("pdbx_entity_func_enzyme", PdbxEntityFuncEnzyme::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_REGULATORY category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is regulatory.
     * @return PdbxEntityFuncRegulatory
     */
    public PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory() {
        return delegate.getCategory("pdbx_entity_func_regulatory", PdbxEntityFuncRegulatory::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_STRUCTURAL category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is structural.
     * @return PdbxEntityFuncStructural
     */
    public PdbxEntityFuncStructural getPdbxEntityFuncStructural() {
        return delegate.getCategory("pdbx_entity_func_structural", PdbxEntityFuncStructural::new);
    }

    /**
     * Data items in the PDBX_ENTITY_FUNC_OTHER category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is not classified.
     * @return PdbxEntityFuncOther
     */
    public PdbxEntityFuncOther getPdbxEntityFuncOther() {
        return delegate.getCategory("pdbx_entity_func_other", PdbxEntityFuncOther::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
     * of monomers within a polymer.
     * @return PdbxEntityPolyDomain
     */
    public PdbxEntityPolyDomain getPdbxEntityPolyDomain() {
        return delegate.getCategory("pdbx_entity_poly_domain", PdbxEntityPolyDomain::new);
    }

    /**
     * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
     * about structural features of the NA.
     * @return PdbxNaStructKeywds
     */
    public PdbxNaStructKeywds getPdbxNaStructKeywds() {
        return delegate.getCategory("pdbx_na_struct_keywds", PdbxNaStructKeywds::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_TYPE category describe
     * type of nucleic acid polymer entities.
     * @return PdbxEntityPolyNaType
     */
    public PdbxEntityPolyNaType getPdbxEntityPolyNaType() {
        return delegate.getCategory("pdbx_entity_poly_na_type", PdbxEntityPolyNaType::new);
    }

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
     * describe the nonstandard features of the nucleic acid polymer entities.
     * @return PdbxEntityPolyNaNonstandard
     */
    public PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard() {
        return delegate.getCategory("pdbx_entity_poly_na_nonstandard", PdbxEntityPolyNaNonstandard::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_ANGLE category record details about the
     * molecular virtual angles, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualAngle
     */
    public PdbxVirtualAngle getPdbxVirtualAngle() {
        return delegate.getCategory("pdbx_virtual_angle", PdbxVirtualAngle::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_BOND category record details about
     * virtual bonds, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualBond
     */
    public PdbxVirtualBond getPdbxVirtualBond() {
        return delegate.getCategory("pdbx_virtual_bond", PdbxVirtualBond::new);
    }

    /**
     * Data items in the PDBX_VIRTUAL_TORSION category record details about
     * virtual torsion angles, as calculated from the contents of the ATOM,
     * CELL, and SYMMETRY data.
     * @return PdbxVirtualTorsion
     */
    public PdbxVirtualTorsion getPdbxVirtualTorsion() {
        return delegate.getCategory("pdbx_virtual_torsion", PdbxVirtualTorsion::new);
    }

    /**
     * Data items in the PDBX_SEQUENCE_PATTERN category record
     * the number of occurences of common step sequence patterns
     * (e.g. AA, CG, AT).
     * @return PdbxSequencePattern
     */
    public PdbxSequencePattern getPdbxSequencePattern() {
        return delegate.getCategory("pdbx_sequence_pattern", PdbxSequencePattern::new);
    }

    /**
     * Data items in the PDBX_STEREOCHEMISTRY identify chiral
     * centers and associated chiral volumes.
     * @return PdbxStereochemistry
     */
    public PdbxStereochemistry getPdbxStereochemistry() {
        return delegate.getCategory("pdbx_stereochemistry", PdbxStereochemistry::new);
    }

    /**
     * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
     * for nucleic acid covalent geometry relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovalent
     */
    public PdbxRmsDevsCovalent getPdbxRmsDevsCovalent() {
        return delegate.getCategory("pdbx_rms_devs_covalent", PdbxRmsDevsCovalent::new);
    }

    /**
     * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovByMonomer
     */
    public PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer() {
        return delegate.getCategory("pdbx_rms_devs_cov_by_monomer", PdbxRmsDevsCovByMonomer::new);
    }

    /**
     * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxSugarPhosphateGeometry
     */
    public PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry() {
        return delegate.getCategory("pdbx_sugar_phosphate_geometry", PdbxSugarPhosphateGeometry::new);
    }

    /**
     * The table in this section is used to describe the software
     * that was used for data collection, data processing, data analysis,
     * structure calculations and refinement. The description should include
     * both the name of the software and the version used.
     * @return PdbxNmrComputing
     */
    public PdbxNmrComputing getPdbxNmrComputing() {
        return delegate.getCategory("pdbx_nmr_computing", PdbxNmrComputing::new);
    }

    /**
     * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
     * extension dictionary versions against which the data names appearing
     * the current data block are conformant.
     * @return PdbxAuditConformExtension
     */
    public PdbxAuditConformExtension getPdbxAuditConformExtension() {
        return delegate.getCategory("pdbx_audit_conform_extension", PdbxAuditConformExtension::new);
    }

    /**
     * Data items in the category record details from the output of mapman
     * used by the DCC program.
     * @return PdbxDccMapman
     */
    public PdbxDccMapman getPdbxDccMapman() {
        return delegate.getCategory("pdbx_dcc_mapman", PdbxDccMapman::new);
    }

    /**
     * Data items in this category record residual map properties such as
     * correlation, real space Rfactors and the Zscore calculated from
     * refmac and mapman.
     * @return PdbxDccRsccMapman
     */
    public PdbxDccRsccMapman getPdbxDccRsccMapman() {
        return delegate.getCategory("pdbx_dcc_rscc_mapman", PdbxDccRsccMapman::new);
    }

    /**
     * Data items in the category record overall map properties such
     * as correlation, real space Rfactors and the Zscore calculated
     * from refmac and mapman.
     * @return PdbxDccRsccMapmanOverall
     */
    public PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall() {
        return delegate.getCategory("pdbx_dcc_rscc_mapman_overall", PdbxDccRsccMapmanOverall::new);
    }

    /**
     * Data items in the category record various overall metrics
     * calculated by DCC and various wrapped programs (such as Xtriage,
     * pointless, REFMAC ...).
     * @return PdbxDccDensity
     */
    public PdbxDccDensity getPdbxDccDensity() {
        return delegate.getCategory("pdbx_dcc_density", PdbxDccDensity::new);
    }

    /**
     * Data items in the category record the overall deviations about
     * geometry (such as bond length, angle, dihedral, chirality,
     * planarity). These data are calculated with the phenix module
     * model_vs_data.
     * @return PdbxDccGeometry
     */
    public PdbxDccGeometry getPdbxDccGeometry() {
        return delegate.getCategory("pdbx_dcc_geometry", PdbxDccGeometry::new);
    }

    /**
     * Data items in the category record calculated metrics from various
     * programs (such as phenix, refmac, cns, sfcheck).
     * @return PdbxDccDensityCorr
     */
    public PdbxDccDensityCorr getPdbxDccDensityCorr() {
        return delegate.getCategory("pdbx_dcc_density_corr", PdbxDccDensityCorr::new);
    }

    /**
     * Data items in the category record residual map properties such as
     * Real Space electron density Correlation Coefficient (RSCC), real space R
     * factors (RSR) and the Zscores for each residue, the main/side chains.
     * @return PdbxDccMap
     */
    public PdbxDccMap getPdbxDccMap() {
        return delegate.getCategory("pdbx_dcc_map", PdbxDccMap::new);
    }

    /**
     * Data items in the pdbx_deposit_group category provide identifiers
     * and related information for groups of entries deposited in a collection.
     * @return PdbxDepositGroup
     */
    public PdbxDepositGroup getPdbxDepositGroup() {
        return delegate.getCategory("pdbx_deposit_group", PdbxDepositGroup::new);
    }

    /**
     * Data items in the pdbx_deposit_group_index category provides details
     * about the individual data files in the collection of deposited entries.
     * @return PdbxDepositGroupIndex
     */
    public PdbxDepositGroupIndex getPdbxDepositGroupIndex() {
        return delegate.getCategory("pdbx_deposit_group_index", PdbxDepositGroupIndex::new);
    }

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidence
     */
    public PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence() {
        return delegate.getCategory("pdbx_struct_assembly_auth_evidence", PdbxStructAssemblyAuthEvidence::new);
    }

    /**
     * Provides reason a particular assembly in pdbx_struct_assembly is
     * of interest.
     * @return PdbxStructAssemblyAuthClassification
     */
    public PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification() {
        return delegate.getCategory("pdbx_struct_assembly_auth_classification", PdbxStructAssemblyAuthClassification::new);
    }

    /**
     * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
     * programs during indexing
     * @return PdbxCrystalAlignment
     */
    public PdbxCrystalAlignment getPdbxCrystalAlignment() {
        return delegate.getCategory("pdbx_crystal_alignment", PdbxCrystalAlignment::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
     * the revision history for a data entry.
     * @return PdbxAuditRevisionHistory
     */
    public PdbxAuditRevisionHistory getPdbxAuditRevisionHistory() {
        return delegate.getCategory("pdbx_audit_revision_history", PdbxAuditRevisionHistory::new);
    }

    /**
     * Data items in the PDBX_AUDIT_revision_group category
     * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
     * record.
     * @return PdbxAuditRevisionGroup
     */
    public PdbxAuditRevisionGroup getPdbxAuditRevisionGroup() {
        return delegate.getCategory("pdbx_audit_revision_group", PdbxAuditRevisionGroup::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
     * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionCategory
     */
    public PdbxAuditRevisionCategory getPdbxAuditRevisionCategory() {
        return delegate.getCategory("pdbx_audit_revision_category", PdbxAuditRevisionCategory::new);
    }

    /**
     * Data items in the PDBX_audit_revision_details category
     * record descriptions of changes associated with
     * PDBX_AUDIT_REVISION_HISTORY records.
     * @return PdbxAuditRevisionDetails
     */
    public PdbxAuditRevisionDetails getPdbxAuditRevisionDetails() {
        return delegate.getCategory("pdbx_audit_revision_details", PdbxAuditRevisionDetails::new);
    }

    /**
     * Data items in the PDBX_AUDIT_REVISION_ITEM category
     * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionItem
     */
    public PdbxAuditRevisionItem getPdbxAuditRevisionItem() {
        return delegate.getCategory("pdbx_audit_revision_item", PdbxAuditRevisionItem::new);
    }

    /**
     * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
     * to experimental data set dependencies for this entry.
     * @return PdbxSupportingExpDataSet
     */
    public PdbxSupportingExpDataSet getPdbxSupportingExpDataSet() {
        return delegate.getCategory("pdbx_supporting_exp_data_set", PdbxSupportingExpDataSet::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
     * details the beam that is impinging on the sample
     * @return PdbxSerialCrystallographyMeasurement
     */
    public PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement() {
        return delegate.getCategory("pdbx_serial_crystallography_measurement", PdbxSerialCrystallographyMeasurement::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
     * record general details about the sample delivery
     * @return PdbxSerialCrystallographySampleDelivery
     */
    public PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery() {
        return delegate.getCategory("pdbx_serial_crystallography_sample_delivery", PdbxSerialCrystallographySampleDelivery::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
     * category record details about sample delivery by injection
     * @return PdbxSerialCrystallographySampleDeliveryInjection
     */
    public PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection() {
        return delegate.getCategory("pdbx_serial_crystallography_sample_delivery_injection", PdbxSerialCrystallographySampleDeliveryInjection::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
     * category record details about sample delivery using a fixed taget.
     * @return PdbxSerialCrystallographySampleDeliveryFixedTarget
     */
    public PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return delegate.getCategory("pdbx_serial_crystallography_sample_delivery_fixed_target", PdbxSerialCrystallographySampleDeliveryFixedTarget::new);
    }

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
     * details about data processing that are unique to XFEL experiments.
     * These will compliment data recorded in category pdbx_diffrn_merge_stat.
     * @return PdbxSerialCrystallographyDataReduction
     */
    public PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction() {
        return delegate.getCategory("pdbx_serial_crystallography_data_reduction", PdbxSerialCrystallographyDataReduction::new);
    }

    /**
     * PDBX_CHEM_COMP_SYNONYMS holds chemical name and synonym correspondences.
     * @return PdbxChemCompSynonyms
     */
    public PdbxChemCompSynonyms getPdbxChemCompSynonyms() {
        return delegate.getCategory("pdbx_chem_comp_synonyms", PdbxChemCompSynonyms::new);
    }

    /**
     * PDBX_CHEM_COMP_RELATED describes the relationship between two chemical components.
     * @return PdbxChemCompRelated
     */
    public PdbxChemCompRelated getPdbxChemCompRelated() {
        return delegate.getCategory("pdbx_chem_comp_related", PdbxChemCompRelated::new);
    }

    /**
     * PDBX_CHEM_COMP_ATOM_RELATED provides atom level nomenclature mapping between two related chemical components.
     * @return PdbxChemCompAtomRelated
     */
    public PdbxChemCompAtomRelated getPdbxChemCompAtomRelated() {
        return delegate.getCategory("pdbx_chem_comp_atom_related", PdbxChemCompAtomRelated::new);
    }

    /**
     * Data items in the PDBX_ENTITY_BRANCH_LIST category specify the list
     * of monomers in a branched entity.  Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return PdbxEntityBranchList
     */
    public PdbxEntityBranchList getPdbxEntityBranchList() {
        return delegate.getCategory("pdbx_entity_branch_list", PdbxEntityBranchList::new);
    }

    /**
     * Data items in the PDBX_ENTITY_BRANCH_LINK category give details about
     * the linkages between components within a branched entity.
     * @return PdbxEntityBranchLink
     */
    public PdbxEntityBranchLink getPdbxEntityBranchLink() {
        return delegate.getCategory("pdbx_entity_branch_link", PdbxEntityBranchLink::new);
    }

    /**
     * Data items in the PDBX_ENTITY_BRANCH category specify the list
     * of branched entities and the type.
     * @return PdbxEntityBranch
     */
    public PdbxEntityBranch getPdbxEntityBranch() {
        return delegate.getCategory("pdbx_entity_branch", PdbxEntityBranch::new);
    }

    /**
     * The PDBX_BRANCH_SCHEME category provides residue level nomenclature
     * mapping for branch chain entities.
     * @return PdbxBranchScheme
     */
    public PdbxBranchScheme getPdbxBranchScheme() {
        return delegate.getCategory("pdbx_branch_scheme", PdbxBranchScheme::new);
    }

    /**
     * Data items in the IHM_STARTING_MODEL_DETAILS category records the
     * details about structural models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingModelDetails
     */
    public IhmStartingModelDetails getIhmStartingModelDetails() {
        return delegate.getCategory("ihm_starting_model_details", IhmStartingModelDetails::new);
    }

    /**
     * Data items in the IHM_STARTING_COMPARATIVE_MODELS category records
     * additional details about comparative models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingComparativeModels
     */
    public IhmStartingComparativeModels getIhmStartingComparativeModels() {
        return delegate.getCategory("ihm_starting_comparative_models", IhmStartingComparativeModels::new);
    }

    /**
     * Data items in the IHM_STARTING_COMPUTATIONAL_MODELS category records
     * additional details about computational models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingComputationalModels
     */
    public IhmStartingComputationalModels getIhmStartingComputationalModels() {
        return delegate.getCategory("ihm_starting_computational_models", IhmStartingComputationalModels::new);
    }

    /**
     * Data items in the IHM_STARTING_MODEL_SEQ_DIF category provide a
     * mechanism for indicating and annotating point differences
     * between the sequence of the entity or biological unit described
     * in the data block and the sequence of the starting model used in
     * the integrative modeling referenced from a database. The point
     * differences may be due to point mutations introduced in the
     * starting model or the presence of modified amino acid residues.
     * @return IhmStartingModelSeqDif
     */
    public IhmStartingModelSeqDif getIhmStartingModelSeqDif() {
        return delegate.getCategory("ihm_starting_model_seq_dif", IhmStartingModelSeqDif::new);
    }

    /**
     * Data items in the IHM_MODEL_REPRESENTATION category records the
     * details about the architecture and representation of structural
     * models created by the integrative model building tasks. This
     * category handles the multi-scale model representation, if employed.
     * @return IhmModelRepresentation
     */
    public IhmModelRepresentation getIhmModelRepresentation() {
        return delegate.getCategory("ihm_model_representation", IhmModelRepresentation::new);
    }

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY category records the
     * details of the structural assemblies and used in the
     * IHM modeling.
     * @return IhmStructAssembly
     */
    public IhmStructAssembly getIhmStructAssembly() {
        return delegate.getCategory("ihm_struct_assembly", IhmStructAssembly::new);
    }

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_DETAILS category provides
     * additional details regarding the structure assembly.
     * @return IhmStructAssemblyDetails
     */
    public IhmStructAssemblyDetails getIhmStructAssemblyDetails() {
        return delegate.getCategory("ihm_struct_assembly_details", IhmStructAssemblyDetails::new);
    }

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_CLASS_LIST category lists
     * all the structural assembly classes relevant to the entry. This
     * category provides a mechanism to define classes of the
     * structural assemblies.
     * @return IhmStructAssemblyClassList
     */
    public IhmStructAssemblyClassList getIhmStructAssemblyClassList() {
        return delegate.getCategory("ihm_struct_assembly_class_list", IhmStructAssemblyClassList::new);
    }

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_CLASS category provides
     * details regarding the structural assembly classes. This
     * category provides a mechanism to identify the classes to which
     * structural assemblies belong.
     * @return IhmStructAssemblyClass
     */
    public IhmStructAssemblyClass getIhmStructAssemblyClass() {
        return delegate.getCategory("ihm_struct_assembly_class", IhmStructAssemblyClass::new);
    }

    /**
     * Data items in the IHM_MODELING_PROTOCOL category records the
     * step-wise details of the integrative modeling workflow.
     * @return IhmModelingProtocol
     */
    public IhmModelingProtocol getIhmModelingProtocol() {
        return delegate.getCategory("ihm_modeling_protocol", IhmModelingProtocol::new);
    }

    /**
     * Data items in the IHM_MULTI_STATE_MODELING category records the
     * details of the multi-state modeling protocol, if applicable.
     * @return IhmMultiStateModeling
     */
    public IhmMultiStateModeling getIhmMultiStateModeling() {
        return delegate.getCategory("ihm_multi_state_modeling", IhmMultiStateModeling::new);
    }

    /**
     * Data items in the IHM_ORDERED_ENSEMBLE category records the
     * details of the ensembles ordered by time or other order.
     * Ordered ensembles are described as directed graphs with
     * edges between nodes representing models or model groups.
     * @return IhmOrderedEnsemble
     */
    public IhmOrderedEnsemble getIhmOrderedEnsemble() {
        return delegate.getCategory("ihm_ordered_ensemble", IhmOrderedEnsemble::new);
    }

    /**
     * Data items in the IHM_MODELING_POST_PROCESS category records
     * the details of the post processing of the models/results of
     * the modeling protocol.
     * @return IhmModelingPostProcess
     */
    public IhmModelingPostProcess getIhmModelingPostProcess() {
        return delegate.getCategory("ihm_modeling_post_process", IhmModelingPostProcess::new);
    }

    /**
     * Data items in the IHM_ENSEMBLE_INFO category records the
     * details of the model clusters or ensembles obtained after
     * sampling.
     * @return IhmEnsembleInfo
     */
    public IhmEnsembleInfo getIhmEnsembleInfo() {
        return delegate.getCategory("ihm_ensemble_info", IhmEnsembleInfo::new);
    }

    /**
     * Data items in the IHM_MODEL_LIST category record the
     * details of the models being deposited.
     * @return IhmModelList
     */
    public IhmModelList getIhmModelList() {
        return delegate.getCategory("ihm_model_list", IhmModelList::new);
    }

    /**
     * Data items in the IHM_MODEL_REPRESENTATIVE category record the
     * details of the representative model in an ensemble or cluster.
     * @return IhmModelRepresentative
     */
    public IhmModelRepresentative getIhmModelRepresentative() {
        return delegate.getCategory("ihm_model_representative", IhmModelRepresentative::new);
    }

    /**
     * Category holds the list of all datasets used in the IHM modeling.
     * These can be datasets archived in other related databases such as
     * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc., or can be hosted in other
     * places such as the authors website, github etc. These datasets are
     * elaborated in detail in the IHM_DATASET_RELATED_DB_REFERENCE and/or
     * the IHM_DATASET_EXTERNAL_REFERENCE categories. This category
     * holds the list of all datasets used.
     * @return IhmDatasetList
     */
    public IhmDatasetList getIhmDatasetList() {
        return delegate.getCategory("ihm_dataset_list", IhmDatasetList::new);
    }

    /**
     * Category provides a mechanism to group datasets.
     * @return IhmDatasetGroup
     */
    public IhmDatasetGroup getIhmDatasetGroup() {
        return delegate.getCategory("ihm_dataset_group", IhmDatasetGroup::new);
    }

    /**
     * Category holds information about related datasets, where one is derived from the other.
     * @return IhmRelatedDatasets
     */
    public IhmRelatedDatasets getIhmRelatedDatasets() {
        return delegate.getCategory("ihm_related_datasets", IhmRelatedDatasets::new);
    }

    /**
     * Category holds information related to data sources for the entry.
     * These can be datasets archived in other related databases such as
     * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc.
     * @return IhmDatasetRelatedDbReference
     */
    public IhmDatasetRelatedDbReference getIhmDatasetRelatedDbReference() {
        return delegate.getCategory("ihm_dataset_related_db_reference", IhmDatasetRelatedDbReference::new);
    }

    /**
     * Category holds links to other external data sources for the I/H model entry.
     * Input datasets held in other databases such as EMDB, BMRB, SASBDB etc.
     * are referenced in the IHM_DATASET_RELATED_DB_REFERENCE category.
     * This data category, along with IHM_EXTERNAL_FILES category, holds information
     * regarding other non-database external data sources, such as  DOIs (digital
     * object identifiers) or supplementary files stored locally. The DOIs can either
     * lead to the external data file(s) directly (as in case of DOIs provided by the PDB)
     * or might lead to an HTML landing page (as provided by Zenodo). In the latter case,
     * additional URL (Uniform Resource Locator) information is required to retrieve
     * the external data file(s).
     * @return IhmExternalReferenceInfo
     */
    public IhmExternalReferenceInfo getIhmExternalReferenceInfo() {
        return delegate.getCategory("ihm_external_reference_info", IhmExternalReferenceInfo::new);
    }

    /**
     * Category provides details regarding external files. The IHM_EXTERNAL_REFERENCE_INFO
     * category captures the top-level details regarding external data sources.
     * This category captures the specific details regarding externally stored files
     * related to the particular I/H model entry.
     * @return IhmExternalFiles
     */
    public IhmExternalFiles getIhmExternalFiles() {
        return delegate.getCategory("ihm_external_files", IhmExternalFiles::new);
    }

    /**
     * Category provides additional details regarding input data hosted externally
     * at other resources.
     * @return IhmDatasetExternalReference
     */
    public IhmDatasetExternalReference getIhmDatasetExternalReference() {
        return delegate.getCategory("ihm_dataset_external_reference", IhmDatasetExternalReference::new);
    }

    /**
     * Data items in the IHM_LOCALIZATION_DENSITY_FILES category records the
     * details of files that provide information regarding localization densities
     * of ensembles. These may be stored externally as local files or linked via
     * DOI and can be in any accepted format that provides volume information
     * (CCP4, MRC, etc.).
     * @return IhmLocalizationDensityFiles
     */
    public IhmLocalizationDensityFiles getIhmLocalizationDensityFiles() {
        return delegate.getCategory("ihm_localization_density_files", IhmLocalizationDensityFiles::new);
    }

    /**
     * Data items in the IHM_PREDICTED_CONTACT_RESTRAINT category records the
     * list of predicted contacts used in the integrative modeling experiment.
     * This has been adapted from the widely used CASP RR format
     * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
     * These contacts may be derived from various computational tools.
     * The software information can be provided in the SOFTWARE category.
     * @return IhmPredictedContactRestraint
     */
    public IhmPredictedContactRestraint getIhmPredictedContactRestraint() {
        return delegate.getCategory("ihm_predicted_contact_restraint", IhmPredictedContactRestraint::new);
    }

    /**
     * Data items in the IHM_HYDROXYL_RADICAL_FP_RESTRAINT category records the
     * restraints derived from hydroxyl radical footprinting experiment.
     * These restraints provide information regarding solvent accessible surface
     * area of residues.
     * @return IhmHydroxylRadicalFpRestraint
     */
    public IhmHydroxylRadicalFpRestraint getIhmHydroxylRadicalFpRestraint() {
        return delegate.getCategory("ihm_hydroxyl_radical_fp_restraint", IhmHydroxylRadicalFpRestraint::new);
    }

    /**
     * Data items in the IHM_CROSS_LINK_LIST category records the
     * list of spatial restraints derived from chemical crosslinking
     * experiment.
     * @return IhmCrossLinkList
     */
    public IhmCrossLinkList getIhmCrossLinkList() {
        return delegate.getCategory("ihm_cross_link_list", IhmCrossLinkList::new);
    }

    /**
     * Data items in the IHM_CROSS_LINK_RESTRAINT category enumerates the
     * implementation details of the chemical crosslinking restraints in
     * the integrative modeling. This category holds the details of how
     * the experimentally derived crosslinks are applied in the modeling.
     * @return IhmCrossLinkRestraint
     */
    public IhmCrossLinkRestraint getIhmCrossLinkRestraint() {
        return delegate.getCategory("ihm_cross_link_restraint", IhmCrossLinkRestraint::new);
    }

    /**
     * Data items in the IHM_CROSS_LINK_RESULT category records the
     * results of the crosslinking restraints in the IHM modeling.
     * @return IhmCrossLinkResult
     */
    public IhmCrossLinkResult getIhmCrossLinkResult() {
        return delegate.getCategory("ihm_cross_link_result", IhmCrossLinkResult::new);
    }

    /**
     * Data items in the IHM_CROSS_LINK_RESULT_PARAMETERS category records the
     * results of the crosslinking restraint parameters in the IHM modeling.
     * @return IhmCrossLinkResultParameters
     */
    public IhmCrossLinkResultParameters getIhmCrossLinkResultParameters() {
        return delegate.getCategory("ihm_cross_link_result_parameters", IhmCrossLinkResultParameters::new);
    }

    /**
     * Data items in the IHM_2DEM_CLASS_AVERAGE_RESTRAINT category records the
     * details of the 2DEM class averages used in the IHM modeling.
     * @return Ihm2demClassAverageRestraint
     */
    public Ihm2demClassAverageRestraint getIhm2demClassAverageRestraint() {
        return delegate.getCategory("ihm_2dem_class_average_restraint", Ihm2demClassAverageRestraint::new);
    }

    /**
     * Data items in the IHM_2DEM_CLASS_AVERAGE_FITTING category records the
     * details of the fitting of the model to the 2DEM class averages
     * used in the IHM modeling. The following conventions are recommended
     * while generating the rotation matrix and translation vector for
     * transformation.
     * 
     * - The model is rotated and translated to fit to the 2DEM image.
     * - The 2DEM image should be in the XY plane.
     * - The lower left image corner (image pixel index 0,0) should be at x,y,z = (0,0,0).
     * - The 2D image is scaled by the _ihm_2dem_class_average_restraint.pixel_size_width
     * and _ihm_2dem_class_average_restraint.pixel_size_height from the
     * IHM_2DEM_CLASS_AVERAGE_RESTRAINT table.
     * - The transformation is applied after the scaling and hence the translation vector
     * should account for the scaling.
     * - There are no specifications for Z translations i.e., how far the image should be
     * from the model while projecting. It may be set to zero.
     * @return Ihm2demClassAverageFitting
     */
    public Ihm2demClassAverageFitting getIhm2demClassAverageFitting() {
        return delegate.getCategory("ihm_2dem_class_average_fitting", Ihm2demClassAverageFitting::new);
    }

    /**
     * Data items in the IHM_3DEM_RESTRAINT category records the
     * details of the 3DEM maps used as restraints in the
     * IHM modeling.
     * @return Ihm3demRestraint
     */
    public Ihm3demRestraint getIhm3demRestraint() {
        return delegate.getCategory("ihm_3dem_restraint", Ihm3demRestraint::new);
    }

    /**
     * Data items in the IHM_SAS_RESTRAINT category records the
     * details of the SAS data used as restraints in the
     * IHM modeling.
     * @return IhmSasRestraint
     */
    public IhmSasRestraint getIhmSasRestraint() {
        return delegate.getCategory("ihm_sas_restraint", IhmSasRestraint::new);
    }

    /**
     * Data items in the IHM_STARTING_MODEL_COORD category records the coordinates
     * for structural templates used as starting inputs in the integrative model
     * building tasks.
     * @return IhmStartingModelCoord
     */
    public IhmStartingModelCoord getIhmStartingModelCoord() {
        return delegate.getCategory("ihm_starting_model_coord", IhmStartingModelCoord::new);
    }

    /**
     * Data items in the IHM_SPHERE_OBJ_SITE category records the details
     * of the spherical objects modeled in the integrative structural model.
     * @return IhmSphereObjSite
     */
    public IhmSphereObjSite getIhmSphereObjSite() {
        return delegate.getCategory("ihm_sphere_obj_site", IhmSphereObjSite::new);
    }

    /**
     * Data items in the IHM_GAUSSIAN_OBJ_SITE category records the details
     * of the gaussian objects modeled in the integrative structural model.
     * @return IhmGaussianObjSite
     */
    public IhmGaussianObjSite getIhmGaussianObjSite() {
        return delegate.getCategory("ihm_gaussian_obj_site", IhmGaussianObjSite::new);
    }

    /**
     * Data items in the IHM_GAUSSIAN_OBJ_ENSEMBLE category records the details
     * of the gaussian objects representing an ensemble or cluster of models.
     * @return IhmGaussianObjEnsemble
     */
    public IhmGaussianObjEnsemble getIhmGaussianObjEnsemble() {
        return delegate.getCategory("ihm_gaussian_obj_ensemble", IhmGaussianObjEnsemble::new);
    }

    /**
     * Data items in the IHM_RESIDUES_NOT_MODELED category record the
     * details of the residues that are defined in the
     * IHM_STRUCT_ASSEMBLY category but are missing in the
     * three-dimensional model (ATOM_SITE, IHM_SPHERE_OBJ_SITE,
     * IHM_GAUSSIAN_OBJ_SITE categories) i.e., residues in the
     * assembly that are not modeled.
     * @return IhmResiduesNotModeled
     */
    public IhmResiduesNotModeled getIhmResiduesNotModeled() {
        return delegate.getCategory("ihm_residues_not_modeled", IhmResiduesNotModeled::new);
    }

    /**
     * IHM_FEATURE_LIST is the high level category that provides defintions
     * to select atoms/residues from polymeric and non-polymeric entities.
     * @return IhmFeatureList
     */
    public IhmFeatureList getIhmFeatureList() {
        return delegate.getCategory("ihm_feature_list", IhmFeatureList::new);
    }

    /**
     * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
     * of pseudo positions for the features listed in IHM_FEATURE_LIST.
     * @return IhmPseudoSiteFeature
     */
    public IhmPseudoSiteFeature getIhmPseudoSiteFeature() {
        return delegate.getCategory("ihm_pseudo_site_feature", IhmPseudoSiteFeature::new);
    }

    /**
     * Data items in the IHM_POLY_ATOM_FEATURE category provides the defintions
     * required to select specific atoms.
     * @return IhmPolyAtomFeature
     */
    public IhmPolyAtomFeature getIhmPolyAtomFeature() {
        return delegate.getCategory("ihm_poly_atom_feature", IhmPolyAtomFeature::new);
    }

    /**
     * Data items in the IHM_POLY_RESIDUE_FEATURE category provides the defintions
     * required to select a specific residue or a set of residues that may or may not be
     * in a contiguous range.
     * @return IhmPolyResidueFeature
     */
    public IhmPolyResidueFeature getIhmPolyResidueFeature() {
        return delegate.getCategory("ihm_poly_residue_feature", IhmPolyResidueFeature::new);
    }

    /**
     * Data items in the IHM_NON_POLY_FEATURE category provides the defintions
     * required to select a non-polymeric (ligand) feature.
     * @return IhmNonPolyFeature
     */
    public IhmNonPolyFeature getIhmNonPolyFeature() {
        return delegate.getCategory("ihm_non_poly_feature", IhmNonPolyFeature::new);
    }

    /**
     * Data items in the IHM_INTERFACE_RESIDUE_FEATURE category captures the
     * details of residues that are identified to be at the binding interface
     * from experiments. This information is used by modeling software such as
     * HADDOCK to create a set of ambiguous distance restraints at the binding
     * interface between the molecular entities involved.
     * @return IhmInterfaceResidueFeature
     */
    public IhmInterfaceResidueFeature getIhmInterfaceResidueFeature() {
        return delegate.getCategory("ihm_interface_residue_feature", IhmInterfaceResidueFeature::new);
    }

    /**
     * Data items in the IHM_DERIVED_DISTANCE_RESTRAINT category records the
     * list of distance restraints used in the integrative modeling experiment.
     * These distance redistance restraints may be derived from various kinds of experiments.
     * @return IhmDerivedDistanceRestraint
     */
    public IhmDerivedDistanceRestraint getIhmDerivedDistanceRestraint() {
        return delegate.getCategory("ihm_derived_distance_restraint", IhmDerivedDistanceRestraint::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_LIST category records the list of
     * geometric objects used as restraints in the integrative modeling study.
     * @return IhmGeometricObjectList
     */
    public IhmGeometricObjectList getIhmGeometricObjectList() {
        return delegate.getCategory("ihm_geometric_object_list", IhmGeometricObjectList::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_CENTER category records the center of
     * geometric objects used as restraints in the integrative modeling study.
     * @return IhmGeometricObjectCenter
     */
    public IhmGeometricObjectCenter getIhmGeometricObjectCenter() {
        return delegate.getCategory("ihm_geometric_object_center", IhmGeometricObjectCenter::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_TRANSFORMATION category records the
     * details of the rotation matrix and translation vector applied for transforming
     * the geometric object.
     * If no transformation is provide, identity transformation is assumed.
     * @return IhmGeometricObjectTransformation
     */
    public IhmGeometricObjectTransformation getIhmGeometricObjectTransformation() {
        return delegate.getCategory("ihm_geometric_object_transformation", IhmGeometricObjectTransformation::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_SPHERE category records the parameters of
     * a sphere.
     * @return IhmGeometricObjectSphere
     */
    public IhmGeometricObjectSphere getIhmGeometricObjectSphere() {
        return delegate.getCategory("ihm_geometric_object_sphere", IhmGeometricObjectSphere::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_TORUS category records the parameters of
     * a torus. By definition, the base plane of the torus is the XY plane. The
     * `ihm_geometric_object_transformation` category can be used to generate
     * transformations to any other plane.
     * @return IhmGeometricObjectTorus
     */
    public IhmGeometricObjectTorus getIhmGeometricObjectTorus() {
        return delegate.getCategory("ihm_geometric_object_torus", IhmGeometricObjectTorus::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_HALF_TORUS category records the parameters of
     * half-torus that represents a membrane.
     * @return IhmGeometricObjectHalfTorus
     */
    public IhmGeometricObjectHalfTorus getIhmGeometricObjectHalfTorus() {
        return delegate.getCategory("ihm_geometric_object_half_torus", IhmGeometricObjectHalfTorus::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_AXIS category records the details of
     * an axis used in a spatial restraint.
     * @return IhmGeometricObjectAxis
     */
    public IhmGeometricObjectAxis getIhmGeometricObjectAxis() {
        return delegate.getCategory("ihm_geometric_object_axis", IhmGeometricObjectAxis::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_PLANE category records the details of
     * a plane used in a spatial restraint.
     * @return IhmGeometricObjectPlane
     */
    public IhmGeometricObjectPlane getIhmGeometricObjectPlane() {
        return delegate.getCategory("ihm_geometric_object_plane", IhmGeometricObjectPlane::new);
    }

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_DISTANCE_RESTRAINT category records the
     * details of distance restraints involving geometric objects.
     * 
     * If the geometric object involved is a plane, then the distance
     * is along the normal following the right-hand rule.
     * So for the xy plane, distance is along the z axis in the positive
     * direction, 'above' the plane such that negative distances
     * corresponded to positions below the plane.
     * @return IhmGeometricObjectDistanceRestraint
     */
    public IhmGeometricObjectDistanceRestraint getIhmGeometricObjectDistanceRestraint() {
        return delegate.getCategory("ihm_geometric_object_distance_restraint", IhmGeometricObjectDistanceRestraint::new);
    }
}
