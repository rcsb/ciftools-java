package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_PACK_GEN category record details about
 * the generation of the packing picture(s).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructPackGen extends DelegatingCategory {
    public PdbxStructPackGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "asym_id":
                return getAsymId();
            case "symmetry":
                return getSymmetry();
            case "color_red":
                return getColorRed();
            case "color_green":
                return getColorGreen();
            case "color_blue":
                return getColorBlue();
            case "crystal_type":
                return getCrystalType();
            case "packing_type":
                return getPackingType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal identifier
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM
     * category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_pack_gen.asym_id to generate a
     * packing picture.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorRed() {
        return delegate.getColumn("color_red", DelegatingFloatColumn::new);
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorGreen() {
        return delegate.getColumn("color_green", DelegatingFloatColumn::new);
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorBlue() {
        return delegate.getColumn("color_blue", DelegatingFloatColumn::new);
    }

    /**
     * Crystal type
     * @return IntColumn
     */
    public IntColumn getCrystalType() {
        return delegate.getColumn("crystal_type", DelegatingIntColumn::new);
    }

    /**
     * Packing type
     * @return IntColumn
     */
    public IntColumn getPackingType() {
        return delegate.getColumn("packing_type", DelegatingIntColumn::new);
    }

}