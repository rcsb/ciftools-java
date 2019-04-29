package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_PACK_GEN category record details about
 * the generation of the packing picture(s).
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructPackGen extends BaseCategory {
    public PdbxStructPackGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructPackGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructPackGen(String name) {
        super(name);
    }

    /**
     * Ordinal identifier
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM
     * category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_pack_gen.asym_id to generate a
     * packing picture.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry", StrColumn::new) :
                getBinaryColumn("symmetry"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorRed() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("color_red", FloatColumn::new) :
                getBinaryColumn("color_red"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorGreen() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("color_green", FloatColumn::new) :
                getBinaryColumn("color_green"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return FloatColumn
     */
    public FloatColumn getColorBlue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("color_blue", FloatColumn::new) :
                getBinaryColumn("color_blue"));
    }

    /**
     * Crystal type
     * @return IntColumn
     */
    public IntColumn getCrystalType() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("crystal_type", IntColumn::new) :
                getBinaryColumn("crystal_type"));
    }

    /**
     * Packing type
     * @return IntColumn
     */
    public IntColumn getPackingType() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("packing_type", IntColumn::new) :
                getBinaryColumn("packing_type"));
    }
}
