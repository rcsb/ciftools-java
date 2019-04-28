package org.rcsb.cif.model.generated.emmap;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AnnotationDetails
     */
    public AnnotationDetails getAnnotationDetails() {
        return (AnnotationDetails) (isText ? textFields.computeIfAbsent("annotation_details",
                AnnotationDetails::new) : getBinaryColumn("annotation_details"));
    }

    /**
     * The map axis that corresponds to Columns.
     * (CCP4 HEADER WORD 17 MAPC 1=x, 2=y, 3=z)
     * @return AxisOrderFast
     */
    public AxisOrderFast getAxisOrderFast() {
        return (AxisOrderFast) (isText ? textFields.computeIfAbsent("axis_order_fast",
                AxisOrderFast::new) : getBinaryColumn("axis_order_fast"));
    }

    /**
     * The map axis that corresponds to Rows.
     * (CCP4 map header word 18 MAPR 1=x, 2=y, 3=z)
     * @return AxisOrderMedium
     */
    public AxisOrderMedium getAxisOrderMedium() {
        return (AxisOrderMedium) (isText ? textFields.computeIfAbsent("axis_order_medium",
                AxisOrderMedium::new) : getBinaryColumn("axis_order_medium"));
    }

    /**
     * The map axis that corresponds to Sections.
     * (CCP4 map header word 19 MAPS 1=x, 2=y, 3=z)
     * @return AxisOrderSlow
     */
    public AxisOrderSlow getAxisOrderSlow() {
        return (AxisOrderSlow) (isText ? textFields.computeIfAbsent("axis_order_slow",
                AxisOrderSlow::new) : getBinaryColumn("axis_order_slow"));
    }

    /**
     * Map unit cell length parameter a.
     * (CCP4 map header word 11)
     * @return CellA
     */
    public CellA getCellA() {
        return (CellA) (isText ? textFields.computeIfAbsent("cell_a",
                CellA::new) : getBinaryColumn("cell_a"));
    }

    /**
     * Map unit cell length parameter b.
     * (CCP4 map header word 12)
     * @return CellB
     */
    public CellB getCellB() {
        return (CellB) (isText ? textFields.computeIfAbsent("cell_b",
                CellB::new) : getBinaryColumn("cell_b"));
    }

    /**
     * Map unit cell length parameter c.
     * (CCP4 map header word 13)
     * @return CellC
     */
    public CellC getCellC() {
        return (CellC) (isText ? textFields.computeIfAbsent("cell_c",
                CellC::new) : getBinaryColumn("cell_c"));
    }

    /**
     * Value of map unit cell angle parameter alpha in degrees.
     * (CCP4 map header word 14)
     * @return CellAlpha
     */
    public CellAlpha getCellAlpha() {
        return (CellAlpha) (isText ? textFields.computeIfAbsent("cell_alpha",
                CellAlpha::new) : getBinaryColumn("cell_alpha"));
    }

    /**
     * Value of map unit cell angle parameter beta in degrees.
     * (CCP4 map header word 15)
     * @return CellBeta
     */
    public CellBeta getCellBeta() {
        return (CellBeta) (isText ? textFields.computeIfAbsent("cell_beta",
                CellBeta::new) : getBinaryColumn("cell_beta"));
    }

    /**
     * Value of map unit cell angle parameter gamma in degrees.
     * (CCP4 map header word 16)
     * @return CellGamma
     */
    public CellGamma getCellGamma() {
        return (CellGamma) (isText ? textFields.computeIfAbsent("cell_gamma",
                CellGamma::new) : getBinaryColumn("cell_gamma"));
    }

    /**
     * recommended contour level for viewing the map
     * @return ContourLevel
     */
    public ContourLevel getContourLevel() {
        return (ContourLevel) (isText ? textFields.computeIfAbsent("contour_level",
                ContourLevel::new) : getBinaryColumn("contour_level"));
    }

    /**
     * source of the recommended contour level
     * @return ContourLevelSource
     */
    public ContourLevelSource getContourLevelSource() {
        return (ContourLevelSource) (isText ? textFields.computeIfAbsent("contour_level_source",
                ContourLevelSource::new) : getBinaryColumn("contour_level_source"));
    }

    /**
     * The map data_type describes the data structure of the map voxels.
     * (CCP4 map header word 4 MODE)
     * EMDB currently holds MODE=0,1,and 2 maps; the majority are MODE=2.
     * MAPS with MODES other than 2 and 0 may not work in CCP4 programs.
     * MODE = 0: 8 bits, density stored as a signed byte (-128 to 127, ISO/IEC 10967)
     * MODE = 1: 16 bits, density stored as a signed integer (-32768 to 32767, ISO/IEC 10967)
     * MODE = 2: 32 bits, density stored as a floating point number (IEEE 754)
     * @return DataType
     */
    public DataType getDataType() {
        return (DataType) (isText ? textFields.computeIfAbsent("data_type",
                DataType::new) : getBinaryColumn("data_type"));
    }

    /**
     * The number of columns in the map.
     * (CCP4 map header word 1 NC)
     * @return DimensionsCol
     */
    public DimensionsCol getDimensionsCol() {
        return (DimensionsCol) (isText ? textFields.computeIfAbsent("dimensions_col",
                DimensionsCol::new) : getBinaryColumn("dimensions_col"));
    }

    /**
     * The number of rows in the map.
     * (CCP4 map header word 2 NR)
     * @return DimensionsRow
     */
    public DimensionsRow getDimensionsRow() {
        return (DimensionsRow) (isText ? textFields.computeIfAbsent("dimensions_row",
                DimensionsRow::new) : getBinaryColumn("dimensions_row"));
    }

    /**
     * The number of sections in the map.
     * (CCP4 map header word 3 NS)
     * @return DimensionsSec
     */
    public DimensionsSec getDimensionsSec() {
        return (DimensionsSec) (isText ? textFields.computeIfAbsent("dimensions_sec",
                DimensionsSec::new) : getBinaryColumn("dimensions_sec"));
    }

    /**
     * map file endian type
     * @return EndianType
     */
    public EndianType getEndianType() {
        return (EndianType) (isText ? textFields.computeIfAbsent("endian_type",
                EndianType::new) : getBinaryColumn("endian_type"));
    }

    /**
     * Map file name.
     * @return File
     */
    public File getFile() {
        return (File) (isText ? textFields.computeIfAbsent("file",
                File::new) : getBinaryColumn("file"));
    }

    /**
     * map format
     * @return Format
     */
    public Format getFormat() {
        return (Format) (isText ? textFields.computeIfAbsent("format",
                Format::new) : getBinaryColumn("format"));
    }

    /**
     * Unique id for the EMD_MAP category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Identifies the archive file partition number of a primary map,
     * half map, additional map, or mask.
     * @return Partition
     */
    public Partition getPartition() {
        return (Partition) (isText ? textFields.computeIfAbsent("partition",
                Partition::new) : getBinaryColumn("partition"));
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * text stored in the label field of the CCP4 map header
     * (WORDS 57-256)
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * The final column position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived  =  .origin_col + .dimensions_col -1)
     * @return LimitCol
     */
    public LimitCol getLimitCol() {
        return (LimitCol) (isText ? textFields.computeIfAbsent("limit_col",
                LimitCol::new) : getBinaryColumn("limit_col"));
    }

    /**
     * The final row position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived =  .origin_row + .dimensions_row -1)
     * @return LimitRow
     */
    public LimitRow getLimitRow() {
        return (LimitRow) (isText ? textFields.computeIfAbsent("limit_row",
                LimitRow::new) : getBinaryColumn("limit_row"));
    }

    /**
     * The final section position of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (derived -- .origin_sec + .dimensions_sec  -1)
     * @return LimitSec
     */
    public LimitSec getLimitSec() {
        return (LimitSec) (isText ? textFields.computeIfAbsent("limit_sec",
                LimitSec::new) : getBinaryColumn("limit_sec"));
    }

    /**
     * The position of the first column of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 5 NCSTART)
     * @return OriginCol
     */
    public OriginCol getOriginCol() {
        return (OriginCol) (isText ? textFields.computeIfAbsent("origin_col",
                OriginCol::new) : getBinaryColumn("origin_col"));
    }

    /**
     * The position of the first row of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 6 NRSTART)
     * @return OriginRow
     */
    public OriginRow getOriginRow() {
        return (OriginRow) (isText ? textFields.computeIfAbsent("origin_row",
                OriginRow::new) : getBinaryColumn("origin_row"));
    }

    /**
     * The position of the first section of the map relative to the
     * Cartesian coordinate origin in voxel grid units.
     * (CCP4 map header word 7 NSSTART)
     * @return OriginSec
     */
    public OriginSec getOriginSec() {
        return (OriginSec) (isText ? textFields.computeIfAbsent("origin_sec",
                OriginSec::new) : getBinaryColumn("origin_sec"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return PixelSpacingX
     */
    public PixelSpacingX getPixelSpacingX() {
        return (PixelSpacingX) (isText ? textFields.computeIfAbsent("pixel_spacing_x",
                PixelSpacingX::new) : getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return PixelSpacingY
     */
    public PixelSpacingY getPixelSpacingY() {
        return (PixelSpacingY) (isText ? textFields.computeIfAbsent("pixel_spacing_y",
                PixelSpacingY::new) : getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return PixelSpacingZ
     */
    public PixelSpacingZ getPixelSpacingZ() {
        return (PixelSpacingZ) (isText ? textFields.computeIfAbsent("pixel_spacing_z",
                PixelSpacingZ::new) : getBinaryColumn("pixel_spacing_z"));
    }

    /**
     * map storage size in Kilobytes (before compression)
     * @return SizeKb
     */
    public SizeKb getSizeKb() {
        return (SizeKb) (isText ? textFields.computeIfAbsent("size_kb",
                SizeKb::new) : getBinaryColumn("size_kb"));
    }

    /**
     * The number of intervals per cell repeat in X.
     * (CCP4 map header word 8 NX)
     * @return SpacingX
     */
    public SpacingX getSpacingX() {
        return (SpacingX) (isText ? textFields.computeIfAbsent("spacing_x",
                SpacingX::new) : getBinaryColumn("spacing_x"));
    }

    /**
     * The number of intervals per cell repeat in Y.
     * (CCP4 map header word 9 NY)
     * @return SpacingY
     */
    public SpacingY getSpacingY() {
        return (SpacingY) (isText ? textFields.computeIfAbsent("spacing_y",
                SpacingY::new) : getBinaryColumn("spacing_y"));
    }

    /**
     * The number of intervals per cell repeat in Z.
     * (CCP4 map header word 10 NZ)
     * @return SpacingZ
     */
    public SpacingZ getSpacingZ() {
        return (SpacingZ) (isText ? textFields.computeIfAbsent("spacing_z",
                SpacingZ::new) : getBinaryColumn("spacing_z"));
    }

    /**
     * Mean (average) density value of the map.
     * @return StatisticsAverage
     */
    public StatisticsAverage getStatisticsAverage() {
        return (StatisticsAverage) (isText ? textFields.computeIfAbsent("statistics_average",
                StatisticsAverage::new) : getBinaryColumn("statistics_average"));
    }

    /**
     * Maximum density value of the map.
     * @return StatisticsMaximum
     */
    public StatisticsMaximum getStatisticsMaximum() {
        return (StatisticsMaximum) (isText ? textFields.computeIfAbsent("statistics_maximum",
                StatisticsMaximum::new) : getBinaryColumn("statistics_maximum"));
    }

    /**
     * Minimum density value of the map.
     * @return StatisticsMinimum
     */
    public StatisticsMinimum getStatisticsMinimum() {
        return (StatisticsMinimum) (isText ? textFields.computeIfAbsent("statistics_minimum",
                StatisticsMinimum::new) : getBinaryColumn("statistics_minimum"));
    }

    /**
     * The standard deviation of the map density values.
     * @return StatisticsStd
     */
    public StatisticsStd getStatisticsStd() {
        return (StatisticsStd) (isText ? textFields.computeIfAbsent("statistics_std",
                StatisticsStd::new) : getBinaryColumn("statistics_std"));
    }

    /**
     * The space group number for the map.
     * The value is 1 unless the sample is crystalline.
     * (CCP4 map header word 23 ISPG)
     * @return SymmetrySpaceGroup
     */
    public SymmetrySpaceGroup getSymmetrySpaceGroup() {
        return (SymmetrySpaceGroup) (isText ? textFields.computeIfAbsent("symmetry_space_group",
                SymmetrySpaceGroup::new) : getBinaryColumn("symmetry_space_group"));
    }

    /**
     * map format
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
