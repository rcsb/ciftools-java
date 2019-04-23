package org.rcsb.cif.model;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
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
    public org.rcsb.cif.model.atomsite.AtomSite getAtomSite() {
        return (org.rcsb.cif.model.atomsite.AtomSite) categories.computeIfAbsent("atom_site",
                org.rcsb.cif.model.atomsite.AtomSite::new);
    }

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    public org.rcsb.cif.model.atomsites.AtomSites getAtomSites() {
        return (org.rcsb.cif.model.atomsites.AtomSites) categories.computeIfAbsent("atom_sites",
                org.rcsb.cif.model.atomsites.AtomSites::new);
    }

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    public org.rcsb.cif.model.cell.Cell getCell() {
        return (org.rcsb.cif.model.cell.Cell) categories.computeIfAbsent("cell",
                org.rcsb.cif.model.cell.Cell::new);
    }

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
    public org.rcsb.cif.model.chemcomp.ChemComp getChemComp() {
        return (org.rcsb.cif.model.chemcomp.ChemComp) categories.computeIfAbsent("chem_comp",
                org.rcsb.cif.model.chemcomp.ChemComp::new);
    }

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    public org.rcsb.cif.model.chemcompbond.ChemCompBond getChemCompBond() {
        return (org.rcsb.cif.model.chemcompbond.ChemCompBond) categories.computeIfAbsent("chem_comp_bond",
                org.rcsb.cif.model.chemcompbond.ChemCompBond::new);
    }

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
    public org.rcsb.cif.model.entity.Entity getEntity() {
        return (org.rcsb.cif.model.entity.Entity) categories.computeIfAbsent("entity",
                org.rcsb.cif.model.entity.Entity::new);
    }

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    public org.rcsb.cif.model.entitypoly.EntityPoly getEntityPoly() {
        return (org.rcsb.cif.model.entitypoly.EntityPoly) categories.computeIfAbsent("entity_poly",
                org.rcsb.cif.model.entitypoly.EntityPoly::new);
    }

    /**
     * Data items in the ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer. Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return EntityPolySeq
     */
    public org.rcsb.cif.model.entitypolyseq.EntityPolySeq getEntityPolySeq() {
        return (org.rcsb.cif.model.entitypolyseq.EntityPolySeq) categories.computeIfAbsent("entity_poly_seq",
                org.rcsb.cif.model.entitypolyseq.EntityPolySeq::new);
    }

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    public org.rcsb.cif.model.entry.Entry getEntry() {
        return (org.rcsb.cif.model.entry.Entry) categories.computeIfAbsent("entry",
                org.rcsb.cif.model.entry.Entry::new);
    }

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    public org.rcsb.cif.model.exptl.Exptl getExptl() {
        return (org.rcsb.cif.model.exptl.Exptl) categories.computeIfAbsent("exptl",
                org.rcsb.cif.model.exptl.Exptl::new);
    }

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    public org.rcsb.cif.model.struct.Struct getStruct() {
        return (org.rcsb.cif.model.struct.Struct) categories.computeIfAbsent("struct",
                org.rcsb.cif.model.struct.Struct::new);
    }

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    public org.rcsb.cif.model.structasym.StructAsym getStructAsym() {
        return (org.rcsb.cif.model.structasym.StructAsym) categories.computeIfAbsent("struct_asym",
                org.rcsb.cif.model.structasym.StructAsym::new);
    }

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     *
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    public org.rcsb.cif.model.structconf.StructConf getStructConf() {
        return (org.rcsb.cif.model.structconf.StructConf) categories.computeIfAbsent("struct_conf",
                org.rcsb.cif.model.structconf.StructConf::new);
    }

    /**
     * Data items in the STRUCT_CONN category record details about
     * the connections between portions of the structure. These can be
     * hydrogen bonds, salt bridges, disulfide bridges and so on.
     *
     * The STRUCT_CONN_TYPE records define the criteria used to
     * identify these connections.
     * @return StructConn
     */
    public org.rcsb.cif.model.structconn.StructConn getStructConn() {
        return (org.rcsb.cif.model.structconn.StructConn) categories.computeIfAbsent("struct_conn",
                org.rcsb.cif.model.structconn.StructConn::new);
    }

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    public org.rcsb.cif.model.structconntype.StructConnType getStructConnType() {
        return (org.rcsb.cif.model.structconntype.StructConnType) categories.computeIfAbsent("struct_conn_type",
                org.rcsb.cif.model.structconntype.StructConnType::new);
    }

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    public org.rcsb.cif.model.structkeywords.StructKeywords getStructKeywords() {
        return (org.rcsb.cif.model.structkeywords.StructKeywords) categories.computeIfAbsent("struct_keywords",
                org.rcsb.cif.model.structkeywords.StructKeywords::new);
    }

    /**
     * Data items in the STRUCT_NCS_OPER category describe the
     * noncrystallographic symmetry operations.
     *
     * Each operator is specified as a matrix and a subsequent
     * translation vector. Operators need not represent proper
     * rotations.
     * @return StructNcsOper
     */
    public org.rcsb.cif.model.structncsoper.StructNcsOper getStructNcsOper() {
        return (org.rcsb.cif.model.structncsoper.StructNcsOper) categories.computeIfAbsent("struct_ncs_oper",
                org.rcsb.cif.model.structncsoper.StructNcsOper::new);
    }

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    public org.rcsb.cif.model.structsheetrange.StructSheetRange getStructSheetRange() {
        return (org.rcsb.cif.model.structsheetrange.StructSheetRange) categories.computeIfAbsent("struct_sheet_range",
                org.rcsb.cif.model.structsheetrange.StructSheetRange::new);
    }

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    public org.rcsb.cif.model.structsite.StructSite getStructSite() {
        return (org.rcsb.cif.model.structsite.StructSite) categories.computeIfAbsent("struct_site",
                org.rcsb.cif.model.structsite.StructSite::new);
    }

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    public org.rcsb.cif.model.structsitegen.StructSiteGen getStructSiteGen() {
        return (org.rcsb.cif.model.structsitegen.StructSiteGen) categories.computeIfAbsent("struct_site_gen",
                org.rcsb.cif.model.structsitegen.StructSiteGen::new);
    }

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    public org.rcsb.cif.model.symmetry.Symmetry getSymmetry() {
        return (org.rcsb.cif.model.symmetry.Symmetry) categories.computeIfAbsent("symmetry",
                org.rcsb.cif.model.symmetry.Symmetry::new);
    }

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    public org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme getPdbxNonpolyScheme() {
        return (org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme) categories.computeIfAbsent("pdbx_nonpoly_scheme",
                org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme::new);
    }

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    public org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier getPdbxChemCompIdentifier() {
        return (org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier) categories.computeIfAbsent("pdbx_chem_comp_identifier",
                org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier::new);
    }

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    public org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue getPdbxStructModResidue() {
        return (org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue) categories.computeIfAbsent("pdbx_struct_mod_residue",
                org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue::new);
    }

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    public org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList getPdbxStructOperList() {
        return (org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList) categories.computeIfAbsent("pdbx_struct_oper_list",
                org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    public org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly getPdbxStructAssembly() {
        return (org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly) categories.computeIfAbsent("pdbx_struct_assembly",
                org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly::new);
    }

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    public org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen getPdbxStructAssemblyGen() {
        return (org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen) categories.computeIfAbsent("pdbx_struct_assembly_gen",
                org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    public org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList getPdbxReferenceEntityList() {
        return (org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList) categories.computeIfAbsent("pdbx_reference_entity_list",
                org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    public org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink getPdbxReferenceEntityLink() {
        return (org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink) categories.computeIfAbsent("pdbx_reference_entity_link",
                org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink::new);
    }

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    public org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink() {
        return (org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink) categories.computeIfAbsent("pdbx_reference_entity_poly_link",
                org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink::new);
    }

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    public org.rcsb.cif.model.pdbxmolecule.PdbxMolecule getPdbxMolecule() {
        return (org.rcsb.cif.model.pdbxmolecule.PdbxMolecule) categories.computeIfAbsent("pdbx_molecule",
                org.rcsb.cif.model.pdbxmolecule.PdbxMolecule::new);
    }

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    public org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures getPdbxMoleculeFeatures() {
        return (org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures) categories.computeIfAbsent("pdbx_molecule_features",
                org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures::new);
    }

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    public org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor getPdbxEntityDescriptor() {
        return (org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor) categories.computeIfAbsent("pdbx_entity_descriptor",
                org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor::new);
    }
}
