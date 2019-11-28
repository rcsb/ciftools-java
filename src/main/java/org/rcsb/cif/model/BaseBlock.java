package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public org.rcsb.cif.model.generated.AtomSite getAtomSite() {
        return (org.rcsb.cif.model.generated.AtomSite) categories.computeIfAbsent("atom_site",
                org.rcsb.cif.model.generated.AtomSite::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return (org.rcsb.cif.model.generated.AtomSiteAnisotrop) categories.computeIfAbsent("atom_site_anisotrop",
                org.rcsb.cif.model.generated.AtomSiteAnisotrop::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSites getAtomSites() {
        return (org.rcsb.cif.model.generated.AtomSites) categories.computeIfAbsent("atom_sites",
                org.rcsb.cif.model.generated.AtomSites::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSitesAlt getAtomSitesAlt() {
        return (org.rcsb.cif.model.generated.AtomSitesAlt) categories.computeIfAbsent("atom_sites_alt",
                org.rcsb.cif.model.generated.AtomSitesAlt::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSitesAltEns getAtomSitesAltEns() {
        return (org.rcsb.cif.model.generated.AtomSitesAltEns) categories.computeIfAbsent("atom_sites_alt_ens",
                org.rcsb.cif.model.generated.AtomSitesAltEns::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSitesAltGen getAtomSitesAltGen() {
        return (org.rcsb.cif.model.generated.AtomSitesAltGen) categories.computeIfAbsent("atom_sites_alt_gen",
                org.rcsb.cif.model.generated.AtomSitesAltGen::new).get();
    }

    public org.rcsb.cif.model.generated.AtomSitesFootnote getAtomSitesFootnote() {
        return (org.rcsb.cif.model.generated.AtomSitesFootnote) categories.computeIfAbsent("atom_sites_footnote",
                org.rcsb.cif.model.generated.AtomSitesFootnote::new).get();
    }

    public org.rcsb.cif.model.generated.AtomType getAtomType() {
        return (org.rcsb.cif.model.generated.AtomType) categories.computeIfAbsent("atom_type",
                org.rcsb.cif.model.generated.AtomType::new).get();
    }

    public org.rcsb.cif.model.generated.Audit getAudit() {
        return (org.rcsb.cif.model.generated.Audit) categories.computeIfAbsent("audit",
                org.rcsb.cif.model.generated.Audit::new).get();
    }

    public org.rcsb.cif.model.generated.AuditAuthor getAuditAuthor() {
        return (org.rcsb.cif.model.generated.AuditAuthor) categories.computeIfAbsent("audit_author",
                org.rcsb.cif.model.generated.AuditAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.AuditConform getAuditConform() {
        return (org.rcsb.cif.model.generated.AuditConform) categories.computeIfAbsent("audit_conform",
                org.rcsb.cif.model.generated.AuditConform::new).get();
    }

    public org.rcsb.cif.model.generated.AuditContactAuthor getAuditContactAuthor() {
        return (org.rcsb.cif.model.generated.AuditContactAuthor) categories.computeIfAbsent("audit_contact_author",
                org.rcsb.cif.model.generated.AuditContactAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.Cell getCell() {
        return (org.rcsb.cif.model.generated.Cell) categories.computeIfAbsent("cell",
                org.rcsb.cif.model.generated.Cell::new).get();
    }

    public org.rcsb.cif.model.generated.CellMeasurement getCellMeasurement() {
        return (org.rcsb.cif.model.generated.CellMeasurement) categories.computeIfAbsent("cell_measurement",
                org.rcsb.cif.model.generated.CellMeasurement::new).get();
    }

    public org.rcsb.cif.model.generated.CellMeasurementRefln getCellMeasurementRefln() {
        return (org.rcsb.cif.model.generated.CellMeasurementRefln) categories.computeIfAbsent("cell_measurement_refln",
                org.rcsb.cif.model.generated.CellMeasurementRefln::new).get();
    }

    public org.rcsb.cif.model.generated.ChemComp getChemComp() {
        return (org.rcsb.cif.model.generated.ChemComp) categories.computeIfAbsent("chem_comp",
                org.rcsb.cif.model.generated.ChemComp::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompAngle getChemCompAngle() {
        return (org.rcsb.cif.model.generated.ChemCompAngle) categories.computeIfAbsent("chem_comp_angle",
                org.rcsb.cif.model.generated.ChemCompAngle::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompAtom getChemCompAtom() {
        return (org.rcsb.cif.model.generated.ChemCompAtom) categories.computeIfAbsent("chem_comp_atom",
                org.rcsb.cif.model.generated.ChemCompAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompBond getChemCompBond() {
        return (org.rcsb.cif.model.generated.ChemCompBond) categories.computeIfAbsent("chem_comp_bond",
                org.rcsb.cif.model.generated.ChemCompBond::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompChir getChemCompChir() {
        return (org.rcsb.cif.model.generated.ChemCompChir) categories.computeIfAbsent("chem_comp_chir",
                org.rcsb.cif.model.generated.ChemCompChir::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompChirAtom getChemCompChirAtom() {
        return (org.rcsb.cif.model.generated.ChemCompChirAtom) categories.computeIfAbsent("chem_comp_chir_atom",
                org.rcsb.cif.model.generated.ChemCompChirAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompLink getChemCompLink() {
        return (org.rcsb.cif.model.generated.ChemCompLink) categories.computeIfAbsent("chem_comp_link",
                org.rcsb.cif.model.generated.ChemCompLink::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompPlane getChemCompPlane() {
        return (org.rcsb.cif.model.generated.ChemCompPlane) categories.computeIfAbsent("chem_comp_plane",
                org.rcsb.cif.model.generated.ChemCompPlane::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompPlaneAtom getChemCompPlaneAtom() {
        return (org.rcsb.cif.model.generated.ChemCompPlaneAtom) categories.computeIfAbsent("chem_comp_plane_atom",
                org.rcsb.cif.model.generated.ChemCompPlaneAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompTor getChemCompTor() {
        return (org.rcsb.cif.model.generated.ChemCompTor) categories.computeIfAbsent("chem_comp_tor",
                org.rcsb.cif.model.generated.ChemCompTor::new).get();
    }

    public org.rcsb.cif.model.generated.ChemCompTorValue getChemCompTorValue() {
        return (org.rcsb.cif.model.generated.ChemCompTorValue) categories.computeIfAbsent("chem_comp_tor_value",
                org.rcsb.cif.model.generated.ChemCompTorValue::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLink getChemLink() {
        return (org.rcsb.cif.model.generated.ChemLink) categories.computeIfAbsent("chem_link",
                org.rcsb.cif.model.generated.ChemLink::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkAngle getChemLinkAngle() {
        return (org.rcsb.cif.model.generated.ChemLinkAngle) categories.computeIfAbsent("chem_link_angle",
                org.rcsb.cif.model.generated.ChemLinkAngle::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkBond getChemLinkBond() {
        return (org.rcsb.cif.model.generated.ChemLinkBond) categories.computeIfAbsent("chem_link_bond",
                org.rcsb.cif.model.generated.ChemLinkBond::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkChir getChemLinkChir() {
        return (org.rcsb.cif.model.generated.ChemLinkChir) categories.computeIfAbsent("chem_link_chir",
                org.rcsb.cif.model.generated.ChemLinkChir::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkChirAtom getChemLinkChirAtom() {
        return (org.rcsb.cif.model.generated.ChemLinkChirAtom) categories.computeIfAbsent("chem_link_chir_atom",
                org.rcsb.cif.model.generated.ChemLinkChirAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkPlane getChemLinkPlane() {
        return (org.rcsb.cif.model.generated.ChemLinkPlane) categories.computeIfAbsent("chem_link_plane",
                org.rcsb.cif.model.generated.ChemLinkPlane::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkPlaneAtom getChemLinkPlaneAtom() {
        return (org.rcsb.cif.model.generated.ChemLinkPlaneAtom) categories.computeIfAbsent("chem_link_plane_atom",
                org.rcsb.cif.model.generated.ChemLinkPlaneAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkTor getChemLinkTor() {
        return (org.rcsb.cif.model.generated.ChemLinkTor) categories.computeIfAbsent("chem_link_tor",
                org.rcsb.cif.model.generated.ChemLinkTor::new).get();
    }

    public org.rcsb.cif.model.generated.ChemLinkTorValue getChemLinkTorValue() {
        return (org.rcsb.cif.model.generated.ChemLinkTorValue) categories.computeIfAbsent("chem_link_tor_value",
                org.rcsb.cif.model.generated.ChemLinkTorValue::new).get();
    }

    public org.rcsb.cif.model.generated.Chemical getChemical() {
        return (org.rcsb.cif.model.generated.Chemical) categories.computeIfAbsent("chemical",
                org.rcsb.cif.model.generated.Chemical::new).get();
    }

    public org.rcsb.cif.model.generated.ChemicalConnAtom getChemicalConnAtom() {
        return (org.rcsb.cif.model.generated.ChemicalConnAtom) categories.computeIfAbsent("chemical_conn_atom",
                org.rcsb.cif.model.generated.ChemicalConnAtom::new).get();
    }

    public org.rcsb.cif.model.generated.ChemicalConnBond getChemicalConnBond() {
        return (org.rcsb.cif.model.generated.ChemicalConnBond) categories.computeIfAbsent("chemical_conn_bond",
                org.rcsb.cif.model.generated.ChemicalConnBond::new).get();
    }

    public org.rcsb.cif.model.generated.ChemicalFormula getChemicalFormula() {
        return (org.rcsb.cif.model.generated.ChemicalFormula) categories.computeIfAbsent("chemical_formula",
                org.rcsb.cif.model.generated.ChemicalFormula::new).get();
    }

    public org.rcsb.cif.model.generated.Citation getCitation() {
        return (org.rcsb.cif.model.generated.Citation) categories.computeIfAbsent("citation",
                org.rcsb.cif.model.generated.Citation::new).get();
    }

    public org.rcsb.cif.model.generated.CitationAuthor getCitationAuthor() {
        return (org.rcsb.cif.model.generated.CitationAuthor) categories.computeIfAbsent("citation_author",
                org.rcsb.cif.model.generated.CitationAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.CitationEditor getCitationEditor() {
        return (org.rcsb.cif.model.generated.CitationEditor) categories.computeIfAbsent("citation_editor",
                org.rcsb.cif.model.generated.CitationEditor::new).get();
    }

    public org.rcsb.cif.model.generated.Computing getComputing() {
        return (org.rcsb.cif.model.generated.Computing) categories.computeIfAbsent("computing",
                org.rcsb.cif.model.generated.Computing::new).get();
    }

    public org.rcsb.cif.model.generated.Database getDatabase() {
        return (org.rcsb.cif.model.generated.Database) categories.computeIfAbsent("database",
                org.rcsb.cif.model.generated.Database::new).get();
    }

    public org.rcsb.cif.model.generated.Database2 getDatabase2() {
        return (org.rcsb.cif.model.generated.Database2) categories.computeIfAbsent("database_2",
                org.rcsb.cif.model.generated.Database2::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBCaveat getDatabasePDBCaveat() {
        return (org.rcsb.cif.model.generated.DatabasePDBCaveat) categories.computeIfAbsent("database_PDB_caveat",
                org.rcsb.cif.model.generated.DatabasePDBCaveat::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBMatrix getDatabasePDBMatrix() {
        return (org.rcsb.cif.model.generated.DatabasePDBMatrix) categories.computeIfAbsent("database_PDB_matrix",
                org.rcsb.cif.model.generated.DatabasePDBMatrix::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBRemark getDatabasePDBRemark() {
        return (org.rcsb.cif.model.generated.DatabasePDBRemark) categories.computeIfAbsent("database_PDB_remark",
                org.rcsb.cif.model.generated.DatabasePDBRemark::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBRev getDatabasePDBRev() {
        return (org.rcsb.cif.model.generated.DatabasePDBRev) categories.computeIfAbsent("database_PDB_rev",
                org.rcsb.cif.model.generated.DatabasePDBRev::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBRevRecord getDatabasePDBRevRecord() {
        return (org.rcsb.cif.model.generated.DatabasePDBRevRecord) categories.computeIfAbsent("database_PDB_rev_record",
                org.rcsb.cif.model.generated.DatabasePDBRevRecord::new).get();
    }

    public org.rcsb.cif.model.generated.DatabasePDBTvect getDatabasePDBTvect() {
        return (org.rcsb.cif.model.generated.DatabasePDBTvect) categories.computeIfAbsent("database_PDB_tvect",
                org.rcsb.cif.model.generated.DatabasePDBTvect::new).get();
    }

    public org.rcsb.cif.model.generated.Diffrn getDiffrn() {
        return (org.rcsb.cif.model.generated.Diffrn) categories.computeIfAbsent("diffrn",
                org.rcsb.cif.model.generated.Diffrn::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnAttenuator getDiffrnAttenuator() {
        return (org.rcsb.cif.model.generated.DiffrnAttenuator) categories.computeIfAbsent("diffrn_attenuator",
                org.rcsb.cif.model.generated.DiffrnAttenuator::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnDetector getDiffrnDetector() {
        return (org.rcsb.cif.model.generated.DiffrnDetector) categories.computeIfAbsent("diffrn_detector",
                org.rcsb.cif.model.generated.DiffrnDetector::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnMeasurement getDiffrnMeasurement() {
        return (org.rcsb.cif.model.generated.DiffrnMeasurement) categories.computeIfAbsent("diffrn_measurement",
                org.rcsb.cif.model.generated.DiffrnMeasurement::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return (org.rcsb.cif.model.generated.DiffrnOrientMatrix) categories.computeIfAbsent("diffrn_orient_matrix",
                org.rcsb.cif.model.generated.DiffrnOrientMatrix::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnOrientRefln getDiffrnOrientRefln() {
        return (org.rcsb.cif.model.generated.DiffrnOrientRefln) categories.computeIfAbsent("diffrn_orient_refln",
                org.rcsb.cif.model.generated.DiffrnOrientRefln::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnRadiation getDiffrnRadiation() {
        return (org.rcsb.cif.model.generated.DiffrnRadiation) categories.computeIfAbsent("diffrn_radiation",
                org.rcsb.cif.model.generated.DiffrnRadiation::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return (org.rcsb.cif.model.generated.DiffrnRadiationWavelength) categories.computeIfAbsent("diffrn_radiation_wavelength",
                org.rcsb.cif.model.generated.DiffrnRadiationWavelength::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnRefln getDiffrnRefln() {
        return (org.rcsb.cif.model.generated.DiffrnRefln) categories.computeIfAbsent("diffrn_refln",
                org.rcsb.cif.model.generated.DiffrnRefln::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnReflns getDiffrnReflns() {
        return (org.rcsb.cif.model.generated.DiffrnReflns) categories.computeIfAbsent("diffrn_reflns",
                org.rcsb.cif.model.generated.DiffrnReflns::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnScaleGroup getDiffrnScaleGroup() {
        return (org.rcsb.cif.model.generated.DiffrnScaleGroup) categories.computeIfAbsent("diffrn_scale_group",
                org.rcsb.cif.model.generated.DiffrnScaleGroup::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnSource getDiffrnSource() {
        return (org.rcsb.cif.model.generated.DiffrnSource) categories.computeIfAbsent("diffrn_source",
                org.rcsb.cif.model.generated.DiffrnSource::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnStandardRefln getDiffrnStandardRefln() {
        return (org.rcsb.cif.model.generated.DiffrnStandardRefln) categories.computeIfAbsent("diffrn_standard_refln",
                org.rcsb.cif.model.generated.DiffrnStandardRefln::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnStandards getDiffrnStandards() {
        return (org.rcsb.cif.model.generated.DiffrnStandards) categories.computeIfAbsent("diffrn_standards",
                org.rcsb.cif.model.generated.DiffrnStandards::new).get();
    }

    public org.rcsb.cif.model.generated.Entity getEntity() {
        return (org.rcsb.cif.model.generated.Entity) categories.computeIfAbsent("entity",
                org.rcsb.cif.model.generated.Entity::new).get();
    }

    public org.rcsb.cif.model.generated.EntityKeywords getEntityKeywords() {
        return (org.rcsb.cif.model.generated.EntityKeywords) categories.computeIfAbsent("entity_keywords",
                org.rcsb.cif.model.generated.EntityKeywords::new).get();
    }

    public org.rcsb.cif.model.generated.EntityLink getEntityLink() {
        return (org.rcsb.cif.model.generated.EntityLink) categories.computeIfAbsent("entity_link",
                org.rcsb.cif.model.generated.EntityLink::new).get();
    }

    public org.rcsb.cif.model.generated.EntityNameCom getEntityNameCom() {
        return (org.rcsb.cif.model.generated.EntityNameCom) categories.computeIfAbsent("entity_name_com",
                org.rcsb.cif.model.generated.EntityNameCom::new).get();
    }

    public org.rcsb.cif.model.generated.EntityNameSys getEntityNameSys() {
        return (org.rcsb.cif.model.generated.EntityNameSys) categories.computeIfAbsent("entity_name_sys",
                org.rcsb.cif.model.generated.EntityNameSys::new).get();
    }

    public org.rcsb.cif.model.generated.EntityPoly getEntityPoly() {
        return (org.rcsb.cif.model.generated.EntityPoly) categories.computeIfAbsent("entity_poly",
                org.rcsb.cif.model.generated.EntityPoly::new).get();
    }

    public org.rcsb.cif.model.generated.EntityPolySeq getEntityPolySeq() {
        return (org.rcsb.cif.model.generated.EntityPolySeq) categories.computeIfAbsent("entity_poly_seq",
                org.rcsb.cif.model.generated.EntityPolySeq::new).get();
    }

    public org.rcsb.cif.model.generated.Entry getEntry() {
        return (org.rcsb.cif.model.generated.Entry) categories.computeIfAbsent("entry",
                org.rcsb.cif.model.generated.Entry::new).get();
    }

    public org.rcsb.cif.model.generated.EntryLink getEntryLink() {
        return (org.rcsb.cif.model.generated.EntryLink) categories.computeIfAbsent("entry_link",
                org.rcsb.cif.model.generated.EntryLink::new).get();
    }

    public org.rcsb.cif.model.generated.Exptl getExptl() {
        return (org.rcsb.cif.model.generated.Exptl) categories.computeIfAbsent("exptl",
                org.rcsb.cif.model.generated.Exptl::new).get();
    }

    public org.rcsb.cif.model.generated.ExptlCrystal getExptlCrystal() {
        return (org.rcsb.cif.model.generated.ExptlCrystal) categories.computeIfAbsent("exptl_crystal",
                org.rcsb.cif.model.generated.ExptlCrystal::new).get();
    }

    public org.rcsb.cif.model.generated.ExptlCrystalFace getExptlCrystalFace() {
        return (org.rcsb.cif.model.generated.ExptlCrystalFace) categories.computeIfAbsent("exptl_crystal_face",
                org.rcsb.cif.model.generated.ExptlCrystalFace::new).get();
    }

    public org.rcsb.cif.model.generated.ExptlCrystalGrow getExptlCrystalGrow() {
        return (org.rcsb.cif.model.generated.ExptlCrystalGrow) categories.computeIfAbsent("exptl_crystal_grow",
                org.rcsb.cif.model.generated.ExptlCrystalGrow::new).get();
    }

    public org.rcsb.cif.model.generated.ExptlCrystalGrowComp getExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.generated.ExptlCrystalGrowComp) categories.computeIfAbsent("exptl_crystal_grow_comp",
                org.rcsb.cif.model.generated.ExptlCrystalGrowComp::new).get();
    }

    public org.rcsb.cif.model.generated.Geom getGeom() {
        return (org.rcsb.cif.model.generated.Geom) categories.computeIfAbsent("geom",
                org.rcsb.cif.model.generated.Geom::new).get();
    }

    public org.rcsb.cif.model.generated.GeomAngle getGeomAngle() {
        return (org.rcsb.cif.model.generated.GeomAngle) categories.computeIfAbsent("geom_angle",
                org.rcsb.cif.model.generated.GeomAngle::new).get();
    }

    public org.rcsb.cif.model.generated.GeomBond getGeomBond() {
        return (org.rcsb.cif.model.generated.GeomBond) categories.computeIfAbsent("geom_bond",
                org.rcsb.cif.model.generated.GeomBond::new).get();
    }

    public org.rcsb.cif.model.generated.GeomContact getGeomContact() {
        return (org.rcsb.cif.model.generated.GeomContact) categories.computeIfAbsent("geom_contact",
                org.rcsb.cif.model.generated.GeomContact::new).get();
    }

    public org.rcsb.cif.model.generated.GeomHbond getGeomHbond() {
        return (org.rcsb.cif.model.generated.GeomHbond) categories.computeIfAbsent("geom_hbond",
                org.rcsb.cif.model.generated.GeomHbond::new).get();
    }

    public org.rcsb.cif.model.generated.GeomTorsion getGeomTorsion() {
        return (org.rcsb.cif.model.generated.GeomTorsion) categories.computeIfAbsent("geom_torsion",
                org.rcsb.cif.model.generated.GeomTorsion::new).get();
    }

    public org.rcsb.cif.model.generated.Journal getJournal() {
        return (org.rcsb.cif.model.generated.Journal) categories.computeIfAbsent("journal",
                org.rcsb.cif.model.generated.Journal::new).get();
    }

    public org.rcsb.cif.model.generated.JournalIndex getJournalIndex() {
        return (org.rcsb.cif.model.generated.JournalIndex) categories.computeIfAbsent("journal_index",
                org.rcsb.cif.model.generated.JournalIndex::new).get();
    }

    public org.rcsb.cif.model.generated.Phasing getPhasing() {
        return (org.rcsb.cif.model.generated.Phasing) categories.computeIfAbsent("phasing",
                org.rcsb.cif.model.generated.Phasing::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingAveraging getPhasingAveraging() {
        return (org.rcsb.cif.model.generated.PhasingAveraging) categories.computeIfAbsent("phasing_averaging",
                org.rcsb.cif.model.generated.PhasingAveraging::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingIsomorphous getPhasingIsomorphous() {
        return (org.rcsb.cif.model.generated.PhasingIsomorphous) categories.computeIfAbsent("phasing_isomorphous",
                org.rcsb.cif.model.generated.PhasingIsomorphous::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMAD getPhasingMAD() {
        return (org.rcsb.cif.model.generated.PhasingMAD) categories.computeIfAbsent("phasing_MAD",
                org.rcsb.cif.model.generated.PhasingMAD::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMADClust getPhasingMADClust() {
        return (org.rcsb.cif.model.generated.PhasingMADClust) categories.computeIfAbsent("phasing_MAD_clust",
                org.rcsb.cif.model.generated.PhasingMADClust::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMADExpt getPhasingMADExpt() {
        return (org.rcsb.cif.model.generated.PhasingMADExpt) categories.computeIfAbsent("phasing_MAD_expt",
                org.rcsb.cif.model.generated.PhasingMADExpt::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMADRatio getPhasingMADRatio() {
        return (org.rcsb.cif.model.generated.PhasingMADRatio) categories.computeIfAbsent("phasing_MAD_ratio",
                org.rcsb.cif.model.generated.PhasingMADRatio::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMADSet getPhasingMADSet() {
        return (org.rcsb.cif.model.generated.PhasingMADSet) categories.computeIfAbsent("phasing_MAD_set",
                org.rcsb.cif.model.generated.PhasingMADSet::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIR getPhasingMIR() {
        return (org.rcsb.cif.model.generated.PhasingMIR) categories.computeIfAbsent("phasing_MIR",
                org.rcsb.cif.model.generated.PhasingMIR::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIRDer getPhasingMIRDer() {
        return (org.rcsb.cif.model.generated.PhasingMIRDer) categories.computeIfAbsent("phasing_MIR_der",
                org.rcsb.cif.model.generated.PhasingMIRDer::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerRefln getPhasingMIRDerRefln() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerRefln) categories.computeIfAbsent("phasing_MIR_der_refln",
                org.rcsb.cif.model.generated.PhasingMIRDerRefln::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerShell getPhasingMIRDerShell() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerShell) categories.computeIfAbsent("phasing_MIR_der_shell",
                org.rcsb.cif.model.generated.PhasingMIRDerShell::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerSite getPhasingMIRDerSite() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerSite) categories.computeIfAbsent("phasing_MIR_der_site",
                org.rcsb.cif.model.generated.PhasingMIRDerSite::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingMIRShell getPhasingMIRShell() {
        return (org.rcsb.cif.model.generated.PhasingMIRShell) categories.computeIfAbsent("phasing_MIR_shell",
                org.rcsb.cif.model.generated.PhasingMIRShell::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingSet getPhasingSet() {
        return (org.rcsb.cif.model.generated.PhasingSet) categories.computeIfAbsent("phasing_set",
                org.rcsb.cif.model.generated.PhasingSet::new).get();
    }

    public org.rcsb.cif.model.generated.PhasingSetRefln getPhasingSetRefln() {
        return (org.rcsb.cif.model.generated.PhasingSetRefln) categories.computeIfAbsent("phasing_set_refln",
                org.rcsb.cif.model.generated.PhasingSetRefln::new).get();
    }

    public org.rcsb.cif.model.generated.Publ getPubl() {
        return (org.rcsb.cif.model.generated.Publ) categories.computeIfAbsent("publ",
                org.rcsb.cif.model.generated.Publ::new).get();
    }

    public org.rcsb.cif.model.generated.PublAuthor getPublAuthor() {
        return (org.rcsb.cif.model.generated.PublAuthor) categories.computeIfAbsent("publ_author",
                org.rcsb.cif.model.generated.PublAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.PublBody getPublBody() {
        return (org.rcsb.cif.model.generated.PublBody) categories.computeIfAbsent("publ_body",
                org.rcsb.cif.model.generated.PublBody::new).get();
    }

    public org.rcsb.cif.model.generated.PublManuscriptIncl getPublManuscriptIncl() {
        return (org.rcsb.cif.model.generated.PublManuscriptIncl) categories.computeIfAbsent("publ_manuscript_incl",
                org.rcsb.cif.model.generated.PublManuscriptIncl::new).get();
    }

    public org.rcsb.cif.model.generated.Refine getRefine() {
        return (org.rcsb.cif.model.generated.Refine) categories.computeIfAbsent("refine",
                org.rcsb.cif.model.generated.Refine::new).get();
    }

    public org.rcsb.cif.model.generated.RefineAnalyze getRefineAnalyze() {
        return (org.rcsb.cif.model.generated.RefineAnalyze) categories.computeIfAbsent("refine_analyze",
                org.rcsb.cif.model.generated.RefineAnalyze::new).get();
    }

    public org.rcsb.cif.model.generated.RefineBIso getRefineBIso() {
        return (org.rcsb.cif.model.generated.RefineBIso) categories.computeIfAbsent("refine_B_iso",
                org.rcsb.cif.model.generated.RefineBIso::new).get();
    }

    public org.rcsb.cif.model.generated.RefineFunctMinimized getRefineFunctMinimized() {
        return (org.rcsb.cif.model.generated.RefineFunctMinimized) categories.computeIfAbsent("refine_funct_minimized",
                org.rcsb.cif.model.generated.RefineFunctMinimized::new).get();
    }

    public org.rcsb.cif.model.generated.RefineHist getRefineHist() {
        return (org.rcsb.cif.model.generated.RefineHist) categories.computeIfAbsent("refine_hist",
                org.rcsb.cif.model.generated.RefineHist::new).get();
    }

    public org.rcsb.cif.model.generated.RefineLsRestr getRefineLsRestr() {
        return (org.rcsb.cif.model.generated.RefineLsRestr) categories.computeIfAbsent("refine_ls_restr",
                org.rcsb.cif.model.generated.RefineLsRestr::new).get();
    }

    public org.rcsb.cif.model.generated.RefineLsRestrNcs getRefineLsRestrNcs() {
        return (org.rcsb.cif.model.generated.RefineLsRestrNcs) categories.computeIfAbsent("refine_ls_restr_ncs",
                org.rcsb.cif.model.generated.RefineLsRestrNcs::new).get();
    }

    public org.rcsb.cif.model.generated.RefineLsRestrType getRefineLsRestrType() {
        return (org.rcsb.cif.model.generated.RefineLsRestrType) categories.computeIfAbsent("refine_ls_restr_type",
                org.rcsb.cif.model.generated.RefineLsRestrType::new).get();
    }

    public org.rcsb.cif.model.generated.RefineLsShell getRefineLsShell() {
        return (org.rcsb.cif.model.generated.RefineLsShell) categories.computeIfAbsent("refine_ls_shell",
                org.rcsb.cif.model.generated.RefineLsShell::new).get();
    }

    public org.rcsb.cif.model.generated.RefineOccupancy getRefineOccupancy() {
        return (org.rcsb.cif.model.generated.RefineOccupancy) categories.computeIfAbsent("refine_occupancy",
                org.rcsb.cif.model.generated.RefineOccupancy::new).get();
    }

    public org.rcsb.cif.model.generated.Refln getRefln() {
        return (org.rcsb.cif.model.generated.Refln) categories.computeIfAbsent("refln",
                org.rcsb.cif.model.generated.Refln::new).get();
    }

    public org.rcsb.cif.model.generated.ReflnSysAbs getReflnSysAbs() {
        return (org.rcsb.cif.model.generated.ReflnSysAbs) categories.computeIfAbsent("refln_sys_abs",
                org.rcsb.cif.model.generated.ReflnSysAbs::new).get();
    }

    public org.rcsb.cif.model.generated.Reflns getReflns() {
        return (org.rcsb.cif.model.generated.Reflns) categories.computeIfAbsent("reflns",
                org.rcsb.cif.model.generated.Reflns::new).get();
    }

    public org.rcsb.cif.model.generated.ReflnsScale getReflnsScale() {
        return (org.rcsb.cif.model.generated.ReflnsScale) categories.computeIfAbsent("reflns_scale",
                org.rcsb.cif.model.generated.ReflnsScale::new).get();
    }

    public org.rcsb.cif.model.generated.ReflnsShell getReflnsShell() {
        return (org.rcsb.cif.model.generated.ReflnsShell) categories.computeIfAbsent("reflns_shell",
                org.rcsb.cif.model.generated.ReflnsShell::new).get();
    }

    public org.rcsb.cif.model.generated.Software getSoftware() {
        return (org.rcsb.cif.model.generated.Software) categories.computeIfAbsent("software",
                org.rcsb.cif.model.generated.Software::new).get();
    }

    public org.rcsb.cif.model.generated.Struct getStruct() {
        return (org.rcsb.cif.model.generated.Struct) categories.computeIfAbsent("struct",
                org.rcsb.cif.model.generated.Struct::new).get();
    }

    public org.rcsb.cif.model.generated.StructAsym getStructAsym() {
        return (org.rcsb.cif.model.generated.StructAsym) categories.computeIfAbsent("struct_asym",
                org.rcsb.cif.model.generated.StructAsym::new).get();
    }

    public org.rcsb.cif.model.generated.StructBiol getStructBiol() {
        return (org.rcsb.cif.model.generated.StructBiol) categories.computeIfAbsent("struct_biol",
                org.rcsb.cif.model.generated.StructBiol::new).get();
    }

    public org.rcsb.cif.model.generated.StructBiolGen getStructBiolGen() {
        return (org.rcsb.cif.model.generated.StructBiolGen) categories.computeIfAbsent("struct_biol_gen",
                org.rcsb.cif.model.generated.StructBiolGen::new).get();
    }

    public org.rcsb.cif.model.generated.StructBiolKeywords getStructBiolKeywords() {
        return (org.rcsb.cif.model.generated.StructBiolKeywords) categories.computeIfAbsent("struct_biol_keywords",
                org.rcsb.cif.model.generated.StructBiolKeywords::new).get();
    }

    public org.rcsb.cif.model.generated.StructBiolView getStructBiolView() {
        return (org.rcsb.cif.model.generated.StructBiolView) categories.computeIfAbsent("struct_biol_view",
                org.rcsb.cif.model.generated.StructBiolView::new).get();
    }

    public org.rcsb.cif.model.generated.StructConf getStructConf() {
        return (org.rcsb.cif.model.generated.StructConf) categories.computeIfAbsent("struct_conf",
                org.rcsb.cif.model.generated.StructConf::new).get();
    }

    public org.rcsb.cif.model.generated.StructConfType getStructConfType() {
        return (org.rcsb.cif.model.generated.StructConfType) categories.computeIfAbsent("struct_conf_type",
                org.rcsb.cif.model.generated.StructConfType::new).get();
    }

    public org.rcsb.cif.model.generated.StructConn getStructConn() {
        return (org.rcsb.cif.model.generated.StructConn) categories.computeIfAbsent("struct_conn",
                org.rcsb.cif.model.generated.StructConn::new).get();
    }

    public org.rcsb.cif.model.generated.StructConnType getStructConnType() {
        return (org.rcsb.cif.model.generated.StructConnType) categories.computeIfAbsent("struct_conn_type",
                org.rcsb.cif.model.generated.StructConnType::new).get();
    }

    public org.rcsb.cif.model.generated.StructKeywords getStructKeywords() {
        return (org.rcsb.cif.model.generated.StructKeywords) categories.computeIfAbsent("struct_keywords",
                org.rcsb.cif.model.generated.StructKeywords::new).get();
    }

    public org.rcsb.cif.model.generated.StructMonDetails getStructMonDetails() {
        return (org.rcsb.cif.model.generated.StructMonDetails) categories.computeIfAbsent("struct_mon_details",
                org.rcsb.cif.model.generated.StructMonDetails::new).get();
    }

    public org.rcsb.cif.model.generated.StructMonNucl getStructMonNucl() {
        return (org.rcsb.cif.model.generated.StructMonNucl) categories.computeIfAbsent("struct_mon_nucl",
                org.rcsb.cif.model.generated.StructMonNucl::new).get();
    }

    public org.rcsb.cif.model.generated.StructMonProt getStructMonProt() {
        return (org.rcsb.cif.model.generated.StructMonProt) categories.computeIfAbsent("struct_mon_prot",
                org.rcsb.cif.model.generated.StructMonProt::new).get();
    }

    public org.rcsb.cif.model.generated.StructMonProtCis getStructMonProtCis() {
        return (org.rcsb.cif.model.generated.StructMonProtCis) categories.computeIfAbsent("struct_mon_prot_cis",
                org.rcsb.cif.model.generated.StructMonProtCis::new).get();
    }

    public org.rcsb.cif.model.generated.StructNcsDom getStructNcsDom() {
        return (org.rcsb.cif.model.generated.StructNcsDom) categories.computeIfAbsent("struct_ncs_dom",
                org.rcsb.cif.model.generated.StructNcsDom::new).get();
    }

    public org.rcsb.cif.model.generated.StructNcsDomLim getStructNcsDomLim() {
        return (org.rcsb.cif.model.generated.StructNcsDomLim) categories.computeIfAbsent("struct_ncs_dom_lim",
                org.rcsb.cif.model.generated.StructNcsDomLim::new).get();
    }

    public org.rcsb.cif.model.generated.StructNcsEns getStructNcsEns() {
        return (org.rcsb.cif.model.generated.StructNcsEns) categories.computeIfAbsent("struct_ncs_ens",
                org.rcsb.cif.model.generated.StructNcsEns::new).get();
    }

    public org.rcsb.cif.model.generated.StructNcsEnsGen getStructNcsEnsGen() {
        return (org.rcsb.cif.model.generated.StructNcsEnsGen) categories.computeIfAbsent("struct_ncs_ens_gen",
                org.rcsb.cif.model.generated.StructNcsEnsGen::new).get();
    }

    public org.rcsb.cif.model.generated.StructNcsOper getStructNcsOper() {
        return (org.rcsb.cif.model.generated.StructNcsOper) categories.computeIfAbsent("struct_ncs_oper",
                org.rcsb.cif.model.generated.StructNcsOper::new).get();
    }

    public org.rcsb.cif.model.generated.StructRef getStructRef() {
        return (org.rcsb.cif.model.generated.StructRef) categories.computeIfAbsent("struct_ref",
                org.rcsb.cif.model.generated.StructRef::new).get();
    }

    public org.rcsb.cif.model.generated.StructRefSeq getStructRefSeq() {
        return (org.rcsb.cif.model.generated.StructRefSeq) categories.computeIfAbsent("struct_ref_seq",
                org.rcsb.cif.model.generated.StructRefSeq::new).get();
    }

    public org.rcsb.cif.model.generated.StructRefSeqDif getStructRefSeqDif() {
        return (org.rcsb.cif.model.generated.StructRefSeqDif) categories.computeIfAbsent("struct_ref_seq_dif",
                org.rcsb.cif.model.generated.StructRefSeqDif::new).get();
    }

    public org.rcsb.cif.model.generated.StructSheet getStructSheet() {
        return (org.rcsb.cif.model.generated.StructSheet) categories.computeIfAbsent("struct_sheet",
                org.rcsb.cif.model.generated.StructSheet::new).get();
    }

    public org.rcsb.cif.model.generated.StructSheetHbond getStructSheetHbond() {
        return (org.rcsb.cif.model.generated.StructSheetHbond) categories.computeIfAbsent("struct_sheet_hbond",
                org.rcsb.cif.model.generated.StructSheetHbond::new).get();
    }

    public org.rcsb.cif.model.generated.StructSheetOrder getStructSheetOrder() {
        return (org.rcsb.cif.model.generated.StructSheetOrder) categories.computeIfAbsent("struct_sheet_order",
                org.rcsb.cif.model.generated.StructSheetOrder::new).get();
    }

    public org.rcsb.cif.model.generated.StructSheetRange getStructSheetRange() {
        return (org.rcsb.cif.model.generated.StructSheetRange) categories.computeIfAbsent("struct_sheet_range",
                org.rcsb.cif.model.generated.StructSheetRange::new).get();
    }

    public org.rcsb.cif.model.generated.StructSheetTopology getStructSheetTopology() {
        return (org.rcsb.cif.model.generated.StructSheetTopology) categories.computeIfAbsent("struct_sheet_topology",
                org.rcsb.cif.model.generated.StructSheetTopology::new).get();
    }

    public org.rcsb.cif.model.generated.StructSite getStructSite() {
        return (org.rcsb.cif.model.generated.StructSite) categories.computeIfAbsent("struct_site",
                org.rcsb.cif.model.generated.StructSite::new).get();
    }

    public org.rcsb.cif.model.generated.StructSiteGen getStructSiteGen() {
        return (org.rcsb.cif.model.generated.StructSiteGen) categories.computeIfAbsent("struct_site_gen",
                org.rcsb.cif.model.generated.StructSiteGen::new).get();
    }

    public org.rcsb.cif.model.generated.StructSiteKeywords getStructSiteKeywords() {
        return (org.rcsb.cif.model.generated.StructSiteKeywords) categories.computeIfAbsent("struct_site_keywords",
                org.rcsb.cif.model.generated.StructSiteKeywords::new).get();
    }

    public org.rcsb.cif.model.generated.StructSiteView getStructSiteView() {
        return (org.rcsb.cif.model.generated.StructSiteView) categories.computeIfAbsent("struct_site_view",
                org.rcsb.cif.model.generated.StructSiteView::new).get();
    }

    public org.rcsb.cif.model.generated.Symmetry getSymmetry() {
        return (org.rcsb.cif.model.generated.Symmetry) categories.computeIfAbsent("symmetry",
                org.rcsb.cif.model.generated.Symmetry::new).get();
    }

    public org.rcsb.cif.model.generated.SymmetryEquiv getSymmetryEquiv() {
        return (org.rcsb.cif.model.generated.SymmetryEquiv) categories.computeIfAbsent("symmetry_equiv",
                org.rcsb.cif.model.generated.SymmetryEquiv::new).get();
    }

    public org.rcsb.cif.model.generated.AuditLink getAuditLink() {
        return (org.rcsb.cif.model.generated.AuditLink) categories.computeIfAbsent("audit_link",
                org.rcsb.cif.model.generated.AuditLink::new).get();
    }

    public org.rcsb.cif.model.generated.DiffrnReflnsClass getDiffrnReflnsClass() {
        return (org.rcsb.cif.model.generated.DiffrnReflnsClass) categories.computeIfAbsent("diffrn_reflns_class",
                org.rcsb.cif.model.generated.DiffrnReflnsClass::new).get();
    }

    public org.rcsb.cif.model.generated.RefineLsClass getRefineLsClass() {
        return (org.rcsb.cif.model.generated.RefineLsClass) categories.computeIfAbsent("refine_ls_class",
                org.rcsb.cif.model.generated.RefineLsClass::new).get();
    }

    public org.rcsb.cif.model.generated.ReflnsClass getReflnsClass() {
        return (org.rcsb.cif.model.generated.ReflnsClass) categories.computeIfAbsent("reflns_class",
                org.rcsb.cif.model.generated.ReflnsClass::new).get();
    }

    public org.rcsb.cif.model.generated.SpaceGroup getSpaceGroup() {
        return (org.rcsb.cif.model.generated.SpaceGroup) categories.computeIfAbsent("space_group",
                org.rcsb.cif.model.generated.SpaceGroup::new).get();
    }

    public org.rcsb.cif.model.generated.SpaceGroupSymop getSpaceGroupSymop() {
        return (org.rcsb.cif.model.generated.SpaceGroupSymop) categories.computeIfAbsent("space_group_symop",
                org.rcsb.cif.model.generated.SpaceGroupSymop::new).get();
    }

    public org.rcsb.cif.model.generated.ValenceParam getValenceParam() {
        return (org.rcsb.cif.model.generated.ValenceParam) categories.computeIfAbsent("valence_param",
                org.rcsb.cif.model.generated.ValenceParam::new).get();
    }

    public org.rcsb.cif.model.generated.ValenceRef getValenceRef() {
        return (org.rcsb.cif.model.generated.ValenceRef) categories.computeIfAbsent("valence_ref",
                org.rcsb.cif.model.generated.ValenceRef::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAudit getPdbxAudit() {
        return (org.rcsb.cif.model.generated.PdbxAudit) categories.computeIfAbsent("pdbx_audit",
                org.rcsb.cif.model.generated.PdbxAudit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxVersion getPdbxVersion() {
        return (org.rcsb.cif.model.generated.PdbxVersion) categories.computeIfAbsent("pdbx_version",
                org.rcsb.cif.model.generated.PdbxVersion::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditAuthor getPdbxAuditAuthor() {
        return (org.rcsb.cif.model.generated.PdbxAuditAuthor) categories.computeIfAbsent("pdbx_audit_author",
                org.rcsb.cif.model.generated.PdbxAuditAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseMessage getPdbxDatabaseMessage() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseMessage) categories.computeIfAbsent("pdbx_database_message",
                org.rcsb.cif.model.generated.PdbxDatabaseMessage::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr) categories.computeIfAbsent("pdbx_database_PDB_obs_spr",
                org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseProc getPdbxDatabaseProc() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseProc) categories.computeIfAbsent("pdbx_database_proc",
                org.rcsb.cif.model.generated.PdbxDatabaseProc::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseRemark getPdbxDatabaseRemark() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseRemark) categories.computeIfAbsent("pdbx_database_remark",
                org.rcsb.cif.model.generated.PdbxDatabaseRemark::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseStatus getPdbxDatabaseStatus() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseStatus) categories.computeIfAbsent("pdbx_database_status",
                org.rcsb.cif.model.generated.PdbxDatabaseStatus::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityName getPdbxEntityName() {
        return (org.rcsb.cif.model.generated.PdbxEntityName) categories.computeIfAbsent("pdbx_entity_name",
                org.rcsb.cif.model.generated.PdbxEntityName::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPrereleaseSeq getPdbxPrereleaseSeq() {
        return (org.rcsb.cif.model.generated.PdbxPrereleaseSeq) categories.computeIfAbsent("pdbx_prerelease_seq",
                org.rcsb.cif.model.generated.PdbxPrereleaseSeq::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPolySeqScheme getPdbxPolySeqScheme() {
        return (org.rcsb.cif.model.generated.PdbxPolySeqScheme) categories.computeIfAbsent("pdbx_poly_seq_scheme",
                org.rcsb.cif.model.generated.PdbxPolySeqScheme::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return (org.rcsb.cif.model.generated.PdbxNonpolyScheme) categories.computeIfAbsent("pdbx_nonpoly_scheme",
                org.rcsb.cif.model.generated.PdbxNonpolyScheme::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefine getPdbxRefine() {
        return (org.rcsb.cif.model.generated.PdbxRefine) categories.computeIfAbsent("pdbx_refine",
                org.rcsb.cif.model.generated.PdbxRefine::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructSheetHbond getPdbxStructSheetHbond() {
        return (org.rcsb.cif.model.generated.PdbxStructSheetHbond) categories.computeIfAbsent("pdbx_struct_sheet_hbond",
                org.rcsb.cif.model.generated.PdbxStructSheetHbond::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxXplorFile getPdbxXplorFile() {
        return (org.rcsb.cif.model.generated.PdbxXplorFile) categories.computeIfAbsent("pdbx_xplor_file",
                org.rcsb.cif.model.generated.PdbxXplorFile::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefineAuxFile getPdbxRefineAuxFile() {
        return (org.rcsb.cif.model.generated.PdbxRefineAuxFile) categories.computeIfAbsent("pdbx_refine_aux_file",
                org.rcsb.cif.model.generated.PdbxRefineAuxFile::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseRelated getPdbxDatabaseRelated() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseRelated) categories.computeIfAbsent("pdbx_database_related",
                org.rcsb.cif.model.generated.PdbxDatabaseRelated::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityAssembly getPdbxEntityAssembly() {
        return (org.rcsb.cif.model.generated.PdbxEntityAssembly) categories.computeIfAbsent("pdbx_entity_assembly",
                org.rcsb.cif.model.generated.PdbxEntityAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp) categories.computeIfAbsent("pdbx_exptl_crystal_grow_comp",
                org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol) categories.computeIfAbsent("pdbx_exptl_crystal_grow_sol",
                org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment) categories.computeIfAbsent("pdbx_exptl_crystal_cryo_treatment",
                org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefineTls getPdbxRefineTls() {
        return (org.rcsb.cif.model.generated.PdbxRefineTls) categories.computeIfAbsent("pdbx_refine_tls",
                org.rcsb.cif.model.generated.PdbxRefineTls::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefineTlsGroup getPdbxRefineTlsGroup() {
        return (org.rcsb.cif.model.generated.PdbxRefineTlsGroup) categories.computeIfAbsent("pdbx_refine_tls_group",
                org.rcsb.cif.model.generated.PdbxRefineTlsGroup::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxContactAuthor getPdbxContactAuthor() {
        return (org.rcsb.cif.model.generated.PdbxContactAuthor) categories.computeIfAbsent("pdbx_contact_author",
                org.rcsb.cif.model.generated.PdbxContactAuthor::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSGProject getPdbxSGProject() {
        return (org.rcsb.cif.model.generated.PdbxSGProject) categories.computeIfAbsent("pdbx_SG_project",
                org.rcsb.cif.model.generated.PdbxSGProject::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls() {
        return (org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls) categories.computeIfAbsent("pdbx_atom_site_aniso_tls",
                org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrDetails getPdbxNmrDetails() {
        return (org.rcsb.cif.model.generated.PdbxNmrDetails) categories.computeIfAbsent("pdbx_nmr_details",
                org.rcsb.cif.model.generated.PdbxNmrDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSampleDetails getPdbxNmrSampleDetails() {
        return (org.rcsb.cif.model.generated.PdbxNmrSampleDetails) categories.computeIfAbsent("pdbx_nmr_sample_details",
                org.rcsb.cif.model.generated.PdbxNmrSampleDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptlSample getPdbxNmrExptlSample() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptlSample) categories.computeIfAbsent("pdbx_nmr_exptl_sample",
                org.rcsb.cif.model.generated.PdbxNmrExptlSample::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions) categories.computeIfAbsent("pdbx_nmr_exptl_sample_conditions",
                org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectrometer getPdbxNmrSpectrometer() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectrometer) categories.computeIfAbsent("pdbx_nmr_spectrometer",
                org.rcsb.cif.model.generated.PdbxNmrSpectrometer::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptl getPdbxNmrExptl() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptl) categories.computeIfAbsent("pdbx_nmr_exptl",
                org.rcsb.cif.model.generated.PdbxNmrExptl::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSoftware getPdbxNmrSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrSoftware) categories.computeIfAbsent("pdbx_nmr_software",
                org.rcsb.cif.model.generated.PdbxNmrSoftware::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrConstraints getPdbxNmrConstraints() {
        return (org.rcsb.cif.model.generated.PdbxNmrConstraints) categories.computeIfAbsent("pdbx_nmr_constraints",
                org.rcsb.cif.model.generated.PdbxNmrConstraints::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrEnsemble getPdbxNmrEnsemble() {
        return (org.rcsb.cif.model.generated.PdbxNmrEnsemble) categories.computeIfAbsent("pdbx_nmr_ensemble",
                org.rcsb.cif.model.generated.PdbxNmrEnsemble::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms() {
        return (org.rcsb.cif.model.generated.PdbxNmrEnsembleRms) categories.computeIfAbsent("pdbx_nmr_ensemble_rms",
                org.rcsb.cif.model.generated.PdbxNmrEnsembleRms::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrRepresentative getPdbxNmrRepresentative() {
        return (org.rcsb.cif.model.generated.PdbxNmrRepresentative) categories.computeIfAbsent("pdbx_nmr_representative",
                org.rcsb.cif.model.generated.PdbxNmrRepresentative::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrRefine getPdbxNmrRefine() {
        return (org.rcsb.cif.model.generated.PdbxNmrRefine) categories.computeIfAbsent("pdbx_nmr_refine",
                org.rcsb.cif.model.generated.PdbxNmrRefine::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrForceConstants getPdbxNmrForceConstants() {
        return (org.rcsb.cif.model.generated.PdbxNmrForceConstants) categories.computeIfAbsent("pdbx_nmr_force_constants",
                org.rcsb.cif.model.generated.PdbxNmrForceConstants::new).get();
    }

    public org.rcsb.cif.model.generated.NdbStructConfNa getNdbStructConfNa() {
        return (org.rcsb.cif.model.generated.NdbStructConfNa) categories.computeIfAbsent("ndb_struct_conf_na",
                org.rcsb.cif.model.generated.NdbStructConfNa::new).get();
    }

    public org.rcsb.cif.model.generated.NdbStructFeatureNa getNdbStructFeatureNa() {
        return (org.rcsb.cif.model.generated.NdbStructFeatureNa) categories.computeIfAbsent("ndb_struct_feature_na",
                org.rcsb.cif.model.generated.NdbStructFeatureNa::new).get();
    }

    public org.rcsb.cif.model.generated.NdbStructNaBasePair getNdbStructNaBasePair() {
        return (org.rcsb.cif.model.generated.NdbStructNaBasePair) categories.computeIfAbsent("ndb_struct_na_base_pair",
                org.rcsb.cif.model.generated.NdbStructNaBasePair::new).get();
    }

    public org.rcsb.cif.model.generated.NdbStructNaBasePairStep getNdbStructNaBasePairStep() {
        return (org.rcsb.cif.model.generated.NdbStructNaBasePairStep) categories.computeIfAbsent("ndb_struct_na_base_pair_step",
                org.rcsb.cif.model.generated.NdbStructNaBasePairStep::new).get();
    }

    public org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates() {
        return (org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates) categories.computeIfAbsent("ndb_original_ndb_coordinates",
                org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityNonpoly getPdbxEntityNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxEntityNonpoly) categories.computeIfAbsent("pdbx_entity_nonpoly",
                org.rcsb.cif.model.generated.PdbxEntityNonpoly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingDm getPdbxPhasingDm() {
        return (org.rcsb.cif.model.generated.PdbxPhasingDm) categories.computeIfAbsent("pdbx_phasing_dm",
                org.rcsb.cif.model.generated.PdbxPhasingDm::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingDmShell getPdbxPhasingDmShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingDmShell) categories.computeIfAbsent("pdbx_phasing_dm_shell",
                org.rcsb.cif.model.generated.PdbxPhasingDmShell::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADShell getPdbxPhasingMADShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADShell) categories.computeIfAbsent("pdbx_phasing_MAD_shell",
                org.rcsb.cif.model.generated.PdbxPhasingMADShell::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSet getPdbxPhasingMADSet() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSet) categories.computeIfAbsent("pdbx_phasing_MAD_set",
                org.rcsb.cif.model.generated.PdbxPhasingMADSet::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSetShell) categories.computeIfAbsent("pdbx_phasing_MAD_set_shell",
                org.rcsb.cif.model.generated.PdbxPhasingMADSetShell::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSetSite) categories.computeIfAbsent("pdbx_phasing_MAD_set_site",
                org.rcsb.cif.model.generated.PdbxPhasingMADSetSite::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMR getPdbxPhasingMR() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMR) categories.computeIfAbsent("pdbx_phasing_MR",
                org.rcsb.cif.model.generated.PdbxPhasingMR::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefineComponent getPdbxRefineComponent() {
        return (org.rcsb.cif.model.generated.PdbxRefineComponent) categories.computeIfAbsent("pdbx_refine_component",
                org.rcsb.cif.model.generated.PdbxRefineComponent::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityProdProtocol getPdbxEntityProdProtocol() {
        return (org.rcsb.cif.model.generated.PdbxEntityProdProtocol) categories.computeIfAbsent("pdbx_entity_prod_protocol",
                org.rcsb.cif.model.generated.PdbxEntityProdProtocol::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other_parameter",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr) categories.computeIfAbsent("pdbx_entity_src_gen_prod_pcr",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest) categories.computeIfAbsent("pdbx_entity_src_gen_prod_digest",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenClone) categories.computeIfAbsent("pdbx_entity_src_gen_clone",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenClone::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation) categories.computeIfAbsent("pdbx_entity_src_gen_clone_ligation",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination) categories.computeIfAbsent("pdbx_entity_src_gen_clone_recombination",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress) categories.computeIfAbsent("pdbx_entity_src_gen_express",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint) categories.computeIfAbsent("pdbx_entity_src_gen_express_timepoint",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis) categories.computeIfAbsent("pdbx_entity_src_gen_lysis",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold) categories.computeIfAbsent("pdbx_entity_src_gen_refold",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis) categories.computeIfAbsent("pdbx_entity_src_gen_proteolysis",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom) categories.computeIfAbsent("pdbx_entity_src_gen_chrom",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenFract) categories.computeIfAbsent("pdbx_entity_src_gen_fract",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenFract::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenPure) categories.computeIfAbsent("pdbx_entity_src_gen_pure",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenPure::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter) categories.computeIfAbsent("pdbx_entity_src_gen_character",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConstruct getPdbxConstruct() {
        return (org.rcsb.cif.model.generated.PdbxConstruct) categories.computeIfAbsent("pdbx_construct",
                org.rcsb.cif.model.generated.PdbxConstruct::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConstructFeature getPdbxConstructFeature() {
        return (org.rcsb.cif.model.generated.PdbxConstructFeature) categories.computeIfAbsent("pdbx_construct_feature",
                org.rcsb.cif.model.generated.PdbxConstructFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRobotSystem getPdbxRobotSystem() {
        return (org.rcsb.cif.model.generated.PdbxRobotSystem) categories.computeIfAbsent("pdbx_robot_system",
                org.rcsb.cif.model.generated.PdbxRobotSystem::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxBuffer getPdbxBuffer() {
        return (org.rcsb.cif.model.generated.PdbxBuffer) categories.computeIfAbsent("pdbx_buffer",
                org.rcsb.cif.model.generated.PdbxBuffer::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxBufferComponents getPdbxBufferComponents() {
        return (org.rcsb.cif.model.generated.PdbxBufferComponents) categories.computeIfAbsent("pdbx_buffer_components",
                org.rcsb.cif.model.generated.PdbxBufferComponents::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDomain getPdbxDomain() {
        return (org.rcsb.cif.model.generated.PdbxDomain) categories.computeIfAbsent("pdbx_domain",
                org.rcsb.cif.model.generated.PdbxDomain::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDomainRange getPdbxDomainRange() {
        return (org.rcsb.cif.model.generated.PdbxDomainRange) categories.computeIfAbsent("pdbx_domain_range",
                org.rcsb.cif.model.generated.PdbxDomainRange::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSequenceRange getPdbxSequenceRange() {
        return (org.rcsb.cif.model.generated.PdbxSequenceRange) categories.computeIfAbsent("pdbx_sequence_range",
                org.rcsb.cif.model.generated.PdbxSequenceRange::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFeatureEntry getPdbxFeatureEntry() {
        return (org.rcsb.cif.model.generated.PdbxFeatureEntry) categories.computeIfAbsent("pdbx_feature_entry",
                org.rcsb.cif.model.generated.PdbxFeatureEntry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFeatureDomain getPdbxFeatureDomain() {
        return (org.rcsb.cif.model.generated.PdbxFeatureDomain) categories.computeIfAbsent("pdbx_feature_domain",
                org.rcsb.cif.model.generated.PdbxFeatureDomain::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange() {
        return (org.rcsb.cif.model.generated.PdbxFeatureSequenceRange) categories.computeIfAbsent("pdbx_feature_sequence_range",
                org.rcsb.cif.model.generated.PdbxFeatureSequenceRange::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFeatureAssembly getPdbxFeatureAssembly() {
        return (org.rcsb.cif.model.generated.PdbxFeatureAssembly) categories.computeIfAbsent("pdbx_feature_assembly",
                org.rcsb.cif.model.generated.PdbxFeatureAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFeatureMonomer getPdbxFeatureMonomer() {
        return (org.rcsb.cif.model.generated.PdbxFeatureMonomer) categories.computeIfAbsent("pdbx_feature_monomer",
                org.rcsb.cif.model.generated.PdbxFeatureMonomer::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxExptlPd getPdbxExptlPd() {
        return (org.rcsb.cif.model.generated.PdbxExptlPd) categories.computeIfAbsent("pdbx_exptl_pd",
                org.rcsb.cif.model.generated.PdbxExptlPd::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReflnsTwin getPdbxReflnsTwin() {
        return (org.rcsb.cif.model.generated.PdbxReflnsTwin) categories.computeIfAbsent("pdbx_reflns_twin",
                org.rcsb.cif.model.generated.PdbxReflnsTwin::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructInfo getPdbxStructInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructInfo) categories.computeIfAbsent("pdbx_struct_info",
                org.rcsb.cif.model.generated.PdbxStructInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReRefinement getPdbxReRefinement() {
        return (org.rcsb.cif.model.generated.PdbxReRefinement) categories.computeIfAbsent("pdbx_re_refinement",
                org.rcsb.cif.model.generated.PdbxReRefinement::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyProp getPdbxStructAssemblyProp() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyProp) categories.computeIfAbsent("pdbx_struct_assembly_prop",
                org.rcsb.cif.model.generated.PdbxStructAssemblyProp::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqFeature) categories.computeIfAbsent("pdbx_struct_ref_seq_feature",
                org.rcsb.cif.model.generated.PdbxStructRefSeqFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp) categories.computeIfAbsent("pdbx_struct_ref_seq_feature_prop",
                org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics() {
        return (org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics) categories.computeIfAbsent("pdbx_struct_chem_comp_diagnostics",
                org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompFeature getPdbxChemCompFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompFeature) categories.computeIfAbsent("pdbx_chem_comp_feature",
                org.rcsb.cif.model.generated.PdbxChemCompFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxCoordinateModel getPdbxCoordinateModel() {
        return (org.rcsb.cif.model.generated.PdbxCoordinateModel) categories.computeIfAbsent("pdbx_coordinate_model",
                org.rcsb.cif.model.generated.PdbxCoordinateModel::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructChemCompFeature getPdbxStructChemCompFeature() {
        return (org.rcsb.cif.model.generated.PdbxStructChemCompFeature) categories.computeIfAbsent("pdbx_struct_chem_comp_feature",
                org.rcsb.cif.model.generated.PdbxStructChemCompFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell() {
        return (org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell) categories.computeIfAbsent("pdbx_diffrn_reflns_shell",
                org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxBondDistanceLimits getPdbxBondDistanceLimits() {
        return (org.rcsb.cif.model.generated.PdbxBondDistanceLimits) categories.computeIfAbsent("pdbx_bond_distance_limits",
                org.rcsb.cif.model.generated.PdbxBondDistanceLimits::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSolnScatter getPdbxSolnScatter() {
        return (org.rcsb.cif.model.generated.PdbxSolnScatter) categories.computeIfAbsent("pdbx_soln_scatter",
                org.rcsb.cif.model.generated.PdbxSolnScatter::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSolnScatterModel getPdbxSolnScatterModel() {
        return (org.rcsb.cif.model.generated.PdbxSolnScatterModel) categories.computeIfAbsent("pdbx_soln_scatter_model",
                org.rcsb.cif.model.generated.PdbxSolnScatterModel::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompDescriptor getPdbxChemCompDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxChemCompDescriptor) categories.computeIfAbsent("pdbx_chem_comp_descriptor",
                org.rcsb.cif.model.generated.PdbxChemCompDescriptor::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return (org.rcsb.cif.model.generated.PdbxChemCompIdentifier) categories.computeIfAbsent("pdbx_chem_comp_identifier",
                org.rcsb.cif.model.generated.PdbxChemCompIdentifier::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompImport getPdbxChemCompImport() {
        return (org.rcsb.cif.model.generated.PdbxChemCompImport) categories.computeIfAbsent("pdbx_chem_comp_import",
                org.rcsb.cif.model.generated.PdbxChemCompImport::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAtomEdit) categories.computeIfAbsent("pdbx_chem_comp_atom_edit",
                org.rcsb.cif.model.generated.PdbxChemCompAtomEdit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompBondEdit getPdbxChemCompBondEdit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompBondEdit) categories.computeIfAbsent("pdbx_chem_comp_bond_edit",
                org.rcsb.cif.model.generated.PdbxChemCompBondEdit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAudit getPdbxChemCompAudit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAudit) categories.computeIfAbsent("pdbx_chem_comp_audit",
                org.rcsb.cif.model.generated.PdbxChemCompAudit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateCloseContact getPdbxValidateCloseContact() {
        return (org.rcsb.cif.model.generated.PdbxValidateCloseContact) categories.computeIfAbsent("pdbx_validate_close_contact",
                org.rcsb.cif.model.generated.PdbxValidateCloseContact::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateSymmContact getPdbxValidateSymmContact() {
        return (org.rcsb.cif.model.generated.PdbxValidateSymmContact) categories.computeIfAbsent("pdbx_validate_symm_contact",
                org.rcsb.cif.model.generated.PdbxValidateSymmContact::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateRmsdBond getPdbxValidateRmsdBond() {
        return (org.rcsb.cif.model.generated.PdbxValidateRmsdBond) categories.computeIfAbsent("pdbx_validate_rmsd_bond",
                org.rcsb.cif.model.generated.PdbxValidateRmsdBond::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle() {
        return (org.rcsb.cif.model.generated.PdbxValidateRmsdAngle) categories.computeIfAbsent("pdbx_validate_rmsd_angle",
                org.rcsb.cif.model.generated.PdbxValidateRmsdAngle::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateTorsion getPdbxValidateTorsion() {
        return (org.rcsb.cif.model.generated.PdbxValidateTorsion) categories.computeIfAbsent("pdbx_validate_torsion",
                org.rcsb.cif.model.generated.PdbxValidateTorsion::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega() {
        return (org.rcsb.cif.model.generated.PdbxValidatePeptideOmega) categories.computeIfAbsent("pdbx_validate_peptide_omega",
                org.rcsb.cif.model.generated.PdbxValidatePeptideOmega::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateChiral getPdbxValidateChiral() {
        return (org.rcsb.cif.model.generated.PdbxValidateChiral) categories.computeIfAbsent("pdbx_validate_chiral",
                org.rcsb.cif.model.generated.PdbxValidateChiral::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidatePlanes getPdbxValidatePlanes() {
        return (org.rcsb.cif.model.generated.PdbxValidatePlanes) categories.computeIfAbsent("pdbx_validate_planes",
                org.rcsb.cif.model.generated.PdbxValidatePlanes::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom() {
        return (org.rcsb.cif.model.generated.PdbxValidatePlanesAtom) categories.computeIfAbsent("pdbx_validate_planes_atom",
                org.rcsb.cif.model.generated.PdbxValidatePlanesAtom::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane() {
        return (org.rcsb.cif.model.generated.PdbxValidateMainChainPlane) categories.computeIfAbsent("pdbx_validate_main_chain_plane",
                org.rcsb.cif.model.generated.PdbxValidateMainChainPlane::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructConnAngle getPdbxStructConnAngle() {
        return (org.rcsb.cif.model.generated.PdbxStructConnAngle) categories.computeIfAbsent("pdbx_struct_conn_angle",
                org.rcsb.cif.model.generated.PdbxStructConnAngle::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues() {
        return (org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_residues",
                org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms() {
        return (org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_atoms",
                org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntryDetails getPdbxEntryDetails() {
        return (org.rcsb.cif.model.generated.PdbxEntryDetails) categories.computeIfAbsent("pdbx_entry_details",
                org.rcsb.cif.model.generated.PdbxEntryDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructModResidue getPdbxStructModResidue() {
        return (org.rcsb.cif.model.generated.PdbxStructModResidue) categories.computeIfAbsent("pdbx_struct_mod_residue",
                org.rcsb.cif.model.generated.PdbxStructModResidue::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion) categories.computeIfAbsent("pdbx_struct_ref_seq_insertion",
                org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion) categories.computeIfAbsent("pdbx_struct_ref_seq_deletion",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping() {
        return (org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping) categories.computeIfAbsent("pdbx_remediation_atom_site_mapping",
                org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage() {
        return (org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage) categories.computeIfAbsent("pdbx_validate_polymer_linkage",
                org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxHelicalSymmetry getPdbxHelicalSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxHelicalSymmetry) categories.computeIfAbsent("pdbx_helical_symmetry",
                org.rcsb.cif.model.generated.PdbxHelicalSymmetry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPointSymmetry getPdbxPointSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxPointSymmetry) categories.computeIfAbsent("pdbx_point_symmetry",
                org.rcsb.cif.model.generated.PdbxPointSymmetry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructEntityInst getPdbxStructEntityInst() {
        return (org.rcsb.cif.model.generated.PdbxStructEntityInst) categories.computeIfAbsent("pdbx_struct_entity_inst",
                org.rcsb.cif.model.generated.PdbxStructEntityInst::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructOperList getPdbxStructOperList() {
        return (org.rcsb.cif.model.generated.PdbxStructOperList) categories.computeIfAbsent("pdbx_struct_oper_list",
                org.rcsb.cif.model.generated.PdbxStructOperList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssembly getPdbxStructAssembly() {
        return (org.rcsb.cif.model.generated.PdbxStructAssembly) categories.computeIfAbsent("pdbx_struct_assembly",
                org.rcsb.cif.model.generated.PdbxStructAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyGen) categories.computeIfAbsent("pdbx_struct_assembly_gen",
                org.rcsb.cif.model.generated.PdbxStructAssemblyGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAsymGen getPdbxStructAsymGen() {
        return (org.rcsb.cif.model.generated.PdbxStructAsymGen) categories.computeIfAbsent("pdbx_struct_asym_gen",
                org.rcsb.cif.model.generated.PdbxStructAsymGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructMsymGen getPdbxStructMsymGen() {
        return (org.rcsb.cif.model.generated.PdbxStructMsymGen) categories.computeIfAbsent("pdbx_struct_msym_gen",
                org.rcsb.cif.model.generated.PdbxStructMsymGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructLegacyOperList getPdbxStructLegacyOperList() {
        return (org.rcsb.cif.model.generated.PdbxStructLegacyOperList) categories.computeIfAbsent("pdbx_struct_legacy_oper_list",
                org.rcsb.cif.model.generated.PdbxStructLegacyOperList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAtomFeature) categories.computeIfAbsent("pdbx_chem_comp_atom_feature",
                org.rcsb.cif.model.generated.PdbxChemCompAtomFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily) categories.computeIfAbsent("pdbx_reference_molecule_family",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeList) categories.computeIfAbsent("pdbx_reference_molecule_list",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMolecule getPdbxReferenceMolecule() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMolecule) categories.computeIfAbsent("pdbx_reference_molecule",
                org.rcsb.cif.model.generated.PdbxReferenceMolecule::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityList) categories.computeIfAbsent("pdbx_reference_entity_list",
                org.rcsb.cif.model.generated.PdbxReferenceEntityList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly) categories.computeIfAbsent("pdbx_reference_entity_nonpoly",
                org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityLink) categories.computeIfAbsent("pdbx_reference_entity_link",
                org.rcsb.cif.model.generated.PdbxReferenceEntityLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink) categories.computeIfAbsent("pdbx_reference_entity_poly_link",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPoly) categories.computeIfAbsent("pdbx_reference_entity_poly",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPoly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq) categories.computeIfAbsent("pdbx_reference_entity_poly_seq",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySequence) categories.computeIfAbsent("pdbx_reference_entity_sequence",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySequence::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat) categories.computeIfAbsent("pdbx_reference_entity_src_nat",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails) categories.computeIfAbsent("pdbx_reference_molecule_details",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms) categories.computeIfAbsent("pdbx_reference_molecule_synonyms",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents) categories.computeIfAbsent("pdbx_reference_entity_subcomponents",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation) categories.computeIfAbsent("pdbx_reference_molecule_annotation",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures) categories.computeIfAbsent("pdbx_reference_molecule_features",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures) categories.computeIfAbsent("pdbx_reference_molecule_related_structures",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupList getPdbxStructGroupList() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupList) categories.computeIfAbsent("pdbx_struct_group_list",
                org.rcsb.cif.model.generated.PdbxStructGroupList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupComponents getPdbxStructGroupComponents() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupComponents) categories.computeIfAbsent("pdbx_struct_group_components",
                org.rcsb.cif.model.generated.PdbxStructGroupComponents::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupComponentRange) categories.computeIfAbsent("pdbx_struct_group_component_range",
                org.rcsb.cif.model.generated.PdbxStructGroupComponentRange::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPrdAudit getPdbxPrdAudit() {
        return (org.rcsb.cif.model.generated.PdbxPrdAudit) categories.computeIfAbsent("pdbx_prd_audit",
                org.rcsb.cif.model.generated.PdbxPrdAudit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit() {
        return (org.rcsb.cif.model.generated.PdbxFamilyPrdAudit) categories.computeIfAbsent("pdbx_family_prd_audit",
                org.rcsb.cif.model.generated.PdbxFamilyPrdAudit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMolecule getPdbxMolecule() {
        return (org.rcsb.cif.model.generated.PdbxMolecule) categories.computeIfAbsent("pdbx_molecule",
                org.rcsb.cif.model.generated.PdbxMolecule::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return (org.rcsb.cif.model.generated.PdbxMoleculeFeatures) categories.computeIfAbsent("pdbx_molecule_features",
                org.rcsb.cif.model.generated.PdbxMoleculeFeatures::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex() {
        return (org.rcsb.cif.model.generated.PdbxFamilyGroupIndex) categories.computeIfAbsent("pdbx_family_group_index",
                org.rcsb.cif.model.generated.PdbxFamilyGroupIndex::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms() {
        return (org.rcsb.cif.model.generated.PdbxDistantSolventAtoms) categories.computeIfAbsent("pdbx_distant_solvent_atoms",
                org.rcsb.cif.model.generated.PdbxDistantSolventAtoms::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry) categories.computeIfAbsent("pdbx_struct_special_symmetry",
                org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferencePublicationList getPdbxReferencePublicationList() {
        return (org.rcsb.cif.model.generated.PdbxReferencePublicationList) categories.computeIfAbsent("pdbx_reference_publication_list",
                org.rcsb.cif.model.generated.PdbxReferencePublicationList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList() {
        return (org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList) categories.computeIfAbsent("pdbx_nmr_assigned_chem_shift_list",
                org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment) categories.computeIfAbsent("pdbx_nmr_chem_shift_experiment",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftRef) categories.computeIfAbsent("pdbx_nmr_chem_shift_ref",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftRef::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftReference) categories.computeIfAbsent("pdbx_nmr_chem_shift_reference",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftReference::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware) categories.computeIfAbsent("pdbx_nmr_chem_shift_software",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrConstraintFile getPdbxNmrConstraintFile() {
        return (org.rcsb.cif.model.generated.PdbxNmrConstraintFile) categories.computeIfAbsent("pdbx_nmr_constraint_file",
                org.rcsb.cif.model.generated.PdbxNmrConstraintFile::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask() {
        return (org.rcsb.cif.model.generated.PdbxNmrSoftwareTask) categories.computeIfAbsent("pdbx_nmr_software_task",
                org.rcsb.cif.model.generated.PdbxNmrSoftwareTask::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralDim getPdbxNmrSpectralDim() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralDim) categories.computeIfAbsent("pdbx_nmr_spectral_dim",
                org.rcsb.cif.model.generated.PdbxNmrSpectralDim::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList) categories.computeIfAbsent("pdbx_nmr_spectral_peak_list",
                org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware) categories.computeIfAbsent("pdbx_nmr_spectral_peak_software",
                org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset() {
        return (org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset) categories.computeIfAbsent("pdbx_nmr_systematic_chem_shift_offset",
                org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrUpload getPdbxNmrUpload() {
        return (org.rcsb.cif.model.generated.PdbxNmrUpload) categories.computeIfAbsent("pdbx_nmr_upload",
                org.rcsb.cif.model.generated.PdbxNmrUpload::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditSupport getPdbxAuditSupport() {
        return (org.rcsb.cif.model.generated.PdbxAuditSupport) categories.computeIfAbsent("pdbx_audit_support",
                org.rcsb.cif.model.generated.PdbxAuditSupport::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn() {
        return (org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_struct_conn",
                org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList() {
        return (org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_entity_list",
                org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList::new).get();
    }

    public org.rcsb.cif.model.generated.EntitySrcNat getEntitySrcNat() {
        return (org.rcsb.cif.model.generated.EntitySrcNat) categories.computeIfAbsent("entity_src_nat",
                org.rcsb.cif.model.generated.EntitySrcNat::new).get();
    }

    public org.rcsb.cif.model.generated.EntitySrcGen getEntitySrcGen() {
        return (org.rcsb.cif.model.generated.EntitySrcGen) categories.computeIfAbsent("entity_src_gen",
                org.rcsb.cif.model.generated.EntitySrcGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcSyn getPdbxEntitySrcSyn() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcSyn) categories.computeIfAbsent("pdbx_entity_src_syn",
                org.rcsb.cif.model.generated.PdbxEntitySrcSyn::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList) categories.computeIfAbsent("pdbx_entity_poly_comp_link_list",
                org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntity getPdbxLinkedEntity() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntity) categories.computeIfAbsent("pdbx_linked_entity",
                org.rcsb.cif.model.generated.PdbxLinkedEntity::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList) categories.computeIfAbsent("pdbx_linked_entity_instance_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityList getPdbxLinkedEntityList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityList) categories.computeIfAbsent("pdbx_linked_entity_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList) categories.computeIfAbsent("pdbx_linked_entity_link_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxEntityDescriptor) categories.computeIfAbsent("pdbx_entity_descriptor",
                org.rcsb.cif.model.generated.PdbxEntityDescriptor::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity) categories.computeIfAbsent("pdbx_reference_linked_entity",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_list",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_link",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink) categories.computeIfAbsent("pdbx_reference_linked_entity_link",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet() {
        return (org.rcsb.cif.model.generated.PdbxRelatedExpDataSet) categories.computeIfAbsent("pdbx_related_exp_data_set",
                org.rcsb.cif.model.generated.PdbxRelatedExpDataSet::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory) categories.computeIfAbsent("pdbx_database_status_history",
                org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory::new).get();
    }

    public org.rcsb.cif.model.generated.EmAssembly getEmAssembly() {
        return (org.rcsb.cif.model.generated.EmAssembly) categories.computeIfAbsent("em_assembly",
                org.rcsb.cif.model.generated.EmAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.EmEntityAssembly getEmEntityAssembly() {
        return (org.rcsb.cif.model.generated.EmEntityAssembly) categories.computeIfAbsent("em_entity_assembly",
                org.rcsb.cif.model.generated.EmEntityAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.EmVirusEntity getEmVirusEntity() {
        return (org.rcsb.cif.model.generated.EmVirusEntity) categories.computeIfAbsent("em_virus_entity",
                org.rcsb.cif.model.generated.EmVirusEntity::new).get();
    }

    public org.rcsb.cif.model.generated.EmSamplePreparation getEmSamplePreparation() {
        return (org.rcsb.cif.model.generated.EmSamplePreparation) categories.computeIfAbsent("em_sample_preparation",
                org.rcsb.cif.model.generated.EmSamplePreparation::new).get();
    }

    public org.rcsb.cif.model.generated.EmSampleSupport getEmSampleSupport() {
        return (org.rcsb.cif.model.generated.EmSampleSupport) categories.computeIfAbsent("em_sample_support",
                org.rcsb.cif.model.generated.EmSampleSupport::new).get();
    }

    public org.rcsb.cif.model.generated.EmBuffer getEmBuffer() {
        return (org.rcsb.cif.model.generated.EmBuffer) categories.computeIfAbsent("em_buffer",
                org.rcsb.cif.model.generated.EmBuffer::new).get();
    }

    public org.rcsb.cif.model.generated.EmVitrification getEmVitrification() {
        return (org.rcsb.cif.model.generated.EmVitrification) categories.computeIfAbsent("em_vitrification",
                org.rcsb.cif.model.generated.EmVitrification::new).get();
    }

    public org.rcsb.cif.model.generated.EmImaging getEmImaging() {
        return (org.rcsb.cif.model.generated.EmImaging) categories.computeIfAbsent("em_imaging",
                org.rcsb.cif.model.generated.EmImaging::new).get();
    }

    public org.rcsb.cif.model.generated.EmDetector getEmDetector() {
        return (org.rcsb.cif.model.generated.EmDetector) categories.computeIfAbsent("em_detector",
                org.rcsb.cif.model.generated.EmDetector::new).get();
    }

    public org.rcsb.cif.model.generated.EmImageScans getEmImageScans() {
        return (org.rcsb.cif.model.generated.EmImageScans) categories.computeIfAbsent("em_image_scans",
                org.rcsb.cif.model.generated.EmImageScans::new).get();
    }

    public org.rcsb.cif.model.generated.Em2dProjectionSelection getEm2dProjectionSelection() {
        return (org.rcsb.cif.model.generated.Em2dProjectionSelection) categories.computeIfAbsent("em_2d_projection_selection",
                org.rcsb.cif.model.generated.Em2dProjectionSelection::new).get();
    }

    public org.rcsb.cif.model.generated.Em3dReconstruction getEm3dReconstruction() {
        return (org.rcsb.cif.model.generated.Em3dReconstruction) categories.computeIfAbsent("em_3d_reconstruction",
                org.rcsb.cif.model.generated.Em3dReconstruction::new).get();
    }

    public org.rcsb.cif.model.generated.Em3dFitting getEm3dFitting() {
        return (org.rcsb.cif.model.generated.Em3dFitting) categories.computeIfAbsent("em_3d_fitting",
                org.rcsb.cif.model.generated.Em3dFitting::new).get();
    }

    public org.rcsb.cif.model.generated.Em3dFittingList getEm3dFittingList() {
        return (org.rcsb.cif.model.generated.Em3dFittingList) categories.computeIfAbsent("em_3d_fitting_list",
                org.rcsb.cif.model.generated.Em3dFittingList::new).get();
    }

    public org.rcsb.cif.model.generated.EmHelicalEntity getEmHelicalEntity() {
        return (org.rcsb.cif.model.generated.EmHelicalEntity) categories.computeIfAbsent("em_helical_entity",
                org.rcsb.cif.model.generated.EmHelicalEntity::new).get();
    }

    public org.rcsb.cif.model.generated.EmExperiment getEmExperiment() {
        return (org.rcsb.cif.model.generated.EmExperiment) categories.computeIfAbsent("em_experiment",
                org.rcsb.cif.model.generated.EmExperiment::new).get();
    }

    public org.rcsb.cif.model.generated.EmSingleParticleEntity getEmSingleParticleEntity() {
        return (org.rcsb.cif.model.generated.EmSingleParticleEntity) categories.computeIfAbsent("em_single_particle_entity",
                org.rcsb.cif.model.generated.EmSingleParticleEntity::new).get();
    }

    public org.rcsb.cif.model.generated.EmAdmin getEmAdmin() {
        return (org.rcsb.cif.model.generated.EmAdmin) categories.computeIfAbsent("em_admin",
                org.rcsb.cif.model.generated.EmAdmin::new).get();
    }

    public org.rcsb.cif.model.generated.EmAuthorList getEmAuthorList() {
        return (org.rcsb.cif.model.generated.EmAuthorList) categories.computeIfAbsent("em_author_list",
                org.rcsb.cif.model.generated.EmAuthorList::new).get();
    }

    public org.rcsb.cif.model.generated.EmDbReference getEmDbReference() {
        return (org.rcsb.cif.model.generated.EmDbReference) categories.computeIfAbsent("em_db_reference",
                org.rcsb.cif.model.generated.EmDbReference::new).get();
    }

    public org.rcsb.cif.model.generated.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary() {
        return (org.rcsb.cif.model.generated.EmDbReferenceAuxiliary) categories.computeIfAbsent("em_db_reference_auxiliary",
                org.rcsb.cif.model.generated.EmDbReferenceAuxiliary::new).get();
    }

    public org.rcsb.cif.model.generated.EmDepui getEmDepui() {
        return (org.rcsb.cif.model.generated.EmDepui) categories.computeIfAbsent("em_depui",
                org.rcsb.cif.model.generated.EmDepui::new).get();
    }

    public org.rcsb.cif.model.generated.EmObsolete getEmObsolete() {
        return (org.rcsb.cif.model.generated.EmObsolete) categories.computeIfAbsent("em_obsolete",
                org.rcsb.cif.model.generated.EmObsolete::new).get();
    }

    public org.rcsb.cif.model.generated.EmSupersede getEmSupersede() {
        return (org.rcsb.cif.model.generated.EmSupersede) categories.computeIfAbsent("em_supersede",
                org.rcsb.cif.model.generated.EmSupersede::new).get();
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyMolwt) categories.computeIfAbsent("em_entity_assembly_molwt",
                org.rcsb.cif.model.generated.EmEntityAssemblyMolwt::new).get();
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource) categories.computeIfAbsent("em_entity_assembly_naturalsource",
                org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource::new).get();
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant) categories.computeIfAbsent("em_entity_assembly_recombinant",
                org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant::new).get();
    }

    public org.rcsb.cif.model.generated.EmVirusNaturalHost getEmVirusNaturalHost() {
        return (org.rcsb.cif.model.generated.EmVirusNaturalHost) categories.computeIfAbsent("em_virus_natural_host",
                org.rcsb.cif.model.generated.EmVirusNaturalHost::new).get();
    }

    public org.rcsb.cif.model.generated.EmVirusShell getEmVirusShell() {
        return (org.rcsb.cif.model.generated.EmVirusShell) categories.computeIfAbsent("em_virus_shell",
                org.rcsb.cif.model.generated.EmVirusShell::new).get();
    }

    public org.rcsb.cif.model.generated.EmSpecimen getEmSpecimen() {
        return (org.rcsb.cif.model.generated.EmSpecimen) categories.computeIfAbsent("em_specimen",
                org.rcsb.cif.model.generated.EmSpecimen::new).get();
    }

    public org.rcsb.cif.model.generated.EmEmbedding getEmEmbedding() {
        return (org.rcsb.cif.model.generated.EmEmbedding) categories.computeIfAbsent("em_embedding",
                org.rcsb.cif.model.generated.EmEmbedding::new).get();
    }

    public org.rcsb.cif.model.generated.EmFiducialMarkers getEmFiducialMarkers() {
        return (org.rcsb.cif.model.generated.EmFiducialMarkers) categories.computeIfAbsent("em_fiducial_markers",
                org.rcsb.cif.model.generated.EmFiducialMarkers::new).get();
    }

    public org.rcsb.cif.model.generated.EmFocusedIonBeam getEmFocusedIonBeam() {
        return (org.rcsb.cif.model.generated.EmFocusedIonBeam) categories.computeIfAbsent("em_focused_ion_beam",
                org.rcsb.cif.model.generated.EmFocusedIonBeam::new).get();
    }

    public org.rcsb.cif.model.generated.EmGridPretreatment getEmGridPretreatment() {
        return (org.rcsb.cif.model.generated.EmGridPretreatment) categories.computeIfAbsent("em_grid_pretreatment",
                org.rcsb.cif.model.generated.EmGridPretreatment::new).get();
    }

    public org.rcsb.cif.model.generated.EmUltramicrotomy getEmUltramicrotomy() {
        return (org.rcsb.cif.model.generated.EmUltramicrotomy) categories.computeIfAbsent("em_ultramicrotomy",
                org.rcsb.cif.model.generated.EmUltramicrotomy::new).get();
    }

    public org.rcsb.cif.model.generated.EmHighPressureFreezing getEmHighPressureFreezing() {
        return (org.rcsb.cif.model.generated.EmHighPressureFreezing) categories.computeIfAbsent("em_high_pressure_freezing",
                org.rcsb.cif.model.generated.EmHighPressureFreezing::new).get();
    }

    public org.rcsb.cif.model.generated.EmShadowing getEmShadowing() {
        return (org.rcsb.cif.model.generated.EmShadowing) categories.computeIfAbsent("em_shadowing",
                org.rcsb.cif.model.generated.EmShadowing::new).get();
    }

    public org.rcsb.cif.model.generated.EmTomographySpecimen getEmTomographySpecimen() {
        return (org.rcsb.cif.model.generated.EmTomographySpecimen) categories.computeIfAbsent("em_tomography_specimen",
                org.rcsb.cif.model.generated.EmTomographySpecimen::new).get();
    }

    public org.rcsb.cif.model.generated.EmCrystalFormation getEmCrystalFormation() {
        return (org.rcsb.cif.model.generated.EmCrystalFormation) categories.computeIfAbsent("em_crystal_formation",
                org.rcsb.cif.model.generated.EmCrystalFormation::new).get();
    }

    public org.rcsb.cif.model.generated.EmStaining getEmStaining() {
        return (org.rcsb.cif.model.generated.EmStaining) categories.computeIfAbsent("em_staining",
                org.rcsb.cif.model.generated.EmStaining::new).get();
    }

    public org.rcsb.cif.model.generated.EmSupportFilm getEmSupportFilm() {
        return (org.rcsb.cif.model.generated.EmSupportFilm) categories.computeIfAbsent("em_support_film",
                org.rcsb.cif.model.generated.EmSupportFilm::new).get();
    }

    public org.rcsb.cif.model.generated.EmBufferComponent getEmBufferComponent() {
        return (org.rcsb.cif.model.generated.EmBufferComponent) categories.computeIfAbsent("em_buffer_component",
                org.rcsb.cif.model.generated.EmBufferComponent::new).get();
    }

    public org.rcsb.cif.model.generated.EmDiffraction getEmDiffraction() {
        return (org.rcsb.cif.model.generated.EmDiffraction) categories.computeIfAbsent("em_diffraction",
                org.rcsb.cif.model.generated.EmDiffraction::new).get();
    }

    public org.rcsb.cif.model.generated.EmDiffractionShell getEmDiffractionShell() {
        return (org.rcsb.cif.model.generated.EmDiffractionShell) categories.computeIfAbsent("em_diffraction_shell",
                org.rcsb.cif.model.generated.EmDiffractionShell::new).get();
    }

    public org.rcsb.cif.model.generated.EmDiffractionStats getEmDiffractionStats() {
        return (org.rcsb.cif.model.generated.EmDiffractionStats) categories.computeIfAbsent("em_diffraction_stats",
                org.rcsb.cif.model.generated.EmDiffractionStats::new).get();
    }

    public org.rcsb.cif.model.generated.EmTomography getEmTomography() {
        return (org.rcsb.cif.model.generated.EmTomography) categories.computeIfAbsent("em_tomography",
                org.rcsb.cif.model.generated.EmTomography::new).get();
    }

    public org.rcsb.cif.model.generated.EmImageRecording getEmImageRecording() {
        return (org.rcsb.cif.model.generated.EmImageRecording) categories.computeIfAbsent("em_image_recording",
                org.rcsb.cif.model.generated.EmImageRecording::new).get();
    }

    public org.rcsb.cif.model.generated.EmImagingOptics getEmImagingOptics() {
        return (org.rcsb.cif.model.generated.EmImagingOptics) categories.computeIfAbsent("em_imaging_optics",
                org.rcsb.cif.model.generated.EmImagingOptics::new).get();
    }

    public org.rcsb.cif.model.generated.EmFinalClassification getEmFinalClassification() {
        return (org.rcsb.cif.model.generated.EmFinalClassification) categories.computeIfAbsent("em_final_classification",
                org.rcsb.cif.model.generated.EmFinalClassification::new).get();
    }

    public org.rcsb.cif.model.generated.EmStartModel getEmStartModel() {
        return (org.rcsb.cif.model.generated.EmStartModel) categories.computeIfAbsent("em_start_model",
                org.rcsb.cif.model.generated.EmStartModel::new).get();
    }

    public org.rcsb.cif.model.generated.EmSoftware getEmSoftware() {
        return (org.rcsb.cif.model.generated.EmSoftware) categories.computeIfAbsent("em_software",
                org.rcsb.cif.model.generated.EmSoftware::new).get();
    }

    public org.rcsb.cif.model.generated.EmEulerAngleAssignment getEmEulerAngleAssignment() {
        return (org.rcsb.cif.model.generated.EmEulerAngleAssignment) categories.computeIfAbsent("em_euler_angle_assignment",
                org.rcsb.cif.model.generated.EmEulerAngleAssignment::new).get();
    }

    public org.rcsb.cif.model.generated.EmCtfCorrection getEmCtfCorrection() {
        return (org.rcsb.cif.model.generated.EmCtfCorrection) categories.computeIfAbsent("em_ctf_correction",
                org.rcsb.cif.model.generated.EmCtfCorrection::new).get();
    }

    public org.rcsb.cif.model.generated.EmVolumeSelection getEmVolumeSelection() {
        return (org.rcsb.cif.model.generated.EmVolumeSelection) categories.computeIfAbsent("em_volume_selection",
                org.rcsb.cif.model.generated.EmVolumeSelection::new).get();
    }

    public org.rcsb.cif.model.generated.Em3dCrystalEntity getEm3dCrystalEntity() {
        return (org.rcsb.cif.model.generated.Em3dCrystalEntity) categories.computeIfAbsent("em_3d_crystal_entity",
                org.rcsb.cif.model.generated.Em3dCrystalEntity::new).get();
    }

    public org.rcsb.cif.model.generated.Em2dCrystalEntity getEm2dCrystalEntity() {
        return (org.rcsb.cif.model.generated.Em2dCrystalEntity) categories.computeIfAbsent("em_2d_crystal_entity",
                org.rcsb.cif.model.generated.Em2dCrystalEntity::new).get();
    }

    public org.rcsb.cif.model.generated.EmImageProcessing getEmImageProcessing() {
        return (org.rcsb.cif.model.generated.EmImageProcessing) categories.computeIfAbsent("em_image_processing",
                org.rcsb.cif.model.generated.EmImageProcessing::new).get();
    }

    public org.rcsb.cif.model.generated.EmParticleSelection getEmParticleSelection() {
        return (org.rcsb.cif.model.generated.EmParticleSelection) categories.computeIfAbsent("em_particle_selection",
                org.rcsb.cif.model.generated.EmParticleSelection::new).get();
    }

    public org.rcsb.cif.model.generated.EmMap getEmMap() {
        return (org.rcsb.cif.model.generated.EmMap) categories.computeIfAbsent("em_map",
                org.rcsb.cif.model.generated.EmMap::new).get();
    }

    public org.rcsb.cif.model.generated.EmFscCurve getEmFscCurve() {
        return (org.rcsb.cif.model.generated.EmFscCurve) categories.computeIfAbsent("em_fsc_curve",
                org.rcsb.cif.model.generated.EmFscCurve::new).get();
    }

    public org.rcsb.cif.model.generated.EmInterpretFigure getEmInterpretFigure() {
        return (org.rcsb.cif.model.generated.EmInterpretFigure) categories.computeIfAbsent("em_interpret_figure",
                org.rcsb.cif.model.generated.EmInterpretFigure::new).get();
    }

    public org.rcsb.cif.model.generated.EmLayerLines getEmLayerLines() {
        return (org.rcsb.cif.model.generated.EmLayerLines) categories.computeIfAbsent("em_layer_lines",
                org.rcsb.cif.model.generated.EmLayerLines::new).get();
    }

    public org.rcsb.cif.model.generated.EmStructureFactors getEmStructureFactors() {
        return (org.rcsb.cif.model.generated.EmStructureFactors) categories.computeIfAbsent("em_structure_factors",
                org.rcsb.cif.model.generated.EmStructureFactors::new).get();
    }

    public org.rcsb.cif.model.generated.EmDepositorInfo getEmDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmDepositorInfo) categories.computeIfAbsent("em_depositor_info",
                org.rcsb.cif.model.generated.EmDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.EmMapDepositorInfo getEmMapDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmMapDepositorInfo) categories.computeIfAbsent("em_map_depositor_info",
                org.rcsb.cif.model.generated.EmMapDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.EmMaskDepositorInfo getEmMaskDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmMaskDepositorInfo) categories.computeIfAbsent("em_mask_depositor_info",
                org.rcsb.cif.model.generated.EmMaskDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.EmFigureDepositorInfo getEmFigureDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmFigureDepositorInfo) categories.computeIfAbsent("em_figure_depositor_info",
                org.rcsb.cif.model.generated.EmFigureDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo) categories.computeIfAbsent("em_layer_lines_depositor_info",
                org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo) categories.computeIfAbsent("em_structure_factors_depositor_info",
                org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo) categories.computeIfAbsent("pdbx_seq_map_depositor_info",
                org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_dif_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_prop_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_gen_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo) categories.computeIfAbsent("pdbx_struct_oper_list_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_point_symmetry_depositor_info",
                org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_helical_symmetry_depositor_info",
                org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping() {
        return (org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping) categories.computeIfAbsent("pdbx_solvent_atom_site_mapping",
                org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo) categories.computeIfAbsent("pdbx_molecule_features_depositor_info",
                org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_instance_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiStatusFlags) categories.computeIfAbsent("pdbx_depui_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiStatusFlags::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiUpload getPdbxDepuiUpload() {
        return (org.rcsb.cif.model.generated.PdbxDepuiUpload) categories.computeIfAbsent("pdbx_depui_upload",
                org.rcsb.cif.model.generated.PdbxDepuiUpload::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags) categories.computeIfAbsent("pdbx_depui_validation_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_upload_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags) categories.computeIfAbsent("pdbx_depui_entity_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures) categories.computeIfAbsent("pdbx_depui_entity_features",
                org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo() {
        return (org.rcsb.cif.model.generated.PdbxDepositionMessageInfo) categories.computeIfAbsent("pdbx_deposition_message_info",
                org.rcsb.cif.model.generated.PdbxDepositionMessageInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference() {
        return (org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference) categories.computeIfAbsent("pdbx_deposition_message_file_reference",
                org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntryDetails) categories.computeIfAbsent("pdbx_depui_entry_details",
                org.rcsb.cif.model.generated.PdbxDepuiEntryDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingStatus getPdbxDataProcessingStatus() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingStatus) categories.computeIfAbsent("pdbx_data_processing_status",
                org.rcsb.cif.model.generated.PdbxDataProcessingStatus::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature() {
        return (org.rcsb.cif.model.generated.PdbxEntityInstanceFeature) categories.computeIfAbsent("pdbx_entity_instance_feature",
                org.rcsb.cif.model.generated.PdbxEntityInstanceFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo) categories.computeIfAbsent("pdbx_entity_src_gen_depositor_info",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModel getPdbxChemCompModel() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModel) categories.computeIfAbsent("pdbx_chem_comp_model",
                org.rcsb.cif.model.generated.PdbxChemCompModel::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelAtom getPdbxChemCompModelAtom() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelAtom) categories.computeIfAbsent("pdbx_chem_comp_model_atom",
                org.rcsb.cif.model.generated.PdbxChemCompModelAtom::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelBond getPdbxChemCompModelBond() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelBond) categories.computeIfAbsent("pdbx_chem_comp_model_bond",
                org.rcsb.cif.model.generated.PdbxChemCompModelBond::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelFeature getPdbxChemCompModelFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelFeature) categories.computeIfAbsent("pdbx_chem_comp_model_feature",
                org.rcsb.cif.model.generated.PdbxChemCompModelFeature::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor) categories.computeIfAbsent("pdbx_chem_comp_model_descriptor",
                org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelAudit getPdbxChemCompModelAudit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelAudit) categories.computeIfAbsent("pdbx_chem_comp_model_audit",
                org.rcsb.cif.model.generated.PdbxChemCompModelAudit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelReference getPdbxChemCompModelReference() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelReference) categories.computeIfAbsent("pdbx_chem_comp_model_reference",
                org.rcsb.cif.model.generated.PdbxChemCompModelReference::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxViewCategoryGroup getPdbxViewCategoryGroup() {
        return (org.rcsb.cif.model.generated.PdbxViewCategoryGroup) categories.computeIfAbsent("pdbx_view_category_group",
                org.rcsb.cif.model.generated.PdbxViewCategoryGroup::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxViewCategory getPdbxViewCategory() {
        return (org.rcsb.cif.model.generated.PdbxViewCategory) categories.computeIfAbsent("pdbx_view_category",
                org.rcsb.cif.model.generated.PdbxViewCategory::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxViewItem getPdbxViewItem() {
        return (org.rcsb.cif.model.generated.PdbxViewItem) categories.computeIfAbsent("pdbx_view_item",
                org.rcsb.cif.model.generated.PdbxViewItem::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxCoord getPdbxCoord() {
        return (org.rcsb.cif.model.generated.PdbxCoord) categories.computeIfAbsent("pdbx_coord",
                org.rcsb.cif.model.generated.PdbxCoord::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConnect getPdbxConnect() {
        return (org.rcsb.cif.model.generated.PdbxConnect) categories.computeIfAbsent("pdbx_connect",
                org.rcsb.cif.model.generated.PdbxConnect::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConnectType getPdbxConnectType() {
        return (org.rcsb.cif.model.generated.PdbxConnectType) categories.computeIfAbsent("pdbx_connect_type",
                org.rcsb.cif.model.generated.PdbxConnectType::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConnectModification getPdbxConnectModification() {
        return (org.rcsb.cif.model.generated.PdbxConnectModification) categories.computeIfAbsent("pdbx_connect_modification",
                org.rcsb.cif.model.generated.PdbxConnectModification::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxConnectAtom getPdbxConnectAtom() {
        return (org.rcsb.cif.model.generated.PdbxConnectAtom) categories.computeIfAbsent("pdbx_connect_atom",
                org.rcsb.cif.model.generated.PdbxConnectAtom::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePDBMaster) categories.computeIfAbsent("pdbx_database_PDB_master",
                org.rcsb.cif.model.generated.PdbxDatabasePDBMaster::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePdbOmit) categories.computeIfAbsent("pdbx_database_pdb_omit",
                org.rcsb.cif.model.generated.PdbxDatabasePdbOmit::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDbref getPdbxDbref() {
        return (org.rcsb.cif.model.generated.PdbxDbref) categories.computeIfAbsent("pdbx_dbref",
                org.rcsb.cif.model.generated.PdbxDbref::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDrugInfo getPdbxDrugInfo() {
        return (org.rcsb.cif.model.generated.PdbxDrugInfo) categories.computeIfAbsent("pdbx_drug_info",
                org.rcsb.cif.model.generated.PdbxDrugInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxInhibitorInfo getPdbxInhibitorInfo() {
        return (org.rcsb.cif.model.generated.PdbxInhibitorInfo) categories.computeIfAbsent("pdbx_inhibitor_info",
                org.rcsb.cif.model.generated.PdbxInhibitorInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxIonInfo getPdbxIonInfo() {
        return (org.rcsb.cif.model.generated.PdbxIonInfo) categories.computeIfAbsent("pdbx_ion_info",
                org.rcsb.cif.model.generated.PdbxIonInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxHybrid getPdbxHybrid() {
        return (org.rcsb.cif.model.generated.PdbxHybrid) categories.computeIfAbsent("pdbx_hybrid",
                org.rcsb.cif.model.generated.PdbxHybrid::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNaStrandInfo getPdbxNaStrandInfo() {
        return (org.rcsb.cif.model.generated.PdbxNaStrandInfo) categories.computeIfAbsent("pdbx_na_strand_info",
                org.rcsb.cif.model.generated.PdbxNaStrandInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNonstandardList getPdbxNonstandardList() {
        return (org.rcsb.cif.model.generated.PdbxNonstandardList) categories.computeIfAbsent("pdbx_nonstandard_list",
                org.rcsb.cif.model.generated.PdbxNonstandardList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPdbCompnd getPdbxPdbCompnd() {
        return (org.rcsb.cif.model.generated.PdbxPdbCompnd) categories.computeIfAbsent("pdbx_pdb_compnd",
                org.rcsb.cif.model.generated.PdbxPdbCompnd::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPdbSource getPdbxPdbSource() {
        return (org.rcsb.cif.model.generated.PdbxPdbSource) categories.computeIfAbsent("pdbx_pdb_source",
                org.rcsb.cif.model.generated.PdbxPdbSource::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxProteinInfo getPdbxProteinInfo() {
        return (org.rcsb.cif.model.generated.PdbxProteinInfo) categories.computeIfAbsent("pdbx_protein_info",
                org.rcsb.cif.model.generated.PdbxProteinInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSolventInfo getPdbxSolventInfo() {
        return (org.rcsb.cif.model.generated.PdbxSolventInfo) categories.computeIfAbsent("pdbx_solvent_info",
                org.rcsb.cif.model.generated.PdbxSolventInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSource getPdbxSource() {
        return (org.rcsb.cif.model.generated.PdbxSource) categories.computeIfAbsent("pdbx_source",
                org.rcsb.cif.model.generated.PdbxSource::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructBiolFunc getPdbxStructBiolFunc() {
        return (org.rcsb.cif.model.generated.PdbxStructBiolFunc) categories.computeIfAbsent("pdbx_struct_biol_func",
                org.rcsb.cif.model.generated.PdbxStructBiolFunc::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructPackGen getPdbxStructPackGen() {
        return (org.rcsb.cif.model.generated.PdbxStructPackGen) categories.computeIfAbsent("pdbx_struct_pack_gen",
                org.rcsb.cif.model.generated.PdbxStructPackGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxTrnaInfo getPdbxTrnaInfo() {
        return (org.rcsb.cif.model.generated.PdbxTrnaInfo) categories.computeIfAbsent("pdbx_trna_info",
                org.rcsb.cif.model.generated.PdbxTrnaInfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxUnpair getPdbxUnpair() {
        return (org.rcsb.cif.model.generated.PdbxUnpair) categories.computeIfAbsent("pdbx_unpair",
                org.rcsb.cif.model.generated.PdbxUnpair::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs() {
        return (org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs) categories.computeIfAbsent("pdbx_refine_ls_restr_ncs",
                org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen() {
        return (org.rcsb.cif.model.generated.PdbxStructNcsVirusGen) categories.computeIfAbsent("pdbx_struct_ncs_virus_gen",
                org.rcsb.cif.model.generated.PdbxStructNcsVirusGen::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSequenceAnnotation getPdbxSequenceAnnotation() {
        return (org.rcsb.cif.model.generated.PdbxSequenceAnnotation) categories.computeIfAbsent("pdbx_sequence_annotation",
                org.rcsb.cif.model.generated.PdbxSequenceAnnotation::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPostProcessDetails getPdbxPostProcessDetails() {
        return (org.rcsb.cif.model.generated.PdbxPostProcessDetails) categories.computeIfAbsent("pdbx_post_process_details",
                org.rcsb.cif.model.generated.PdbxPostProcessDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxPostProcessStatus getPdbxPostProcessStatus() {
        return (org.rcsb.cif.model.generated.PdbxPostProcessStatus) categories.computeIfAbsent("pdbx_post_process_status",
                org.rcsb.cif.model.generated.PdbxPostProcessStatus::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructLink getPdbxStructLink() {
        return (org.rcsb.cif.model.generated.PdbxStructLink) categories.computeIfAbsent("pdbx_struct_link",
                org.rcsb.cif.model.generated.PdbxStructLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMissingResidueList getPdbxMissingResidueList() {
        return (org.rcsb.cif.model.generated.PdbxMissingResidueList) categories.computeIfAbsent("pdbx_missing_residue_list",
                org.rcsb.cif.model.generated.PdbxMissingResidueList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingCell getPdbxDataProcessingCell() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingCell) categories.computeIfAbsent("pdbx_data_processing_cell",
                org.rcsb.cif.model.generated.PdbxDataProcessingCell::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingReflns getPdbxDataProcessingReflns() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingReflns) categories.computeIfAbsent("pdbx_data_processing_reflns",
                org.rcsb.cif.model.generated.PdbxDataProcessingReflns::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingDetector getPdbxDataProcessingDetector() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingDetector) categories.computeIfAbsent("pdbx_data_processing_detector",
                org.rcsb.cif.model.generated.PdbxDataProcessingDetector::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompNonstandard getPdbxChemCompNonstandard() {
        return (org.rcsb.cif.model.generated.PdbxChemCompNonstandard) categories.computeIfAbsent("pdbx_chem_comp_nonstandard",
                org.rcsb.cif.model.generated.PdbxChemCompNonstandard::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass) categories.computeIfAbsent("pdbx_entity_poly_protein_class",
                org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree) categories.computeIfAbsent("pdbx_entity_name_taxonomy_tree",
                org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy) categories.computeIfAbsent("pdbx_entity_name_taxonomy",
                org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameInstance getPdbxEntityNameInstance() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameInstance) categories.computeIfAbsent("pdbx_entity_name_instance",
                org.rcsb.cif.model.generated.PdbxEntityNameInstance::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxTableinfo getPdbxTableinfo() {
        return (org.rcsb.cif.model.generated.PdbxTableinfo) categories.computeIfAbsent("pdbx_tableinfo",
                org.rcsb.cif.model.generated.PdbxTableinfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxColumninfo getPdbxColumninfo() {
        return (org.rcsb.cif.model.generated.PdbxColumninfo) categories.computeIfAbsent("pdbx_columninfo",
                org.rcsb.cif.model.generated.PdbxColumninfo::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValAngle getPdbxValAngle() {
        return (org.rcsb.cif.model.generated.PdbxValAngle) categories.computeIfAbsent("pdbx_val_angle",
                org.rcsb.cif.model.generated.PdbxValAngle::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValBond getPdbxValBond() {
        return (org.rcsb.cif.model.generated.PdbxValBond) categories.computeIfAbsent("pdbx_val_bond",
                org.rcsb.cif.model.generated.PdbxValBond::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValContact getPdbxValContact() {
        return (org.rcsb.cif.model.generated.PdbxValContact) categories.computeIfAbsent("pdbx_val_contact",
                org.rcsb.cif.model.generated.PdbxValContact::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValSymContact getPdbxValSymContact() {
        return (org.rcsb.cif.model.generated.PdbxValSymContact) categories.computeIfAbsent("pdbx_val_sym_contact",
                org.rcsb.cif.model.generated.PdbxValSymContact::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRmchOutlier getPdbxRmchOutlier() {
        return (org.rcsb.cif.model.generated.PdbxRmchOutlier) categories.computeIfAbsent("pdbx_rmch_outlier",
                org.rcsb.cif.model.generated.PdbxRmchOutlier::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMissingAtomPoly getPdbxMissingAtomPoly() {
        return (org.rcsb.cif.model.generated.PdbxMissingAtomPoly) categories.computeIfAbsent("pdbx_missing_atom_poly",
                org.rcsb.cif.model.generated.PdbxMissingAtomPoly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly) categories.computeIfAbsent("pdbx_missing_atom_nonpoly",
                org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxValChiral getPdbxValChiral() {
        return (org.rcsb.cif.model.generated.PdbxValChiral) categories.computeIfAbsent("pdbx_val_chiral",
                org.rcsb.cif.model.generated.PdbxValChiral::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAtlas getPdbxAtlas() {
        return (org.rcsb.cif.model.generated.PdbxAtlas) categories.computeIfAbsent("pdbx_atlas",
                org.rcsb.cif.model.generated.PdbxAtlas::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSummaryFlags getPdbxSummaryFlags() {
        return (org.rcsb.cif.model.generated.PdbxSummaryFlags) categories.computeIfAbsent("pdbx_summary_flags",
                org.rcsb.cif.model.generated.PdbxSummaryFlags::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncBindMode) categories.computeIfAbsent("pdbx_entity_func_bind_mode",
                org.rcsb.cif.model.generated.PdbxEntityFuncBindMode::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme) categories.computeIfAbsent("pdbx_entity_func_enzyme",
                org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory) categories.computeIfAbsent("pdbx_entity_func_regulatory",
                org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncStructural getPdbxEntityFuncStructural() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncStructural) categories.computeIfAbsent("pdbx_entity_func_structural",
                org.rcsb.cif.model.generated.PdbxEntityFuncStructural::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncOther getPdbxEntityFuncOther() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncOther) categories.computeIfAbsent("pdbx_entity_func_other",
                org.rcsb.cif.model.generated.PdbxEntityFuncOther::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyDomain getPdbxEntityPolyDomain() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyDomain) categories.computeIfAbsent("pdbx_entity_poly_domain",
                org.rcsb.cif.model.generated.PdbxEntityPolyDomain::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNaStructKeywds getPdbxNaStructKeywds() {
        return (org.rcsb.cif.model.generated.PdbxNaStructKeywds) categories.computeIfAbsent("pdbx_na_struct_keywds",
                org.rcsb.cif.model.generated.PdbxNaStructKeywds::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyNaType getPdbxEntityPolyNaType() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyNaType) categories.computeIfAbsent("pdbx_entity_poly_na_type",
                org.rcsb.cif.model.generated.PdbxEntityPolyNaType::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard) categories.computeIfAbsent("pdbx_entity_poly_na_nonstandard",
                org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxVirtualAngle getPdbxVirtualAngle() {
        return (org.rcsb.cif.model.generated.PdbxVirtualAngle) categories.computeIfAbsent("pdbx_virtual_angle",
                org.rcsb.cif.model.generated.PdbxVirtualAngle::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxVirtualBond getPdbxVirtualBond() {
        return (org.rcsb.cif.model.generated.PdbxVirtualBond) categories.computeIfAbsent("pdbx_virtual_bond",
                org.rcsb.cif.model.generated.PdbxVirtualBond::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxVirtualTorsion getPdbxVirtualTorsion() {
        return (org.rcsb.cif.model.generated.PdbxVirtualTorsion) categories.computeIfAbsent("pdbx_virtual_torsion",
                org.rcsb.cif.model.generated.PdbxVirtualTorsion::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSequencePattern getPdbxSequencePattern() {
        return (org.rcsb.cif.model.generated.PdbxSequencePattern) categories.computeIfAbsent("pdbx_sequence_pattern",
                org.rcsb.cif.model.generated.PdbxSequencePattern::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStereochemistry getPdbxStereochemistry() {
        return (org.rcsb.cif.model.generated.PdbxStereochemistry) categories.computeIfAbsent("pdbx_stereochemistry",
                org.rcsb.cif.model.generated.PdbxStereochemistry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent() {
        return (org.rcsb.cif.model.generated.PdbxRmsDevsCovalent) categories.computeIfAbsent("pdbx_rms_devs_covalent",
                org.rcsb.cif.model.generated.PdbxRmsDevsCovalent::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer() {
        return (org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer) categories.computeIfAbsent("pdbx_rms_devs_cov_by_monomer",
                org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry() {
        return (org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry) categories.computeIfAbsent("pdbx_sugar_phosphate_geometry",
                org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxNmrComputing getPdbxNmrComputing() {
        return (org.rcsb.cif.model.generated.PdbxNmrComputing) categories.computeIfAbsent("pdbx_nmr_computing",
                org.rcsb.cif.model.generated.PdbxNmrComputing::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditConformExtension getPdbxAuditConformExtension() {
        return (org.rcsb.cif.model.generated.PdbxAuditConformExtension) categories.computeIfAbsent("pdbx_audit_conform_extension",
                org.rcsb.cif.model.generated.PdbxAuditConformExtension::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccMapman getPdbxDccMapman() {
        return (org.rcsb.cif.model.generated.PdbxDccMapman) categories.computeIfAbsent("pdbx_dcc_mapman",
                org.rcsb.cif.model.generated.PdbxDccMapman::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccRsccMapman getPdbxDccRsccMapman() {
        return (org.rcsb.cif.model.generated.PdbxDccRsccMapman) categories.computeIfAbsent("pdbx_dcc_rscc_mapman",
                org.rcsb.cif.model.generated.PdbxDccRsccMapman::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall() {
        return (org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall) categories.computeIfAbsent("pdbx_dcc_rscc_mapman_overall",
                org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccDensity getPdbxDccDensity() {
        return (org.rcsb.cif.model.generated.PdbxDccDensity) categories.computeIfAbsent("pdbx_dcc_density",
                org.rcsb.cif.model.generated.PdbxDccDensity::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccGeometry getPdbxDccGeometry() {
        return (org.rcsb.cif.model.generated.PdbxDccGeometry) categories.computeIfAbsent("pdbx_dcc_geometry",
                org.rcsb.cif.model.generated.PdbxDccGeometry::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccDensityCorr getPdbxDccDensityCorr() {
        return (org.rcsb.cif.model.generated.PdbxDccDensityCorr) categories.computeIfAbsent("pdbx_dcc_density_corr",
                org.rcsb.cif.model.generated.PdbxDccDensityCorr::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDccMap getPdbxDccMap() {
        return (org.rcsb.cif.model.generated.PdbxDccMap) categories.computeIfAbsent("pdbx_dcc_map",
                org.rcsb.cif.model.generated.PdbxDccMap::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepositGroup getPdbxDepositGroup() {
        return (org.rcsb.cif.model.generated.PdbxDepositGroup) categories.computeIfAbsent("pdbx_deposit_group",
                org.rcsb.cif.model.generated.PdbxDepositGroup::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxDepositGroupIndex getPdbxDepositGroupIndex() {
        return (org.rcsb.cif.model.generated.PdbxDepositGroupIndex) categories.computeIfAbsent("pdbx_deposit_group_index",
                org.rcsb.cif.model.generated.PdbxDepositGroupIndex::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification) categories.computeIfAbsent("pdbx_struct_assembly_auth_classification",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxCrystalAlignment getPdbxCrystalAlignment() {
        return (org.rcsb.cif.model.generated.PdbxCrystalAlignment) categories.computeIfAbsent("pdbx_crystal_alignment",
                org.rcsb.cif.model.generated.PdbxCrystalAlignment::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionHistory) categories.computeIfAbsent("pdbx_audit_revision_history",
                org.rcsb.cif.model.generated.PdbxAuditRevisionHistory::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionGroup) categories.computeIfAbsent("pdbx_audit_revision_group",
                org.rcsb.cif.model.generated.PdbxAuditRevisionGroup::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionCategory) categories.computeIfAbsent("pdbx_audit_revision_category",
                org.rcsb.cif.model.generated.PdbxAuditRevisionCategory::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionDetails) categories.computeIfAbsent("pdbx_audit_revision_details",
                org.rcsb.cif.model.generated.PdbxAuditRevisionDetails::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionItem getPdbxAuditRevisionItem() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionItem) categories.computeIfAbsent("pdbx_audit_revision_item",
                org.rcsb.cif.model.generated.PdbxAuditRevisionItem::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet() {
        return (org.rcsb.cif.model.generated.PdbxSupportingExpDataSet) categories.computeIfAbsent("pdbx_supporting_exp_data_set",
                org.rcsb.cif.model.generated.PdbxSupportingExpDataSet::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement) categories.computeIfAbsent("pdbx_serial_crystallography_measurement",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_injection",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_fixed_target",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction) categories.computeIfAbsent("pdbx_serial_crystallography_data_reduction",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompSynonyms getPdbxChemCompSynonyms() {
        return (org.rcsb.cif.model.generated.PdbxChemCompSynonyms) categories.computeIfAbsent("pdbx_chem_comp_synonyms",
                org.rcsb.cif.model.generated.PdbxChemCompSynonyms::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompRelated getPdbxChemCompRelated() {
        return (org.rcsb.cif.model.generated.PdbxChemCompRelated) categories.computeIfAbsent("pdbx_chem_comp_related",
                org.rcsb.cif.model.generated.PdbxChemCompRelated::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAtomRelated getPdbxChemCompAtomRelated() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAtomRelated) categories.computeIfAbsent("pdbx_chem_comp_atom_related",
                org.rcsb.cif.model.generated.PdbxChemCompAtomRelated::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityBranchList getPdbxEntityBranchList() {
        return (org.rcsb.cif.model.generated.PdbxEntityBranchList) categories.computeIfAbsent("pdbx_entity_branch_list",
                org.rcsb.cif.model.generated.PdbxEntityBranchList::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityBranchLink getPdbxEntityBranchLink() {
        return (org.rcsb.cif.model.generated.PdbxEntityBranchLink) categories.computeIfAbsent("pdbx_entity_branch_link",
                org.rcsb.cif.model.generated.PdbxEntityBranchLink::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxEntityBranch getPdbxEntityBranch() {
        return (org.rcsb.cif.model.generated.PdbxEntityBranch) categories.computeIfAbsent("pdbx_entity_branch",
                org.rcsb.cif.model.generated.PdbxEntityBranch::new).get();
    }

    public org.rcsb.cif.model.generated.PdbxBranchScheme getPdbxBranchScheme() {
        return (org.rcsb.cif.model.generated.PdbxBranchScheme) categories.computeIfAbsent("pdbx_branch_scheme",
                org.rcsb.cif.model.generated.PdbxBranchScheme::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStartingModelDetails getIhmStartingModelDetails() {
        return (org.rcsb.cif.model.generated.IhmStartingModelDetails) categories.computeIfAbsent("ihm_starting_model_details",
                org.rcsb.cif.model.generated.IhmStartingModelDetails::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStartingComparativeModels getIhmStartingComparativeModels() {
        return (org.rcsb.cif.model.generated.IhmStartingComparativeModels) categories.computeIfAbsent("ihm_starting_comparative_models",
                org.rcsb.cif.model.generated.IhmStartingComparativeModels::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStartingComputationalModels getIhmStartingComputationalModels() {
        return (org.rcsb.cif.model.generated.IhmStartingComputationalModels) categories.computeIfAbsent("ihm_starting_computational_models",
                org.rcsb.cif.model.generated.IhmStartingComputationalModels::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStartingModelSeqDif getIhmStartingModelSeqDif() {
        return (org.rcsb.cif.model.generated.IhmStartingModelSeqDif) categories.computeIfAbsent("ihm_starting_model_seq_dif",
                org.rcsb.cif.model.generated.IhmStartingModelSeqDif::new).get();
    }

    public org.rcsb.cif.model.generated.IhmModelRepresentation getIhmModelRepresentation() {
        return (org.rcsb.cif.model.generated.IhmModelRepresentation) categories.computeIfAbsent("ihm_model_representation",
                org.rcsb.cif.model.generated.IhmModelRepresentation::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStructAssembly getIhmStructAssembly() {
        return (org.rcsb.cif.model.generated.IhmStructAssembly) categories.computeIfAbsent("ihm_struct_assembly",
                org.rcsb.cif.model.generated.IhmStructAssembly::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStructAssemblyDetails getIhmStructAssemblyDetails() {
        return (org.rcsb.cif.model.generated.IhmStructAssemblyDetails) categories.computeIfAbsent("ihm_struct_assembly_details",
                org.rcsb.cif.model.generated.IhmStructAssemblyDetails::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStructAssemblyClassList getIhmStructAssemblyClassList() {
        return (org.rcsb.cif.model.generated.IhmStructAssemblyClassList) categories.computeIfAbsent("ihm_struct_assembly_class_list",
                org.rcsb.cif.model.generated.IhmStructAssemblyClassList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStructAssemblyClass getIhmStructAssemblyClass() {
        return (org.rcsb.cif.model.generated.IhmStructAssemblyClass) categories.computeIfAbsent("ihm_struct_assembly_class",
                org.rcsb.cif.model.generated.IhmStructAssemblyClass::new).get();
    }

    public org.rcsb.cif.model.generated.IhmModelingProtocol getIhmModelingProtocol() {
        return (org.rcsb.cif.model.generated.IhmModelingProtocol) categories.computeIfAbsent("ihm_modeling_protocol",
                org.rcsb.cif.model.generated.IhmModelingProtocol::new).get();
    }

    public org.rcsb.cif.model.generated.IhmMultiStateModeling getIhmMultiStateModeling() {
        return (org.rcsb.cif.model.generated.IhmMultiStateModeling) categories.computeIfAbsent("ihm_multi_state_modeling",
                org.rcsb.cif.model.generated.IhmMultiStateModeling::new).get();
    }

    public org.rcsb.cif.model.generated.IhmOrderedEnsemble getIhmOrderedEnsemble() {
        return (org.rcsb.cif.model.generated.IhmOrderedEnsemble) categories.computeIfAbsent("ihm_ordered_ensemble",
                org.rcsb.cif.model.generated.IhmOrderedEnsemble::new).get();
    }

    public org.rcsb.cif.model.generated.IhmModelingPostProcess getIhmModelingPostProcess() {
        return (org.rcsb.cif.model.generated.IhmModelingPostProcess) categories.computeIfAbsent("ihm_modeling_post_process",
                org.rcsb.cif.model.generated.IhmModelingPostProcess::new).get();
    }

    public org.rcsb.cif.model.generated.IhmEnsembleInfo getIhmEnsembleInfo() {
        return (org.rcsb.cif.model.generated.IhmEnsembleInfo) categories.computeIfAbsent("ihm_ensemble_info",
                org.rcsb.cif.model.generated.IhmEnsembleInfo::new).get();
    }

    public org.rcsb.cif.model.generated.IhmModelList getIhmModelList() {
        return (org.rcsb.cif.model.generated.IhmModelList) categories.computeIfAbsent("ihm_model_list",
                org.rcsb.cif.model.generated.IhmModelList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmModelRepresentative getIhmModelRepresentative() {
        return (org.rcsb.cif.model.generated.IhmModelRepresentative) categories.computeIfAbsent("ihm_model_representative",
                org.rcsb.cif.model.generated.IhmModelRepresentative::new).get();
    }

    public org.rcsb.cif.model.generated.IhmDatasetList getIhmDatasetList() {
        return (org.rcsb.cif.model.generated.IhmDatasetList) categories.computeIfAbsent("ihm_dataset_list",
                org.rcsb.cif.model.generated.IhmDatasetList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmDatasetGroup getIhmDatasetGroup() {
        return (org.rcsb.cif.model.generated.IhmDatasetGroup) categories.computeIfAbsent("ihm_dataset_group",
                org.rcsb.cif.model.generated.IhmDatasetGroup::new).get();
    }

    public org.rcsb.cif.model.generated.IhmRelatedDatasets getIhmRelatedDatasets() {
        return (org.rcsb.cif.model.generated.IhmRelatedDatasets) categories.computeIfAbsent("ihm_related_datasets",
                org.rcsb.cif.model.generated.IhmRelatedDatasets::new).get();
    }

    public org.rcsb.cif.model.generated.IhmDatasetRelatedDbReference getIhmDatasetRelatedDbReference() {
        return (org.rcsb.cif.model.generated.IhmDatasetRelatedDbReference) categories.computeIfAbsent("ihm_dataset_related_db_reference",
                org.rcsb.cif.model.generated.IhmDatasetRelatedDbReference::new).get();
    }

    public org.rcsb.cif.model.generated.IhmExternalReferenceInfo getIhmExternalReferenceInfo() {
        return (org.rcsb.cif.model.generated.IhmExternalReferenceInfo) categories.computeIfAbsent("ihm_external_reference_info",
                org.rcsb.cif.model.generated.IhmExternalReferenceInfo::new).get();
    }

    public org.rcsb.cif.model.generated.IhmExternalFiles getIhmExternalFiles() {
        return (org.rcsb.cif.model.generated.IhmExternalFiles) categories.computeIfAbsent("ihm_external_files",
                org.rcsb.cif.model.generated.IhmExternalFiles::new).get();
    }

    public org.rcsb.cif.model.generated.IhmDatasetExternalReference getIhmDatasetExternalReference() {
        return (org.rcsb.cif.model.generated.IhmDatasetExternalReference) categories.computeIfAbsent("ihm_dataset_external_reference",
                org.rcsb.cif.model.generated.IhmDatasetExternalReference::new).get();
    }

    public org.rcsb.cif.model.generated.IhmLocalizationDensityFiles getIhmLocalizationDensityFiles() {
        return (org.rcsb.cif.model.generated.IhmLocalizationDensityFiles) categories.computeIfAbsent("ihm_localization_density_files",
                org.rcsb.cif.model.generated.IhmLocalizationDensityFiles::new).get();
    }

    public org.rcsb.cif.model.generated.IhmPredictedContactRestraint getIhmPredictedContactRestraint() {
        return (org.rcsb.cif.model.generated.IhmPredictedContactRestraint) categories.computeIfAbsent("ihm_predicted_contact_restraint",
                org.rcsb.cif.model.generated.IhmPredictedContactRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmHydroxylRadicalFpRestraint getIhmHydroxylRadicalFpRestraint() {
        return (org.rcsb.cif.model.generated.IhmHydroxylRadicalFpRestraint) categories.computeIfAbsent("ihm_hydroxyl_radical_fp_restraint",
                org.rcsb.cif.model.generated.IhmHydroxylRadicalFpRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmCrossLinkList getIhmCrossLinkList() {
        return (org.rcsb.cif.model.generated.IhmCrossLinkList) categories.computeIfAbsent("ihm_cross_link_list",
                org.rcsb.cif.model.generated.IhmCrossLinkList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmCrossLinkRestraint getIhmCrossLinkRestraint() {
        return (org.rcsb.cif.model.generated.IhmCrossLinkRestraint) categories.computeIfAbsent("ihm_cross_link_restraint",
                org.rcsb.cif.model.generated.IhmCrossLinkRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmCrossLinkResult getIhmCrossLinkResult() {
        return (org.rcsb.cif.model.generated.IhmCrossLinkResult) categories.computeIfAbsent("ihm_cross_link_result",
                org.rcsb.cif.model.generated.IhmCrossLinkResult::new).get();
    }

    public org.rcsb.cif.model.generated.IhmCrossLinkResultParameters getIhmCrossLinkResultParameters() {
        return (org.rcsb.cif.model.generated.IhmCrossLinkResultParameters) categories.computeIfAbsent("ihm_cross_link_result_parameters",
                org.rcsb.cif.model.generated.IhmCrossLinkResultParameters::new).get();
    }

    public org.rcsb.cif.model.generated.Ihm2demClassAverageRestraint getIhm2demClassAverageRestraint() {
        return (org.rcsb.cif.model.generated.Ihm2demClassAverageRestraint) categories.computeIfAbsent("ihm_2dem_class_average_restraint",
                org.rcsb.cif.model.generated.Ihm2demClassAverageRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.Ihm2demClassAverageFitting getIhm2demClassAverageFitting() {
        return (org.rcsb.cif.model.generated.Ihm2demClassAverageFitting) categories.computeIfAbsent("ihm_2dem_class_average_fitting",
                org.rcsb.cif.model.generated.Ihm2demClassAverageFitting::new).get();
    }

    public org.rcsb.cif.model.generated.Ihm3demRestraint getIhm3demRestraint() {
        return (org.rcsb.cif.model.generated.Ihm3demRestraint) categories.computeIfAbsent("ihm_3dem_restraint",
                org.rcsb.cif.model.generated.Ihm3demRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmSasRestraint getIhmSasRestraint() {
        return (org.rcsb.cif.model.generated.IhmSasRestraint) categories.computeIfAbsent("ihm_sas_restraint",
                org.rcsb.cif.model.generated.IhmSasRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmStartingModelCoord getIhmStartingModelCoord() {
        return (org.rcsb.cif.model.generated.IhmStartingModelCoord) categories.computeIfAbsent("ihm_starting_model_coord",
                org.rcsb.cif.model.generated.IhmStartingModelCoord::new).get();
    }

    public org.rcsb.cif.model.generated.IhmSphereObjSite getIhmSphereObjSite() {
        return (org.rcsb.cif.model.generated.IhmSphereObjSite) categories.computeIfAbsent("ihm_sphere_obj_site",
                org.rcsb.cif.model.generated.IhmSphereObjSite::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGaussianObjSite getIhmGaussianObjSite() {
        return (org.rcsb.cif.model.generated.IhmGaussianObjSite) categories.computeIfAbsent("ihm_gaussian_obj_site",
                org.rcsb.cif.model.generated.IhmGaussianObjSite::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGaussianObjEnsemble getIhmGaussianObjEnsemble() {
        return (org.rcsb.cif.model.generated.IhmGaussianObjEnsemble) categories.computeIfAbsent("ihm_gaussian_obj_ensemble",
                org.rcsb.cif.model.generated.IhmGaussianObjEnsemble::new).get();
    }

    public org.rcsb.cif.model.generated.IhmResiduesNotModeled getIhmResiduesNotModeled() {
        return (org.rcsb.cif.model.generated.IhmResiduesNotModeled) categories.computeIfAbsent("ihm_residues_not_modeled",
                org.rcsb.cif.model.generated.IhmResiduesNotModeled::new).get();
    }

    public org.rcsb.cif.model.generated.IhmFeatureList getIhmFeatureList() {
        return (org.rcsb.cif.model.generated.IhmFeatureList) categories.computeIfAbsent("ihm_feature_list",
                org.rcsb.cif.model.generated.IhmFeatureList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmPseudoSiteFeature getIhmPseudoSiteFeature() {
        return (org.rcsb.cif.model.generated.IhmPseudoSiteFeature) categories.computeIfAbsent("ihm_pseudo_site_feature",
                org.rcsb.cif.model.generated.IhmPseudoSiteFeature::new).get();
    }

    public org.rcsb.cif.model.generated.IhmPolyAtomFeature getIhmPolyAtomFeature() {
        return (org.rcsb.cif.model.generated.IhmPolyAtomFeature) categories.computeIfAbsent("ihm_poly_atom_feature",
                org.rcsb.cif.model.generated.IhmPolyAtomFeature::new).get();
    }

    public org.rcsb.cif.model.generated.IhmPolyResidueFeature getIhmPolyResidueFeature() {
        return (org.rcsb.cif.model.generated.IhmPolyResidueFeature) categories.computeIfAbsent("ihm_poly_residue_feature",
                org.rcsb.cif.model.generated.IhmPolyResidueFeature::new).get();
    }

    public org.rcsb.cif.model.generated.IhmNonPolyFeature getIhmNonPolyFeature() {
        return (org.rcsb.cif.model.generated.IhmNonPolyFeature) categories.computeIfAbsent("ihm_non_poly_feature",
                org.rcsb.cif.model.generated.IhmNonPolyFeature::new).get();
    }

    public org.rcsb.cif.model.generated.IhmInterfaceResidueFeature getIhmInterfaceResidueFeature() {
        return (org.rcsb.cif.model.generated.IhmInterfaceResidueFeature) categories.computeIfAbsent("ihm_interface_residue_feature",
                org.rcsb.cif.model.generated.IhmInterfaceResidueFeature::new).get();
    }

    public org.rcsb.cif.model.generated.IhmDerivedDistanceRestraint getIhmDerivedDistanceRestraint() {
        return (org.rcsb.cif.model.generated.IhmDerivedDistanceRestraint) categories.computeIfAbsent("ihm_derived_distance_restraint",
                org.rcsb.cif.model.generated.IhmDerivedDistanceRestraint::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectList getIhmGeometricObjectList() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectList) categories.computeIfAbsent("ihm_geometric_object_list",
                org.rcsb.cif.model.generated.IhmGeometricObjectList::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectCenter getIhmGeometricObjectCenter() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectCenter) categories.computeIfAbsent("ihm_geometric_object_center",
                org.rcsb.cif.model.generated.IhmGeometricObjectCenter::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectTransformation getIhmGeometricObjectTransformation() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectTransformation) categories.computeIfAbsent("ihm_geometric_object_transformation",
                org.rcsb.cif.model.generated.IhmGeometricObjectTransformation::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectSphere getIhmGeometricObjectSphere() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectSphere) categories.computeIfAbsent("ihm_geometric_object_sphere",
                org.rcsb.cif.model.generated.IhmGeometricObjectSphere::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectTorus getIhmGeometricObjectTorus() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectTorus) categories.computeIfAbsent("ihm_geometric_object_torus",
                org.rcsb.cif.model.generated.IhmGeometricObjectTorus::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectHalfTorus getIhmGeometricObjectHalfTorus() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectHalfTorus) categories.computeIfAbsent("ihm_geometric_object_half_torus",
                org.rcsb.cif.model.generated.IhmGeometricObjectHalfTorus::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectAxis getIhmGeometricObjectAxis() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectAxis) categories.computeIfAbsent("ihm_geometric_object_axis",
                org.rcsb.cif.model.generated.IhmGeometricObjectAxis::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectPlane getIhmGeometricObjectPlane() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectPlane) categories.computeIfAbsent("ihm_geometric_object_plane",
                org.rcsb.cif.model.generated.IhmGeometricObjectPlane::new).get();
    }

    public org.rcsb.cif.model.generated.IhmGeometricObjectDistanceRestraint getIhmGeometricObjectDistanceRestraint() {
        return (org.rcsb.cif.model.generated.IhmGeometricObjectDistanceRestraint) categories.computeIfAbsent("ihm_geometric_object_distance_restraint",
                org.rcsb.cif.model.generated.IhmGeometricObjectDistanceRestraint::new).get();
    }
}
