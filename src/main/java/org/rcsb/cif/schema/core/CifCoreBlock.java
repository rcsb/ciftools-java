package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.schema.DelegatingCategory;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.Optional;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CifCoreBlock extends DelegatingBlock {
    public CifCoreBlock(Block delegate) {
        super(delegate);
    }

    public Column<?> getAliasedColumn(String... aliases) {
        Optional<Column<?>> optional = Arrays.stream(aliases)
                .filter(alias -> getCategories().containsKey(alias))
                .findFirst()
                .map(alias -> getCategories().get(alias).getColumn(""));
        // compiler, please...
        return optional.orElse(Column.EmptyColumn.UNNAMED_COLUMN);
    }

    @Override
    protected Category createDelegate(String categoryName, Category category) {
        switch (categoryName) {
            case "cif_core":
                return getCifCore();
            case "diffraction":
                return getDiffraction();
            case "diffrn":
                return getDiffrn();
            case "cell":
                return getCell();
            case "cell_measurement":
                return getCellMeasurement();
            case "cell_measurement_refln":
                return getCellMeasurementRefln();
            case "diffrn_attenuator":
                return getDiffrnAttenuator();
            case "diffrn_detector":
                return getDiffrnDetector();
            case "diffrn_measurement":
                return getDiffrnMeasurement();
            case "diffrn_orient":
                return getDiffrnOrient();
            case "diffrn_orient_matrix":
                return getDiffrnOrientMatrix();
            case "diffrn_orient_refln":
                return getDiffrnOrientRefln();
            case "diffrn_radiation":
                return getDiffrnRadiation();
            case "diffrn_radiation_wavelength":
                return getDiffrnRadiationWavelength();
            case "diffrn_refln":
                return getDiffrnRefln();
            case "diffrn_reflns":
                return getDiffrnReflns();
            case "diffrn_reflns_class":
                return getDiffrnReflnsClass();
            case "diffrn_reflns_transf_matrix":
                return getDiffrnReflnsTransfMatrix();
            case "diffrn_scale_group":
                return getDiffrnScaleGroup();
            case "diffrn_source":
                return getDiffrnSource();
            case "diffrn_standards":
                return getDiffrnStandards();
            case "diffrn_standard_refln":
                return getDiffrnStandardRefln();
            case "refln":
                return getRefln();
            case "reflns":
                return getReflns();
            case "reflns_class":
                return getReflnsClass();
            case "reflns_scale":
                return getReflnsScale();
            case "reflns_shell":
                return getReflnsShell();
            case "exptl":
                return getExptl();
            case "chemical":
                return getChemical();
            case "chemical_conn_atom":
                return getChemicalConnAtom();
            case "chemical_conn_bond":
                return getChemicalConnBond();
            case "chemical_formula":
                return getChemicalFormula();
            case "exptl_absorpt":
                return getExptlAbsorpt();
            case "exptl_crystal":
                return getExptlCrystal();
            case "exptl_crystal_appearance":
                return getExptlCrystalAppearance();
            case "exptl_crystal_face":
                return getExptlCrystalFace();
            case "space_group":
                return getSpaceGroup();
            case "space_group_generator":
                return getSpaceGroupGenerator();
            case "space_group_symop":
                return getSpaceGroupSymop();
            case "space_group_wyckoff":
                return getSpaceGroupWyckoff();
            case "model":
                return getModel();
            case "geom":
                return getGeom();
            case "geom_angle":
                return getGeomAngle();
            case "geom_bond":
                return getGeomBond();
            case "geom_contact":
                return getGeomContact();
            case "geom_hbond":
                return getGeomHbond();
            case "geom_torsion":
                return getGeomTorsion();
            case "model_site":
                return getModelSite();
            case "valence":
                return getValence();
            case "valence_param":
                return getValenceParam();
            case "valence_ref":
                return getValenceRef();
            case "publication":
                return getPublication();
            case "audit":
                return getAudit();
            case "audit_author":
                return getAuditAuthor();
            case "audit_author_role":
                return getAuditAuthorRole();
            case "audit_conform":
                return getAuditConform();
            case "audit_contact_author":
                return getAuditContactAuthor();
            case "audit_link":
                return getAuditLink();
            case "audit_support":
                return getAuditSupport();
            case "citation":
                return getCitation();
            case "citation_author":
                return getCitationAuthor();
            case "citation_editor":
                return getCitationEditor();
            case "computing":
                return getComputing();
            case "database":
                return getDatabase();
            case "database_code":
                return getDatabaseCode();
            case "database_related":
                return getDatabaseRelated();
            case "display":
                return getDisplay();
            case "display_colour":
                return getDisplayColour();
            case "journal":
                return getJournal();
            case "journal_coeditor":
                return getJournalCoeditor();
            case "journal_date":
                return getJournalDate();
            case "journal_index":
                return getJournalIndex();
            case "journal_techeditor":
                return getJournalTecheditor();
            case "publ":
                return getPubl();
            case "publ_author":
                return getPublAuthor();
            case "publ_body":
                return getPublBody();
            case "publ_contact_author":
                return getPublContactAuthor();
            case "publ_manuscript":
                return getPublManuscript();
            case "publ_manuscript_incl_extra":
                return getPublManuscriptInclExtra();
            case "publ_requested":
                return getPublRequested();
            case "publ_section":
                return getPublSection();
            case "structure":
                return getStructure();
            case "atom":
                return getAtom();
            case "atom_analytical":
                return getAtomAnalytical();
            case "atom_analytical_mass_loss":
                return getAtomAnalyticalMassLoss();
            case "atom_analytical_source":
                return getAtomAnalyticalSource();
            case "atom_scat_versus_stol":
                return getAtomScatVersusStol();
            case "atom_site":
                return getAtomSite();
            case "atom_site_aniso":
                return getAtomSiteAniso();
            case "atom_sites":
                return getAtomSites();
            case "atom_sites_cartn_transform":
                return getAtomSitesCartnTransform();
            case "atom_sites_fract_transform":
                return getAtomSitesFractTransform();
            case "atom_type":
                return getAtomType();
            case "atom_type_scat":
                return getAtomTypeScat();
            case "refine":
                return getRefine();
            case "refine_diff":
                return getRefineDiff();
            case "refine_ls":
                return getRefineLs();
            case "refine_ls_class":
                return getRefineLsClass();
            case "function":
                return getFunction();
            case "symmetry":
                return getSymmetry();
            case "cell_angle":
                return getCellAngle();
            case "chem_comp_bond":
                return getChemCompBond();
            case "symmetry_equiv":
                return getSymmetryEquiv();
            case "publ_manuscript_incl":
                return getPublManuscriptIncl();
            case "atom_site_anisotrop":
                return getAtomSiteAnisotrop();
            default:
                return new DelegatingCategory(category);
        }
    }

    /**
     * The CIF_CORE group contains the definitions of data items that
     * are common to all domains of crystallographic studies.
     * @return CifCore
     */
    public CifCore getCifCore() {
        return new CifCore(this);
    }

    /**
     * The DICTIONARY group encompassing the CORE DIFFRACTION data items defined
     * and used within the Crystallographic Information Framework (CIF).
     * @return Diffraction
     */
    public Diffraction getDiffraction() {
        return new Diffraction(this);
    }

    /**
     * The CATEGORY of data items used to describe the diffraction experiment.
     * @return Diffrn
     */
    public Diffrn getDiffrn() {
        return new Diffrn(this);
    }

    /**
     * The CATEGORY of data items used to describe the parameters of
     * the crystal unit cell.
     * @return Cell
     */
    public Cell getCell() {
        return new Cell(this);
    }

    /**
     * The CATEGORY of data items used to describe the measurement of
     * the cell parameters.
     * @return CellMeasurement
     */
    public CellMeasurement getCellMeasurement() {
        return new CellMeasurement(this);
    }

    /**
     * The CATEGORY of data items used to describe the reflection data
     * used in the measurement of the crystal unit cell.
     * @return CellMeasurementRefln
     */
    public CellMeasurementRefln getCellMeasurementRefln() {
        return new CellMeasurementRefln(this);
    }

    /**
     * The CATEGORY of data items which specify the attenuators used in the
     * diffraction source.
     * @return DiffrnAttenuator
     */
    public DiffrnAttenuator getDiffrnAttenuator() {
        return new DiffrnAttenuator(this);
    }

    /**
     * The CATEGORY of data items which specify the detectors used
     * in the measurement of diffraction intensities.
     * @return DiffrnDetector
     */
    public DiffrnDetector getDiffrnDetector() {
        return new DiffrnDetector(this);
    }

    /**
     * The CATEGORY of data items which specify the details of the
     * diffraction measurement.
     * @return DiffrnMeasurement
     */
    public DiffrnMeasurement getDiffrnMeasurement() {
        return new DiffrnMeasurement(this);
    }

    /**
     * The CATEGORY of data items which specify the orientation of the crystal
     * axes to the diffractometer goniometer.
     * @return DiffrnOrient
     */
    public DiffrnOrient getDiffrnOrient() {
        return new DiffrnOrient(this);
    }

    /**
     * The CATEGORY of data items which specify the matrix specifying the
     * orientation of the crystal axes to the diffractometer goniometer.
     * @return DiffrnOrientMatrix
     */
    public DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return new DiffrnOrientMatrix(this);
    }

    /**
     * The CATEGORY of data items which specify the reflections used to
     * calculate the matrix which gives the orientation of the crystal
     * axes to the diffractometer goniometer.
     * @return DiffrnOrientRefln
     */
    public DiffrnOrientRefln getDiffrnOrientRefln() {
        return new DiffrnOrientRefln(this);
    }

    /**
     * The CATEGORY of data items which specify the wavelength of the
     * radiation used in measuring diffraction intensities. To identify
     * and assign weights to distinct wavelength components from a
     * polychromatic beam, see DIFFRN_RADIATION_WAVELENGTH.
     * @return DiffrnRadiation
     */
    public DiffrnRadiation getDiffrnRadiation() {
        return new DiffrnRadiation(this);
    }

    /**
     * The CATEGORY of data items which specify the wavelength of the
     * radiation used in measuring diffraction intensities. Items may be
     * looped to identify and assign weights to distinct wavelength
     * components from a polychromatic beam.
     * @return DiffrnRadiationWavelength
     */
    public DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return new DiffrnRadiationWavelength(this);
    }

    /**
     * The CATEGORY of data items which specify the reflection measurements,
     * prior to data reduction and merging.
     * @return DiffrnRefln
     */
    public DiffrnRefln getDiffrnRefln() {
        return new DiffrnRefln(this);
    }

    /**
     * The CATEGORY of data items which specify the overall reflection
     * measurement information.
     * @return DiffrnReflns
     */
    public DiffrnReflns getDiffrnReflns() {
        return new DiffrnReflns(this);
    }

    /**
     * The CATEGORY of data items which specify different classes of
     * reflections in the raw measured diffraction data.
     * @return DiffrnReflnsClass
     */
    public DiffrnReflnsClass getDiffrnReflnsClass() {
        return new DiffrnReflnsClass(this);
    }

    /**
     * The CATEGORY of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * |11 12 13|
     * (h k l) diffraction  |21 22 23|  =  (h' k' l')
     * |31 32 33|
     * @return DiffrnReflnsTransfMatrix
     */
    public DiffrnReflnsTransfMatrix getDiffrnReflnsTransfMatrix() {
        return new DiffrnReflnsTransfMatrix(this);
    }

    /**
     * The CATEGORY of data items which specify the groups of reflections in
     * the raw measured diffraction data with different relative scales.
     * @return DiffrnScaleGroup
     */
    public DiffrnScaleGroup getDiffrnScaleGroup() {
        return new DiffrnScaleGroup(this);
    }

    /**
     * The CATEGORY of data items which specify information about the
     * radiation source.
     * @return DiffrnSource
     */
    public DiffrnSource getDiffrnSource() {
        return new DiffrnSource(this);
    }

    /**
     * The CATEGORY of data items which specify information about the
     * standard reflections used in the diffraction measurement process.
     * @return DiffrnStandards
     */
    public DiffrnStandards getDiffrnStandards() {
        return new DiffrnStandards(this);
    }

    /**
     * The CATEGORY of data items which specify the "standard" reflections
     * measured repeatedly to monitor variations in intensity due to source
     * flux, environment conditions or crystal quality.
     * @return DiffrnStandardRefln
     */
    public DiffrnStandardRefln getDiffrnStandardRefln() {
        return new DiffrnStandardRefln(this);
    }

    /**
     * The CATEGORY of data items used to describe the reflection data
     * used in the refinement of a crystallographic structure model.
     * @return Refln
     */
    public Refln getRefln() {
        return new Refln(this);
    }

    /**
     * The CATEGORY of data items used to specify parameters for the complete
     * set of reflections used in the structure refinement process. Note that
     * these parameters are often similar measures to those defined in the
     * DIFFRN categories, but differ in that the parameters refer to the
     * reduced/transformed reflections which have been used to refine the
     * atom site data in the ATOM_SITE category. The DIFFRN definitions refer
     * to the diffraction measurements and the raw reflection data.
     * @return Reflns
     */
    public Reflns getReflns() {
        return new Reflns(this);
    }

    /**
     * The CATEGORY of data items which specify the properties of reflections
     * in specific classes of reflections.
     * @return ReflnsClass
     */
    public ReflnsClass getReflnsClass() {
        return new ReflnsClass(this);
    }

    /**
     * The CATEGORY of data items which specify the scales needed to place
     * measured structure factor coefficients on the same absolute scale.
     * @return ReflnsScale
     */
    public ReflnsScale getReflnsScale() {
        return new ReflnsScale(this);
    }

    /**
     * The CATEGORY of data items which specify the information about
     * reflections divided into shells bounded by d resolution limits.
     * @return ReflnsShell
     */
    public ReflnsShell getReflnsShell() {
        return new ReflnsShell(this);
    }

    /**
     * The CATEGORY of data items used to specify the experimental work
     * prior to diffraction measurements. These include crystallization
     * crystal measurements and absorption-correction techniques used.
     * @return Exptl
     */
    public Exptl getExptl() {
        return new Exptl(this);
    }

    /**
     * The CATEGORY of data items which describe the composition and
     * chemical properties of the compound under study. The formula data
     * items must be consistent with the density, unit-cell and Z values.
     * @return Chemical
     */
    public Chemical getChemical() {
        return new Chemical(this);
    }

    /**
     * The CATEGORY of data items which describe the 2D chemical structure of
     * the molecular species. They allow a 2D chemical diagram to be
     * reconstructed for use in a publication or in a database search
     * for structural and substructural relationships. In particular,
     * the chemical_conn_atom data items provide information about the
     * chemical properties of the atoms in the structure. In cases
     * where crystallographic and molecular symmetry elements coincide
     * they must also contain symmetry-generated atoms, so as to describe
     * a complete chemical entity.
     * @return ChemicalConnAtom
     */
    public ChemicalConnAtom getChemicalConnAtom() {
        return new ChemicalConnAtom(this);
    }

    /**
     * The CATEGORY of data items which specify the connections between
     * the atoms sites in the chemical_conn_atom list and the nature
     * of the chemical bond between these atoms. These are details about
     * the two-dimensional (2D) chemical structure of the molecular species.
     * They allow a 2D chemical diagram to be reconstructed for use in a
     * publication or in a database search for structural and substructural
     * relationships.
     * @return ChemicalConnBond
     */
    public ChemicalConnBond getChemicalConnBond() {
        return new ChemicalConnBond(this);
    }

    /**
     * The CATEGORY of data items which specify the composition and chemical
     * properties of the compound. The formula data items must agree
     * with those that specify the density, unit-cell and Z values.
     * 
     * The following rules apply to the construction of the data items
     * _chemical_formula.analytical, *.structural and *.sum. For the
     * data item *.moiety the formula construction is broken up into
     * residues or moieties, i.e. groups of atoms that form a molecular
     * unit or molecular ion. The rules given below apply within each
     * moiety, but different requirements apply to the way that moieties
     * are connected (see _chemical_formula.moiety).
     * 
     * 1. Only recognized element symbols may be used.
     * 
     * 2. Each element symbol is followed by a 'count' number. A count of
     * '1' may be omitted.
     * 
     * 3. A space or parenthesis must separate each cluster of (element
     * symbol + count).
     * 
     * 4. Where a group of elements is enclosed in parentheses, the
     * multiplier for the group must follow the closing parentheses.
     * That is, all element and group multipliers are assumed to be
     * printed as subscripted numbers. [An exception to this rule
     * exists for *.moiety formulae where pre- and post-multipliers
     * are permitted for molecular units].
     * 
     * 5. Unless the elements are ordered in a manner that corresponds to
     * their chemical structure, as in _chemical_formula.structural,
     * the order of the elements within any group or moiety
     * depends on whether or not carbon is present. If carbon is
     * present, the order should be: C, then H, then the other
     * elements in alphabetical order of their symbol. If carbon is
     * not present, the elements are listed purely in alphabetical order
     * of their symbol. This is the 'Hill' system used by Chemical
     * Abstracts. This ordering is used in _chemical_formula.moiety
     * and _chemical_formula.sum.
     * 
     * _chemical_formula.IUPAC      '[Mo (C O)4 (C18 H33 P)2]'
     * _chemical_formula.moiety     'C40 H66 Mo O4 P2'
     * _chemical_formula.structural '((C O)4 (P (C6 H11)3)2)Mo'
     * _chemical_formula.sum         'C40 H66 Mo O4 P2'
     * _chemical_formula.weight      768.81
     * @return ChemicalFormula
     */
    public ChemicalFormula getChemicalFormula() {
        return new ChemicalFormula(this);
    }

    /**
     * The CATEGORY of data items used to specify the experimental details
     * of the absorption measurements and corrections to the diffraction data.
     * @return ExptlAbsorpt
     */
    public ExptlAbsorpt getExptlAbsorpt() {
        return new ExptlAbsorpt(this);
    }

    /**
     * The CATEGORY of data items used to specify information about
     * crystals used in the diffraction measurements.
     * @return ExptlCrystal
     */
    public ExptlCrystal getExptlCrystal() {
        return new ExptlCrystal(this);
    }

    /**
     * The CATEGORY of ENUMERATION items used to specify information about the
     * crystal colour and appearance.
     * @return ExptlCrystalAppearance
     */
    public ExptlCrystalAppearance getExptlCrystalAppearance() {
        return new ExptlCrystalAppearance(this);
    }

    /**
     * The CATEGORY of data items which specify the dimensions of the
     * crystal used in the diffraction measurements.
     * @return ExptlCrystalFace
     */
    public ExptlCrystalFace getExptlCrystalFace() {
        return new ExptlCrystalFace(this);
    }

    /**
     * The CATEGORY of data items used to specify space group
     * information about the crystal used in the diffraction measurements.
     * 
     * Space-group types are identified by their number as listed in
     * International Tables for Crystallography Volume A, or by their
     * Schoenflies symbol. Specific settings of the space groups can
     * be identified by their Hall symbol, by specifying their
     * symmetry operations or generators, or by giving the
     * transformation that relates the specific setting to the
     * reference setting based on International Tables Volume A and
     * stored in this dictionary.
     * 
     * The commonly used Hermann-Mauguin symbol determines the
     * space-group type uniquely, but several different Hermann-Mauguin
     * symbols may refer to the same space-group type. A
     * Hermann-Mauguin symbol contains information on the choice of
     * the basis, but not on the choice of origin.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return SpaceGroup
     */
    public SpaceGroup getSpaceGroup() {
        return new SpaceGroup(this);
    }

    /**
     * The CATEGORY of data items used to list generators for
     * the space group
     * @return SpaceGroupGenerator
     */
    public SpaceGroupGenerator getSpaceGroupGenerator() {
        return new SpaceGroupGenerator(this);
    }

    /**
     * The CATEGORY of data items used to describe symmetry equivalent sites
     * in the crystal unit cell.
     * @return SpaceGroupSymop
     */
    public SpaceGroupSymop getSpaceGroupSymop() {
        return new SpaceGroupSymop(this);
    }

    /**
     * Contains information about Wyckoff positions of a space group.
     * Only one site can be given for each special position, but the
     * remainder can be generated by applying the symmetry operations
     * stored in _space_group_symop.operation_xyz.
     * @return SpaceGroupWyckoff
     */
    public SpaceGroupWyckoff getSpaceGroupWyckoff() {
        return new SpaceGroupWyckoff(this);
    }

    /**
     * Items in the MODEL Category specify data for the crystal structure
     * postulated and modelled from the atomic coordinates derived and
     * refined from the diffraction information. The structural model is
     * described principally in terms of the geometry of the 'connected'
     * atom sites and the crystal symmetry in which they reside.
     * @return Model
     */
    public Model getModel() {
        return new Model(this);
    }

    /**
     * The CATEGORY of data items used to specify the geometry
     * of the structural model as derived from the atomic sites.
     * The geometry is expressed in terms of the interatomic
     * angles (GEOM_ANGLE data), covalent bond distances
     * (GEOM_BOND data), contact distances (GEOM_CONTACT data),
     * hydrogen bonds (GEOM_HBOND data) and torsion geometry
     * (GEOM_TORSION data).
     * Geometry data are usually redundant, in that they can be
     * calculated from other more fundamental quantities in the data
     * block. However, they serve the dual purposes of providing a
     * check on the correctness of both sets of data and of enabling
     * the most important geometric data to be identified for
     * publication by setting the appropriate publication flag.
     * @return Geom
     */
    public Geom getGeom() {
        return new Geom(this);
    }

    /**
     * The CATEGORY of data items used to specify the geometry angles in the
     * structural model as derived from the atomic sites.
     * @return GeomAngle
     */
    public GeomAngle getGeomAngle() {
        return new GeomAngle(this);
    }

    /**
     * The CATEGORY of data items used to specify the geometry bonds in the
     * structural model as derived from the atomic sites.
     * @return GeomBond
     */
    public GeomBond getGeomBond() {
        return new GeomBond(this);
    }

    /**
     * The CATEGORY of data items used to specify the interatomic
     * contact distances in the structural model.
     * @return GeomContact
     */
    public GeomContact getGeomContact() {
        return new GeomContact(this);
    }

    /**
     * The CATEGORY of data items used to specify the hydrogen bond
     * distances in the structural model as derived from atomic sites.
     * @return GeomHbond
     */
    public GeomHbond getGeomHbond() {
        return new GeomHbond(this);
    }

    /**
     * The CATEGORY of data items used to specify the torsion angles in the
     * structural model as derived from the atomic sites.
     * @return GeomTorsion
     */
    public GeomTorsion getGeomTorsion() {
        return new GeomTorsion(this);
    }

    /**
     * The CATEGORY of data items used to describe atomic sites and
     * connections in the proposed atomic model.
     * @return ModelSite
     */
    public ModelSite getModelSite() {
        return new ModelSite(this);
    }

    /**
     * The CATEGORY of items used to specify bond valence parameters
     * used to calculate bond valences from bond lengths.
     * @return Valence
     */
    public Valence getValence() {
        return new Valence(this);
    }

    /**
     * The CATEGORY of items for listing bond valences.
     * @return ValenceParam
     */
    public ValenceParam getValenceParam() {
        return new ValenceParam(this);
    }

    /**
     * The CATEGORY of items for listing valence references.
     * @return ValenceRef
     */
    public ValenceRef getValenceRef() {
        return new ValenceRef(this);
    }

    /**
     * The DICTIONARY group encompassing the CORE PUBLICATION data items defined
     * and used within the Crystallographic Information Framework (CIF).
     * @return Publication
     */
    public Publication getPublication() {
        return new Publication(this);
    }

    /**
     * The CATEGORY of data items used to record details about the
     * creation and subsequent updating of the data block.
     * @return Audit
     */
    public Audit getAudit() {
        return new Audit(this);
    }

    /**
     * The CATEGORY of data items used for author(s) details.
     * @return AuditAuthor
     */
    public AuditAuthor getAuditAuthor() {
        return new AuditAuthor(this);
    }

    /**
     * The CATEGORY of data items used to describe the role that
     * authors took in the production of the dataset.
     * @return AuditAuthorRole
     */
    public AuditAuthorRole getAuditAuthorRole() {
        return new AuditAuthorRole(this);
    }

    /**
     * The CATEGORY of data items used describe dictionary versions
     * by which data names in the current data block are conformant.
     * @return AuditConform
     */
    public AuditConform getAuditConform() {
        return new AuditConform(this);
    }

    /**
     * The CATEGORY of data items used for contact author(s) details.
     * @return AuditContactAuthor
     */
    public AuditContactAuthor getAuditContactAuthor() {
        return new AuditContactAuthor(this);
    }

    /**
     * The CATEGORY of data items used to record details about the
     * relationships between data blocks in the current CIF.
     * @return AuditLink
     */
    public AuditLink getAuditLink() {
        return new AuditLink(this);
    }

    /**
     * Data items in the AUDIT_SUPPORT category record details about the
     * funding support for the data collected and analysed in the data set.
     * @return AuditSupport
     */
    public AuditSupport getAuditSupport() {
        return new AuditSupport(this);
    }

    /**
     * Data items in the CITATION category record details about the
     * literature cited as being relevant to the contents of the data
     * block.
     * @return Citation
     */
    public Citation getCitation() {
        return new Citation(this);
    }

    /**
     * Category of items describing citation author(s) details.
     * @return CitationAuthor
     */
    public CitationAuthor getCitationAuthor() {
        return new CitationAuthor(this);
    }

    /**
     * Category of items describing citation editor(s) details.
     * @return CitationEditor
     */
    public CitationEditor getCitationEditor() {
        return new CitationEditor(this);
    }

    /**
     * The CATEGORY of data items used to record details of the
     * computer programs used in the crystal structure analysis.
     * @return Computing
     */
    public Computing getComputing() {
        return new Computing(this);
    }

    /**
     * The CATEGORY of data items recording database deposition.
     * @return Database
     */
    public Database getDatabase() {
        return new Database(this);
    }

    /**
     * The CATEGORY of data items recording database deposition. These data items
     * are assigned by database managers and should only appear in a CIF if they
     * originate from that source.
     * @return DatabaseCode
     */
    public DatabaseCode getDatabaseCode() {
        return new DatabaseCode(this);
    }

    /**
     * A category of items recording entries in databases that describe
     * the same or related data. Databases wishing to insert their own
     * canonical codes when archiving and delivering data blocks should
     * use items from the DATABASE category.
     * @return DatabaseRelated
     */
    public DatabaseRelated getDatabaseRelated() {
        return new DatabaseRelated(this);
    }

    /**
     * The CATEGORY of data items used to enumerate the display
     * parameters used in the discipline.
     * @return Display
     */
    public Display getDisplay() {
        return new Display(this);
    }

    /**
     * The CATEGORY of data items used to enumerate the display
     * colour codes used in the discipline.
     * @return DisplayColour
     */
    public DisplayColour getDisplayColour() {
        return new DisplayColour(this);
    }

    /**
     * Category of items recording details about the book-keeping
     * by the journal staff when processing a CIF submitted for
     * publication.  The creator of a CIF will not normally specify
     * these data items.
     * @return Journal
     */
    public Journal getJournal() {
        return new Journal(this);
    }

    /**
     * Category of items recording coeditor details.
     * @return JournalCoeditor
     */
    public JournalCoeditor getJournalCoeditor() {
        return new JournalCoeditor(this);
    }

    /**
     * Category of items recording dates of publication processing.
     * @return JournalDate
     */
    public JournalDate getJournalDate() {
        return new JournalDate(this);
    }

    /**
     * Category of items describing publication indices.
     * @return JournalIndex
     */
    public JournalIndex getJournalIndex() {
        return new JournalIndex(this);
    }

    /**
     * Category of items recording details of the technical editor
     * processing this publication.
     * @return JournalTecheditor
     */
    public JournalTecheditor getJournalTecheditor() {
        return new JournalTecheditor(this);
    }

    /**
     * Data items in the PUBL category are used when submitting a
     * manuscript for publication. They refer either to the paper as
     * a whole, or to specific named elements within a paper (such as
     * the title and abstract, or the Comment and Experimental
     * sections of Acta Crystallographica Section C). The data items
     * in the PUBL_BODY category should be used for the textual
     * content of other submissions. Typically, each journal will
     * supply a list of the specific items it requires in its Notes
     * for Authors.
     * @return Publ
     */
    public Publ getPubl() {
        return new Publ(this);
    }

    /**
     * Category of data items recording the author information.
     * @return PublAuthor
     */
    public PublAuthor getPublAuthor() {
        return new PublAuthor(this);
    }

    /**
     * Data items in the PUBL_BODY category permit labelling of
     * different text sections within the body of a submitted paper.
     * Note that these should not be used in a paper which has
     * a standard format with sections tagged by specific data names
     * (such as in Acta Crystallographica Section C). Typically,
     * each journal will supply a list of the specific items it
     * requires in its Notes for Authors.
     * @return PublBody
     */
    public PublBody getPublBody() {
        return new PublBody(this);
    }

    /**
     * Category of items describing contact author(s) details.
     * @return PublContactAuthor
     */
    public PublContactAuthor getPublContactAuthor() {
        return new PublContactAuthor(this);
    }

    /**
     * Category of items describing the publication manuscript.
     * @return PublManuscript
     */
    public PublManuscript getPublManuscript() {
        return new PublManuscript(this);
    }

    /**
     * Category of data items that allow the authors of a manuscript to
     * submit for publication data names that should be added to the
     * standard request list employed by journal printing software.
     * Although these fields are primarily intended to identify CIF data
     * items that the author wishes to include in a published paper, they
     * can also be used to identify data names created so that non-CIF items
     * can be included in the publication. Note that *.item names MUST be
     * enclosed in single quotes.
     * @return PublManuscriptInclExtra
     */
    public PublManuscriptInclExtra getPublManuscriptInclExtra() {
        return new PublManuscriptInclExtra(this);
    }

    /**
     * CATEGORY of data items that enable the author to make
     * specific requests to the journal office for processing.
     * @return PublRequested
     */
    public PublRequested getPublRequested() {
        return new PublRequested(this);
    }

    /**
     * Manuscript section data if submitted in parts. See also
     * _publ_manuscript.text and _publ_manuscript.processed.
     * The _publ_section.exptl_prep, _publ_section.exptl_refinement
     * and _publ_section.exptl_solution items are preferred for
     * separating the chemical preparation, refinement and structure
     * solution aspects of the experimental description.
     * @return PublSection
     */
    public PublSection getPublSection() {
        return new PublSection(this);
    }

    /**
     * The DICTIONARY group encompassing the CORE STRUCTURE data items defined
     * and used within the Crystallographic Information Framework (CIF).
     * @return Structure
     */
    public Structure getStructure() {
        return new Structure(this);
    }

    /**
     * The CATEGORY of data items used to describe atomic information
     * used in crystallographic structure studies.
     * @return Atom
     */
    public Atom getAtom() {
        return new Atom(this);
    }

    /**
     * The CATEGORY of data items used to describe elemental
     * composition information used in crystallographic
     * structure studies.
     * @return AtomAnalytical
     */
    public AtomAnalytical getAtomAnalytical() {
        return new AtomAnalytical(this);
    }

    /**
     * The CATEGORY of data items used to describe information
     * pertaining to mass loss during specimen preparation for
     * the purposes of determining elemental composition
     * information for use in crystallographic structure studies.
     * @return AtomAnalyticalMassLoss
     */
    public AtomAnalyticalMassLoss getAtomAnalyticalMassLoss() {
        return new AtomAnalyticalMassLoss(this);
    }

    /**
     * The CATEGORY of data items used to describe the source
     * of elemental composition information used in crystallographic
     * structure studies.
     * @return AtomAnalyticalSource
     */
    public AtomAnalyticalSource getAtomAnalyticalSource() {
        return new AtomAnalyticalSource(this);
    }

    /**
     * The CATEGORY of data items used to list atomic scattering factor values for
     * use in crystallographic structure studies.
     * @return AtomScatVersusStol
     */
    public AtomScatVersusStol getAtomScatVersusStol() {
        return new AtomScatVersusStol(this);
    }

    /**
     * The CATEGORY of data items used to describe atom site information
     * used in crystallographic structure studies.
     * @return AtomSite
     */
    public AtomSite getAtomSite() {
        return new AtomSite(this);
    }

    /**
     * The CATEGORY of data items used to describe the anisotropic atomic
     * displacement parameters of the atomic sites in a crystal structure.
     * @return AtomSiteAniso
     */
    public AtomSiteAniso getAtomSiteAniso() {
        return new AtomSiteAniso(this);
    }

    /**
     * The CATEGORY of data items used to describe information which applies
     * to all atom sites in a crystal structure.
     * @return AtomSites
     */
    public AtomSites getAtomSites() {
        return new AtomSites(this);
    }

    /**
     * The CATEGORY of data items used to describe the matrix elements
     * used to transform fractional coordinates into Cartesian coordinates
     * of all atom sites in a crystal structure.
     * @return AtomSitesCartnTransform
     */
    public AtomSitesCartnTransform getAtomSitesCartnTransform() {
        return new AtomSitesCartnTransform(this);
    }

    /**
     * The CATEGORY of data items used to describe the matrix elements
     * used to transform Cartesian coordinates into fractional coordinates
     * of all atom sites in a crystal structure.
     * @return AtomSitesFractTransform
     */
    public AtomSitesFractTransform getAtomSitesFractTransform() {
        return new AtomSitesFractTransform(this);
    }

    /**
     * The CATEGORY of data items used to describe atomic type information
     * used in crystallographic structure studies.
     * @return AtomType
     */
    public AtomType getAtomType() {
        return new AtomType(this);
    }

    /**
     * The CATEGORY of data items used to describe atomic scattering
     * information used in crystallographic structure studies.
     * @return AtomTypeScat
     */
    public AtomTypeScat getAtomTypeScat() {
        return new AtomTypeScat(this);
    }

    /**
     * The CATEGORY of data items used to specify information about the
     * refinement of the structural model.
     * @return Refine
     */
    public Refine getRefine() {
        return new Refine(this);
    }

    /**
     * The CATEGORY of data items which specify the scattering density limits
     * in a difference Fourier map after the structure has been refined. The
     * RMS value is with respect to the arithmetic mean density, and is derived
     * from summations over each grid point in the asymmetric unit of the cell.
     * @return RefineDiff
     */
    public RefineDiff getRefineDiff() {
        return new RefineDiff(this);
    }

    /**
     * The CATEGORY of data items used to specify information about the
     * refinement of the structural model.
     * @return RefineLs
     */
    public RefineLs getRefineLs() {
        return new RefineLs(this);
    }

    /**
     * The CATEGORY of data items used to specify information about the
     * refinement of the structural model.
     * @return RefineLsClass
     */
    public RefineLsClass getRefineLsClass() {
        return new RefineLsClass(this);
    }

    /**
     * The crystallographic functions the invoked in the definition
     * methods of CORE STRUCTURE data items defined and used within
     * the Crystallographic Information Framework (CIF).
     * @return Function
     */
    public Function getFunction() {
        return new Function(this);
    }

    /**
     * 
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return new Symmetry(this);
    }

    /**
     * 
     * @return CellAngle
     */
    public CellAngle getCellAngle() {
        return new CellAngle(this);
    }

    /**
     * 
     * @return ChemCompBond
     */
    public ChemCompBond getChemCompBond() {
        return new ChemCompBond(this);
    }

    /**
     * 
     * @return SymmetryEquiv
     */
    public SymmetryEquiv getSymmetryEquiv() {
        return new SymmetryEquiv(this);
    }

    /**
     * 
     * @return PublManuscriptIncl
     */
    public PublManuscriptIncl getPublManuscriptIncl() {
        return new PublManuscriptIncl(this);
    }

    /**
     * 
     * @return AtomSiteAnisotrop
     */
    public AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return new AtomSiteAnisotrop(this);
    }

}