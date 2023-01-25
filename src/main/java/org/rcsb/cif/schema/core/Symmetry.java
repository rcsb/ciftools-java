package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Symmetry extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "symmetry";

    public Symmetry(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * This data item should not be used and is DEPRECATED as it is
     * ambiguous.
     * 
     * The original definition is as follows:
     * 
     * The cell settings for this space-group symmetry.
     * @return StrColumn
     */
    public StrColumn getCellSetting() {
        return new DelegatingStrColumn(parentBlock.getColumn("symmetry_cell_setting"));
    }

    /**
     * The number as assigned in International Tables for Crystallography
     * Vol. A, specifying the proper affine class (i.e. the orientation
     * preserving affine class) of space groups (crystallographic space
     * group type) to which the space group belongs. This number defines
     * the space group type but not the coordinate system expressed.
     * @return IntColumn
     */
    public IntColumn getIntTablesNumber() {
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
    public StrColumn getSpaceGroupNameH_M() {
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
    public StrColumn getSpaceGroupNameHall() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("symmetry_space_group_name_Hall", "space_group_name_hall"));
    }

}