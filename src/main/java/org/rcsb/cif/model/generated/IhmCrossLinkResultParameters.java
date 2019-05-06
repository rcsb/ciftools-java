package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_CROSS_LINK_RESULT_PARAMETERS category records the
 * results of the crosslinking restraint parameters in the IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmCrossLinkResultParameters extends BaseCategory {
    public IhmCrossLinkResultParameters(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmCrossLinkResultParameters(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmCrossLinkResultParameters(String name) {
        super(name);
    }

    /**
     * A unique identifier for the restraint/model combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the crosslink restraint between a pair of residues.
     * This data item is a pointer to _ihm_cross_link_restraint.id in the
     * IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("restraint_id", IntColumn::new) :
                getBinaryColumn("restraint_id"));
    }

    /**
     * The model number corresponding to the cross link result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The uncertainty in the crosslinking experimental data;
     * May be approximated to the false positive rate.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("psi", FloatColumn::new) :
                getBinaryColumn("psi"));
    }

    /**
     * The uncertainty in the position of residue 1 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_1", FloatColumn::new) :
                getBinaryColumn("sigma_1"));
    }

    /**
     * The uncertainty in the position of residue 2 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_2", FloatColumn::new) :
                getBinaryColumn("sigma_2"));
    }
}
