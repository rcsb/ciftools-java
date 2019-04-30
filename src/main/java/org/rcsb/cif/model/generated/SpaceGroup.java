package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalSystem() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_system", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_system"));
    }

    /**
     * This is the unique identifier for the SPACE_GROUP category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number as assigned in International Tables for
     * Crystallography Vol. A, specifying the proper affine class (i.e.
     * the orientation-preserving affine class) of space groups
     * (crystallographic space-group type) to which the space group
     * belongs.  This number defines the space-group type but not
     * the coordinate system in which it is expressed.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getITNumber() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("IT_number", SingleRowIntColumn::new) :
                getBinaryColumn("IT_number"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameHall() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_Hall", SingleRowStrColumn::new) :
                getBinaryColumn("name_Hall"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNameH_MAlt() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name_H-M_alt", SingleRowStrColumn::new) :
                getBinaryColumn("name_H-M_alt"));
    }
}
