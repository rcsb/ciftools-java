package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify space group
 * information about the crystal used in the diffraction measurements.
 * 
 * Space-group types are identified by their number as listed in
 * International Tables for Crystallography Volume A, or by their
 * Schoenflies symbol. Specific settings of the space groups can
 * be identified by their Hall symbol, by specifying their
 * symmetry operations or generators, or by giving the
 * transformation that relates the specific setting to the
 * reference setting based on International Tables Volume A and
 * stored in this dictionary.
 * 
 * The commonly used Hermann-Mauguin symbol determines the
 * space-group type uniquely, but several different Hermann-Mauguin
 * symbols may refer to the same space-group type. A
 * Hermann-Mauguin symbol contains information on the choice of
 * the basis, but not on the choice of origin.
 * 
 * Ref: International Tables for Crystallography (2002). Volume A,
 * Space-group symmetry, edited by Th. Hahn, 5th ed.
 * Dordrecht: Kluwer Academic Publishers.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroup extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "space_group";

    public SpaceGroup(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The symbol denoting the lattice type (Bravais type) to which the
     * translational subgroup (vector lattice) of the space group
     * belongs. It consists of a lower-case letter indicating the
     * crystal system followed by an upper-case letter indicating
     * the lattice centring. The setting-independent symbol mS
     * replaces the setting-dependent symbols mB and mC, and the
     * setting-independent symbol oS replaces the setting-dependent
     * symbols oA, oB and oC.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed., p. 15.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getBravaisType() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_bravais_type"));
    }

    /**
     * Symbol for the lattice centring. This symbol may be dependent
     * on the coordinate system chosen.
     * @return StrColumn
     */
    public StrColumn getCentringType() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_centring_type"));
    }

    /**
     * The name of the system of geometric crystal classes of space
     * groups (crystal system) to which the space group belongs.
     * Note that rhombohedral space groups belong to the
     * trigonal system.
     * @return StrColumn
     */
    public StrColumn getCrystalSystem() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_crystal_system"));
    }

    /**
     * A qualifier taken from the enumeration list identifying which
     * setting in International Tables for Crystallography Volume A
     * (2002) (IT) is used.  See IT Table 4.3.2.1, Section 2.2.16,
     * Table 2.2.16.1, Section 2.2.16.1 and Fig. 2.2.6.4.  This item
     * is not computer-interpretable and cannot be used to define the
     * coordinate system.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getItCoordinateSystemCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_it_coordinate_system_code"));
    }

    /**
     * The Hermann-Mauguin symbol of the geometric crystal class of the
     * point group of the space group where a centre of inversion is
     * added if not already present.
     * @return StrColumn
     */
    public StrColumn getLaueClass() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_laue_class"));
    }

    /**
     * Number of unique symmetry elements in the space group.
     * @return IntColumn
     */
    public IntColumn getMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getColumn("space_group_multiplicity"));
    }

    /**
     * _space_group.name_H-M_alt allows for any Hermann-Mauguin symbol
     * to be given. The way in which this item is used is determined
     * by the user and in general is not intended to be interpreted by
     * computer. It may, for example, be used to give one of the
     * extended Hermann-Mauguin symbols given in Table 4.3.1 of
     * International Tables for Crystallography Vol. A (1995) or
     * a Hermann-Mauguin symbol for a conventional or unconventional
     * setting.
     * Each component of the space group name is separated by a
     * space or underscore. The use of space is strongly
     * recommended. The underscore is only retained because it
     * was used in earlier archived files. It should not be
     * used in new CIFs. Subscripts should appear without special
     * symbols. Bars should be given as negative signs before the
     * numbers to which they apply.
     * The commonly used Hermann-Mauguin symbol determines the space
     * group type uniquely, but a given space group type may be
     * described by more than one Hermann-Mauguin symbol. The space
     * group type is best described using _space_group.IT_number.
     * The Hermann-Mauguin symbol may contain information on the
     * choice of basis though not on the choice of origin. To
     * define the setting uniquely use _space_group.name_Hall or
     * list the symmetry operations.
     * @return StrColumn
     */
    public StrColumn getNameH_mAlt() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_name_h-m_alt"));
    }

    /**
     * A free-text description of the code appearing in
     * _space_group.name_H-M_alt.
     * @return StrColumn
     */
    public StrColumn getNameH_mAltDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_name_h-m_alt_description"));
    }

    /**
     * The short international Hermann-Mauguin space-group symbol as
     * defined in Section 2.2.3 and given as the first item of each
     * space-group table in Part 7 of International Tables
     * for Crystallography Volume A (2002).
     * 
     * Each component of the space-group name is separated by a
     * space character. Subscripts appear without special symbols.
     * Bars are given as negative signs before the numbers to which
     * they apply.
     * 
     * The short international Hermann-Mauguin symbol determines
     * the space-group type uniquely. However, the space-group
     * type is better described using _space_group.IT_number or
     * _space_group.name_Schoenflies. The short international
     * Hermann-Mauguin symbol contains no information on the
     * choice of basis or origin. To define the setting uniquely
     * use _space_group.name_Hall, or list the symmetry operations
     * or generators.
     * 
     * _space_group.name_H-M_alt may be used to give the
     * Hermann-Mauguin symbol corresponding to the setting used.
     * 
     * In the enumeration list, each possible value is identified by
     * space-group number and Schoenflies symbol.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getNameH_mRef() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_name_h-m_ref"));
    }

    /**
     * The Schoenflies symbol as listed in International Tables for
     * Crystallography Volume A denoting the proper affine class (i.e.
     * orientation-preserving affine class) of space groups
     * (space-group type) to which the space group belongs. This
     * symbol defines the space-group type independently of the
     * coordinate system in which the space group is expressed.
     * 
     * The symbol is given with a period, '.', separating the
     * Schoenflies point group and the superscript.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getNameSchoenflies() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_name_schoenflies"));
    }

    /**
     * The Hermann-Mauguin symbol of the type of that centrosymmetric
     * symmorphic space group to which the Patterson function belongs;
     * see Table 2.2.5.1 in International Tables for Crystallography
     * Volume A (2002).
     * 
     * A space separates each symbol referring to different axes.
     * Underscores may replace the spaces, but this use is discouraged.
     * Subscripts should appear without special symbols.
     * Bars should be given as negative signs before the number
     * to which they apply.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.,
     * Table 2.2.5.1. Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getPattersonNameH_m() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_patterson_name_h-m"));
    }

    /**
     * The Hermann-Mauguin symbol denoting the geometric crystal
     * class of space groups to which the space group belongs, and
     * the geometric crystal class of point groups to which the
     * point group of the space group belongs.
     * @return StrColumn
     */
    public StrColumn getPointGroupH_m() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_point_group_h-m"));
    }

    /**
     * The number as assigned in International Tables for Crystallography
     * Vol. A, specifying the proper affine class (i.e. the orientation
     * preserving affine class) of space groups (crystallographic space
     * group type) to which the space group belongs. This number defines
     * the space group type but not the coordinate system expressed.
     * @return IntColumn
     */
    public IntColumn getItNumber() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("symmetry_Int_Tables_number", "space_group_it_number"));
    }

    /**
     * The full international Hermann-Mauguin space-group symbol as
     * defined in Section 2.2.3 and given as the second item of the
     * second line of each of the space-group tables of Part 7 of
     * International Tables for Crystallography Volume A (2002).
     * 
     * Each component of the space-group name is separated by a
     * space or an underscore character. The use of a space is
     * strongly recommended.  The underscore is only retained
     * because it was used in old CIFs. It should not be used in
     * new CIFs.
     * 
     * Subscripts should appear without special symbols. Bars should
     * be given as negative signs before the numbers to which they
     * apply. The commonly used Hermann-Mauguin symbol determines the
     * space-group type uniquely, but a given space-group type may
     * be described by more than one Hermann-Mauguin symbol. The
     * space-group type is best described using
     * _space_group.IT_number or _space_group.name_Schoenflies. The
     * full international Hermann-Mauguin symbol contains information
     * about the choice of basis for monoclinic and orthorhombic
     * space groups, but does not give information about the choice
     * of origin. To define the setting uniquely use
     * _space_group.name_Hall, or list the symmetry operations
     * or generators.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getNameH_mFull() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("symmetry_space_group_name_H-M", "space_group_name_h-m_full"));
    }

    /**
     * Space group symbol defined by Hall. Each component of the
     * space group name is separated by a space or an underscore.
     * The use of space is strongly recommended because it specifies
     * the coordinate system. The underscore in the name is only
     * retained because it was used in earlier archived files. It
     * should not be used in new CIFs.
     * Ref: Hall, S. R. (1981). Acta Cryst. A37, 517-525
     * [See also International Tables for Crystallography,
     * Vol. B (1993) 1.4 Appendix B]
     * @return StrColumn
     */
    public StrColumn getNameHall() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("symmetry_space_group_name_Hall", "space_group_name_hall"));
    }

}