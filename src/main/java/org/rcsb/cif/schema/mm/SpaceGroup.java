package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Contains all the data items that refer to the space group as a
 * whole, such as its name or crystal system. They may be looped,
 * for example, in a list of space groups and their properties.
 * 
 * Only a subset of the SPACE_GROUP category items appear in
 * this dictionary.  The remainder are found in the symmetry CIF
 * dictionary.
 * 
 * Space-group types are identified by their number as given in
 * International Tables for Crystallography Vol. A. Specific
 * settings of the space groups can be identified either by their
 * Hall symbol or by specifying their symmetry operations.
 * 
 * The commonly used Hermann-Mauguin symbol determines the
 * space-group type uniquely but several different Hermann-Mauguin
 * symbols may refer to the same space-group type. A Hermann-Mauguin
 * symbol contains information on the choice of the basis, but not
 * on the choice of origin.  Different formats for the
 * Hermann-Mauguin symbol are found in the symmetry CIF dictionary.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroup extends DelegatingCategory {
    public SpaceGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_system":
                return getCrystalSystem();
            case "id":
                return getId();
            case "IT_number":
                return getITNumber();
            case "name_Hall":
                return getNameHall();
            case "name_H-M_alt":
                return getNameH_MAlt();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The name of the system of geometric crystal classes of space
     * groups (crystal system) to which the space group belongs.
     * Note that rhombohedral space groups belong to the
     * trigonal system.
     * @return StrColumn
     */
    public StrColumn getCrystalSystem() {
        return delegate.getColumn("crystal_system", DelegatingStrColumn::new);
    }

    /**
     * This is the unique identifier for the SPACE_GROUP category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The number as assigned in International Tables for
     * Crystallography Vol. A, specifying the proper affine class (i.e.
     * the orientation-preserving affine class) of space groups
     * (crystallographic space-group type) to which the space group
     * belongs.  This number defines the space-group type but not
     * the coordinate system in which it is expressed.
     * @return IntColumn
     */
    public IntColumn getITNumber() {
        return delegate.getColumn("IT_number", DelegatingIntColumn::new);
    }

    /**
     * Space-group symbol defined by Hall.
     * 
     * Each component of the space-group name is separated by a
     * space or an underscore.  The use of a space is strongly
     * recommended.  The underscore is only retained because it
     * was used in old CIFs.  It should not be
     * used in new CIFs.
     * 
     * _space_group.name_Hall uniquely defines the space group and
     * its reference to a particular coordinate system.
     * 
     * Ref: Hall, S. R. (1981). Acta Cryst. A37, 517-525; erratum
     * (1981), A37, 921.
     * [See also International Tables for Crystallography
     * Vol. B (2001), Chapter 1.4, Appendix 1.4.2.]
     * @return StrColumn
     */
    public StrColumn getNameHall() {
        return delegate.getColumn("name_Hall", DelegatingStrColumn::new);
    }

    /**
     * _space_group.name_H-M_alt allows any Hermann-Mauguin symbol
     * to be given. The way in which this item is used is determined
     * by the user and in general is not intended to be interpreted by
     * computer. It may, for example, be used to give one of the
     * extended Hermann-Mauguin symbols given in Table 4.3.2.1 of
     * International Tables for Crystallography Vol. A (2002) or
     * a Hermann-Mauguin symbol for a conventional or unconventional
     * setting.
     * 
     * Each component of the space-group name is separated by a
     * space or an underscore. The use of a space is strongly
     * recommended.  The underscore is only retained because it
     * was used in old CIFs. It should not be
     * used in new CIFs. Subscripts should appear without special
     * symbols. Bars should be given as negative signs before the
     * numbers to which they apply.
     * 
     * The commonly used Hermann-Mauguin symbol determines the space-
     * group type uniquely but a given space-group type may be
     * described by more than one Hermann-Mauguin symbol. The space-
     * group type is best described using _space_group.IT_number.
     * 
     * The Hermann-Mauguin symbol may contain information on the
     * choice of basis, but not on the choice of origin. To
     * define the setting uniquely, use _space_group.name_Hall or
     * list the symmetry operations.
     * @return StrColumn
     */
    public StrColumn getNameH_MAlt() {
        return delegate.getColumn("name_H-M_alt", DelegatingStrColumn::new);
    }

}