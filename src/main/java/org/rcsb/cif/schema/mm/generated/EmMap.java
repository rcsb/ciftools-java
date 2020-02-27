package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_MAP category record parameters of the CCP4 binary-format map file header
 * (see ftp://ftp.wwpdb.org/pub/emdb/doc/map_format/EMDB_mapFormat_v1.0.pdf),
 * parameters derived from the map header, pixel size, contour level, and annotation details from the depositor.
 * The map is a three-dimensional array of data-values of the same data-type.
 * Important parameters are data-type and  array size in three dimensions
 * (i.e. the number of columns, rows and sections).
 * Columns are the fastest changing, followed by rows and sections.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmMap extends BaseCategory {
    public EmMap(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmMap(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmMap(String name) {
        super(name);
    }

    /**
     * map annotation details
     * @return StrColumn
     */
    public StrColumn getAnnotationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotation_details", StrColumn::new) :
                getBinaryColumn("annotation_details"));
    }

    /**
     * The map axis that corresponds to Columns.
     * (CCP4 HEADER WORD 17 MAPC 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderFast() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("axis_order_fast", StrColumn::new) :
                getBinaryColumn("axis_order_fast"));
    }

    /**
     * The map axis that corresponds to Rows.
     * (CCP4 map header word 18 MAPR 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderMedium() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("axis_order_medium", StrColumn::new) :
                getBinaryColumn("axis_order_medium"));
    }

    /**
     * The map axis that corresponds to Sections.
     * (CCP4 map header word 19 MAPS 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderSlow() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("axis_order_slow", StrColumn::new) :
                getBinaryColumn("axis_order_slow"));
    }

    /**
     * Map unit cell length parameter a.
     * (CCP4 map header word 11)
     * @return FloatColumn
     */
    public FloatColumn getCellA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_a", FloatColumn::new) :
                getBinaryColumn("cell_a"));
    }

    /**
     * Map unit cell length parameter b.
     * (CCP4 map header word 12)
     * @return FloatColumn
     */
    public FloatColumn getCellB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_b", FloatColumn::new) :
                getBinaryColumn("cell_b"));
    }

    /**
     * Map unit cell length parameter c.
     * (CCP4 map header word 13)
     * @return FloatColumn
     */
    public FloatColumn getCellC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_c", FloatColumn::new) :
                getBinaryColumn("cell_c"));
    }

    /**
     * Value of map unit cell angle parameter alpha in degrees.
     * (CCP4 map header word 14)
     * @return FloatColumn
     */
    public FloatColumn getCellAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_alpha", FloatColumn::new) :
                getBinaryColumn("cell_alpha"));
    }

    /**
     * Value of map unit cell angle parameter beta in degrees.
     * (CCP4 map header word 15)
     * @return FloatColumn
     */
    public FloatColumn getCellBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_beta", FloatColumn::new) :
                getBinaryColumn("cell_beta"));
    }

    /**
     * Value of map unit cell angle parameter gamma in degrees.
     * (CCP4 map header word 16)
     * @return FloatColumn
     */
    public FloatColumn getCellGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cell_gamma", FloatColumn::new) :
                getBinaryColumn("cell_gamma"));
    }

    /**
     * recommended contour level for viewing the map
     * @return FloatColumn
     */
    public FloatColumn getContourLevel() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("contour_level", FloatColumn::new) :
                getBinaryColumn("contour_level"));
    }

    /**
     * source of the recommended contour level
     * @return StrColumn
     */
    public StrColumn getContourLevelSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("contour_level_source", StrColumn::new) :
                getBinaryColumn("contour_level_source"));
    }

    /**
     * The map data_type describes the data structure of the map voxels.
     * (CCP4 map header word 4 MODE)
     * EMDB currently holds MODE=0,1,and 2 maps; the majority are MODE=2.
     * MAPS with MODES other than 2 and 0 may not work in CCP4 programs.
     * MODE = 0: 8 bits, density stored as a signed byte (-128 to 127, ISO/IEC 10967)
     * MODE = 1: 16 bits, density stored as a signed integer (-32768 to 32767, ISO/IEC 10967)
     * MODE = 2: 32 bits, density stored as a floating point number (IEEE 754)
     * @return StrColumn
     */
    public StrColumn getDataType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_type", StrColumn::new) :
                getBinaryColumn("data_type"));
    }

    /**
     * The number of columns in the map.
     * (CCP4 map header word 1 NC)
     * @return IntColumn
     */
    public IntColumn getDimensionsCol() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dimensions_col", IntColumn::new) :
                getBinaryColumn("dimensions_col"));
    }

    /**
     * The number of rows in the map.
     * (CCP4 map header word 2 NR)
     * @return IntColumn
     */
    public IntColumn getDimensionsRow() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dimensions_row", IntColumn::new) :
                getBinaryColumn("dimensions_row"));
    }

    /**
     * The number of sections in the map.
     * (CCP4 map header word 3 NS)
     * @return IntColumn
     */
    public IntColumn getDimensionsSec() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dimensions_sec", IntColumn::new) :
                getBinaryColumn("dimensions_sec"));
    }

    /**
     * map file endian type
     * @return StrColumn
     */
    public StrColumn getEndianType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("endian_type", StrColumn::new) :
                getBinaryColumn("endian_type"));
    }

    /**
     * Map file name.
     * @return StrColumn
     */
    public StrColumn getFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file", StrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * map format
     * @return StrColumn
     */
    public StrColumn getFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("format", StrColumn::new) :
                getBinaryColumn("format"));
    }

    /**
     * Unique id for the EMD_MAP category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifies the archive file partition number of a primary map,
     * half map, additional map, or mask.
     * @return IntColumn
     */
    public IntColumn getPartition() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("partition", IntColumn::new) :
                getBinaryColumn("partition"));
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * text stored in the label field of the CCP4 map header
     * (WORDS 57-256)
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * The final column position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived  =  .origin_col + .dimensions_col -1)
     * @return IntColumn
     */
    public IntColumn getLimitCol() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_col", IntColumn::new) :
                getBinaryColumn("limit_col"));
    }

    /**
     * The final row position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived =  .origin_row + .dimensions_row -1)
     * @return IntColumn
     */
    public IntColumn getLimitRow() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_row", IntColumn::new) :
                getBinaryColumn("limit_row"));
    }

    /**
     * The final section position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived -- .origin_sec + .dimensions_sec  -1)
     * @return IntColumn
     */
    public IntColumn getLimitSec() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("limit_sec", IntColumn::new) :
                getBinaryColumn("limit_sec"));
    }

    /**
     * The position of the first column of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 5 NCSTART)
     * @return IntColumn
     */
    public IntColumn getOriginCol() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("origin_col", IntColumn::new) :
                getBinaryColumn("origin_col"));
    }

    /**
     * The position of the first row of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 6 NRSTART)
     * @return IntColumn
     */
    public IntColumn getOriginRow() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("origin_row", IntColumn::new) :
                getBinaryColumn("origin_row"));
    }

    /**
     * The position of the first section of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 7 NSSTART)
     * @return IntColumn
     */
    public IntColumn getOriginSec() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("origin_sec", IntColumn::new) :
                getBinaryColumn("origin_sec"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_x", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_y", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_z", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_z"));
    }

    /**
     * map storage size in Kilobytes (before compression)
     * @return IntColumn
     */
    public IntColumn getSizeKb() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("size_kb", IntColumn::new) :
                getBinaryColumn("size_kb"));
    }

    /**
     * The number of intervals per cell repeat in X.
     * (CCP4 map header word 8 NX)
     * @return IntColumn
     */
    public IntColumn getSpacingX() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spacing_x", IntColumn::new) :
                getBinaryColumn("spacing_x"));
    }

    /**
     * The number of intervals per cell repeat in Y.
     * (CCP4 map header word 9 NY)
     * @return IntColumn
     */
    public IntColumn getSpacingY() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spacing_y", IntColumn::new) :
                getBinaryColumn("spacing_y"));
    }

    /**
     * The number of intervals per cell repeat in Z.
     * (CCP4 map header word 10 NZ)
     * @return IntColumn
     */
    public IntColumn getSpacingZ() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spacing_z", IntColumn::new) :
                getBinaryColumn("spacing_z"));
    }

    /**
     * Mean (average) density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsAverage() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("statistics_average", FloatColumn::new) :
                getBinaryColumn("statistics_average"));
    }

    /**
     * Maximum density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsMaximum() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("statistics_maximum", FloatColumn::new) :
                getBinaryColumn("statistics_maximum"));
    }

    /**
     * Minimum density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsMinimum() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("statistics_minimum", FloatColumn::new) :
                getBinaryColumn("statistics_minimum"));
    }

    /**
     * The standard deviation of the map density values.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsStd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("statistics_std", FloatColumn::new) :
                getBinaryColumn("statistics_std"));
    }

    /**
     * The space group number for the map.
     * The value is 1 unless the sample is crystalline.
     * (CCP4 map header word 23 ISPG)
     * @return StrColumn
     */
    public StrColumn getSymmetrySpaceGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_space_group", StrColumn::new) :
                getBinaryColumn("symmetry_space_group"));
    }

    /**
     * map format
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
