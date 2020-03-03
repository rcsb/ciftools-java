package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe atomic type information
 * used in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomType extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_type";

    public AtomType(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Mass percentage of this atom type derived from chemical analysis.
     * @return FloatColumn
     */
    public FloatColumn getAnalyticalMassPercent() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_analytical_mass_percent"));
    }

    /**
     * 
     * Mass of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getAtomicMass() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_atomic_mass"));
    }

    /**
     * 
     * Atomic number of this atom type.
     * @return IntColumn
     */
    public IntColumn getAtomicNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_atomic_number"));
    }

    /**
     * 
     * A description of the atom(s) designated by this atom type. In
     * most cases this will be the element name and oxidation state of
     * a single atom  species. For disordered or nonstoichiometric
     * structures it will describe a combination of atom species.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_description"));
    }

    /**
     * 
     * The display colour assigned to this atom type. Note that the
     * possible colours are enumerated in the display_colour list
     * category of items.
     * @return StrColumn
     */
    public StrColumn getDisplayColour() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_display_colour"));
    }

    /**
     * 
     * Number of electrons in this atom type.
     * @return IntColumn
     */
    public IntColumn getElectronCount() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_electron_count"));
    }

    /**
     * 
     * Element symbol for of this atom type. The default value is extracted
     * from the ion-to-element enumeration_default list using the index
     * value of _atom_type.symbol.
     * @return StrColumn
     */
    public StrColumn getElementSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_element_symbol"));
    }

    /**
     * 
     * Value is a unique key to a set of ATOM_TYPE items
     * in a looped list.
     * @return StrColumn
     */
    public StrColumn getKey() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_key"));
    }

    /**
     * 
     * Total number of atoms of this atom type in the unit cell.
     * @return FloatColumn
     */
    public FloatColumn getNumberInCell() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_number_in_cell"));
    }

    /**
     * 
     * Formal oxidation state of this atom type in the structure.
     * @return IntColumn
     */
    public IntColumn getOxidationNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_oxidation_number"));
    }

    /**
     * 
     * The effective intra-molecular bonding radius of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusBond() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_radius_bond"));
    }

    /**
     * 
     * The effective inter-molecular bonding radius of this atom type.
     * @return FloatColumn
     */
    public FloatColumn getRadiusContact() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_radius_contact"));
    }

    /**
     * 
     * The identity of the atom specie(s) representing this atom type.
     * Normally this code is the element symbol followed by the charge
     * if there is one. The symbol may be composed of any character except
     * an underline or a blank, with the proviso that digits designate an
     * oxidation state and must be followed by a + or - character.
     * @return StrColumn
     */
    public StrColumn getSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_symbol"));
    }
}
