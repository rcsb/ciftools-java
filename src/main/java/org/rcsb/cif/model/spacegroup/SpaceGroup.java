package org.rcsb.cif.model.spacegroup;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpaceGroup extends BaseCategory {
    public SpaceGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public SpaceGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public SpaceGroup(String name) {
        super(name);
    }

    /**
     * The name of the system of geometric crystal classes of space
     * groups (crystal system) to which the space group belongs.
     * Note that rhombohedral space groups belong to the
     * trigonal system.
     * @return CrystalSystem
     */
    public CrystalSystem getCrystalSystem() {
        return (CrystalSystem) (isText ? textFields.computeIfAbsent("crystal_system",
                CrystalSystem::new) : getBinaryColumn("crystal_system"));
    }

    /**
     * This is the unique identifier for the SPACE_GROUP category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The number as assigned in International Tables for
     * Crystallography Vol. A, specifying the proper affine class (i.e.
     * the orientation-preserving affine class) of space groups
     * (crystallographic space-group type) to which the space group
     * belongs.  This number defines the space-group type but not
     * the coordinate system in which it is expressed.
     * @return ITNumber
     */
    public ITNumber getITNumber() {
        return (ITNumber) (isText ? textFields.computeIfAbsent("IT_number",
                ITNumber::new) : getBinaryColumn("IT_number"));
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
     * @return NameHall
     */
    public NameHall getNameHall() {
        return (NameHall) (isText ? textFields.computeIfAbsent("name_Hall",
                NameHall::new) : getBinaryColumn("name_Hall"));
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
     * @return NameH_MAlt
     */
    public NameH_MAlt getNameH_MAlt() {
        return (NameH_MAlt) (isText ? textFields.computeIfAbsent("name_H-M_alt",
                NameH_MAlt::new) : getBinaryColumn("name_H-M_alt"));
    }
}
