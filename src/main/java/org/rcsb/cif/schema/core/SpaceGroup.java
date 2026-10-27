package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used to specify space group
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
 * Ref: International Tables for Crystallography (2016). Volume A,
 * Space-group symmetry, edited by M. I. Aroyo, 6th ed.
 * Chichester: John Wiley &amp; Sons.
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
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed.,
     * Tables 1.3.4.1 and 2.1.1.1.
     * Chichester: John Wiley &amp; Sons.
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
     * (2016) (IT) is used.  See IT Table 1.5.4.4, Section 2.1.3.15,
     * Table 2.1.3.11 and Fig. 2.1.3.4.  This item is not
     * computer-interpretable and cannot be used to define the
     * coordinate system.
     * 
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed.
     * Chichester: John Wiley &amp; Sons.
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
     * defined in Section 2.1.3.3 and given as the first item of each
     * space-group table in Chapter 2.3 of International Tables
     * for Crystallography Volume A (2016).
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
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed.
     * Chichester: John Wiley &amp; Sons.
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
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed.
     * Chichester: John Wiley &amp; Sons.
     * @return StrColumn
     */
    public StrColumn getNameSchoenflies() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_name_schoenflies"));
    }

    /**
     * The Hermann-Mauguin symbol of the type of that centrosymmetric
     * symmorphic space group to which the Patterson function belongs;
     * see Table 2.1.3.3 in International Tables for Crystallography
     * Volume A (2016).
     * 
     * A space separates each symbol referring to different axes.
     * Underscores may replace the spaces, but this use is discouraged.
     * Subscripts should appear without special symbols.
     * Bars should be given as negative signs before the number
     * to which they apply.
     * 
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed., Table 2.1.3.3.
     * Chichester: John Wiley &amp; Sons.
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
     * The reference setting of a given space group is the setting
     * chosen by the International Union of Crystallography as a
     * unique setting to which other settings can be referred
     * using the transformation matrix column pair given in
     * _space_group.transform_Pp_abc and _space_group.transform_Qq_xyz.
     * 
     * The settings are given in the enumeration list in the form
     * '_space_group.IT_number:_space_group.name_Hall'. The
     * space-group number defines the space-group type and the
     * Hall symbol specifies the symmetry generators referred to
     * the reference coordinate system.
     * 
     * The 230 reference settings chosen are identical to the settings
     * listed in International Tables for Crystallography Volume A
     * (2002). For the space groups where more than one setting is
     * given in International Tables, the following choices have
     * been made.
     * 
     * For monoclinic space groups: unique axis b and cell choice 1.
     * 
     * For space groups with two origins: origin choice 2 (origin at
     * inversion centre, indicated by adding :2 to the Hermann-Mauguin
     * symbol in the enumeration list).
     * 
     * For rhombohedral space groups: hexagonal axes (indicated by
     * adding :h to the Hermann-Mauguin symbol in the enumeration list).
     * 
     * Based on the symmetry table of R. W. Grosse-Kunstleve, ETH,
     * Zurich.
     * 
     * In the enumeration list, each reference setting is identified
     * by Schoenflies symbol and by the Hermann-Mauguin symbol,
     * augmented by :2 or :h suffixes as described above.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * 
     * Grosse-Kunstleve, R. W. (2001). Xtal System of
     * Crystallographic Programs, System Documentation.
     * https://xtal.sourceforge.net/man/symmetry.html
     * (or follow links to Documentation-&gt;Xtal Users Manual-&gt;Symmetry from
     * https://xtal.sourceforge.net).
     * @return StrColumn
     */
    public StrColumn getReferenceSetting() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_reference_setting"));
    }

    /**
     * This item specifies the transformation (P,p) of the basis
     * vectors from the setting used in the CIF (a,b,c) to the
     * reference setting given in _space_group.reference_setting
     * (a',b',c'). The value is given in Jones faithful notation
     * corresponding to the rotational matrix P combined with the
     * origin shift vector p in the expression:
     * 
     * (a',b',c') = (a,b,c)P + p.
     * 
     * P is a post-multiplication matrix of a row (a,b,c) of column
     * vectors. It is related to the inverse transformation (Q,q) by:
     * 
     * P = Q^-1^
     * p = Pq = -(Q^-1^)q.
     * 
     * These transformations are applied as follows:
     * 
     * atomic coordinates  (x',y',z') = Q(x,y,z) + q
     * Miller indices      (h',k',l') = (h,k,l)P
     * symmetry operations         W' = (Q,q)W(P,p)
     * basis vectors       (a',b',c') = (a,b,c)P + p
     * 
     * This item is given as a character string involving the
     * characters a, b and c with commas separating the expressions
     * for the a', b' and c' vectors. The numeric values may be
     * given as integers, fractions or real numbers. Multiplication
     * is implicit, division must be explicit. White space within
     * the string is optional.
     * @return StrColumn
     */
    public StrColumn getTransformPpAbc() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_transform_pp_abc"));
    }

    /**
     * This item specifies the transformation (Q,q) of the atomic
     * coordinates from the setting used in the CIF [(x,y,z) referred
     * to the basis vectors (a,b,c)] to the reference setting given in
     * _space_group.reference_setting [(x',y',z') referred to the
     * basis vectors (a',b',c')].
     * 
     * The value given in Jones faithful notation corresponds to the
     * rotational matrix Q combined with the origin shift vector q in
     * the expression:
     * 
     * (x',y',z') = Q(x,y,z) + q.
     * 
     * Q is a pre-multiplication matrix of the column vector (x,y,z).
     * It is related to the inverse transformation (P,p) by:
     * 
     * P = Q^-1^
     * p = Pq = -(Q^-1^)q,
     * 
     * where the P and Q transformations are applied as follows:
     * 
     * atomic coordinates  (x',y',z') = Q(x,y,z) + q
     * Miller indices      (h',k',l') = (h,k,l)P
     * symmetry operations         W' = (Q,q)W(P,p)
     * basis vectors       (a',b',c') = (a,b,c)P + p
     * 
     * This item is given as a character string involving the
     * characters x, y and z with commas separating the expressions
     * for the x', y' and z' components. The numeric values may be
     * given as integers, fractions or real numbers. Multiplication
     * is implicit, division must be explicit. White space within
     * the string is optional.
     * @return StrColumn
     */
    public StrColumn getTransformQqXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_transform_qq_xyz"));
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
     * defined in Section 2.1.3.3 and given as the second item of the
     * second line of each of the space-group tables of Chapter 2.3 of
     * International Tables for Crystallography Volume A (2016).
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
     * Ref: International Tables for Crystallography (2016). Volume A,
     * Space-group symmetry, edited by M. I. Aroyo, 6th ed.
     * Chichester: John Wiley &amp; Sons.
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