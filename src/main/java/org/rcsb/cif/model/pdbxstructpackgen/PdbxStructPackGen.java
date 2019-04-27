package org.rcsb.cif.model.pdbxstructpackgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM
     * category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * atom set specified by _pdbx_struct_pack_gen.asym_id to generate a
     * packing picture.
     * @return Symmetry
     */
    public Symmetry getSymmetry() {
        return (Symmetry) (isText ? textFields.computeIfAbsent("symmetry",
                Symmetry::new) : getBinaryColumn("symmetry"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return ColorRed
     */
    public ColorRed getColorRed() {
        return (ColorRed) (isText ? textFields.computeIfAbsent("color_red",
                ColorRed::new) : getBinaryColumn("color_red"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return ColorGreen
     */
    public ColorGreen getColorGreen() {
        return (ColorGreen) (isText ? textFields.computeIfAbsent("color_green",
                ColorGreen::new) : getBinaryColumn("color_green"));
    }

    /**
     * Gives rgb color code in order to produce atlas entry packing picture.
     * @return ColorBlue
     */
    public ColorBlue getColorBlue() {
        return (ColorBlue) (isText ? textFields.computeIfAbsent("color_blue",
                ColorBlue::new) : getBinaryColumn("color_blue"));
    }

    /**
     * Crystal type
     * @return CrystalType
     */
    public CrystalType getCrystalType() {
        return (CrystalType) (isText ? textFields.computeIfAbsent("crystal_type",
                CrystalType::new) : getBinaryColumn("crystal_type"));
    }

    /**
     * Packing type
     * @return PackingType
     */
    public PackingType getPackingType() {
        return (PackingType) (isText ? textFields.computeIfAbsent("packing_type",
                PackingType::new) : getBinaryColumn("packing_type"));
    }
}
