package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EMD_MAP category record parameters of the CCP4 binary-format map file header
 * (see ftp://ftp.wwpdb.org/pub/emdb/doc/map_format/EMDB_mapFormat_v1.0.pdf),
 * parameters derived from the map header, pixel size, contour level, and annotation details from the depositor.
 * The map is a three-dimensional array of data-values of the same data-type.
 * Important parameters are data-type and  array size in three dimensions
 * (i.e. the number of columns, rows and sections).
 * Columns are the fastest changing, followed by rows and sections.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmMap extends DelegatingCategory {
    public EmMap(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "annotation_details":
                return getAnnotationDetails();
            case "axis_order_fast":
                return getAxisOrderFast();
            case "axis_order_medium":
                return getAxisOrderMedium();
            case "axis_order_slow":
                return getAxisOrderSlow();
            case "cell_a":
                return getCellA();
            case "cell_b":
                return getCellB();
            case "cell_c":
                return getCellC();
            case "cell_alpha":
                return getCellAlpha();
            case "cell_beta":
                return getCellBeta();
            case "cell_gamma":
                return getCellGamma();
            case "contour_level":
                return getContourLevel();
            case "contour_level_source":
                return getContourLevelSource();
            case "data_type":
                return getDataType();
            case "dimensions_col":
                return getDimensionsCol();
            case "dimensions_row":
                return getDimensionsRow();
            case "dimensions_sec":
                return getDimensionsSec();
            case "endian_type":
                return getEndianType();
            case "file":
                return getFile();
            case "original_file":
                return getOriginalFile();
            case "format":
                return getFormat();
            case "id":
                return getId();
            case "partition":
                return getPartition();
            case "entry_id":
                return getEntryId();
            case "label":
                return getLabel();
            case "limit_col":
                return getLimitCol();
            case "limit_row":
                return getLimitRow();
            case "limit_sec":
                return getLimitSec();
            case "origin_col":
                return getOriginCol();
            case "origin_row":
                return getOriginRow();
            case "origin_sec":
                return getOriginSec();
            case "pixel_spacing_x":
                return getPixelSpacingX();
            case "pixel_spacing_y":
                return getPixelSpacingY();
            case "pixel_spacing_z":
                return getPixelSpacingZ();
            case "size_kb":
                return getSizeKb();
            case "spacing_x":
                return getSpacingX();
            case "spacing_y":
                return getSpacingY();
            case "spacing_z":
                return getSpacingZ();
            case "statistics_average":
                return getStatisticsAverage();
            case "statistics_maximum":
                return getStatisticsMaximum();
            case "statistics_minimum":
                return getStatisticsMinimum();
            case "statistics_std":
                return getStatisticsStd();
            case "symmetry_space_group":
                return getSymmetrySpaceGroup();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * map annotation details
     * @return StrColumn
     */
    public StrColumn getAnnotationDetails() {
        return delegate.getColumn("annotation_details", DelegatingStrColumn::new);
    }

    /**
     * The map axis that corresponds to Columns.
     * (CCP4 HEADER WORD 17 MAPC 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderFast() {
        return delegate.getColumn("axis_order_fast", DelegatingStrColumn::new);
    }

    /**
     * The map axis that corresponds to Rows.
     * (CCP4 map header word 18 MAPR 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderMedium() {
        return delegate.getColumn("axis_order_medium", DelegatingStrColumn::new);
    }

    /**
     * The map axis that corresponds to Sections.
     * (CCP4 map header word 19 MAPS 1=x, 2=y, 3=z)
     * @return StrColumn
     */
    public StrColumn getAxisOrderSlow() {
        return delegate.getColumn("axis_order_slow", DelegatingStrColumn::new);
    }

    /**
     * Map unit cell length parameter a.
     * (CCP4 map header word 11)
     * @return FloatColumn
     */
    public FloatColumn getCellA() {
        return delegate.getColumn("cell_a", DelegatingFloatColumn::new);
    }

    /**
     * Map unit cell length parameter b.
     * (CCP4 map header word 12)
     * @return FloatColumn
     */
    public FloatColumn getCellB() {
        return delegate.getColumn("cell_b", DelegatingFloatColumn::new);
    }

    /**
     * Map unit cell length parameter c.
     * (CCP4 map header word 13)
     * @return FloatColumn
     */
    public FloatColumn getCellC() {
        return delegate.getColumn("cell_c", DelegatingFloatColumn::new);
    }

    /**
     * Value of map unit cell angle parameter alpha in degrees.
     * (CCP4 map header word 14)
     * @return FloatColumn
     */
    public FloatColumn getCellAlpha() {
        return delegate.getColumn("cell_alpha", DelegatingFloatColumn::new);
    }

    /**
     * Value of map unit cell angle parameter beta in degrees.
     * (CCP4 map header word 15)
     * @return FloatColumn
     */
    public FloatColumn getCellBeta() {
        return delegate.getColumn("cell_beta", DelegatingFloatColumn::new);
    }

    /**
     * Value of map unit cell angle parameter gamma in degrees.
     * (CCP4 map header word 16)
     * @return FloatColumn
     */
    public FloatColumn getCellGamma() {
        return delegate.getColumn("cell_gamma", DelegatingFloatColumn::new);
    }

    /**
     * recommended contour level for viewing the map
     * @return FloatColumn
     */
    public FloatColumn getContourLevel() {
        return delegate.getColumn("contour_level", DelegatingFloatColumn::new);
    }

    /**
     * source of the recommended contour level
     * @return StrColumn
     */
    public StrColumn getContourLevelSource() {
        return delegate.getColumn("contour_level_source", DelegatingStrColumn::new);
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
        return delegate.getColumn("data_type", DelegatingStrColumn::new);
    }

    /**
     * The number of columns in the map.
     * (CCP4 map header word 1 NC)
     * @return IntColumn
     */
    public IntColumn getDimensionsCol() {
        return delegate.getColumn("dimensions_col", DelegatingIntColumn::new);
    }

    /**
     * The number of rows in the map.
     * (CCP4 map header word 2 NR)
     * @return IntColumn
     */
    public IntColumn getDimensionsRow() {
        return delegate.getColumn("dimensions_row", DelegatingIntColumn::new);
    }

    /**
     * The number of sections in the map.
     * (CCP4 map header word 3 NS)
     * @return IntColumn
     */
    public IntColumn getDimensionsSec() {
        return delegate.getColumn("dimensions_sec", DelegatingIntColumn::new);
    }

    /**
     * map file endian type
     * @return StrColumn
     */
    public StrColumn getEndianType() {
        return delegate.getColumn("endian_type", DelegatingStrColumn::new);
    }

    /**
     * Map file name.
     * @return StrColumn
     */
    public StrColumn getFile() {
        return delegate.getColumn("file", DelegatingStrColumn::new);
    }

    /**
     * Depositiors original map file name.
     * @return StrColumn
     */
    public StrColumn getOriginalFile() {
        return delegate.getColumn("original_file", DelegatingStrColumn::new);
    }

    /**
     * map format
     * @return StrColumn
     */
    public StrColumn getFormat() {
        return delegate.getColumn("format", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifies the archive file partition number of any map file
     * @return IntColumn
     */
    public IntColumn getPartition() {
        return delegate.getColumn("partition", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * text stored in the label field of the CCP4 map header
     * (WORDS 57-256)
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * The final column position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived  =  .origin_col + .dimensions_col -1)
     * @return IntColumn
     */
    public IntColumn getLimitCol() {
        return delegate.getColumn("limit_col", DelegatingIntColumn::new);
    }

    /**
     * The final row position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived =  .origin_row + .dimensions_row -1)
     * @return IntColumn
     */
    public IntColumn getLimitRow() {
        return delegate.getColumn("limit_row", DelegatingIntColumn::new);
    }

    /**
     * The final section position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived -- .origin_sec + .dimensions_sec  -1)
     * @return IntColumn
     */
    public IntColumn getLimitSec() {
        return delegate.getColumn("limit_sec", DelegatingIntColumn::new);
    }

    /**
     * The position of the first column of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 5 NCSTART)
     * @return IntColumn
     */
    public IntColumn getOriginCol() {
        return delegate.getColumn("origin_col", DelegatingIntColumn::new);
    }

    /**
     * The position of the first row of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 6 NRSTART)
     * @return IntColumn
     */
    public IntColumn getOriginRow() {
        return delegate.getColumn("origin_row", DelegatingIntColumn::new);
    }

    /**
     * The position of the first section of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 7 NSSTART)
     * @return IntColumn
     */
    public IntColumn getOriginSec() {
        return delegate.getColumn("origin_sec", DelegatingIntColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the X axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingX() {
        return delegate.getColumn("pixel_spacing_x", DelegatingFloatColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingY() {
        return delegate.getColumn("pixel_spacing_y", DelegatingFloatColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingZ() {
        return delegate.getColumn("pixel_spacing_z", DelegatingFloatColumn::new);
    }

    /**
     * map storage size in Kilobytes (before compression)
     * @return IntColumn
     */
    public IntColumn getSizeKb() {
        return delegate.getColumn("size_kb", DelegatingIntColumn::new);
    }

    /**
     * The number of intervals per cell repeat in X.
     * (CCP4 map header word 8 NX)
     * @return IntColumn
     */
    public IntColumn getSpacingX() {
        return delegate.getColumn("spacing_x", DelegatingIntColumn::new);
    }

    /**
     * The number of intervals per cell repeat in Y.
     * (CCP4 map header word 9 NY)
     * @return IntColumn
     */
    public IntColumn getSpacingY() {
        return delegate.getColumn("spacing_y", DelegatingIntColumn::new);
    }

    /**
     * The number of intervals per cell repeat in Z.
     * (CCP4 map header word 10 NZ)
     * @return IntColumn
     */
    public IntColumn getSpacingZ() {
        return delegate.getColumn("spacing_z", DelegatingIntColumn::new);
    }

    /**
     * Mean (average) density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsAverage() {
        return delegate.getColumn("statistics_average", DelegatingFloatColumn::new);
    }

    /**
     * Maximum density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsMaximum() {
        return delegate.getColumn("statistics_maximum", DelegatingFloatColumn::new);
    }

    /**
     * Minimum density value of the map.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsMinimum() {
        return delegate.getColumn("statistics_minimum", DelegatingFloatColumn::new);
    }

    /**
     * The standard deviation of the map density values.
     * @return FloatColumn
     */
    public FloatColumn getStatisticsStd() {
        return delegate.getColumn("statistics_std", DelegatingFloatColumn::new);
    }

    /**
     * The space group number for the map.
     * The value is 1 unless the sample is crystalline.
     * (CCP4 map header word 23 ISPG)
     * @return IntColumn
     */
    public IntColumn getSymmetrySpaceGroup() {
        return delegate.getColumn("symmetry_space_group", DelegatingIntColumn::new);
    }

    /**
     * Map type
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}