package org.rcsb.cif.model.generated.struct;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A title for the data block. The author should attempt to convey
     * the essence of the structure archived in the CIF in the title,
     * and to distinguish this structural result from others.
     * @return Title
     */
    public Title getTitle() {
        return (Title) (isText ? textFields.computeIfAbsent("title",
                Title::new) : getBinaryColumn("title"));
    }

    /**
     * An automatically generated descriptor for an NDB structure or
     * the unstructured content of the PDB COMPND record.
     * @return PdbxDescriptor
     */
    public PdbxDescriptor getPdbxDescriptor() {
        return (PdbxDescriptor) (isText ? textFields.computeIfAbsent("pdbx_descriptor",
                PdbxDescriptor::new) : getBinaryColumn("pdbx_descriptor"));
    }

    /**
     * Text description of the methodology which produced this
     * model structure.
     * @return PdbxModelDetails
     */
    public PdbxModelDetails getPdbxModelDetails() {
        return (PdbxModelDetails) (isText ? textFields.computeIfAbsent("pdbx_model_details",
                PdbxModelDetails::new) : getBinaryColumn("pdbx_model_details"));
    }

    /**
     * Estimated formula mass in daltons of the
     * deposited structure assembly.
     * @return PdbxFormulaWeight
     */
    public PdbxFormulaWeight getPdbxFormulaWeight() {
        return (PdbxFormulaWeight) (isText ? textFields.computeIfAbsent("pdbx_formula_weight",
                PdbxFormulaWeight::new) : getBinaryColumn("pdbx_formula_weight"));
    }

    /**
     * Method used to determine _struct.pdbx_formula_weight.
     * @return PdbxFormulaWeightMethod
     */
    public PdbxFormulaWeightMethod getPdbxFormulaWeightMethod() {
        return (PdbxFormulaWeightMethod) (isText ? textFields.computeIfAbsent("pdbx_formula_weight_method",
                PdbxFormulaWeightMethod::new) : getBinaryColumn("pdbx_formula_weight_method"));
    }

    /**
     * A description of the type of structure model.
     * @return PdbxModelTypeDetails
     */
    public PdbxModelTypeDetails getPdbxModelTypeDetails() {
        return (PdbxModelTypeDetails) (isText ? textFields.computeIfAbsent("pdbx_model_type_details",
                PdbxModelTypeDetails::new) : getBinaryColumn("pdbx_model_type_details"));
    }

    /**
     * The item indicates whether the entry is a CASP target, a CASD-NMR target,
     * or similar target participating in methods development experiments.
     * @return PdbxCASPFlag
     */
    public PdbxCASPFlag getPdbxCASPFlag() {
        return (PdbxCASPFlag) (isText ? textFields.computeIfAbsent("pdbx_CASP_flag",
                PdbxCASPFlag::new) : getBinaryColumn("pdbx_CASP_flag"));
    }

    /**
     * 
     * Additional remarks related to this structure deposition that have not
     * been included in details data items elsewhere.
     * @return PdbxDetails
     */
    public PdbxDetails getPdbxDetails() {
        return (PdbxDetails) (isText ? textFields.computeIfAbsent("pdbx_details",
                PdbxDetails::new) : getBinaryColumn("pdbx_details"));
    }

    /**
     * A title for the experiment or analysis that is represented in
     * the entry.  The default value is the primary citation of the entry.
     * @return PdbxTitleText
     */
    public PdbxTitleText getPdbxTitleText() {
        return (PdbxTitleText) (isText ? textFields.computeIfAbsent("pdbx_title_text",
                PdbxTitleText::new) : getBinaryColumn("pdbx_title_text"));
    }
}
