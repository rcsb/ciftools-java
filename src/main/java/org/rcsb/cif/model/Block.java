package org.rcsb.cif.model;

import java.util.List;
import java.util.stream.Stream;

/**
 * Represents a Block in a CifFile.
 */
public interface Block {
    /**
     * The header of this block.
     * @return String of the header
     */
    String getBlockHeader();

    /**
     * Retrieve a particular category by name.
     * @param name the category name
     * @return the corresponding category, if none exists a instance of BaseCategory is returned as proxy
     */
    Category getCategory(String name);

    /**
     * The names of all categories which will not return an empty category when queried.
     * @return collection of all category names
     */
    List<String> getCategoryNames();

    /**
     * Convenience method to access all present category names.
     * @return a stream of all registered categories
     */
    default Stream<String> categoryNames() {
        return getCategoryNames().stream();
    }

    /**
     * Traverses all present categories.
     * @return a Stream of all categories
     */
    default Stream<Category> categories() {
        return categoryNames().map(this::getCategory);
    }

    /**
     * All save frames associated to this block.
     * @return collection of save frames
     */
    List<Block> getSaveFrames();

    /**
     * Convenience method to traverse all save frames.
     * @return a Stream of all save frames.
     */
    default Stream<Block> saveFrames() {
        return getSaveFrames().stream();
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
    org.rcsb.cif.model.generated.AtomSite getAtomSite();

    /**
     * Data items in the ATOM_SITE_ANISOTROP category record details
     * about anisotropic displacement parameters.
     * If the ATOM_SITE_ANISOTROP category is used for storing these
     * data, the corresponding ATOM_SITE data items are not used.
     * @return AtomSiteAnisotrop
     */
    org.rcsb.cif.model.generated.AtomSiteAnisotrop getAtomSiteAnisotrop();

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    org.rcsb.cif.model.generated.AtomSites getAtomSites();

    /**
     * Data items in the ATOM_SITES_ALT category record details
     * about the structural ensembles that should be generated from
     * atom sites or groups of atom sites that are modelled in
     * alternative conformations in this data block.
     * @return AtomSitesAlt
     */
    org.rcsb.cif.model.generated.AtomSitesAlt getAtomSitesAlt();

    /**
     * Data items in the ATOM_SITES_ALT_ENS category record details
     * about the ensemble structure generated from atoms with various
     * alternative conformation IDs.
     * @return AtomSitesAltEns
     */
    org.rcsb.cif.model.generated.AtomSitesAltEns getAtomSitesAltEns();

    /**
     * Data items in the ATOM_SITES_ALT_GEN category record details
     * about the interpretation of multiple conformations in the
     * structure.
     * @return AtomSitesAltGen
     */
    org.rcsb.cif.model.generated.AtomSitesAltGen getAtomSitesAltGen();

    /**
     * Data items in the ATOM_SITES_FOOTNOTE category record detailed
     * comments about an atom site or a group of atom sites.
     * @return AtomSitesFootnote
     */
    org.rcsb.cif.model.generated.AtomSitesFootnote getAtomSitesFootnote();

    /**
     * Data items in the ATOM_TYPE category record details about the
     * properties of the atoms that occupy the atom sites, such as the
     * atomic scattering factors.
     * @return AtomType
     */
    org.rcsb.cif.model.generated.AtomType getAtomType();

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
    org.rcsb.cif.model.generated.Audit getAudit();

    /**
     * Data items in the AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return AuditAuthor
     */
    org.rcsb.cif.model.generated.AuditAuthor getAuditAuthor();

    /**
     * Data items in the AUDIT_CONFORM category describe the
     * dictionary versions against which the data names appearing in
     * the current data block are conformant.
     * @return AuditConform
     */
    org.rcsb.cif.model.generated.AuditConform getAuditConform();

    /**
     * Data items in the AUDIT_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the content of this data block.
     * @return AuditContactAuthor
     */
    org.rcsb.cif.model.generated.AuditContactAuthor getAuditContactAuthor();

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    org.rcsb.cif.model.generated.Cell getCell();

    /**
     * Data items in the CELL_MEASUREMENT category record details
     * about the measurement of the crystallographic cell parameters.
     * @return CellMeasurement
     */
    org.rcsb.cif.model.generated.CellMeasurement getCellMeasurement();

    /**
     * Data items in the CELL_MEASUREMENT_REFLN category record
     * details about the reflections used to determine the
     * crystallographic cell parameters.
     *
     * The CELL_MEASUREMENT_REFLN data items would in general be used
     * only for diffractometer data.
     * @return CellMeasurementRefln
     */
    org.rcsb.cif.model.generated.CellMeasurementRefln getCellMeasurementRefln();

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
    org.rcsb.cif.model.generated.ChemComp getChemComp();

    /**
     * Data items in the CHEM_COMP_ANGLE category record details about
     * angles in a chemical component. Angles are designated by three
     * atoms, with the second atom forming the vertex of the angle.
     * Target values may be specified as angles in degrees, as a
     * distance between the first and third atoms, or both.
     * @return ChemCompAngle
     */
    org.rcsb.cif.model.generated.ChemCompAngle getChemCompAngle();

    /**
     * Data items in the CHEM_COMP_ATOM category record details about
     * the atoms in a chemical component. Specifying the atomic
     * coordinates for the components in this category is an
     * alternative to specifying the structure of the component
     * via bonds, angles, planes etc. in the appropriate
     * CHEM_COMP subcategories.
     * @return ChemCompAtom
     */
    org.rcsb.cif.model.generated.ChemCompAtom getChemCompAtom();

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    org.rcsb.cif.model.generated.ChemCompBond getChemCompBond();

    /**
     * Data items in the CHEM_COMP_CHIR category provide details about
     * the chiral centres in a chemical component. The atoms bonded
     * to the chiral atom are specified in the CHEM_COMP_CHIR_ATOM
     * category.
     * @return ChemCompChir
     */
    org.rcsb.cif.model.generated.ChemCompChir getChemCompChir();

    /**
     * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom within a chemical component.
     * @return ChemCompChirAtom
     */
    org.rcsb.cif.model.generated.ChemCompChirAtom getChemCompChirAtom();

    /**
     * Data items in the CHEM_COMP_LINK category give details about
     * the links between chemical components.
     * @return ChemCompLink
     */
    org.rcsb.cif.model.generated.ChemCompLink getChemCompLink();

    /**
     * Data items in the CHEM_COMP_PLANE category provide identifiers
     * for the planes in a chemical component.  The atoms in the plane
     * are specified in the CHEM_COMP_PLANE_ATOM category.
     * @return ChemCompPlane
     */
    org.rcsb.cif.model.generated.ChemCompPlane getChemCompPlane();

    /**
     * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
     * atoms in a plane within a chemical component.
     * @return ChemCompPlaneAtom
     */
    org.rcsb.cif.model.generated.ChemCompPlaneAtom getChemCompPlaneAtom();

    /**
     * Data items in the CHEM_COMP_TOR category record details about
     * the torsion angles in a chemical component. As torsion angles
     * can have more than one target value, the target values are
     * specified in the CHEM_COMP_TOR_VALUE category.
     * @return ChemCompTor
     */
    org.rcsb.cif.model.generated.ChemCompTor getChemCompTor();

    /**
     * Data items in the CHEM_COMP_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_COMP_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemCompTorValue
     */
    org.rcsb.cif.model.generated.ChemCompTorValue getChemCompTorValue();

    /**
     * Data items in the CHEM_LINK category give details about
     * the links between chemical components.
     * @return ChemLink
     */
    org.rcsb.cif.model.generated.ChemLink getChemLink();

    /**
     * Data items in the CHEM_LINK_ANGLE category record details
     * about angles in a link between chemical components.
     * @return ChemLinkAngle
     */
    org.rcsb.cif.model.generated.ChemLinkAngle getChemLinkAngle();

    /**
     * Data items in the CHEM_LINK_BOND category record details about
     * bonds in a link between components in the chemical structure.
     * @return ChemLinkBond
     */
    org.rcsb.cif.model.generated.ChemLinkBond getChemLinkBond();

    /**
     * Data items in the CHEM_LINK_CHIR category provide details about
     * the chiral centres in a link between two chemical components.
     * The atoms bonded to the chiral atom are specified in the
     * CHEM_LINK_CHIR_ATOM category.
     * @return ChemLinkChir
     */
    org.rcsb.cif.model.generated.ChemLinkChir getChemLinkChir();

    /**
     * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom in a link between two
     * chemical components.
     * @return ChemLinkChirAtom
     */
    org.rcsb.cif.model.generated.ChemLinkChirAtom getChemLinkChirAtom();

    /**
     * Data items in the CHEM_LINK_PLANE category provide identifiers
     * for the planes in a link between two chemical components.
     * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
     * category.
     * @return ChemLinkPlane
     */
    org.rcsb.cif.model.generated.ChemLinkPlane getChemLinkPlane();

    /**
     * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
     * atoms in a plane in a link between two chemical components.
     * @return ChemLinkPlaneAtom
     */
    org.rcsb.cif.model.generated.ChemLinkPlaneAtom getChemLinkPlaneAtom();

    /**
     * Data items in the CHEM_LINK_TOR category record details about
     * the torsion angles in a link between two chemical components.
     * As torsion angles can have more than one target value, the
     * target values are specified in the CHEM_LINK_TOR_VALUE category.
     * @return ChemLinkTor
     */
    org.rcsb.cif.model.generated.ChemLinkTor getChemLinkTor();

    /**
     * Data items in the CHEM_LINK_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_LINK_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemLinkTorValue
     */
    org.rcsb.cif.model.generated.ChemLinkTorValue getChemLinkTorValue();

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
    org.rcsb.cif.model.generated.Chemical getChemical();

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
    org.rcsb.cif.model.generated.ChemicalConnAtom getChemicalConnAtom();

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
    org.rcsb.cif.model.generated.ChemicalConnBond getChemicalConnBond();

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
    org.rcsb.cif.model.generated.ChemicalFormula getChemicalFormula();

    /**
     * Data items in the CITATION category record details about the
     * literature cited as being relevant to the contents of the data
     * block.
     * @return Citation
     */
    org.rcsb.cif.model.generated.Citation getCitation();

    /**
     * Data items in the CITATION_AUTHOR category record details
     * about the authors associated with the citations in the
     * CITATION list.
     * @return CitationAuthor
     */
    org.rcsb.cif.model.generated.CitationAuthor getCitationAuthor();

    /**
     * Data items in the CITATION_EDITOR category record details
     * about the editors associated with the books or book chapters
     * cited in the CITATION list.
     * @return CitationEditor
     */
    org.rcsb.cif.model.generated.CitationEditor getCitationEditor();

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
    org.rcsb.cif.model.generated.Computing getComputing();

    /**
     * Data items in the DATABASE category have been superseded by
     * data items in the DATABASE_2 category. They are included
     * here only for compliance with older CIFs.
     * @return Database
     */
    org.rcsb.cif.model.generated.Database getDatabase();

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
    org.rcsb.cif.model.generated.Database2 getDatabase2();

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
    org.rcsb.cif.model.generated.DatabasePDBCaveat getDatabasePDBCaveat();

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
    org.rcsb.cif.model.generated.DatabasePDBMatrix getDatabasePDBMatrix();

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
    org.rcsb.cif.model.generated.DatabasePDBRemark getDatabasePDBRemark();

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
    org.rcsb.cif.model.generated.DatabasePDBRev getDatabasePDBRev();

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
    org.rcsb.cif.model.generated.DatabasePDBRevRecord getDatabasePDBRevRecord();

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
    org.rcsb.cif.model.generated.DatabasePDBTvect getDatabasePDBTvect();

    /**
     * Data items in the DIFFRN category record details about the
     * diffraction data and their measurement.
     * @return Diffrn
     */
    org.rcsb.cif.model.generated.Diffrn getDiffrn();

    /**
     * Data items in the DIFFRN_ATTENUATOR category record details
     * about the diffraction attenuator scales employed.
     * @return DiffrnAttenuator
     */
    org.rcsb.cif.model.generated.DiffrnAttenuator getDiffrnAttenuator();

    /**
     * Data items in the DIFFRN_DETECTOR category describe the
     * detector used to measure the scattered radiation, including
     * any analyser and post-sample collimation.
     * @return DiffrnDetector
     */
    org.rcsb.cif.model.generated.DiffrnDetector getDiffrnDetector();

    /**
     * Data items in the DIFFRN_MEASUREMENT category record details
     * about the device used to orient and/or position the crystal
     * during data measurement and the manner in which the diffraction
     * data were measured.
     * @return DiffrnMeasurement
     */
    org.rcsb.cif.model.generated.DiffrnMeasurement getDiffrnMeasurement();

    /**
     * Data items in the DIFFRN_ORIENT_MATRIX category record details
     * about the orientation matrix used in the measurement of the
     * diffraction data.
     * @return DiffrnOrientMatrix
     */
    org.rcsb.cif.model.generated.DiffrnOrientMatrix getDiffrnOrientMatrix();

    /**
     * Data items in the DIFFRN_ORIENT_REFLN category record details
     * about the reflections that define the orientation matrix used in
     * the measurement of the diffraction intensities.
     * @return DiffrnOrientRefln
     */
    org.rcsb.cif.model.generated.DiffrnOrientRefln getDiffrnOrientRefln();

    /**
     * Data items in the DIFFRN_RADIATION category describe
     * the radiation used in measuring the diffraction intensities,
     * its collimation and monochromatization before the sample.
     *
     * Post-sample treatment of the beam is described by data
     * items in the DIFFRN_DETECTOR category.
     * @return DiffrnRadiation
     */
    org.rcsb.cif.model.generated.DiffrnRadiation getDiffrnRadiation();

    /**
     * Data items in the DIFFRN_RADIATION_WAVELENGTH category
     * describe the wavelength of the radiation used to measure the
     * diffraction intensities. Items may be looped to identify
     * and assign weights to distinct components of a
     * polychromatic beam.
     * @return DiffrnRadiationWavelength
     */
    org.rcsb.cif.model.generated.DiffrnRadiationWavelength getDiffrnRadiationWavelength();

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
    org.rcsb.cif.model.generated.DiffrnRefln getDiffrnRefln();

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
    org.rcsb.cif.model.generated.DiffrnReflns getDiffrnReflns();

    /**
     * Data items in the DIFFRN_SCALE_GROUP category record details
     * of the scaling factors applied to place all intensities in the
     * reflection lists on a common scale.
     * Scaling groups might, for example, correspond to each film in a
     * multi-film data set or each crystal in a multi-crystal data set.
     * @return DiffrnScaleGroup
     */
    org.rcsb.cif.model.generated.DiffrnScaleGroup getDiffrnScaleGroup();

    /**
     * Data items in the DIFFRN_SOURCE category record details of
     * the source of radiation used in the diffraction experiment.
     * @return DiffrnSource
     */
    org.rcsb.cif.model.generated.DiffrnSource getDiffrnSource();

    /**
     * Data items in the DIFFRN_STANDARD_REFLN category record details
     * about the reflections treated as standards during the measurement
     * of a set of diffraction intensities.
     *
     * Note that these are the individual standard reflections, not the
     * results of the analysis of the standard reflections.
     * @return DiffrnStandardRefln
     */
    org.rcsb.cif.model.generated.DiffrnStandardRefln getDiffrnStandardRefln();

    /**
     * Data items in the DIFFRN_STANDARDS category record details
     * about the set of standard reflections used to monitor intensity
     * stability during the measurement of diffraction intensities.
     *
     * Note that these records describe properties common to the set of
     * standard reflections, not the standard reflections themselves.
     * @return DiffrnStandards
     */
    org.rcsb.cif.model.generated.DiffrnStandards getDiffrnStandards();

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
    org.rcsb.cif.model.generated.Entity getEntity();

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
    org.rcsb.cif.model.generated.EntityKeywords getEntityKeywords();

    /**
     * Data items in the ENTITY_LINK category give details about
     * the links between entities.
     * @return EntityLink
     */
    org.rcsb.cif.model.generated.EntityLink getEntityLink();

    /**
     * Data items in the ENTITY_NAME_COM category record the common name
     * or names associated with the entity. In some cases, the entity
     * name may not be the same as the name of the biological structure.
     * For example, haemoglobin alpha chain would be the entity common
     * name, not haemoglobin.
     * @return EntityNameCom
     */
    org.rcsb.cif.model.generated.EntityNameCom getEntityNameCom();

    /**
     * Data items in the ENTITY_NAME_SYS category record the systematic
     * name or names associated with the entity and the system that
     * was used to construct the systematic name. In some cases, the
     * entity name may not be the same as the name of the biological
     * structure.
     * @return EntityNameSys
     */
    org.rcsb.cif.model.generated.EntityNameSys getEntityNameSys();

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    org.rcsb.cif.model.generated.EntityPoly getEntityPoly();

    /**
     * Data items in the ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer. Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return EntityPolySeq
     */
    org.rcsb.cif.model.generated.EntityPolySeq getEntityPolySeq();

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    org.rcsb.cif.model.generated.Entry getEntry();

    /**
     * Data items in the ENTRY_LINK category record the
     * relationships between the current data block
     * identified by _entry.id and other data blocks
     * within the current file which may be referenced
     * in the current data block.
     * @return EntryLink
     */
    org.rcsb.cif.model.generated.EntryLink getEntryLink();

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    org.rcsb.cif.model.generated.Exptl getExptl();

    /**
     * Data items in the EXPTL_CRYSTAL category record the results of
     * experimental measurements on the crystal or crystals used,
     * such as shape, size or density.
     * @return ExptlCrystal
     */
    org.rcsb.cif.model.generated.ExptlCrystal getExptlCrystal();

    /**
     * Data items in the EXPTL_CRYSTAL_FACE category record details
     * of the crystal faces.
     * @return ExptlCrystalFace
     */
    org.rcsb.cif.model.generated.ExptlCrystalFace getExptlCrystalFace();

    /**
     * Data items in the EXPTL_CRYSTAL_GROW category record details
     * about the conditions and methods used to grow the crystal.
     * @return ExptlCrystalGrow
     */
    org.rcsb.cif.model.generated.ExptlCrystalGrow getExptlCrystalGrow();

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
    org.rcsb.cif.model.generated.ExptlCrystalGrowComp getExptlCrystalGrowComp();

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
    org.rcsb.cif.model.generated.Geom getGeom();

    /**
     * Data items in the GEOM_ANGLE category record details about the
     * bond angles as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomAngle
     */
    org.rcsb.cif.model.generated.GeomAngle getGeomAngle();

    /**
     * Data items in the GEOM_BOND category record details about
     * the bond lengths as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomBond
     */
    org.rcsb.cif.model.generated.GeomBond getGeomBond();

    /**
     * Data items in the GEOM_CONTACT category record details about
     * interatomic contacts as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomContact
     */
    org.rcsb.cif.model.generated.GeomContact getGeomContact();

    /**
     * Data items in the GEOM_HBOND category record details about
     * hydrogen bonds as calculated from the contents of the ATOM,
     * CELL and SYMMETRY data.
     * @return GeomHbond
     */
    org.rcsb.cif.model.generated.GeomHbond getGeomHbond();

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
    org.rcsb.cif.model.generated.GeomTorsion getGeomTorsion();

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
    org.rcsb.cif.model.generated.Journal getJournal();

    /**
     * Data items in the JOURNAL_INDEX category are used to list terms
     * used to generate the journal indexes.
     *
     * The creator of a data block will not normally specify these data
     * items.
     * @return JournalIndex
     */
    org.rcsb.cif.model.generated.JournalIndex getJournalIndex();

    /**
     * Data items in the PHASING category record details about the
     * phasing of the structure, listing the various methods used in
     * the phasing process. Details about the application of each
     * method are listed in the appropriate subcategories.
     * @return Phasing
     */
    org.rcsb.cif.model.generated.Phasing getPhasing();

    /**
     * Data items in the PHASING_AVERAGING category record details
     * about the phasing of the structure where methods involving
     * averaging of multiple observations of the molecule in the
     * asymmetric unit are involved.
     * @return PhasingAveraging
     */
    org.rcsb.cif.model.generated.PhasingAveraging getPhasingAveraging();

    /**
     * Data items in the PHASING_ISOMORPHOUS category record details
     * about the phasing of the structure where a model isomorphous
     * to the structure being phased was used to generate the initial
     * phases.
     * @return PhasingIsomorphous
     */
    org.rcsb.cif.model.generated.PhasingIsomorphous getPhasingIsomorphous();

    /**
     * Data items in the PHASING_MAD category record details about
     * the phasing of the structure where methods involving
     * multiple-wavelength anomalous-dispersion techniques are involved.
     * @return PhasingMAD
     */
    org.rcsb.cif.model.generated.PhasingMAD getPhasingMAD();

    /**
     * Data items in the PHASING_MAD_CLUST category record details
     * about a cluster of experiments that contributed to the
     * generation of a set of phases.
     * @return PhasingMADClust
     */
    org.rcsb.cif.model.generated.PhasingMADClust getPhasingMADClust();

    /**
     * Data items in the PHASING_MAD_EXPT category record details about
     * a MAD phasing experiment, such as the number of experiments that
     * were clustered together to produce a set of phases or the
     * statistics for those phases.
     * @return PhasingMADExpt
     */
    org.rcsb.cif.model.generated.PhasingMADExpt getPhasingMADExpt();

    /**
     * Data items in the PHASING_MAD_RATIO category record
     * the ratios of phasing statistics between pairs of data sets
     * in a MAD phasing experiment, in given shells of resolution.
     * @return PhasingMADRatio
     */
    org.rcsb.cif.model.generated.PhasingMADRatio getPhasingMADRatio();

    /**
     * Data items in the PHASING_MAD_SET category record
     * details about the individual data sets used in a MAD phasing
     * experiment.
     * @return PhasingMADSet
     */
    org.rcsb.cif.model.generated.PhasingMADSet getPhasingMADSet();

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
    org.rcsb.cif.model.generated.PhasingMIR getPhasingMIR();

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
    org.rcsb.cif.model.generated.PhasingMIRDer getPhasingMIRDer();

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
    org.rcsb.cif.model.generated.PhasingMIRDerRefln getPhasingMIRDerRefln();

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
    org.rcsb.cif.model.generated.PhasingMIRDerShell getPhasingMIRDerShell();

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
    org.rcsb.cif.model.generated.PhasingMIRDerSite getPhasingMIRDerSite();

    /**
     * Data items in the PHASING_MIR_SHELL category record statistics
     * for an isomorphous replacement phasing experiment.broken
     * down into shells of resolution.
     * @return PhasingMIRShell
     */
    org.rcsb.cif.model.generated.PhasingMIRShell getPhasingMIRShell();

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
    org.rcsb.cif.model.generated.PhasingSet getPhasingSet();

    /**
     * Data items in the PHASING_SET_REFLN category record the values
     * of the measured structure factors used in a phasing experiment.
     * This list may contain information from a number of different
     * data sets; _phasing_set_refln.set_id indicates the data set
     * to which a given record corresponds.
     * @return PhasingSetRefln
     */
    org.rcsb.cif.model.generated.PhasingSetRefln getPhasingSetRefln();

    /**
     * Data items in the PUBL category are used when submitting a
     * manuscript for publication.
     * @return Publ
     */
    org.rcsb.cif.model.generated.Publ getPubl();

    /**
     * Data items in the PUBL_AUTHOR category record details of
     * the authors of a manuscript submitted for publication.
     * @return PublAuthor
     */
    org.rcsb.cif.model.generated.PublAuthor getPublAuthor();

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
    org.rcsb.cif.model.generated.PublBody getPublBody();

    /**
     * Data items in the PUBL_MANUSCRIPT_INCL category allow
     * the authors of a manuscript submitted for publication to list
     * data names that should be added to the standard request list
     * used by the journal printing software.
     * @return PublManuscriptIncl
     */
    org.rcsb.cif.model.generated.PublManuscriptIncl getPublManuscriptIncl();

    /**
     * Data items in the REFINE category record details about the
     * structure-refinement parameters.
     * @return Refine
     */
    org.rcsb.cif.model.generated.Refine getRefine();

    /**
     * Data items in the REFINE_ANALYZE category record details
     * about the refined structure that are often used to analyze the
     * refinement and assess its quality. A given computer program
     * may or may not produce values corresponding to these data
     * names.
     * @return RefineAnalyze
     */
    org.rcsb.cif.model.generated.RefineAnalyze getRefineAnalyze();

    /**
     * Data items in the REFINE_B_ISO category record details about
     * the treatment of isotropic B factors (displacement parameters)
     * during refinement.
     * @return RefineBIso
     */
    org.rcsb.cif.model.generated.RefineBIso getRefineBIso();

    /**
     * Data items in the REFINE_FUNCT_MINIMIZED category record
     * details about the individual terms of the function minimized
     * during refinement.
     * @return RefineFunctMinimized
     */
    org.rcsb.cif.model.generated.RefineFunctMinimized getRefineFunctMinimized();

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
    org.rcsb.cif.model.generated.RefineHist getRefineHist();

    /**
     * Data items in the REFINE_LS_RESTR category record details about
     * the restraints applied to various classes of parameters during
     * the least-squares refinement.
     * @return RefineLsRestr
     */
    org.rcsb.cif.model.generated.RefineLsRestr getRefineLsRestr();

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
    org.rcsb.cif.model.generated.RefineLsRestrNcs getRefineLsRestrNcs();

    /**
     * Data items in the REFINE_LS_RESTR_TYPE category record details
     * about the restraint types used in the least-squares refinement.
     * @return RefineLsRestrType
     */
    org.rcsb.cif.model.generated.RefineLsRestrType getRefineLsRestrType();

    /**
     * Data items in the REFINE_LS_SHELL category record details about
     * the results of the least-squares refinement broken down into
     * shells of resolution.
     * @return RefineLsShell
     */
    org.rcsb.cif.model.generated.RefineLsShell getRefineLsShell();

    /**
     * Data items in the REFINE_OCCUPANCY category record details
     * about the treatment of atom occupancies during refinement.
     * @return RefineOccupancy
     */
    org.rcsb.cif.model.generated.RefineOccupancy getRefineOccupancy();

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
    org.rcsb.cif.model.generated.Refln getRefln();

    /**
     * Data items in the REFLN_SYS_ABS category record details about
     * the reflection data that should be systematically absent,
     * given the designated space group.
     * @return ReflnSysAbs
     */
    org.rcsb.cif.model.generated.ReflnSysAbs getReflnSysAbs();

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
    org.rcsb.cif.model.generated.Reflns getReflns();

    /**
     * Data items in the REFLNS_SCALE category record details about
     * the structure-factor scales. They are referenced from within
     * the REFLN list through _refln.scale_group_code.
     * @return ReflnsScale
     */
    org.rcsb.cif.model.generated.ReflnsScale getReflnsScale();

    /**
     * Data items in the REFLNS_SHELL category record details about
     * the reflection data used to determine the ATOM_SITE data items
     * broken down into shells of resolution.
     * @return ReflnsShell
     */
    org.rcsb.cif.model.generated.ReflnsShell getReflnsShell();

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
    org.rcsb.cif.model.generated.Software getSoftware();

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    org.rcsb.cif.model.generated.Struct getStruct();

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    org.rcsb.cif.model.generated.StructAsym getStructAsym();

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
    org.rcsb.cif.model.generated.StructBiol getStructBiol();

    /**
     * Data items in the STRUCT_BIOL_GEN category record details about
     * the generation of each biological unit. The STRUCT_BIOL_GEN
     * data items provide the specifications of the components that
     * constitute that biological unit, which may include symmetry
     * elements.
     * @return StructBiolGen
     */
    org.rcsb.cif.model.generated.StructBiolGen getStructBiolGen();

    /**
     * Data items in the STRUCT_BIOL_KEYWORDS category record
     * keywords that describe each biological unit.
     * @return StructBiolKeywords
     */
    org.rcsb.cif.model.generated.StructBiolKeywords getStructBiolKeywords();

    /**
     * Data items in the STRUCT_BIOL_VIEW category record details
     * about how to draw and annotate an informative view of the
     * biological structure.
     * @return StructBiolView
     */
    org.rcsb.cif.model.generated.StructBiolView getStructBiolView();

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     *
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    org.rcsb.cif.model.generated.StructConf getStructConf();

    /**
     * Data items in the STRUCT_CONF_TYPE category record details
     * about the criteria used to identify backbone conformations of a
     * segment of polymer.
     * @return StructConfType
     */
    org.rcsb.cif.model.generated.StructConfType getStructConfType();

    /**
     * Data items in the STRUCT_CONN category record details about
     * the connections between portions of the structure. These can be
     * hydrogen bonds, salt bridges, disulfide bridges and so on.
     *
     * The STRUCT_CONN_TYPE records define the criteria used to
     * identify these connections.
     * @return StructConn
     */
    org.rcsb.cif.model.generated.StructConn getStructConn();

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    org.rcsb.cif.model.generated.StructConnType getStructConnType();

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    org.rcsb.cif.model.generated.StructKeywords getStructKeywords();

    /**
     * Data items in the STRUCT_MON_DETAILS category record details
     * about specifics of calculations summarized in data items in the
     * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
     * include the coefficients used in map calculations,
     * the radii used for including points in a calculation and so on.
     * @return StructMonDetails
     */
    org.rcsb.cif.model.generated.StructMonDetails getStructMonDetails();

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
    org.rcsb.cif.model.generated.StructMonNucl getStructMonNucl();

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
    org.rcsb.cif.model.generated.StructMonProt getStructMonProt();

    /**
     * Data items in the STRUCT_MON_PROT_CIS category identify
     * monomers that have been found to have the peptide bond in the cis
     * conformation. The criterion used to select residues to be
     * designated as containing cis peptide bonds is given in
     * _struct_mon_details.prot_cis.
     * @return StructMonProtCis
     */
    org.rcsb.cif.model.generated.StructMonProtCis getStructMonProtCis();

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
    org.rcsb.cif.model.generated.StructNcsDom getStructNcsDom();

    /**
     * Data items in the STRUCT_NCS_DOM_LIM category identify the
     * start and end points of polypeptide chain segments
     * that form all or part of a domain in an ensemble of domains
     * related by noncrystallographic symmetry.
     * @return StructNcsDomLim
     */
    org.rcsb.cif.model.generated.StructNcsDomLim getStructNcsDomLim();

    /**
     * Data items in the STRUCT_NCS_ENS category record information
     * about ensembles of domains related by noncrystallographic
     * symmetry. The point group of the ensemble when taken as a
     * whole may be specified, as well as any special aspects of the
     * ensemble that require description.
     * @return StructNcsEns
     */
    org.rcsb.cif.model.generated.StructNcsEns getStructNcsEns();

    /**
     * Data items in the STRUCT_NCS_ENS_GEN category list domains
     * related by a noncrystallographic symmetry operation and
     * identify the operator.
     * @return StructNcsEnsGen
     */
    org.rcsb.cif.model.generated.StructNcsEnsGen getStructNcsEnsGen();

    /**
     * Data items in the STRUCT_NCS_OPER category describe the
     * noncrystallographic symmetry operations.
     *
     * Each operator is specified as a matrix and a subsequent
     * translation vector. Operators need not represent proper
     * rotations.
     * @return StructNcsOper
     */
    org.rcsb.cif.model.generated.StructNcsOper getStructNcsOper();

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
    org.rcsb.cif.model.generated.StructRef getStructRef();

    /**
     * Data items in the STRUCT_REF_SEQ category provide a mechanism
     * for indicating and annotating a region (or regions) of alignment
     * between the sequence of an entity or biological unit described
     * in the data block and the sequence in the referenced database
     * entry.
     * @return StructRefSeq
     */
    org.rcsb.cif.model.generated.StructRefSeq getStructRefSeq();

    /**
     * Data items in the STRUCT_REF_SEQ_DIF category provide a
     * mechanism for indicating and annotating point differences
     * between the sequence of the entity or biological unit described
     * in the data block and the sequence of the referenced database
     * entry.
     * @return StructRefSeqDif
     */
    org.rcsb.cif.model.generated.StructRefSeqDif getStructRefSeqDif();

    /**
     * Data items in the STRUCT_SHEET category record details about
     * the beta-sheets.
     * @return StructSheet
     */
    org.rcsb.cif.model.generated.StructSheet getStructSheet();

    /**
     * Data items in the STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta-
     * sheet. It is necessary to treat hydrogen bonding independently
     * of the designation of ranges, because the hydrogen bonding may
     * begin in different places for the interactions of a given strand
     * with the one preceding it and the one following it in the sheet.
     * @return StructSheetHbond
     */
    org.rcsb.cif.model.generated.StructSheetHbond getStructSheetHbond();

    /**
     * Data items in the STRUCT_SHEET_ORDER category record details
     * about the order of the residue ranges that form a beta-sheet.
     * All order links are pairwise and the specified pairs are
     * assumed to be adjacent to one another in the sheet. These data
     * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
     * items and they allow all manner of sheets to be described.
     * @return StructSheetOrder
     */
    org.rcsb.cif.model.generated.StructSheetOrder getStructSheetOrder();

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    org.rcsb.cif.model.generated.StructSheetRange getStructSheetRange();

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
    org.rcsb.cif.model.generated.StructSheetTopology getStructSheetTopology();

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    org.rcsb.cif.model.generated.StructSite getStructSite();

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    org.rcsb.cif.model.generated.StructSiteGen getStructSiteGen();

    /**
     * Data items in the STRUCT_SITE_KEYWORDS category record
     * keywords describing the site.
     * @return StructSiteKeywords
     */
    org.rcsb.cif.model.generated.StructSiteKeywords getStructSiteKeywords();

    /**
     * Data items in the STRUCT_SITE_VIEW category record details
     * about how to draw and annotate an informative view of the
     * site.
     * @return StructSiteView
     */
    org.rcsb.cif.model.generated.StructSiteView getStructSiteView();

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    org.rcsb.cif.model.generated.Symmetry getSymmetry();

    /**
     * Data items in the SYMMETRY_EQUIV category list the
     * symmetry-equivalent positions for the space group.
     * @return SymmetryEquiv
     */
    org.rcsb.cif.model.generated.SymmetryEquiv getSymmetryEquiv();

    /**
     * Data items in the AUDIT_LINK category record details about the
     * relationships between data blocks in the current CIF.
     * @return AuditLink
     */
    org.rcsb.cif.model.generated.AuditLink getAuditLink();

    /**
     * Data items in the DIFFRN_REFLNS_CLASS category record details
     * about the classes of reflections measured in the diffraction
     * experiment.
     * @return DiffrnReflnsClass
     */
    org.rcsb.cif.model.generated.DiffrnReflnsClass getDiffrnReflnsClass();

    /**
     * Data items in the REFINE_LS_CLASS category record details
     * about the reflections used for the structure refinement
     * for each reflection class separately.
     * @return RefineLsClass
     */
    org.rcsb.cif.model.generated.RefineLsClass getRefineLsClass();

    /**
     * Data items in the REFLNS_CLASS category record details
     * of the reflections used to determine the structural
     * parameters for each reflection class.
     * @return ReflnsClass
     */
    org.rcsb.cif.model.generated.ReflnsClass getReflnsClass();

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
    org.rcsb.cif.model.generated.SpaceGroup getSpaceGroup();

    /**
     * Contains information about the symmetry operations of the
     * space group.
     * @return SpaceGroupSymop
     */
    org.rcsb.cif.model.generated.SpaceGroupSymop getSpaceGroupSymop();

    /**
     * Data items in the VALENCE_PARAM category define the
     * parameters used for calculating bond valences from bond
     * lengths.  In addition to the parameters, a pointer
     * is given to the reference (in VALENCE_REF) from which
     * the bond-valence parameters were taken.
     * @return ValenceParam
     */
    org.rcsb.cif.model.generated.ValenceParam getValenceParam();

    /**
     * Data items in the VALENCE_REF category list the references
     * from which the bond-valence parameters have been taken.
     * @return ValenceRef
     */
    org.rcsb.cif.model.generated.ValenceRef getValenceRef();

    /**
     * The PDBX_AUDIT holds current version information.
     * @return PdbxAudit
     */
    org.rcsb.cif.model.generated.PdbxAudit getPdbxAudit();

    /**
     * Data items in the PDBX_VERSION category record details about the
     * version of this entry.
     * @return PdbxVersion
     */
    org.rcsb.cif.model.generated.PdbxVersion getPdbxVersion();

    /**
     * Data items in the PDBX_AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return PdbxAuditAuthor
     */
    org.rcsb.cif.model.generated.PdbxAuditAuthor getPdbxAuditAuthor();

    /**
     * The PDBX_DATABASE_MESSAGE category provides information about
     * correspondance related to a structure deposition.
     * @return PdbxDatabaseMessage
     */
    org.rcsb.cif.model.generated.PdbxDatabaseMessage getPdbxDatabaseMessage();

    /**
     * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
     * for information on obsolete/superseded PDB entries
     * @return PdbxDatabasePDBObsSpr
     */
    org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr();

    /**
     * Internal records to track the data processing cycle.
     * @return PdbxDatabaseProc
     */
    org.rcsb.cif.model.generated.PdbxDatabaseProc getPdbxDatabaseProc();

    /**
     *
     * Data items in the PDBX_DATABASE_REMARK category record keep additional
     * information about the entry.  They are mostly used to create
     * 'non-standard' PDB REMARK annotations (6-99).
     * @return PdbxDatabaseRemark
     */
    org.rcsb.cif.model.generated.PdbxDatabaseRemark getPdbxDatabaseRemark();

    /**
     * These are internal RCSB records to keep track of data processing
     * and status of the entry.
     * @return PdbxDatabaseStatus
     */
    org.rcsb.cif.model.generated.PdbxDatabaseStatus getPdbxDatabaseStatus();

    /**
     * The PDBX_ENTITY_NAME records additional name information for
     * each entity.
     * @return PdbxEntityName
     */
    org.rcsb.cif.model.generated.PdbxEntityName getPdbxEntityName();

    /**
     * This category provides a placeholder for pre-release
     * sequence information.  After release this category
     * should be discarded.
     * @return PdbxPrereleaseSeq
     */
    org.rcsb.cif.model.generated.PdbxPrereleaseSeq getPdbxPrereleaseSeq();

    /**
     * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
     * mapping for polymer entities.
     * @return PdbxPolySeqScheme
     */
    org.rcsb.cif.model.generated.PdbxPolySeqScheme getPdbxPolySeqScheme();

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    org.rcsb.cif.model.generated.PdbxNonpolyScheme getPdbxNonpolyScheme();

    /**
     * Data items in the PDBX_REFINE category record details about
     * additional structure refinement parameters which are needed
     * to complete legacy REMARK 3 refinement templates in PDB
     * format files.
     * @return PdbxRefine
     */
    org.rcsb.cif.model.generated.PdbxRefine getPdbxRefine();

    /**
     * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta sheet.
     * This category is provided for cases where only a single hydrogen
     * bond is used to register the two residue ranges.   Category
     * STRUCT_SHEET_HBOND should be used when the initial and terminal
     * hydrogen bonds for strand pair are known.
     * @return PdbxStructSheetHbond
     */
    org.rcsb.cif.model.generated.PdbxStructSheetHbond getPdbxStructSheetHbond();

    /**
     *
     * Parameter and topology files used in X-PLOR/CNS refinement.
     * @return PdbxXplorFile
     */
    org.rcsb.cif.model.generated.PdbxXplorFile getPdbxXplorFile();

    /**
     *
     * Auxilary parameter and topology files used in refinement.
     * @return PdbxRefineAuxFile
     */
    org.rcsb.cif.model.generated.PdbxRefineAuxFile getPdbxRefineAuxFile();

    /**
     * Data items in PDBX_DATABASE_RELATED contain references to entries
     * that are related to the this entry.
     * @return PdbxDatabaseRelated
     */
    org.rcsb.cif.model.generated.PdbxDatabaseRelated getPdbxDatabaseRelated();

    /**
     * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
     * of the biological assembly studied in terms of its constituent
     * entities.
     * @return PdbxEntityAssembly
     */
    org.rcsb.cif.model.generated.PdbxEntityAssembly getPdbxEntityAssembly();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
     * details about the components of the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowComp
     */
    org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
     * details about the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowSol
     */
    org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
     * record details cryogenic treatments applied to this crystal.
     * @return PdbxExptlCrystalCryoTreatment
     */
    org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment();

    /**
     * Data items in the REFINE_TLS category record details about
     * TLS parameters used in structure refinement. Note that the
     * intention is primarily to describe directly refined TLS
     * parameters, although other methods of obtaining TLS parameters
     * may be covered, see item _pdbx_refine_tls.method
     * @return PdbxRefineTls
     */
    org.rcsb.cif.model.generated.PdbxRefineTls getPdbxRefineTls();

    /**
     * Data items in the PDBX_REFINE_TLS_GROUP category record details about
     * a fragment of a TLS group.
     *
     * Properties of the TLS group are recorded in PDBX_REFINE_TLS
     * @return PdbxRefineTlsGroup
     */
    org.rcsb.cif.model.generated.PdbxRefineTlsGroup getPdbxRefineTlsGroup();

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the contents of this data block.  This category atomizes
     * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
     * category.
     * @return PdbxContactAuthor
     */
    org.rcsb.cif.model.generated.PdbxContactAuthor getPdbxContactAuthor();

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the Structural Genomics Project and name and initials
     * for each Center.
     * @return PdbxSGProject
     */
    org.rcsb.cif.model.generated.PdbxSGProject getPdbxSGProject();

    /**
     * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
     * about the TLS contribution to anisotropic displacement parameters.
     * @return PdbxAtomSiteAnisoTls
     */
    org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls();

    /**
     *
     * Experimental details of the NMR study that have not been
     * described elsewhere in this deposition.
     * @return PdbxNmrDetails
     */
    org.rcsb.cif.model.generated.PdbxNmrDetails getPdbxNmrDetails();

    /**
     *
     * Complete description of each NMR sample, including the solvent
     * system used.
     * @return PdbxNmrSampleDetails
     */
    org.rcsb.cif.model.generated.PdbxNmrSampleDetails getPdbxNmrSampleDetails();

    /**
     * The chemical constituents of
     * each NMR sample. Each sample is identified by a number and
     * each component in the sample is identified by name.
     * @return PdbxNmrExptlSample
     */
    org.rcsb.cif.model.generated.PdbxNmrExptlSample getPdbxNmrExptlSample();

    /**
     *
     * The experimental conditions used to for each sample.  Each set of conditions
     * is identified by a numerical code.
     * @return PdbxNmrExptlSampleConditions
     */
    org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions();

    /**
     *
     * The details about each spectrometer used to collect data for this
     * deposition.
     * @return PdbxNmrSpectrometer
     */
    org.rcsb.cif.model.generated.PdbxNmrSpectrometer getPdbxNmrSpectrometer();

    /**
     *
     * In this section, enter information on those experiments that were
     * used to generate constraint data. For each NMR experiment indicate
     * which sample and which sample conditions were used for the experiment.
     * @return PdbxNmrExptl
     */
    org.rcsb.cif.model.generated.PdbxNmrExptl getPdbxNmrExptl();

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return PdbxNmrSoftware
     */
    org.rcsb.cif.model.generated.PdbxNmrSoftware getPdbxNmrSoftware();

    /**
     * This section provides a tabulation of constraint data.
     * @return PdbxNmrConstraints
     */
    org.rcsb.cif.model.generated.PdbxNmrConstraints getPdbxNmrConstraints();

    /**
     * This category contains the information that describes the
     * ensemble of deposited structures. If only an average structure
     * has been deposited skip this section.
     * @return PdbxNmrEnsemble
     */
    org.rcsb.cif.model.generated.PdbxNmrEnsemble getPdbxNmrEnsemble();

    /**
     * Structural statistics are derived from molecular dynamics and simulated annealing
     * programs.
     * @return PdbxNmrEnsembleRms
     */
    org.rcsb.cif.model.generated.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms();

    /**
     * An average structure is often calculated in addition to the ensemble, or one
     * of the ensemble is selected as a representative structure. This section
     * describes selection of the representative structure.
     * @return PdbxNmrRepresentative
     */
    org.rcsb.cif.model.generated.PdbxNmrRepresentative getPdbxNmrRepresentative();

    /**
     *
     * Describe the method and details of the refinement of the deposited structure.
     * @return PdbxNmrRefine
     */
    org.rcsb.cif.model.generated.PdbxNmrRefine getPdbxNmrRefine();

    /**
     *
     * The final force constants, including units, employed for the various
     * experimental constraints, covalent geometry constraints, and the non-bonded
     * interaction terms in the target function used for simulated annealing.
     * @return PdbxNmrForceConstants
     */
    org.rcsb.cif.model.generated.PdbxNmrForceConstants getPdbxNmrForceConstants();

    /**
     * Data items in the NDB_STRUCT_CONF_NA category
     * describes secondary structure features in this entry.
     * @return NdbStructConfNa
     */
    org.rcsb.cif.model.generated.NdbStructConfNa getNdbStructConfNa();

    /**
     * Data items in the NDB_STRUCT_FEATURE_NA category
     * describes tertiary and other special structural
     * features in this entry.
     * @return NdbStructFeatureNa
     */
    org.rcsb.cif.model.generated.NdbStructFeatureNa getNdbStructFeatureNa();

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
     * of base pairing interactions.
     * @return NdbStructNaBasePair
     */
    org.rcsb.cif.model.generated.NdbStructNaBasePair getNdbStructNaBasePair();

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
     * of base pair step interactions.
     * @return NdbStructNaBasePairStep
     */
    org.rcsb.cif.model.generated.NdbStructNaBasePairStep getNdbStructNaBasePairStep();

    /**
     * Placeholder category for PDB coordinate data.
     * @return NdbOriginalNdbCoordinates
     */
    org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates();

    /**

     * @return PdbxEntityNonpoly
     */
    org.rcsb.cif.model.generated.PdbxEntityNonpoly getPdbxEntityNonpoly();

    /**
     * Data items in the PDBX_PHASING_DM category record details about
     * density modification
     * @return PdbxPhasingDm
     */
    org.rcsb.cif.model.generated.PdbxPhasingDm getPdbxPhasingDm();

    /**
     * Data items in the PDBX_PHASING_DM_SHELL category record details about
     * density modification in resolution shell.
     * @return PdbxPhasingDmShell
     */
    org.rcsb.cif.model.generated.PdbxPhasingDmShell getPdbxPhasingDmShell();

    /**
     * Data items in the PDBX_PHASING_MAD_SHELL category record details about
     * the phasing of the structure, when methods involving multiple
     * anomalous dispersion techniques are involved (note: the
     * values are overall, but broken down into shells of resolution)
     * @return PdbxPhasingMADShell
     */
    org.rcsb.cif.model.generated.PdbxPhasingMADShell getPdbxPhasingMADShell();

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
    org.rcsb.cif.model.generated.PdbxPhasingMADSet getPdbxPhasingMADSet();

    /**
     * The same as category pdbx_phasing_MAD_set, but
     * broken into shells.
     * @return PdbxPhasingMADSetShell
     */
    org.rcsb.cif.model.generated.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell();

    /**
     * record the details (coordinates etc.) of anomalous scatters.
     * @return PdbxPhasingMADSetSite
     */
    org.rcsb.cif.model.generated.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite();

    /**
     * Data items in the PDBX_PHASING_MR category record details about
     * molecular replacement.
     * @return PdbxPhasingMR
     */
    org.rcsb.cif.model.generated.PdbxPhasingMR getPdbxPhasingMR();

    /**
     * Data items in the PDBX_REFINE_COMPONENT category record
     * statistics of the final model relative to the density map.
     * @return PdbxRefineComponent
     */
    org.rcsb.cif.model.generated.PdbxRefineComponent getPdbxRefineComponent();

    /**
     * This category contains descriptive protocols for the production
     * of this entity.
     * @return PdbxEntityProdProtocol
     */
    org.rcsb.cif.model.generated.PdbxEntityProdProtocol getPdbxEntityProdProtocol();

    /**
     * This category contains details for process steps that are
     * not explicitly catered for elsewhere. It provides some basic
     * details as well as placeholders for a list of parameters and
     * values (the category PDBX_ENTITY_SRC_GEN_PROD_OTHER_PARAMETER).
     * Note that processes that have been modelled explicitly should
     * not be represented using this category.
     * @return PdbxEntitySrcGenProdOther
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther();

    /**
     * This category contains parameters and values required to capture
     * information about a particular process step
     * @return PdbxEntitySrcGenProdOtherParameter
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter();

    /**
     * This category contains details for the PCR steps used in
     * the overall protein production process. The PCR is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdPcr
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr();

    /**
     * This category contains details for the DIGEST steps used in
     * the overall protein production process. The digestion is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdDigest
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest();

    /**
     * This category contains details for the cloning steps used in
     * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
     * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
     * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
     * provided data in the later two categories may be omitted.
     * @return PdbxEntitySrcGenClone
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone();

    /**
     * This category contains details for the ligation-based cloning steps used in
     * the overall protein production process.
     * _pdbx_entity_src_gen_clone_ligation.clone_step_id in this category
     * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
     * to cover ligation dependent cloning steps.
     * @return PdbxEntitySrcGenCloneLigation
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation();

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
    org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination();

    /**
     * This category contains details for the EXPRESSION steps used in
     * the overall protein production process. It is hoped that this category
     * will cover all forms of cell-based expression by reading induction as
     * induction/transformation/transfection.
     * @return PdbxEntitySrcGenExpress
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress();

    /**
     * This category contains details for OD time series used to monitor a
     * given EXPRESSION step used in the overall protein production process.
     * @return PdbxEntitySrcGenExpressTimepoint
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint();

    /**
     * This category contains details for the cell lysis steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenLysis
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis();

    /**
     * This category contains details for the refolding steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenRefold
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold();

    /**
     * This category contains details for the protein purification
     * tag removal steps used in the overall protein production process
     * @return PdbxEntitySrcGenProteolysis
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis();

    /**
     * This category contains details for the chromatographic steps used in the
     * purification of the protein.
     * @return PdbxEntitySrcGenChrom
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom();

    /**
     * This category contains details for the fraction steps used in
     * the overall protein production process. Examples of fractionation
     * steps are centrifugation and magnetic bead pull-down purification.
     * @return PdbxEntitySrcGenFract
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract();

    /**
     * This category contains details for the final purified protein product. Note
     * that this category does not contain the amino acid sequence of the protein.
     * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
     * entity_id.
     * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
     * no step_id for this category.
     * @return PdbxEntitySrcGenPure
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure();

    /**
     * This category contains details of protein characterisation. It
     * refers to the characteristion of the product of a specific
     * step.
     * @return PdbxEntitySrcGenCharacter
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter();

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
    org.rcsb.cif.model.generated.PdbxConstruct getPdbxConstruct();

    /**
     * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
     * specify various properties of a nucleic acid sequence used during
     * protein production.
     * @return PdbxConstructFeature
     */
    org.rcsb.cif.model.generated.PdbxConstructFeature getPdbxConstructFeature();

    /**
     * The details about each robotic system used to collect data for this
     * project.
     * @return PdbxRobotSystem
     */
    org.rcsb.cif.model.generated.PdbxRobotSystem getPdbxRobotSystem();

    /**
     * Data items in the PDBX_BUFFER category
     * record details of the sample buffer.
     * @return PdbxBuffer
     */
    org.rcsb.cif.model.generated.PdbxBuffer getPdbxBuffer();

    /**
     * Constituents of buffer in sample
     * @return PdbxBufferComponents
     */
    org.rcsb.cif.model.generated.PdbxBufferComponents getPdbxBufferComponents();

    /**
     * Data items in the PDBX_DOMAIN category record information
     * about domain definitions.
     *
     * A domain need not correspond to a completely polypeptide chain;
     * it can be composed of one or more segments in a single chain,
     * or by segments from more than one chain.
     * @return PdbxDomain
     */
    org.rcsb.cif.model.generated.PdbxDomain getPdbxDomain();

    /**
     * Data items in the PDBX_DOMAIN_RANGE category identify the
     * beginning and ending points of polypeptide chain segments
     * that form all or part of a domain.
     * @return PdbxDomainRange
     */
    org.rcsb.cif.model.generated.PdbxDomainRange getPdbxDomainRange();

    /**
     * Data items in the PDBX_SEQUENCE_RANGE category identify the
     * beginning and ending points of polypeptide sequence segments.
     * @return PdbxSequenceRange
     */
    org.rcsb.cif.model.generated.PdbxSequenceRange getPdbxSequenceRange();

    /**
     * Data items in the PDBX_FEATURE_ENTRY category records
     * information about properties pertaining to this
     * structure entry.
     * @return PdbxFeatureEntry
     */
    org.rcsb.cif.model.generated.PdbxFeatureEntry getPdbxFeatureEntry();

    /**
     * Data items in the PDBX_FEATURE_DOMAIN category records
     * information about properties pertaining to this structure
     * domain.
     * @return PdbxFeatureDomain
     */
    org.rcsb.cif.model.generated.PdbxFeatureDomain getPdbxFeatureDomain();

    /**
     * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category
     * records information about properties pertaining to
     * this structure sequence_range.
     * @return PdbxFeatureSequenceRange
     */
    org.rcsb.cif.model.generated.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange();

    /**
     * Data items in the PDBX_FEATURE_ASSEMBLY category records
     * information about properties pertaining to this
     * structural assembly.
     * @return PdbxFeatureAssembly
     */
    org.rcsb.cif.model.generated.PdbxFeatureAssembly getPdbxFeatureAssembly();

    /**
     * Data items in the PDBX_FEATURE_MONOMER category records
     * information about properties pertaining to particular
     * monomers in this structure.
     * @return PdbxFeatureMonomer
     */
    org.rcsb.cif.model.generated.PdbxFeatureMonomer getPdbxFeatureMonomer();

    /**
     * Data items in the pdbx_exptl_pd record information about
     * powder sample preparations.
     * @return PdbxExptlPd
     */
    org.rcsb.cif.model.generated.PdbxExptlPd getPdbxExptlPd();

    /**
     * Details decribing crystallographic twinning.
     * @return PdbxReflnsTwin
     */
    org.rcsb.cif.model.generated.PdbxReflnsTwin getPdbxReflnsTwin();

    /**
     * Special features of this structural entry.
     * @return PdbxStructInfo
     */
    org.rcsb.cif.model.generated.PdbxStructInfo getPdbxStructInfo();

    /**
     * Describes the origin of the experimental data used in this
     * entry.
     * @return PdbxReRefinement
     */
    org.rcsb.cif.model.generated.PdbxReRefinement getPdbxReRefinement();

    /**
     * Properties and features of structural assemblies.
     * @return PdbxStructAssemblyProp
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyProp getPdbxStructAssemblyProp();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
     * mechanism for identifying and annotating sequence features.
     * @return PdbxStructRefSeqFeature
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature();

    /**
     *
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
     * mechanism for identifying and annotating properties of sequence features.
     * @return PdbxStructRefSeqFeatureProp
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp();

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
     * structural diagnostics in chemical components instances.
     * @return PdbxStructChemCompDiagnostics
     */
    org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompFeature
     */
    org.rcsb.cif.model.generated.PdbxChemCompFeature getPdbxChemCompFeature();

    /**
     * The details of the composition of the coordinate model.
     * @return PdbxCoordinateModel
     */
    org.rcsb.cif.model.generated.PdbxCoordinateModel getPdbxCoordinateModel();

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_FEATURE category provides
     * structural annotations in chemical components instances.
     * @return PdbxStructChemCompFeature
     */
    org.rcsb.cif.model.generated.PdbxStructChemCompFeature getPdbxStructChemCompFeature();

    /**
     * Data items in the DIFFRN_REFLNS_SHELL category record details about
     * the reflection data set within shells of resolution.
     * @return PdbxDiffrnReflnsShell
     */
    org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell();

    /**
     * This category provides a table of upper and lower distance
     * limits used as criteria in determining covalent bonds.
     * The table is organized by atom type pairs.
     * @return PdbxBondDistanceLimits
     */
    org.rcsb.cif.model.generated.PdbxBondDistanceLimits getPdbxBondDistanceLimits();

    /**
     * Data items in the PDBX_SOLN_SCATTER category record details about a
     * solution scattering experiment
     * @return PdbxSolnScatter
     */
    org.rcsb.cif.model.generated.PdbxSolnScatter getPdbxSolnScatter();

    /**
     * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
     * homology model fitting to the solution scatter data.
     * @return PdbxSolnScatterModel
     */
    org.rcsb.cif.model.generated.PdbxSolnScatterModel getPdbxSolnScatterModel();

    /**
     * Data items in the CHEM_COMP_DESCRIPTOR category provide
     * string descriptors of component chemical structure.
     * @return PdbxChemCompDescriptor
     */
    org.rcsb.cif.model.generated.PdbxChemCompDescriptor getPdbxChemCompDescriptor();

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    org.rcsb.cif.model.generated.PdbxChemCompIdentifier getPdbxChemCompIdentifier();

    /**
     * Data items in the PDBX_CHEM_COMP_IMPORT category identify
     * existing chemical components to be imported into the
     * current component definition.  Components in this list
     * can be edited by instructions in categories
     * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
     * @return PdbxChemCompImport
     */
    org.rcsb.cif.model.generated.PdbxChemCompImport getPdbxChemCompImport();

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
     * atom level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompAtomEdit
     */
    org.rcsb.cif.model.generated.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit();

    /**
     * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
     * bond level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompBondEdit
     */
    org.rcsb.cif.model.generated.PdbxChemCompBondEdit getPdbxChemCompBondEdit();

    /**
     * Data items in the PDBX_CHEM_COMP_AUDIT category records
     * the status and tracking information for this component.
     * @return PdbxChemCompAudit
     */
    org.rcsb.cif.model.generated.PdbxChemCompAudit getPdbxChemCompAudit();

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
    org.rcsb.cif.model.generated.PdbxValidateCloseContact getPdbxValidateCloseContact();

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
    org.rcsb.cif.model.generated.PdbxValidateSymmContact getPdbxValidateSymmContact();

    /**
     * Data items in the PDBX_VALIDATE_RMSD_BOND category list the
     * covalent bonds that have values which deviate from expected
     * values by more than 6*rmsd.
     * @return PdbxValidateRmsdBond
     */
    org.rcsb.cif.model.generated.PdbxValidateRmsdBond getPdbxValidateRmsdBond();

    /**
     * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
     * the covalent bond angles found in an entry that have
     * values which deviate from expected values by more
     * than 6*rmsd for the particular entry from the expected standard
     * value
     * @return PdbxValidateRmsdAngle
     */
    org.rcsb.cif.model.generated.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle();

    /**
     * Data items in the PDBX_VALIDATE_TORSION category list the
     * residues with torsion angles outside the expected ramachandran regions
     * @return PdbxValidateTorsion
     */
    org.rcsb.cif.model.generated.PdbxValidateTorsion getPdbxValidateTorsion();

    /**
     * Data items in the PDBX_VALIDATE_PEPTIDE_OMEGA category list the
     * residues that contain peptide bonds deviate
     * significantly from both cis and trans conformation.
     * cis bonds, if any, are listed on cispep records.
     * trans is defined as 180 +/- 30 and
     * cis is defined as 0 +/- 30 degrees.
     * @return PdbxValidatePeptideOmega
     */
    org.rcsb.cif.model.generated.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega();

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
    org.rcsb.cif.model.generated.PdbxValidateChiral getPdbxValidateChiral();

    /**
     * Data items in the PDBX_VALIDATE_PLANES category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanes
     */
    org.rcsb.cif.model.generated.PdbxValidatePlanes getPdbxValidatePlanes();

    /**
     * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanesAtom
     */
    org.rcsb.cif.model.generated.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom();

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
    org.rcsb.cif.model.generated.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane();

    /**
     * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
     * in connections between portions of the structure.
     * @return PdbxStructConnAngle
     */
    org.rcsb.cif.model.generated.PdbxStructConnAngle getPdbxStructConnAngle();

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_RESIDUES category list the
     * residues within the entry that are not observed or have zero occupancy.
     * @return PdbxUnobsOrZeroOccResidues
     */
    org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues();

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
     * atoms within the entry that are either unobserved or have zero occupancy/
     * @return PdbxUnobsOrZeroOccAtoms
     */
    org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms();

    /**
     * Data items in the PDBX_ENTRY_DETAILS category provide additional
     * details about this entry.
     * @return PdbxEntryDetails
     */
    org.rcsb.cif.model.generated.PdbxEntryDetails getPdbxEntryDetails();

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    org.rcsb.cif.model.generated.PdbxStructModResidue getPdbxStructModResidue();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate insertions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqInsertion
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate deletions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqDeletion
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion();

    /**
     * Data items in the PDBX_REMEDIATION_ATOM_SITE_MAPPING category records
     * mapping information between selected molecular entities that have been
     * chemically redefined.   The prior and current atom nomenclature is
     * tabulated in this category.
     * @return PdbxRemediationAtomSiteMapping
     */
    org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping();

    /**
     * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
     * polymer linkages within the entry that are outside of typlical
     * covalent distances.
     * @return PdbxValidatePolymerLinkage
     */
    org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage();

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
     * helical symmetry group associated with this entry.
     * @return PdbxHelicalSymmetry
     */
    org.rcsb.cif.model.generated.PdbxHelicalSymmetry getPdbxHelicalSymmetry();

    /**
     * Data items in the PDBX_POINT_SYMMETRY category record details about the
     * point symmetry group associated with this entry.
     * @return PdbxPointSymmetry
     */
    org.rcsb.cif.model.generated.PdbxPointSymmetry getPdbxPointSymmetry();

    /**
     * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
     * structural elements in the deposited entry.  The entity instance is a method
     * neutral identifier for the observed molecular entities in the deposited coordinate
     * set.
     * @return PdbxStructEntityInst
     */
    org.rcsb.cif.model.generated.PdbxStructEntityInst getPdbxStructEntityInst();

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    org.rcsb.cif.model.generated.PdbxStructOperList getPdbxStructOperList();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    org.rcsb.cif.model.generated.PdbxStructAssembly getPdbxStructAssembly();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyGen getPdbxStructAssemblyGen();

    /**
     * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
     * the generation of the crystallographic asymmetric unit. The
     * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
     * components that constitute the asymmetric unit in terms of cartesian
     * transformations of deposited coordinates.
     * @return PdbxStructAsymGen
     */
    org.rcsb.cif.model.generated.PdbxStructAsymGen getPdbxStructAsymGen();

    /**
     * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
     * the generation of the minimal asymmetric unit. For instance, this
     * category can be used to provide this information for helical and point
     * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the
     * specifications of the components that constitute the asymmetric unit
     * in terms of cartesian transformations of deposited coordinates.
     * @return PdbxStructMsymGen
     */
    org.rcsb.cif.model.generated.PdbxStructMsymGen getPdbxStructMsymGen();

    /**
     * Data items in the PDBX_STRUCT_LEGACY_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     *
     * This category provides a container for matrices used to construct
     * icosahedral assemblies in legacy entries.
     * @return PdbxStructLegacyOperList
     */
    org.rcsb.cif.model.generated.PdbxStructLegacyOperList getPdbxStructLegacyOperList();

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_FEATURE category provide
     * a selected list of atom level features for the chemical component.
     * @return PdbxChemCompAtomFeature
     */
    org.rcsb.cif.model.generated.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
     * entity families.
     * @return PdbxReferenceMoleculeFamily
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMoleculeList
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMolecule
     */
    org.rcsb.cif.model.generated.PdbxReferenceMolecule getPdbxReferenceMolecule();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityList getPdbxReferenceEntityList();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_NONPOLY category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityNonpoly
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityLink getPdbxReferenceEntityLink();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY category record details about
     * the polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return PdbxReferenceEntityPoly
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer.
     * @return PdbxReferenceEntityPolySeq
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq();

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceEntitySequence
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
     * details of the source from which the entity was obtained.
     * @return PdbxReferenceEntitySrcNat
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
     * textual details about small polymer molecules.
     * @return PdbxReferenceMoleculeDetails
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records
     * synonym names for reference entities.
     * @return PdbxReferenceMoleculeSynonyms
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
     * subcomponent sequence from which this entity could be built.
     * @return PdbxReferenceEntitySubcomponents
     */
    org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
     * additional annotation relevant to the molecular entities.
     * @return PdbxReferenceMoleculeAnnotation
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation();

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceMoleculeFeatures
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
     * details of the structural examples in related databases for this entity.
     * @return PdbxReferenceMoleculeRelatedStructures
     */
    org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures();

    /**
     * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
     * or atoms.
     * @return PdbxStructGroupList
     */
    org.rcsb.cif.model.generated.PdbxStructGroupList getPdbxStructGroupList();

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENTS category list component-level
     * group assignments within the entry.  Groups are defined and described in category
     * PDBX_STRUCT_GROUP_LIST.
     * @return PdbxStructGroupComponents
     */
    org.rcsb.cif.model.generated.PdbxStructGroupComponents getPdbxStructGroupComponents();

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
     * group as a continuous span chemical components.
     * @return PdbxStructGroupComponentRange
     */
    org.rcsb.cif.model.generated.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange();

    /**
     * Data items in the PDBX_PRD_AUDIT category records
     * the status and tracking information for this molecule.
     * @return PdbxPrdAudit
     */
    org.rcsb.cif.model.generated.PdbxPrdAudit getPdbxPrdAudit();

    /**
     * Data items in the PDBX_FAMILY_PRD_AUDIT category records
     * the status and tracking information for this family.
     * @return PdbxFamilyPrdAudit
     */
    org.rcsb.cif.model.generated.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit();

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    org.rcsb.cif.model.generated.PdbxMolecule getPdbxMolecule();

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    org.rcsb.cif.model.generated.PdbxMoleculeFeatures getPdbxMoleculeFeatures();

    /**
     * Data items in the PDBX_FAMILY_GROUP_INDEX category record
     * the family membership in family groups.
     * @return PdbxFamilyGroupIndex
     */
    org.rcsb.cif.model.generated.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex();

    /**
     * Data items in the PDBX_DISTANT_SOLVENT_ATOMS category list the
     * solvent atoms remote from any macromolecule.
     * @return PdbxDistantSolventAtoms
     */
    org.rcsb.cif.model.generated.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms();

    /**
     * Data items in the PDBX_STRUCT_SPECIAL_SYMMETRY category list the
     * molecular components that lie on special symmetry positions.
     * @return PdbxStructSpecialSymmetry
     */
    org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry();

    /**
     * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
     * related to PDB citation data.
     * @return PdbxReferencePublicationList
     */
    org.rcsb.cif.model.generated.PdbxReferencePublicationList getPdbxReferencePublicationList();

    /**
     *
     * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
     * @return PdbxNmrAssignedChemShiftList
     */
    org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList();

    /**
     *
     * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
     * @return PdbxNmrChemShiftExperiment
     */
    org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment();

    /**
     *
     * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
     * @return PdbxNmrChemShiftRef
     */
    org.rcsb.cif.model.generated.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef();

    /**
     *
     * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
     * @return PdbxNmrChemShiftReference
     */
    org.rcsb.cif.model.generated.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference();

    /**
     *
     * Items in the chem_shift_software category provide pointers to the software category and methods category.
     * @return PdbxNmrChemShiftSoftware
     */
    org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware();

    /**
     *
     * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
     * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
     * @return PdbxNmrConstraintFile
     */
    org.rcsb.cif.model.generated.PdbxNmrConstraintFile getPdbxNmrConstraintFile();

    /**
     *
     * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
     * @return PdbxNmrSoftwareTask
     */
    org.rcsb.cif.model.generated.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask();

    /**
     *
     * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
     * @return PdbxNmrSpectralDim
     */
    org.rcsb.cif.model.generated.PdbxNmrSpectralDim getPdbxNmrSpectralDim();

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
     * @return PdbxNmrSpectralPeakList
     */
    org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList();

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
     * and methods category where descriptions of software applications and methods can be found.
     * @return PdbxNmrSpectralPeakSoftware
     */
    org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware();

    /**
     *
     * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
     * @return PdbxNmrSystematicChemShiftOffset
     */
    org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset();

    /**
     *
     * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
     * @return PdbxNmrUpload
     */
    org.rcsb.cif.model.generated.PdbxNmrUpload getPdbxNmrUpload();

    /**
     * Data items in the PDBX_AUDIT_SUPPORT category record details about
     * funding support for the entry.
     * @return PdbxAuditSupport
     */
    org.rcsb.cif.model.generated.PdbxAuditSupport getPdbxAuditSupport();

    /**
     * Data items in the pdbx_chem_comp_subcomponent_struct_conn
     * list the chemical interactions among the subcomponents in
     * the chemical component.
     * @return PdbxChemCompSubcomponentStructConn
     */
    org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn();

    /**
     * Data items in the pdbx_chem_comp_subcomponent_entity_list category
     * list the constituent chemical entities and entity features in this chemical component.
     * @return PdbxChemCompSubcomponentEntityList
     */
    org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList();

    /**
     * Data items in the ENTITY_SRC_NAT category record details of
     * the source from which the entity was obtained in cases
     * where the entity was isolated directly from a natural tissue.
     * @return EntitySrcNat
     */
    org.rcsb.cif.model.generated.EntitySrcNat getEntitySrcNat();

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
    org.rcsb.cif.model.generated.EntitySrcGen getEntitySrcGen();

    /**
     * The data items in category PDBX_ENTITY_SRC_SYN record the source details
     * about chemically synthesized molecules.
     * @return PdbxEntitySrcSyn
     */
    org.rcsb.cif.model.generated.PdbxEntitySrcSyn getPdbxEntitySrcSyn();

    /**
     * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
     * the linkages between components within the polymer entity.
     * @return PdbxEntityPolyCompLinkList
     */
    org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList();

    /**
     * Data items in the PDBX_LINKED_ENTITY category record
     * information about molecules composed of linked entities.
     * @return PdbxLinkedEntity
     */
    org.rcsb.cif.model.generated.PdbxLinkedEntity getPdbxLinkedEntity();

    /**
     * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
     * molecules represented as linked entities within an entry.
     * @return PdbxLinkedEntityInstanceList
     */
    org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList();

    /**
     * Data items in the PDBX_LINKED_ENTITY_LIST category record
     * the list of entity constituents for this molecule.
     * @return PdbxLinkedEntityList
     */
    org.rcsb.cif.model.generated.PdbxLinkedEntityList getPdbxLinkedEntityList();

    /**
     * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
     * the linkages with molecules represented as linked entities.
     * @return PdbxLinkedEntityLinkList
     */
    org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList();

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    org.rcsb.cif.model.generated.PdbxEntityDescriptor getPdbxEntityDescriptor();

    /**
     * Data items in the pdbx_reference_linked_entity category describe
     * common observed interaction patterns within linked entities.
     * @return PdbxReferenceLinkedEntity
     */
    org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity();

    /**
     * Data items in the pdbx_reference_linked_entity_comp_list category lists
     * the constituents of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompList
     */
    org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList();

    /**
     * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
     * inter-entity linkages between the components of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompLink
     */
    org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink();

    /**
     * Data items in the pdbx_reference_linked_entity_link category enumerate
     * linkages between the entities in common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityLink
     */
    org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink();

    /**
     * Data items in the PDBX_RELATED_DATA_SET category record references
     * to experimental data sets related to the entry.
     * @return PdbxRelatedExpDataSet
     */
    org.rcsb.cif.model.generated.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet();

    /**
     * The pdbx_database_status_history category records the time evolution of entry
     * processing status.
     * @return PdbxDatabaseStatusHistory
     */
    org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory();

    /**
     * Data items in the EM_ASSEMBLY category record details
     * about the imaged EM sample.
     * @return EmAssembly
     */
    org.rcsb.cif.model.generated.EmAssembly getEmAssembly();

    /**
     * Data items in the EM_ENTITY_ASSEMBLY category
     * record details about each component of
     * the complex.
     * @return EmEntityAssembly
     */
    org.rcsb.cif.model.generated.EmEntityAssembly getEmEntityAssembly();

    /**
     * Data items in the EM_VIRUS_ENTITY category record details
     * of the icosahedral virus.
     * @return EmVirusEntity
     */
    org.rcsb.cif.model.generated.EmVirusEntity getEmVirusEntity();

    /**
     * Data items in the EM_SAMPLE_PREPARATION category
     * record details of sample conditions prior to and upon loading
     * onto grid support.
     * @return EmSamplePreparation
     */
    org.rcsb.cif.model.generated.EmSamplePreparation getEmSamplePreparation();

    /**
     * Data items in the EM_SAMPLE_SUPPORT category record details
     * of the electron microscope grid type, grid support film and pretreatment
     * of whole before sample is applied
     * @return EmSampleSupport
     */
    org.rcsb.cif.model.generated.EmSampleSupport getEmSampleSupport();

    /**
     * Data items in the BUFFER category
     * record details of the sample buffer.
     * @return EmBuffer
     */
    org.rcsb.cif.model.generated.EmBuffer getEmBuffer();

    /**
     * Data items in the EM_VITRIFICATION category
     * record details about the method and cryogen used in
     * rapid freezing of the sample on the grid prior to its
     * insertion in the electron microscope
     * @return EmVitrification
     */
    org.rcsb.cif.model.generated.EmVitrification getEmVitrification();

    /**
     * Data items in the EM_IMAGING category record details about
     * the parameters used in imaging the sample in the electron microscope.
     * @return EmImaging
     */
    org.rcsb.cif.model.generated.EmImaging getEmImaging();

    /**
     * Data items in the EM_DETECTOR category record details
     * of the image detector type.
     * @return EmDetector
     */
    org.rcsb.cif.model.generated.EmDetector getEmDetector();

    /**
     * Data items in the EM_IMAGE_SCANS category record details
     * of the image scanning device (microdensitometer)
     * and parameters for digitization of the image.
     * @return EmImageScans
     */
    org.rcsb.cif.model.generated.EmImageScans getEmImageScans();

    /**
     * Data items in the EM_2D_PROJECTION_SELECTION category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return Em2dProjectionSelection
     */
    org.rcsb.cif.model.generated.Em2dProjectionSelection getEm2dProjectionSelection();

    /**
     * Data items in the EM_3D_RECONSTRUCTION category
     * record details of the 3D reconstruction procedure from 2D projections.
     * @return Em3dReconstruction
     */
    org.rcsb.cif.model.generated.Em3dReconstruction getEm3dReconstruction();

    /**
     * Data items in the 3D_FITTING category
     * record details of the method of fitting atomic
     * coordinates from a PDB file into a 3d-em
     * volume map file
     * @return Em3dFitting
     */
    org.rcsb.cif.model.generated.Em3dFitting getEm3dFitting();

    /**
     * Data items in the 3D_FITTING_LIST category
     * lists the methods of fitting atomic coordinates from a PDB file
     * into a 3d-em volume map file
     * @return Em3dFittingList
     */
    org.rcsb.cif.model.generated.Em3dFittingList getEm3dFittingList();

    /**
     * Data items in the EM_HELICAL_ENTITY category record details
     * for a helical or filament type of assembly component.
     * @return EmHelicalEntity
     */
    org.rcsb.cif.model.generated.EmHelicalEntity getEmHelicalEntity();

    /**
     * Data items in the EM_EXPERIMENT category provide
     * high-level classification of the EM experiment.
     * @return EmExperiment
     */
    org.rcsb.cif.model.generated.EmExperiment getEmExperiment();

    /**
     * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
     * the details of the symmetry for a single particle entity type.
     * @return EmSingleParticleEntity
     */
    org.rcsb.cif.model.generated.EmSingleParticleEntity getEmSingleParticleEntity();

    /**
     * Administration-related data items
     * @return EmAdmin
     */
    org.rcsb.cif.model.generated.EmAdmin getEmAdmin();

    /**
     * Category to collect the authors of this entry
     * @return EmAuthorList
     */
    org.rcsb.cif.model.generated.EmAuthorList getEmAuthorList();

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReference
     */
    org.rcsb.cif.model.generated.EmDbReference getEmDbReference();

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReferenceAuxiliary
     */
    org.rcsb.cif.model.generated.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary();

    /**
     * Some internal items to power the deposition interface
     * @return EmDepui
     */
    org.rcsb.cif.model.generated.EmDepui getEmDepui();

    /**
     * List of EMD entries made obsolete by this entry.
     * @return EmObsolete
     */
    org.rcsb.cif.model.generated.EmObsolete getEmObsolete();

    /**
     * List of newer entries that replace this entry.
     * @return EmSupersede
     */
    org.rcsb.cif.model.generated.EmSupersede getEmSupersede();

    /**
     * Data items in this category record details about the molecular weight of
     * an assembly component of the sample.
     * @return EmEntityAssemblyMolwt
     */
    org.rcsb.cif.model.generated.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt();

    /**
     * Data items in this category record taxonomic details about the natural source for EM
     * assemblies and assembly components.
     * @return EmEntityAssemblyNaturalsource
     */
    org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource();

    /**
     * Data items in this category record details
     * about recombinant expression of the assembly or assembly component.
     * @return EmEntityAssemblyRecombinant
     */
    org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant();

    /**
     * Data items in this category record details of a virus entity.
     * @return EmVirusNaturalHost
     */
    org.rcsb.cif.model.generated.EmVirusNaturalHost getEmVirusNaturalHost();

    /**
     * Data items in the EMD_VIRUS_SHELL category record details
     * of the viral shell number, shell diameter, and icosahedral triangulation number.
     * @return EmVirusShell
     */
    org.rcsb.cif.model.generated.EmVirusShell getEmVirusShell();

    /**
     * Data items in the EMD_SPECIMEN category record details
     * about specimens prepared for imaging by electron microscopy.
     * @return EmSpecimen
     */
    org.rcsb.cif.model.generated.EmSpecimen getEmSpecimen();

    /**
     * Sugar embedding category
     * @return EmEmbedding
     */
    org.rcsb.cif.model.generated.EmEmbedding getEmEmbedding();

    /**
     * Description of fiducial markers.
     * @return EmFiducialMarkers
     */
    org.rcsb.cif.model.generated.EmFiducialMarkers getEmFiducialMarkers();

    /**
     * Description of sectioning by focused_ion_beam
     * @return EmFocusedIonBeam
     */
    org.rcsb.cif.model.generated.EmFocusedIonBeam getEmFocusedIonBeam();

    /**
     * Data items describing glow discharge pretreatment for an EM grid
     * @return EmGridPretreatment
     */
    org.rcsb.cif.model.generated.EmGridPretreatment getEmGridPretreatment();

    /**
     * Description of sectioning by ultramicrotomy
     * @return EmUltramicrotomy
     */
    org.rcsb.cif.model.generated.EmUltramicrotomy getEmUltramicrotomy();

    /**
     * Description of high pressure freezing
     * @return EmHighPressureFreezing
     */
    org.rcsb.cif.model.generated.EmHighPressureFreezing getEmHighPressureFreezing();

    /**
     * Data items related to shadowing of an EM specimen
     * @return EmShadowing
     */
    org.rcsb.cif.model.generated.EmShadowing getEmShadowing();

    /**
     * Description specimen preparation for imaging using tomography.
     * @return EmTomographySpecimen
     */
    org.rcsb.cif.model.generated.EmTomographySpecimen getEmTomographySpecimen();

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return EmCrystalFormation
     */
    org.rcsb.cif.model.generated.EmCrystalFormation getEmCrystalFormation();

    /**
     * Staining category
     * @return EmStaining
     */
    org.rcsb.cif.model.generated.EmStaining getEmStaining();

    /**
     * Data items to describe films supporting the specimen
     * @return EmSupportFilm
     */
    org.rcsb.cif.model.generated.EmSupportFilm getEmSupportFilm();

    /**
     * Buffer category
     * @return EmBufferComponent
     */
    org.rcsb.cif.model.generated.EmBufferComponent getEmBufferComponent();

    /**
     * Microscopy parameters relevant only for crystallography
     * @return EmDiffraction
     */
    org.rcsb.cif.model.generated.EmDiffraction getEmDiffraction();

    /**
     * Statistical parameters for electron diffraction measurements
     * within a resolution shell
     * @return EmDiffractionShell
     */
    org.rcsb.cif.model.generated.EmDiffractionShell getEmDiffractionShell();

    /**
     * Statistical parameters for electron diffraction measurements
     * @return EmDiffractionStats
     */
    org.rcsb.cif.model.generated.EmDiffractionStats getEmDiffractionStats();

    /**
     * Microscopy parameters only relevant for tomography
     * @return EmTomography
     */
    org.rcsb.cif.model.generated.EmTomography getEmTomography();

    /**
     * Data items in the EM_IMAGE_RECORDING category record details
     * of the image recording (either film/microdensitometer or electronic detector)
     * and parameters for image digitization.
     * @return EmImageRecording
     */
    org.rcsb.cif.model.generated.EmImageRecording getEmImageRecording();

    /**
     * Description of a few specialist optics apparatus
     * @return EmImagingOptics
     */
    org.rcsb.cif.model.generated.EmImagingOptics getEmImagingOptics();

    /**
     * Information about the final image classification
     * @return EmFinalClassification
     */
    org.rcsb.cif.model.generated.EmFinalClassification getEmFinalClassification();

    /**
     * The startup model employed to begin refinement of the parameters for
     * a 3DEM reconstruction
     * @return EmStartModel
     */
    org.rcsb.cif.model.generated.EmStartModel getEmStartModel();

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return EmSoftware
     */
    org.rcsb.cif.model.generated.EmSoftware getEmSoftware();

    /**
     * Category to describe the euler angle assignement
     * @return EmEulerAngleAssignment
     */
    org.rcsb.cif.model.generated.EmEulerAngleAssignment getEmEulerAngleAssignment();

    /**
     * Description of the Contrast Transfer Function (CTF) correction
     * @return EmCtfCorrection
     */
    org.rcsb.cif.model.generated.EmCtfCorrection getEmCtfCorrection();

    /**
     * Volume selection in image processing
     * @return EmVolumeSelection
     */
    org.rcsb.cif.model.generated.EmVolumeSelection getEmVolumeSelection();

    /**
     * Data items in the EM_SYMMETRY_3DX category record
     * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
     * @return Em3dCrystalEntity
     */
    org.rcsb.cif.model.generated.Em3dCrystalEntity getEm3dCrystalEntity();

    /**
     * Data items in the EM_SYMMETRY_2DX category record
     * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
     * @return Em2dCrystalEntity
     */
    org.rcsb.cif.model.generated.Em2dCrystalEntity getEm2dCrystalEntity();

    /**
     * Data items in the EM_IMAGE_PROCESSING category
     * record details of the EM image processing procedure.
     * @return EmImageProcessing
     */
    org.rcsb.cif.model.generated.EmImageProcessing getEmImageProcessing();

    /**
     * Data items in this category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return EmParticleSelection
     */
    org.rcsb.cif.model.generated.EmParticleSelection getEmParticleSelection();

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
    org.rcsb.cif.model.generated.EmMap getEmMap();

    /**
     * Data items in the EMD_VALIDATION_FSC_CURVE category
     * record details of the Fourier Shell Correlation (FSC) curve file.
     * @return EmFscCurve
     */
    org.rcsb.cif.model.generated.EmFscCurve getEmFscCurve();

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmInterpretFigure
     */
    org.rcsb.cif.model.generated.EmInterpretFigure getEmInterpretFigure();

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmLayerLines
     */
    org.rcsb.cif.model.generated.EmLayerLines getEmLayerLines();

    /**
     * Listing of all structure factor files associated with the EM entry
     * @return EmStructureFactors
     */
    org.rcsb.cif.model.generated.EmStructureFactors getEmStructureFactors();

    /**
     * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
     * that are provided by the depositor
     * @return EmDepositorInfo
     */
    org.rcsb.cif.model.generated.EmDepositorInfo getEmDepositorInfo();

    /**
     * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
     * that are provided by the depositor
     * @return EmMapDepositorInfo
     */
    org.rcsb.cif.model.generated.EmMapDepositorInfo getEmMapDepositorInfo();

    /**
     * Data items in the EM_MASK_DEPOSITOR_INFO category record mask parameters
     * that are provided by the depositor
     * @return EmMaskDepositorInfo
     */
    org.rcsb.cif.model.generated.EmMaskDepositorInfo getEmMaskDepositorInfo();

    /**
     * Listing of image files (figures) associated with an EMDB entry
     * @return EmFigureDepositorInfo
     */
    org.rcsb.cif.model.generated.EmFigureDepositorInfo getEmFigureDepositorInfo();

    /**
     * Listing of layer line files associated with the EM entry
     * @return EmLayerLinesDepositorInfo
     */
    org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo();

    /**
     * Structure factor files associated with the EM entry
     * @return EmStructureFactorsDepositorInfo
     */
    org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo();

    /**
     * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
     * details about the mapping sample and coordinate sequences.
     * @return PdbxSeqMapDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
     * details provided by depositors about deposited chemical components.
     * @return PdbxChemCompDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ.
     * @return PdbxStructRefSeqDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ_DIF.
     * @return PdbxStructRefSeqDifDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_PROP.
     * @return PdbxStructAssemblyPropDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY.
     * @return PdbxStructAssemblyDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_GEN.
     * @return PdbxStructAssemblyGenDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_OPER_LIST.
     * @return PdbxStructOperListDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo();

    /**
     * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_POINT_SYMMETRY.
     * @return PdbxPointSymmetryDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo();

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_HELICAL_SYMMETRY.
     * @return PdbxHelicalSymmetryDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo();

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidenceDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo();

    /**
     * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
     * mapping information between solvent atoms before and after symmetry
     * repositioning.
     * @return PdbxSolventAtomSiteMapping
     */
    org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping();

    /**
     * Data items in the PDBX_MOLECULE_FEATURES_DEPOSITOR_INFO  category capture
     * depositor provided information related to the archival cateogory
     * PDBX_MOLECULE_FEATURES.
     * @return PdbxMoleculeFeaturesDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
     * depositor provided information about the chemical context of component instances.
     * @return PdbxChemCompInstanceDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo();

    /**
     * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
     * details used to maintain state within the wwPDB deposition system.
     * @return PdbxDepuiStatusFlags
     */
    org.rcsb.cif.model.generated.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags();

    /**
     * Data items in the PDBX_DEPUI_UPLOAD category record the
     * details of uploaded data files.
     * @return PdbxDepuiUpload
     */
    org.rcsb.cif.model.generated.PdbxDepuiUpload getPdbxDepuiUpload();

    /**
     * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
     * details that assess the status of selected validation diagnostics.
     * @return PdbxDepuiValidationStatusFlags
     */
    org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags();

    /**
     * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
     * details of the uploaded files related to depositor provided chemical assignments.
     * @return PdbxChemCompUploadDepositorInfo
     */
    org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo();

    /**
     * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
     * details related to individual entities.
     * @return PdbxDepuiEntityStatusFlags
     */
    org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags();

    /**
     * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
     * details related to the features of individual entities.
     * @return PdbxDepuiEntityFeatures
     */
    org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures();

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
     * within the depositon and annotation system.
     * @return PdbxDepositionMessageInfo
     */
    org.rcsb.cif.model.generated.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo();

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
     * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
     * data category.
     * @return PdbxDepositionMessageFileReference
     */
    org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference();

    /**
     * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
     * information required to identify the depositor and route
     * deposition to an appropriate processing site.
     * @return PdbxDepuiEntryDetails
     */
    org.rcsb.cif.model.generated.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails();

    /**
     * Data items in the PDBX_DATA_PROCESSING_STATUS category record
     * data processing instructions for workflow processing tasks.
     * @return PdbxDataProcessingStatus
     */
    org.rcsb.cif.model.generated.PdbxDataProcessingStatus getPdbxDataProcessingStatus();

    /**
     * Data items in the pdbx_entity_instance_feature category records
     * special features of selected entity instances.
     * @return PdbxEntityInstanceFeature
     */
    org.rcsb.cif.model.generated.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature();

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
    org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
     * of the chemical component model instances.
     * @return PdbxChemCompModel
     */
    org.rcsb.cif.model.generated.PdbxChemCompModel getPdbxChemCompModel();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
     * for the chemical component model instance.
     * @return PdbxChemCompModelAtom
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelAtom getPdbxChemCompModelAtom();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
     * the bonds between atoms in a chemical component model instance.
     * @return PdbxChemCompModelBond
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelBond getPdbxChemCompModelBond();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelFeature
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelFeature getPdbxChemCompModelFeature();

    /**
     * Data items in the CHEM_COMP_MODEL_DESCRIPTOR category provide
     * string descriptors for component model structures.
     * @return PdbxChemCompModelDescriptor
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
     * the status and tracking information for this component model instance.
     * @return PdbxChemCompModelAudit
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelAudit getPdbxChemCompModelAudit();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelReference
     */
    org.rcsb.cif.model.generated.PdbxChemCompModelReference getPdbxChemCompModelReference();

    /**
     * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
     * of related mmCIF categories.  Views provide a vehicle for
     * presenting different logical arrangements of dictionary contents.
     * @return PdbxViewCategoryGroup
     */
    org.rcsb.cif.model.generated.PdbxViewCategoryGroup getPdbxViewCategoryGroup();

    /**
     * Data items in the PDBX_VIEW_CATEGORY specify the categories
     * belonging to a category view group.  An alias name for the
     * the mmCIF category may also be specified for the each
     * category in the view.
     * @return PdbxViewCategory
     */
    org.rcsb.cif.model.generated.PdbxViewCategory getPdbxViewCategory();

    /**
     * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
     * belonging to a view category.  An alias name for the
     * the mmCIF item may be specified for the each item in the
     * view category.  The role of the item in the view category
     * can be designated as mandatory, optional, or hidden.
     * @return PdbxViewItem
     */
    org.rcsb.cif.model.generated.PdbxViewItem getPdbxViewItem();

    /**
     * Gives information about what kind of coordinates are available.
     * @return PdbxCoord
     */
    org.rcsb.cif.model.generated.PdbxCoord getPdbxCoord();

    /**
     * Local data items describing ligand and monomer
     * chemical features.
     * @return PdbxConnect
     */
    org.rcsb.cif.model.generated.PdbxConnect getPdbxConnect();

    /**
     * Local data items describing ligand and monomer
     * type information.
     * @return PdbxConnectType
     */
    org.rcsb.cif.model.generated.PdbxConnectType getPdbxConnectType();

    /**
     * Local data items describing ligand and monomer
     * modifications.
     * @return PdbxConnectModification
     */
    org.rcsb.cif.model.generated.PdbxConnectModification getPdbxConnectModification();

    /**
     * Local data items describing ligand and monomer
     * atom names and connectivity.
     * @return PdbxConnectAtom
     */
    org.rcsb.cif.model.generated.PdbxConnectAtom getPdbxConnectAtom();

    /**
     * The PDBX_DATABASE_PDB_MASTER category provides placeholders
     * for the count of various PDB record types.
     * @return PdbxDatabasePDBMaster
     */
    org.rcsb.cif.model.generated.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster();

    /**
     *
     * Data items in the PDBX_DATABASE_PDB_OMIT category record
     * list PDB record names that should be omitted in the PDB
     * format file.
     * @return PdbxDatabasePdbOmit
     */
    org.rcsb.cif.model.generated.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit();

    /**
     * These records are used in the DBREF record of a PDB file and
     * are used as place holders for NDB ID's in PDB files.
     * @return PdbxDbref
     */
    org.rcsb.cif.model.generated.PdbxDbref getPdbxDbref();

    /**
     * Data items in the PDBX_DRUG_INFO category are still used until
     * the 'entity' categories are entered into the database, even
     * though the information is repeated.
     * @return PdbxDrugInfo
     */
    org.rcsb.cif.model.generated.PdbxDrugInfo getPdbxDrugInfo();

    /**
     * Data items in the PDBX_INHIBITOR_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * inhibitor is repeated.
     * @return PdbxInhibitorInfo
     */
    org.rcsb.cif.model.generated.PdbxInhibitorInfo getPdbxInhibitorInfo();

    /**
     * Data items in the PDBX_ION_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxIonInfo
     */
    org.rcsb.cif.model.generated.PdbxIonInfo getPdbxIonInfo();

    /**
     * Data items in the PDBX_HYBRID category are used to describe the chimeric
     * characteristics of a DNA/RNA structure.
     * @return PdbxHybrid
     */
    org.rcsb.cif.model.generated.PdbxHybrid getPdbxHybrid();

    /**
     * Data items in the PDBX_NA_STRAND_INFO category are still used until
     * the 'entity' categories are entered into the database, even though
     * the information is repeated.
     * @return PdbxNaStrandInfo
     */
    org.rcsb.cif.model.generated.PdbxNaStrandInfo getPdbxNaStrandInfo();

    /**
     * The information in this category is exclusively used to store
     * the HET records of a PDB file.  This record will be generated
     * by the PROGRAM.
     * @return PdbxNonstandardList
     */
    org.rcsb.cif.model.generated.PdbxNonstandardList getPdbxNonstandardList();

    /**
     * This is a place holder for the PDB COMPND.
     * @return PdbxPdbCompnd
     */
    org.rcsb.cif.model.generated.PdbxPdbCompnd getPdbxPdbCompnd();

    /**
     * This is a place holder for the PDB SOURCE.
     * @return PdbxPdbSource
     */
    org.rcsb.cif.model.generated.PdbxPdbSource getPdbxPdbSource();

    /**
     * Data items in the PDBX_PROTEIN_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxProteinInfo
     */
    org.rcsb.cif.model.generated.PdbxProteinInfo getPdbxProteinInfo();

    /**
     * Data items in the PDBX_SOLVENT_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxSolventInfo
     */
    org.rcsb.cif.model.generated.PdbxSolventInfo getPdbxSolventInfo();

    /**
     * Data item will still be used until the ENTITY category is fully
     * adopted by NDBQuery.
     * @return PdbxSource
     */
    org.rcsb.cif.model.generated.PdbxSource getPdbxSource();

    /**
     * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
     * the function of a particular biological assembly.
     * @return PdbxStructBiolFunc
     */
    org.rcsb.cif.model.generated.PdbxStructBiolFunc getPdbxStructBiolFunc();

    /**
     * Data items in the PDBX_STRUCT_PACK_GEN category record details about
     * the generation of the packing picture(s).
     * @return PdbxStructPackGen
     */
    org.rcsb.cif.model.generated.PdbxStructPackGen getPdbxStructPackGen();

    /**
     * Data items in the PDBX_TRNA_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * T-RNA is repeated.
     * @return PdbxTrnaInfo
     */
    org.rcsb.cif.model.generated.PdbxTrnaInfo getPdbxTrnaInfo();

    /**
     * These records give information about residues which do not pair
     * (h-bond) in the asymmetric unit.
     *
     * The records about Watson-Crick base pairing depend on these
     * records.
     * @return PdbxUnpair
     */
    org.rcsb.cif.model.generated.PdbxUnpair getPdbxUnpair();

    /**
     * Holds details of NCS restraints in cases where multiple
     * conditions are provided for each domain.
     * @return PdbxRefineLsRestrNcs
     */
    org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs();

    /**
     * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
     * about the generation of virus structures from NCS matrix operators.
     * @return PdbxStructNcsVirusGen
     */
    org.rcsb.cif.model.generated.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen();

    /**
     * PDBX_SEQUENCE_ANNOTATION holds internal details about molecular sequences
     * described in the context of PDB chains.
     * @return PdbxSequenceAnnotation
     */
    org.rcsb.cif.model.generated.PdbxSequenceAnnotation getPdbxSequenceAnnotation();

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS identify
     * problems or errors encountered in the post-processing
     * of this entry.
     * @return PdbxPostProcessDetails
     */
    org.rcsb.cif.model.generated.PdbxPostProcessDetails getPdbxPostProcessDetails();

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS record
     * the status of post-processed entries.
     * @return PdbxPostProcessStatus
     */
    org.rcsb.cif.model.generated.PdbxPostProcessStatus getPdbxPostProcessStatus();

    /**
     * Data items in the PDBX_STRUCT_LINK category record details about
     * covalent linkages in the structure.
     * @return PdbxStructLink
     */
    org.rcsb.cif.model.generated.PdbxStructLink getPdbxStructLink();

    /**
     * Provides a place-holder for PDB REMARK 465 data.
     * @return PdbxMissingResidueList
     */
    org.rcsb.cif.model.generated.PdbxMissingResidueList getPdbxMissingResidueList();

    /**
     * Crystallographic cell specifications used in data processing.
     * @return PdbxDataProcessingCell
     */
    org.rcsb.cif.model.generated.PdbxDataProcessingCell getPdbxDataProcessingCell();

    /**
     * Details of reflections used in data processing.
     * @return PdbxDataProcessingReflns
     */
    org.rcsb.cif.model.generated.PdbxDataProcessingReflns getPdbxDataProcessingReflns();

    /**
     * Details of the detector used at data collection site.
     * @return PdbxDataProcessingDetector
     */
    org.rcsb.cif.model.generated.PdbxDataProcessingDetector getPdbxDataProcessingDetector();

    /**
     * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
     * common nucleotide modifications and nonstandard features.
     * @return PdbxChemCompNonstandard
     */
    org.rcsb.cif.model.generated.PdbxChemCompNonstandard getPdbxChemCompNonstandard();

    /**
     * Data items in the PDBX_ENTITY_POLY_PROTEIN_CLASS category
     * provides a top-level protein classification.
     * @return PdbxEntityPolyProteinClass
     */
    org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass();

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
     * define the tree structure of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomyTree
     */
    org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree();

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
     * define the names and synonyms of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomy
     */
    org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy();

    /**
     * Data items in the PDBX_ENTITY_NAME_INSTANCE category
     * list names used to define entities with their
     * associated database, entity, chain, and molecule
     * identifiers.
     * @return PdbxEntityNameInstance
     */
    org.rcsb.cif.model.generated.PdbxEntityNameInstance getPdbxEntityNameInstance();

    /**

     * @return PdbxTableinfo
     */
    org.rcsb.cif.model.generated.PdbxTableinfo getPdbxTableinfo();

    /**

     * @return PdbxColumninfo
     */
    org.rcsb.cif.model.generated.PdbxColumninfo getPdbxColumninfo();

    /**
     * The PDBX_VAL_ANGLE category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValAngle
     */
    org.rcsb.cif.model.generated.PdbxValAngle getPdbxValAngle();

    /**
     * The PDBX_VAL_BOND category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValBond
     */
    org.rcsb.cif.model.generated.PdbxValBond getPdbxValBond();

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
    org.rcsb.cif.model.generated.PdbxValContact getPdbxValContact();

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
    org.rcsb.cif.model.generated.PdbxValSymContact getPdbxValSymContact();

    /**
     * Data items in the PDBX_RMCH_OUTLIER category list the
     * residues with torsion angles outside the expected
     * Ramachandran regions.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxRmchOutlier
     */
    org.rcsb.cif.model.generated.PdbxRmchOutlier getPdbxRmchOutlier();

    /**
     * Data items in the PDBX_MISSING_ATOM_POLY category lists
     * atoms missing in polymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomPoly
     */
    org.rcsb.cif.model.generated.PdbxMissingAtomPoly getPdbxMissingAtomPoly();

    /**
     * Data items in the PDBX_MISSING_ATOM_NONPOLY category list the
     * atoms missing in nonpolymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomNonpoly
     */
    org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly();

    /**
     * Data items in the PDBX_VAL_CHIRAL category list the
     * atoms with nonstandard chiralities.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValChiral
     */
    org.rcsb.cif.model.generated.PdbxValChiral getPdbxValChiral();

    /**
     * Gives information about the organization of the
     * NDB Structural Atlas.
     * @return PdbxAtlas
     */
    org.rcsb.cif.model.generated.PdbxAtlas getPdbxAtlas();

    /**
     * Container category for a list of feature flags associated
     * with each structure entry.
     * @return PdbxSummaryFlags
     */
    org.rcsb.cif.model.generated.PdbxSummaryFlags getPdbxSummaryFlags();

    /**
     * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
     * characteristics of protein oligonucleotide binding.
     * @return PdbxEntityFuncBindMode
     */
    org.rcsb.cif.model.generated.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode();

    /**
     * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is enzymatic.
     * @return PdbxEntityFuncEnzyme
     */
    org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme();

    /**
     * Data items in the PDBX_ENTITY_FUNC_REGULATORY category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is regulatory.
     * @return PdbxEntityFuncRegulatory
     */
    org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory();

    /**
     * Data items in the PDBX_ENTITY_FUNC_STRUCTURAL category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is structural.
     * @return PdbxEntityFuncStructural
     */
    org.rcsb.cif.model.generated.PdbxEntityFuncStructural getPdbxEntityFuncStructural();

    /**
     * Data items in the PDBX_ENTITY_FUNC_OTHER category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is not classified.
     * @return PdbxEntityFuncOther
     */
    org.rcsb.cif.model.generated.PdbxEntityFuncOther getPdbxEntityFuncOther();

    /**
     * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
     * of monomers within a polymer.
     * @return PdbxEntityPolyDomain
     */
    org.rcsb.cif.model.generated.PdbxEntityPolyDomain getPdbxEntityPolyDomain();

    /**
     * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
     * about structural features of the NA.
     * @return PdbxNaStructKeywds
     */
    org.rcsb.cif.model.generated.PdbxNaStructKeywds getPdbxNaStructKeywds();

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_TYPE category describe
     * type of nucleic acid polymer entities.
     * @return PdbxEntityPolyNaType
     */
    org.rcsb.cif.model.generated.PdbxEntityPolyNaType getPdbxEntityPolyNaType();

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
     * describe the nonstandard features of the nucleic acid polymer entities.
     * @return PdbxEntityPolyNaNonstandard
     */
    org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard();

    /**
     * Data items in the PDBX_VIRTUAL_ANGLE category record details about the
     * molecular virtual angles, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualAngle
     */
    org.rcsb.cif.model.generated.PdbxVirtualAngle getPdbxVirtualAngle();

    /**
     * Data items in the PDBX_VIRTUAL_BOND category record details about
     * virtual bonds, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualBond
     */
    org.rcsb.cif.model.generated.PdbxVirtualBond getPdbxVirtualBond();

    /**
     * Data items in the PDBX_VIRTUAL_TORSION category record details about
     * virtual torsion angles, as calculated from the contents of the ATOM,
     * CELL, and SYMMETRY data.
     * @return PdbxVirtualTorsion
     */
    org.rcsb.cif.model.generated.PdbxVirtualTorsion getPdbxVirtualTorsion();

    /**
     * Data items in the PDBX_SEQUENCE_PATTERN category record
     * the number of occurences of common step sequence patterns
     * (e.g. AA, CG, AT).
     * @return PdbxSequencePattern
     */
    org.rcsb.cif.model.generated.PdbxSequencePattern getPdbxSequencePattern();

    /**
     * Data items in the PDBX_STEREOCHEMISTRY identify chiral
     * centers and associated chiral volumes.
     * @return PdbxStereochemistry
     */
    org.rcsb.cif.model.generated.PdbxStereochemistry getPdbxStereochemistry();

    /**
     * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
     * for nucleic acid covalent geometry relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovalent
     */
    org.rcsb.cif.model.generated.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent();

    /**
     * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovByMonomer
     */
    org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer();

    /**
     * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxSugarPhosphateGeometry
     */
    org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry();

    /**
     * The table in this section is used to describe the software
     * that was used for data collection, data processing, data analysis,
     * structure calculations and refinement. The description should include
     * both the name of the software and the version used.
     * @return PdbxNmrComputing
     */
    org.rcsb.cif.model.generated.PdbxNmrComputing getPdbxNmrComputing();

    /**
     * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
     * extension dictionary versions against which the data names appearing
     * the current data block are conformant.
     * @return PdbxAuditConformExtension
     */
    org.rcsb.cif.model.generated.PdbxAuditConformExtension getPdbxAuditConformExtension();

    /**
     * Data items in the category record details from the output of mapman
     * used by the DCC program.
     * @return PdbxDccMapman
     */
    org.rcsb.cif.model.generated.PdbxDccMapman getPdbxDccMapman();

    /**
     * Data items in this category record residual map properties such as
     * correlation, real space Rfactors and the Zscore calculated from
     * refmac and mapman.
     * @return PdbxDccRsccMapman
     */
    org.rcsb.cif.model.generated.PdbxDccRsccMapman getPdbxDccRsccMapman();

    /**
     * Data items in the category record overall map properties such
     * as correlation, real space Rfactors and the Zscore calculated
     * from refmac and mapman.
     * @return PdbxDccRsccMapmanOverall
     */
    org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall();

    /**
     * Data items in the category record various overall metrics
     * calculated by DCC and various wrapped programs (such as Xtriage,
     * pointless, REFMAC ...).
     * @return PdbxDccDensity
     */
    org.rcsb.cif.model.generated.PdbxDccDensity getPdbxDccDensity();

    /**
     * Data items in the category record the overall deviations about
     * geometry (such as bond length, angle, dihedral, chirality,
     * planarity). These data are calculated with the phenix module
     * model_vs_data.
     * @return PdbxDccGeometry
     */
    org.rcsb.cif.model.generated.PdbxDccGeometry getPdbxDccGeometry();

    /**
     * Data items in the category record calculated metrics from various
     * programs (such as phenix, refmac, cns, sfcheck).
     * @return PdbxDccDensityCorr
     */
    org.rcsb.cif.model.generated.PdbxDccDensityCorr getPdbxDccDensityCorr();

    /**
     * Data items in the category record residual map properties such as
     * Real Space electron density Correlation Coefficient (RSCC), real space R
     * factors (RSR) and the Zscores for each residue, the main/side chains.
     * @return PdbxDccMap
     */
    org.rcsb.cif.model.generated.PdbxDccMap getPdbxDccMap();

    /**
     * Data items in the pdbx_deposit_group category provide identifiers
     * and related information for groups of entries deposited in a collection.
     * @return PdbxDepositGroup
     */
    org.rcsb.cif.model.generated.PdbxDepositGroup getPdbxDepositGroup();

    /**
     * Data items in the pdbx_deposit_group_index category provides details
     * about the individual data files in the collection of deposited entries.
     * @return PdbxDepositGroupIndex
     */
    org.rcsb.cif.model.generated.PdbxDepositGroupIndex getPdbxDepositGroupIndex();

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidence
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence();

    /**
     * Provides reason a particular assembly in pdbx_struct_assembly is
     * of interest.
     * @return PdbxStructAssemblyAuthClassification
     */
    org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification();

    /**
     * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
     * programs during indexing
     * @return PdbxCrystalAlignment
     */
    org.rcsb.cif.model.generated.PdbxCrystalAlignment getPdbxCrystalAlignment();

    /**
     * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
     * the revision history for a data entry.
     * @return PdbxAuditRevisionHistory
     */
    org.rcsb.cif.model.generated.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory();

    /**
     * Data items in the PDBX_AUDIT_revision_group category
     * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
     * record.
     * @return PdbxAuditRevisionGroup
     */
    org.rcsb.cif.model.generated.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup();

    /**
     * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
     * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionCategory
     */
    org.rcsb.cif.model.generated.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory();

    /**
     * Data items in the PDBX_audit_revision_details category
     * record descriptions of changes associated with
     * PDBX_AUDIT_REVISION_HISTORY records.
     * @return PdbxAuditRevisionDetails
     */
    org.rcsb.cif.model.generated.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails();

    /**
     * Data items in the PDBX_AUDIT_REVISION_ITEM category
     * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionItem
     */
    org.rcsb.cif.model.generated.PdbxAuditRevisionItem getPdbxAuditRevisionItem();

    /**
     * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
     * to experimental data set dependencies for this entry.
     * @return PdbxSupportingExpDataSet
     */
    org.rcsb.cif.model.generated.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
     * details the beam that is impinging on the sample
     * @return PdbxSerialCrystallographyMeasurement
     */
    org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
     * record general details about the sample delivery
     * @return PdbxSerialCrystallographySampleDelivery
     */
    org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
     * category record details about sample delivery by injection
     * @return PdbxSerialCrystallographySampleDeliveryInjection
     */
    org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
     * category record details about sample delivery using a fixed taget.
     * @return PdbxSerialCrystallographySampleDeliveryFixedTarget
     */
    org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
     * details about data processing that are unique to XFEL experiments.
     * These will compliment data recorded in category pdbx_diffrn_merge_stat.
     * @return PdbxSerialCrystallographyDataReduction
     */
    org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction();

    /**
     * PDBX_CHEM_COMP_SYNONYMS holds chemical name and synonym correspondences.
     * @return PdbxChemCompSynonyms
     */
    org.rcsb.cif.model.generated.PdbxChemCompSynonyms getPdbxChemCompSynonyms();

    /**
     * PDBX_CHEM_COMP_RELATED describes the relationship between two chemical components.
     * @return PdbxChemCompRelated
     */
    org.rcsb.cif.model.generated.PdbxChemCompRelated getPdbxChemCompRelated();

    /**
     * PDBX_CHEM_COMP_ATOM_RELATED provides atom level nomenclature mapping between two related chemical components.
     * @return PdbxChemCompAtomRelated
     */
    org.rcsb.cif.model.generated.PdbxChemCompAtomRelated getPdbxChemCompAtomRelated();

    /**
     * Data items in the PDBX_ENTITY_BRANCH_LIST category specify the list
     * of monomers in a branched entity.  Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return PdbxEntityBranchList
     */
    org.rcsb.cif.model.generated.PdbxEntityBranchList getPdbxEntityBranchList();

    /**
     * Data items in the PDBX_ENTITY_BRANCH_LINK category give details about
     * the linkages between components within a branched entity.
     * @return PdbxEntityBranchLink
     */
    org.rcsb.cif.model.generated.PdbxEntityBranchLink getPdbxEntityBranchLink();

    /**
     * Data items in the PDBX_ENTITY_BRANCH category specify the list
     * of branched entities and the type.
     * @return PdbxEntityBranch
     */
    org.rcsb.cif.model.generated.PdbxEntityBranch getPdbxEntityBranch();

    /**
     * The PDBX_BRANCH_SCHEME category provides residue level nomenclature
     * mapping for branch chain entities.
     * @return PdbxBranchScheme
     */
    org.rcsb.cif.model.generated.PdbxBranchScheme getPdbxBranchScheme();

    /**
     * Data items in the IHM_STARTING_MODEL_DETAILS category records the
     * details about structural models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingModelDetails
     */
    org.rcsb.cif.model.generated.IhmStartingModelDetails getIhmStartingModelDetails();

    /**
     * Data items in the IHM_STARTING_COMPARATIVE_MODELS category records
     * additional details about comparative models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingComparativeModels
     */
    org.rcsb.cif.model.generated.IhmStartingComparativeModels getIhmStartingComparativeModels();

    /**
     * Data items in the IHM_STARTING_COMPUTATIONAL_MODELS category records
     * additional details about computational models used as starting inputs in
     * the integrative model building process.
     * @return IhmStartingComputationalModels
     */
    org.rcsb.cif.model.generated.IhmStartingComputationalModels getIhmStartingComputationalModels();

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
    org.rcsb.cif.model.generated.IhmStartingModelSeqDif getIhmStartingModelSeqDif();

    /**
     * Data items in the IHM_MODEL_REPRESENTATION category records the
     * details about the architecture and representation of structural
     * models created by the integrative model building tasks. This
     * category handles the multi-scale model representation, if employed.
     * @return IhmModelRepresentation
     */
    org.rcsb.cif.model.generated.IhmModelRepresentation getIhmModelRepresentation();

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY category records the
     * details of the structural assemblies and used in the
     * IHM modeling.
     * @return IhmStructAssembly
     */
    org.rcsb.cif.model.generated.IhmStructAssembly getIhmStructAssembly();

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_DETAILS category provides
     * additional details regarding the structure assembly.
     * @return IhmStructAssemblyDetails
     */
    org.rcsb.cif.model.generated.IhmStructAssemblyDetails getIhmStructAssemblyDetails();

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_CLASS_LIST category lists
     * all the structural assembly classes relevant to the entry. This
     * category provides a mechanism to define classes of the
     * structural assemblies.
     * @return IhmStructAssemblyClassList
     */
    org.rcsb.cif.model.generated.IhmStructAssemblyClassList getIhmStructAssemblyClassList();

    /**
     * Data items in the IHM_STRUCT_ASSEMBLY_CLASS category provides
     * details regarding the structural assembly classes. This
     * category provides a mechanism to identify the classes to which
     * structural assemblies belong.
     * @return IhmStructAssemblyClass
     */
    org.rcsb.cif.model.generated.IhmStructAssemblyClass getIhmStructAssemblyClass();

    /**
     * Data items in the IHM_MODELING_PROTOCOL category records the
     * step-wise details of the integrative modeling workflow.
     * @return IhmModelingProtocol
     */
    org.rcsb.cif.model.generated.IhmModelingProtocol getIhmModelingProtocol();

    /**
     * Data items in the IHM_MULTI_STATE_MODELING category records the
     * details of the multi-state modeling protocol, if applicable.
     * @return IhmMultiStateModeling
     */
    org.rcsb.cif.model.generated.IhmMultiStateModeling getIhmMultiStateModeling();

    /**
     * Data items in the IHM_ORDERED_ENSEMBLE category records the
     * details of the ensembles ordered by time or other order.
     * Ordered ensembles are described as directed graphs with
     * edges between nodes representing models or model groups.
     * @return IhmOrderedEnsemble
     */
    org.rcsb.cif.model.generated.IhmOrderedEnsemble getIhmOrderedEnsemble();

    /**
     * Data items in the IHM_MODELING_POST_PROCESS category records
     * the details of the post processing of the models/results of
     * the modeling protocol.
     * @return IhmModelingPostProcess
     */
    org.rcsb.cif.model.generated.IhmModelingPostProcess getIhmModelingPostProcess();

    /**
     * Data items in the IHM_ENSEMBLE_INFO category records the
     * details of the model clusters or ensembles obtained after
     * sampling.
     * @return IhmEnsembleInfo
     */
    org.rcsb.cif.model.generated.IhmEnsembleInfo getIhmEnsembleInfo();

    /**
     * Data items in the IHM_MODEL_LIST category record the
     * details of the models being deposited.
     * @return IhmModelList
     */
    org.rcsb.cif.model.generated.IhmModelList getIhmModelList();

    /**
     * Data items in the IHM_MODEL_REPRESENTATIVE category record the
     * details of the representative model in an ensemble or cluster.
     * @return IhmModelRepresentative
     */
    org.rcsb.cif.model.generated.IhmModelRepresentative getIhmModelRepresentative();

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
    org.rcsb.cif.model.generated.IhmDatasetList getIhmDatasetList();

    /**
     * Category provides a mechanism to group datasets.
     * @return IhmDatasetGroup
     */
    org.rcsb.cif.model.generated.IhmDatasetGroup getIhmDatasetGroup();

    /**
     * Category holds information about related datasets, where one is derived from the other.
     * @return IhmRelatedDatasets
     */
    org.rcsb.cif.model.generated.IhmRelatedDatasets getIhmRelatedDatasets();

    /**
     * Category holds information related to data sources for the entry.
     * These can be datasets archived in other related databases such as
     * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc.
     * @return IhmDatasetRelatedDbReference
     */
    org.rcsb.cif.model.generated.IhmDatasetRelatedDbReference getIhmDatasetRelatedDbReference();

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
    org.rcsb.cif.model.generated.IhmExternalReferenceInfo getIhmExternalReferenceInfo();

    /**
     * Category provides details regarding external files. The IHM_EXTERNAL_REFERENCE_INFO
     * category captures the top-level details regarding external data sources.
     * This category captures the specific details regarding externally stored files
     * related to the particular I/H model entry.
     * @return IhmExternalFiles
     */
    org.rcsb.cif.model.generated.IhmExternalFiles getIhmExternalFiles();

    /**
     * Category provides additional details regarding input data hosted externally
     * at other resources.
     * @return IhmDatasetExternalReference
     */
    org.rcsb.cif.model.generated.IhmDatasetExternalReference getIhmDatasetExternalReference();

    /**
     * Data items in the IHM_LOCALIZATION_DENSITY_FILES category records the
     * details of files that provide information regarding localization densities
     * of ensembles. These may be stored externally as local files or linked via
     * DOI and can be in any accepted format that provides volume information
     * (CCP4, MRC, etc.).
     * @return IhmLocalizationDensityFiles
     */
    org.rcsb.cif.model.generated.IhmLocalizationDensityFiles getIhmLocalizationDensityFiles();

    /**
     * Data items in the IHM_PREDICTED_CONTACT_RESTRAINT category records the
     * list of predicted contacts used in the integrative modeling experiment.
     * This has been adapted from the widely used CASP RR format
     * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
     * These contacts may be derived from various computational tools.
     * The software information can be provided in the SOFTWARE category.
     * @return IhmPredictedContactRestraint
     */
    org.rcsb.cif.model.generated.IhmPredictedContactRestraint getIhmPredictedContactRestraint();

    /**
     * Data items in the IHM_HYDROXYL_RADICAL_FP_RESTRAINT category records the
     * restraints derived from hydroxyl radical footprinting experiment.
     * These restraints provide information regarding solvent accessible surface
     * area of residues.
     * @return IhmHydroxylRadicalFpRestraint
     */
    org.rcsb.cif.model.generated.IhmHydroxylRadicalFpRestraint getIhmHydroxylRadicalFpRestraint();

    /**
     * Data items in the IHM_CROSS_LINK_LIST category records the
     * list of spatial restraints derived from chemical crosslinking
     * experiment.
     * @return IhmCrossLinkList
     */
    org.rcsb.cif.model.generated.IhmCrossLinkList getIhmCrossLinkList();

    /**
     * Data items in the IHM_CROSS_LINK_RESTRAINT category enumerates the
     * implementation details of the chemical crosslinking restraints in
     * the integrative modeling. This category holds the details of how
     * the experimentally derived crosslinks are applied in the modeling.
     * @return IhmCrossLinkRestraint
     */
    org.rcsb.cif.model.generated.IhmCrossLinkRestraint getIhmCrossLinkRestraint();

    /**
     * Data items in the IHM_CROSS_LINK_RESULT category records the
     * results of the crosslinking restraints in the IHM modeling.
     * @return IhmCrossLinkResult
     */
    org.rcsb.cif.model.generated.IhmCrossLinkResult getIhmCrossLinkResult();

    /**
     * Data items in the IHM_CROSS_LINK_RESULT_PARAMETERS category records the
     * results of the crosslinking restraint parameters in the IHM modeling.
     * @return IhmCrossLinkResultParameters
     */
    org.rcsb.cif.model.generated.IhmCrossLinkResultParameters getIhmCrossLinkResultParameters();

    /**
     * Data items in the IHM_2DEM_CLASS_AVERAGE_RESTRAINT category records the
     * details of the 2DEM class averages used in the IHM modeling.
     * @return Ihm2demClassAverageRestraint
     */
    org.rcsb.cif.model.generated.Ihm2demClassAverageRestraint getIhm2demClassAverageRestraint();

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
    org.rcsb.cif.model.generated.Ihm2demClassAverageFitting getIhm2demClassAverageFitting();

    /**
     * Data items in the IHM_3DEM_RESTRAINT category records the
     * details of the 3DEM maps used as restraints in the
     * IHM modeling.
     * @return Ihm3demRestraint
     */
    org.rcsb.cif.model.generated.Ihm3demRestraint getIhm3demRestraint();

    /**
     * Data items in the IHM_SAS_RESTRAINT category records the
     * details of the SAS data used as restraints in the
     * IHM modeling.
     * @return IhmSasRestraint
     */
    org.rcsb.cif.model.generated.IhmSasRestraint getIhmSasRestraint();

    /**
     * Data items in the IHM_STARTING_MODEL_COORD category records the coordinates
     * for structural templates used as starting inputs in the integrative model
     * building tasks.
     * @return IhmStartingModelCoord
     */
    org.rcsb.cif.model.generated.IhmStartingModelCoord getIhmStartingModelCoord();

    /**
     * Data items in the IHM_SPHERE_OBJ_SITE category records the details
     * of the spherical objects modeled in the integrative structural model.
     * @return IhmSphereObjSite
     */
    org.rcsb.cif.model.generated.IhmSphereObjSite getIhmSphereObjSite();

    /**
     * Data items in the IHM_GAUSSIAN_OBJ_SITE category records the details
     * of the gaussian objects modeled in the integrative structural model.
     * @return IhmGaussianObjSite
     */
    org.rcsb.cif.model.generated.IhmGaussianObjSite getIhmGaussianObjSite();

    /**
     * Data items in the IHM_GAUSSIAN_OBJ_ENSEMBLE category records the details
     * of the gaussian objects representing an ensemble or cluster of models.
     * @return IhmGaussianObjEnsemble
     */
    org.rcsb.cif.model.generated.IhmGaussianObjEnsemble getIhmGaussianObjEnsemble();

    /**
     * Data items in the IHM_RESIDUES_NOT_MODELED category record the
     * details of the residues that are defined in the
     * IHM_STRUCT_ASSEMBLY category but are missing in the
     * three-dimensional model (ATOM_SITE, IHM_SPHERE_OBJ_SITE,
     * IHM_GAUSSIAN_OBJ_SITE categories) i.e., residues in the
     * assembly that are not modeled.
     * @return IhmResiduesNotModeled
     */
    org.rcsb.cif.model.generated.IhmResiduesNotModeled getIhmResiduesNotModeled();

    /**
     * IHM_FEATURE_LIST is the high level category that provides defintions
     * to select atoms/residues from polymeric and non-polymeric entities.
     * @return IhmFeatureList
     */
    org.rcsb.cif.model.generated.IhmFeatureList getIhmFeatureList();

    /**
     * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
     * of pseudo positions for the features listed in IHM_FEATURE_LIST.
     * @return IhmPseudoSiteFeature
     */
    org.rcsb.cif.model.generated.IhmPseudoSiteFeature getIhmPseudoSiteFeature();

    /**
     * Data items in the IHM_POLY_ATOM_FEATURE category provides the defintions
     * required to select specific atoms.
     * @return IhmPolyAtomFeature
     */
    org.rcsb.cif.model.generated.IhmPolyAtomFeature getIhmPolyAtomFeature();

    /**
     * Data items in the IHM_POLY_RESIDUE_FEATURE category provides the defintions
     * required to select a specific residue or a set of residues that may or may not be
     * in a contiguous range.
     * @return IhmPolyResidueFeature
     */
    org.rcsb.cif.model.generated.IhmPolyResidueFeature getIhmPolyResidueFeature();

    /**
     * Data items in the IHM_NON_POLY_FEATURE category provides the defintions
     * required to select a non-polymeric (ligand) feature.
     * @return IhmNonPolyFeature
     */
    org.rcsb.cif.model.generated.IhmNonPolyFeature getIhmNonPolyFeature();

    /**
     * Data items in the IHM_INTERFACE_RESIDUE_FEATURE category captures the
     * details of residues that are identified to be at the binding interface
     * from experiments. This information is used by modeling software such as
     * HADDOCK to create a set of ambiguous distance restraints at the binding
     * interface between the molecular entities involved.
     * @return IhmInterfaceResidueFeature
     */
    org.rcsb.cif.model.generated.IhmInterfaceResidueFeature getIhmInterfaceResidueFeature();

    /**
     * Data items in the IHM_DERIVED_DISTANCE_RESTRAINT category records the
     * list of distance restraints used in the integrative modeling experiment.
     * These distance redistance restraints may be derived from various kinds of experiments.
     * @return IhmDerivedDistanceRestraint
     */
    org.rcsb.cif.model.generated.IhmDerivedDistanceRestraint getIhmDerivedDistanceRestraint();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_LIST category records the list of
     * geometric objects used as restraints in the integrative modeling study.
     * @return IhmGeometricObjectList
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectList getIhmGeometricObjectList();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_CENTER category records the center of
     * geometric objects used as restraints in the integrative modeling study.
     * @return IhmGeometricObjectCenter
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectCenter getIhmGeometricObjectCenter();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_TRANSFORMATION category records the
     * details of the rotation matrix and translation vector applied for transforming
     * the geometric object.
     * If no transformation is provide, identity transformation is assumed.
     * @return IhmGeometricObjectTransformation
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectTransformation getIhmGeometricObjectTransformation();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_SPHERE category records the parameters of
     * a sphere.
     * @return IhmGeometricObjectSphere
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectSphere getIhmGeometricObjectSphere();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_TORUS category records the parameters of
     * a torus. By definition, the base plane of the torus is the XY plane. The
     * `ihm_geometric_object_transformation` category can be used to generate
     * transformations to any other plane.
     * @return IhmGeometricObjectTorus
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectTorus getIhmGeometricObjectTorus();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_HALF_TORUS category records the parameters of
     * half-torus that represents a membrane.
     * @return IhmGeometricObjectHalfTorus
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectHalfTorus getIhmGeometricObjectHalfTorus();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_AXIS category records the details of
     * an axis used in a spatial restraint.
     * @return IhmGeometricObjectAxis
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectAxis getIhmGeometricObjectAxis();

    /**
     * Data items in the IHM_GEOMETRIC_OBJECT_PLANE category records the details of
     * a plane used in a spatial restraint.
     * @return IhmGeometricObjectPlane
     */
    org.rcsb.cif.model.generated.IhmGeometricObjectPlane getIhmGeometricObjectPlane();

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
    org.rcsb.cif.model.generated.IhmGeometricObjectDistanceRestraint getIhmGeometricObjectDistanceRestraint();
}
