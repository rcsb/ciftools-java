package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the source
 * of elemental composition information used in crystallographic
 * structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomAnalyticalSource extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_analytical_source";

    public AtomAnalyticalSource(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The make, model or name of the equipment used to determine the
     * elemental composition.
     * @return StrColumn
     */
    public StrColumn getEquipmentMake() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_source_equipment_make"));
    }

    /**
     * Arbitrary label uniquely identifying the source of an elemental
     * composition value. This value is used by _atom_analytical.meas_id
     * to link individual composition values to their corresponding
     * technique of determination.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_source_id"));
    }

    /**
     * Text describing the equipment or conditions under which the
     * data were collected that are not able to be captured using
     * _atom_analytical_source.equipment_make or
     * _atom_analytical_source.technique.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_source_special_details"));
    }

    /**
     * Succinct text or acronym describing the experimental technique used
     * to find the elemental composition.
     * 
     * If further details are required to properly describe the experimental
     * technique, or the given acronym is not in common use, use
     * _atom_analytical_source.special_details.
     * @return StrColumn
     */
    public StrColumn getTechnique() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_source_technique"));
    }

}