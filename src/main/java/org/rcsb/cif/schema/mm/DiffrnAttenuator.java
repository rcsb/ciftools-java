package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_ATTENUATOR category record details
 * about the diffraction attenuator scales employed.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnAttenuator extends DelegatingCategory {
    public DiffrnAttenuator(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "code":
                return getCode();
            case "scale":
                return getScale();
            case "material":
                return getMaterial();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A code associated with a particular attenuator setting. This
     * code is referenced by the _diffrn_refln.attenuator_code which is
     * stored with the diffraction data. See _diffrn_attenuator.scale.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return delegate.getColumn("code", DelegatingStrColumn::new);
    }

    /**
     * The scale factor applied when an intensity measurement is
     * reduced by an attenuator identified by _diffrn_attenuator.code.
     * The measured intensity must be multiplied by this scale to
     * convert it to the same scale as unattenuated intensities.
     * @return FloatColumn
     */
    public FloatColumn getScale() {
        return delegate.getColumn("scale", DelegatingFloatColumn::new);
    }

    /**
     * Material from which the attenuator is made.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return delegate.getColumn("material", DelegatingStrColumn::new);
    }

}