package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_POLY_TEMPLATE_LIBRARY_DETAILS category record details
 * about the polymeric template libraries used in the modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaPolyTemplateLibraryDetails extends DelegatingCategory {
    public MaPolyTemplateLibraryDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "library_id":
                return getLibraryId();
            case "target_entity_id":
                return getTargetEntityId();
            case "customized_fragment_library_flag":
                return getCustomizedFragmentLibraryFlag();
            case "data_id":
                return getDataId();
            case "software_group_id":
                return getSoftwareGroupId();
            case "description":
                return getDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the template library.
     * @return IntColumn
     */
    public IntColumn getLibraryId() {
        return delegate.getColumn("library_id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for the target entity for which the
     * template library is used.
     * This data item is a pointer to _ma_target_entity.entity_id
     * in the MA_TARGET_ENTITY category.
     * @return StrColumn
     */
    public StrColumn getTargetEntityId() {
        return delegate.getColumn("target_entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag that indicates whether the template library is used as a
     * customized fragment library in a fragment assembly modeling method.
     * @return StrColumn
     */
    public StrColumn getCustomizedFragmentLibraryFlag() {
        return delegate.getColumn("customized_fragment_library_flag", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier for the template library. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier to the set of software used to build the template library.
     * This data item is a pointer to the _ma_software_group.group_id in the
     * MA_SOFTWARE_GROUP category.
     * @return IntColumn
     */
    public IntColumn getSoftwareGroupId() {
        return delegate.getColumn("software_group_id", DelegatingIntColumn::new);
    }

    /**
     * Description of the template library.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

}