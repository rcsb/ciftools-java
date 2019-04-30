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
                org.rcsb.cif.model.generated.AtomSite::new);
    }

    public org.rcsb.cif.model.generated.AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return (org.rcsb.cif.model.generated.AtomSiteAnisotrop) categories.computeIfAbsent("atom_site_anisotrop",
                org.rcsb.cif.model.generated.AtomSiteAnisotrop::new);
    }

    public org.rcsb.cif.model.generated.AtomSites getAtomSites() {
        return (org.rcsb.cif.model.generated.AtomSites) categories.computeIfAbsent("atom_sites",
                org.rcsb.cif.model.generated.AtomSites::new);
    }

    public org.rcsb.cif.model.generated.AtomSitesAlt getAtomSitesAlt() {
        return (org.rcsb.cif.model.generated.AtomSitesAlt) categories.computeIfAbsent("atom_sites_alt",
                org.rcsb.cif.model.generated.AtomSitesAlt::new);
    }

    public org.rcsb.cif.model.generated.AtomSitesAltEns getAtomSitesAltEns() {
        return (org.rcsb.cif.model.generated.AtomSitesAltEns) categories.computeIfAbsent("atom_sites_alt_ens",
                org.rcsb.cif.model.generated.AtomSitesAltEns::new);
    }

    public org.rcsb.cif.model.generated.AtomSitesAltGen getAtomSitesAltGen() {
        return (org.rcsb.cif.model.generated.AtomSitesAltGen) categories.computeIfAbsent("atom_sites_alt_gen",
                org.rcsb.cif.model.generated.AtomSitesAltGen::new);
    }

    public org.rcsb.cif.model.generated.AtomSitesFootnote getAtomSitesFootnote() {
        return (org.rcsb.cif.model.generated.AtomSitesFootnote) categories.computeIfAbsent("atom_sites_footnote",
                org.rcsb.cif.model.generated.AtomSitesFootnote::new);
    }

    public org.rcsb.cif.model.generated.AtomType getAtomType() {
        return (org.rcsb.cif.model.generated.AtomType) categories.computeIfAbsent("atom_type",
                org.rcsb.cif.model.generated.AtomType::new);
    }

    public org.rcsb.cif.model.generated.Audit getAudit() {
        return (org.rcsb.cif.model.generated.Audit) categories.computeIfAbsent("audit",
                org.rcsb.cif.model.generated.Audit::new);
    }

    public org.rcsb.cif.model.generated.AuditAuthor getAuditAuthor() {
        return (org.rcsb.cif.model.generated.AuditAuthor) categories.computeIfAbsent("audit_author",
                org.rcsb.cif.model.generated.AuditAuthor::new);
    }

    public org.rcsb.cif.model.generated.AuditConform getAuditConform() {
        return (org.rcsb.cif.model.generated.AuditConform) categories.computeIfAbsent("audit_conform",
                org.rcsb.cif.model.generated.AuditConform::new);
    }

    public org.rcsb.cif.model.generated.AuditContactAuthor getAuditContactAuthor() {
        return (org.rcsb.cif.model.generated.AuditContactAuthor) categories.computeIfAbsent("audit_contact_author",
                org.rcsb.cif.model.generated.AuditContactAuthor::new);
    }

    public org.rcsb.cif.model.generated.Cell getCell() {
        return (org.rcsb.cif.model.generated.Cell) categories.computeIfAbsent("cell",
                org.rcsb.cif.model.generated.Cell::new);
    }

    public org.rcsb.cif.model.generated.CellMeasurement getCellMeasurement() {
        return (org.rcsb.cif.model.generated.CellMeasurement) categories.computeIfAbsent("cell_measurement",
                org.rcsb.cif.model.generated.CellMeasurement::new);
    }

    public org.rcsb.cif.model.generated.CellMeasurementRefln getCellMeasurementRefln() {
        return (org.rcsb.cif.model.generated.CellMeasurementRefln) categories.computeIfAbsent("cell_measurement_refln",
                org.rcsb.cif.model.generated.CellMeasurementRefln::new);
    }

    public org.rcsb.cif.model.generated.ChemComp getChemComp() {
        return (org.rcsb.cif.model.generated.ChemComp) categories.computeIfAbsent("chem_comp",
                org.rcsb.cif.model.generated.ChemComp::new);
    }

    public org.rcsb.cif.model.generated.ChemCompAngle getChemCompAngle() {
        return (org.rcsb.cif.model.generated.ChemCompAngle) categories.computeIfAbsent("chem_comp_angle",
                org.rcsb.cif.model.generated.ChemCompAngle::new);
    }

    public org.rcsb.cif.model.generated.ChemCompAtom getChemCompAtom() {
        return (org.rcsb.cif.model.generated.ChemCompAtom) categories.computeIfAbsent("chem_comp_atom",
                org.rcsb.cif.model.generated.ChemCompAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemCompBond getChemCompBond() {
        return (org.rcsb.cif.model.generated.ChemCompBond) categories.computeIfAbsent("chem_comp_bond",
                org.rcsb.cif.model.generated.ChemCompBond::new);
    }

    public org.rcsb.cif.model.generated.ChemCompChir getChemCompChir() {
        return (org.rcsb.cif.model.generated.ChemCompChir) categories.computeIfAbsent("chem_comp_chir",
                org.rcsb.cif.model.generated.ChemCompChir::new);
    }

    public org.rcsb.cif.model.generated.ChemCompChirAtom getChemCompChirAtom() {
        return (org.rcsb.cif.model.generated.ChemCompChirAtom) categories.computeIfAbsent("chem_comp_chir_atom",
                org.rcsb.cif.model.generated.ChemCompChirAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemCompLink getChemCompLink() {
        return (org.rcsb.cif.model.generated.ChemCompLink) categories.computeIfAbsent("chem_comp_link",
                org.rcsb.cif.model.generated.ChemCompLink::new);
    }

    public org.rcsb.cif.model.generated.ChemCompPlane getChemCompPlane() {
        return (org.rcsb.cif.model.generated.ChemCompPlane) categories.computeIfAbsent("chem_comp_plane",
                org.rcsb.cif.model.generated.ChemCompPlane::new);
    }

    public org.rcsb.cif.model.generated.ChemCompPlaneAtom getChemCompPlaneAtom() {
        return (org.rcsb.cif.model.generated.ChemCompPlaneAtom) categories.computeIfAbsent("chem_comp_plane_atom",
                org.rcsb.cif.model.generated.ChemCompPlaneAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemCompTor getChemCompTor() {
        return (org.rcsb.cif.model.generated.ChemCompTor) categories.computeIfAbsent("chem_comp_tor",
                org.rcsb.cif.model.generated.ChemCompTor::new);
    }

    public org.rcsb.cif.model.generated.ChemCompTorValue getChemCompTorValue() {
        return (org.rcsb.cif.model.generated.ChemCompTorValue) categories.computeIfAbsent("chem_comp_tor_value",
                org.rcsb.cif.model.generated.ChemCompTorValue::new);
    }

    public org.rcsb.cif.model.generated.ChemLink getChemLink() {
        return (org.rcsb.cif.model.generated.ChemLink) categories.computeIfAbsent("chem_link",
                org.rcsb.cif.model.generated.ChemLink::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkAngle getChemLinkAngle() {
        return (org.rcsb.cif.model.generated.ChemLinkAngle) categories.computeIfAbsent("chem_link_angle",
                org.rcsb.cif.model.generated.ChemLinkAngle::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkBond getChemLinkBond() {
        return (org.rcsb.cif.model.generated.ChemLinkBond) categories.computeIfAbsent("chem_link_bond",
                org.rcsb.cif.model.generated.ChemLinkBond::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkChir getChemLinkChir() {
        return (org.rcsb.cif.model.generated.ChemLinkChir) categories.computeIfAbsent("chem_link_chir",
                org.rcsb.cif.model.generated.ChemLinkChir::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkChirAtom getChemLinkChirAtom() {
        return (org.rcsb.cif.model.generated.ChemLinkChirAtom) categories.computeIfAbsent("chem_link_chir_atom",
                org.rcsb.cif.model.generated.ChemLinkChirAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkPlane getChemLinkPlane() {
        return (org.rcsb.cif.model.generated.ChemLinkPlane) categories.computeIfAbsent("chem_link_plane",
                org.rcsb.cif.model.generated.ChemLinkPlane::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkPlaneAtom getChemLinkPlaneAtom() {
        return (org.rcsb.cif.model.generated.ChemLinkPlaneAtom) categories.computeIfAbsent("chem_link_plane_atom",
                org.rcsb.cif.model.generated.ChemLinkPlaneAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkTor getChemLinkTor() {
        return (org.rcsb.cif.model.generated.ChemLinkTor) categories.computeIfAbsent("chem_link_tor",
                org.rcsb.cif.model.generated.ChemLinkTor::new);
    }

    public org.rcsb.cif.model.generated.ChemLinkTorValue getChemLinkTorValue() {
        return (org.rcsb.cif.model.generated.ChemLinkTorValue) categories.computeIfAbsent("chem_link_tor_value",
                org.rcsb.cif.model.generated.ChemLinkTorValue::new);
    }

    public org.rcsb.cif.model.generated.Chemical getChemical() {
        return (org.rcsb.cif.model.generated.Chemical) categories.computeIfAbsent("chemical",
                org.rcsb.cif.model.generated.Chemical::new);
    }

    public org.rcsb.cif.model.generated.ChemicalConnAtom getChemicalConnAtom() {
        return (org.rcsb.cif.model.generated.ChemicalConnAtom) categories.computeIfAbsent("chemical_conn_atom",
                org.rcsb.cif.model.generated.ChemicalConnAtom::new);
    }

    public org.rcsb.cif.model.generated.ChemicalConnBond getChemicalConnBond() {
        return (org.rcsb.cif.model.generated.ChemicalConnBond) categories.computeIfAbsent("chemical_conn_bond",
                org.rcsb.cif.model.generated.ChemicalConnBond::new);
    }

    public org.rcsb.cif.model.generated.ChemicalFormula getChemicalFormula() {
        return (org.rcsb.cif.model.generated.ChemicalFormula) categories.computeIfAbsent("chemical_formula",
                org.rcsb.cif.model.generated.ChemicalFormula::new);
    }

    public org.rcsb.cif.model.generated.Citation getCitation() {
        return (org.rcsb.cif.model.generated.Citation) categories.computeIfAbsent("citation",
                org.rcsb.cif.model.generated.Citation::new);
    }

    public org.rcsb.cif.model.generated.CitationAuthor getCitationAuthor() {
        return (org.rcsb.cif.model.generated.CitationAuthor) categories.computeIfAbsent("citation_author",
                org.rcsb.cif.model.generated.CitationAuthor::new);
    }

    public org.rcsb.cif.model.generated.CitationEditor getCitationEditor() {
        return (org.rcsb.cif.model.generated.CitationEditor) categories.computeIfAbsent("citation_editor",
                org.rcsb.cif.model.generated.CitationEditor::new);
    }

    public org.rcsb.cif.model.generated.Computing getComputing() {
        return (org.rcsb.cif.model.generated.Computing) categories.computeIfAbsent("computing",
                org.rcsb.cif.model.generated.Computing::new);
    }

    public org.rcsb.cif.model.generated.Database getDatabase() {
        return (org.rcsb.cif.model.generated.Database) categories.computeIfAbsent("database",
                org.rcsb.cif.model.generated.Database::new);
    }

    public org.rcsb.cif.model.generated.Database2 getDatabase2() {
        return (org.rcsb.cif.model.generated.Database2) categories.computeIfAbsent("database_2",
                org.rcsb.cif.model.generated.Database2::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBCaveat getDatabasePDBCaveat() {
        return (org.rcsb.cif.model.generated.DatabasePDBCaveat) categories.computeIfAbsent("database_PDB_caveat",
                org.rcsb.cif.model.generated.DatabasePDBCaveat::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBMatrix getDatabasePDBMatrix() {
        return (org.rcsb.cif.model.generated.DatabasePDBMatrix) categories.computeIfAbsent("database_PDB_matrix",
                org.rcsb.cif.model.generated.DatabasePDBMatrix::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBRemark getDatabasePDBRemark() {
        return (org.rcsb.cif.model.generated.DatabasePDBRemark) categories.computeIfAbsent("database_PDB_remark",
                org.rcsb.cif.model.generated.DatabasePDBRemark::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBRev getDatabasePDBRev() {
        return (org.rcsb.cif.model.generated.DatabasePDBRev) categories.computeIfAbsent("database_PDB_rev",
                org.rcsb.cif.model.generated.DatabasePDBRev::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBRevRecord getDatabasePDBRevRecord() {
        return (org.rcsb.cif.model.generated.DatabasePDBRevRecord) categories.computeIfAbsent("database_PDB_rev_record",
                org.rcsb.cif.model.generated.DatabasePDBRevRecord::new);
    }

    public org.rcsb.cif.model.generated.DatabasePDBTvect getDatabasePDBTvect() {
        return (org.rcsb.cif.model.generated.DatabasePDBTvect) categories.computeIfAbsent("database_PDB_tvect",
                org.rcsb.cif.model.generated.DatabasePDBTvect::new);
    }

    public org.rcsb.cif.model.generated.Diffrn getDiffrn() {
        return (org.rcsb.cif.model.generated.Diffrn) categories.computeIfAbsent("diffrn",
                org.rcsb.cif.model.generated.Diffrn::new);
    }

    public org.rcsb.cif.model.generated.DiffrnAttenuator getDiffrnAttenuator() {
        return (org.rcsb.cif.model.generated.DiffrnAttenuator) categories.computeIfAbsent("diffrn_attenuator",
                org.rcsb.cif.model.generated.DiffrnAttenuator::new);
    }

    public org.rcsb.cif.model.generated.DiffrnDetector getDiffrnDetector() {
        return (org.rcsb.cif.model.generated.DiffrnDetector) categories.computeIfAbsent("diffrn_detector",
                org.rcsb.cif.model.generated.DiffrnDetector::new);
    }

    public org.rcsb.cif.model.generated.DiffrnMeasurement getDiffrnMeasurement() {
        return (org.rcsb.cif.model.generated.DiffrnMeasurement) categories.computeIfAbsent("diffrn_measurement",
                org.rcsb.cif.model.generated.DiffrnMeasurement::new);
    }

    public org.rcsb.cif.model.generated.DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return (org.rcsb.cif.model.generated.DiffrnOrientMatrix) categories.computeIfAbsent("diffrn_orient_matrix",
                org.rcsb.cif.model.generated.DiffrnOrientMatrix::new);
    }

    public org.rcsb.cif.model.generated.DiffrnOrientRefln getDiffrnOrientRefln() {
        return (org.rcsb.cif.model.generated.DiffrnOrientRefln) categories.computeIfAbsent("diffrn_orient_refln",
                org.rcsb.cif.model.generated.DiffrnOrientRefln::new);
    }

    public org.rcsb.cif.model.generated.DiffrnRadiation getDiffrnRadiation() {
        return (org.rcsb.cif.model.generated.DiffrnRadiation) categories.computeIfAbsent("diffrn_radiation",
                org.rcsb.cif.model.generated.DiffrnRadiation::new);
    }

    public org.rcsb.cif.model.generated.DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return (org.rcsb.cif.model.generated.DiffrnRadiationWavelength) categories.computeIfAbsent("diffrn_radiation_wavelength",
                org.rcsb.cif.model.generated.DiffrnRadiationWavelength::new);
    }

    public org.rcsb.cif.model.generated.DiffrnRefln getDiffrnRefln() {
        return (org.rcsb.cif.model.generated.DiffrnRefln) categories.computeIfAbsent("diffrn_refln",
                org.rcsb.cif.model.generated.DiffrnRefln::new);
    }

    public org.rcsb.cif.model.generated.DiffrnReflns getDiffrnReflns() {
        return (org.rcsb.cif.model.generated.DiffrnReflns) categories.computeIfAbsent("diffrn_reflns",
                org.rcsb.cif.model.generated.DiffrnReflns::new);
    }

    public org.rcsb.cif.model.generated.DiffrnScaleGroup getDiffrnScaleGroup() {
        return (org.rcsb.cif.model.generated.DiffrnScaleGroup) categories.computeIfAbsent("diffrn_scale_group",
                org.rcsb.cif.model.generated.DiffrnScaleGroup::new);
    }

    public org.rcsb.cif.model.generated.DiffrnSource getDiffrnSource() {
        return (org.rcsb.cif.model.generated.DiffrnSource) categories.computeIfAbsent("diffrn_source",
                org.rcsb.cif.model.generated.DiffrnSource::new);
    }

    public org.rcsb.cif.model.generated.DiffrnStandardRefln getDiffrnStandardRefln() {
        return (org.rcsb.cif.model.generated.DiffrnStandardRefln) categories.computeIfAbsent("diffrn_standard_refln",
                org.rcsb.cif.model.generated.DiffrnStandardRefln::new);
    }

    public org.rcsb.cif.model.generated.DiffrnStandards getDiffrnStandards() {
        return (org.rcsb.cif.model.generated.DiffrnStandards) categories.computeIfAbsent("diffrn_standards",
                org.rcsb.cif.model.generated.DiffrnStandards::new);
    }

    public org.rcsb.cif.model.generated.Entity getEntity() {
        return (org.rcsb.cif.model.generated.Entity) categories.computeIfAbsent("entity",
                org.rcsb.cif.model.generated.Entity::new);
    }

    public org.rcsb.cif.model.generated.EntityKeywords getEntityKeywords() {
        return (org.rcsb.cif.model.generated.EntityKeywords) categories.computeIfAbsent("entity_keywords",
                org.rcsb.cif.model.generated.EntityKeywords::new);
    }

    public org.rcsb.cif.model.generated.EntityLink getEntityLink() {
        return (org.rcsb.cif.model.generated.EntityLink) categories.computeIfAbsent("entity_link",
                org.rcsb.cif.model.generated.EntityLink::new);
    }

    public org.rcsb.cif.model.generated.EntityNameCom getEntityNameCom() {
        return (org.rcsb.cif.model.generated.EntityNameCom) categories.computeIfAbsent("entity_name_com",
                org.rcsb.cif.model.generated.EntityNameCom::new);
    }

    public org.rcsb.cif.model.generated.EntityNameSys getEntityNameSys() {
        return (org.rcsb.cif.model.generated.EntityNameSys) categories.computeIfAbsent("entity_name_sys",
                org.rcsb.cif.model.generated.EntityNameSys::new);
    }

    public org.rcsb.cif.model.generated.EntityPoly getEntityPoly() {
        return (org.rcsb.cif.model.generated.EntityPoly) categories.computeIfAbsent("entity_poly",
                org.rcsb.cif.model.generated.EntityPoly::new);
    }

    public org.rcsb.cif.model.generated.EntityPolySeq getEntityPolySeq() {
        return (org.rcsb.cif.model.generated.EntityPolySeq) categories.computeIfAbsent("entity_poly_seq",
                org.rcsb.cif.model.generated.EntityPolySeq::new);
    }

    public org.rcsb.cif.model.generated.Entry getEntry() {
        return (org.rcsb.cif.model.generated.Entry) categories.computeIfAbsent("entry",
                org.rcsb.cif.model.generated.Entry::new);
    }

    public org.rcsb.cif.model.generated.EntryLink getEntryLink() {
        return (org.rcsb.cif.model.generated.EntryLink) categories.computeIfAbsent("entry_link",
                org.rcsb.cif.model.generated.EntryLink::new);
    }

    public org.rcsb.cif.model.generated.Exptl getExptl() {
        return (org.rcsb.cif.model.generated.Exptl) categories.computeIfAbsent("exptl",
                org.rcsb.cif.model.generated.Exptl::new);
    }

    public org.rcsb.cif.model.generated.ExptlCrystal getExptlCrystal() {
        return (org.rcsb.cif.model.generated.ExptlCrystal) categories.computeIfAbsent("exptl_crystal",
                org.rcsb.cif.model.generated.ExptlCrystal::new);
    }

    public org.rcsb.cif.model.generated.ExptlCrystalFace getExptlCrystalFace() {
        return (org.rcsb.cif.model.generated.ExptlCrystalFace) categories.computeIfAbsent("exptl_crystal_face",
                org.rcsb.cif.model.generated.ExptlCrystalFace::new);
    }

    public org.rcsb.cif.model.generated.ExptlCrystalGrow getExptlCrystalGrow() {
        return (org.rcsb.cif.model.generated.ExptlCrystalGrow) categories.computeIfAbsent("exptl_crystal_grow",
                org.rcsb.cif.model.generated.ExptlCrystalGrow::new);
    }

    public org.rcsb.cif.model.generated.ExptlCrystalGrowComp getExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.generated.ExptlCrystalGrowComp) categories.computeIfAbsent("exptl_crystal_grow_comp",
                org.rcsb.cif.model.generated.ExptlCrystalGrowComp::new);
    }

    public org.rcsb.cif.model.generated.Geom getGeom() {
        return (org.rcsb.cif.model.generated.Geom) categories.computeIfAbsent("geom",
                org.rcsb.cif.model.generated.Geom::new);
    }

    public org.rcsb.cif.model.generated.GeomAngle getGeomAngle() {
        return (org.rcsb.cif.model.generated.GeomAngle) categories.computeIfAbsent("geom_angle",
                org.rcsb.cif.model.generated.GeomAngle::new);
    }

    public org.rcsb.cif.model.generated.GeomBond getGeomBond() {
        return (org.rcsb.cif.model.generated.GeomBond) categories.computeIfAbsent("geom_bond",
                org.rcsb.cif.model.generated.GeomBond::new);
    }

    public org.rcsb.cif.model.generated.GeomContact getGeomContact() {
        return (org.rcsb.cif.model.generated.GeomContact) categories.computeIfAbsent("geom_contact",
                org.rcsb.cif.model.generated.GeomContact::new);
    }

    public org.rcsb.cif.model.generated.GeomHbond getGeomHbond() {
        return (org.rcsb.cif.model.generated.GeomHbond) categories.computeIfAbsent("geom_hbond",
                org.rcsb.cif.model.generated.GeomHbond::new);
    }

    public org.rcsb.cif.model.generated.GeomTorsion getGeomTorsion() {
        return (org.rcsb.cif.model.generated.GeomTorsion) categories.computeIfAbsent("geom_torsion",
                org.rcsb.cif.model.generated.GeomTorsion::new);
    }

    public org.rcsb.cif.model.generated.Journal getJournal() {
        return (org.rcsb.cif.model.generated.Journal) categories.computeIfAbsent("journal",
                org.rcsb.cif.model.generated.Journal::new);
    }

    public org.rcsb.cif.model.generated.JournalIndex getJournalIndex() {
        return (org.rcsb.cif.model.generated.JournalIndex) categories.computeIfAbsent("journal_index",
                org.rcsb.cif.model.generated.JournalIndex::new);
    }

    public org.rcsb.cif.model.generated.Phasing getPhasing() {
        return (org.rcsb.cif.model.generated.Phasing) categories.computeIfAbsent("phasing",
                org.rcsb.cif.model.generated.Phasing::new);
    }

    public org.rcsb.cif.model.generated.PhasingAveraging getPhasingAveraging() {
        return (org.rcsb.cif.model.generated.PhasingAveraging) categories.computeIfAbsent("phasing_averaging",
                org.rcsb.cif.model.generated.PhasingAveraging::new);
    }

    public org.rcsb.cif.model.generated.PhasingIsomorphous getPhasingIsomorphous() {
        return (org.rcsb.cif.model.generated.PhasingIsomorphous) categories.computeIfAbsent("phasing_isomorphous",
                org.rcsb.cif.model.generated.PhasingIsomorphous::new);
    }

    public org.rcsb.cif.model.generated.PhasingMAD getPhasingMAD() {
        return (org.rcsb.cif.model.generated.PhasingMAD) categories.computeIfAbsent("phasing_MAD",
                org.rcsb.cif.model.generated.PhasingMAD::new);
    }

    public org.rcsb.cif.model.generated.PhasingMADClust getPhasingMADClust() {
        return (org.rcsb.cif.model.generated.PhasingMADClust) categories.computeIfAbsent("phasing_MAD_clust",
                org.rcsb.cif.model.generated.PhasingMADClust::new);
    }

    public org.rcsb.cif.model.generated.PhasingMADExpt getPhasingMADExpt() {
        return (org.rcsb.cif.model.generated.PhasingMADExpt) categories.computeIfAbsent("phasing_MAD_expt",
                org.rcsb.cif.model.generated.PhasingMADExpt::new);
    }

    public org.rcsb.cif.model.generated.PhasingMADRatio getPhasingMADRatio() {
        return (org.rcsb.cif.model.generated.PhasingMADRatio) categories.computeIfAbsent("phasing_MAD_ratio",
                org.rcsb.cif.model.generated.PhasingMADRatio::new);
    }

    public org.rcsb.cif.model.generated.PhasingMADSet getPhasingMADSet() {
        return (org.rcsb.cif.model.generated.PhasingMADSet) categories.computeIfAbsent("phasing_MAD_set",
                org.rcsb.cif.model.generated.PhasingMADSet::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIR getPhasingMIR() {
        return (org.rcsb.cif.model.generated.PhasingMIR) categories.computeIfAbsent("phasing_MIR",
                org.rcsb.cif.model.generated.PhasingMIR::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIRDer getPhasingMIRDer() {
        return (org.rcsb.cif.model.generated.PhasingMIRDer) categories.computeIfAbsent("phasing_MIR_der",
                org.rcsb.cif.model.generated.PhasingMIRDer::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerRefln getPhasingMIRDerRefln() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerRefln) categories.computeIfAbsent("phasing_MIR_der_refln",
                org.rcsb.cif.model.generated.PhasingMIRDerRefln::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerShell getPhasingMIRDerShell() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerShell) categories.computeIfAbsent("phasing_MIR_der_shell",
                org.rcsb.cif.model.generated.PhasingMIRDerShell::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIRDerSite getPhasingMIRDerSite() {
        return (org.rcsb.cif.model.generated.PhasingMIRDerSite) categories.computeIfAbsent("phasing_MIR_der_site",
                org.rcsb.cif.model.generated.PhasingMIRDerSite::new);
    }

    public org.rcsb.cif.model.generated.PhasingMIRShell getPhasingMIRShell() {
        return (org.rcsb.cif.model.generated.PhasingMIRShell) categories.computeIfAbsent("phasing_MIR_shell",
                org.rcsb.cif.model.generated.PhasingMIRShell::new);
    }

    public org.rcsb.cif.model.generated.PhasingSet getPhasingSet() {
        return (org.rcsb.cif.model.generated.PhasingSet) categories.computeIfAbsent("phasing_set",
                org.rcsb.cif.model.generated.PhasingSet::new);
    }

    public org.rcsb.cif.model.generated.PhasingSetRefln getPhasingSetRefln() {
        return (org.rcsb.cif.model.generated.PhasingSetRefln) categories.computeIfAbsent("phasing_set_refln",
                org.rcsb.cif.model.generated.PhasingSetRefln::new);
    }

    public org.rcsb.cif.model.generated.Publ getPubl() {
        return (org.rcsb.cif.model.generated.Publ) categories.computeIfAbsent("publ",
                org.rcsb.cif.model.generated.Publ::new);
    }

    public org.rcsb.cif.model.generated.PublAuthor getPublAuthor() {
        return (org.rcsb.cif.model.generated.PublAuthor) categories.computeIfAbsent("publ_author",
                org.rcsb.cif.model.generated.PublAuthor::new);
    }

    public org.rcsb.cif.model.generated.PublBody getPublBody() {
        return (org.rcsb.cif.model.generated.PublBody) categories.computeIfAbsent("publ_body",
                org.rcsb.cif.model.generated.PublBody::new);
    }

    public org.rcsb.cif.model.generated.PublManuscriptIncl getPublManuscriptIncl() {
        return (org.rcsb.cif.model.generated.PublManuscriptIncl) categories.computeIfAbsent("publ_manuscript_incl",
                org.rcsb.cif.model.generated.PublManuscriptIncl::new);
    }

    public org.rcsb.cif.model.generated.Refine getRefine() {
        return (org.rcsb.cif.model.generated.Refine) categories.computeIfAbsent("refine",
                org.rcsb.cif.model.generated.Refine::new);
    }

    public org.rcsb.cif.model.generated.RefineAnalyze getRefineAnalyze() {
        return (org.rcsb.cif.model.generated.RefineAnalyze) categories.computeIfAbsent("refine_analyze",
                org.rcsb.cif.model.generated.RefineAnalyze::new);
    }

    public org.rcsb.cif.model.generated.RefineBIso getRefineBIso() {
        return (org.rcsb.cif.model.generated.RefineBIso) categories.computeIfAbsent("refine_B_iso",
                org.rcsb.cif.model.generated.RefineBIso::new);
    }

    public org.rcsb.cif.model.generated.RefineFunctMinimized getRefineFunctMinimized() {
        return (org.rcsb.cif.model.generated.RefineFunctMinimized) categories.computeIfAbsent("refine_funct_minimized",
                org.rcsb.cif.model.generated.RefineFunctMinimized::new);
    }

    public org.rcsb.cif.model.generated.RefineHist getRefineHist() {
        return (org.rcsb.cif.model.generated.RefineHist) categories.computeIfAbsent("refine_hist",
                org.rcsb.cif.model.generated.RefineHist::new);
    }

    public org.rcsb.cif.model.generated.RefineLsRestr getRefineLsRestr() {
        return (org.rcsb.cif.model.generated.RefineLsRestr) categories.computeIfAbsent("refine_ls_restr",
                org.rcsb.cif.model.generated.RefineLsRestr::new);
    }

    public org.rcsb.cif.model.generated.RefineLsRestrNcs getRefineLsRestrNcs() {
        return (org.rcsb.cif.model.generated.RefineLsRestrNcs) categories.computeIfAbsent("refine_ls_restr_ncs",
                org.rcsb.cif.model.generated.RefineLsRestrNcs::new);
    }

    public org.rcsb.cif.model.generated.RefineLsRestrType getRefineLsRestrType() {
        return (org.rcsb.cif.model.generated.RefineLsRestrType) categories.computeIfAbsent("refine_ls_restr_type",
                org.rcsb.cif.model.generated.RefineLsRestrType::new);
    }

    public org.rcsb.cif.model.generated.RefineLsShell getRefineLsShell() {
        return (org.rcsb.cif.model.generated.RefineLsShell) categories.computeIfAbsent("refine_ls_shell",
                org.rcsb.cif.model.generated.RefineLsShell::new);
    }

    public org.rcsb.cif.model.generated.RefineOccupancy getRefineOccupancy() {
        return (org.rcsb.cif.model.generated.RefineOccupancy) categories.computeIfAbsent("refine_occupancy",
                org.rcsb.cif.model.generated.RefineOccupancy::new);
    }

    public org.rcsb.cif.model.generated.Refln getRefln() {
        return (org.rcsb.cif.model.generated.Refln) categories.computeIfAbsent("refln",
                org.rcsb.cif.model.generated.Refln::new);
    }

    public org.rcsb.cif.model.generated.ReflnSysAbs getReflnSysAbs() {
        return (org.rcsb.cif.model.generated.ReflnSysAbs) categories.computeIfAbsent("refln_sys_abs",
                org.rcsb.cif.model.generated.ReflnSysAbs::new);
    }

    public org.rcsb.cif.model.generated.Reflns getReflns() {
        return (org.rcsb.cif.model.generated.Reflns) categories.computeIfAbsent("reflns",
                org.rcsb.cif.model.generated.Reflns::new);
    }

    public org.rcsb.cif.model.generated.ReflnsScale getReflnsScale() {
        return (org.rcsb.cif.model.generated.ReflnsScale) categories.computeIfAbsent("reflns_scale",
                org.rcsb.cif.model.generated.ReflnsScale::new);
    }

    public org.rcsb.cif.model.generated.ReflnsShell getReflnsShell() {
        return (org.rcsb.cif.model.generated.ReflnsShell) categories.computeIfAbsent("reflns_shell",
                org.rcsb.cif.model.generated.ReflnsShell::new);
    }

    public org.rcsb.cif.model.generated.Software getSoftware() {
        return (org.rcsb.cif.model.generated.Software) categories.computeIfAbsent("software",
                org.rcsb.cif.model.generated.Software::new);
    }

    public org.rcsb.cif.model.generated.Struct getStruct() {
        return (org.rcsb.cif.model.generated.Struct) categories.computeIfAbsent("struct",
                org.rcsb.cif.model.generated.Struct::new);
    }

    public org.rcsb.cif.model.generated.StructAsym getStructAsym() {
        return (org.rcsb.cif.model.generated.StructAsym) categories.computeIfAbsent("struct_asym",
                org.rcsb.cif.model.generated.StructAsym::new);
    }

    public org.rcsb.cif.model.generated.StructBiol getStructBiol() {
        return (org.rcsb.cif.model.generated.StructBiol) categories.computeIfAbsent("struct_biol",
                org.rcsb.cif.model.generated.StructBiol::new);
    }

    public org.rcsb.cif.model.generated.StructBiolGen getStructBiolGen() {
        return (org.rcsb.cif.model.generated.StructBiolGen) categories.computeIfAbsent("struct_biol_gen",
                org.rcsb.cif.model.generated.StructBiolGen::new);
    }

    public org.rcsb.cif.model.generated.StructBiolKeywords getStructBiolKeywords() {
        return (org.rcsb.cif.model.generated.StructBiolKeywords) categories.computeIfAbsent("struct_biol_keywords",
                org.rcsb.cif.model.generated.StructBiolKeywords::new);
    }

    public org.rcsb.cif.model.generated.StructBiolView getStructBiolView() {
        return (org.rcsb.cif.model.generated.StructBiolView) categories.computeIfAbsent("struct_biol_view",
                org.rcsb.cif.model.generated.StructBiolView::new);
    }

    public org.rcsb.cif.model.generated.StructConf getStructConf() {
        return (org.rcsb.cif.model.generated.StructConf) categories.computeIfAbsent("struct_conf",
                org.rcsb.cif.model.generated.StructConf::new);
    }

    public org.rcsb.cif.model.generated.StructConfType getStructConfType() {
        return (org.rcsb.cif.model.generated.StructConfType) categories.computeIfAbsent("struct_conf_type",
                org.rcsb.cif.model.generated.StructConfType::new);
    }

    public org.rcsb.cif.model.generated.StructConn getStructConn() {
        return (org.rcsb.cif.model.generated.StructConn) categories.computeIfAbsent("struct_conn",
                org.rcsb.cif.model.generated.StructConn::new);
    }

    public org.rcsb.cif.model.generated.StructConnType getStructConnType() {
        return (org.rcsb.cif.model.generated.StructConnType) categories.computeIfAbsent("struct_conn_type",
                org.rcsb.cif.model.generated.StructConnType::new);
    }

    public org.rcsb.cif.model.generated.StructKeywords getStructKeywords() {
        return (org.rcsb.cif.model.generated.StructKeywords) categories.computeIfAbsent("struct_keywords",
                org.rcsb.cif.model.generated.StructKeywords::new);
    }

    public org.rcsb.cif.model.generated.StructMonDetails getStructMonDetails() {
        return (org.rcsb.cif.model.generated.StructMonDetails) categories.computeIfAbsent("struct_mon_details",
                org.rcsb.cif.model.generated.StructMonDetails::new);
    }

    public org.rcsb.cif.model.generated.StructMonNucl getStructMonNucl() {
        return (org.rcsb.cif.model.generated.StructMonNucl) categories.computeIfAbsent("struct_mon_nucl",
                org.rcsb.cif.model.generated.StructMonNucl::new);
    }

    public org.rcsb.cif.model.generated.StructMonProt getStructMonProt() {
        return (org.rcsb.cif.model.generated.StructMonProt) categories.computeIfAbsent("struct_mon_prot",
                org.rcsb.cif.model.generated.StructMonProt::new);
    }

    public org.rcsb.cif.model.generated.StructMonProtCis getStructMonProtCis() {
        return (org.rcsb.cif.model.generated.StructMonProtCis) categories.computeIfAbsent("struct_mon_prot_cis",
                org.rcsb.cif.model.generated.StructMonProtCis::new);
    }

    public org.rcsb.cif.model.generated.StructNcsDom getStructNcsDom() {
        return (org.rcsb.cif.model.generated.StructNcsDom) categories.computeIfAbsent("struct_ncs_dom",
                org.rcsb.cif.model.generated.StructNcsDom::new);
    }

    public org.rcsb.cif.model.generated.StructNcsDomLim getStructNcsDomLim() {
        return (org.rcsb.cif.model.generated.StructNcsDomLim) categories.computeIfAbsent("struct_ncs_dom_lim",
                org.rcsb.cif.model.generated.StructNcsDomLim::new);
    }

    public org.rcsb.cif.model.generated.StructNcsEns getStructNcsEns() {
        return (org.rcsb.cif.model.generated.StructNcsEns) categories.computeIfAbsent("struct_ncs_ens",
                org.rcsb.cif.model.generated.StructNcsEns::new);
    }

    public org.rcsb.cif.model.generated.StructNcsEnsGen getStructNcsEnsGen() {
        return (org.rcsb.cif.model.generated.StructNcsEnsGen) categories.computeIfAbsent("struct_ncs_ens_gen",
                org.rcsb.cif.model.generated.StructNcsEnsGen::new);
    }

    public org.rcsb.cif.model.generated.StructNcsOper getStructNcsOper() {
        return (org.rcsb.cif.model.generated.StructNcsOper) categories.computeIfAbsent("struct_ncs_oper",
                org.rcsb.cif.model.generated.StructNcsOper::new);
    }

    public org.rcsb.cif.model.generated.StructRef getStructRef() {
        return (org.rcsb.cif.model.generated.StructRef) categories.computeIfAbsent("struct_ref",
                org.rcsb.cif.model.generated.StructRef::new);
    }

    public org.rcsb.cif.model.generated.StructRefSeq getStructRefSeq() {
        return (org.rcsb.cif.model.generated.StructRefSeq) categories.computeIfAbsent("struct_ref_seq",
                org.rcsb.cif.model.generated.StructRefSeq::new);
    }

    public org.rcsb.cif.model.generated.StructRefSeqDif getStructRefSeqDif() {
        return (org.rcsb.cif.model.generated.StructRefSeqDif) categories.computeIfAbsent("struct_ref_seq_dif",
                org.rcsb.cif.model.generated.StructRefSeqDif::new);
    }

    public org.rcsb.cif.model.generated.StructSheet getStructSheet() {
        return (org.rcsb.cif.model.generated.StructSheet) categories.computeIfAbsent("struct_sheet",
                org.rcsb.cif.model.generated.StructSheet::new);
    }

    public org.rcsb.cif.model.generated.StructSheetHbond getStructSheetHbond() {
        return (org.rcsb.cif.model.generated.StructSheetHbond) categories.computeIfAbsent("struct_sheet_hbond",
                org.rcsb.cif.model.generated.StructSheetHbond::new);
    }

    public org.rcsb.cif.model.generated.StructSheetOrder getStructSheetOrder() {
        return (org.rcsb.cif.model.generated.StructSheetOrder) categories.computeIfAbsent("struct_sheet_order",
                org.rcsb.cif.model.generated.StructSheetOrder::new);
    }

    public org.rcsb.cif.model.generated.StructSheetRange getStructSheetRange() {
        return (org.rcsb.cif.model.generated.StructSheetRange) categories.computeIfAbsent("struct_sheet_range",
                org.rcsb.cif.model.generated.StructSheetRange::new);
    }

    public org.rcsb.cif.model.generated.StructSheetTopology getStructSheetTopology() {
        return (org.rcsb.cif.model.generated.StructSheetTopology) categories.computeIfAbsent("struct_sheet_topology",
                org.rcsb.cif.model.generated.StructSheetTopology::new);
    }

    public org.rcsb.cif.model.generated.StructSite getStructSite() {
        return (org.rcsb.cif.model.generated.StructSite) categories.computeIfAbsent("struct_site",
                org.rcsb.cif.model.generated.StructSite::new);
    }

    public org.rcsb.cif.model.generated.StructSiteGen getStructSiteGen() {
        return (org.rcsb.cif.model.generated.StructSiteGen) categories.computeIfAbsent("struct_site_gen",
                org.rcsb.cif.model.generated.StructSiteGen::new);
    }

    public org.rcsb.cif.model.generated.StructSiteKeywords getStructSiteKeywords() {
        return (org.rcsb.cif.model.generated.StructSiteKeywords) categories.computeIfAbsent("struct_site_keywords",
                org.rcsb.cif.model.generated.StructSiteKeywords::new);
    }

    public org.rcsb.cif.model.generated.StructSiteView getStructSiteView() {
        return (org.rcsb.cif.model.generated.StructSiteView) categories.computeIfAbsent("struct_site_view",
                org.rcsb.cif.model.generated.StructSiteView::new);
    }

    public org.rcsb.cif.model.generated.Symmetry getSymmetry() {
        return (org.rcsb.cif.model.generated.Symmetry) categories.computeIfAbsent("symmetry",
                org.rcsb.cif.model.generated.Symmetry::new);
    }

    public org.rcsb.cif.model.generated.SymmetryEquiv getSymmetryEquiv() {
        return (org.rcsb.cif.model.generated.SymmetryEquiv) categories.computeIfAbsent("symmetry_equiv",
                org.rcsb.cif.model.generated.SymmetryEquiv::new);
    }

    public org.rcsb.cif.model.generated.AuditLink getAuditLink() {
        return (org.rcsb.cif.model.generated.AuditLink) categories.computeIfAbsent("audit_link",
                org.rcsb.cif.model.generated.AuditLink::new);
    }

    public org.rcsb.cif.model.generated.DiffrnReflnsClass getDiffrnReflnsClass() {
        return (org.rcsb.cif.model.generated.DiffrnReflnsClass) categories.computeIfAbsent("diffrn_reflns_class",
                org.rcsb.cif.model.generated.DiffrnReflnsClass::new);
    }

    public org.rcsb.cif.model.generated.RefineLsClass getRefineLsClass() {
        return (org.rcsb.cif.model.generated.RefineLsClass) categories.computeIfAbsent("refine_ls_class",
                org.rcsb.cif.model.generated.RefineLsClass::new);
    }

    public org.rcsb.cif.model.generated.ReflnsClass getReflnsClass() {
        return (org.rcsb.cif.model.generated.ReflnsClass) categories.computeIfAbsent("reflns_class",
                org.rcsb.cif.model.generated.ReflnsClass::new);
    }

    public org.rcsb.cif.model.generated.SpaceGroup getSpaceGroup() {
        return (org.rcsb.cif.model.generated.SpaceGroup) categories.computeIfAbsent("space_group",
                org.rcsb.cif.model.generated.SpaceGroup::new);
    }

    public org.rcsb.cif.model.generated.SpaceGroupSymop getSpaceGroupSymop() {
        return (org.rcsb.cif.model.generated.SpaceGroupSymop) categories.computeIfAbsent("space_group_symop",
                org.rcsb.cif.model.generated.SpaceGroupSymop::new);
    }

    public org.rcsb.cif.model.generated.ValenceParam getValenceParam() {
        return (org.rcsb.cif.model.generated.ValenceParam) categories.computeIfAbsent("valence_param",
                org.rcsb.cif.model.generated.ValenceParam::new);
    }

    public org.rcsb.cif.model.generated.ValenceRef getValenceRef() {
        return (org.rcsb.cif.model.generated.ValenceRef) categories.computeIfAbsent("valence_ref",
                org.rcsb.cif.model.generated.ValenceRef::new);
    }

    public org.rcsb.cif.model.generated.PdbxAudit getPdbxAudit() {
        return (org.rcsb.cif.model.generated.PdbxAudit) categories.computeIfAbsent("pdbx_audit",
                org.rcsb.cif.model.generated.PdbxAudit::new);
    }

    public org.rcsb.cif.model.generated.PdbxVersion getPdbxVersion() {
        return (org.rcsb.cif.model.generated.PdbxVersion) categories.computeIfAbsent("pdbx_version",
                org.rcsb.cif.model.generated.PdbxVersion::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditAuthor getPdbxAuditAuthor() {
        return (org.rcsb.cif.model.generated.PdbxAuditAuthor) categories.computeIfAbsent("pdbx_audit_author",
                org.rcsb.cif.model.generated.PdbxAuditAuthor::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseMessage getPdbxDatabaseMessage() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseMessage) categories.computeIfAbsent("pdbx_database_message",
                org.rcsb.cif.model.generated.PdbxDatabaseMessage::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr) categories.computeIfAbsent("pdbx_database_PDB_obs_spr",
                org.rcsb.cif.model.generated.PdbxDatabasePDBObsSpr::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseProc getPdbxDatabaseProc() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseProc) categories.computeIfAbsent("pdbx_database_proc",
                org.rcsb.cif.model.generated.PdbxDatabaseProc::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseRemark getPdbxDatabaseRemark() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseRemark) categories.computeIfAbsent("pdbx_database_remark",
                org.rcsb.cif.model.generated.PdbxDatabaseRemark::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseStatus getPdbxDatabaseStatus() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseStatus) categories.computeIfAbsent("pdbx_database_status",
                org.rcsb.cif.model.generated.PdbxDatabaseStatus::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityName getPdbxEntityName() {
        return (org.rcsb.cif.model.generated.PdbxEntityName) categories.computeIfAbsent("pdbx_entity_name",
                org.rcsb.cif.model.generated.PdbxEntityName::new);
    }

    public org.rcsb.cif.model.generated.PdbxPrereleaseSeq getPdbxPrereleaseSeq() {
        return (org.rcsb.cif.model.generated.PdbxPrereleaseSeq) categories.computeIfAbsent("pdbx_prerelease_seq",
                org.rcsb.cif.model.generated.PdbxPrereleaseSeq::new);
    }

    public org.rcsb.cif.model.generated.PdbxPolySeqScheme getPdbxPolySeqScheme() {
        return (org.rcsb.cif.model.generated.PdbxPolySeqScheme) categories.computeIfAbsent("pdbx_poly_seq_scheme",
                org.rcsb.cif.model.generated.PdbxPolySeqScheme::new);
    }

    public org.rcsb.cif.model.generated.PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return (org.rcsb.cif.model.generated.PdbxNonpolyScheme) categories.computeIfAbsent("pdbx_nonpoly_scheme",
                org.rcsb.cif.model.generated.PdbxNonpolyScheme::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefine getPdbxRefine() {
        return (org.rcsb.cif.model.generated.PdbxRefine) categories.computeIfAbsent("pdbx_refine",
                org.rcsb.cif.model.generated.PdbxRefine::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructSheetHbond getPdbxStructSheetHbond() {
        return (org.rcsb.cif.model.generated.PdbxStructSheetHbond) categories.computeIfAbsent("pdbx_struct_sheet_hbond",
                org.rcsb.cif.model.generated.PdbxStructSheetHbond::new);
    }

    public org.rcsb.cif.model.generated.PdbxXplorFile getPdbxXplorFile() {
        return (org.rcsb.cif.model.generated.PdbxXplorFile) categories.computeIfAbsent("pdbx_xplor_file",
                org.rcsb.cif.model.generated.PdbxXplorFile::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefineAuxFile getPdbxRefineAuxFile() {
        return (org.rcsb.cif.model.generated.PdbxRefineAuxFile) categories.computeIfAbsent("pdbx_refine_aux_file",
                org.rcsb.cif.model.generated.PdbxRefineAuxFile::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseRelated getPdbxDatabaseRelated() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseRelated) categories.computeIfAbsent("pdbx_database_related",
                org.rcsb.cif.model.generated.PdbxDatabaseRelated::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityAssembly getPdbxEntityAssembly() {
        return (org.rcsb.cif.model.generated.PdbxEntityAssembly) categories.computeIfAbsent("pdbx_entity_assembly",
                org.rcsb.cif.model.generated.PdbxEntityAssembly::new);
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp) categories.computeIfAbsent("pdbx_exptl_crystal_grow_comp",
                org.rcsb.cif.model.generated.PdbxExptlCrystalGrowComp::new);
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol) categories.computeIfAbsent("pdbx_exptl_crystal_grow_sol",
                org.rcsb.cif.model.generated.PdbxExptlCrystalGrowSol::new);
    }

    public org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment() {
        return (org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment) categories.computeIfAbsent("pdbx_exptl_crystal_cryo_treatment",
                org.rcsb.cif.model.generated.PdbxExptlCrystalCryoTreatment::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefineTls getPdbxRefineTls() {
        return (org.rcsb.cif.model.generated.PdbxRefineTls) categories.computeIfAbsent("pdbx_refine_tls",
                org.rcsb.cif.model.generated.PdbxRefineTls::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefineTlsGroup getPdbxRefineTlsGroup() {
        return (org.rcsb.cif.model.generated.PdbxRefineTlsGroup) categories.computeIfAbsent("pdbx_refine_tls_group",
                org.rcsb.cif.model.generated.PdbxRefineTlsGroup::new);
    }

    public org.rcsb.cif.model.generated.PdbxContactAuthor getPdbxContactAuthor() {
        return (org.rcsb.cif.model.generated.PdbxContactAuthor) categories.computeIfAbsent("pdbx_contact_author",
                org.rcsb.cif.model.generated.PdbxContactAuthor::new);
    }

    public org.rcsb.cif.model.generated.PdbxSGProject getPdbxSGProject() {
        return (org.rcsb.cif.model.generated.PdbxSGProject) categories.computeIfAbsent("pdbx_SG_project",
                org.rcsb.cif.model.generated.PdbxSGProject::new);
    }

    public org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls() {
        return (org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls) categories.computeIfAbsent("pdbx_atom_site_aniso_tls",
                org.rcsb.cif.model.generated.PdbxAtomSiteAnisoTls::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrDetails getPdbxNmrDetails() {
        return (org.rcsb.cif.model.generated.PdbxNmrDetails) categories.computeIfAbsent("pdbx_nmr_details",
                org.rcsb.cif.model.generated.PdbxNmrDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSampleDetails getPdbxNmrSampleDetails() {
        return (org.rcsb.cif.model.generated.PdbxNmrSampleDetails) categories.computeIfAbsent("pdbx_nmr_sample_details",
                org.rcsb.cif.model.generated.PdbxNmrSampleDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptlSample getPdbxNmrExptlSample() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptlSample) categories.computeIfAbsent("pdbx_nmr_exptl_sample",
                org.rcsb.cif.model.generated.PdbxNmrExptlSample::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions) categories.computeIfAbsent("pdbx_nmr_exptl_sample_conditions",
                org.rcsb.cif.model.generated.PdbxNmrExptlSampleConditions::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectrometer getPdbxNmrSpectrometer() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectrometer) categories.computeIfAbsent("pdbx_nmr_spectrometer",
                org.rcsb.cif.model.generated.PdbxNmrSpectrometer::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrExptl getPdbxNmrExptl() {
        return (org.rcsb.cif.model.generated.PdbxNmrExptl) categories.computeIfAbsent("pdbx_nmr_exptl",
                org.rcsb.cif.model.generated.PdbxNmrExptl::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSoftware getPdbxNmrSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrSoftware) categories.computeIfAbsent("pdbx_nmr_software",
                org.rcsb.cif.model.generated.PdbxNmrSoftware::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrConstraints getPdbxNmrConstraints() {
        return (org.rcsb.cif.model.generated.PdbxNmrConstraints) categories.computeIfAbsent("pdbx_nmr_constraints",
                org.rcsb.cif.model.generated.PdbxNmrConstraints::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrEnsemble getPdbxNmrEnsemble() {
        return (org.rcsb.cif.model.generated.PdbxNmrEnsemble) categories.computeIfAbsent("pdbx_nmr_ensemble",
                org.rcsb.cif.model.generated.PdbxNmrEnsemble::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms() {
        return (org.rcsb.cif.model.generated.PdbxNmrEnsembleRms) categories.computeIfAbsent("pdbx_nmr_ensemble_rms",
                org.rcsb.cif.model.generated.PdbxNmrEnsembleRms::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrRepresentative getPdbxNmrRepresentative() {
        return (org.rcsb.cif.model.generated.PdbxNmrRepresentative) categories.computeIfAbsent("pdbx_nmr_representative",
                org.rcsb.cif.model.generated.PdbxNmrRepresentative::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrRefine getPdbxNmrRefine() {
        return (org.rcsb.cif.model.generated.PdbxNmrRefine) categories.computeIfAbsent("pdbx_nmr_refine",
                org.rcsb.cif.model.generated.PdbxNmrRefine::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrForceConstants getPdbxNmrForceConstants() {
        return (org.rcsb.cif.model.generated.PdbxNmrForceConstants) categories.computeIfAbsent("pdbx_nmr_force_constants",
                org.rcsb.cif.model.generated.PdbxNmrForceConstants::new);
    }

    public org.rcsb.cif.model.generated.NdbStructConfNa getNdbStructConfNa() {
        return (org.rcsb.cif.model.generated.NdbStructConfNa) categories.computeIfAbsent("ndb_struct_conf_na",
                org.rcsb.cif.model.generated.NdbStructConfNa::new);
    }

    public org.rcsb.cif.model.generated.NdbStructFeatureNa getNdbStructFeatureNa() {
        return (org.rcsb.cif.model.generated.NdbStructFeatureNa) categories.computeIfAbsent("ndb_struct_feature_na",
                org.rcsb.cif.model.generated.NdbStructFeatureNa::new);
    }

    public org.rcsb.cif.model.generated.NdbStructNaBasePair getNdbStructNaBasePair() {
        return (org.rcsb.cif.model.generated.NdbStructNaBasePair) categories.computeIfAbsent("ndb_struct_na_base_pair",
                org.rcsb.cif.model.generated.NdbStructNaBasePair::new);
    }

    public org.rcsb.cif.model.generated.NdbStructNaBasePairStep getNdbStructNaBasePairStep() {
        return (org.rcsb.cif.model.generated.NdbStructNaBasePairStep) categories.computeIfAbsent("ndb_struct_na_base_pair_step",
                org.rcsb.cif.model.generated.NdbStructNaBasePairStep::new);
    }

    public org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates() {
        return (org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates) categories.computeIfAbsent("ndb_original_ndb_coordinates",
                org.rcsb.cif.model.generated.NdbOriginalNdbCoordinates::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityNonpoly getPdbxEntityNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxEntityNonpoly) categories.computeIfAbsent("pdbx_entity_nonpoly",
                org.rcsb.cif.model.generated.PdbxEntityNonpoly::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingDm getPdbxPhasingDm() {
        return (org.rcsb.cif.model.generated.PdbxPhasingDm) categories.computeIfAbsent("pdbx_phasing_dm",
                org.rcsb.cif.model.generated.PdbxPhasingDm::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingDmShell getPdbxPhasingDmShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingDmShell) categories.computeIfAbsent("pdbx_phasing_dm_shell",
                org.rcsb.cif.model.generated.PdbxPhasingDmShell::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADShell getPdbxPhasingMADShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADShell) categories.computeIfAbsent("pdbx_phasing_MAD_shell",
                org.rcsb.cif.model.generated.PdbxPhasingMADShell::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSet getPdbxPhasingMADSet() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSet) categories.computeIfAbsent("pdbx_phasing_MAD_set",
                org.rcsb.cif.model.generated.PdbxPhasingMADSet::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSetShell) categories.computeIfAbsent("pdbx_phasing_MAD_set_shell",
                org.rcsb.cif.model.generated.PdbxPhasingMADSetShell::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMADSetSite) categories.computeIfAbsent("pdbx_phasing_MAD_set_site",
                org.rcsb.cif.model.generated.PdbxPhasingMADSetSite::new);
    }

    public org.rcsb.cif.model.generated.PdbxPhasingMR getPdbxPhasingMR() {
        return (org.rcsb.cif.model.generated.PdbxPhasingMR) categories.computeIfAbsent("pdbx_phasing_MR",
                org.rcsb.cif.model.generated.PdbxPhasingMR::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefineComponent getPdbxRefineComponent() {
        return (org.rcsb.cif.model.generated.PdbxRefineComponent) categories.computeIfAbsent("pdbx_refine_component",
                org.rcsb.cif.model.generated.PdbxRefineComponent::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityProdProtocol getPdbxEntityProdProtocol() {
        return (org.rcsb.cif.model.generated.PdbxEntityProdProtocol) categories.computeIfAbsent("pdbx_entity_prod_protocol",
                org.rcsb.cif.model.generated.PdbxEntityProdProtocol::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOther::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter) categories.computeIfAbsent("pdbx_entity_src_gen_prod_other_parameter",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdOtherParameter::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr) categories.computeIfAbsent("pdbx_entity_src_gen_prod_pcr",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdPcr::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest) categories.computeIfAbsent("pdbx_entity_src_gen_prod_digest",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProdDigest::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenClone) categories.computeIfAbsent("pdbx_entity_src_gen_clone",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenClone::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation) categories.computeIfAbsent("pdbx_entity_src_gen_clone_ligation",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneLigation::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination) categories.computeIfAbsent("pdbx_entity_src_gen_clone_recombination",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCloneRecombination::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress) categories.computeIfAbsent("pdbx_entity_src_gen_express",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenExpress::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint) categories.computeIfAbsent("pdbx_entity_src_gen_express_timepoint",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenExpressTimepoint::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis) categories.computeIfAbsent("pdbx_entity_src_gen_lysis",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenLysis::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold) categories.computeIfAbsent("pdbx_entity_src_gen_refold",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenRefold::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis) categories.computeIfAbsent("pdbx_entity_src_gen_proteolysis",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenProteolysis::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom) categories.computeIfAbsent("pdbx_entity_src_gen_chrom",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenChrom::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenFract) categories.computeIfAbsent("pdbx_entity_src_gen_fract",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenFract::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenPure) categories.computeIfAbsent("pdbx_entity_src_gen_pure",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenPure::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter) categories.computeIfAbsent("pdbx_entity_src_gen_character",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenCharacter::new);
    }

    public org.rcsb.cif.model.generated.PdbxConstruct getPdbxConstruct() {
        return (org.rcsb.cif.model.generated.PdbxConstruct) categories.computeIfAbsent("pdbx_construct",
                org.rcsb.cif.model.generated.PdbxConstruct::new);
    }

    public org.rcsb.cif.model.generated.PdbxConstructFeature getPdbxConstructFeature() {
        return (org.rcsb.cif.model.generated.PdbxConstructFeature) categories.computeIfAbsent("pdbx_construct_feature",
                org.rcsb.cif.model.generated.PdbxConstructFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxRobotSystem getPdbxRobotSystem() {
        return (org.rcsb.cif.model.generated.PdbxRobotSystem) categories.computeIfAbsent("pdbx_robot_system",
                org.rcsb.cif.model.generated.PdbxRobotSystem::new);
    }

    public org.rcsb.cif.model.generated.PdbxBuffer getPdbxBuffer() {
        return (org.rcsb.cif.model.generated.PdbxBuffer) categories.computeIfAbsent("pdbx_buffer",
                org.rcsb.cif.model.generated.PdbxBuffer::new);
    }

    public org.rcsb.cif.model.generated.PdbxBufferComponents getPdbxBufferComponents() {
        return (org.rcsb.cif.model.generated.PdbxBufferComponents) categories.computeIfAbsent("pdbx_buffer_components",
                org.rcsb.cif.model.generated.PdbxBufferComponents::new);
    }

    public org.rcsb.cif.model.generated.PdbxDomain getPdbxDomain() {
        return (org.rcsb.cif.model.generated.PdbxDomain) categories.computeIfAbsent("pdbx_domain",
                org.rcsb.cif.model.generated.PdbxDomain::new);
    }

    public org.rcsb.cif.model.generated.PdbxDomainRange getPdbxDomainRange() {
        return (org.rcsb.cif.model.generated.PdbxDomainRange) categories.computeIfAbsent("pdbx_domain_range",
                org.rcsb.cif.model.generated.PdbxDomainRange::new);
    }

    public org.rcsb.cif.model.generated.PdbxSequenceRange getPdbxSequenceRange() {
        return (org.rcsb.cif.model.generated.PdbxSequenceRange) categories.computeIfAbsent("pdbx_sequence_range",
                org.rcsb.cif.model.generated.PdbxSequenceRange::new);
    }

    public org.rcsb.cif.model.generated.PdbxFeatureEntry getPdbxFeatureEntry() {
        return (org.rcsb.cif.model.generated.PdbxFeatureEntry) categories.computeIfAbsent("pdbx_feature_entry",
                org.rcsb.cif.model.generated.PdbxFeatureEntry::new);
    }

    public org.rcsb.cif.model.generated.PdbxFeatureDomain getPdbxFeatureDomain() {
        return (org.rcsb.cif.model.generated.PdbxFeatureDomain) categories.computeIfAbsent("pdbx_feature_domain",
                org.rcsb.cif.model.generated.PdbxFeatureDomain::new);
    }

    public org.rcsb.cif.model.generated.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange() {
        return (org.rcsb.cif.model.generated.PdbxFeatureSequenceRange) categories.computeIfAbsent("pdbx_feature_sequence_range",
                org.rcsb.cif.model.generated.PdbxFeatureSequenceRange::new);
    }

    public org.rcsb.cif.model.generated.PdbxFeatureAssembly getPdbxFeatureAssembly() {
        return (org.rcsb.cif.model.generated.PdbxFeatureAssembly) categories.computeIfAbsent("pdbx_feature_assembly",
                org.rcsb.cif.model.generated.PdbxFeatureAssembly::new);
    }

    public org.rcsb.cif.model.generated.PdbxFeatureMonomer getPdbxFeatureMonomer() {
        return (org.rcsb.cif.model.generated.PdbxFeatureMonomer) categories.computeIfAbsent("pdbx_feature_monomer",
                org.rcsb.cif.model.generated.PdbxFeatureMonomer::new);
    }

    public org.rcsb.cif.model.generated.PdbxExptlPd getPdbxExptlPd() {
        return (org.rcsb.cif.model.generated.PdbxExptlPd) categories.computeIfAbsent("pdbx_exptl_pd",
                org.rcsb.cif.model.generated.PdbxExptlPd::new);
    }

    public org.rcsb.cif.model.generated.PdbxReflnsTwin getPdbxReflnsTwin() {
        return (org.rcsb.cif.model.generated.PdbxReflnsTwin) categories.computeIfAbsent("pdbx_reflns_twin",
                org.rcsb.cif.model.generated.PdbxReflnsTwin::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructInfo getPdbxStructInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructInfo) categories.computeIfAbsent("pdbx_struct_info",
                org.rcsb.cif.model.generated.PdbxStructInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxReRefinement getPdbxReRefinement() {
        return (org.rcsb.cif.model.generated.PdbxReRefinement) categories.computeIfAbsent("pdbx_re_refinement",
                org.rcsb.cif.model.generated.PdbxReRefinement::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyProp getPdbxStructAssemblyProp() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyProp) categories.computeIfAbsent("pdbx_struct_assembly_prop",
                org.rcsb.cif.model.generated.PdbxStructAssemblyProp::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqFeature) categories.computeIfAbsent("pdbx_struct_ref_seq_feature",
                org.rcsb.cif.model.generated.PdbxStructRefSeqFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp) categories.computeIfAbsent("pdbx_struct_ref_seq_feature_prop",
                org.rcsb.cif.model.generated.PdbxStructRefSeqFeatureProp::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics() {
        return (org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics) categories.computeIfAbsent("pdbx_struct_chem_comp_diagnostics",
                org.rcsb.cif.model.generated.PdbxStructChemCompDiagnostics::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompFeature getPdbxChemCompFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompFeature) categories.computeIfAbsent("pdbx_chem_comp_feature",
                org.rcsb.cif.model.generated.PdbxChemCompFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxCoordinateModel getPdbxCoordinateModel() {
        return (org.rcsb.cif.model.generated.PdbxCoordinateModel) categories.computeIfAbsent("pdbx_coordinate_model",
                org.rcsb.cif.model.generated.PdbxCoordinateModel::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructChemCompFeature getPdbxStructChemCompFeature() {
        return (org.rcsb.cif.model.generated.PdbxStructChemCompFeature) categories.computeIfAbsent("pdbx_struct_chem_comp_feature",
                org.rcsb.cif.model.generated.PdbxStructChemCompFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell() {
        return (org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell) categories.computeIfAbsent("pdbx_diffrn_reflns_shell",
                org.rcsb.cif.model.generated.PdbxDiffrnReflnsShell::new);
    }

    public org.rcsb.cif.model.generated.PdbxBondDistanceLimits getPdbxBondDistanceLimits() {
        return (org.rcsb.cif.model.generated.PdbxBondDistanceLimits) categories.computeIfAbsent("pdbx_bond_distance_limits",
                org.rcsb.cif.model.generated.PdbxBondDistanceLimits::new);
    }

    public org.rcsb.cif.model.generated.PdbxSolnScatter getPdbxSolnScatter() {
        return (org.rcsb.cif.model.generated.PdbxSolnScatter) categories.computeIfAbsent("pdbx_soln_scatter",
                org.rcsb.cif.model.generated.PdbxSolnScatter::new);
    }

    public org.rcsb.cif.model.generated.PdbxSolnScatterModel getPdbxSolnScatterModel() {
        return (org.rcsb.cif.model.generated.PdbxSolnScatterModel) categories.computeIfAbsent("pdbx_soln_scatter_model",
                org.rcsb.cif.model.generated.PdbxSolnScatterModel::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompDescriptor getPdbxChemCompDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxChemCompDescriptor) categories.computeIfAbsent("pdbx_chem_comp_descriptor",
                org.rcsb.cif.model.generated.PdbxChemCompDescriptor::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return (org.rcsb.cif.model.generated.PdbxChemCompIdentifier) categories.computeIfAbsent("pdbx_chem_comp_identifier",
                org.rcsb.cif.model.generated.PdbxChemCompIdentifier::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompImport getPdbxChemCompImport() {
        return (org.rcsb.cif.model.generated.PdbxChemCompImport) categories.computeIfAbsent("pdbx_chem_comp_import",
                org.rcsb.cif.model.generated.PdbxChemCompImport::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAtomEdit) categories.computeIfAbsent("pdbx_chem_comp_atom_edit",
                org.rcsb.cif.model.generated.PdbxChemCompAtomEdit::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompBondEdit getPdbxChemCompBondEdit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompBondEdit) categories.computeIfAbsent("pdbx_chem_comp_bond_edit",
                org.rcsb.cif.model.generated.PdbxChemCompBondEdit::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAudit getPdbxChemCompAudit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAudit) categories.computeIfAbsent("pdbx_chem_comp_audit",
                org.rcsb.cif.model.generated.PdbxChemCompAudit::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateCloseContact getPdbxValidateCloseContact() {
        return (org.rcsb.cif.model.generated.PdbxValidateCloseContact) categories.computeIfAbsent("pdbx_validate_close_contact",
                org.rcsb.cif.model.generated.PdbxValidateCloseContact::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateSymmContact getPdbxValidateSymmContact() {
        return (org.rcsb.cif.model.generated.PdbxValidateSymmContact) categories.computeIfAbsent("pdbx_validate_symm_contact",
                org.rcsb.cif.model.generated.PdbxValidateSymmContact::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateRmsdBond getPdbxValidateRmsdBond() {
        return (org.rcsb.cif.model.generated.PdbxValidateRmsdBond) categories.computeIfAbsent("pdbx_validate_rmsd_bond",
                org.rcsb.cif.model.generated.PdbxValidateRmsdBond::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle() {
        return (org.rcsb.cif.model.generated.PdbxValidateRmsdAngle) categories.computeIfAbsent("pdbx_validate_rmsd_angle",
                org.rcsb.cif.model.generated.PdbxValidateRmsdAngle::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateTorsion getPdbxValidateTorsion() {
        return (org.rcsb.cif.model.generated.PdbxValidateTorsion) categories.computeIfAbsent("pdbx_validate_torsion",
                org.rcsb.cif.model.generated.PdbxValidateTorsion::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega() {
        return (org.rcsb.cif.model.generated.PdbxValidatePeptideOmega) categories.computeIfAbsent("pdbx_validate_peptide_omega",
                org.rcsb.cif.model.generated.PdbxValidatePeptideOmega::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateChiral getPdbxValidateChiral() {
        return (org.rcsb.cif.model.generated.PdbxValidateChiral) categories.computeIfAbsent("pdbx_validate_chiral",
                org.rcsb.cif.model.generated.PdbxValidateChiral::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidatePlanes getPdbxValidatePlanes() {
        return (org.rcsb.cif.model.generated.PdbxValidatePlanes) categories.computeIfAbsent("pdbx_validate_planes",
                org.rcsb.cif.model.generated.PdbxValidatePlanes::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom() {
        return (org.rcsb.cif.model.generated.PdbxValidatePlanesAtom) categories.computeIfAbsent("pdbx_validate_planes_atom",
                org.rcsb.cif.model.generated.PdbxValidatePlanesAtom::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane() {
        return (org.rcsb.cif.model.generated.PdbxValidateMainChainPlane) categories.computeIfAbsent("pdbx_validate_main_chain_plane",
                org.rcsb.cif.model.generated.PdbxValidateMainChainPlane::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructConnAngle getPdbxStructConnAngle() {
        return (org.rcsb.cif.model.generated.PdbxStructConnAngle) categories.computeIfAbsent("pdbx_struct_conn_angle",
                org.rcsb.cif.model.generated.PdbxStructConnAngle::new);
    }

    public org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues() {
        return (org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_residues",
                org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccResidues::new);
    }

    public org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms() {
        return (org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms) categories.computeIfAbsent("pdbx_unobs_or_zero_occ_atoms",
                org.rcsb.cif.model.generated.PdbxUnobsOrZeroOccAtoms::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntryDetails getPdbxEntryDetails() {
        return (org.rcsb.cif.model.generated.PdbxEntryDetails) categories.computeIfAbsent("pdbx_entry_details",
                org.rcsb.cif.model.generated.PdbxEntryDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructModResidue getPdbxStructModResidue() {
        return (org.rcsb.cif.model.generated.PdbxStructModResidue) categories.computeIfAbsent("pdbx_struct_mod_residue",
                org.rcsb.cif.model.generated.PdbxStructModResidue::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion) categories.computeIfAbsent("pdbx_struct_ref_seq_insertion",
                org.rcsb.cif.model.generated.PdbxStructRefSeqInsertion::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion) categories.computeIfAbsent("pdbx_struct_ref_seq_deletion",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDeletion::new);
    }

    public org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping() {
        return (org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping) categories.computeIfAbsent("pdbx_remediation_atom_site_mapping",
                org.rcsb.cif.model.generated.PdbxRemediationAtomSiteMapping::new);
    }

    public org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage() {
        return (org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage) categories.computeIfAbsent("pdbx_validate_polymer_linkage",
                org.rcsb.cif.model.generated.PdbxValidatePolymerLinkage::new);
    }

    public org.rcsb.cif.model.generated.PdbxHelicalSymmetry getPdbxHelicalSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxHelicalSymmetry) categories.computeIfAbsent("pdbx_helical_symmetry",
                org.rcsb.cif.model.generated.PdbxHelicalSymmetry::new);
    }

    public org.rcsb.cif.model.generated.PdbxPointSymmetry getPdbxPointSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxPointSymmetry) categories.computeIfAbsent("pdbx_point_symmetry",
                org.rcsb.cif.model.generated.PdbxPointSymmetry::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructEntityInst getPdbxStructEntityInst() {
        return (org.rcsb.cif.model.generated.PdbxStructEntityInst) categories.computeIfAbsent("pdbx_struct_entity_inst",
                org.rcsb.cif.model.generated.PdbxStructEntityInst::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructOperList getPdbxStructOperList() {
        return (org.rcsb.cif.model.generated.PdbxStructOperList) categories.computeIfAbsent("pdbx_struct_oper_list",
                org.rcsb.cif.model.generated.PdbxStructOperList::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssembly getPdbxStructAssembly() {
        return (org.rcsb.cif.model.generated.PdbxStructAssembly) categories.computeIfAbsent("pdbx_struct_assembly",
                org.rcsb.cif.model.generated.PdbxStructAssembly::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyGen) categories.computeIfAbsent("pdbx_struct_assembly_gen",
                org.rcsb.cif.model.generated.PdbxStructAssemblyGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAsymGen getPdbxStructAsymGen() {
        return (org.rcsb.cif.model.generated.PdbxStructAsymGen) categories.computeIfAbsent("pdbx_struct_asym_gen",
                org.rcsb.cif.model.generated.PdbxStructAsymGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructMsymGen getPdbxStructMsymGen() {
        return (org.rcsb.cif.model.generated.PdbxStructMsymGen) categories.computeIfAbsent("pdbx_struct_msym_gen",
                org.rcsb.cif.model.generated.PdbxStructMsymGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructLegacyOperList getPdbxStructLegacyOperList() {
        return (org.rcsb.cif.model.generated.PdbxStructLegacyOperList) categories.computeIfAbsent("pdbx_struct_legacy_oper_list",
                org.rcsb.cif.model.generated.PdbxStructLegacyOperList::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompAtomFeature) categories.computeIfAbsent("pdbx_chem_comp_atom_feature",
                org.rcsb.cif.model.generated.PdbxChemCompAtomFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily) categories.computeIfAbsent("pdbx_reference_molecule_family",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeFamily::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeList) categories.computeIfAbsent("pdbx_reference_molecule_list",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeList::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMolecule getPdbxReferenceMolecule() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMolecule) categories.computeIfAbsent("pdbx_reference_molecule",
                org.rcsb.cif.model.generated.PdbxReferenceMolecule::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityList) categories.computeIfAbsent("pdbx_reference_entity_list",
                org.rcsb.cif.model.generated.PdbxReferenceEntityList::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly) categories.computeIfAbsent("pdbx_reference_entity_nonpoly",
                org.rcsb.cif.model.generated.PdbxReferenceEntityNonpoly::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityLink) categories.computeIfAbsent("pdbx_reference_entity_link",
                org.rcsb.cif.model.generated.PdbxReferenceEntityLink::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink) categories.computeIfAbsent("pdbx_reference_entity_poly_link",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPolyLink::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPoly) categories.computeIfAbsent("pdbx_reference_entity_poly",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPoly::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq) categories.computeIfAbsent("pdbx_reference_entity_poly_seq",
                org.rcsb.cif.model.generated.PdbxReferenceEntityPolySeq::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySequence) categories.computeIfAbsent("pdbx_reference_entity_sequence",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySequence::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat) categories.computeIfAbsent("pdbx_reference_entity_src_nat",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySrcNat::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails) categories.computeIfAbsent("pdbx_reference_molecule_details",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms) categories.computeIfAbsent("pdbx_reference_molecule_synonyms",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeSynonyms::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents() {
        return (org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents) categories.computeIfAbsent("pdbx_reference_entity_subcomponents",
                org.rcsb.cif.model.generated.PdbxReferenceEntitySubcomponents::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation) categories.computeIfAbsent("pdbx_reference_molecule_annotation",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeAnnotation::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures) categories.computeIfAbsent("pdbx_reference_molecule_features",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeFeatures::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures() {
        return (org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures) categories.computeIfAbsent("pdbx_reference_molecule_related_structures",
                org.rcsb.cif.model.generated.PdbxReferenceMoleculeRelatedStructures::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupList getPdbxStructGroupList() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupList) categories.computeIfAbsent("pdbx_struct_group_list",
                org.rcsb.cif.model.generated.PdbxStructGroupList::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupComponents getPdbxStructGroupComponents() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupComponents) categories.computeIfAbsent("pdbx_struct_group_components",
                org.rcsb.cif.model.generated.PdbxStructGroupComponents::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange() {
        return (org.rcsb.cif.model.generated.PdbxStructGroupComponentRange) categories.computeIfAbsent("pdbx_struct_group_component_range",
                org.rcsb.cif.model.generated.PdbxStructGroupComponentRange::new);
    }

    public org.rcsb.cif.model.generated.PdbxPrdAudit getPdbxPrdAudit() {
        return (org.rcsb.cif.model.generated.PdbxPrdAudit) categories.computeIfAbsent("pdbx_prd_audit",
                org.rcsb.cif.model.generated.PdbxPrdAudit::new);
    }

    public org.rcsb.cif.model.generated.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit() {
        return (org.rcsb.cif.model.generated.PdbxFamilyPrdAudit) categories.computeIfAbsent("pdbx_family_prd_audit",
                org.rcsb.cif.model.generated.PdbxFamilyPrdAudit::new);
    }

    public org.rcsb.cif.model.generated.PdbxMolecule getPdbxMolecule() {
        return (org.rcsb.cif.model.generated.PdbxMolecule) categories.computeIfAbsent("pdbx_molecule",
                org.rcsb.cif.model.generated.PdbxMolecule::new);
    }

    public org.rcsb.cif.model.generated.PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return (org.rcsb.cif.model.generated.PdbxMoleculeFeatures) categories.computeIfAbsent("pdbx_molecule_features",
                org.rcsb.cif.model.generated.PdbxMoleculeFeatures::new);
    }

    public org.rcsb.cif.model.generated.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex() {
        return (org.rcsb.cif.model.generated.PdbxFamilyGroupIndex) categories.computeIfAbsent("pdbx_family_group_index",
                org.rcsb.cif.model.generated.PdbxFamilyGroupIndex::new);
    }

    public org.rcsb.cif.model.generated.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms() {
        return (org.rcsb.cif.model.generated.PdbxDistantSolventAtoms) categories.computeIfAbsent("pdbx_distant_solvent_atoms",
                org.rcsb.cif.model.generated.PdbxDistantSolventAtoms::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry() {
        return (org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry) categories.computeIfAbsent("pdbx_struct_special_symmetry",
                org.rcsb.cif.model.generated.PdbxStructSpecialSymmetry::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferencePublicationList getPdbxReferencePublicationList() {
        return (org.rcsb.cif.model.generated.PdbxReferencePublicationList) categories.computeIfAbsent("pdbx_reference_publication_list",
                org.rcsb.cif.model.generated.PdbxReferencePublicationList::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList() {
        return (org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList) categories.computeIfAbsent("pdbx_nmr_assigned_chem_shift_list",
                org.rcsb.cif.model.generated.PdbxNmrAssignedChemShiftList::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment) categories.computeIfAbsent("pdbx_nmr_chem_shift_experiment",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftExperiment::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftRef) categories.computeIfAbsent("pdbx_nmr_chem_shift_ref",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftRef::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftReference) categories.computeIfAbsent("pdbx_nmr_chem_shift_reference",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftReference::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware) categories.computeIfAbsent("pdbx_nmr_chem_shift_software",
                org.rcsb.cif.model.generated.PdbxNmrChemShiftSoftware::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrConstraintFile getPdbxNmrConstraintFile() {
        return (org.rcsb.cif.model.generated.PdbxNmrConstraintFile) categories.computeIfAbsent("pdbx_nmr_constraint_file",
                org.rcsb.cif.model.generated.PdbxNmrConstraintFile::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask() {
        return (org.rcsb.cif.model.generated.PdbxNmrSoftwareTask) categories.computeIfAbsent("pdbx_nmr_software_task",
                org.rcsb.cif.model.generated.PdbxNmrSoftwareTask::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralDim getPdbxNmrSpectralDim() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralDim) categories.computeIfAbsent("pdbx_nmr_spectral_dim",
                org.rcsb.cif.model.generated.PdbxNmrSpectralDim::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList) categories.computeIfAbsent("pdbx_nmr_spectral_peak_list",
                org.rcsb.cif.model.generated.PdbxNmrSpectralPeakList::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware() {
        return (org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware) categories.computeIfAbsent("pdbx_nmr_spectral_peak_software",
                org.rcsb.cif.model.generated.PdbxNmrSpectralPeakSoftware::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset() {
        return (org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset) categories.computeIfAbsent("pdbx_nmr_systematic_chem_shift_offset",
                org.rcsb.cif.model.generated.PdbxNmrSystematicChemShiftOffset::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrUpload getPdbxNmrUpload() {
        return (org.rcsb.cif.model.generated.PdbxNmrUpload) categories.computeIfAbsent("pdbx_nmr_upload",
                org.rcsb.cif.model.generated.PdbxNmrUpload::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditSupport getPdbxAuditSupport() {
        return (org.rcsb.cif.model.generated.PdbxAuditSupport) categories.computeIfAbsent("pdbx_audit_support",
                org.rcsb.cif.model.generated.PdbxAuditSupport::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn() {
        return (org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_struct_conn",
                org.rcsb.cif.model.generated.PdbxChemCompSubcomponentStructConn::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList() {
        return (org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList) categories.computeIfAbsent("pdbx_chem_comp_subcomponent_entity_list",
                org.rcsb.cif.model.generated.PdbxChemCompSubcomponentEntityList::new);
    }

    public org.rcsb.cif.model.generated.EntitySrcNat getEntitySrcNat() {
        return (org.rcsb.cif.model.generated.EntitySrcNat) categories.computeIfAbsent("entity_src_nat",
                org.rcsb.cif.model.generated.EntitySrcNat::new);
    }

    public org.rcsb.cif.model.generated.EntitySrcGen getEntitySrcGen() {
        return (org.rcsb.cif.model.generated.EntitySrcGen) categories.computeIfAbsent("entity_src_gen",
                org.rcsb.cif.model.generated.EntitySrcGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcSyn getPdbxEntitySrcSyn() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcSyn) categories.computeIfAbsent("pdbx_entity_src_syn",
                org.rcsb.cif.model.generated.PdbxEntitySrcSyn::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList) categories.computeIfAbsent("pdbx_entity_poly_comp_link_list",
                org.rcsb.cif.model.generated.PdbxEntityPolyCompLinkList::new);
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntity getPdbxLinkedEntity() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntity) categories.computeIfAbsent("pdbx_linked_entity",
                org.rcsb.cif.model.generated.PdbxLinkedEntity::new);
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList) categories.computeIfAbsent("pdbx_linked_entity_instance_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityInstanceList::new);
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityList getPdbxLinkedEntityList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityList) categories.computeIfAbsent("pdbx_linked_entity_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityList::new);
    }

    public org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList() {
        return (org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList) categories.computeIfAbsent("pdbx_linked_entity_link_list",
                org.rcsb.cif.model.generated.PdbxLinkedEntityLinkList::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxEntityDescriptor) categories.computeIfAbsent("pdbx_entity_descriptor",
                org.rcsb.cif.model.generated.PdbxEntityDescriptor::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity) categories.computeIfAbsent("pdbx_reference_linked_entity",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntity::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_list",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompList::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink) categories.computeIfAbsent("pdbx_reference_linked_entity_comp_link",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityCompLink::new);
    }

    public org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink() {
        return (org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink) categories.computeIfAbsent("pdbx_reference_linked_entity_link",
                org.rcsb.cif.model.generated.PdbxReferenceLinkedEntityLink::new);
    }

    public org.rcsb.cif.model.generated.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet() {
        return (org.rcsb.cif.model.generated.PdbxRelatedExpDataSet) categories.computeIfAbsent("pdbx_related_exp_data_set",
                org.rcsb.cif.model.generated.PdbxRelatedExpDataSet::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory() {
        return (org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory) categories.computeIfAbsent("pdbx_database_status_history",
                org.rcsb.cif.model.generated.PdbxDatabaseStatusHistory::new);
    }

    public org.rcsb.cif.model.generated.EmAssembly getEmAssembly() {
        return (org.rcsb.cif.model.generated.EmAssembly) categories.computeIfAbsent("em_assembly",
                org.rcsb.cif.model.generated.EmAssembly::new);
    }

    public org.rcsb.cif.model.generated.EmEntityAssembly getEmEntityAssembly() {
        return (org.rcsb.cif.model.generated.EmEntityAssembly) categories.computeIfAbsent("em_entity_assembly",
                org.rcsb.cif.model.generated.EmEntityAssembly::new);
    }

    public org.rcsb.cif.model.generated.EmVirusEntity getEmVirusEntity() {
        return (org.rcsb.cif.model.generated.EmVirusEntity) categories.computeIfAbsent("em_virus_entity",
                org.rcsb.cif.model.generated.EmVirusEntity::new);
    }

    public org.rcsb.cif.model.generated.EmSamplePreparation getEmSamplePreparation() {
        return (org.rcsb.cif.model.generated.EmSamplePreparation) categories.computeIfAbsent("em_sample_preparation",
                org.rcsb.cif.model.generated.EmSamplePreparation::new);
    }

    public org.rcsb.cif.model.generated.EmSampleSupport getEmSampleSupport() {
        return (org.rcsb.cif.model.generated.EmSampleSupport) categories.computeIfAbsent("em_sample_support",
                org.rcsb.cif.model.generated.EmSampleSupport::new);
    }

    public org.rcsb.cif.model.generated.EmBuffer getEmBuffer() {
        return (org.rcsb.cif.model.generated.EmBuffer) categories.computeIfAbsent("em_buffer",
                org.rcsb.cif.model.generated.EmBuffer::new);
    }

    public org.rcsb.cif.model.generated.EmVitrification getEmVitrification() {
        return (org.rcsb.cif.model.generated.EmVitrification) categories.computeIfAbsent("em_vitrification",
                org.rcsb.cif.model.generated.EmVitrification::new);
    }

    public org.rcsb.cif.model.generated.EmImaging getEmImaging() {
        return (org.rcsb.cif.model.generated.EmImaging) categories.computeIfAbsent("em_imaging",
                org.rcsb.cif.model.generated.EmImaging::new);
    }

    public org.rcsb.cif.model.generated.EmDetector getEmDetector() {
        return (org.rcsb.cif.model.generated.EmDetector) categories.computeIfAbsent("em_detector",
                org.rcsb.cif.model.generated.EmDetector::new);
    }

    public org.rcsb.cif.model.generated.EmImageScans getEmImageScans() {
        return (org.rcsb.cif.model.generated.EmImageScans) categories.computeIfAbsent("em_image_scans",
                org.rcsb.cif.model.generated.EmImageScans::new);
    }

    public org.rcsb.cif.model.generated.Em2dProjectionSelection getEm2dProjectionSelection() {
        return (org.rcsb.cif.model.generated.Em2dProjectionSelection) categories.computeIfAbsent("em_2d_projection_selection",
                org.rcsb.cif.model.generated.Em2dProjectionSelection::new);
    }

    public org.rcsb.cif.model.generated.Em3dReconstruction getEm3dReconstruction() {
        return (org.rcsb.cif.model.generated.Em3dReconstruction) categories.computeIfAbsent("em_3d_reconstruction",
                org.rcsb.cif.model.generated.Em3dReconstruction::new);
    }

    public org.rcsb.cif.model.generated.Em3dFitting getEm3dFitting() {
        return (org.rcsb.cif.model.generated.Em3dFitting) categories.computeIfAbsent("em_3d_fitting",
                org.rcsb.cif.model.generated.Em3dFitting::new);
    }

    public org.rcsb.cif.model.generated.Em3dFittingList getEm3dFittingList() {
        return (org.rcsb.cif.model.generated.Em3dFittingList) categories.computeIfAbsent("em_3d_fitting_list",
                org.rcsb.cif.model.generated.Em3dFittingList::new);
    }

    public org.rcsb.cif.model.generated.EmHelicalEntity getEmHelicalEntity() {
        return (org.rcsb.cif.model.generated.EmHelicalEntity) categories.computeIfAbsent("em_helical_entity",
                org.rcsb.cif.model.generated.EmHelicalEntity::new);
    }

    public org.rcsb.cif.model.generated.EmExperiment getEmExperiment() {
        return (org.rcsb.cif.model.generated.EmExperiment) categories.computeIfAbsent("em_experiment",
                org.rcsb.cif.model.generated.EmExperiment::new);
    }

    public org.rcsb.cif.model.generated.EmSingleParticleEntity getEmSingleParticleEntity() {
        return (org.rcsb.cif.model.generated.EmSingleParticleEntity) categories.computeIfAbsent("em_single_particle_entity",
                org.rcsb.cif.model.generated.EmSingleParticleEntity::new);
    }

    public org.rcsb.cif.model.generated.EmAdmin getEmAdmin() {
        return (org.rcsb.cif.model.generated.EmAdmin) categories.computeIfAbsent("em_admin",
                org.rcsb.cif.model.generated.EmAdmin::new);
    }

    public org.rcsb.cif.model.generated.EmAuthorList getEmAuthorList() {
        return (org.rcsb.cif.model.generated.EmAuthorList) categories.computeIfAbsent("em_author_list",
                org.rcsb.cif.model.generated.EmAuthorList::new);
    }

    public org.rcsb.cif.model.generated.EmDbReference getEmDbReference() {
        return (org.rcsb.cif.model.generated.EmDbReference) categories.computeIfAbsent("em_db_reference",
                org.rcsb.cif.model.generated.EmDbReference::new);
    }

    public org.rcsb.cif.model.generated.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary() {
        return (org.rcsb.cif.model.generated.EmDbReferenceAuxiliary) categories.computeIfAbsent("em_db_reference_auxiliary",
                org.rcsb.cif.model.generated.EmDbReferenceAuxiliary::new);
    }

    public org.rcsb.cif.model.generated.EmDepui getEmDepui() {
        return (org.rcsb.cif.model.generated.EmDepui) categories.computeIfAbsent("em_depui",
                org.rcsb.cif.model.generated.EmDepui::new);
    }

    public org.rcsb.cif.model.generated.EmObsolete getEmObsolete() {
        return (org.rcsb.cif.model.generated.EmObsolete) categories.computeIfAbsent("em_obsolete",
                org.rcsb.cif.model.generated.EmObsolete::new);
    }

    public org.rcsb.cif.model.generated.EmSupersede getEmSupersede() {
        return (org.rcsb.cif.model.generated.EmSupersede) categories.computeIfAbsent("em_supersede",
                org.rcsb.cif.model.generated.EmSupersede::new);
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyMolwt) categories.computeIfAbsent("em_entity_assembly_molwt",
                org.rcsb.cif.model.generated.EmEntityAssemblyMolwt::new);
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource) categories.computeIfAbsent("em_entity_assembly_naturalsource",
                org.rcsb.cif.model.generated.EmEntityAssemblyNaturalsource::new);
    }

    public org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant() {
        return (org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant) categories.computeIfAbsent("em_entity_assembly_recombinant",
                org.rcsb.cif.model.generated.EmEntityAssemblyRecombinant::new);
    }

    public org.rcsb.cif.model.generated.EmVirusNaturalHost getEmVirusNaturalHost() {
        return (org.rcsb.cif.model.generated.EmVirusNaturalHost) categories.computeIfAbsent("em_virus_natural_host",
                org.rcsb.cif.model.generated.EmVirusNaturalHost::new);
    }

    public org.rcsb.cif.model.generated.EmVirusShell getEmVirusShell() {
        return (org.rcsb.cif.model.generated.EmVirusShell) categories.computeIfAbsent("em_virus_shell",
                org.rcsb.cif.model.generated.EmVirusShell::new);
    }

    public org.rcsb.cif.model.generated.EmSpecimen getEmSpecimen() {
        return (org.rcsb.cif.model.generated.EmSpecimen) categories.computeIfAbsent("em_specimen",
                org.rcsb.cif.model.generated.EmSpecimen::new);
    }

    public org.rcsb.cif.model.generated.EmEmbedding getEmEmbedding() {
        return (org.rcsb.cif.model.generated.EmEmbedding) categories.computeIfAbsent("em_embedding",
                org.rcsb.cif.model.generated.EmEmbedding::new);
    }

    public org.rcsb.cif.model.generated.EmFiducialMarkers getEmFiducialMarkers() {
        return (org.rcsb.cif.model.generated.EmFiducialMarkers) categories.computeIfAbsent("em_fiducial_markers",
                org.rcsb.cif.model.generated.EmFiducialMarkers::new);
    }

    public org.rcsb.cif.model.generated.EmFocusedIonBeam getEmFocusedIonBeam() {
        return (org.rcsb.cif.model.generated.EmFocusedIonBeam) categories.computeIfAbsent("em_focused_ion_beam",
                org.rcsb.cif.model.generated.EmFocusedIonBeam::new);
    }

    public org.rcsb.cif.model.generated.EmGridPretreatment getEmGridPretreatment() {
        return (org.rcsb.cif.model.generated.EmGridPretreatment) categories.computeIfAbsent("em_grid_pretreatment",
                org.rcsb.cif.model.generated.EmGridPretreatment::new);
    }

    public org.rcsb.cif.model.generated.EmUltramicrotomy getEmUltramicrotomy() {
        return (org.rcsb.cif.model.generated.EmUltramicrotomy) categories.computeIfAbsent("em_ultramicrotomy",
                org.rcsb.cif.model.generated.EmUltramicrotomy::new);
    }

    public org.rcsb.cif.model.generated.EmHighPressureFreezing getEmHighPressureFreezing() {
        return (org.rcsb.cif.model.generated.EmHighPressureFreezing) categories.computeIfAbsent("em_high_pressure_freezing",
                org.rcsb.cif.model.generated.EmHighPressureFreezing::new);
    }

    public org.rcsb.cif.model.generated.EmShadowing getEmShadowing() {
        return (org.rcsb.cif.model.generated.EmShadowing) categories.computeIfAbsent("em_shadowing",
                org.rcsb.cif.model.generated.EmShadowing::new);
    }

    public org.rcsb.cif.model.generated.EmTomographySpecimen getEmTomographySpecimen() {
        return (org.rcsb.cif.model.generated.EmTomographySpecimen) categories.computeIfAbsent("em_tomography_specimen",
                org.rcsb.cif.model.generated.EmTomographySpecimen::new);
    }

    public org.rcsb.cif.model.generated.EmCrystalFormation getEmCrystalFormation() {
        return (org.rcsb.cif.model.generated.EmCrystalFormation) categories.computeIfAbsent("em_crystal_formation",
                org.rcsb.cif.model.generated.EmCrystalFormation::new);
    }

    public org.rcsb.cif.model.generated.EmStaining getEmStaining() {
        return (org.rcsb.cif.model.generated.EmStaining) categories.computeIfAbsent("em_staining",
                org.rcsb.cif.model.generated.EmStaining::new);
    }

    public org.rcsb.cif.model.generated.EmSupportFilm getEmSupportFilm() {
        return (org.rcsb.cif.model.generated.EmSupportFilm) categories.computeIfAbsent("em_support_film",
                org.rcsb.cif.model.generated.EmSupportFilm::new);
    }

    public org.rcsb.cif.model.generated.EmBufferComponent getEmBufferComponent() {
        return (org.rcsb.cif.model.generated.EmBufferComponent) categories.computeIfAbsent("em_buffer_component",
                org.rcsb.cif.model.generated.EmBufferComponent::new);
    }

    public org.rcsb.cif.model.generated.EmDiffraction getEmDiffraction() {
        return (org.rcsb.cif.model.generated.EmDiffraction) categories.computeIfAbsent("em_diffraction",
                org.rcsb.cif.model.generated.EmDiffraction::new);
    }

    public org.rcsb.cif.model.generated.EmDiffractionShell getEmDiffractionShell() {
        return (org.rcsb.cif.model.generated.EmDiffractionShell) categories.computeIfAbsent("em_diffraction_shell",
                org.rcsb.cif.model.generated.EmDiffractionShell::new);
    }

    public org.rcsb.cif.model.generated.EmDiffractionStats getEmDiffractionStats() {
        return (org.rcsb.cif.model.generated.EmDiffractionStats) categories.computeIfAbsent("em_diffraction_stats",
                org.rcsb.cif.model.generated.EmDiffractionStats::new);
    }

    public org.rcsb.cif.model.generated.EmTomography getEmTomography() {
        return (org.rcsb.cif.model.generated.EmTomography) categories.computeIfAbsent("em_tomography",
                org.rcsb.cif.model.generated.EmTomography::new);
    }

    public org.rcsb.cif.model.generated.EmImageRecording getEmImageRecording() {
        return (org.rcsb.cif.model.generated.EmImageRecording) categories.computeIfAbsent("em_image_recording",
                org.rcsb.cif.model.generated.EmImageRecording::new);
    }

    public org.rcsb.cif.model.generated.EmImagingOptics getEmImagingOptics() {
        return (org.rcsb.cif.model.generated.EmImagingOptics) categories.computeIfAbsent("em_imaging_optics",
                org.rcsb.cif.model.generated.EmImagingOptics::new);
    }

    public org.rcsb.cif.model.generated.EmFinalClassification getEmFinalClassification() {
        return (org.rcsb.cif.model.generated.EmFinalClassification) categories.computeIfAbsent("em_final_classification",
                org.rcsb.cif.model.generated.EmFinalClassification::new);
    }

    public org.rcsb.cif.model.generated.EmStartModel getEmStartModel() {
        return (org.rcsb.cif.model.generated.EmStartModel) categories.computeIfAbsent("em_start_model",
                org.rcsb.cif.model.generated.EmStartModel::new);
    }

    public org.rcsb.cif.model.generated.EmSoftware getEmSoftware() {
        return (org.rcsb.cif.model.generated.EmSoftware) categories.computeIfAbsent("em_software",
                org.rcsb.cif.model.generated.EmSoftware::new);
    }

    public org.rcsb.cif.model.generated.EmEulerAngleAssignment getEmEulerAngleAssignment() {
        return (org.rcsb.cif.model.generated.EmEulerAngleAssignment) categories.computeIfAbsent("em_euler_angle_assignment",
                org.rcsb.cif.model.generated.EmEulerAngleAssignment::new);
    }

    public org.rcsb.cif.model.generated.EmCtfCorrection getEmCtfCorrection() {
        return (org.rcsb.cif.model.generated.EmCtfCorrection) categories.computeIfAbsent("em_ctf_correction",
                org.rcsb.cif.model.generated.EmCtfCorrection::new);
    }

    public org.rcsb.cif.model.generated.EmVolumeSelection getEmVolumeSelection() {
        return (org.rcsb.cif.model.generated.EmVolumeSelection) categories.computeIfAbsent("em_volume_selection",
                org.rcsb.cif.model.generated.EmVolumeSelection::new);
    }

    public org.rcsb.cif.model.generated.Em3dCrystalEntity getEm3dCrystalEntity() {
        return (org.rcsb.cif.model.generated.Em3dCrystalEntity) categories.computeIfAbsent("em_3d_crystal_entity",
                org.rcsb.cif.model.generated.Em3dCrystalEntity::new);
    }

    public org.rcsb.cif.model.generated.Em2dCrystalEntity getEm2dCrystalEntity() {
        return (org.rcsb.cif.model.generated.Em2dCrystalEntity) categories.computeIfAbsent("em_2d_crystal_entity",
                org.rcsb.cif.model.generated.Em2dCrystalEntity::new);
    }

    public org.rcsb.cif.model.generated.EmImageProcessing getEmImageProcessing() {
        return (org.rcsb.cif.model.generated.EmImageProcessing) categories.computeIfAbsent("em_image_processing",
                org.rcsb.cif.model.generated.EmImageProcessing::new);
    }

    public org.rcsb.cif.model.generated.EmParticleSelection getEmParticleSelection() {
        return (org.rcsb.cif.model.generated.EmParticleSelection) categories.computeIfAbsent("em_particle_selection",
                org.rcsb.cif.model.generated.EmParticleSelection::new);
    }

    public org.rcsb.cif.model.generated.EmMap getEmMap() {
        return (org.rcsb.cif.model.generated.EmMap) categories.computeIfAbsent("em_map",
                org.rcsb.cif.model.generated.EmMap::new);
    }

    public org.rcsb.cif.model.generated.EmFscCurve getEmFscCurve() {
        return (org.rcsb.cif.model.generated.EmFscCurve) categories.computeIfAbsent("em_fsc_curve",
                org.rcsb.cif.model.generated.EmFscCurve::new);
    }

    public org.rcsb.cif.model.generated.EmInterpretFigure getEmInterpretFigure() {
        return (org.rcsb.cif.model.generated.EmInterpretFigure) categories.computeIfAbsent("em_interpret_figure",
                org.rcsb.cif.model.generated.EmInterpretFigure::new);
    }

    public org.rcsb.cif.model.generated.EmLayerLines getEmLayerLines() {
        return (org.rcsb.cif.model.generated.EmLayerLines) categories.computeIfAbsent("em_layer_lines",
                org.rcsb.cif.model.generated.EmLayerLines::new);
    }

    public org.rcsb.cif.model.generated.EmStructureFactors getEmStructureFactors() {
        return (org.rcsb.cif.model.generated.EmStructureFactors) categories.computeIfAbsent("em_structure_factors",
                org.rcsb.cif.model.generated.EmStructureFactors::new);
    }

    public org.rcsb.cif.model.generated.EmDepositorInfo getEmDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmDepositorInfo) categories.computeIfAbsent("em_depositor_info",
                org.rcsb.cif.model.generated.EmDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.EmMapDepositorInfo getEmMapDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmMapDepositorInfo) categories.computeIfAbsent("em_map_depositor_info",
                org.rcsb.cif.model.generated.EmMapDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.EmMaskDepositorInfo getEmMaskDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmMaskDepositorInfo) categories.computeIfAbsent("em_mask_depositor_info",
                org.rcsb.cif.model.generated.EmMaskDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.EmFigureDepositorInfo getEmFigureDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmFigureDepositorInfo) categories.computeIfAbsent("em_figure_depositor_info",
                org.rcsb.cif.model.generated.EmFigureDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo) categories.computeIfAbsent("em_layer_lines_depositor_info",
                org.rcsb.cif.model.generated.EmLayerLinesDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo() {
        return (org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo) categories.computeIfAbsent("em_structure_factors_depositor_info",
                org.rcsb.cif.model.generated.EmStructureFactorsDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo) categories.computeIfAbsent("pdbx_seq_map_depositor_info",
                org.rcsb.cif.model.generated.PdbxSeqMapDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo) categories.computeIfAbsent("pdbx_struct_ref_seq_dif_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructRefSeqDifDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_prop_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyPropDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_gen_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyGenDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo) categories.computeIfAbsent("pdbx_struct_oper_list_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructOperListDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_point_symmetry_depositor_info",
                org.rcsb.cif.model.generated.PdbxPointSymmetryDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo) categories.computeIfAbsent("pdbx_helical_symmetry_depositor_info",
                org.rcsb.cif.model.generated.PdbxHelicalSymmetryDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence_depositor_info",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping() {
        return (org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping) categories.computeIfAbsent("pdbx_solvent_atom_site_mapping",
                org.rcsb.cif.model.generated.PdbxSolventAtomSiteMapping::new);
    }

    public org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo) categories.computeIfAbsent("pdbx_molecule_features_depositor_info",
                org.rcsb.cif.model.generated.PdbxMoleculeFeaturesDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_instance_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompInstanceDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiStatusFlags) categories.computeIfAbsent("pdbx_depui_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiStatusFlags::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiUpload getPdbxDepuiUpload() {
        return (org.rcsb.cif.model.generated.PdbxDepuiUpload) categories.computeIfAbsent("pdbx_depui_upload",
                org.rcsb.cif.model.generated.PdbxDepuiUpload::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags) categories.computeIfAbsent("pdbx_depui_validation_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiValidationStatusFlags::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo) categories.computeIfAbsent("pdbx_chem_comp_upload_depositor_info",
                org.rcsb.cif.model.generated.PdbxChemCompUploadDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags) categories.computeIfAbsent("pdbx_depui_entity_status_flags",
                org.rcsb.cif.model.generated.PdbxDepuiEntityStatusFlags::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures) categories.computeIfAbsent("pdbx_depui_entity_features",
                org.rcsb.cif.model.generated.PdbxDepuiEntityFeatures::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo() {
        return (org.rcsb.cif.model.generated.PdbxDepositionMessageInfo) categories.computeIfAbsent("pdbx_deposition_message_info",
                org.rcsb.cif.model.generated.PdbxDepositionMessageInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference() {
        return (org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference) categories.computeIfAbsent("pdbx_deposition_message_file_reference",
                org.rcsb.cif.model.generated.PdbxDepositionMessageFileReference::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails() {
        return (org.rcsb.cif.model.generated.PdbxDepuiEntryDetails) categories.computeIfAbsent("pdbx_depui_entry_details",
                org.rcsb.cif.model.generated.PdbxDepuiEntryDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingStatus getPdbxDataProcessingStatus() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingStatus) categories.computeIfAbsent("pdbx_data_processing_status",
                org.rcsb.cif.model.generated.PdbxDataProcessingStatus::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature() {
        return (org.rcsb.cif.model.generated.PdbxEntityInstanceFeature) categories.computeIfAbsent("pdbx_entity_instance_feature",
                org.rcsb.cif.model.generated.PdbxEntityInstanceFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo() {
        return (org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo) categories.computeIfAbsent("pdbx_entity_src_gen_depositor_info",
                org.rcsb.cif.model.generated.PdbxEntitySrcGenDepositorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModel getPdbxChemCompModel() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModel) categories.computeIfAbsent("pdbx_chem_comp_model",
                org.rcsb.cif.model.generated.PdbxChemCompModel::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelAtom getPdbxChemCompModelAtom() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelAtom) categories.computeIfAbsent("pdbx_chem_comp_model_atom",
                org.rcsb.cif.model.generated.PdbxChemCompModelAtom::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelBond getPdbxChemCompModelBond() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelBond) categories.computeIfAbsent("pdbx_chem_comp_model_bond",
                org.rcsb.cif.model.generated.PdbxChemCompModelBond::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelFeature getPdbxChemCompModelFeature() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelFeature) categories.computeIfAbsent("pdbx_chem_comp_model_feature",
                org.rcsb.cif.model.generated.PdbxChemCompModelFeature::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor) categories.computeIfAbsent("pdbx_chem_comp_model_descriptor",
                org.rcsb.cif.model.generated.PdbxChemCompModelDescriptor::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelAudit getPdbxChemCompModelAudit() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelAudit) categories.computeIfAbsent("pdbx_chem_comp_model_audit",
                org.rcsb.cif.model.generated.PdbxChemCompModelAudit::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompModelReference getPdbxChemCompModelReference() {
        return (org.rcsb.cif.model.generated.PdbxChemCompModelReference) categories.computeIfAbsent("pdbx_chem_comp_model_reference",
                org.rcsb.cif.model.generated.PdbxChemCompModelReference::new);
    }

    public org.rcsb.cif.model.generated.PdbxViewCategoryGroup getPdbxViewCategoryGroup() {
        return (org.rcsb.cif.model.generated.PdbxViewCategoryGroup) categories.computeIfAbsent("pdbx_view_category_group",
                org.rcsb.cif.model.generated.PdbxViewCategoryGroup::new);
    }

    public org.rcsb.cif.model.generated.PdbxViewCategory getPdbxViewCategory() {
        return (org.rcsb.cif.model.generated.PdbxViewCategory) categories.computeIfAbsent("pdbx_view_category",
                org.rcsb.cif.model.generated.PdbxViewCategory::new);
    }

    public org.rcsb.cif.model.generated.PdbxViewItem getPdbxViewItem() {
        return (org.rcsb.cif.model.generated.PdbxViewItem) categories.computeIfAbsent("pdbx_view_item",
                org.rcsb.cif.model.generated.PdbxViewItem::new);
    }

    public org.rcsb.cif.model.generated.PdbxCoord getPdbxCoord() {
        return (org.rcsb.cif.model.generated.PdbxCoord) categories.computeIfAbsent("pdbx_coord",
                org.rcsb.cif.model.generated.PdbxCoord::new);
    }

    public org.rcsb.cif.model.generated.PdbxConnect getPdbxConnect() {
        return (org.rcsb.cif.model.generated.PdbxConnect) categories.computeIfAbsent("pdbx_connect",
                org.rcsb.cif.model.generated.PdbxConnect::new);
    }

    public org.rcsb.cif.model.generated.PdbxConnectType getPdbxConnectType() {
        return (org.rcsb.cif.model.generated.PdbxConnectType) categories.computeIfAbsent("pdbx_connect_type",
                org.rcsb.cif.model.generated.PdbxConnectType::new);
    }

    public org.rcsb.cif.model.generated.PdbxConnectModification getPdbxConnectModification() {
        return (org.rcsb.cif.model.generated.PdbxConnectModification) categories.computeIfAbsent("pdbx_connect_modification",
                org.rcsb.cif.model.generated.PdbxConnectModification::new);
    }

    public org.rcsb.cif.model.generated.PdbxConnectAtom getPdbxConnectAtom() {
        return (org.rcsb.cif.model.generated.PdbxConnectAtom) categories.computeIfAbsent("pdbx_connect_atom",
                org.rcsb.cif.model.generated.PdbxConnectAtom::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePDBMaster) categories.computeIfAbsent("pdbx_database_PDB_master",
                org.rcsb.cif.model.generated.PdbxDatabasePDBMaster::new);
    }

    public org.rcsb.cif.model.generated.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit() {
        return (org.rcsb.cif.model.generated.PdbxDatabasePdbOmit) categories.computeIfAbsent("pdbx_database_pdb_omit",
                org.rcsb.cif.model.generated.PdbxDatabasePdbOmit::new);
    }

    public org.rcsb.cif.model.generated.PdbxDbref getPdbxDbref() {
        return (org.rcsb.cif.model.generated.PdbxDbref) categories.computeIfAbsent("pdbx_dbref",
                org.rcsb.cif.model.generated.PdbxDbref::new);
    }

    public org.rcsb.cif.model.generated.PdbxDrugInfo getPdbxDrugInfo() {
        return (org.rcsb.cif.model.generated.PdbxDrugInfo) categories.computeIfAbsent("pdbx_drug_info",
                org.rcsb.cif.model.generated.PdbxDrugInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxInhibitorInfo getPdbxInhibitorInfo() {
        return (org.rcsb.cif.model.generated.PdbxInhibitorInfo) categories.computeIfAbsent("pdbx_inhibitor_info",
                org.rcsb.cif.model.generated.PdbxInhibitorInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxIonInfo getPdbxIonInfo() {
        return (org.rcsb.cif.model.generated.PdbxIonInfo) categories.computeIfAbsent("pdbx_ion_info",
                org.rcsb.cif.model.generated.PdbxIonInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxHybrid getPdbxHybrid() {
        return (org.rcsb.cif.model.generated.PdbxHybrid) categories.computeIfAbsent("pdbx_hybrid",
                org.rcsb.cif.model.generated.PdbxHybrid::new);
    }

    public org.rcsb.cif.model.generated.PdbxNaStrandInfo getPdbxNaStrandInfo() {
        return (org.rcsb.cif.model.generated.PdbxNaStrandInfo) categories.computeIfAbsent("pdbx_na_strand_info",
                org.rcsb.cif.model.generated.PdbxNaStrandInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxNonstandardList getPdbxNonstandardList() {
        return (org.rcsb.cif.model.generated.PdbxNonstandardList) categories.computeIfAbsent("pdbx_nonstandard_list",
                org.rcsb.cif.model.generated.PdbxNonstandardList::new);
    }

    public org.rcsb.cif.model.generated.PdbxPdbCompnd getPdbxPdbCompnd() {
        return (org.rcsb.cif.model.generated.PdbxPdbCompnd) categories.computeIfAbsent("pdbx_pdb_compnd",
                org.rcsb.cif.model.generated.PdbxPdbCompnd::new);
    }

    public org.rcsb.cif.model.generated.PdbxPdbSource getPdbxPdbSource() {
        return (org.rcsb.cif.model.generated.PdbxPdbSource) categories.computeIfAbsent("pdbx_pdb_source",
                org.rcsb.cif.model.generated.PdbxPdbSource::new);
    }

    public org.rcsb.cif.model.generated.PdbxProteinInfo getPdbxProteinInfo() {
        return (org.rcsb.cif.model.generated.PdbxProteinInfo) categories.computeIfAbsent("pdbx_protein_info",
                org.rcsb.cif.model.generated.PdbxProteinInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxSolventInfo getPdbxSolventInfo() {
        return (org.rcsb.cif.model.generated.PdbxSolventInfo) categories.computeIfAbsent("pdbx_solvent_info",
                org.rcsb.cif.model.generated.PdbxSolventInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxSource getPdbxSource() {
        return (org.rcsb.cif.model.generated.PdbxSource) categories.computeIfAbsent("pdbx_source",
                org.rcsb.cif.model.generated.PdbxSource::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructBiolFunc getPdbxStructBiolFunc() {
        return (org.rcsb.cif.model.generated.PdbxStructBiolFunc) categories.computeIfAbsent("pdbx_struct_biol_func",
                org.rcsb.cif.model.generated.PdbxStructBiolFunc::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructPackGen getPdbxStructPackGen() {
        return (org.rcsb.cif.model.generated.PdbxStructPackGen) categories.computeIfAbsent("pdbx_struct_pack_gen",
                org.rcsb.cif.model.generated.PdbxStructPackGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxTrnaInfo getPdbxTrnaInfo() {
        return (org.rcsb.cif.model.generated.PdbxTrnaInfo) categories.computeIfAbsent("pdbx_trna_info",
                org.rcsb.cif.model.generated.PdbxTrnaInfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxUnpair getPdbxUnpair() {
        return (org.rcsb.cif.model.generated.PdbxUnpair) categories.computeIfAbsent("pdbx_unpair",
                org.rcsb.cif.model.generated.PdbxUnpair::new);
    }

    public org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs() {
        return (org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs) categories.computeIfAbsent("pdbx_refine_ls_restr_ncs",
                org.rcsb.cif.model.generated.PdbxRefineLsRestrNcs::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen() {
        return (org.rcsb.cif.model.generated.PdbxStructNcsVirusGen) categories.computeIfAbsent("pdbx_struct_ncs_virus_gen",
                org.rcsb.cif.model.generated.PdbxStructNcsVirusGen::new);
    }

    public org.rcsb.cif.model.generated.PdbxSequenceAnnotation getPdbxSequenceAnnotation() {
        return (org.rcsb.cif.model.generated.PdbxSequenceAnnotation) categories.computeIfAbsent("pdbx_sequence_annotation",
                org.rcsb.cif.model.generated.PdbxSequenceAnnotation::new);
    }

    public org.rcsb.cif.model.generated.PdbxPostProcessDetails getPdbxPostProcessDetails() {
        return (org.rcsb.cif.model.generated.PdbxPostProcessDetails) categories.computeIfAbsent("pdbx_post_process_details",
                org.rcsb.cif.model.generated.PdbxPostProcessDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxPostProcessStatus getPdbxPostProcessStatus() {
        return (org.rcsb.cif.model.generated.PdbxPostProcessStatus) categories.computeIfAbsent("pdbx_post_process_status",
                org.rcsb.cif.model.generated.PdbxPostProcessStatus::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructLink getPdbxStructLink() {
        return (org.rcsb.cif.model.generated.PdbxStructLink) categories.computeIfAbsent("pdbx_struct_link",
                org.rcsb.cif.model.generated.PdbxStructLink::new);
    }

    public org.rcsb.cif.model.generated.PdbxMissingResidueList getPdbxMissingResidueList() {
        return (org.rcsb.cif.model.generated.PdbxMissingResidueList) categories.computeIfAbsent("pdbx_missing_residue_list",
                org.rcsb.cif.model.generated.PdbxMissingResidueList::new);
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingCell getPdbxDataProcessingCell() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingCell) categories.computeIfAbsent("pdbx_data_processing_cell",
                org.rcsb.cif.model.generated.PdbxDataProcessingCell::new);
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingReflns getPdbxDataProcessingReflns() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingReflns) categories.computeIfAbsent("pdbx_data_processing_reflns",
                org.rcsb.cif.model.generated.PdbxDataProcessingReflns::new);
    }

    public org.rcsb.cif.model.generated.PdbxDataProcessingDetector getPdbxDataProcessingDetector() {
        return (org.rcsb.cif.model.generated.PdbxDataProcessingDetector) categories.computeIfAbsent("pdbx_data_processing_detector",
                org.rcsb.cif.model.generated.PdbxDataProcessingDetector::new);
    }

    public org.rcsb.cif.model.generated.PdbxChemCompNonstandard getPdbxChemCompNonstandard() {
        return (org.rcsb.cif.model.generated.PdbxChemCompNonstandard) categories.computeIfAbsent("pdbx_chem_comp_nonstandard",
                org.rcsb.cif.model.generated.PdbxChemCompNonstandard::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass) categories.computeIfAbsent("pdbx_entity_poly_protein_class",
                org.rcsb.cif.model.generated.PdbxEntityPolyProteinClass::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree) categories.computeIfAbsent("pdbx_entity_name_taxonomy_tree",
                org.rcsb.cif.model.generated.PdbxEntityNameTaxonomyTree::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy) categories.computeIfAbsent("pdbx_entity_name_taxonomy",
                org.rcsb.cif.model.generated.PdbxEntityNameTaxonomy::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityNameInstance getPdbxEntityNameInstance() {
        return (org.rcsb.cif.model.generated.PdbxEntityNameInstance) categories.computeIfAbsent("pdbx_entity_name_instance",
                org.rcsb.cif.model.generated.PdbxEntityNameInstance::new);
    }

    public org.rcsb.cif.model.generated.PdbxTableinfo getPdbxTableinfo() {
        return (org.rcsb.cif.model.generated.PdbxTableinfo) categories.computeIfAbsent("pdbx_tableinfo",
                org.rcsb.cif.model.generated.PdbxTableinfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxColumninfo getPdbxColumninfo() {
        return (org.rcsb.cif.model.generated.PdbxColumninfo) categories.computeIfAbsent("pdbx_columninfo",
                org.rcsb.cif.model.generated.PdbxColumninfo::new);
    }

    public org.rcsb.cif.model.generated.PdbxValAngle getPdbxValAngle() {
        return (org.rcsb.cif.model.generated.PdbxValAngle) categories.computeIfAbsent("pdbx_val_angle",
                org.rcsb.cif.model.generated.PdbxValAngle::new);
    }

    public org.rcsb.cif.model.generated.PdbxValBond getPdbxValBond() {
        return (org.rcsb.cif.model.generated.PdbxValBond) categories.computeIfAbsent("pdbx_val_bond",
                org.rcsb.cif.model.generated.PdbxValBond::new);
    }

    public org.rcsb.cif.model.generated.PdbxValContact getPdbxValContact() {
        return (org.rcsb.cif.model.generated.PdbxValContact) categories.computeIfAbsent("pdbx_val_contact",
                org.rcsb.cif.model.generated.PdbxValContact::new);
    }

    public org.rcsb.cif.model.generated.PdbxValSymContact getPdbxValSymContact() {
        return (org.rcsb.cif.model.generated.PdbxValSymContact) categories.computeIfAbsent("pdbx_val_sym_contact",
                org.rcsb.cif.model.generated.PdbxValSymContact::new);
    }

    public org.rcsb.cif.model.generated.PdbxRmchOutlier getPdbxRmchOutlier() {
        return (org.rcsb.cif.model.generated.PdbxRmchOutlier) categories.computeIfAbsent("pdbx_rmch_outlier",
                org.rcsb.cif.model.generated.PdbxRmchOutlier::new);
    }

    public org.rcsb.cif.model.generated.PdbxMissingAtomPoly getPdbxMissingAtomPoly() {
        return (org.rcsb.cif.model.generated.PdbxMissingAtomPoly) categories.computeIfAbsent("pdbx_missing_atom_poly",
                org.rcsb.cif.model.generated.PdbxMissingAtomPoly::new);
    }

    public org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly() {
        return (org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly) categories.computeIfAbsent("pdbx_missing_atom_nonpoly",
                org.rcsb.cif.model.generated.PdbxMissingAtomNonpoly::new);
    }

    public org.rcsb.cif.model.generated.PdbxValChiral getPdbxValChiral() {
        return (org.rcsb.cif.model.generated.PdbxValChiral) categories.computeIfAbsent("pdbx_val_chiral",
                org.rcsb.cif.model.generated.PdbxValChiral::new);
    }

    public org.rcsb.cif.model.generated.PdbxAtlas getPdbxAtlas() {
        return (org.rcsb.cif.model.generated.PdbxAtlas) categories.computeIfAbsent("pdbx_atlas",
                org.rcsb.cif.model.generated.PdbxAtlas::new);
    }

    public org.rcsb.cif.model.generated.PdbxSummaryFlags getPdbxSummaryFlags() {
        return (org.rcsb.cif.model.generated.PdbxSummaryFlags) categories.computeIfAbsent("pdbx_summary_flags",
                org.rcsb.cif.model.generated.PdbxSummaryFlags::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncBindMode) categories.computeIfAbsent("pdbx_entity_func_bind_mode",
                org.rcsb.cif.model.generated.PdbxEntityFuncBindMode::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme) categories.computeIfAbsent("pdbx_entity_func_enzyme",
                org.rcsb.cif.model.generated.PdbxEntityFuncEnzyme::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory) categories.computeIfAbsent("pdbx_entity_func_regulatory",
                org.rcsb.cif.model.generated.PdbxEntityFuncRegulatory::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncStructural getPdbxEntityFuncStructural() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncStructural) categories.computeIfAbsent("pdbx_entity_func_structural",
                org.rcsb.cif.model.generated.PdbxEntityFuncStructural::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityFuncOther getPdbxEntityFuncOther() {
        return (org.rcsb.cif.model.generated.PdbxEntityFuncOther) categories.computeIfAbsent("pdbx_entity_func_other",
                org.rcsb.cif.model.generated.PdbxEntityFuncOther::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyDomain getPdbxEntityPolyDomain() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyDomain) categories.computeIfAbsent("pdbx_entity_poly_domain",
                org.rcsb.cif.model.generated.PdbxEntityPolyDomain::new);
    }

    public org.rcsb.cif.model.generated.PdbxNaStructKeywds getPdbxNaStructKeywds() {
        return (org.rcsb.cif.model.generated.PdbxNaStructKeywds) categories.computeIfAbsent("pdbx_na_struct_keywds",
                org.rcsb.cif.model.generated.PdbxNaStructKeywds::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyNaType getPdbxEntityPolyNaType() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyNaType) categories.computeIfAbsent("pdbx_entity_poly_na_type",
                org.rcsb.cif.model.generated.PdbxEntityPolyNaType::new);
    }

    public org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard() {
        return (org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard) categories.computeIfAbsent("pdbx_entity_poly_na_nonstandard",
                org.rcsb.cif.model.generated.PdbxEntityPolyNaNonstandard::new);
    }

    public org.rcsb.cif.model.generated.PdbxVirtualAngle getPdbxVirtualAngle() {
        return (org.rcsb.cif.model.generated.PdbxVirtualAngle) categories.computeIfAbsent("pdbx_virtual_angle",
                org.rcsb.cif.model.generated.PdbxVirtualAngle::new);
    }

    public org.rcsb.cif.model.generated.PdbxVirtualBond getPdbxVirtualBond() {
        return (org.rcsb.cif.model.generated.PdbxVirtualBond) categories.computeIfAbsent("pdbx_virtual_bond",
                org.rcsb.cif.model.generated.PdbxVirtualBond::new);
    }

    public org.rcsb.cif.model.generated.PdbxVirtualTorsion getPdbxVirtualTorsion() {
        return (org.rcsb.cif.model.generated.PdbxVirtualTorsion) categories.computeIfAbsent("pdbx_virtual_torsion",
                org.rcsb.cif.model.generated.PdbxVirtualTorsion::new);
    }

    public org.rcsb.cif.model.generated.PdbxSequencePattern getPdbxSequencePattern() {
        return (org.rcsb.cif.model.generated.PdbxSequencePattern) categories.computeIfAbsent("pdbx_sequence_pattern",
                org.rcsb.cif.model.generated.PdbxSequencePattern::new);
    }

    public org.rcsb.cif.model.generated.PdbxStereochemistry getPdbxStereochemistry() {
        return (org.rcsb.cif.model.generated.PdbxStereochemistry) categories.computeIfAbsent("pdbx_stereochemistry",
                org.rcsb.cif.model.generated.PdbxStereochemistry::new);
    }

    public org.rcsb.cif.model.generated.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent() {
        return (org.rcsb.cif.model.generated.PdbxRmsDevsCovalent) categories.computeIfAbsent("pdbx_rms_devs_covalent",
                org.rcsb.cif.model.generated.PdbxRmsDevsCovalent::new);
    }

    public org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer() {
        return (org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer) categories.computeIfAbsent("pdbx_rms_devs_cov_by_monomer",
                org.rcsb.cif.model.generated.PdbxRmsDevsCovByMonomer::new);
    }

    public org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry() {
        return (org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry) categories.computeIfAbsent("pdbx_sugar_phosphate_geometry",
                org.rcsb.cif.model.generated.PdbxSugarPhosphateGeometry::new);
    }

    public org.rcsb.cif.model.generated.PdbxNmrComputing getPdbxNmrComputing() {
        return (org.rcsb.cif.model.generated.PdbxNmrComputing) categories.computeIfAbsent("pdbx_nmr_computing",
                org.rcsb.cif.model.generated.PdbxNmrComputing::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditConformExtension getPdbxAuditConformExtension() {
        return (org.rcsb.cif.model.generated.PdbxAuditConformExtension) categories.computeIfAbsent("pdbx_audit_conform_extension",
                org.rcsb.cif.model.generated.PdbxAuditConformExtension::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccMapman getPdbxDccMapman() {
        return (org.rcsb.cif.model.generated.PdbxDccMapman) categories.computeIfAbsent("pdbx_dcc_mapman",
                org.rcsb.cif.model.generated.PdbxDccMapman::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccRsccMapman getPdbxDccRsccMapman() {
        return (org.rcsb.cif.model.generated.PdbxDccRsccMapman) categories.computeIfAbsent("pdbx_dcc_rscc_mapman",
                org.rcsb.cif.model.generated.PdbxDccRsccMapman::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall() {
        return (org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall) categories.computeIfAbsent("pdbx_dcc_rscc_mapman_overall",
                org.rcsb.cif.model.generated.PdbxDccRsccMapmanOverall::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccDensity getPdbxDccDensity() {
        return (org.rcsb.cif.model.generated.PdbxDccDensity) categories.computeIfAbsent("pdbx_dcc_density",
                org.rcsb.cif.model.generated.PdbxDccDensity::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccGeometry getPdbxDccGeometry() {
        return (org.rcsb.cif.model.generated.PdbxDccGeometry) categories.computeIfAbsent("pdbx_dcc_geometry",
                org.rcsb.cif.model.generated.PdbxDccGeometry::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccDensityCorr getPdbxDccDensityCorr() {
        return (org.rcsb.cif.model.generated.PdbxDccDensityCorr) categories.computeIfAbsent("pdbx_dcc_density_corr",
                org.rcsb.cif.model.generated.PdbxDccDensityCorr::new);
    }

    public org.rcsb.cif.model.generated.PdbxDccMap getPdbxDccMap() {
        return (org.rcsb.cif.model.generated.PdbxDccMap) categories.computeIfAbsent("pdbx_dcc_map",
                org.rcsb.cif.model.generated.PdbxDccMap::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepositGroup getPdbxDepositGroup() {
        return (org.rcsb.cif.model.generated.PdbxDepositGroup) categories.computeIfAbsent("pdbx_deposit_group",
                org.rcsb.cif.model.generated.PdbxDepositGroup::new);
    }

    public org.rcsb.cif.model.generated.PdbxDepositGroupIndex getPdbxDepositGroupIndex() {
        return (org.rcsb.cif.model.generated.PdbxDepositGroupIndex) categories.computeIfAbsent("pdbx_deposit_group_index",
                org.rcsb.cif.model.generated.PdbxDepositGroupIndex::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence) categories.computeIfAbsent("pdbx_struct_assembly_auth_evidence",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthEvidence::new);
    }

    public org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification() {
        return (org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification) categories.computeIfAbsent("pdbx_struct_assembly_auth_classification",
                org.rcsb.cif.model.generated.PdbxStructAssemblyAuthClassification::new);
    }

    public org.rcsb.cif.model.generated.PdbxCrystalAlignment getPdbxCrystalAlignment() {
        return (org.rcsb.cif.model.generated.PdbxCrystalAlignment) categories.computeIfAbsent("pdbx_crystal_alignment",
                org.rcsb.cif.model.generated.PdbxCrystalAlignment::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionHistory) categories.computeIfAbsent("pdbx_audit_revision_history",
                org.rcsb.cif.model.generated.PdbxAuditRevisionHistory::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionGroup) categories.computeIfAbsent("pdbx_audit_revision_group",
                org.rcsb.cif.model.generated.PdbxAuditRevisionGroup::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionCategory) categories.computeIfAbsent("pdbx_audit_revision_category",
                org.rcsb.cif.model.generated.PdbxAuditRevisionCategory::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionDetails) categories.computeIfAbsent("pdbx_audit_revision_details",
                org.rcsb.cif.model.generated.PdbxAuditRevisionDetails::new);
    }

    public org.rcsb.cif.model.generated.PdbxAuditRevisionItem getPdbxAuditRevisionItem() {
        return (org.rcsb.cif.model.generated.PdbxAuditRevisionItem) categories.computeIfAbsent("pdbx_audit_revision_item",
                org.rcsb.cif.model.generated.PdbxAuditRevisionItem::new);
    }

    public org.rcsb.cif.model.generated.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet() {
        return (org.rcsb.cif.model.generated.PdbxSupportingExpDataSet) categories.computeIfAbsent("pdbx_supporting_exp_data_set",
                org.rcsb.cif.model.generated.PdbxSupportingExpDataSet::new);
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement) categories.computeIfAbsent("pdbx_serial_crystallography_measurement",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographyMeasurement::new);
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDelivery::new);
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_injection",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryInjection::new);
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget) categories.computeIfAbsent("pdbx_serial_crystallography_sample_delivery_fixed_target",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget::new);
    }

    public org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction() {
        return (org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction) categories.computeIfAbsent("pdbx_serial_crystallography_data_reduction",
                org.rcsb.cif.model.generated.PdbxSerialCrystallographyDataReduction::new);
    }
}
