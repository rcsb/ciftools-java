package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe atom site information
 * used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSite extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site";

    public AtomSite(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Number of hydrogen atoms attached to the atom at this site
     * excluding any H atoms for which coordinates (measured or calculated)
     * are given.
     * @return IntColumn
     */
    public IntColumn getAttachedHydrogens() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_site_attached_hydrogens"));
    }

    /**
     * Equivalent isotropic atomic displacement parameter, B(equiv),
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * B(equiv) = (B~i~ B~j~ B~k~)^1/3^
     * 
     * B~n~  = the principal components of the orthogonalised B^ij^
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMean() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_b_equiv_geom_mean"));
    }

    /**
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, B(equiv), in angstroms squared,
     * calculated from anisotropic atomic displacement parameters.
     * 
     * B(equiv) = (1/3) sum~i~[sum~j~(B^ij^ a*~i~ a*~j~ a~i~.a~j~)]
     * 
     * a     = the real-space cell vectors
     * a*    = the reciprocal-space cell lengths
     * B^ij^ = 8 π^2^ U^ij^
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44, 775-776.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquiv() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_b_iso_or_equiv"));
    }

    /**
     * The _atom_site.label of the atom site to which the 'geometry-calculated'
     * atom site is attached.
     * @return StrColumn
     */
    public StrColumn getCalcAttachedAtom() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_calc_attached_atom"));
    }

    /**
     * A standard code to signal if the site coordinates have been
     * determined from the intensities or calculated from the geometry
     * of surrounding sites, or have been assigned dummy coordinates.
     * @return StrColumn
     */
    public StrColumn getCalcFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_calc_flag"));
    }

    /**
     * The atom site coordinates in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_cartn_x"));
    }

    /**
     * Vector of Cartesian (orthogonal angstrom) atom site coordinates.
     * @return FloatColumn
     */
    public FloatColumn getCartnXyz() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_cartn_xyz"));
    }

    /**
     * Standard uncertainty of _atom_site.Cartn_xyz.
     * @return FloatColumn
     */
    public FloatColumn getCartnXyzSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_cartn_xyz_su"));
    }

    /**
     * The atom site coordinates in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_cartn_y"));
    }

    /**
     * The atom site coordinates in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_cartn_z"));
    }

    /**
     * This number links an atom site to the chemical connectivity list.
     * It must match a number specified by _chemical_conn_atom.number.
     * @return IntColumn
     */
    public IntColumn getChemicalConnNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_site_chemical_conn_number"));
    }

    /**
     * A description of the constraints applied to parameters at this
     * site during refinement. See also _atom_site.refinement_flags_*
     * and _refine_ls.number_constraints.
     * @return StrColumn
     */
    public StrColumn getConstraints() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_constraints"));
    }

    /**
     * A code which identifies a cluster of atoms that show long range disorder
     * but are locally ordered. Within each such cluster of atoms,
     * _atom_site.disorder_group is used to identify the sites that are
     * simultaneously occupied. This field is only needed if there is more than
     * one cluster of disordered atoms showing independent local order.
     * @return StrColumn
     */
    public StrColumn getDisorderAssembly() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_disorder_assembly"));
    }

    /**
     * A code that identifies a group of disordered atom sites that are locally
     * simultaneously occupied. Atoms that are positionally disordered over two or
     * more sites (e.g. the H atoms of a methyl group that exists in two
     * orientations) should be assigned to two or more groups. Similarly, atoms
     * that describe a specific alternative composition of a compositionally
     * disordered site should be assigned to a distinct disorder group (e.g. a site
     * that is partially occupied by Mg and Mn atoms should be described by
     * assigning the Mg atom to one group and the Mn atom to another group). Sites
     * belonging to the same group are simultaneously occupied, but those belonging
     * to different groups are not. A minus prefix (e.g. "-1") is used to indicate
     * sites disordered about a special position.
     * @return StrColumn
     */
    public StrColumn getDisorderGroup() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_disorder_group"));
    }

    /**
     * A symbolic expression that indicates the symmetry-restricted form of the
     * components of the positional coordinates of an atom.
     * @return StrColumn
     */
    public StrColumn getFractSymmform() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_fract_symmform"));
    }

    /**
     * Atom site coordinates as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_fract_x"));
    }

    /**
     * Vector of atom site coordinates projected onto the crystal unit
     * cell as fractions of the cell lengths.
     * @return FloatColumn
     */
    public FloatColumn getFractXyz() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_fract_xyz"));
    }

    /**
     * Standard uncertainty of _atom_site.fract_xyz.
     * @return FloatColumn
     */
    public FloatColumn getFractXyzSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_fract_xyz_su"));
    }

    /**
     * Atom site coordinates as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_fract_y"));
    }

    /**
     * Atom site coordinates as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_fract_z"));
    }

    /**
     * Component_0 is normally a code which matches identically with
     * one of the _atom_type.symbol codes. If this is the case then the
     * rules governing the _atom_type.symbol code apply. If, however,
     * the data item _atom_site.type_symbol is also specified in the
     * atom site list, component 0 need not match this symbol or adhere
     * to any of the _atom_type.symbol rules.
     * Component_1 is referred to as the "atom number". When component 0
     * is the atom type code, it is used to number the sites with the
     * same atom type. This component code must start with at least one
     * digit which is not followed by a + or - sign (to distinguish it
     * from the component 0 rules).
     * Components_2 to 6 contain the identifier, residue, sequence,
     * asymmetry identifier and alternate codes, respectively. These
     * codes may be composed of any characters except an underline.
     * @return StrColumn
     */
    public StrColumn getLabelComponent0() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_0"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent1() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_1"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent2() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_2"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent3() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_3"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent4() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_4"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent5() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_5"));
    }

    /**
     * See label_component_0 description.
     * @return StrColumn
     */
    public StrColumn getLabelComponent6() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_label_component_6"));
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site. The
     * value must lie in the 99.97% Gaussian confidence interval
     * -3u =&lt; x =&lt; 1 + 3u. The _enumeration.range of 0.0:1.0 is thus
     * correctly interpreted as meaning (0.0 - 3u) =&lt; x =&lt; (1.0 + 3u).
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_occupancy"));
    }

    /**
     * A concatenated series of single-letter codes which indicate the
     * refinement restraints or constraints applied to this site. This
     * item should not be used. It has been replaced by
     * _atom_site.refinement_flags_posn, _ADP and _occupancy. It is
     * retained in this dictionary only to provide compatibility with
     * legacy CIFs.
     * @return StrColumn
     */
    public StrColumn getRefinementFlags() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_refinement_flags"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the atomic displacement parameters of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsAdp() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_refinement_flags_adp"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the occupancy of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsOccupancy() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_refinement_flags_occupancy"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the positional coordinates of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsPosn() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_refinement_flags_posn"));
    }

    /**
     * A description of restraints applied to specific parameters at
     * this site during refinement. See also _atom_site.refinement_flags_*
     * and _refine_ls.number_restraints.
     * @return StrColumn
     */
    public StrColumn getRestraints() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_restraints"));
    }

    /**
     * The number of times application of the crystallographic symmetry
     * to the coordinates for this site generates the same coordinates.
     * That is:
     * multiplicity of the general position
     * ------------------------------------
     * _atom_site.site_symmetry_multiplicity
     * @return IntColumn
     */
    public IntColumn getSiteSymmetryOrder() {
        return new DelegatingIntColumn(parentBlock.getColumn("atom_site_site_symmetry_order"));
    }

    /**
     * A code to identify the atom specie(s) occupying this site.
     * This code must match a corresponding _atom_type.symbol. The
     * specification of this code is optional if component_0 of the
     * _atom_site.label is used for this purpose. See _atom_type.symbol.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_type_symbol"));
    }

    /**
     * Equivalent isotropic atomic displacement parameter, U(equiv),
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * U(equiv) = (U~i~ U~j~ U~k~)^1/3^
     * 
     * U~n~ = the principal components of the orthogonalised U^ij^
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMean() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_u_equiv_geom_mean"));
    }

    /**
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, U(equiv), in angstroms squared,
     * calculated from anisotropic atomic displacement parameters.
     * 
     * U(equiv) = (1/3) sum~i~[sum~j~(U^ij^ a*~i~ a*~j~ a~i~.a~j~)]
     * 
     * a  = the real-space cell vectors
     * a* = the reciprocal-space cell lengths
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44, 775-776.
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquiv() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_site_u_iso_or_equiv"));
    }

    /**
     * The Wyckoff symbol (letter) as listed in the space-group section
     * of International Tables for Crystallography, Vol. A (1987).
     * @return StrColumn
     */
    public StrColumn getWyckoffSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_site_wyckoff_symbol"));
    }

    /**
     * Code for type of atomic displacement parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getThermalDisplaceType() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_thermal_displace_type", "atom_site_adp_type"));
    }

    /**
     * Code for type of atomic displacement parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getAdpType() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_thermal_displace_type", "atom_site_adp_type"));
    }

    /**
     * Standard uncertainty of the equivalent isotropic atomic displacement
     * parameter, B(equiv), in angstroms squared, calculated as the geometric
     * mean of the anisotropic atomic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMeanEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_B_equiv_geom_mean_esd", "atom_site_b_equiv_geom_mean_su"));
    }

    /**
     * Standard uncertainty of the equivalent isotropic atomic displacement
     * parameter, B(equiv), in angstroms squared, calculated as the geometric
     * mean of the anisotropic atomic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMeanSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_B_equiv_geom_mean_esd", "atom_site_b_equiv_geom_mean_su"));
    }

    /**
     * Standard uncertainty of the isotropic atomic displacement parameter,
     * or equivalent isotropic atomic displacement parameter, B(equiv),
     * in angstroms squared, calculated from anisotropic atomic displacement
     * parameters.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquivEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_B_iso_or_equiv_esd", "atom_site_b_iso_or_equiv_su"));
    }

    /**
     * Standard uncertainty of the isotropic atomic displacement parameter,
     * or equivalent isotropic atomic displacement parameter, B(equiv),
     * in angstroms squared, calculated from anisotropic atomic displacement
     * parameters.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquivSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_B_iso_or_equiv_esd", "atom_site_b_iso_or_equiv_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_x_esd", "atom_site_cartn_x_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnXSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_x_esd", "atom_site_cartn_x_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_y_esd", "atom_site_cartn_y_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnYSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_y_esd", "atom_site_cartn_y_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_z_esd", "atom_site_cartn_z_su"));
    }

    /**
     * Standard uncertainty values of the atom site coordinates
     * in angstroms specified according to a
     * set of orthogonal Cartesian axes related to the cell axes as
     * specified by the _atom_sites_Cartn_transform.axes description.
     * @return FloatColumn
     */
    public FloatColumn getCartnZSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_Cartn_z_esd", "atom_site_cartn_z_su"));
    }

    /**
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags_*.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_details", "atom_site_description"));
    }

    /**
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags_*.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_details", "atom_site_description"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_x_esd", "atom_site_fract_x_su"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractXSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_x_esd", "atom_site_fract_x_su"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_y_esd", "atom_site_fract_y_su"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractYSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_y_esd", "atom_site_fract_y_su"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_z_esd", "atom_site_fract_z_su"));
    }

    /**
     * Standard uncertainty value of the atom site coordinates
     * as fractions of the cell length values.
     * @return FloatColumn
     */
    public FloatColumn getFractZSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_fract_z_esd", "atom_site_fract_z_su"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell. It is made up of
     * components, _atom_site.label_component_0 to *_6, which may be
     * specified as separate data items. Component 0 usually matches one
     * of the specified _atom_type.symbol codes. This is not mandatory
     * if an _atom_site.type_symbol item is included in the atom site
     * list. The _atom_site.type_symbol always takes precedence over
     * an _atom_site.label in the identification of the atom type. The
     * label components 1 to 6 are optional, and normally only
     * components 0 and 1 are used. Note that components 0 and 1 are
     * concatenated, while all other components, if specified, are
     * separated by an underline character. Underline separators are
     * only used if higher-order components exist. If an intermediate
     * component is not used it may be omitted provided the underline
     * separators are inserted. For example the label 'C233__ggg' is
     * acceptable and represents the components C, 233, '', and ggg.
     * Each label may have a different number of components.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_id", "atom_site_label"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell. It is made up of
     * components, _atom_site.label_component_0 to *_6, which may be
     * specified as separate data items. Component 0 usually matches one
     * of the specified _atom_type.symbol codes. This is not mandatory
     * if an _atom_site.type_symbol item is included in the atom site
     * list. The _atom_site.type_symbol always takes precedence over
     * an _atom_site.label in the identification of the atom type. The
     * label components 1 to 6 are optional, and normally only
     * components 0 and 1 are used. Note that components 0 and 1 are
     * concatenated, while all other components, if specified, are
     * separated by an underline character. Underline separators are
     * only used if higher-order components exist. If an intermediate
     * component is not used it may be omitted provided the underline
     * separators are inserted. For example the label 'C233__ggg' is
     * acceptable and represents the components C, 233, '', and ggg.
     * Each label may have a different number of components.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("atom_site_id", "atom_site_label"));
    }

    /**
     * Standard uncertainty of the fraction of the atom type
     * present at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_occupancy_esd", "atom_site_occupancy_su"));
    }

    /**
     * Standard uncertainty of the fraction of the atom type
     * present at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancySu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_occupancy_esd", "atom_site_occupancy_su"));
    }

    /**
     * The number of different sites that are generated by the
     * application of the space-group symmetry to the coordinates
     * given for this site. It is equal to the multiplicity given
     * for this Wyckoff site in International Tables for Cryst.
     * Vol. A (2002). It is equal to the multiplicity of the general
     * position divided by the order of the site symmetry given in
     * _atom_site.site_symmetry_order.
     * 
     * The _atom_site_symmetry_multiplicity form of this data name is
     * deprecated because of historical inconsistencies in practice among
     * structure refinement software packages and should not be used.
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("atom_site_symmetry_multiplicity", "atom_site_site_symmetry_multiplicity"));
    }

    /**
     * The number of different sites that are generated by the
     * application of the space-group symmetry to the coordinates
     * given for this site. It is equal to the multiplicity given
     * for this Wyckoff site in International Tables for Cryst.
     * Vol. A (2002). It is equal to the multiplicity of the general
     * position divided by the order of the site symmetry given in
     * _atom_site.site_symmetry_order.
     * 
     * The _atom_site_symmetry_multiplicity form of this data name is
     * deprecated because of historical inconsistencies in practice among
     * structure refinement software packages and should not be used.
     * @return IntColumn
     */
    public IntColumn getSiteSymmetryMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("atom_site_symmetry_multiplicity", "atom_site_site_symmetry_multiplicity"));
    }

    /**
     * Standard uncertainty values (esds) of the U(equiv).
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMeanEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_U_equiv_geom_mean_esd", "atom_site_u_equiv_geom_mean_su"));
    }

    /**
     * Standard uncertainty values (esds) of the U(equiv).
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMeanSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_U_equiv_geom_mean_esd", "atom_site_u_equiv_geom_mean_su"));
    }

    /**
     * Standard uncertainty values (esds) of the U(iso) or U(equiv).
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquivEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_U_iso_or_equiv_esd", "atom_site_u_iso_or_equiv_su"));
    }

    /**
     * Standard uncertainty values (esds) of the U(iso) or U(equiv).
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquivSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_U_iso_or_equiv_esd", "atom_site_u_iso_or_equiv_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]", "atom_site_anisotrop_B[1][1]", "atom_site_aniso_b_11"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]", "atom_site_anisotrop_B[1][1]", "atom_site_aniso_b_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_b_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_b_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB11Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][1]_esd", "atom_site_anisotrop_B[1][1]_esd", "atom_site_aniso_b_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]", "atom_site_anisotrop_B[1][2]", "atom_site_aniso_b_12"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]", "atom_site_anisotrop_B[1][2]", "atom_site_aniso_b_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_b_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_b_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB12Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][2]_esd", "atom_site_anisotrop_B[1][2]_esd", "atom_site_aniso_b_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]", "atom_site_anisotrop_B[1][3]", "atom_site_aniso_b_13"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]", "atom_site_anisotrop_B[1][3]", "atom_site_aniso_b_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_b_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_b_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB13Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[1][3]_esd", "atom_site_anisotrop_B[1][3]_esd", "atom_site_aniso_b_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]", "atom_site_anisotrop_B[2][2]", "atom_site_aniso_b_22"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]", "atom_site_anisotrop_B[2][2]", "atom_site_aniso_b_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_b_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_b_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB22Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][2]_esd", "atom_site_anisotrop_B[2][2]_esd", "atom_site_aniso_b_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]", "atom_site_anisotrop_B[2][3]", "atom_site_aniso_b_23"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]", "atom_site_anisotrop_B[2][3]", "atom_site_aniso_b_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_b_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_b_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB23Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[2][3]_esd", "atom_site_anisotrop_B[2][3]_esd", "atom_site_aniso_b_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]", "atom_site_anisotrop_B[3][3]", "atom_site_aniso_b_33"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{-1/4 sum~i~ [ sum~j~ (B^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use of B for
     * reporting atomic displacement parameters. U, being directly proportional
     * to B, is preferred .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getB33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]", "atom_site_anisotrop_B[3][3]", "atom_site_aniso_b_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_b_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_b_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the B^ij^ anisotropic atomic displacement components (see
     * aniso_BIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the B^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getB33Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_B[3][3]_esd", "atom_site_anisotrop_B[3][3]_esd", "atom_site_aniso_b_33_su"));
    }

    /**
     * The symmetric anisotropic atomic displacement parameter (ADP) matrix, β,
     * which appears in a structure factor expression.
     * 
     * The contribution of the ADPs to the calculation of the structure factor is
     * given as:
     * 
     * T = exp(-1 * Sum(Sum(β^ij^ * h~i~ * h~j~, j=1:3), i=1:3))
     * 
     * where β^ij^ are the matrix elements, and h~m~ are the Miller indices.
     * 
     * The ADP matrix β, is related to the ADP matrices U and B, as follows:
     * 
     * |a~1~*   0     0  |   |t^11^ t^12^ t^13^|   |a~1~*   0     0  |
     * β = C * |  0   a~2~*   0  | * |t^12^ t^22^ t^23^| * |  0   a~2~*   0  |
     * |  0     0   a~3~*|   |t^13^ t^23^ t^33^|   |  0     0   a~3~*|
     * 
     * where C is a constant (2 * π^2^ for U, and 0.25 for B), a~i~* is the
     * length of the respective reciprocal unit cell vector, and t represents
     * the individual anisotropic values, U^ij^ or B^ij^.
     * @return FloatColumn
     */
    public FloatColumn getTensorBeta() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta", "atom_site_aniso_matrix_beta"));
    }

    /**
     * The symmetric anisotropic atomic displacement parameter (ADP) matrix, β,
     * which appears in a structure factor expression.
     * 
     * The contribution of the ADPs to the calculation of the structure factor is
     * given as:
     * 
     * T = exp(-1 * Sum(Sum(β^ij^ * h~i~ * h~j~, j=1:3), i=1:3))
     * 
     * where β^ij^ are the matrix elements, and h~m~ are the Miller indices.
     * 
     * The ADP matrix β, is related to the ADP matrices U and B, as follows:
     * 
     * |a~1~*   0     0  |   |t^11^ t^12^ t^13^|   |a~1~*   0     0  |
     * β = C * |  0   a~2~*   0  | * |t^12^ t^22^ t^23^| * |  0   a~2~*   0  |
     * |  0     0   a~3~*|   |t^13^ t^23^ t^33^|   |  0     0   a~3~*|
     * 
     * where C is a constant (2 * π^2^ for U, and 0.25 for B), a~i~* is the
     * length of the respective reciprocal unit cell vector, and t represents
     * the individual anisotropic values, U^ij^ or B^ij^.
     * @return FloatColumn
     */
    public FloatColumn getMatrixBeta() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta", "atom_site_aniso_matrix_beta"));
    }

    /**
     * Standard uncertainty of _atom_site_aniso.matrix_beta.
     * @return FloatColumn
     */
    public FloatColumn getTensorBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta_su", "atom_site_aniso_matrix_beta_su"));
    }

    /**
     * Standard uncertainty of _atom_site_aniso.matrix_beta.
     * @return FloatColumn
     */
    public FloatColumn getMatrixBetaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_tensor_beta_su", "atom_site_aniso_matrix_beta_su"));
    }

    /**
     * Ratio of the maximum to minimum eigenvalues of the atomic displacement
     * ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getRatio() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_ratio", "atom_site_aniso_ratio"));
    }

    /**
     * Ratio of the maximum to minimum eigenvalues of the atomic displacement
     * ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getAnisoRatio() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_anisotrop_ratio", "atom_site_aniso_ratio"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]", "atom_site_anisotrop_U[1][1]", "atom_site_aniso_u_11"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]", "atom_site_anisotrop_U[1][1]", "atom_site_aniso_u_11"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_u_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU11Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_u_11_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU11Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][1]_esd", "atom_site_anisotrop_U[1][1]_esd", "atom_site_aniso_u_11_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]", "atom_site_anisotrop_U[1][2]", "atom_site_aniso_u_12"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]", "atom_site_anisotrop_U[1][2]", "atom_site_aniso_u_12"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_u_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU12Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_u_12_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU12Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][2]_esd", "atom_site_anisotrop_U[1][2]_esd", "atom_site_aniso_u_12_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]", "atom_site_anisotrop_U[1][3]", "atom_site_aniso_u_13"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]", "atom_site_anisotrop_U[1][3]", "atom_site_aniso_u_13"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_u_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU13Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_u_13_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU13Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[1][3]_esd", "atom_site_anisotrop_U[1][3]_esd", "atom_site_aniso_u_13_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]", "atom_site_anisotrop_U[2][2]", "atom_site_aniso_u_22"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]", "atom_site_anisotrop_U[2][2]", "atom_site_aniso_u_22"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_u_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU22Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_u_22_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU22Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][2]_esd", "atom_site_anisotrop_U[2][2]_esd", "atom_site_aniso_u_22_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]", "atom_site_anisotrop_U[2][3]", "atom_site_aniso_u_23"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]", "atom_site_anisotrop_U[2][3]", "atom_site_aniso_u_23"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_u_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU23Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_u_23_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU23Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[2][3]_esd", "atom_site_anisotrop_U[2][3]_esd", "atom_site_aniso_u_23_su"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]", "atom_site_anisotrop_U[3][3]", "atom_site_aniso_u_33"));
    }

    /**
     * These are the standard anisotropic atomic displacement components, in
     * angstroms squared, which appear in the structure factor term:
     * 
     * T = exp{ -2π^2^ sum~i~ [ sum~j~ (U^ij^ h~i~ h~j~ a*~i~ a*~j~) ] }
     * 
     * h = the Miller indices
     * a* = the reciprocal-space cell lengths
     * 
     * The unique elements of the real symmetric matrix are entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends the use of U for reporting
     * atomic displacement parameters .
     * 
     * Note that U^ij^ = β^ij^/(2 π^2^ a*~i~ a*~j~) = B^ij^/(8 π^2^) .
     * 
     *  Trueblood, K. N. et al. (1996). Acta Crystallogr. A52(5), 770-781.
     * @return FloatColumn
     */
    public FloatColumn getU33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]", "atom_site_anisotrop_U[3][3]", "atom_site_aniso_u_33"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_u_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU33Esd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_u_33_su"));
    }

    /**
     * These are the standard uncertainty values (SU) for the standard
     * form of the U^ij^ anisotropic atomic displacement components (see
     * aniso_UIJ). Because these values are TYPE measurand, the su values
     * may in practice be auto generated as part of the U^ij^ calculation.
     * @return FloatColumn
     */
    public FloatColumn getU33Su() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("atom_site_aniso_U[3][3]_esd", "atom_site_anisotrop_U[3][3]_esd", "atom_site_aniso_u_33_su"));
    }

}