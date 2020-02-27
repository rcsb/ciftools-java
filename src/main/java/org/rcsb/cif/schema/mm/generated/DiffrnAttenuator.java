package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code", StrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * The scale factor applied when an intensity measurement is
     * reduced by an attenuator identified by _diffrn_attenuator.code.
     * The measured intensity must be multiplied by this scale to
     * convert it to the same scale as unattenuated intensities.
     * @return FloatColumn
     */
    public FloatColumn getScale() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale", FloatColumn::new) :
                getBinaryColumn("scale"));
    }

    /**
     * Material from which the attenuator is made.
     * @return StrColumn
     */
    public StrColumn getMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("material", StrColumn::new) :
                getBinaryColumn("material"));
    }
}
