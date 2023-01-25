package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_DETECTOR_PANEL_MAPPING category provide
 * a mechanism to associate detector panel information with an actual
 * detector.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnDetectorPanelMapping extends DelegatingCategory {
    public PdbxDiffrnDetectorPanelMapping(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "detector_id":
                return getDetectorId();
            case "array_id":
                return getArrayId();
            case "array_section_id":
                return getArraySectionId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_diffrn_detector_panel_mapping.id must uniquely identify the
     * information associated with panels and detectors in the X, Y and Z
     * categories.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_detector.id in
     * the DIFFRN_DETECTOR category.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return delegate.getColumn("detector_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_structure.id in the
     * ARRAY_STRUCTURE category.
     * @return StrColumn
     */
    public StrColumn getArrayId() {
        return delegate.getColumn("array_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_structure_list_section.id in the
     * ARRAY_STRUCTURE_LIST_SECTION category.
     * @return StrColumn
     */
    public StrColumn getArraySectionId() {
        return delegate.getColumn("array_section_id", DelegatingStrColumn::new);
    }

}