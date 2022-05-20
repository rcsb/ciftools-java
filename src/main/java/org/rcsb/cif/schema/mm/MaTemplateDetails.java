package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_TEMPLATE_DETAILS category record details about
 * the structural templates used in to obtain the homology/comparative models.
 * The template can be a polymer or a non-polymer and can be either
 * referenced from an existing database or can be a customized
 * template provided by the user.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaTemplateDetails extends DelegatingCategory {
    public MaTemplateDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "template_id":
                return getTemplateId();
            case "template_entity_type":
                return getTemplateEntityType();
            case "template_origin":
                return getTemplateOrigin();
            case "template_data_id":
                return getTemplateDataId();
            case "target_asym_id":
                return getTargetAsymId();
            case "template_auth_asym_id":
                return getTemplateAuthAsymId();
            case "template_label_asym_id":
                return getTemplateLabelAsymId();
            case "template_label_entity_id":
                return getTemplateLabelEntityId();
            case "template_model_num":
                return getTemplateModelNum();
            case "template_trans_matrix_id":
                return getTemplateTransMatrixId();
            case "template_name":
                return getTemplateName();
            case "template_description":
                return getTemplateDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for this template record.
     * @return IntColumn
     */
    public IntColumn getTemplateId() {
        return delegate.getColumn("template_id", DelegatingIntColumn::new);
    }

    /**
     * The type of template.
     * @return StrColumn
     */
    public StrColumn getTemplateEntityType() {
        return delegate.getColumn("template_entity_type", DelegatingStrColumn::new);
    }

    /**
     * The origin of the template.
     * @return StrColumn
     */
    public StrColumn getTemplateOrigin() {
        return delegate.getColumn("template_origin", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier for the structural template. This data item is a pointer to
     * _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getTemplateDataId() {
        return delegate.getColumn("template_data_id", DelegatingIntColumn::new);
    }

    /**
     * A unique identifier for the target instance for which the
     * structural template is used.
     * This data item is a pointer to _ma_target_entity_instance.asym_id
     * in the MA_TARGET_ENTITY_INSTANCE caategory.
     * @return StrColumn
     */
    public StrColumn getTargetAsymId() {
        return delegate.getColumn("target_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided chain ID corresponding to the template. This is the
     * author provided chain ID as found at the source of the template, e.g. the
     * external mmCIF file storing the template coordinates. If the external
     * source is a PDB formatted file, template_auth_asym_id is the chain ID.
     * @return StrColumn
     */
    public StrColumn getTemplateAuthAsymId() {
        return delegate.getColumn("template_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The label asym ID corresponding to the template. This is the asym ID as
     * found at the source of the template, e.g. the external mmCIF file storing
     * the template coordinates.
     * @return StrColumn
     */
    public StrColumn getTemplateLabelAsymId() {
        return delegate.getColumn("template_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The entity ID corresponding to the template. This is the entity ID as
     * found at the source of the template, e.g. the external mmCIF file storing
     * the template coordinates.
     * @return StrColumn
     */
    public StrColumn getTemplateLabelEntityId() {
        return delegate.getColumn("template_label_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The model number corresponding to the template.
     * @return IntColumn
     */
    public IntColumn getTemplateModelNum() {
        return delegate.getColumn("template_model_num", DelegatingIntColumn::new);
    }

    /**
     * The identifier to the transformation matrix applied to the template
     * in order to generate the starting structure used in the current modeling.
     * An identify matrix should be referenced in case of no transformation.
     * @return IntColumn
     */
    public IntColumn getTemplateTransMatrixId() {
        return delegate.getColumn("template_trans_matrix_id", DelegatingIntColumn::new);
    }

    /**
     * A name for the template.
     * @return StrColumn
     */
    public StrColumn getTemplateName() {
        return delegate.getColumn("template_name", DelegatingStrColumn::new);
    }

    /**
     * Description of the template.
     * @return StrColumn
     */
    public StrColumn getTemplateDescription() {
        return delegate.getColumn("template_description", DelegatingStrColumn::new);
    }

}