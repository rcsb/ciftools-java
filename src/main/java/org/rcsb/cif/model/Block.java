package org.rcsb.cif.model;

import javax.annotation.Generated;
import java.util.List;

@Generated("org.rcsb.cif.schema.Schema")
public interface Block {
    String getHeader();

    Category getCategory(String name);

    List<String> getCategoryNames();

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
    org.rcsb.cif.model.atomsite.AtomSite getAtomSite();

    /**
     * Data items in the ATOM_SITES category record details about
     * the crystallographic cell and cell transformations, which are
     * common to all atom sites.
     * @return AtomSites
     */
    org.rcsb.cif.model.atomsites.AtomSites getAtomSites();

    /**
     * Data items in the CELL category record details about the
     * crystallographic cell parameters.
     * @return Cell
     */
    org.rcsb.cif.model.cell.Cell getCell();

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
    org.rcsb.cif.model.chemcomp.ChemComp getChemComp();

    /**
     * Data items in the CHEM_COMP_BOND category record details about
     * the bonds between atoms in a chemical component. Target values
     * may be specified as bond orders, as a distance between the two
     * atoms, or both.
     * @return ChemCompBond
     */
    org.rcsb.cif.model.chemcompbond.ChemCompBond getChemCompBond();

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
    org.rcsb.cif.model.entity.Entity getEntity();

    /**
     * Data items in the ENTITY_POLY category record details about the
     * polymer, such as the type of the polymer, the number of
     * monomers and whether it has nonstandard features.
     * @return EntityPoly
     */
    org.rcsb.cif.model.entitypoly.EntityPoly getEntityPoly();

    /**
     * Data items in the ENTITY_POLY_SEQ category specify the sequence
     * of monomers in a polymer. Allowance is made for the possibility
     * of microheterogeneity in a sample by allowing a given sequence
     * number to be correlated with more than one monomer ID. The
     * corresponding ATOM_SITE entries should reflect this
     * heterogeneity.
     * @return EntityPolySeq
     */
    org.rcsb.cif.model.entitypolyseq.EntityPolySeq getEntityPolySeq();

    /**
     * There is only one item in the ENTRY category, _entry.id. This
     * data item gives a name to this entry and is indirectly a key to
     * the categories (such as CELL, GEOM, EXPTL) that describe
     * information pertinent to the entire data block.
     * @return Entry
     */
    org.rcsb.cif.model.entry.Entry getEntry();

    /**
     * Data items in the EXPTL category record details about the
     * experimental work prior to the intensity measurements and
     * details about the absorption-correction technique employed.
     * @return Exptl
     */
    org.rcsb.cif.model.exptl.Exptl getExptl();

    /**
     * Data items in the STRUCT category record details about the
     * description of the crystallographic structure.
     * @return Struct
     */
    org.rcsb.cif.model.struct.Struct getStruct();

    /**
     * Data items in the STRUCT_ASYM category record details about the
     * structural elements in the asymmetric unit.
     * @return StructAsym
     */
    org.rcsb.cif.model.structasym.StructAsym getStructAsym();

    /**
     * Data items in the STRUCT_CONF category record details about
     * the backbone conformation of a segment of polymer.
     * 
     * Data items in the STRUCT_CONF_TYPE category define the
     * criteria used to identify the backbone conformations.
     * @return StructConf
     */
    org.rcsb.cif.model.structconf.StructConf getStructConf();

    /**
     * Data items in the STRUCT_CONN category record details about
     * the connections between portions of the structure. These can be
     * hydrogen bonds, salt bridges, disulfide bridges and so on.
     * 
     * The STRUCT_CONN_TYPE records define the criteria used to
     * identify these connections.
     * @return StructConn
     */
    org.rcsb.cif.model.structconn.StructConn getStructConn();

    /**
     * Data items in the STRUCT_CONN_TYPE category record details
     * about the criteria used to identify interactions between
     * portions of the structure.
     * @return StructConnType
     */
    org.rcsb.cif.model.structconntype.StructConnType getStructConnType();

    /**
     * Data items in the STRUCT_KEYWORDS category specify keywords
     * that describe the chemical structure in this entry.
     * @return StructKeywords
     */
    org.rcsb.cif.model.structkeywords.StructKeywords getStructKeywords();

    /**
     * Data items in the STRUCT_NCS_OPER category describe the
     * noncrystallographic symmetry operations.
     * 
     * Each operator is specified as a matrix and a subsequent
     * translation vector. Operators need not represent proper
     * rotations.
     * @return StructNcsOper
     */
    org.rcsb.cif.model.structncsoper.StructNcsOper getStructNcsOper();

    /**
     * Data items in the STRUCT_SHEET_RANGE category record details
     * about the residue ranges that form a beta-sheet. Residues are
     * included in a range if they made beta-sheet-type hydrogen-bonding
     * interactions with at least one adjacent strand and if there are
     * at least two residues in the range.
     * @return StructSheetRange
     */
    org.rcsb.cif.model.structsheetrange.StructSheetRange getStructSheetRange();

    /**
     * Data items in the STRUCT_SITE category record details about
     * portions of the structure that contribute to structurally
     * relevant sites (e.g. active sites, substrate-binding subsites,
     * metal-coordination sites).
     * @return StructSite
     */
    org.rcsb.cif.model.structsite.StructSite getStructSite();

    /**
     * Data items in the STRUCT_SITE_GEN category record details about
     * the generation of portions of the structure that contribute to
     * structurally relevant sites.
     * @return StructSiteGen
     */
    org.rcsb.cif.model.structsitegen.StructSiteGen getStructSiteGen();

    /**
     * Data items in the SYMMETRY category record details about the
     * space-group symmetry.
     * @return Symmetry
     */
    org.rcsb.cif.model.symmetry.Symmetry getSymmetry();

    /**
     * The PDBX_NONPOLY_SCHEME category provides residue level nomenclature
     * mapping for non-polymer entities.
     * @return PdbxNonpolyScheme
     */
    org.rcsb.cif.model.pdbxnonpolyscheme.PdbxNonpolyScheme getPdbxNonpolyScheme();

    /**
     * Data items in the CHEM_COMP_IDENTIFIER category provide
     * identifiers for chemical components.
     * @return PdbxChemCompIdentifier
     */
    org.rcsb.cif.model.pdbxchemcompidentifier.PdbxChemCompIdentifier getPdbxChemCompIdentifier();

    /**
     * Data items in the PDBX_STRUCT_MOD_RESIDUE category list the
     * modified polymer components in the entry and provide some
     * details describing the nature of the modification.
     * @return PdbxStructModResidue
     */
    org.rcsb.cif.model.pdbxstructmodresidue.PdbxStructModResidue getPdbxStructModResidue();

    /**
     * Data items in the PDBX_STRUCT_OPER_LIST category describe
     * Cartesian rotation and translation operations required to
     * generate or transform the coordinates deposited with this entry.
     * @return PdbxStructOperList
     */
    org.rcsb.cif.model.pdbxstructoperlist.PdbxStructOperList getPdbxStructOperList();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
     * the structural elements that form macromolecular assemblies.
     * @return PdbxStructAssembly
     */
    org.rcsb.cif.model.pdbxstructassembly.PdbxStructAssembly getPdbxStructAssembly();

    /**
     * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
     * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
     * data items provide the specifications of the components that
     * constitute that assembly in terms of cartesian transformations.
     * @return PdbxStructAssemblyGen
     */
    org.rcsb.cif.model.pdbxstructassemblygen.PdbxStructAssemblyGen getPdbxStructAssemblyGen();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
     * the list of entities within each reference molecule.
     * @return PdbxReferenceEntityList
     */
    org.rcsb.cif.model.pdbxreferenceentitylist.PdbxReferenceEntityList getPdbxReferenceEntityList();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_LINK category give details about
     * the linkages between entities within reference molecules.
     * @return PdbxReferenceEntityLink
     */
    org.rcsb.cif.model.pdbxreferenceentitylink.PdbxReferenceEntityLink getPdbxReferenceEntityLink();

    /**
     * Data items in the PDBX_REFERENCE_ENTITY_POLY_LINK category give details about
     * polymer linkages including both standard and non-standard linkages between
     * polymer componnents.
     * @return PdbxReferenceEntityPolyLink
     */
    org.rcsb.cif.model.pdbxreferenceentitypolylink.PdbxReferenceEntityPolyLink getPdbxReferenceEntityPolyLink();

    /**
     * Data items in the PDBX_MOLECULE category identify reference molecules
     * within a PDB entry.
     * @return PdbxMolecule
     */
    org.rcsb.cif.model.pdbxmolecule.PdbxMolecule getPdbxMolecule();

    /**
     * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
     * within a PDB entry.
     * @return PdbxMoleculeFeatures
     */
    org.rcsb.cif.model.pdbxmoleculefeatures.PdbxMoleculeFeatures getPdbxMoleculeFeatures();

    /**
     * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
     * string descriptors of entity chemical structure.
     * @return PdbxEntityDescriptor
     */
    org.rcsb.cif.model.pdbxentitydescriptor.PdbxEntityDescriptor getPdbxEntityDescriptor();
}
