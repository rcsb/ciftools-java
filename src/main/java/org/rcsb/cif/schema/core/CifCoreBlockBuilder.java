package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.model.builder.BlockBuilderImpl;
import org.rcsb.cif.model.text.TextCategory;

import javax.annotation.Generated;
import java.util.Map;

import static org.rcsb.cif.model.CategoryBuilder.createColumnText;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CifCoreBlockBuilder extends BlockBuilderImpl<CifCoreFileBuilder> {
    public CifCoreBlockBuilder(String blockName, CifCoreFileBuilder parent) {
        super(blockName, parent);
    }

    @Override
    public CifCoreCategoryBuilder enterCategory(String categoryName) {
        return new CifCoreCategoryBuilder(categoryName, this);
    }

    @Override
    public CifCoreFileBuilder leaveBlock() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave block with undefined parent file");
        }
        parent.digest(this);
        return parent;
    }

    @Override
    public void digest(CategoryBuilder<? extends BlockBuilder<CifCoreFileBuilder>, CifCoreFileBuilder> builder) {
        // flat schema: block builder should digest columns directly - do nothing
    }

    public void digest(IntColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), IntColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

    public void digest(FloatColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), FloatColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

    public void digest(StrColumnBuilder<? extends CategoryBuilder<CifCoreBlockBuilder, CifCoreFileBuilder>, CifCoreBlockBuilder, CifCoreFileBuilder> builder) {
        String flatName = builder.getCategoryName() + "_" + builder.getColumnName();
        Column column = createColumnText(builder.getColumnName(), builder.getValues(), builder.getMask(), StrColumn.class);
        categories.put(flatName, new TextCategory(flatName, Map.of("", column)));
    }

    public CifCoreCategoryBuilder.CifCoreBuilder enterCifCore() {
        return new CifCoreCategoryBuilder.CifCoreBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffractionBuilder enterDiffraction() {
        return new CifCoreCategoryBuilder.DiffractionBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnBuilder enterDiffrn() {
        return new CifCoreCategoryBuilder.DiffrnBuilder(this);
    }

    public CifCoreCategoryBuilder.CellBuilder enterCell() {
        return new CifCoreCategoryBuilder.CellBuilder(this);
    }

    public CifCoreCategoryBuilder.CellMeasurementBuilder enterCellMeasurement() {
        return new CifCoreCategoryBuilder.CellMeasurementBuilder(this);
    }

    public CifCoreCategoryBuilder.CellMeasurementReflnBuilder enterCellMeasurementRefln() {
        return new CifCoreCategoryBuilder.CellMeasurementReflnBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnAttenuatorBuilder enterDiffrnAttenuator() {
        return new CifCoreCategoryBuilder.DiffrnAttenuatorBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnDetectorBuilder enterDiffrnDetector() {
        return new CifCoreCategoryBuilder.DiffrnDetectorBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnMeasurementBuilder enterDiffrnMeasurement() {
        return new CifCoreCategoryBuilder.DiffrnMeasurementBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnOrientBuilder enterDiffrnOrient() {
        return new CifCoreCategoryBuilder.DiffrnOrientBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnOrientMatrixBuilder enterDiffrnOrientMatrix() {
        return new CifCoreCategoryBuilder.DiffrnOrientMatrixBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnOrientReflnBuilder enterDiffrnOrientRefln() {
        return new CifCoreCategoryBuilder.DiffrnOrientReflnBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnRadiationBuilder enterDiffrnRadiation() {
        return new CifCoreCategoryBuilder.DiffrnRadiationBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnRadiationWavelengthBuilder enterDiffrnRadiationWavelength() {
        return new CifCoreCategoryBuilder.DiffrnRadiationWavelengthBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnReflnBuilder enterDiffrnRefln() {
        return new CifCoreCategoryBuilder.DiffrnReflnBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnReflnsBuilder enterDiffrnReflns() {
        return new CifCoreCategoryBuilder.DiffrnReflnsBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnReflnsClassBuilder enterDiffrnReflnsClass() {
        return new CifCoreCategoryBuilder.DiffrnReflnsClassBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnReflnsTransfMatrixBuilder enterDiffrnReflnsTransfMatrix() {
        return new CifCoreCategoryBuilder.DiffrnReflnsTransfMatrixBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnScaleGroupBuilder enterDiffrnScaleGroup() {
        return new CifCoreCategoryBuilder.DiffrnScaleGroupBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnSourceBuilder enterDiffrnSource() {
        return new CifCoreCategoryBuilder.DiffrnSourceBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnStandardsBuilder enterDiffrnStandards() {
        return new CifCoreCategoryBuilder.DiffrnStandardsBuilder(this);
    }

    public CifCoreCategoryBuilder.DiffrnStandardReflnBuilder enterDiffrnStandardRefln() {
        return new CifCoreCategoryBuilder.DiffrnStandardReflnBuilder(this);
    }

    public CifCoreCategoryBuilder.ReflnBuilder enterRefln() {
        return new CifCoreCategoryBuilder.ReflnBuilder(this);
    }

    public CifCoreCategoryBuilder.ReflnsBuilder enterReflns() {
        return new CifCoreCategoryBuilder.ReflnsBuilder(this);
    }

    public CifCoreCategoryBuilder.ReflnsClassBuilder enterReflnsClass() {
        return new CifCoreCategoryBuilder.ReflnsClassBuilder(this);
    }

    public CifCoreCategoryBuilder.ReflnsScaleBuilder enterReflnsScale() {
        return new CifCoreCategoryBuilder.ReflnsScaleBuilder(this);
    }

    public CifCoreCategoryBuilder.ReflnsShellBuilder enterReflnsShell() {
        return new CifCoreCategoryBuilder.ReflnsShellBuilder(this);
    }

    public CifCoreCategoryBuilder.ExptlBuilder enterExptl() {
        return new CifCoreCategoryBuilder.ExptlBuilder(this);
    }

    public CifCoreCategoryBuilder.ChemicalBuilder enterChemical() {
        return new CifCoreCategoryBuilder.ChemicalBuilder(this);
    }

    public CifCoreCategoryBuilder.ChemicalConnAtomBuilder enterChemicalConnAtom() {
        return new CifCoreCategoryBuilder.ChemicalConnAtomBuilder(this);
    }

    public CifCoreCategoryBuilder.ChemicalConnBondBuilder enterChemicalConnBond() {
        return new CifCoreCategoryBuilder.ChemicalConnBondBuilder(this);
    }

    public CifCoreCategoryBuilder.ChemicalFormulaBuilder enterChemicalFormula() {
        return new CifCoreCategoryBuilder.ChemicalFormulaBuilder(this);
    }

    public CifCoreCategoryBuilder.ExptlAbsorptBuilder enterExptlAbsorpt() {
        return new CifCoreCategoryBuilder.ExptlAbsorptBuilder(this);
    }

    public CifCoreCategoryBuilder.ExptlCrystalBuilder enterExptlCrystal() {
        return new CifCoreCategoryBuilder.ExptlCrystalBuilder(this);
    }

    public CifCoreCategoryBuilder.ExptlCrystalAppearanceBuilder enterExptlCrystalAppearance() {
        return new CifCoreCategoryBuilder.ExptlCrystalAppearanceBuilder(this);
    }

    public CifCoreCategoryBuilder.ExptlCrystalFaceBuilder enterExptlCrystalFace() {
        return new CifCoreCategoryBuilder.ExptlCrystalFaceBuilder(this);
    }

    public CifCoreCategoryBuilder.SpaceGroupBuilder enterSpaceGroup() {
        return new CifCoreCategoryBuilder.SpaceGroupBuilder(this);
    }

    public CifCoreCategoryBuilder.SpaceGroupGeneratorBuilder enterSpaceGroupGenerator() {
        return new CifCoreCategoryBuilder.SpaceGroupGeneratorBuilder(this);
    }

    public CifCoreCategoryBuilder.SpaceGroupSymopBuilder enterSpaceGroupSymop() {
        return new CifCoreCategoryBuilder.SpaceGroupSymopBuilder(this);
    }

    public CifCoreCategoryBuilder.SpaceGroupWyckoffBuilder enterSpaceGroupWyckoff() {
        return new CifCoreCategoryBuilder.SpaceGroupWyckoffBuilder(this);
    }

    public CifCoreCategoryBuilder.ModelBuilder enterModel() {
        return new CifCoreCategoryBuilder.ModelBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomBuilder enterGeom() {
        return new CifCoreCategoryBuilder.GeomBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomAngleBuilder enterGeomAngle() {
        return new CifCoreCategoryBuilder.GeomAngleBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomBondBuilder enterGeomBond() {
        return new CifCoreCategoryBuilder.GeomBondBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomContactBuilder enterGeomContact() {
        return new CifCoreCategoryBuilder.GeomContactBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomHbondBuilder enterGeomHbond() {
        return new CifCoreCategoryBuilder.GeomHbondBuilder(this);
    }

    public CifCoreCategoryBuilder.GeomTorsionBuilder enterGeomTorsion() {
        return new CifCoreCategoryBuilder.GeomTorsionBuilder(this);
    }

    public CifCoreCategoryBuilder.ModelSiteBuilder enterModelSite() {
        return new CifCoreCategoryBuilder.ModelSiteBuilder(this);
    }

    public CifCoreCategoryBuilder.ValenceBuilder enterValence() {
        return new CifCoreCategoryBuilder.ValenceBuilder(this);
    }

    public CifCoreCategoryBuilder.ValenceParamBuilder enterValenceParam() {
        return new CifCoreCategoryBuilder.ValenceParamBuilder(this);
    }

    public CifCoreCategoryBuilder.ValenceRefBuilder enterValenceRef() {
        return new CifCoreCategoryBuilder.ValenceRefBuilder(this);
    }

    public CifCoreCategoryBuilder.PublicationBuilder enterPublication() {
        return new CifCoreCategoryBuilder.PublicationBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditBuilder enterAudit() {
        return new CifCoreCategoryBuilder.AuditBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditAuthorBuilder enterAuditAuthor() {
        return new CifCoreCategoryBuilder.AuditAuthorBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditAuthorRoleBuilder enterAuditAuthorRole() {
        return new CifCoreCategoryBuilder.AuditAuthorRoleBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditConformBuilder enterAuditConform() {
        return new CifCoreCategoryBuilder.AuditConformBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditContactAuthorBuilder enterAuditContactAuthor() {
        return new CifCoreCategoryBuilder.AuditContactAuthorBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditLinkBuilder enterAuditLink() {
        return new CifCoreCategoryBuilder.AuditLinkBuilder(this);
    }

    public CifCoreCategoryBuilder.AuditSupportBuilder enterAuditSupport() {
        return new CifCoreCategoryBuilder.AuditSupportBuilder(this);
    }

    public CifCoreCategoryBuilder.CitationBuilder enterCitation() {
        return new CifCoreCategoryBuilder.CitationBuilder(this);
    }

    public CifCoreCategoryBuilder.CitationAuthorBuilder enterCitationAuthor() {
        return new CifCoreCategoryBuilder.CitationAuthorBuilder(this);
    }

    public CifCoreCategoryBuilder.CitationEditorBuilder enterCitationEditor() {
        return new CifCoreCategoryBuilder.CitationEditorBuilder(this);
    }

    public CifCoreCategoryBuilder.ComputingBuilder enterComputing() {
        return new CifCoreCategoryBuilder.ComputingBuilder(this);
    }

    public CifCoreCategoryBuilder.DatabaseBuilder enterDatabase() {
        return new CifCoreCategoryBuilder.DatabaseBuilder(this);
    }

    public CifCoreCategoryBuilder.DatabaseCodeBuilder enterDatabaseCode() {
        return new CifCoreCategoryBuilder.DatabaseCodeBuilder(this);
    }

    public CifCoreCategoryBuilder.DatabaseRelatedBuilder enterDatabaseRelated() {
        return new CifCoreCategoryBuilder.DatabaseRelatedBuilder(this);
    }

    public CifCoreCategoryBuilder.DisplayBuilder enterDisplay() {
        return new CifCoreCategoryBuilder.DisplayBuilder(this);
    }

    public CifCoreCategoryBuilder.DisplayColourBuilder enterDisplayColour() {
        return new CifCoreCategoryBuilder.DisplayColourBuilder(this);
    }

    public CifCoreCategoryBuilder.JournalBuilder enterJournal() {
        return new CifCoreCategoryBuilder.JournalBuilder(this);
    }

    public CifCoreCategoryBuilder.JournalCoeditorBuilder enterJournalCoeditor() {
        return new CifCoreCategoryBuilder.JournalCoeditorBuilder(this);
    }

    public CifCoreCategoryBuilder.JournalDateBuilder enterJournalDate() {
        return new CifCoreCategoryBuilder.JournalDateBuilder(this);
    }

    public CifCoreCategoryBuilder.JournalIndexBuilder enterJournalIndex() {
        return new CifCoreCategoryBuilder.JournalIndexBuilder(this);
    }

    public CifCoreCategoryBuilder.JournalTecheditorBuilder enterJournalTecheditor() {
        return new CifCoreCategoryBuilder.JournalTecheditorBuilder(this);
    }

    public CifCoreCategoryBuilder.PublBuilder enterPubl() {
        return new CifCoreCategoryBuilder.PublBuilder(this);
    }

    public CifCoreCategoryBuilder.PublAuthorBuilder enterPublAuthor() {
        return new CifCoreCategoryBuilder.PublAuthorBuilder(this);
    }

    public CifCoreCategoryBuilder.PublBodyBuilder enterPublBody() {
        return new CifCoreCategoryBuilder.PublBodyBuilder(this);
    }

    public CifCoreCategoryBuilder.PublContactAuthorBuilder enterPublContactAuthor() {
        return new CifCoreCategoryBuilder.PublContactAuthorBuilder(this);
    }

    public CifCoreCategoryBuilder.PublManuscriptBuilder enterPublManuscript() {
        return new CifCoreCategoryBuilder.PublManuscriptBuilder(this);
    }

    public CifCoreCategoryBuilder.PublManuscriptInclExtraBuilder enterPublManuscriptInclExtra() {
        return new CifCoreCategoryBuilder.PublManuscriptInclExtraBuilder(this);
    }

    public CifCoreCategoryBuilder.PublRequestedBuilder enterPublRequested() {
        return new CifCoreCategoryBuilder.PublRequestedBuilder(this);
    }

    public CifCoreCategoryBuilder.PublSectionBuilder enterPublSection() {
        return new CifCoreCategoryBuilder.PublSectionBuilder(this);
    }

    public CifCoreCategoryBuilder.StructureBuilder enterStructure() {
        return new CifCoreCategoryBuilder.StructureBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomBuilder enterAtom() {
        return new CifCoreCategoryBuilder.AtomBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomAnalyticalBuilder enterAtomAnalytical() {
        return new CifCoreCategoryBuilder.AtomAnalyticalBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomAnalyticalMassLossBuilder enterAtomAnalyticalMassLoss() {
        return new CifCoreCategoryBuilder.AtomAnalyticalMassLossBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomAnalyticalSourceBuilder enterAtomAnalyticalSource() {
        return new CifCoreCategoryBuilder.AtomAnalyticalSourceBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomScatVersusStolBuilder enterAtomScatVersusStol() {
        return new CifCoreCategoryBuilder.AtomScatVersusStolBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSiteBuilder enterAtomSite() {
        return new CifCoreCategoryBuilder.AtomSiteBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSiteAnisoBuilder enterAtomSiteAniso() {
        return new CifCoreCategoryBuilder.AtomSiteAnisoBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSitesBuilder enterAtomSites() {
        return new CifCoreCategoryBuilder.AtomSitesBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSitesCartnTransformBuilder enterAtomSitesCartnTransform() {
        return new CifCoreCategoryBuilder.AtomSitesCartnTransformBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSitesFractTransformBuilder enterAtomSitesFractTransform() {
        return new CifCoreCategoryBuilder.AtomSitesFractTransformBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomTypeBuilder enterAtomType() {
        return new CifCoreCategoryBuilder.AtomTypeBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomTypeScatBuilder enterAtomTypeScat() {
        return new CifCoreCategoryBuilder.AtomTypeScatBuilder(this);
    }

    public CifCoreCategoryBuilder.RefineBuilder enterRefine() {
        return new CifCoreCategoryBuilder.RefineBuilder(this);
    }

    public CifCoreCategoryBuilder.RefineDiffBuilder enterRefineDiff() {
        return new CifCoreCategoryBuilder.RefineDiffBuilder(this);
    }

    public CifCoreCategoryBuilder.RefineLsBuilder enterRefineLs() {
        return new CifCoreCategoryBuilder.RefineLsBuilder(this);
    }

    public CifCoreCategoryBuilder.RefineLsClassBuilder enterRefineLsClass() {
        return new CifCoreCategoryBuilder.RefineLsClassBuilder(this);
    }

    public CifCoreCategoryBuilder.FunctionBuilder enterFunction() {
        return new CifCoreCategoryBuilder.FunctionBuilder(this);
    }

    public CifCoreCategoryBuilder.SymmetryBuilder enterSymmetry() {
        return new CifCoreCategoryBuilder.SymmetryBuilder(this);
    }

    public CifCoreCategoryBuilder.CellAngleBuilder enterCellAngle() {
        return new CifCoreCategoryBuilder.CellAngleBuilder(this);
    }

    public CifCoreCategoryBuilder.ChemCompBondBuilder enterChemCompBond() {
        return new CifCoreCategoryBuilder.ChemCompBondBuilder(this);
    }

    public CifCoreCategoryBuilder.SymmetryEquivBuilder enterSymmetryEquiv() {
        return new CifCoreCategoryBuilder.SymmetryEquivBuilder(this);
    }

    public CifCoreCategoryBuilder.PublManuscriptInclBuilder enterPublManuscriptIncl() {
        return new CifCoreCategoryBuilder.PublManuscriptInclBuilder(this);
    }

    public CifCoreCategoryBuilder.AtomSiteAnisotropBuilder enterAtomSiteAnisotrop() {
        return new CifCoreCategoryBuilder.AtomSiteAnisotropBuilder(this);
    }

}