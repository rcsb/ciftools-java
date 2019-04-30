package org.rcsb.cif.model.generated;

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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAnnotationDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("annotation_details", SingleRowStrColumn::new) :
                getBinaryColumn("annotation_details"));
    }

    /**
     * The map axis that corresponds to Columns.
     * (CCP4 HEADER WORD 17 MAPC 1=x, 2=y, 3=z)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAxisOrderFast() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("axis_order_fast", SingleRowStrColumn::new) :
                getBinaryColumn("axis_order_fast"));
    }

    /**
     * The map axis that corresponds to Rows.
     * (CCP4 map header word 18 MAPR 1=x, 2=y, 3=z)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAxisOrderMedium() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("axis_order_medium", SingleRowStrColumn::new) :
                getBinaryColumn("axis_order_medium"));
    }

    /**
     * The map axis that corresponds to Sections.
     * (CCP4 map header word 19 MAPS 1=x, 2=y, 3=z)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAxisOrderSlow() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("axis_order_slow", SingleRowStrColumn::new) :
                getBinaryColumn("axis_order_slow"));
    }

    /**
     * Map unit cell length parameter a.
     * (CCP4 map header word 11)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellA() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_a", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_a"));
    }

    /**
     * Map unit cell length parameter b.
     * (CCP4 map header word 12)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellB() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_b", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_b"));
    }

    /**
     * Map unit cell length parameter c.
     * (CCP4 map header word 13)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellC() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_c", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_c"));
    }

    /**
     * Value of map unit cell angle parameter alpha in degrees.
     * (CCP4 map header word 14)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellAlpha() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_alpha", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_alpha"));
    }

    /**
     * Value of map unit cell angle parameter beta in degrees.
     * (CCP4 map header word 15)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellBeta() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_beta", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_beta"));
    }

    /**
     * Value of map unit cell angle parameter gamma in degrees.
     * (CCP4 map header word 16)
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCellGamma() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("cell_gamma", SingleRowFloatColumn::new) :
                getBinaryColumn("cell_gamma"));
    }

    /**
     * recommended contour level for viewing the map
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getContourLevel() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("contour_level", SingleRowFloatColumn::new) :
                getBinaryColumn("contour_level"));
    }

    /**
     * source of the recommended contour level
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getContourLevelSource() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("contour_level_source", SingleRowStrColumn::new) :
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_type", SingleRowStrColumn::new) :
                getBinaryColumn("data_type"));
    }

    /**
     * The number of columns in the map.
     * (CCP4 map header word 1 NC)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDimensionsCol() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("dimensions_col", SingleRowIntColumn::new) :
                getBinaryColumn("dimensions_col"));
    }

    /**
     * The number of rows in the map.
     * (CCP4 map header word 2 NR)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDimensionsRow() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("dimensions_row", SingleRowIntColumn::new) :
                getBinaryColumn("dimensions_row"));
    }

    /**
     * The number of sections in the map.
     * (CCP4 map header word 3 NS)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDimensionsSec() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("dimensions_sec", SingleRowIntColumn::new) :
                getBinaryColumn("dimensions_sec"));
    }

    /**
     * map file endian type
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndianType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("endian_type", SingleRowStrColumn::new) :
                getBinaryColumn("endian_type"));
    }

    /**
     * Map file name.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file", SingleRowStrColumn::new) :
                getBinaryColumn("file"));
    }

    /**
     * map format
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFormat() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("format", SingleRowStrColumn::new) :
                getBinaryColumn("format"));
    }

    /**
     * Unique id for the EMD_MAP category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("id", SingleRowIntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifies the archive file partition number of a primary map,
     * half map, additional map, or mask.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPartition() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("partition", SingleRowIntColumn::new) :
                getBinaryColumn("partition"));
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * text stored in the label field of the CCP4 map header
     * (WORDS 57-256)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLabel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("label", SingleRowStrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * The final column position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived  =  .origin_col + .dimensions_col -1)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLimitCol() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("limit_col", SingleRowIntColumn::new) :
                getBinaryColumn("limit_col"));
    }

    /**
     * The final row position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived =  .origin_row + .dimensions_row -1)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLimitRow() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("limit_row", SingleRowIntColumn::new) :
                getBinaryColumn("limit_row"));
    }

    /**
     * The final section position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived -- .origin_sec + .dimensions_sec  -1)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getLimitSec() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("limit_sec", SingleRowIntColumn::new) :
                getBinaryColumn("limit_sec"));
    }

    /**
     * The position of the first column of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 5 NCSTART)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOriginCol() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("origin_col", SingleRowIntColumn::new) :
                getBinaryColumn("origin_col"));
    }

    /**
     * The position of the first row of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 6 NRSTART)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOriginRow() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("origin_row", SingleRowIntColumn::new) :
                getBinaryColumn("origin_row"));
    }

    /**
     * The position of the first section of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 7 NSSTART)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOriginSec() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("origin_sec", SingleRowIntColumn::new) :
                getBinaryColumn("origin_sec"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingX() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_x", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingY() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_y", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingZ() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_z", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_z"));
    }

    /**
     * map storage size in Kilobytes (before compression)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSizeKb() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("size_kb", SingleRowIntColumn::new) :
                getBinaryColumn("size_kb"));
    }

    /**
     * The number of intervals per cell repeat in X.
     * (CCP4 map header word 8 NX)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSpacingX() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("spacing_x", SingleRowIntColumn::new) :
                getBinaryColumn("spacing_x"));
    }

    /**
     * The number of intervals per cell repeat in Y.
     * (CCP4 map header word 9 NY)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSpacingY() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("spacing_y", SingleRowIntColumn::new) :
                getBinaryColumn("spacing_y"));
    }

    /**
     * The number of intervals per cell repeat in Z.
     * (CCP4 map header word 10 NZ)
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSpacingZ() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("spacing_z", SingleRowIntColumn::new) :
                getBinaryColumn("spacing_z"));
    }

    /**
     * Mean (average) density value of the map.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getStatisticsAverage() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("statistics_average", SingleRowFloatColumn::new) :
                getBinaryColumn("statistics_average"));
    }

    /**
     * Maximum density value of the map.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getStatisticsMaximum() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("statistics_maximum", SingleRowFloatColumn::new) :
                getBinaryColumn("statistics_maximum"));
    }

    /**
     * Minimum density value of the map.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getStatisticsMinimum() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("statistics_minimum", SingleRowFloatColumn::new) :
                getBinaryColumn("statistics_minimum"));
    }

    /**
     * The standard deviation of the map density values.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getStatisticsStd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("statistics_std", SingleRowFloatColumn::new) :
                getBinaryColumn("statistics_std"));
    }

    /**
     * The space group number for the map.
     * The value is 1 unless the sample is crystalline.
     * (CCP4 map header word 23 ISPG)
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSymmetrySpaceGroup() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("symmetry_space_group", SingleRowStrColumn::new) :
                getBinaryColumn("symmetry_space_group"));
    }

    /**
     * map format
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
