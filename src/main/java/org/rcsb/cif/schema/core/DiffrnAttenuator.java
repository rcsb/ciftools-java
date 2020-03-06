package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the attenuators used in the
 * diffraction source.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnAttenuator extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_attenuator";

    public DiffrnAttenuator(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifying a particular attenuator setting; referenced by the
     * _diffrn_refln.attenuator_code which is stored with the intensities.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_attenuator_code"));
    }

    /**
     * Description of the material from which the attenuator is made.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_attenuator_material"));
    }

    /**
     * The scale factor applied to a measured intensity if it is reduced by
     * an attenuator identified by _diffrn_attenuator.code.
     * @return FloatColumn
     */
    public FloatColumn getScale() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_attenuator_scale"));
    }

}