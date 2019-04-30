package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT category record details about the
 * description of the crystallographic structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Struct extends BaseCategory {
    public Struct(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Struct(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Struct(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A title for the data block. The author should attempt to convey
     * the essence of the structure archived in the CIF in the title,
     * and to distinguish this structural result from others.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTitle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("title", SingleRowStrColumn::new) :
                getBinaryColumn("title"));
    }

    /**
     * An automatically generated descriptor for an NDB structure or
     * the unstructured content of the PDB COMPND record.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDescriptor() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_descriptor", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_descriptor"));
    }

    /**
     * Text description of the methodology which produced this
     * model structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxModelDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_model_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_model_details"));
    }

    /**
     * Estimated formula mass in daltons of the
     * deposited structure assembly.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxFormulaWeight() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_formula_weight"));
    }

    /**
     * Method used to determine _struct.pdbx_formula_weight.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxFormulaWeightMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_method", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_formula_weight_method"));
    }

    /**
     * A description of the type of structure model.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxModelTypeDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_model_type_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_model_type_details"));
    }

    /**
     * The item indicates whether the entry is a CASP target, a CASD-NMR target,
     * or similar target participating in methods development experiments.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxCASPFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_CASP_flag", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_CASP_flag"));
    }

    /**
     * 
     * Additional remarks related to this structure deposition that have not
     * been included in details data items elsewhere.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_details"));
    }

    /**
     * A title for the experiment or analysis that is represented in
     * the entry.  The default value is the primary citation of the entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxTitleText() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_title_text", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_title_text"));
    }
}
