package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Crystallographic cell specifications used in data processing.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDataProcessingCell extends BaseCategory {
    public PdbxDataProcessingCell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDataProcessingCell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDataProcessingCell(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_data_processing_cell.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Unit cell length A
     * @return FloatColumn
     */
    public FloatColumn getA() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("a", FloatColumn::new) :
                getBinaryColumn("a"));
    }

    /**
     * Tolerance in unit cell length A
     * @return FloatColumn
     */
    public FloatColumn getATolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("a_tolerance", FloatColumn::new) :
                getBinaryColumn("a_tolerance"));
    }

    /**
     * Unit cell length B
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("b", FloatColumn::new) :
                getBinaryColumn("b"));
    }

    /**
     * Tolerance in unit cell length B
     * @return FloatColumn
     */
    public FloatColumn getBTolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("b_tolerance", FloatColumn::new) :
                getBinaryColumn("b_tolerance"));
    }

    /**
     * Unit cell length C
     * @return FloatColumn
     */
    public FloatColumn getC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c", FloatColumn::new) :
                getBinaryColumn("c"));
    }

    /**
     * Tolerance in unit cell length C
     * @return FloatColumn
     */
    public FloatColumn getCTolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("c_tolerance", FloatColumn::new) :
                getBinaryColumn("c_tolerance"));
    }

    /**
     * Unit cell angle alpha.
     * @return FloatColumn
     */
    public FloatColumn getAlpha() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("alpha", FloatColumn::new) :
                getBinaryColumn("alpha"));
    }

    /**
     * Tolerance in unit cell angle alpha.
     * @return FloatColumn
     */
    public FloatColumn getAlphaTolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("alpha_tolerance", FloatColumn::new) :
                getBinaryColumn("alpha_tolerance"));
    }

    /**
     * Unit cell angle beta.
     * @return FloatColumn
     */
    public FloatColumn getBeta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("beta", FloatColumn::new) :
                getBinaryColumn("beta"));
    }

    /**
     * Tolerance in unit cell angle beta.
     * @return FloatColumn
     */
    public FloatColumn getBetaTolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("beta_tolerance", FloatColumn::new) :
                getBinaryColumn("beta_tolerance"));
    }

    /**
     * Unit cell angle gamma.
     * @return FloatColumn
     */
    public FloatColumn getGamma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("gamma", FloatColumn::new) :
                getBinaryColumn("gamma"));
    }

    /**
     * Tolerance in unit cell angle gamma.
     * @return FloatColumn
     */
    public FloatColumn getGammaTolerance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("gamma_tolerance", FloatColumn::new) :
                getBinaryColumn("gamma_tolerance"));
    }

    /**
     * Unit cell volume.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume", FloatColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * Unit cell mosaicity.
     * @return FloatColumn
     */
    public FloatColumn getMosaicity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mosaicity", FloatColumn::new) :
                getBinaryColumn("mosaicity"));
    }

    /**
     * Resolution range.
     * @return StrColumn
     */
    public StrColumn getResolutionRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("resolution_range", StrColumn::new) :
                getBinaryColumn("resolution_range"));
    }

    /**
     * Space group name.
     * @return StrColumn
     */
    public StrColumn getSpaceGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("space_group", StrColumn::new) :
                getBinaryColumn("space_group"));
    }
}
