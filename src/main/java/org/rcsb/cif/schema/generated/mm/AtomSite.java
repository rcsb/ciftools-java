package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.schema.DelegatingCategory;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITE category record details about
 * the atom sites in a macromolecular crystal structure, such as
 * the positional coordinates, atomic displacement parameters,
 * magnetic moments and directions.
 * 
 * The data items for describing anisotropic atomic
 * displacement factors are only used if the corresponding items
 * are not given in the ATOM_SITE_ANISOTROP category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class AtomSite extends DelegatingCategory {
    public AtomSite(Category delegate) {
        super(delegate);
    }

    public FloatColumn getCartnX() {
        return getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    public IntColumn getLabelSeqId() {
        return getColumn("label_seq_id", DelegatingIntColumn::new);
    }
}
