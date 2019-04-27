package org.rcsb.cif.model.diffrnattenuator;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * The scale factor applied when an intensity measurement is
     * reduced by an attenuator identified by _diffrn_attenuator.code.
     * The measured intensity must be multiplied by this scale to
     * convert it to the same scale as unattenuated intensities.
     * @return Scale
     */
    public Scale getScale() {
        return (Scale) (isText ? textFields.computeIfAbsent("scale",
                Scale::new) : getBinaryColumn("scale"));
    }

    /**
     * Material from which the attenuator is made.
     * @return Material
     */
    public Material getMaterial() {
        return (Material) (isText ? textFields.computeIfAbsent("material",
                Material::new) : getBinaryColumn("material"));
    }
}
