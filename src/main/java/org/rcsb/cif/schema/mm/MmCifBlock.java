package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.schema.AbstractBlock;
import org.rcsb.cif.schema.mm.generated.AtomSite;

public class MmCifBlock extends AbstractBlock {
    protected MmCifBlock(Block block) {
        super(block);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSite getAtomSite() {
        return new AtomSite(delegate.getCategory("atom_site"));
    }

    public org.rcsb.cif.schema.mm.generated.AtomSiteAnisotrop getAtomSiteAnisotrop() {
        return (org.rcsb.cif.schema.mm.generated.AtomSiteAnisotrop) getCategories().computeIfAbsent("atom_site_anisotrop",
                org.rcsb.cif.schema.mm.generated.AtomSiteAnisotrop::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSites getAtomSites() {
        return (org.rcsb.cif.schema.mm.generated.AtomSites) getCategories().computeIfAbsent("atom_sites",
                org.rcsb.cif.schema.mm.generated.AtomSites::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSitesAlt getAtomSitesAlt() {
        return (org.rcsb.cif.schema.mm.generated.AtomSitesAlt) getCategories().computeIfAbsent("atom_sites_alt",
                org.rcsb.cif.schema.mm.generated.AtomSitesAlt::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSitesAltEns getAtomSitesAltEns() {
        return (org.rcsb.cif.schema.mm.generated.AtomSitesAltEns) getCategories().computeIfAbsent("atom_sites_alt_ens",
                org.rcsb.cif.schema.mm.generated.AtomSitesAltEns::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSitesAltGen getAtomSitesAltGen() {
        return (org.rcsb.cif.schema.mm.generated.AtomSitesAltGen) getCategories().computeIfAbsent("atom_sites_alt_gen",
                org.rcsb.cif.schema.mm.generated.AtomSitesAltGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomSitesFootnote getAtomSitesFootnote() {
        return (org.rcsb.cif.schema.mm.generated.AtomSitesFootnote) getCategories().computeIfAbsent("atom_sites_footnote",
                org.rcsb.cif.schema.mm.generated.AtomSitesFootnote::new);
    }

    public org.rcsb.cif.schema.mm.generated.AtomType getAtomType() {
        return (org.rcsb.cif.schema.mm.generated.AtomType) getCategories().computeIfAbsent("atom_type",
                org.rcsb.cif.schema.mm.generated.AtomType::new);
    }

    public org.rcsb.cif.schema.mm.generated.Audit getAudit() {
        return (org.rcsb.cif.schema.mm.generated.Audit) getCategories().computeIfAbsent("audit",
                org.rcsb.cif.schema.mm.generated.Audit::new);
    }

    public org.rcsb.cif.schema.mm.generated.AuditAuthor getAuditAuthor() {
        return (org.rcsb.cif.schema.mm.generated.AuditAuthor) getCategories().computeIfAbsent("audit_author",
                org.rcsb.cif.schema.mm.generated.AuditAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.AuditConform getAuditConform() {
        return (org.rcsb.cif.schema.mm.generated.AuditConform) getCategories().computeIfAbsent("audit_conform",
                org.rcsb.cif.schema.mm.generated.AuditConform::new);
    }

    public org.rcsb.cif.schema.mm.generated.AuditContactAuthor getAuditContactAuthor() {
        return (org.rcsb.cif.schema.mm.generated.AuditContactAuthor) getCategories().computeIfAbsent("audit_contact_author",
                org.rcsb.cif.schema.mm.generated.AuditContactAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.Cell getCell() {
        return (org.rcsb.cif.schema.mm.generated.Cell) getCategories().computeIfAbsent("cell",
                org.rcsb.cif.schema.mm.generated.Cell::new);
    }

    public org.rcsb.cif.schema.mm.generated.CellMeasurement getCellMeasurement() {
        return (org.rcsb.cif.schema.mm.generated.CellMeasurement) getCategories().computeIfAbsent("cell_measurement",
                org.rcsb.cif.schema.mm.generated.CellMeasurement::new);
    }

    public org.rcsb.cif.schema.mm.generated.CellMeasurementRefln getCellMeasurementRefln() {
        return (org.rcsb.cif.schema.mm.generated.CellMeasurementRefln) getCategories().computeIfAbsent("cell_measurement_refln",
                org.rcsb.cif.schema.mm.generated.CellMeasurementRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemComp getChemComp() {
        return (org.rcsb.cif.schema.mm.generated.ChemComp) getCategories().computeIfAbsent("chem_comp",
                org.rcsb.cif.schema.mm.generated.ChemComp::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompAngle getChemCompAngle() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompAngle) getCategories().computeIfAbsent("chem_comp_angle",
                org.rcsb.cif.schema.mm.generated.ChemCompAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompAtom getChemCompAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompAtom) getCategories().computeIfAbsent("chem_comp_atom",
                org.rcsb.cif.schema.mm.generated.ChemCompAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompBond getChemCompBond() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompBond) getCategories().computeIfAbsent("chem_comp_bond",
                org.rcsb.cif.schema.mm.generated.ChemCompBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompChir getChemCompChir() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompChir) getCategories().computeIfAbsent("chem_comp_chir",
                org.rcsb.cif.schema.mm.generated.ChemCompChir::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompChirAtom getChemCompChirAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompChirAtom) getCategories().computeIfAbsent("chem_comp_chir_atom",
                org.rcsb.cif.schema.mm.generated.ChemCompChirAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompLink getChemCompLink() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompLink) getCategories().computeIfAbsent("chem_comp_link",
                org.rcsb.cif.schema.mm.generated.ChemCompLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompPlane getChemCompPlane() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompPlane) getCategories().computeIfAbsent("chem_comp_plane",
                org.rcsb.cif.schema.mm.generated.ChemCompPlane::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompPlaneAtom getChemCompPlaneAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompPlaneAtom) getCategories().computeIfAbsent("chem_comp_plane_atom",
                org.rcsb.cif.schema.mm.generated.ChemCompPlaneAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompTor getChemCompTor() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompTor) getCategories().computeIfAbsent("chem_comp_tor",
                org.rcsb.cif.schema.mm.generated.ChemCompTor::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemCompTorValue getChemCompTorValue() {
        return (org.rcsb.cif.schema.mm.generated.ChemCompTorValue) getCategories().computeIfAbsent("chem_comp_tor_value",
                org.rcsb.cif.schema.mm.generated.ChemCompTorValue::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLink getChemLink() {
        return (org.rcsb.cif.schema.mm.generated.ChemLink) getCategories().computeIfAbsent("chem_link",
                org.rcsb.cif.schema.mm.generated.ChemLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkAngle getChemLinkAngle() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkAngle) getCategories().computeIfAbsent("chem_link_angle",
                org.rcsb.cif.schema.mm.generated.ChemLinkAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkBond getChemLinkBond() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkBond) getCategories().computeIfAbsent("chem_link_bond",
                org.rcsb.cif.schema.mm.generated.ChemLinkBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkChir getChemLinkChir() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkChir) getCategories().computeIfAbsent("chem_link_chir",
                org.rcsb.cif.schema.mm.generated.ChemLinkChir::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkChirAtom getChemLinkChirAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkChirAtom) getCategories().computeIfAbsent("chem_link_chir_atom",
                org.rcsb.cif.schema.mm.generated.ChemLinkChirAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkPlane getChemLinkPlane() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkPlane) getCategories().computeIfAbsent("chem_link_plane",
                org.rcsb.cif.schema.mm.generated.ChemLinkPlane::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkPlaneAtom getChemLinkPlaneAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkPlaneAtom) getCategories().computeIfAbsent("chem_link_plane_atom",
                org.rcsb.cif.schema.mm.generated.ChemLinkPlaneAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkTor getChemLinkTor() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkTor) getCategories().computeIfAbsent("chem_link_tor",
                org.rcsb.cif.schema.mm.generated.ChemLinkTor::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemLinkTorValue getChemLinkTorValue() {
        return (org.rcsb.cif.schema.mm.generated.ChemLinkTorValue) getCategories().computeIfAbsent("chem_link_tor_value",
                org.rcsb.cif.schema.mm.generated.ChemLinkTorValue::new);
    }

    public org.rcsb.cif.schema.mm.generated.Chemical getChemical() {
        return (org.rcsb.cif.schema.mm.generated.Chemical) getCategories().computeIfAbsent("chemical",
                org.rcsb.cif.schema.mm.generated.Chemical::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemicalConnAtom getChemicalConnAtom() {
        return (org.rcsb.cif.schema.mm.generated.ChemicalConnAtom) getCategories().computeIfAbsent("chemical_conn_atom",
                org.rcsb.cif.schema.mm.generated.ChemicalConnAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemicalConnBond getChemicalConnBond() {
        return (org.rcsb.cif.schema.mm.generated.ChemicalConnBond) getCategories().computeIfAbsent("chemical_conn_bond",
                org.rcsb.cif.schema.mm.generated.ChemicalConnBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.ChemicalFormula getChemicalFormula() {
        return (org.rcsb.cif.schema.mm.generated.ChemicalFormula) getCategories().computeIfAbsent("chemical_formula",
                org.rcsb.cif.schema.mm.generated.ChemicalFormula::new);
    }

    public org.rcsb.cif.schema.mm.generated.Citation getCitation() {
        return (org.rcsb.cif.schema.mm.generated.Citation) getCategories().computeIfAbsent("citation",
                org.rcsb.cif.schema.mm.generated.Citation::new);
    }

    public org.rcsb.cif.schema.mm.generated.CitationAuthor getCitationAuthor() {
        return (org.rcsb.cif.schema.mm.generated.CitationAuthor) getCategories().computeIfAbsent("citation_author",
                org.rcsb.cif.schema.mm.generated.CitationAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.CitationEditor getCitationEditor() {
        return (org.rcsb.cif.schema.mm.generated.CitationEditor) getCategories().computeIfAbsent("citation_editor",
                org.rcsb.cif.schema.mm.generated.CitationEditor::new);
    }

    public org.rcsb.cif.schema.mm.generated.Computing getComputing() {
        return (org.rcsb.cif.schema.mm.generated.Computing) getCategories().computeIfAbsent("computing",
                org.rcsb.cif.schema.mm.generated.Computing::new);
    }

    public org.rcsb.cif.schema.mm.generated.Database getDatabase() {
        return (org.rcsb.cif.schema.mm.generated.Database) getCategories().computeIfAbsent("database",
                org.rcsb.cif.schema.mm.generated.Database::new);
    }

    public org.rcsb.cif.schema.mm.generated.Database2 getDatabase2() {
        return (org.rcsb.cif.schema.mm.generated.Database2) getCategories().computeIfAbsent("database_2",
                org.rcsb.cif.schema.mm.generated.Database2::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBCaveat getDatabasePDBCaveat() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBCaveat) getCategories().computeIfAbsent("database_PDB_caveat",
                org.rcsb.cif.schema.mm.generated.DatabasePDBCaveat::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBMatrix getDatabasePDBMatrix() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBMatrix) getCategories().computeIfAbsent("database_PDB_matrix",
                org.rcsb.cif.schema.mm.generated.DatabasePDBMatrix::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBRemark getDatabasePDBRemark() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBRemark) getCategories().computeIfAbsent("database_PDB_remark",
                org.rcsb.cif.schema.mm.generated.DatabasePDBRemark::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBRev getDatabasePDBRev() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBRev) getCategories().computeIfAbsent("database_PDB_rev",
                org.rcsb.cif.schema.mm.generated.DatabasePDBRev::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBRevRecord getDatabasePDBRevRecord() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBRevRecord) getCategories().computeIfAbsent("database_PDB_rev_record",
                org.rcsb.cif.schema.mm.generated.DatabasePDBRevRecord::new);
    }

    public org.rcsb.cif.schema.mm.generated.DatabasePDBTvect getDatabasePDBTvect() {
        return (org.rcsb.cif.schema.mm.generated.DatabasePDBTvect) getCategories().computeIfAbsent("database_PDB_tvect",
                org.rcsb.cif.schema.mm.generated.DatabasePDBTvect::new);
    }

    public org.rcsb.cif.schema.mm.generated.Diffrn getDiffrn() {
        return (org.rcsb.cif.schema.mm.generated.Diffrn) getCategories().computeIfAbsent("diffrn",
                org.rcsb.cif.schema.mm.generated.Diffrn::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnAttenuator getDiffrnAttenuator() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnAttenuator) getCategories().computeIfAbsent("diffrn_attenuator",
                org.rcsb.cif.schema.mm.generated.DiffrnAttenuator::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnDetector getDiffrnDetector() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnDetector) getCategories().computeIfAbsent("diffrn_detector",
                org.rcsb.cif.schema.mm.generated.DiffrnDetector::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnMeasurement getDiffrnMeasurement() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnMeasurement) getCategories().computeIfAbsent("diffrn_measurement",
                org.rcsb.cif.schema.mm.generated.DiffrnMeasurement::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnOrientMatrix getDiffrnOrientMatrix() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnOrientMatrix) getCategories().computeIfAbsent("diffrn_orient_matrix",
                org.rcsb.cif.schema.mm.generated.DiffrnOrientMatrix::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnOrientRefln getDiffrnOrientRefln() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnOrientRefln) getCategories().computeIfAbsent("diffrn_orient_refln",
                org.rcsb.cif.schema.mm.generated.DiffrnOrientRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnRadiation getDiffrnRadiation() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnRadiation) getCategories().computeIfAbsent("diffrn_radiation",
                org.rcsb.cif.schema.mm.generated.DiffrnRadiation::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnRadiationWavelength getDiffrnRadiationWavelength() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnRadiationWavelength) getCategories().computeIfAbsent("diffrn_radiation_wavelength",
                org.rcsb.cif.schema.mm.generated.DiffrnRadiationWavelength::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnRefln getDiffrnRefln() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnRefln) getCategories().computeIfAbsent("diffrn_refln",
                org.rcsb.cif.schema.mm.generated.DiffrnRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnReflns getDiffrnReflns() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnReflns) getCategories().computeIfAbsent("diffrn_reflns",
                org.rcsb.cif.schema.mm.generated.DiffrnReflns::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnScaleGroup getDiffrnScaleGroup() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnScaleGroup) getCategories().computeIfAbsent("diffrn_scale_group",
                org.rcsb.cif.schema.mm.generated.DiffrnScaleGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnSource getDiffrnSource() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnSource) getCategories().computeIfAbsent("diffrn_source",
                org.rcsb.cif.schema.mm.generated.DiffrnSource::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnStandardRefln getDiffrnStandardRefln() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnStandardRefln) getCategories().computeIfAbsent("diffrn_standard_refln",
                org.rcsb.cif.schema.mm.generated.DiffrnStandardRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnStandards getDiffrnStandards() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnStandards) getCategories().computeIfAbsent("diffrn_standards",
                org.rcsb.cif.schema.mm.generated.DiffrnStandards::new);
    }

    public org.rcsb.cif.schema.mm.generated.Entity getEntity() {
        return (org.rcsb.cif.schema.mm.generated.Entity) getCategories().computeIfAbsent("entity",
                org.rcsb.cif.schema.mm.generated.Entity::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityKeywords getEntityKeywords() {
        return (org.rcsb.cif.schema.mm.generated.EntityKeywords) getCategories().computeIfAbsent("entity_keywords",
                org.rcsb.cif.schema.mm.generated.EntityKeywords::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityLink getEntityLink() {
        return (org.rcsb.cif.schema.mm.generated.EntityLink) getCategories().computeIfAbsent("entity_link",
                org.rcsb.cif.schema.mm.generated.EntityLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityNameCom getEntityNameCom() {
        return (org.rcsb.cif.schema.mm.generated.EntityNameCom) getCategories().computeIfAbsent("entity_name_com",
                org.rcsb.cif.schema.mm.generated.EntityNameCom::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityNameSys getEntityNameSys() {
        return (org.rcsb.cif.schema.mm.generated.EntityNameSys) getCategories().computeIfAbsent("entity_name_sys",
                org.rcsb.cif.schema.mm.generated.EntityNameSys::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityPoly getEntityPoly() {
        return (org.rcsb.cif.schema.mm.generated.EntityPoly) getCategories().computeIfAbsent("entity_poly",
                org.rcsb.cif.schema.mm.generated.EntityPoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntityPolySeq getEntityPolySeq() {
        return (org.rcsb.cif.schema.mm.generated.EntityPolySeq) getCategories().computeIfAbsent("entity_poly_seq",
                org.rcsb.cif.schema.mm.generated.EntityPolySeq::new);
    }

    public org.rcsb.cif.schema.mm.generated.Entry getEntry() {
        return (org.rcsb.cif.schema.mm.generated.Entry) getCategories().computeIfAbsent("entry",
                org.rcsb.cif.schema.mm.generated.Entry::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntryLink getEntryLink() {
        return (org.rcsb.cif.schema.mm.generated.EntryLink) getCategories().computeIfAbsent("entry_link",
                org.rcsb.cif.schema.mm.generated.EntryLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.Exptl getExptl() {
        return (org.rcsb.cif.schema.mm.generated.Exptl) getCategories().computeIfAbsent("exptl",
                org.rcsb.cif.schema.mm.generated.Exptl::new);
    }

    public org.rcsb.cif.schema.mm.generated.ExptlCrystal getExptlCrystal() {
        return (org.rcsb.cif.schema.mm.generated.ExptlCrystal) getCategories().computeIfAbsent("exptl_crystal",
                org.rcsb.cif.schema.mm.generated.ExptlCrystal::new);
    }

    public org.rcsb.cif.schema.mm.generated.ExptlCrystalFace getExptlCrystalFace() {
        return (org.rcsb.cif.schema.mm.generated.ExptlCrystalFace) getCategories().computeIfAbsent("exptl_crystal_face",
                org.rcsb.cif.schema.mm.generated.ExptlCrystalFace::new);
    }

    public org.rcsb.cif.schema.mm.generated.ExptlCrystalGrow getExptlCrystalGrow() {
        return (org.rcsb.cif.schema.mm.generated.ExptlCrystalGrow) getCategories().computeIfAbsent("exptl_crystal_grow",
                org.rcsb.cif.schema.mm.generated.ExptlCrystalGrow::new);
    }

    public org.rcsb.cif.schema.mm.generated.ExptlCrystalGrowComp getExptlCrystalGrowComp() {
        return (org.rcsb.cif.schema.mm.generated.ExptlCrystalGrowComp) getCategories().computeIfAbsent("exptl_crystal_grow_comp",
                org.rcsb.cif.schema.mm.generated.ExptlCrystalGrowComp::new);
    }

    public org.rcsb.cif.schema.mm.generated.Geom getGeom() {
        return (org.rcsb.cif.schema.mm.generated.Geom) getCategories().computeIfAbsent("geom",
                org.rcsb.cif.schema.mm.generated.Geom::new);
    }

    public org.rcsb.cif.schema.mm.generated.GeomAngle getGeomAngle() {
        return (org.rcsb.cif.schema.mm.generated.GeomAngle) getCategories().computeIfAbsent("geom_angle",
                org.rcsb.cif.schema.mm.generated.GeomAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.GeomBond getGeomBond() {
        return (org.rcsb.cif.schema.mm.generated.GeomBond) getCategories().computeIfAbsent("geom_bond",
                org.rcsb.cif.schema.mm.generated.GeomBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.GeomContact getGeomContact() {
        return (org.rcsb.cif.schema.mm.generated.GeomContact) getCategories().computeIfAbsent("geom_contact",
                org.rcsb.cif.schema.mm.generated.GeomContact::new);
    }

    public org.rcsb.cif.schema.mm.generated.GeomHbond getGeomHbond() {
        return (org.rcsb.cif.schema.mm.generated.GeomHbond) getCategories().computeIfAbsent("geom_hbond",
                org.rcsb.cif.schema.mm.generated.GeomHbond::new);
    }

    public org.rcsb.cif.schema.mm.generated.GeomTorsion getGeomTorsion() {
        return (org.rcsb.cif.schema.mm.generated.GeomTorsion) getCategories().computeIfAbsent("geom_torsion",
                org.rcsb.cif.schema.mm.generated.GeomTorsion::new);
    }

    public org.rcsb.cif.schema.mm.generated.Journal getJournal() {
        return (org.rcsb.cif.schema.mm.generated.Journal) getCategories().computeIfAbsent("journal",
                org.rcsb.cif.schema.mm.generated.Journal::new);
    }

    public org.rcsb.cif.schema.mm.generated.JournalIndex getJournalIndex() {
        return (org.rcsb.cif.schema.mm.generated.JournalIndex) getCategories().computeIfAbsent("journal_index",
                org.rcsb.cif.schema.mm.generated.JournalIndex::new);
    }

    public org.rcsb.cif.schema.mm.generated.Phasing getPhasing() {
        return (org.rcsb.cif.schema.mm.generated.Phasing) getCategories().computeIfAbsent("phasing",
                org.rcsb.cif.schema.mm.generated.Phasing::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingAveraging getPhasingAveraging() {
        return (org.rcsb.cif.schema.mm.generated.PhasingAveraging) getCategories().computeIfAbsent("phasing_averaging",
                org.rcsb.cif.schema.mm.generated.PhasingAveraging::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingIsomorphous getPhasingIsomorphous() {
        return (org.rcsb.cif.schema.mm.generated.PhasingIsomorphous) getCategories().computeIfAbsent("phasing_isomorphous",
                org.rcsb.cif.schema.mm.generated.PhasingIsomorphous::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMAD getPhasingMAD() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMAD) getCategories().computeIfAbsent("phasing_MAD",
                org.rcsb.cif.schema.mm.generated.PhasingMAD::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMADClust getPhasingMADClust() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMADClust) getCategories().computeIfAbsent("phasing_MAD_clust",
                org.rcsb.cif.schema.mm.generated.PhasingMADClust::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMADExpt getPhasingMADExpt() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMADExpt) getCategories().computeIfAbsent("phasing_MAD_expt",
                org.rcsb.cif.schema.mm.generated.PhasingMADExpt::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMADRatio getPhasingMADRatio() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMADRatio) getCategories().computeIfAbsent("phasing_MAD_ratio",
                org.rcsb.cif.schema.mm.generated.PhasingMADRatio::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMADSet getPhasingMADSet() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMADSet) getCategories().computeIfAbsent("phasing_MAD_set",
                org.rcsb.cif.schema.mm.generated.PhasingMADSet::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIR getPhasingMIR() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIR) getCategories().computeIfAbsent("phasing_MIR",
                org.rcsb.cif.schema.mm.generated.PhasingMIR::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIRDer getPhasingMIRDer() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIRDer) getCategories().computeIfAbsent("phasing_MIR_der",
                org.rcsb.cif.schema.mm.generated.PhasingMIRDer::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIRDerRefln getPhasingMIRDerRefln() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIRDerRefln) getCategories().computeIfAbsent("phasing_MIR_der_refln",
                org.rcsb.cif.schema.mm.generated.PhasingMIRDerRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIRDerShell getPhasingMIRDerShell() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIRDerShell) getCategories().computeIfAbsent("phasing_MIR_der_shell",
                org.rcsb.cif.schema.mm.generated.PhasingMIRDerShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIRDerSite getPhasingMIRDerSite() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIRDerSite) getCategories().computeIfAbsent("phasing_MIR_der_site",
                org.rcsb.cif.schema.mm.generated.PhasingMIRDerSite::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingMIRShell getPhasingMIRShell() {
        return (org.rcsb.cif.schema.mm.generated.PhasingMIRShell) getCategories().computeIfAbsent("phasing_MIR_shell",
                org.rcsb.cif.schema.mm.generated.PhasingMIRShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingSet getPhasingSet() {
        return (org.rcsb.cif.schema.mm.generated.PhasingSet) getCategories().computeIfAbsent("phasing_set",
                org.rcsb.cif.schema.mm.generated.PhasingSet::new);
    }

    public org.rcsb.cif.schema.mm.generated.PhasingSetRefln getPhasingSetRefln() {
        return (org.rcsb.cif.schema.mm.generated.PhasingSetRefln) getCategories().computeIfAbsent("phasing_set_refln",
                org.rcsb.cif.schema.mm.generated.PhasingSetRefln::new);
    }

    public org.rcsb.cif.schema.mm.generated.Publ getPubl() {
        return (org.rcsb.cif.schema.mm.generated.Publ) getCategories().computeIfAbsent("publ",
                org.rcsb.cif.schema.mm.generated.Publ::new);
    }

    public org.rcsb.cif.schema.mm.generated.PublAuthor getPublAuthor() {
        return (org.rcsb.cif.schema.mm.generated.PublAuthor) getCategories().computeIfAbsent("publ_author",
                org.rcsb.cif.schema.mm.generated.PublAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PublBody getPublBody() {
        return (org.rcsb.cif.schema.mm.generated.PublBody) getCategories().computeIfAbsent("publ_body",
                org.rcsb.cif.schema.mm.generated.PublBody::new);
    }

    public org.rcsb.cif.schema.mm.generated.PublManuscriptIncl getPublManuscriptIncl() {
        return (org.rcsb.cif.schema.mm.generated.PublManuscriptIncl) getCategories().computeIfAbsent("publ_manuscript_incl",
                org.rcsb.cif.schema.mm.generated.PublManuscriptIncl::new);
    }

    public org.rcsb.cif.schema.mm.generated.Refine getRefine() {
        return (org.rcsb.cif.schema.mm.generated.Refine) getCategories().computeIfAbsent("refine",
                org.rcsb.cif.schema.mm.generated.Refine::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineAnalyze getRefineAnalyze() {
        return (org.rcsb.cif.schema.mm.generated.RefineAnalyze) getCategories().computeIfAbsent("refine_analyze",
                org.rcsb.cif.schema.mm.generated.RefineAnalyze::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineBIso getRefineBIso() {
        return (org.rcsb.cif.schema.mm.generated.RefineBIso) getCategories().computeIfAbsent("refine_B_iso",
                org.rcsb.cif.schema.mm.generated.RefineBIso::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineFunctMinimized getRefineFunctMinimized() {
        return (org.rcsb.cif.schema.mm.generated.RefineFunctMinimized) getCategories().computeIfAbsent("refine_funct_minimized",
                org.rcsb.cif.schema.mm.generated.RefineFunctMinimized::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineHist getRefineHist() {
        return (org.rcsb.cif.schema.mm.generated.RefineHist) getCategories().computeIfAbsent("refine_hist",
                org.rcsb.cif.schema.mm.generated.RefineHist::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineLsRestr getRefineLsRestr() {
        return (org.rcsb.cif.schema.mm.generated.RefineLsRestr) getCategories().computeIfAbsent("refine_ls_restr",
                org.rcsb.cif.schema.mm.generated.RefineLsRestr::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineLsRestrNcs getRefineLsRestrNcs() {
        return (org.rcsb.cif.schema.mm.generated.RefineLsRestrNcs) getCategories().computeIfAbsent("refine_ls_restr_ncs",
                org.rcsb.cif.schema.mm.generated.RefineLsRestrNcs::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineLsRestrType getRefineLsRestrType() {
        return (org.rcsb.cif.schema.mm.generated.RefineLsRestrType) getCategories().computeIfAbsent("refine_ls_restr_type",
                org.rcsb.cif.schema.mm.generated.RefineLsRestrType::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineLsShell getRefineLsShell() {
        return (org.rcsb.cif.schema.mm.generated.RefineLsShell) getCategories().computeIfAbsent("refine_ls_shell",
                org.rcsb.cif.schema.mm.generated.RefineLsShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineOccupancy getRefineOccupancy() {
        return (org.rcsb.cif.schema.mm.generated.RefineOccupancy) getCategories().computeIfAbsent("refine_occupancy",
                org.rcsb.cif.schema.mm.generated.RefineOccupancy::new);
    }

    public org.rcsb.cif.schema.mm.generated.Refln getRefln() {
        return (org.rcsb.cif.schema.mm.generated.Refln) getCategories().computeIfAbsent("refln",
                org.rcsb.cif.schema.mm.generated.Refln::new);
    }

    public org.rcsb.cif.schema.mm.generated.ReflnSysAbs getReflnSysAbs() {
        return (org.rcsb.cif.schema.mm.generated.ReflnSysAbs) getCategories().computeIfAbsent("refln_sys_abs",
                org.rcsb.cif.schema.mm.generated.ReflnSysAbs::new);
    }

    public org.rcsb.cif.schema.mm.generated.Reflns getReflns() {
        return (org.rcsb.cif.schema.mm.generated.Reflns) getCategories().computeIfAbsent("reflns",
                org.rcsb.cif.schema.mm.generated.Reflns::new);
    }

    public org.rcsb.cif.schema.mm.generated.ReflnsScale getReflnsScale() {
        return (org.rcsb.cif.schema.mm.generated.ReflnsScale) getCategories().computeIfAbsent("reflns_scale",
                org.rcsb.cif.schema.mm.generated.ReflnsScale::new);
    }

    public org.rcsb.cif.schema.mm.generated.ReflnsShell getReflnsShell() {
        return (org.rcsb.cif.schema.mm.generated.ReflnsShell) getCategories().computeIfAbsent("reflns_shell",
                org.rcsb.cif.schema.mm.generated.ReflnsShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.Software getSoftware() {
        return (org.rcsb.cif.schema.mm.generated.Software) getCategories().computeIfAbsent("software",
                org.rcsb.cif.schema.mm.generated.Software::new);
    }

    public org.rcsb.cif.schema.mm.generated.Struct getStruct() {
        return (org.rcsb.cif.schema.mm.generated.Struct) getCategories().computeIfAbsent("struct",
                org.rcsb.cif.schema.mm.generated.Struct::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructAsym getStructAsym() {
        return (org.rcsb.cif.schema.mm.generated.StructAsym) getCategories().computeIfAbsent("struct_asym",
                org.rcsb.cif.schema.mm.generated.StructAsym::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructBiol getStructBiol() {
        return (org.rcsb.cif.schema.mm.generated.StructBiol) getCategories().computeIfAbsent("struct_biol",
                org.rcsb.cif.schema.mm.generated.StructBiol::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructBiolGen getStructBiolGen() {
        return (org.rcsb.cif.schema.mm.generated.StructBiolGen) getCategories().computeIfAbsent("struct_biol_gen",
                org.rcsb.cif.schema.mm.generated.StructBiolGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructBiolKeywords getStructBiolKeywords() {
        return (org.rcsb.cif.schema.mm.generated.StructBiolKeywords) getCategories().computeIfAbsent("struct_biol_keywords",
                org.rcsb.cif.schema.mm.generated.StructBiolKeywords::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructBiolView getStructBiolView() {
        return (org.rcsb.cif.schema.mm.generated.StructBiolView) getCategories().computeIfAbsent("struct_biol_view",
                org.rcsb.cif.schema.mm.generated.StructBiolView::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructConf getStructConf() {
        return (org.rcsb.cif.schema.mm.generated.StructConf) getCategories().computeIfAbsent("struct_conf",
                org.rcsb.cif.schema.mm.generated.StructConf::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructConfType getStructConfType() {
        return (org.rcsb.cif.schema.mm.generated.StructConfType) getCategories().computeIfAbsent("struct_conf_type",
                org.rcsb.cif.schema.mm.generated.StructConfType::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructConn getStructConn() {
        return (org.rcsb.cif.schema.mm.generated.StructConn) getCategories().computeIfAbsent("struct_conn",
                org.rcsb.cif.schema.mm.generated.StructConn::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructConnType getStructConnType() {
        return (org.rcsb.cif.schema.mm.generated.StructConnType) getCategories().computeIfAbsent("struct_conn_type",
                org.rcsb.cif.schema.mm.generated.StructConnType::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructKeywords getStructKeywords() {
        return (org.rcsb.cif.schema.mm.generated.StructKeywords) getCategories().computeIfAbsent("struct_keywords",
                org.rcsb.cif.schema.mm.generated.StructKeywords::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructMonDetails getStructMonDetails() {
        return (org.rcsb.cif.schema.mm.generated.StructMonDetails) getCategories().computeIfAbsent("struct_mon_details",
                org.rcsb.cif.schema.mm.generated.StructMonDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructMonNucl getStructMonNucl() {
        return (org.rcsb.cif.schema.mm.generated.StructMonNucl) getCategories().computeIfAbsent("struct_mon_nucl",
                org.rcsb.cif.schema.mm.generated.StructMonNucl::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructMonProt getStructMonProt() {
        return (org.rcsb.cif.schema.mm.generated.StructMonProt) getCategories().computeIfAbsent("struct_mon_prot",
                org.rcsb.cif.schema.mm.generated.StructMonProt::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructMonProtCis getStructMonProtCis() {
        return (org.rcsb.cif.schema.mm.generated.StructMonProtCis) getCategories().computeIfAbsent("struct_mon_prot_cis",
                org.rcsb.cif.schema.mm.generated.StructMonProtCis::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructNcsDom getStructNcsDom() {
        return (org.rcsb.cif.schema.mm.generated.StructNcsDom) getCategories().computeIfAbsent("struct_ncs_dom",
                org.rcsb.cif.schema.mm.generated.StructNcsDom::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructNcsDomLim getStructNcsDomLim() {
        return (org.rcsb.cif.schema.mm.generated.StructNcsDomLim) getCategories().computeIfAbsent("struct_ncs_dom_lim",
                org.rcsb.cif.schema.mm.generated.StructNcsDomLim::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructNcsEns getStructNcsEns() {
        return (org.rcsb.cif.schema.mm.generated.StructNcsEns) getCategories().computeIfAbsent("struct_ncs_ens",
                org.rcsb.cif.schema.mm.generated.StructNcsEns::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructNcsEnsGen getStructNcsEnsGen() {
        return (org.rcsb.cif.schema.mm.generated.StructNcsEnsGen) getCategories().computeIfAbsent("struct_ncs_ens_gen",
                org.rcsb.cif.schema.mm.generated.StructNcsEnsGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructNcsOper getStructNcsOper() {
        return (org.rcsb.cif.schema.mm.generated.StructNcsOper) getCategories().computeIfAbsent("struct_ncs_oper",
                org.rcsb.cif.schema.mm.generated.StructNcsOper::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructRef getStructRef() {
        return (org.rcsb.cif.schema.mm.generated.StructRef) getCategories().computeIfAbsent("struct_ref",
                org.rcsb.cif.schema.mm.generated.StructRef::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructRefSeq getStructRefSeq() {
        return (org.rcsb.cif.schema.mm.generated.StructRefSeq) getCategories().computeIfAbsent("struct_ref_seq",
                org.rcsb.cif.schema.mm.generated.StructRefSeq::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructRefSeqDif getStructRefSeqDif() {
        return (org.rcsb.cif.schema.mm.generated.StructRefSeqDif) getCategories().computeIfAbsent("struct_ref_seq_dif",
                org.rcsb.cif.schema.mm.generated.StructRefSeqDif::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSheet getStructSheet() {
        return (org.rcsb.cif.schema.mm.generated.StructSheet) getCategories().computeIfAbsent("struct_sheet",
                org.rcsb.cif.schema.mm.generated.StructSheet::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSheetHbond getStructSheetHbond() {
        return (org.rcsb.cif.schema.mm.generated.StructSheetHbond) getCategories().computeIfAbsent("struct_sheet_hbond",
                org.rcsb.cif.schema.mm.generated.StructSheetHbond::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSheetOrder getStructSheetOrder() {
        return (org.rcsb.cif.schema.mm.generated.StructSheetOrder) getCategories().computeIfAbsent("struct_sheet_order",
                org.rcsb.cif.schema.mm.generated.StructSheetOrder::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSheetRange getStructSheetRange() {
        return (org.rcsb.cif.schema.mm.generated.StructSheetRange) getCategories().computeIfAbsent("struct_sheet_range",
                org.rcsb.cif.schema.mm.generated.StructSheetRange::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSheetTopology getStructSheetTopology() {
        return (org.rcsb.cif.schema.mm.generated.StructSheetTopology) getCategories().computeIfAbsent("struct_sheet_topology",
                org.rcsb.cif.schema.mm.generated.StructSheetTopology::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSite getStructSite() {
        return (org.rcsb.cif.schema.mm.generated.StructSite) getCategories().computeIfAbsent("struct_site",
                org.rcsb.cif.schema.mm.generated.StructSite::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSiteGen getStructSiteGen() {
        return (org.rcsb.cif.schema.mm.generated.StructSiteGen) getCategories().computeIfAbsent("struct_site_gen",
                org.rcsb.cif.schema.mm.generated.StructSiteGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSiteKeywords getStructSiteKeywords() {
        return (org.rcsb.cif.schema.mm.generated.StructSiteKeywords) getCategories().computeIfAbsent("struct_site_keywords",
                org.rcsb.cif.schema.mm.generated.StructSiteKeywords::new);
    }

    public org.rcsb.cif.schema.mm.generated.StructSiteView getStructSiteView() {
        return (org.rcsb.cif.schema.mm.generated.StructSiteView) getCategories().computeIfAbsent("struct_site_view",
                org.rcsb.cif.schema.mm.generated.StructSiteView::new);
    }

    public org.rcsb.cif.schema.mm.generated.Symmetry getSymmetry() {
        return (org.rcsb.cif.schema.mm.generated.Symmetry) getCategories().computeIfAbsent("symmetry",
                org.rcsb.cif.schema.mm.generated.Symmetry::new);
    }

    public org.rcsb.cif.schema.mm.generated.SymmetryEquiv getSymmetryEquiv() {
        return (org.rcsb.cif.schema.mm.generated.SymmetryEquiv) getCategories().computeIfAbsent("symmetry_equiv",
                org.rcsb.cif.schema.mm.generated.SymmetryEquiv::new);
    }

    public org.rcsb.cif.schema.mm.generated.AuditLink getAuditLink() {
        return (org.rcsb.cif.schema.mm.generated.AuditLink) getCategories().computeIfAbsent("audit_link",
                org.rcsb.cif.schema.mm.generated.AuditLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.DiffrnReflnsClass getDiffrnReflnsClass() {
        return (org.rcsb.cif.schema.mm.generated.DiffrnReflnsClass) getCategories().computeIfAbsent("diffrn_reflns_class",
                org.rcsb.cif.schema.mm.generated.DiffrnReflnsClass::new);
    }

    public org.rcsb.cif.schema.mm.generated.RefineLsClass getRefineLsClass() {
        return (org.rcsb.cif.schema.mm.generated.RefineLsClass) getCategories().computeIfAbsent("refine_ls_class",
                org.rcsb.cif.schema.mm.generated.RefineLsClass::new);
    }

    public org.rcsb.cif.schema.mm.generated.ReflnsClass getReflnsClass() {
        return (org.rcsb.cif.schema.mm.generated.ReflnsClass) getCategories().computeIfAbsent("reflns_class",
                org.rcsb.cif.schema.mm.generated.ReflnsClass::new);
    }

    public org.rcsb.cif.schema.mm.generated.SpaceGroup getSpaceGroup() {
        return (org.rcsb.cif.schema.mm.generated.SpaceGroup) getCategories().computeIfAbsent("space_group",
                org.rcsb.cif.schema.mm.generated.SpaceGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.SpaceGroupSymop getSpaceGroupSymop() {
        return (org.rcsb.cif.schema.mm.generated.SpaceGroupSymop) getCategories().computeIfAbsent("space_group_symop",
                org.rcsb.cif.schema.mm.generated.SpaceGroupSymop::new);
    }

    public org.rcsb.cif.schema.mm.generated.ValenceParam getValenceParam() {
        return (org.rcsb.cif.schema.mm.generated.ValenceParam) getCategories().computeIfAbsent("valence_param",
                org.rcsb.cif.schema.mm.generated.ValenceParam::new);
    }

    public org.rcsb.cif.schema.mm.generated.ValenceRef getValenceRef() {
        return (org.rcsb.cif.schema.mm.generated.ValenceRef) getCategories().computeIfAbsent("valence_ref",
                org.rcsb.cif.schema.mm.generated.ValenceRef::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAudit getPdbxAudit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAudit) getCategories().computeIfAbsent("pdbx_audit",
                org.rcsb.cif.schema.mm.generated.PdbxAudit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxVersion getPdbxVersion() {
        return (org.rcsb.cif.schema.mm.generated.PdbxVersion) getCategories().computeIfAbsent("pdbx_version",
                org.rcsb.cif.schema.mm.generated.PdbxVersion::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditAuthor getPdbxAuditAuthor() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditAuthor) getCategories().computeIfAbsent("pdbx_audit_author",
                org.rcsb.cif.schema.mm.generated.PdbxAuditAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseMessage getPdbxDatabaseMessage() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseMessage) getCategories().computeIfAbsent("pdbx_database_message",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseMessage::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBObsSpr getPdbxDatabasePDBObsSpr() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBObsSpr) getCategories().computeIfAbsent("pdbx_database_PDB_obs_spr",
                org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBObsSpr::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseProc getPdbxDatabaseProc() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseProc) getCategories().computeIfAbsent("pdbx_database_proc",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseProc::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseRemark getPdbxDatabaseRemark() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseRemark) getCategories().computeIfAbsent("pdbx_database_remark",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseRemark::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatus getPdbxDatabaseStatus() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatus) getCategories().computeIfAbsent("pdbx_database_status",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatus::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityName getPdbxEntityName() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityName) getCategories().computeIfAbsent("pdbx_entity_name",
                org.rcsb.cif.schema.mm.generated.PdbxEntityName::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPrereleaseSeq getPdbxPrereleaseSeq() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPrereleaseSeq) getCategories().computeIfAbsent("pdbx_prerelease_seq",
                org.rcsb.cif.schema.mm.generated.PdbxPrereleaseSeq::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPolySeqScheme getPdbxPolySeqScheme() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPolySeqScheme) getCategories().computeIfAbsent("pdbx_poly_seq_scheme",
                org.rcsb.cif.schema.mm.generated.PdbxPolySeqScheme::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNonpolyScheme) getCategories().computeIfAbsent("pdbx_nonpoly_scheme",
                org.rcsb.cif.schema.mm.generated.PdbxNonpolyScheme::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefine getPdbxRefine() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefine) getCategories().computeIfAbsent("pdbx_refine",
                org.rcsb.cif.schema.mm.generated.PdbxRefine::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructSheetHbond getPdbxStructSheetHbond() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructSheetHbond) getCategories().computeIfAbsent("pdbx_struct_sheet_hbond",
                org.rcsb.cif.schema.mm.generated.PdbxStructSheetHbond::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxXplorFile getPdbxXplorFile() {
        return (org.rcsb.cif.schema.mm.generated.PdbxXplorFile) getCategories().computeIfAbsent("pdbx_xplor_file",
                org.rcsb.cif.schema.mm.generated.PdbxXplorFile::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefineAuxFile getPdbxRefineAuxFile() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefineAuxFile) getCategories().computeIfAbsent("pdbx_refine_aux_file",
                org.rcsb.cif.schema.mm.generated.PdbxRefineAuxFile::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseRelated getPdbxDatabaseRelated() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseRelated) getCategories().computeIfAbsent("pdbx_database_related",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseRelated::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityAssembly getPdbxEntityAssembly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityAssembly) getCategories().computeIfAbsent("pdbx_entity_assembly",
                org.rcsb.cif.schema.mm.generated.PdbxEntityAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowComp getPdbxExptlCrystalGrowComp() {
        return (org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowComp) getCategories().computeIfAbsent("pdbx_exptl_crystal_grow_comp",
                org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowComp::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowSol getPdbxExptlCrystalGrowSol() {
        return (org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowSol) getCategories().computeIfAbsent("pdbx_exptl_crystal_grow_sol",
                org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalGrowSol::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalCryoTreatment getPdbxExptlCrystalCryoTreatment() {
        return (org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalCryoTreatment) getCategories().computeIfAbsent("pdbx_exptl_crystal_cryo_treatment",
                org.rcsb.cif.schema.mm.generated.PdbxExptlCrystalCryoTreatment::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefineTls getPdbxRefineTls() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefineTls) getCategories().computeIfAbsent("pdbx_refine_tls",
                org.rcsb.cif.schema.mm.generated.PdbxRefineTls::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefineTlsGroup getPdbxRefineTlsGroup() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefineTlsGroup) getCategories().computeIfAbsent("pdbx_refine_tls_group",
                org.rcsb.cif.schema.mm.generated.PdbxRefineTlsGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxContactAuthor getPdbxContactAuthor() {
        return (org.rcsb.cif.schema.mm.generated.PdbxContactAuthor) getCategories().computeIfAbsent("pdbx_contact_author",
                org.rcsb.cif.schema.mm.generated.PdbxContactAuthor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSGProject getPdbxSGProject() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSGProject) getCategories().computeIfAbsent("pdbx_SG_project",
                org.rcsb.cif.schema.mm.generated.PdbxSGProject::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAtomSiteAnisoTls getPdbxAtomSiteAnisoTls() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAtomSiteAnisoTls) getCategories().computeIfAbsent("pdbx_atom_site_aniso_tls",
                org.rcsb.cif.schema.mm.generated.PdbxAtomSiteAnisoTls::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrDetails getPdbxNmrDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrDetails) getCategories().computeIfAbsent("pdbx_nmr_details",
                org.rcsb.cif.schema.mm.generated.PdbxNmrDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSampleDetails getPdbxNmrSampleDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSampleDetails) getCategories().computeIfAbsent("pdbx_nmr_sample_details",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSampleDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSample getPdbxNmrExptlSample() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSample) getCategories().computeIfAbsent("pdbx_nmr_exptl_sample",
                org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSample::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSampleConditions getPdbxNmrExptlSampleConditions() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSampleConditions) getCategories().computeIfAbsent("pdbx_nmr_exptl_sample_conditions",
                org.rcsb.cif.schema.mm.generated.PdbxNmrExptlSampleConditions::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSpectrometer getPdbxNmrSpectrometer() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSpectrometer) getCategories().computeIfAbsent("pdbx_nmr_spectrometer",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSpectrometer::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrExptl getPdbxNmrExptl() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrExptl) getCategories().computeIfAbsent("pdbx_nmr_exptl",
                org.rcsb.cif.schema.mm.generated.PdbxNmrExptl::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSoftware getPdbxNmrSoftware() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSoftware) getCategories().computeIfAbsent("pdbx_nmr_software",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSoftware::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrConstraints getPdbxNmrConstraints() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrConstraints) getCategories().computeIfAbsent("pdbx_nmr_constraints",
                org.rcsb.cif.schema.mm.generated.PdbxNmrConstraints::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrEnsemble getPdbxNmrEnsemble() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrEnsemble) getCategories().computeIfAbsent("pdbx_nmr_ensemble",
                org.rcsb.cif.schema.mm.generated.PdbxNmrEnsemble::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrEnsembleRms getPdbxNmrEnsembleRms() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrEnsembleRms) getCategories().computeIfAbsent("pdbx_nmr_ensemble_rms",
                org.rcsb.cif.schema.mm.generated.PdbxNmrEnsembleRms::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrRepresentative getPdbxNmrRepresentative() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrRepresentative) getCategories().computeIfAbsent("pdbx_nmr_representative",
                org.rcsb.cif.schema.mm.generated.PdbxNmrRepresentative::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrRefine getPdbxNmrRefine() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrRefine) getCategories().computeIfAbsent("pdbx_nmr_refine",
                org.rcsb.cif.schema.mm.generated.PdbxNmrRefine::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrForceConstants getPdbxNmrForceConstants() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrForceConstants) getCategories().computeIfAbsent("pdbx_nmr_force_constants",
                org.rcsb.cif.schema.mm.generated.PdbxNmrForceConstants::new);
    }

    public org.rcsb.cif.schema.mm.generated.NdbStructConfNa getNdbStructConfNa() {
        return (org.rcsb.cif.schema.mm.generated.NdbStructConfNa) getCategories().computeIfAbsent("ndb_struct_conf_na",
                org.rcsb.cif.schema.mm.generated.NdbStructConfNa::new);
    }

    public org.rcsb.cif.schema.mm.generated.NdbStructFeatureNa getNdbStructFeatureNa() {
        return (org.rcsb.cif.schema.mm.generated.NdbStructFeatureNa) getCategories().computeIfAbsent("ndb_struct_feature_na",
                org.rcsb.cif.schema.mm.generated.NdbStructFeatureNa::new);
    }

    public org.rcsb.cif.schema.mm.generated.NdbStructNaBasePair getNdbStructNaBasePair() {
        return (org.rcsb.cif.schema.mm.generated.NdbStructNaBasePair) getCategories().computeIfAbsent("ndb_struct_na_base_pair",
                org.rcsb.cif.schema.mm.generated.NdbStructNaBasePair::new);
    }

    public org.rcsb.cif.schema.mm.generated.NdbStructNaBasePairStep getNdbStructNaBasePairStep() {
        return (org.rcsb.cif.schema.mm.generated.NdbStructNaBasePairStep) getCategories().computeIfAbsent("ndb_struct_na_base_pair_step",
                org.rcsb.cif.schema.mm.generated.NdbStructNaBasePairStep::new);
    }

    public org.rcsb.cif.schema.mm.generated.NdbOriginalNdbCoordinates getNdbOriginalNdbCoordinates() {
        return (org.rcsb.cif.schema.mm.generated.NdbOriginalNdbCoordinates) getCategories().computeIfAbsent("ndb_original_ndb_coordinates",
                org.rcsb.cif.schema.mm.generated.NdbOriginalNdbCoordinates::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityNonpoly getPdbxEntityNonpoly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityNonpoly) getCategories().computeIfAbsent("pdbx_entity_nonpoly",
                org.rcsb.cif.schema.mm.generated.PdbxEntityNonpoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingDm getPdbxPhasingDm() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingDm) getCategories().computeIfAbsent("pdbx_phasing_dm",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingDm::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingDmShell getPdbxPhasingDmShell() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingDmShell) getCategories().computeIfAbsent("pdbx_phasing_dm_shell",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingDmShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingMADShell getPdbxPhasingMADShell() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingMADShell) getCategories().computeIfAbsent("pdbx_phasing_MAD_shell",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingMADShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSet getPdbxPhasingMADSet() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSet) getCategories().computeIfAbsent("pdbx_phasing_MAD_set",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSet::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetShell getPdbxPhasingMADSetShell() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetShell) getCategories().computeIfAbsent("pdbx_phasing_MAD_set_shell",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetSite getPdbxPhasingMADSetSite() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetSite) getCategories().computeIfAbsent("pdbx_phasing_MAD_set_site",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingMADSetSite::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPhasingMR getPdbxPhasingMR() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPhasingMR) getCategories().computeIfAbsent("pdbx_phasing_MR",
                org.rcsb.cif.schema.mm.generated.PdbxPhasingMR::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefineComponent getPdbxRefineComponent() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefineComponent) getCategories().computeIfAbsent("pdbx_refine_component",
                org.rcsb.cif.schema.mm.generated.PdbxRefineComponent::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityProdProtocol getPdbxEntityProdProtocol() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityProdProtocol) getCategories().computeIfAbsent("pdbx_entity_prod_protocol",
                org.rcsb.cif.schema.mm.generated.PdbxEntityProdProtocol::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOther getPdbxEntitySrcGenProdOther() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOther) getCategories().computeIfAbsent("pdbx_entity_src_gen_prod_other",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOther::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOtherParameter getPdbxEntitySrcGenProdOtherParameter() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOtherParameter) getCategories().computeIfAbsent("pdbx_entity_src_gen_prod_other_parameter",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdOtherParameter::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdPcr getPdbxEntitySrcGenProdPcr() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdPcr) getCategories().computeIfAbsent("pdbx_entity_src_gen_prod_pcr",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdPcr::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdDigest getPdbxEntitySrcGenProdDigest() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdDigest) getCategories().computeIfAbsent("pdbx_entity_src_gen_prod_digest",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProdDigest::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenClone getPdbxEntitySrcGenClone() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenClone) getCategories().computeIfAbsent("pdbx_entity_src_gen_clone",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenClone::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneLigation getPdbxEntitySrcGenCloneLigation() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneLigation) getCategories().computeIfAbsent("pdbx_entity_src_gen_clone_ligation",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneLigation::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneRecombination getPdbxEntitySrcGenCloneRecombination() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneRecombination) getCategories().computeIfAbsent("pdbx_entity_src_gen_clone_recombination",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCloneRecombination::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpress getPdbxEntitySrcGenExpress() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpress) getCategories().computeIfAbsent("pdbx_entity_src_gen_express",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpress::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpressTimepoint getPdbxEntitySrcGenExpressTimepoint() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpressTimepoint) getCategories().computeIfAbsent("pdbx_entity_src_gen_express_timepoint",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenExpressTimepoint::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenLysis getPdbxEntitySrcGenLysis() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenLysis) getCategories().computeIfAbsent("pdbx_entity_src_gen_lysis",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenLysis::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenRefold getPdbxEntitySrcGenRefold() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenRefold) getCategories().computeIfAbsent("pdbx_entity_src_gen_refold",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenRefold::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProteolysis getPdbxEntitySrcGenProteolysis() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProteolysis) getCategories().computeIfAbsent("pdbx_entity_src_gen_proteolysis",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenProteolysis::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenChrom getPdbxEntitySrcGenChrom() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenChrom) getCategories().computeIfAbsent("pdbx_entity_src_gen_chrom",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenChrom::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenFract getPdbxEntitySrcGenFract() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenFract) getCategories().computeIfAbsent("pdbx_entity_src_gen_fract",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenFract::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenPure getPdbxEntitySrcGenPure() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenPure) getCategories().computeIfAbsent("pdbx_entity_src_gen_pure",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenPure::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCharacter getPdbxEntitySrcGenCharacter() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCharacter) getCategories().computeIfAbsent("pdbx_entity_src_gen_character",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenCharacter::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConstruct getPdbxConstruct() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConstruct) getCategories().computeIfAbsent("pdbx_construct",
                org.rcsb.cif.schema.mm.generated.PdbxConstruct::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConstructFeature getPdbxConstructFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConstructFeature) getCategories().computeIfAbsent("pdbx_construct_feature",
                org.rcsb.cif.schema.mm.generated.PdbxConstructFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRobotSystem getPdbxRobotSystem() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRobotSystem) getCategories().computeIfAbsent("pdbx_robot_system",
                org.rcsb.cif.schema.mm.generated.PdbxRobotSystem::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxBuffer getPdbxBuffer() {
        return (org.rcsb.cif.schema.mm.generated.PdbxBuffer) getCategories().computeIfAbsent("pdbx_buffer",
                org.rcsb.cif.schema.mm.generated.PdbxBuffer::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxBufferComponents getPdbxBufferComponents() {
        return (org.rcsb.cif.schema.mm.generated.PdbxBufferComponents) getCategories().computeIfAbsent("pdbx_buffer_components",
                org.rcsb.cif.schema.mm.generated.PdbxBufferComponents::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDomain getPdbxDomain() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDomain) getCategories().computeIfAbsent("pdbx_domain",
                org.rcsb.cif.schema.mm.generated.PdbxDomain::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDomainRange getPdbxDomainRange() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDomainRange) getCategories().computeIfAbsent("pdbx_domain_range",
                org.rcsb.cif.schema.mm.generated.PdbxDomainRange::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSequenceRange getPdbxSequenceRange() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSequenceRange) getCategories().computeIfAbsent("pdbx_sequence_range",
                org.rcsb.cif.schema.mm.generated.PdbxSequenceRange::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFeatureEntry getPdbxFeatureEntry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFeatureEntry) getCategories().computeIfAbsent("pdbx_feature_entry",
                org.rcsb.cif.schema.mm.generated.PdbxFeatureEntry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFeatureDomain getPdbxFeatureDomain() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFeatureDomain) getCategories().computeIfAbsent("pdbx_feature_domain",
                org.rcsb.cif.schema.mm.generated.PdbxFeatureDomain::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFeatureSequenceRange getPdbxFeatureSequenceRange() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFeatureSequenceRange) getCategories().computeIfAbsent("pdbx_feature_sequence_range",
                org.rcsb.cif.schema.mm.generated.PdbxFeatureSequenceRange::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFeatureAssembly getPdbxFeatureAssembly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFeatureAssembly) getCategories().computeIfAbsent("pdbx_feature_assembly",
                org.rcsb.cif.schema.mm.generated.PdbxFeatureAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFeatureMonomer getPdbxFeatureMonomer() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFeatureMonomer) getCategories().computeIfAbsent("pdbx_feature_monomer",
                org.rcsb.cif.schema.mm.generated.PdbxFeatureMonomer::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxExptlPd getPdbxExptlPd() {
        return (org.rcsb.cif.schema.mm.generated.PdbxExptlPd) getCategories().computeIfAbsent("pdbx_exptl_pd",
                org.rcsb.cif.schema.mm.generated.PdbxExptlPd::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReflnsTwin getPdbxReflnsTwin() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReflnsTwin) getCategories().computeIfAbsent("pdbx_reflns_twin",
                org.rcsb.cif.schema.mm.generated.PdbxReflnsTwin::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructInfo getPdbxStructInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructInfo) getCategories().computeIfAbsent("pdbx_struct_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReRefinement getPdbxReRefinement() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReRefinement) getCategories().computeIfAbsent("pdbx_re_refinement",
                org.rcsb.cif.schema.mm.generated.PdbxReRefinement::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyProp getPdbxStructAssemblyProp() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyProp) getCategories().computeIfAbsent("pdbx_struct_assembly_prop",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyProp::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeature getPdbxStructRefSeqFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeature) getCategories().computeIfAbsent("pdbx_struct_ref_seq_feature",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeatureProp getPdbxStructRefSeqFeatureProp() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeatureProp) getCategories().computeIfAbsent("pdbx_struct_ref_seq_feature_prop",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqFeatureProp::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructChemCompDiagnostics getPdbxStructChemCompDiagnostics() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructChemCompDiagnostics) getCategories().computeIfAbsent("pdbx_struct_chem_comp_diagnostics",
                org.rcsb.cif.schema.mm.generated.PdbxStructChemCompDiagnostics::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompFeature getPdbxChemCompFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompFeature) getCategories().computeIfAbsent("pdbx_chem_comp_feature",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxCoordinateModel getPdbxCoordinateModel() {
        return (org.rcsb.cif.schema.mm.generated.PdbxCoordinateModel) getCategories().computeIfAbsent("pdbx_coordinate_model",
                org.rcsb.cif.schema.mm.generated.PdbxCoordinateModel::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructChemCompFeature getPdbxStructChemCompFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructChemCompFeature) getCategories().computeIfAbsent("pdbx_struct_chem_comp_feature",
                org.rcsb.cif.schema.mm.generated.PdbxStructChemCompFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDiffrnReflnsShell getPdbxDiffrnReflnsShell() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDiffrnReflnsShell) getCategories().computeIfAbsent("pdbx_diffrn_reflns_shell",
                org.rcsb.cif.schema.mm.generated.PdbxDiffrnReflnsShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxBondDistanceLimits getPdbxBondDistanceLimits() {
        return (org.rcsb.cif.schema.mm.generated.PdbxBondDistanceLimits) getCategories().computeIfAbsent("pdbx_bond_distance_limits",
                org.rcsb.cif.schema.mm.generated.PdbxBondDistanceLimits::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSolnScatter getPdbxSolnScatter() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSolnScatter) getCategories().computeIfAbsent("pdbx_soln_scatter",
                org.rcsb.cif.schema.mm.generated.PdbxSolnScatter::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSolnScatterModel getPdbxSolnScatterModel() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSolnScatterModel) getCategories().computeIfAbsent("pdbx_soln_scatter_model",
                org.rcsb.cif.schema.mm.generated.PdbxSolnScatterModel::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompDescriptor getPdbxChemCompDescriptor() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompDescriptor) getCategories().computeIfAbsent("pdbx_chem_comp_descriptor",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompDescriptor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompIdentifier) getCategories().computeIfAbsent("pdbx_chem_comp_identifier",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompIdentifier::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompImport getPdbxChemCompImport() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompImport) getCategories().computeIfAbsent("pdbx_chem_comp_import",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompImport::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomEdit getPdbxChemCompAtomEdit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomEdit) getCategories().computeIfAbsent("pdbx_chem_comp_atom_edit",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomEdit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompBondEdit getPdbxChemCompBondEdit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompBondEdit) getCategories().computeIfAbsent("pdbx_chem_comp_bond_edit",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompBondEdit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompAudit getPdbxChemCompAudit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompAudit) getCategories().computeIfAbsent("pdbx_chem_comp_audit",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompAudit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateCloseContact getPdbxValidateCloseContact() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateCloseContact) getCategories().computeIfAbsent("pdbx_validate_close_contact",
                org.rcsb.cif.schema.mm.generated.PdbxValidateCloseContact::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateSymmContact getPdbxValidateSymmContact() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateSymmContact) getCategories().computeIfAbsent("pdbx_validate_symm_contact",
                org.rcsb.cif.schema.mm.generated.PdbxValidateSymmContact::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdBond getPdbxValidateRmsdBond() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdBond) getCategories().computeIfAbsent("pdbx_validate_rmsd_bond",
                org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdAngle getPdbxValidateRmsdAngle() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdAngle) getCategories().computeIfAbsent("pdbx_validate_rmsd_angle",
                org.rcsb.cif.schema.mm.generated.PdbxValidateRmsdAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateTorsion getPdbxValidateTorsion() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateTorsion) getCategories().computeIfAbsent("pdbx_validate_torsion",
                org.rcsb.cif.schema.mm.generated.PdbxValidateTorsion::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidatePeptideOmega getPdbxValidatePeptideOmega() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidatePeptideOmega) getCategories().computeIfAbsent("pdbx_validate_peptide_omega",
                org.rcsb.cif.schema.mm.generated.PdbxValidatePeptideOmega::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateChiral getPdbxValidateChiral() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateChiral) getCategories().computeIfAbsent("pdbx_validate_chiral",
                org.rcsb.cif.schema.mm.generated.PdbxValidateChiral::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidatePlanes getPdbxValidatePlanes() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidatePlanes) getCategories().computeIfAbsent("pdbx_validate_planes",
                org.rcsb.cif.schema.mm.generated.PdbxValidatePlanes::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidatePlanesAtom getPdbxValidatePlanesAtom() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidatePlanesAtom) getCategories().computeIfAbsent("pdbx_validate_planes_atom",
                org.rcsb.cif.schema.mm.generated.PdbxValidatePlanesAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidateMainChainPlane getPdbxValidateMainChainPlane() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidateMainChainPlane) getCategories().computeIfAbsent("pdbx_validate_main_chain_plane",
                org.rcsb.cif.schema.mm.generated.PdbxValidateMainChainPlane::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructConnAngle getPdbxStructConnAngle() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructConnAngle) getCategories().computeIfAbsent("pdbx_struct_conn_angle",
                org.rcsb.cif.schema.mm.generated.PdbxStructConnAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccResidues getPdbxUnobsOrZeroOccResidues() {
        return (org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccResidues) getCategories().computeIfAbsent("pdbx_unobs_or_zero_occ_residues",
                org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccResidues::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccAtoms getPdbxUnobsOrZeroOccAtoms() {
        return (org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccAtoms) getCategories().computeIfAbsent("pdbx_unobs_or_zero_occ_atoms",
                org.rcsb.cif.schema.mm.generated.PdbxUnobsOrZeroOccAtoms::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntryDetails getPdbxEntryDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntryDetails) getCategories().computeIfAbsent("pdbx_entry_details",
                org.rcsb.cif.schema.mm.generated.PdbxEntryDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructModResidue getPdbxStructModResidue() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructModResidue) getCategories().computeIfAbsent("pdbx_struct_mod_residue",
                org.rcsb.cif.schema.mm.generated.PdbxStructModResidue::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqInsertion getPdbxStructRefSeqInsertion() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqInsertion) getCategories().computeIfAbsent("pdbx_struct_ref_seq_insertion",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqInsertion::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDeletion getPdbxStructRefSeqDeletion() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDeletion) getCategories().computeIfAbsent("pdbx_struct_ref_seq_deletion",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDeletion::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRemediationAtomSiteMapping getPdbxRemediationAtomSiteMapping() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRemediationAtomSiteMapping) getCategories().computeIfAbsent("pdbx_remediation_atom_site_mapping",
                org.rcsb.cif.schema.mm.generated.PdbxRemediationAtomSiteMapping::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValidatePolymerLinkage getPdbxValidatePolymerLinkage() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValidatePolymerLinkage) getCategories().computeIfAbsent("pdbx_validate_polymer_linkage",
                org.rcsb.cif.schema.mm.generated.PdbxValidatePolymerLinkage::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetry getPdbxHelicalSymmetry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetry) getCategories().computeIfAbsent("pdbx_helical_symmetry",
                org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPointSymmetry getPdbxPointSymmetry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPointSymmetry) getCategories().computeIfAbsent("pdbx_point_symmetry",
                org.rcsb.cif.schema.mm.generated.PdbxPointSymmetry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructEntityInst getPdbxStructEntityInst() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructEntityInst) getCategories().computeIfAbsent("pdbx_struct_entity_inst",
                org.rcsb.cif.schema.mm.generated.PdbxStructEntityInst::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructOperList getPdbxStructOperList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructOperList) getCategories().computeIfAbsent("pdbx_struct_oper_list",
                org.rcsb.cif.schema.mm.generated.PdbxStructOperList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssembly getPdbxStructAssembly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssembly) getCategories().computeIfAbsent("pdbx_struct_assembly",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGen) getCategories().computeIfAbsent("pdbx_struct_assembly_gen",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAsymGen getPdbxStructAsymGen() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAsymGen) getCategories().computeIfAbsent("pdbx_struct_asym_gen",
                org.rcsb.cif.schema.mm.generated.PdbxStructAsymGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructMsymGen getPdbxStructMsymGen() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructMsymGen) getCategories().computeIfAbsent("pdbx_struct_msym_gen",
                org.rcsb.cif.schema.mm.generated.PdbxStructMsymGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructLegacyOperList getPdbxStructLegacyOperList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructLegacyOperList) getCategories().computeIfAbsent("pdbx_struct_legacy_oper_list",
                org.rcsb.cif.schema.mm.generated.PdbxStructLegacyOperList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomFeature getPdbxChemCompAtomFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomFeature) getCategories().computeIfAbsent("pdbx_chem_comp_atom_feature",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFamily getPdbxReferenceMoleculeFamily() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFamily) getCategories().computeIfAbsent("pdbx_reference_molecule_family",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFamily::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeList getPdbxReferenceMoleculeList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeList) getCategories().computeIfAbsent("pdbx_reference_molecule_list",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMolecule getPdbxReferenceMolecule() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMolecule) getCategories().computeIfAbsent("pdbx_reference_molecule",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMolecule::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityList) getCategories().computeIfAbsent("pdbx_reference_entity_list",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityNonpoly getPdbxReferenceEntityNonpoly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityNonpoly) getCategories().computeIfAbsent("pdbx_reference_entity_nonpoly",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityNonpoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityLink) getCategories().computeIfAbsent("pdbx_reference_entity_link",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolyLink) getCategories().computeIfAbsent("pdbx_reference_entity_poly_link",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolyLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPoly getPdbxReferenceEntityPoly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPoly) getCategories().computeIfAbsent("pdbx_reference_entity_poly",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolySeq getPdbxReferenceEntityPolySeq() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolySeq) getCategories().computeIfAbsent("pdbx_reference_entity_poly_seq",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntityPolySeq::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySequence getPdbxReferenceEntitySequence() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySequence) getCategories().computeIfAbsent("pdbx_reference_entity_sequence",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySequence::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySrcNat getPdbxReferenceEntitySrcNat() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySrcNat) getCategories().computeIfAbsent("pdbx_reference_entity_src_nat",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySrcNat::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeDetails getPdbxReferenceMoleculeDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeDetails) getCategories().computeIfAbsent("pdbx_reference_molecule_details",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeSynonyms getPdbxReferenceMoleculeSynonyms() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeSynonyms) getCategories().computeIfAbsent("pdbx_reference_molecule_synonyms",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeSynonyms::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySubcomponents getPdbxReferenceEntitySubcomponents() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySubcomponents) getCategories().computeIfAbsent("pdbx_reference_entity_subcomponents",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceEntitySubcomponents::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeAnnotation getPdbxReferenceMoleculeAnnotation() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeAnnotation) getCategories().computeIfAbsent("pdbx_reference_molecule_annotation",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeAnnotation::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFeatures getPdbxReferenceMoleculeFeatures() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFeatures) getCategories().computeIfAbsent("pdbx_reference_molecule_features",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeFeatures::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeRelatedStructures getPdbxReferenceMoleculeRelatedStructures() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeRelatedStructures) getCategories().computeIfAbsent("pdbx_reference_molecule_related_structures",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceMoleculeRelatedStructures::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructGroupList getPdbxStructGroupList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructGroupList) getCategories().computeIfAbsent("pdbx_struct_group_list",
                org.rcsb.cif.schema.mm.generated.PdbxStructGroupList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponents getPdbxStructGroupComponents() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponents) getCategories().computeIfAbsent("pdbx_struct_group_components",
                org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponents::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponentRange getPdbxStructGroupComponentRange() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponentRange) getCategories().computeIfAbsent("pdbx_struct_group_component_range",
                org.rcsb.cif.schema.mm.generated.PdbxStructGroupComponentRange::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPrdAudit getPdbxPrdAudit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPrdAudit) getCategories().computeIfAbsent("pdbx_prd_audit",
                org.rcsb.cif.schema.mm.generated.PdbxPrdAudit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFamilyPrdAudit getPdbxFamilyPrdAudit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFamilyPrdAudit) getCategories().computeIfAbsent("pdbx_family_prd_audit",
                org.rcsb.cif.schema.mm.generated.PdbxFamilyPrdAudit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMolecule getPdbxMolecule() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMolecule) getCategories().computeIfAbsent("pdbx_molecule",
                org.rcsb.cif.schema.mm.generated.PdbxMolecule::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeatures) getCategories().computeIfAbsent("pdbx_molecule_features",
                org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeatures::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxFamilyGroupIndex getPdbxFamilyGroupIndex() {
        return (org.rcsb.cif.schema.mm.generated.PdbxFamilyGroupIndex) getCategories().computeIfAbsent("pdbx_family_group_index",
                org.rcsb.cif.schema.mm.generated.PdbxFamilyGroupIndex::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDistantSolventAtoms getPdbxDistantSolventAtoms() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDistantSolventAtoms) getCategories().computeIfAbsent("pdbx_distant_solvent_atoms",
                org.rcsb.cif.schema.mm.generated.PdbxDistantSolventAtoms::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructSpecialSymmetry getPdbxStructSpecialSymmetry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructSpecialSymmetry) getCategories().computeIfAbsent("pdbx_struct_special_symmetry",
                org.rcsb.cif.schema.mm.generated.PdbxStructSpecialSymmetry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferencePublicationList getPdbxReferencePublicationList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferencePublicationList) getCategories().computeIfAbsent("pdbx_reference_publication_list",
                org.rcsb.cif.schema.mm.generated.PdbxReferencePublicationList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrAssignedChemShiftList getPdbxNmrAssignedChemShiftList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrAssignedChemShiftList) getCategories().computeIfAbsent("pdbx_nmr_assigned_chem_shift_list",
                org.rcsb.cif.schema.mm.generated.PdbxNmrAssignedChemShiftList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftExperiment getPdbxNmrChemShiftExperiment() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftExperiment) getCategories().computeIfAbsent("pdbx_nmr_chem_shift_experiment",
                org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftExperiment::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftRef getPdbxNmrChemShiftRef() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftRef) getCategories().computeIfAbsent("pdbx_nmr_chem_shift_ref",
                org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftRef::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftReference getPdbxNmrChemShiftReference() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftReference) getCategories().computeIfAbsent("pdbx_nmr_chem_shift_reference",
                org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftSoftware getPdbxNmrChemShiftSoftware() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftSoftware) getCategories().computeIfAbsent("pdbx_nmr_chem_shift_software",
                org.rcsb.cif.schema.mm.generated.PdbxNmrChemShiftSoftware::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrConstraintFile getPdbxNmrConstraintFile() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrConstraintFile) getCategories().computeIfAbsent("pdbx_nmr_constraint_file",
                org.rcsb.cif.schema.mm.generated.PdbxNmrConstraintFile::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSoftwareTask getPdbxNmrSoftwareTask() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSoftwareTask) getCategories().computeIfAbsent("pdbx_nmr_software_task",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSoftwareTask::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralDim getPdbxNmrSpectralDim() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralDim) getCategories().computeIfAbsent("pdbx_nmr_spectral_dim",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralDim::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakList getPdbxNmrSpectralPeakList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakList) getCategories().computeIfAbsent("pdbx_nmr_spectral_peak_list",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakSoftware getPdbxNmrSpectralPeakSoftware() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakSoftware) getCategories().computeIfAbsent("pdbx_nmr_spectral_peak_software",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSpectralPeakSoftware::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrSystematicChemShiftOffset getPdbxNmrSystematicChemShiftOffset() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrSystematicChemShiftOffset) getCategories().computeIfAbsent("pdbx_nmr_systematic_chem_shift_offset",
                org.rcsb.cif.schema.mm.generated.PdbxNmrSystematicChemShiftOffset::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrUpload getPdbxNmrUpload() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrUpload) getCategories().computeIfAbsent("pdbx_nmr_upload",
                org.rcsb.cif.schema.mm.generated.PdbxNmrUpload::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditSupport getPdbxAuditSupport() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditSupport) getCategories().computeIfAbsent("pdbx_audit_support",
                org.rcsb.cif.schema.mm.generated.PdbxAuditSupport::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentStructConn getPdbxChemCompSubcomponentStructConn() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentStructConn) getCategories().computeIfAbsent("pdbx_chem_comp_subcomponent_struct_conn",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentStructConn::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentEntityList getPdbxChemCompSubcomponentEntityList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentEntityList) getCategories().computeIfAbsent("pdbx_chem_comp_subcomponent_entity_list",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompSubcomponentEntityList::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntitySrcNat getEntitySrcNat() {
        return (org.rcsb.cif.schema.mm.generated.EntitySrcNat) getCategories().computeIfAbsent("entity_src_nat",
                org.rcsb.cif.schema.mm.generated.EntitySrcNat::new);
    }

    public org.rcsb.cif.schema.mm.generated.EntitySrcGen getEntitySrcGen() {
        return (org.rcsb.cif.schema.mm.generated.EntitySrcGen) getCategories().computeIfAbsent("entity_src_gen",
                org.rcsb.cif.schema.mm.generated.EntitySrcGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcSyn getPdbxEntitySrcSyn() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcSyn) getCategories().computeIfAbsent("pdbx_entity_src_syn",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcSyn::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityPolyCompLinkList getPdbxEntityPolyCompLinkList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityPolyCompLinkList) getCategories().computeIfAbsent("pdbx_entity_poly_comp_link_list",
                org.rcsb.cif.schema.mm.generated.PdbxEntityPolyCompLinkList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxLinkedEntity getPdbxLinkedEntity() {
        return (org.rcsb.cif.schema.mm.generated.PdbxLinkedEntity) getCategories().computeIfAbsent("pdbx_linked_entity",
                org.rcsb.cif.schema.mm.generated.PdbxLinkedEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityInstanceList getPdbxLinkedEntityInstanceList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityInstanceList) getCategories().computeIfAbsent("pdbx_linked_entity_instance_list",
                org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityInstanceList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityList getPdbxLinkedEntityList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityList) getCategories().computeIfAbsent("pdbx_linked_entity_list",
                org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityLinkList getPdbxLinkedEntityLinkList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityLinkList) getCategories().computeIfAbsent("pdbx_linked_entity_link_list",
                org.rcsb.cif.schema.mm.generated.PdbxLinkedEntityLinkList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityDescriptor) getCategories().computeIfAbsent("pdbx_entity_descriptor",
                org.rcsb.cif.schema.mm.generated.PdbxEntityDescriptor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntity getPdbxReferenceLinkedEntity() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntity) getCategories().computeIfAbsent("pdbx_reference_linked_entity",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompList getPdbxReferenceLinkedEntityCompList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompList) getCategories().computeIfAbsent("pdbx_reference_linked_entity_comp_list",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompLink getPdbxReferenceLinkedEntityCompLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompLink) getCategories().computeIfAbsent("pdbx_reference_linked_entity_comp_link",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityCompLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityLink getPdbxReferenceLinkedEntityLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityLink) getCategories().computeIfAbsent("pdbx_reference_linked_entity_link",
                org.rcsb.cif.schema.mm.generated.PdbxReferenceLinkedEntityLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRelatedExpDataSet getPdbxRelatedExpDataSet() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRelatedExpDataSet) getCategories().computeIfAbsent("pdbx_related_exp_data_set",
                org.rcsb.cif.schema.mm.generated.PdbxRelatedExpDataSet::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatusHistory getPdbxDatabaseStatusHistory() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatusHistory) getCategories().computeIfAbsent("pdbx_database_status_history",
                org.rcsb.cif.schema.mm.generated.PdbxDatabaseStatusHistory::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmAssembly getEmAssembly() {
        return (org.rcsb.cif.schema.mm.generated.EmAssembly) getCategories().computeIfAbsent("em_assembly",
                org.rcsb.cif.schema.mm.generated.EmAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEntityAssembly getEmEntityAssembly() {
        return (org.rcsb.cif.schema.mm.generated.EmEntityAssembly) getCategories().computeIfAbsent("em_entity_assembly",
                org.rcsb.cif.schema.mm.generated.EmEntityAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmVirusEntity getEmVirusEntity() {
        return (org.rcsb.cif.schema.mm.generated.EmVirusEntity) getCategories().computeIfAbsent("em_virus_entity",
                org.rcsb.cif.schema.mm.generated.EmVirusEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSamplePreparation getEmSamplePreparation() {
        return (org.rcsb.cif.schema.mm.generated.EmSamplePreparation) getCategories().computeIfAbsent("em_sample_preparation",
                org.rcsb.cif.schema.mm.generated.EmSamplePreparation::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSampleSupport getEmSampleSupport() {
        return (org.rcsb.cif.schema.mm.generated.EmSampleSupport) getCategories().computeIfAbsent("em_sample_support",
                org.rcsb.cif.schema.mm.generated.EmSampleSupport::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmBuffer getEmBuffer() {
        return (org.rcsb.cif.schema.mm.generated.EmBuffer) getCategories().computeIfAbsent("em_buffer",
                org.rcsb.cif.schema.mm.generated.EmBuffer::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmVitrification getEmVitrification() {
        return (org.rcsb.cif.schema.mm.generated.EmVitrification) getCategories().computeIfAbsent("em_vitrification",
                org.rcsb.cif.schema.mm.generated.EmVitrification::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmImaging getEmImaging() {
        return (org.rcsb.cif.schema.mm.generated.EmImaging) getCategories().computeIfAbsent("em_imaging",
                org.rcsb.cif.schema.mm.generated.EmImaging::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDetector getEmDetector() {
        return (org.rcsb.cif.schema.mm.generated.EmDetector) getCategories().computeIfAbsent("em_detector",
                org.rcsb.cif.schema.mm.generated.EmDetector::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmImageScans getEmImageScans() {
        return (org.rcsb.cif.schema.mm.generated.EmImageScans) getCategories().computeIfAbsent("em_image_scans",
                org.rcsb.cif.schema.mm.generated.EmImageScans::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em2dProjectionSelection getEm2dProjectionSelection() {
        return (org.rcsb.cif.schema.mm.generated.Em2dProjectionSelection) getCategories().computeIfAbsent("em_2d_projection_selection",
                org.rcsb.cif.schema.mm.generated.Em2dProjectionSelection::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em3dReconstruction getEm3dReconstruction() {
        return (org.rcsb.cif.schema.mm.generated.Em3dReconstruction) getCategories().computeIfAbsent("em_3d_reconstruction",
                org.rcsb.cif.schema.mm.generated.Em3dReconstruction::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em3dFitting getEm3dFitting() {
        return (org.rcsb.cif.schema.mm.generated.Em3dFitting) getCategories().computeIfAbsent("em_3d_fitting",
                org.rcsb.cif.schema.mm.generated.Em3dFitting::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em3dFittingList getEm3dFittingList() {
        return (org.rcsb.cif.schema.mm.generated.Em3dFittingList) getCategories().computeIfAbsent("em_3d_fitting_list",
                org.rcsb.cif.schema.mm.generated.Em3dFittingList::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmHelicalEntity getEmHelicalEntity() {
        return (org.rcsb.cif.schema.mm.generated.EmHelicalEntity) getCategories().computeIfAbsent("em_helical_entity",
                org.rcsb.cif.schema.mm.generated.EmHelicalEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmExperiment getEmExperiment() {
        return (org.rcsb.cif.schema.mm.generated.EmExperiment) getCategories().computeIfAbsent("em_experiment",
                org.rcsb.cif.schema.mm.generated.EmExperiment::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSingleParticleEntity getEmSingleParticleEntity() {
        return (org.rcsb.cif.schema.mm.generated.EmSingleParticleEntity) getCategories().computeIfAbsent("em_single_particle_entity",
                org.rcsb.cif.schema.mm.generated.EmSingleParticleEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmAdmin getEmAdmin() {
        return (org.rcsb.cif.schema.mm.generated.EmAdmin) getCategories().computeIfAbsent("em_admin",
                org.rcsb.cif.schema.mm.generated.EmAdmin::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmAuthorList getEmAuthorList() {
        return (org.rcsb.cif.schema.mm.generated.EmAuthorList) getCategories().computeIfAbsent("em_author_list",
                org.rcsb.cif.schema.mm.generated.EmAuthorList::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDbReference getEmDbReference() {
        return (org.rcsb.cif.schema.mm.generated.EmDbReference) getCategories().computeIfAbsent("em_db_reference",
                org.rcsb.cif.schema.mm.generated.EmDbReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDbReferenceAuxiliary getEmDbReferenceAuxiliary() {
        return (org.rcsb.cif.schema.mm.generated.EmDbReferenceAuxiliary) getCategories().computeIfAbsent("em_db_reference_auxiliary",
                org.rcsb.cif.schema.mm.generated.EmDbReferenceAuxiliary::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDepui getEmDepui() {
        return (org.rcsb.cif.schema.mm.generated.EmDepui) getCategories().computeIfAbsent("em_depui",
                org.rcsb.cif.schema.mm.generated.EmDepui::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmObsolete getEmObsolete() {
        return (org.rcsb.cif.schema.mm.generated.EmObsolete) getCategories().computeIfAbsent("em_obsolete",
                org.rcsb.cif.schema.mm.generated.EmObsolete::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSupersede getEmSupersede() {
        return (org.rcsb.cif.schema.mm.generated.EmSupersede) getCategories().computeIfAbsent("em_supersede",
                org.rcsb.cif.schema.mm.generated.EmSupersede::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEntityAssemblyMolwt getEmEntityAssemblyMolwt() {
        return (org.rcsb.cif.schema.mm.generated.EmEntityAssemblyMolwt) getCategories().computeIfAbsent("em_entity_assembly_molwt",
                org.rcsb.cif.schema.mm.generated.EmEntityAssemblyMolwt::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEntityAssemblyNaturalsource getEmEntityAssemblyNaturalsource() {
        return (org.rcsb.cif.schema.mm.generated.EmEntityAssemblyNaturalsource) getCategories().computeIfAbsent("em_entity_assembly_naturalsource",
                org.rcsb.cif.schema.mm.generated.EmEntityAssemblyNaturalsource::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEntityAssemblyRecombinant getEmEntityAssemblyRecombinant() {
        return (org.rcsb.cif.schema.mm.generated.EmEntityAssemblyRecombinant) getCategories().computeIfAbsent("em_entity_assembly_recombinant",
                org.rcsb.cif.schema.mm.generated.EmEntityAssemblyRecombinant::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmVirusNaturalHost getEmVirusNaturalHost() {
        return (org.rcsb.cif.schema.mm.generated.EmVirusNaturalHost) getCategories().computeIfAbsent("em_virus_natural_host",
                org.rcsb.cif.schema.mm.generated.EmVirusNaturalHost::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmVirusShell getEmVirusShell() {
        return (org.rcsb.cif.schema.mm.generated.EmVirusShell) getCategories().computeIfAbsent("em_virus_shell",
                org.rcsb.cif.schema.mm.generated.EmVirusShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSpecimen getEmSpecimen() {
        return (org.rcsb.cif.schema.mm.generated.EmSpecimen) getCategories().computeIfAbsent("em_specimen",
                org.rcsb.cif.schema.mm.generated.EmSpecimen::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEmbedding getEmEmbedding() {
        return (org.rcsb.cif.schema.mm.generated.EmEmbedding) getCategories().computeIfAbsent("em_embedding",
                org.rcsb.cif.schema.mm.generated.EmEmbedding::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmFiducialMarkers getEmFiducialMarkers() {
        return (org.rcsb.cif.schema.mm.generated.EmFiducialMarkers) getCategories().computeIfAbsent("em_fiducial_markers",
                org.rcsb.cif.schema.mm.generated.EmFiducialMarkers::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmFocusedIonBeam getEmFocusedIonBeam() {
        return (org.rcsb.cif.schema.mm.generated.EmFocusedIonBeam) getCategories().computeIfAbsent("em_focused_ion_beam",
                org.rcsb.cif.schema.mm.generated.EmFocusedIonBeam::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmGridPretreatment getEmGridPretreatment() {
        return (org.rcsb.cif.schema.mm.generated.EmGridPretreatment) getCategories().computeIfAbsent("em_grid_pretreatment",
                org.rcsb.cif.schema.mm.generated.EmGridPretreatment::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmUltramicrotomy getEmUltramicrotomy() {
        return (org.rcsb.cif.schema.mm.generated.EmUltramicrotomy) getCategories().computeIfAbsent("em_ultramicrotomy",
                org.rcsb.cif.schema.mm.generated.EmUltramicrotomy::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmHighPressureFreezing getEmHighPressureFreezing() {
        return (org.rcsb.cif.schema.mm.generated.EmHighPressureFreezing) getCategories().computeIfAbsent("em_high_pressure_freezing",
                org.rcsb.cif.schema.mm.generated.EmHighPressureFreezing::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmShadowing getEmShadowing() {
        return (org.rcsb.cif.schema.mm.generated.EmShadowing) getCategories().computeIfAbsent("em_shadowing",
                org.rcsb.cif.schema.mm.generated.EmShadowing::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmTomographySpecimen getEmTomographySpecimen() {
        return (org.rcsb.cif.schema.mm.generated.EmTomographySpecimen) getCategories().computeIfAbsent("em_tomography_specimen",
                org.rcsb.cif.schema.mm.generated.EmTomographySpecimen::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmCrystalFormation getEmCrystalFormation() {
        return (org.rcsb.cif.schema.mm.generated.EmCrystalFormation) getCategories().computeIfAbsent("em_crystal_formation",
                org.rcsb.cif.schema.mm.generated.EmCrystalFormation::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmStaining getEmStaining() {
        return (org.rcsb.cif.schema.mm.generated.EmStaining) getCategories().computeIfAbsent("em_staining",
                org.rcsb.cif.schema.mm.generated.EmStaining::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSupportFilm getEmSupportFilm() {
        return (org.rcsb.cif.schema.mm.generated.EmSupportFilm) getCategories().computeIfAbsent("em_support_film",
                org.rcsb.cif.schema.mm.generated.EmSupportFilm::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmBufferComponent getEmBufferComponent() {
        return (org.rcsb.cif.schema.mm.generated.EmBufferComponent) getCategories().computeIfAbsent("em_buffer_component",
                org.rcsb.cif.schema.mm.generated.EmBufferComponent::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDiffraction getEmDiffraction() {
        return (org.rcsb.cif.schema.mm.generated.EmDiffraction) getCategories().computeIfAbsent("em_diffraction",
                org.rcsb.cif.schema.mm.generated.EmDiffraction::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDiffractionShell getEmDiffractionShell() {
        return (org.rcsb.cif.schema.mm.generated.EmDiffractionShell) getCategories().computeIfAbsent("em_diffraction_shell",
                org.rcsb.cif.schema.mm.generated.EmDiffractionShell::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDiffractionStats getEmDiffractionStats() {
        return (org.rcsb.cif.schema.mm.generated.EmDiffractionStats) getCategories().computeIfAbsent("em_diffraction_stats",
                org.rcsb.cif.schema.mm.generated.EmDiffractionStats::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmTomography getEmTomography() {
        return (org.rcsb.cif.schema.mm.generated.EmTomography) getCategories().computeIfAbsent("em_tomography",
                org.rcsb.cif.schema.mm.generated.EmTomography::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmImageRecording getEmImageRecording() {
        return (org.rcsb.cif.schema.mm.generated.EmImageRecording) getCategories().computeIfAbsent("em_image_recording",
                org.rcsb.cif.schema.mm.generated.EmImageRecording::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmImagingOptics getEmImagingOptics() {
        return (org.rcsb.cif.schema.mm.generated.EmImagingOptics) getCategories().computeIfAbsent("em_imaging_optics",
                org.rcsb.cif.schema.mm.generated.EmImagingOptics::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmFinalClassification getEmFinalClassification() {
        return (org.rcsb.cif.schema.mm.generated.EmFinalClassification) getCategories().computeIfAbsent("em_final_classification",
                org.rcsb.cif.schema.mm.generated.EmFinalClassification::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmStartModel getEmStartModel() {
        return (org.rcsb.cif.schema.mm.generated.EmStartModel) getCategories().computeIfAbsent("em_start_model",
                org.rcsb.cif.schema.mm.generated.EmStartModel::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmSoftware getEmSoftware() {
        return (org.rcsb.cif.schema.mm.generated.EmSoftware) getCategories().computeIfAbsent("em_software",
                org.rcsb.cif.schema.mm.generated.EmSoftware::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmEulerAngleAssignment getEmEulerAngleAssignment() {
        return (org.rcsb.cif.schema.mm.generated.EmEulerAngleAssignment) getCategories().computeIfAbsent("em_euler_angle_assignment",
                org.rcsb.cif.schema.mm.generated.EmEulerAngleAssignment::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmCtfCorrection getEmCtfCorrection() {
        return (org.rcsb.cif.schema.mm.generated.EmCtfCorrection) getCategories().computeIfAbsent("em_ctf_correction",
                org.rcsb.cif.schema.mm.generated.EmCtfCorrection::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmVolumeSelection getEmVolumeSelection() {
        return (org.rcsb.cif.schema.mm.generated.EmVolumeSelection) getCategories().computeIfAbsent("em_volume_selection",
                org.rcsb.cif.schema.mm.generated.EmVolumeSelection::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em3dCrystalEntity getEm3dCrystalEntity() {
        return (org.rcsb.cif.schema.mm.generated.Em3dCrystalEntity) getCategories().computeIfAbsent("em_3d_crystal_entity",
                org.rcsb.cif.schema.mm.generated.Em3dCrystalEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.Em2dCrystalEntity getEm2dCrystalEntity() {
        return (org.rcsb.cif.schema.mm.generated.Em2dCrystalEntity) getCategories().computeIfAbsent("em_2d_crystal_entity",
                org.rcsb.cif.schema.mm.generated.Em2dCrystalEntity::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmImageProcessing getEmImageProcessing() {
        return (org.rcsb.cif.schema.mm.generated.EmImageProcessing) getCategories().computeIfAbsent("em_image_processing",
                org.rcsb.cif.schema.mm.generated.EmImageProcessing::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmParticleSelection getEmParticleSelection() {
        return (org.rcsb.cif.schema.mm.generated.EmParticleSelection) getCategories().computeIfAbsent("em_particle_selection",
                org.rcsb.cif.schema.mm.generated.EmParticleSelection::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmMap getEmMap() {
        return (org.rcsb.cif.schema.mm.generated.EmMap) getCategories().computeIfAbsent("em_map",
                org.rcsb.cif.schema.mm.generated.EmMap::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmFscCurve getEmFscCurve() {
        return (org.rcsb.cif.schema.mm.generated.EmFscCurve) getCategories().computeIfAbsent("em_fsc_curve",
                org.rcsb.cif.schema.mm.generated.EmFscCurve::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmInterpretFigure getEmInterpretFigure() {
        return (org.rcsb.cif.schema.mm.generated.EmInterpretFigure) getCategories().computeIfAbsent("em_interpret_figure",
                org.rcsb.cif.schema.mm.generated.EmInterpretFigure::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmLayerLines getEmLayerLines() {
        return (org.rcsb.cif.schema.mm.generated.EmLayerLines) getCategories().computeIfAbsent("em_layer_lines",
                org.rcsb.cif.schema.mm.generated.EmLayerLines::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmStructureFactors getEmStructureFactors() {
        return (org.rcsb.cif.schema.mm.generated.EmStructureFactors) getCategories().computeIfAbsent("em_structure_factors",
                org.rcsb.cif.schema.mm.generated.EmStructureFactors::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmDepositorInfo getEmDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmDepositorInfo) getCategories().computeIfAbsent("em_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmMapDepositorInfo getEmMapDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmMapDepositorInfo) getCategories().computeIfAbsent("em_map_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmMapDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmMaskDepositorInfo getEmMaskDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmMaskDepositorInfo) getCategories().computeIfAbsent("em_mask_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmMaskDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmFigureDepositorInfo getEmFigureDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmFigureDepositorInfo) getCategories().computeIfAbsent("em_figure_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmFigureDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmLayerLinesDepositorInfo getEmLayerLinesDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmLayerLinesDepositorInfo) getCategories().computeIfAbsent("em_layer_lines_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmLayerLinesDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.EmStructureFactorsDepositorInfo getEmStructureFactorsDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.EmStructureFactorsDepositorInfo) getCategories().computeIfAbsent("em_structure_factors_depositor_info",
                org.rcsb.cif.schema.mm.generated.EmStructureFactorsDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSeqMapDepositorInfo getPdbxSeqMapDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSeqMapDepositorInfo) getCategories().computeIfAbsent("pdbx_seq_map_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxSeqMapDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompDepositorInfo getPdbxChemCompDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompDepositorInfo) getCategories().computeIfAbsent("pdbx_chem_comp_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDepositorInfo getPdbxStructRefSeqDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_ref_seq_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDifDepositorInfo getPdbxStructRefSeqDifDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDifDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_ref_seq_dif_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructRefSeqDifDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyPropDepositorInfo getPdbxStructAssemblyPropDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyPropDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_assembly_prop_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyPropDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyDepositorInfo getPdbxStructAssemblyDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_assembly_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGenDepositorInfo getPdbxStructAssemblyGenDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGenDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_assembly_gen_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyGenDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructOperListDepositorInfo getPdbxStructOperListDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructOperListDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_oper_list_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructOperListDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPointSymmetryDepositorInfo getPdbxPointSymmetryDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPointSymmetryDepositorInfo) getCategories().computeIfAbsent("pdbx_point_symmetry_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxPointSymmetryDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetryDepositorInfo getPdbxHelicalSymmetryDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetryDepositorInfo) getCategories().computeIfAbsent("pdbx_helical_symmetry_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxHelicalSymmetryDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo getPdbxStructAssemblyAuthEvidenceDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo) getCategories().computeIfAbsent("pdbx_struct_assembly_auth_evidence_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidenceDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSolventAtomSiteMapping getPdbxSolventAtomSiteMapping() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSolventAtomSiteMapping) getCategories().computeIfAbsent("pdbx_solvent_atom_site_mapping",
                org.rcsb.cif.schema.mm.generated.PdbxSolventAtomSiteMapping::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeaturesDepositorInfo getPdbxMoleculeFeaturesDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeaturesDepositorInfo) getCategories().computeIfAbsent("pdbx_molecule_features_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxMoleculeFeaturesDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompInstanceDepositorInfo getPdbxChemCompInstanceDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompInstanceDepositorInfo) getCategories().computeIfAbsent("pdbx_chem_comp_instance_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompInstanceDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiStatusFlags getPdbxDepuiStatusFlags() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiStatusFlags) getCategories().computeIfAbsent("pdbx_depui_status_flags",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiStatusFlags::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiUpload getPdbxDepuiUpload() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiUpload) getCategories().computeIfAbsent("pdbx_depui_upload",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiUpload::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiValidationStatusFlags getPdbxDepuiValidationStatusFlags() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiValidationStatusFlags) getCategories().computeIfAbsent("pdbx_depui_validation_status_flags",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiValidationStatusFlags::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompUploadDepositorInfo getPdbxChemCompUploadDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompUploadDepositorInfo) getCategories().computeIfAbsent("pdbx_chem_comp_upload_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompUploadDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityStatusFlags getPdbxDepuiEntityStatusFlags() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityStatusFlags) getCategories().computeIfAbsent("pdbx_depui_entity_status_flags",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityStatusFlags::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityFeatures getPdbxDepuiEntityFeatures() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityFeatures) getCategories().computeIfAbsent("pdbx_depui_entity_features",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiEntityFeatures::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageInfo getPdbxDepositionMessageInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageInfo) getCategories().computeIfAbsent("pdbx_deposition_message_info",
                org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageFileReference getPdbxDepositionMessageFileReference() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageFileReference) getCategories().computeIfAbsent("pdbx_deposition_message_file_reference",
                org.rcsb.cif.schema.mm.generated.PdbxDepositionMessageFileReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepuiEntryDetails getPdbxDepuiEntryDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepuiEntryDetails) getCategories().computeIfAbsent("pdbx_depui_entry_details",
                org.rcsb.cif.schema.mm.generated.PdbxDepuiEntryDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDataProcessingStatus getPdbxDataProcessingStatus() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDataProcessingStatus) getCategories().computeIfAbsent("pdbx_data_processing_status",
                org.rcsb.cif.schema.mm.generated.PdbxDataProcessingStatus::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityInstanceFeature getPdbxEntityInstanceFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityInstanceFeature) getCategories().computeIfAbsent("pdbx_entity_instance_feature",
                org.rcsb.cif.schema.mm.generated.PdbxEntityInstanceFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenDepositorInfo getPdbxEntitySrcGenDepositorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenDepositorInfo) getCategories().computeIfAbsent("pdbx_entity_src_gen_depositor_info",
                org.rcsb.cif.schema.mm.generated.PdbxEntitySrcGenDepositorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModel getPdbxChemCompModel() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModel) getCategories().computeIfAbsent("pdbx_chem_comp_model",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModel::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAtom getPdbxChemCompModelAtom() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAtom) getCategories().computeIfAbsent("pdbx_chem_comp_model_atom",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelBond getPdbxChemCompModelBond() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelBond) getCategories().computeIfAbsent("pdbx_chem_comp_model_bond",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelFeature getPdbxChemCompModelFeature() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelFeature) getCategories().computeIfAbsent("pdbx_chem_comp_model_feature",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelDescriptor getPdbxChemCompModelDescriptor() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelDescriptor) getCategories().computeIfAbsent("pdbx_chem_comp_model_descriptor",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelDescriptor::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAudit getPdbxChemCompModelAudit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAudit) getCategories().computeIfAbsent("pdbx_chem_comp_model_audit",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelAudit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompModelReference getPdbxChemCompModelReference() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompModelReference) getCategories().computeIfAbsent("pdbx_chem_comp_model_reference",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompModelReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxViewCategoryGroup getPdbxViewCategoryGroup() {
        return (org.rcsb.cif.schema.mm.generated.PdbxViewCategoryGroup) getCategories().computeIfAbsent("pdbx_view_category_group",
                org.rcsb.cif.schema.mm.generated.PdbxViewCategoryGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxViewCategory getPdbxViewCategory() {
        return (org.rcsb.cif.schema.mm.generated.PdbxViewCategory) getCategories().computeIfAbsent("pdbx_view_category",
                org.rcsb.cif.schema.mm.generated.PdbxViewCategory::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxViewItem getPdbxViewItem() {
        return (org.rcsb.cif.schema.mm.generated.PdbxViewItem) getCategories().computeIfAbsent("pdbx_view_item",
                org.rcsb.cif.schema.mm.generated.PdbxViewItem::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxCoord getPdbxCoord() {
        return (org.rcsb.cif.schema.mm.generated.PdbxCoord) getCategories().computeIfAbsent("pdbx_coord",
                org.rcsb.cif.schema.mm.generated.PdbxCoord::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConnect getPdbxConnect() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConnect) getCategories().computeIfAbsent("pdbx_connect",
                org.rcsb.cif.schema.mm.generated.PdbxConnect::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConnectType getPdbxConnectType() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConnectType) getCategories().computeIfAbsent("pdbx_connect_type",
                org.rcsb.cif.schema.mm.generated.PdbxConnectType::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConnectModification getPdbxConnectModification() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConnectModification) getCategories().computeIfAbsent("pdbx_connect_modification",
                org.rcsb.cif.schema.mm.generated.PdbxConnectModification::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxConnectAtom getPdbxConnectAtom() {
        return (org.rcsb.cif.schema.mm.generated.PdbxConnectAtom) getCategories().computeIfAbsent("pdbx_connect_atom",
                org.rcsb.cif.schema.mm.generated.PdbxConnectAtom::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBMaster getPdbxDatabasePDBMaster() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBMaster) getCategories().computeIfAbsent("pdbx_database_PDB_master",
                org.rcsb.cif.schema.mm.generated.PdbxDatabasePDBMaster::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDatabasePdbOmit getPdbxDatabasePdbOmit() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDatabasePdbOmit) getCategories().computeIfAbsent("pdbx_database_pdb_omit",
                org.rcsb.cif.schema.mm.generated.PdbxDatabasePdbOmit::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDbref getPdbxDbref() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDbref) getCategories().computeIfAbsent("pdbx_dbref",
                org.rcsb.cif.schema.mm.generated.PdbxDbref::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDrugInfo getPdbxDrugInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDrugInfo) getCategories().computeIfAbsent("pdbx_drug_info",
                org.rcsb.cif.schema.mm.generated.PdbxDrugInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxInhibitorInfo getPdbxInhibitorInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxInhibitorInfo) getCategories().computeIfAbsent("pdbx_inhibitor_info",
                org.rcsb.cif.schema.mm.generated.PdbxInhibitorInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxIonInfo getPdbxIonInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxIonInfo) getCategories().computeIfAbsent("pdbx_ion_info",
                org.rcsb.cif.schema.mm.generated.PdbxIonInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxHybrid getPdbxHybrid() {
        return (org.rcsb.cif.schema.mm.generated.PdbxHybrid) getCategories().computeIfAbsent("pdbx_hybrid",
                org.rcsb.cif.schema.mm.generated.PdbxHybrid::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNaStrandInfo getPdbxNaStrandInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNaStrandInfo) getCategories().computeIfAbsent("pdbx_na_strand_info",
                org.rcsb.cif.schema.mm.generated.PdbxNaStrandInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNonstandardList getPdbxNonstandardList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNonstandardList) getCategories().computeIfAbsent("pdbx_nonstandard_list",
                org.rcsb.cif.schema.mm.generated.PdbxNonstandardList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPdbCompnd getPdbxPdbCompnd() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPdbCompnd) getCategories().computeIfAbsent("pdbx_pdb_compnd",
                org.rcsb.cif.schema.mm.generated.PdbxPdbCompnd::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPdbSource getPdbxPdbSource() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPdbSource) getCategories().computeIfAbsent("pdbx_pdb_source",
                org.rcsb.cif.schema.mm.generated.PdbxPdbSource::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxProteinInfo getPdbxProteinInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxProteinInfo) getCategories().computeIfAbsent("pdbx_protein_info",
                org.rcsb.cif.schema.mm.generated.PdbxProteinInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSolventInfo getPdbxSolventInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSolventInfo) getCategories().computeIfAbsent("pdbx_solvent_info",
                org.rcsb.cif.schema.mm.generated.PdbxSolventInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSource getPdbxSource() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSource) getCategories().computeIfAbsent("pdbx_source",
                org.rcsb.cif.schema.mm.generated.PdbxSource::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructBiolFunc getPdbxStructBiolFunc() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructBiolFunc) getCategories().computeIfAbsent("pdbx_struct_biol_func",
                org.rcsb.cif.schema.mm.generated.PdbxStructBiolFunc::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructPackGen getPdbxStructPackGen() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructPackGen) getCategories().computeIfAbsent("pdbx_struct_pack_gen",
                org.rcsb.cif.schema.mm.generated.PdbxStructPackGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxTrnaInfo getPdbxTrnaInfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxTrnaInfo) getCategories().computeIfAbsent("pdbx_trna_info",
                org.rcsb.cif.schema.mm.generated.PdbxTrnaInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxUnpair getPdbxUnpair() {
        return (org.rcsb.cif.schema.mm.generated.PdbxUnpair) getCategories().computeIfAbsent("pdbx_unpair",
                org.rcsb.cif.schema.mm.generated.PdbxUnpair::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRefineLsRestrNcs getPdbxRefineLsRestrNcs() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRefineLsRestrNcs) getCategories().computeIfAbsent("pdbx_refine_ls_restr_ncs",
                org.rcsb.cif.schema.mm.generated.PdbxRefineLsRestrNcs::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructNcsVirusGen getPdbxStructNcsVirusGen() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructNcsVirusGen) getCategories().computeIfAbsent("pdbx_struct_ncs_virus_gen",
                org.rcsb.cif.schema.mm.generated.PdbxStructNcsVirusGen::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSequenceAnnotation getPdbxSequenceAnnotation() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSequenceAnnotation) getCategories().computeIfAbsent("pdbx_sequence_annotation",
                org.rcsb.cif.schema.mm.generated.PdbxSequenceAnnotation::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPostProcessDetails getPdbxPostProcessDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPostProcessDetails) getCategories().computeIfAbsent("pdbx_post_process_details",
                org.rcsb.cif.schema.mm.generated.PdbxPostProcessDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxPostProcessStatus getPdbxPostProcessStatus() {
        return (org.rcsb.cif.schema.mm.generated.PdbxPostProcessStatus) getCategories().computeIfAbsent("pdbx_post_process_status",
                org.rcsb.cif.schema.mm.generated.PdbxPostProcessStatus::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructLink getPdbxStructLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructLink) getCategories().computeIfAbsent("pdbx_struct_link",
                org.rcsb.cif.schema.mm.generated.PdbxStructLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMissingResidueList getPdbxMissingResidueList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMissingResidueList) getCategories().computeIfAbsent("pdbx_missing_residue_list",
                org.rcsb.cif.schema.mm.generated.PdbxMissingResidueList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDataProcessingCell getPdbxDataProcessingCell() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDataProcessingCell) getCategories().computeIfAbsent("pdbx_data_processing_cell",
                org.rcsb.cif.schema.mm.generated.PdbxDataProcessingCell::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDataProcessingReflns getPdbxDataProcessingReflns() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDataProcessingReflns) getCategories().computeIfAbsent("pdbx_data_processing_reflns",
                org.rcsb.cif.schema.mm.generated.PdbxDataProcessingReflns::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDataProcessingDetector getPdbxDataProcessingDetector() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDataProcessingDetector) getCategories().computeIfAbsent("pdbx_data_processing_detector",
                org.rcsb.cif.schema.mm.generated.PdbxDataProcessingDetector::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompNonstandard getPdbxChemCompNonstandard() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompNonstandard) getCategories().computeIfAbsent("pdbx_chem_comp_nonstandard",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompNonstandard::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityPolyProteinClass getPdbxEntityPolyProteinClass() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityPolyProteinClass) getCategories().computeIfAbsent("pdbx_entity_poly_protein_class",
                org.rcsb.cif.schema.mm.generated.PdbxEntityPolyProteinClass::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomyTree getPdbxEntityNameTaxonomyTree() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomyTree) getCategories().computeIfAbsent("pdbx_entity_name_taxonomy_tree",
                org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomyTree::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomy getPdbxEntityNameTaxonomy() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomy) getCategories().computeIfAbsent("pdbx_entity_name_taxonomy",
                org.rcsb.cif.schema.mm.generated.PdbxEntityNameTaxonomy::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityNameInstance getPdbxEntityNameInstance() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityNameInstance) getCategories().computeIfAbsent("pdbx_entity_name_instance",
                org.rcsb.cif.schema.mm.generated.PdbxEntityNameInstance::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxTableinfo getPdbxTableinfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxTableinfo) getCategories().computeIfAbsent("pdbx_tableinfo",
                org.rcsb.cif.schema.mm.generated.PdbxTableinfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxColumninfo getPdbxColumninfo() {
        return (org.rcsb.cif.schema.mm.generated.PdbxColumninfo) getCategories().computeIfAbsent("pdbx_columninfo",
                org.rcsb.cif.schema.mm.generated.PdbxColumninfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValAngle getPdbxValAngle() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValAngle) getCategories().computeIfAbsent("pdbx_val_angle",
                org.rcsb.cif.schema.mm.generated.PdbxValAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValBond getPdbxValBond() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValBond) getCategories().computeIfAbsent("pdbx_val_bond",
                org.rcsb.cif.schema.mm.generated.PdbxValBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValContact getPdbxValContact() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValContact) getCategories().computeIfAbsent("pdbx_val_contact",
                org.rcsb.cif.schema.mm.generated.PdbxValContact::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValSymContact getPdbxValSymContact() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValSymContact) getCategories().computeIfAbsent("pdbx_val_sym_contact",
                org.rcsb.cif.schema.mm.generated.PdbxValSymContact::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRmchOutlier getPdbxRmchOutlier() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRmchOutlier) getCategories().computeIfAbsent("pdbx_rmch_outlier",
                org.rcsb.cif.schema.mm.generated.PdbxRmchOutlier::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMissingAtomPoly getPdbxMissingAtomPoly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMissingAtomPoly) getCategories().computeIfAbsent("pdbx_missing_atom_poly",
                org.rcsb.cif.schema.mm.generated.PdbxMissingAtomPoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxMissingAtomNonpoly getPdbxMissingAtomNonpoly() {
        return (org.rcsb.cif.schema.mm.generated.PdbxMissingAtomNonpoly) getCategories().computeIfAbsent("pdbx_missing_atom_nonpoly",
                org.rcsb.cif.schema.mm.generated.PdbxMissingAtomNonpoly::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxValChiral getPdbxValChiral() {
        return (org.rcsb.cif.schema.mm.generated.PdbxValChiral) getCategories().computeIfAbsent("pdbx_val_chiral",
                org.rcsb.cif.schema.mm.generated.PdbxValChiral::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAtlas getPdbxAtlas() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAtlas) getCategories().computeIfAbsent("pdbx_atlas",
                org.rcsb.cif.schema.mm.generated.PdbxAtlas::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSummaryFlags getPdbxSummaryFlags() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSummaryFlags) getCategories().computeIfAbsent("pdbx_summary_flags",
                org.rcsb.cif.schema.mm.generated.PdbxSummaryFlags::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityFuncBindMode getPdbxEntityFuncBindMode() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityFuncBindMode) getCategories().computeIfAbsent("pdbx_entity_func_bind_mode",
                org.rcsb.cif.schema.mm.generated.PdbxEntityFuncBindMode::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityFuncEnzyme getPdbxEntityFuncEnzyme() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityFuncEnzyme) getCategories().computeIfAbsent("pdbx_entity_func_enzyme",
                org.rcsb.cif.schema.mm.generated.PdbxEntityFuncEnzyme::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityFuncRegulatory getPdbxEntityFuncRegulatory() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityFuncRegulatory) getCategories().computeIfAbsent("pdbx_entity_func_regulatory",
                org.rcsb.cif.schema.mm.generated.PdbxEntityFuncRegulatory::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityFuncStructural getPdbxEntityFuncStructural() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityFuncStructural) getCategories().computeIfAbsent("pdbx_entity_func_structural",
                org.rcsb.cif.schema.mm.generated.PdbxEntityFuncStructural::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityFuncOther getPdbxEntityFuncOther() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityFuncOther) getCategories().computeIfAbsent("pdbx_entity_func_other",
                org.rcsb.cif.schema.mm.generated.PdbxEntityFuncOther::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityPolyDomain getPdbxEntityPolyDomain() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityPolyDomain) getCategories().computeIfAbsent("pdbx_entity_poly_domain",
                org.rcsb.cif.schema.mm.generated.PdbxEntityPolyDomain::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNaStructKeywds getPdbxNaStructKeywds() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNaStructKeywds) getCategories().computeIfAbsent("pdbx_na_struct_keywds",
                org.rcsb.cif.schema.mm.generated.PdbxNaStructKeywds::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaType getPdbxEntityPolyNaType() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaType) getCategories().computeIfAbsent("pdbx_entity_poly_na_type",
                org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaType::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaNonstandard getPdbxEntityPolyNaNonstandard() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaNonstandard) getCategories().computeIfAbsent("pdbx_entity_poly_na_nonstandard",
                org.rcsb.cif.schema.mm.generated.PdbxEntityPolyNaNonstandard::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxVirtualAngle getPdbxVirtualAngle() {
        return (org.rcsb.cif.schema.mm.generated.PdbxVirtualAngle) getCategories().computeIfAbsent("pdbx_virtual_angle",
                org.rcsb.cif.schema.mm.generated.PdbxVirtualAngle::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxVirtualBond getPdbxVirtualBond() {
        return (org.rcsb.cif.schema.mm.generated.PdbxVirtualBond) getCategories().computeIfAbsent("pdbx_virtual_bond",
                org.rcsb.cif.schema.mm.generated.PdbxVirtualBond::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxVirtualTorsion getPdbxVirtualTorsion() {
        return (org.rcsb.cif.schema.mm.generated.PdbxVirtualTorsion) getCategories().computeIfAbsent("pdbx_virtual_torsion",
                org.rcsb.cif.schema.mm.generated.PdbxVirtualTorsion::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSequencePattern getPdbxSequencePattern() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSequencePattern) getCategories().computeIfAbsent("pdbx_sequence_pattern",
                org.rcsb.cif.schema.mm.generated.PdbxSequencePattern::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStereochemistry getPdbxStereochemistry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStereochemistry) getCategories().computeIfAbsent("pdbx_stereochemistry",
                org.rcsb.cif.schema.mm.generated.PdbxStereochemistry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovalent getPdbxRmsDevsCovalent() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovalent) getCategories().computeIfAbsent("pdbx_rms_devs_covalent",
                org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovalent::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovByMonomer getPdbxRmsDevsCovByMonomer() {
        return (org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovByMonomer) getCategories().computeIfAbsent("pdbx_rms_devs_cov_by_monomer",
                org.rcsb.cif.schema.mm.generated.PdbxRmsDevsCovByMonomer::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSugarPhosphateGeometry getPdbxSugarPhosphateGeometry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSugarPhosphateGeometry) getCategories().computeIfAbsent("pdbx_sugar_phosphate_geometry",
                org.rcsb.cif.schema.mm.generated.PdbxSugarPhosphateGeometry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxNmrComputing getPdbxNmrComputing() {
        return (org.rcsb.cif.schema.mm.generated.PdbxNmrComputing) getCategories().computeIfAbsent("pdbx_nmr_computing",
                org.rcsb.cif.schema.mm.generated.PdbxNmrComputing::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditConformExtension getPdbxAuditConformExtension() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditConformExtension) getCategories().computeIfAbsent("pdbx_audit_conform_extension",
                org.rcsb.cif.schema.mm.generated.PdbxAuditConformExtension::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccMapman getPdbxDccMapman() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccMapman) getCategories().computeIfAbsent("pdbx_dcc_mapman",
                org.rcsb.cif.schema.mm.generated.PdbxDccMapman::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapman getPdbxDccRsccMapman() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapman) getCategories().computeIfAbsent("pdbx_dcc_rscc_mapman",
                org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapman::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapmanOverall getPdbxDccRsccMapmanOverall() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapmanOverall) getCategories().computeIfAbsent("pdbx_dcc_rscc_mapman_overall",
                org.rcsb.cif.schema.mm.generated.PdbxDccRsccMapmanOverall::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccDensity getPdbxDccDensity() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccDensity) getCategories().computeIfAbsent("pdbx_dcc_density",
                org.rcsb.cif.schema.mm.generated.PdbxDccDensity::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccGeometry getPdbxDccGeometry() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccGeometry) getCategories().computeIfAbsent("pdbx_dcc_geometry",
                org.rcsb.cif.schema.mm.generated.PdbxDccGeometry::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccDensityCorr getPdbxDccDensityCorr() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccDensityCorr) getCategories().computeIfAbsent("pdbx_dcc_density_corr",
                org.rcsb.cif.schema.mm.generated.PdbxDccDensityCorr::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDccMap getPdbxDccMap() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDccMap) getCategories().computeIfAbsent("pdbx_dcc_map",
                org.rcsb.cif.schema.mm.generated.PdbxDccMap::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepositGroup getPdbxDepositGroup() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepositGroup) getCategories().computeIfAbsent("pdbx_deposit_group",
                org.rcsb.cif.schema.mm.generated.PdbxDepositGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxDepositGroupIndex getPdbxDepositGroupIndex() {
        return (org.rcsb.cif.schema.mm.generated.PdbxDepositGroupIndex) getCategories().computeIfAbsent("pdbx_deposit_group_index",
                org.rcsb.cif.schema.mm.generated.PdbxDepositGroupIndex::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidence getPdbxStructAssemblyAuthEvidence() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidence) getCategories().computeIfAbsent("pdbx_struct_assembly_auth_evidence",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthEvidence::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthClassification getPdbxStructAssemblyAuthClassification() {
        return (org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthClassification) getCategories().computeIfAbsent("pdbx_struct_assembly_auth_classification",
                org.rcsb.cif.schema.mm.generated.PdbxStructAssemblyAuthClassification::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxCrystalAlignment getPdbxCrystalAlignment() {
        return (org.rcsb.cif.schema.mm.generated.PdbxCrystalAlignment) getCategories().computeIfAbsent("pdbx_crystal_alignment",
                org.rcsb.cif.schema.mm.generated.PdbxCrystalAlignment::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionHistory getPdbxAuditRevisionHistory() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionHistory) getCategories().computeIfAbsent("pdbx_audit_revision_history",
                org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionHistory::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionGroup getPdbxAuditRevisionGroup() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionGroup) getCategories().computeIfAbsent("pdbx_audit_revision_group",
                org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionCategory getPdbxAuditRevisionCategory() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionCategory) getCategories().computeIfAbsent("pdbx_audit_revision_category",
                org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionCategory::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionDetails getPdbxAuditRevisionDetails() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionDetails) getCategories().computeIfAbsent("pdbx_audit_revision_details",
                org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionItem getPdbxAuditRevisionItem() {
        return (org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionItem) getCategories().computeIfAbsent("pdbx_audit_revision_item",
                org.rcsb.cif.schema.mm.generated.PdbxAuditRevisionItem::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSupportingExpDataSet getPdbxSupportingExpDataSet() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSupportingExpDataSet) getCategories().computeIfAbsent("pdbx_supporting_exp_data_set",
                org.rcsb.cif.schema.mm.generated.PdbxSupportingExpDataSet::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyMeasurement getPdbxSerialCrystallographyMeasurement() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyMeasurement) getCategories().computeIfAbsent("pdbx_serial_crystallography_measurement",
                org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyMeasurement::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDelivery getPdbxSerialCrystallographySampleDelivery() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDelivery) getCategories().computeIfAbsent("pdbx_serial_crystallography_sample_delivery",
                org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDelivery::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryInjection getPdbxSerialCrystallographySampleDeliveryInjection() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryInjection) getCategories().computeIfAbsent("pdbx_serial_crystallography_sample_delivery_injection",
                org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryInjection::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget getPdbxSerialCrystallographySampleDeliveryFixedTarget() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget) getCategories().computeIfAbsent("pdbx_serial_crystallography_sample_delivery_fixed_target",
                org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographySampleDeliveryFixedTarget::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyDataReduction getPdbxSerialCrystallographyDataReduction() {
        return (org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyDataReduction) getCategories().computeIfAbsent("pdbx_serial_crystallography_data_reduction",
                org.rcsb.cif.schema.mm.generated.PdbxSerialCrystallographyDataReduction::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompSynonyms getPdbxChemCompSynonyms() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompSynonyms) getCategories().computeIfAbsent("pdbx_chem_comp_synonyms",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompSynonyms::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompRelated getPdbxChemCompRelated() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompRelated) getCategories().computeIfAbsent("pdbx_chem_comp_related",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompRelated::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomRelated getPdbxChemCompAtomRelated() {
        return (org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomRelated) getCategories().computeIfAbsent("pdbx_chem_comp_atom_related",
                org.rcsb.cif.schema.mm.generated.PdbxChemCompAtomRelated::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityBranchList getPdbxEntityBranchList() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityBranchList) getCategories().computeIfAbsent("pdbx_entity_branch_list",
                org.rcsb.cif.schema.mm.generated.PdbxEntityBranchList::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityBranchLink getPdbxEntityBranchLink() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityBranchLink) getCategories().computeIfAbsent("pdbx_entity_branch_link",
                org.rcsb.cif.schema.mm.generated.PdbxEntityBranchLink::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxEntityBranch getPdbxEntityBranch() {
        return (org.rcsb.cif.schema.mm.generated.PdbxEntityBranch) getCategories().computeIfAbsent("pdbx_entity_branch",
                org.rcsb.cif.schema.mm.generated.PdbxEntityBranch::new);
    }

    public org.rcsb.cif.schema.mm.generated.PdbxBranchScheme getPdbxBranchScheme() {
        return (org.rcsb.cif.schema.mm.generated.PdbxBranchScheme) getCategories().computeIfAbsent("pdbx_branch_scheme",
                org.rcsb.cif.schema.mm.generated.PdbxBranchScheme::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStartingModelDetails getIhmStartingModelDetails() {
        return (org.rcsb.cif.schema.mm.generated.IhmStartingModelDetails) getCategories().computeIfAbsent("ihm_starting_model_details",
                org.rcsb.cif.schema.mm.generated.IhmStartingModelDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStartingComparativeModels getIhmStartingComparativeModels() {
        return (org.rcsb.cif.schema.mm.generated.IhmStartingComparativeModels) getCategories().computeIfAbsent("ihm_starting_comparative_models",
                org.rcsb.cif.schema.mm.generated.IhmStartingComparativeModels::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStartingComputationalModels getIhmStartingComputationalModels() {
        return (org.rcsb.cif.schema.mm.generated.IhmStartingComputationalModels) getCategories().computeIfAbsent("ihm_starting_computational_models",
                org.rcsb.cif.schema.mm.generated.IhmStartingComputationalModels::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStartingModelSeqDif getIhmStartingModelSeqDif() {
        return (org.rcsb.cif.schema.mm.generated.IhmStartingModelSeqDif) getCategories().computeIfAbsent("ihm_starting_model_seq_dif",
                org.rcsb.cif.schema.mm.generated.IhmStartingModelSeqDif::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmModelRepresentation getIhmModelRepresentation() {
        return (org.rcsb.cif.schema.mm.generated.IhmModelRepresentation) getCategories().computeIfAbsent("ihm_model_representation",
                org.rcsb.cif.schema.mm.generated.IhmModelRepresentation::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStructAssembly getIhmStructAssembly() {
        return (org.rcsb.cif.schema.mm.generated.IhmStructAssembly) getCategories().computeIfAbsent("ihm_struct_assembly",
                org.rcsb.cif.schema.mm.generated.IhmStructAssembly::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStructAssemblyDetails getIhmStructAssemblyDetails() {
        return (org.rcsb.cif.schema.mm.generated.IhmStructAssemblyDetails) getCategories().computeIfAbsent("ihm_struct_assembly_details",
                org.rcsb.cif.schema.mm.generated.IhmStructAssemblyDetails::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClassList getIhmStructAssemblyClassList() {
        return (org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClassList) getCategories().computeIfAbsent("ihm_struct_assembly_class_list",
                org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClassList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClass getIhmStructAssemblyClass() {
        return (org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClass) getCategories().computeIfAbsent("ihm_struct_assembly_class",
                org.rcsb.cif.schema.mm.generated.IhmStructAssemblyClass::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmModelingProtocol getIhmModelingProtocol() {
        return (org.rcsb.cif.schema.mm.generated.IhmModelingProtocol) getCategories().computeIfAbsent("ihm_modeling_protocol",
                org.rcsb.cif.schema.mm.generated.IhmModelingProtocol::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmMultiStateModeling getIhmMultiStateModeling() {
        return (org.rcsb.cif.schema.mm.generated.IhmMultiStateModeling) getCategories().computeIfAbsent("ihm_multi_state_modeling",
                org.rcsb.cif.schema.mm.generated.IhmMultiStateModeling::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmOrderedEnsemble getIhmOrderedEnsemble() {
        return (org.rcsb.cif.schema.mm.generated.IhmOrderedEnsemble) getCategories().computeIfAbsent("ihm_ordered_ensemble",
                org.rcsb.cif.schema.mm.generated.IhmOrderedEnsemble::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmModelingPostProcess getIhmModelingPostProcess() {
        return (org.rcsb.cif.schema.mm.generated.IhmModelingPostProcess) getCategories().computeIfAbsent("ihm_modeling_post_process",
                org.rcsb.cif.schema.mm.generated.IhmModelingPostProcess::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmEnsembleInfo getIhmEnsembleInfo() {
        return (org.rcsb.cif.schema.mm.generated.IhmEnsembleInfo) getCategories().computeIfAbsent("ihm_ensemble_info",
                org.rcsb.cif.schema.mm.generated.IhmEnsembleInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmModelList getIhmModelList() {
        return (org.rcsb.cif.schema.mm.generated.IhmModelList) getCategories().computeIfAbsent("ihm_model_list",
                org.rcsb.cif.schema.mm.generated.IhmModelList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmModelRepresentative getIhmModelRepresentative() {
        return (org.rcsb.cif.schema.mm.generated.IhmModelRepresentative) getCategories().computeIfAbsent("ihm_model_representative",
                org.rcsb.cif.schema.mm.generated.IhmModelRepresentative::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmDatasetList getIhmDatasetList() {
        return (org.rcsb.cif.schema.mm.generated.IhmDatasetList) getCategories().computeIfAbsent("ihm_dataset_list",
                org.rcsb.cif.schema.mm.generated.IhmDatasetList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmDatasetGroup getIhmDatasetGroup() {
        return (org.rcsb.cif.schema.mm.generated.IhmDatasetGroup) getCategories().computeIfAbsent("ihm_dataset_group",
                org.rcsb.cif.schema.mm.generated.IhmDatasetGroup::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmRelatedDatasets getIhmRelatedDatasets() {
        return (org.rcsb.cif.schema.mm.generated.IhmRelatedDatasets) getCategories().computeIfAbsent("ihm_related_datasets",
                org.rcsb.cif.schema.mm.generated.IhmRelatedDatasets::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmDatasetRelatedDbReference getIhmDatasetRelatedDbReference() {
        return (org.rcsb.cif.schema.mm.generated.IhmDatasetRelatedDbReference) getCategories().computeIfAbsent("ihm_dataset_related_db_reference",
                org.rcsb.cif.schema.mm.generated.IhmDatasetRelatedDbReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmExternalReferenceInfo getIhmExternalReferenceInfo() {
        return (org.rcsb.cif.schema.mm.generated.IhmExternalReferenceInfo) getCategories().computeIfAbsent("ihm_external_reference_info",
                org.rcsb.cif.schema.mm.generated.IhmExternalReferenceInfo::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmExternalFiles getIhmExternalFiles() {
        return (org.rcsb.cif.schema.mm.generated.IhmExternalFiles) getCategories().computeIfAbsent("ihm_external_files",
                org.rcsb.cif.schema.mm.generated.IhmExternalFiles::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmDatasetExternalReference getIhmDatasetExternalReference() {
        return (org.rcsb.cif.schema.mm.generated.IhmDatasetExternalReference) getCategories().computeIfAbsent("ihm_dataset_external_reference",
                org.rcsb.cif.schema.mm.generated.IhmDatasetExternalReference::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmLocalizationDensityFiles getIhmLocalizationDensityFiles() {
        return (org.rcsb.cif.schema.mm.generated.IhmLocalizationDensityFiles) getCategories().computeIfAbsent("ihm_localization_density_files",
                org.rcsb.cif.schema.mm.generated.IhmLocalizationDensityFiles::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmPredictedContactRestraint getIhmPredictedContactRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmPredictedContactRestraint) getCategories().computeIfAbsent("ihm_predicted_contact_restraint",
                org.rcsb.cif.schema.mm.generated.IhmPredictedContactRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmHydroxylRadicalFpRestraint getIhmHydroxylRadicalFpRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmHydroxylRadicalFpRestraint) getCategories().computeIfAbsent("ihm_hydroxyl_radical_fp_restraint",
                org.rcsb.cif.schema.mm.generated.IhmHydroxylRadicalFpRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmCrossLinkList getIhmCrossLinkList() {
        return (org.rcsb.cif.schema.mm.generated.IhmCrossLinkList) getCategories().computeIfAbsent("ihm_cross_link_list",
                org.rcsb.cif.schema.mm.generated.IhmCrossLinkList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmCrossLinkRestraint getIhmCrossLinkRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmCrossLinkRestraint) getCategories().computeIfAbsent("ihm_cross_link_restraint",
                org.rcsb.cif.schema.mm.generated.IhmCrossLinkRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmCrossLinkResult getIhmCrossLinkResult() {
        return (org.rcsb.cif.schema.mm.generated.IhmCrossLinkResult) getCategories().computeIfAbsent("ihm_cross_link_result",
                org.rcsb.cif.schema.mm.generated.IhmCrossLinkResult::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmCrossLinkResultParameters getIhmCrossLinkResultParameters() {
        return (org.rcsb.cif.schema.mm.generated.IhmCrossLinkResultParameters) getCategories().computeIfAbsent("ihm_cross_link_result_parameters",
                org.rcsb.cif.schema.mm.generated.IhmCrossLinkResultParameters::new);
    }

    public org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageRestraint getIhm2demClassAverageRestraint() {
        return (org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageRestraint) getCategories().computeIfAbsent("ihm_2dem_class_average_restraint",
                org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageFitting getIhm2demClassAverageFitting() {
        return (org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageFitting) getCategories().computeIfAbsent("ihm_2dem_class_average_fitting",
                org.rcsb.cif.schema.mm.generated.Ihm2demClassAverageFitting::new);
    }

    public org.rcsb.cif.schema.mm.generated.Ihm3demRestraint getIhm3demRestraint() {
        return (org.rcsb.cif.schema.mm.generated.Ihm3demRestraint) getCategories().computeIfAbsent("ihm_3dem_restraint",
                org.rcsb.cif.schema.mm.generated.Ihm3demRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmSasRestraint getIhmSasRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmSasRestraint) getCategories().computeIfAbsent("ihm_sas_restraint",
                org.rcsb.cif.schema.mm.generated.IhmSasRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmStartingModelCoord getIhmStartingModelCoord() {
        return (org.rcsb.cif.schema.mm.generated.IhmStartingModelCoord) getCategories().computeIfAbsent("ihm_starting_model_coord",
                org.rcsb.cif.schema.mm.generated.IhmStartingModelCoord::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmSphereObjSite getIhmSphereObjSite() {
        return (org.rcsb.cif.schema.mm.generated.IhmSphereObjSite) getCategories().computeIfAbsent("ihm_sphere_obj_site",
                org.rcsb.cif.schema.mm.generated.IhmSphereObjSite::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGaussianObjSite getIhmGaussianObjSite() {
        return (org.rcsb.cif.schema.mm.generated.IhmGaussianObjSite) getCategories().computeIfAbsent("ihm_gaussian_obj_site",
                org.rcsb.cif.schema.mm.generated.IhmGaussianObjSite::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGaussianObjEnsemble getIhmGaussianObjEnsemble() {
        return (org.rcsb.cif.schema.mm.generated.IhmGaussianObjEnsemble) getCategories().computeIfAbsent("ihm_gaussian_obj_ensemble",
                org.rcsb.cif.schema.mm.generated.IhmGaussianObjEnsemble::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmResiduesNotModeled getIhmResiduesNotModeled() {
        return (org.rcsb.cif.schema.mm.generated.IhmResiduesNotModeled) getCategories().computeIfAbsent("ihm_residues_not_modeled",
                org.rcsb.cif.schema.mm.generated.IhmResiduesNotModeled::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmFeatureList getIhmFeatureList() {
        return (org.rcsb.cif.schema.mm.generated.IhmFeatureList) getCategories().computeIfAbsent("ihm_feature_list",
                org.rcsb.cif.schema.mm.generated.IhmFeatureList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmPseudoSiteFeature getIhmPseudoSiteFeature() {
        return (org.rcsb.cif.schema.mm.generated.IhmPseudoSiteFeature) getCategories().computeIfAbsent("ihm_pseudo_site_feature",
                org.rcsb.cif.schema.mm.generated.IhmPseudoSiteFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmPolyAtomFeature getIhmPolyAtomFeature() {
        return (org.rcsb.cif.schema.mm.generated.IhmPolyAtomFeature) getCategories().computeIfAbsent("ihm_poly_atom_feature",
                org.rcsb.cif.schema.mm.generated.IhmPolyAtomFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmPolyResidueFeature getIhmPolyResidueFeature() {
        return (org.rcsb.cif.schema.mm.generated.IhmPolyResidueFeature) getCategories().computeIfAbsent("ihm_poly_residue_feature",
                org.rcsb.cif.schema.mm.generated.IhmPolyResidueFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmNonPolyFeature getIhmNonPolyFeature() {
        return (org.rcsb.cif.schema.mm.generated.IhmNonPolyFeature) getCategories().computeIfAbsent("ihm_non_poly_feature",
                org.rcsb.cif.schema.mm.generated.IhmNonPolyFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmInterfaceResidueFeature getIhmInterfaceResidueFeature() {
        return (org.rcsb.cif.schema.mm.generated.IhmInterfaceResidueFeature) getCategories().computeIfAbsent("ihm_interface_residue_feature",
                org.rcsb.cif.schema.mm.generated.IhmInterfaceResidueFeature::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmDerivedDistanceRestraint getIhmDerivedDistanceRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmDerivedDistanceRestraint) getCategories().computeIfAbsent("ihm_derived_distance_restraint",
                org.rcsb.cif.schema.mm.generated.IhmDerivedDistanceRestraint::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectList getIhmGeometricObjectList() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectList) getCategories().computeIfAbsent("ihm_geometric_object_list",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectList::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectCenter getIhmGeometricObjectCenter() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectCenter) getCategories().computeIfAbsent("ihm_geometric_object_center",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectCenter::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTransformation getIhmGeometricObjectTransformation() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTransformation) getCategories().computeIfAbsent("ihm_geometric_object_transformation",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTransformation::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectSphere getIhmGeometricObjectSphere() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectSphere) getCategories().computeIfAbsent("ihm_geometric_object_sphere",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectSphere::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTorus getIhmGeometricObjectTorus() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTorus) getCategories().computeIfAbsent("ihm_geometric_object_torus",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectTorus::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectHalfTorus getIhmGeometricObjectHalfTorus() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectHalfTorus) getCategories().computeIfAbsent("ihm_geometric_object_half_torus",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectHalfTorus::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectAxis getIhmGeometricObjectAxis() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectAxis) getCategories().computeIfAbsent("ihm_geometric_object_axis",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectAxis::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectPlane getIhmGeometricObjectPlane() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectPlane) getCategories().computeIfAbsent("ihm_geometric_object_plane",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectPlane::new);
    }

    public org.rcsb.cif.schema.mm.generated.IhmGeometricObjectDistanceRestraint getIhmGeometricObjectDistanceRestraint() {
        return (org.rcsb.cif.schema.mm.generated.IhmGeometricObjectDistanceRestraint) getCategories().computeIfAbsent("ihm_geometric_object_distance_restraint",
                org.rcsb.cif.schema.mm.generated.IhmGeometricObjectDistanceRestraint::new);
    }
}
