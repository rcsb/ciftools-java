package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.builder.BlockBuilderImpl;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MmCifBlockBuilder extends BlockBuilderImpl<MmCifFileBuilder> {
    public MmCifBlockBuilder(String blockName, MmCifFileBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public MmCifCategoryBuilder enterCategory(String categoryName) {
        return new MmCifCategoryBuilder(categoryName, this);
    }

    @Override
    public MmCifFileBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    public MmCifCategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new MmCifCategoryBuilder.AtomSiteBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSiteAnisotropBuilder enterAtomSiteAnisotrop() {
        return new MmCifCategoryBuilder.AtomSiteAnisotropBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSitesBuilder enterAtomSites() {
        return new MmCifCategoryBuilder.AtomSitesBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSitesAltBuilder enterAtomSitesAlt() {
        return new MmCifCategoryBuilder.AtomSitesAltBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSitesAltEnsBuilder enterAtomSitesAltEns() {
        return new MmCifCategoryBuilder.AtomSitesAltEnsBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSitesAltGenBuilder enterAtomSitesAltGen() {
        return new MmCifCategoryBuilder.AtomSitesAltGenBuilder(this);
    }

    public MmCifCategoryBuilder.AtomSitesFootnoteBuilder enterAtomSitesFootnote() {
        return new MmCifCategoryBuilder.AtomSitesFootnoteBuilder(this);
    }

    public MmCifCategoryBuilder.AtomTypeBuilder enterAtomType() {
        return new MmCifCategoryBuilder.AtomTypeBuilder(this);
    }

    public MmCifCategoryBuilder.AuditBuilder enterAudit() {
        return new MmCifCategoryBuilder.AuditBuilder(this);
    }

    public MmCifCategoryBuilder.AuditAuthorBuilder enterAuditAuthor() {
        return new MmCifCategoryBuilder.AuditAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.AuditConformBuilder enterAuditConform() {
        return new MmCifCategoryBuilder.AuditConformBuilder(this);
    }

    public MmCifCategoryBuilder.AuditContactAuthorBuilder enterAuditContactAuthor() {
        return new MmCifCategoryBuilder.AuditContactAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.CellBuilder enterCell() {
        return new MmCifCategoryBuilder.CellBuilder(this);
    }

    public MmCifCategoryBuilder.CellMeasurementBuilder enterCellMeasurement() {
        return new MmCifCategoryBuilder.CellMeasurementBuilder(this);
    }

    public MmCifCategoryBuilder.CellMeasurementReflnBuilder enterCellMeasurementRefln() {
        return new MmCifCategoryBuilder.CellMeasurementReflnBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompBuilder enterChemComp() {
        return new MmCifCategoryBuilder.ChemCompBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompAngleBuilder enterChemCompAngle() {
        return new MmCifCategoryBuilder.ChemCompAngleBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompAtomBuilder enterChemCompAtom() {
        return new MmCifCategoryBuilder.ChemCompAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompBondBuilder enterChemCompBond() {
        return new MmCifCategoryBuilder.ChemCompBondBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompChirBuilder enterChemCompChir() {
        return new MmCifCategoryBuilder.ChemCompChirBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompChirAtomBuilder enterChemCompChirAtom() {
        return new MmCifCategoryBuilder.ChemCompChirAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompLinkBuilder enterChemCompLink() {
        return new MmCifCategoryBuilder.ChemCompLinkBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompPlaneBuilder enterChemCompPlane() {
        return new MmCifCategoryBuilder.ChemCompPlaneBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompPlaneAtomBuilder enterChemCompPlaneAtom() {
        return new MmCifCategoryBuilder.ChemCompPlaneAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompTorBuilder enterChemCompTor() {
        return new MmCifCategoryBuilder.ChemCompTorBuilder(this);
    }

    public MmCifCategoryBuilder.ChemCompTorValueBuilder enterChemCompTorValue() {
        return new MmCifCategoryBuilder.ChemCompTorValueBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkBuilder enterChemLink() {
        return new MmCifCategoryBuilder.ChemLinkBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkAngleBuilder enterChemLinkAngle() {
        return new MmCifCategoryBuilder.ChemLinkAngleBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkBondBuilder enterChemLinkBond() {
        return new MmCifCategoryBuilder.ChemLinkBondBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkChirBuilder enterChemLinkChir() {
        return new MmCifCategoryBuilder.ChemLinkChirBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkChirAtomBuilder enterChemLinkChirAtom() {
        return new MmCifCategoryBuilder.ChemLinkChirAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkPlaneBuilder enterChemLinkPlane() {
        return new MmCifCategoryBuilder.ChemLinkPlaneBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkPlaneAtomBuilder enterChemLinkPlaneAtom() {
        return new MmCifCategoryBuilder.ChemLinkPlaneAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkTorBuilder enterChemLinkTor() {
        return new MmCifCategoryBuilder.ChemLinkTorBuilder(this);
    }

    public MmCifCategoryBuilder.ChemLinkTorValueBuilder enterChemLinkTorValue() {
        return new MmCifCategoryBuilder.ChemLinkTorValueBuilder(this);
    }

    public MmCifCategoryBuilder.ChemicalBuilder enterChemical() {
        return new MmCifCategoryBuilder.ChemicalBuilder(this);
    }

    public MmCifCategoryBuilder.ChemicalConnAtomBuilder enterChemicalConnAtom() {
        return new MmCifCategoryBuilder.ChemicalConnAtomBuilder(this);
    }

    public MmCifCategoryBuilder.ChemicalConnBondBuilder enterChemicalConnBond() {
        return new MmCifCategoryBuilder.ChemicalConnBondBuilder(this);
    }

    public MmCifCategoryBuilder.ChemicalFormulaBuilder enterChemicalFormula() {
        return new MmCifCategoryBuilder.ChemicalFormulaBuilder(this);
    }

    public MmCifCategoryBuilder.CitationBuilder enterCitation() {
        return new MmCifCategoryBuilder.CitationBuilder(this);
    }

    public MmCifCategoryBuilder.CitationAuthorBuilder enterCitationAuthor() {
        return new MmCifCategoryBuilder.CitationAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.CitationEditorBuilder enterCitationEditor() {
        return new MmCifCategoryBuilder.CitationEditorBuilder(this);
    }

    public MmCifCategoryBuilder.ComputingBuilder enterComputing() {
        return new MmCifCategoryBuilder.ComputingBuilder(this);
    }

    public MmCifCategoryBuilder.DatabaseBuilder enterDatabase() {
        return new MmCifCategoryBuilder.DatabaseBuilder(this);
    }

    public MmCifCategoryBuilder.Database2Builder enterDatabase2() {
        return new MmCifCategoryBuilder.Database2Builder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBCaveatBuilder enterDatabasePDBCaveat() {
        return new MmCifCategoryBuilder.DatabasePDBCaveatBuilder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBMatrixBuilder enterDatabasePDBMatrix() {
        return new MmCifCategoryBuilder.DatabasePDBMatrixBuilder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBRemarkBuilder enterDatabasePDBRemark() {
        return new MmCifCategoryBuilder.DatabasePDBRemarkBuilder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBRevBuilder enterDatabasePDBRev() {
        return new MmCifCategoryBuilder.DatabasePDBRevBuilder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBRevRecordBuilder enterDatabasePDBRevRecord() {
        return new MmCifCategoryBuilder.DatabasePDBRevRecordBuilder(this);
    }

    public MmCifCategoryBuilder.DatabasePDBTvectBuilder enterDatabasePDBTvect() {
        return new MmCifCategoryBuilder.DatabasePDBTvectBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnBuilder enterDiffrn() {
        return new MmCifCategoryBuilder.DiffrnBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnAttenuatorBuilder enterDiffrnAttenuator() {
        return new MmCifCategoryBuilder.DiffrnAttenuatorBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnDetectorBuilder enterDiffrnDetector() {
        return new MmCifCategoryBuilder.DiffrnDetectorBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnMeasurementBuilder enterDiffrnMeasurement() {
        return new MmCifCategoryBuilder.DiffrnMeasurementBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnOrientMatrixBuilder enterDiffrnOrientMatrix() {
        return new MmCifCategoryBuilder.DiffrnOrientMatrixBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnOrientReflnBuilder enterDiffrnOrientRefln() {
        return new MmCifCategoryBuilder.DiffrnOrientReflnBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnRadiationBuilder enterDiffrnRadiation() {
        return new MmCifCategoryBuilder.DiffrnRadiationBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnRadiationWavelengthBuilder enterDiffrnRadiationWavelength() {
        return new MmCifCategoryBuilder.DiffrnRadiationWavelengthBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnReflnBuilder enterDiffrnRefln() {
        return new MmCifCategoryBuilder.DiffrnReflnBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnReflnsBuilder enterDiffrnReflns() {
        return new MmCifCategoryBuilder.DiffrnReflnsBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScaleGroupBuilder enterDiffrnScaleGroup() {
        return new MmCifCategoryBuilder.DiffrnScaleGroupBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnSourceBuilder enterDiffrnSource() {
        return new MmCifCategoryBuilder.DiffrnSourceBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnStandardReflnBuilder enterDiffrnStandardRefln() {
        return new MmCifCategoryBuilder.DiffrnStandardReflnBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnStandardsBuilder enterDiffrnStandards() {
        return new MmCifCategoryBuilder.DiffrnStandardsBuilder(this);
    }

    public MmCifCategoryBuilder.EntityBuilder enterEntity() {
        return new MmCifCategoryBuilder.EntityBuilder(this);
    }

    public MmCifCategoryBuilder.EntityKeywordsBuilder enterEntityKeywords() {
        return new MmCifCategoryBuilder.EntityKeywordsBuilder(this);
    }

    public MmCifCategoryBuilder.EntityLinkBuilder enterEntityLink() {
        return new MmCifCategoryBuilder.EntityLinkBuilder(this);
    }

    public MmCifCategoryBuilder.EntityNameComBuilder enterEntityNameCom() {
        return new MmCifCategoryBuilder.EntityNameComBuilder(this);
    }

    public MmCifCategoryBuilder.EntityNameSysBuilder enterEntityNameSys() {
        return new MmCifCategoryBuilder.EntityNameSysBuilder(this);
    }

    public MmCifCategoryBuilder.EntityPolyBuilder enterEntityPoly() {
        return new MmCifCategoryBuilder.EntityPolyBuilder(this);
    }

    public MmCifCategoryBuilder.EntityPolySeqBuilder enterEntityPolySeq() {
        return new MmCifCategoryBuilder.EntityPolySeqBuilder(this);
    }

    public MmCifCategoryBuilder.EntryBuilder enterEntry() {
        return new MmCifCategoryBuilder.EntryBuilder(this);
    }

    public MmCifCategoryBuilder.EntryLinkBuilder enterEntryLink() {
        return new MmCifCategoryBuilder.EntryLinkBuilder(this);
    }

    public MmCifCategoryBuilder.ExptlBuilder enterExptl() {
        return new MmCifCategoryBuilder.ExptlBuilder(this);
    }

    public MmCifCategoryBuilder.ExptlCrystalBuilder enterExptlCrystal() {
        return new MmCifCategoryBuilder.ExptlCrystalBuilder(this);
    }

    public MmCifCategoryBuilder.ExptlCrystalFaceBuilder enterExptlCrystalFace() {
        return new MmCifCategoryBuilder.ExptlCrystalFaceBuilder(this);
    }

    public MmCifCategoryBuilder.ExptlCrystalGrowBuilder enterExptlCrystalGrow() {
        return new MmCifCategoryBuilder.ExptlCrystalGrowBuilder(this);
    }

    public MmCifCategoryBuilder.ExptlCrystalGrowCompBuilder enterExptlCrystalGrowComp() {
        return new MmCifCategoryBuilder.ExptlCrystalGrowCompBuilder(this);
    }

    public MmCifCategoryBuilder.GeomBuilder enterGeom() {
        return new MmCifCategoryBuilder.GeomBuilder(this);
    }

    public MmCifCategoryBuilder.GeomAngleBuilder enterGeomAngle() {
        return new MmCifCategoryBuilder.GeomAngleBuilder(this);
    }

    public MmCifCategoryBuilder.GeomBondBuilder enterGeomBond() {
        return new MmCifCategoryBuilder.GeomBondBuilder(this);
    }

    public MmCifCategoryBuilder.GeomContactBuilder enterGeomContact() {
        return new MmCifCategoryBuilder.GeomContactBuilder(this);
    }

    public MmCifCategoryBuilder.GeomHbondBuilder enterGeomHbond() {
        return new MmCifCategoryBuilder.GeomHbondBuilder(this);
    }

    public MmCifCategoryBuilder.GeomTorsionBuilder enterGeomTorsion() {
        return new MmCifCategoryBuilder.GeomTorsionBuilder(this);
    }

    public MmCifCategoryBuilder.JournalBuilder enterJournal() {
        return new MmCifCategoryBuilder.JournalBuilder(this);
    }

    public MmCifCategoryBuilder.JournalIndexBuilder enterJournalIndex() {
        return new MmCifCategoryBuilder.JournalIndexBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingBuilder enterPhasing() {
        return new MmCifCategoryBuilder.PhasingBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingAveragingBuilder enterPhasingAveraging() {
        return new MmCifCategoryBuilder.PhasingAveragingBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingIsomorphousBuilder enterPhasingIsomorphous() {
        return new MmCifCategoryBuilder.PhasingIsomorphousBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMADBuilder enterPhasingMAD() {
        return new MmCifCategoryBuilder.PhasingMADBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMADClustBuilder enterPhasingMADClust() {
        return new MmCifCategoryBuilder.PhasingMADClustBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMADExptBuilder enterPhasingMADExpt() {
        return new MmCifCategoryBuilder.PhasingMADExptBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMADRatioBuilder enterPhasingMADRatio() {
        return new MmCifCategoryBuilder.PhasingMADRatioBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMADSetBuilder enterPhasingMADSet() {
        return new MmCifCategoryBuilder.PhasingMADSetBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRBuilder enterPhasingMIR() {
        return new MmCifCategoryBuilder.PhasingMIRBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRDerBuilder enterPhasingMIRDer() {
        return new MmCifCategoryBuilder.PhasingMIRDerBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRDerReflnBuilder enterPhasingMIRDerRefln() {
        return new MmCifCategoryBuilder.PhasingMIRDerReflnBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRDerShellBuilder enterPhasingMIRDerShell() {
        return new MmCifCategoryBuilder.PhasingMIRDerShellBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRDerSiteBuilder enterPhasingMIRDerSite() {
        return new MmCifCategoryBuilder.PhasingMIRDerSiteBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingMIRShellBuilder enterPhasingMIRShell() {
        return new MmCifCategoryBuilder.PhasingMIRShellBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingSetBuilder enterPhasingSet() {
        return new MmCifCategoryBuilder.PhasingSetBuilder(this);
    }

    public MmCifCategoryBuilder.PhasingSetReflnBuilder enterPhasingSetRefln() {
        return new MmCifCategoryBuilder.PhasingSetReflnBuilder(this);
    }

    public MmCifCategoryBuilder.PublBuilder enterPubl() {
        return new MmCifCategoryBuilder.PublBuilder(this);
    }

    public MmCifCategoryBuilder.PublAuthorBuilder enterPublAuthor() {
        return new MmCifCategoryBuilder.PublAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.PublBodyBuilder enterPublBody() {
        return new MmCifCategoryBuilder.PublBodyBuilder(this);
    }

    public MmCifCategoryBuilder.PublManuscriptInclBuilder enterPublManuscriptIncl() {
        return new MmCifCategoryBuilder.PublManuscriptInclBuilder(this);
    }

    public MmCifCategoryBuilder.RefineBuilder enterRefine() {
        return new MmCifCategoryBuilder.RefineBuilder(this);
    }

    public MmCifCategoryBuilder.RefineAnalyzeBuilder enterRefineAnalyze() {
        return new MmCifCategoryBuilder.RefineAnalyzeBuilder(this);
    }

    public MmCifCategoryBuilder.RefineBIsoBuilder enterRefineBIso() {
        return new MmCifCategoryBuilder.RefineBIsoBuilder(this);
    }

    public MmCifCategoryBuilder.RefineFunctMinimizedBuilder enterRefineFunctMinimized() {
        return new MmCifCategoryBuilder.RefineFunctMinimizedBuilder(this);
    }

    public MmCifCategoryBuilder.RefineHistBuilder enterRefineHist() {
        return new MmCifCategoryBuilder.RefineHistBuilder(this);
    }

    public MmCifCategoryBuilder.RefineLsRestrBuilder enterRefineLsRestr() {
        return new MmCifCategoryBuilder.RefineLsRestrBuilder(this);
    }

    public MmCifCategoryBuilder.RefineLsRestrNcsBuilder enterRefineLsRestrNcs() {
        return new MmCifCategoryBuilder.RefineLsRestrNcsBuilder(this);
    }

    public MmCifCategoryBuilder.RefineLsRestrTypeBuilder enterRefineLsRestrType() {
        return new MmCifCategoryBuilder.RefineLsRestrTypeBuilder(this);
    }

    public MmCifCategoryBuilder.RefineLsShellBuilder enterRefineLsShell() {
        return new MmCifCategoryBuilder.RefineLsShellBuilder(this);
    }

    public MmCifCategoryBuilder.RefineOccupancyBuilder enterRefineOccupancy() {
        return new MmCifCategoryBuilder.RefineOccupancyBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnBuilder enterRefln() {
        return new MmCifCategoryBuilder.ReflnBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnSysAbsBuilder enterReflnSysAbs() {
        return new MmCifCategoryBuilder.ReflnSysAbsBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnsBuilder enterReflns() {
        return new MmCifCategoryBuilder.ReflnsBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnsScaleBuilder enterReflnsScale() {
        return new MmCifCategoryBuilder.ReflnsScaleBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnsShellBuilder enterReflnsShell() {
        return new MmCifCategoryBuilder.ReflnsShellBuilder(this);
    }

    public MmCifCategoryBuilder.SoftwareBuilder enterSoftware() {
        return new MmCifCategoryBuilder.SoftwareBuilder(this);
    }

    public MmCifCategoryBuilder.StructBuilder enterStruct() {
        return new MmCifCategoryBuilder.StructBuilder(this);
    }

    public MmCifCategoryBuilder.StructAsymBuilder enterStructAsym() {
        return new MmCifCategoryBuilder.StructAsymBuilder(this);
    }

    public MmCifCategoryBuilder.StructBiolBuilder enterStructBiol() {
        return new MmCifCategoryBuilder.StructBiolBuilder(this);
    }

    public MmCifCategoryBuilder.StructBiolGenBuilder enterStructBiolGen() {
        return new MmCifCategoryBuilder.StructBiolGenBuilder(this);
    }

    public MmCifCategoryBuilder.StructBiolKeywordsBuilder enterStructBiolKeywords() {
        return new MmCifCategoryBuilder.StructBiolKeywordsBuilder(this);
    }

    public MmCifCategoryBuilder.StructBiolViewBuilder enterStructBiolView() {
        return new MmCifCategoryBuilder.StructBiolViewBuilder(this);
    }

    public MmCifCategoryBuilder.StructConfBuilder enterStructConf() {
        return new MmCifCategoryBuilder.StructConfBuilder(this);
    }

    public MmCifCategoryBuilder.StructConfTypeBuilder enterStructConfType() {
        return new MmCifCategoryBuilder.StructConfTypeBuilder(this);
    }

    public MmCifCategoryBuilder.StructConnBuilder enterStructConn() {
        return new MmCifCategoryBuilder.StructConnBuilder(this);
    }

    public MmCifCategoryBuilder.StructConnTypeBuilder enterStructConnType() {
        return new MmCifCategoryBuilder.StructConnTypeBuilder(this);
    }

    public MmCifCategoryBuilder.StructKeywordsBuilder enterStructKeywords() {
        return new MmCifCategoryBuilder.StructKeywordsBuilder(this);
    }

    public MmCifCategoryBuilder.StructMonDetailsBuilder enterStructMonDetails() {
        return new MmCifCategoryBuilder.StructMonDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.StructMonNuclBuilder enterStructMonNucl() {
        return new MmCifCategoryBuilder.StructMonNuclBuilder(this);
    }

    public MmCifCategoryBuilder.StructMonProtBuilder enterStructMonProt() {
        return new MmCifCategoryBuilder.StructMonProtBuilder(this);
    }

    public MmCifCategoryBuilder.StructMonProtCisBuilder enterStructMonProtCis() {
        return new MmCifCategoryBuilder.StructMonProtCisBuilder(this);
    }

    public MmCifCategoryBuilder.StructNcsDomBuilder enterStructNcsDom() {
        return new MmCifCategoryBuilder.StructNcsDomBuilder(this);
    }

    public MmCifCategoryBuilder.StructNcsDomLimBuilder enterStructNcsDomLim() {
        return new MmCifCategoryBuilder.StructNcsDomLimBuilder(this);
    }

    public MmCifCategoryBuilder.StructNcsEnsBuilder enterStructNcsEns() {
        return new MmCifCategoryBuilder.StructNcsEnsBuilder(this);
    }

    public MmCifCategoryBuilder.StructNcsEnsGenBuilder enterStructNcsEnsGen() {
        return new MmCifCategoryBuilder.StructNcsEnsGenBuilder(this);
    }

    public MmCifCategoryBuilder.StructNcsOperBuilder enterStructNcsOper() {
        return new MmCifCategoryBuilder.StructNcsOperBuilder(this);
    }

    public MmCifCategoryBuilder.StructRefBuilder enterStructRef() {
        return new MmCifCategoryBuilder.StructRefBuilder(this);
    }

    public MmCifCategoryBuilder.StructRefSeqBuilder enterStructRefSeq() {
        return new MmCifCategoryBuilder.StructRefSeqBuilder(this);
    }

    public MmCifCategoryBuilder.StructRefSeqDifBuilder enterStructRefSeqDif() {
        return new MmCifCategoryBuilder.StructRefSeqDifBuilder(this);
    }

    public MmCifCategoryBuilder.StructSheetBuilder enterStructSheet() {
        return new MmCifCategoryBuilder.StructSheetBuilder(this);
    }

    public MmCifCategoryBuilder.StructSheetHbondBuilder enterStructSheetHbond() {
        return new MmCifCategoryBuilder.StructSheetHbondBuilder(this);
    }

    public MmCifCategoryBuilder.StructSheetOrderBuilder enterStructSheetOrder() {
        return new MmCifCategoryBuilder.StructSheetOrderBuilder(this);
    }

    public MmCifCategoryBuilder.StructSheetRangeBuilder enterStructSheetRange() {
        return new MmCifCategoryBuilder.StructSheetRangeBuilder(this);
    }

    public MmCifCategoryBuilder.StructSheetTopologyBuilder enterStructSheetTopology() {
        return new MmCifCategoryBuilder.StructSheetTopologyBuilder(this);
    }

    public MmCifCategoryBuilder.StructSiteBuilder enterStructSite() {
        return new MmCifCategoryBuilder.StructSiteBuilder(this);
    }

    public MmCifCategoryBuilder.StructSiteGenBuilder enterStructSiteGen() {
        return new MmCifCategoryBuilder.StructSiteGenBuilder(this);
    }

    public MmCifCategoryBuilder.StructSiteKeywordsBuilder enterStructSiteKeywords() {
        return new MmCifCategoryBuilder.StructSiteKeywordsBuilder(this);
    }

    public MmCifCategoryBuilder.StructSiteViewBuilder enterStructSiteView() {
        return new MmCifCategoryBuilder.StructSiteViewBuilder(this);
    }

    public MmCifCategoryBuilder.SymmetryBuilder enterSymmetry() {
        return new MmCifCategoryBuilder.SymmetryBuilder(this);
    }

    public MmCifCategoryBuilder.SymmetryEquivBuilder enterSymmetryEquiv() {
        return new MmCifCategoryBuilder.SymmetryEquivBuilder(this);
    }

    public MmCifCategoryBuilder.AuditLinkBuilder enterAuditLink() {
        return new MmCifCategoryBuilder.AuditLinkBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnReflnsClassBuilder enterDiffrnReflnsClass() {
        return new MmCifCategoryBuilder.DiffrnReflnsClassBuilder(this);
    }

    public MmCifCategoryBuilder.RefineLsClassBuilder enterRefineLsClass() {
        return new MmCifCategoryBuilder.RefineLsClassBuilder(this);
    }

    public MmCifCategoryBuilder.ReflnsClassBuilder enterReflnsClass() {
        return new MmCifCategoryBuilder.ReflnsClassBuilder(this);
    }

    public MmCifCategoryBuilder.SpaceGroupBuilder enterSpaceGroup() {
        return new MmCifCategoryBuilder.SpaceGroupBuilder(this);
    }

    public MmCifCategoryBuilder.SpaceGroupSymopBuilder enterSpaceGroupSymop() {
        return new MmCifCategoryBuilder.SpaceGroupSymopBuilder(this);
    }

    public MmCifCategoryBuilder.ValenceParamBuilder enterValenceParam() {
        return new MmCifCategoryBuilder.ValenceParamBuilder(this);
    }

    public MmCifCategoryBuilder.ValenceRefBuilder enterValenceRef() {
        return new MmCifCategoryBuilder.ValenceRefBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditBuilder enterPdbxAudit() {
        return new MmCifCategoryBuilder.PdbxAuditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxVersionBuilder enterPdbxVersion() {
        return new MmCifCategoryBuilder.PdbxVersionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditAuthorBuilder enterPdbxAuditAuthor() {
        return new MmCifCategoryBuilder.PdbxAuditAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseMessageBuilder enterPdbxDatabaseMessage() {
        return new MmCifCategoryBuilder.PdbxDatabaseMessageBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabasePDBObsSprBuilder enterPdbxDatabasePDBObsSpr() {
        return new MmCifCategoryBuilder.PdbxDatabasePDBObsSprBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseProcBuilder enterPdbxDatabaseProc() {
        return new MmCifCategoryBuilder.PdbxDatabaseProcBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseRemarkBuilder enterPdbxDatabaseRemark() {
        return new MmCifCategoryBuilder.PdbxDatabaseRemarkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseStatusBuilder enterPdbxDatabaseStatus() {
        return new MmCifCategoryBuilder.PdbxDatabaseStatusBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityNameBuilder enterPdbxEntityName() {
        return new MmCifCategoryBuilder.PdbxEntityNameBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPrereleaseSeqBuilder enterPdbxPrereleaseSeq() {
        return new MmCifCategoryBuilder.PdbxPrereleaseSeqBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPolySeqSchemeBuilder enterPdbxPolySeqScheme() {
        return new MmCifCategoryBuilder.PdbxPolySeqSchemeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNonpolySchemeBuilder enterPdbxNonpolyScheme() {
        return new MmCifCategoryBuilder.PdbxNonpolySchemeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineBuilder enterPdbxRefine() {
        return new MmCifCategoryBuilder.PdbxRefineBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructSheetHbondBuilder enterPdbxStructSheetHbond() {
        return new MmCifCategoryBuilder.PdbxStructSheetHbondBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxXplorFileBuilder enterPdbxXplorFile() {
        return new MmCifCategoryBuilder.PdbxXplorFileBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineAuxFileBuilder enterPdbxRefineAuxFile() {
        return new MmCifCategoryBuilder.PdbxRefineAuxFileBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseRelatedBuilder enterPdbxDatabaseRelated() {
        return new MmCifCategoryBuilder.PdbxDatabaseRelatedBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityAssemblyBuilder enterPdbxEntityAssembly() {
        return new MmCifCategoryBuilder.PdbxEntityAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxExptlCrystalGrowCompBuilder enterPdbxExptlCrystalGrowComp() {
        return new MmCifCategoryBuilder.PdbxExptlCrystalGrowCompBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxExptlCrystalGrowSolBuilder enterPdbxExptlCrystalGrowSol() {
        return new MmCifCategoryBuilder.PdbxExptlCrystalGrowSolBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxExptlCrystalCryoTreatmentBuilder enterPdbxExptlCrystalCryoTreatment() {
        return new MmCifCategoryBuilder.PdbxExptlCrystalCryoTreatmentBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineTlsBuilder enterPdbxRefineTls() {
        return new MmCifCategoryBuilder.PdbxRefineTlsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineTlsGroupBuilder enterPdbxRefineTlsGroup() {
        return new MmCifCategoryBuilder.PdbxRefineTlsGroupBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxContactAuthorBuilder enterPdbxContactAuthor() {
        return new MmCifCategoryBuilder.PdbxContactAuthorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSGProjectBuilder enterPdbxSGProject() {
        return new MmCifCategoryBuilder.PdbxSGProjectBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAtomSiteAnisoTlsBuilder enterPdbxAtomSiteAnisoTls() {
        return new MmCifCategoryBuilder.PdbxAtomSiteAnisoTlsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrDetailsBuilder enterPdbxNmrDetails() {
        return new MmCifCategoryBuilder.PdbxNmrDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSampleDetailsBuilder enterPdbxNmrSampleDetails() {
        return new MmCifCategoryBuilder.PdbxNmrSampleDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrExptlSampleBuilder enterPdbxNmrExptlSample() {
        return new MmCifCategoryBuilder.PdbxNmrExptlSampleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrExptlSampleConditionsBuilder enterPdbxNmrExptlSampleConditions() {
        return new MmCifCategoryBuilder.PdbxNmrExptlSampleConditionsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSpectrometerBuilder enterPdbxNmrSpectrometer() {
        return new MmCifCategoryBuilder.PdbxNmrSpectrometerBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrExptlBuilder enterPdbxNmrExptl() {
        return new MmCifCategoryBuilder.PdbxNmrExptlBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSoftwareBuilder enterPdbxNmrSoftware() {
        return new MmCifCategoryBuilder.PdbxNmrSoftwareBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrConstraintsBuilder enterPdbxNmrConstraints() {
        return new MmCifCategoryBuilder.PdbxNmrConstraintsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrEnsembleBuilder enterPdbxNmrEnsemble() {
        return new MmCifCategoryBuilder.PdbxNmrEnsembleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrEnsembleRmsBuilder enterPdbxNmrEnsembleRms() {
        return new MmCifCategoryBuilder.PdbxNmrEnsembleRmsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrRepresentativeBuilder enterPdbxNmrRepresentative() {
        return new MmCifCategoryBuilder.PdbxNmrRepresentativeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrRefineBuilder enterPdbxNmrRefine() {
        return new MmCifCategoryBuilder.PdbxNmrRefineBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrForceConstantsBuilder enterPdbxNmrForceConstants() {
        return new MmCifCategoryBuilder.PdbxNmrForceConstantsBuilder(this);
    }

    public MmCifCategoryBuilder.NdbStructConfNaBuilder enterNdbStructConfNa() {
        return new MmCifCategoryBuilder.NdbStructConfNaBuilder(this);
    }

    public MmCifCategoryBuilder.NdbStructFeatureNaBuilder enterNdbStructFeatureNa() {
        return new MmCifCategoryBuilder.NdbStructFeatureNaBuilder(this);
    }

    public MmCifCategoryBuilder.NdbStructNaBasePairBuilder enterNdbStructNaBasePair() {
        return new MmCifCategoryBuilder.NdbStructNaBasePairBuilder(this);
    }

    public MmCifCategoryBuilder.NdbStructNaBasePairStepBuilder enterNdbStructNaBasePairStep() {
        return new MmCifCategoryBuilder.NdbStructNaBasePairStepBuilder(this);
    }

    public MmCifCategoryBuilder.NdbOriginalNdbCoordinatesBuilder enterNdbOriginalNdbCoordinates() {
        return new MmCifCategoryBuilder.NdbOriginalNdbCoordinatesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityNonpolyBuilder enterPdbxEntityNonpoly() {
        return new MmCifCategoryBuilder.PdbxEntityNonpolyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingDmBuilder enterPdbxPhasingDm() {
        return new MmCifCategoryBuilder.PdbxPhasingDmBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingDmShellBuilder enterPdbxPhasingDmShell() {
        return new MmCifCategoryBuilder.PdbxPhasingDmShellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingMADShellBuilder enterPdbxPhasingMADShell() {
        return new MmCifCategoryBuilder.PdbxPhasingMADShellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingMADSetBuilder enterPdbxPhasingMADSet() {
        return new MmCifCategoryBuilder.PdbxPhasingMADSetBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingMADSetShellBuilder enterPdbxPhasingMADSetShell() {
        return new MmCifCategoryBuilder.PdbxPhasingMADSetShellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingMADSetSiteBuilder enterPdbxPhasingMADSetSite() {
        return new MmCifCategoryBuilder.PdbxPhasingMADSetSiteBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPhasingMRBuilder enterPdbxPhasingMR() {
        return new MmCifCategoryBuilder.PdbxPhasingMRBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineComponentBuilder enterPdbxRefineComponent() {
        return new MmCifCategoryBuilder.PdbxRefineComponentBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityProdProtocolBuilder enterPdbxEntityProdProtocol() {
        return new MmCifCategoryBuilder.PdbxEntityProdProtocolBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenProdOtherBuilder enterPdbxEntitySrcGenProdOther() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenProdOtherBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenProdOtherParameterBuilder enterPdbxEntitySrcGenProdOtherParameter() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenProdOtherParameterBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenProdPcrBuilder enterPdbxEntitySrcGenProdPcr() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenProdPcrBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenProdDigestBuilder enterPdbxEntitySrcGenProdDigest() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenProdDigestBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenCloneBuilder enterPdbxEntitySrcGenClone() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenCloneBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenCloneLigationBuilder enterPdbxEntitySrcGenCloneLigation() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenCloneLigationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenCloneRecombinationBuilder enterPdbxEntitySrcGenCloneRecombination() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenCloneRecombinationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenExpressBuilder enterPdbxEntitySrcGenExpress() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenExpressBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenExpressTimepointBuilder enterPdbxEntitySrcGenExpressTimepoint() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenExpressTimepointBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenLysisBuilder enterPdbxEntitySrcGenLysis() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenLysisBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenRefoldBuilder enterPdbxEntitySrcGenRefold() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenRefoldBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenProteolysisBuilder enterPdbxEntitySrcGenProteolysis() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenProteolysisBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenChromBuilder enterPdbxEntitySrcGenChrom() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenChromBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenFractBuilder enterPdbxEntitySrcGenFract() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenFractBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenPureBuilder enterPdbxEntitySrcGenPure() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenPureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenCharacterBuilder enterPdbxEntitySrcGenCharacter() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenCharacterBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConstructBuilder enterPdbxConstruct() {
        return new MmCifCategoryBuilder.PdbxConstructBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConstructFeatureBuilder enterPdbxConstructFeature() {
        return new MmCifCategoryBuilder.PdbxConstructFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRobotSystemBuilder enterPdbxRobotSystem() {
        return new MmCifCategoryBuilder.PdbxRobotSystemBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxBufferBuilder enterPdbxBuffer() {
        return new MmCifCategoryBuilder.PdbxBufferBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxBufferComponentsBuilder enterPdbxBufferComponents() {
        return new MmCifCategoryBuilder.PdbxBufferComponentsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDomainBuilder enterPdbxDomain() {
        return new MmCifCategoryBuilder.PdbxDomainBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDomainRangeBuilder enterPdbxDomainRange() {
        return new MmCifCategoryBuilder.PdbxDomainRangeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSequenceRangeBuilder enterPdbxSequenceRange() {
        return new MmCifCategoryBuilder.PdbxSequenceRangeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFeatureEntryBuilder enterPdbxFeatureEntry() {
        return new MmCifCategoryBuilder.PdbxFeatureEntryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFeatureDomainBuilder enterPdbxFeatureDomain() {
        return new MmCifCategoryBuilder.PdbxFeatureDomainBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFeatureSequenceRangeBuilder enterPdbxFeatureSequenceRange() {
        return new MmCifCategoryBuilder.PdbxFeatureSequenceRangeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFeatureAssemblyBuilder enterPdbxFeatureAssembly() {
        return new MmCifCategoryBuilder.PdbxFeatureAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFeatureMonomerBuilder enterPdbxFeatureMonomer() {
        return new MmCifCategoryBuilder.PdbxFeatureMonomerBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxExptlPdBuilder enterPdbxExptlPd() {
        return new MmCifCategoryBuilder.PdbxExptlPdBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReflnsTwinBuilder enterPdbxReflnsTwin() {
        return new MmCifCategoryBuilder.PdbxReflnsTwinBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructInfoBuilder enterPdbxStructInfo() {
        return new MmCifCategoryBuilder.PdbxStructInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReRefinementBuilder enterPdbxReRefinement() {
        return new MmCifCategoryBuilder.PdbxReRefinementBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyPropBuilder enterPdbxStructAssemblyProp() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyPropBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqFeatureBuilder enterPdbxStructRefSeqFeature() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqFeaturePropBuilder enterPdbxStructRefSeqFeatureProp() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqFeaturePropBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructChemCompDiagnosticsBuilder enterPdbxStructChemCompDiagnostics() {
        return new MmCifCategoryBuilder.PdbxStructChemCompDiagnosticsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompSynonymsBuilder enterPdbxChemCompSynonyms() {
        return new MmCifCategoryBuilder.PdbxChemCompSynonymsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompFeatureBuilder enterPdbxChemCompFeature() {
        return new MmCifCategoryBuilder.PdbxChemCompFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxCoordinateModelBuilder enterPdbxCoordinateModel() {
        return new MmCifCategoryBuilder.PdbxCoordinateModelBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructChemCompFeatureBuilder enterPdbxStructChemCompFeature() {
        return new MmCifCategoryBuilder.PdbxStructChemCompFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnReflnsShellBuilder enterPdbxDiffrnReflnsShell() {
        return new MmCifCategoryBuilder.PdbxDiffrnReflnsShellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxBondDistanceLimitsBuilder enterPdbxBondDistanceLimits() {
        return new MmCifCategoryBuilder.PdbxBondDistanceLimitsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSolnScatterBuilder enterPdbxSolnScatter() {
        return new MmCifCategoryBuilder.PdbxSolnScatterBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSolnScatterModelBuilder enterPdbxSolnScatterModel() {
        return new MmCifCategoryBuilder.PdbxSolnScatterModelBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompDescriptorBuilder enterPdbxChemCompDescriptor() {
        return new MmCifCategoryBuilder.PdbxChemCompDescriptorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompIdentifierBuilder enterPdbxChemCompIdentifier() {
        return new MmCifCategoryBuilder.PdbxChemCompIdentifierBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompImportBuilder enterPdbxChemCompImport() {
        return new MmCifCategoryBuilder.PdbxChemCompImportBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompAtomEditBuilder enterPdbxChemCompAtomEdit() {
        return new MmCifCategoryBuilder.PdbxChemCompAtomEditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompBondEditBuilder enterPdbxChemCompBondEdit() {
        return new MmCifCategoryBuilder.PdbxChemCompBondEditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompAuditBuilder enterPdbxChemCompAudit() {
        return new MmCifCategoryBuilder.PdbxChemCompAuditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateCloseContactBuilder enterPdbxValidateCloseContact() {
        return new MmCifCategoryBuilder.PdbxValidateCloseContactBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateSymmContactBuilder enterPdbxValidateSymmContact() {
        return new MmCifCategoryBuilder.PdbxValidateSymmContactBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateRmsdBondBuilder enterPdbxValidateRmsdBond() {
        return new MmCifCategoryBuilder.PdbxValidateRmsdBondBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateRmsdAngleBuilder enterPdbxValidateRmsdAngle() {
        return new MmCifCategoryBuilder.PdbxValidateRmsdAngleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateTorsionBuilder enterPdbxValidateTorsion() {
        return new MmCifCategoryBuilder.PdbxValidateTorsionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidatePeptideOmegaBuilder enterPdbxValidatePeptideOmega() {
        return new MmCifCategoryBuilder.PdbxValidatePeptideOmegaBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateChiralBuilder enterPdbxValidateChiral() {
        return new MmCifCategoryBuilder.PdbxValidateChiralBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidatePlanesBuilder enterPdbxValidatePlanes() {
        return new MmCifCategoryBuilder.PdbxValidatePlanesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidatePlanesAtomBuilder enterPdbxValidatePlanesAtom() {
        return new MmCifCategoryBuilder.PdbxValidatePlanesAtomBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidateMainChainPlaneBuilder enterPdbxValidateMainChainPlane() {
        return new MmCifCategoryBuilder.PdbxValidateMainChainPlaneBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructConnAngleBuilder enterPdbxStructConnAngle() {
        return new MmCifCategoryBuilder.PdbxStructConnAngleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxUnobsOrZeroOccResiduesBuilder enterPdbxUnobsOrZeroOccResidues() {
        return new MmCifCategoryBuilder.PdbxUnobsOrZeroOccResiduesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxUnobsOrZeroOccAtomsBuilder enterPdbxUnobsOrZeroOccAtoms() {
        return new MmCifCategoryBuilder.PdbxUnobsOrZeroOccAtomsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntryDetailsBuilder enterPdbxEntryDetails() {
        return new MmCifCategoryBuilder.PdbxEntryDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructModResidueBuilder enterPdbxStructModResidue() {
        return new MmCifCategoryBuilder.PdbxStructModResidueBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqInsertionBuilder enterPdbxStructRefSeqInsertion() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqInsertionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqDeletionBuilder enterPdbxStructRefSeqDeletion() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqDeletionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRemediationAtomSiteMappingBuilder enterPdbxRemediationAtomSiteMapping() {
        return new MmCifCategoryBuilder.PdbxRemediationAtomSiteMappingBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValidatePolymerLinkageBuilder enterPdbxValidatePolymerLinkage() {
        return new MmCifCategoryBuilder.PdbxValidatePolymerLinkageBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxHelicalSymmetryBuilder enterPdbxHelicalSymmetry() {
        return new MmCifCategoryBuilder.PdbxHelicalSymmetryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPointSymmetryBuilder enterPdbxPointSymmetry() {
        return new MmCifCategoryBuilder.PdbxPointSymmetryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructEntityInstBuilder enterPdbxStructEntityInst() {
        return new MmCifCategoryBuilder.PdbxStructEntityInstBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructOperListBuilder enterPdbxStructOperList() {
        return new MmCifCategoryBuilder.PdbxStructOperListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyBuilder enterPdbxStructAssembly() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyGenBuilder enterPdbxStructAssemblyGen() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAsymGenBuilder enterPdbxStructAsymGen() {
        return new MmCifCategoryBuilder.PdbxStructAsymGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructMsymGenBuilder enterPdbxStructMsymGen() {
        return new MmCifCategoryBuilder.PdbxStructMsymGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructLegacyOperListBuilder enterPdbxStructLegacyOperList() {
        return new MmCifCategoryBuilder.PdbxStructLegacyOperListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompAtomFeatureBuilder enterPdbxChemCompAtomFeature() {
        return new MmCifCategoryBuilder.PdbxChemCompAtomFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeFamilyBuilder enterPdbxReferenceMoleculeFamily() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeFamilyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeListBuilder enterPdbxReferenceMoleculeList() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeBuilder enterPdbxReferenceMolecule() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityListBuilder enterPdbxReferenceEntityList() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityNonpolyBuilder enterPdbxReferenceEntityNonpoly() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityNonpolyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityLinkBuilder enterPdbxReferenceEntityLink() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityPolyLinkBuilder enterPdbxReferenceEntityPolyLink() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityPolyLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityPolyBuilder enterPdbxReferenceEntityPoly() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityPolyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntityPolySeqBuilder enterPdbxReferenceEntityPolySeq() {
        return new MmCifCategoryBuilder.PdbxReferenceEntityPolySeqBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntitySequenceBuilder enterPdbxReferenceEntitySequence() {
        return new MmCifCategoryBuilder.PdbxReferenceEntitySequenceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntitySrcNatBuilder enterPdbxReferenceEntitySrcNat() {
        return new MmCifCategoryBuilder.PdbxReferenceEntitySrcNatBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeDetailsBuilder enterPdbxReferenceMoleculeDetails() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeSynonymsBuilder enterPdbxReferenceMoleculeSynonyms() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeSynonymsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceEntitySubcomponentsBuilder enterPdbxReferenceEntitySubcomponents() {
        return new MmCifCategoryBuilder.PdbxReferenceEntitySubcomponentsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeAnnotationBuilder enterPdbxReferenceMoleculeAnnotation() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeAnnotationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeFeaturesBuilder enterPdbxReferenceMoleculeFeatures() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeFeaturesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceMoleculeRelatedStructuresBuilder enterPdbxReferenceMoleculeRelatedStructures() {
        return new MmCifCategoryBuilder.PdbxReferenceMoleculeRelatedStructuresBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructGroupListBuilder enterPdbxStructGroupList() {
        return new MmCifCategoryBuilder.PdbxStructGroupListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructGroupComponentsBuilder enterPdbxStructGroupComponents() {
        return new MmCifCategoryBuilder.PdbxStructGroupComponentsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructGroupComponentRangeBuilder enterPdbxStructGroupComponentRange() {
        return new MmCifCategoryBuilder.PdbxStructGroupComponentRangeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPrdAuditBuilder enterPdbxPrdAudit() {
        return new MmCifCategoryBuilder.PdbxPrdAuditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFamilyPrdAuditBuilder enterPdbxFamilyPrdAudit() {
        return new MmCifCategoryBuilder.PdbxFamilyPrdAuditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMoleculeBuilder enterPdbxMolecule() {
        return new MmCifCategoryBuilder.PdbxMoleculeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMoleculeFeaturesBuilder enterPdbxMoleculeFeatures() {
        return new MmCifCategoryBuilder.PdbxMoleculeFeaturesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxFamilyGroupIndexBuilder enterPdbxFamilyGroupIndex() {
        return new MmCifCategoryBuilder.PdbxFamilyGroupIndexBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDistantSolventAtomsBuilder enterPdbxDistantSolventAtoms() {
        return new MmCifCategoryBuilder.PdbxDistantSolventAtomsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructSpecialSymmetryBuilder enterPdbxStructSpecialSymmetry() {
        return new MmCifCategoryBuilder.PdbxStructSpecialSymmetryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferencePublicationListBuilder enterPdbxReferencePublicationList() {
        return new MmCifCategoryBuilder.PdbxReferencePublicationListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrAssignedChemShiftListBuilder enterPdbxNmrAssignedChemShiftList() {
        return new MmCifCategoryBuilder.PdbxNmrAssignedChemShiftListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrChemShiftExperimentBuilder enterPdbxNmrChemShiftExperiment() {
        return new MmCifCategoryBuilder.PdbxNmrChemShiftExperimentBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrChemShiftRefBuilder enterPdbxNmrChemShiftRef() {
        return new MmCifCategoryBuilder.PdbxNmrChemShiftRefBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrChemShiftReferenceBuilder enterPdbxNmrChemShiftReference() {
        return new MmCifCategoryBuilder.PdbxNmrChemShiftReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrChemShiftSoftwareBuilder enterPdbxNmrChemShiftSoftware() {
        return new MmCifCategoryBuilder.PdbxNmrChemShiftSoftwareBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrConstraintFileBuilder enterPdbxNmrConstraintFile() {
        return new MmCifCategoryBuilder.PdbxNmrConstraintFileBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSoftwareTaskBuilder enterPdbxNmrSoftwareTask() {
        return new MmCifCategoryBuilder.PdbxNmrSoftwareTaskBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSpectralDimBuilder enterPdbxNmrSpectralDim() {
        return new MmCifCategoryBuilder.PdbxNmrSpectralDimBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSpectralPeakListBuilder enterPdbxNmrSpectralPeakList() {
        return new MmCifCategoryBuilder.PdbxNmrSpectralPeakListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSpectralPeakSoftwareBuilder enterPdbxNmrSpectralPeakSoftware() {
        return new MmCifCategoryBuilder.PdbxNmrSpectralPeakSoftwareBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrSystematicChemShiftOffsetBuilder enterPdbxNmrSystematicChemShiftOffset() {
        return new MmCifCategoryBuilder.PdbxNmrSystematicChemShiftOffsetBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrUploadBuilder enterPdbxNmrUpload() {
        return new MmCifCategoryBuilder.PdbxNmrUploadBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompSubcomponentStructConnBuilder enterPdbxChemCompSubcomponentStructConn() {
        return new MmCifCategoryBuilder.PdbxChemCompSubcomponentStructConnBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompSubcomponentEntityListBuilder enterPdbxChemCompSubcomponentEntityList() {
        return new MmCifCategoryBuilder.PdbxChemCompSubcomponentEntityListBuilder(this);
    }

    public MmCifCategoryBuilder.EntitySrcNatBuilder enterEntitySrcNat() {
        return new MmCifCategoryBuilder.EntitySrcNatBuilder(this);
    }

    public MmCifCategoryBuilder.EntitySrcGenBuilder enterEntitySrcGen() {
        return new MmCifCategoryBuilder.EntitySrcGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcSynBuilder enterPdbxEntitySrcSyn() {
        return new MmCifCategoryBuilder.PdbxEntitySrcSynBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityPolyCompLinkListBuilder enterPdbxEntityPolyCompLinkList() {
        return new MmCifCategoryBuilder.PdbxEntityPolyCompLinkListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxLinkedEntityBuilder enterPdbxLinkedEntity() {
        return new MmCifCategoryBuilder.PdbxLinkedEntityBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxLinkedEntityInstanceListBuilder enterPdbxLinkedEntityInstanceList() {
        return new MmCifCategoryBuilder.PdbxLinkedEntityInstanceListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxLinkedEntityListBuilder enterPdbxLinkedEntityList() {
        return new MmCifCategoryBuilder.PdbxLinkedEntityListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxLinkedEntityLinkListBuilder enterPdbxLinkedEntityLinkList() {
        return new MmCifCategoryBuilder.PdbxLinkedEntityLinkListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityBranchDescriptorBuilder enterPdbxEntityBranchDescriptor() {
        return new MmCifCategoryBuilder.PdbxEntityBranchDescriptorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceLinkedEntityBuilder enterPdbxReferenceLinkedEntity() {
        return new MmCifCategoryBuilder.PdbxReferenceLinkedEntityBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceLinkedEntityCompListBuilder enterPdbxReferenceLinkedEntityCompList() {
        return new MmCifCategoryBuilder.PdbxReferenceLinkedEntityCompListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceLinkedEntityCompLinkBuilder enterPdbxReferenceLinkedEntityCompLink() {
        return new MmCifCategoryBuilder.PdbxReferenceLinkedEntityCompLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReferenceLinkedEntityLinkBuilder enterPdbxReferenceLinkedEntityLink() {
        return new MmCifCategoryBuilder.PdbxReferenceLinkedEntityLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRelatedExpDataSetBuilder enterPdbxRelatedExpDataSet() {
        return new MmCifCategoryBuilder.PdbxRelatedExpDataSetBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseStatusHistoryBuilder enterPdbxDatabaseStatusHistory() {
        return new MmCifCategoryBuilder.PdbxDatabaseStatusHistoryBuilder(this);
    }

    public MmCifCategoryBuilder.EmAssemblyBuilder enterEmAssembly() {
        return new MmCifCategoryBuilder.EmAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.EmEntityAssemblyBuilder enterEmEntityAssembly() {
        return new MmCifCategoryBuilder.EmEntityAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.EmVirusEntityBuilder enterEmVirusEntity() {
        return new MmCifCategoryBuilder.EmVirusEntityBuilder(this);
    }

    public MmCifCategoryBuilder.EmSamplePreparationBuilder enterEmSamplePreparation() {
        return new MmCifCategoryBuilder.EmSamplePreparationBuilder(this);
    }

    public MmCifCategoryBuilder.EmSampleSupportBuilder enterEmSampleSupport() {
        return new MmCifCategoryBuilder.EmSampleSupportBuilder(this);
    }

    public MmCifCategoryBuilder.EmBufferBuilder enterEmBuffer() {
        return new MmCifCategoryBuilder.EmBufferBuilder(this);
    }

    public MmCifCategoryBuilder.EmVitrificationBuilder enterEmVitrification() {
        return new MmCifCategoryBuilder.EmVitrificationBuilder(this);
    }

    public MmCifCategoryBuilder.EmImagingBuilder enterEmImaging() {
        return new MmCifCategoryBuilder.EmImagingBuilder(this);
    }

    public MmCifCategoryBuilder.EmDetectorBuilder enterEmDetector() {
        return new MmCifCategoryBuilder.EmDetectorBuilder(this);
    }

    public MmCifCategoryBuilder.EmImageScansBuilder enterEmImageScans() {
        return new MmCifCategoryBuilder.EmImageScansBuilder(this);
    }

    public MmCifCategoryBuilder.Em2dProjectionSelectionBuilder enterEm2dProjectionSelection() {
        return new MmCifCategoryBuilder.Em2dProjectionSelectionBuilder(this);
    }

    public MmCifCategoryBuilder.Em3dReconstructionBuilder enterEm3dReconstruction() {
        return new MmCifCategoryBuilder.Em3dReconstructionBuilder(this);
    }

    public MmCifCategoryBuilder.Em3dFittingBuilder enterEm3dFitting() {
        return new MmCifCategoryBuilder.Em3dFittingBuilder(this);
    }

    public MmCifCategoryBuilder.Em3dFittingListBuilder enterEm3dFittingList() {
        return new MmCifCategoryBuilder.Em3dFittingListBuilder(this);
    }

    public MmCifCategoryBuilder.EmHelicalEntityBuilder enterEmHelicalEntity() {
        return new MmCifCategoryBuilder.EmHelicalEntityBuilder(this);
    }

    public MmCifCategoryBuilder.EmExperimentBuilder enterEmExperiment() {
        return new MmCifCategoryBuilder.EmExperimentBuilder(this);
    }

    public MmCifCategoryBuilder.EmSingleParticleEntityBuilder enterEmSingleParticleEntity() {
        return new MmCifCategoryBuilder.EmSingleParticleEntityBuilder(this);
    }

    public MmCifCategoryBuilder.EmAdminBuilder enterEmAdmin() {
        return new MmCifCategoryBuilder.EmAdminBuilder(this);
    }

    public MmCifCategoryBuilder.EmAuthorListBuilder enterEmAuthorList() {
        return new MmCifCategoryBuilder.EmAuthorListBuilder(this);
    }

    public MmCifCategoryBuilder.EmDbReferenceBuilder enterEmDbReference() {
        return new MmCifCategoryBuilder.EmDbReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.EmDbReferenceAuxiliaryBuilder enterEmDbReferenceAuxiliary() {
        return new MmCifCategoryBuilder.EmDbReferenceAuxiliaryBuilder(this);
    }

    public MmCifCategoryBuilder.EmDepuiBuilder enterEmDepui() {
        return new MmCifCategoryBuilder.EmDepuiBuilder(this);
    }

    public MmCifCategoryBuilder.EmObsoleteBuilder enterEmObsolete() {
        return new MmCifCategoryBuilder.EmObsoleteBuilder(this);
    }

    public MmCifCategoryBuilder.EmSupersedeBuilder enterEmSupersede() {
        return new MmCifCategoryBuilder.EmSupersedeBuilder(this);
    }

    public MmCifCategoryBuilder.EmEntityAssemblyMolwtBuilder enterEmEntityAssemblyMolwt() {
        return new MmCifCategoryBuilder.EmEntityAssemblyMolwtBuilder(this);
    }

    public MmCifCategoryBuilder.EmEntityAssemblyNaturalsourceBuilder enterEmEntityAssemblyNaturalsource() {
        return new MmCifCategoryBuilder.EmEntityAssemblyNaturalsourceBuilder(this);
    }

    public MmCifCategoryBuilder.EmEntityAssemblySyntheticBuilder enterEmEntityAssemblySynthetic() {
        return new MmCifCategoryBuilder.EmEntityAssemblySyntheticBuilder(this);
    }

    public MmCifCategoryBuilder.EmEntityAssemblyRecombinantBuilder enterEmEntityAssemblyRecombinant() {
        return new MmCifCategoryBuilder.EmEntityAssemblyRecombinantBuilder(this);
    }

    public MmCifCategoryBuilder.EmVirusNaturalHostBuilder enterEmVirusNaturalHost() {
        return new MmCifCategoryBuilder.EmVirusNaturalHostBuilder(this);
    }

    public MmCifCategoryBuilder.EmVirusSyntheticBuilder enterEmVirusSynthetic() {
        return new MmCifCategoryBuilder.EmVirusSyntheticBuilder(this);
    }

    public MmCifCategoryBuilder.EmVirusShellBuilder enterEmVirusShell() {
        return new MmCifCategoryBuilder.EmVirusShellBuilder(this);
    }

    public MmCifCategoryBuilder.EmSpecimenBuilder enterEmSpecimen() {
        return new MmCifCategoryBuilder.EmSpecimenBuilder(this);
    }

    public MmCifCategoryBuilder.EmEmbeddingBuilder enterEmEmbedding() {
        return new MmCifCategoryBuilder.EmEmbeddingBuilder(this);
    }

    public MmCifCategoryBuilder.EmFiducialMarkersBuilder enterEmFiducialMarkers() {
        return new MmCifCategoryBuilder.EmFiducialMarkersBuilder(this);
    }

    public MmCifCategoryBuilder.EmFocusedIonBeamBuilder enterEmFocusedIonBeam() {
        return new MmCifCategoryBuilder.EmFocusedIonBeamBuilder(this);
    }

    public MmCifCategoryBuilder.EmGridPretreatmentBuilder enterEmGridPretreatment() {
        return new MmCifCategoryBuilder.EmGridPretreatmentBuilder(this);
    }

    public MmCifCategoryBuilder.EmUltramicrotomyBuilder enterEmUltramicrotomy() {
        return new MmCifCategoryBuilder.EmUltramicrotomyBuilder(this);
    }

    public MmCifCategoryBuilder.EmHighPressureFreezingBuilder enterEmHighPressureFreezing() {
        return new MmCifCategoryBuilder.EmHighPressureFreezingBuilder(this);
    }

    public MmCifCategoryBuilder.EmShadowingBuilder enterEmShadowing() {
        return new MmCifCategoryBuilder.EmShadowingBuilder(this);
    }

    public MmCifCategoryBuilder.EmTomographySpecimenBuilder enterEmTomographySpecimen() {
        return new MmCifCategoryBuilder.EmTomographySpecimenBuilder(this);
    }

    public MmCifCategoryBuilder.EmCrystalFormationBuilder enterEmCrystalFormation() {
        return new MmCifCategoryBuilder.EmCrystalFormationBuilder(this);
    }

    public MmCifCategoryBuilder.EmStainingBuilder enterEmStaining() {
        return new MmCifCategoryBuilder.EmStainingBuilder(this);
    }

    public MmCifCategoryBuilder.EmSupportFilmBuilder enterEmSupportFilm() {
        return new MmCifCategoryBuilder.EmSupportFilmBuilder(this);
    }

    public MmCifCategoryBuilder.EmBufferComponentBuilder enterEmBufferComponent() {
        return new MmCifCategoryBuilder.EmBufferComponentBuilder(this);
    }

    public MmCifCategoryBuilder.EmDiffractionBuilder enterEmDiffraction() {
        return new MmCifCategoryBuilder.EmDiffractionBuilder(this);
    }

    public MmCifCategoryBuilder.EmDiffractionShellBuilder enterEmDiffractionShell() {
        return new MmCifCategoryBuilder.EmDiffractionShellBuilder(this);
    }

    public MmCifCategoryBuilder.EmDiffractionStatsBuilder enterEmDiffractionStats() {
        return new MmCifCategoryBuilder.EmDiffractionStatsBuilder(this);
    }

    public MmCifCategoryBuilder.EmTomographyBuilder enterEmTomography() {
        return new MmCifCategoryBuilder.EmTomographyBuilder(this);
    }

    public MmCifCategoryBuilder.EmImageRecordingBuilder enterEmImageRecording() {
        return new MmCifCategoryBuilder.EmImageRecordingBuilder(this);
    }

    public MmCifCategoryBuilder.EmImagingOpticsBuilder enterEmImagingOptics() {
        return new MmCifCategoryBuilder.EmImagingOpticsBuilder(this);
    }

    public MmCifCategoryBuilder.EmFinalClassificationBuilder enterEmFinalClassification() {
        return new MmCifCategoryBuilder.EmFinalClassificationBuilder(this);
    }

    public MmCifCategoryBuilder.EmStartModelBuilder enterEmStartModel() {
        return new MmCifCategoryBuilder.EmStartModelBuilder(this);
    }

    public MmCifCategoryBuilder.EmSoftwareBuilder enterEmSoftware() {
        return new MmCifCategoryBuilder.EmSoftwareBuilder(this);
    }

    public MmCifCategoryBuilder.EmEulerAngleAssignmentBuilder enterEmEulerAngleAssignment() {
        return new MmCifCategoryBuilder.EmEulerAngleAssignmentBuilder(this);
    }

    public MmCifCategoryBuilder.EmCtfCorrectionBuilder enterEmCtfCorrection() {
        return new MmCifCategoryBuilder.EmCtfCorrectionBuilder(this);
    }

    public MmCifCategoryBuilder.EmVolumeSelectionBuilder enterEmVolumeSelection() {
        return new MmCifCategoryBuilder.EmVolumeSelectionBuilder(this);
    }

    public MmCifCategoryBuilder.Em3dCrystalEntityBuilder enterEm3dCrystalEntity() {
        return new MmCifCategoryBuilder.Em3dCrystalEntityBuilder(this);
    }

    public MmCifCategoryBuilder.Em2dCrystalEntityBuilder enterEm2dCrystalEntity() {
        return new MmCifCategoryBuilder.Em2dCrystalEntityBuilder(this);
    }

    public MmCifCategoryBuilder.EmImageProcessingBuilder enterEmImageProcessing() {
        return new MmCifCategoryBuilder.EmImageProcessingBuilder(this);
    }

    public MmCifCategoryBuilder.EmParticleSelectionBuilder enterEmParticleSelection() {
        return new MmCifCategoryBuilder.EmParticleSelectionBuilder(this);
    }

    public MmCifCategoryBuilder.EmMapBuilder enterEmMap() {
        return new MmCifCategoryBuilder.EmMapBuilder(this);
    }

    public MmCifCategoryBuilder.EmFscCurveBuilder enterEmFscCurve() {
        return new MmCifCategoryBuilder.EmFscCurveBuilder(this);
    }

    public MmCifCategoryBuilder.EmInterpretFigureBuilder enterEmInterpretFigure() {
        return new MmCifCategoryBuilder.EmInterpretFigureBuilder(this);
    }

    public MmCifCategoryBuilder.EmLayerLinesBuilder enterEmLayerLines() {
        return new MmCifCategoryBuilder.EmLayerLinesBuilder(this);
    }

    public MmCifCategoryBuilder.EmStructureFactorsBuilder enterEmStructureFactors() {
        return new MmCifCategoryBuilder.EmStructureFactorsBuilder(this);
    }

    public MmCifCategoryBuilder.EmDepositorInfoBuilder enterEmDepositorInfo() {
        return new MmCifCategoryBuilder.EmDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.EmMapDepositorInfoBuilder enterEmMapDepositorInfo() {
        return new MmCifCategoryBuilder.EmMapDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.EmMaskDepositorInfoBuilder enterEmMaskDepositorInfo() {
        return new MmCifCategoryBuilder.EmMaskDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.EmFigureDepositorInfoBuilder enterEmFigureDepositorInfo() {
        return new MmCifCategoryBuilder.EmFigureDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.EmLayerLinesDepositorInfoBuilder enterEmLayerLinesDepositorInfo() {
        return new MmCifCategoryBuilder.EmLayerLinesDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.EmStructureFactorsDepositorInfoBuilder enterEmStructureFactorsDepositorInfo() {
        return new MmCifCategoryBuilder.EmStructureFactorsDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSeqMapDepositorInfoBuilder enterPdbxSeqMapDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxSeqMapDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompDepositorInfoBuilder enterPdbxChemCompDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxChemCompDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqDepositorInfoBuilder enterPdbxStructRefSeqDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructRefSeqDifDepositorInfoBuilder enterPdbxStructRefSeqDifDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructRefSeqDifDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyPropDepositorInfoBuilder enterPdbxStructAssemblyPropDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyPropDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyDepositorInfoBuilder enterPdbxStructAssemblyDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyGenDepositorInfoBuilder enterPdbxStructAssemblyGenDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyGenDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructOperListDepositorInfoBuilder enterPdbxStructOperListDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructOperListDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPointSymmetryDepositorInfoBuilder enterPdbxPointSymmetryDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxPointSymmetryDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxHelicalSymmetryDepositorInfoBuilder enterPdbxHelicalSymmetryDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxHelicalSymmetryDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyAuthEvidenceDepositorInfoBuilder enterPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyAuthEvidenceDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSolventAtomSiteMappingBuilder enterPdbxSolventAtomSiteMapping() {
        return new MmCifCategoryBuilder.PdbxSolventAtomSiteMappingBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMoleculeFeaturesDepositorInfoBuilder enterPdbxMoleculeFeaturesDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxMoleculeFeaturesDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompInstanceDepositorInfoBuilder enterPdbxChemCompInstanceDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxChemCompInstanceDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiStatusFlagsBuilder enterPdbxDepuiStatusFlags() {
        return new MmCifCategoryBuilder.PdbxDepuiStatusFlagsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiUploadBuilder enterPdbxDepuiUpload() {
        return new MmCifCategoryBuilder.PdbxDepuiUploadBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiValidationStatusFlagsBuilder enterPdbxDepuiValidationStatusFlags() {
        return new MmCifCategoryBuilder.PdbxDepuiValidationStatusFlagsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompUploadDepositorInfoBuilder enterPdbxChemCompUploadDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxChemCompUploadDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiEntityStatusFlagsBuilder enterPdbxDepuiEntityStatusFlags() {
        return new MmCifCategoryBuilder.PdbxDepuiEntityStatusFlagsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiEntityFeaturesBuilder enterPdbxDepuiEntityFeatures() {
        return new MmCifCategoryBuilder.PdbxDepuiEntityFeaturesBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepositionMessageInfoBuilder enterPdbxDepositionMessageInfo() {
        return new MmCifCategoryBuilder.PdbxDepositionMessageInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepositionMessageFileReferenceBuilder enterPdbxDepositionMessageFileReference() {
        return new MmCifCategoryBuilder.PdbxDepositionMessageFileReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepuiEntryDetailsBuilder enterPdbxDepuiEntryDetails() {
        return new MmCifCategoryBuilder.PdbxDepuiEntryDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDataProcessingStatusBuilder enterPdbxDataProcessingStatus() {
        return new MmCifCategoryBuilder.PdbxDataProcessingStatusBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityInstanceFeatureBuilder enterPdbxEntityInstanceFeature() {
        return new MmCifCategoryBuilder.PdbxEntityInstanceFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntitySrcGenDepositorInfoBuilder enterPdbxEntitySrcGenDepositorInfo() {
        return new MmCifCategoryBuilder.PdbxEntitySrcGenDepositorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelBuilder enterPdbxChemCompModel() {
        return new MmCifCategoryBuilder.PdbxChemCompModelBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelAtomBuilder enterPdbxChemCompModelAtom() {
        return new MmCifCategoryBuilder.PdbxChemCompModelAtomBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelBondBuilder enterPdbxChemCompModelBond() {
        return new MmCifCategoryBuilder.PdbxChemCompModelBondBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelFeatureBuilder enterPdbxChemCompModelFeature() {
        return new MmCifCategoryBuilder.PdbxChemCompModelFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelDescriptorBuilder enterPdbxChemCompModelDescriptor() {
        return new MmCifCategoryBuilder.PdbxChemCompModelDescriptorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelAuditBuilder enterPdbxChemCompModelAudit() {
        return new MmCifCategoryBuilder.PdbxChemCompModelAuditBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompModelReferenceBuilder enterPdbxChemCompModelReference() {
        return new MmCifCategoryBuilder.PdbxChemCompModelReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxViewCategoryGroupBuilder enterPdbxViewCategoryGroup() {
        return new MmCifCategoryBuilder.PdbxViewCategoryGroupBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxViewCategoryBuilder enterPdbxViewCategory() {
        return new MmCifCategoryBuilder.PdbxViewCategoryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxViewItemBuilder enterPdbxViewItem() {
        return new MmCifCategoryBuilder.PdbxViewItemBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxCoordBuilder enterPdbxCoord() {
        return new MmCifCategoryBuilder.PdbxCoordBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConnectBuilder enterPdbxConnect() {
        return new MmCifCategoryBuilder.PdbxConnectBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConnectTypeBuilder enterPdbxConnectType() {
        return new MmCifCategoryBuilder.PdbxConnectTypeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConnectModificationBuilder enterPdbxConnectModification() {
        return new MmCifCategoryBuilder.PdbxConnectModificationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxConnectAtomBuilder enterPdbxConnectAtom() {
        return new MmCifCategoryBuilder.PdbxConnectAtomBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabasePDBMasterBuilder enterPdbxDatabasePDBMaster() {
        return new MmCifCategoryBuilder.PdbxDatabasePDBMasterBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabasePdbOmitBuilder enterPdbxDatabasePdbOmit() {
        return new MmCifCategoryBuilder.PdbxDatabasePdbOmitBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDbrefBuilder enterPdbxDbref() {
        return new MmCifCategoryBuilder.PdbxDbrefBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDrugInfoBuilder enterPdbxDrugInfo() {
        return new MmCifCategoryBuilder.PdbxDrugInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxInhibitorInfoBuilder enterPdbxInhibitorInfo() {
        return new MmCifCategoryBuilder.PdbxInhibitorInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxIonInfoBuilder enterPdbxIonInfo() {
        return new MmCifCategoryBuilder.PdbxIonInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxHybridBuilder enterPdbxHybrid() {
        return new MmCifCategoryBuilder.PdbxHybridBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNaStrandInfoBuilder enterPdbxNaStrandInfo() {
        return new MmCifCategoryBuilder.PdbxNaStrandInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNonstandardListBuilder enterPdbxNonstandardList() {
        return new MmCifCategoryBuilder.PdbxNonstandardListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPdbCompndBuilder enterPdbxPdbCompnd() {
        return new MmCifCategoryBuilder.PdbxPdbCompndBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPdbSourceBuilder enterPdbxPdbSource() {
        return new MmCifCategoryBuilder.PdbxPdbSourceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxProteinInfoBuilder enterPdbxProteinInfo() {
        return new MmCifCategoryBuilder.PdbxProteinInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSolventInfoBuilder enterPdbxSolventInfo() {
        return new MmCifCategoryBuilder.PdbxSolventInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSourceBuilder enterPdbxSource() {
        return new MmCifCategoryBuilder.PdbxSourceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructBiolFuncBuilder enterPdbxStructBiolFunc() {
        return new MmCifCategoryBuilder.PdbxStructBiolFuncBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructPackGenBuilder enterPdbxStructPackGen() {
        return new MmCifCategoryBuilder.PdbxStructPackGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxTrnaInfoBuilder enterPdbxTrnaInfo() {
        return new MmCifCategoryBuilder.PdbxTrnaInfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxUnpairBuilder enterPdbxUnpair() {
        return new MmCifCategoryBuilder.PdbxUnpairBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRefineLsRestrNcsBuilder enterPdbxRefineLsRestrNcs() {
        return new MmCifCategoryBuilder.PdbxRefineLsRestrNcsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructNcsVirusGenBuilder enterPdbxStructNcsVirusGen() {
        return new MmCifCategoryBuilder.PdbxStructNcsVirusGenBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSequenceAnnotationBuilder enterPdbxSequenceAnnotation() {
        return new MmCifCategoryBuilder.PdbxSequenceAnnotationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPostProcessDetailsBuilder enterPdbxPostProcessDetails() {
        return new MmCifCategoryBuilder.PdbxPostProcessDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxPostProcessStatusBuilder enterPdbxPostProcessStatus() {
        return new MmCifCategoryBuilder.PdbxPostProcessStatusBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructLinkBuilder enterPdbxStructLink() {
        return new MmCifCategoryBuilder.PdbxStructLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMissingResidueListBuilder enterPdbxMissingResidueList() {
        return new MmCifCategoryBuilder.PdbxMissingResidueListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDataProcessingCellBuilder enterPdbxDataProcessingCell() {
        return new MmCifCategoryBuilder.PdbxDataProcessingCellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDataProcessingReflnsBuilder enterPdbxDataProcessingReflns() {
        return new MmCifCategoryBuilder.PdbxDataProcessingReflnsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDataProcessingDetectorBuilder enterPdbxDataProcessingDetector() {
        return new MmCifCategoryBuilder.PdbxDataProcessingDetectorBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompNonstandardBuilder enterPdbxChemCompNonstandard() {
        return new MmCifCategoryBuilder.PdbxChemCompNonstandardBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityPolyProteinClassBuilder enterPdbxEntityPolyProteinClass() {
        return new MmCifCategoryBuilder.PdbxEntityPolyProteinClassBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityNameTaxonomyTreeBuilder enterPdbxEntityNameTaxonomyTree() {
        return new MmCifCategoryBuilder.PdbxEntityNameTaxonomyTreeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityNameTaxonomyBuilder enterPdbxEntityNameTaxonomy() {
        return new MmCifCategoryBuilder.PdbxEntityNameTaxonomyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityNameInstanceBuilder enterPdbxEntityNameInstance() {
        return new MmCifCategoryBuilder.PdbxEntityNameInstanceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxTableinfoBuilder enterPdbxTableinfo() {
        return new MmCifCategoryBuilder.PdbxTableinfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxColumninfoBuilder enterPdbxColumninfo() {
        return new MmCifCategoryBuilder.PdbxColumninfoBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValAngleBuilder enterPdbxValAngle() {
        return new MmCifCategoryBuilder.PdbxValAngleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValBondBuilder enterPdbxValBond() {
        return new MmCifCategoryBuilder.PdbxValBondBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValContactBuilder enterPdbxValContact() {
        return new MmCifCategoryBuilder.PdbxValContactBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValSymContactBuilder enterPdbxValSymContact() {
        return new MmCifCategoryBuilder.PdbxValSymContactBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRmchOutlierBuilder enterPdbxRmchOutlier() {
        return new MmCifCategoryBuilder.PdbxRmchOutlierBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMissingAtomPolyBuilder enterPdbxMissingAtomPoly() {
        return new MmCifCategoryBuilder.PdbxMissingAtomPolyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxMissingAtomNonpolyBuilder enterPdbxMissingAtomNonpoly() {
        return new MmCifCategoryBuilder.PdbxMissingAtomNonpolyBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxValChiralBuilder enterPdbxValChiral() {
        return new MmCifCategoryBuilder.PdbxValChiralBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAtlasBuilder enterPdbxAtlas() {
        return new MmCifCategoryBuilder.PdbxAtlasBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSummaryFlagsBuilder enterPdbxSummaryFlags() {
        return new MmCifCategoryBuilder.PdbxSummaryFlagsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityFuncBindModeBuilder enterPdbxEntityFuncBindMode() {
        return new MmCifCategoryBuilder.PdbxEntityFuncBindModeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityFuncEnzymeBuilder enterPdbxEntityFuncEnzyme() {
        return new MmCifCategoryBuilder.PdbxEntityFuncEnzymeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityFuncRegulatoryBuilder enterPdbxEntityFuncRegulatory() {
        return new MmCifCategoryBuilder.PdbxEntityFuncRegulatoryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityFuncStructuralBuilder enterPdbxEntityFuncStructural() {
        return new MmCifCategoryBuilder.PdbxEntityFuncStructuralBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityFuncOtherBuilder enterPdbxEntityFuncOther() {
        return new MmCifCategoryBuilder.PdbxEntityFuncOtherBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityPolyDomainBuilder enterPdbxEntityPolyDomain() {
        return new MmCifCategoryBuilder.PdbxEntityPolyDomainBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNaStructKeywdsBuilder enterPdbxNaStructKeywds() {
        return new MmCifCategoryBuilder.PdbxNaStructKeywdsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityPolyNaTypeBuilder enterPdbxEntityPolyNaType() {
        return new MmCifCategoryBuilder.PdbxEntityPolyNaTypeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityPolyNaNonstandardBuilder enterPdbxEntityPolyNaNonstandard() {
        return new MmCifCategoryBuilder.PdbxEntityPolyNaNonstandardBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxVirtualAngleBuilder enterPdbxVirtualAngle() {
        return new MmCifCategoryBuilder.PdbxVirtualAngleBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxVirtualBondBuilder enterPdbxVirtualBond() {
        return new MmCifCategoryBuilder.PdbxVirtualBondBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxVirtualTorsionBuilder enterPdbxVirtualTorsion() {
        return new MmCifCategoryBuilder.PdbxVirtualTorsionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSequencePatternBuilder enterPdbxSequencePattern() {
        return new MmCifCategoryBuilder.PdbxSequencePatternBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStereochemistryBuilder enterPdbxStereochemistry() {
        return new MmCifCategoryBuilder.PdbxStereochemistryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRmsDevsCovalentBuilder enterPdbxRmsDevsCovalent() {
        return new MmCifCategoryBuilder.PdbxRmsDevsCovalentBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxRmsDevsCovByMonomerBuilder enterPdbxRmsDevsCovByMonomer() {
        return new MmCifCategoryBuilder.PdbxRmsDevsCovByMonomerBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSugarPhosphateGeometryBuilder enterPdbxSugarPhosphateGeometry() {
        return new MmCifCategoryBuilder.PdbxSugarPhosphateGeometryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxNmrComputingBuilder enterPdbxNmrComputing() {
        return new MmCifCategoryBuilder.PdbxNmrComputingBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditConformExtensionBuilder enterPdbxAuditConformExtension() {
        return new MmCifCategoryBuilder.PdbxAuditConformExtensionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccMapmanBuilder enterPdbxDccMapman() {
        return new MmCifCategoryBuilder.PdbxDccMapmanBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccRsccMapmanBuilder enterPdbxDccRsccMapman() {
        return new MmCifCategoryBuilder.PdbxDccRsccMapmanBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccRsccMapmanOverallBuilder enterPdbxDccRsccMapmanOverall() {
        return new MmCifCategoryBuilder.PdbxDccRsccMapmanOverallBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccDensityBuilder enterPdbxDccDensity() {
        return new MmCifCategoryBuilder.PdbxDccDensityBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccGeometryBuilder enterPdbxDccGeometry() {
        return new MmCifCategoryBuilder.PdbxDccGeometryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccDensityCorrBuilder enterPdbxDccDensityCorr() {
        return new MmCifCategoryBuilder.PdbxDccDensityCorrBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDccMapBuilder enterPdbxDccMap() {
        return new MmCifCategoryBuilder.PdbxDccMapBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepositGroupBuilder enterPdbxDepositGroup() {
        return new MmCifCategoryBuilder.PdbxDepositGroupBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDepositGroupIndexBuilder enterPdbxDepositGroupIndex() {
        return new MmCifCategoryBuilder.PdbxDepositGroupIndexBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyAuthEvidenceBuilder enterPdbxStructAssemblyAuthEvidence() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyAuthEvidenceBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxStructAssemblyAuthClassificationBuilder enterPdbxStructAssemblyAuthClassification() {
        return new MmCifCategoryBuilder.PdbxStructAssemblyAuthClassificationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxCrystalAlignmentBuilder enterPdbxCrystalAlignment() {
        return new MmCifCategoryBuilder.PdbxCrystalAlignmentBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditRevisionHistoryBuilder enterPdbxAuditRevisionHistory() {
        return new MmCifCategoryBuilder.PdbxAuditRevisionHistoryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditRevisionGroupBuilder enterPdbxAuditRevisionGroup() {
        return new MmCifCategoryBuilder.PdbxAuditRevisionGroupBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditRevisionCategoryBuilder enterPdbxAuditRevisionCategory() {
        return new MmCifCategoryBuilder.PdbxAuditRevisionCategoryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditRevisionDetailsBuilder enterPdbxAuditRevisionDetails() {
        return new MmCifCategoryBuilder.PdbxAuditRevisionDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditRevisionItemBuilder enterPdbxAuditRevisionItem() {
        return new MmCifCategoryBuilder.PdbxAuditRevisionItemBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSupportingExpDataSetBuilder enterPdbxSupportingExpDataSet() {
        return new MmCifCategoryBuilder.PdbxSupportingExpDataSetBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDatabaseDoiBuilder enterPdbxDatabaseDoi() {
        return new MmCifCategoryBuilder.PdbxDatabaseDoiBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditConformBuilder enterPdbxAuditConform() {
        return new MmCifCategoryBuilder.PdbxAuditConformBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSerialCrystallographyMeasurementBuilder enterPdbxSerialCrystallographyMeasurement() {
        return new MmCifCategoryBuilder.PdbxSerialCrystallographyMeasurementBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryBuilder enterPdbxSerialCrystallographySampleDelivery() {
        return new MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryInjectionBuilder enterPdbxSerialCrystallographySampleDeliveryInjection() {
        return new MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryInjectionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryFixedTargetBuilder enterPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return new MmCifCategoryBuilder.PdbxSerialCrystallographySampleDeliveryFixedTargetBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSerialCrystallographyDataReductionBuilder enterPdbxSerialCrystallographyDataReduction() {
        return new MmCifCategoryBuilder.PdbxSerialCrystallographyDataReductionBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxAuditSupportBuilder enterPdbxAuditSupport() {
        return new MmCifCategoryBuilder.PdbxAuditSupportBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityBranchListBuilder enterPdbxEntityBranchList() {
        return new MmCifCategoryBuilder.PdbxEntityBranchListBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityBranchLinkBuilder enterPdbxEntityBranchLink() {
        return new MmCifCategoryBuilder.PdbxEntityBranchLinkBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityBranchBuilder enterPdbxEntityBranch() {
        return new MmCifCategoryBuilder.PdbxEntityBranchBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxBranchSchemeBuilder enterPdbxBranchScheme() {
        return new MmCifCategoryBuilder.PdbxBranchSchemeBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompRelatedBuilder enterPdbxChemCompRelated() {
        return new MmCifCategoryBuilder.PdbxChemCompRelatedBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompAtomRelatedBuilder enterPdbxChemCompAtomRelated() {
        return new MmCifCategoryBuilder.PdbxChemCompAtomRelatedBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxReflnSignalBinningBuilder enterPdbxReflnSignalBinning() {
        return new MmCifCategoryBuilder.PdbxReflnSignalBinningBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSiftsXrefDbBuilder enterPdbxSiftsXrefDb() {
        return new MmCifCategoryBuilder.PdbxSiftsXrefDbBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSiftsXrefDbSegmentsBuilder enterPdbxSiftsXrefDbSegments() {
        return new MmCifCategoryBuilder.PdbxSiftsXrefDbSegmentsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxSiftsUnpSegmentsBuilder enterPdbxSiftsUnpSegments() {
        return new MmCifCategoryBuilder.PdbxSiftsUnpSegmentsBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDataUsageBuilder enterPdbxDataUsage() {
        return new MmCifCategoryBuilder.PdbxDataUsageBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxEntityRemappingBuilder enterPdbxEntityRemapping() {
        return new MmCifCategoryBuilder.PdbxEntityRemappingBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChainRemappingBuilder enterPdbxChainRemapping() {
        return new MmCifCategoryBuilder.PdbxChainRemappingBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxInitialRefinementModelBuilder enterPdbxInitialRefinementModel() {
        return new MmCifCategoryBuilder.PdbxInitialRefinementModelBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxInvestigationBuilder enterPdbxInvestigation() {
        return new MmCifCategoryBuilder.PdbxInvestigationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxChemCompPcmBuilder enterPdbxChemCompPcm() {
        return new MmCifCategoryBuilder.PdbxChemCompPcmBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxModificationFeatureBuilder enterPdbxModificationFeature() {
        return new MmCifCategoryBuilder.PdbxModificationFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnBatchBuilder enterPdbxDiffrnBatch() {
        return new MmCifCategoryBuilder.PdbxDiffrnBatchBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnCellBuilder enterPdbxDiffrnCell() {
        return new MmCifCategoryBuilder.PdbxDiffrnCellBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnOrientationBuilder enterPdbxDiffrnOrientation() {
        return new MmCifCategoryBuilder.PdbxDiffrnOrientationBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnBatchScanBuilder enterPdbxDiffrnBatchScan() {
        return new MmCifCategoryBuilder.PdbxDiffrnBatchScanBuilder(this);
    }

    public MmCifCategoryBuilder.PdbxDiffrnDetectorPanelMappingBuilder enterPdbxDiffrnDetectorPanelMapping() {
        return new MmCifCategoryBuilder.PdbxDiffrnDetectorPanelMappingBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScanBuilder enterDiffrnScan() {
        return new MmCifCategoryBuilder.DiffrnScanBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScanAxisBuilder enterDiffrnScanAxis() {
        return new MmCifCategoryBuilder.DiffrnScanAxisBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScanCollectionBuilder enterDiffrnScanCollection() {
        return new MmCifCategoryBuilder.DiffrnScanCollectionBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScanFrameBuilder enterDiffrnScanFrame() {
        return new MmCifCategoryBuilder.DiffrnScanFrameBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnScanFrameAxisBuilder enterDiffrnScanFrameAxis() {
        return new MmCifCategoryBuilder.DiffrnScanFrameAxisBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayIntensitiesBuilder enterArrayIntensities() {
        return new MmCifCategoryBuilder.ArrayIntensitiesBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayStructureBuilder enterArrayStructure() {
        return new MmCifCategoryBuilder.ArrayStructureBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayDataBuilder enterArrayData() {
        return new MmCifCategoryBuilder.ArrayDataBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayStructureListBuilder enterArrayStructureList() {
        return new MmCifCategoryBuilder.ArrayStructureListBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayStructureListAxisBuilder enterArrayStructureListAxis() {
        return new MmCifCategoryBuilder.ArrayStructureListAxisBuilder(this);
    }

    public MmCifCategoryBuilder.ArrayStructureListSectionBuilder enterArrayStructureListSection() {
        return new MmCifCategoryBuilder.ArrayStructureListSectionBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnDataFrameBuilder enterDiffrnDataFrame() {
        return new MmCifCategoryBuilder.DiffrnDataFrameBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnDetectorAxisBuilder enterDiffrnDetectorAxis() {
        return new MmCifCategoryBuilder.DiffrnDetectorAxisBuilder(this);
    }

    public MmCifCategoryBuilder.DiffrnDetectorElementBuilder enterDiffrnDetectorElement() {
        return new MmCifCategoryBuilder.DiffrnDetectorElementBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEntityPolySegmentBuilder enterIhmEntityPolySegment() {
        return new MmCifCategoryBuilder.IhmEntityPolySegmentBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStartingModelDetailsBuilder enterIhmStartingModelDetails() {
        return new MmCifCategoryBuilder.IhmStartingModelDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStartingComparativeModelsBuilder enterIhmStartingComparativeModels() {
        return new MmCifCategoryBuilder.IhmStartingComparativeModelsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStartingComputationalModelsBuilder enterIhmStartingComputationalModels() {
        return new MmCifCategoryBuilder.IhmStartingComputationalModelsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStartingModelSeqDifBuilder enterIhmStartingModelSeqDif() {
        return new MmCifCategoryBuilder.IhmStartingModelSeqDifBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelRepresentationBuilder enterIhmModelRepresentation() {
        return new MmCifCategoryBuilder.IhmModelRepresentationBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelRepresentationDetailsBuilder enterIhmModelRepresentationDetails() {
        return new MmCifCategoryBuilder.IhmModelRepresentationDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStructAssemblyDetailsBuilder enterIhmStructAssemblyDetails() {
        return new MmCifCategoryBuilder.IhmStructAssemblyDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStructAssemblyBuilder enterIhmStructAssembly() {
        return new MmCifCategoryBuilder.IhmStructAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStructAssemblyClassBuilder enterIhmStructAssemblyClass() {
        return new MmCifCategoryBuilder.IhmStructAssemblyClassBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStructAssemblyClassLinkBuilder enterIhmStructAssemblyClassLink() {
        return new MmCifCategoryBuilder.IhmStructAssemblyClassLinkBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelingProtocolBuilder enterIhmModelingProtocol() {
        return new MmCifCategoryBuilder.IhmModelingProtocolBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelingProtocolDetailsBuilder enterIhmModelingProtocolDetails() {
        return new MmCifCategoryBuilder.IhmModelingProtocolDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmMultiStateModelingBuilder enterIhmMultiStateModeling() {
        return new MmCifCategoryBuilder.IhmMultiStateModelingBuilder(this);
    }

    public MmCifCategoryBuilder.IhmMultiStateModelGroupLinkBuilder enterIhmMultiStateModelGroupLink() {
        return new MmCifCategoryBuilder.IhmMultiStateModelGroupLinkBuilder(this);
    }

    public MmCifCategoryBuilder.IhmOrderedEnsembleBuilder enterIhmOrderedEnsemble() {
        return new MmCifCategoryBuilder.IhmOrderedEnsembleBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelingPostProcessBuilder enterIhmModelingPostProcess() {
        return new MmCifCategoryBuilder.IhmModelingPostProcessBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEnsembleInfoBuilder enterIhmEnsembleInfo() {
        return new MmCifCategoryBuilder.IhmEnsembleInfoBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEnsembleSubSampleBuilder enterIhmEnsembleSubSample() {
        return new MmCifCategoryBuilder.IhmEnsembleSubSampleBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelListBuilder enterIhmModelList() {
        return new MmCifCategoryBuilder.IhmModelListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelGroupBuilder enterIhmModelGroup() {
        return new MmCifCategoryBuilder.IhmModelGroupBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelGroupLinkBuilder enterIhmModelGroupLink() {
        return new MmCifCategoryBuilder.IhmModelGroupLinkBuilder(this);
    }

    public MmCifCategoryBuilder.IhmModelRepresentativeBuilder enterIhmModelRepresentative() {
        return new MmCifCategoryBuilder.IhmModelRepresentativeBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDatasetListBuilder enterIhmDatasetList() {
        return new MmCifCategoryBuilder.IhmDatasetListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDatasetGroupBuilder enterIhmDatasetGroup() {
        return new MmCifCategoryBuilder.IhmDatasetGroupBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDatasetGroupLinkBuilder enterIhmDatasetGroupLink() {
        return new MmCifCategoryBuilder.IhmDatasetGroupLinkBuilder(this);
    }

    public MmCifCategoryBuilder.IhmRelatedDatasetsBuilder enterIhmRelatedDatasets() {
        return new MmCifCategoryBuilder.IhmRelatedDatasetsBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDataTransformationBuilder enterIhmDataTransformation() {
        return new MmCifCategoryBuilder.IhmDataTransformationBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDatasetRelatedDbReferenceBuilder enterIhmDatasetRelatedDbReference() {
        return new MmCifCategoryBuilder.IhmDatasetRelatedDbReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.IhmExternalReferenceInfoBuilder enterIhmExternalReferenceInfo() {
        return new MmCifCategoryBuilder.IhmExternalReferenceInfoBuilder(this);
    }

    public MmCifCategoryBuilder.IhmExternalFilesBuilder enterIhmExternalFiles() {
        return new MmCifCategoryBuilder.IhmExternalFilesBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDatasetExternalReferenceBuilder enterIhmDatasetExternalReference() {
        return new MmCifCategoryBuilder.IhmDatasetExternalReferenceBuilder(this);
    }

    public MmCifCategoryBuilder.IhmLocalizationDensityFilesBuilder enterIhmLocalizationDensityFiles() {
        return new MmCifCategoryBuilder.IhmLocalizationDensityFilesBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPredictedContactRestraintBuilder enterIhmPredictedContactRestraint() {
        return new MmCifCategoryBuilder.IhmPredictedContactRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmHydroxylRadicalFpRestraintBuilder enterIhmHydroxylRadicalFpRestraint() {
        return new MmCifCategoryBuilder.IhmHydroxylRadicalFpRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmChemicalComponentDescriptorBuilder enterIhmChemicalComponentDescriptor() {
        return new MmCifCategoryBuilder.IhmChemicalComponentDescriptorBuilder(this);
    }

    public MmCifCategoryBuilder.IhmProbeListBuilder enterIhmProbeList() {
        return new MmCifCategoryBuilder.IhmProbeListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPolyProbePositionBuilder enterIhmPolyProbePosition() {
        return new MmCifCategoryBuilder.IhmPolyProbePositionBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPolyProbeConjugateBuilder enterIhmPolyProbeConjugate() {
        return new MmCifCategoryBuilder.IhmPolyProbeConjugateBuilder(this);
    }

    public MmCifCategoryBuilder.IhmLigandProbeBuilder enterIhmLigandProbe() {
        return new MmCifCategoryBuilder.IhmLigandProbeBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEprRestraintBuilder enterIhmEprRestraint() {
        return new MmCifCategoryBuilder.IhmEprRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmCrossLinkListBuilder enterIhmCrossLinkList() {
        return new MmCifCategoryBuilder.IhmCrossLinkListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmCrossLinkRestraintBuilder enterIhmCrossLinkRestraint() {
        return new MmCifCategoryBuilder.IhmCrossLinkRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmCrossLinkPseudoSiteBuilder enterIhmCrossLinkPseudoSite() {
        return new MmCifCategoryBuilder.IhmCrossLinkPseudoSiteBuilder(this);
    }

    public MmCifCategoryBuilder.IhmCrossLinkResultBuilder enterIhmCrossLinkResult() {
        return new MmCifCategoryBuilder.IhmCrossLinkResultBuilder(this);
    }

    public MmCifCategoryBuilder.IhmCrossLinkResultParametersBuilder enterIhmCrossLinkResultParameters() {
        return new MmCifCategoryBuilder.IhmCrossLinkResultParametersBuilder(this);
    }

    public MmCifCategoryBuilder.Ihm2demClassAverageRestraintBuilder enterIhm2demClassAverageRestraint() {
        return new MmCifCategoryBuilder.Ihm2demClassAverageRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.Ihm2demClassAverageFittingBuilder enterIhm2demClassAverageFitting() {
        return new MmCifCategoryBuilder.Ihm2demClassAverageFittingBuilder(this);
    }

    public MmCifCategoryBuilder.Ihm3demRestraintBuilder enterIhm3demRestraint() {
        return new MmCifCategoryBuilder.Ihm3demRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmSasRestraintBuilder enterIhmSasRestraint() {
        return new MmCifCategoryBuilder.IhmSasRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmHdxRestraintBuilder enterIhmHdxRestraint() {
        return new MmCifCategoryBuilder.IhmHdxRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmStartingModelCoordBuilder enterIhmStartingModelCoord() {
        return new MmCifCategoryBuilder.IhmStartingModelCoordBuilder(this);
    }

    public MmCifCategoryBuilder.IhmSphereObjSiteBuilder enterIhmSphereObjSite() {
        return new MmCifCategoryBuilder.IhmSphereObjSiteBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGaussianObjSiteBuilder enterIhmGaussianObjSite() {
        return new MmCifCategoryBuilder.IhmGaussianObjSiteBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGaussianObjEnsembleBuilder enterIhmGaussianObjEnsemble() {
        return new MmCifCategoryBuilder.IhmGaussianObjEnsembleBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPseudoSiteBuilder enterIhmPseudoSite() {
        return new MmCifCategoryBuilder.IhmPseudoSiteBuilder(this);
    }

    public MmCifCategoryBuilder.IhmResiduesNotModeledBuilder enterIhmResiduesNotModeled() {
        return new MmCifCategoryBuilder.IhmResiduesNotModeledBuilder(this);
    }

    public MmCifCategoryBuilder.IhmFeatureListBuilder enterIhmFeatureList() {
        return new MmCifCategoryBuilder.IhmFeatureListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPseudoSiteFeatureBuilder enterIhmPseudoSiteFeature() {
        return new MmCifCategoryBuilder.IhmPseudoSiteFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPolyAtomFeatureBuilder enterIhmPolyAtomFeature() {
        return new MmCifCategoryBuilder.IhmPolyAtomFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.IhmPolyResidueFeatureBuilder enterIhmPolyResidueFeature() {
        return new MmCifCategoryBuilder.IhmPolyResidueFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.IhmNonPolyFeatureBuilder enterIhmNonPolyFeature() {
        return new MmCifCategoryBuilder.IhmNonPolyFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.IhmInterfaceResidueFeatureBuilder enterIhmInterfaceResidueFeature() {
        return new MmCifCategoryBuilder.IhmInterfaceResidueFeatureBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDerivedDistanceRestraintBuilder enterIhmDerivedDistanceRestraint() {
        return new MmCifCategoryBuilder.IhmDerivedDistanceRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDerivedAngleRestraintBuilder enterIhmDerivedAngleRestraint() {
        return new MmCifCategoryBuilder.IhmDerivedAngleRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmDerivedDihedralRestraintBuilder enterIhmDerivedDihedralRestraint() {
        return new MmCifCategoryBuilder.IhmDerivedDihedralRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectListBuilder enterIhmGeometricObjectList() {
        return new MmCifCategoryBuilder.IhmGeometricObjectListBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectCenterBuilder enterIhmGeometricObjectCenter() {
        return new MmCifCategoryBuilder.IhmGeometricObjectCenterBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectTransformationBuilder enterIhmGeometricObjectTransformation() {
        return new MmCifCategoryBuilder.IhmGeometricObjectTransformationBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectSphereBuilder enterIhmGeometricObjectSphere() {
        return new MmCifCategoryBuilder.IhmGeometricObjectSphereBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectTorusBuilder enterIhmGeometricObjectTorus() {
        return new MmCifCategoryBuilder.IhmGeometricObjectTorusBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectHalfTorusBuilder enterIhmGeometricObjectHalfTorus() {
        return new MmCifCategoryBuilder.IhmGeometricObjectHalfTorusBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectAxisBuilder enterIhmGeometricObjectAxis() {
        return new MmCifCategoryBuilder.IhmGeometricObjectAxisBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectPlaneBuilder enterIhmGeometricObjectPlane() {
        return new MmCifCategoryBuilder.IhmGeometricObjectPlaneBuilder(this);
    }

    public MmCifCategoryBuilder.IhmGeometricObjectDistanceRestraintBuilder enterIhmGeometricObjectDistanceRestraint() {
        return new MmCifCategoryBuilder.IhmGeometricObjectDistanceRestraintBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEntryCollectionBuilder enterIhmEntryCollection() {
        return new MmCifCategoryBuilder.IhmEntryCollectionBuilder(this);
    }

    public MmCifCategoryBuilder.IhmEntryCollectionMappingBuilder enterIhmEntryCollectionMapping() {
        return new MmCifCategoryBuilder.IhmEntryCollectionMappingBuilder(this);
    }

    public MmCifCategoryBuilder.IhmMultiStateSchemeBuilder enterIhmMultiStateScheme() {
        return new MmCifCategoryBuilder.IhmMultiStateSchemeBuilder(this);
    }

    public MmCifCategoryBuilder.IhmMultiStateSchemeConnectivityBuilder enterIhmMultiStateSchemeConnectivity() {
        return new MmCifCategoryBuilder.IhmMultiStateSchemeConnectivityBuilder(this);
    }

    public MmCifCategoryBuilder.IhmKineticRateBuilder enterIhmKineticRate() {
        return new MmCifCategoryBuilder.IhmKineticRateBuilder(this);
    }

    public MmCifCategoryBuilder.IhmRelaxationTimeBuilder enterIhmRelaxationTime() {
        return new MmCifCategoryBuilder.IhmRelaxationTimeBuilder(this);
    }

    public MmCifCategoryBuilder.IhmRelaxationTimeMultiStateSchemeBuilder enterIhmRelaxationTimeMultiStateScheme() {
        return new MmCifCategoryBuilder.IhmRelaxationTimeMultiStateSchemeBuilder(this);
    }

    public MmCifCategoryBuilder.MaModelListBuilder enterMaModelList() {
        return new MmCifCategoryBuilder.MaModelListBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateDetailsBuilder enterMaTemplateDetails() {
        return new MmCifCategoryBuilder.MaTemplateDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplatePolyBuilder enterMaTemplatePoly() {
        return new MmCifCategoryBuilder.MaTemplatePolyBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateNonPolyBuilder enterMaTemplateNonPoly() {
        return new MmCifCategoryBuilder.MaTemplateNonPolyBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplatePolySegmentBuilder enterMaTemplatePolySegment() {
        return new MmCifCategoryBuilder.MaTemplatePolySegmentBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateRefDbDetailsBuilder enterMaTemplateRefDbDetails() {
        return new MmCifCategoryBuilder.MaTemplateRefDbDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateCustomizedBuilder enterMaTemplateCustomized() {
        return new MmCifCategoryBuilder.MaTemplateCustomizedBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateTransMatrixBuilder enterMaTemplateTransMatrix() {
        return new MmCifCategoryBuilder.MaTemplateTransMatrixBuilder(this);
    }

    public MmCifCategoryBuilder.MaTargetEntityBuilder enterMaTargetEntity() {
        return new MmCifCategoryBuilder.MaTargetEntityBuilder(this);
    }

    public MmCifCategoryBuilder.MaTargetEntityInstanceBuilder enterMaTargetEntityInstance() {
        return new MmCifCategoryBuilder.MaTargetEntityInstanceBuilder(this);
    }

    public MmCifCategoryBuilder.MaTargetRefDbDetailsBuilder enterMaTargetRefDbDetails() {
        return new MmCifCategoryBuilder.MaTargetRefDbDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaTargetTemplatePolyMappingBuilder enterMaTargetTemplatePolyMapping() {
        return new MmCifCategoryBuilder.MaTargetTemplatePolyMappingBuilder(this);
    }

    public MmCifCategoryBuilder.MaStructAssemblyBuilder enterMaStructAssembly() {
        return new MmCifCategoryBuilder.MaStructAssemblyBuilder(this);
    }

    public MmCifCategoryBuilder.MaStructAssemblyDetailsBuilder enterMaStructAssemblyDetails() {
        return new MmCifCategoryBuilder.MaStructAssemblyDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaAlignmentInfoBuilder enterMaAlignmentInfo() {
        return new MmCifCategoryBuilder.MaAlignmentInfoBuilder(this);
    }

    public MmCifCategoryBuilder.MaAlignmentDetailsBuilder enterMaAlignmentDetails() {
        return new MmCifCategoryBuilder.MaAlignmentDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaAlignmentBuilder enterMaAlignment() {
        return new MmCifCategoryBuilder.MaAlignmentBuilder(this);
    }

    public MmCifCategoryBuilder.MaTemplateCoordBuilder enterMaTemplateCoord() {
        return new MmCifCategoryBuilder.MaTemplateCoordBuilder(this);
    }

    public MmCifCategoryBuilder.MaDataBuilder enterMaData() {
        return new MmCifCategoryBuilder.MaDataBuilder(this);
    }

    public MmCifCategoryBuilder.MaDataGroupBuilder enterMaDataGroup() {
        return new MmCifCategoryBuilder.MaDataGroupBuilder(this);
    }

    public MmCifCategoryBuilder.MaDataRefDbBuilder enterMaDataRefDb() {
        return new MmCifCategoryBuilder.MaDataRefDbBuilder(this);
    }

    public MmCifCategoryBuilder.MaCoevolutionSeqDbRefBuilder enterMaCoevolutionSeqDbRef() {
        return new MmCifCategoryBuilder.MaCoevolutionSeqDbRefBuilder(this);
    }

    public MmCifCategoryBuilder.MaCoevolutionMsaBuilder enterMaCoevolutionMsa() {
        return new MmCifCategoryBuilder.MaCoevolutionMsaBuilder(this);
    }

    public MmCifCategoryBuilder.MaCoevolutionMsaDetailsBuilder enterMaCoevolutionMsaDetails() {
        return new MmCifCategoryBuilder.MaCoevolutionMsaDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaRestraintsBuilder enterMaRestraints() {
        return new MmCifCategoryBuilder.MaRestraintsBuilder(this);
    }

    public MmCifCategoryBuilder.MaDistanceRestraintsBuilder enterMaDistanceRestraints() {
        return new MmCifCategoryBuilder.MaDistanceRestraintsBuilder(this);
    }

    public MmCifCategoryBuilder.MaAngleRestraintsBuilder enterMaAngleRestraints() {
        return new MmCifCategoryBuilder.MaAngleRestraintsBuilder(this);
    }

    public MmCifCategoryBuilder.MaDihedralRestraintsBuilder enterMaDihedralRestraints() {
        return new MmCifCategoryBuilder.MaDihedralRestraintsBuilder(this);
    }

    public MmCifCategoryBuilder.MaRestraintsGroupBuilder enterMaRestraintsGroup() {
        return new MmCifCategoryBuilder.MaRestraintsGroupBuilder(this);
    }

    public MmCifCategoryBuilder.MaProtocolStepBuilder enterMaProtocolStep() {
        return new MmCifCategoryBuilder.MaProtocolStepBuilder(this);
    }

    public MmCifCategoryBuilder.MaSoftwareGroupBuilder enterMaSoftwareGroup() {
        return new MmCifCategoryBuilder.MaSoftwareGroupBuilder(this);
    }

    public MmCifCategoryBuilder.MaSoftwareParameterBuilder enterMaSoftwareParameter() {
        return new MmCifCategoryBuilder.MaSoftwareParameterBuilder(this);
    }

    public MmCifCategoryBuilder.MaPolyTemplateLibraryDetailsBuilder enterMaPolyTemplateLibraryDetails() {
        return new MmCifCategoryBuilder.MaPolyTemplateLibraryDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaPolyTemplateLibraryListBuilder enterMaPolyTemplateLibraryList() {
        return new MmCifCategoryBuilder.MaPolyTemplateLibraryListBuilder(this);
    }

    public MmCifCategoryBuilder.MaPolyTemplateLibraryComponentsBuilder enterMaPolyTemplateLibraryComponents() {
        return new MmCifCategoryBuilder.MaPolyTemplateLibraryComponentsBuilder(this);
    }

    public MmCifCategoryBuilder.MaQaMetricBuilder enterMaQaMetric() {
        return new MmCifCategoryBuilder.MaQaMetricBuilder(this);
    }

    public MmCifCategoryBuilder.MaQaMetricGlobalBuilder enterMaQaMetricGlobal() {
        return new MmCifCategoryBuilder.MaQaMetricGlobalBuilder(this);
    }

    public MmCifCategoryBuilder.MaQaMetricLocalBuilder enterMaQaMetricLocal() {
        return new MmCifCategoryBuilder.MaQaMetricLocalBuilder(this);
    }

    public MmCifCategoryBuilder.MaQaMetricLocalPairwiseBuilder enterMaQaMetricLocalPairwise() {
        return new MmCifCategoryBuilder.MaQaMetricLocalPairwiseBuilder(this);
    }

    public MmCifCategoryBuilder.MaEntryAssociatedFilesBuilder enterMaEntryAssociatedFiles() {
        return new MmCifCategoryBuilder.MaEntryAssociatedFilesBuilder(this);
    }

    public MmCifCategoryBuilder.MaAssociatedArchiveFileDetailsBuilder enterMaAssociatedArchiveFileDetails() {
        return new MmCifCategoryBuilder.MaAssociatedArchiveFileDetailsBuilder(this);
    }

    public MmCifCategoryBuilder.MaChemCompDescriptorBuilder enterMaChemCompDescriptor() {
        return new MmCifCategoryBuilder.MaChemCompDescriptorBuilder(this);
    }

}