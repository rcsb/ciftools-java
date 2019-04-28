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
    org.rcsb.cif.model.generated.atomsite.AtomSite getAtomSite();

    /**
     * Data items in the ATOM_SITE_ANISOTROP category record details
     * about anisotropic displacement parameters.
     * If the ATOM_SITE_ANISOTROP category is used for storing these
     * data, the corresponding ATOM_SITE data items are not used.
     * @return AtomSiteAnisotrop
     */
    org.rcsb.cif.model.generated.atomsiteanisotrop.AtomSiteAnisotrop getAtomSiteAnisotrop();

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    org.rcsb.cif.model.generated.atomsites.AtomSites getAtomSites();

    /**
     * Data items in the ATOM_SITES_ALT category record details
     * about the structural ensembles that should be generated from
     * atom sites or groups of atom sites that are modelled in
     * alternative conformations in this data block.
     * @return AtomSitesAlt
     */
    org.rcsb.cif.model.generated.atomsitesalt.AtomSitesAlt getAtomSitesAlt();

    /**
     * Data items in the ATOM_SITES_ALT_ENS category record details
     * about the ensemble structure generated from atoms with various
     * alternative conformation IDs.
     * @return AtomSitesAltEns
     */
    org.rcsb.cif.model.generated.atomsitesaltens.AtomSitesAltEns getAtomSitesAltEns();

    /**
     * Data items in the ATOM_SITES_ALT_GEN category record details
     * about the interpretation of multiple conformations in the
     * structure.
     * @return AtomSitesAltGen
     */
    org.rcsb.cif.model.generated.atomsitesaltgen.AtomSitesAltGen getAtomSitesAltGen();

    /**
     * Data items in the ATOM_SITES_FOOTNOTE category record detailed
     * comments about an atom site or a group of atom sites.
     * @return AtomSitesFootnote
     */
    org.rcsb.cif.model.generated.atomsitesfootnote.AtomSitesFootnote getAtomSitesFootnote();

    /**
     * Data items in the ATOM_TYPE category record details about the
     * properties of the atoms that occupy the atom sites, such as the
     * atomic scattering factors.
     * @return AtomType
     */
    org.rcsb.cif.model.generated.atomtype.AtomType getAtomType();

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
    org.rcsb.cif.model.generated.audit.Audit getAudit();

    /**
     * Data items in the AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return AuditAuthor
     */
    org.rcsb.cif.model.generated.auditauthor.AuditAuthor getAuditAuthor();

    /**
     * Data items in the AUDIT_CONFORM category describe the
     * dictionary versions against which the data names appearing in
     * the current data block are conformant.
     * @return AuditConform
     */
    org.rcsb.cif.model.generated.auditconform.AuditConform getAuditConform();

    /**
     * Data items in the AUDIT_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the content of this data block.
     * @return AuditContactAuthor
     */
    org.rcsb.cif.model.generated.auditcontactauthor.AuditContactAuthor getAuditContactAuthor();

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    org.rcsb.cif.model.generated.cell.Cell getCell();

    /**
     * Data items in the CELL_MEASUREMENT category record details
     * about the measurement of the crystallographic cell parameters.
     * @return CellMeasurement
     */
    org.rcsb.cif.model.generated.cellmeasurement.CellMeasurement getCellMeasurement();

    /**
     * Data items in the CELL_MEASUREMENT_REFLN category record
     * details about the reflections used to determine the
     * crystallographic cell parameters.
     *
     * The CELL_MEASUREMENT_REFLN data items would in general be used
     * only for diffractometer data.
     * @return CellMeasurementRefln
     */
    org.rcsb.cif.model.generated.cellmeasurementrefln.CellMeasurementRefln getCellMeasurementRefln();

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
    org.rcsb.cif.model.generated.chemcomp.ChemComp getChemComp();

    /**
     * Data items in the CHEM_COMP_ANGLE category record details about
     * angles in a chemical component. Angles are designated by three
     * atoms, with the second atom forming the vertex of the angle.
     * Target values may be specified as angles in degrees, as a
     * distance between the first and third atoms, or both.
     * @return ChemCompAngle
     */
    org.rcsb.cif.model.generated.chemcompangle.ChemCompAngle getChemCompAngle();

    /**
     * Data items in the CHEM_COMP_ATOM category record details about
     * the atoms in a chemical component. Specifying the atomic
     * coordinates for the components in this category is an
     * alternative to specifying the structure of the component
     * via bonds, angles, planes etc. in the appropriate
     * CHEM_COMP subcategories.
     * @return ChemCompAtom
     */
    org.rcsb.cif.model.generated.chemcompatom.ChemCompAtom getChemCompAtom();

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    org.rcsb.cif.model.generated.chemcompbond.ChemCompBond getChemCompBond();

    /**
     * Data items in the CHEM_COMP_CHIR category provide details about
     * the chiral centres in a chemical component. The atoms bonded
     * to the chiral atom are specified in the CHEM_COMP_CHIR_ATOM
     * category.
     * @return ChemCompChir
     */
    org.rcsb.cif.model.generated.chemcompchir.ChemCompChir getChemCompChir();

    /**
     * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom within a chemical component.
     * @return ChemCompChirAtom
     */
    org.rcsb.cif.model.generated.chemcompchiratom.ChemCompChirAtom getChemCompChirAtom();

    /**
     * Data items in the CHEM_COMP_LINK category give details about
     * the links between chemical components.
     * @return ChemCompLink
     */
    org.rcsb.cif.model.generated.chemcomplink.ChemCompLink getChemCompLink();

    /**
     * Data items in the CHEM_COMP_PLANE category provide identifiers
     * for the planes in a chemical component.  The atoms in the plane
     * are specified in the CHEM_COMP_PLANE_ATOM category.
     * @return ChemCompPlane
     */
    org.rcsb.cif.model.generated.chemcompplane.ChemCompPlane getChemCompPlane();

    /**
     * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
     * atoms in a plane within a chemical component.
     * @return ChemCompPlaneAtom
     */
    org.rcsb.cif.model.generated.chemcompplaneatom.ChemCompPlaneAtom getChemCompPlaneAtom();

    /**
     * Data items in the CHEM_COMP_TOR category record details about
     * the torsion angles in a chemical component. As torsion angles
     * can have more than one target value, the target values are
     * specified in the CHEM_COMP_TOR_VALUE category.
     * @return ChemCompTor
     */
    org.rcsb.cif.model.generated.chemcomptor.ChemCompTor getChemCompTor();

    /**
     * Data items in the CHEM_COMP_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_COMP_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemCompTorValue
     */
    org.rcsb.cif.model.generated.chemcomptorvalue.ChemCompTorValue getChemCompTorValue();

    /**
     * Data items in the CHEM_LINK category give details about
     * the links between chemical components.
     * @return ChemLink
     */
    org.rcsb.cif.model.generated.chemlink.ChemLink getChemLink();

    /**
     * Data items in the CHEM_LINK_ANGLE category record details
     * about angles in a link between chemical components.
     * @return ChemLinkAngle
     */
    org.rcsb.cif.model.generated.chemlinkangle.ChemLinkAngle getChemLinkAngle();

    /**
     * Data items in the CHEM_LINK_BOND category record details about
     * bonds in a link between components in the chemical structure.
     * @return ChemLinkBond
     */
    org.rcsb.cif.model.generated.chemlinkbond.ChemLinkBond getChemLinkBond();

    /**
     * Data items in the CHEM_LINK_CHIR category provide details about
     * the chiral centres in a link between two chemical components.
     * The atoms bonded to the chiral atom are specified in the
     * CHEM_LINK_CHIR_ATOM category.
     * @return ChemLinkChir
     */
    org.rcsb.cif.model.generated.chemlinkchir.ChemLinkChir getChemLinkChir();

    /**
     * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
     * atoms bonded to a chiral atom in a link between two
     * chemical components.
     * @return ChemLinkChirAtom
     */
    org.rcsb.cif.model.generated.chemlinkchiratom.ChemLinkChirAtom getChemLinkChirAtom();

    /**
     * Data items in the CHEM_LINK_PLANE category provide identifiers
     * for the planes in a link between two chemical components.
     * The atoms in the plane are specified in the CHEM_LINK_PLANE_ATOM
     * category.
     * @return ChemLinkPlane
     */
    org.rcsb.cif.model.generated.chemlinkplane.ChemLinkPlane getChemLinkPlane();

    /**
     * Data items in the CHEM_LINK_PLANE_ATOM category enumerate the
     * atoms in a plane in a link between two chemical components.
     * @return ChemLinkPlaneAtom
     */
    org.rcsb.cif.model.generated.chemlinkplaneatom.ChemLinkPlaneAtom getChemLinkPlaneAtom();

    /**
     * Data items in the CHEM_LINK_TOR category record details about
     * the torsion angles in a link between two chemical components.
     * As torsion angles can have more than one target value, the
     * target values are specified in the CHEM_LINK_TOR_VALUE category.
     * @return ChemLinkTor
     */
    org.rcsb.cif.model.generated.chemlinktor.ChemLinkTor getChemLinkTor();

    /**
     * Data items in the CHEM_LINK_TOR_VALUE category record details
     * about the target values for the torsion angles enumerated in the
     * CHEM_LINK_TOR list. Target values may be specified as angles
     * in degrees, as a distance between the first and fourth atoms, or
     * both.
     * @return ChemLinkTorValue
     */
    org.rcsb.cif.model.generated.chemlinktorvalue.ChemLinkTorValue getChemLinkTorValue();

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
    org.rcsb.cif.model.generated.chemical.Chemical getChemical();

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
    org.rcsb.cif.model.generated.chemicalconnatom.ChemicalConnAtom getChemicalConnAtom();

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
    org.rcsb.cif.model.generated.chemicalconnbond.ChemicalConnBond getChemicalConnBond();

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
    org.rcsb.cif.model.generated.chemicalformula.ChemicalFormula getChemicalFormula();

    /**
     * Data items in the CITATION category record details about the
     * literature cited as being relevant to the contents of the data
     * block.
     * @return Citation
     */
    org.rcsb.cif.model.generated.citation.Citation getCitation();

    /**
     * Data items in the CITATION_AUTHOR category record details
     * about the authors associated with the citations in the
     * CITATION list.
     * @return CitationAuthor
     */
    org.rcsb.cif.model.generated.citationauthor.CitationAuthor getCitationAuthor();

    /**
     * Data items in the CITATION_EDITOR category record details
     * about the editors associated with the books or book chapters
     * cited in the CITATION list.
     * @return CitationEditor
     */
    org.rcsb.cif.model.generated.citationeditor.CitationEditor getCitationEditor();

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
    org.rcsb.cif.model.generated.computing.Computing getComputing();

    /**
     * Data items in the DATABASE category have been superseded by
     * data items in the DATABASE_2 category. They are included
     * here only for compliance with older CIFs.
     * @return Database
     */
    org.rcsb.cif.model.generated.database.Database getDatabase();

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
    org.rcsb.cif.model.generated.database2.Database2 getDatabase2();

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
    org.rcsb.cif.model.generated.databasepdbcaveat.DatabasePDBCaveat getDatabasePDBCaveat();

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
    org.rcsb.cif.model.generated.databasepdbmatrix.DatabasePDBMatrix getDatabasePDBMatrix();

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
    org.rcsb.cif.model.generated.databasepdbremark.DatabasePDBRemark getDatabasePDBRemark();

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
    org.rcsb.cif.model.generated.databasepdbrev.DatabasePDBRev getDatabasePDBRev();

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
    org.rcsb.cif.model.generated.databasepdbrevrecord.DatabasePDBRevRecord getDatabasePDBRevRecord();

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
    org.rcsb.cif.model.generated.databasepdbtvect.DatabasePDBTvect getDatabasePDBTvect();

    /**
     * Data items in the DIFFRN category record details about the
     * diffraction data and their measurement.
     * @return Diffrn
     */
    org.rcsb.cif.model.generated.diffrn.Diffrn getDiffrn();

    /**
     * Data items in the DIFFRN_ATTENUATOR category record details
     * about the diffraction attenuator scales employed.
     * @return DiffrnAttenuator
     */
    org.rcsb.cif.model.generated.diffrnattenuator.DiffrnAttenuator getDiffrnAttenuator();

    /**
     * Data items in the DIFFRN_DETECTOR category describe the
     * detector used to measure the scattered radiation, including
     * any analyser and post-sample collimation.
     * @return DiffrnDetector
     */
    org.rcsb.cif.model.generated.diffrndetector.DiffrnDetector getDiffrnDetector();

    /**
     * Data items in the DIFFRN_MEASUREMENT category record details
     * about the device used to orient and/or position the crystal
     * during data measurement and the manner in which the diffraction
     * data were measured.
     * @return DiffrnMeasurement
     */
    org.rcsb.cif.model.generated.diffrnmeasurement.DiffrnMeasurement getDiffrnMeasurement();

    /**
     * Data items in the DIFFRN_ORIENT_MATRIX category record details
     * about the orientation matrix used in the measurement of the
     * diffraction data.
     * @return DiffrnOrientMatrix
     */
    org.rcsb.cif.model.generated.diffrnorientmatrix.DiffrnOrientMatrix getDiffrnOrientMatrix();

    /**
     * Data items in the DIFFRN_ORIENT_REFLN category record details
     * about the reflections that define the orientation matrix used in
     * the measurement of the diffraction intensities.
     * @return DiffrnOrientRefln
     */
    org.rcsb.cif.model.generated.diffrnorientrefln.DiffrnOrientRefln getDiffrnOrientRefln();

    /**
     * Data items in the DIFFRN_RADIATION category describe
     * the radiation used in measuring the diffraction intensities,
     * its collimation and monochromatization before the sample.
     *
     * Post-sample treatment of the beam is described by data
     * items in the DIFFRN_DETECTOR category.
     * @return DiffrnRadiation
     */
    org.rcsb.cif.model.generated.diffrnradiation.DiffrnRadiation getDiffrnRadiation();

    /**
     * Data items in the DIFFRN_RADIATION_WAVELENGTH category
     * describe the wavelength of the radiation used to measure the
     * diffraction intensities. Items may be looped to identify
     * and assign weights to distinct components of a
     * polychromatic beam.
     * @return DiffrnRadiationWavelength
     */
    org.rcsb.cif.model.generated.diffrnradiationwavelength.DiffrnRadiationWavelength getDiffrnRadiationWavelength();

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
    org.rcsb.cif.model.generated.diffrnrefln.DiffrnRefln getDiffrnRefln();

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
    org.rcsb.cif.model.generated.diffrnreflns.DiffrnReflns getDiffrnReflns();

    /**
     * Data items in the DIFFRN_SCALE_GROUP category record details
     * of the scaling factors applied to place all intensities in the
     * reflection lists on a common scale.
     * Scaling groups might, for example, correspond to each film in a
     * multi-film data set or each crystal in a multi-crystal data set.
     * @return DiffrnScaleGroup
     */
    org.rcsb.cif.model.generated.diffrnscalegroup.DiffrnScaleGroup getDiffrnScaleGroup();

    /**
     * Data items in the DIFFRN_SOURCE category record details of
     * the source of radiation used in the diffraction experiment.
     * @return DiffrnSource
     */
    org.rcsb.cif.model.generated.diffrnsource.DiffrnSource getDiffrnSource();

    /**
     * Data items in the DIFFRN_STANDARD_REFLN category record details
     * about the reflections treated as standards during the measurement
     * of a set of diffraction intensities.
     *
     * Note that these are the individual standard reflections, not the
     * results of the analysis of the standard reflections.
     * @return DiffrnStandardRefln
     */
    org.rcsb.cif.model.generated.diffrnstandardrefln.DiffrnStandardRefln getDiffrnStandardRefln();

    /**
     * Data items in the DIFFRN_STANDARDS category record details
     * about the set of standard reflections used to monitor intensity
     * stability during the measurement of diffraction intensities.
     *
     * Note that these records describe properties common to the set of
     * standard reflections, not the standard reflections themselves.
     * @return DiffrnStandards
     */
    org.rcsb.cif.model.generated.diffrnstandards.DiffrnStandards getDiffrnStandards();

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
    org.rcsb.cif.model.generated.entity.Entity getEntity();

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
    org.rcsb.cif.model.generated.entitykeywords.EntityKeywords getEntityKeywords();

    /**
     * Data items in the ENTITY_LINK category give details about
     * the links between entities.
     * @return EntityLink
     */
    org.rcsb.cif.model.generated.entitylink.EntityLink getEntityLink();

    /**
     * Data items in the ENTITY_NAME_COM category record the common name
     * or names associated with the entity. In some cases, the entity
     * name may not be the same as the name of the biological structure.
     * For example, haemoglobin alpha chain would be the entity common
     * name, not haemoglobin.
     * @return EntityNameCom
     */
    org.rcsb.cif.model.generated.entitynamecom.EntityNameCom getEntityNameCom();

    /**
     * Data items in the ENTITY_NAME_SYS category record the systematic
     * name or names associated with the entity and the system that
     * was used to construct the systematic name. In some cases, the
     * entity name may not be the same as the name of the biological
     * structure.
     * @return EntityNameSys
     */
    org.rcsb.cif.model.generated.entitynamesys.EntityNameSys getEntityNameSys();

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    org.rcsb.cif.model.generated.entitypoly.EntityPoly getEntityPoly();

    /**
     * Data items in the ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer. Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return EntityPolySeq
     */
    org.rcsb.cif.model.generated.entitypolyseq.EntityPolySeq getEntityPolySeq();

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    org.rcsb.cif.model.generated.entry.Entry getEntry();

    /**
     * Data items in the ENTRY_LINK category record the
     * relationships between the current data block
     * identified by _entry.id and other data blocks
     * within the current file which may be referenced
     * in the current data block.
     * @return EntryLink
     */
    org.rcsb.cif.model.generated.entrylink.EntryLink getEntryLink();

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    org.rcsb.cif.model.generated.exptl.Exptl getExptl();

    /**
     * Data items in the EXPTL_CRYSTAL category record the results of
     * experimental measurements on the crystal or crystals used,
     * such as shape, size or density.
     * @return ExptlCrystal
     */
    org.rcsb.cif.model.generated.exptlcrystal.ExptlCrystal getExptlCrystal();

    /**
     * Data items in the EXPTL_CRYSTAL_FACE category record details
     * of the crystal faces.
     * @return ExptlCrystalFace
     */
    org.rcsb.cif.model.generated.exptlcrystalface.ExptlCrystalFace getExptlCrystalFace();

    /**
     * Data items in the EXPTL_CRYSTAL_GROW category record details
     * about the conditions and methods used to grow the crystal.
     * @return ExptlCrystalGrow
     */
    org.rcsb.cif.model.generated.exptlcrystalgrow.ExptlCrystalGrow getExptlCrystalGrow();

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
    org.rcsb.cif.model.generated.exptlcrystalgrowcomp.ExptlCrystalGrowComp getExptlCrystalGrowComp();

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
    org.rcsb.cif.model.generated.geom.Geom getGeom();

    /**
     * Data items in the GEOM_ANGLE category record details about the
     * bond angles as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomAngle
     */
    org.rcsb.cif.model.generated.geomangle.GeomAngle getGeomAngle();

    /**
     * Data items in the GEOM_BOND category record details about
     * the bond lengths as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomBond
     */
    org.rcsb.cif.model.generated.geombond.GeomBond getGeomBond();

    /**
     * Data items in the GEOM_CONTACT category record details about
     * interatomic contacts as calculated from the contents
     * of the ATOM, CELL and SYMMETRY data.
     * @return GeomContact
     */
    org.rcsb.cif.model.generated.geomcontact.GeomContact getGeomContact();

    /**
     * Data items in the GEOM_HBOND category record details about
     * hydrogen bonds as calculated from the contents of the ATOM,
     * CELL and SYMMETRY data.
     * @return GeomHbond
     */
    org.rcsb.cif.model.generated.geomhbond.GeomHbond getGeomHbond();

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
    org.rcsb.cif.model.generated.geomtorsion.GeomTorsion getGeomTorsion();

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
    org.rcsb.cif.model.generated.journal.Journal getJournal();

    /**
     * Data items in the JOURNAL_INDEX category are used to list terms
     * used to generate the journal indexes.
     *
     * The creator of a data block will not normally specify these data
     * items.
     * @return JournalIndex
     */
    org.rcsb.cif.model.generated.journalindex.JournalIndex getJournalIndex();

    /**
     * Data items in the PHASING category record details about the
     * phasing of the structure, listing the various methods used in
     * the phasing process. Details about the application of each
     * method are listed in the appropriate subcategories.
     * @return Phasing
     */
    org.rcsb.cif.model.generated.phasing.Phasing getPhasing();

    /**
     * Data items in the PHASING_AVERAGING category record details
     * about the phasing of the structure where methods involving
     * averaging of multiple observations of the molecule in the
     * asymmetric unit are involved.
     * @return PhasingAveraging
     */
    org.rcsb.cif.model.generated.phasingaveraging.PhasingAveraging getPhasingAveraging();

    /**
     * Data items in the PHASING_ISOMORPHOUS category record details
     * about the phasing of the structure where a model isomorphous
     * to the structure being phased was used to generate the initial
     * phases.
     * @return PhasingIsomorphous
     */
    org.rcsb.cif.model.generated.phasingisomorphous.PhasingIsomorphous getPhasingIsomorphous();

    /**
     * Data items in the PHASING_MAD category record details about
     * the phasing of the structure where methods involving
     * multiple-wavelength anomalous-dispersion techniques are involved.
     * @return PhasingMAD
     */
    org.rcsb.cif.model.generated.phasingmad.PhasingMAD getPhasingMAD();

    /**
     * Data items in the PHASING_MAD_CLUST category record details
     * about a cluster of experiments that contributed to the
     * generation of a set of phases.
     * @return PhasingMADClust
     */
    org.rcsb.cif.model.generated.phasingmadclust.PhasingMADClust getPhasingMADClust();

    /**
     * Data items in the PHASING_MAD_EXPT category record details about
     * a MAD phasing experiment, such as the number of experiments that
     * were clustered together to produce a set of phases or the
     * statistics for those phases.
     * @return PhasingMADExpt
     */
    org.rcsb.cif.model.generated.phasingmadexpt.PhasingMADExpt getPhasingMADExpt();

    /**
     * Data items in the PHASING_MAD_RATIO category record
     * the ratios of phasing statistics between pairs of data sets
     * in a MAD phasing experiment, in given shells of resolution.
     * @return PhasingMADRatio
     */
    org.rcsb.cif.model.generated.phasingmadratio.PhasingMADRatio getPhasingMADRatio();

    /**
     * Data items in the PHASING_MAD_SET category record
     * details about the individual data sets used in a MAD phasing
     * experiment.
     * @return PhasingMADSet
     */
    org.rcsb.cif.model.generated.phasingmadset.PhasingMADSet getPhasingMADSet();

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
    org.rcsb.cif.model.generated.phasingmir.PhasingMIR getPhasingMIR();

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
    org.rcsb.cif.model.generated.phasingmirder.PhasingMIRDer getPhasingMIRDer();

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
    org.rcsb.cif.model.generated.phasingmirderrefln.PhasingMIRDerRefln getPhasingMIRDerRefln();

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
    org.rcsb.cif.model.generated.phasingmirdershell.PhasingMIRDerShell getPhasingMIRDerShell();

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
    org.rcsb.cif.model.generated.phasingmirdersite.PhasingMIRDerSite getPhasingMIRDerSite();

    /**
     * Data items in the PHASING_MIR_SHELL category record statistics
     * for an isomorphous replacement phasing experiment.broken
     * down into shells of resolution.
     * @return PhasingMIRShell
     */
    org.rcsb.cif.model.generated.phasingmirshell.PhasingMIRShell getPhasingMIRShell();

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
    org.rcsb.cif.model.generated.phasingset.PhasingSet getPhasingSet();

    /**
     * Data items in the PHASING_SET_REFLN category record the values
     * of the measured structure factors used in a phasing experiment.
     * This list may contain information from a number of different
     * data sets; _phasing_set_refln.set_id indicates the data set
     * to which a given record corresponds.
     * @return PhasingSetRefln
     */
    org.rcsb.cif.model.generated.phasingsetrefln.PhasingSetRefln getPhasingSetRefln();

    /**
     * Data items in the PUBL category are used when submitting a
     * manuscript for publication.
     * @return Publ
     */
    org.rcsb.cif.model.generated.publ.Publ getPubl();

    /**
     * Data items in the PUBL_AUTHOR category record details of
     * the authors of a manuscript submitted for publication.
     * @return PublAuthor
     */
    org.rcsb.cif.model.generated.publauthor.PublAuthor getPublAuthor();

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
    org.rcsb.cif.model.generated.publbody.PublBody getPublBody();

    /**
     * Data items in the PUBL_MANUSCRIPT_INCL category allow
     * the authors of a manuscript submitted for publication to list
     * data names that should be added to the standard request list
     * used by the journal printing software.
     * @return PublManuscriptIncl
     */
    org.rcsb.cif.model.generated.publmanuscriptincl.PublManuscriptIncl getPublManuscriptIncl();

    /**
     * Data items in the REFINE category record details about the
     * structure-refinement parameters.
     * @return Refine
     */
    org.rcsb.cif.model.generated.refine.Refine getRefine();

    /**
     * Data items in the REFINE_ANALYZE category record details
     * about the refined structure that are often used to analyze the
     * refinement and assess its quality. A given computer program
     * may or may not produce values corresponding to these data
     * names.
     * @return RefineAnalyze
     */
    org.rcsb.cif.model.generated.refineanalyze.RefineAnalyze getRefineAnalyze();

    /**
     * Data items in the REFINE_B_ISO category record details about
     * the treatment of isotropic B factors (displacement parameters)
     * during refinement.
     * @return RefineBIso
     */
    org.rcsb.cif.model.generated.refinebiso.RefineBIso getRefineBIso();

    /**
     * Data items in the REFINE_FUNCT_MINIMIZED category record
     * details about the individual terms of the function minimized
     * during refinement.
     * @return RefineFunctMinimized
     */
    org.rcsb.cif.model.generated.refinefunctminimized.RefineFunctMinimized getRefineFunctMinimized();

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
    org.rcsb.cif.model.generated.refinehist.RefineHist getRefineHist();

    /**
     * Data items in the REFINE_LS_RESTR category record details about
     * the restraints applied to various classes of parameters during
     * the least-squares refinement.
     * @return RefineLsRestr
     */
    org.rcsb.cif.model.generated.refinelsrestr.RefineLsRestr getRefineLsRestr();

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
    org.rcsb.cif.model.generated.refinelsrestrncs.RefineLsRestrNcs getRefineLsRestrNcs();

    /**
     * Data items in the REFINE_LS_RESTR_TYPE category record details
     * about the restraint types used in the least-squares refinement.
     * @return RefineLsRestrType
     */
    org.rcsb.cif.model.generated.refinelsrestrtype.RefineLsRestrType getRefineLsRestrType();

    /**
     * Data items in the REFINE_LS_SHELL category record details about
     * the results of the least-squares refinement broken down into
     * shells of resolution.
     * @return RefineLsShell
     */
    org.rcsb.cif.model.generated.refinelsshell.RefineLsShell getRefineLsShell();

    /**
     * Data items in the REFINE_OCCUPANCY category record details
     * about the treatment of atom occupancies during refinement.
     * @return RefineOccupancy
     */
    org.rcsb.cif.model.generated.refineoccupancy.RefineOccupancy getRefineOccupancy();

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
    org.rcsb.cif.model.generated.refln.Refln getRefln();

    /**
     * Data items in the REFLN_SYS_ABS category record details about
     * the reflection data that should be systematically absent,
     * given the designated space group.
     * @return ReflnSysAbs
     */
    org.rcsb.cif.model.generated.reflnsysabs.ReflnSysAbs getReflnSysAbs();

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
    org.rcsb.cif.model.generated.reflns.Reflns getReflns();

    /**
     * Data items in the REFLNS_SCALE category record details about
     * the structure-factor scales. They are referenced from within
     * the REFLN list through _refln.scale_group_code.
     * @return ReflnsScale
     */
    org.rcsb.cif.model.generated.reflnsscale.ReflnsScale getReflnsScale();

    /**
     * Data items in the REFLNS_SHELL category record details about
     * the reflection data used to determine the ATOM_SITE data items
     * broken down into shells of resolution.
     * @return ReflnsShell
     */
    org.rcsb.cif.model.generated.reflnsshell.ReflnsShell getReflnsShell();

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
    org.rcsb.cif.model.generated.software.Software getSoftware();

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    org.rcsb.cif.model.generated.struct.Struct getStruct();

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    org.rcsb.cif.model.generated.structasym.StructAsym getStructAsym();

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
    org.rcsb.cif.model.generated.structbiol.StructBiol getStructBiol();

    /**
     * Data items in the STRUCT_BIOL_GEN category record details about
     * the generation of each biological unit. The STRUCT_BIOL_GEN
     * data items provide the specifications of the components that
     * constitute that biological unit, which may include symmetry
     * elements.
     * @return StructBiolGen
     */
    org.rcsb.cif.model.generated.structbiolgen.StructBiolGen getStructBiolGen();

    /**
     * Data items in the STRUCT_BIOL_KEYWORDS category record
     * keywords that describe each biological unit.
     * @return StructBiolKeywords
     */
    org.rcsb.cif.model.generated.structbiolkeywords.StructBiolKeywords getStructBiolKeywords();

    /**
     * Data items in the STRUCT_BIOL_VIEW category record details
     * about how to draw and annotate an informative view of the
     * biological structure.
     * @return StructBiolView
     */
    org.rcsb.cif.model.generated.structbiolview.StructBiolView getStructBiolView();

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     *
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    org.rcsb.cif.model.generated.structconf.StructConf getStructConf();

    /**
     * Data items in the STRUCT_CONF_TYPE category record details
     * about the criteria used to identify backbone conformations of a
     * segment of polymer.
     * @return StructConfType
     */
    org.rcsb.cif.model.generated.structconftype.StructConfType getStructConfType();

    /**
     * Data items in the STRUCT_CONN category record details about
     * the connections between portions of the structure. These can be
     * hydrogen bonds, salt bridges, disulfide bridges and so on.
     *
     * The STRUCT_CONN_TYPE records define the criteria used to
     * identify these connections.
     * @return StructConn
     */
    org.rcsb.cif.model.generated.structconn.StructConn getStructConn();

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    org.rcsb.cif.model.generated.structconntype.StructConnType getStructConnType();

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    org.rcsb.cif.model.generated.structkeywords.StructKeywords getStructKeywords();

    /**
     * Data items in the STRUCT_MON_DETAILS category record details
     * about specifics of calculations summarized in data items in the
     * STRUCT_MON_PROT and STRUCT_MON_NUCL categories. These can
     * include the coefficients used in map calculations,
     * the radii used for including points in a calculation and so on.
     * @return StructMonDetails
     */
    org.rcsb.cif.model.generated.structmondetails.StructMonDetails getStructMonDetails();

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
    org.rcsb.cif.model.generated.structmonnucl.StructMonNucl getStructMonNucl();

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
    org.rcsb.cif.model.generated.structmonprot.StructMonProt getStructMonProt();

    /**
     * Data items in the STRUCT_MON_PROT_CIS category identify
     * monomers that have been found to have the peptide bond in the cis
     * conformation. The criterion used to select residues to be
     * designated as containing cis peptide bonds is given in
     * _struct_mon_details.prot_cis.
     * @return StructMonProtCis
     */
    org.rcsb.cif.model.generated.structmonprotcis.StructMonProtCis getStructMonProtCis();

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
    org.rcsb.cif.model.generated.structncsdom.StructNcsDom getStructNcsDom();

    /**
     * Data items in the STRUCT_NCS_DOM_LIM category identify the
     * start and end points of polypeptide chain segments
     * that form all or part of a domain in an ensemble of domains
     * related by noncrystallographic symmetry.
     * @return StructNcsDomLim
     */
    org.rcsb.cif.model.generated.structncsdomlim.StructNcsDomLim getStructNcsDomLim();

    /**
     * Data items in the STRUCT_NCS_ENS category record information
     * about ensembles of domains related by noncrystallographic
     * symmetry. The point group of the ensemble when taken as a
     * whole may be specified, as well as any special aspects of the
     * ensemble that require description.
     * @return StructNcsEns
     */
    org.rcsb.cif.model.generated.structncsens.StructNcsEns getStructNcsEns();

    /**
     * Data items in the STRUCT_NCS_ENS_GEN category list domains
     * related by a noncrystallographic symmetry operation and
     * identify the operator.
     * @return StructNcsEnsGen
     */
    org.rcsb.cif.model.generated.structncsensgen.StructNcsEnsGen getStructNcsEnsGen();

    /**
     * Data items in the STRUCT_NCS_OPER category describe the
     * noncrystallographic symmetry operations.
     *
     * Each operator is specified as a matrix and a subsequent
     * translation vector. Operators need not represent proper
     * rotations.
     * @return StructNcsOper
     */
    org.rcsb.cif.model.generated.structncsoper.StructNcsOper getStructNcsOper();

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
    org.rcsb.cif.model.generated.structref.StructRef getStructRef();

    /**
     * Data items in the STRUCT_REF_SEQ category provide a mechanism
     * for indicating and annotating a region (or regions) of alignment
     * between the sequence of an entity or biological unit described
     * in the data block and the sequence in the referenced database
     * entry.
     * @return StructRefSeq
     */
    org.rcsb.cif.model.generated.structrefseq.StructRefSeq getStructRefSeq();

    /**
     * Data items in the STRUCT_REF_SEQ_DIF category provide a
     * mechanism for indicating and annotating point differences
     * between the sequence of the entity or biological unit described
     * in the data block and the sequence of the referenced database
     * entry.
     * @return StructRefSeqDif
     */
    org.rcsb.cif.model.generated.structrefseqdif.StructRefSeqDif getStructRefSeqDif();

    /**
     * Data items in the STRUCT_SHEET category record details about
     * the beta-sheets.
     * @return StructSheet
     */
    org.rcsb.cif.model.generated.structsheet.StructSheet getStructSheet();

    /**
     * Data items in the STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta-
     * sheet. It is necessary to treat hydrogen bonding independently
     * of the designation of ranges, because the hydrogen bonding may
     * begin in different places for the interactions of a given strand
     * with the one preceding it and the one following it in the sheet.
     * @return StructSheetHbond
     */
    org.rcsb.cif.model.generated.structsheethbond.StructSheetHbond getStructSheetHbond();

    /**
     * Data items in the STRUCT_SHEET_ORDER category record details
     * about the order of the residue ranges that form a beta-sheet.
     * All order links are pairwise and the specified pairs are
     * assumed to be adjacent to one another in the sheet. These data
     * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
     * items and they allow all manner of sheets to be described.
     * @return StructSheetOrder
     */
    org.rcsb.cif.model.generated.structsheetorder.StructSheetOrder getStructSheetOrder();

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    org.rcsb.cif.model.generated.structsheetrange.StructSheetRange getStructSheetRange();

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
    org.rcsb.cif.model.generated.structsheettopology.StructSheetTopology getStructSheetTopology();

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    org.rcsb.cif.model.generated.structsite.StructSite getStructSite();

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    org.rcsb.cif.model.generated.structsitegen.StructSiteGen getStructSiteGen();

    /**
     * Data items in the STRUCT_SITE_KEYWORDS category record
     * keywords describing the site.
     * @return StructSiteKeywords
     */
    org.rcsb.cif.model.generated.structsitekeywords.StructSiteKeywords getStructSiteKeywords();

    /**
     * Data items in the STRUCT_SITE_VIEW category record details
     * about how to draw and annotate an informative view of the
     * site.
     * @return StructSiteView
     */
    org.rcsb.cif.model.generated.structsiteview.StructSiteView getStructSiteView();

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    org.rcsb.cif.model.generated.symmetry.Symmetry getSymmetry();

    /**
     * Data items in the SYMMETRY_EQUIV category list the
     * symmetry-equivalent positions for the space group.
     * @return SymmetryEquiv
     */
    org.rcsb.cif.model.generated.symmetryequiv.SymmetryEquiv getSymmetryEquiv();

    /**
     * Data items in the AUDIT_LINK category record details about the
     * relationships between data blocks in the current CIF.
     * @return AuditLink
     */
    org.rcsb.cif.model.generated.auditlink.AuditLink getAuditLink();

    /**
     * Data items in the DIFFRN_REFLNS_CLASS category record details
     * about the classes of reflections measured in the diffraction
     * experiment.
     * @return DiffrnReflnsClass
     */
    org.rcsb.cif.model.generated.diffrnreflnsclass.DiffrnReflnsClass getDiffrnReflnsClass();

    /**
     * Data items in the REFINE_LS_CLASS category record details
     * about the reflections used for the structure refinement
     * for each reflection class separately.
     * @return RefineLsClass
     */
    org.rcsb.cif.model.generated.refinelsclass.RefineLsClass getRefineLsClass();

    /**
     * Data items in the REFLNS_CLASS category record details
     * of the reflections used to determine the structural
     * parameters for each reflection class.
     * @return ReflnsClass
     */
    org.rcsb.cif.model.generated.reflnsclass.ReflnsClass getReflnsClass();

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
    org.rcsb.cif.model.generated.spacegroup.SpaceGroup getSpaceGroup();

    /**
     * Contains information about the symmetry operations of the
     * space group.
     * @return SpaceGroupSymop
     */
    org.rcsb.cif.model.generated.spacegroupsymop.SpaceGroupSymop getSpaceGroupSymop();

    /**
     * Data items in the VALENCE_PARAM category define the
     * parameters used for calculating bond valences from bond
     * lengths.  In addition to the parameters, a pointer
     * is given to the reference (in VALENCE_REF) from which
     * the bond-valence parameters were taken.
     * @return ValenceParam
     */
    org.rcsb.cif.model.generated.valenceparam.ValenceParam getValenceParam();

    /**
     * Data items in the VALENCE_REF category list the references
     * from which the bond-valence parameters have been taken.
     * @return ValenceRef
     */
    org.rcsb.cif.model.generated.valenceref.ValenceRef getValenceRef();

    /**
     * The PDBX_AUDIT holds current version information.
     * @return PdbxAudit
     */
    org.rcsb.cif.model.generated.pdbxaudit.PdbxAudit getPdbxAudit();

    /**
     * Data items in the PDBX_VERSION category record details about the
     * version of this entry.
     * @return PdbxVersion
     */
    org.rcsb.cif.model.generated.pdbxversion.PdbxVersion getPdbxVersion();

    /**
     * Data items in the PDBX_AUDIT_AUTHOR category record details about
     * the author(s) of the data block.
     * @return PdbxAuditAuthor
     */
    org.rcsb.cif.model.generated.pdbxauditauthor.PdbxAuditAuthor getPdbxAuditAuthor();

    /**
     * The PDBX_DATABASE_MESSAGE category provides information about
     * correspondance related to a structure deposition.
     * @return PdbxDatabaseMessage
     */
    org.rcsb.cif.model.generated.pdbxdatabasemessage.PdbxDatabaseMessage getPdbxDatabaseMessage();

    /**
     * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
     * for information on obsolete/superseded PDB entries
     * @return PdbxDatabasePDBObsSpr
     */
    org.rcsb.cif.model.generated.pdbxdatabasepdbobsspr.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr();

    /**
     * Internal records to track the data processing cycle.
     * @return PdbxDatabaseProc
     */
    org.rcsb.cif.model.generated.pdbxdatabaseproc.PdbxDatabaseProc getPdbxDatabaseProc();

    /**
     *
     * Data items in the PDBX_DATABASE_REMARK category record keep additional
     * information about the entry.  They are mostly used to create
     * 'non-standard' PDB REMARK annotations (6-99).
     * @return PdbxDatabaseRemark
     */
    org.rcsb.cif.model.generated.pdbxdatabaseremark.PdbxDatabaseRemark getPdbxDatabaseRemark();

    /**
     * These are internal RCSB records to keep track of data processing
     * and status of the entry.
     * @return PdbxDatabaseStatus
     */
    org.rcsb.cif.model.generated.pdbxdatabasestatus.PdbxDatabaseStatus getPdbxDatabaseStatus();

    /**
     * The PDBX_ENTITY_NAME records additional name information for
     * each entity.
     * @return PdbxEntityName
     */
    org.rcsb.cif.model.generated.pdbxentityname.PdbxEntityName getPdbxEntityName();

    /**
     * This category provides a placeholder for pre-release
     * sequence information.  After release this category
     * should be discarded.
     * @return PdbxPrereleaseSeq
     */
    org.rcsb.cif.model.generated.pdbxprereleaseseq.PdbxPrereleaseSeq getPdbxPrereleaseSeq();

    /**
     * The PDBX_POLY_SEQ_SCHEME category provides residue level nomenclature
     * mapping for polymer entities.
     * @return PdbxPolySeqScheme
     */
    org.rcsb.cif.model.generated.pdbxpolyseqscheme.PdbxPolySeqScheme getPdbxPolySeqScheme();

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    org.rcsb.cif.model.generated.pdbxnonpolyscheme.PdbxNonpolyScheme getPdbxNonpolyScheme();

    /**
     * Data items in the PDBX_REFINE category record details about
     * additional structure refinement parameters which are needed
     * to complete legacy REMARK 3 refinement templates in PDB
     * format files.
     * @return PdbxRefine
     */
    org.rcsb.cif.model.generated.pdbxrefine.PdbxRefine getPdbxRefine();

    /**
     * Data items in the PDBX_STRUCT_SHEET_HBOND category record details
     * about the hydrogen bonding between residue ranges in a beta sheet.
     * This category is provided for cases where only a single hydrogen
     * bond is used to register the two residue ranges.   Category
     * STRUCT_SHEET_HBOND should be used when the initial and terminal
     * hydrogen bonds for strand pair are known.
     * @return PdbxStructSheetHbond
     */
    org.rcsb.cif.model.generated.pdbxstructsheethbond.PdbxStructSheetHbond getPdbxStructSheetHbond();

    /**
     *
     * Parameter and topology files used in X-PLOR/CNS refinement.
     * @return PdbxXplorFile
     */
    org.rcsb.cif.model.generated.pdbxxplorfile.PdbxXplorFile getPdbxXplorFile();

    /**
     *
     * Auxilary parameter and topology files used in refinement.
     * @return PdbxRefineAuxFile
     */
    org.rcsb.cif.model.generated.pdbxrefineauxfile.PdbxRefineAuxFile getPdbxRefineAuxFile();

    /**
     * Data items in PDBX_DATABASE_RELATED contain references to entries
     * that are related to the this entry.
     * @return PdbxDatabaseRelated
     */
    org.rcsb.cif.model.generated.pdbxdatabaserelated.PdbxDatabaseRelated getPdbxDatabaseRelated();

    /**
     * The PDBX_ENTITY_ASSEMBLY category provides a chemical description
     * of the biological assembly studied in terms of its constituent
     * entities.
     * @return PdbxEntityAssembly
     */
    org.rcsb.cif.model.generated.pdbxentityassembly.PdbxEntityAssembly getPdbxEntityAssembly();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
     * details about the components of the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowComp
     */
    org.rcsb.cif.model.generated.pdbxexptlcrystalgrowcomp.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
     * details about the solutions that were 'mixed'
     * to produce the crystal.
     * @return PdbxExptlCrystalGrowSol
     */
    org.rcsb.cif.model.generated.pdbxexptlcrystalgrowsol.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol();

    /**
     * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
     * record details cryogenic treatments applied to this crystal.
     * @return PdbxExptlCrystalCryoTreatment
     */
    org.rcsb.cif.model.generated.pdbxexptlcrystalcryotreatment.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment();

    /**
     * Data items in the REFINE_TLS category record details about
     * TLS parameters used in structure refinement. Note that the
     * intention is primarily to describe directly refined TLS
     * parameters, although other methods of obtaining TLS parameters
     * may be covered, see item _pdbx_refine_tls.method
     * @return PdbxRefineTls
     */
    org.rcsb.cif.model.generated.pdbxrefinetls.PdbxRefineTls getPdbxRefineTls();

    /**
     * Data items in the PDBX_REFINE_TLS_GROUP category record details about
     * a fragment of a TLS group.
     *
     * Properties of the TLS group are recorded in PDBX_REFINE_TLS
     * @return PdbxRefineTlsGroup
     */
    org.rcsb.cif.model.generated.pdbxrefinetlsgroup.PdbxRefineTlsGroup getPdbxRefineTlsGroup();

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the name and address of the author to be contacted
     * concerning the contents of this data block.  This category atomizes
     * information to a greater degree than the standard AUDIT_CONTACT_AUTHOR
     * category.
     * @return PdbxContactAuthor
     */
    org.rcsb.cif.model.generated.pdbxcontactauthor.PdbxContactAuthor getPdbxContactAuthor();

    /**
     * Data items in the PDBX_CONTACT_AUTHOR category record details
     * about the Structural Genomics Project and name and initials
     * for each Center.
     * @return PdbxSGProject
     */
    org.rcsb.cif.model.generated.pdbxsgproject.PdbxSGProject getPdbxSGProject();

    /**
     * Data items in the PDBX_ATOM_SITE_ANISO_TLS category record details
     * about the TLS contribution to anisotropic displacement parameters.
     * @return PdbxAtomSiteAnisoTls
     */
    org.rcsb.cif.model.generated.pdbxatomsiteanisotls.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls();

    /**
     *
     * Experimental details of the NMR study that have not been
     * described elsewhere in this deposition.
     * @return PdbxNmrDetails
     */
    org.rcsb.cif.model.generated.pdbxnmrdetails.PdbxNmrDetails getPdbxNmrDetails();

    /**
     *
     * Complete description of each NMR sample, including the solvent
     * system used.
     * @return PdbxNmrSampleDetails
     */
    org.rcsb.cif.model.generated.pdbxnmrsampledetails.PdbxNmrSampleDetails getPdbxNmrSampleDetails();

    /**
     * The chemical constituents of
     * each NMR sample. Each sample is identified by a number and
     * each component in the sample is identified by name.
     * @return PdbxNmrExptlSample
     */
    org.rcsb.cif.model.generated.pdbxnmrexptlsample.PdbxNmrExptlSample getPdbxNmrExptlSample();

    /**
     *
     * The experimental conditions used to for each sample.  Each set of conditions
     * is identified by a numerical code.
     * @return PdbxNmrExptlSampleConditions
     */
    org.rcsb.cif.model.generated.pdbxnmrexptlsampleconditions.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions();

    /**
     *
     * The details about each spectrometer used to collect data for this
     * deposition.
     * @return PdbxNmrSpectrometer
     */
    org.rcsb.cif.model.generated.pdbxnmrspectrometer.PdbxNmrSpectrometer getPdbxNmrSpectrometer();

    /**
     *
     * In this section, enter information on those experiments that were
     * used to generate constraint data. For each NMR experiment indicate
     * which sample and which sample conditions were used for the experiment.
     * @return PdbxNmrExptl
     */
    org.rcsb.cif.model.generated.pdbxnmrexptl.PdbxNmrExptl getPdbxNmrExptl();

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return PdbxNmrSoftware
     */
    org.rcsb.cif.model.generated.pdbxnmrsoftware.PdbxNmrSoftware getPdbxNmrSoftware();

    /**
     * This section provides a tabulation of constraint data.
     * @return PdbxNmrConstraints
     */
    org.rcsb.cif.model.generated.pdbxnmrconstraints.PdbxNmrConstraints getPdbxNmrConstraints();

    /**
     * This category contains the information that describes the
     * ensemble of deposited structures. If only an average structure
     * has been deposited skip this section.
     * @return PdbxNmrEnsemble
     */
    org.rcsb.cif.model.generated.pdbxnmrensemble.PdbxNmrEnsemble getPdbxNmrEnsemble();

    /**
     * Structural statistics are derived from molecular dynamics and simulated annealing
     * programs.
     * @return PdbxNmrEnsembleRms
     */
    org.rcsb.cif.model.generated.pdbxnmrensemblerms.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms();

    /**
     * An average structure is often calculated in addition to the ensemble, or one
     * of the ensemble is selected as a representative structure. This section
     * describes selection of the representative structure.
     * @return PdbxNmrRepresentative
     */
    org.rcsb.cif.model.generated.pdbxnmrrepresentative.PdbxNmrRepresentative getPdbxNmrRepresentative();

    /**
     *
     * Describe the method and details of the refinement of the deposited structure.
     * @return PdbxNmrRefine
     */
    org.rcsb.cif.model.generated.pdbxnmrrefine.PdbxNmrRefine getPdbxNmrRefine();

    /**
     *
     * The final force constants, including units, employed for the various
     * experimental constraints, covalent geometry constraints, and the non-bonded
     * interaction terms in the target function used for simulated annealing.
     * @return PdbxNmrForceConstants
     */
    org.rcsb.cif.model.generated.pdbxnmrforceconstants.PdbxNmrForceConstants getPdbxNmrForceConstants();

    /**
     * Data items in the NDB_STRUCT_CONF_NA category
     * describes secondary structure features in this entry.
     * @return NdbStructConfNa
     */
    org.rcsb.cif.model.generated.ndbstructconfna.NdbStructConfNa getNdbStructConfNa();

    /**
     * Data items in the NDB_STRUCT_FEATURE_NA category
     * describes tertiary and other special structural
     * features in this entry.
     * @return NdbStructFeatureNa
     */
    org.rcsb.cif.model.generated.ndbstructfeaturena.NdbStructFeatureNa getNdbStructFeatureNa();

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details
     * of base pairing interactions.
     * @return NdbStructNaBasePair
     */
    org.rcsb.cif.model.generated.ndbstructnabasepair.NdbStructNaBasePair getNdbStructNaBasePair();

    /**
     * Data items in the NDB_STRUCT_NA_BASE_PAIR_STEP category record details
     * of base pair step interactions.
     * @return NdbStructNaBasePairStep
     */
    org.rcsb.cif.model.generated.ndbstructnabasepairstep.NdbStructNaBasePairStep getNdbStructNaBasePairStep();

    /**
     * Placeholder category for PDB coordinate data.
     * @return NdbOriginalNdbCoordinates
     */
    org.rcsb.cif.model.generated.ndboriginalndbcoordinates.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates();

    /**

     * @return PdbxEntityNonpoly
     */
    org.rcsb.cif.model.generated.pdbxentitynonpoly.PdbxEntityNonpoly getPdbxEntityNonpoly();

    /**
     * Data items in the PDBX_PHASING_DM category record details about
     * density modification
     * @return PdbxPhasingDm
     */
    org.rcsb.cif.model.generated.pdbxphasingdm.PdbxPhasingDm getPdbxPhasingDm();

    /**
     * Data items in the PDBX_PHASING_DM_SHELL category record details about
     * density modification in resolution shell.
     * @return PdbxPhasingDmShell
     */
    org.rcsb.cif.model.generated.pdbxphasingdmshell.PdbxPhasingDmShell getPdbxPhasingDmShell();

    /**
     * Data items in the PDBX_PHASING_MAD_SHELL category record details about
     * the phasing of the structure, when methods involving multiple
     * anomalous dispersion techniques are involved (note: the
     * values are overall, but broken down into shells of resolution)
     * @return PdbxPhasingMADShell
     */
    org.rcsb.cif.model.generated.pdbxphasingmadshell.PdbxPhasingMADShell getPdbxPhasingMADShell();

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
    org.rcsb.cif.model.generated.pdbxphasingmadset.PdbxPhasingMADSet getPdbxPhasingMADSet();

    /**
     * The same as category pdbx_phasing_MAD_set, but
     * broken into shells.
     * @return PdbxPhasingMADSetShell
     */
    org.rcsb.cif.model.generated.pdbxphasingmadsetshell.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell();

    /**
     * record the details (coordinates etc.) of anomalous scatters.
     * @return PdbxPhasingMADSetSite
     */
    org.rcsb.cif.model.generated.pdbxphasingmadsetsite.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite();

    /**
     * Data items in the PDBX_PHASING_MR category record details about
     * molecular replacement.
     * @return PdbxPhasingMR
     */
    org.rcsb.cif.model.generated.pdbxphasingmr.PdbxPhasingMR getPdbxPhasingMR();

    /**
     * Data items in the PDBX_REFINE_COMPONENT category record
     * statistics of the final model relative to the density map.
     * @return PdbxRefineComponent
     */
    org.rcsb.cif.model.generated.pdbxrefinecomponent.PdbxRefineComponent getPdbxRefineComponent();

    /**
     * This category contains descriptive protocols for the production
     * of this entity.
     * @return PdbxEntityProdProtocol
     */
    org.rcsb.cif.model.generated.pdbxentityprodprotocol.PdbxEntityProdProtocol getPdbxEntityProdProtocol();

    /**
     * This category contains details for process steps that are
     * not explicitly catered for elsewhere. It provides some basic
     * details as well as placeholders for a list of parameters and
     * values (the category PDBX_ENTITY_SRC_GEN_PROD_OTHER_PARAMETER).
     * Note that processes that have been modelled explicitly should
     * not be represented using this category.
     * @return PdbxEntitySrcGenProdOther
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenprodother.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther();

    /**
     * This category contains parameters and values required to capture
     * information about a particular process step
     * @return PdbxEntitySrcGenProdOtherParameter
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenprodotherparameter.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter();

    /**
     * This category contains details for the PCR steps used in
     * the overall protein production process. The PCR is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdPcr
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenprodpcr.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr();

    /**
     * This category contains details for the DIGEST steps used in
     * the overall protein production process. The digestion is assumed
     * to be applied to the result of the previous production step, or the
     * gene source if this is the first production step.
     * @return PdbxEntitySrcGenProdDigest
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenproddigest.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest();

    /**
     * This category contains details for the cloning steps used in
     * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
     * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
     * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
     * provided data in the later two categories may be omitted.
     * @return PdbxEntitySrcGenClone
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenclone.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone();

    /**
     * This category contains details for the ligation-based cloning steps used in
     * the overall protein production process.
     * _pdbx_entity_src_gen_clone_ligation.clone_step_id in this category
     * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
     * to cover ligation dependent cloning steps.
     * @return PdbxEntitySrcGenCloneLigation
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgencloneligation.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation();

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
    org.rcsb.cif.model.generated.pdbxentitysrcgenclonerecombination.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination();

    /**
     * This category contains details for the EXPRESSION steps used in
     * the overall protein production process. It is hoped that this category
     * will cover all forms of cell-based expression by reading induction as
     * induction/transformation/transfection.
     * @return PdbxEntitySrcGenExpress
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenexpress.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress();

    /**
     * This category contains details for OD time series used to monitor a
     * given EXPRESSION step used in the overall protein production process.
     * @return PdbxEntitySrcGenExpressTimepoint
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenexpresstimepoint.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint();

    /**
     * This category contains details for the cell lysis steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenLysis
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenlysis.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis();

    /**
     * This category contains details for the refolding steps used in
     * the overall protein production process.
     * @return PdbxEntitySrcGenRefold
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenrefold.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold();

    /**
     * This category contains details for the protein purification
     * tag removal steps used in the overall protein production process
     * @return PdbxEntitySrcGenProteolysis
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenproteolysis.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis();

    /**
     * This category contains details for the chromatographic steps used in the
     * purification of the protein.
     * @return PdbxEntitySrcGenChrom
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenchrom.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom();

    /**
     * This category contains details for the fraction steps used in
     * the overall protein production process. Examples of fractionation
     * steps are centrifugation and magnetic bead pull-down purification.
     * @return PdbxEntitySrcGenFract
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenfract.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract();

    /**
     * This category contains details for the final purified protein product. Note
     * that this category does not contain the amino acid sequence of the protein.
     * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
     * entity_id.
     * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
     * no step_id for this category.
     * @return PdbxEntitySrcGenPure
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgenpure.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure();

    /**
     * This category contains details of protein characterisation. It
     * refers to the characteristion of the product of a specific
     * step.
     * @return PdbxEntitySrcGenCharacter
     */
    org.rcsb.cif.model.generated.pdbxentitysrcgencharacter.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter();

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
    org.rcsb.cif.model.generated.pdbxconstruct.PdbxConstruct getPdbxConstruct();

    /**
     * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
     * specify various properties of a nucleic acid sequence used during
     * protein production.
     * @return PdbxConstructFeature
     */
    org.rcsb.cif.model.generated.pdbxconstructfeature.PdbxConstructFeature getPdbxConstructFeature();

    /**
     * The details about each robotic system used to collect data for this
     * project.
     * @return PdbxRobotSystem
     */
    org.rcsb.cif.model.generated.pdbxrobotsystem.PdbxRobotSystem getPdbxRobotSystem();

    /**
     * Data items in the PDBX_BUFFER category
     * record details of the sample buffer.
     * @return PdbxBuffer
     */
    org.rcsb.cif.model.generated.pdbxbuffer.PdbxBuffer getPdbxBuffer();

    /**
     * Constituents of buffer in sample
     * @return PdbxBufferComponents
     */
    org.rcsb.cif.model.generated.pdbxbuffercomponents.PdbxBufferComponents getPdbxBufferComponents();

    /**
     * Data items in the PDBX_DOMAIN category record information
     * about domain definitions.
     *
     * A domain need not correspond to a completely polypeptide chain;
     * it can be composed of one or more segments in a single chain,
     * or by segments from more than one chain.
     * @return PdbxDomain
     */
    org.rcsb.cif.model.generated.pdbxdomain.PdbxDomain getPdbxDomain();

    /**
     * Data items in the PDBX_DOMAIN_RANGE category identify the
     * beginning and ending points of polypeptide chain segments
     * that form all or part of a domain.
     * @return PdbxDomainRange
     */
    org.rcsb.cif.model.generated.pdbxdomainrange.PdbxDomainRange getPdbxDomainRange();

    /**
     * Data items in the PDBX_SEQUENCE_RANGE category identify the
     * beginning and ending points of polypeptide sequence segments.
     * @return PdbxSequenceRange
     */
    org.rcsb.cif.model.generated.pdbxsequencerange.PdbxSequenceRange getPdbxSequenceRange();

    /**
     * Data items in the PDBX_FEATURE_ENTRY category records
     * information about properties pertaining to this
     * structure entry.
     * @return PdbxFeatureEntry
     */
    org.rcsb.cif.model.generated.pdbxfeatureentry.PdbxFeatureEntry getPdbxFeatureEntry();

    /**
     * Data items in the PDBX_FEATURE_DOMAIN category records
     * information about properties pertaining to this structure
     * domain.
     * @return PdbxFeatureDomain
     */
    org.rcsb.cif.model.generated.pdbxfeaturedomain.PdbxFeatureDomain getPdbxFeatureDomain();

    /**
     * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category
     * records information about properties pertaining to
     * this structure sequence_range.
     * @return PdbxFeatureSequenceRange
     */
    org.rcsb.cif.model.generated.pdbxfeaturesequencerange.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange();

    /**
     * Data items in the PDBX_FEATURE_ASSEMBLY category records
     * information about properties pertaining to this
     * structural assembly.
     * @return PdbxFeatureAssembly
     */
    org.rcsb.cif.model.generated.pdbxfeatureassembly.PdbxFeatureAssembly getPdbxFeatureAssembly();

    /**
     * Data items in the PDBX_FEATURE_MONOMER category records
     * information about properties pertaining to particular
     * monomers in this structure.
     * @return PdbxFeatureMonomer
     */
    org.rcsb.cif.model.generated.pdbxfeaturemonomer.PdbxFeatureMonomer getPdbxFeatureMonomer();

    /**
     * Data items in the pdbx_exptl_pd record information about
     * powder sample preparations.
     * @return PdbxExptlPd
     */
    org.rcsb.cif.model.generated.pdbxexptlpd.PdbxExptlPd getPdbxExptlPd();

    /**
     * Details decribing crystallographic twinning.
     * @return PdbxReflnsTwin
     */
    org.rcsb.cif.model.generated.pdbxreflnstwin.PdbxReflnsTwin getPdbxReflnsTwin();

    /**
     * Special features of this structural entry.
     * @return PdbxStructInfo
     */
    org.rcsb.cif.model.generated.pdbxstructinfo.PdbxStructInfo getPdbxStructInfo();

    /**
     * Describes the origin of the experimental data used in this
     * entry.
     * @return PdbxReRefinement
     */
    org.rcsb.cif.model.generated.pdbxrerefinement.PdbxReRefinement getPdbxReRefinement();

    /**
     * Properties and features of structural assemblies.
     * @return PdbxStructAssemblyProp
     */
    org.rcsb.cif.model.generated.pdbxstructassemblyprop.PdbxStructAssemblyProp getPdbxStructAssemblyProp();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
     * mechanism for identifying and annotating sequence features.
     * @return PdbxStructRefSeqFeature
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqfeature.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature();

    /**
     *
     * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
     * mechanism for identifying and annotating properties of sequence features.
     * @return PdbxStructRefSeqFeatureProp
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqfeatureprop.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp();

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_DIAGNOSTICS category provides
     * structural diagnostics in chemical components instances.
     * @return PdbxStructChemCompDiagnostics
     */
    org.rcsb.cif.model.generated.pdbxstructchemcompdiagnostics.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompFeature
     */
    org.rcsb.cif.model.generated.pdbxchemcompfeature.PdbxChemCompFeature getPdbxChemCompFeature();

    /**
     * The details of the composition of the coordinate model.
     * @return PdbxCoordinateModel
     */
    org.rcsb.cif.model.generated.pdbxcoordinatemodel.PdbxCoordinateModel getPdbxCoordinateModel();

    /**
     * Data items in the PDBX_STRUCT_CHEM_COMP_FEATURE category provides
     * structural annotations in chemical components instances.
     * @return PdbxStructChemCompFeature
     */
    org.rcsb.cif.model.generated.pdbxstructchemcompfeature.PdbxStructChemCompFeature getPdbxStructChemCompFeature();

    /**
     * Data items in the DIFFRN_REFLNS_SHELL category record details about
     * the reflection data set within shells of resolution.
     * @return PdbxDiffrnReflnsShell
     */
    org.rcsb.cif.model.generated.pdbxdiffrnreflnsshell.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell();

    /**
     * This category provides a table of upper and lower distance
     * limits used as criteria in determining covalent bonds.
     * The table is organized by atom type pairs.
     * @return PdbxBondDistanceLimits
     */
    org.rcsb.cif.model.generated.pdbxbonddistancelimits.PdbxBondDistanceLimits getPdbxBondDistanceLimits();

    /**
     * Data items in the PDBX_SOLN_SCATTER category record details about a
     * solution scattering experiment
     * @return PdbxSolnScatter
     */
    org.rcsb.cif.model.generated.pdbxsolnscatter.PdbxSolnScatter getPdbxSolnScatter();

    /**
     * Data items in the PDBX_SOLN_SCATTER_MODEL category record details about the
     * homology model fitting to the solution scatter data.
     * @return PdbxSolnScatterModel
     */
    org.rcsb.cif.model.generated.pdbxsolnscattermodel.PdbxSolnScatterModel getPdbxSolnScatterModel();

    /**
     * Data items in the CHEM_COMP_DESCRIPTOR category provide
     * string descriptors of component chemical structure.
     * @return PdbxChemCompDescriptor
     */
    org.rcsb.cif.model.generated.pdbxchemcompdescriptor.PdbxChemCompDescriptor getPdbxChemCompDescriptor();

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    org.rcsb.cif.model.generated.pdbxchemcompidentifier.PdbxChemCompIdentifier getPdbxChemCompIdentifier();

    /**
     * Data items in the PDBX_CHEM_COMP_IMPORT category identify
     * existing chemical components to be imported into the
     * current component definition.  Components in this list
     * can be edited by instructions in categories
     * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
     * @return PdbxChemCompImport
     */
    org.rcsb.cif.model.generated.pdbxchemcompimport.PdbxChemCompImport getPdbxChemCompImport();

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
     * atom level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompAtomEdit
     */
    org.rcsb.cif.model.generated.pdbxchemcompatomedit.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit();

    /**
     * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
     * bond level editing instructions to be applied to imported
     * chemical components.
     * @return PdbxChemCompBondEdit
     */
    org.rcsb.cif.model.generated.pdbxchemcompbondedit.PdbxChemCompBondEdit getPdbxChemCompBondEdit();

    /**
     * Data items in the PDBX_CHEM_COMP_AUDIT category records
     * the status and tracking information for this component.
     * @return PdbxChemCompAudit
     */
    org.rcsb.cif.model.generated.pdbxchemcompaudit.PdbxChemCompAudit getPdbxChemCompAudit();

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
    org.rcsb.cif.model.generated.pdbxvalidateclosecontact.PdbxValidateCloseContact getPdbxValidateCloseContact();

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
    org.rcsb.cif.model.generated.pdbxvalidatesymmcontact.PdbxValidateSymmContact getPdbxValidateSymmContact();

    /**
     * Data items in the PDBX_VALIDATE_RMSD_BOND category list the
     * covalent bonds that have values which deviate from expected
     * values by more than 6*rmsd.
     * @return PdbxValidateRmsdBond
     */
    org.rcsb.cif.model.generated.pdbxvalidatermsdbond.PdbxValidateRmsdBond getPdbxValidateRmsdBond();

    /**
     * Data items in the PDBX_VALIDATE_RMSD_ANGLE category list the
     * the covalent bond angles found in an entry that have
     * values which deviate from expected values by more
     * than 6*rmsd for the particular entry from the expected standard
     * value
     * @return PdbxValidateRmsdAngle
     */
    org.rcsb.cif.model.generated.pdbxvalidatermsdangle.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle();

    /**
     * Data items in the PDBX_VALIDATE_TORSION category list the
     * residues with torsion angles outside the expected ramachandran regions
     * @return PdbxValidateTorsion
     */
    org.rcsb.cif.model.generated.pdbxvalidatetorsion.PdbxValidateTorsion getPdbxValidateTorsion();

    /**
     * Data items in the PDBX_VALIDATE_PEPTIDE_OMEGA category list the
     * residues that contain peptide bonds deviate
     * significantly from both cis and trans conformation.
     * cis bonds, if any, are listed on cispep records.
     * trans is defined as 180 +/- 30 and
     * cis is defined as 0 +/- 30 degrees.
     * @return PdbxValidatePeptideOmega
     */
    org.rcsb.cif.model.generated.pdbxvalidatepeptideomega.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega();

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
    org.rcsb.cif.model.generated.pdbxvalidatechiral.PdbxValidateChiral getPdbxValidateChiral();

    /**
     * Data items in the PDBX_VALIDATE_PLANES category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanes
     */
    org.rcsb.cif.model.generated.pdbxvalidateplanes.PdbxValidatePlanes getPdbxValidatePlanes();

    /**
     * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
     * residues that contain unexpected deviations from planes
     * centers.
     * @return PdbxValidatePlanesAtom
     */
    org.rcsb.cif.model.generated.pdbxvalidateplanesatom.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom();

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
    org.rcsb.cif.model.generated.pdbxvalidatemainchainplane.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane();

    /**
     * Data items in the PDBX_STRUCT_CONN_ANGLE category record the angles
     * in connections between portions of the structure.
     * @return PdbxStructConnAngle
     */
    org.rcsb.cif.model.generated.pdbxstructconnangle.PdbxStructConnAngle getPdbxStructConnAngle();

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_RESIDUES category list the
     * residues within the entry that are not observed or have zero occupancy.
     * @return PdbxUnobsOrZeroOccResidues
     */
    org.rcsb.cif.model.generated.pdbxunobsorzerooccresidues.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues();

    /**
     * Data items in the PDBX_UNOBS_OR_ZERO_OCC_ATOMS category list the
     * atoms within the entry that are either unobserved or have zero occupancy/
     * @return PdbxUnobsOrZeroOccAtoms
     */
    org.rcsb.cif.model.generated.pdbxunobsorzerooccatoms.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms();

    /**
     * Data items in the PDBX_ENTRY_DETAILS category provide additional
     * details about this entry.
     * @return PdbxEntryDetails
     */
    org.rcsb.cif.model.generated.pdbxentrydetails.PdbxEntryDetails getPdbxEntryDetails();

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    org.rcsb.cif.model.generated.pdbxstructmodresidue.PdbxStructModResidue getPdbxStructModResidue();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate insertions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqInsertion
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqinsertion.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
     * annotate deletions in the sequence of the entity described
     * in the referenced database entry.
     * @return PdbxStructRefSeqDeletion
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqdeletion.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion();

    /**
     * Data items in the PDBX_REMEDIATION_ATOM_SITE_MAPPING category records
     * mapping information between selected molecular entities that have been
     * chemically redefined.   The prior and current atom nomenclature is
     * tabulated in this category.
     * @return PdbxRemediationAtomSiteMapping
     */
    org.rcsb.cif.model.generated.pdbxremediationatomsitemapping.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping();

    /**
     * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
     * polymer linkages within the entry that are outside of typlical
     * covalent distances.
     * @return PdbxValidatePolymerLinkage
     */
    org.rcsb.cif.model.generated.pdbxvalidatepolymerlinkage.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage();

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
     * helical symmetry group associated with this entry.
     * @return PdbxHelicalSymmetry
     */
    org.rcsb.cif.model.generated.pdbxhelicalsymmetry.PdbxHelicalSymmetry getPdbxHelicalSymmetry();

    /**
     * Data items in the PDBX_POINT_SYMMETRY category record details about the
     * point symmetry group associated with this entry.
     * @return PdbxPointSymmetry
     */
    org.rcsb.cif.model.generated.pdbxpointsymmetry.PdbxPointSymmetry getPdbxPointSymmetry();

    /**
     * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
     * structural elements in the deposited entry.  The entity instance is a method
     * neutral identifier for the observed molecular entities in the deposited coordinate
     * set.
     * @return PdbxStructEntityInst
     */
    org.rcsb.cif.model.generated.pdbxstructentityinst.PdbxStructEntityInst getPdbxStructEntityInst();

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    org.rcsb.cif.model.generated.pdbxstructoperlist.PdbxStructOperList getPdbxStructOperList();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    org.rcsb.cif.model.generated.pdbxstructassembly.PdbxStructAssembly getPdbxStructAssembly();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    org.rcsb.cif.model.generated.pdbxstructassemblygen.PdbxStructAssemblyGen getPdbxStructAssemblyGen();

    /**
     * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
     * the generation of the crystallographic asymmetric unit. The
     * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
     * components that constitute the asymmetric unit in terms of cartesian
     * transformations of deposited coordinates.
     * @return PdbxStructAsymGen
     */
    org.rcsb.cif.model.generated.pdbxstructasymgen.PdbxStructAsymGen getPdbxStructAsymGen();

    /**
     * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
     * the generation of the minimal asymmetric unit. For instance, this
     * category can be used to provide this information for helical and point
     * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the
     * specifications of the components that constitute the asymmetric unit
     * in terms of cartesian transformations of deposited coordinates.
     * @return PdbxStructMsymGen
     */
    org.rcsb.cif.model.generated.pdbxstructmsymgen.PdbxStructMsymGen getPdbxStructMsymGen();

    /**
     * Data items in the PDBX_STRUCT_LEGACY_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     *
     * This category provides a container for matrices used to construct
     * icosahedral assemblies in legacy entries.
     * @return PdbxStructLegacyOperList
     */
    org.rcsb.cif.model.generated.pdbxstructlegacyoperlist.PdbxStructLegacyOperList getPdbxStructLegacyOperList();

    /**
     * Data items in the PDBX_CHEM_COMP_ATOM_FEATURE category provide
     * a selected list of atom level features for the chemical component.
     * @return PdbxChemCompAtomFeature
     */
    org.rcsb.cif.model.generated.pdbxchemcompatomfeature.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_FAMILY category identify
     * entity families.
     * @return PdbxReferenceMoleculeFamily
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculefamily.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMoleculeList
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculelist.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE category record
     * reference information about small polymer molecules.
     * @return PdbxReferenceMolecule
     */
    org.rcsb.cif.model.generated.pdbxreferencemolecule.PdbxReferenceMolecule getPdbxReferenceMolecule();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitylist.PdbxReferenceEntityList getPdbxReferenceEntityList();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_NONPOLY category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityNonpoly
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitynonpoly.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitylink.PdbxReferenceEntityLink getPdbxReferenceEntityLink();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY category record details about
     * the polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return PdbxReferenceEntityPoly
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitypoly.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer.
     * @return PdbxReferenceEntityPolySeq
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitypolyseq.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq();

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceEntitySequence
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitysequence.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SRC_NAT category record
     * details of the source from which the entity was obtained.
     * @return PdbxReferenceEntitySrcNat
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitysrcnat.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records
     * textual details about small polymer molecules.
     * @return PdbxReferenceMoleculeDetails
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculedetails.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records
     * synonym names for reference entities.
     * @return PdbxReferenceMoleculeSynonyms
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculesynonyms.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
     * subcomponent sequence from which this entity could be built.
     * @return PdbxReferenceEntitySubcomponents
     */
    org.rcsb.cif.model.generated.pdbxreferenceentitysubcomponents.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_ANNOTATION category specify
     * additional annotation relevant to the molecular entities.
     * @return PdbxReferenceMoleculeAnnotation
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculeannotation.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation();

    /**
     * Additional features associated with the reference entity.
     * @return PdbxReferenceMoleculeFeatures
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculefeatures.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures();

    /**
     * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record
     * details of the structural examples in related databases for this entity.
     * @return PdbxReferenceMoleculeRelatedStructures
     */
    org.rcsb.cif.model.generated.pdbxreferencemoleculerelatedstructures.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures();

    /**
     * Data items in the PDBX_STRUCT_GROUP_LIST define groups of related components
     * or atoms.
     * @return PdbxStructGroupList
     */
    org.rcsb.cif.model.generated.pdbxstructgrouplist.PdbxStructGroupList getPdbxStructGroupList();

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENTS category list component-level
     * group assignments within the entry.  Groups are defined and described in category
     * PDBX_STRUCT_GROUP_LIST.
     * @return PdbxStructGroupComponents
     */
    org.rcsb.cif.model.generated.pdbxstructgroupcomponents.PdbxStructGroupComponents getPdbxStructGroupComponents();

    /**
     * Data items in the PDBX_STRUCT_GROUP_COMPONENT_RANGE category define a structural
     * group as a continuous span chemical components.
     * @return PdbxStructGroupComponentRange
     */
    org.rcsb.cif.model.generated.pdbxstructgroupcomponentrange.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange();

    /**
     * Data items in the PDBX_PRD_AUDIT category records
     * the status and tracking information for this molecule.
     * @return PdbxPrdAudit
     */
    org.rcsb.cif.model.generated.pdbxprdaudit.PdbxPrdAudit getPdbxPrdAudit();

    /**
     * Data items in the PDBX_FAMILY_PRD_AUDIT category records
     * the status and tracking information for this family.
     * @return PdbxFamilyPrdAudit
     */
    org.rcsb.cif.model.generated.pdbxfamilyprdaudit.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit();

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    org.rcsb.cif.model.generated.pdbxmolecule.PdbxMolecule getPdbxMolecule();

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    org.rcsb.cif.model.generated.pdbxmoleculefeatures.PdbxMoleculeFeatures getPdbxMoleculeFeatures();

    /**
     * Data items in the PDBX_FAMILY_GROUP_INDEX category record
     * the family membership in family groups.
     * @return PdbxFamilyGroupIndex
     */
    org.rcsb.cif.model.generated.pdbxfamilygroupindex.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex();

    /**
     * Data items in the PDBX_DISTANT_SOLVENT_ATOMS category list the
     * solvent atoms remote from any macromolecule.
     * @return PdbxDistantSolventAtoms
     */
    org.rcsb.cif.model.generated.pdbxdistantsolventatoms.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms();

    /**
     * Data items in the PDBX_STRUCT_SPECIAL_SYMMETRY category list the
     * molecular components that lie on special symmetry positions.
     * @return PdbxStructSpecialSymmetry
     */
    org.rcsb.cif.model.generated.pdbxstructspecialsymmetry.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry();

    /**
     * Data items in the PDBX_REFERENCE_PUBLICATION_LIST hold reference information
     * related to PDB citation data.
     * @return PdbxReferencePublicationList
     */
    org.rcsb.cif.model.generated.pdbxreferencepublicationlist.PdbxReferencePublicationList getPdbxReferencePublicationList();

    /**
     *
     * Items in the assigned_chem_shift_list category provide information about a list of reported assigned chemical shift values.
     * @return PdbxNmrAssignedChemShiftList
     */
    org.rcsb.cif.model.generated.pdbxnmrassignedchemshiftlist.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList();

    /**
     *
     * Items in the chem_shift_experiment category provide pointers to the NMR experiments and samples used to collect the data for a set of reported assigned chemical shifts.
     * @return PdbxNmrChemShiftExperiment
     */
    org.rcsb.cif.model.generated.pdbxnmrchemshiftexperiment.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment();

    /**
     *
     * Items in the pdbx_nmr_chem_shift_ref category provide the chemical shift referencing values used in assigning the chemical shift positions for peaks in spectral peak lists and assigned atom chemical shifts.
     * @return PdbxNmrChemShiftRef
     */
    org.rcsb.cif.model.generated.pdbxnmrchemshiftref.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef();

    /**
     *
     * Items in the chem_shift_reference category define a set of chemical shift referencing parameters.
     * @return PdbxNmrChemShiftReference
     */
    org.rcsb.cif.model.generated.pdbxnmrchemshiftreference.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference();

    /**
     *
     * Items in the chem_shift_software category provide pointers to the software category and methods category.
     * @return PdbxNmrChemShiftSoftware
     */
    org.rcsb.cif.model.generated.pdbxnmrchemshiftsoftware.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware();

    /**
     *
     * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used
     * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
     * @return PdbxNmrConstraintFile
     */
    org.rcsb.cif.model.generated.pdbxnmrconstraintfile.PdbxNmrConstraintFile getPdbxNmrConstraintFile();

    /**
     *
     * Items in the pdbx_nmr_software_task category provide information about software workflow in the NMR experiment.
     * @return PdbxNmrSoftwareTask
     */
    org.rcsb.cif.model.generated.pdbxnmrsoftwaretask.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask();

    /**
     *
     * Items in the spectral_dim category describe the parameters of each dimension in the NMR experiment used to generate the spectral peak list.
     * @return PdbxNmrSpectralDim
     */
    org.rcsb.cif.model.generated.pdbxnmrspectraldim.PdbxNmrSpectralDim getPdbxNmrSpectralDim();

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
     * @return PdbxNmrSpectralPeakList
     */
    org.rcsb.cif.model.generated.pdbxnmrspectralpeaklist.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList();

    /**
     *
     * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
     * and methods category where descriptions of software applications and methods can be found.
     * @return PdbxNmrSpectralPeakSoftware
     */
    org.rcsb.cif.model.generated.pdbxnmrspectralpeaksoftware.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware();

    /**
     *
     * Items in the pdbx_nmr_systematic_chem_shift_offset category define chemical shift offsets that systematically affect all chemical shifts in a set of assigned chemical shifts for a specific nuclei.
     * @return PdbxNmrSystematicChemShiftOffset
     */
    org.rcsb.cif.model.generated.pdbxnmrsystematicchemshiftoffset.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset();

    /**
     *
     * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
     * @return PdbxNmrUpload
     */
    org.rcsb.cif.model.generated.pdbxnmrupload.PdbxNmrUpload getPdbxNmrUpload();

    /**
     * Data items in the PDBX_AUDIT_SUPPORT category record details about
     * funding support for the entry.
     * @return PdbxAuditSupport
     */
    org.rcsb.cif.model.generated.pdbxauditsupport.PdbxAuditSupport getPdbxAuditSupport();

    /**
     * Data items in the pdbx_chem_comp_subcomponent_struct_conn
     * list the chemical interactions among the subcomponents in
     * the chemical component.
     * @return PdbxChemCompSubcomponentStructConn
     */
    org.rcsb.cif.model.generated.pdbxchemcompsubcomponentstructconn.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn();

    /**
     * Data items in the pdbx_chem_comp_subcomponent_entity_list category
     * list the constituent chemical entities and entity features in this chemical component.
     * @return PdbxChemCompSubcomponentEntityList
     */
    org.rcsb.cif.model.generated.pdbxchemcompsubcomponententitylist.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList();

    /**
     * Data items in the ENTITY_SRC_NAT category record details of
     * the source from which the entity was obtained in cases
     * where the entity was isolated directly from a natural tissue.
     * @return EntitySrcNat
     */
    org.rcsb.cif.model.generated.entitysrcnat.EntitySrcNat getEntitySrcNat();

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
    org.rcsb.cif.model.generated.entitysrcgen.EntitySrcGen getEntitySrcGen();

    /**
     * The data items in category PDBX_ENTITY_SRC_SYN record the source details
     * about chemically synthesized molecules.
     * @return PdbxEntitySrcSyn
     */
    org.rcsb.cif.model.generated.pdbxentitysrcsyn.PdbxEntitySrcSyn getPdbxEntitySrcSyn();

    /**
     * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
     * the linkages between components within the polymer entity.
     * @return PdbxEntityPolyCompLinkList
     */
    org.rcsb.cif.model.generated.pdbxentitypolycomplinklist.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList();

    /**
     * Data items in the PDBX_LINKED_ENTITY category record
     * information about molecules composed of linked entities.
     * @return PdbxLinkedEntity
     */
    org.rcsb.cif.model.generated.pdbxlinkedentity.PdbxLinkedEntity getPdbxLinkedEntity();

    /**
     * Data items in the PDBX_LINKED_ENTITY_INSTANCE_LIST category identify instance
     * molecules represented as linked entities within an entry.
     * @return PdbxLinkedEntityInstanceList
     */
    org.rcsb.cif.model.generated.pdbxlinkedentityinstancelist.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList();

    /**
     * Data items in the PDBX_LINKED_ENTITY_LIST category record
     * the list of entity constituents for this molecule.
     * @return PdbxLinkedEntityList
     */
    org.rcsb.cif.model.generated.pdbxlinkedentitylist.PdbxLinkedEntityList getPdbxLinkedEntityList();

    /**
     * Data items in the PDBX_LINKED_ENTITY_LINK_LIST category give details about
     * the linkages with molecules represented as linked entities.
     * @return PdbxLinkedEntityLinkList
     */
    org.rcsb.cif.model.generated.pdbxlinkedentitylinklist.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList();

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    org.rcsb.cif.model.generated.pdbxentitydescriptor.PdbxEntityDescriptor getPdbxEntityDescriptor();

    /**
     * Data items in the pdbx_reference_linked_entity category describe
     * common observed interaction patterns within linked entities.
     * @return PdbxReferenceLinkedEntity
     */
    org.rcsb.cif.model.generated.pdbxreferencelinkedentity.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity();

    /**
     * Data items in the pdbx_reference_linked_entity_comp_list category lists
     * the constituents of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompList
     */
    org.rcsb.cif.model.generated.pdbxreferencelinkedentitycomplist.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList();

    /**
     * Data items in the pdbx_reference_linked_entity_comp_link category enumerate
     * inter-entity linkages between the components of common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityCompLink
     */
    org.rcsb.cif.model.generated.pdbxreferencelinkedentitycomplink.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink();

    /**
     * Data items in the pdbx_reference_linked_entity_link category enumerate
     * linkages between the entities in common observed interaction patterns
     * described in the pdbx_reference_linked_entity category.
     * @return PdbxReferenceLinkedEntityLink
     */
    org.rcsb.cif.model.generated.pdbxreferencelinkedentitylink.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink();

    /**
     * Data items in the PDBX_RELATED_DATA_SET category record references
     * to experimental data sets related to the entry.
     * @return PdbxRelatedExpDataSet
     */
    org.rcsb.cif.model.generated.pdbxrelatedexpdataset.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet();

    /**
     * The pdbx_database_status_history category records the time evolution of entry
     * processing status.
     * @return PdbxDatabaseStatusHistory
     */
    org.rcsb.cif.model.generated.pdbxdatabasestatushistory.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory();

    /**
     * Data items in the EM_ASSEMBLY category record details
     * about the imaged EM sample.
     * @return EmAssembly
     */
    org.rcsb.cif.model.generated.emassembly.EmAssembly getEmAssembly();

    /**
     * Data items in the EM_ENTITY_ASSEMBLY category
     * record details about each component of
     * the complex.
     * @return EmEntityAssembly
     */
    org.rcsb.cif.model.generated.ementityassembly.EmEntityAssembly getEmEntityAssembly();

    /**
     * Data items in the EM_VIRUS_ENTITY category record details
     * of the icosahedral virus.
     * @return EmVirusEntity
     */
    org.rcsb.cif.model.generated.emvirusentity.EmVirusEntity getEmVirusEntity();

    /**
     * Data items in the EM_SAMPLE_PREPARATION category
     * record details of sample conditions prior to and upon loading
     * onto grid support.
     * @return EmSamplePreparation
     */
    org.rcsb.cif.model.generated.emsamplepreparation.EmSamplePreparation getEmSamplePreparation();

    /**
     * Data items in the EM_SAMPLE_SUPPORT category record details
     * of the electron microscope grid type, grid support film and pretreatment
     * of whole before sample is applied
     * @return EmSampleSupport
     */
    org.rcsb.cif.model.generated.emsamplesupport.EmSampleSupport getEmSampleSupport();

    /**
     * Data items in the BUFFER category
     * record details of the sample buffer.
     * @return EmBuffer
     */
    org.rcsb.cif.model.generated.embuffer.EmBuffer getEmBuffer();

    /**
     * Data items in the EM_VITRIFICATION category
     * record details about the method and cryogen used in
     * rapid freezing of the sample on the grid prior to its
     * insertion in the electron microscope
     * @return EmVitrification
     */
    org.rcsb.cif.model.generated.emvitrification.EmVitrification getEmVitrification();

    /**
     * Data items in the EM_IMAGING category record details about
     * the parameters used in imaging the sample in the electron microscope.
     * @return EmImaging
     */
    org.rcsb.cif.model.generated.emimaging.EmImaging getEmImaging();

    /**
     * Data items in the EM_DETECTOR category record details
     * of the image detector type.
     * @return EmDetector
     */
    org.rcsb.cif.model.generated.emdetector.EmDetector getEmDetector();

    /**
     * Data items in the EM_IMAGE_SCANS category record details
     * of the image scanning device (microdensitometer)
     * and parameters for digitization of the image.
     * @return EmImageScans
     */
    org.rcsb.cif.model.generated.emimagescans.EmImageScans getEmImageScans();

    /**
     * Data items in the EM_2D_PROJECTION_SELECTION category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return Em2dProjectionSelection
     */
    org.rcsb.cif.model.generated.em2dprojectionselection.Em2dProjectionSelection getEm2dProjectionSelection();

    /**
     * Data items in the EM_3D_RECONSTRUCTION category
     * record details of the 3D reconstruction procedure from 2D projections.
     * @return Em3dReconstruction
     */
    org.rcsb.cif.model.generated.em3dreconstruction.Em3dReconstruction getEm3dReconstruction();

    /**
     * Data items in the 3D_FITTING category
     * record details of the method of fitting atomic
     * coordinates from a PDB file into a 3d-em
     * volume map file
     * @return Em3dFitting
     */
    org.rcsb.cif.model.generated.em3dfitting.Em3dFitting getEm3dFitting();

    /**
     * Data items in the 3D_FITTING_LIST category
     * lists the methods of fitting atomic coordinates from a PDB file
     * into a 3d-em volume map file
     * @return Em3dFittingList
     */
    org.rcsb.cif.model.generated.em3dfittinglist.Em3dFittingList getEm3dFittingList();

    /**
     * Data items in the EM_HELICAL_ENTITY category record details
     * for a helical or filament type of assembly component.
     * @return EmHelicalEntity
     */
    org.rcsb.cif.model.generated.emhelicalentity.EmHelicalEntity getEmHelicalEntity();

    /**
     * Data items in the EM_EXPERIMENT category provide
     * high-level classification of the EM experiment.
     * @return EmExperiment
     */
    org.rcsb.cif.model.generated.emexperiment.EmExperiment getEmExperiment();

    /**
     * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
     * the details of the symmetry for a single particle entity type.
     * @return EmSingleParticleEntity
     */
    org.rcsb.cif.model.generated.emsingleparticleentity.EmSingleParticleEntity getEmSingleParticleEntity();

    /**
     * Administration-related data items
     * @return EmAdmin
     */
    org.rcsb.cif.model.generated.emadmin.EmAdmin getEmAdmin();

    /**
     * Category to collect the authors of this entry
     * @return EmAuthorList
     */
    org.rcsb.cif.model.generated.emauthorlist.EmAuthorList getEmAuthorList();

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReference
     */
    org.rcsb.cif.model.generated.emdbreference.EmDbReference getEmDbReference();

    /**
     * Category holds links to raw data sources for the entry, e.g.,
     * held by a remote server.
     * @return EmDbReferenceAuxiliary
     */
    org.rcsb.cif.model.generated.emdbreferenceauxiliary.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary();

    /**
     * Some internal items to power the deposition interface
     * @return EmDepui
     */
    org.rcsb.cif.model.generated.emdepui.EmDepui getEmDepui();

    /**
     * List of EMD entries made obsolete by this entry.
     * @return EmObsolete
     */
    org.rcsb.cif.model.generated.emobsolete.EmObsolete getEmObsolete();

    /**
     * List of newer entries that replace this entry.
     * @return EmSupersede
     */
    org.rcsb.cif.model.generated.emsupersede.EmSupersede getEmSupersede();

    /**
     * Data items in this category record details about the molecular weight of
     * an assembly component of the sample.
     * @return EmEntityAssemblyMolwt
     */
    org.rcsb.cif.model.generated.ementityassemblymolwt.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt();

    /**
     * Data items in this category record taxonomic details about the natural source for EM
     * assemblies and assembly components.
     * @return EmEntityAssemblyNaturalsource
     */
    org.rcsb.cif.model.generated.ementityassemblynaturalsource.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource();

    /**
     * Data items in this category record details
     * about recombinant expression of the assembly or assembly component.
     * @return EmEntityAssemblyRecombinant
     */
    org.rcsb.cif.model.generated.ementityassemblyrecombinant.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant();

    /**
     * Data items in this category record details of a virus entity.
     * @return EmVirusNaturalHost
     */
    org.rcsb.cif.model.generated.emvirusnaturalhost.EmVirusNaturalHost getEmVirusNaturalHost();

    /**
     * Data items in the EMD_VIRUS_SHELL category record details
     * of the viral shell number, shell diameter, and icosahedral triangulation number.
     * @return EmVirusShell
     */
    org.rcsb.cif.model.generated.emvirusshell.EmVirusShell getEmVirusShell();

    /**
     * Data items in the EMD_SPECIMEN category record details
     * about specimens prepared for imaging by electron microscopy.
     * @return EmSpecimen
     */
    org.rcsb.cif.model.generated.emspecimen.EmSpecimen getEmSpecimen();

    /**
     * Sugar embedding category
     * @return EmEmbedding
     */
    org.rcsb.cif.model.generated.emembedding.EmEmbedding getEmEmbedding();

    /**
     * Description of fiducial markers.
     * @return EmFiducialMarkers
     */
    org.rcsb.cif.model.generated.emfiducialmarkers.EmFiducialMarkers getEmFiducialMarkers();

    /**
     * Description of sectioning by focused_ion_beam
     * @return EmFocusedIonBeam
     */
    org.rcsb.cif.model.generated.emfocusedionbeam.EmFocusedIonBeam getEmFocusedIonBeam();

    /**
     * Data items describing glow discharge pretreatment for an EM grid
     * @return EmGridPretreatment
     */
    org.rcsb.cif.model.generated.emgridpretreatment.EmGridPretreatment getEmGridPretreatment();

    /**
     * Description of sectioning by ultramicrotomy
     * @return EmUltramicrotomy
     */
    org.rcsb.cif.model.generated.emultramicrotomy.EmUltramicrotomy getEmUltramicrotomy();

    /**
     * Description of high pressure freezing
     * @return EmHighPressureFreezing
     */
    org.rcsb.cif.model.generated.emhighpressurefreezing.EmHighPressureFreezing getEmHighPressureFreezing();

    /**
     * Data items related to shadowing of an EM specimen
     * @return EmShadowing
     */
    org.rcsb.cif.model.generated.emshadowing.EmShadowing getEmShadowing();

    /**
     * Description specimen preparation for imaging using tomography.
     * @return EmTomographySpecimen
     */
    org.rcsb.cif.model.generated.emtomographyspecimen.EmTomographySpecimen getEmTomographySpecimen();

    /**
     * Description of growth of a 2D, 3D, or helical crystal array.
     * @return EmCrystalFormation
     */
    org.rcsb.cif.model.generated.emcrystalformation.EmCrystalFormation getEmCrystalFormation();

    /**
     * Staining category
     * @return EmStaining
     */
    org.rcsb.cif.model.generated.emstaining.EmStaining getEmStaining();

    /**
     * Data items to describe films supporting the specimen
     * @return EmSupportFilm
     */
    org.rcsb.cif.model.generated.emsupportfilm.EmSupportFilm getEmSupportFilm();

    /**
     * Buffer category
     * @return EmBufferComponent
     */
    org.rcsb.cif.model.generated.embuffercomponent.EmBufferComponent getEmBufferComponent();

    /**
     * Microscopy parameters relevant only for crystallography
     * @return EmDiffraction
     */
    org.rcsb.cif.model.generated.emdiffraction.EmDiffraction getEmDiffraction();

    /**
     * Statistical parameters for electron diffraction measurements
     * within a resolution shell
     * @return EmDiffractionShell
     */
    org.rcsb.cif.model.generated.emdiffractionshell.EmDiffractionShell getEmDiffractionShell();

    /**
     * Statistical parameters for electron diffraction measurements
     * @return EmDiffractionStats
     */
    org.rcsb.cif.model.generated.emdiffractionstats.EmDiffractionStats getEmDiffractionStats();

    /**
     * Microscopy parameters only relevant for tomography
     * @return EmTomography
     */
    org.rcsb.cif.model.generated.emtomography.EmTomography getEmTomography();

    /**
     * Data items in the EM_IMAGE_RECORDING category record details
     * of the image recording (either film/microdensitometer or electronic detector)
     * and parameters for image digitization.
     * @return EmImageRecording
     */
    org.rcsb.cif.model.generated.emimagerecording.EmImageRecording getEmImageRecording();

    /**
     * Description of a few specialist optics apparatus
     * @return EmImagingOptics
     */
    org.rcsb.cif.model.generated.emimagingoptics.EmImagingOptics getEmImagingOptics();

    /**
     * Information about the final image classification
     * @return EmFinalClassification
     */
    org.rcsb.cif.model.generated.emfinalclassification.EmFinalClassification getEmFinalClassification();

    /**
     * The startup model employed to begin refinement of the parameters for
     * a 3DEM reconstruction
     * @return EmStartModel
     */
    org.rcsb.cif.model.generated.emstartmodel.EmStartModel getEmStartModel();

    /**
     *
     * Description of the software that was used for data collection, data processing,
     * data analysis, structure calculations and refinement. The description should
     * include the name of the software, the author of the software and the version used.
     * @return EmSoftware
     */
    org.rcsb.cif.model.generated.emsoftware.EmSoftware getEmSoftware();

    /**
     * Category to describe the euler angle assignement
     * @return EmEulerAngleAssignment
     */
    org.rcsb.cif.model.generated.emeulerangleassignment.EmEulerAngleAssignment getEmEulerAngleAssignment();

    /**
     * Description of the Contrast Transfer Function (CTF) correction
     * @return EmCtfCorrection
     */
    org.rcsb.cif.model.generated.emctfcorrection.EmCtfCorrection getEmCtfCorrection();

    /**
     * Volume selection in image processing
     * @return EmVolumeSelection
     */
    org.rcsb.cif.model.generated.emvolumeselection.EmVolumeSelection getEmVolumeSelection();

    /**
     * Data items in the EM_SYMMETRY_3DX category record
     * 3D crystal symmetry parameters utilized in 3DEM reconstruction averaging.
     * @return Em3dCrystalEntity
     */
    org.rcsb.cif.model.generated.em3dcrystalentity.Em3dCrystalEntity getEm3dCrystalEntity();

    /**
     * Data items in the EM_SYMMETRY_2DX category record
     * 2D crystal symmetry parameters utilized in a 3DEM reconstruction.
     * @return Em2dCrystalEntity
     */
    org.rcsb.cif.model.generated.em2dcrystalentity.Em2dCrystalEntity getEm2dCrystalEntity();

    /**
     * Data items in the EM_IMAGE_PROCESSING category
     * record details of the EM image processing procedure.
     * @return EmImageProcessing
     */
    org.rcsb.cif.model.generated.emimageprocessing.EmImageProcessing getEmImageProcessing();

    /**
     * Data items in this category
     * record details of images from scanned micrographs and the
     * number of particles selected from a scanned set of micrographs.
     * @return EmParticleSelection
     */
    org.rcsb.cif.model.generated.emparticleselection.EmParticleSelection getEmParticleSelection();

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
    org.rcsb.cif.model.generated.emmap.EmMap getEmMap();

    /**
     * Data items in the EMD_VALIDATION_FSC_CURVE category
     * record details of the Fourier Shell Correlation (FSC) curve file.
     * @return EmFscCurve
     */
    org.rcsb.cif.model.generated.emfsccurve.EmFscCurve getEmFscCurve();

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmInterpretFigure
     */
    org.rcsb.cif.model.generated.eminterpretfigure.EmInterpretFigure getEmInterpretFigure();

    /**
     * Listing of all layer line files associated with the EM entry
     * @return EmLayerLines
     */
    org.rcsb.cif.model.generated.emlayerlines.EmLayerLines getEmLayerLines();

    /**
     * Listing of all structure factor files associated with the EM entry
     * @return EmStructureFactors
     */
    org.rcsb.cif.model.generated.emstructurefactors.EmStructureFactors getEmStructureFactors();

    /**
     * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
     * that are provided by the depositor
     * @return EmDepositorInfo
     */
    org.rcsb.cif.model.generated.emdepositorinfo.EmDepositorInfo getEmDepositorInfo();

    /**
     * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
     * that are provided by the depositor
     * @return EmMapDepositorInfo
     */
    org.rcsb.cif.model.generated.emmapdepositorinfo.EmMapDepositorInfo getEmMapDepositorInfo();

    /**
     * Data items in the EM_MASK_DEPOSITOR_INFO category record mask parameters
     * that are provided by the depositor
     * @return EmMaskDepositorInfo
     */
    org.rcsb.cif.model.generated.emmaskdepositorinfo.EmMaskDepositorInfo getEmMaskDepositorInfo();

    /**
     * Listing of image files (figures) associated with an EMDB entry
     * @return EmFigureDepositorInfo
     */
    org.rcsb.cif.model.generated.emfiguredepositorinfo.EmFigureDepositorInfo getEmFigureDepositorInfo();

    /**
     * Listing of layer line files associated with the EM entry
     * @return EmLayerLinesDepositorInfo
     */
    org.rcsb.cif.model.generated.emlayerlinesdepositorinfo.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo();

    /**
     * Structure factor files associated with the EM entry
     * @return EmStructureFactorsDepositorInfo
     */
    org.rcsb.cif.model.generated.emstructurefactorsdepositorinfo.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo();

    /**
     * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
     * details about the mapping sample and coordinate sequences.
     * @return PdbxSeqMapDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxseqmapdepositorinfo.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_DEPOSITOR_INFO category record additional
     * details provided by depositors about deposited chemical components.
     * @return PdbxChemCompDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxchemcompdepositorinfo.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ.
     * @return PdbxStructRefSeqDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqdepositorinfo.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * STRUCT_REF_SEQ_DIF.
     * @return PdbxStructRefSeqDifDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructrefseqdifdepositorinfo.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_PROP_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_PROP.
     * @return PdbxStructAssemblyPropDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructassemblypropdepositorinfo.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY.
     * @return PdbxStructAssemblyDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructassemblydepositorinfo.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_ASSEMBLY_GEN.
     * @return PdbxStructAssemblyGenDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructassemblygendepositorinfo.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo();

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_STRUCT_OPER_LIST.
     * @return PdbxStructOperListDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructoperlistdepositorinfo.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo();

    /**
     * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_POINT_SYMMETRY.
     * @return PdbxPointSymmetryDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxpointsymmetrydepositorinfo.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo();

    /**
     * Data items in the PDBX_HELICAL_SYMMETRY_DEPOSITOR_INFO category capture
     * depositor provided information related to the archival cateogory
     * PDBX_HELICAL_SYMMETRY.
     * @return PdbxHelicalSymmetryDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxhelicalsymmetrydepositorinfo.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo();

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidenceDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxstructassemblyauthevidencedepositorinfo.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo();

    /**
     * Data items in the PDBX_SOLVENT_ATOM_SITE_MAPPING category records
     * mapping information between solvent atoms before and after symmetry
     * repositioning.
     * @return PdbxSolventAtomSiteMapping
     */
    org.rcsb.cif.model.generated.pdbxsolventatomsitemapping.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping();

    /**
     * Data items in the PDBX_MOLECULE_FEATURES_DEPOSITOR_INFO  category capture
     * depositor provided information related to the archival cateogory
     * PDBX_MOLECULE_FEATURES.
     * @return PdbxMoleculeFeaturesDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxmoleculefeaturesdepositorinfo.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO category records
     * depositor provided information about the chemical context of component instances.
     * @return PdbxChemCompInstanceDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxchemcompinstancedepositorinfo.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo();

    /**
     * Data items in the PDBX_DEPUI_STATUS_FLAGS category record status
     * details used to maintain state within the wwPDB deposition system.
     * @return PdbxDepuiStatusFlags
     */
    org.rcsb.cif.model.generated.pdbxdepuistatusflags.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags();

    /**
     * Data items in the PDBX_DEPUI_UPLOAD category record the
     * details of uploaded data files.
     * @return PdbxDepuiUpload
     */
    org.rcsb.cif.model.generated.pdbxdepuiupload.PdbxDepuiUpload getPdbxDepuiUpload();

    /**
     * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
     * details that assess the status of selected validation diagnostics.
     * @return PdbxDepuiValidationStatusFlags
     */
    org.rcsb.cif.model.generated.pdbxdepuivalidationstatusflags.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags();

    /**
     * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
     * details of the uploaded files related to depositor provided chemical assignments.
     * @return PdbxChemCompUploadDepositorInfo
     */
    org.rcsb.cif.model.generated.pdbxchemcompuploaddepositorinfo.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo();

    /**
     * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
     * details related to individual entities.
     * @return PdbxDepuiEntityStatusFlags
     */
    org.rcsb.cif.model.generated.pdbxdepuientitystatusflags.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags();

    /**
     * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
     * details related to the features of individual entities.
     * @return PdbxDepuiEntityFeatures
     */
    org.rcsb.cif.model.generated.pdbxdepuientityfeatures.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures();

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
     * within the depositon and annotation system.
     * @return PdbxDepositionMessageInfo
     */
    org.rcsb.cif.model.generated.pdbxdepositionmessageinfo.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo();

    /**
     * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
     * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
     * data category.
     * @return PdbxDepositionMessageFileReference
     */
    org.rcsb.cif.model.generated.pdbxdepositionmessagefilereference.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference();

    /**
     * Data items in the PDBX_DEPUI_ENTRY_DETAILS category record
     * information required to identify the depositor and route
     * deposition to an appropriate processing site.
     * @return PdbxDepuiEntryDetails
     */
    org.rcsb.cif.model.generated.pdbxdepuientrydetails.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails();

    /**
     * Data items in the PDBX_DATA_PROCESSING_STATUS category record
     * data processing instructions for workflow processing tasks.
     * @return PdbxDataProcessingStatus
     */
    org.rcsb.cif.model.generated.pdbxdataprocessingstatus.PdbxDataProcessingStatus getPdbxDataProcessingStatus();

    /**
     * Data items in the pdbx_entity_instance_feature category records
     * special features of selected entity instances.
     * @return PdbxEntityInstanceFeature
     */
    org.rcsb.cif.model.generated.pdbxentityinstancefeature.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature();

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
    org.rcsb.cif.model.generated.pdbxentitysrcgendepositorinfo.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL category give details about each
     * of the chemical component model instances.
     * @return PdbxChemCompModel
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodel.PdbxChemCompModel getPdbxChemCompModel();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
     * for the chemical component model instance.
     * @return PdbxChemCompModelAtom
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodelatom.PdbxChemCompModelAtom getPdbxChemCompModelAtom();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
     * the bonds between atoms in a chemical component model instance.
     * @return PdbxChemCompModelBond
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodelbond.PdbxChemCompModelBond getPdbxChemCompModelBond();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelFeature
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodelfeature.PdbxChemCompModelFeature getPdbxChemCompModelFeature();

    /**
     * Data items in the CHEM_COMP_MODEL_DESCRIPTOR category provide
     * string descriptors for component model structures.
     * @return PdbxChemCompModelDescriptor
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodeldescriptor.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor();

    /**
     * Data items in the PDBX_CHEM_COMP_MODEL_AUDIT category records
     * the status and tracking information for this component model instance.
     * @return PdbxChemCompModelAudit
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodelaudit.PdbxChemCompModelAudit getPdbxChemCompModelAudit();

    /**
     * Additional features associated with the chemical component.
     * @return PdbxChemCompModelReference
     */
    org.rcsb.cif.model.generated.pdbxchemcompmodelreference.PdbxChemCompModelReference getPdbxChemCompModelReference();

    /**
     * Data items in the PDBX_VIEW_CATEGORY_GROUP identify collections
     * of related mmCIF categories.  Views provide a vehicle for
     * presenting different logical arrangements of dictionary contents.
     * @return PdbxViewCategoryGroup
     */
    org.rcsb.cif.model.generated.pdbxviewcategorygroup.PdbxViewCategoryGroup getPdbxViewCategoryGroup();

    /**
     * Data items in the PDBX_VIEW_CATEGORY specify the categories
     * belonging to a category view group.  An alias name for the
     * the mmCIF category may also be specified for the each
     * category in the view.
     * @return PdbxViewCategory
     */
    org.rcsb.cif.model.generated.pdbxviewcategory.PdbxViewCategory getPdbxViewCategory();

    /**
     * Data items in the PDBX_VIEW_ITEM specify the mmCIF data items
     * belonging to a view category.  An alias name for the
     * the mmCIF item may be specified for the each item in the
     * view category.  The role of the item in the view category
     * can be designated as mandatory, optional, or hidden.
     * @return PdbxViewItem
     */
    org.rcsb.cif.model.generated.pdbxviewitem.PdbxViewItem getPdbxViewItem();

    /**
     * Gives information about what kind of coordinates are available.
     * @return PdbxCoord
     */
    org.rcsb.cif.model.generated.pdbxcoord.PdbxCoord getPdbxCoord();

    /**
     * Local data items describing ligand and monomer
     * chemical features.
     * @return PdbxConnect
     */
    org.rcsb.cif.model.generated.pdbxconnect.PdbxConnect getPdbxConnect();

    /**
     * Local data items describing ligand and monomer
     * type information.
     * @return PdbxConnectType
     */
    org.rcsb.cif.model.generated.pdbxconnecttype.PdbxConnectType getPdbxConnectType();

    /**
     * Local data items describing ligand and monomer
     * modifications.
     * @return PdbxConnectModification
     */
    org.rcsb.cif.model.generated.pdbxconnectmodification.PdbxConnectModification getPdbxConnectModification();

    /**
     * Local data items describing ligand and monomer
     * atom names and connectivity.
     * @return PdbxConnectAtom
     */
    org.rcsb.cif.model.generated.pdbxconnectatom.PdbxConnectAtom getPdbxConnectAtom();

    /**
     * The PDBX_DATABASE_PDB_MASTER category provides placeholders
     * for the count of various PDB record types.
     * @return PdbxDatabasePDBMaster
     */
    org.rcsb.cif.model.generated.pdbxdatabasepdbmaster.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster();

    /**
     *
     * Data items in the PDBX_DATABASE_PDB_OMIT category record
     * list PDB record names that should be omitted in the PDB
     * format file.
     * @return PdbxDatabasePdbOmit
     */
    org.rcsb.cif.model.generated.pdbxdatabasepdbomit.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit();

    /**
     * These records are used in the DBREF record of a PDB file and
     * are used as place holders for NDB ID's in PDB files.
     * @return PdbxDbref
     */
    org.rcsb.cif.model.generated.pdbxdbref.PdbxDbref getPdbxDbref();

    /**
     * Data items in the PDBX_DRUG_INFO category are still used until
     * the 'entity' categories are entered into the database, even
     * though the information is repeated.
     * @return PdbxDrugInfo
     */
    org.rcsb.cif.model.generated.pdbxdruginfo.PdbxDrugInfo getPdbxDrugInfo();

    /**
     * Data items in the PDBX_INHIBITOR_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * inhibitor is repeated.
     * @return PdbxInhibitorInfo
     */
    org.rcsb.cif.model.generated.pdbxinhibitorinfo.PdbxInhibitorInfo getPdbxInhibitorInfo();

    /**
     * Data items in the PDBX_ION_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxIonInfo
     */
    org.rcsb.cif.model.generated.pdbxioninfo.PdbxIonInfo getPdbxIonInfo();

    /**
     * Data items in the PDBX_HYBRID category are used to describe the chimeric
     * characteristics of a DNA/RNA structure.
     * @return PdbxHybrid
     */
    org.rcsb.cif.model.generated.pdbxhybrid.PdbxHybrid getPdbxHybrid();

    /**
     * Data items in the PDBX_NA_STRAND_INFO category are still used until
     * the 'entity' categories are entered into the database, even though
     * the information is repeated.
     * @return PdbxNaStrandInfo
     */
    org.rcsb.cif.model.generated.pdbxnastrandinfo.PdbxNaStrandInfo getPdbxNaStrandInfo();

    /**
     * The information in this category is exclusively used to store
     * the HET records of a PDB file.  This record will be generated
     * by the PROGRAM.
     * @return PdbxNonstandardList
     */
    org.rcsb.cif.model.generated.pdbxnonstandardlist.PdbxNonstandardList getPdbxNonstandardList();

    /**
     * This is a place holder for the PDB COMPND.
     * @return PdbxPdbCompnd
     */
    org.rcsb.cif.model.generated.pdbxpdbcompnd.PdbxPdbCompnd getPdbxPdbCompnd();

    /**
     * This is a place holder for the PDB SOURCE.
     * @return PdbxPdbSource
     */
    org.rcsb.cif.model.generated.pdbxpdbsource.PdbxPdbSource getPdbxPdbSource();

    /**
     * Data items in the PDBX_PROTEIN_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxProteinInfo
     */
    org.rcsb.cif.model.generated.pdbxproteininfo.PdbxProteinInfo getPdbxProteinInfo();

    /**
     * Data items in the PDBX_SOLVENT_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * information is repeated.
     * @return PdbxSolventInfo
     */
    org.rcsb.cif.model.generated.pdbxsolventinfo.PdbxSolventInfo getPdbxSolventInfo();

    /**
     * Data item will still be used until the ENTITY category is fully
     * adopted by NDBQuery.
     * @return PdbxSource
     */
    org.rcsb.cif.model.generated.pdbxsource.PdbxSource getPdbxSource();

    /**
     * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
     * the function of a particular biological assembly.
     * @return PdbxStructBiolFunc
     */
    org.rcsb.cif.model.generated.pdbxstructbiolfunc.PdbxStructBiolFunc getPdbxStructBiolFunc();

    /**
     * Data items in the PDBX_STRUCT_PACK_GEN category record details about
     * the generation of the packing picture(s).
     * @return PdbxStructPackGen
     */
    org.rcsb.cif.model.generated.pdbxstructpackgen.PdbxStructPackGen getPdbxStructPackGen();

    /**
     * Data items in the PDBX_TRNA_INFO category are still used until
     * the 'entity' categories are entered into the database, even though the
     * T-RNA is repeated.
     * @return PdbxTrnaInfo
     */
    org.rcsb.cif.model.generated.pdbxtrnainfo.PdbxTrnaInfo getPdbxTrnaInfo();

    /**
     * These records give information about residues which do not pair
     * (h-bond) in the asymmetric unit.
     *
     * The records about Watson-Crick base pairing depend on these
     * records.
     * @return PdbxUnpair
     */
    org.rcsb.cif.model.generated.pdbxunpair.PdbxUnpair getPdbxUnpair();

    /**
     * Holds details of NCS restraints in cases where multiple
     * conditions are provided for each domain.
     * @return PdbxRefineLsRestrNcs
     */
    org.rcsb.cif.model.generated.pdbxrefinelsrestrncs.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs();

    /**
     * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
     * about the generation of virus structures from NCS matrix operators.
     * @return PdbxStructNcsVirusGen
     */
    org.rcsb.cif.model.generated.pdbxstructncsvirusgen.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen();

    /**
     * PDBX_SEQUENCE_ANNOTATION holds internal details about molecular sequences
     * described in the context of PDB chains.
     * @return PdbxSequenceAnnotation
     */
    org.rcsb.cif.model.generated.pdbxsequenceannotation.PdbxSequenceAnnotation getPdbxSequenceAnnotation();

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS identify
     * problems or errors encountered in the post-processing
     * of this entry.
     * @return PdbxPostProcessDetails
     */
    org.rcsb.cif.model.generated.pdbxpostprocessdetails.PdbxPostProcessDetails getPdbxPostProcessDetails();

    /**
     * Data items in the PDBX_POST_PROCESS_DETAILS record
     * the status of post-processed entries.
     * @return PdbxPostProcessStatus
     */
    org.rcsb.cif.model.generated.pdbxpostprocessstatus.PdbxPostProcessStatus getPdbxPostProcessStatus();

    /**
     * Data items in the PDBX_STRUCT_LINK category record details about
     * covalent linkages in the structure.
     * @return PdbxStructLink
     */
    org.rcsb.cif.model.generated.pdbxstructlink.PdbxStructLink getPdbxStructLink();

    /**
     * Provides a place-holder for PDB REMARK 465 data.
     * @return PdbxMissingResidueList
     */
    org.rcsb.cif.model.generated.pdbxmissingresiduelist.PdbxMissingResidueList getPdbxMissingResidueList();

    /**
     * Crystallographic cell specifications used in data processing.
     * @return PdbxDataProcessingCell
     */
    org.rcsb.cif.model.generated.pdbxdataprocessingcell.PdbxDataProcessingCell getPdbxDataProcessingCell();

    /**
     * Details of reflections used in data processing.
     * @return PdbxDataProcessingReflns
     */
    org.rcsb.cif.model.generated.pdbxdataprocessingreflns.PdbxDataProcessingReflns getPdbxDataProcessingReflns();

    /**
     * Details of the detector used at data collection site.
     * @return PdbxDataProcessingDetector
     */
    org.rcsb.cif.model.generated.pdbxdataprocessingdetector.PdbxDataProcessingDetector getPdbxDataProcessingDetector();

    /**
     * Data items in the PDBX_CHEM_COMP_NONSTANDARD category describes
     * common nucleotide modifications and nonstandard features.
     * @return PdbxChemCompNonstandard
     */
    org.rcsb.cif.model.generated.pdbxchemcompnonstandard.PdbxChemCompNonstandard getPdbxChemCompNonstandard();

    /**
     * Data items in the PDBX_ENTITY_POLY_PROTEIN_CLASS category
     * provides a top-level protein classification.
     * @return PdbxEntityPolyProteinClass
     */
    org.rcsb.cif.model.generated.pdbxentitypolyproteinclass.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass();

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY_TREE category
     * define the tree structure of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomyTree
     */
    org.rcsb.cif.model.generated.pdbxentitynametaxonomytree.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree();

    /**
     * Data items in the PDBX_ENTITY_NAME_TAXONOMY category
     * define the names and synonyms of the entity name taxonomy.
     * @return PdbxEntityNameTaxonomy
     */
    org.rcsb.cif.model.generated.pdbxentitynametaxonomy.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy();

    /**
     * Data items in the PDBX_ENTITY_NAME_INSTANCE category
     * list names used to define entities with their
     * associated database, entity, chain, and molecule
     * identifiers.
     * @return PdbxEntityNameInstance
     */
    org.rcsb.cif.model.generated.pdbxentitynameinstance.PdbxEntityNameInstance getPdbxEntityNameInstance();

    /**

     * @return PdbxTableinfo
     */
    org.rcsb.cif.model.generated.pdbxtableinfo.PdbxTableinfo getPdbxTableinfo();

    /**

     * @return PdbxColumninfo
     */
    org.rcsb.cif.model.generated.pdbxcolumninfo.PdbxColumninfo getPdbxColumninfo();

    /**
     * The PDBX_VAL_ANGLE category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValAngle
     */
    org.rcsb.cif.model.generated.pdbxvalangle.PdbxValAngle getPdbxValAngle();

    /**
     * The PDBX_VAL_BOND category lists the covalent bond angles
     * in this entry deviating by greater than 6*sigma from
     * standard values.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValBond
     */
    org.rcsb.cif.model.generated.pdbxvalbond.PdbxValBond getPdbxValBond();

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
    org.rcsb.cif.model.generated.pdbxvalcontact.PdbxValContact getPdbxValContact();

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
    org.rcsb.cif.model.generated.pdbxvalsymcontact.PdbxValSymContact getPdbxValSymContact();

    /**
     * Data items in the PDBX_RMCH_OUTLIER category list the
     * residues with torsion angles outside the expected
     * Ramachandran regions.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxRmchOutlier
     */
    org.rcsb.cif.model.generated.pdbxrmchoutlier.PdbxRmchOutlier getPdbxRmchOutlier();

    /**
     * Data items in the PDBX_MISSING_ATOM_POLY category lists
     * atoms missing in polymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomPoly
     */
    org.rcsb.cif.model.generated.pdbxmissingatompoly.PdbxMissingAtomPoly getPdbxMissingAtomPoly();

    /**
     * Data items in the PDBX_MISSING_ATOM_NONPOLY category list the
     * atoms missing in nonpolymer residues.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxMissingAtomNonpoly
     */
    org.rcsb.cif.model.generated.pdbxmissingatomnonpoly.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly();

    /**
     * Data items in the PDBX_VAL_CHIRAL category list the
     * atoms with nonstandard chiralities.
     *
     * This is a completely derived category.  Do not edit.
     * @return PdbxValChiral
     */
    org.rcsb.cif.model.generated.pdbxvalchiral.PdbxValChiral getPdbxValChiral();

    /**
     * Gives information about the organization of the
     * NDB Structural Atlas.
     * @return PdbxAtlas
     */
    org.rcsb.cif.model.generated.pdbxatlas.PdbxAtlas getPdbxAtlas();

    /**
     * Container category for a list of feature flags associated
     * with each structure entry.
     * @return PdbxSummaryFlags
     */
    org.rcsb.cif.model.generated.pdbxsummaryflags.PdbxSummaryFlags getPdbxSummaryFlags();

    /**
     * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
     * characteristics of protein oligonucleotide binding.
     * @return PdbxEntityFuncBindMode
     */
    org.rcsb.cif.model.generated.pdbxentityfuncbindmode.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode();

    /**
     * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is enzymatic.
     * @return PdbxEntityFuncEnzyme
     */
    org.rcsb.cif.model.generated.pdbxentityfuncenzyme.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme();

    /**
     * Data items in the PDBX_ENTITY_FUNC_REGULATORY category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is regulatory.
     * @return PdbxEntityFuncRegulatory
     */
    org.rcsb.cif.model.generated.pdbxentityfuncregulatory.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory();

    /**
     * Data items in the PDBX_ENTITY_FUNC_STRUCTURAL category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is structural.
     * @return PdbxEntityFuncStructural
     */
    org.rcsb.cif.model.generated.pdbxentityfuncstructural.PdbxEntityFuncStructural getPdbxEntityFuncStructural();

    /**
     * Data items in the PDBX_ENTITY_FUNC_OTHER category describe
     * characteristics of protein oligonucleotide binding in which
     * the binding mode is not classified.
     * @return PdbxEntityFuncOther
     */
    org.rcsb.cif.model.generated.pdbxentityfuncother.PdbxEntityFuncOther getPdbxEntityFuncOther();

    /**
     * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
     * of monomers within a polymer.
     * @return PdbxEntityPolyDomain
     */
    org.rcsb.cif.model.generated.pdbxentitypolydomain.PdbxEntityPolyDomain getPdbxEntityPolyDomain();

    /**
     * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
     * about structural features of the NA.
     * @return PdbxNaStructKeywds
     */
    org.rcsb.cif.model.generated.pdbxnastructkeywds.PdbxNaStructKeywds getPdbxNaStructKeywds();

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_TYPE category describe
     * type of nucleic acid polymer entities.
     * @return PdbxEntityPolyNaType
     */
    org.rcsb.cif.model.generated.pdbxentitypolynatype.PdbxEntityPolyNaType getPdbxEntityPolyNaType();

    /**
     * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
     * describe the nonstandard features of the nucleic acid polymer entities.
     * @return PdbxEntityPolyNaNonstandard
     */
    org.rcsb.cif.model.generated.pdbxentitypolynanonstandard.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard();

    /**
     * Data items in the PDBX_VIRTUAL_ANGLE category record details about the
     * molecular virtual angles, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualAngle
     */
    org.rcsb.cif.model.generated.pdbxvirtualangle.PdbxVirtualAngle getPdbxVirtualAngle();

    /**
     * Data items in the PDBX_VIRTUAL_BOND category record details about
     * virtual bonds, as calculated from the contents
     * of the ATOM, CELL, and SYMMETRY data.
     * @return PdbxVirtualBond
     */
    org.rcsb.cif.model.generated.pdbxvirtualbond.PdbxVirtualBond getPdbxVirtualBond();

    /**
     * Data items in the PDBX_VIRTUAL_TORSION category record details about
     * virtual torsion angles, as calculated from the contents of the ATOM,
     * CELL, and SYMMETRY data.
     * @return PdbxVirtualTorsion
     */
    org.rcsb.cif.model.generated.pdbxvirtualtorsion.PdbxVirtualTorsion getPdbxVirtualTorsion();

    /**
     * Data items in the PDBX_SEQUENCE_PATTERN category record
     * the number of occurences of common step sequence patterns
     * (e.g. AA, CG, AT).
     * @return PdbxSequencePattern
     */
    org.rcsb.cif.model.generated.pdbxsequencepattern.PdbxSequencePattern getPdbxSequencePattern();

    /**
     * Data items in the PDBX_STEREOCHEMISTRY identify chiral
     * centers and associated chiral volumes.
     * @return PdbxStereochemistry
     */
    org.rcsb.cif.model.generated.pdbxstereochemistry.PdbxStereochemistry getPdbxStereochemistry();

    /**
     * Data items in the PDBX_RMS_DEVS_COVALENT record the summary RMS deviations
     * for nucleic acid covalent geometry relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovalent
     */
    org.rcsb.cif.model.generated.pdbxrmsdevscovalent.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent();

    /**
     * Data items in the PDBX_RMS_DEVS_COV_BY_MONOMER record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxRmsDevsCovByMonomer
     */
    org.rcsb.cif.model.generated.pdbxrmsdevscovbymonomer.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer();

    /**
     * Data items in the PDBX_SUGAR_PHOSPHATE_GEOMETRY record the RMS deviations
     * covalent geometry for each momoner relative to small molecule crystal
     * standards.
     * @return PdbxSugarPhosphateGeometry
     */
    org.rcsb.cif.model.generated.pdbxsugarphosphategeometry.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry();

    /**
     * The table in this section is used to describe the software
     * that was used for data collection, data processing, data analysis,
     * structure calculations and refinement. The description should include
     * both the name of the software and the version used.
     * @return PdbxNmrComputing
     */
    org.rcsb.cif.model.generated.pdbxnmrcomputing.PdbxNmrComputing getPdbxNmrComputing();

    /**
     * Data items in the PDBX_AUDIT_CONFORM_EXTENSION category describe
     * extension dictionary versions against which the data names appearing
     * the current data block are conformant.
     * @return PdbxAuditConformExtension
     */
    org.rcsb.cif.model.generated.pdbxauditconformextension.PdbxAuditConformExtension getPdbxAuditConformExtension();

    /**
     * Data items in the category record details from the output of mapman
     * used by the DCC program.
     * @return PdbxDccMapman
     */
    org.rcsb.cif.model.generated.pdbxdccmapman.PdbxDccMapman getPdbxDccMapman();

    /**
     * Data items in this category record residual map properties such as
     * correlation, real space Rfactors and the Zscore calculated from
     * refmac and mapman.
     * @return PdbxDccRsccMapman
     */
    org.rcsb.cif.model.generated.pdbxdccrsccmapman.PdbxDccRsccMapman getPdbxDccRsccMapman();

    /**
     * Data items in the category record overall map properties such
     * as correlation, real space Rfactors and the Zscore calculated
     * from refmac and mapman.
     * @return PdbxDccRsccMapmanOverall
     */
    org.rcsb.cif.model.generated.pdbxdccrsccmapmanoverall.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall();

    /**
     * Data items in the category record various overall metrics
     * calculated by DCC and various wrapped programs (such as Xtriage,
     * pointless, REFMAC ...).
     * @return PdbxDccDensity
     */
    org.rcsb.cif.model.generated.pdbxdccdensity.PdbxDccDensity getPdbxDccDensity();

    /**
     * Data items in the category record the overall deviations about
     * geometry (such as bond length, angle, dihedral, chirality,
     * planarity). These data are calculated with the phenix module
     * model_vs_data.
     * @return PdbxDccGeometry
     */
    org.rcsb.cif.model.generated.pdbxdccgeometry.PdbxDccGeometry getPdbxDccGeometry();

    /**
     * Data items in the category record calculated metrics from various
     * programs (such as phenix, refmac, cns, sfcheck).
     * @return PdbxDccDensityCorr
     */
    org.rcsb.cif.model.generated.pdbxdccdensitycorr.PdbxDccDensityCorr getPdbxDccDensityCorr();

    /**
     * Data items in the category record residual map properties such as
     * Real Space electron density Correlation Coefficient (RSCC), real space R
     * factors (RSR) and the Zscores for each residue, the main/side chains.
     * @return PdbxDccMap
     */
    org.rcsb.cif.model.generated.pdbxdccmap.PdbxDccMap getPdbxDccMap();

    /**
     * Data items in the pdbx_deposit_group category provide identifiers
     * and related information for groups of entries deposited in a collection.
     * @return PdbxDepositGroup
     */
    org.rcsb.cif.model.generated.pdbxdepositgroup.PdbxDepositGroup getPdbxDepositGroup();

    /**
     * Data items in the pdbx_deposit_group_index category provides details
     * about the individual data files in the collection of deposited entries.
     * @return PdbxDepositGroupIndex
     */
    org.rcsb.cif.model.generated.pdbxdepositgroupindex.PdbxDepositGroupIndex getPdbxDepositGroupIndex();

    /**
     * Provides author supplied evidentiary support for assemblies
     * in pdbx_struct_assembly.
     * @return PdbxStructAssemblyAuthEvidence
     */
    org.rcsb.cif.model.generated.pdbxstructassemblyauthevidence.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence();

    /**
     * Provides reason a particular assembly in pdbx_struct_assembly is
     * of interest.
     * @return PdbxStructAssemblyAuthClassification
     */
    org.rcsb.cif.model.generated.pdbxstructassemblyauthclassification.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification();

    /**
     * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
     * programs during indexing
     * @return PdbxCrystalAlignment
     */
    org.rcsb.cif.model.generated.pdbxcrystalalignment.PdbxCrystalAlignment getPdbxCrystalAlignment();

    /**
     * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
     * the revision history for a data entry.
     * @return PdbxAuditRevisionHistory
     */
    org.rcsb.cif.model.generated.pdbxauditrevisionhistory.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory();

    /**
     * Data items in the PDBX_AUDIT_revision_group category
     * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
     * record.
     * @return PdbxAuditRevisionGroup
     */
    org.rcsb.cif.model.generated.pdbxauditrevisiongroup.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup();

    /**
     * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
     * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionCategory
     */
    org.rcsb.cif.model.generated.pdbxauditrevisioncategory.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory();

    /**
     * Data items in the PDBX_audit_revision_details category
     * record descriptions of changes associated with
     * PDBX_AUDIT_REVISION_HISTORY records.
     * @return PdbxAuditRevisionDetails
     */
    org.rcsb.cif.model.generated.pdbxauditrevisiondetails.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails();

    /**
     * Data items in the PDBX_AUDIT_REVISION_ITEM category
     * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
     * @return PdbxAuditRevisionItem
     */
    org.rcsb.cif.model.generated.pdbxauditrevisionitem.PdbxAuditRevisionItem getPdbxAuditRevisionItem();

    /**
     * Data items in the PDBX_SUPPORTING_EXP_DATA_SET category record
     * to experimental data set dependencies for this entry.
     * @return PdbxSupportingExpDataSet
     */
    org.rcsb.cif.model.generated.pdbxsupportingexpdataset.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_MEASUREMENT category record
     * details the beam that is impinging on the sample
     * @return PdbxSerialCrystallographyMeasurement
     */
    org.rcsb.cif.model.generated.pdbxserialcrystallographymeasurement.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
     * record general details about the sample delivery
     * @return PdbxSerialCrystallographySampleDelivery
     */
    org.rcsb.cif.model.generated.pdbxserialcrystallographysampledelivery.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_INJECTION
     * category record details about sample delivery by injection
     * @return PdbxSerialCrystallographySampleDeliveryInjection
     */
    org.rcsb.cif.model.generated.pdbxserialcrystallographysampledeliveryinjection.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
     * category record details about sample delivery using a fixed taget.
     * @return PdbxSerialCrystallographySampleDeliveryFixedTarget
     */
    org.rcsb.cif.model.generated.pdbxserialcrystallographysampledeliveryfixedtarget.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget();

    /**
     * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_DATA_REDUCTION category record
     * details about data processing that are unique to XFEL experiments.
     * These will compliment data recorded in category pdbx_diffrn_merge_stat.
     * @return PdbxSerialCrystallographyDataReduction
     */
    org.rcsb.cif.model.generated.pdbxserialcrystallographydatareduction.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction();
}
