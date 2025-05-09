package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroupWyckoff extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "space_group_wyckoff";

    public SpaceGroupWyckoff(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Coordinates of one site of a Wyckoff position expressed in
     * terms of its fractional coordinates (x,y,z) in the unit cell.
     * To generate the coordinates of all sites of this Wyckoff
     * position, it is necessary to multiply these coordinates by the
     * symmetry operations stored in _space_group_symop.operation_xyz.
     * @return StrColumn
     */
    public StrColumn getCoordsXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_wyckoff_coords_xyz"));
    }

    /**
     * An arbitrary code that is unique to a particular Wyckoff position.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_wyckoff_id"));
    }

    /**
     * The Wyckoff letter associated with this position, as given in
     * International Tables for Crystallography Volume A. The
     * enumeration values '\a' and α are equivalent, and correspond to
     * the Greek letter 'alpha' used in International Tables.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getLetter() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_wyckoff_letter"));
    }

    /**
     * The multiplicity of this Wyckoff position as given in
     * International Tables Volume A. It is the number of equivalent
     * sites per conventional unit cell.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return IntColumn
     */
    public IntColumn getMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getColumn("space_group_wyckoff_multiplicity"));
    }

    /**
     * The subgroup of the space group that leaves the point fixed.
     * It is isomorphic to a subgroup of the point group of the
     * space group. The site-symmetry symbol indicates the symmetry
     * in the symmetry direction determined by the Hermann-Mauguin
     * symbol of the space group (see International Tables for
     * Crystallography Volume A, Section 2.2.12).
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_wyckoff_site_symmetry"));
    }

}