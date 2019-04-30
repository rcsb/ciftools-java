package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.ModelFactory;
import org.rcsb.cif.model.BaseBlock;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;

import java.util.LinkedHashMap;

/**
 * Builds a block in a {@link org.rcsb.cif.model.CifFile}, in most cases there is 1 block which contains all categories
 * of the file.
 */
public class BlockBuilder {
    private final String blockName;
    private final LinkedHashMap<String, Category> categories;
    private final CifBuilder parent;

    /**
     * Create a BlockBuilder instance.
     * @param blockName the name of this block
     * @param parent the parent builder - can be <code>null</code>, but {@link BlockBuilder#leaveBlock()} will throw an
     *               exception if invoked
     */
    public BlockBuilder(String blockName, CifBuilder parent) {
        this.blockName = blockName;
        this.categories = new LinkedHashMap<>();
        this.parent = parent;
    }

    /**
     * The name of this block.
     * @return a String
     */
    String getBlockName() {
        return blockName;
    }

    /**
     * Associated categories.
     * @return the category map
     */
    LinkedHashMap<String, Category> getCategories() {
        return categories;
    }

    /**
     * Dive into a category captured by this builder. This will create a generic category, for categories in the CIF
     * schema use the named enter functions.
     * @param categoryName the name of this category
     * @return the CategoryBuilder
     */
    public CategoryBuilder enterCategory(String categoryName) {
        return new CategoryBuilder(categoryName, this);
    }

    /**
     * Package-private function to process the information of children.
     * @param categoryBuilder the child builder to incorporate
     * @return this BlockBuilder instance
     */
    BlockBuilder digest(CategoryBuilder categoryBuilder) {
        Category category = ModelFactory.createCategoryText(categoryBuilder.getCategoryName(), categoryBuilder.getColumns());
        categories.put(categoryBuilder.getCategoryName(), category);
        return this;
    }

    /**
     * Process all stored information and return to the initial CifBuilder instance.
     * @return the parent builder
     */
    public CifBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        return parent.digest(this);
    }

    /**
     * Process all stored information and release a {@link Block} instance. Use {@link BlockBuilder#leaveBlock()} if you
     * want to create a {@link CifFile} instance. Otherwise the block is aware of this parent (and vice versa).
     * @return the created Block
     */
    public Block build() {
        return new BaseBlock(categories, "unknown");
    }

    /**
     * Add an arbitrary category and make this builder aware of it.
     * @param category the category to add
     * @return this BlockBuilder instance
     */
    public BlockBuilder addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
        return this;
    }

    // generated builder functions

    public CategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new CategoryBuilder.AtomSiteBuilder(this);
    }

    public CategoryBuilder.AtomSiteAnisotropBuilder enterAtomSiteAnisotrop() {
        return new CategoryBuilder.AtomSiteAnisotropBuilder(this);
    }

    public CategoryBuilder.AtomSitesBuilder enterAtomSites() {
        return new CategoryBuilder.AtomSitesBuilder(this);
    }

    public CategoryBuilder.AtomSitesAltBuilder enterAtomSitesAlt() {
        return new CategoryBuilder.AtomSitesAltBuilder(this);
    }

    public CategoryBuilder.AtomSitesAltEnsBuilder enterAtomSitesAltEns() {
        return new CategoryBuilder.AtomSitesAltEnsBuilder(this);
    }

    public CategoryBuilder.AtomSitesAltGenBuilder enterAtomSitesAltGen() {
        return new CategoryBuilder.AtomSitesAltGenBuilder(this);
    }

    public CategoryBuilder.AtomSitesFootnoteBuilder enterAtomSitesFootnote() {
        return new CategoryBuilder.AtomSitesFootnoteBuilder(this);
    }

    public CategoryBuilder.AtomTypeBuilder enterAtomType() {
        return new CategoryBuilder.AtomTypeBuilder(this);
    }

    public CategoryBuilder.AuditBuilder enterAudit() {
        return new CategoryBuilder.AuditBuilder(this);
    }

    public CategoryBuilder.AuditAuthorBuilder enterAuditAuthor() {
        return new CategoryBuilder.AuditAuthorBuilder(this);
    }

    public CategoryBuilder.AuditConformBuilder enterAuditConform() {
        return new CategoryBuilder.AuditConformBuilder(this);
    }

    public CategoryBuilder.AuditContactAuthorBuilder enterAuditContactAuthor() {
        return new CategoryBuilder.AuditContactAuthorBuilder(this);
    }

    public CategoryBuilder.CellBuilder enterCell() {
        return new CategoryBuilder.CellBuilder(this);
    }

    public CategoryBuilder.CellMeasurementBuilder enterCellMeasurement() {
        return new CategoryBuilder.CellMeasurementBuilder(this);
    }

    public CategoryBuilder.CellMeasurementReflnBuilder enterCellMeasurementRefln() {
        return new CategoryBuilder.CellMeasurementReflnBuilder(this);
    }

    public CategoryBuilder.ChemCompBuilder enterChemComp() {
        return new CategoryBuilder.ChemCompBuilder(this);
    }

    public CategoryBuilder.ChemCompAngleBuilder enterChemCompAngle() {
        return new CategoryBuilder.ChemCompAngleBuilder(this);
    }

    public CategoryBuilder.ChemCompAtomBuilder enterChemCompAtom() {
        return new CategoryBuilder.ChemCompAtomBuilder(this);
    }

    public CategoryBuilder.ChemCompBondBuilder enterChemCompBond() {
        return new CategoryBuilder.ChemCompBondBuilder(this);
    }

    public CategoryBuilder.ChemCompChirBuilder enterChemCompChir() {
        return new CategoryBuilder.ChemCompChirBuilder(this);
    }

    public CategoryBuilder.ChemCompChirAtomBuilder enterChemCompChirAtom() {
        return new CategoryBuilder.ChemCompChirAtomBuilder(this);
    }

    public CategoryBuilder.ChemCompLinkBuilder enterChemCompLink() {
        return new CategoryBuilder.ChemCompLinkBuilder(this);
    }

    public CategoryBuilder.ChemCompPlaneBuilder enterChemCompPlane() {
        return new CategoryBuilder.ChemCompPlaneBuilder(this);
    }

    public CategoryBuilder.ChemCompPlaneAtomBuilder enterChemCompPlaneAtom() {
        return new CategoryBuilder.ChemCompPlaneAtomBuilder(this);
    }

    public CategoryBuilder.ChemCompTorBuilder enterChemCompTor() {
        return new CategoryBuilder.ChemCompTorBuilder(this);
    }

    public CategoryBuilder.ChemCompTorValueBuilder enterChemCompTorValue() {
        return new CategoryBuilder.ChemCompTorValueBuilder(this);
    }

    public CategoryBuilder.ChemLinkBuilder enterChemLink() {
        return new CategoryBuilder.ChemLinkBuilder(this);
    }

    public CategoryBuilder.ChemLinkAngleBuilder enterChemLinkAngle() {
        return new CategoryBuilder.ChemLinkAngleBuilder(this);
    }

    public CategoryBuilder.ChemLinkBondBuilder enterChemLinkBond() {
        return new CategoryBuilder.ChemLinkBondBuilder(this);
    }

    public CategoryBuilder.ChemLinkChirBuilder enterChemLinkChir() {
        return new CategoryBuilder.ChemLinkChirBuilder(this);
    }

    public CategoryBuilder.ChemLinkChirAtomBuilder enterChemLinkChirAtom() {
        return new CategoryBuilder.ChemLinkChirAtomBuilder(this);
    }

    public CategoryBuilder.ChemLinkPlaneBuilder enterChemLinkPlane() {
        return new CategoryBuilder.ChemLinkPlaneBuilder(this);
    }

    public CategoryBuilder.ChemLinkPlaneAtomBuilder enterChemLinkPlaneAtom() {
        return new CategoryBuilder.ChemLinkPlaneAtomBuilder(this);
    }

    public CategoryBuilder.ChemLinkTorBuilder enterChemLinkTor() {
        return new CategoryBuilder.ChemLinkTorBuilder(this);
    }

    public CategoryBuilder.ChemLinkTorValueBuilder enterChemLinkTorValue() {
        return new CategoryBuilder.ChemLinkTorValueBuilder(this);
    }

    public CategoryBuilder.ChemicalBuilder enterChemical() {
        return new CategoryBuilder.ChemicalBuilder(this);
    }

    public CategoryBuilder.ChemicalConnAtomBuilder enterChemicalConnAtom() {
        return new CategoryBuilder.ChemicalConnAtomBuilder(this);
    }

    public CategoryBuilder.ChemicalConnBondBuilder enterChemicalConnBond() {
        return new CategoryBuilder.ChemicalConnBondBuilder(this);
    }

    public CategoryBuilder.ChemicalFormulaBuilder enterChemicalFormula() {
        return new CategoryBuilder.ChemicalFormulaBuilder(this);
    }

    public CategoryBuilder.CitationBuilder enterCitation() {
        return new CategoryBuilder.CitationBuilder(this);
    }

    public CategoryBuilder.CitationAuthorBuilder enterCitationAuthor() {
        return new CategoryBuilder.CitationAuthorBuilder(this);
    }

    public CategoryBuilder.CitationEditorBuilder enterCitationEditor() {
        return new CategoryBuilder.CitationEditorBuilder(this);
    }

    public CategoryBuilder.ComputingBuilder enterComputing() {
        return new CategoryBuilder.ComputingBuilder(this);
    }

    public CategoryBuilder.DatabaseBuilder enterDatabase() {
        return new CategoryBuilder.DatabaseBuilder(this);
    }

    public CategoryBuilder.Database2Builder enterDatabase2() {
        return new CategoryBuilder.Database2Builder(this);
    }

    public CategoryBuilder.DatabasePDBCaveatBuilder enterDatabasePDBCaveat() {
        return new CategoryBuilder.DatabasePDBCaveatBuilder(this);
    }

    public CategoryBuilder.DatabasePDBMatrixBuilder enterDatabasePDBMatrix() {
        return new CategoryBuilder.DatabasePDBMatrixBuilder(this);
    }

    public CategoryBuilder.DatabasePDBRemarkBuilder enterDatabasePDBRemark() {
        return new CategoryBuilder.DatabasePDBRemarkBuilder(this);
    }

    public CategoryBuilder.DatabasePDBRevBuilder enterDatabasePDBRev() {
        return new CategoryBuilder.DatabasePDBRevBuilder(this);
    }

    public CategoryBuilder.DatabasePDBRevRecordBuilder enterDatabasePDBRevRecord() {
        return new CategoryBuilder.DatabasePDBRevRecordBuilder(this);
    }

    public CategoryBuilder.DatabasePDBTvectBuilder enterDatabasePDBTvect() {
        return new CategoryBuilder.DatabasePDBTvectBuilder(this);
    }

    public CategoryBuilder.DiffrnBuilder enterDiffrn() {
        return new CategoryBuilder.DiffrnBuilder(this);
    }

    public CategoryBuilder.DiffrnAttenuatorBuilder enterDiffrnAttenuator() {
        return new CategoryBuilder.DiffrnAttenuatorBuilder(this);
    }

    public CategoryBuilder.DiffrnDetectorBuilder enterDiffrnDetector() {
        return new CategoryBuilder.DiffrnDetectorBuilder(this);
    }

    public CategoryBuilder.DiffrnMeasurementBuilder enterDiffrnMeasurement() {
        return new CategoryBuilder.DiffrnMeasurementBuilder(this);
    }

    public CategoryBuilder.DiffrnOrientMatrixBuilder enterDiffrnOrientMatrix() {
        return new CategoryBuilder.DiffrnOrientMatrixBuilder(this);
    }

    public CategoryBuilder.DiffrnOrientReflnBuilder enterDiffrnOrientRefln() {
        return new CategoryBuilder.DiffrnOrientReflnBuilder(this);
    }

    public CategoryBuilder.DiffrnRadiationBuilder enterDiffrnRadiation() {
        return new CategoryBuilder.DiffrnRadiationBuilder(this);
    }

    public CategoryBuilder.DiffrnRadiationWavelengthBuilder enterDiffrnRadiationWavelength() {
        return new CategoryBuilder.DiffrnRadiationWavelengthBuilder(this);
    }

    public CategoryBuilder.DiffrnReflnBuilder enterDiffrnRefln() {
        return new CategoryBuilder.DiffrnReflnBuilder(this);
    }

    public CategoryBuilder.DiffrnReflnsBuilder enterDiffrnReflns() {
        return new CategoryBuilder.DiffrnReflnsBuilder(this);
    }

    public CategoryBuilder.DiffrnScaleGroupBuilder enterDiffrnScaleGroup() {
        return new CategoryBuilder.DiffrnScaleGroupBuilder(this);
    }

    public CategoryBuilder.DiffrnSourceBuilder enterDiffrnSource() {
        return new CategoryBuilder.DiffrnSourceBuilder(this);
    }

    public CategoryBuilder.DiffrnStandardReflnBuilder enterDiffrnStandardRefln() {
        return new CategoryBuilder.DiffrnStandardReflnBuilder(this);
    }

    public CategoryBuilder.DiffrnStandardsBuilder enterDiffrnStandards() {
        return new CategoryBuilder.DiffrnStandardsBuilder(this);
    }

    public CategoryBuilder.EntityBuilder enterEntity() {
        return new CategoryBuilder.EntityBuilder(this);
    }

    public CategoryBuilder.EntityKeywordsBuilder enterEntityKeywords() {
        return new CategoryBuilder.EntityKeywordsBuilder(this);
    }

    public CategoryBuilder.EntityLinkBuilder enterEntityLink() {
        return new CategoryBuilder.EntityLinkBuilder(this);
    }

    public CategoryBuilder.EntityNameComBuilder enterEntityNameCom() {
        return new CategoryBuilder.EntityNameComBuilder(this);
    }

    public CategoryBuilder.EntityNameSysBuilder enterEntityNameSys() {
        return new CategoryBuilder.EntityNameSysBuilder(this);
    }

    public CategoryBuilder.EntityPolyBuilder enterEntityPoly() {
        return new CategoryBuilder.EntityPolyBuilder(this);
    }

    public CategoryBuilder.EntityPolySeqBuilder enterEntityPolySeq() {
        return new CategoryBuilder.EntityPolySeqBuilder(this);
    }

    public CategoryBuilder.EntryBuilder enterEntry() {
        return new CategoryBuilder.EntryBuilder(this);
    }

    public CategoryBuilder.EntryLinkBuilder enterEntryLink() {
        return new CategoryBuilder.EntryLinkBuilder(this);
    }

    public CategoryBuilder.ExptlBuilder enterExptl() {
        return new CategoryBuilder.ExptlBuilder(this);
    }

    public CategoryBuilder.ExptlCrystalBuilder enterExptlCrystal() {
        return new CategoryBuilder.ExptlCrystalBuilder(this);
    }

    public CategoryBuilder.ExptlCrystalFaceBuilder enterExptlCrystalFace() {
        return new CategoryBuilder.ExptlCrystalFaceBuilder(this);
    }

    public CategoryBuilder.ExptlCrystalGrowBuilder enterExptlCrystalGrow() {
        return new CategoryBuilder.ExptlCrystalGrowBuilder(this);
    }

    public CategoryBuilder.ExptlCrystalGrowCompBuilder enterExptlCrystalGrowComp() {
        return new CategoryBuilder.ExptlCrystalGrowCompBuilder(this);
    }

    public CategoryBuilder.GeomBuilder enterGeom() {
        return new CategoryBuilder.GeomBuilder(this);
    }

    public CategoryBuilder.GeomAngleBuilder enterGeomAngle() {
        return new CategoryBuilder.GeomAngleBuilder(this);
    }

    public CategoryBuilder.GeomBondBuilder enterGeomBond() {
        return new CategoryBuilder.GeomBondBuilder(this);
    }

    public CategoryBuilder.GeomContactBuilder enterGeomContact() {
        return new CategoryBuilder.GeomContactBuilder(this);
    }

    public CategoryBuilder.GeomHbondBuilder enterGeomHbond() {
        return new CategoryBuilder.GeomHbondBuilder(this);
    }

    public CategoryBuilder.GeomTorsionBuilder enterGeomTorsion() {
        return new CategoryBuilder.GeomTorsionBuilder(this);
    }

    public CategoryBuilder.JournalBuilder enterJournal() {
        return new CategoryBuilder.JournalBuilder(this);
    }

    public CategoryBuilder.JournalIndexBuilder enterJournalIndex() {
        return new CategoryBuilder.JournalIndexBuilder(this);
    }

    public CategoryBuilder.PhasingBuilder enterPhasing() {
        return new CategoryBuilder.PhasingBuilder(this);
    }

    public CategoryBuilder.PhasingAveragingBuilder enterPhasingAveraging() {
        return new CategoryBuilder.PhasingAveragingBuilder(this);
    }

    public CategoryBuilder.PhasingIsomorphousBuilder enterPhasingIsomorphous() {
        return new CategoryBuilder.PhasingIsomorphousBuilder(this);
    }

    public CategoryBuilder.PhasingMADBuilder enterPhasingMAD() {
        return new CategoryBuilder.PhasingMADBuilder(this);
    }

    public CategoryBuilder.PhasingMADClustBuilder enterPhasingMADClust() {
        return new CategoryBuilder.PhasingMADClustBuilder(this);
    }

    public CategoryBuilder.PhasingMADExptBuilder enterPhasingMADExpt() {
        return new CategoryBuilder.PhasingMADExptBuilder(this);
    }

    public CategoryBuilder.PhasingMADRatioBuilder enterPhasingMADRatio() {
        return new CategoryBuilder.PhasingMADRatioBuilder(this);
    }

    public CategoryBuilder.PhasingMADSetBuilder enterPhasingMADSet() {
        return new CategoryBuilder.PhasingMADSetBuilder(this);
    }

    public CategoryBuilder.PhasingMIRBuilder enterPhasingMIR() {
        return new CategoryBuilder.PhasingMIRBuilder(this);
    }

    public CategoryBuilder.PhasingMIRDerBuilder enterPhasingMIRDer() {
        return new CategoryBuilder.PhasingMIRDerBuilder(this);
    }

    public CategoryBuilder.PhasingMIRDerReflnBuilder enterPhasingMIRDerRefln() {
        return new CategoryBuilder.PhasingMIRDerReflnBuilder(this);
    }

    public CategoryBuilder.PhasingMIRDerShellBuilder enterPhasingMIRDerShell() {
        return new CategoryBuilder.PhasingMIRDerShellBuilder(this);
    }

    public CategoryBuilder.PhasingMIRDerSiteBuilder enterPhasingMIRDerSite() {
        return new CategoryBuilder.PhasingMIRDerSiteBuilder(this);
    }

    public CategoryBuilder.PhasingMIRShellBuilder enterPhasingMIRShell() {
        return new CategoryBuilder.PhasingMIRShellBuilder(this);
    }

    public CategoryBuilder.PhasingSetBuilder enterPhasingSet() {
        return new CategoryBuilder.PhasingSetBuilder(this);
    }

    public CategoryBuilder.PhasingSetReflnBuilder enterPhasingSetRefln() {
        return new CategoryBuilder.PhasingSetReflnBuilder(this);
    }

    public CategoryBuilder.PublBuilder enterPubl() {
        return new CategoryBuilder.PublBuilder(this);
    }

    public CategoryBuilder.PublAuthorBuilder enterPublAuthor() {
        return new CategoryBuilder.PublAuthorBuilder(this);
    }

    public CategoryBuilder.PublBodyBuilder enterPublBody() {
        return new CategoryBuilder.PublBodyBuilder(this);
    }

    public CategoryBuilder.PublManuscriptInclBuilder enterPublManuscriptIncl() {
        return new CategoryBuilder.PublManuscriptInclBuilder(this);
    }

    public CategoryBuilder.RefineBuilder enterRefine() {
        return new CategoryBuilder.RefineBuilder(this);
    }

    public CategoryBuilder.RefineAnalyzeBuilder enterRefineAnalyze() {
        return new CategoryBuilder.RefineAnalyzeBuilder(this);
    }

    public CategoryBuilder.RefineBIsoBuilder enterRefineBIso() {
        return new CategoryBuilder.RefineBIsoBuilder(this);
    }

    public CategoryBuilder.RefineFunctMinimizedBuilder enterRefineFunctMinimized() {
        return new CategoryBuilder.RefineFunctMinimizedBuilder(this);
    }

    public CategoryBuilder.RefineHistBuilder enterRefineHist() {
        return new CategoryBuilder.RefineHistBuilder(this);
    }

    public CategoryBuilder.RefineLsRestrBuilder enterRefineLsRestr() {
        return new CategoryBuilder.RefineLsRestrBuilder(this);
    }

    public CategoryBuilder.RefineLsRestrNcsBuilder enterRefineLsRestrNcs() {
        return new CategoryBuilder.RefineLsRestrNcsBuilder(this);
    }

    public CategoryBuilder.RefineLsRestrTypeBuilder enterRefineLsRestrType() {
        return new CategoryBuilder.RefineLsRestrTypeBuilder(this);
    }

    public CategoryBuilder.RefineLsShellBuilder enterRefineLsShell() {
        return new CategoryBuilder.RefineLsShellBuilder(this);
    }

    public CategoryBuilder.RefineOccupancyBuilder enterRefineOccupancy() {
        return new CategoryBuilder.RefineOccupancyBuilder(this);
    }

    public CategoryBuilder.ReflnBuilder enterRefln() {
        return new CategoryBuilder.ReflnBuilder(this);
    }

    public CategoryBuilder.ReflnSysAbsBuilder enterReflnSysAbs() {
        return new CategoryBuilder.ReflnSysAbsBuilder(this);
    }

    public CategoryBuilder.ReflnsBuilder enterReflns() {
        return new CategoryBuilder.ReflnsBuilder(this);
    }

    public CategoryBuilder.ReflnsScaleBuilder enterReflnsScale() {
        return new CategoryBuilder.ReflnsScaleBuilder(this);
    }

    public CategoryBuilder.ReflnsShellBuilder enterReflnsShell() {
        return new CategoryBuilder.ReflnsShellBuilder(this);
    }

    public CategoryBuilder.SoftwareBuilder enterSoftware() {
        return new CategoryBuilder.SoftwareBuilder(this);
    }

    public CategoryBuilder.StructBuilder enterStruct() {
        return new CategoryBuilder.StructBuilder(this);
    }

    public CategoryBuilder.StructAsymBuilder enterStructAsym() {
        return new CategoryBuilder.StructAsymBuilder(this);
    }

    public CategoryBuilder.StructBiolBuilder enterStructBiol() {
        return new CategoryBuilder.StructBiolBuilder(this);
    }

    public CategoryBuilder.StructBiolGenBuilder enterStructBiolGen() {
        return new CategoryBuilder.StructBiolGenBuilder(this);
    }

    public CategoryBuilder.StructBiolKeywordsBuilder enterStructBiolKeywords() {
        return new CategoryBuilder.StructBiolKeywordsBuilder(this);
    }

    public CategoryBuilder.StructBiolViewBuilder enterStructBiolView() {
        return new CategoryBuilder.StructBiolViewBuilder(this);
    }

    public CategoryBuilder.StructConfBuilder enterStructConf() {
        return new CategoryBuilder.StructConfBuilder(this);
    }

    public CategoryBuilder.StructConfTypeBuilder enterStructConfType() {
        return new CategoryBuilder.StructConfTypeBuilder(this);
    }

    public CategoryBuilder.StructConnBuilder enterStructConn() {
        return new CategoryBuilder.StructConnBuilder(this);
    }

    public CategoryBuilder.StructConnTypeBuilder enterStructConnType() {
        return new CategoryBuilder.StructConnTypeBuilder(this);
    }

    public CategoryBuilder.StructKeywordsBuilder enterStructKeywords() {
        return new CategoryBuilder.StructKeywordsBuilder(this);
    }

    public CategoryBuilder.StructMonDetailsBuilder enterStructMonDetails() {
        return new CategoryBuilder.StructMonDetailsBuilder(this);
    }

    public CategoryBuilder.StructMonNuclBuilder enterStructMonNucl() {
        return new CategoryBuilder.StructMonNuclBuilder(this);
    }

    public CategoryBuilder.StructMonProtBuilder enterStructMonProt() {
        return new CategoryBuilder.StructMonProtBuilder(this);
    }

    public CategoryBuilder.StructMonProtCisBuilder enterStructMonProtCis() {
        return new CategoryBuilder.StructMonProtCisBuilder(this);
    }

    public CategoryBuilder.StructNcsDomBuilder enterStructNcsDom() {
        return new CategoryBuilder.StructNcsDomBuilder(this);
    }

    public CategoryBuilder.StructNcsDomLimBuilder enterStructNcsDomLim() {
        return new CategoryBuilder.StructNcsDomLimBuilder(this);
    }

    public CategoryBuilder.StructNcsEnsBuilder enterStructNcsEns() {
        return new CategoryBuilder.StructNcsEnsBuilder(this);
    }

    public CategoryBuilder.StructNcsEnsGenBuilder enterStructNcsEnsGen() {
        return new CategoryBuilder.StructNcsEnsGenBuilder(this);
    }

    public CategoryBuilder.StructNcsOperBuilder enterStructNcsOper() {
        return new CategoryBuilder.StructNcsOperBuilder(this);
    }

    public CategoryBuilder.StructRefBuilder enterStructRef() {
        return new CategoryBuilder.StructRefBuilder(this);
    }

    public CategoryBuilder.StructRefSeqBuilder enterStructRefSeq() {
        return new CategoryBuilder.StructRefSeqBuilder(this);
    }

    public CategoryBuilder.StructRefSeqDifBuilder enterStructRefSeqDif() {
        return new CategoryBuilder.StructRefSeqDifBuilder(this);
    }

    public CategoryBuilder.StructSheetBuilder enterStructSheet() {
        return new CategoryBuilder.StructSheetBuilder(this);
    }

    public CategoryBuilder.StructSheetHbondBuilder enterStructSheetHbond() {
        return new CategoryBuilder.StructSheetHbondBuilder(this);
    }

    public CategoryBuilder.StructSheetOrderBuilder enterStructSheetOrder() {
        return new CategoryBuilder.StructSheetOrderBuilder(this);
    }

    public CategoryBuilder.StructSheetRangeBuilder enterStructSheetRange() {
        return new CategoryBuilder.StructSheetRangeBuilder(this);
    }

    public CategoryBuilder.StructSheetTopologyBuilder enterStructSheetTopology() {
        return new CategoryBuilder.StructSheetTopologyBuilder(this);
    }

    public CategoryBuilder.StructSiteBuilder enterStructSite() {
        return new CategoryBuilder.StructSiteBuilder(this);
    }

    public CategoryBuilder.StructSiteGenBuilder enterStructSiteGen() {
        return new CategoryBuilder.StructSiteGenBuilder(this);
    }

    public CategoryBuilder.StructSiteKeywordsBuilder enterStructSiteKeywords() {
        return new CategoryBuilder.StructSiteKeywordsBuilder(this);
    }

    public CategoryBuilder.StructSiteViewBuilder enterStructSiteView() {
        return new CategoryBuilder.StructSiteViewBuilder(this);
    }

    public CategoryBuilder.SymmetryBuilder enterSymmetry() {
        return new CategoryBuilder.SymmetryBuilder(this);
    }

    public CategoryBuilder.SymmetryEquivBuilder enterSymmetryEquiv() {
        return new CategoryBuilder.SymmetryEquivBuilder(this);
    }

    public CategoryBuilder.AuditLinkBuilder enterAuditLink() {
        return new CategoryBuilder.AuditLinkBuilder(this);
    }

    public CategoryBuilder.DiffrnReflnsClassBuilder enterDiffrnReflnsClass() {
        return new CategoryBuilder.DiffrnReflnsClassBuilder(this);
    }

    public CategoryBuilder.RefineLsClassBuilder enterRefineLsClass() {
        return new CategoryBuilder.RefineLsClassBuilder(this);
    }

    public CategoryBuilder.ReflnsClassBuilder enterReflnsClass() {
        return new CategoryBuilder.ReflnsClassBuilder(this);
    }

    public CategoryBuilder.SpaceGroupBuilder enterSpaceGroup() {
        return new CategoryBuilder.SpaceGroupBuilder(this);
    }

    public CategoryBuilder.SpaceGroupSymopBuilder enterSpaceGroupSymop() {
        return new CategoryBuilder.SpaceGroupSymopBuilder(this);
    }

    public CategoryBuilder.ValenceParamBuilder enterValenceParam() {
        return new CategoryBuilder.ValenceParamBuilder(this);
    }

    public CategoryBuilder.ValenceRefBuilder enterValenceRef() {
        return new CategoryBuilder.ValenceRefBuilder(this);
    }

    public CategoryBuilder.PdbxAuditBuilder enterPdbxAudit() {
        return new CategoryBuilder.PdbxAuditBuilder(this);
    }

    public CategoryBuilder.PdbxVersionBuilder enterPdbxVersion() {
        return new CategoryBuilder.PdbxVersionBuilder(this);
    }

    public CategoryBuilder.PdbxAuditAuthorBuilder enterPdbxAuditAuthor() {
        return new CategoryBuilder.PdbxAuditAuthorBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseMessageBuilder enterPdbxDatabaseMessage() {
        return new CategoryBuilder.PdbxDatabaseMessageBuilder(this);
    }

    public CategoryBuilder.PdbxDatabasePDBObsSprBuilder enterPdbxDatabasePDBObsSpr() {
        return new CategoryBuilder.PdbxDatabasePDBObsSprBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseProcBuilder enterPdbxDatabaseProc() {
        return new CategoryBuilder.PdbxDatabaseProcBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseRemarkBuilder enterPdbxDatabaseRemark() {
        return new CategoryBuilder.PdbxDatabaseRemarkBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseStatusBuilder enterPdbxDatabaseStatus() {
        return new CategoryBuilder.PdbxDatabaseStatusBuilder(this);
    }

    public CategoryBuilder.PdbxEntityNameBuilder enterPdbxEntityName() {
        return new CategoryBuilder.PdbxEntityNameBuilder(this);
    }

    public CategoryBuilder.PdbxPrereleaseSeqBuilder enterPdbxPrereleaseSeq() {
        return new CategoryBuilder.PdbxPrereleaseSeqBuilder(this);
    }

    public CategoryBuilder.PdbxPolySeqSchemeBuilder enterPdbxPolySeqScheme() {
        return new CategoryBuilder.PdbxPolySeqSchemeBuilder(this);
    }

    public CategoryBuilder.PdbxNonpolySchemeBuilder enterPdbxNonpolyScheme() {
        return new CategoryBuilder.PdbxNonpolySchemeBuilder(this);
    }

    public CategoryBuilder.PdbxRefineBuilder enterPdbxRefine() {
        return new CategoryBuilder.PdbxRefineBuilder(this);
    }

    public CategoryBuilder.PdbxStructSheetHbondBuilder enterPdbxStructSheetHbond() {
        return new CategoryBuilder.PdbxStructSheetHbondBuilder(this);
    }

    public CategoryBuilder.PdbxXplorFileBuilder enterPdbxXplorFile() {
        return new CategoryBuilder.PdbxXplorFileBuilder(this);
    }

    public CategoryBuilder.PdbxRefineAuxFileBuilder enterPdbxRefineAuxFile() {
        return new CategoryBuilder.PdbxRefineAuxFileBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseRelatedBuilder enterPdbxDatabaseRelated() {
        return new CategoryBuilder.PdbxDatabaseRelatedBuilder(this);
    }

    public CategoryBuilder.PdbxEntityAssemblyBuilder enterPdbxEntityAssembly() {
        return new CategoryBuilder.PdbxEntityAssemblyBuilder(this);
    }

    public CategoryBuilder.PdbxExptlCrystalGrowCompBuilder enterPdbxExptlCrystalGrowComp() {
        return new CategoryBuilder.PdbxExptlCrystalGrowCompBuilder(this);
    }

    public CategoryBuilder.PdbxExptlCrystalGrowSolBuilder enterPdbxExptlCrystalGrowSol() {
        return new CategoryBuilder.PdbxExptlCrystalGrowSolBuilder(this);
    }

    public CategoryBuilder.PdbxExptlCrystalCryoTreatmentBuilder enterPdbxExptlCrystalCryoTreatment() {
        return new CategoryBuilder.PdbxExptlCrystalCryoTreatmentBuilder(this);
    }

    public CategoryBuilder.PdbxRefineTlsBuilder enterPdbxRefineTls() {
        return new CategoryBuilder.PdbxRefineTlsBuilder(this);
    }

    public CategoryBuilder.PdbxRefineTlsGroupBuilder enterPdbxRefineTlsGroup() {
        return new CategoryBuilder.PdbxRefineTlsGroupBuilder(this);
    }

    public CategoryBuilder.PdbxContactAuthorBuilder enterPdbxContactAuthor() {
        return new CategoryBuilder.PdbxContactAuthorBuilder(this);
    }

    public CategoryBuilder.PdbxSGProjectBuilder enterPdbxSGProject() {
        return new CategoryBuilder.PdbxSGProjectBuilder(this);
    }

    public CategoryBuilder.PdbxAtomSiteAnisoTlsBuilder enterPdbxAtomSiteAnisoTls() {
        return new CategoryBuilder.PdbxAtomSiteAnisoTlsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrDetailsBuilder enterPdbxNmrDetails() {
        return new CategoryBuilder.PdbxNmrDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSampleDetailsBuilder enterPdbxNmrSampleDetails() {
        return new CategoryBuilder.PdbxNmrSampleDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrExptlSampleBuilder enterPdbxNmrExptlSample() {
        return new CategoryBuilder.PdbxNmrExptlSampleBuilder(this);
    }

    public CategoryBuilder.PdbxNmrExptlSampleConditionsBuilder enterPdbxNmrExptlSampleConditions() {
        return new CategoryBuilder.PdbxNmrExptlSampleConditionsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSpectrometerBuilder enterPdbxNmrSpectrometer() {
        return new CategoryBuilder.PdbxNmrSpectrometerBuilder(this);
    }

    public CategoryBuilder.PdbxNmrExptlBuilder enterPdbxNmrExptl() {
        return new CategoryBuilder.PdbxNmrExptlBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSoftwareBuilder enterPdbxNmrSoftware() {
        return new CategoryBuilder.PdbxNmrSoftwareBuilder(this);
    }

    public CategoryBuilder.PdbxNmrConstraintsBuilder enterPdbxNmrConstraints() {
        return new CategoryBuilder.PdbxNmrConstraintsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrEnsembleBuilder enterPdbxNmrEnsemble() {
        return new CategoryBuilder.PdbxNmrEnsembleBuilder(this);
    }

    public CategoryBuilder.PdbxNmrEnsembleRmsBuilder enterPdbxNmrEnsembleRms() {
        return new CategoryBuilder.PdbxNmrEnsembleRmsBuilder(this);
    }

    public CategoryBuilder.PdbxNmrRepresentativeBuilder enterPdbxNmrRepresentative() {
        return new CategoryBuilder.PdbxNmrRepresentativeBuilder(this);
    }

    public CategoryBuilder.PdbxNmrRefineBuilder enterPdbxNmrRefine() {
        return new CategoryBuilder.PdbxNmrRefineBuilder(this);
    }

    public CategoryBuilder.PdbxNmrForceConstantsBuilder enterPdbxNmrForceConstants() {
        return new CategoryBuilder.PdbxNmrForceConstantsBuilder(this);
    }

    public CategoryBuilder.NdbStructConfNaBuilder enterNdbStructConfNa() {
        return new CategoryBuilder.NdbStructConfNaBuilder(this);
    }

    public CategoryBuilder.NdbStructFeatureNaBuilder enterNdbStructFeatureNa() {
        return new CategoryBuilder.NdbStructFeatureNaBuilder(this);
    }

    public CategoryBuilder.NdbStructNaBasePairBuilder enterNdbStructNaBasePair() {
        return new CategoryBuilder.NdbStructNaBasePairBuilder(this);
    }

    public CategoryBuilder.NdbStructNaBasePairStepBuilder enterNdbStructNaBasePairStep() {
        return new CategoryBuilder.NdbStructNaBasePairStepBuilder(this);
    }

    public CategoryBuilder.NdbOriginalNdbCoordinatesBuilder enterNdbOriginalNdbCoordinates() {
        return new CategoryBuilder.NdbOriginalNdbCoordinatesBuilder(this);
    }

    public CategoryBuilder.PdbxEntityNonpolyBuilder enterPdbxEntityNonpoly() {
        return new CategoryBuilder.PdbxEntityNonpolyBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingDmBuilder enterPdbxPhasingDm() {
        return new CategoryBuilder.PdbxPhasingDmBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingDmShellBuilder enterPdbxPhasingDmShell() {
        return new CategoryBuilder.PdbxPhasingDmShellBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingMADShellBuilder enterPdbxPhasingMADShell() {
        return new CategoryBuilder.PdbxPhasingMADShellBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingMADSetBuilder enterPdbxPhasingMADSet() {
        return new CategoryBuilder.PdbxPhasingMADSetBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingMADSetShellBuilder enterPdbxPhasingMADSetShell() {
        return new CategoryBuilder.PdbxPhasingMADSetShellBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingMADSetSiteBuilder enterPdbxPhasingMADSetSite() {
        return new CategoryBuilder.PdbxPhasingMADSetSiteBuilder(this);
    }

    public CategoryBuilder.PdbxPhasingMRBuilder enterPdbxPhasingMR() {
        return new CategoryBuilder.PdbxPhasingMRBuilder(this);
    }

    public CategoryBuilder.PdbxRefineComponentBuilder enterPdbxRefineComponent() {
        return new CategoryBuilder.PdbxRefineComponentBuilder(this);
    }

    public CategoryBuilder.PdbxEntityProdProtocolBuilder enterPdbxEntityProdProtocol() {
        return new CategoryBuilder.PdbxEntityProdProtocolBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenProdOtherBuilder enterPdbxEntitySrcGenProdOther() {
        return new CategoryBuilder.PdbxEntitySrcGenProdOtherBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenProdOtherParameterBuilder enterPdbxEntitySrcGenProdOtherParameter() {
        return new CategoryBuilder.PdbxEntitySrcGenProdOtherParameterBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenProdPcrBuilder enterPdbxEntitySrcGenProdPcr() {
        return new CategoryBuilder.PdbxEntitySrcGenProdPcrBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenProdDigestBuilder enterPdbxEntitySrcGenProdDigest() {
        return new CategoryBuilder.PdbxEntitySrcGenProdDigestBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenCloneBuilder enterPdbxEntitySrcGenClone() {
        return new CategoryBuilder.PdbxEntitySrcGenCloneBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenCloneLigationBuilder enterPdbxEntitySrcGenCloneLigation() {
        return new CategoryBuilder.PdbxEntitySrcGenCloneLigationBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenCloneRecombinationBuilder enterPdbxEntitySrcGenCloneRecombination() {
        return new CategoryBuilder.PdbxEntitySrcGenCloneRecombinationBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenExpressBuilder enterPdbxEntitySrcGenExpress() {
        return new CategoryBuilder.PdbxEntitySrcGenExpressBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenExpressTimepointBuilder enterPdbxEntitySrcGenExpressTimepoint() {
        return new CategoryBuilder.PdbxEntitySrcGenExpressTimepointBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenLysisBuilder enterPdbxEntitySrcGenLysis() {
        return new CategoryBuilder.PdbxEntitySrcGenLysisBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenRefoldBuilder enterPdbxEntitySrcGenRefold() {
        return new CategoryBuilder.PdbxEntitySrcGenRefoldBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenProteolysisBuilder enterPdbxEntitySrcGenProteolysis() {
        return new CategoryBuilder.PdbxEntitySrcGenProteolysisBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenChromBuilder enterPdbxEntitySrcGenChrom() {
        return new CategoryBuilder.PdbxEntitySrcGenChromBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenFractBuilder enterPdbxEntitySrcGenFract() {
        return new CategoryBuilder.PdbxEntitySrcGenFractBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenPureBuilder enterPdbxEntitySrcGenPure() {
        return new CategoryBuilder.PdbxEntitySrcGenPureBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenCharacterBuilder enterPdbxEntitySrcGenCharacter() {
        return new CategoryBuilder.PdbxEntitySrcGenCharacterBuilder(this);
    }

    public CategoryBuilder.PdbxConstructBuilder enterPdbxConstruct() {
        return new CategoryBuilder.PdbxConstructBuilder(this);
    }

    public CategoryBuilder.PdbxConstructFeatureBuilder enterPdbxConstructFeature() {
        return new CategoryBuilder.PdbxConstructFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxRobotSystemBuilder enterPdbxRobotSystem() {
        return new CategoryBuilder.PdbxRobotSystemBuilder(this);
    }

    public CategoryBuilder.PdbxBufferBuilder enterPdbxBuffer() {
        return new CategoryBuilder.PdbxBufferBuilder(this);
    }

    public CategoryBuilder.PdbxBufferComponentsBuilder enterPdbxBufferComponents() {
        return new CategoryBuilder.PdbxBufferComponentsBuilder(this);
    }

    public CategoryBuilder.PdbxDomainBuilder enterPdbxDomain() {
        return new CategoryBuilder.PdbxDomainBuilder(this);
    }

    public CategoryBuilder.PdbxDomainRangeBuilder enterPdbxDomainRange() {
        return new CategoryBuilder.PdbxDomainRangeBuilder(this);
    }

    public CategoryBuilder.PdbxSequenceRangeBuilder enterPdbxSequenceRange() {
        return new CategoryBuilder.PdbxSequenceRangeBuilder(this);
    }

    public CategoryBuilder.PdbxFeatureEntryBuilder enterPdbxFeatureEntry() {
        return new CategoryBuilder.PdbxFeatureEntryBuilder(this);
    }

    public CategoryBuilder.PdbxFeatureDomainBuilder enterPdbxFeatureDomain() {
        return new CategoryBuilder.PdbxFeatureDomainBuilder(this);
    }

    public CategoryBuilder.PdbxFeatureSequenceRangeBuilder enterPdbxFeatureSequenceRange() {
        return new CategoryBuilder.PdbxFeatureSequenceRangeBuilder(this);
    }

    public CategoryBuilder.PdbxFeatureAssemblyBuilder enterPdbxFeatureAssembly() {
        return new CategoryBuilder.PdbxFeatureAssemblyBuilder(this);
    }

    public CategoryBuilder.PdbxFeatureMonomerBuilder enterPdbxFeatureMonomer() {
        return new CategoryBuilder.PdbxFeatureMonomerBuilder(this);
    }

    public CategoryBuilder.PdbxExptlPdBuilder enterPdbxExptlPd() {
        return new CategoryBuilder.PdbxExptlPdBuilder(this);
    }

    public CategoryBuilder.PdbxReflnsTwinBuilder enterPdbxReflnsTwin() {
        return new CategoryBuilder.PdbxReflnsTwinBuilder(this);
    }

    public CategoryBuilder.PdbxStructInfoBuilder enterPdbxStructInfo() {
        return new CategoryBuilder.PdbxStructInfoBuilder(this);
    }

    public CategoryBuilder.PdbxReRefinementBuilder enterPdbxReRefinement() {
        return new CategoryBuilder.PdbxReRefinementBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyPropBuilder enterPdbxStructAssemblyProp() {
        return new CategoryBuilder.PdbxStructAssemblyPropBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqFeatureBuilder enterPdbxStructRefSeqFeature() {
        return new CategoryBuilder.PdbxStructRefSeqFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqFeaturePropBuilder enterPdbxStructRefSeqFeatureProp() {
        return new CategoryBuilder.PdbxStructRefSeqFeaturePropBuilder(this);
    }

    public CategoryBuilder.PdbxStructChemCompDiagnosticsBuilder enterPdbxStructChemCompDiagnostics() {
        return new CategoryBuilder.PdbxStructChemCompDiagnosticsBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompFeatureBuilder enterPdbxChemCompFeature() {
        return new CategoryBuilder.PdbxChemCompFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxCoordinateModelBuilder enterPdbxCoordinateModel() {
        return new CategoryBuilder.PdbxCoordinateModelBuilder(this);
    }

    public CategoryBuilder.PdbxStructChemCompFeatureBuilder enterPdbxStructChemCompFeature() {
        return new CategoryBuilder.PdbxStructChemCompFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxDiffrnReflnsShellBuilder enterPdbxDiffrnReflnsShell() {
        return new CategoryBuilder.PdbxDiffrnReflnsShellBuilder(this);
    }

    public CategoryBuilder.PdbxBondDistanceLimitsBuilder enterPdbxBondDistanceLimits() {
        return new CategoryBuilder.PdbxBondDistanceLimitsBuilder(this);
    }

    public CategoryBuilder.PdbxSolnScatterBuilder enterPdbxSolnScatter() {
        return new CategoryBuilder.PdbxSolnScatterBuilder(this);
    }

    public CategoryBuilder.PdbxSolnScatterModelBuilder enterPdbxSolnScatterModel() {
        return new CategoryBuilder.PdbxSolnScatterModelBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompDescriptorBuilder enterPdbxChemCompDescriptor() {
        return new CategoryBuilder.PdbxChemCompDescriptorBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompIdentifierBuilder enterPdbxChemCompIdentifier() {
        return new CategoryBuilder.PdbxChemCompIdentifierBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompImportBuilder enterPdbxChemCompImport() {
        return new CategoryBuilder.PdbxChemCompImportBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompAtomEditBuilder enterPdbxChemCompAtomEdit() {
        return new CategoryBuilder.PdbxChemCompAtomEditBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompBondEditBuilder enterPdbxChemCompBondEdit() {
        return new CategoryBuilder.PdbxChemCompBondEditBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompAuditBuilder enterPdbxChemCompAudit() {
        return new CategoryBuilder.PdbxChemCompAuditBuilder(this);
    }

    public CategoryBuilder.PdbxValidateCloseContactBuilder enterPdbxValidateCloseContact() {
        return new CategoryBuilder.PdbxValidateCloseContactBuilder(this);
    }

    public CategoryBuilder.PdbxValidateSymmContactBuilder enterPdbxValidateSymmContact() {
        return new CategoryBuilder.PdbxValidateSymmContactBuilder(this);
    }

    public CategoryBuilder.PdbxValidateRmsdBondBuilder enterPdbxValidateRmsdBond() {
        return new CategoryBuilder.PdbxValidateRmsdBondBuilder(this);
    }

    public CategoryBuilder.PdbxValidateRmsdAngleBuilder enterPdbxValidateRmsdAngle() {
        return new CategoryBuilder.PdbxValidateRmsdAngleBuilder(this);
    }

    public CategoryBuilder.PdbxValidateTorsionBuilder enterPdbxValidateTorsion() {
        return new CategoryBuilder.PdbxValidateTorsionBuilder(this);
    }

    public CategoryBuilder.PdbxValidatePeptideOmegaBuilder enterPdbxValidatePeptideOmega() {
        return new CategoryBuilder.PdbxValidatePeptideOmegaBuilder(this);
    }

    public CategoryBuilder.PdbxValidateChiralBuilder enterPdbxValidateChiral() {
        return new CategoryBuilder.PdbxValidateChiralBuilder(this);
    }

    public CategoryBuilder.PdbxValidatePlanesBuilder enterPdbxValidatePlanes() {
        return new CategoryBuilder.PdbxValidatePlanesBuilder(this);
    }

    public CategoryBuilder.PdbxValidatePlanesAtomBuilder enterPdbxValidatePlanesAtom() {
        return new CategoryBuilder.PdbxValidatePlanesAtomBuilder(this);
    }

    public CategoryBuilder.PdbxValidateMainChainPlaneBuilder enterPdbxValidateMainChainPlane() {
        return new CategoryBuilder.PdbxValidateMainChainPlaneBuilder(this);
    }

    public CategoryBuilder.PdbxStructConnAngleBuilder enterPdbxStructConnAngle() {
        return new CategoryBuilder.PdbxStructConnAngleBuilder(this);
    }

    public CategoryBuilder.PdbxUnobsOrZeroOccResiduesBuilder enterPdbxUnobsOrZeroOccResidues() {
        return new CategoryBuilder.PdbxUnobsOrZeroOccResiduesBuilder(this);
    }

    public CategoryBuilder.PdbxUnobsOrZeroOccAtomsBuilder enterPdbxUnobsOrZeroOccAtoms() {
        return new CategoryBuilder.PdbxUnobsOrZeroOccAtomsBuilder(this);
    }

    public CategoryBuilder.PdbxEntryDetailsBuilder enterPdbxEntryDetails() {
        return new CategoryBuilder.PdbxEntryDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxStructModResidueBuilder enterPdbxStructModResidue() {
        return new CategoryBuilder.PdbxStructModResidueBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqInsertionBuilder enterPdbxStructRefSeqInsertion() {
        return new CategoryBuilder.PdbxStructRefSeqInsertionBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqDeletionBuilder enterPdbxStructRefSeqDeletion() {
        return new CategoryBuilder.PdbxStructRefSeqDeletionBuilder(this);
    }

    public CategoryBuilder.PdbxRemediationAtomSiteMappingBuilder enterPdbxRemediationAtomSiteMapping() {
        return new CategoryBuilder.PdbxRemediationAtomSiteMappingBuilder(this);
    }

    public CategoryBuilder.PdbxValidatePolymerLinkageBuilder enterPdbxValidatePolymerLinkage() {
        return new CategoryBuilder.PdbxValidatePolymerLinkageBuilder(this);
    }

    public CategoryBuilder.PdbxHelicalSymmetryBuilder enterPdbxHelicalSymmetry() {
        return new CategoryBuilder.PdbxHelicalSymmetryBuilder(this);
    }

    public CategoryBuilder.PdbxPointSymmetryBuilder enterPdbxPointSymmetry() {
        return new CategoryBuilder.PdbxPointSymmetryBuilder(this);
    }

    public CategoryBuilder.PdbxStructEntityInstBuilder enterPdbxStructEntityInst() {
        return new CategoryBuilder.PdbxStructEntityInstBuilder(this);
    }

    public CategoryBuilder.PdbxStructOperListBuilder enterPdbxStructOperList() {
        return new CategoryBuilder.PdbxStructOperListBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyBuilder enterPdbxStructAssembly() {
        return new CategoryBuilder.PdbxStructAssemblyBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyGenBuilder enterPdbxStructAssemblyGen() {
        return new CategoryBuilder.PdbxStructAssemblyGenBuilder(this);
    }

    public CategoryBuilder.PdbxStructAsymGenBuilder enterPdbxStructAsymGen() {
        return new CategoryBuilder.PdbxStructAsymGenBuilder(this);
    }

    public CategoryBuilder.PdbxStructMsymGenBuilder enterPdbxStructMsymGen() {
        return new CategoryBuilder.PdbxStructMsymGenBuilder(this);
    }

    public CategoryBuilder.PdbxStructLegacyOperListBuilder enterPdbxStructLegacyOperList() {
        return new CategoryBuilder.PdbxStructLegacyOperListBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompAtomFeatureBuilder enterPdbxChemCompAtomFeature() {
        return new CategoryBuilder.PdbxChemCompAtomFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeFamilyBuilder enterPdbxReferenceMoleculeFamily() {
        return new CategoryBuilder.PdbxReferenceMoleculeFamilyBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeListBuilder enterPdbxReferenceMoleculeList() {
        return new CategoryBuilder.PdbxReferenceMoleculeListBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeBuilder enterPdbxReferenceMolecule() {
        return new CategoryBuilder.PdbxReferenceMoleculeBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityListBuilder enterPdbxReferenceEntityList() {
        return new CategoryBuilder.PdbxReferenceEntityListBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityNonpolyBuilder enterPdbxReferenceEntityNonpoly() {
        return new CategoryBuilder.PdbxReferenceEntityNonpolyBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityLinkBuilder enterPdbxReferenceEntityLink() {
        return new CategoryBuilder.PdbxReferenceEntityLinkBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityPolyLinkBuilder enterPdbxReferenceEntityPolyLink() {
        return new CategoryBuilder.PdbxReferenceEntityPolyLinkBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityPolyBuilder enterPdbxReferenceEntityPoly() {
        return new CategoryBuilder.PdbxReferenceEntityPolyBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntityPolySeqBuilder enterPdbxReferenceEntityPolySeq() {
        return new CategoryBuilder.PdbxReferenceEntityPolySeqBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntitySequenceBuilder enterPdbxReferenceEntitySequence() {
        return new CategoryBuilder.PdbxReferenceEntitySequenceBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntitySrcNatBuilder enterPdbxReferenceEntitySrcNat() {
        return new CategoryBuilder.PdbxReferenceEntitySrcNatBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeDetailsBuilder enterPdbxReferenceMoleculeDetails() {
        return new CategoryBuilder.PdbxReferenceMoleculeDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeSynonymsBuilder enterPdbxReferenceMoleculeSynonyms() {
        return new CategoryBuilder.PdbxReferenceMoleculeSynonymsBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceEntitySubcomponentsBuilder enterPdbxReferenceEntitySubcomponents() {
        return new CategoryBuilder.PdbxReferenceEntitySubcomponentsBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeAnnotationBuilder enterPdbxReferenceMoleculeAnnotation() {
        return new CategoryBuilder.PdbxReferenceMoleculeAnnotationBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeFeaturesBuilder enterPdbxReferenceMoleculeFeatures() {
        return new CategoryBuilder.PdbxReferenceMoleculeFeaturesBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceMoleculeRelatedStructuresBuilder enterPdbxReferenceMoleculeRelatedStructures() {
        return new CategoryBuilder.PdbxReferenceMoleculeRelatedStructuresBuilder(this);
    }

    public CategoryBuilder.PdbxStructGroupListBuilder enterPdbxStructGroupList() {
        return new CategoryBuilder.PdbxStructGroupListBuilder(this);
    }

    public CategoryBuilder.PdbxStructGroupComponentsBuilder enterPdbxStructGroupComponents() {
        return new CategoryBuilder.PdbxStructGroupComponentsBuilder(this);
    }

    public CategoryBuilder.PdbxStructGroupComponentRangeBuilder enterPdbxStructGroupComponentRange() {
        return new CategoryBuilder.PdbxStructGroupComponentRangeBuilder(this);
    }

    public CategoryBuilder.PdbxPrdAuditBuilder enterPdbxPrdAudit() {
        return new CategoryBuilder.PdbxPrdAuditBuilder(this);
    }

    public CategoryBuilder.PdbxFamilyPrdAuditBuilder enterPdbxFamilyPrdAudit() {
        return new CategoryBuilder.PdbxFamilyPrdAuditBuilder(this);
    }

    public CategoryBuilder.PdbxMoleculeBuilder enterPdbxMolecule() {
        return new CategoryBuilder.PdbxMoleculeBuilder(this);
    }

    public CategoryBuilder.PdbxMoleculeFeaturesBuilder enterPdbxMoleculeFeatures() {
        return new CategoryBuilder.PdbxMoleculeFeaturesBuilder(this);
    }

    public CategoryBuilder.PdbxFamilyGroupIndexBuilder enterPdbxFamilyGroupIndex() {
        return new CategoryBuilder.PdbxFamilyGroupIndexBuilder(this);
    }

    public CategoryBuilder.PdbxDistantSolventAtomsBuilder enterPdbxDistantSolventAtoms() {
        return new CategoryBuilder.PdbxDistantSolventAtomsBuilder(this);
    }

    public CategoryBuilder.PdbxStructSpecialSymmetryBuilder enterPdbxStructSpecialSymmetry() {
        return new CategoryBuilder.PdbxStructSpecialSymmetryBuilder(this);
    }

    public CategoryBuilder.PdbxReferencePublicationListBuilder enterPdbxReferencePublicationList() {
        return new CategoryBuilder.PdbxReferencePublicationListBuilder(this);
    }

    public CategoryBuilder.PdbxNmrAssignedChemShiftListBuilder enterPdbxNmrAssignedChemShiftList() {
        return new CategoryBuilder.PdbxNmrAssignedChemShiftListBuilder(this);
    }

    public CategoryBuilder.PdbxNmrChemShiftExperimentBuilder enterPdbxNmrChemShiftExperiment() {
        return new CategoryBuilder.PdbxNmrChemShiftExperimentBuilder(this);
    }

    public CategoryBuilder.PdbxNmrChemShiftRefBuilder enterPdbxNmrChemShiftRef() {
        return new CategoryBuilder.PdbxNmrChemShiftRefBuilder(this);
    }

    public CategoryBuilder.PdbxNmrChemShiftReferenceBuilder enterPdbxNmrChemShiftReference() {
        return new CategoryBuilder.PdbxNmrChemShiftReferenceBuilder(this);
    }

    public CategoryBuilder.PdbxNmrChemShiftSoftwareBuilder enterPdbxNmrChemShiftSoftware() {
        return new CategoryBuilder.PdbxNmrChemShiftSoftwareBuilder(this);
    }

    public CategoryBuilder.PdbxNmrConstraintFileBuilder enterPdbxNmrConstraintFile() {
        return new CategoryBuilder.PdbxNmrConstraintFileBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSoftwareTaskBuilder enterPdbxNmrSoftwareTask() {
        return new CategoryBuilder.PdbxNmrSoftwareTaskBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSpectralDimBuilder enterPdbxNmrSpectralDim() {
        return new CategoryBuilder.PdbxNmrSpectralDimBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSpectralPeakListBuilder enterPdbxNmrSpectralPeakList() {
        return new CategoryBuilder.PdbxNmrSpectralPeakListBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSpectralPeakSoftwareBuilder enterPdbxNmrSpectralPeakSoftware() {
        return new CategoryBuilder.PdbxNmrSpectralPeakSoftwareBuilder(this);
    }

    public CategoryBuilder.PdbxNmrSystematicChemShiftOffsetBuilder enterPdbxNmrSystematicChemShiftOffset() {
        return new CategoryBuilder.PdbxNmrSystematicChemShiftOffsetBuilder(this);
    }

    public CategoryBuilder.PdbxNmrUploadBuilder enterPdbxNmrUpload() {
        return new CategoryBuilder.PdbxNmrUploadBuilder(this);
    }

    public CategoryBuilder.PdbxAuditSupportBuilder enterPdbxAuditSupport() {
        return new CategoryBuilder.PdbxAuditSupportBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompSubcomponentStructConnBuilder enterPdbxChemCompSubcomponentStructConn() {
        return new CategoryBuilder.PdbxChemCompSubcomponentStructConnBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompSubcomponentEntityListBuilder enterPdbxChemCompSubcomponentEntityList() {
        return new CategoryBuilder.PdbxChemCompSubcomponentEntityListBuilder(this);
    }

    public CategoryBuilder.EntitySrcNatBuilder enterEntitySrcNat() {
        return new CategoryBuilder.EntitySrcNatBuilder(this);
    }

    public CategoryBuilder.EntitySrcGenBuilder enterEntitySrcGen() {
        return new CategoryBuilder.EntitySrcGenBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcSynBuilder enterPdbxEntitySrcSyn() {
        return new CategoryBuilder.PdbxEntitySrcSynBuilder(this);
    }

    public CategoryBuilder.PdbxEntityPolyCompLinkListBuilder enterPdbxEntityPolyCompLinkList() {
        return new CategoryBuilder.PdbxEntityPolyCompLinkListBuilder(this);
    }

    public CategoryBuilder.PdbxLinkedEntityBuilder enterPdbxLinkedEntity() {
        return new CategoryBuilder.PdbxLinkedEntityBuilder(this);
    }

    public CategoryBuilder.PdbxLinkedEntityInstanceListBuilder enterPdbxLinkedEntityInstanceList() {
        return new CategoryBuilder.PdbxLinkedEntityInstanceListBuilder(this);
    }

    public CategoryBuilder.PdbxLinkedEntityListBuilder enterPdbxLinkedEntityList() {
        return new CategoryBuilder.PdbxLinkedEntityListBuilder(this);
    }

    public CategoryBuilder.PdbxLinkedEntityLinkListBuilder enterPdbxLinkedEntityLinkList() {
        return new CategoryBuilder.PdbxLinkedEntityLinkListBuilder(this);
    }

    public CategoryBuilder.PdbxEntityDescriptorBuilder enterPdbxEntityDescriptor() {
        return new CategoryBuilder.PdbxEntityDescriptorBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceLinkedEntityBuilder enterPdbxReferenceLinkedEntity() {
        return new CategoryBuilder.PdbxReferenceLinkedEntityBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceLinkedEntityCompListBuilder enterPdbxReferenceLinkedEntityCompList() {
        return new CategoryBuilder.PdbxReferenceLinkedEntityCompListBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceLinkedEntityCompLinkBuilder enterPdbxReferenceLinkedEntityCompLink() {
        return new CategoryBuilder.PdbxReferenceLinkedEntityCompLinkBuilder(this);
    }

    public CategoryBuilder.PdbxReferenceLinkedEntityLinkBuilder enterPdbxReferenceLinkedEntityLink() {
        return new CategoryBuilder.PdbxReferenceLinkedEntityLinkBuilder(this);
    }

    public CategoryBuilder.PdbxRelatedExpDataSetBuilder enterPdbxRelatedExpDataSet() {
        return new CategoryBuilder.PdbxRelatedExpDataSetBuilder(this);
    }

    public CategoryBuilder.PdbxDatabaseStatusHistoryBuilder enterPdbxDatabaseStatusHistory() {
        return new CategoryBuilder.PdbxDatabaseStatusHistoryBuilder(this);
    }

    public CategoryBuilder.EmAssemblyBuilder enterEmAssembly() {
        return new CategoryBuilder.EmAssemblyBuilder(this);
    }

    public CategoryBuilder.EmEntityAssemblyBuilder enterEmEntityAssembly() {
        return new CategoryBuilder.EmEntityAssemblyBuilder(this);
    }

    public CategoryBuilder.EmVirusEntityBuilder enterEmVirusEntity() {
        return new CategoryBuilder.EmVirusEntityBuilder(this);
    }

    public CategoryBuilder.EmSamplePreparationBuilder enterEmSamplePreparation() {
        return new CategoryBuilder.EmSamplePreparationBuilder(this);
    }

    public CategoryBuilder.EmSampleSupportBuilder enterEmSampleSupport() {
        return new CategoryBuilder.EmSampleSupportBuilder(this);
    }

    public CategoryBuilder.EmBufferBuilder enterEmBuffer() {
        return new CategoryBuilder.EmBufferBuilder(this);
    }

    public CategoryBuilder.EmVitrificationBuilder enterEmVitrification() {
        return new CategoryBuilder.EmVitrificationBuilder(this);
    }

    public CategoryBuilder.EmImagingBuilder enterEmImaging() {
        return new CategoryBuilder.EmImagingBuilder(this);
    }

    public CategoryBuilder.EmDetectorBuilder enterEmDetector() {
        return new CategoryBuilder.EmDetectorBuilder(this);
    }

    public CategoryBuilder.EmImageScansBuilder enterEmImageScans() {
        return new CategoryBuilder.EmImageScansBuilder(this);
    }

    public CategoryBuilder.Em2dProjectionSelectionBuilder enterEm2dProjectionSelection() {
        return new CategoryBuilder.Em2dProjectionSelectionBuilder(this);
    }

    public CategoryBuilder.Em3dReconstructionBuilder enterEm3dReconstruction() {
        return new CategoryBuilder.Em3dReconstructionBuilder(this);
    }

    public CategoryBuilder.Em3dFittingBuilder enterEm3dFitting() {
        return new CategoryBuilder.Em3dFittingBuilder(this);
    }

    public CategoryBuilder.Em3dFittingListBuilder enterEm3dFittingList() {
        return new CategoryBuilder.Em3dFittingListBuilder(this);
    }

    public CategoryBuilder.EmHelicalEntityBuilder enterEmHelicalEntity() {
        return new CategoryBuilder.EmHelicalEntityBuilder(this);
    }

    public CategoryBuilder.EmExperimentBuilder enterEmExperiment() {
        return new CategoryBuilder.EmExperimentBuilder(this);
    }

    public CategoryBuilder.EmSingleParticleEntityBuilder enterEmSingleParticleEntity() {
        return new CategoryBuilder.EmSingleParticleEntityBuilder(this);
    }

    public CategoryBuilder.EmAdminBuilder enterEmAdmin() {
        return new CategoryBuilder.EmAdminBuilder(this);
    }

    public CategoryBuilder.EmAuthorListBuilder enterEmAuthorList() {
        return new CategoryBuilder.EmAuthorListBuilder(this);
    }

    public CategoryBuilder.EmDbReferenceBuilder enterEmDbReference() {
        return new CategoryBuilder.EmDbReferenceBuilder(this);
    }

    public CategoryBuilder.EmDbReferenceAuxiliaryBuilder enterEmDbReferenceAuxiliary() {
        return new CategoryBuilder.EmDbReferenceAuxiliaryBuilder(this);
    }

    public CategoryBuilder.EmDepuiBuilder enterEmDepui() {
        return new CategoryBuilder.EmDepuiBuilder(this);
    }

    public CategoryBuilder.EmObsoleteBuilder enterEmObsolete() {
        return new CategoryBuilder.EmObsoleteBuilder(this);
    }

    public CategoryBuilder.EmSupersedeBuilder enterEmSupersede() {
        return new CategoryBuilder.EmSupersedeBuilder(this);
    }

    public CategoryBuilder.EmEntityAssemblyMolwtBuilder enterEmEntityAssemblyMolwt() {
        return new CategoryBuilder.EmEntityAssemblyMolwtBuilder(this);
    }

    public CategoryBuilder.EmEntityAssemblyNaturalsourceBuilder enterEmEntityAssemblyNaturalsource() {
        return new CategoryBuilder.EmEntityAssemblyNaturalsourceBuilder(this);
    }

    public CategoryBuilder.EmEntityAssemblyRecombinantBuilder enterEmEntityAssemblyRecombinant() {
        return new CategoryBuilder.EmEntityAssemblyRecombinantBuilder(this);
    }

    public CategoryBuilder.EmVirusNaturalHostBuilder enterEmVirusNaturalHost() {
        return new CategoryBuilder.EmVirusNaturalHostBuilder(this);
    }

    public CategoryBuilder.EmVirusShellBuilder enterEmVirusShell() {
        return new CategoryBuilder.EmVirusShellBuilder(this);
    }

    public CategoryBuilder.EmSpecimenBuilder enterEmSpecimen() {
        return new CategoryBuilder.EmSpecimenBuilder(this);
    }

    public CategoryBuilder.EmEmbeddingBuilder enterEmEmbedding() {
        return new CategoryBuilder.EmEmbeddingBuilder(this);
    }

    public CategoryBuilder.EmFiducialMarkersBuilder enterEmFiducialMarkers() {
        return new CategoryBuilder.EmFiducialMarkersBuilder(this);
    }

    public CategoryBuilder.EmFocusedIonBeamBuilder enterEmFocusedIonBeam() {
        return new CategoryBuilder.EmFocusedIonBeamBuilder(this);
    }

    public CategoryBuilder.EmGridPretreatmentBuilder enterEmGridPretreatment() {
        return new CategoryBuilder.EmGridPretreatmentBuilder(this);
    }

    public CategoryBuilder.EmUltramicrotomyBuilder enterEmUltramicrotomy() {
        return new CategoryBuilder.EmUltramicrotomyBuilder(this);
    }

    public CategoryBuilder.EmHighPressureFreezingBuilder enterEmHighPressureFreezing() {
        return new CategoryBuilder.EmHighPressureFreezingBuilder(this);
    }

    public CategoryBuilder.EmShadowingBuilder enterEmShadowing() {
        return new CategoryBuilder.EmShadowingBuilder(this);
    }

    public CategoryBuilder.EmTomographySpecimenBuilder enterEmTomographySpecimen() {
        return new CategoryBuilder.EmTomographySpecimenBuilder(this);
    }

    public CategoryBuilder.EmCrystalFormationBuilder enterEmCrystalFormation() {
        return new CategoryBuilder.EmCrystalFormationBuilder(this);
    }

    public CategoryBuilder.EmStainingBuilder enterEmStaining() {
        return new CategoryBuilder.EmStainingBuilder(this);
    }

    public CategoryBuilder.EmSupportFilmBuilder enterEmSupportFilm() {
        return new CategoryBuilder.EmSupportFilmBuilder(this);
    }

    public CategoryBuilder.EmBufferComponentBuilder enterEmBufferComponent() {
        return new CategoryBuilder.EmBufferComponentBuilder(this);
    }

    public CategoryBuilder.EmDiffractionBuilder enterEmDiffraction() {
        return new CategoryBuilder.EmDiffractionBuilder(this);
    }

    public CategoryBuilder.EmDiffractionShellBuilder enterEmDiffractionShell() {
        return new CategoryBuilder.EmDiffractionShellBuilder(this);
    }

    public CategoryBuilder.EmDiffractionStatsBuilder enterEmDiffractionStats() {
        return new CategoryBuilder.EmDiffractionStatsBuilder(this);
    }

    public CategoryBuilder.EmTomographyBuilder enterEmTomography() {
        return new CategoryBuilder.EmTomographyBuilder(this);
    }

    public CategoryBuilder.EmImageRecordingBuilder enterEmImageRecording() {
        return new CategoryBuilder.EmImageRecordingBuilder(this);
    }

    public CategoryBuilder.EmImagingOpticsBuilder enterEmImagingOptics() {
        return new CategoryBuilder.EmImagingOpticsBuilder(this);
    }

    public CategoryBuilder.EmFinalClassificationBuilder enterEmFinalClassification() {
        return new CategoryBuilder.EmFinalClassificationBuilder(this);
    }

    public CategoryBuilder.EmStartModelBuilder enterEmStartModel() {
        return new CategoryBuilder.EmStartModelBuilder(this);
    }

    public CategoryBuilder.EmSoftwareBuilder enterEmSoftware() {
        return new CategoryBuilder.EmSoftwareBuilder(this);
    }

    public CategoryBuilder.EmEulerAngleAssignmentBuilder enterEmEulerAngleAssignment() {
        return new CategoryBuilder.EmEulerAngleAssignmentBuilder(this);
    }

    public CategoryBuilder.EmCtfCorrectionBuilder enterEmCtfCorrection() {
        return new CategoryBuilder.EmCtfCorrectionBuilder(this);
    }

    public CategoryBuilder.EmVolumeSelectionBuilder enterEmVolumeSelection() {
        return new CategoryBuilder.EmVolumeSelectionBuilder(this);
    }

    public CategoryBuilder.Em3dCrystalEntityBuilder enterEm3dCrystalEntity() {
        return new CategoryBuilder.Em3dCrystalEntityBuilder(this);
    }

    public CategoryBuilder.Em2dCrystalEntityBuilder enterEm2dCrystalEntity() {
        return new CategoryBuilder.Em2dCrystalEntityBuilder(this);
    }

    public CategoryBuilder.EmImageProcessingBuilder enterEmImageProcessing() {
        return new CategoryBuilder.EmImageProcessingBuilder(this);
    }

    public CategoryBuilder.EmParticleSelectionBuilder enterEmParticleSelection() {
        return new CategoryBuilder.EmParticleSelectionBuilder(this);
    }

    public CategoryBuilder.EmMapBuilder enterEmMap() {
        return new CategoryBuilder.EmMapBuilder(this);
    }

    public CategoryBuilder.EmFscCurveBuilder enterEmFscCurve() {
        return new CategoryBuilder.EmFscCurveBuilder(this);
    }

    public CategoryBuilder.EmInterpretFigureBuilder enterEmInterpretFigure() {
        return new CategoryBuilder.EmInterpretFigureBuilder(this);
    }

    public CategoryBuilder.EmLayerLinesBuilder enterEmLayerLines() {
        return new CategoryBuilder.EmLayerLinesBuilder(this);
    }

    public CategoryBuilder.EmStructureFactorsBuilder enterEmStructureFactors() {
        return new CategoryBuilder.EmStructureFactorsBuilder(this);
    }

    public CategoryBuilder.EmDepositorInfoBuilder enterEmDepositorInfo() {
        return new CategoryBuilder.EmDepositorInfoBuilder(this);
    }

    public CategoryBuilder.EmMapDepositorInfoBuilder enterEmMapDepositorInfo() {
        return new CategoryBuilder.EmMapDepositorInfoBuilder(this);
    }

    public CategoryBuilder.EmMaskDepositorInfoBuilder enterEmMaskDepositorInfo() {
        return new CategoryBuilder.EmMaskDepositorInfoBuilder(this);
    }

    public CategoryBuilder.EmFigureDepositorInfoBuilder enterEmFigureDepositorInfo() {
        return new CategoryBuilder.EmFigureDepositorInfoBuilder(this);
    }

    public CategoryBuilder.EmLayerLinesDepositorInfoBuilder enterEmLayerLinesDepositorInfo() {
        return new CategoryBuilder.EmLayerLinesDepositorInfoBuilder(this);
    }

    public CategoryBuilder.EmStructureFactorsDepositorInfoBuilder enterEmStructureFactorsDepositorInfo() {
        return new CategoryBuilder.EmStructureFactorsDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxSeqMapDepositorInfoBuilder enterPdbxSeqMapDepositorInfo() {
        return new CategoryBuilder.PdbxSeqMapDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompDepositorInfoBuilder enterPdbxChemCompDepositorInfo() {
        return new CategoryBuilder.PdbxChemCompDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqDepositorInfoBuilder enterPdbxStructRefSeqDepositorInfo() {
        return new CategoryBuilder.PdbxStructRefSeqDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructRefSeqDifDepositorInfoBuilder enterPdbxStructRefSeqDifDepositorInfo() {
        return new CategoryBuilder.PdbxStructRefSeqDifDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyPropDepositorInfoBuilder enterPdbxStructAssemblyPropDepositorInfo() {
        return new CategoryBuilder.PdbxStructAssemblyPropDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyDepositorInfoBuilder enterPdbxStructAssemblyDepositorInfo() {
        return new CategoryBuilder.PdbxStructAssemblyDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyGenDepositorInfoBuilder enterPdbxStructAssemblyGenDepositorInfo() {
        return new CategoryBuilder.PdbxStructAssemblyGenDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructOperListDepositorInfoBuilder enterPdbxStructOperListDepositorInfo() {
        return new CategoryBuilder.PdbxStructOperListDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxPointSymmetryDepositorInfoBuilder enterPdbxPointSymmetryDepositorInfo() {
        return new CategoryBuilder.PdbxPointSymmetryDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxHelicalSymmetryDepositorInfoBuilder enterPdbxHelicalSymmetryDepositorInfo() {
        return new CategoryBuilder.PdbxHelicalSymmetryDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyAuthEvidenceDepositorInfoBuilder enterPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return new CategoryBuilder.PdbxStructAssemblyAuthEvidenceDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxSolventAtomSiteMappingBuilder enterPdbxSolventAtomSiteMapping() {
        return new CategoryBuilder.PdbxSolventAtomSiteMappingBuilder(this);
    }

    public CategoryBuilder.PdbxMoleculeFeaturesDepositorInfoBuilder enterPdbxMoleculeFeaturesDepositorInfo() {
        return new CategoryBuilder.PdbxMoleculeFeaturesDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompInstanceDepositorInfoBuilder enterPdbxChemCompInstanceDepositorInfo() {
        return new CategoryBuilder.PdbxChemCompInstanceDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiStatusFlagsBuilder enterPdbxDepuiStatusFlags() {
        return new CategoryBuilder.PdbxDepuiStatusFlagsBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiUploadBuilder enterPdbxDepuiUpload() {
        return new CategoryBuilder.PdbxDepuiUploadBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiValidationStatusFlagsBuilder enterPdbxDepuiValidationStatusFlags() {
        return new CategoryBuilder.PdbxDepuiValidationStatusFlagsBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompUploadDepositorInfoBuilder enterPdbxChemCompUploadDepositorInfo() {
        return new CategoryBuilder.PdbxChemCompUploadDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiEntityStatusFlagsBuilder enterPdbxDepuiEntityStatusFlags() {
        return new CategoryBuilder.PdbxDepuiEntityStatusFlagsBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiEntityFeaturesBuilder enterPdbxDepuiEntityFeatures() {
        return new CategoryBuilder.PdbxDepuiEntityFeaturesBuilder(this);
    }

    public CategoryBuilder.PdbxDepositionMessageInfoBuilder enterPdbxDepositionMessageInfo() {
        return new CategoryBuilder.PdbxDepositionMessageInfoBuilder(this);
    }

    public CategoryBuilder.PdbxDepositionMessageFileReferenceBuilder enterPdbxDepositionMessageFileReference() {
        return new CategoryBuilder.PdbxDepositionMessageFileReferenceBuilder(this);
    }

    public CategoryBuilder.PdbxDepuiEntryDetailsBuilder enterPdbxDepuiEntryDetails() {
        return new CategoryBuilder.PdbxDepuiEntryDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxDataProcessingStatusBuilder enterPdbxDataProcessingStatus() {
        return new CategoryBuilder.PdbxDataProcessingStatusBuilder(this);
    }

    public CategoryBuilder.PdbxEntityInstanceFeatureBuilder enterPdbxEntityInstanceFeature() {
        return new CategoryBuilder.PdbxEntityInstanceFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxEntitySrcGenDepositorInfoBuilder enterPdbxEntitySrcGenDepositorInfo() {
        return new CategoryBuilder.PdbxEntitySrcGenDepositorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelBuilder enterPdbxChemCompModel() {
        return new CategoryBuilder.PdbxChemCompModelBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelAtomBuilder enterPdbxChemCompModelAtom() {
        return new CategoryBuilder.PdbxChemCompModelAtomBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelBondBuilder enterPdbxChemCompModelBond() {
        return new CategoryBuilder.PdbxChemCompModelBondBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelFeatureBuilder enterPdbxChemCompModelFeature() {
        return new CategoryBuilder.PdbxChemCompModelFeatureBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelDescriptorBuilder enterPdbxChemCompModelDescriptor() {
        return new CategoryBuilder.PdbxChemCompModelDescriptorBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelAuditBuilder enterPdbxChemCompModelAudit() {
        return new CategoryBuilder.PdbxChemCompModelAuditBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompModelReferenceBuilder enterPdbxChemCompModelReference() {
        return new CategoryBuilder.PdbxChemCompModelReferenceBuilder(this);
    }

    public CategoryBuilder.PdbxViewCategoryGroupBuilder enterPdbxViewCategoryGroup() {
        return new CategoryBuilder.PdbxViewCategoryGroupBuilder(this);
    }

    public CategoryBuilder.PdbxViewCategoryBuilder enterPdbxViewCategory() {
        return new CategoryBuilder.PdbxViewCategoryBuilder(this);
    }

    public CategoryBuilder.PdbxViewItemBuilder enterPdbxViewItem() {
        return new CategoryBuilder.PdbxViewItemBuilder(this);
    }

    public CategoryBuilder.PdbxCoordBuilder enterPdbxCoord() {
        return new CategoryBuilder.PdbxCoordBuilder(this);
    }

    public CategoryBuilder.PdbxConnectBuilder enterPdbxConnect() {
        return new CategoryBuilder.PdbxConnectBuilder(this);
    }

    public CategoryBuilder.PdbxConnectTypeBuilder enterPdbxConnectType() {
        return new CategoryBuilder.PdbxConnectTypeBuilder(this);
    }

    public CategoryBuilder.PdbxConnectModificationBuilder enterPdbxConnectModification() {
        return new CategoryBuilder.PdbxConnectModificationBuilder(this);
    }

    public CategoryBuilder.PdbxConnectAtomBuilder enterPdbxConnectAtom() {
        return new CategoryBuilder.PdbxConnectAtomBuilder(this);
    }

    public CategoryBuilder.PdbxDatabasePDBMasterBuilder enterPdbxDatabasePDBMaster() {
        return new CategoryBuilder.PdbxDatabasePDBMasterBuilder(this);
    }

    public CategoryBuilder.PdbxDatabasePdbOmitBuilder enterPdbxDatabasePdbOmit() {
        return new CategoryBuilder.PdbxDatabasePdbOmitBuilder(this);
    }

    public CategoryBuilder.PdbxDbrefBuilder enterPdbxDbref() {
        return new CategoryBuilder.PdbxDbrefBuilder(this);
    }

    public CategoryBuilder.PdbxDrugInfoBuilder enterPdbxDrugInfo() {
        return new CategoryBuilder.PdbxDrugInfoBuilder(this);
    }

    public CategoryBuilder.PdbxInhibitorInfoBuilder enterPdbxInhibitorInfo() {
        return new CategoryBuilder.PdbxInhibitorInfoBuilder(this);
    }

    public CategoryBuilder.PdbxIonInfoBuilder enterPdbxIonInfo() {
        return new CategoryBuilder.PdbxIonInfoBuilder(this);
    }

    public CategoryBuilder.PdbxHybridBuilder enterPdbxHybrid() {
        return new CategoryBuilder.PdbxHybridBuilder(this);
    }

    public CategoryBuilder.PdbxNaStrandInfoBuilder enterPdbxNaStrandInfo() {
        return new CategoryBuilder.PdbxNaStrandInfoBuilder(this);
    }

    public CategoryBuilder.PdbxNonstandardListBuilder enterPdbxNonstandardList() {
        return new CategoryBuilder.PdbxNonstandardListBuilder(this);
    }

    public CategoryBuilder.PdbxPdbCompndBuilder enterPdbxPdbCompnd() {
        return new CategoryBuilder.PdbxPdbCompndBuilder(this);
    }

    public CategoryBuilder.PdbxPdbSourceBuilder enterPdbxPdbSource() {
        return new CategoryBuilder.PdbxPdbSourceBuilder(this);
    }

    public CategoryBuilder.PdbxProteinInfoBuilder enterPdbxProteinInfo() {
        return new CategoryBuilder.PdbxProteinInfoBuilder(this);
    }

    public CategoryBuilder.PdbxSolventInfoBuilder enterPdbxSolventInfo() {
        return new CategoryBuilder.PdbxSolventInfoBuilder(this);
    }

    public CategoryBuilder.PdbxSourceBuilder enterPdbxSource() {
        return new CategoryBuilder.PdbxSourceBuilder(this);
    }

    public CategoryBuilder.PdbxStructBiolFuncBuilder enterPdbxStructBiolFunc() {
        return new CategoryBuilder.PdbxStructBiolFuncBuilder(this);
    }

    public CategoryBuilder.PdbxStructPackGenBuilder enterPdbxStructPackGen() {
        return new CategoryBuilder.PdbxStructPackGenBuilder(this);
    }

    public CategoryBuilder.PdbxTrnaInfoBuilder enterPdbxTrnaInfo() {
        return new CategoryBuilder.PdbxTrnaInfoBuilder(this);
    }

    public CategoryBuilder.PdbxUnpairBuilder enterPdbxUnpair() {
        return new CategoryBuilder.PdbxUnpairBuilder(this);
    }

    public CategoryBuilder.PdbxRefineLsRestrNcsBuilder enterPdbxRefineLsRestrNcs() {
        return new CategoryBuilder.PdbxRefineLsRestrNcsBuilder(this);
    }

    public CategoryBuilder.PdbxStructNcsVirusGenBuilder enterPdbxStructNcsVirusGen() {
        return new CategoryBuilder.PdbxStructNcsVirusGenBuilder(this);
    }

    public CategoryBuilder.PdbxSequenceAnnotationBuilder enterPdbxSequenceAnnotation() {
        return new CategoryBuilder.PdbxSequenceAnnotationBuilder(this);
    }

    public CategoryBuilder.PdbxPostProcessDetailsBuilder enterPdbxPostProcessDetails() {
        return new CategoryBuilder.PdbxPostProcessDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxPostProcessStatusBuilder enterPdbxPostProcessStatus() {
        return new CategoryBuilder.PdbxPostProcessStatusBuilder(this);
    }

    public CategoryBuilder.PdbxStructLinkBuilder enterPdbxStructLink() {
        return new CategoryBuilder.PdbxStructLinkBuilder(this);
    }

    public CategoryBuilder.PdbxMissingResidueListBuilder enterPdbxMissingResidueList() {
        return new CategoryBuilder.PdbxMissingResidueListBuilder(this);
    }

    public CategoryBuilder.PdbxDataProcessingCellBuilder enterPdbxDataProcessingCell() {
        return new CategoryBuilder.PdbxDataProcessingCellBuilder(this);
    }

    public CategoryBuilder.PdbxDataProcessingReflnsBuilder enterPdbxDataProcessingReflns() {
        return new CategoryBuilder.PdbxDataProcessingReflnsBuilder(this);
    }

    public CategoryBuilder.PdbxDataProcessingDetectorBuilder enterPdbxDataProcessingDetector() {
        return new CategoryBuilder.PdbxDataProcessingDetectorBuilder(this);
    }

    public CategoryBuilder.PdbxChemCompNonstandardBuilder enterPdbxChemCompNonstandard() {
        return new CategoryBuilder.PdbxChemCompNonstandardBuilder(this);
    }

    public CategoryBuilder.PdbxEntityPolyProteinClassBuilder enterPdbxEntityPolyProteinClass() {
        return new CategoryBuilder.PdbxEntityPolyProteinClassBuilder(this);
    }

    public CategoryBuilder.PdbxEntityNameTaxonomyTreeBuilder enterPdbxEntityNameTaxonomyTree() {
        return new CategoryBuilder.PdbxEntityNameTaxonomyTreeBuilder(this);
    }

    public CategoryBuilder.PdbxEntityNameTaxonomyBuilder enterPdbxEntityNameTaxonomy() {
        return new CategoryBuilder.PdbxEntityNameTaxonomyBuilder(this);
    }

    public CategoryBuilder.PdbxEntityNameInstanceBuilder enterPdbxEntityNameInstance() {
        return new CategoryBuilder.PdbxEntityNameInstanceBuilder(this);
    }

    public CategoryBuilder.PdbxTableinfoBuilder enterPdbxTableinfo() {
        return new CategoryBuilder.PdbxTableinfoBuilder(this);
    }

    public CategoryBuilder.PdbxColumninfoBuilder enterPdbxColumninfo() {
        return new CategoryBuilder.PdbxColumninfoBuilder(this);
    }

    public CategoryBuilder.PdbxValAngleBuilder enterPdbxValAngle() {
        return new CategoryBuilder.PdbxValAngleBuilder(this);
    }

    public CategoryBuilder.PdbxValBondBuilder enterPdbxValBond() {
        return new CategoryBuilder.PdbxValBondBuilder(this);
    }

    public CategoryBuilder.PdbxValContactBuilder enterPdbxValContact() {
        return new CategoryBuilder.PdbxValContactBuilder(this);
    }

    public CategoryBuilder.PdbxValSymContactBuilder enterPdbxValSymContact() {
        return new CategoryBuilder.PdbxValSymContactBuilder(this);
    }

    public CategoryBuilder.PdbxRmchOutlierBuilder enterPdbxRmchOutlier() {
        return new CategoryBuilder.PdbxRmchOutlierBuilder(this);
    }

    public CategoryBuilder.PdbxMissingAtomPolyBuilder enterPdbxMissingAtomPoly() {
        return new CategoryBuilder.PdbxMissingAtomPolyBuilder(this);
    }

    public CategoryBuilder.PdbxMissingAtomNonpolyBuilder enterPdbxMissingAtomNonpoly() {
        return new CategoryBuilder.PdbxMissingAtomNonpolyBuilder(this);
    }

    public CategoryBuilder.PdbxValChiralBuilder enterPdbxValChiral() {
        return new CategoryBuilder.PdbxValChiralBuilder(this);
    }

    public CategoryBuilder.PdbxAtlasBuilder enterPdbxAtlas() {
        return new CategoryBuilder.PdbxAtlasBuilder(this);
    }

    public CategoryBuilder.PdbxSummaryFlagsBuilder enterPdbxSummaryFlags() {
        return new CategoryBuilder.PdbxSummaryFlagsBuilder(this);
    }

    public CategoryBuilder.PdbxEntityFuncBindModeBuilder enterPdbxEntityFuncBindMode() {
        return new CategoryBuilder.PdbxEntityFuncBindModeBuilder(this);
    }

    public CategoryBuilder.PdbxEntityFuncEnzymeBuilder enterPdbxEntityFuncEnzyme() {
        return new CategoryBuilder.PdbxEntityFuncEnzymeBuilder(this);
    }

    public CategoryBuilder.PdbxEntityFuncRegulatoryBuilder enterPdbxEntityFuncRegulatory() {
        return new CategoryBuilder.PdbxEntityFuncRegulatoryBuilder(this);
    }

    public CategoryBuilder.PdbxEntityFuncStructuralBuilder enterPdbxEntityFuncStructural() {
        return new CategoryBuilder.PdbxEntityFuncStructuralBuilder(this);
    }

    public CategoryBuilder.PdbxEntityFuncOtherBuilder enterPdbxEntityFuncOther() {
        return new CategoryBuilder.PdbxEntityFuncOtherBuilder(this);
    }

    public CategoryBuilder.PdbxEntityPolyDomainBuilder enterPdbxEntityPolyDomain() {
        return new CategoryBuilder.PdbxEntityPolyDomainBuilder(this);
    }

    public CategoryBuilder.PdbxNaStructKeywdsBuilder enterPdbxNaStructKeywds() {
        return new CategoryBuilder.PdbxNaStructKeywdsBuilder(this);
    }

    public CategoryBuilder.PdbxEntityPolyNaTypeBuilder enterPdbxEntityPolyNaType() {
        return new CategoryBuilder.PdbxEntityPolyNaTypeBuilder(this);
    }

    public CategoryBuilder.PdbxEntityPolyNaNonstandardBuilder enterPdbxEntityPolyNaNonstandard() {
        return new CategoryBuilder.PdbxEntityPolyNaNonstandardBuilder(this);
    }

    public CategoryBuilder.PdbxVirtualAngleBuilder enterPdbxVirtualAngle() {
        return new CategoryBuilder.PdbxVirtualAngleBuilder(this);
    }

    public CategoryBuilder.PdbxVirtualBondBuilder enterPdbxVirtualBond() {
        return new CategoryBuilder.PdbxVirtualBondBuilder(this);
    }

    public CategoryBuilder.PdbxVirtualTorsionBuilder enterPdbxVirtualTorsion() {
        return new CategoryBuilder.PdbxVirtualTorsionBuilder(this);
    }

    public CategoryBuilder.PdbxSequencePatternBuilder enterPdbxSequencePattern() {
        return new CategoryBuilder.PdbxSequencePatternBuilder(this);
    }

    public CategoryBuilder.PdbxStereochemistryBuilder enterPdbxStereochemistry() {
        return new CategoryBuilder.PdbxStereochemistryBuilder(this);
    }

    public CategoryBuilder.PdbxRmsDevsCovalentBuilder enterPdbxRmsDevsCovalent() {
        return new CategoryBuilder.PdbxRmsDevsCovalentBuilder(this);
    }

    public CategoryBuilder.PdbxRmsDevsCovByMonomerBuilder enterPdbxRmsDevsCovByMonomer() {
        return new CategoryBuilder.PdbxRmsDevsCovByMonomerBuilder(this);
    }

    public CategoryBuilder.PdbxSugarPhosphateGeometryBuilder enterPdbxSugarPhosphateGeometry() {
        return new CategoryBuilder.PdbxSugarPhosphateGeometryBuilder(this);
    }

    public CategoryBuilder.PdbxNmrComputingBuilder enterPdbxNmrComputing() {
        return new CategoryBuilder.PdbxNmrComputingBuilder(this);
    }

    public CategoryBuilder.PdbxAuditConformExtensionBuilder enterPdbxAuditConformExtension() {
        return new CategoryBuilder.PdbxAuditConformExtensionBuilder(this);
    }

    public CategoryBuilder.PdbxDccMapmanBuilder enterPdbxDccMapman() {
        return new CategoryBuilder.PdbxDccMapmanBuilder(this);
    }

    public CategoryBuilder.PdbxDccRsccMapmanBuilder enterPdbxDccRsccMapman() {
        return new CategoryBuilder.PdbxDccRsccMapmanBuilder(this);
    }

    public CategoryBuilder.PdbxDccRsccMapmanOverallBuilder enterPdbxDccRsccMapmanOverall() {
        return new CategoryBuilder.PdbxDccRsccMapmanOverallBuilder(this);
    }

    public CategoryBuilder.PdbxDccDensityBuilder enterPdbxDccDensity() {
        return new CategoryBuilder.PdbxDccDensityBuilder(this);
    }

    public CategoryBuilder.PdbxDccGeometryBuilder enterPdbxDccGeometry() {
        return new CategoryBuilder.PdbxDccGeometryBuilder(this);
    }

    public CategoryBuilder.PdbxDccDensityCorrBuilder enterPdbxDccDensityCorr() {
        return new CategoryBuilder.PdbxDccDensityCorrBuilder(this);
    }

    public CategoryBuilder.PdbxDccMapBuilder enterPdbxDccMap() {
        return new CategoryBuilder.PdbxDccMapBuilder(this);
    }

    public CategoryBuilder.PdbxDepositGroupBuilder enterPdbxDepositGroup() {
        return new CategoryBuilder.PdbxDepositGroupBuilder(this);
    }

    public CategoryBuilder.PdbxDepositGroupIndexBuilder enterPdbxDepositGroupIndex() {
        return new CategoryBuilder.PdbxDepositGroupIndexBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyAuthEvidenceBuilder enterPdbxStructAssemblyAuthEvidence() {
        return new CategoryBuilder.PdbxStructAssemblyAuthEvidenceBuilder(this);
    }

    public CategoryBuilder.PdbxStructAssemblyAuthClassificationBuilder enterPdbxStructAssemblyAuthClassification() {
        return new CategoryBuilder.PdbxStructAssemblyAuthClassificationBuilder(this);
    }

    public CategoryBuilder.PdbxCrystalAlignmentBuilder enterPdbxCrystalAlignment() {
        return new CategoryBuilder.PdbxCrystalAlignmentBuilder(this);
    }

    public CategoryBuilder.PdbxAuditRevisionHistoryBuilder enterPdbxAuditRevisionHistory() {
        return new CategoryBuilder.PdbxAuditRevisionHistoryBuilder(this);
    }

    public CategoryBuilder.PdbxAuditRevisionGroupBuilder enterPdbxAuditRevisionGroup() {
        return new CategoryBuilder.PdbxAuditRevisionGroupBuilder(this);
    }

    public CategoryBuilder.PdbxAuditRevisionCategoryBuilder enterPdbxAuditRevisionCategory() {
        return new CategoryBuilder.PdbxAuditRevisionCategoryBuilder(this);
    }

    public CategoryBuilder.PdbxAuditRevisionDetailsBuilder enterPdbxAuditRevisionDetails() {
        return new CategoryBuilder.PdbxAuditRevisionDetailsBuilder(this);
    }

    public CategoryBuilder.PdbxAuditRevisionItemBuilder enterPdbxAuditRevisionItem() {
        return new CategoryBuilder.PdbxAuditRevisionItemBuilder(this);
    }

    public CategoryBuilder.PdbxSupportingExpDataSetBuilder enterPdbxSupportingExpDataSet() {
        return new CategoryBuilder.PdbxSupportingExpDataSetBuilder(this);
    }

    public CategoryBuilder.PdbxSerialCrystallographyMeasurementBuilder enterPdbxSerialCrystallographyMeasurement() {
        return new CategoryBuilder.PdbxSerialCrystallographyMeasurementBuilder(this);
    }

    public CategoryBuilder.PdbxSerialCrystallographySampleDeliveryBuilder enterPdbxSerialCrystallographySampleDelivery() {
        return new CategoryBuilder.PdbxSerialCrystallographySampleDeliveryBuilder(this);
    }

    public CategoryBuilder.PdbxSerialCrystallographySampleDeliveryInjectionBuilder enterPdbxSerialCrystallographySampleDeliveryInjection() {
        return new CategoryBuilder.PdbxSerialCrystallographySampleDeliveryInjectionBuilder(this);
    }

    public CategoryBuilder.PdbxSerialCrystallographySampleDeliveryFixedTargetBuilder enterPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return new CategoryBuilder.PdbxSerialCrystallographySampleDeliveryFixedTargetBuilder(this);
    }

    public CategoryBuilder.PdbxSerialCrystallographyDataReductionBuilder enterPdbxSerialCrystallographyDataReduction() {
        return new CategoryBuilder.PdbxSerialCrystallographyDataReductionBuilder(this);
    }
}
