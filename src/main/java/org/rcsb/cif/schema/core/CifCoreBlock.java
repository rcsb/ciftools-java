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
            case "symmetry":
                return getSymmetry();
            case "space_group_generator":
                return getSpaceGroupGenerator();
            case "space_group_symop":
                return getSpaceGroupSymop();
            case "space_group_wyckoff":
                return getSpaceGroupWyckoff();
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
            case "valence_param":
                return getValenceParam();
            case "valence_ref":
                return getValenceRef();
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
     * 
     * @return Diffrn
     */
    public Diffrn getDiffrn() {
        return new Diffrn(this);
    }

    /**
     * 
     * @return Cell
     */
    public Cell getCell() {
        return new Cell(this);
    }

    /**
     * 
     * @return CellMeasurement
     */
    public CellMeasurement getCellMeasurement() {
        return new CellMeasurement(this);
    }

    /**
     * 
     * @return CellMeasurementRefln
     */
    public CellMeasurementRefln getCellMeasurementRefln() {
        return new CellMeasurementRefln(this);
    }

    /**
     * 
     * @return DiffrnAttenuator
     */
    public DiffrnAttenuator getDiffrnAttenuator() {
        return new DiffrnAttenuator(this);
    }

    /**
     * 
     * @return DiffrnDetector
     */
    public DiffrnDetector getDiffrnDetector() {
        return new DiffrnDetector(this);
    }

    /**
     * 
     * @return DiffrnMeasurement
     */
    public DiffrnMeasurement getDiffrnMeasurement() {
        return new DiffrnMeasurement(this);
    }

    /**
     * 
     * @return DiffrnOrientMatrix
     */
    public DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return new DiffrnOrientMatrix(this);
    }

    /**
     * 
     * @return DiffrnOrientRefln
     */
    public DiffrnOrientRefln getDiffrnOrientRefln() {
        return new DiffrnOrientRefln(this);
    }

    /**
     * 
     * @return DiffrnRadiation
     */
    public DiffrnRadiation getDiffrnRadiation() {
        return new DiffrnRadiation(this);
    }

    /**
     * 
     * @return DiffrnRadiationWavelength
     */
    public DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return new DiffrnRadiationWavelength(this);
    }

    /**
     * 
     * @return DiffrnRefln
     */
    public DiffrnRefln getDiffrnRefln() {
        return new DiffrnRefln(this);
    }

    /**
     * 
     * @return DiffrnReflns
     */
    public DiffrnReflns getDiffrnReflns() {
        return new DiffrnReflns(this);
    }

    /**
     * 
     * @return DiffrnReflnsClass
     */
    public DiffrnReflnsClass getDiffrnReflnsClass() {
        return new DiffrnReflnsClass(this);
    }

    /**
     * 
     * @return DiffrnReflnsTransfMatrix
     */
    public DiffrnReflnsTransfMatrix getDiffrnReflnsTransfMatrix() {
        return new DiffrnReflnsTransfMatrix(this);
    }

    /**
     * 
     * @return DiffrnScaleGroup
     */
    public DiffrnScaleGroup getDiffrnScaleGroup() {
        return new DiffrnScaleGroup(this);
    }

    /**
     * 
     * @return DiffrnSource
     */
    public DiffrnSource getDiffrnSource() {
        return new DiffrnSource(this);
    }

    /**
     * 
     * @return DiffrnStandards
     */
    public DiffrnStandards getDiffrnStandards() {
        return new DiffrnStandards(this);
    }

    /**
     * 
     * @return DiffrnStandardRefln
     */
    public DiffrnStandardRefln getDiffrnStandardRefln() {
        return new DiffrnStandardRefln(this);
    }

    /**
     * 
     * @return Refln
     */
    public Refln getRefln() {
        return new Refln(this);
    }

    /**
     * 
     * @return Reflns
     */
    public Reflns getReflns() {
        return new Reflns(this);
    }

    /**
     * 
     * @return ReflnsClass
     */
    public ReflnsClass getReflnsClass() {
        return new ReflnsClass(this);
    }

    /**
     * 
     * @return ReflnsScale
     */
    public ReflnsScale getReflnsScale() {
        return new ReflnsScale(this);
    }

    /**
     * 
     * @return ReflnsShell
     */
    public ReflnsShell getReflnsShell() {
        return new ReflnsShell(this);
    }

    /**
     * 
     * @return Exptl
     */
    public Exptl getExptl() {
        return new Exptl(this);
    }

    /**
     * 
     * @return Chemical
     */
    public Chemical getChemical() {
        return new Chemical(this);
    }

    /**
     * 
     * @return ChemicalConnAtom
     */
    public ChemicalConnAtom getChemicalConnAtom() {
        return new ChemicalConnAtom(this);
    }

    /**
     * 
     * @return ChemicalConnBond
     */
    public ChemicalConnBond getChemicalConnBond() {
        return new ChemicalConnBond(this);
    }

    /**
     * 
     * @return ChemicalFormula
     */
    public ChemicalFormula getChemicalFormula() {
        return new ChemicalFormula(this);
    }

    /**
     * 
     * @return ExptlAbsorpt
     */
    public ExptlAbsorpt getExptlAbsorpt() {
        return new ExptlAbsorpt(this);
    }

    /**
     * 
     * @return ExptlCrystal
     */
    public ExptlCrystal getExptlCrystal() {
        return new ExptlCrystal(this);
    }

    /**
     * 
     * @return ExptlCrystalAppearance
     */
    public ExptlCrystalAppearance getExptlCrystalAppearance() {
        return new ExptlCrystalAppearance(this);
    }

    /**
     * 
     * @return ExptlCrystalFace
     */
    public ExptlCrystalFace getExptlCrystalFace() {
        return new ExptlCrystalFace(this);
    }

    /**
     * 
     * @return SpaceGroup
     */
    public SpaceGroup getSpaceGroup() {
        return new SpaceGroup(this);
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
     * @return SpaceGroupGenerator
     */
    public SpaceGroupGenerator getSpaceGroupGenerator() {
        return new SpaceGroupGenerator(this);
    }

    /**
     * 
     * @return SpaceGroupSymop
     */
    public SpaceGroupSymop getSpaceGroupSymop() {
        return new SpaceGroupSymop(this);
    }

    /**
     * 
     * @return SpaceGroupWyckoff
     */
    public SpaceGroupWyckoff getSpaceGroupWyckoff() {
        return new SpaceGroupWyckoff(this);
    }

    /**
     * 
     * @return Geom
     */
    public Geom getGeom() {
        return new Geom(this);
    }

    /**
     * 
     * @return GeomAngle
     */
    public GeomAngle getGeomAngle() {
        return new GeomAngle(this);
    }

    /**
     * 
     * @return GeomBond
     */
    public GeomBond getGeomBond() {
        return new GeomBond(this);
    }

    /**
     * 
     * @return GeomContact
     */
    public GeomContact getGeomContact() {
        return new GeomContact(this);
    }

    /**
     * 
     * @return GeomHbond
     */
    public GeomHbond getGeomHbond() {
        return new GeomHbond(this);
    }

    /**
     * 
     * @return GeomTorsion
     */
    public GeomTorsion getGeomTorsion() {
        return new GeomTorsion(this);
    }

    /**
     * 
     * @return ModelSite
     */
    public ModelSite getModelSite() {
        return new ModelSite(this);
    }

    /**
     * 
     * @return ValenceParam
     */
    public ValenceParam getValenceParam() {
        return new ValenceParam(this);
    }

    /**
     * 
     * @return ValenceRef
     */
    public ValenceRef getValenceRef() {
        return new ValenceRef(this);
    }

    /**
     * 
     * @return Audit
     */
    public Audit getAudit() {
        return new Audit(this);
    }

    /**
     * 
     * @return AuditAuthor
     */
    public AuditAuthor getAuditAuthor() {
        return new AuditAuthor(this);
    }

    /**
     * 
     * @return AuditAuthorRole
     */
    public AuditAuthorRole getAuditAuthorRole() {
        return new AuditAuthorRole(this);
    }

    /**
     * 
     * @return AuditConform
     */
    public AuditConform getAuditConform() {
        return new AuditConform(this);
    }

    /**
     * 
     * @return AuditContactAuthor
     */
    public AuditContactAuthor getAuditContactAuthor() {
        return new AuditContactAuthor(this);
    }

    /**
     * 
     * @return AuditLink
     */
    public AuditLink getAuditLink() {
        return new AuditLink(this);
    }

    /**
     * 
     * @return AuditSupport
     */
    public AuditSupport getAuditSupport() {
        return new AuditSupport(this);
    }

    /**
     * 
     * @return Citation
     */
    public Citation getCitation() {
        return new Citation(this);
    }

    /**
     * 
     * @return CitationAuthor
     */
    public CitationAuthor getCitationAuthor() {
        return new CitationAuthor(this);
    }

    /**
     * 
     * @return CitationEditor
     */
    public CitationEditor getCitationEditor() {
        return new CitationEditor(this);
    }

    /**
     * 
     * @return Computing
     */
    public Computing getComputing() {
        return new Computing(this);
    }

    /**
     * 
     * @return Database
     */
    public Database getDatabase() {
        return new Database(this);
    }

    /**
     * 
     * @return DatabaseCode
     */
    public DatabaseCode getDatabaseCode() {
        return new DatabaseCode(this);
    }

    /**
     * 
     * @return DatabaseRelated
     */
    public DatabaseRelated getDatabaseRelated() {
        return new DatabaseRelated(this);
    }

    /**
     * 
     * @return DisplayColour
     */
    public DisplayColour getDisplayColour() {
        return new DisplayColour(this);
    }

    /**
     * 
     * @return Journal
     */
    public Journal getJournal() {
        return new Journal(this);
    }

    /**
     * 
     * @return JournalCoeditor
     */
    public JournalCoeditor getJournalCoeditor() {
        return new JournalCoeditor(this);
    }

    /**
     * 
     * @return JournalDate
     */
    public JournalDate getJournalDate() {
        return new JournalDate(this);
    }

    /**
     * 
     * @return JournalIndex
     */
    public JournalIndex getJournalIndex() {
        return new JournalIndex(this);
    }

    /**
     * 
     * @return JournalTecheditor
     */
    public JournalTecheditor getJournalTecheditor() {
        return new JournalTecheditor(this);
    }

    /**
     * 
     * @return Publ
     */
    public Publ getPubl() {
        return new Publ(this);
    }

    /**
     * 
     * @return PublAuthor
     */
    public PublAuthor getPublAuthor() {
        return new PublAuthor(this);
    }

    /**
     * 
     * @return PublBody
     */
    public PublBody getPublBody() {
        return new PublBody(this);
    }

    /**
     * 
     * @return PublContactAuthor
     */
    public PublContactAuthor getPublContactAuthor() {
        return new PublContactAuthor(this);
    }

    /**
     * 
     * @return PublManuscript
     */
    public PublManuscript getPublManuscript() {
        return new PublManuscript(this);
    }

    /**
     * 
     * @return PublManuscriptInclExtra
     */
    public PublManuscriptInclExtra getPublManuscriptInclExtra() {
        return new PublManuscriptInclExtra(this);
    }

    /**
     * 
     * @return PublRequested
     */
    public PublRequested getPublRequested() {
        return new PublRequested(this);
    }

    /**
     * 
     * @return PublSection
     */
    public PublSection getPublSection() {
        return new PublSection(this);
    }

    /**
     * 
     * @return AtomAnalytical
     */
    public AtomAnalytical getAtomAnalytical() {
        return new AtomAnalytical(this);
    }

    /**
     * 
     * @return AtomAnalyticalMassLoss
     */
    public AtomAnalyticalMassLoss getAtomAnalyticalMassLoss() {
        return new AtomAnalyticalMassLoss(this);
    }

    /**
     * 
     * @return AtomAnalyticalSource
     */
    public AtomAnalyticalSource getAtomAnalyticalSource() {
        return new AtomAnalyticalSource(this);
    }

    /**
     * 
     * @return AtomScatVersusStol
     */
    public AtomScatVersusStol getAtomScatVersusStol() {
        return new AtomScatVersusStol(this);
    }

    /**
     * 
     * @return AtomSite
     */
    public AtomSite getAtomSite() {
        return new AtomSite(this);
    }

    /**
     * 
     * @return AtomSiteAniso
     */
    public AtomSiteAniso getAtomSiteAniso() {
        return new AtomSiteAniso(this);
    }

    /**
     * 
     * @return AtomSites
     */
    public AtomSites getAtomSites() {
        return new AtomSites(this);
    }

    /**
     * 
     * @return AtomSitesCartnTransform
     */
    public AtomSitesCartnTransform getAtomSitesCartnTransform() {
        return new AtomSitesCartnTransform(this);
    }

    /**
     * 
     * @return AtomSitesFractTransform
     */
    public AtomSitesFractTransform getAtomSitesFractTransform() {
        return new AtomSitesFractTransform(this);
    }

    /**
     * 
     * @return AtomType
     */
    public AtomType getAtomType() {
        return new AtomType(this);
    }

    /**
     * 
     * @return AtomTypeScat
     */
    public AtomTypeScat getAtomTypeScat() {
        return new AtomTypeScat(this);
    }

    /**
     * 
     * @return Refine
     */
    public Refine getRefine() {
        return new Refine(this);
    }

    /**
     * 
     * @return RefineDiff
     */
    public RefineDiff getRefineDiff() {
        return new RefineDiff(this);
    }

    /**
     * 
     * @return RefineLs
     */
    public RefineLs getRefineLs() {
        return new RefineLs(this);
    }

    /**
     * 
     * @return RefineLsClass
     */
    public RefineLsClass getRefineLsClass() {
        return new RefineLsClass(this);
    }

    /**
     * 
     * @return Function
     */
    public Function getFunction() {
        return new Function(this);
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