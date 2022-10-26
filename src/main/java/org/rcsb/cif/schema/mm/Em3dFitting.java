package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the 3D_FITTING category
 * record details of the method of fitting atomic
 * coordinates from a PDB file into a 3d-em
 * volume map file
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Em3dFitting extends DelegatingCategory {
    public Em3dFitting(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            case "target_criteria":
                return getTargetCriteria();
            case "software_name":
                return getSoftwareName();
            case "details":
                return getDetails();
            case "overall_b_value":
                return getOverallBValue();
            case "ref_space":
                return getRefSpace();
            case "ref_protocol":
                return getRefProtocol();
            case "initial_refinement_model_id":
                return getInitialRefinementModelId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _em_3d_fitting.id must uniquely identify
     * a fitting procedure of atomic coordinates
     * into 3dem reconstructed map volume.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry_id in
     * the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The method used to fit atomic coordinates
     * into the 3dem reconstructed map.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The measure used to assess quality of fit of the atomic coordinates in the
     * 3DEM map volume.
     * @return StrColumn
     */
    public StrColumn getTargetCriteria() {
        return delegate.getColumn("target_criteria", DelegatingStrColumn::new);
    }

    /**
     * The software used for fitting atomic coordinates to the map.
     * @return StrColumn
     */
    public StrColumn getSoftwareName() {
        return delegate.getColumn("software_name", DelegatingStrColumn::new);
    }

    /**
     * Any additional details regarding fitting of atomic coordinates into
     * the 3DEM volume, including data and considerations from other
     * methods used in computation of the model.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The overall B (temperature factor) value for the 3d-em volume.
     * @return FloatColumn
     */
    public FloatColumn getOverallBValue() {
        return delegate.getColumn("overall_b_value", DelegatingFloatColumn::new);
    }

    /**
     * A flag to indicate whether fitting was carried out in real
     * or reciprocal refinement space.
     * @return StrColumn
     */
    public StrColumn getRefSpace() {
        return delegate.getColumn("ref_space", DelegatingStrColumn::new);
    }

    /**
     * The refinement protocol used.
     * @return StrColumn
     */
    public StrColumn getRefProtocol() {
        return delegate.getColumn("ref_protocol", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_3d_fitting.initial_refinement_model_id itentifies the id
     * in the _pdbx_initial_refinement_model
     * @return IntColumn
     */
    public IntColumn getInitialRefinementModelId() {
        return delegate.getColumn("initial_refinement_model_id", DelegatingIntColumn::new);
    }

}