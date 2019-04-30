package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_ATTENUATOR category record details
 * about the diffraction attenuator scales employed.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DiffrnAttenuator extends BaseCategory {
    public DiffrnAttenuator(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnAttenuator(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnAttenuator(String name) {
        super(name);
    }

    /**
     * A code associated with a particular attenuator setting. This
     * code is referenced by the _diffrn_refln.attenuator_code which is
     * stored with the diffraction data. See _diffrn_attenuator.scale.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("code", SingleRowStrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * The scale factor applied when an intensity measurement is
     * reduced by an attenuator identified by _diffrn_attenuator.code.
     * The measured intensity must be multiplied by this scale to
     * convert it to the same scale as unattenuated intensities.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScale() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scale", SingleRowFloatColumn::new) :
                getBinaryColumn("scale"));
    }

    /**
     * Material from which the attenuator is made.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("material", SingleRowStrColumn::new) :
                getBinaryColumn("material"));
    }
}
